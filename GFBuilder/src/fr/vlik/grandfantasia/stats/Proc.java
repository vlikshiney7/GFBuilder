package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;

public class Proc implements Calculable {
	
	private Calculable[] effects;
	private Activation activation;
	private double taux;
	private double time = 0;
	private int cumul = 1;
	private double cooldown = 0;
	private TDB tdb = TDB.NONE;
	

	public Proc(Activation activation, double time, Calculable[] effects) {
		this.activation = activation;
		this.time = time;
		this.effects = effects;
	}

	public Proc(double taux, Activation activation, Calculable[] effects) {
		this.taux = taux;
		this.activation = activation;
		this.effects = effects;
	}
	
	public Proc(double taux, Activation activation, Calculable[] effects, double cooldown) {
		this(taux, activation, effects);
		this.cooldown = cooldown;
	}
	
	public Proc(double taux, Activation activation, double time, Calculable[] effects) {
		this(taux, activation, effects);
		this.time = time;
	}
	
	public Proc(double taux, Activation activation, double time, Calculable[] effects, double cooldown) {
		this(taux, activation, effects);
		this.time = time;
		this.cooldown = cooldown;
	}
	
	public Proc(double taux, Activation activation, double time, int cumul, Calculable[] effects) {
		this(taux, activation, time, effects);
		this.cumul = cumul;
	}
	
	public Proc(double taux, Activation activation, double time, int cumul, Calculable[] effects, double cooldown) {
		this(taux, activation, time, effects, cooldown);
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
	
	public Calculable copy() {
		return new Proc(this);
	}
	
	public enum Activation {
		Attack("en attaquant", "attacking"),
		Attacked("quand attaqué", "when attacked"),
		
		Standard("sur coup standard", "on standard hit"),
		Skill("sur compétence", "on skill"),
		
		Phys("sur coup physique", "on physical hit"),
		Mag("sur coup magique", "on magical hit"),
		
		Crit("sur coup critique", "on critical hit"),
		CritPhys("sur critique physique", "on physical critical hit"),
		CritMag("sur critique magique", "on magical critical hit"),
		
		Crited("sur critique reçu", "on receive critical"),
		CritedPhys("sur critique physique reçu", "on receive physical critical"),
		CritedMag("sur critique magique reçu", "on receive magical critical"),
		
		Sprite("avec Sprite", "with Sprite"),
		
		Meditation("en méditation", "on meditation"),
		Nothing("", "");
		
		public final String fr;
		public final String en;
		
	    private Activation(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public enum TDB {
		NONE, TDB;
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
	
	public double getCooldown() {
		return this.cooldown;
	}
	
	public TDB getTDB() {
		return this.tdb;
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
		this.taux *= factor;
		
		for(Calculable c : this.effects) {
			c.multiplyValue(factor);
		}
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.tdb == TDB.TDB) {
			tooltip.append("Après " + this.cumul + " cumul " + this.activation.fr + " :");
		} else {
			if(this.activation == Activation.Sprite) {
				tooltip.append("Activer " + this.activation.fr + ":\n");
			} else {
				tooltip.append(this.taux + "% d'activer " + this.activation.fr + " :");
			}
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
		
		if(this.cooldown != 0) {
			tooltip.append("<li>Rechargement : " + this.cooldown + "s</li>");
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
				if(this.activation == Activation.Sprite) {
					result.append("Activer " + this.activation.fr + ":\n");
				} else {
					result.append(this.taux + "% d'activer " + this.activation.fr + " :\n");
				}
			}
			
			for(Calculable calculable : this.effects) {
				result.append("\t\t- " + calculable.toString(lang) + "\n");
			}
			
			if(this.time != 0) {
				result.append("\t\tActif pendant " + this.time + "s\n");
			}
			
			if(this.cumul != 1 && this.tdb != TDB.TDB) {
				result.append("\t\tCumulable " + this.cumul + " fois\n");
			}
			
			if(this.cooldown != 0) {
				result.append("\t\tRechargement : " + this.cooldown + "s\n");
			}
		} else {
			if(this.tdb == TDB.TDB) {
				result.append("After " + this.cumul + " stacks " + this.activation.en + ":\n");
			} else {
				if(this.activation == Activation.Sprite) {
					result.append("Activation " + this.activation.en + ":\n");
				} else {
					result.append(this.taux + "% to activate " + this.activation.en + ":\n");
				}
			}
			
			for(Calculable calculable : this.effects) {
				result.append("\t\t- " + calculable.toString(lang) + "\n");
			}
			
			if(this.time != 0) {
				result.append("\t\tActif for  " + this.time + "s\n");
			}
			
			if(this.cumul != 1 && this.tdb != TDB.TDB) {
				result.append("\t\tStacks up to " + this.cumul + " times\n");
			}
			
			if(this.cooldown != 0) {
				result.append("\t\tCooldown : " + this.cooldown + "s\n");
			}
		}
		
		return result.toString();
	}
}
