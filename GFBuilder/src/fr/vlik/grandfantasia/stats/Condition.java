package fr.vlik.grandfantasia.stats;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;

public class Condition extends Calculable {
	
	private Calculable[] effects;
	private TypeEffect targetEffect;
	private Target target = Target.SELF;
	private TypeCondition specialCondition = null;
	private int percent;
	private int percentMin = 0;
	private int taux;
	private int cumul = 1;
	
	public Condition(TypeEffect targetEffect, int percent, Calculable[] effects) {
		this.targetEffect = targetEffect;
		this.percent = percent;
		this.effects = effects;
	}
	
	public Condition(TypeEffect targetEffect, int[] percent, Calculable[] effects) {
		this.targetEffect = targetEffect;
		this.percent = percent[1];
		this.percentMin = percent[0];
		this.effects = effects;
	}
	
	public Condition(TypeEffect targetEffect, int percent, Target target, Calculable[] effects) {
		this.targetEffect = targetEffect;
		this.percent = percent;
		this.target = target;
		this.effects = effects;
	}
	
	public Condition(TypeEffect targetEffect, int percent, int taux, Calculable[] effects) {
		this.targetEffect = targetEffect;
		this.percent = percent;
		this.taux = taux;
		this.effects = effects;
	}
	
	public Condition(TypeCondition specialCondition, Calculable[] effects) {
		this.specialCondition = specialCondition;
		this.effects = effects;
	}

	public Condition(TypeCondition specialCondition, int cumul, Calculable[] effects) {
		this.specialCondition = specialCondition;
		this.cumul = cumul;
		this.effects = effects;
	}
	
	public Condition(Condition condition) {
		this.targetEffect = condition.getTargetEffect();
		this.specialCondition = condition.getTypeCondition();
		this.percent = condition.getPercent();
		this.taux = condition.getTaux();
		this.cumul = condition.getCumul();
		this.effects = condition.getEffects();
	}
	
	public Calculable copy() {
		return new Condition(this);
	}
	
	public enum TypeCondition {
		STATUT("A chaque statut reçu", "For each receive status"),
		RAYON16("Dans les 16 mètres", "On the 16 meters"),
		RAYON("Autour de soi", "Around you"),
		DEATH("Évite une mort", "Avoid one death"),
		
		AIGLE("Aigle", "Eagle"),
		LOUP("Loup", "Wolf"),
		SINGE("Singe", "Monkey"),
		
		INTER3("3 charges", "3 charges"),
		PREPA("Préparation", "Preparation"),
		
		FIGHT1("Bataille du Royaume Sprite", "Battle of the Sprite Kingdom"),
		FIGHT2("Bal d'hiver du Palais Royal polaire", "Winter Ball at the Polar Royal Palace"),
		
		SANCTU1("Sanctuaire Forêt", "Forest Sanctuary"),
		SANCTU2("Sanctuaire Sable", "Sand Sanctuary"),
		SANCTU3("Sanctuaire Prairie", "Grassland Sanctuary"),
		
		SPRITE("Maître de l'Encyclopédie sprite", "Master of Sprite Encyclopedia"),
		;
		
		public final Map<Language, String> condition;
		 
	    @SuppressWarnings("serial")
		private TypeCondition(String fr, String en) {
	    	this.condition = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, fr); put(Language.EN, en); }};
	    }
	    
	    public String getName(Language lang) {
			if(this.condition == null) {
				return "";
			} else if(this.condition.get(lang) == null || this.condition.get(lang).equals("")) {
				return this.condition.get(Language.FR);
			}
			
			return this.condition.get(lang);
		}
	}
	
	public TypeEffect getTargetEffect() {
		return this.targetEffect;
	}
	
	public int getPercent() {
		return this.percent;
	}

	public int getPercentMin() {
		return this.percentMin;
	}
	
	public Target getTarget() {
		return this.target;
	}
	
	public int getTaux() {
		return this.taux;
	}

	public int getCumul() {
		return this.cumul;
	}
	
	public TypeCondition getTypeCondition() {
		return this.specialCondition;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return new Calculable[0];
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.effects[i].copy();
		}
		
		return tab;
	}
	
	public void multiplyValue(int factor) {
		this.percent *= factor;

		for(Calculable c : this.effects) {
			c.multiplyValue(factor);
		}
	}
	
	public String getName(Language lang) {
		return this.targetEffect.getSelectorInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.targetEffect.getSelectorInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.specialCondition == null) {
				if(this.target == Target.OPPONENT) {
					result.append("Ennemi : ");
				}
				
				if(this.percentMin != 0) {
					result.append("Si " + this.targetEffect.getSelectorInfo(lang) + " entre " + this.percentMin + "% et " + this.percent + "%");
				} else {
					result.append("Si " + this.targetEffect.getSelectorInfo(lang) + " < " + this.percent + "%");
				}
				
				if(this.taux > 0) {
					result.append(", " + this.taux + "% d'activer");
				}
			} else {
				result.append(this.specialCondition.getName(lang));
			}
			
			result.append(" :");
			result.append(TAB);
			
			for(Calculable calculable : this.effects) {
				result.append(LINE + TAB + TAB);
				result.append("• " + calculable.getFullInfo(lang));
				result.append(TAB);
			}
			
			if(this.cumul != 1) {
				result.append(LINE + TAB + TAB);
				result.append("- Cumulable " + this.cumul + " fois");
				result.append(TAB);
			}
		} else {
			if(this.specialCondition == null) {
				if(this.target == Target.OPPONENT) {
					result.append("Opponent: ");
				}
				
				if(this.percentMin != 0) {
					result.append("If " + this.targetEffect.getSelectorInfo(lang) + " between " + this.percentMin + "% and " + this.percent + "%");
				} else {
					result.append("If " + this.targetEffect.getSelectorInfo(lang) + " < " + this.percent + "%");
				}
				
				if(this.taux > 0) {
					result.append(", " + this.taux + "% to activate");
				}
			} else {
				result.append(this.specialCondition.getName(lang));
			}
			
			result.append(":");
			result.append(TAB);
			
			for(Calculable calculable : this.effects) {
				result.append(LINE + TAB + TAB);
				result.append("• " + calculable.getFullInfo(lang));
				result.append(TAB);
			}
			
			if(this.cumul != 1) {
				result.append(LINE + TAB + TAB);
				result.append("- Stacks up to " + this.cumul + " times");
				result.append(TAB);
			}
		}
		
		return result.toString();
	}
}
