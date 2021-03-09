package fr.vlik.grandfantasia.template;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class Buff implements Writable {
	
	protected Map<Language, String> name;
	protected Calculable[] effects;
	
	@SuppressWarnings("serial")
	public Buff() {
		this.name = new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
	}
	
	public Buff(Map<Language, String> name, Calculable[] effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public Map<Language, String> getMap() {
		return this.name;
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public Calculable[] getEffects() {
		return Tools.getEffects(this.effects);
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return this.name.get(Language.FR);
		}
		return this.name.get(lang);
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
		
		return "<html>" + tooltip + "</html>";
	}
}
