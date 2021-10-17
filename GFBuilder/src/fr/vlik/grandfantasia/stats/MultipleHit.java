package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;

public class MultipleHit implements Calculable {
	
	private TypeMultipleHit effect;
	private int value;
	private int secondValue = -1;
	
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
	
	public TypeMultipleHit getEffect() {
		return this.effect;
	}

	public int getValue() {
		return this.value;
	}

	public int getSecondValue() {
		return this.secondValue;
	}
	
	@Override
	public void multiplyValue(int factor) {}

	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.secondValue > 0) {
			tooltip.append(this.effect.abbrevFR + " : " + this.value + "% du dégât double, " + this.secondValue + "% du dégât triple");
		} else {
			tooltip.append(this.effect.abbrevFR + " : " + this.value + "% du dégât");
		}
		
		return "<li>" + tooltip + "</li>";
	}

	@Override
	public String toString(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.secondValue > 0) {
				result += this.effect.fr + " : " + this.value + "% du dégât double, " + this.secondValue + "% du dégât triple";
			} else {
				result += this.effect.fr + " : " + this.value + "% du dégât";
			}
		} else {
			if(this.secondValue > 0) {
				result += this.effect.en + ": " + this.value + "% of double damage, " + this.secondValue + "% of triple damage";
			} else {
				result += this.effect.fr + ": " + this.value + "% of damage";
			}
		}
		
		return result;
	}
}
