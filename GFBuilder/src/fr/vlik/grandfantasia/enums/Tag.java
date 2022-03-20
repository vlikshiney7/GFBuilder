package fr.vlik.grandfantasia.enums;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum Tag implements Filterable, Writable {
	
	BOSS(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "WB/Boss de Guilde"); put(Language.EN, "WB/Guild Boss"); }}),
	CHRONO(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi chrono"); put(Language.EN, "Chrono challenge"); }}),
	DONJON(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Donjon"); put(Language.EN, "Dungeon"); }}),
	EVENT(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évenement"); put(Language.EN, "Event"); }}),
	FORMULE(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Formule"); put(Language.EN, "Formula"); }}),
	GT(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "GT"); put(Language.EN, "TW"); }}),
	GVG(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "GvG"); put(Language.EN, "GvG"); }}),
	MARCHAND(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marchand"); put(Language.EN, "Trader"); }}),
	PVP(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "PvP"); put(Language.EN, "PvP"); }}),
	QUETE(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Quête"); put(Language.EN, "Quest"); }}),
	RANK(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Classement"); put(Language.EN, "Ranking"); }}),
	REINCA(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réincarnation"); put(Language.EN, "Rebirth"); }}),
	REPUTATION(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réputation"); put(Language.EN, "Reputation"); }}),
	SPRITE(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sprite"); put(Language.EN, "Sprite"); }}),
	TAROT(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot"); put(Language.EN, "Tarot"); }}),
	TDB(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "TDB"); put(Language.EN, "VFS"); }}),
	TITLEP8(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Titre P8"); put(Language.EN, "P8 Title"); }}),
	
	OTHER(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Autre"); put(Language.EN, "Other"); }}),
	;
	
	public final Map<Language, String> lang;
	
	private Tag(Map<Language, String> lang) {
        this.lang = lang;
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
}
