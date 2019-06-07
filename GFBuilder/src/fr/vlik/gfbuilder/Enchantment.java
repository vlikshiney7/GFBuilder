package fr.vlik.gfbuilder;

import java.util.ArrayList;

public class Enchantment {
	
	public static final int[] EpMaHaMe45 = { 24, 25, 26, 27, 28, 8, 9, 10, 11, 14, 15, 21, 29 };
	public static final int[] ArcGunCanCle45 = { 24, 25, 26, 27, 28, 8, 9, 10, 11, 15, 22, 29 };
	public static final int[] Baton45 = { 24, 25, 26, 27, 28, 8, 9, 12, 13, 14, 15, 19, 29 };
	public static final int[] Lame45 = { 24, 25, 26, 27, 28, 8, 9, 12, 13, 14, 15, 17, 19, 29 };
	public static final int[] Rel45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 7, 12, 13, 16, 20 };
	public static final int[] Bou45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 15, 18, 19, 30 };
	
	public static final int[] EpMaHaMe6 = { 24, 25, 26, 27, 28, 29 };
	public static final int[] ArcGunCanCle6 = { 24, 25, 26, 27, 28, 29 };
	public static final int[] Baton6 = { 24, 25, 26, 27, 28, 14, 29 };
	public static final int[] Lame6 = { 24, 25, 26, 27, 28, 29 };
	public static final int[] Rel6 = { 24, 25, 26, 27, 28 };
	public static final int[] Bou6 = { 24, 25, 26, 27, 28 };
	
	public static final int[] Armor45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 6, 7, 17, 18, 19, 20 };
	public static final int[] Armor6 = { 24, 25, 26, 27, 28, 6 };
	
	public static final int[] CapeRing = { 24, 25, 26, 27, 28 };
	
	private String name;
	private boolean isFix;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Enchantment() {
		this.name = "";
	}
	
	public Enchantment(String name, boolean isFix, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isFix() {
		return this.isFix;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
}
