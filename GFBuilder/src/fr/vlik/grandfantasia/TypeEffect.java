package fr.vlik.grandfantasia;

import java.awt.Color;

public enum TypeEffect {

	FCE("Force", "Strength", "FCE", "STR", 9999, true, Consts.EffectColor[1]),
	VIT("Vitalité", "Vitality", "VIT", "VIT", 9999, true, Consts.EffectColor[2]),
	INT("Intelligence", "Intelligence", "INT", "INT", 9999, true, Consts.EffectColor[3]),
	VOL("Volonté", "Will", "VOL", "WIL", 9999, true, Consts.EffectColor[4]),
	AGI("Agilité", "Agility", "AGI", "AGI", 9999, true, Consts.EffectColor[5]),
	Atk("Attaque", "Attack", "ATQ", "ATK", 60000, true, Consts.EffectColor[1]),
	AtkD("Attaque à Distance", "Range Attack", "ATQ D.", "R-ATK", 60000, true, Consts.EffectColor[5]),
	AtkM("Attaque Magique", "Magic Attack", "ATQ M.", "M-ATK", 60000, true, Consts.EffectColor[3]),
	DefP("Défense Physique", "Physical Defense", "DÉF", "DEF", 60000, true, Consts.EffectColor[2]),
	DefM("Défense Magique", "Magical Defense", "DÉF M.", "M-DEF", 60000, true, Consts.EffectColor[4]),
	TCCP("Taux Coup Critique Physique", "Chance of Physical Critical Hit", "TCCP", "", 100, false, Consts.EffectColor[5]),
	TCCM("Taux Coup Critique Magique", "Chance of Magical Critical Hit", "TCCM", "", 100, false, Consts.EffectColor[3]),
	ESQ("Esquive", "", "ESQ", "", -1, true, Consts.EffectColor[5]),
	Sacre("Résistance Sacré", "", "Res Sacré", "", -1, true, Consts.EffectColor[0]),
	Ombre("Résistance Ombre", "", "Res Ombre", "", -1, true, Consts.EffectColor[0]),
	Foudre("Résistance Foudre", "", "Res Foudre", "", -1, true, Consts.EffectColor[0]),
	Feu("Résistance Feu", "", "Res Feu", "", -1, true, Consts.EffectColor[0]),
	Glace("Résistance Glace", "", "Res Glace", "", -1, true, Consts.EffectColor[0]),
	Nature("Résistance Nature", "", "Res Nature", "", -1, true, Consts.EffectColor[0]),
	Toucher("Toucher", "", "Toucher", "", -1, true, Consts.EffectColor[0]),
	PV("Point de Vie", "", "PV", "", -1, true, Consts.EffectColor[2]),
	PM("Point de Mana", "", "PM", "", -1, true, Consts.EffectColor[4]),
	DegP("Dégât Physique", "", "DEG P", "", -1, true, Consts.EffectColor[0]), 
	DegM("Dégât Magique", "", "DEG M", "", -1, true, Consts.EffectColor[0]), 
	ReducP("Réduction Physique", "Physical Reduction", "Reduc Phys", "", -1, true, Consts.EffectColor[0]),
	ReducM("Réduction Magique", "Magical Reduction", "Reduc Mag", "", -1, true, Consts.EffectColor[0]),
	PeneP("Pénétration Physique", "Physical Penetration", "Péné Phys", "", -1, true, Consts.EffectColor[0]),
	PeneM("Pénétration Magique", "Magical Penetration", "Péné Mag", "", -1, true, Consts.EffectColor[0]),
	ReducPeneP("Réduction Pénétration Physique", "", "Red Pén Phys", "", -1, true, Consts.EffectColor[0]),
	ReducPeneM("Réduction Pénétration Magique", "", "Red Pén Mag", "", -1, true, Consts.EffectColor[0]),
	DCCP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DCCM("", "", "", "", -1, true, Consts.EffectColor[0]),
	RDCCP("", "", "", "", -1, true, Consts.EffectColor[0]),
	RDCCM("", "", "", "", -1, true, Consts.EffectColor[0]),
	RTCCP("", "", "", "", -1, true, Consts.EffectColor[0]),
	RTCCM("", "", "", "", -1, true, Consts.EffectColor[0]),
	VitAtk("", "", "", "", -1, true, Consts.EffectColor[0]),
	VitAtkD("", "", "", "", -1, true, Consts.EffectColor[0]),
	VitAtkM("", "", "", "", -1, true, Consts.EffectColor[0]),
	VitComp("", "", "", "", -1, true, Consts.EffectColor[0]),
	XP("", "", "", "", -1, true, Consts.EffectColor[0]),
	Loot("", "", "", "", -1, true, Consts.EffectColor[0]),
	RegenCB("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegBeteP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegPlanteP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegHumaP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegElemP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegMecaP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegMortP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegDemonP("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegBeteM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegPlanteM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegHumaM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegElemM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegMecaM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegMortM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegDemonM("", "", "", "", -1, true, Consts.EffectColor[0]),
	ReducAtk("", "", "", "", -1, true, Consts.EffectColor[0]),
	ReducAtkD("", "", "", "", -1, true, Consts.EffectColor[0]),
	ReducAtkM("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegSacre("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegOmbre("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegFoudre("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegFeu("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegGlace("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegNature("", "", "", "", -1, true, Consts.EffectColor[0]),
	IntComp("", "", "", "", -1, true, Consts.EffectColor[0]),
	CostComp("", "", "", "", -1, true, Consts.EffectColor[0]),
	ReloadComp("", "", "", "", -1, false, Consts.EffectColor[0]),
	Parade("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdEp("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdMa("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdHa("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStd2Ep("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStd2Ma("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStd2Ha("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdArc("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdGun("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdBa("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegStdLa("", "", "", "", -1, true, Consts.EffectColor[0]),
	DegAtkD("", "", "", "", -1, true, Consts.EffectColor[0]),
	RDegAtkD("", "", "", "", -1, true, Consts.EffectColor[0]),
	RegenPV("", "", "", "", -1, true, Consts.EffectColor[0]),
	RegenPM("", "", "", "", -1, true, Consts.EffectColor[0]),
	MEN("", "", "", "", -1, true, Consts.EffectColor[0]),
	BoostCraft("", "", "", "", -1, true, Consts.EffectColor[0]),
	TimeCraft("", "", "", "", -1, true, Consts.EffectColor[0]),
	HealD("", "", "", "", -1, true, Consts.EffectColor[0]),
	HealR("", "", "", "", -1, true, Consts.EffectColor[0]),
	Bullet("", "", "", "", -1, true, Consts.EffectColor[0]),
	Reflect("", "", "", "", -1, true, Consts.EffectColor[0]),
	Depla("", "", "", "", -1, true, Consts.EffectColor[0]);
	
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
}
