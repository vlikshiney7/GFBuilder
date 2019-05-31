package fr.vlik.gfbuilder;

import java.awt.Color;
import java.util.ArrayList;

public class Title {

	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private int quality;
	private int lvl;
	private int idClass;
	
	public Title(String name, int quality, int lvl, int idClass, String[] effects) {
		this.name = name;
		this.lvl = lvl;
		this.quality = quality;
		this.idClass = idClass;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}

	public int getQuality() {
		return this.quality;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public int getIdClass() {
		return this.idClass;
	}
	
	public Color getColor() {
		return Consts.titleColor[this.quality];
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
