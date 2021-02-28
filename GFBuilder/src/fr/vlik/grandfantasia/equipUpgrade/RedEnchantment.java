package fr.vlik.grandfantasia.equipUpgrade;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.InnerEffect;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.stats.Calculable;

public class RedEnchantment extends Enchantment {
	
	private InnerEffect[] lvlEffect;
	
	public RedEnchantment() {
		super();
	}
	
	public RedEnchantment(Map<Language, String> name, int lvlMin, int lvlMax, EnchantType[] tabType, Calculable[][] lvlEffect) {
		super(name, lvlMin, lvlMax, Quality.RED, tabType, null);
		
		this.lvlEffect = new InnerEffect[lvlEffect.length];
		for(int i = 0; i < lvlEffect.length; i++) {
			int lvl = i+1;
			this.lvlEffect[i] = new InnerEffect(name, lvl, lvlEffect[i]);
		}
	}
	
	@Override
	public String getTooltip() {
		if(this.lvlEffect == null) {
			return "";
		}
		return this.lvlEffect[0].getTooltip();
	}
	
	public InnerEffect[] getInnerEffect() {
		return this.lvlEffect;
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
	
	public static RedEnchantment[] getPossibleRedEnchant(Equipment equip, RedEnchantment ignore1, RedEnchantment ignore2) {
		ArrayList<RedEnchantment> result = new ArrayList<RedEnchantment>();
		
		result.add(new RedEnchantment());
		
		if(equip.getQuality() == Quality.RED) {
			for(Enchantment preCast : Enchantment.data.get(equip.getQuality())) {
				RedEnchantment enchant = (RedEnchantment) preCast;
				
				if(equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()) {
					if(enchant.containType(equip.getType())) {
						result.add(enchant);
					}
				}
			}
		}
		
		if(ignore1 != null && !ignore1.equals(new RedEnchantment())) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null && !ignore2.equals(new RedEnchantment())) {
			result.remove(ignore2);
		}
		
		return result.toArray(new RedEnchantment[result.size()]);
	}
}
