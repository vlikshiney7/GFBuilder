package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Effect;

public class Buff implements Writable {
	
	public static String PATH = Tools.RESOURCE + "sprite/";
	private static Buff[] data;
	static {
		loadData();
	}
	
	protected String name;
	private Effect[] effects;
	
	public Buff(String name, Effect[] effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Effect[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Effect[] tab = new Effect[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Effect(this.effects[i]);
		}
		
		return tab;
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
		ArrayList<Buff> list = new ArrayList<Buff>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Buff.class.getResourceAsStream(PATH + "isle.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				Effect[] effects = new Effect[Integer.parseInt(lineSplit[1])];
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects[j] = new Effect(lineSplit[j+2]);
				
				list.add(new Buff(lineSplit[0], effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Buff.class.getClass().getSimpleName() + " class");
		}
		
		Buff.data = new Buff[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Buff[] getData() {
		return Buff.data;
	}
	
	public static Buff get(String name) {
		for(Buff buff : Buff.data) {
			if(buff.getName().equals(name)) {
				return buff;
			}
		}
		
		return null;
	}
}
