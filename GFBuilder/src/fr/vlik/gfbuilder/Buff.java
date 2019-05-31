package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class Buff {
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Buff(String name, ArrayList<Effect> effects) {
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
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
}
