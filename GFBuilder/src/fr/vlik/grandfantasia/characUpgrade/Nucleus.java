package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import fr.vlik.grandfantasia.CompleteBuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;

public class Nucleus extends CompleteBuff {
	
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
