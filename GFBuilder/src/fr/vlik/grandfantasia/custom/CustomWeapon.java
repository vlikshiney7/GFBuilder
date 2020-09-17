package fr.vlik.grandfantasia.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.loader.CustomLoader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomWeapon extends CustomEquipment {
	
	public static String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomWeapon[][] data = CustomLoader.getCustomWeapon();
	public static Enchantment[] weaponEnchant = CustomLoader.getWeaponEnchantment();
	public final static double IncreaseValueGreen = 1.21;
	public final static double IncreaseValueBlue = 1.60;
	
	protected WeaponType type;
	
	public CustomWeapon(CustomWeapon weapon) {
		super(weapon.getMap(), weapon.getGrades(), weapon.getLvl(), weapon.getUnfixValue(), weapon.getEffects());
		
		this.type = weapon.getType();
		this.icon = weapon.getIcon();
		this.iconName = weapon.getIconName();
	}
	
	public CustomWeapon(Map<Language, String> name, GradeName[] grades, int lvl, WeaponType type, Map<TypeEffect, Integer[]> unfixValue, String path, Calculable[] effects) {
		super(name, grades, lvl, unfixValue, effects);
		
		this.type = type;
		this.icon = setIcon(path);
	}
	
	public WeaponType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomWeapon.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(CustomWeapon.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		this.iconName = path;
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public Weapon transformToWeapon(Quality quality, Enchantment[] enchant) {
		CustomWeapon newCustom = new CustomWeapon(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomWeapon.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomWeapon.IncreaseValueBlue);
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
		
		return new Weapon(newCustom.name, newCustom.grades, newCustom.lvl, quality, newCustom.type, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomWeapon get(String name, Language lang) {
		for(CustomWeapon[] type : CustomWeapon.data) {
			for(CustomWeapon custom : type) {
				if(custom.getName(lang).equals(name)) {
					return custom;
				}
			}
		}
		
		return null;
	}
	
	public static CustomWeapon[] getPossibleWeapon(WeaponType type, int lvl) {
		ArrayList<CustomWeapon> result = new ArrayList<CustomWeapon>();
		
		for(int i = 0; i < data[type.index].length; i++) {
			CustomWeapon weapon = data[type.index][i];
			
			if(weapon.getLvl() == lvl) {
				result.add(weapon);
			}
		}
		
		CustomWeapon[] cast = new CustomWeapon[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getEnchant(CustomEquipment equip, Quality quality) {
		if(quality == Quality.WHITE) {
			return null;
		}
		
		Enchantment[] result = new Enchantment[1 + equip.getUnfixValue().size() + CustomWeapon.weaponEnchant.length];
		
		result[0] = new Enchantment();
		
		int it = 1;
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
		
		for(int i = 0; i < weaponEnchant.length; i++) {
			result[it+i] = weaponEnchant[i];
		}
		
		return result;
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomWeapon custom = CustomWeapon.get(name, Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			Enchantment[] allEnchant = CustomWeapon.getEnchant(custom, quality);
			
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
			Enchantment[] allEnchant = CustomWeapon.getEnchant(custom, quality);
			
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
		
		Weapon weapon = custom.transformToWeapon(quality, tabEnchant);
		
		Weapon.addCustom(weapon);
		
		return true;
	}
}
