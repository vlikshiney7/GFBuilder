package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Speciality {
	
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/speciality/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
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
		return new Effect(effect.getType(), effect.isPercent(), effect.getValue() * point, effect.getWithReinca(), effect.getWithWeapon());
	}
}
