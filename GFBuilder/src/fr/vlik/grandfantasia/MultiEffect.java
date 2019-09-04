package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class MultiEffect {
	
	private String code;
	private int lvlMin;
	private int lvlMax;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public MultiEffect(String code, int lvlMin, ArrayList<ArrayList<Effect>> effects) {
		this.code = code;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMin + effects.size() - 1;
		this.effects = effects;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public ArrayList<ArrayList<Effect>> getEffects() {
		ArrayList<ArrayList<Effect>> list = new ArrayList<ArrayList<Effect>>(this.effects.size());
		
		for(int i = 0; i < list.size(); i++) {
			list.add(new ArrayList<Effect>(effects.get(i).size()));
			
			for(Effect effect : effects.get(i)) {
				list.get(i).add(new Effect(effect));
			}
		}
		
		return list;
	}
	
	public ArrayList<Effect> getEffectsFromLvl(int lvl) {
		int index = lvl > this.lvlMax ? this.lvlMax - this.lvlMin : lvl - this.lvlMin;
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.get(index).size());
		for(Effect effect : this.effects.get(index)) {
			list.add(new Effect(effect));
		}
		return list;
	}
}
