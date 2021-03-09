package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class LoveBuff extends IconBuff {
	
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
