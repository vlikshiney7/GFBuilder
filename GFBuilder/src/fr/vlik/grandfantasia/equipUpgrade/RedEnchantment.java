package fr.vlik.grandfantasia.equipUpgrade;

import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class RedEnchantment extends Enchantment {
	
	private int nbLvl;
	private Calculable[][] effectsLvl;
	
	
	public RedEnchantment() {
		super();
		
		this.nbLvl = 0;
	}
	
	public RedEnchantment(String name, int lvlMin, int lvlMax, Quality quality, EnchantType[] tabType, Calculable[][] effectsLvl) {
		super(name, lvlMin, lvlMax, quality, tabType, null);
		
		this.nbLvl = effectsLvl.length;
		this.effectsLvl = effectsLvl;
	}
	
	public int getNbLvl() {
		return this.nbLvl;
	}
	
	public Calculable[] getEffects(int lvl) {
		if(this.effectsLvl == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effectsLvl[lvl-1].length];
		
		for(int i = 0; i < this.effectsLvl[lvl-1].length; i++) {
			Calculable c = this.effectsLvl[lvl-1][i];
			
			if(c instanceof Effect) {
				tab[i] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof RegenEffect) {
				tab[i] = new RegenEffect((RegenEffect) c);
			} else if(c instanceof Proc) {
				tab[i] = new Proc((Proc) c);
			}
		}
		
		return tab;
	}
	
	public String getTooltip(int lvl) {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		
		if(this.effectsLvl[lvl-1] != null) {
			for(Calculable e : this.effectsLvl[lvl-1]) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
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
		
		RedEnchantment[] cast = new RedEnchantment[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
