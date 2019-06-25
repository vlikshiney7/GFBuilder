package fr.vlik.gfbuilder;

import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect.TypeEffect;

public class Build {
	
	private double coefReinca;
	private int[] weaponType;
	
	private ArrayList<Effect> effectPoint = new ArrayList<Effect>();
	private ArrayList<Effect> effectPercent = new ArrayList<Effect>();
	private ArrayList<Effect> effectAdditional = new ArrayList<Effect>();
	private ArrayList<Effect> effectConvert = new ArrayList<Effect>();
	
	public Build(double coefReinca, int[] weaponType) {
		this.coefReinca = coefReinca;
		this.weaponType = weaponType;
	}
	
	public double getCoefReinca() {
		return this.coefReinca;
	}
	
	public int[] getWeaponType() {
		return this.weaponType;
	}
	
	public ArrayList<Effect> getEffectPoint() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effectPoint.size());
		for(Effect effect : this.effectPoint) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public ArrayList<Effect> getEffectPercent() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effectPercent.size());
		for(Effect effect : this.effectPercent) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public ArrayList<Effect> getEffectAdditional() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effectAdditional.size());
		for(Effect effect : this.effectAdditional) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public ArrayList<Effect> getEffectConvert() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effectConvert.size());
		for(Effect effect : this.effectConvert) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public void addEffect(Effect e) {
		if(containIdWeapon(e.getWithWeapon())) {
			if(e.isPercent())	this.effectPercent.add(e);
			else				this.effectPoint.add(e);
		}
	}

	public void addEffect(Effect[] effects) {
		for(Effect e : effects) {
			addEffect(e);
		}
	}
	
	public void addEffect(ArrayList<Effect> effects) {
		for(Effect e : effects) {
			addEffect(e);
		}
	}
	
	public void addAdditionalEffect(Effect e) {
		this.effectAdditional.add(e);
	}
	
	public void addAdditionalEffect(ArrayList<Effect> effects) {
		for(Effect e : effects) {
			this.effectAdditional.add(e);
		}
	}
	
	public void addConvertEffect(Effect e) {
		this.effectConvert.add(e);
	}
	
	private boolean containIdWeapon(int weaponType) {
		boolean result = false;
		if(weaponType == -1) return true;
		else {
			for(int currentType : this.weaponType) {
				if(weaponType == currentType) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public int[] calculStatFromEffect() {
		int[] result = new int[TypeEffect.values().length];
		int[] combinePoint = combineEffect(this.effectPoint);
		int[] combinePercent = combineEffect(this.effectPercent);
		
		/* FCE VIT INT VOL AGI */
		for(int i = 0; i < 5; i++) {
			result[i] = (int) Math.floor(combinePoint[i] * ((double)combinePercent[i] / 100 +1));
		}
		
		/* CONVERSION */
		for(Effect e : this.effectConvert) {
			double value = result[e.getTransfert().ordinal()] * (e.getValue() / 100);
			result[e.getType().ordinal()] += (int) value * ((double)combinePercent[e.getType().ordinal()] / 100 +1);
		}
		
		/* Atk AtkD AtkM */
		result[5] = (int) Math.floor((result[0] * 3 + combinePoint[5]) * ((double)combinePercent[5] / 100 +1));
		result[6] = (int) Math.floor((result[4] * 3 + combinePoint[6]) * ((double)combinePercent[6] / 100 +1));
		result[7] = (int) Math.floor((result[2] * 3 + combinePoint[7]) * ((double)combinePercent[7] / 100 +1));
		
		/* DefP DefM */
		result[8] = (int) Math.floor(Math.round((result[1] * 1.5) + combinePoint[8]) * ((double)combinePercent[8] / 100 +1));
		result[9] = (int) Math.floor(Math.round((result[3] * 1.5) + combinePoint[9]) * ((double)combinePercent[9] / 100 +1));
		
		/* TCCP TCCM */
		result[10] = (int) Math.floor((Math.floor((Math.min(result[4], 2646) + 14 ) / 28) + 5 + combinePoint[10]) * ((double)combinePercent[10] / 100 +1));
		result[11] = (int) Math.floor((Math.floor((Math.min(result[2], 2646) + 14 ) / 28) + 5 + combinePoint[11]) * ((double)combinePercent[11] / 100 +1));
		
		/* ESQ */
		result[12] = (int) Math.floor((Math.floor((result[4] + 5) / 10) + combinePoint[12]) * ((double)combinePercent[12] / 100 +1));
		
		/* RES + TOUCHER */
		for(int i = 0; i < 7; i++) {
			result[i+13] = (int) Math.floor(combinePoint[i+13] * ((double)combinePercent[i+13] / 100 +1));
		}
		
		/* PV PM */
		result[20] = (int) Math.floor((Math.round(result[1] * 40) + 100 + combinePoint[20]) * ((double)combinePercent[20] / 100 +1));
		result[21] = (int) Math.floor((Math.round(result[3] * 20) + 50 + combinePoint[21]) * ((double)combinePercent[21] / 100 +1));
		
		for(int i = 22; i < result.length; i++) {
			result[i] = (int) Math.floor(combinePoint[i] * ((double)combinePercent[i] / 100 +1));
		}
		
		for(Effect add : this.effectAdditional) {
			result[add.getType().ordinal()] += add.getValue();
		}
		
		return result;
	}

	private int[] combineEffect(ArrayList<Effect> effects) {
		double[] combine = new double[TypeEffect.values().length];
		
		for(Effect e : effects) {
			combine[e.getType().ordinal()] += e.getWithReinca() ? Math.round(((double) e.getValue())*coefReinca) : (double) e.getValue();
		}
		
		int[] cast = new int[combine.length];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = (int) combine[i];
		}
		
		return cast;
	}
}
