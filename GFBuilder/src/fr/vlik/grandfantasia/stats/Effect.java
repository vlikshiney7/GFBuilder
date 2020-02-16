package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;

public class Effect implements Calculable {
	
	private TypeEffect type;
	private boolean isPercent;
	private double value;
	private boolean withReinca = false;
	private WeaponType withWeapon = WeaponType.NONE;
	private TypeEffect transfert = null;
	

	public Effect(TypeEffect type, boolean isPercent, double value) {
		this.type = type;
		this.isPercent = isPercent;
		this.value = value;
	}

	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca) {
		this(type, isPercent, value);
		this.withReinca = withReinca;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, WeaponType withWeapon) {
		this(type, isPercent, value, withReinca);
		this.withWeapon = withWeapon;
	}
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, WeaponType withWeapon, TypeEffect transfert) {
		this(type, isPercent, value, withReinca, withWeapon);
		this.transfert = transfert;
	}
	
	public Effect(Effect effect) {
		this.type = effect.getType();
		this.isPercent = effect.isPercent();
		this.value = effect.getValue();
		this.withReinca = effect.getWithReinca();
		this.withWeapon = effect.getWithWeapon();
		this.transfert = effect.getTransfert();
	}
	
	public Effect(String parsing) {
		String[] split = parsing.split(",");
		this.type = TypeEffect.valueOf(split[0]);
		this.isPercent = Boolean.parseBoolean(split[1]);
		this.value = Double.parseDouble(split[2]);
		
		if(split.length > 3) {
			this.withReinca = Boolean.parseBoolean(split[3]);
		}
		
		if(split.length > 4) {
			try {
				this.withWeapon = WeaponType.values()[Integer.parseInt(split[4])];
			} catch (ArrayIndexOutOfBoundsException e) {
				this.withWeapon = WeaponType.NONE;
			}
			
		}
		
		if(split.length > 5) {
			this.transfert = TypeEffect.valueOf(split[5]);
		}
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

	public void addFortifValue(double coef) {
		this.value = (int) (this.value * coef);
	}
	
	public void addEnchantValue(int value) {
		this.value = this.value + value;
	}
	
	public void reduceCoef(double coef) {
		this.value = (int) (this.value * coef);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder(this.type.abbrevFR);
		tooltip.append(this.value > 0 ? " +" : " ");
		tooltip.append((int) this.value);
		tooltip.append(this.isPercent ? "%" : "");
		return "<li>" + tooltip + "</li>";
	}
	
	@Override
	public String toString() {
		String result = this.getType().fr + (this.getValue() < 0 ? " " : " +") + (int) this.getValue() + (this.isPercent ? "%" :"");
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
		
		return result;
	}
	
	public String toString(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			result = this.getType().fr;
		} else {
			result = this.getType().en;
		}
		
		result += (this.getValue() < 0 ? " " : " +");
		result += (int) this.getValue() + (this.isPercent ? "%" : "");
		if(this.withWeapon != WeaponType.NONE) {
			if(lang == Language.FR) {
				result += " si équipé d'";
				result += this.withWeapon.fr;
			} else {
				result += " if equip with ";
				result += this.withWeapon.en;
			}
			
		}
		
		return result;
	}
}