package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;

public class Condition implements Calculable {
	
	private Calculable[] effects;
	private TypeEffect targetEffect;
	private TypeCondition specialCondition = null;
	private int percent;
	private int taux;
	
	public Condition(TypeEffect targetEffect, int percent, Calculable[] effects) {
		this.targetEffect = targetEffect;
		this.percent = percent;
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
	
	public Condition(Condition condition) {
		this.targetEffect = condition.getTargetEffect();
		this.percent = condition.getPercent();
		this.effects = condition.getEffects();
		this.specialCondition = condition.getTypeCondition();
	}
	
	public static enum TypeCondition {
		STATUT("A chaque statut reçu", "For each receive status"),
		RAYON("Dans les 16 mètres", "On the 16 meters"),
		DEATH("Évite une mort", "Avoid one death"),
		
		AIGLE("Aigle", "Eagle"),
		LOUP("Loup", "Wolf"),
		SINGE("Singe", "Monkey"),
		
		SANCTU1("Sanctuaire Forêt", "Forest Sanctuary"),
		SANCTU2("Sanctuaire Sable", "Sand Sanctuary"),
		
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
	
	public int getTaux() {
		return this.taux;
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
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.specialCondition == null) {
			tooltip.append("Si " + this.targetEffect.fr + " < " + this.percent);
			
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
		
		tooltip.append("</ul>");
		
		return "<li>" + tooltip + "</li>";
	}
	
	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.specialCondition == null) {
				result.append("Si " + this.targetEffect.abbrevFR + " < " + this.percent + "%");
				
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
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof RegenEffect) {
					RegenEffect r = (RegenEffect) calculable;
					result.append("\t\t- " + r.toString(lang) + "\n");
				}
			}
		} else {
			if(this.specialCondition == null) {
				result.append("If " + this.targetEffect.abbrevEN + " < " + this.percent + "%");
				
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
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				} else if(calculable instanceof RegenEffect) {
					RegenEffect r = (RegenEffect) calculable;
					result.append("\t\t- " + r.toString(lang) + "\n");
				}
				
			}
		}
		
		return result.toString();
	}
}
