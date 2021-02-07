package fr.vlik.grandfantasia;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;

public class Yggdrasil extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
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
		for(Yggdrasil yggdrasil : Yggdrasil.data) {
			if(yggdrasil.getName(lang).equals(name)) {
				return yggdrasil;
			}
		}
		
		return null;
	}
}
