package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Bullet {
	
	public static String PATH = Consts.RESOURCE + Bullet.class.getSimpleName().toLowerCase() + "/";
	private static Bullet[] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private Quality quality;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Bullet(String name, int lvl, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		this.quality = quality;
		this.img = setIcon(path);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
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
			back = ImageIO.read(Bullet.class.getResource(Consts.PATH32 + this.quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(Bullet.class.getResource(PATH + path));
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
		ArrayList<Bullet> list = new ArrayList<Bullet>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Bullet.class.getResourceAsStream(PATH + "bullet.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[2])];
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[3]));
				for(int i = 0; i < Integer.parseInt(lineSplit[3]); i++)
					effects.add(new Effect(lineSplit[i+4]));
				
				Bullet bullet = new Bullet(lineSplit[0], Integer.parseInt(lineSplit[1]), quality, path, effects);
				list.add(bullet);
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Bullet.class.getClass().getSimpleName() + " class");
		}
		
		Bullet.data = new Bullet[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Bullet[] getPossibleBullet(int lvl) {
		ArrayList<Bullet> result = new ArrayList<Bullet>();
		
		for(Bullet bullet : Bullet.data) {
			if(bullet.getLvl() <= lvl) result.add(bullet);
		}
		
		Bullet[] cast = new Bullet[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
