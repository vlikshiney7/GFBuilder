package fr.vlik.grandfantasia.characupgrade;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class LoveBuff extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "État de la relation");
		put(Language.EN, "Relationship status");
	}};
	
	private static LoveBuff[] data = Loader.getLoveBuff();
	
	public LoveBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, path, effects);
	}
	
	public static LoveBuff[] getData() {
		return LoveBuff.data;
	}
	
	public static LoveBuff get(String name) {
		for(LoveBuff loveBuff : LoveBuff.data) {
			if(loveBuff.getName(Language.FR).equals(name)) {
				return loveBuff;
			}
		}
		
		return null;
	}
}
