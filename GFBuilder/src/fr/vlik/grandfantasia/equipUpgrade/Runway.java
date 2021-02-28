package fr.vlik.grandfantasia.equipUpgrade;

import fr.vlik.grandfantasia.loader.equipUpgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Runway {
	
	public static final String[][] currentRunway = { { "Bravoure", "Sorcier" }, { "Berserker", "Sagesse" }, { "Turbo", "Synthétisation" }, { "Lutte", "Malédiction" }, { "Illusion", "Ranger", "Praetor" } };
	
	public static Runway[] data = LoaderEquipUpgrade.getRunway();
	
	private String name;
	private Calculable[] effects;
	
	public Runway(Runway runway) {
		this.name = runway.getName();
		this.effects = runway.getEffects();
	}
	
	public Runway(String name, Calculable[] effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < this.effects.length; i++) {
			Calculable c = this.effects[i];
			
			if(c instanceof Effect) {
				tab[i] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof Proc) {
				tab[i] = new Proc((Proc) c);
			}
		}
		
		return tab;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<strong>- " + this.name + "</strong>");
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<ul>" + tooltip + "</ul>";
	}
	
	public static String getTooltipRunway(String[] idRunway) {
		StringBuilder tooltip = new StringBuilder("<strong>Bonus :</strong><br>");
		
		for(int i = 0; i < idRunway.length; i++) {
			tooltip.append(Runway.get(idRunway[i]).getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Runway[] getData() {
		return Runway.data;
	}
	
	public static Runway get(String name) {
		for(Runway runway : Runway.data) {
			if(runway.getName().equals(name)) {
				return runway;
			}
		}
		
		return null;
	}
}
