package fr.vlik.grandfantasia.customEquip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customEquip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomWeapon extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomWeapon[][] data = LoaderCustom.getCustomWeapon();
	public final static double IncreaseValueGreen = 1.21;
	public final static double IncreaseValueBlue = 1.60;
	
	protected WeaponType type;
	
	public CustomWeapon(CustomWeapon weapon) {
		super(weapon);
		
		this.type = weapon.getType();
		this.icon = weapon.getIcon();
		this.iconName = weapon.getIconName();
	}
	
	public CustomWeapon(Map<Language, String> name, GradeName[] grades, int lvl, WeaponType type, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.type = type;
		this.icon = setIcon(path);
	}
	
	@Override
	public WeaponType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomWeapon.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
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
					if(e.getType().isUpgradable) {
						e.changeValue(CustomWeapon.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomWeapon.IncreaseValueBlue);
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
		
		return result.toArray(new CustomWeapon[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomWeapon custom = CustomWeapon.get(CustomEquipment.deleteNumber(name), Language.FR);
		
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
		
		Weapon weapon = custom.transformToWeapon(quality, tabEnchant);
		
		Weapon.addCustom(weapon);
		
		return true;
	}
}
