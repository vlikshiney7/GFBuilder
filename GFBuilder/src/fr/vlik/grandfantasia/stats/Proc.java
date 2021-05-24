package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;

public class Proc implements Calculable {
	
	private Calculable[] effects;
	private Activation activation;
	private double taux;
	private double time = 0;
	private int cumul = 1;
	private TDB tdb = TDB.NONE;
	
	
	public Proc(double taux, Activation activation, Calculable[] effects) {
		this.taux = taux;
		this.activation = activation;
		this.effects = effects;
	}
	
	public Proc(double taux, Activation activation, double time, Calculable[] effects) {
		this(taux, activation, effects);
		this.time = time;
	}
	
	public Proc(double taux, Activation activation, double time, int cumul, Calculable[] effects) {
		this(taux, activation, time, effects);
		this.cumul = cumul;
	}
	
	public Proc(Activation activation, int cumul, TDB tdb,  Calculable[] effects) {
		this(100, activation, effects);
		this.cumul = cumul;
		this.tdb = tdb;
	}
	
	public Proc(Proc proc) {
		this.activation = proc.getActivation();
		this.taux = proc.getTaux();
		this.time = proc.getTime();
		this.cumul = proc.getCumul();
		this.effects = proc.getEffects();
	}
	
	public static enum Activation {
		Attack("en attaquant", "attacking"),
		Attacked("quand attaqué", "when attacked"),
		Standard("sur coup standard", "on standard hit"),
		Phys("sur coup physique", "on physical hit"),
		Mag("sur coup magique", "on magical hit"),
		Crit("sur coup critique", "on critical hit"),
		CritPhys("sur critique physique", "on physical critical hit"),
		CritMag("sur critique magique", "on magical critical hit"),
		Crited("sur critique reçu", "on receive critical"),
		CritedPhys("sur critique physique reçu", "on receive physical critical"),
		CritedMag("sur critique magique reçu", "on receive magical critical"),
		Meditation("en méditation", "on meditation"),
		Nothing("", "");
		
		public final String fr;
		public final String en;
		
	    private Activation(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public static enum TDB {
		NONE,TDB;
	}
	
	public double getTaux() {
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
	
	public TDB getTDB() {
		return this.tdb;
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
		this.taux *= factor;
		
		for(Calculable c : this.effects) {
			c.multiplyValue(factor);
		}
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.tdb == TDB.TDB) {
			tooltip.append("Après " + this.cumul + " cumul " + this.activation.fr + " :");
		} else {
			tooltip.append(this.taux + "% d'activer " + this.activation.fr + " :");
		}
		
		tooltip.append("<ul>");
		for(Calculable calculable : this.effects) {
			tooltip.append(calculable.getTooltip());
		}
		
		if(this.time != 0) {
			tooltip.append("<li>Actif pendant " + this.time + "s</li>");
		}
		
		if(this.cumul > 1 && this.tdb != TDB.TDB) {
			tooltip.append("<li>Cumulable " + this.cumul + " fois</li>");
		}
		
		tooltip.append("</ul>");
		
		return "<li>" + tooltip + "</li>";
	}
	
	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.tdb == TDB.TDB) {
				result.append("Après " + this.cumul + " cumul " + this.activation.fr + " :\n");
			} else {
				result.append(this.taux + "% d'activer " + this.activation.fr + " :\n");
			}
			
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
			
			if(this.time != 0) {
				result.append("\t\tActif pendant " + this.time + "s\n");
			}
			
			if(this.cumul != 1 && this.tdb != TDB.TDB) {
				result.append("\t\tCumulable " + this.cumul + " fois\n");
			}
		} else {
			if(this.tdb == TDB.TDB) {
				result.append("After " + this.cumul + " stacks " + this.activation.en + ":\n");
			} else {
				result.append(this.taux + "% to activate " + this.activation.en + ":\n");
			}
			
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
			
			if(this.time != 0) {
				result.append("\t\tActif for  " + this.time + "s\n");
			}
			
			if(this.cumul != 1 && this.tdb != TDB.TDB) {
				result.append("\t\tStacks up to " + this.cumul + " times\n");
			}
		}
		
		return result.toString();
	}
}
