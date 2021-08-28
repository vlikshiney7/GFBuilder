package fr.vlik.grandfantasia.characUpgrade;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Nucleus extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Nucléus");
		put(Language.EN, "Nucleus");
	}};
	
	private static Nucleus[][] data = LoaderCharacUpgrade.getNucleus();
	
	public Nucleus(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, quality, path, effects);
	}
	
	public static Nucleus get(String name, int list) {
		for(Nucleus nucleus : Nucleus.data[list]) {
			if(nucleus.getName(Language.FR).equals(name)) {
				return nucleus;
			}
		}
		
		return null;
	}
	
	public static Nucleus[] getData(int idList) {
		return Nucleus.data[idList];
	}
}
