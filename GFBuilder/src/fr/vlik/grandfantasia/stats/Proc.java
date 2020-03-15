package fr.vlik.grandfantasia.stats;

import java.util.ArrayList;

public class Proc implements Calculable {
	
	private ArrayList<Calculable> effects = new ArrayList<Calculable>();
	private Activation activation;
	private int taux;
	private double time;
	private int cumul = 1;
	
	
	public Proc(int taux, Activation activation, double time, ArrayList<Calculable> effects) {
		this.taux = taux;
		this.activation = activation;
		this.time = time;
		this.effects = effects;
	}
	
	public Proc(int taux, Activation activation, double time, int cumul, ArrayList<Calculable> effects) {
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
	
	public ArrayList<Calculable> getEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>(this.effects.size());
		for(Calculable effect : this.effects) {
			if(effect instanceof Effect) {
				list.add(new Effect((Effect)effect));
			}
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
		tooltip.append("<li>Actif pendant " + this.time + "s</li>");
		
		if(this.cumul > 1) {
			tooltip.append("<li>Cumulable " + this.cumul + " fois</li>");
		}
		
		tooltip.append("</ul>");
		
		return "<li>" + tooltip + "</li>";
	}
}
