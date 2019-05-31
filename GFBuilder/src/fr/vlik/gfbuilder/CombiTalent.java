package fr.vlik.gfbuilder;

import java.util.ArrayList;

public final class CombiTalent {
	
	private String name;
	private int[] code;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public CombiTalent() {
		this.name = "";
	}
	
	public CombiTalent(String name, int[] code, ArrayList<Effect> effects) {
		this.name = name;
		this.code = code;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getCode() {
		return this.code;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
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
