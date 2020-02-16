package fr.vlik.gfbuilder;

import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;

public class Build {
	
	private double coefReinca;
	private WeaponType[] weaponType;
	
	private ArrayList<Effect> effectPoint = new ArrayList<Effect>();
	private ArrayList<Effect> effectPercent = new ArrayList<Effect>();
	private ArrayList<Effect> effectAdditional = new ArrayList<Effect>();
	private ArrayList<Effect> effectConvert = new ArrayList<Effect>();
	
	public Build(double coefReinca, WeaponType[] weaponType) {
		this.coefReinca = coefReinca;
		this.weaponType = weaponType;
	}
	
	public double getCoefReinca() {
		return this.coefReinca;
	}
	
	public WeaponType[] getWeaponType() {
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
	
	public void addEffect(Calculable c) {
		if(c instanceof Effect) {
			Effect e = (Effect) c;
			
			if(containIdWeapon(e.getWithWeapon())) {
				if(e.isPercent()) {
					this.effectPercent.add(e);
				} else {
					this.effectPoint.add(e);
				}
			}
		} else if(c instanceof Proc) {
			Proc p = (Proc) c;
			
			for(Calculable calculable : p.getEffects()) {
				if(calculable instanceof Effect) {
					Effect e = (Effect) calculable;
					
					if(containIdWeapon(e.getWithWeapon())) {
						if(e.isPercent()) {
							this.effectPercent.add(e);
						} else {
							this.effectPoint.add(e);
						}
					}
				}
			}
			
		}
	}

	public void addEffect(Calculable[] effects) {
		for(Calculable e : effects) {
			addEffect(e);
		}
	}
	
	public void addEffect(ArrayList<Calculable> effects) {
		for(Calculable e : effects) {
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
	
	public void addConvertEffect(ArrayList<Effect> effects) {
		for(Effect e : effects) {
			this.effectConvert.add(e);
		}
	}
	
	private boolean containIdWeapon(WeaponType type) {
		boolean result = false;
		if(type == WeaponType.NONE) {
			return true;
		} else {
			for(WeaponType currentType : this.weaponType) {
				if(type == currentType) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public double[] calculStatFromEffect() {
		double[] result = new double[TypeEffect.values().length];
		double[] combinePoint = combineEffect(this.effectPoint);
		double[] combinePercent = combineEffect(this.effectPercent);
		
		/* FCE VIT INT VOL AGI */
		for(int i = 0; i < 5; i++) {
			result[i] = Math.floor(combinePoint[i] * (combinePercent[i] / 100 +1));
		}
		
		/* CONVERSION */
		for(Effect e : this.effectConvert) {
			double value = result[e.getTransfert().ordinal()] * (e.getValue() / 100);
			result[e.getType().ordinal()] += Math.floor(value * (combinePercent[e.getType().ordinal()] / 100 +1));
		}
		
		/* Atk AtkD AtkM */
		result[5] = Math.floor((result[0] * 3 + combinePoint[5]) * (combinePercent[5] / 100 +1));
		result[6] = Math.floor((result[4] * 3 + combinePoint[6]) * (combinePercent[6] / 100 +1));
		result[7] = Math.floor((result[2] * 3 + combinePoint[7]) * (combinePercent[7] / 100 +1));
		
		/* DefP DefM */
		result[8] = Math.floor(Math.round((result[1] * 1.5) + combinePoint[8]) * (combinePercent[8] / 100 +1));
		result[9] = Math.floor(Math.round((result[3] * 1.5) + combinePoint[9]) * (combinePercent[9] / 100 +1));
		
		/* TCCP TCCM */
		result[10] = Math.floor((Math.floor((Math.min(result[4], 2646) + 14 ) / 28) + 5 + combinePoint[10]) * (combinePercent[10] / 100 +1));
		result[11] = Math.floor((Math.floor((Math.min(result[2], 2646) + 14 ) / 28) + 5 + combinePoint[11]) * (combinePercent[11] / 100 +1));
		
		/* ESQ */
		result[12] = Math.floor(Math.floor((result[4] + 5) / 10) * (combinePercent[12] / 100 +1)) + combinePoint[12];
		
		/* RES */
		for(int i = 0; i < 6; i++) {
			result[i+13] = Math.floor(combinePoint[i+13] * (combinePercent[i+13] / 100 +1));
		}
		
		/* PV PM */
		result[19] = Math.floor((Math.round(result[1] * 40) + 100 + combinePoint[19]) * (combinePercent[19] / 100 +1));
		result[20] = Math.floor((Math.round(result[3] * 20) + 50 + combinePoint[20]) * (combinePercent[20] / 100 +1));
		
		for(int i = 21; i < result.length; i++) {
			result[i] = Math.floor(combinePoint[i] * (combinePercent[i] / 100 +1));
		}
		
		for(Effect add : this.effectAdditional) {
			result[add.getType().ordinal()] += add.getValue();
		}
		
		return result;
	}

	private double[] combineEffect(ArrayList<Effect> effects) {
		double[] combine = new double[TypeEffect.values().length];
		
		for(Effect e : effects) {
			combine[e.getType().ordinal()] += e.getWithReinca() ? Math.round((e.getValue())*this.coefReinca) : e.getValue();
		}
		
		return combine;
	}
}
