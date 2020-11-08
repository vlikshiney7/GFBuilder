package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Nucleus implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Nucleus.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Nucleus[][] data = Loader.getNucleus();
	
	private String name;
	private Quality quality;
	private Icon icon;
	private Calculable[] effects;
	
	public Nucleus(String name, Quality quality, String path, Calculable[] effects) {
		this.name = name;
		this.quality = quality;
		this.icon = setIcon(path);
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
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else {
				tab[i] = this.effects[i];
			}
		}
		
		return tab;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Nucleus.class.getResource(Tools.PATH32 + this.quality.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Nucleus.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Nucleus[] getData(ArrayList<String> stoneName) {
		ArrayList<Nucleus> result = new ArrayList<Nucleus>();
		
		Nucleus[] getter = Nucleus.data[6];
		
		for(int i = 0; i < getter.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < stoneName.size(); j++) {
				if(stoneName.get(j).equals(getter[i].getName())) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(getter[i]);
			}
		}
		
		Nucleus[] cast = new Nucleus[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
	
	public static Nucleus get(String name, int list) {
		for(Nucleus nucleus : Nucleus.data[list]) {
			if(nucleus.getName().equals(name)) {
				return nucleus;
			}
		}
		
		return null;
	}
	
	public static Nucleus[] getData(int idList) {
		return Nucleus.data[idList];
	}
}
