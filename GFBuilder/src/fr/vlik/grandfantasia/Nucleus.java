package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Nucleus implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Nucleus.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Nucleus[][] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Nucleus(String name, Quality quality, String path, ArrayList<Effect> effects) {
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
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
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
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<Nucleus>> list = new ArrayList<ArrayList<Nucleus>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Nucleus.class.getResourceAsStream(PATH + "nucleus.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while(line != null) {
				int numLine = Integer.parseInt(line);
				ArrayList<Nucleus> array = new ArrayList<Nucleus>(numLine);
				for(int j = 0; j < numLine; j++) {
					line = reader.readLine();
					
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1];
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
					for(int k = 0; k < Integer.parseInt(lineSplit[2]); k++)
						effects.add(new Effect(lineSplit[k+3]));
					
					array.add(new Nucleus(lineSplit[0], quality, path, effects));
				}
				list.add(array);
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Nucleus.class.getClass().getSimpleName() + " class");
		}
		
		Nucleus.data = new Nucleus[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Nucleus[] nucleus = new Nucleus[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				nucleus[j] = list.get(i).get(j);				
			}
			Nucleus.data[i] = nucleus;
		}
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
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
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
