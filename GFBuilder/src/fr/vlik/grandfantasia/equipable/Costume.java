package fr.vlik.grandfantasia.equipable;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Synthesis;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Effect;

public class Costume implements Colorable, Writable {
	
	public static final String PATH = Tools.RESOURCE + Costume.class.getSimpleName().toLowerCase() + "/";
	public static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.GOLD };
	private static Map<Quality, Costume[]> data = Loader.getCostume();
	
	private String name;
	private Synthesis synthesis;
	private CostumeType type;
	private Quality quality;
	private Effect[] effects;
	
	public Costume(String name, Synthesis synhtesis, CostumeType type, Quality quality, Effect[] effects) {
		this.name = name;
		this.synthesis = synhtesis;
		this.type = type;
		this.quality = quality;
		this.effects = effects;
	}
	
	public static enum CostumeType {
		TeteCorps, DosArme1M, Arme2M;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Synthesis getSynthesis() {
		return this.synthesis;
	}
	
	public CostumeType getType() {
		return this.type;
	}

	public Quality getQuality() {
		return this.quality;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
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
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		if(this.effects != null) {
			for(Effect e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		return "<html>" + tooltip + "</html>";
	}
	
	public static Costume get(String name, Synthesis synthesis, CostumeType type, Quality quality) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		for(Costume costume : Costume.data.get(quality)) {
			if(costume.getSynthesis() == synthesis && costume.getType() == type && costume.getName().equals(name)) {
				return costume;
			}
		}
		
		return null;
	}
	
	public static Costume getFromList(String name, Costume[] tabCost) {
		if(tabCost != null) {
			for(Costume costume : tabCost) {
				if(costume.getName().equals(name)) {
					return costume;
				}
			}
		}
		
		return tabCost == null ? null : tabCost[0];
	}
	
	public static Costume[] getPossibleCostume(Synthesis synhtesis, CostumeType type, Quality quality) {
		if(quality == Quality.GREY) {
			return null;
		}
		
		ArrayList<Costume> result = new ArrayList<Costume>();
		
		for(Costume cost : Costume.data.get(quality)) {
			if(cost.getSynthesis() == synhtesis && cost.getType() == type) {
				result.add(cost);
			}
		}
		
		Costume[] cast = new Costume[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
