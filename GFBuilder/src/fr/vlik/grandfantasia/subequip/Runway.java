package fr.vlik.grandfantasia.subequip;

import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class Runway {
	
	public static Runway[] data = LoaderSubEquip.getRunway();
	
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
			return new Calculable[0];
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.effects[i].copy();
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
