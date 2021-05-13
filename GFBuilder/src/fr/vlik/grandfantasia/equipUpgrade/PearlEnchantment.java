package fr.vlik.grandfantasia.equipUpgrade;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.equipUpgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.InnerEffect;

public class PearlEnchantment extends Buff {
	
	protected static PearlEnchantment[] data = LoaderEquipUpgrade.getPearlEnchantment();
	
	private InnerEffect[] lvlEffect;
	
	public PearlEnchantment(Map<Language, String> name, Calculable[][] lvlEffect) {
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
	
	public static InnerEffect[] cumulConstraint(ArrayList<InnerEffect> innerEffect) {
		ArrayList<InnerEffect> result = new ArrayList<InnerEffect>();
		
		for(InnerEffect current : innerEffect) {
			InnerEffect toAdd = current;
			InnerEffect toRemove = null;
			
			for(InnerEffect calculated : result) {
				
				if(calculated.getName(Language.FR).equals(current.getName(Language.FR))) {
					if(calculated.getLvlbuff() < current.getLvlbuff()) {
						toRemove = calculated;
					} else {
						toAdd = null;
					}
				}
			}
			
			if(toRemove != null) {
				result.remove(toRemove);
			}
			
			if(toAdd != null) {
				result.add(toAdd);
			}
		}
		
		return result.toArray(new InnerEffect[result.size()]);
	}
	
	public static PearlEnchantment get(String name) {
		for(PearlEnchantment pearlEnchant : PearlEnchantment.data) {
			if(pearlEnchant.getName(Language.FR).equals(name)) {
				return pearlEnchant;
			}
		}
		
		return null;
	}
	
	public static PearlEnchantment[] getPossiblePearlEnchant(PearlEnchantment ignore1, PearlEnchantment ignore2, PearlEnchantment ignore3, PearlEnchantment ignore4) {
		ArrayList<PearlEnchantment> result = new ArrayList<PearlEnchantment>();
		
		for(PearlEnchantment enchant : PearlEnchantment.data) {
			result.add(enchant);
		}
		
		if(ignore1 != null) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null) {
			result.remove(ignore2);
		}
		
		if(ignore3 != null) {
			result.remove(ignore3);
		}
		
		if(ignore4 != null) {
			result.remove(ignore4);
		}
		
		return result.toArray(new PearlEnchantment[result.size()]);
	}
	
	public static PearlEnchantment[] getData() {
		return PearlEnchantment.data;
	}
}
