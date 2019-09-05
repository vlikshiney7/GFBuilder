package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;

public class Runway {
	
	public static final int[][] currentRunway = { {6, 7}, {4, 9}, {0, 3}, {1, 5}, {10, 8, 2} };
	
	public static Runway[] data;
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Runway(String name, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<strong>- " + this.name + "</strong>");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return tooltip.toString();
	}
	
	public static void loadData() {
		ArrayList<Runway> list = new ArrayList<Runway>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/runway.txt")));
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				list.add(new Runway(lineSplit[0], effects));
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Class.class.getName() + " class");
		}
		
		Runway.data = new Runway[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static String getTooltipRunway(int[] idRunway) {
		StringBuilder tooltip = new StringBuilder("<strong>Bonus :</strong>");
		
		for(int i = 0; i < idRunway.length; i++) {
			tooltip.append("<br>");
			tooltip.append(Runway.data[idRunway[i]].getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Runway[] getData() {
		return Runway.data;
	}
}
