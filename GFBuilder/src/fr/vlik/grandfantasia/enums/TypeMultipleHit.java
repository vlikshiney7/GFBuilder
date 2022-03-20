package fr.vlik.grandfantasia.enums;

import java.awt.Color;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;

public enum TypeMultipleHit {
	
	Double("Dégât x2", "Damage x2", "Deg x2", "Dam x2", Tools.EffectColor[7]),
	Triple("Dégât x3", "Damage x3", "Deg x3", "Dam x3", Tools.EffectColor[10]),
	ReflectP("Dégât Physique Renvoyé", "", "Deg Phys Refl", "", Tools.EffectColor[10]),
	ReflectM("Dégât Magique Renvoyé", "", "Deg Mag Refl", "", Tools.EffectColor[11]),
	;
	
	public final Map<Language, String> longInfo;
	public final Map<Language, String> shortInfo;
	public final Color color;
	
	@SuppressWarnings("serial")
	private TypeMultipleHit(String longFR, String longEN, String shortFR, String shortEN, Color color) {
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