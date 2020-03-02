package fr.vlik.grandfantasia.equipable;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public abstract class Equipment implements FullRenderer {
	
	protected Map<Language, String> name;
	protected GradeName[] grades;
	protected int lvl;
	protected Quality quality;
	protected boolean enchantable;
	protected Icon icon;
	protected ArrayList<Calculable> effects = new ArrayList<Calculable>();
	protected ArrayList<Calculable> bonusXP = new ArrayList<Calculable>();
	
	@SuppressWarnings("serial")
	public Equipment() {
		this.name = new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
		this.grades = new GradeName[] {	GradeName.NONE };
		this.lvl = 0;
	}
	
	public Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, ArrayList<Calculable> effects, ArrayList<Calculable> bonusXP) {
		this.name = name;
		this.grades = grades;
		this.lvl = lvl;
		this.quality = quality;
		this.enchantable = enchantable;
		this.effects = effects;
		this.bonusXP = bonusXP;
	}
	
	protected Map<Language, String> getMap() {
		return this.name;
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
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
		return Tools.itemColor[this.quality.index];
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public ArrayList<Calculable> getEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>(this.effects.size());
		for(Calculable effect : this.effects) {
			if(effect instanceof Effect) {
				list.add(new Effect((Effect)effect));
			}
		}
		return list;
	}
	
	public ArrayList<Calculable> getBonusXP() {
		ArrayList<Calculable> list = new ArrayList<Calculable>(this.bonusXP.size());
		for(Calculable effect : this.bonusXP) {
			if(effect instanceof Effect) {
				list.add(new Effect((Effect)effect));
			}
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
				&& this.lvl == equip.lvl
				&& this.quality == equip.quality
				&& this.effects.size() == equip.effects.size();
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == null) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		for(Calculable e : this.effects) {
			tooltip.append(e.getTooltip());
		}
		tooltip.append("</ul>");
		
		if(this.bonusXP.size() != 0) {
			tooltip.append("<br>");
			tooltip.append("<ul><b>Bonus XP Stuff lvl " + this.lvl + "</b>");
			for(Calculable e : this.bonusXP) {
				tooltip.append(e.getTooltip());
			}
			tooltip.append("</ul>");
		}
		
		return "<html>" + tooltip + "</html>";
	}
}
