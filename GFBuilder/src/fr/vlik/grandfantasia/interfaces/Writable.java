package fr.vlik.grandfantasia.interfaces;

import fr.vlik.grandfantasia.enums.Language;

public interface Writable {
	
	public String getInfo(Language lang);
	
	public String getTooltip();
}
