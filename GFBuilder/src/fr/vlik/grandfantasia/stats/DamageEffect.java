package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeDamage;

public class DamageEffect implements Calculable {
	
	private TypeDamage type;
	private int value = -1;
	
	public DamageEffect(TypeDamage type) {
		this.type = type;
	}
	
	public DamageEffect(TypeDamage type, int value) {
		this.type = type;
		this.value = value;
	}
	
	public DamageEffect(DamageEffect damage) {
		this.type = damage.getType();
		this.value = damage.getValue();
	}
	
	public TypeDamage getType() {
		return this.type;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public void multiplyValue(int factor) {
		this.value *= factor;
	}

	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.type == TypeDamage.AOE) {
			tooltip.append(this.type.abbrevFR + " de " + this.value + "m");
		} else {
			if(this.value > 0) {
				tooltip.append(this.value + "pts dégâts " + this.type.abbrevFR);
			} else {
				tooltip.append("Dégâts " + this.type.abbrevFR);
			}
		}
		
		if(this.value > 0) {
			tooltip.append(this.value + "pts dégâts " + this.type.abbrevFR);
		} else {
			tooltip.append("Dégâts " + this.type.abbrevFR);
		}
		
		return "<li>" + tooltip + "</li>";
	}

	@Override
	public String toString(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.type == TypeDamage.AOE) {
				result += this.type.fr + " de " + this.value + " mètres";
			} else {
				if(this.value > 0) {
					result += this.value + "pts dégâts " + this.type.fr;
				} else {
					result += "Dégâts " + this.type.fr;
				}
			}
		} else {
			if(this.type == TypeDamage.AOE) {
				result += this.type.en + " of " + this.value + " meters";
			} else {
				if(this.value > 0) {
					result += this.value + "pts of " + this.type.en + " damages";
				} else {
					result += this.type.en + " damages";
				}
			}
		}
		
		return result;
	}
}
