package fr.vlik.grandfantasia;

import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class MultiEffect {
	
	private int lvlMin;
	private int lvlMax;
	private Calculable[][] effects;
	
	public MultiEffect(int lvlMin, Calculable[][] effects) {
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMin + effects.length - 1;
		this.effects = effects;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public Calculable[][] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[][] tabs = new Calculable[this.effects.length][];
		
		for(int i = 0; i < tabs.length; i++) {
			if(this.effects[i] == null) {
				tabs[i] = null;
			} else {
				Calculable[] tab = new Calculable[this.effects[i].length];
				
				for(int j = 0; j < tab.length; j++) {
					Calculable c = this.effects[i][j];
					
					if(c instanceof Effect) {
						tab[j] = new Effect((Effect) c);
					} else if(c instanceof StaticEffect) {
						tab[j] = new StaticEffect((StaticEffect) c);
					} else if(c instanceof SkillEffect) {
						tab[j] = new SkillEffect((SkillEffect) c);
					} else if(c instanceof RegenEffect) {
						tab[j] = new RegenEffect((RegenEffect) c);
					} else if(c instanceof Proc) {
						tab[j] = new Proc((Proc) c);
					}
				}
				
				tabs[i] = tab;
			}
		}
		
		return tabs;
	}
	
	public Calculable[] getEffectsFromLvl(int lvl) {
		int index = lvl > this.lvlMax ? this.lvlMax - this.lvlMin : lvl - this.lvlMin;
		
		Calculable[] tab = new Calculable[this.effects[index].length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.effects[index][i];
		}
		
		return tab;
	}
}
