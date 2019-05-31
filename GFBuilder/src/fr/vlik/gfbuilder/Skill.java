package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Skill {
	
	private String name;
	private int[] lvl;
	private boolean natif;
	private BufferedImage img;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public Skill(String name, int[] lvl, boolean natif, String iconPath, ArrayList<ArrayList<Effect>> effects) {
		this.name = name;
		this.lvl = lvl;
		this.natif = natif;
		this.img = setIcon(iconPath);
		this.effects = effects;
	}
	
	public Skill(String name) {
		this.name = name;
		this.lvl = new int[] { 0 };
		this.natif = false;
		this.img = setIcon("32-7.png");
		this.effects.add(new ArrayList<Effect>(1));
	}
	
	public Skill(Skill skill, int index) {
		this.name = skill.getName() + " " + (index+1);
		this.lvl = new int[] { skill.getLvl()[index] };
		this.natif = skill.getNatif();
		this.img = skill.getIcon();
		this.effects.add(skill.getEffects(index));
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public boolean getNatif() {
		return this.natif;
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/skill/" + path));
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
