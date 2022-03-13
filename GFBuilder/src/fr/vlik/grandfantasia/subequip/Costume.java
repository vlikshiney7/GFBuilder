package fr.vlik.grandfantasia.subequip;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Costume extends ColorBuff {
	
	public static final String PATH = Tools.RESOURCE + Costume.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	public static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.GOLD };
	private static Map<Quality, Costume[]> data = LoaderSubEquip.getCostume();
	
	private TypeSynthesis typeSynthesis;
	private CostumeType type;
	
	public Costume(Map<Language, String> name, TypeSynthesis typeSynthesis, CostumeType type, Quality quality, Calculable[] effects) {
		super(name, quality, effects);
		this.typeSynthesis = typeSynthesis;
		this.type = type;
	}
	
	public enum CostumeType {
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
			return new Costume[0];
		}
		
		ArrayList<Costume> result = new ArrayList<>();
		
		for(Costume cost : Costume.data.get(quality)) {
			if(cost.getSynthesis() == synhtesis && cost.getType() == type) {
				result.add(cost);
			}
		}
		
		return result.toArray(new Costume[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.type == null) ? 0 : type.hashCode());
		result = prime * result + ((this.typeSynthesis == null) ? 0 : this.typeSynthesis.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Costume other = (Costume) obj;
		if (this.type != other.type) {
			return false;
		}
		return this.typeSynthesis == other.typeSynthesis;
	}
}
