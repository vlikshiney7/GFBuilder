package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Bague implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Bague.class.getSimpleName().toLowerCase() + "/";
	private static Bague[] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Bague(String name, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		setIcon(path);
		this.effects = effects;
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
	public void setIcon(String path) {
		ImageIcon back = new ImageIcon(Bague.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Bague.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = Tools.constructIcon(back, object);
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
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
	
	public static void loadData() {
		ArrayList<Bague> list = new ArrayList<Bague>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Bague.class.getResourceAsStream(PATH + "bague.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
					effects.add(new Effect(lineSplit[j+3]));
				
				list.add(new Bague(lineSplit[0], quality, path, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Bague.class.getClass().getSimpleName() + " class");
		}
		
		Bague.data = new Bague[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Bague[] getData() {
		return Bague.data;
	}
}
