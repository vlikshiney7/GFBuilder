package fr.vlik.gfbuilder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Anima {
	
	private String name;
	private int quality;
	private BufferedImage img;
	private boolean isMultiEffect;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private MultiEffect multiEffects;
	
	public Anima(String name, int quality, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.img = setIcon(path);
		this.isMultiEffect = false;
		this.effects = effects;
	}
	
	public Anima(String name, int quality, String path, MultiEffect effects) {
		this.name = name;
		this.quality = quality;
		this.img = setIcon(path);
		this.isMultiEffect = true;
		this.multiEffects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getQuality() {
		return this.quality;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
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
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/32-" + this.quality + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/anima/" + path));
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
