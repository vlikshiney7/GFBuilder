package fr.vlik.grandfantasia.equipUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.interfaces.Filtrable;
import fr.vlik.grandfantasia.loader.equipUpgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Pearl extends CompleteBuff {

	private static final String PATH = Tools.RESOURCE + Pearl.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	
	private static Pearl[] dataWeapon = LoaderEquipUpgrade.getWeaponPearl();
	private static Pearl[] dataArmor = LoaderEquipUpgrade.getArmorPearl();
	private static Pearl[] dataWeaponCost = LoaderEquipUpgrade.getWeaponCostPearl();
	private static Pearl[] dataArmorCost = LoaderEquipUpgrade.getArmorCostPearl();
	
	private static Tag[] tags = new Tag[] { Tag.FORMULE, Tag.GVG, Tag.MARCHAND, Tag.QUETE, Tag.REPUTATION, Tag.TDB, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD };
	
	private Quality restricStuff;
	private boolean cumulable;
	
	private Tag[] tag;
	
	public Pearl() {
		super();
		this.restricStuff = Quality.GREY;
		this.cumulable = true;
	}
	
	public Pearl(Map<Language, String> name, Quality quality, Quality restricStuff, boolean cumulable, String path, Tag[] tags, Calculable[] effects) {
		this(name, quality, restricStuff, cumulable, path, effects);
		this.tag = tags;
	}
	
	public Pearl(Map<Language, String> name, Quality quality, Quality restricStuff, boolean cumulable, String path, Calculable[] effects) {
		super(name, quality, effects);
		this.restricStuff = restricStuff;
		this.cumulable = cumulable;
		this.icon = setIcon(path);
	}
	
	public Quality getRestricStuff() {
		return this.restricStuff;
	}
	
	public boolean isCumulable() {
		return this.cumulable;
	}

	public Tag[] getTag() {
		return this.tag;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Pearl.class.getResource(Tools.PATH24 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Pearl.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Pearl)) {
			return false;
		}
		
		Pearl pearl = (Pearl) obj;
		boolean b = this.name.equals(pearl.name)
				&& this.quality == pearl.quality;
		
		return b;
	}
	
	public static Pearl getWeapon(String name) {
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getName(Language.FR).equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getArmor(String name) {
		for(Pearl pearl : Pearl.dataArmor) {
			if(pearl.getName(Language.FR).equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getWeaponCost(String name) {
		for(Pearl pearl : Pearl.dataWeaponCost) {
			if(pearl.getName(Language.FR).equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getArmorCost(String name) {
		for(Pearl pearl : Pearl.dataArmorCost) {
			if(pearl.getName(Language.FR).equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl[] getPossibleWeaponPearl(Weapon weapon) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getRestricStuff() != null) {
				if(weapon.getQuality() == pearl.getRestricStuff()) {
					result.add(pearl);
				}
			} else {
				result.add(pearl);
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] getPossibleWeaponPearl(Weapon weapon, String key, Filtrable[] filter, Pearl choice, boolean andValue) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		if(!choice.equals(new Pearl())) {
			result.add(choice);
		}
		
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getRestricStuff() != null) {
				if(weapon.getQuality() == pearl.getRestricStuff()) {
					if(andValue) {
						if(Tools.searchOnName(key, pearl.getMap(), andValue)
							&& Tools.contains(filter, pearl.getQuality()) /*&& Tools.contains(filter, pearl.getTag())*/) {
							
							if(!choice.equals(pearl)) {
								result.add(pearl);
							}
						}
					} else {
						if(Tools.searchOnName(key, pearl.getMap(), andValue)
							|| Tools.contains(filter, pearl.getQuality()) || Tools.contains(filter, pearl.getTag())) {
							
							if(!choice.equals(pearl)) {
								result.add(pearl);
							}
						}
					}
				}
			} else {
				if(andValue) {
					if(Tools.searchOnName(key, pearl.getMap(), andValue)
						&& Tools.contains(filter, pearl.getQuality()) /*&& Tools.contains(filter, pearl.getTag())*/) {
						
						if(!choice.equals(pearl)) {
							result.add(pearl);
						}
					}
				} else {
					if(Tools.searchOnName(key, pearl.getMap(), andValue)
						|| Tools.contains(filter, pearl.getQuality()) || Tools.contains(filter, pearl.getTag())) {
						
						if(!choice.equals(pearl)) {
							result.add(pearl);
						}
					}
				}
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] getPossibleArmorPearl(Armor armor) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataArmor) {
			if(pearl.getRestricStuff() != null) {
				if(armor.getQuality() == pearl.getRestricStuff()) {
					result.add(pearl);
				}
			} else {
				result.add(pearl);
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] getPossibleArmorPearl(Armor armor, String key, Filtrable[] filter, Pearl choice, boolean andValue) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		if(!choice.equals(new Pearl())) {
			result.add(choice);
		}
		
		for(Pearl pearl : Pearl.dataArmor) {
			if(pearl.getRestricStuff() != null) {
				if(armor.getQuality() == pearl.getRestricStuff()) {
					if(andValue) {
						if(Tools.searchOnName(key, pearl.getMap(), andValue)
							&& Tools.contains(filter, pearl.getQuality()) /*&& Tools.contains(filter, pearl.getTag())*/) {
							
							if(!choice.equals(pearl)) {
								result.add(pearl);
							}
						}
					} else {
						if(Tools.searchOnName(key, pearl.getMap(), andValue)
							|| Tools.contains(filter, pearl.getQuality()) || Tools.contains(filter, pearl.getTag())) {
							
							if(!choice.equals(pearl)) {
								result.add(pearl);
							}
						}
					}
				}
			} else {
				if(andValue) {
					if(Tools.searchOnName(key, pearl.getMap(), andValue)
						&& Tools.contains(filter, pearl.getQuality()) /*&& Tools.contains(filter, pearl.getTag())*/) {
						
						if(!choice.equals(pearl)) {
							result.add(pearl);
						}
					}
				} else {
					if(Tools.searchOnName(key, pearl.getMap(), andValue)
						|| Tools.contains(filter, pearl.getQuality()) || Tools.contains(filter, pearl.getTag())) {
						
						if(!choice.equals(pearl)) {
							result.add(pearl);
						}
					}
				}
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] getWeaponCostPearl() {
		return Pearl.dataWeaponCost;
	}
	
	public static Pearl[] getArmorCostPearl() {
		return Pearl.dataArmorCost;
	}
	
	public static boolean isAlreadyCount(ArrayList<Pearl> notCombinablePearl, Pearl pearl) {
		boolean result = false;
		
		for(Pearl compare : notCombinablePearl) {
			if(compare.equals(pearl)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static Tag[] getTags() {
		return Pearl.tags;
	}
	
	public static Quality[] getQualities() {
		return Pearl.qualities;
	}
}
