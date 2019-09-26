package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.Grade.GradeName;

public class Title {

	private static Title[] data;
	static {
		loadData();
	}
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private Quality quality;
	private int lvl;
	private GradeName grade;
	
	public Title(String name, Quality quality, int lvl, GradeName grade, String[] effects) {
		this.name = name;
		this.lvl = lvl;
		this.quality = quality;
		this.grade = grade;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}

	public Quality getQuality() {
		return this.quality;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public GradeName getGrade() {
		return this.grade;
	}
	
	public Color getColor() {
		return Consts.titleColor[this.quality.index];
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<Title> list = new ArrayList<Title>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Title.class.getResourceAsStream(Consts.RESOURCE + "title.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] effects = new String[Integer.parseInt(lineSplit[4])];
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
				GradeName grade;
				try {
					grade = GradeName.values()[Integer.parseInt(lineSplit[3])];
				} catch (ArrayIndexOutOfBoundsException e) {
					grade = GradeName.NONE;
				}
				
				for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];
				
				list.add(new Title(lineSplit[0], quality, Integer.parseInt(lineSplit[2]), grade, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Title.class.getClass().getSimpleName() + " class");
		}
		
		Title.data = new Title[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Title[] getPossibleData(GradeName grade, int lvl, boolean reinca) {
		ArrayList<Title> result = new ArrayList<Title>();
		
		if(reinca) {
			lvl += 100;
			for(int i = 0; i < Title.data.length; i++) {
				if(Title.data[i].getLvl() <= lvl
						&& (Title.data[i].getGrade() == GradeName.NONE || Title.data[i].getGrade() == grade)) {
					
					result.add(Title.data[i]);
				}
			}
		} else {
			for(int i = 0; i < Title.data.length; i++) {
				if(Title.data[i].getQuality() == Quality.RED) {
					continue;
				}
				
				if(Title.data[i].getGrade() == GradeName.NONE
						|| Title.data[i].getGrade() == grade) {
					
					if(Title.data[i].getLvl() <= lvl) {
						result.add(Title.data[i]);
					} else if(Title.data[i].getLvl() > 100
							&& Title.data[i].getLvl()-100 <= lvl)
						
						result.add(Title.data[i]);
				}
			}
		}
		
		Title[] cast = new Title[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
