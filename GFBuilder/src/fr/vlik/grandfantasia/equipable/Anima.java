package fr.vlik.grandfantasia.equipable;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Anima implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Anima.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Anima[] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private Icon icon;
	private boolean isMultiEffect;
	private Calculable[] effects;
	private MultiEffect multiEffects;
	
	public Anima(String name, Quality quality, String path, Calculable[] effects) {
		this.name = name;
		this.quality = quality;
		this.isMultiEffect = false;
		this.effects = effects;
		this.icon = setIcon(path);
	}
	
	public Anima(String name, Quality quality, String path, MultiEffect effects) {
		this.name = name;
		this.quality = quality;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.effects[i];
		}
		
		return tab;
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public Calculable[] getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Anima.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Anima.class.getResource(PATH + path + Tools.PNG));
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
		for(Calculable e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<Anima> list = new ArrayList<Anima>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Anima.class.getResourceAsStream(PATH + "anima.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1];
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
				
				if(Integer.parseInt(lineSplit[2]) > -1) {
					Calculable[] effects = new Calculable[Integer.parseInt(lineSplit[2])];
					for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++) {
						effects[j] = new Effect(lineSplit[j+3]);
					}
					
					list.add(new Anima(lineSplit[0], quality, path, effects));
				} else {
					MultiEffect effects = MultiEffect.getFromCode(lineSplit[3]);
					
					list.add(new Anima(lineSplit[0], quality, path, effects));
				}
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Anima.class.getClass().getSimpleName() + " class");
		}
		
		Anima.data = new Anima[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Anima[] getData(int lvl) {
		for(int i = 0; i < Anima.data.length; i++) {
			if(Anima.data[i].isMultiEffect()) {
				Anima.data[i].setEffects(lvl);
			}
		}
		
		return Anima.data;
	}
	
	public static Anima get(String name) {
		for(Anima anima : Anima.data) {
			if(anima.getName().equals(name)) {
				return anima;
			}
		}
		
		return null;
	}
}
