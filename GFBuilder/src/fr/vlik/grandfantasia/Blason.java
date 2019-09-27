package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class Blason implements Iconable, Writable {
	
	public static String PATH = Consts.RESOURCE + "sprite/";
	private static Blason[] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private BlasonType type;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Blason() {
		this.name = "Rien";
		this.lvl = 0;
		this.type = BlasonType.OFFENSIVE;
		this.img = setIcon("32-7.png");
	}
	
	public Blason(String name, int lvl, BlasonType type, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		this.type = type;
		this.img = setIcon(type == BlasonType.OFFENSIVE ? "atk.png" : "def.png");
		this.effects = effects;
	}
	
	public static enum BlasonType {
		OFFENSIVE(0), DEFENSIVE(1);
		
		public final int type;
		 
	    private BlasonType(int type) {
	        this.type = type;
	    }
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public BlasonType getType() {
		return this.type;
	}
	
	@Override
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	@Override
	public BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(Blason.class.getResource(PATH + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
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
		ArrayList<Blason> list = new ArrayList<Blason>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Blason.class.getResourceAsStream(PATH + "blasons.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				BlasonType type = BlasonType.values()[Integer.parseInt(lineSplit[2])];
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[3]));
				for(int j = 0; j < Integer.parseInt(lineSplit[3]); j++)
					effects.add(new Effect(lineSplit[j+4]));
				
				list.add(new Blason(lineSplit[0], Integer.parseInt(lineSplit[1]), type, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Blason.class.getClass().getSimpleName() + " class");
		}
		
		Blason.data = new Blason[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Blason[] getPossibleBlason(int lvl, BlasonType type) {
		ArrayList<Blason> result = new ArrayList<Blason>();
		
		result.add(new Blason());
		
		for(Blason blason : Blason.data) {
			if(blason.getLvl() <= lvl && blason.getType() == type) {
				result.add(blason);
			}
		}
		
		Blason[] cast = new Blason[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
