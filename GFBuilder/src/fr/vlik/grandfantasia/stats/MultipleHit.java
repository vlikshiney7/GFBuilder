package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;

public class MultipleHit implements Calculable {
	
	private TypeMultipleHit effect;
	private int damage;
	
	public MultipleHit(TypeMultipleHit effect, int damage) {
		this.effect = effect;
		this.damage = damage;
	}
	
	public TypeMultipleHit getEffect() {
		return this.effect;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	@Override
	public void multiplyValue(int factor) {}

	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		tooltip.append(this.effect.abbrevFR + " : " + this.damage + "% du dégât");
		
		return "<li>" + tooltip + "</li>";
	}

	@Override
	public String toString(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			result += this.effect.fr + " : " + this.damage + "% du dégât";
		} else {
			result += this.effect.en + ": " + this.damage + "% of damage";
		}
		
		return result;
	}
}
