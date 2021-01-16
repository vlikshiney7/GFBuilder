package fr.vlik.grandfantasia.enums;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.interfaces.Writable;

@SuppressWarnings("serial")
public enum Tag implements Filtrable, Writable {
	
	BOSS(new HashMap<Language, String>() {{ put(Language.FR, "WB/Boss de Guilde"); put(Language.EN, "WB/Guild Boss"); }}),
	CHRONO(new HashMap<Language, String>() {{ put(Language.FR, "Défi chrono"); put(Language.EN, "Chrono challenge"); }}),
	DONJON(new HashMap<Language, String>() {{ put(Language.FR, "Donjon"); put(Language.EN, "Dungeon"); }}),
	EVENT(new HashMap<Language, String>() {{ put(Language.FR, "Évenement"); put(Language.EN, "Event"); }}),
	FORMULE(new HashMap<Language, String>() {{ put(Language.FR, "Formule"); put(Language.EN, "Formula"); }}),
	GT(new HashMap<Language, String>() {{ put(Language.FR, "GT"); put(Language.EN, "TW"); }}),
	GVG(new HashMap<Language, String>() {{ put(Language.FR, "GvG"); put(Language.EN, "GvG"); }}),
	PVP(new HashMap<Language, String>() {{ put(Language.FR, "PvP"); put(Language.EN, "PvP"); }}),
	QUETE(new HashMap<Language, String>() {{ put(Language.FR, "Quête"); put(Language.EN, "Quest"); }}),
	RANK(new HashMap<Language, String>() {{ put(Language.FR, "Classement"); put(Language.EN, "Ranking"); }}),
	REINCA(new HashMap<Language, String>() {{ put(Language.FR, "Réincarnation"); put(Language.EN, "Rebirth"); }}),
	REPUTATION(new HashMap<Language, String>() {{ put(Language.FR, "Réputation"); put(Language.EN, "Reputation"); }}),
	SPRITE(new HashMap<Language, String>() {{ put(Language.FR, "Sprite"); put(Language.EN, "Sprite"); }}),
	TAROT(new HashMap<Language, String>() {{ put(Language.FR, "Tarot"); put(Language.EN, "Tarot"); }}),
	TDB(new HashMap<Language, String>() {{ put(Language.FR, "TDB"); put(Language.EN, "VFS"); }}),
	TITLEP8(new HashMap<Language, String>() {{ put(Language.FR, "Titre P8"); put(Language.EN, "P8 Title"); }}),
	
	OTHER(new HashMap<Language, String>() {{ put(Language.FR, "Autre"); put(Language.EN, "Other"); }}),
	;
	
	public Map<Language, String> lang = new HashMap<Language, String>();
	
	private Tag(Map<Language, String> lang) {
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
