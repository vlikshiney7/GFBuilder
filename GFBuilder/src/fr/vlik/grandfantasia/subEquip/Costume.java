package fr.vlik.grandfantasia.subEquip;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Costume extends ColorBuff {
	
	public static final String PATH = Tools.RESOURCE + Costume.class.getSimpleName().toLowerCase() + "/";
	public static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.GOLD };
	private static Map<Quality, Costume[]> data = LoaderSubEquip.getCostume();
	
	private TypeSynthesis typeSynthesis;
	private CostumeType type;
	
	public Costume(Map<Language, String> name, TypeSynthesis typeSynthesis, CostumeType type, Quality quality, Calculable[] effects) {
		super(name, quality, effects);
		this.typeSynthesis = typeSynthesis;
		this.type = type;
	}
	
	public static enum CostumeType {
		TeteCorps, DosArme1M, Arme2M;
	}
	
	public TypeSynthesis getSynthesis() {
		return this.typeSynthesis;
	}
	
	public CostumeType getType() {
		return this.type;
	}
	
	public static Costume get(String name, TypeSynthesis typeSynthesis, CostumeType type, Quality quality) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		for(Costume costume : Costume.data.get(quality)) {
			if(costume.getSynthesis() == typeSynthesis && costume.getType() == type && costume.getName(Language.FR).equals(name)) {
				return costume;
			}
		}
		
		return null;
	}
	
	public static Costume getFromList(String name, Costume[] tabCost) {
		if(tabCost != null) {
			for(Costume costume : tabCost) {
				if(costume.getName(Language.FR).equals(name)) {
					return costume;
				}
			}
		}
		
		return tabCost == null ? null : tabCost[0];
	}
	
	public static Costume[] getPossibleCostume(TypeSynthesis synhtesis, CostumeType type, Quality quality) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		ArrayList<Costume> result = new ArrayList<Costume>();
		
		for(Costume cost : Costume.data.get(quality)) {
			if(cost.getSynthesis() == synhtesis && cost.getType() == type) {
				result.add(cost);
			}
		}
		
		return result.toArray(new Costume[result.size()]);
	}
}
