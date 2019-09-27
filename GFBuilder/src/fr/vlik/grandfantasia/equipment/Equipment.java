package fr.vlik.grandfantasia.equipment;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import fr.vlik.grandfantasia.Consts;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public abstract class Equipment implements FullRenderer {
	
	protected String name;
	protected GradeName[] grades;
	protected int lvl;
	protected Quality quality;
	protected boolean enchantable;
	protected BufferedImage img;
	protected ArrayList<Effect> effects = new ArrayList<Effect>();
	protected ArrayList<Effect> bonusXP = new ArrayList<Effect>();
	
	public Equipment() {
		this.name = "Rien";
		this.grades = new GradeName[] {	GradeName.NONE };
		this.lvl = 0;
	}
	
	public Equipment(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		this.name = name;
		this.grades = grades;
		this.lvl = lvl;
		this.quality = quality;
		this.enchantable = enchantable;
		this.effects = effects;
		this.bonusXP = bonusXP;
	}
	
	public String getName() {
		return this.name;
	}
	
	public GradeName[] getGrades() {
		return this.grades;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	public boolean isEnchantable() {
		return this.enchantable;
	}

	@Override
	public Color getColor() {
		return Consts.itemColor[this.quality.index];
	}
	
	@Override
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public ArrayList<Effect> getBonusXP() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.bonusXP.size());
		for(Effect effect : this.bonusXP) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public boolean containGrade(GradeName grade) {
		if(grade == GradeName.NONE) {
			return true;
		}
		
		for(GradeName element : this.grades) {
			if(element == grade) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Equipment)) {
			return false;
		}
		
		Equipment equip = (Equipment) obj;
		boolean b = this.name.equals(equip.name)
				&& this.lvl == equip.lvl;
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		if(this.bonusXP.size() != 0) {
			tooltip.append("<br><br>");
			tooltip.append("Bonus XP Stuff lvl " + this.lvl);
			for(Effect e : this.bonusXP) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
}
