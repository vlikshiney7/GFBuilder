package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;

public class Effect implements Calculable {

	private TypeEffect type;
	private boolean isPercent;
	private double value;
	private boolean withReinca = false;
	private WeaponType withWeapon = WeaponType.NONE;
	private TypeEffect transfert = TypeEffect.NONE;
	private Target target = Target.SELF;
	
	private TypeCalcul typeCalcul = TypeCalcul.CLASSIC;
	
	public Effect(TypeEffect type, boolean isPercent, double value) {
		this.type = type;
		this.isPercent = isPercent;
		this.value = value;
		
		this.typeCalcul = TypeCalcul.CLASSIC;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca) {
		this(type, isPercent, value);
		this.withReinca = withReinca;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, TypeCalcul typeCalcul) {
		this(type, isPercent, value, withReinca);
		
		this.typeCalcul = typeCalcul;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, WeaponType withWeapon) {
		this(type, isPercent, value);
		this.withWeapon = withWeapon;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, TypeCalcul typeCalcul) {
		this(type, isPercent, value);
		
		this.typeCalcul = typeCalcul;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, WeaponType withWeapon) {
		this(type, isPercent, value, withReinca);
		this.withWeapon = withWeapon;
	}
	
	public Effect(TypeEffect type, double value, TypeEffect transfert, TypeCalcul typeCalcul) {
		this(type, true, value);
		this.transfert = transfert;
		
		this.typeCalcul = typeCalcul;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, Target target) {
		this(type, isPercent, value);
		this.target = target;
	}
	
	public Effect(Effect effect) {
		this.type = effect.getType();
		this.isPercent = effect.isPercent();
		this.value = effect.getValue();
		this.withReinca = effect.getWithReinca();
		this.withWeapon = effect.getWithWeapon();
		this.transfert = effect.getTransfert();
		this.target = effect.getTarget();
		this.typeCalcul = effect.getCalcul();
	}
	
	public Calculable copy() {
		return new Effect(this);
	}
	
	public enum TypeCalcul {
		BASE, PERCENTSPE, CONVERTBASE, CLASSIC, CONVERTALL, ADDITIONAL,
	}
	
	public TypeEffect getType() {
		return this.type;
	}
	
	public boolean isPercent() {
		return this.isPercent;
	}

	public double getValue() {
		return this.value;
	}
	
	public boolean getWithReinca() {
		return this.withReinca;
	}
	
	public WeaponType getWithWeapon() {
		return this.withWeapon;
	}
	
	public TypeEffect getTransfert() {
		return this.transfert;
	}
	
	public Target getTarget() {
		return this.target;
	}
	
	public TypeCalcul getCalcul() {
		return this.typeCalcul;
	}
	
	public void changeValue(double coef) {
		this.value = (int) (this.value * coef);
	}
	
	public void addEnchantValue(double value) {
		this.value = this.value + value;
	}
	
	public void multiplyValue(int factor) {
		this.value *= factor;
	}
	
	public String getName(Language lang) {
		return this.type.getSelectorInfo(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.type.getSelectorInfo(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(this.target == Target.OPPONENT) {
			if(lang == Language.FR) {
				result += "Ennemi : ";
			} else {
				result += "Opponent: ";
			}
		}
		
		result += this.type.getSelectorInfo(lang)
				+ (this.value > 0 ? " +" : " ")
				+ this.value
				+ (this.isPercent ? "%" : "");
		
		if(this.transfert != TypeEffect.NONE) {
			if(lang == Language.FR) {
				result += " de ";
			} else {
				result += " of ";
			}
			
			result += this.transfert.getSelectorInfo(lang);
		}
		
		if(this.withWeapon != WeaponType.NONE) {
			if(lang == Language.FR) {
				result += " si équipé de ";
			} else {
				result += " if equip with ";
			}
			
			result += this.withWeapon.getFullInfo(lang);
		}
		
		return result.replace(".0", "");
	}
	
	public static Effect[] tabEffect(TypeEffect type, boolean isPercent, double[] values, boolean withReinca) {
		Effect[] tabEffect = new Effect[values.length];
		
		for(int i = 0; i < values.length; i++) {
			if(i != 0 && values[i] == 0) {
				tabEffect[i] = new Effect(type, isPercent, tabEffect[i-1].getValue(), withReinca);
			} else {
				tabEffect[i] = new Effect(type, isPercent, values[i], withReinca);
			}
		}
		
		return tabEffect;
	}
}