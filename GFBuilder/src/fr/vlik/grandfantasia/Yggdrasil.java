package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;

public class Yggdrasil {
	
	private static Yggdrasil[] data;
	static {
		loadData();
	}

	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Yggdrasil(String name, String[] effects) {
		this.name = name;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return name;
	}

	public ArrayList<Effect> getEffects() {
		return effects;
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
		ArrayList<Yggdrasil> list = new ArrayList<Yggdrasil>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/yggdrasil.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] effects = new String[Integer.parseInt(lineSplit[1])];
				for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+2];
				
				list.add(new Yggdrasil(lineSplit[0], effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Yggdrasil.class.getClass().getSimpleName() + " class");
		}
		
		Yggdrasil.data = new Yggdrasil[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Yggdrasil[] getData() {
		return Yggdrasil.data;
	}
}
