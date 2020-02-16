package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.stats.Effect;

public class Bague implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Bague.class.getSimpleName().toLowerCase() + "/";
	private static Bague[] data;
	static {
		Bague.data = Loader.getBague();
	}
	
	private final Map<Language, String> name;
	private final Quality quality;
	private final Icon icon;
	private final ArrayList<Effect> effects;
	
	public Bague(Map<Language, String> name, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.icon = setIcon(path);
		this.effects = effects;
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Bague.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Bague.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Bague[] getData() {
		return Bague.data;
	}
	
	public static Bague get(String name, Language lang) {
		for(Bague bague : Bague.data) {
			if(bague.getName(lang).equals(name)) {
				return bague;
			}
		}
		
		return null;
	}
}
