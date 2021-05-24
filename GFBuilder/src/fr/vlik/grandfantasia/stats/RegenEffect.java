package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;

public class RegenEffect implements Calculable {
	
	private TypeEffect effect;
	private boolean isPercent;
	private double fixValue = 0;
	private int rangeMin = 0;
	private int rangeMax = 0;
	private int periodicity = 0;
	private TypeRegen type;
	private Target target = Target.SELF;
	
	
	public RegenEffect(TypeEffect effect, boolean isPercent, double fixValue, TypeRegen type) {
		this.effect = effect;
		this.isPercent = isPercent;
		this.fixValue = fixValue;
		this.type = type;
		
		if(type == TypeRegen.POISON) {
			this.target = Target.OPPONENT;
		}
	}
	
	public RegenEffect(TypeEffect effect, boolean isPercent, int rangeMin, int rangeMax, TypeRegen type) {
		this.effect = effect;
		this.isPercent = isPercent;
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		this.type = type;
		
		if(type == TypeRegen.POISON) {
			this.target = Target.OPPONENT;
		}
	}
	
	public RegenEffect(TypeEffect effect, boolean isPercent, double fixValue, TypeRegen type, int periodicity) {
		this(effect, isPercent, fixValue, type);
		this.periodicity = periodicity;
	}
	
	public RegenEffect(TypeEffect effect, boolean isPercent, int rangeMin, int rangeMax, TypeRegen type, int periodicity) {
		this(effect, isPercent, rangeMin, rangeMax, type);
		this.periodicity = periodicity;
	}
	
	public RegenEffect(RegenEffect regenEffect) {
		this.effect = regenEffect.getEffect();
		this.isPercent = regenEffect.isPercent();
		this.fixValue = regenEffect.getFixValue();
		this.rangeMin = regenEffect.getRangeMin();
		this.rangeMax = regenEffect.getRangeMax();
		this.type = regenEffect.getType();
	}
	
	public static enum TypeRegen {
		REGENERATION("Régénération", "Recover"),
		ABSORPTION("Absorption", "absorbing"),
		POISON("Poison", "poison");
		
		public final String fr;
		public final String en;
		 
	    private TypeRegen(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public TypeEffect getEffect() {
		return this.effect;
	}
	
	public boolean isPercent() {
		return this.isPercent;
	}
	
	public double getFixValue() {
		return this.fixValue;
	}
	
	public int getRangeMin() {
		return this.rangeMin;
	}
	
	public int getRangeMax() {
		return this.rangeMax;
	}
	
	public TypeRegen getType() {
		return this.type;
	}
	
	public int getPeriodicity() {
		return this.periodicity;
	}
	
	public Target getTarget() {
		return this.target;
	}
	
	@Override
	public void multiplyValue(int factor) {
		this.fixValue *= factor;
		this.rangeMin *= factor;
		this.rangeMax *= factor;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.type == TypeRegen.ABSORPTION) {
			tooltip.append("Absorbe ");
		} else if(this.type == TypeRegen.REGENERATION) {
			tooltip.append("+");
		} else if(this.target == Target.OPPONENT) {
			tooltip.append("Enn : ");
		}
		
		if(this.fixValue != 0) {
			tooltip.append(this.fixValue);
			
			if(isPercent) {
				tooltip.append("%");
			}
		} else {
			tooltip.append(this.rangeMin + " à " + this.rangeMax);
			
			if(isPercent) {
				tooltip.append("%");
			}
		}
		
		tooltip.append(" " + this.effect.abbrevFR);
		
		if(this.periodicity == 1) {
			tooltip.append(" / s");
		} else if(this.periodicity > 1) {
			tooltip.append(" / " + this.periodicity + "s");
		}
		
		return "<li>" + tooltip + "</li>";
	}
	
	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.target == Target.OPPONENT) {
				result.append("Ennemi : ");
			}
			
			result.append(this.type.fr + " de ");
			
			if(this.fixValue != 0) {
				result.append(this.fixValue);
				
				if(isPercent) {
					result.append("%");
				}
			} else {
				result.append(this.rangeMin + " to " + this.rangeMax);
				
				if(isPercent) {
					result.append("%");
				}
			}
			
			result.append(" " + this.effect.abbrevFR);
			
			if(this.periodicity == 1) {
				result.append(" par seconde");
			} else if(this.periodicity > 1) {
				result.append(" chaque " + this.periodicity + " secondes");
			}
			
			if(this.type == TypeRegen.ABSORPTION || this.type == TypeRegen.POISON) {
				result.append(" à l'ennemi");
			}
		} else {
			if(this.target == Target.OPPONENT) {
				result.append("Opponent: ");
			}
			
			if(this.type == TypeRegen.REGENERATION) {
				result.append(this.type.en + " of ");
			}
			
			if(this.fixValue != 0) {
				result.append(this.fixValue);
				
				if(isPercent) {
					result.append("%");
				}
			} else {
				result.append(this.rangeMin + "-" + this.rangeMax);
				
				if(isPercent) {
					result.append("%");
				}
			}
			
			if(this.type == TypeRegen.ABSORPTION || this.type == TypeRegen.POISON) {
				result.append(" of opponent's ");
			}
			
			result.append(" " + this.effect.abbrevEN);
			
			if(this.periodicity == 1) {
				result.append(" per second");
			} else if(this.periodicity > 1) {
				result.append(" per " + this.periodicity + " seconds");
			}
			
			if(this.type == TypeRegen.ABSORPTION) {
				result.append(" " + this.type.en);
			}
		}
		
		return result.toString();
	}
}
