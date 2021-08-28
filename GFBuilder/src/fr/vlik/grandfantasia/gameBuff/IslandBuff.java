package fr.vlik.grandfantasia.gameBuff;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;

public class IslandBuff extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Divination Île des Sprites");
		put(Language.EN, "Isle Sprite Divination");
	}};
	
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
