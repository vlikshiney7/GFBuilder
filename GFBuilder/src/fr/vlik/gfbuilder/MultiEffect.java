package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class MultiEffect {
	
	private String code;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public MultiEffect(String code, ArrayList<ArrayList<Effect>> effects) {
		this.code = code;
		this.effects = effects;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public ArrayList<Effect> getEffectsFromLvl(int lvl) {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.get(lvl).size());
		for(Effect effect : this.effects.get(lvl)) {
			list.add(new Effect(effect));
		}
		return list;
	}
}
