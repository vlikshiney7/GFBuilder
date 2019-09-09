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

public class Anima {
	
	private static Anima[] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private BufferedImage img;
	private boolean isMultiEffect;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private MultiEffect multiEffects;
	
	public Anima(String name, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.img = setIcon(path);
		this.isMultiEffect = false;
		this.effects = effects;
	}
	
	public Anima(String name, Quality quality, String path, MultiEffect effects) {
		this.name = name;
		this.quality = quality;
		this.img = setIcon(path);
		this.isMultiEffect = true;
		this.multiEffects = effects;
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
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
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
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public ArrayList<Effect> getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/anima/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
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
		ArrayList<Anima> list = new ArrayList<Anima>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/anima/anima.txt"), "UTF-8"));
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
				
				if(Integer.parseInt(lineSplit[2]) > -1) {
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
					for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
						effects.add(new Effect(lineSplit[j+3]));
					
					list.add(new Anima(lineSplit[0], quality, path, effects));
				} else {
					MultiEffect effects = MultiEffect.getFromCode(lineSplit[3]);
					
					list.add(new Anima(lineSplit[0], quality, path, effects));
				}
				
				line = reader.readLine();
			}
			reader.close();
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
}
