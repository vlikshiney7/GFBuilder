package fr.vlik.grandfantasia.equipable;

import java.awt.Color;
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
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public abstract class Equipment implements FullRenderer {
	
	protected Map<Language, String> name;
	protected GradeName[] grades;
	protected int lvl;
	protected Quality quality;
	protected boolean enchantable;
	protected Icon icon;
	protected Calculable[] effects;
	protected Calculable[] bonusXP;
	
	@SuppressWarnings("serial")
	public Equipment() {
		this.name = new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
		this.grades = new GradeName[] {	GradeName.NONE };
		this.lvl = 0;
		this.quality = Quality.GREY;
		this.enchantable = false;
	}
	
	public Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, Calculable[] effects, Calculable[] bonusXP) {
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
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else if(this.effects[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.effects[i]);
			} else if(this.effects[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.effects[i]);
			}
		}
		
		return tab;
	}
	
	public Calculable[] getBonusXP() {
		if(this.bonusXP == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.bonusXP.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.bonusXP[i];
		}
		
		return tab;
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
				&& this.quality == equip.quality;
		
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
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		if(this.bonusXP != null) {
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
