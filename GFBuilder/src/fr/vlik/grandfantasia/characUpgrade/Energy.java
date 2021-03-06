package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.template.IconBuff;

public class Energy extends IconBuff {
	
	private static Energy[] data = LoaderCharacUpgrade.getEnergy();
	
	public Energy(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, path, effects);
	}
	
	public static Calculable multiplyEffect(Calculable effect, int point) {
		Calculable copy = null;
		
		if(effect instanceof Effect) {
			copy = new Effect((Effect) effect);
			copy.multiplyValue(point);
		} else if(effect instanceof Proc) {
			copy = new Proc((Proc) effect);
			copy.multiplyValue(point);
		}
		
		return copy;
	}
	
	public static Energy[] getData() {
		return Energy.data;
	}
}
