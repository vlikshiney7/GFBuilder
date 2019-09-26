package fr.vlik.grandfantasia;
import java.util.ArrayList;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.equipment.Armor;

public class RedArmor extends Armor {
	
	private ArrayList<ArrayList<Effect>> starEffects = new ArrayList<ArrayList<Effect>>();
	
	public RedArmor(RedArmor redArmor) {
		super(redArmor);
		
		this.starEffects = redArmor.getStarEffects();
	}
	
	public RedArmor(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, String setCode, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP, ArrayList<ArrayList<Effect>> starEffects) {
		super(name, grades, lvl, quality, enchantable, reinca, setCode, iconPath, effects, bonusXP);
		
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
