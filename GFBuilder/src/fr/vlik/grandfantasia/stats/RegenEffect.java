package fr.vlik.grandfantasia.stats;

import java.util.EnumMap;
import java.util.Map;

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
	
	public Calculable copy() {
		return new RegenEffect(this);
	}
	
	public enum TypeRegen {
		REGENERATION("Régénération", "Recover"),
		ABSORPTION("Absorption", "absorbing"),
		POISON("Poison", "poison");
		
		public final Map<Language, String> regen;
		 
	    @SuppressWarnings("serial")
		private TypeRegen(String fr, String en) {
	    	this.regen = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, fr); put(Language.EN, en); }};
	    }
	    
	    public String getName(Language lang) {
			if(this.regen == null) {
				return "";
			} else if(this.regen.get(lang) == null || this.regen.get(lang).equals("")) {
				return this.regen.get(Language.FR);
			}
			
			return this.regen.get(lang);
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
	
	public void multiplyValue(int factor) {
		this.fixValue *= factor;
		this.rangeMin *= factor;
		this.rangeMax *= factor;
	}
	
	public String getName(Language lang) {
		return this.effect.getSelectorInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.effect.getSelectorInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.target == Target.OPPONENT) {
				result += "Ennemi : ";
			}
			
			result += this.type.getName(lang) + " de ";
			
			if(this.fixValue != 0) {
				result += this.fixValue;
				
				if(this.isPercent) {
					result += "%";
				}
			} else {
				result += this.rangeMin + "-" + this.rangeMax;
				
				if(this.isPercent) {
					result += "%";
				}
			}
			
			result += " " + this.effect.getSelectorInfo(lang);
			
			if(this.periodicity == 1) {
				result += " par seconde";
			} else if(this.periodicity > 1) {
				result += " chaque " + this.periodicity + " secondes";
			}
			
			if(this.type == TypeRegen.ABSORPTION || this.type == TypeRegen.POISON) {
				result += " à l'ennemi";
			}
		} else {
			if(this.target == Target.OPPONENT) {
				result += "Opponent: ";
			}
			
			if(this.type == TypeRegen.REGENERATION) {
				result += this.type.getName(lang) + " of ";
			}
			
			if(this.fixValue != 0) {
				result += this.fixValue;
				
				if(this.isPercent) {
					result += "%";
				}
			} else {
				result += this.rangeMin + "-" + this.rangeMax;
				
				if(this.isPercent) {
					result += "%";
				}
			}
			
			if(this.type == TypeRegen.ABSORPTION || this.type == TypeRegen.POISON) {
				result += " of opponent's ";
			}
			
			result += " " + this.effect.getSelectorInfo(lang);
			
			if(this.periodicity == 1) {
				result += " per second";
			} else if(this.periodicity > 1) {
				result += " per " + this.periodicity + " seconds";
			}
			
			if(this.type == TypeRegen.ABSORPTION) {
				result += " " + this.type.getName(lang);
			}
		}
		
		return result;
	}
}
