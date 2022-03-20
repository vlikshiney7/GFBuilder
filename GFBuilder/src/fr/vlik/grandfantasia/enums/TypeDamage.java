package fr.vlik.grandfantasia.enums;

import java.awt.Color;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;

public enum TypeDamage {
	
	Standard("Standard", "Standard", "Standard", "Standard", Tools.EffectColor[0]),
	Phys("Physique", "Physical", "Phys", "Phys", Tools.EffectColor[0]),
	Mag("Magique", "Magic", "Mag", "Mag", Tools.EffectColor[0]),
	AOE("Attaque de zone", "Area attack", "AOE", "AOE", Tools.EffectColor[0]),
	;
	
	public final Map<Language, String> longInfo;
	public final Map<Language, String> shortInfo;
	public final Color color;
	
	@SuppressWarnings("serial")
	private TypeDamage(String longFR, String longEN, String shortFR, String shortEN, Color color) {
		this.longInfo = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, longFR); put(Language.EN, longEN); }};
		this.shortInfo = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, shortFR); put(Language.EN, shortEN); }};
        this.color = color;
    }
	
	public Color getColor() {
		return this.color;
	}
	
	public String getLongInfo(Language lang) {
		if(this.longInfo == null) {
			return "";
		} else if(this.longInfo.get(lang) == null || this.longInfo.get(lang).equals("")) {
			return this.longInfo.get(Language.FR);
		}
		
		return this.longInfo.get(lang);
	}
	
	public String getShortInfo(Language lang) {
		if(this.shortInfo == null) {
			return "";
		} else if(this.shortInfo.get(lang) == null || this.shortInfo.get(lang).equals("")) {
			return this.shortInfo.get(Language.FR);
		}
		
		return this.shortInfo.get(lang);
	}
}
