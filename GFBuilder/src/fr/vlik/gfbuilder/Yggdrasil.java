package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class Yggdrasil {

	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Yggdrasil(String name, String[] effects) {
		this.name = name;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<Effect> getEffects() {
		return effects;
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
