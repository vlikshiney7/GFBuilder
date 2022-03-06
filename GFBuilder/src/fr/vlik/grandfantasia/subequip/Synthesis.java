package fr.vlik.grandfantasia.subequip;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Synthesis extends ColorBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME_RIDE = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Monture enchantée");
		put(Language.EN, "Ride enchantment");
	}};
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME_THRONE = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Trône enchanté");
		put(Language.EN, "Throne enchantment");
	}};
	
	private String serie;
	private TypeSynthesis typeSynthesis;
	private int star;
	
	private static Map<Quality, Synthesis[]> dataRide = LoaderSubEquip.getRideSynthesis();
	private static Map<Quality, Synthesis[]> dataThrone = LoaderSubEquip.getThroneSynthesis();
	
	
	public Synthesis(Map<Language, String> name, String serie, TypeSynthesis typeSynthesis, Quality quality, int star, Calculable[] effects) {
		super(name, quality, effects);
		this.serie = serie;
		this.typeSynthesis = typeSynthesis;
		this.star = star;
	}
	
	public String getSerie() {
		return this.serie;
	}
	
	public TypeSynthesis getSynthesis() {
		return this.typeSynthesis;
	}
	
	public int getStar() {
		return this.star;
	}
	
	public static Synthesis getRide(String name, TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		for(Synthesis synthesis : Synthesis.dataRide.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star && synthesis.getName(Language.FR).equals(name)) {
				return synthesis;
			}
		}
		
		return null;
	}
	
	public static Synthesis getThrone(String name, TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		for(Synthesis synthesis : Synthesis.dataThrone.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star && synthesis.getName(Language.FR).equals(name)) {
				return synthesis;
			}
		}
		
		return null;
	}
	
	public static Synthesis getFromList(String serie, Synthesis[] tabSynthesis) {
		if(tabSynthesis == null || tabSynthesis.length == 0) {
			return null;
		}
		
		for(Synthesis synthesis : tabSynthesis) {
			if(synthesis.getSerie().equals(serie)) {
				return synthesis;
			}
		}
		
		return tabSynthesis[0];
	}
	
	public static Synthesis[] getPossibleRide(TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return new Synthesis[0];
		}
		
		ArrayList<Synthesis> result = new ArrayList<>();
		
		for(Synthesis synthesis : Synthesis.dataRide.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star) {
				result.add(synthesis);
			}
		}
		
		return result.toArray(new Synthesis[result.size()]);
	}
	
	public static Synthesis[] getPossibleThrone(TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return new Synthesis[0];
		}
		
		ArrayList<Synthesis> result = new ArrayList<>();
		
		for(Synthesis synthesis : Synthesis.dataThrone.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star) {
				result.add(synthesis);
			}
		}
		
		return result.toArray(new Synthesis[result.size()]);
	}
	
	public static boolean getAvailableThrone(int lvl, TypeSynthesis type) {
		return (type == TypeSynthesis.CLASSIC && lvl >= 15) || (type == TypeSynthesis.GENKI && lvl >= 40);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.serie == null) ? 0 : this.serie.hashCode());
		result = prime * result + this.star;
		result = prime * result + ((this.typeSynthesis == null) ? 0 : typeSynthesis.hashCode());
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
		Synthesis other = (Synthesis) obj;
		if (this.serie == null) {
			if (other.serie != null) {
				return false;
			}
		} else if (!this.serie.equals(other.serie)) {
			return false;
		}
		if (this.star != other.star) {
			return false;
		}
		return this.typeSynthesis == other.typeSynthesis;
	}
}
