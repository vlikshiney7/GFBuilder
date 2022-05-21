package fr.vlik.grandfantasia.charac;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Archive extends ColorBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Bonus Archive");
		put(Language.EN, "Archive Bonus");
	}};
	
	private static Archive[] data = LoaderCharac.getArchive();
	
	public Archive(Map<Language, String> name, Quality quality, Calculable[] effects) {
		super(name, quality, effects);
	}
	
	public static Archive[] getData() {
		return Archive.data;
	}
	
	public static Archive get(String name) {
		return get(Archive.data, name, Language.FR);
	}
}
