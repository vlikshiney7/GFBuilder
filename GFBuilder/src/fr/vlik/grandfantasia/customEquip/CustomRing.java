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
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Ring.RingType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customEquip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomRing extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static CustomRing[] data = LoaderCustom.getCustomRing();
	public final static double IncreaseValueGreen = 1.09;
	public final static double IncreaseValueBlue = 1.24;
	
	public CustomRing(CustomRing ring) {
		super(ring);
		
		this.icon = ring.getIcon();
		this.iconName = ring.getIconName();
	}
	
	public CustomRing(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, new GradeName[] { GradeName.NONE }, lvl, effects);
		
		this.icon = setIcon(path);
	}
	
	@Override
	public RingType getType() {
		return RingType.RING;
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
		
		this.iconName = path;
		
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
					if(e.getType().isUpgradable) {
						e.changeValue(CustomRing.IncreaseValueGreen);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomRing.IncreaseValueBlue);
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
		
		return result.toArray(new CustomRing[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomRing custom = CustomRing.get(CustomEquipment.deleteNumber(name), Language.FR);
		
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
		
		Ring ring = custom.transformToRing(quality, tabEnchant);
		
		Ring.addCustom(ring);
		
		return true;
	}
}
