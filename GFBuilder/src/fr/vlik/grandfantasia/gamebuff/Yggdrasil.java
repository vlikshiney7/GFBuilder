package fr.vlik.grandfantasia.gamebuff;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class Yggdrasil extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Yggdrasil");
		put(Language.EN, "Yggdrasil");
	}};
	
	private static Yggdrasil[] data = Loader.getYggdrasil();
	
	public Yggdrasil(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, effects);
		this.icon = setIcon(path);
	}
	
	public static Yggdrasil[] getData() {
		return Yggdrasil.data;
	}
	
	public static Yggdrasil get(String name, Language lang) {
		return get(Yggdrasil.data, name, lang);
	}
}
