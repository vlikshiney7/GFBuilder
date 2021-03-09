package fr.vlik.grandfantasia.characUpgrade;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Stone extends CompleteBuff {
	
	private static Stone[] data = LoaderCharacUpgrade.getStone();
	
	public Stone(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, quality, path, effects);
	}
	
	public static Stone[] getData(ArrayList<String> stoneName) {
		ArrayList<Stone> result = new ArrayList<Stone>();
		
		for(int i = 0; i < Stone.data.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < stoneName.size(); j++) {
				if(stoneName.get(j).equals(Stone.data[i].getName(Language.FR))) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(Stone.data[i]);
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
