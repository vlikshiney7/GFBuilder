package fr.vlik.grandfantasia.customequip;

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
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customequip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomCape extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Cape.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	public static CustomCape[] data = LoaderCustom.getCustomCape();
	public static final double INCREASE_VALUE_GREEN = 1.06;
	public static final double INCREASE_VALUE_BLUE = 1.18;
	
	public CustomCape(CustomCape cape) {
		super(cape);
		
		this.icon = cape.getIcon();
		this.iconName = cape.getIconName();
	}
	
	public CustomCape(Map<Language, String> name, GradeName[] grades, int lvl, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.icon = setIcon(path != null ? path : "null");
	}
	
	@Override
	public CapeType getType() {
		return CapeType.CAPE;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomCape.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(CustomCape.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.iconName = path;
		
		return Tools.constructIcon(back, object);
	}
	
	public Cape transformToCape(Quality quality, Enchantment[] enchant) {
		CustomCape newCustom = new CustomCape(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomCape.INCREASE_VALUE_GREEN);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomCape.INCREASE_VALUE_BLUE);
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
		ArrayList<CustomCape> result = new ArrayList<>();
		
		for(int i = 0; i < data.length; i++) {
			CustomCape cape = data[i];
			
			if(cape.getLvl() == lvl && Tools.containObject(cape.getGrades(), grade.getGrade())) {
				result.add(cape);
			}
		}
		
		return result.toArray(new CustomCape[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomCape custom = CustomCape.get(CustomEquipment.deleteNumber(name), Language.FR);
		
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
