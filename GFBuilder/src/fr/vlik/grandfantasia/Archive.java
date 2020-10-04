package fr.vlik.grandfantasia;

import java.awt.Color;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Effect;

public class Archive implements Colorable, Writable {
	
	private static Archive[] data = Loader.getArchive();
	
	private String name;
	private Quality quality;
	private Effect[] effects;
	
	public Archive(String name, Quality quality, Effect[] effects) {
		this.name = name;
		this.quality = quality;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
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
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Effect((Effect) this.effects[i]);
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
	
	public static Archive[] getData() {
		return Archive.data;
	}
	
	public static Archive get(String name) {
		for(Archive archive : Archive.data) {
			if(archive.getName().equals(name)) {
				return archive;
			}
		}
		
		return null;
	}
}
