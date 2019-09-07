package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Quality;

public class Bague {
	
	private static Bague[] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Bague(String name, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.img = setIcon(path);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality.index];
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/32-" + this.quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/bague/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
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
		ArrayList<Bague> list = new ArrayList<Bague>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/bague/bague.txt")));
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
			reader.close();
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
