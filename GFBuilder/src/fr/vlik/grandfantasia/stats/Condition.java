package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;

public class Condition implements Calculable {
	
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
	
	public static enum TypeCondition {
		STATUT("A chaque statut reçu", "For each receive status"),
		RAYON16("Dans les 16 mètres", "On the 16 meters"),
		RAYON("Autour de soi", "Around you"),
		DEATH("Évite une mort", "Avoid one death"),
		
		AIGLE("Aigle", "Eagle"),
		LOUP("Loup", "Wolf"),
		SINGE("Singe", "Monkey"),
		
		INTER3("3 charges", "3 charges"),
		PREPA("Préparation", "Preparation"),
		
		SANCTU1("Sanctuaire Forêt", "Forest Sanctuary"),
		SANCTU2("Sanctuaire Sable", "Sand Sanctuary"),
		SANCTU3("Sanctuaire Prairie", "Grassland Sanctuary"),
		
		SPRITE("Maître de l'Encyclopédie sprite", "Master of Sprite Encyclopedia"),
		;
		
		public final String fr;
		public final String en;
		 
	    private TypeCondition(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
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
		Calculable[] list = new Calculable[this.effects.length];	
		for(int i = 0; i < this.effects.length; i++) {
			list[i] = this.effects[i];
		}
		return list;
	}
	
	@Override
	public void multiplyValue(int factor) {
		this.percent *= factor;

		for(Calculable c : this.effects) {
			c.multiplyValue(factor);
		}
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.specialCondition == null) {
			if(this.target == Target.OPPONENT) {
				tooltip.append("Adversaire : ");
			}
			
			if(this.percentMin != 0) {
				tooltip.append("Si " + this.targetEffect.abbrevFR + " entre " + this.percentMin + "% et " + this.percent + "%");
			} else {
				tooltip.append("Si " + this.targetEffect.abbrevFR + " < " + this.percent + "%");
			}
			
			if(this.taux > 0) {
				tooltip.append(", " + this.taux + "% d'activer");
			}
		} else {
			tooltip.append(this.specialCondition.fr);
		}
		
		tooltip.append(" :");
		
		tooltip.append("<ul>");
		for(Calculable calculable : this.effects) {
			tooltip.append(calculable.getTooltip());
		}
		
		if(this.cumul > 1) {
			tooltip.append("<li>Cumulable " + this.cumul + " fois</li>");
		}
		
		tooltip.append("</ul>");
		
		return "<li>" + tooltip + "</li>";
	}
	
	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.specialCondition == null) {
				if(this.target == Target.OPPONENT) {
					result.append("Adversaire : ");
				}
				
				if(this.percentMin != 0) {
					result.append("Si " + this.targetEffect.abbrevFR + " entre " + this.percentMin + "% et " + this.percent + "%");
				} else {
					result.append("Si " + this.targetEffect.abbrevFR + " < " + this.percent + "%");
				}
				
				if(this.taux > 0) {
					result.append(", " + this.taux + "% d'activer");
				}
			} else {
				result.append(this.specialCondition.fr);
			}
			
			result.append(" :");
			
			for(Calculable calculable : this.effects) {
				if(calculable instanceof Effect) {
					Effect e = (Effect) calculable;
					result.append("\t\t- " + e.toString(lang) + "\n");
				} else if(calculable instanceof Proc) {
					Proc s = (Proc) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof RegenEffect) {
					RegenEffect s = (RegenEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof SkillEffect) {
					SkillEffect s = (SkillEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof TransformEffect) {
					TransformEffect r = (TransformEffect) calculable;
					result.append("\t\t- " + r.toString(lang) + "\n");
				}
			}
			
			if(this.cumul != 1) {
				result.append("\t\tCumulable " + this.cumul + " fois\n");
			}
		} else {
			if(this.specialCondition == null) {
				if(this.target == Target.OPPONENT) {
					result.append("Opponent: ");
				}
				
				if(this.percentMin != 0) {
					result.append("If " + this.targetEffect.abbrevEN + " between " + this.percentMin + "% and " + this.percent + "%");
				} else {
					result.append("If " + this.targetEffect.abbrevEN + " < " + this.percent + "%");
				}
				
				if(this.taux > 0) {
					result.append(", " + this.taux + "% to activate");
				}
			} else {
				result.append(this.specialCondition.en);
			}
			
			result.append(":");
			
			for(Calculable calculable : this.effects) {
				if(calculable instanceof Effect) {
					Effect e = (Effect) calculable;
					result.append("\t\t- " + e.toString(lang) + "\n");
				} else if(calculable instanceof Proc) {
					Proc s = (Proc) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof RegenEffect) {
					RegenEffect s = (RegenEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof SkillEffect) {
					SkillEffect s = (SkillEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof TransformEffect) {
					TransformEffect r = (TransformEffect) calculable;
					result.append("\t\t- " + r.toString(lang) + "\n");
				}
			}
			
			if(this.cumul != 1) {
				result.append("\t\tStacks up to " + this.cumul + " times\n");
			}
		}
		
		return result.toString();
	}
}
