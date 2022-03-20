package fr.vlik.grandfantasia.subequip;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;

public class Runway extends Buff {
	
	public static Runway[] data = LoaderSubEquip.getRunway();
	
	
	public Runway(Map<Language, String> name, Calculable[] effects) {
		super(name, effects);
	}
	
	public Runway(Runway runway) {
		this.name = runway.getMap();
		this.effects = runway.getEffects();
	}
	
	@Override
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(TAB + TAB + "<b>" + this.name.get(lang) + "</b>" + TAB + TAB);
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append(LINE + TAB + "• " + e.getFullInfo(lang) + TAB);
			}
		}
		
		return toHTML(result);
	}
	
	public static Runway[] getData() {
		return Runway.data;
	}
	
	public static Runway get(String name) {
		for(Runway runway : Runway.data) {
			if(runway.getName(Language.FR).equals(name)) {
				return runway;
			}
		}
		
		return null;
	}
}
