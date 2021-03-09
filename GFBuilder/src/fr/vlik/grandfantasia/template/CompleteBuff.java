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
	
	private static final String PATH = Tools.RESOURCE + CompleteBuff.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	
	protected Quality quality;
	
	public CompleteBuff() {
		super();
		this.quality = Quality.GREY;
	}

	public CompleteBuff(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, effects);
		this.quality = quality;
		this.icon = setIcon(path);
	}
	
	public CompleteBuff(Map<Language, String> name, Quality quality, Calculable[] effects) {
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
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(CompleteBuff.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
}
