package fr.vlik.gfbuilder;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Equipment {

	private String name;
	private int idClasses[];
	private int lvl;
	private int quality;
	private boolean canEnchant;
	protected BufferedImage img;
	protected ArrayList<Effect> effects = new ArrayList<Effect>();
	protected ArrayList<Effect> bonusXP = new ArrayList<Effect>();
	
	public Equipment() {
		this.name = "Rien";
		this.idClasses = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11 };
		this.lvl = 0;
	}
	
	public Equipment(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		this.name = name;
		this.idClasses = idClasses;
		this.lvl = lvl;
		this.quality = quality;
		this.canEnchant = canEnchant;
		this.effects = effects;
		this.bonusXP = bonusXP;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getIdClasses() {
		return this.idClasses;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public int getQuality() {
		return this.quality;
	}
	
	public boolean getCanEnchant() {
		return this.canEnchant;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
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
	
	public ArrayList<Effect> getBonusXP() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.bonusXP.size());
		for(Effect effect : this.bonusXP) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public boolean containIdClass(int idClass) {
		for(int element : idClasses) {
			if(element == idClass) return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		if (obj instanceof Equipment) {
			Equipment equip = (Equipment) obj;
			b = this.name.equals(equip.name)
			 && this.lvl == equip.lvl;
		}
		return b;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		if(this.bonusXP.size() != 0) {
			tooltip.append("<br><br>");
			tooltip.append("Bonus XP Stuff lvl " + this.lvl);
			for(Effect e : this.bonusXP) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	abstract protected BufferedImage setIcon(String path, int quality);
}
