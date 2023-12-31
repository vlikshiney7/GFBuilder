package fr.vlik.grandfantasia.characupgrade;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Stone extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Pierre permanente");
		put(Language.EN, "Permanent stone");
	}};
	
	private static Stone[] data = LoaderCharacUpgrade.getStone();
	
	public Stone(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, quality, path, effects);
	}
	
	public static Stone[] getListStone(List<Stone> stones) {
		List<Stone> result = new ArrayList<>();
		
		for(Stone data : Stone.data) {
			boolean add = true;
			
			for(Stone stone : stones) {
				if(data.equals(stone)) {
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
		return get(Stone.data, name, Language.FR);
	}
	
	public static Stone[] getData() {
		return Stone.data;
	}
}
