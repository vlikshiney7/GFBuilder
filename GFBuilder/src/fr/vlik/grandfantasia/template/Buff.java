package fr.vlik.grandfantasia.template;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Check;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class Buff implements Writable {
	
	protected Map<Language, String> name;
	protected Calculable[] effects;
	protected Check verified = Check.CHECK;
	
	@SuppressWarnings("serial")
	protected Buff() {
		this.name = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
	}
	
	protected Buff(Map<Language, String> name, Calculable[] effects) {
		this.name = name;
		this.effects = effects;
		
		if(this.effects != null) {
			for (Calculable c : this.effects) {
				if(c.getCheck().index > this.verified.index) {
					this.verified = c.getCheck();
				}
			}
		}
	}
	
	public Map<Language, String> getMap() {
		return new EnumMap<>(this.name);
	}
	
	public String getName(Language lang) {
		if(this.name == null) {
			return "";
		} else if(this.name.get(lang) == null || this.name.get(lang).equals("")) {
			return this.name.get(Language.FR);
		}
		
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
	
	public static <T extends Buff> T get(T[] tab, String name, Language lang) {
		return Arrays.asList(tab).stream().filter(e -> e.getName(lang).equals(name)).findFirst().orElse(null);
	}
	
	public String getSelectorInfo(Language lang) {
		if(this.name == null) {
			return " ";
		} else if(this.name.get(lang) == null || this.name.get(lang).equals("")) {
			return this.name.get(Language.FR);
		}
		
		return this.name.get(lang);
	}
	
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(TAB + TAB + "<b>Statistique</b>" + TAB + TAB);
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append(LINE + TAB + "• " + e.getFullInfo(lang) + TAB);
			}
		}
		
		result.append(LINE + "<i>" + this.verified.getFullInfo(lang) + "</i>" + TAB);
		
		return toHTML(result);
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
