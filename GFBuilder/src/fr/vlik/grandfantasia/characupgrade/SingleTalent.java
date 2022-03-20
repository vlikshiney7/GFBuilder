package fr.vlik.grandfantasia.characupgrade;

import java.util.Map;

import javax.swing.Icon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;
import fr.vlik.grandfantasia.template.InnerColorEffect;

public class SingleTalent extends IconBuff {
	
	public SingleTalent(Map<Language, String> name, Icon icon, InnerColorEffect effects) {
		if(effects != null) {
			this.name.put(Language.FR, name.get(Language.FR) + " " + effects.getLvlbuff());
			this.name.put(Language.EN, name.get(Language.EN) + " " + effects.getLvlbuff());
			this.effects = effects.getEffects();
		} else {
			this.name.put(Language.FR, name.get(Language.FR));
			this.name.put(Language.EN, name.get(Language.EN));
		}
		
		this.icon = icon;
	}
	
	@Override
	public String getSelectorInfo(Language lang) {
		return "";
	}
	
	@Override
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(TAB + TAB + "<b>" + this.name.get(lang) + "</b>" + TAB + TAB);
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append(LINE + TAB + "• " + e.getFullInfo(lang));
			}
		}
		
		return toHTML(result);
	}
}
