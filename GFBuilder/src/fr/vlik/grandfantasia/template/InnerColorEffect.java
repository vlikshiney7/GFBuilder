package fr.vlik.grandfantasia.template;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;

public class InnerColorEffect extends ColorBuff {
	
	private int lvlBuff;
	
	public InnerColorEffect(Map<Language, String> name, Quality quality, int lvlBuff, Calculable[] effects) {
		super(name, quality, effects);
		this.lvlBuff = lvlBuff;
	}
	
	public int getLvlbuff() {
		return this.lvlBuff;
	}
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return this.name.get(Language.FR) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
		}
		return this.name.get(lang) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvlBuff;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		InnerColorEffect other = (InnerColorEffect) obj;
		return this.lvlBuff == other.lvlBuff;
	}
}
