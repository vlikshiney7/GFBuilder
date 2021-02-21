package fr.vlik.grandfantasia.equipUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.ColorBuff;
import fr.vlik.grandfantasia.customEquip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;

public class Enchantment extends ColorBuff {
	
	protected static Map<Quality, Enchantment[]> data = Loader.getEnchant();
	
	private int lvlMin;
	private int lvlMax;
	private EnchantType[] tabType;
	
	@SuppressWarnings("serial")
	public Enchantment() {
		this.name = new HashMap<Language, String>() {{ put(Language.FR, " "); put(Language.EN, " "); }};
		this.lvlMin = 0;
		this.lvlMax = 100;
		this.quality = Quality.GREY;
	}
	
	public Enchantment(Map<Language, String> name, int lvlMin, int lvlMax, Quality quality, EnchantType[] tabType, Calculable[] effects) {
		super(name, quality, effects);
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.tabType = tabType;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public EnchantType[] getTabType() {
		return this.tabType;
	}
	
	public boolean containType(EnchantType type) {
		if(this.tabType == null) {
			return false;
		}
		
		for(EnchantType element : this.tabType) {
			if(element == type) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Enchantment get(Equipment equip, String name) {
		if(equip.getQuality() != Quality.GREY) {
			for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
				if(enchant.getName(Language.FR).equals(name)
					&& equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
					
					return enchant;
				}
			}
		}
		
		return null;
	}
	
	public static Enchantment get(CustomEquipment equip, Quality quality, String name) {
		if(quality != Quality.GREY) {
			for(Enchantment enchant : Enchantment.data.get(quality)) {
				if(enchant.getName(Language.FR).equals(name)
					&& equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
					
					return enchant;
				}
			}
		}
		
		return null;
	}
	
	public static Enchantment[] getPossibleEnchant(Equipment equip) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
			if(equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()) {
				if(enchant.containType(equip.getType())) {
					result.add(enchant);
				}
			}
		}
		
		return result.toArray(new Enchantment[result.size()]);
	}
	
	public static Enchantment[] getPossibleEnchant(CustomEquipment equip, Quality quality) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		
		result.add(new Enchantment());
		
		if(equip != null && (quality == Quality.GREEN || quality == Quality.BLUE)) {
			for(Enchantment enchant : Enchantment.data.get(quality)) {
				if(equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()) {
					if(enchant.containType(equip.getType())) {
						result.add(enchant);
					}
				}
			}
		}
		
		return result.toArray(new Enchantment[result.size()]);
	}
}
