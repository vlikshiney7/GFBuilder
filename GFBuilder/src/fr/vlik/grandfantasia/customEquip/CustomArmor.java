package fr.vlik.grandfantasia.customEquip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customEquip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomArmor extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomArmor[][] data = LoaderCustom.getCustomArmor();
	public final static double IncreaseValueGreen = 1.06;
	public final static double IncreaseValueBlue = 1.18;
	
	private ArmorType type;
	
	public CustomArmor(CustomArmor armor) {
		super(armor.getMap(), armor.getGrades(), armor.getLvl(), armor.getEffects());
		
		this.type = armor.getType();
		this.icon = armor.getIcon();
		this.iconName = armor.getIconName();
	}
	
	public CustomArmor(Map<Language, String> name, GradeName[] grades, int lvl, ArmorType type, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.type = type;
		this.icon = setIcon(path);
	}
	
	@Override
	public ArmorType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomArmor.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(CustomArmor.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		this.iconName = path;
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public Armor transformToArmor(Quality quality, Enchantment[] enchant) {
		CustomArmor newCustom = new CustomArmor(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomArmor.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomArmor.IncreaseValueBlue);
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
		
		return new Armor(newCustom.name, newCustom.grades, newCustom.lvl, quality, newCustom.type, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomArmor get(String name, Language lang) {
		for(CustomArmor[] type : CustomArmor.data) {
			for(CustomArmor custom : type) {
				if(custom.getName(lang).equals(name)) {
					return custom;
				}
			}
		}
		
		return null;
	}
	
	public static CustomArmor[] getPossibleArmor(ArmorType type, Grade grade, int lvl) {
		ArrayList<CustomArmor> result = new ArrayList<CustomArmor>();
		
		for(int i = 0; i < data[type.index].length; i++) {
			CustomArmor armor = data[type.index][i];
			
			if(armor.getLvl() == lvl && armor.containGrade(grade.getGrade())) {
				result.add(armor);
			}
		}
		
		return result.toArray(new CustomArmor[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomArmor custom = CustomArmor.get(name, Language.FR);
		
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
		
		Armor armor = custom.transformToArmor(quality, tabEnchant);
		
		Armor.addCustom(armor);
		
		return true;
	}
}
