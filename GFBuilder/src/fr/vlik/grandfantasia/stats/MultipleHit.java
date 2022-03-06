package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;

public class MultipleHit implements Calculable {
	
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
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.secondValue > 0) {
			tooltip.append(this.effect.abbrevFR + " : " + this.value + "% du dégât double, " + this.secondValue + "% du dégât triple");
		} else if(this.value > 0) {
			tooltip.append(this.effect.abbrevFR + " : " + this.value + "% du dégât");
		} else {
			tooltip.append(this.effect.abbrevFR + " dégâts");
		}
		
		return "<li>" + tooltip + "</li>";
	}
	
	public String toString(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.secondValue > 0) {
				result += this.effect.fr + " : " + this.value + "% du dégât double, " + this.secondValue + "% du dégât triple";
			} else if(this.value > 0) {
				result += this.effect.fr + " : " + this.value + "% du dégât";
			} else {
				result += this.effect.fr + " dégâts";
			}
		} else {
			if(this.secondValue > 0) {
				result += this.effect.en + ": " + this.value + "% of double damage, " + this.secondValue + "% of triple damage";
			} else if(this.value > 0) {
				result += this.effect.en + ": " + this.value + "% of damage";
			} else {
				result += this.effect.en + " damage";
			}
		}
		
		return result;
	}
}
