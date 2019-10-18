package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Bullet implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Bullet.class.getSimpleName().toLowerCase() + "/";
	private static Bullet[] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private Quality quality;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Bullet(String name, int lvl, Quality quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		this.quality = quality;
		setIcon(path);
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
	
	@Override
	public Icon getIcon() {
		return this.icon;
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
	public void setIcon(String path) {
		ImageIcon back = new ImageIcon(Bullet.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Bullet.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
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
