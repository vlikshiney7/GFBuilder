package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Cape extends Equipment {

	private String setCode;
	
	public Cape(Cape cape) {
		super(cape.getName(), cape.getIdClasses(), cape.getLvl(), cape.getQuality(), cape.getCanEnchant(), cape.getEffects(), cape.getBonusXP());
		
		this.setCode = cape.getSetCode();
		this.img = cape.getIcon();
	}
	
	public Cape(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, String setCode, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, idClasses, lvl, quality, canEnchant, effects, bonusXP);
		
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/capering/cape/" + path));
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
							get.addEnchantValue(((this.getLvl()-1)/10 +1) * 2);
							found = true;
							break;
						}
					}
					if(!found) {
						e.addEnchantValue(((this.getLvl()-1)/10 +1) * 2);
						this.effects.add(e);
					}
				}
			} else {
				this.effects.add(e);
			}
		}
	}
}
