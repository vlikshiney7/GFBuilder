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
import fr.vlik.grandfantasia.equipable.Ring;
import fr.vlik.grandfantasia.loader.CustomLoader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomRing extends CustomEquipment {
	
	public static String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomRing[] data = CustomLoader.getCustomRing();
	public static Enchantment[] ringEnchant = CustomLoader.getRingEnchantment();
	public final static double IncreaseValueGreen = 1.09;
	public final static double IncreaseValueBlue = 1.24;
	
	public CustomRing(CustomRing ring) {
		super(ring.getMap(), ring.getGrades(), ring.getLvl(), ring.getUnfixValue(), ring.getEffects());
		
		this.icon = ring.getIcon();
		this.iconName = ring.getIconName();
	}
	
	public CustomRing(Map<Language, String> name, GradeName[] grades, int lvl, Map<TypeEffect, Integer[]> unfixValue, String path, Calculable[] effects) {
		super(name, grades, lvl, unfixValue, effects);
		
		this.icon = setIcon(path);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomRing.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(CustomRing.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public Ring transformToRing(Quality quality, Enchantment[] enchant) {
		CustomRing newCustom = new CustomRing(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomRing.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().ordinal() >= 5 && e.getType().ordinal() <= 9) {
						e.addFortifValue(CustomRing.IncreaseValueBlue);
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
		
		return new Ring(newCustom.name, newCustom.lvl, quality, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomRing get(String name, Language lang) {
		for(CustomRing custom : CustomRing.data) {
			if(custom.getName(lang).equals(name)) {
				return custom;
			}
		}
		
		return null;
	}
	
	public static CustomRing[] getPossibleRing(int lvl) {
		ArrayList<CustomRing> result = new ArrayList<CustomRing>();
		
		for(int i = 0; i < data.length; i++) {
			CustomRing ring = data[i];
			
			if(ring.getLvl() == lvl) {
				result.add(ring);
			}
		}
		
		CustomRing[] cast = new CustomRing[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getEnchant(CustomEquipment equip, Quality quality) {
		if(quality == Quality.WHITE) {
			return null;
		}
		
		Enchantment[] result = new Enchantment[1 + equip.getUnfixValue().size() + CustomRing.ringEnchant.length];
		
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
		
		for(int i = 0; i < ringEnchant.length; i++) {
			result[it+i] = ringEnchant[i];
		}
		
		return result;
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomRing custom = CustomRing.get(name, Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			Enchantment[] allEnchant = CustomRing.getEnchant(custom, quality);
			
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
			Enchantment[] allEnchant = CustomRing.getEnchant(custom, quality);
			
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
		
		Ring ring = custom.transformToRing(quality, tabEnchant);
		
		Ring.addCustom(ring);
		
		return true;
	}
}
