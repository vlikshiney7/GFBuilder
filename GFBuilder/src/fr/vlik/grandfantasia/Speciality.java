package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.grandfantasia.Grade.GradeName;

public class Speciality {
	
	public static String PATH = Consts.RESOURCE + Speciality.class.getSimpleName().toLowerCase() + "/";
	private static Speciality[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	BufferedImage img;
	
	public Speciality(String name, int lvl, String iconPath, String[] effects) {
		this.name = name;
		this.lvl = lvl;
		this.img = setIcon(iconPath);
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return this.name;
	}

	public int getLvl() {
		return this.lvl;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(Speciality.class.getResource(PATH + path));
		} catch (IOException e) {
			System.out.println("Image non chargée : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder(this.getName());
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}

	public static Effect multiplyEffect(Effect effect, int point) {
		return new Effect(effect.getType(), effect.isPercent(), effect.getValue() * point, effect.getWithReinca(), effect.getWithWeapon(), effect.getTransfert());
	}
	
	public static void loadData() {
		ArrayList<ArrayList<Speciality>> list = new ArrayList<ArrayList<Speciality>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Speciality.class.getResourceAsStream(PATH + "speciality.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			for(int i = 0; i < 12; i++) {
				list.add(new ArrayList<Speciality>());
				for(int j = 0; j < 20; j++) {
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1] + ".png";
					String[] effects = new String[Integer.parseInt(lineSplit[2])];
					for(int k = 0; k < effects.length; k++) effects[k] = lineSplit[k+3];
					
					list.get(i).add(new Speciality(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
					
					line = reader.readLine();
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Speciality.class.getClass().getSimpleName() + " class");
		}
		
		Speciality.data = new Speciality[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Speciality[] speciality = new Speciality[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				speciality[j] = list.get(i).get(j);				
			}
			Speciality.data[i] = speciality;
		}
	}
	
	public static Speciality[] getData(GradeName grade) {
		return Speciality.data[grade.index];
	}
}
