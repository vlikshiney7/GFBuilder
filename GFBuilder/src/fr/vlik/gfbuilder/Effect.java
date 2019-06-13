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
		String[] enumName = { "FCE", "VIT", "INT", "VOL", "AGI", "Attaque Physique", "Attaque Distance", "Attaque Magique", "Défense Physique", "Défense Magique",
				"Taux Critique Physique", "Taux Critique Magique", "ESQ", "Résistance Sacré", "Résistance Ombre", "Résistance Foudre", "Résistance Feu", "Résistance Glace", "Résistance Nature", "Toucher",
				"PV", "PM", "Dégât Physique", "Dégât Magique", "Réduction Physique", "Réduction Magique", "Pénétration Physique", "Pénétration Magique", "Réduction Pénétration Physique", "Réduction Pénétration Magique",
				"Dégât Critique Physique", "Dégât Critique Magique", "Réduction Dégât Critique Physique", "Réduction Dégât Critique Magique", "Réduction Taux Critique Physique", "Réduction Taux Critique Magique", "Vitesse d'attaque", "Vitesse d'attaque à distance", "Incantation", "Vitesse de Déplacement",
				"XP", "Taux de Butin", "Régénération Coup Blanc", "Dégât sur Bête", "Dégât sur Plante", "Dégât sur Humanoïde", "Dégât sur Élémentaire", "Dégât sur Mécanique", "Dégât sur Mort", "Dégât sur Démon",
				"Dégât Sacré", "Dégât Ombre", "Dégât Foudre", "Dégât Feu", "Dégât Glace", "Dégât Nature", "Interruption Compétence", "Coût Compétence", "Rechargement Compétence", "Parade",
				"Dégât Standard Épée", "Dégât Standard Marteau", "Dégât Standard Hache", "Dégât Standard Arc", "Dégât Standard Gun", "Dégât Standard Bâton", "Dégât Attaque Distance", "Régénération PV Assis", "Régénération PM Assis", "Menace",
				"Taux de réussite de Craft", "Temps de récolte/entraînement/craft", "Soin", "Bonus d'Attaque à Distance", "Reflect" };
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
