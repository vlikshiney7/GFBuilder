package fr.vlik.grandfantasia.equipupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.customequip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equipupgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Enchantment extends ColorBuff {
	
	protected static Map<Quality, Enchantment[]> data = LoaderEquipUpgrade.getEnchant();
	
	private int lvlMin;
	private int lvlMax;
	private EquipType[] tabType;
	
	@SuppressWarnings("serial")
	public Enchantment() {
		this.name = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, " "); put(Language.EN, " "); }};
		this.lvlMin = 0;
		this.lvlMax = 100;
		this.quality = Quality.GREY;
	}
	
	public Enchantment(Map<Language, String> name, int lvlMin, int lvlMax, Quality quality, EquipType[] tabType, Calculable[] effects) {
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
	
	public EquipType[] getTabType() {
		return this.tabType;
	}
	
	public boolean containType(EquipType type) {
		if(this.tabType == null) {
			return false;
		}
		
		return Tools.containObject(this.tabType, type);
	}
	
	public static Enchantment get(Equipment equip, String name) {
		if(Enchantment.data.get(equip.getQuality()) != null) {
			for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
				if(enchant.getName(Language.FR).equals(name)
					&& equip.getLvl() >= enchant.getLvlMin()
					&& equip.getLvl() <= enchant.getLvlMax()
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
					&& equip.getLvl() >= enchant.getLvlMin()
					&& equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
					
					return enchant;
				}
			}
		}
		
		return null;
	}
	
	public static Enchantment[] getPossibleEnchant(Equipment equip) {
		List<Enchantment> result = new ArrayList<>();
		
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
			if(equip.getLvl() >= enchant.getLvlMin()
					&& equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
				
				result.add(enchant);
			}
		}
		
		return result.toArray(new Enchantment[result.size()]);
	}
	
	public static Enchantment[] getPossibleEnchant(CustomEquipment equip, Quality quality) {
		List<Enchantment> result = new ArrayList<>();
		
		result.add(new Enchantment());
		
		if(equip != null && (quality == Quality.GREEN || quality == Quality.BLUE)) {
			for(Enchantment enchant : Enchantment.data.get(quality)) {
				if(equip.getLvl() >= enchant.getLvlMin()
						&& equip.getLvl() <= enchant.getLvlMax()
						&& enchant.containType(equip.getType())) {
					
					result.add(enchant);
				}
			}
		}
		
		return result.toArray(new Enchantment[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvlMax;
		result = prime * result + this.lvlMin;
		result = prime * result + Arrays.hashCode(this.tabType);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Enchantment other = (Enchantment) obj;
		if (this.lvlMax != other.lvlMax) {
			return false;
		}
		if (this.lvlMin != other.lvlMin) {
			return false;
		}
		return Arrays.equals(this.tabType, other.tabType);
	}
}
