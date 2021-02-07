package fr.vlik.grandfantasia;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;

public class IslandBuff extends Buff {
	
	private static IslandBuff[] data = Loader.getIslandBuff();
	
	
	public IslandBuff(Map<Language, String> name, Calculable[] effects) {
		super(name, effects);
	}
	
	public static IslandBuff[] getData() {
		return IslandBuff.data;
	}
	
	public static IslandBuff get(String name) {
		for(IslandBuff island : IslandBuff.data) {
			if(island.getName(Language.FR).equals(name)) {
				return island;
			}
		}
		
		return null;
	}
}
