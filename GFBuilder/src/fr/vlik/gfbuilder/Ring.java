package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Ring extends Equipment {

	private String setCode;
	private boolean isUnique;
	
	public Ring(Ring ring) {
		super(ring.getName(), ring.getIdClasses(), ring.getLvl(), ring.getQuality(), ring.getCanEnchant(), ring.getEffects(), ring.getBonusXP());
		
		this.setCode = ring.getSetCode();
		this.isUnique = ring.getIsUnique();
		this.img = ring.getIcon();
	}
	
	public Ring(String name, int lvl, int quality, boolean canEnchant, String setCode, boolean isUnique, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, new int[] { -1 } , lvl, quality, canEnchant, effects, bonusXP);
		
		this.setCode = setCode;
		this.isUnique = isUnique;
		this.img = setIcon(iconPath, quality);
	}
	
	public String getSetCode() {
		return this.setCode;
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/capering/ring/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) return;
		for(Effect e : enchant.getEffects()) {
			int ordinal = e.getType().ordinal();
			if(ordinal < 5) {
				if(this.getQuality() == 5) {
					boolean found = false;
					for(Effect get : this.effects) {
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue((this.getLvl()-1)/10 +1);
							found = true;
							break;
						}
					}
					if(!found) {
						e.addEnchantValue((this.getLvl()-1)/10 +1);
						this.effects.add(e);
					}
				}
			} else {
				this.effects.add(e);
			}
		}
	}
}
