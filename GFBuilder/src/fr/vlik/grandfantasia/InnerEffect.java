package fr.vlik.grandfantasia;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;

public class InnerEffect extends Buff {
	
	private int lvlBuff;
	
	public InnerEffect(Map<Language, String> name, int lvlBuff, Calculable[] effects) {
		super(name, effects);
		this.lvlBuff = lvlBuff;
	}
	
	public int getLvlbuff() {
		return this.lvlBuff;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return this.name.get(Language.FR) + " " + this.lvlBuff;
		}
		return this.name.get(lang) + " " + this.lvlBuff;
	}
}
