package fr.vlik.grandfantasia.equipable;
import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class RedArmor extends Armor {
	
	private ArrayList<ArrayList<Effect>> starEffects = new ArrayList<ArrayList<Effect>>();
	
	public RedArmor(RedArmor redArmor) {
		super(redArmor);
		
		this.starEffects = redArmor.getStarEffects();
	}
	
	public RedArmor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String iconPath, ArrayList<Calculable> effects, ArrayList<Calculable> bonusXP, ArrayList<ArrayList<Effect>> starEffects) {
		super(name, grades, lvl, quality, enchantable, reinca, type, setCode, iconPath, effects, bonusXP);
		
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
		
		for(Calculable calculable : this.effects) {
			if(calculable instanceof Effect) {
				Effect effect = (Effect) calculable;
				
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
}
