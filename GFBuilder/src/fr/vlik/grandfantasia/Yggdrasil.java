package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class Yggdrasil implements Writable, Iconable {
	
	public static String PATH = Tools.RESOURCE + Yggdrasil.class.getSimpleName().toLowerCase() + "/";
	private static Yggdrasil[] data;
	static {
		loadData();
	}

	private String name;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Yggdrasil(String name, String path, String[] effects) {
		this.name = name;
		setIcon(path);
		
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
	
	@Override
	public Icon getIcon() {
		return this.icon;
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
	
	@Override
	public void setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Yggdrasil.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	public static void loadData() {
		ArrayList<Yggdrasil> list = new ArrayList<Yggdrasil>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Yggdrasil.class.getResourceAsStream(PATH + "yggdrasil.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				String[] effects = new String[Integer.parseInt(lineSplit[1])];
				for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+2];
				
				list.add(new Yggdrasil(lineSplit[0], path, effects));
				
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
