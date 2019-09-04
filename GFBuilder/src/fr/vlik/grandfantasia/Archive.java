package fr.vlik.gfbuilder;

import java.awt.Color;
import java.util.ArrayList;

public class Archive {
	
	private String name;
	private int quality;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Archive(String name, int quality, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getQuality() {
		return this.quality;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
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
