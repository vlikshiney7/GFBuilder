package fr.vlik.gfbuilder;

public class Effect {
	
	private TypeEffect type;
	private boolean isPercent;
	private double value;
	private boolean withReinca = false;
	private int withWeapon = -1;
	private TypeEffect transfert = null;
	
	public Effect(TypeEffect type, boolean isPercent, double value, boolean withReinca, int withWeapon, TypeEffect transfert) {
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
		if(split.length > 3) this.withReinca = Boolean.parseBoolean(split[3]);
		if(split.length > 4) this.withWeapon = Integer.parseInt(split[4]);
		if(split.length > 5) this.transfert = TypeEffect.valueOf(split[5]);
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
		String[] enumName = { "FCE", "VIT", "INT", "VOL", "AGI", "Attaque Physique", "Attaque Distance", "Attaque Magique", "Défense Physique", "Défense Magique",
				"Taux Critique Physique", "Taux Critique Magique", "ESQ", "Résistance Sacré", "Résistance Ombre", "Résistance Foudre", "Résistance Feu", "Résistance Glace", "Résistance Nature", "Toucher",
				"PV", "PM", "Dégât Physique", "Dégât Magique", "Réduction Physique", "Réduction Magique", "Pénétration Physique", "Pénétration Magique", "Réduction Pénétration Physique", "Réduction Pénétration Magique",
				"Dégât Critique Physique", "Dégât Critique Magique", "Réduction Dégât Critique Physique", "Réduction Dégât Critique Magique", "Réduction Taux Critique Physique", "Réduction Taux Critique Magique", "Vitesse d'attaque", "Vitesse d'attaque à distance", "Vitesse d'attaque magique", "Incantation",
				"XP", "Taux de Butin", "Régénération Coup Blanc", "Dégât Physique sur Bête", "Dégât Physique sur Plante", "Dégât Physique sur Humanoïde", "Dégât Physique sur Élémentaire", "Dégât Physique sur Mécanique", "Dégât Physique sur Mort", "Dégât Physique sur Démon",
				"Dégât Magique sur Bête", "Dégât Magique sur Plante", "Dégât Magique sur Humanoïde", "Dégât Magique sur Élémentaire", "Dégât Magique sur Mécanique", "Dégât Magique sur Mort", "Dégât Magique sur Démon", "Dégât Physique Subit", "Dégât Distance Subit", "Dégât Magique Subit",
				"Dégât Sacré", "Dégât Ombre", "Dégât Foudre", "Dégât Feu", "Dégât Glace", "Dégât Nature", "Interruption Compétence", "Coût Compétence", "Rechargement Compétence", "Parade",
				"Dégât Standard Épée", "Dégât Standard Marteau", "Dégât Standard Hache", "Dégât Standard Épée 2 Mains", "Dégât Standard Marteau 2 Mains", "Dégât Standard Hache 2 Mains", "Dégât Standard Arc", "Dégât Standard Gun", "Dégât Standard Bâton", "Dégât Standard Lame", "Dégât Attaque Distance", "Réduction Dégât Attaque Distance", "Régénération PV Assis", "Régénération PM Assis", "Menace",
				"Taux de réussite de Craft", "Temps de récolte/entraînement/craft", "Soin donné", "Soin reçu", "Bonus d'Attaque à Distance", "Reflect", "Vitesse de Déplacement" };
		String result = enumName[this.getType().ordinal()] + (this.getValue() < 0 ? " " : " +") + (int)this.getValue() + (this.isPercent ? "%" :"");
		if(withWeapon != -1) {
			result += " si équipé ";
			switch (withWeapon) {
				case 0 : result += "d'une épée une main";				break;
				case 1 : result += "d'un marteau une main";				break;
				case 2 : result += "d'une hache une main";				break;
				case 3 : result += "d'une épée à deux mains";			break;
				case 4 : result += "d'un marteau à deux mains";			break;
				case 5 : result += "d'une hache à deux mains";			break;
				case 6 : result += "d'une arme mécanique une main";		break;
				case 7 : result += "d'une arme mécanique à deux mains";	break;
				case 8 : result += "d'un arc";							break;
				case 9 : result += "d'un pistolet";						break;
				case 10 : result += "d'un canon";						break;
				case 11 : result += "d'une relique";					break;
				case 12 : result += "d'un bâton";						break;
				case 13 : result += "d'une lame";						break;
				case 14 : result += "d'une clé";						break;
				case 15 : result += "d'un bouclier";					break;
			}
		}
		return result;
	}
}
