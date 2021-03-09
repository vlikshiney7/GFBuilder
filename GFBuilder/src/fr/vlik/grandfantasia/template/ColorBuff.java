package fr.vlik.grandfantasia.template;

import java.awt.Color;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.stats.Calculable;

public class ColorBuff extends Buff implements Colorable {
	
	protected Quality quality;
	
	public ColorBuff() {
		super();
		this.quality = Quality.GREY;
	}
	
	public ColorBuff(Map<Language, String> name, Quality quality, Calculable[] effects) {
		super(name, effects);
		this.quality = quality;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
}
