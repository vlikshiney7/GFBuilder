package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Effect;

public class Archive implements Colorable, Writable {
	
	private static Archive[] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Archive(String name, Quality quality, ArrayList<Effect> effects) {
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
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
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
		ArrayList<Archive> list = new ArrayList<Archive>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Archive.class.getResourceAsStream(Tools.RESOURCE + "archive.txt"), "UTF-8"));				
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
					effects.add(new Effect(lineSplit[j+3]));
				
				list.add(new Archive(lineSplit[0], quality, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Archive.class.getClass().getSimpleName() + " class");
		}
		
		Archive.data = new Archive[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
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
