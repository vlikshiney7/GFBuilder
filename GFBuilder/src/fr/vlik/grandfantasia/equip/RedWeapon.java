package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;

public class RedWeapon extends Weapon {
	
	private Calculable[][] starEffects;
	
	public RedWeapon(RedWeapon redWeapon) {
		super(redWeapon);
		this.starEffects = redWeapon.getStarEffects();
	}
	
	public RedWeapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String iconPath, Calculable[] effects, Calculable[] bonusXP, Calculable[][] starEffects) {
		super(name, grades, lvl, quality, enchantable, type, uniqueEquip, reinca, iconPath, effects, bonusXP);
		this.starEffects = starEffects;
	}
	
	public Calculable[][] getStarEffects() {
		if(this.starEffects == null) {
			return null;
		}
		
		Calculable[][] list = new Calculable[this.starEffects.length][];
		
		for(int i = 0; i < this.starEffects.length; i++) {
			list[i] = Tools.getEffects(this.starEffects[i]);
		}
		
		return list;
	}
	
	public Calculable[] getStarEffects(int nbStar) {
		if(this.starEffects == null) {
			return null;
		}
		
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		for(int i = 0; i < nbStar; i++) {
			Calculable[] tab = Tools.getEffects(this.starEffects[i]);
			
			if(tab != null) {
				for(Calculable c : tab) {
					list.add(c);
				}
			}
		}
		
		return list.toArray(new Calculable[list.size()]);
	}
	
	public void addFortif(double value) {
		if(this.effects != null) {
			double coefFortif = (value - 100) / 100 + 1;
			modifyAttack(coefFortif);
		}
	}
}
