package fr.vlik.grandfantasia.enums;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum Quality implements Colorable, Writable {
	
	GREY(0, new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Tools.itemColor[0]),
	WHITE(1, new HashMap<Language, String>() {{ put(Language.FR, "Blanc"); put(Language.EN, "White"); }}, Tools.itemColor[1]),
	GREEN(2, new HashMap<Language, String>() {{ put(Language.FR, "Vert"); put(Language.EN, "Green"); }}, Tools.itemColor[2]),
	BLUE(3, new HashMap<Language, String>() {{ put(Language.FR, "Bleu"); put(Language.EN, "Blue"); }}, Tools.itemColor[3]),
	ORANGE(4, new HashMap<Language, String>() {{ put(Language.FR, "Orange"); put(Language.EN, "Orange"); }}, Tools.itemColor[4]),
	GOLD(5, new HashMap<Language, String>() {{ put(Language.FR, "Jaune"); put(Language.EN, "Gold"); }}, Tools.itemColor[5]),
	PURPLE(6, new HashMap<Language, String>() {{ put(Language.FR, "Violet"); put(Language.EN, "Purple"); }}, Tools.itemColor[6]),
	RED(7, new HashMap<Language, String>() {{ put(Language.FR, "Rouge"); put(Language.EN, "Red"); }}, Tools.itemColor[7]),
	P8TITLE(8, new HashMap<Language, String>() {{ put(Language.FR, "Titre P8"); put(Language.EN, "P8 Title"); }}, Tools.titleColor[8]);
	
	public final int index;
	public Map<Language, String> lang = new HashMap<Language, String>();
	public final Color color;
	 
    private Quality(int index, Map<Language, String> lang, Color color) {
        this.index = index;
        this.lang = lang;
        this.color = color;
    }

	@Override
	public String getInfo(Language lang) {
		return this.lang.get(lang);
	}

	@Override
	public String getTooltip() {
		return "";
	}

	@Override
	public Color getColor() {
		return this.color;
	}
}
