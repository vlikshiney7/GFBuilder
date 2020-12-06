package fr.vlik.grandfantasia.equipable;
import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class RedArmor extends Armor {
	
	private ArrayList<ArrayList<Calculable>> starEffects = new ArrayList<ArrayList<Calculable>>();
	
	public RedArmor(RedArmor redArmor) {
		super(redArmor);
		
		this.starEffects = redArmor.getStarEffects();
	}
	
	public RedArmor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String iconPath, Calculable[] effects, Calculable[] bonusXP, ArrayList<ArrayList<Calculable>> starEffects) {
		super(name, grades, lvl, quality, enchantable, reinca, type, setCode, iconPath, effects, bonusXP);
		
		this.starEffects = starEffects;
	}
	
	public ArrayList<ArrayList<Calculable>> getStarEffects() {
		ArrayList<ArrayList<Calculable>> list = new ArrayList<ArrayList<Calculable>>();
		
		for(int i = 0; i < this.starEffects.size(); i++) {
			list.add(new ArrayList<Calculable>());
			for(Calculable c : this.starEffects.get(i)) {
				if(c instanceof Effect) {
					list.get(i).add(new Effect((Effect)c));
				} else if(c instanceof Proc) {
					list.get(i).add(new Proc((Proc)c));
				} else if(c instanceof StaticEffect) {
					list.get(i).add(new StaticEffect((StaticEffect)c));
				}
			}
		}
		
		return list;
	}
	
	public ArrayList<Calculable> getStarEffects(int nbStar) {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		for(int i = 0; i < nbStar; i++) {
			for(Calculable c : this.starEffects.get(i)) {
				if(c instanceof Effect) {
					list.add(new Effect((Effect)c));
				} else if(c instanceof Proc) {
					list.add(new Proc((Proc)c));
				} else if(c instanceof StaticEffect) {
					list.add(new StaticEffect((StaticEffect)c));
				}
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
