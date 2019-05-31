package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class Runway {
	
	public static final int[][] currentRunway = { {6, 7}, {4, 9}, {0, 3}, {1, 5}, {10, 8, 2} };
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Runway(String name, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<strong>- " + this.name + "</strong>");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return tooltip.toString();
	}
}
