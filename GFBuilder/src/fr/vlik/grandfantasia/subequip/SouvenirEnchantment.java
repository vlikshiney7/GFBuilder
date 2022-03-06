package fr.vlik.grandfantasia.subequip;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;

public class SouvenirEnchantment extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Enchantement de souvenir");
		put(Language.EN, "Souvenir enchantment");
	}};
	
	private static SouvenirEnchantment[] data = LoaderSubEquip.getSouvenirEnchantment();
	
	private int lvlMin;
	private int lvlMax;
	
	@SuppressWarnings("serial")
	public SouvenirEnchantment() {
		this.name = new HashMap<Language, String>() {{ put(Language.FR, " "); put(Language.EN, " "); }};
		this.lvlMin = 0;
		this.lvlMax = 0;
	}
	
	public SouvenirEnchantment(Map<Language, String> name, int lvlMin, int lvlMax, Calculable[] effects) {
		super(name, effects);
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public static SouvenirEnchantment get(Souvenir souvenir, String name) {
		for(SouvenirEnchantment enchant : SouvenirEnchantment.data) {
			if(enchant.getName(Language.FR).equals(name)
				&& souvenir.getLvl() >= enchant.getLvlMin() && souvenir.getLvl() <= enchant.getLvlMax()) {
				
				return enchant;
			}
		}
		
		return null;
	}
	
	public static SouvenirEnchantment[] getPossibleSouvenirEnchant(Souvenir souvenir, SouvenirEnchantment ignore1, SouvenirEnchantment ignore2) {
		ArrayList<SouvenirEnchantment> result = new ArrayList<>();
		
		result.add(new SouvenirEnchantment());
		
		for(SouvenirEnchantment enchant : SouvenirEnchantment.data) {
			if(souvenir.getLvl() >= enchant.getLvlMin() && souvenir.getLvl() <= enchant.getLvlMax()) {
				result.add(enchant);
			}
		}
		
		if(ignore1 != null && !ignore1.equals(new SouvenirEnchantment())) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null && !ignore2.equals(new SouvenirEnchantment())) {
			result.remove(ignore2);
		}
		
		return result.toArray(new SouvenirEnchantment[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvlMax;
		result = prime * result + this.lvlMin;
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
		SouvenirEnchantment other = (SouvenirEnchantment) obj;
		if (this.lvlMax != other.lvlMax) {
			return false;
		}
		return this.lvlMin == other.lvlMin;
	}
}
