package fr.vlik.grandfantasia.equipable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public final class Ring extends Equipment {
	
	public static String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Ring[] data = Loader.getRing();
	
	private String setCode;
	private boolean uniqueEquip;
	
	public Ring() {
		super();
		
		this.setCode = "-1";
		this.uniqueEquip = false;
		this.icon = setIcon("null");
	}
	
	public Ring(Ring ring) {
		super(ring.getMap(), new GradeName[] { GradeName.NONE }, ring.getLvl(), ring.getQuality(), ring.isEnchantable(), ring.getEffects(), ring.getBonusXP());
		
		this.setCode = ring.getSetCode();
		this.uniqueEquip = ring.isUniqueEquip();
		this.icon = ring.getIcon();
	}
	
	public Ring(Map<Language, String> name, int lvl, Quality quality, boolean enchantable, String setCode, boolean uniqueEquip, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, new GradeName[] { GradeName.NONE } , lvl, quality, enchantable, effects, bonusXP);
		
		this.setCode = setCode;
		this.uniqueEquip = uniqueEquip;
		this.icon = setIcon(path);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isUniqueEquip() {
		return this.uniqueEquip;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Ring.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Ring.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) {
			return;
		}
		
		if(!this.enchantable) {
			return;
		}
		
		if(enchant.isFixValue()) {
			Calculable[] newTab = new Calculable[this.effects.length + enchant.getEffects().size()];
			
			for(int i = 0; i < this.effects.length; i++) {
				newTab[i] = this.effects[i];
			}
			
			for(int i = 0; i < enchant.getEffects().size(); i++) {
				newTab[this.effects.length + i] = enchant.getEffects().get(i);
			}
			
			this.effects = newTab;
		} else {
			for(Effect e : enchant.getEffects()) {
				int value = Enchantment.getValue(this, e.getType());
				boolean found = false;
				
				for(Calculable calculable : this.effects) {
					if(calculable instanceof Effect) {
						Effect get = (Effect) calculable;
							
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(value);
							
							found = true;
							break;
						}
					}
				}
				
				if(!found) {
					e.addEnchantValue(value);
					
					Calculable[] newTab = new Calculable[this.effects.length + 1];
					
					for(int i = 0; i < this.effects.length; i++) {
						newTab[i] = this.effects[i];
					}
					
					newTab[this.effects.length] = e;
					
					this.effects = newTab;
				}
			}
		}
	}
	
	public static Ring get(String name, Language lang) {
		for(Ring ring : Ring.data) {
			if(ring.getName(lang).equals(name)) {
				return ring;
			}
		}
		
		return null;
	}
	
	public static Ring[] getPossibleRing(int lvl, Ring toIgnore) {
		ArrayList<Ring> result = new ArrayList<Ring>();
		
		result.add(new Ring());
		
		for(Ring ring : Ring.data) {
			if(ring.getLvl() <= lvl) {
				result.add(ring);
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		Ring[] cast = new Ring[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
