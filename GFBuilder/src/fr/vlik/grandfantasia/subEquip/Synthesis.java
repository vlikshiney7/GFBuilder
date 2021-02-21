package fr.vlik.grandfantasia.subEquip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.ColorBuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class Synthesis extends ColorBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME_RIDE = new HashMap<Language, String>() {{
		put(Language.FR, "Monture enchantée");
		put(Language.EN, "Ride enchantment");
	}};
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME_THRONE = new HashMap<Language, String>() {{
		put(Language.FR, "Trône enchanté");
		put(Language.EN, "Throne enchantment");
	}};
	
	private String serie;
	private TypeSynthesis typeSynthesis;
	private int star;
	
	private static Map<Quality, Synthesis[]> dataRide = LoaderSubEquip.getRideSynthesis();
	private static Map<Quality, Synthesis[]> dataThrone = LoaderSubEquip.getThroneSynthesis();
	
	
	public Synthesis(Map<Language, String> name, String serie, TypeSynthesis typeSynthesis, Quality quality, int star, Calculable[] effects) {
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
		if(tabSynthesis != null) {
			for(Synthesis synthesis : tabSynthesis) {
				if(synthesis.getSerie().equals(serie)) {
					return synthesis;
				}
			}
		}
		
		return tabSynthesis == null ? null : tabSynthesis[0];
	}
	
	public static Synthesis[] getPossibleRide(TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		ArrayList<Synthesis> result = new ArrayList<Synthesis>();
		
		for(Synthesis synthesis : Synthesis.dataRide.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star) {
				result.add(synthesis);
			}
		}
		
		return result.toArray(new Synthesis[result.size()]);
	}
	
	public static Synthesis[] getPossibleThrone(TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		ArrayList<Synthesis> result = new ArrayList<Synthesis>();
		
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
}
