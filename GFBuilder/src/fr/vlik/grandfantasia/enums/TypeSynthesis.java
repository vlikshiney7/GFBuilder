package fr.vlik.grandfantasia.enums;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum TypeSynthesis implements Writable {
	
	CLASSIC(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Classique"); put(Language.EN, "Classic"); }}),
	GENKI(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Genki"); put(Language.EN, "Genki"); }});
	
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Synthétisation");
		put(Language.EN, "Synthesis");
	}};
	
	public final Map<Language, String> lang;
	
	private TypeSynthesis(Map<Language, String> lang) {
        this.lang = lang;
    }

	public String getName(Language lang) {
		return this.lang.get(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.lang.get(lang);
	}
	
	public String getFullInfo(Language lang) {
		return this.lang.get(Language.FR);
	}
}
