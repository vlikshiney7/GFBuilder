package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Weapon extends Equipment {
	
	private int type;
	private boolean isUnique;
	
	public Weapon() {
		super("Rien", new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11 }, 0, 7, false, new ArrayList<Effect>());
		
		this.type = -1;
		this.isUnique = false;
		this.img = setIcon("null.png", 0);
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getName(), weapon.getIdClasses(), weapon.getLvl(), weapon.getQuality(), weapon.getCanEnchant(), weapon.getEffects());
		
		this.type = weapon.getType();
		this.isUnique = weapon.getIsUnique();
		this.img = weapon.getIcon();
		this.effects = weapon.getEffects();
	}
	
	public Weapon(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, int type, boolean isUnique, String iconPath, ArrayList<Effect> effects) {
		super(name, idClasses, lvl, quality, canEnchant, effects);
		
		this.type = type;
		this.isUnique = isUnique;
		this.img = setIcon(iconPath, quality);
	}
	
	public int getType() {
		return this.type;
	}
	
	public boolean getIsUnique() {
		return this.isUnique;
	}
	
	protected BufferedImage setIcon(String path, int quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/32-" + quality + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/weapons/" + path));
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
	
	public void addFortif(int value) {
		double coefFortif = Consts.coefFortif[value];
		
		for(Effect effect : this.effects) {
			if(effect.isPercent()) continue;
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) continue;
			effect.addFortifValue(coefFortif);
		}
	}
	
	public void doubleWeapon() {
		for(Effect effect : this.effects) {
			if(effect.isPercent()) continue;
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) continue;
			effect.reduceAtkValue();
		}
	}
}
