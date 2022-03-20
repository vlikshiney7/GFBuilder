package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;

public class StaticEffect implements Calculable {
	
	private TypeStaticEffect type;
	private int taux = -1;
	private Target target = Target.SELF;
	
	public StaticEffect(TypeStaticEffect type) {
		this.type = type;
	}
	
	public StaticEffect(TypeStaticEffect type, int taux) {
		this.type = type;
		this.taux = taux;
	}
	
	public StaticEffect(TypeStaticEffect type, Target target) {
		this(type);
		this.target = target;
	}
	
	public StaticEffect(TypeStaticEffect type, int taux, Target target) {
		this(type, taux);
		this.target = target;
	}
	
	public StaticEffect(StaticEffect staticEffect) {
		this.type = staticEffect.getType();
		this.taux = staticEffect.getTaux();
	}
	
	public Calculable copy() {
		return new StaticEffect(this);
	}
	
	public TypeStaticEffect getType() {
		return this.type;
	}
	
	public int getTaux() {
		return this.taux;
	}
	
	public Target getTarget() {
		return this.target;
	}
	
	public void multiplyValue(int factor) {
		this.taux *= factor;
	}
	
	public String getName(Language lang) {
		return this.type.getShortInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.type.getShortInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(this.taux == -1) {
			if(this.target == Target.OPPONENT) {
				if(lang == Language.FR) {
					result += "Ennemi : ";
				} else {
					result += "Opponent: ";
				}
			}
			
			result += this.type.getShortInfo(lang);
		} else {
			if(lang == Language.FR) {
				result += this.taux + "% de " + this.type.getShortInfo(lang);
			} else {
				result += this.taux + "% of " + this.type.getShortInfo(lang);
			}
		}
		
		return result;
	}
}
