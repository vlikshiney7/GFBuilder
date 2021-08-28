package fr.vlik.grandfantasia.characUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Stone extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Pierre permanente");
		put(Language.EN, "Permanent stone");
	}};
	
	private static Stone[] data = LoaderCharacUpgrade.getStone();
	
	public Stone(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, quality, path, effects);
	}
	
	public static Stone[] getListStone(ArrayList<Stone> stone) {
		ArrayList<Stone> result = new ArrayList<Stone>();
		
		for(Stone data : Stone.data) {
			boolean add = true;
			
			for(int j = 0; j < stone.size(); j++) {
				if(data.equals(stone.get(j))) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(data);
			}
		}
		
		return result.toArray(new Stone[result.size()]);
	}
	
	public static Stone get(String name) {
		for(Stone stone : Stone.data) {
			if(stone.getName(Language.FR).equals(name)) {
				return stone;
			}
		}
		
		return null;
	}
	
	public static Stone[] getData() {
		return Stone.data;
	}
}
