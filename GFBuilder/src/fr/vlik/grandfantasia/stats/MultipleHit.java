package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;

public class MultipleHit extends Calculable {
	
	private TypeMultipleHit effect;
	private int value = -1;
	private int secondValue = -1;
	
	public MultipleHit(TypeMultipleHit effect) {
		this.effect = effect;
	}
	
	public MultipleHit(TypeMultipleHit effect, int value) {
		this.effect = effect;
		this.value = value;
	}
	
	public MultipleHit(TypeMultipleHit effect, int value, int secondValue) {
		this.effect = effect;
		this.value = value;
		this.secondValue = secondValue;
	}
	
	public MultipleHit(MultipleHit multiple) {
		this.effect = multiple.getEffect();
		this.value = multiple.getValue();
		this.secondValue = multiple.getSecondValue();
	}
	
	public Calculable copy() {
		return new MultipleHit(this);
	}
	
	public TypeMultipleHit getEffect() {
		return this.effect;
	}

	public int getValue() {
		return this.value;
	}

	public int getSecondValue() {
		return this.secondValue;
	}
	
	public void multiplyValue(int factor) {}
	
	public String getName(Language lang) {
		return this.effect.getShortInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.effect.getShortInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.secondValue > 0) {
				result += this.effect.getShortInfo(lang) + " : " + this.value + "% du dégât double, " + this.secondValue + "% du dégât triple";
			} else if(this.value > 0) {
				result += this.effect.getShortInfo(lang) + " : " + this.value + "% du dégât";
			} else {
				result += this.effect.getShortInfo(lang) + " dégâts";
			}
		} else {
			if(this.secondValue > 0) {
				result += this.effect.getShortInfo(lang) + ": " + this.value + "% of double damage, " + this.secondValue + "% of triple damage";
			} else if(this.value > 0) {
				result += this.effect.getShortInfo(lang) + ": " + this.value + "% of damage";
			} else {
				result += this.effect.getShortInfo(lang) + " damage";
			}
		}
		
		return result;
	}
}
