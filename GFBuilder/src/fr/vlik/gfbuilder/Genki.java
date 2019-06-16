package fr.vlik.gfbuilder;

import java.awt.Color;
import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.uidesign.JStarCheckBox;

public class Genki {
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private int quality;
	private int star;
	
	public Genki() {
		this.name = "Rien";
		this.quality = 7;
		this.star = 0;
	}
	
	public Genki(String name, int quality, int star, String[] effects) {
		this.name = name;
		this.star = star;
		this.quality = quality;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}
	
	public Genki(Genki genki) {
		this.name = genki.getName();
		this.quality = genki.getQuality();
		this.star = genki.getStar();
		
		for(int i = 0; i < genki.getEffects().size(); i++) {
			this.effects.add(new Effect(genki.getEffects().get(i)));
		}
	}
	
	public String getName() {
		return this.name;
	}

	public int getQuality() {
		return this.quality;
	}

	public int getStar() {
		return this.star;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
	}

	public void addStarBonus(ArrayList<JStarCheckBox> star, int idList) {
		int nbStar = 0;
		while(nbStar < 5) {
			if(!star.get(nbStar).isSelected()) break;
			nbStar++;
		}
		
		if(nbStar == 3 || nbStar == 4) {
			this.effects.add(new Effect(TypeEffect.Depla, false, 10 / (idList+1), false, -1));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 4 / (idList+1), false, -1));
			}
		} else if(nbStar == 5) {
			this.effects.add(new Effect(TypeEffect.Depla, false, 20 / (idList+1), false, -1));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 8 / (idList+1), false, -1));
			}
		}
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
