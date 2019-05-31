package fr.vlik.gfbuilder;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JRadioButton;

import fr.vlik.gfbuilder.Effect.TypeEffect;

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

	public void addStarBonus(ArrayList<JRadioButton> star) {
		int nbStar = 0;
		while(!star.get(nbStar).isSelected() && nbStar < 5) nbStar++;
		nbStar++;
		
		if(nbStar == 3 || nbStar == 4) {
			this.effects.add(new Effect(TypeEffect.Depla, true, 10, false, -1));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 4, false, -1));
			}
		} else if(nbStar == 5) {
			this.effects.add(new Effect(TypeEffect.Depla, true, 20, false, -1));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 8, false, -1));
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
