package fr.vlik.gfbuilder;

public class Effect {
	
	private TypeEffect type;
	private boolean isPercent;
	private double value;
	private boolean withReinca = false;
	private int withWeapon = -1;
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, int withWeapon) {
		this.type = type;
		this.isPercent = isPercent;
		this.value = value;
		this.withReinca = withReinca;
		this.withWeapon = withWeapon;
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
		if(split.length > 3) this.withReinca = Boolean.parseBoolean(split[3]);
		if(split.length > 4) this.withWeapon = Integer.parseInt(split[4]);
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
	
	public int getWithWeapon() {
		return this.withWeapon;
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
		DCCP, DCCM, RDCCP, RDCCM, RTCCP, RTCCM, VitAtk, VitAtkD, VitComp, Depla,
		XP, Loot, RegenCB, DegBete, DegPlante, DegHuma, DegElem, DegMeca, DegMort, DegDemon,
		DegSacre, DegOmbre, DegFoudre, DegFeu, DegGlace, DegNature, IntComp, CostComp, ReloadComp, Parade,
		DegStdEp, DegStdMa, DegStdHa, DegStdArc, DegStdGun, DegStdBa, DegAtkD, RegenPV, RegenPM, MEN,
		BoostCraft, TimeCraft, Heal, Bullet, Reflect;
	}
	
	@Override
	public String toString() {
		String[] enumName = { "FCE", "VIT", "INT", "VOL", "AGI", "Attaque Physique", "Attaque Distance", "Attaque Magique", "D�fense Physique", "D�fense Magique",
				"Taux Critique Physique", "Taux Critique Magique", "ESQ", "R�sistance Sacr�", "R�sistance Ombre", "R�sistance Foudre", "R�sistance Feu", "R�sistance Glace", "R�sistance Nature", "Toucher",
				"PV", "PM", "D�g�t Physique", "D�g�t Magique", "R�duction Physique", "R�duction Magique", "P�n�tration Physique", "P�n�tration Magique", "R�duction P�n�tration Physique", "R�duction P�n�tration Magique",
				"D�g�t Critique Physique", "D�g�t Critique Magique", "R�duction D�g�t Critique Physique", "R�duction D�g�t Critique Magique", "R�duction Taux Critique Physique", "R�duction Taux Critique Magique", "Vitesse d'attaque", "Vitesse d'attaque � distance", "Incantation", "Vitesse de D�placement",
				"XP", "Taux de Butin", "R�g�n�ration Coup Blanc", "D�g�t sur B�te", "D�g�t sur Plante", "D�g�t sur Humano�de", "D�g�t sur �l�mentaire", "D�g�t sur M�canique", "D�g�t sur Mort", "D�g�t sur D�mon",
				"D�g�t Sacr�", "D�g�t Ombre", "D�g�t Foudre", "D�g�t Feu", "D�g�t Glace", "D�g�t Nature", "Interruption Comp�tence", "Co�t Comp�tence", "Rechargement Comp�tence", "Parade",
				"D�g�t Standard �p�e", "D�g�t Standard Marteau", "D�g�t Standard Hache", "D�g�t Standard Arc", "D�g�t Standard Gun", "D�g�t Standard B�ton", "D�g�t Attaque Distance", "R�g�n�ration PV Assis", "R�g�n�ration PM Assis", "Menace",
				"Taux de r�ussite de Craft", "Temps de r�colte/entra�nement/craft", "Soin", "Bonus d'Attaque � Distance", "Reflect" };
		String result = enumName[this.getType().ordinal()] + (this.getValue() < 0 ? " " : " +") + (int)this.getValue() + (this.isPercent ? "%" :"");
		if(withWeapon != -1) {
			result += " si �quip� ";
			switch (withWeapon) {
				case 0 : result += "d'une �p�e une main";				break;
				case 1 : result += "d'un marteau une main";				break;
				case 2 : result += "d'une hache une main";				break;
				case 3 : result += "d'une �p�e � deux mains";			break;
				case 4 : result += "d'un marteau � deux mains";			break;
				case 5 : result += "d'une hache � deux mains";			break;
				case 6 : result += "d'une arme m�canique une main";		break;
				case 7 : result += "d'une arme m�canique � deux mains";	break;
				case 8 : result += "d'un arc";							break;
				case 9 : result += "d'un pistolet";						break;
				case 10 : result += "d'un canon";						break;
				case 11 : result += "d'une relique";					break;
				case 12 : result += "d'un b�ton";						break;
				case 13 : result += "d'une lame";						break;
				case 14 : result += "d'une cl�";						break;
				case 15 : result += "d'un bouclier";					break;
			}
		}
		return result;
	}
}
