package fr.vlik.grandfantasia.customEquip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.Cape.CapeType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customEquip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomCape extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Cape.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomCape[] data = LoaderCustom.getCustomCape();
	public final static double IncreaseValueGreen = 1.06;
	public final static double IncreaseValueBlue = 1.18;
	
	public CustomCape(CustomCape cape) {
		super(cape.getMap(), cape.getGrades(), cape.getLvl(), cape.getEffects());
		
		this.icon = cape.getIcon();
		this.iconName = cape.getIconName();
	}
	
	public CustomCape(Map<Language, String> name, GradeName[] grades, int lvl, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.icon = setIcon(path);
	}
	
	@Override
	public CapeType getType() {
		return CapeType.CAPE;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomCape.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(CustomCape.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		this.iconName = path;
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public Cape transformToCape(Quality quality, Enchantment[] enchant) {
		CustomCape newCustom = new CustomCape(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomCape.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomCape.IncreaseValueBlue);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else {
				mergeEffect[i] = newCustom.getEffects()[i];
			}
		}
		
		for(int i = 0; i < tabEffects.length; i++) {
			mergeEffect[newCustom.getEffects().length + i] = tabEffects[i];
		}
		
		return new Cape(newCustom.name, newCustom.grades, newCustom.lvl, quality, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomCape get(String name, Language lang) {
		for(CustomCape custom : CustomCape.data) {
			if(custom.getName(lang).equals(name)) {
				return custom;
			}
		}
		
		return null;
	}
	
	public static CustomCape[] getPossibleCape(Grade grade, int lvl) {
		ArrayList<CustomCape> result = new ArrayList<CustomCape>();
		
		for(int i = 0; i < data.length; i++) {
			CustomCape cape = data[i];
			
			if(cape.getLvl() == lvl && cape.containGrade(grade.getGrade())) {
				result.add(cape);
			}
		}
		
		return result.toArray(new CustomCape[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomCape custom = CustomCape.get(name, Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			for(int i = 0; i < 3; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		} else if(quality == Quality.BLUE) {
			for(int i = 0; i < 6; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		}
		
		Cape cape = custom.transformToCape(quality, tabEnchant);
		
		Cape.addCustom(cape);
		
		return true;
	}
}
