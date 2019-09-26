package fr.vlik.grandfantasia;

import java.util.ArrayList;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.equipment.Weapon;

public class RedWeapon extends Weapon {
	
	private ArrayList<ArrayList<Effect>> starEffects = new ArrayList<ArrayList<Effect>>();
	
	public RedWeapon(RedWeapon redWeapon) {
		super(redWeapon);
		
		this.starEffects = redWeapon.getStarEffects();
	}
	
	public RedWeapon(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP, ArrayList<ArrayList<Effect>> starEffects) {
		super(name, grades, lvl, quality, enchantable, type, uniqueEquip, reinca, iconPath, effects, bonusXP);
		
		this.starEffects = starEffects;
	}
	
	public ArrayList<ArrayList<Effect>> getStarEffects() {
		ArrayList<ArrayList<Effect>> list = new ArrayList<ArrayList<Effect>>();
		
		for(int i = 0; i < this.starEffects.size(); i++) {
			list.add(new ArrayList<Effect>());
			for(Effect effect : this.starEffects.get(i)) {
				list.get(i).add(new Effect(effect));
			}
		}
		
		return list;
	}
	
	public ArrayList<Effect> getStarEffects(int nbStar) {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < nbStar; i++) {
			for(Effect effect : this.starEffects.get(i)) {
				list.add(new Effect(effect));
			}
		}
		
		return list;
	}
	
	public void addFortif(double value) {
		double coefFortif = (value - 100) / 100 + 1;
		
		for(Effect effect : this.effects) {
			if(effect.isPercent()) {
				continue;
			}
			
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
				continue;
			}
			
			effect.addFortifValue(coefFortif);
		}
	}
}
