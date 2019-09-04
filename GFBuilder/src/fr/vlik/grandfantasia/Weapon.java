package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Weapon extends Equipment {
	
	private int type;
	private boolean isUnique;
	private boolean forReinca;
	
	public Weapon() {
		super("Rien", new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11 }, 0, 0, false, new ArrayList<Effect>(), new ArrayList<Effect>());
		
		this.type = -1;
		this.isUnique = false;
		this.forReinca = false;
		this.img = setIcon("null.png", 0);
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getName(), weapon.getIdClasses(), weapon.getLvl(), weapon.getQuality(), weapon.getCanEnchant(), weapon.getEffects(), weapon.getBonusXP());
		
		this.type = weapon.getType();
		this.isUnique = weapon.getIsUnique();
		this.forReinca = weapon.getForReinca();
		this.img = weapon.getIcon();
		this.effects = weapon.getEffects();
	}
	
	public Weapon(String name, int[] idClasses, int lvl, int quality, boolean canEnchant, int type, boolean isUnique, boolean forReinca, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, idClasses, lvl, quality, canEnchant, effects, bonusXP);
		
		this.type = type;
		this.isUnique = isUnique;
		this.forReinca = forReinca;
		this.img = setIcon(iconPath, quality);
	}
	
	public int getType() {
		return this.type;
	}
	
	public boolean getIsUnique() {
		return this.isUnique;
	}
	
	public boolean getForReinca() {
		return this.forReinca;
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
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) return;
		for(Effect e : enchant.getEffects()) {
			int ordinal = e.getType().ordinal();
			if(ordinal < 5) {
				if(this.getQuality() == 6) {
					boolean found = false;
					for(Effect get : this.effects) {
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							if(this.type == 3 || this.type == 4 || this.type == 5 || this.type == 7 || this.type == 12 || this.type == 13) {								
								get.addEnchantValue(this.getLvl() / 5 * 2 + 3);
							} else {
								get.addEnchantValue(this.getLvl() / 5 + 1);
							}
							found = true;
							break;
						}
					}
					if(!found) {
						if(this.type == 3 || this.type == 4 || this.type == 5 || this.type == 7 || this.type == 12 || this.type == 13) {								
							e.addEnchantValue(this.getLvl() / 5 * 2 + 3);
						} else {
							e.addEnchantValue(this.getLvl() / 5 + 1);
						}
						this.effects.add(e);
					}
				} else if(this.getQuality() == 5) {
					boolean found = false;
					for(Effect get : this.effects) {
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							if(this.type == 3 || this.type == 4 || this.type == 5 || this.type == 7 || this.type == 12 || this.type == 13) {								
								get.addEnchantValue(this.getLvl() / 5 * 2 + 1);
							} else {
								get.addEnchantValue(this.getLvl() / 5 + 1);
							}
							found = true;
							break;
						}
					}
					if(!found) {
						if(this.type == 3 || this.type == 4 || this.type == 5 || this.type == 7 || this.type == 12 || this.type == 13) {								
							e.addEnchantValue(this.getLvl() / 5 * 2 + 1);
						} else {
							e.addEnchantValue(this.getLvl() / 5 + 1);
						}
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
