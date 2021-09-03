package fr.vlik.grandfantasia.template;

import java.util.ArrayList;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Proc;

public class ProcEffect implements Writable {
	
	private Calculable[] effects;
	
	public ProcEffect(Buff buff) {
		ArrayList<Calculable> effects = new ArrayList<Calculable>();
		
		if(buff != null && buff.getEffects() != null) {
			for(Calculable c : buff.getEffects()) {
				if(c instanceof Proc) {
					Proc p = (Proc) c;
					effects.addAll(extractEffects(p.getEffects()));
				} else if(c instanceof Condition) {
					Condition co = (Condition) c;
					effects.addAll(extractEffects(co.getEffects()));
				}
			}
		}
		
		this.effects = effects.toArray(new Calculable[effects.size()]);
	}
	
	private ArrayList<Calculable> extractEffects(Calculable[] tab) {
		ArrayList<Calculable> effects = new ArrayList<Calculable>();
		
		for(Calculable c : tab) {
			if(c instanceof Proc) {
				Proc p = (Proc) c;
				effects.addAll(extractEffects(p.getEffects()));
			} else if(c instanceof Condition) {
				Condition co = (Condition) c;
				effects.addAll(extractEffects(co.getEffects()));
			} else {
				effects.add(c);
			}
		}
		
		return effects;
	}
	
	public Calculable[] getEffects() {
		return Tools.getEffects(this.effects);
	}
	
	@Override
	public String getInfo(Language lang) {
		return "";
	}

	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>Proc</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
	
	
}
