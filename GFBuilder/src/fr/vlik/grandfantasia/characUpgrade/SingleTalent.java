package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import javax.swing.Icon;

import fr.vlik.grandfantasia.IconBuff;
import fr.vlik.grandfantasia.InnerColorEffect;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;

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
	public String getInfo(Language lang) {
		return "";
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>" + this.name.get(Language.FR) + "</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
}
