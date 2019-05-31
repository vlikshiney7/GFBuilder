package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Talent {
	
	private String name;
	private int[] lvl;
	private BufferedImage img;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public Talent() {
		this.name = "";
		this.lvl =  new int[] { 0 };
		this.img = setIcon("null.png");
		this.effects.add(new ArrayList<Effect>());
	}
	
	public Talent(String name, int[] lvl, String iconPath, ArrayList<ArrayList<Effect>> effects) {
		this.name = name;
		this.lvl = lvl;
		this.img = setIcon(iconPath);
		this.effects = effects;
	}
	
	public Talent(Talent talent, int index) {
		this.name = talent.getName();
		this.lvl = new int[] { talent.getLvl()[index] };
		this.effects.add(talent.getEffects(index));
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public ArrayList<Effect> getEffects(int i) {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.get(i).size());
		for(Effect effect : this.effects.get(i)) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/talent/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public String getTooltip(int i) {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects.get(i)) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
}
