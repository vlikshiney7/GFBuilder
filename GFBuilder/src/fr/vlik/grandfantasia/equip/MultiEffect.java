package fr.vlik.grandfantasia.equip;

import java.util.Arrays;

import fr.vlik.grandfantasia.stats.Calculable;

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
			return new Calculable[0][0];
		}
		
		Calculable[][] tabs = new Calculable[this.effects.length][];
		
		for(int i = 0; i < tabs.length; i++) {
			if(this.effects[i] == null) {
				tabs[i] = new Calculable[0];
			} else {
				Calculable[] tab = new Calculable[this.effects[i].length];
				
				for(int j = 0; j < tab.length; j++) {
					tab[j] = this.effects[i][j].copy();
				}
				
				tabs[i] = tab;
			}
		}
		
		return tabs;
	}
	
	public Calculable[] getEffectsFromLvl(int lvl) {
		int index = lvl > this.lvlMax ? this.lvlMax - this.lvlMin : lvl - this.lvlMin;
		
		return Arrays.copyOf(this.effects[index], this.effects[index].length);
	}
}
