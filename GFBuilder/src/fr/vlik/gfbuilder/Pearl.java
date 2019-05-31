package fr.vlik.gfbuilder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Pearl {

	private String name;
	private int quality;
	private boolean isPurpulOnly;
	private boolean isCumulable;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Pearl(String name, int quality, boolean isPurpleOnly, boolean isCumulable, String path, String[] effects) {
		this.name = name;
		this.isPurpulOnly = isPurpleOnly;
		this.isCumulable = isCumulable;
		this.quality = quality;
		this.img = setIcon(path, this.quality);
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return this.name;
	}
	
	public int getQuality() {
		return this.quality;
	}

	public boolean isPurpulOnly() {
		return this.isPurpulOnly;
	}
	
	public boolean isCumulable() {
		return this.isCumulable;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
	}
	
	private BufferedImage setIcon(String path, int quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/16-" + quality + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/pearls/" + path));
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
}
