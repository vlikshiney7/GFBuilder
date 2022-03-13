package fr.vlik.grandfantasia.template;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class CompleteBuff extends IconBuff implements Colorable {
	
	private static final String PATH = Tools.RESOURCE + CompleteBuff.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	
	protected Quality quality;
	
	protected CompleteBuff() {
		super();
		this.quality = Quality.GREY;
	}

	protected CompleteBuff(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, effects);
		this.quality = quality;
		this.icon = setIcon(path);
	}
	
	protected CompleteBuff(Map<Language, String> name, Quality quality, Calculable[] effects) {
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
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CompleteBuff.class.getResource(Tools.PATH32 + this.quality.index + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(CompleteBuff.class.getResource(PATH + path + Tools.PNG)) );
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.quality == null) ? 0 : this.quality.hashCode());
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
		CompleteBuff other = (CompleteBuff) obj;
		return this.quality == other.quality;
	}
}
