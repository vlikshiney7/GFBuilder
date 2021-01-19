package fr.vlik.grandfantasia.enums;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum TypeSynthesis implements Writable {
	
	CLASSIC(new HashMap<Language, String>() {{ put(Language.FR, "Classique"); put(Language.EN, "Classic"); }}),
	GENKI(new HashMap<Language, String>() {{ put(Language.FR, "Genki"); put(Language.EN, "Genki"); }});
	
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Synthétisation");
		put(Language.EN, "Synthesis");
	}};
	
	public Map<Language, String> lang = new HashMap<Language, String>();
	
	private TypeSynthesis(Map<Language, String> lang) {
        this.lang = lang;
    }

	@Override
	public String getInfo(Language lang) {
		return this.lang.get(lang);
	}

	@Override
	public String getTooltip() {
		return this.lang.get(Language.FR);
	}
}
