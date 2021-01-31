package fr.vlik.grandfantasia.subEquip;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Effect;

public class Synthesis implements Colorable, Writable {
	
	private String name;
	private String serie;
	private TypeSynthesis typeSynthesis;
	private Quality quality;
	private int star;
	private Effect[] effects;
	
	private static Map<Quality, Synthesis[]> dataRide = LoaderSubEquip.getRideSynthesis();
	private static Map<Quality, Synthesis[]> dataThrone = LoaderSubEquip.getThroneSynthesis();
	
	
	public Synthesis(String name, String serie, TypeSynthesis typeSynthesis, Quality quality, int star, Effect[] effects) {
		this.name = name;
		this.serie = serie;
		this.typeSynthesis = typeSynthesis;
		this.quality = quality;
		this.star = star;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSerie() {
		return this.serie;
	}
	
	public TypeSynthesis getSynthesis() {
		return this.typeSynthesis;
	}

	public Quality getQuality() {
		return this.quality;
	}

	public int getStar() {
		return this.star;
	}
	
	public Effect[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Effect[] tab = new Effect[this.effects.length];
		
		for(int i = 0; i < this.effects.length; i++) {
			tab[i] = new Effect(this.effects[i]);
		}
		
		return tab;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Synthesis getRide(String name, TypeSynthesis typeSynthesis, Quality quality, int star) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		for(Synthesis synthesis : Synthesis.dataRide.get(quality)) {
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star && synthesis.getName().equals(name)) {
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
			if(synthesis.getSynthesis() == typeSynthesis && synthesis.getStar() == star && synthesis.getName().equals(name)) {
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
		
		Synthesis[] cast = new Synthesis[result.size()];
		cast = result.toArray(cast);
		
		return cast;
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
		
		Synthesis[] cast = new Synthesis[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
