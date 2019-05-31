package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Blason {
	
	private String name;
	private int lvl;
	private boolean isAggressive;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Blason() {
		this.name = "Rien";
		this.lvl = 0;
		this.isAggressive = false;
		this.img = setIcon("32-7.png");
	}
	
	public Blason(String name, int lvl, boolean isAggressive, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		this.isAggressive = isAggressive;
		this.img = setIcon(isAggressive ? "atk.png" : "def.png");
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public boolean isAggressive() {
		return this.isAggressive;
	}
	
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
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/sprites/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
}
