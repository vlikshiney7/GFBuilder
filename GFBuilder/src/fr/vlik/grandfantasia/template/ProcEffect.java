package fr.vlik.grandfantasia.template;

import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Proc;

public class ProcEffect implements Writable {
	
	private Calculable[] effects;
	
	public ProcEffect(Buff buff) {
		ArrayList<Calculable> procEffects = new ArrayList<>();
		
		if(buff != null && buff.getEffects() != null) {
			for(Calculable c : buff.getEffects()) {
				if(c instanceof Proc) {
					Proc p = (Proc) c;
					procEffects.addAll(extractEffects(p.getEffects()));
				} else if(c instanceof Condition) {
					Condition co = (Condition) c;
					procEffects.addAll(extractEffects(co.getEffects()));
				}
			}
		}
		
		this.effects = procEffects.toArray(new Calculable[procEffects.size()]);
	}
	
	private ArrayList<Calculable> extractEffects(Calculable[] tab) {
		ArrayList<Calculable> procEffects = new ArrayList<>();
		
		for(Calculable c : tab) {
			if(c instanceof Proc) {
				Proc p = (Proc) c;
				procEffects.addAll(extractEffects(p.getEffects()));
			} else if(c instanceof Condition) {
				Condition co = (Condition) c;
				procEffects.addAll(extractEffects(co.getEffects()));
			} else {
				procEffects.add(c);
			}
		}
		
		return procEffects;
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
	
	public String getName(Language lang) {
		return "";
	}
	
	public String getSelectorInfo(Language lang) {
		return "";
	}
	
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(TAB + TAB + "<b>Proc</b>" + TAB + TAB);
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append(LINE + TAB);
				result.append("• " + e.getFullInfo(lang));
				result.append(TAB);
			}
		}
		
		return toHTML(result);
	}
}
