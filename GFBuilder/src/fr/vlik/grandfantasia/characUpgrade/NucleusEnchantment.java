package fr.vlik.grandfantasia.characUpgrade;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.InnerEffect;

public class NucleusEnchantment extends Buff {
	
	protected static NucleusEnchantment[] data = LoaderCharacUpgrade.getNucleusEnchantment();
	
	private InnerEffect[] lvlEffect;
	
	public NucleusEnchantment(Map<Language, String> name, Calculable[][] lvlEffect) {
		super(name, null);
		
		this.lvlEffect = new InnerEffect[lvlEffect.length];
		for(int i = 0; i < lvlEffect.length; i++) {
			int lvl = i+1;
			this.lvlEffect[i] = new InnerEffect(name, lvl, lvlEffect[i]);
		}
	}
	
	public InnerEffect getInnerEffect(int lvl) {
		if(lvl == 0) {
			return null;
		}
		
		for(InnerEffect inner : this.lvlEffect) {
			if(lvl == inner.getLvlbuff()) {
				return inner;
			}
		}
		
		return null;
	}
	
	public InnerEffect[] getInnerLvlEffect(int star) {
		ArrayList<InnerEffect> result = new ArrayList<InnerEffect>();
		
		switch (star) {
			case 0:
				break;
			case 1:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				break;
			case 2:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				result.add(this.lvlEffect[2]);
				break;
			case 3:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				result.add(this.lvlEffect[2]);
				result.add(this.lvlEffect[3]);
				result.add(this.lvlEffect[4]);
				break;
		}
		
		return result.toArray(new InnerEffect[result.size()]);
	}
	
	@Override
	public String getTooltip() {
		return this.lvlEffect[0].getTooltip();
	}
	
	public static NucleusEnchantment get(String name) {
		for(NucleusEnchantment pearlEnchant : NucleusEnchantment.data) {
			if(pearlEnchant.getName(Language.FR).equals(name)) {
				return pearlEnchant;
			}
		}
		
		return null;
	}
	
	public static NucleusEnchantment[] getPossibleNucleusEnchant(NucleusEnchantment ignore1, NucleusEnchantment ignore2) {
		ArrayList<NucleusEnchantment> result = new ArrayList<NucleusEnchantment>();
		
		for(NucleusEnchantment enchant : NucleusEnchantment.data) {
			result.add(enchant);
		}
		
		if(ignore1 != null) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null) {
			result.remove(ignore2);
		}
		
		return result.toArray(new NucleusEnchantment[result.size()]);
	}
	
	public static NucleusEnchantment[] getData() {
		return NucleusEnchantment.data;
	}
}
