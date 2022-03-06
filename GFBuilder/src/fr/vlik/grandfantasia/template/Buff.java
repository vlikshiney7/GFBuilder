package fr.vlik.grandfantasia.template;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class Buff implements Writable {
	
	protected Map<Language, String> name;
	protected Calculable[] effects;
	
	@SuppressWarnings("serial")
	protected Buff() {
		this.name = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
	}
	
	protected Buff(Map<Language, String> name, Calculable[] effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public Map<Language, String> getMap() {
		return new EnumMap<>(this.name);
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
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
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(effects);
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Buff other = (Buff) obj;
		if (!Arrays.equals(effects, other.effects)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
