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
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder(this.type.abbrevFR);
		
		if(this.target == Target.OPPONENT) {
			tooltip.append("Enn : ");
		}
		
		tooltip.append(this.value > 0 ? " +" : " ");
		tooltip.append(this.value);
		tooltip.append(this.isPercent ? "%" : "");
		
		if(this.transfert != TypeEffect.NONE) {
			tooltip.append(" de ");
			tooltip.append(this.transfert.abbrevFR);
		}
		
		return "<li>" + tooltip.toString().replace(".0", "") + "</li>";
	}
	
	public String toString() {
		String result = this.type.fr + (this.value > 0 ? " +" : " ") + this.value + (this.isPercent ? "%" :"");
		if(this.withWeapon != WeaponType.NONE) {
			result += " si équipé ";
			switch (this.withWeapon) {
				case EPEE1M :		result += "d'une épée une main";				break;
				case MARTEAU1M :	result += "d'un marteau une main";				break;
				case HACHE1M :		result += "d'une hache une main";				break;
				case EPEE2M :		result += "d'une épée à deux mains";			break;
				case MARTEAU2M :	result += "d'un marteau à deux mains";			break;
				case HACHE2M :		result += "d'une hache à deux mains";			break;
				case MECA1M :		result += "d'une arme mécanique une main";		break;
				case MECA2M :		result += "d'une arme mécanique à deux mains";	break;
				case ARC :			result += "d'un arc";							break;
				case GUN :			result += "d'un pistolet";						break;
				case CANON :		result += "d'un canon";							break;
				case RELIQUE :		result += "d'une relique";						break;
				case BATON :		result += "d'un bâton";							break;
				case LAME :			result += "d'une lame";							break;
				case CLE :			result += "d'une clé";							break;
				case BOUCLIER :		result += "d'un bouclier";						break;
				default:			result += "";									break;
			}
		}
		
		return result.replace(".0", "");
	}
	
	public String toString(Language lang) {
		String result = "";
		
		if(this.target == Target.OPPONENT) {
			if(lang == Language.FR) {
				result += "Ennemi : ";
			} else {
				result += "Opponent: ";
			}
		}
		
		if(lang == Language.FR) {
			result += this.type.fr;
		} else {
			result += this.type.en;
		}
		
		result += (this.value < 0 ? " " : " +");
		result += this.value + (this.isPercent ? "%" : "");
		
		if(this.withWeapon != WeaponType.NONE) {
			if(lang == Language.FR) {
				result += " si équipé de ";
			} else {
				result += " if equip with ";
			}
			result += this.withWeapon.getInfo(lang);
		}
		
		if(this.transfert != TypeEffect.NONE) {
			if(lang == Language.FR) {
				result += " de ";
				result += this.transfert.fr;
			} else {
				result += " of ";
				result += this.transfert.en;
			}
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