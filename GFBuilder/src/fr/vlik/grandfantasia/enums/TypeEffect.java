package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeEffect implements Colorable, Writable {

	FCE("Force", "Strength", "FCE", "STR", 9999, true, Tools.EffectColor[1]),
	VIT("Vitalité", "Vitality", "VIT", "VIT", 9999, true, Tools.EffectColor[2]),
	INT("Intelligence", "Intelligence", "INT", "INT", 9999, true, Tools.EffectColor[3]),
	VOL("Volonté", "Will", "VOL", "WIL", 9999, true, Tools.EffectColor[4]),
	AGI("Agilité", "Agility", "AGI", "AGI", 9999, true, Tools.EffectColor[5]),
	
	Atk("Attaque", "Attack", "ATQ", "ATK", 60000, true, Tools.EffectColor[1]),
	AtkD("Attaque à Distance", "Range Attack", "ATQ D.", "R-ATK", 60000, true, Tools.EffectColor[5]),
	AtkM("Attaque Magique", "Magic Attack", "ATQ M.", "M-ATK", 60000, true, Tools.EffectColor[3]),
	
	DefP("Défense Physique", "Physical Defense", "DÉF", "DEF", 60000, true, Tools.EffectColor[2]),
	DefM("Défense Magique", "Magical Defense", "DÉF M.", "M-DEF", 60000, true, Tools.EffectColor[4]),
	TCCP("Taux Coup Critique Physique", "Chance of Physical Critical Hit", "TCCP", "", 100, false, Tools.EffectColor[5]),
	TCCM("Taux Coup Critique Magique", "Chance of Magical Critical Hit", "TCCM", "", 100, false, Tools.EffectColor[3]),
	ESQ("Esquive", "", "ESQ", "", -1, true, Tools.EffectColor[5]),
	
	Sacre("Résistance Sacré", "", "Res Sacré", "", -1, true, Tools.EffectColor[7]),
	Ombre("Résistance Ombre", "", "Res Ombre", "", -1, true, Tools.EffectColor[8]),
	Foudre("Résistance Foudre", "", "Res Foudre", "", -1, true, Tools.EffectColor[9]),
	Feu("Résistance Feu", "", "Res Feu", "", -1, true, Tools.EffectColor[10]),
	Glace("Résistance Glace", "", "Res Glace", "", -1, true, Tools.EffectColor[11]),
	Nature("Résistance Nature", "", "Res Nature", "", -1, true, Tools.EffectColor[12]),
	
	PV("Points de Vie", "Health Points", "PV", "HP", -1, true, Tools.EffectColor[2]),
	PM("Points de Mana", "Mana Points", "PM", "MP", -1, true, Tools.EffectColor[4]),
	Toucher("Toucher", "", "Toucher", "", -1, true, Tools.EffectColor[11]),
	
	DegP("Dégât Physique", "", "Deg Phys", "", -1, true, Tools.EffectColor[10]), 
	DegM("Dégât Magique", "", "Deg Mag", "", -1, true, Tools.EffectColor[11]), 
	ReducP("Réduction Physique", "Physical Reduction", "Reduc Phys", "", -1, true, Tools.EffectColor[10]),
	ReducM("Réduction Magique", "Magical Reduction", "Reduc Mag", "", -1, true, Tools.EffectColor[11]),
	
	PeneP("Pénétration Physique", "Physical Penetration", "Péné Phys", "", 100, true, Tools.EffectColor[10]),
	PeneM("Pénétration Magique", "Magical Penetration", "Péné Mag", "", 100, true, Tools.EffectColor[11]),
	ReducPeneP("Réduction Pénétration Physique", "", "Red Pén Phys", "", -1, true, Tools.EffectColor[10]),
	ReducPeneM("Réduction Pénétration Magique", "", "Red Pén Mag", "", -1, true, Tools.EffectColor[11]),
	
	DCCP("Dégât Coup Critique Physique", "", "Deg Crit Phys", "", 150, true, Tools.EffectColor[10]),
	DCCM("Dégât Coup Critique Magique", "", "Deg Crit Mag", "", 150, true, Tools.EffectColor[11]),
	RDCCP("Réduction Dégât Coup Critique Physique", "", "Red Dg Crt Ph", "", -1, true, Tools.EffectColor[10]),
	RDCCM("Réduction Dégât Coup Critique Magique", "", "Red Dg Crt Mg", "", -1, true, Tools.EffectColor[11]),
	RTCCP("Réduction Taux Coup Critique Physique", "", "Red Tx Crt Ph", "", -1, true, Tools.EffectColor[10]),
	RTCCM("Réduction Taux Coup Critique Magique", "", "Red Tx Crt Mg", "", -1, true, Tools.EffectColor[11]),
	
	VitAtk("Vitesse d'Attaque Mêlée", "", "Vit Atk Mel", "", -1, true, Tools.EffectColor[10]),
	VitAtkD("Vitesse d'Attaque Distance", "", "Vit Atk Dist", "", -1, true, Tools.EffectColor[7]),
	VitAtkM("Vitesse d'Attaque Magique", "", "Vit Atk Mag", "", -1, true, Tools.EffectColor[11]),
	VitComp("Vitesse d'Incantation", "", "Vit Incant", "", 100, true, Tools.EffectColor[0]),
	Depla("Vitesse de Déplacement", "", "Vit Depla", "", -1, true, Tools.EffectColor[0]),
	
	ReducAtk("Réduction d'Attaque Mêlée", "", "Reduc Atq Mel", "", -1, true, Tools.EffectColor[10]),
	ReducAtkD("Réduction d'Attaque Distance", "", "Reduc Atq Dist", "", -1, true, Tools.EffectColor[7]),
	ReducAtkM("Réduction d'Attaque Magique", "", "Reduc Atq Mag", "", -1, true, Tools.EffectColor[11]),
	
	DegAtkD("Dégât d'Attaque Distance", "", "Dg Atq Dist", "", -1, true, Tools.EffectColor[7]),
	RDegAtkD("Réduction de Dégât d'Attaque Distance", "", "Red Dg Dist", "", -1, true, Tools.EffectColor[7]),

	ReducPtsP("Réduction Point Phyique", "", "Red Pts Phys", "", -1, true, Tools.EffectColor[10]),
	ReducPtsM("Réduction Point Magique", "", "Red Pts Mag", "", -1, true, Tools.EffectColor[11]),
	
	DegSacre("Dégât Sacré", "", "Deg Sacre", "", -1, true, Tools.EffectColor[7]),
	DegOmbre("Dégât Ombre", "", "Deg Ombre", "", -1, true, Tools.EffectColor[8]),
	DegFoudre("Dégât Foudre", "", "Deg Foudre", "", -1, true, Tools.EffectColor[9]),
	DegFeu("Dégât Feu", "", "Deg Feu", "", -1, true, Tools.EffectColor[10]),
	DegGlace("Dégât Glace", "", "Deg Glace", "", -1, true, Tools.EffectColor[11]),
	DegNature("Dégât Nature", "", "Deg Nature", "", -1, true, Tools.EffectColor[12]),
	
	XP("Bonus d'Expérience", "", "XP", "", 500, true, Tools.EffectColor[0]),
	Loot("Bonus de Butin", "", "Butin", "", 300, true, Tools.EffectColor[0]),
	
	DegDuo("Dégât Deux Armes", "", "Deg 2 Armes", "", -1, true, Tools.EffectColor[0]),
	VitAtkDuo("Vitesse d'Attaque à Deux Armes", "", "Vit Atk 2 Ar", "", -1, true, Tools.EffectColor[0]),
	TCC1M("Taux Critique Arme 1 Main", "", "Taux Crit 1M", "", -1, true, Tools.EffectColor[0]),
	TCC2M("Taux Critique Arme 2 Main", "", "Taux Crit 2M", "", -1, true, Tools.EffectColor[0]),
	DCC1M("Dégât Critique Arme 1 Main", "", "Deg Crit 1M", "", -1, true, Tools.EffectColor[0]),
	DCC2M("Dégât Critique Arme 2 Main", "", "Deg Crit 2M", "", -1, true, Tools.EffectColor[0]),
	RegenCB("Régénération Coup Standard", "", "Regen Coup Std", "", -1, false, Tools.EffectColor[0]),

	DegStdEp("Dégât Standard à l'Épée", "", "Deg Std Ep 1M", "", -1, true, Tools.EffectColor[0]),
	DegStdMa("Dégât Standard au Maillet", "", "Deg Std Ma 1M", "", -1, true, Tools.EffectColor[0]),
	DegStdHa("Dégât Standard à la Hache", "", "Deg Std Ha 1M", "", -1, true, Tools.EffectColor[0]),
	DegStdEp2M("Dégât Standard à l'Épée 2 Main", "", "Deg Std Ep 2M", "", -1, true, Tools.EffectColor[0]),
	DegStdMa2M("Dégât Standard au Maillet 2 Main", "", "Deg Std Ma 2M", "", -1, true, Tools.EffectColor[0]),
	DegStdHa2M("Dégât Standard à la Hache 2 Main", "", "Deg Std Ha 2M", "", -1, true, Tools.EffectColor[0]),
	DegStdArc("Dégât Standard à l'Arc", "", "Deg Std Arc", "", -1, true, Tools.EffectColor[0]),
	DegStdGun("Dégât Standard au Pistolet", "", "Deg Std Gun", "", -1, true, Tools.EffectColor[0]),
	DegStdBa("Dégât Standard au Bâton", "", "Deg Std Bat", "", -1, true, Tools.EffectColor[0]),
	DegStdLa("Dégât Standard à la Lame", "", "Deg Std Lame", "", -1, true, Tools.EffectColor[0]),

	DegEp("Dégât à l'Épée", "", "Deg Ep 1M", "", -1, true, Tools.EffectColor[0]),
	DegMa("Dégât au Maillet", "", "Deg Ma 1M", "", -1, true, Tools.EffectColor[0]),
	DegHa("Dégât à la Hache", "", "Deg Ha 1M", "", -1, true, Tools.EffectColor[0]),
	DegEp2M("Dégât à l'Épée 2 Main", "", "Deg Ep 2M", "", -1, true, Tools.EffectColor[0]),
	DegMa2M("Dégât au Maillet 2 Main", "", "Deg Ma 2M", "", -1, true, Tools.EffectColor[0]),
	DegHa2M("Dégât à la Hache 2 Main", "", "Deg Ha 2M", "", -1, true, Tools.EffectColor[0]),
	DegArc("Dégât à l'Arc", "", "Deg Arc", "", -1, true, Tools.EffectColor[0]),
	DegGun("Dégât au Pistolet", "", "Deg Gun", "", -1, true, Tools.EffectColor[0]),
	DegBa("Dégât au Bâton", "", "Deg Bat", "", -1, true, Tools.EffectColor[0]),
	DegLa("Dégât à la Lame", "", "Deg Lame", "", -1, true, Tools.EffectColor[0]),
	
	DegBeteP("Dégât Physique sur Bête", "", "Deg Phys Bete", "", -1, true, Tools.EffectColor[0]),
	DegPlanteP("Dégât Physique sur Plante", "", "Deg Phys Plante", "", -1, true, Tools.EffectColor[0]),
	DegHumaP("Dégât Physique sur Humanoïde", "", "Deg Phys Huma", "", -1, true, Tools.EffectColor[0]),
	DegElemP("Dégât Physique sur Élémentaire", "", "Deg Phys Elem", "", -1, true, Tools.EffectColor[0]),
	DegMecaP("Dégât Physique sur Mécanique", "", "Deg Phys Meca", "", -1, true, Tools.EffectColor[0]),
	DegMortP("Dégât Physique sur Mort-Vivant", "", "Deg Phys Mort", "", -1, true, Tools.EffectColor[0]),
	DegDemonP("Dégât Physique sur Démon", "", "Deg Phys Demon", "", -1, true, Tools.EffectColor[0]),
	DegBeteM("Dégât Magique sur Bête", "", "Deg Mag Bete", "", -1, true, Tools.EffectColor[0]),
	DegPlanteM("Dégât Magique sur Plante", "", "Deg Mag Plante", "", -1, true, Tools.EffectColor[0]),
	DegHumaM("Dégât Magique sur Humanoïde", "", "Deg Mag Huma", "", -1, true, Tools.EffectColor[0]),
	DegElemM("Dégât Magique sur Élémentaire", "", "Deg Mag Elem", "", -1, true, Tools.EffectColor[0]),
	DegMecaM("Dégât Magique sur Mécanique", "", "Deg Mag Meca", "", -1, true, Tools.EffectColor[0]),
	DegMortM("Dégât Magique sur Mort-Vivant", "", "Deg Mag Mort", "", -1, true, Tools.EffectColor[0]),
	DegDemonM("Dégât Magique sur Démon", "", "Deg Mag Demon", "", -1, true, Tools.EffectColor[0]),
	
	IntComp("Interruption de Compétence", "", "Inter Comp", "", -1, true, Tools.EffectColor[0]),
	CostComp("Coût de Compétence", "", "Coût Comp", "", -1, true, Tools.EffectColor[0]),
	ReloadComp("Rechargement de Compétence", "", "Recharge Comp", "", -1, false, Tools.EffectColor[0]),
	Parade("Parade", "", "Parade", "", -1, true, Tools.EffectColor[0]),
	
	RegenPV("Régénération de Point de Vie Assis", "", "Regen PV", "", -1, true, Tools.EffectColor[0]),
	RegenPM("Régénération de Point de Mana Assis", "", "Regen PM", "", -1, true, Tools.EffectColor[0]),
	MEN("Menace", "", "Menace", "", -1, true, Tools.EffectColor[0]),
	BoostCraft("Taux de réussite au Craft/Fortification", "", "Boost Craft", "", -1, true, Tools.EffectColor[0]),
	TimeCraft("Temps de Récolte/Entraînement/Craft", "", "Temps Craft", "", -1, true, Tools.EffectColor[0]),
	HealD("Soin Donné", "", "Soin Donné", "", -1, true, Tools.EffectColor[0]),
	HealR("Soin Reçu", "", "Soin Reçu", "", -1, true, Tools.EffectColor[0]),
	Bullet("Bonus d'Attaque à Distance", "", "Projectile", "", -1, true, Tools.EffectColor[7]),
	ReflectP("Dégât Physique Renvoyé", "", "Deg Phys Refl", "", -1, true, Tools.EffectColor[10]),
	ReflectM("Dégât Magique Renvoyé", "", "Deg Mag Refl", "", -1, true, Tools.EffectColor[11]),
	
	NONE("Aucun", "None", "Aucun", "None", -1, true, Tools.EffectColor[6]);
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final int max;
	public final boolean entier;
	public final Color color;
	
    private TypeEffect(String fr, String en, String abbrevFR, String abbrevEN, int max, boolean entier, Color color) {
    	this.fr = fr;
    	this.en = en;
    	this.abbrevFR = abbrevFR;
    	this.abbrevEN = abbrevEN;
        this.max = max;
        this.entier = entier;
        this.color = color;
    }

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public String getInfo(Language lang) {
		return lang == Language.FR ? this.abbrevFR : this.abbrevEN;
	}

	@Override
	public String getTooltip() {
		return this.fr;
	}
}
