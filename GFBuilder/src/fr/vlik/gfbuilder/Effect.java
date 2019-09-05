package fr.vlik.gfbuilder;

import fr.vlik.grandfantasia.Weapon.WeaponType;

public class Effect {
	
	private TypeEffect type;
	private boolean isPercent;
	private double value;
	private boolean withReinca = false;
	private WeaponType withWeapon = WeaponType.NONE;
	private TypeEffect transfert = null;
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, WeaponType withWeapon, TypeEffect transfert) {
		this.type = type;
		this.isPercent = isPercent;
		this.value = value;
		this.withReinca = withReinca;
		this.withWeapon = withWeapon;
		this.transfert = transfert;
	}
	
	public Effect(Effect effect) {
		this.type = effect.getType();
		this.isPercent = effect.isPercent();
		this.value = effect.getValue();
		this.withReinca = effect.getWithReinca();
		this.withWeapon = effect.getWithWeapon();
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
	
	public void reduceAtkValue() {
		this.value = (int) (this.value * 0.75);
	}
	
	public StringBuilder getTooltip() {
		StringBuilder tooltip = new StringBuilder(this.type.toString());
		tooltip.append(this.value > 0 ? " +" : " ");
		tooltip.append((int) this.value);
		tooltip.append(this.isPercent ? "%" : "");
		return tooltip;
	}
	
	public static enum TypeEffect {
		FCE, VIT, INT, VOL, AGI, Atk, AtkD, AtkM, DefP, DefM,
		TCCP, TCCM, ESQ, Sacre, Ombre, Foudre, Feu, Glace, Nature, Toucher,
		PV, PM, DegP, DegM, ReducP, ReducM, PeneP, PeneM, ReducPeneP, ReducPeneM,
		DCCP, DCCM, RDCCP, RDCCM, RTCCP, RTCCM, VitAtk, VitAtkD, VitAtkM, VitComp,
		XP, Loot, RegenCB, DegBeteP, DegPlanteP, DegHumaP, DegElemP, DegMecaP, DegMortP, DegDemonP,
		DegBeteM, DegPlanteM, DegHumaM, DegElemM, DegMecaM, DegMortM, DegDemonM, ReducAtk, ReducAtkD, ReducAtkM,
		DegSacre, DegOmbre, DegFoudre, DegFeu, DegGlace, DegNature, IntComp, CostComp, ReloadComp, Parade,
		DegStdEp, DegStdMa, DegStdHa, DegStd2Ep, DegStd2Ma, DegStd2Ha, DegStdArc, DegStdGun, DegStdBa, DegStdLa, DegAtkD, RDegAtkD, RegenPV, RegenPM, MEN,
		BoostCraft, TimeCraft, HealD, HealR, Bullet, Reflect, Depla;
	}
	
	@Override
	public String toString() {
		String[] enumName = { "FCE", "VIT", "INT", "VOL", "AGI", "Attaque Physique", "Attaque Distance", "Attaque Magique", "D�fense Physique", "D�fense Magique",
				"Taux Critique Physique", "Taux Critique Magique", "ESQ", "R�sistance Sacr�", "R�sistance Ombre", "R�sistance Foudre", "R�sistance Feu", "R�sistance Glace", "R�sistance Nature", "Toucher",
				"PV", "PM", "D�g�t Physique", "D�g�t Magique", "R�duction Physique", "R�duction Magique", "P�n�tration Physique", "P�n�tration Magique", "R�duction P�n�tration Physique", "R�duction P�n�tration Magique",
				"D�g�t Critique Physique", "D�g�t Critique Magique", "R�duction D�g�t Critique Physique", "R�duction D�g�t Critique Magique", "R�duction Taux Critique Physique", "R�duction Taux Critique Magique", "Vitesse d'attaque", "Vitesse d'attaque � distance", "Vitesse d'attaque magique", "Incantation",
				"XP", "Taux de Butin", "R�g�n�ration Coup Blanc", "D�g�t Physique sur B�te", "D�g�t Physique sur Plante", "D�g�t Physique sur Humano�de", "D�g�t Physique sur �l�mentaire", "D�g�t Physique sur M�canique", "D�g�t Physique sur Mort", "D�g�t Physique sur D�mon",
				"D�g�t Magique sur B�te", "D�g�t Magique sur Plante", "D�g�t Magique sur Humano�de", "D�g�t Magique sur �l�mentaire", "D�g�t Magique sur M�canique", "D�g�t Magique sur Mort", "D�g�t Magique sur D�mon", "D�g�t Physique Subit", "D�g�t Distance Subit", "D�g�t Magique Subit",
				"D�g�t Sacr�", "D�g�t Ombre", "D�g�t Foudre", "D�g�t Feu", "D�g�t Glace", "D�g�t Nature", "Interruption Comp�tence", "Co�t Comp�tence", "Rechargement Comp�tence", "Parade",
				"D�g�t Standard �p�e", "D�g�t Standard Marteau", "D�g�t Standard Hache", "D�g�t Standard �p�e 2 Mains", "D�g�t Standard Marteau 2 Mains", "D�g�t Standard Hache 2 Mains", "D�g�t Standard Arc", "D�g�t Standard Gun", "D�g�t Standard B�ton", "D�g�t Standard Lame", "D�g�t Attaque Distance", "R�duction D�g�t Attaque Distance", "R�g�n�ration PV Assis", "R�g�n�ration PM Assis", "Menace",
				"Taux de r�ussite de Craft", "Temps de r�colte/entra�nement/craft", "Soin donn�", "Soin re�u", "Bonus d'Attaque � Distance", "Reflect", "Vitesse de D�placement" };
		String result = enumName[this.getType().ordinal()] + (this.getValue() < 0 ? " " : " +") + (int)this.getValue() + (this.isPercent ? "%" :"");
		if(this.withWeapon != WeaponType.NONE) {
			result += " si �quip� ";
			switch (this.withWeapon) {
				case EPEE1M :		result += "d'une �p�e une main";				break;
				case MARTEAU1M :	result += "d'un marteau une main";				break;
				case HACHE1M :		result += "d'une hache une main";				break;
				case EPEE2M :		result += "d'une �p�e � deux mains";			break;
				case MARTEAU2M :	result += "d'un marteau � deux mains";			break;
				case HACHE2M :		result += "d'une hache � deux mains";			break;
				case MECA1M :		result += "d'une arme m�canique une main";		break;
				case MECA2M :		result += "d'une arme m�canique � deux mains";	break;
				case ARC :			result += "d'un arc";							break;
				case GUN :			result += "d'un pistolet";						break;
				case CANON :		result += "d'un canon";							break;
				case RELIQUE :		result += "d'une relique";						break;
				case BATON :		result += "d'un b�ton";							break;
				case LAME :			result += "d'une lame";							break;
				case CLE :			result += "d'une cl�";							break;
				case BOUCLIER :		result += "d'un bouclier";						break;
				default:			result += "";									break;
			}
		}
		return result;
	}
}
