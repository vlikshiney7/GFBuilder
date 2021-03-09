package fr.vlik.uidesign;

import java.util.ArrayList;

import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;

@SuppressWarnings("unchecked")
public class CustomList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;
	
	public boolean addAll(Buff buff) {
		if(buff == null) {
			return false;
		}
		
		if(buff.getEffects() != null) {
			for(Calculable calculable : buff.getEffects()) {
				this.add((T) calculable);
			}
		}
		
		return true;
	}
	
	public boolean addAll(Calculable[] tab) {
		if(tab == null) {
			return false;
		}
		
		for(Calculable calculable : tab) {
			this.add((T) calculable);
		}
		
		return true;
	}
}
