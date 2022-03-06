package fr.vlik.grandfantasia.subequip;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;

public class CombiRunway implements Writable {
	
	public static CombiRunway[] data = LoaderSubEquip.getCombiRunway();
	
	private Map<Language, String> name;
	private Runway[] runways;
	
	public CombiRunway(Map<Language, String> name, Runway[] runways) {
		this.name = name;
		this.runways = runways;
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public Runway[] getRunways() {
		Runway[] tab = new Runway[this.runways.length];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Runway(this.runways[i]);
		}
		
		return tab;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<strong>Bonus :</strong><br>");
		
		for(Runway runway : this.runways) {
			tooltip.append(runway.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static CombiRunway get(int i) {
		return CombiRunway.data[i];
	}
}
