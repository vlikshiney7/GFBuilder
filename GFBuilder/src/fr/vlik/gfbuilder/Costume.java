package fr.vlik.gfbuilder;

import java.awt.Color;
import java.util.ArrayList;

public class Costume {
	
	private String name;
	private int quality;
	private int type = -1;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Costume() {
		this.name = "Rien";
		this.quality = 7;
	}
	
	public Costume(String name, int quality, int type, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.type = type;
		this.effects = effects;
	}
	
	public Costume(Costume cost) {
		this.name = cost.getName();
		this.quality = cost.getQuality();
		
		for(int i = 0; i < cost.getEffects().size(); i++) {
			this.effects.add(new Effect(cost.getEffects().get(i)));
		}
	}
	
	public String getName() {
		return this.name;
	}

	public int getQuality() {
		return this.quality;
	}
	
	public int getType() {
		return this.type;
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
