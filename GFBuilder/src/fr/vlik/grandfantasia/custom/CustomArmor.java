package fr.vlik.grandfantasia.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Armor;
import fr.vlik.grandfantasia.equipable.Armor.ArmorType;
import fr.vlik.grandfantasia.loader.CustomLoader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomArmor extends CustomEquipment {
	
	public static String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomArmor[][] data = CustomLoader.getCustomArmor();
	public static Enchantment[] armorEnchant = CustomLoader.getArmorEnchantment();
	public final static double IncreaseValueGreen = 1.06;
	public final static double IncreaseValueBlue = 1.18;
	
	private ArmorType type;
	
	public CustomArmor(CustomArmor armor) {
		super(armor.getMap(), armor.getGrades(), armor.getLvl(), armor.getUnfixValue(), armor.getEffects());
		
		this.type = armor.getType();
		this.icon = armor.getIcon();
		this.iconName = armor.getIconName();
	}
	
	public CustomArmor(Map<Language, String> name, GradeName[] grades, int lvl, ArmorType type, Map<TypeEffect, Integer[]> unfixValue, String path, Calculable[] effects) {
		super(name, grades, lvl, unfixValue, effects);
		
		this.type = type;
		this.icon = setIcon(path);
	}
	
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
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public Armor transformToArmor(Quality quality, Enchantment[] enchant) {
		CustomArmor newCustom = new CustomArmor(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < this.getEffects().length; i++) {
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
		
		CustomArmor[] cast = new CustomArmor[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getEnchant(CustomEquipment equip, Quality quality) {
		if(quality == Quality.WHITE) {
			return null;
		}
		
		Enchantment[] result = new Enchantment[1 + equip.getUnfixValue().size() + CustomArmor.armorEnchant.length];
		
		result[0] = new Enchantment();
		
		int it = 0;
		for(Entry<TypeEffect, Integer[]> entry : equip.getUnfixValue().entrySet()) {
			if(quality == Quality.GREEN) {
				result[it] = new Enchantment(Enchantment.retrieveName.get(entry.getKey()), new Calculable[] {
					new Effect(entry.getKey(), false, entry.getValue()[0]),
				});
			} else if(quality == Quality.BLUE) {
				result[it] = new Enchantment(Enchantment.retrieveName.get(entry.getKey()), new Calculable[] {
					new Effect(entry.getKey(), false, entry.getValue()[1]),
				});
			}
			
			it++;
		}
		
		for(int i = 0; i < armorEnchant.length; i++) {
			result[it+i] = armorEnchant[i];
		}
		
		return result;
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomArmor custom = CustomArmor.get(name, Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			Enchantment[] allEnchant = CustomArmor.getEnchant(custom, quality);
			
			tabEnchant = new Enchantment[3];
			
			for(int i = 0; i < 3; i++) {
				boolean found = false;
				
				for(Enchantment enchant : allEnchant) {
					if(enchant.getName().equals(enchantSplit[i])) {
						tabEnchant[i] = enchant;
						found = true;
					}
				}
				
				if(!found) {
					return false;
				}
			}
		} else if(quality == Quality.BLUE) {
			Enchantment[] allEnchant = CustomArmor.getEnchant(custom, quality);
			
			tabEnchant = new Enchantment[6];
			
			for(int i = 0; i < 6; i++) {
				boolean found = false;
				
				for(Enchantment enchant : allEnchant) {
					if(enchant.getName().equals(enchantSplit[i])) {
						tabEnchant[i] = enchant;
						found = true;
					}
				}
				
				if(!found) {
					return false;
				}
			}
		}
		
		Armor armor = custom.transformToArmor(quality, tabEnchant);
		
		Armor.addCustom(armor);
		
		return true;
	}
}
