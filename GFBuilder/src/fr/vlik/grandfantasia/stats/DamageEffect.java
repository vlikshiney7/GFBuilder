package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeDamage;

public class DamageEffect extends Calculable {
	
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
	
	public Calculable copy() {
		return new DamageEffect(this);
	}
	
	public TypeDamage getType() {
		return this.type;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void multiplyValue(int factor) {
		this.value *= factor;
	}
	
	public String getName(Language lang) {
		return this.type.getShortInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.type.getShortInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.type == TypeDamage.AOE) {
				result += this.type.getShortInfo(lang) + " de " + this.value + " mètres";
			} else {
				if(this.value > 0) {
					result += this.value + "points de dégâts " + this.type.getShortInfo(lang);
				} else {
					result += "Dégâts " + this.type.getShortInfo(lang);
				}
			}
		} else {
			if(this.type == TypeDamage.AOE) {
				result += this.type.getShortInfo(lang) + " of " + this.value + " meters";
			} else {
				if(this.value > 0) {
					result += this.value + "points of " + this.type.getShortInfo(lang) + " damages";
				} else {
					result += this.type.getShortInfo(lang) + " damages";
				}
			}
		}
		
		return result;
	}
}
