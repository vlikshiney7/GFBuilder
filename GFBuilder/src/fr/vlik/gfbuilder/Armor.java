package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Armor extends Equipment {
	
	private String setCode;

	public Armor(Armor armor) {
		super(armor.getName(), armor.getIdClasses(), armor.getLvl(), armor.getQuality(), armor.getCanEnchant(), armor.getEffects());
		
		this.setCode = armor.getSetCode();
		this.img = armor.getIcon();
	}
	
	public Armor(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, String setCode, String iconPath, ArrayList<Effect> effects) {
		super(name, idClasses, lvl, quality, canEnchant, effects);
		
		this.setCode = setCode;
		this.img = setIcon(iconPath, quality);
	}
	
	public String getSetCode() {
		return this.setCode;
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/armors/" + path));
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
}
