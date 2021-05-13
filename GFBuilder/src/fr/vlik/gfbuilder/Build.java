package fr.vlik.gfbuilder;

import java.util.ArrayList;
import java.util.Arrays;

import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Build {
	
	private double coefReinca;
	private boolean isDoubleWeapon = false;
	private WeaponType[] weaponType;
	
	private ArrayList<Effect> baseEffects = new ArrayList<Effect>();
	private ArrayList<Effect> yggdrasil = new ArrayList<Effect>();
	private ArrayList<Effect> convertBaseEffects = new ArrayList<Effect>();
	private ArrayList<Effect> classicPointEffects = new ArrayList<Effect>();
	private ArrayList<Effect> classicPercentEffects = new ArrayList<Effect>();
	private ArrayList<Effect> convertEffects = new ArrayList<Effect>();
	private ArrayList<Effect> additionalEffects = new ArrayList<Effect>();
	
	public Build(double coefReinca, WeaponType[] weaponType) {
		this.coefReinca = coefReinca;
		this.weaponType = weaponType;
	}
	
	public double getCoefReinca() {
		return this.coefReinca;
	}
	
	public boolean isDoubleWeapon() {
		return this.isDoubleWeapon;
	}
	
	public WeaponType[] getWeaponType() {
		return this.weaponType;
	}
	
	public void addEffect(Calculable c) {
		if(c instanceof Effect) {
			Effect e = (Effect) c;
			
			if(e.getTarget() == Target.SELF) {
				if(containIdWeapon(e.getWithWeapon())) {
					switch(e.getCalcul()) {
						case BASE: 			this.baseEffects.add(e);		break;
						case YGGDRASIL:		this.yggdrasil.add(e);			break;
						case CONVERTBASE:	this.convertBaseEffects.add(e);	break;
						case CLASSIC:
							if(e.isPercent()) {
								this.classicPercentEffects.add(e);
							} else {
								this.classicPointEffects.add(e);
							}
							
							break;
						case CONVERT:		this.convertEffects.add(e);		break;
						case ADDITIONAL:	this.additionalEffects.add(e);	break;
						
					default:
						if(e.isPercent()) {
							this.classicPercentEffects.add(e);
						} else {
							this.classicPointEffects.add(e);
						}
					}
				}
			}
		} else if(c instanceof StaticEffect) {
			StaticEffect s = (StaticEffect) c;
			
			if(s.getType() == TypeStaticEffect.Duo) {
				this.isDoubleWeapon = true;
			}
		}
	}

	public void addEffect(Calculable[] effects) {
		for(Calculable c : effects) {
			addEffect(c);
		}
	}
	
	public void addEffect(ArrayList<Calculable> effects) {
		for(Calculable c : effects) {
			addEffect(c);
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
		double[] base = combineEffect(this.baseEffects);
		double[] yggdra = combineEffect(this.yggdrasil);
		double[] convertBase = convertEffect(this.convertBaseEffects, base, yggdra);
		double[] point = combineEffect(this.classicPointEffects);
		double[] percent = combineEffect(this.classicPercentEffects);
		double[] convert = convertEffect(this.convertEffects, base, yggdra, convertBase, point, percent);
		double[] additional = combineEffect(this.additionalEffects);
		
		double[] result = new double[TypeEffect.values().length];
		
		
		/* FCE VIT INT VOL AGI */
		for(int i = 0; i < 5; i++) {
			result[i] = Math.floor((base[i] + point[i]) * ((yggdra[i] + percent[i]) / 100 +1) + convertBase[i] + convert[i] + additional[i]);
		}
		
		/* Atk AtkD AtkM */
		result[5] = Math.floor((result[0] * 3 + base[5] + point[5]) * (percent[5] / 100 +1) + convertBase[5] + convert[5] + additional[5]);
		result[6] = Math.floor((result[4] * 3 + base[6] + point[6]) * (percent[6] / 100 +1) + convertBase[6] + convert[6] + additional[6]);
		result[7] = Math.floor((result[2] * 3 + base[7] + point[7]) * (percent[7] / 100 +1) + convertBase[7] + convert[7] + additional[7]);
		
		/* DefP DefM */
		result[8] = Math.floor(Math.round((result[1] * 1.5) + base[8] + point[8]) * (percent[8] / 100 +1) + convertBase[8] + convert[8] + additional[8]);
		result[9] = Math.floor(Math.round((result[3] * 1.5) + base[9] + point[9]) * (percent[9] / 100 +1) + convertBase[9] + convert[9] + additional[9]);
		
		/* TCCP TCCM */
		result[10] = Math.floor((Math.min(result[4], 2646) + 14 ) / 28) + base[10] + point[10] + convertBase[10] + convert[10] + additional[10];
		result[11] = Math.floor((Math.min(result[2], 2646) + 14 ) / 28) + base[11] + point[11] + convertBase[11] + convert[11] + additional[11];
		
		/* ESQ */
		result[12] = Math.floor(Math.floor((result[4] + 5) / 10) * (percent[12] / 100 +1)) + base[12] + point[12] + convertBase[12] + convert[12] + additional[12];
		
		/* RES */
		for(int i = 0; i < 6; i++) {
			result[i+13] = Math.floor(base[i+13] + point[i+13] + convertBase[i+13] + convert[i+13] + additional[i+13]);
		}
		
		/* PV PM */
		result[19] = Math.floor((Math.round(result[1] * 40) + base[19] + point[19]) * (percent[19] / 100 +1) + convertBase[19] + convert[19] + additional[19]);
		result[20] = Math.floor((Math.round(result[3] * 20) + base[20] + point[20]) * (percent[20] / 100 +1) + convertBase[20] + convert[20] + additional[20]);
		
		for(int i = 21; i < result.length; i++) {
			if(TypeEffect.values()[i].entier) {
				result[i] = Math.floor(base[i] + point[i] + convertBase[i] + convert[i] + additional[i]);
			} else {
				result[i] = base[i] + point[i] + convertBase[i] + convert[i] + additional[i];
			}
		}
		
		return result;
	}
	
	private double[] combineEffect(ArrayList<Effect> effects) {
		double[] combine = new double[TypeEffect.values().length];
		
		for(Effect e : effects) {
			if(e.getCalcul() == TypeCalcul.BASE) {
				combine[e.getType().ordinal()] += e.getWithReinca() ? Math.floor((e.getValue())*this.coefReinca) : e.getValue();
			} else {
				combine[e.getType().ordinal()] += e.getWithReinca() ? Math.round((e.getValue())*this.coefReinca) : e.getValue();
			}
		}
		
		return combine;
	}
	
	private double[] convertEffect(ArrayList<Effect> effects, double[] base, double[] yggdra) {
		double[] combine = new double[TypeEffect.values().length];
		double[] redefinedBase = Arrays.copyOf(base, base.length);
		
		/* PV PM */
		redefinedBase[19] = Math.floor(base[1] * (yggdra[1] / 100 +1) * 40) + base[19];
		redefinedBase[20] = Math.floor(base[3] * (yggdra[3] / 100 +1) * 20) + base[20];
		
		for(Effect e : effects) {
			combine[e.getType().ordinal()] += Math.round(redefinedBase[e.getTransfert().ordinal()] * (e.getValue() / 100));
		}
		
		return combine;
	}
	
	private double[] convertEffect(ArrayList<Effect> effects, double[] base, double[] yggdra, double[] convertBase, double[] point, double[] percent) {
		double[] combine = new double[TypeEffect.values().length];
		double[] merge = Arrays.copyOf(base, base.length);
		
		for(int i = 0; i < 5; i++) {
			merge[i] = Math.floor((base[i] + point[i]) * ((yggdra[i] + percent[i]) / 100 +1) + convertBase[i]);
		}
		
		/* Atk AtkD AtkM */
		merge[5] = Math.floor((base[0] + point[0] + convertBase[0]) * 3 + point[5] * (percent[5] / 100 +1) + convertBase[5]);
		merge[6] = Math.floor((base[4] + point[4] + convertBase[4]) * 3 + point[6] * (percent[6] / 100 +1) + convertBase[6]);
		merge[7] = Math.floor((base[2] + point[2] + convertBase[2]) * 3 + point[7] * (percent[7] / 100 +1) + convertBase[7]);
		
		/* TCCP TCCM */
		merge[10] = Math.floor((Math.min((base[4] + point[4] + convertBase[4]), 2646) + 14 ) / 28) + base[10] + point[10] + convertBase[10];
		merge[11] = Math.floor((Math.min((base[2] + point[2] + convertBase[2]), 2646) + 14 ) / 28) + base[11] + point[11] + convertBase[11];
		
		
		for(Effect e : effects) {
			double value = merge[e.getTransfert().ordinal()] * (e.getValue() / 100);
			combine[e.getType().ordinal()] += Math.floor(value * ((yggdra[e.getType().ordinal()] + percent[e.getType().ordinal()]) / 100 +1));
		}
		
		return combine;
	}
}
