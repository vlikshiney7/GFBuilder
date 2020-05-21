package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;

public class Proc implements Calculable {
	
	private Calculable[] effects;
	private Activation activation;
	private int taux;
	private double time = 0;
	private int cumul = 1;
	
	
	public Proc(int taux, Activation activation, Calculable[] effects) {
		this.taux = taux;
		this.activation = activation;
		this.effects = effects;
	}
	
	public Proc(int taux, Activation activation, double time, Calculable[] effects) {
		this(taux, activation, effects);
		this.time = time;
	}
	
	public Proc(int taux, Activation activation, double time, int cumul, Calculable[] effects) {
		this(taux, activation, time, effects);
		this.cumul = cumul;
	}
	
	public Proc(Proc proc) {
		this.activation = proc.getActivation();
		this.taux = proc.getTaux();
		this.time = proc.getTime();
		this.cumul = proc.getCumul();
		this.effects = proc.getEffects();
	}
	
	public static enum Activation {
		Attack(0, "en attaquant", "attacking"),
		Attacked(1, "quand attaqué", "when attacked");
		
		public final int index;
		public final String fr;
		public final String en;
		
	    private Activation(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public int getTaux() {
		return this.taux;
	}
	
	public Activation getActivation() {
		return this.activation;
	}
	
	public double getTime() {
		return this.time;
	}
	
	public int getCumul() {
		return this.cumul;
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
		StringBuilder tooltip = new StringBuilder(this.taux + "% d'activer " + this.activation.fr + " :");
		tooltip.append("<ul>");
		for(Calculable calculable : this.effects) {
			tooltip.append(calculable.getTooltip());
		}
		
		if(this.time != 0) {
			tooltip.append("<li>Actif pendant " + this.time + "s</li>");
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
			result.append(this.taux + "% d'activer " + this.activation.fr + " :\n");
			
			for(Calculable calculable : this.effects) {
				if(calculable instanceof Effect) {
					Effect e = (Effect) calculable;
					result.append("\t\t- " + e.toString(lang) + "\n");
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				}
			}
			
			if(this.time != 0) {
				result.append("\t\tActif pendant " + this.time + "s\n");
			}
			
			if(this.cumul != 1) {
				result.append("\t\tCumulable " + this.cumul + " fois\n");
			}
		} else {
			result.append(this.taux + "% to activate " + this.activation.en + " :\n");
			
			for(Calculable calculable : this.effects) {
				if(calculable instanceof Effect) {
					Effect e = (Effect) calculable;
					result.append("\t\t- " + e.toString(lang) + "\n");
				} else if(calculable instanceof StaticEffect) {
					StaticEffect s = (StaticEffect) calculable;
					result.append("\t\t- " + s.toString(lang) + "\n");
				}
			}
			
			if(this.time != 0) {
				result.append("\t\tActif for  " + this.time + "s\n");
			}
			
			if(this.cumul != 1) {
				result.append("\t\tStacks up to " + this.cumul + " times\n");
			}
		}
		
		return result.toString();
	}
}
