package fr.vlik.grandfantasia.equipable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Fortification;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Armor extends Equipment {
	
	public static String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static Armor[][] data = Loader.getArmor();
	
	private ArmorType type;
	private String setCode;
	private boolean reinca;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Armor() {
		super();
		
		this.type = ArmorType.NONE;
		this.setCode = "-1";
		this.reinca = false;
		this.isMultiEffect = false;
		this.icon = setIcon("null");
	}
	
	public Armor(Armor armor) {
		super(armor.getMap(), armor.getGrades(), armor.getLvl(), armor.getQuality(), armor.isEnchantable(), armor.getEffects(), armor.getBonusXP());
		
		this.type = armor.getType();
		this.setCode = armor.getSetCode();
		this.reinca = armor.isReinca();
		this.isMultiEffect = armor.isMultiEffect();
		this.multiEffects = armor.getMultiEffect();
		this.icon = armor.getIcon();
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, MultiEffect effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, null, bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public static enum ArmorType {
		CASQUE(0, "casque", "helmet"),
		PLASTRON(1, "plastron", "breastplate"),
		JAMBIERE(2, "jambière", "legging"),
		GANT(3, "gantelet", "gauntlet"),
		BOTTE(4, "botte", "boot"),
		NONE(-1, "vide", "void");
		
		public final int index;
		public final String fr;
		public final String en;
		 
	    private ArmorType(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public ArmorType getType() {
		return this.type;
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public MultiEffect getMultiEffect() {
		return this.isMultiEffect ? new MultiEffect(this.multiEffects.getCode(), this.multiEffects.getLvlMin(), this.multiEffects.getEffects()) : null;
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public Calculable[] getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Weapon.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(Weapon.class.getResource(PATH + path + Tools.PNG));
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

	public void addFortif(Fortification fortif) {
		if(this.effects == null) {
			return;
		}
		
		for(Calculable calculable : this.effects) {
			if(calculable instanceof Effect) {
				Effect effect = (Effect) calculable;
				
				if(effect.isPercent()) {
					continue;
				}
				
				if(!effect.getWithReinca()) {
					continue;
				}
				
				if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
					continue;
				}
				
				effect.addFortifValue(fortif.getCoef());
			}
		}
	}
	
	public static Armor get(String name, Language lang, int list) {
		for(Armor armor : Armor.data[list]) {
			if(armor.getName(lang).equals(name)) {
				return armor;
			}
		}
		
		return null;
	}
	
	public static Armor[] getPossibleArmor(int idList, Grade grade, int lvl, Reinca reinca) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		
		result.add(new Armor());
		
		for(Armor armor : Armor.data[idList]) {
			if(armor.getLvl() <= lvl && armor.containGrade(grade.getGrade())) {
				if(!armor.isReinca()) {
					if(armor.isMultiEffect()) {
						armor.setEffects(lvl);
					}
					result.add(armor);
				} else {
					if(reinca.getLvl() > 0) {
						if(armor.isMultiEffect()) {
							armor.setEffects(lvl);
						}
						result.add(armor);
					}
				}
			}
		}
		
		Armor[] cast = new Armor[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
