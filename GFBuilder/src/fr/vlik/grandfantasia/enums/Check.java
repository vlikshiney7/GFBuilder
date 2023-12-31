package fr.vlik.grandfantasia.enums;

import java.awt.Color;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum Check implements Colorable, Writable {
	
	CHECK(0, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vérifié"); put(Language.EN, "Check"); }}, Tools.itemColor[2]),
	TOTEST(1, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "A tester"); put(Language.EN, "To test"); }}, Tools.itemColor[5]),
	UNCHECK(2, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Non vérifié"); put(Language.EN, "Uncheck"); }}, Tools.itemColor[7]);
	
	public final int index;
	public final Map<Language, String> lang;
	public final Color color;
	
    private Check(int index, Map<Language, String> lang, Color color) {
        this.index = index;
        this.lang = lang;
        this.color = color;
    }
    
	public String getName(Language lang) {
		return this.lang.get(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.lang.get(lang);
	}
	
	public String getFullInfo(Language lang) {
		return this.lang.get(lang);
	}
	
	public Color getColor() {
		return this.color;
	}
}
