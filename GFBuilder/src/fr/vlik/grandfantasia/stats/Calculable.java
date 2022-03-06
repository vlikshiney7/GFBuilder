package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;

public interface Calculable {
	
	public Calculable copy();
	
	public void multiplyValue(int factor);
	
	public String getTooltip();

	public String toString(Language lang);
}
