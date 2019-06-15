package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Armor extends Equipment {
	
	private String setCode;
	
	public Armor(Armor armor) {
		super(armor.getName(), armor.getIdClasses(), armor.getLvl(), armor.getQuality(), armor.getCanEnchant(), armor.getEffects(), armor.getBonusXP());
		
		this.setCode = armor.getSetCode();
		this.img = armor.getIcon();
	}
	
	public Armor(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, String setCode, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/armors/" + path));
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
	
	public void addEnchant(Enchantment enchant, int idArmor) {
		if(enchant == null) return;
		for(Effect e : enchant.getEffects()) {
			int ordinal = e.getType().ordinal();
			if(ordinal < 5) {
				int doubleValue = idArmor == 1 || idArmor == 2 ? 2 : 1;
				if(this.getQuality() == 6) {
					
				} else if(this.getQuality() == 5) {
					boolean found = false;
					for(Effect get : this.effects) {
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(((this.getLvl()-1)/10 +1) * doubleValue);
							found = true;
							break;
						}
					}
					if(!found) {
						e.addEnchantValue(((this.getLvl()-1)/10 +1) * doubleValue);
						this.effects.add(e);
					}
				} else if(this.getQuality() == 4) {
					
				}
			} else if(ordinal == 19) {
				
			} else if(ordinal == 59) {
				
			} else {
				this.effects.add(e);
			}
		}
	}

	public void addFortif(int value) {
		double coefFortif = Consts.coefFortif[value];
		
		for(Effect effect : this.effects) {
			if(effect.isPercent()) continue;
			if(!effect.getWithReinca()) continue;
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) continue;
			effect.addFortifValue(coefFortif);
		}
	}
}
