package fr.vlik.gfbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	private ArrayList<Effect> baseEffects = new ArrayList<>();
	private ArrayList<Effect> classicPointEffects = new ArrayList<>();
	private ArrayList<Effect> classicPercentEffects = new ArrayList<>();
	private ArrayList<Effect> convertBaseEffects = new ArrayList<>();
	private ArrayList<Effect> convertAllEffects = new ArrayList<>();
	private ArrayList<Effect> additionalEffects = new ArrayList<>();
	
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
			
			if(e.getTarget() == Target.SELF && containIdWeapon(e.getWithWeapon())) {
				switch(e.getCalcul()) {
					case BASE: 			this.baseEffects.add(e);		break;
					case CONVERTBASE:	this.convertBaseEffects.add(e);	break;
					case CLASSIC:
						if(e.isPercent()) {
							this.classicPercentEffects.add(e);
						} else {
							this.classicPointEffects.add(e);
						}
						
						break;
					case CONVERTALL:	this.convertAllEffects.add(e);	break;
					case ADDITIONAL:	this.additionalEffects.add(e);	break;
					
				default:
					if(e.isPercent()) {
						this.classicPercentEffects.add(e);
					} else {
						this.classicPointEffects.add(e);
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
	
	public void addEffect(List<Calculable> effects) {
		effects.forEach(this::addEffect);
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
		double[] point = combineEffect(this.classicPointEffects);
		double[] percent = combineEffect(this.classicPercentEffects);
		double[] convertBase = convertEffect(this.convertBaseEffects, base, percent);
		double[] convertAll = convertEffect(this.convertAllEffects, base, convertBase, point, percent);
		double[] additional = combineEffect(this.additionalEffects);
		
		double[] allPoint = merge(base, point);
		double[] convertAndAdd = merge(convertBase, convertAll, additional);
		
		double[] result = new double[TypeEffect.values().length];
		
		
		/* FCE VIT INT VOL AGI */
		for(int i = 0; i < 5; i++) {
			result[i] = Math.floor(allPoint[i] * (percent[i] / 100 +1) + convertAndAdd[i]);
		}
		
		/* Atk AtkD AtkM */
		result[5] = Math.floor((Math.min(result[0], 9999) * 3 + allPoint[5]) * (percent[5] / 100 +1) + convertAndAdd[5]);
		result[6] = Math.floor((Math.min(result[4], 9999) * 3 + allPoint[6]) * (percent[6] / 100 +1) + convertAndAdd[6]);
		result[7] = Math.floor((Math.min(result[2], 9999) * 3 + allPoint[7]) * (percent[7] / 100 +1) + convertAndAdd[7]);
		
		/* DefP DefM */
		result[8] = Math.floor(Math.round((Math.min(result[1], 9999) * 1.5) + allPoint[8]) * (percent[8] / 100 +1) + convertAndAdd[8]);
		result[9] = Math.floor(Math.round((Math.min(result[3], 9999) * 1.5) + allPoint[9]) * (percent[9] / 100 +1) + convertAndAdd[9]);
		
		/* TCCP TCCM */
		result[10] = Math.floor((Math.min(result[4], 2646) + 14 ) / 28) + allPoint[10] + convertAndAdd[10];
		result[11] = Math.floor((Math.min(result[2], 2646) + 14 ) / 28) + allPoint[11] + convertAndAdd[11];
		
		/* ESQ */
		result[12] = Math.floor(Math.floor((Math.min(result[4], 9999) + 5) / 10) * (percent[12] / 100 +1)) + allPoint[12] + convertAndAdd[12];
		
		/* RES */
		for(int i = 0; i < 6; i++) {
			result[i+13] = Math.floor(allPoint[i+13] + convertAndAdd[i+13]);
		}
		
		/* PV PM */
		result[19] = Math.floor((Math.min(result[1], 9999) * 40 + allPoint[19]) * (percent[19] / 100 +1) + convertAndAdd[19]);
		result[20] = Math.floor((Math.min(result[3], 9999) * 20 + allPoint[20]) * (percent[20] / 100 +1) + convertAndAdd[20]);
		
		for(int i = 21; i < result.length; i++) {
			if(TypeEffect.values()[i].entier) {
				result[i] = Math.floor(allPoint[i] + convertAndAdd[i]);
			} else {
				result[i] = allPoint[i] + convertAndAdd[i];
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
	
	private double[] merge(double[]... tabs) {
		double[] merge = new double[TypeEffect.values().length];
		
		for(double[] tab : tabs) {
			for(int i = 0; i < merge.length; i++) {
				merge[i] += tab[i];
			}
		}
		
		return merge;
	}
	
	private double[] convertEffect(ArrayList<Effect> effects, double[] base, double[] percent) {
		double[] combine = new double[TypeEffect.values().length];
		double[] redefinedBase = Arrays.copyOf(base, base.length);
		
		/* PV PM */
		redefinedBase[19] = Math.floor(base[1] * 40) + base[19];
		redefinedBase[20] = Math.floor(base[3] * 20) + base[20];
		
		for(Effect e : effects) {
			double value = redefinedBase[e.getTransfert().ordinal()] * (e.getValue() / 100);
			combine[e.getType().ordinal()] += Math.round(value * (percent[e.getType().ordinal()] / 100 +1));
		}
		
		return combine;
	}
	
	private double[] convertEffect(ArrayList<Effect> effects, double[] base, double[] convertBase, double[] point, double[] percent) {
		double[] combine = new double[TypeEffect.values().length];
		double[] merge = Arrays.copyOf(base, base.length);
		
		for(int i = 0; i < 5; i++) {
			merge[i] = Math.floor((base[i] + point[i]) * (percent[i] / 100 +1) + convertBase[i]);
		}
		
		/* Atk AtkD AtkM */
		merge[5] = Math.floor((base[0] + point[0] + convertBase[0]) * 3 + point[5] * (percent[5] / 100 +1) + convertBase[5]);
		merge[6] = Math.floor((base[4] + point[4] + convertBase[4]) * 3 + point[6] * (percent[6] / 100 +1) + convertBase[6]);
		merge[7] = Math.floor((base[2] + point[2] + convertBase[2]) * 3 + point[7] * (percent[7] / 100 +1) + convertBase[7]);
		
		/* TCCP TCCM */
		merge[10] = Math.floor((Math.min(base[4] + point[4] + convertBase[4], 2646) + 14 ) / 28) + base[10] + point[10] + convertBase[10];
		merge[11] = Math.floor((Math.min(base[2] + point[2] + convertBase[2], 2646) + 14 ) / 28) + base[11] + point[11] + convertBase[11];
		
		/* PV PM */
		merge[19] = Math.floor((base[1] + point[1] + convertBase[1]) * 40 + point[19] * (percent[19] / 100 +1) + convertBase[19]);
		merge[20] = Math.floor((base[3] + point[3] + convertBase[3]) * 20 + point[20] * (percent[20] / 100 +1) + convertBase[20]);
		
		for(Effect e : effects) {
			double value = merge[e.getTransfert().ordinal()] * (e.getValue() / 100);
			combine[e.getType().ordinal()] += Math.floor(value * (percent[e.getType().ordinal()] / 100 +1));
		}
		
		return combine;
	}
}
