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
	
	Atk("Attaque", "Attack", "ATQ", "ATK", 60000, true, true, Tools.EffectColor[1]),
	AtkD("Attaque à Distance", "Range Attack", "ATQ D.", "R-ATK", 60000, true, true, Tools.EffectColor[5]),
	AtkM("Attaque Magique", "Magic Attack", "ATQ M.", "M-ATK", 60000, true, true, Tools.EffectColor[3]),
	
	DefP("Défense Physique", "Physical Defense", "DÉF", "DEF", 60000, true, true, Tools.EffectColor[2]),
	DefM("Défense Magique", "Magical Defense", "DÉF M.", "M-DEF", 60000, true, true, Tools.EffectColor[4]),
	TCCP("Taux Coup Critique Physique", "Chance of Physical Critical Hit", "TCCP", "CRIT", 100, false, Tools.EffectColor[5]),
	TCCM("Taux Coup Critique Magique", "Chance of Magical Critical Hit", "TCCM", "M-CRIT", 100, false, Tools.EffectColor[3]),
	ESQ("Esquive", "Evade", "ESQ", "Evade", -1, true, Tools.EffectColor[5]),
	
	Sacre("Résistance Sacré", "Holy Resistance", "Res Sacré", "Holy Res", -1, true, Tools.EffectColor[7]),
	Ombre("Résistance Ombre", "Dark Resistance", "Res Ombre", "Dark Res", -1, true, Tools.EffectColor[8]),
	Foudre("Résistance Foudre", "Lightning Resistance", "Res Foudre", "Lightning Res", -1, true, Tools.EffectColor[9]),
	Feu("Résistance Feu", "Fire Resistance", "Res Feu", "Fire Res", -1, true, Tools.EffectColor[10]),
	Glace("Résistance Glace", "Ice Resistance", "Res Glace", "Ice Res", -1, true, Tools.EffectColor[11]),
	Nature("Résistance Nature", "Nature Resistance", "Res Nature", "Nature Res", -1, true, Tools.EffectColor[12]),
	
	PV("Points de Vie", "Health Points", "PV", "HP", -1, true, Tools.EffectColor[2]),
	PM("Points de Mana", "Mana Points", "PM", "MP", -1, true, Tools.EffectColor[4]),
	Toucher("Toucher", "Hit", "Toucher", "Hit", -1, false, Tools.EffectColor[11]), // DELETE
	ToucherP("Toucher Mêlée", "Melee Hit", "Toucher Mel", "Mel Hit", -1, false, Tools.EffectColor[11]),
	ToucherD("Toucher Distance/Magique", "Range/Magical Hit", "Toucher Dist/Mag", "Range/Mag Hit", -1, false, Tools.EffectColor[11]),
	
	DegStdP("Dégât Standard Mêlée", "Melee Standard Damage", "Deg Std Mel", "Mel Std Dam", -1, true, Tools.EffectColor[10]),
	DegStdD("Dégât Standard Distance", "Range Standard Damage", "Deg Std Dist", "Range Std Dam", -1, true, Tools.EffectColor[7]),
	DegSkillP("Dégât Compétence Physique", "Physical Skill Damage", "Deg Comp Phys", "Phys Sk Dam", -1, true, Tools.EffectColor[10]),
	DegSkillM("Dégât Compétence Magique", "Magical Skill Damage", "Deg Comp Mag", "Mag Sk Dam", -1, true, Tools.EffectColor[11]),
	
	ReducStdP("Réduction Dégât Standard Mêlée", "Melee Standard Damage Reduction", "Red Std Mel", "Mel Std Red", -1, true, Tools.EffectColor[10]),
	ReducStdD("Réduction Dégât Standard Distance", "Range Standard Damage Reduction", "Red Std Dist", "Range Std Red", -1, true, Tools.EffectColor[7]),
	ReducSkillP("Réduction Dégât Compétence Physique", "Physical Skill Damage Reduction", "Red Comp Phys", "Phys Sk Red", -1, true, Tools.EffectColor[10]),
	ReducSkillM("Réduction Dégât Compétence Magique", "Magical Skill Damage Reduction", "Red Comp Mag", "Mag Sk Red", -1, true, Tools.EffectColor[11]),
	
	DegP_old("Dégât Physique", "Physical Damage", "Deg Phys", "Phys Dam", -1, true, Tools.EffectColor[10]), // DELETE
	DegM_old("Dégât Magique", "Magical Damage", "Deg Mag", "Mag Dam", -1, true, Tools.EffectColor[11]), // DELETE
	ReducP_old("Réduction Physique", "Physical Reduction", "Reduc Phys", "Phys Reduc", -1, true, Tools.EffectColor[10]), // DELETE
	ReducM_old("Réduction Magique", "Magical Reduction", "Reduc Mag", "Mag Reduc", -1, true, Tools.EffectColor[11]), // DELETE
	
	PeneP("Pénétration Physique", "Physical Penetration", "Péné Phys", "Phys Pene", 100, false, Tools.EffectColor[10]),
	PeneM("Pénétration Magique", "Magical Penetration", "Péné Mag", "Mag Pene", 100, false, Tools.EffectColor[11]),
	ReducPeneP("Réduction Pénétration Physique", "Physical Penetration Reduction", "Red Pén Phys", "Phys Pene Red", -1, true, Tools.EffectColor[10]),
	ReducPeneM("Réduction Pénétration Magique", "Magical Penetration Reduction", "Red Pén Mag", "Mag Pene Red", -1, true, Tools.EffectColor[11]),
	
	DCCP("Dégât Coup Critique Physique", "Critical Physical Hit Damage", "Deg Crit Phys", "Crit Phys Dam", 150, false, Tools.EffectColor[10]),
	DCCM("Dégât Coup Critique Magique", "Critical Magical Hit Damage", "Deg Crit Mag", "Crit Mag Dam", 150, false, Tools.EffectColor[11]),
	RDCCP("Réduction Dégât Coup Critique Physique", "Critical Physical Hit Damage Reduction", "Red Dg Crt Ph", "Crt Ph Dam Red", -1, false, Tools.EffectColor[10]),
	RDCCM("Réduction Dégât Coup Critique Magique", "Critical Magical Hit Damage Reduction", "Red Dg Crt Mg", "Crt Mg Dam Red", -1, false, Tools.EffectColor[11]),
	RTCCP("Réduction Taux Coup Critique Physique", "Critical Physical Hit Rate Reduction", "Red Tx Crt Ph", "Crt Ph Rate Red", -1, true, Tools.EffectColor[10]),
	RTCCM("Réduction Taux Coup Critique Magique", "Critical Magical Hit Rate Reduction", "Red Tx Crt Mg", "Crt Mg Rate Red", -1, true, Tools.EffectColor[11]),
	
	//A REVOIR
	VitAtk("Vitesse d'Attaque Mêlée", "Physical Attack Speed", "Vit Atk Mel", "Phys Atk Sp", -1, true, Tools.EffectColor[10]),
	VitAtkD("Vitesse d'Attaque Distance", "Range Attack Speed", "Vit Atk Dist", "Range Atk Sp", -1, true, Tools.EffectColor[7]),
	VitAtkM("Vitesse d'Attaque Magique", "Magical Attack Speed", "Vit Atk Mag", "Mag Atk Sp", -1, true, Tools.EffectColor[11]),
	VitComp("Vitesse d'Incantation", "Cast Speed", "Vit Incant", "Cast Speed", 100, false, Tools.EffectColor[0]),
	Depla("Vitesse de Déplacement", "Run Speed", "Vit Depla", "Run Speed", 200, false, Tools.EffectColor[0]),
	
	VitAtkArc("Vitesse d'Attaque à l'Arc", "Bow Attack Speed", "Vit Atk Arc", "Bow Atk Sp", -1, true, Tools.EffectColor[10]),
	VitAtkGun("Vitesse d'Attaque au Gun/Canon", "Gun/Canon Attack Speed", "Vit Atk Gun/Can", "Gun/Can Atk Sp", -1, true, Tools.EffectColor[10]),
	
	DegAtkAll("Dégât d'attaque augmenté", "", "Deg Atq Aug", "", -1, true, Tools.EffectColor[0]),
	DegAtk("Dégât d'Attaque", "", "Deg Atq", "", -1, true, Tools.EffectColor[7]),
	DegAtkD("Dégât d'Attaque Distance", "", "Deg Atq Dist", "", -1, true, Tools.EffectColor[7]),
	DegAtkM("Dégât d'Attaque Magique", "", "Deg Atq Mag", "", -1, true, Tools.EffectColor[7]),
	
	ReducAtk("Réduction d'Attaque Mêlée", "", "Reduc Atq Mel", "", -1, true, Tools.EffectColor[10]), // DELETE
	ReducAtkD("Réduction d'Attaque Distance", "", "Reduc Atq Dist", "", -1, true, Tools.EffectColor[7]), // DELETE
	ReducAtkM("Réduction d'Attaque Magique", "", "Reduc Atq Mag", "", -1, true, Tools.EffectColor[11]), // DELETE
	
	RDegAtkD("Réduction de Dégât d'Attaque Distance", "", "Red Dg Dist", "", -1, true, Tools.EffectColor[7]), // DELETE

	ReducPtsP("Réduction Point Phyique", "", "Red Pts Phys", "", -1, true, Tools.EffectColor[10]),
	ReducPtsM("Réduction Point Magique", "", "Red Pts Mag", "", -1, true, Tools.EffectColor[11]),
	ReducStd("Réduction Standard", "", "Reduc Std", "", -1, true, Tools.EffectColor[0]),
	ReducComp("Réduction Compétence", "", "Reduc Comp", "", -1, true, Tools.EffectColor[0]),
	
	DegSacre("Dégât Sacré", "Holy Damage", "Deg Sacre", "Holy Dam", -1, true, Tools.EffectColor[7]),
	DegOmbre("Dégât Ombre", "Dark Damage", "Deg Ombre", "Dark Dam", -1, true, Tools.EffectColor[8]),
	DegFoudre("Dégât Foudre", "Lighting Damage", "Deg Foudre", "Lighting Dam", -1, true, Tools.EffectColor[9]),
	DegFeu("Dégât Feu", "Fire Damage", "Deg Feu", "Fire Dam", -1, true, Tools.EffectColor[10]),
	DegGlace("Dégât Glace", "Ice Damage", "Deg Glace", "Ice Dam", -1, true, Tools.EffectColor[11]),
	DegNature("Dégât Nature", "Natural Damage", "Deg Nature", "Natural Dam", -1, true, Tools.EffectColor[12]),
	
	XP("Bonus d'Expérience", "Experience bonus", "XP", "EXP", 400, true, Tools.EffectColor[0]),
	Loot("Bonus de Butin", "Loot bonus", "Butin", "Loot", 200, true, Tools.EffectColor[0]),
	
	DegDuo("Dégât Deux Armes", "Two Weapons Damage", "Deg 2 Armes", "2 Weap Dam", -1, false, Tools.EffectColor[0]),
	VitAtkDuo("Vitesse d'Attaque à Deux Armes", "Two Weapons Attack Speed", "Vit Atk 2 Ar", "2 Weap Atk Sp", -1, true, Tools.EffectColor[0]),
	TCC1M("Taux Critique Arme 1 Main", "", "Taux Crit 1M", "", -1, true, Tools.EffectColor[0]),
	TCC2M("Taux Critique Arme 2 Main", "", "Taux Crit 2M", "", -1, true, Tools.EffectColor[0]),
	TCCD("Taux Critique à Distance", "", "Taux Crit Dist", "", -1, true, Tools.EffectColor[0]),
	DCC1M("Dégât Critique Arme 1 Main", "", "Deg Crit 1M", "", -1, true, Tools.EffectColor[0]),
	DCC2M("Dégât Critique Arme 2 Main", "", "Deg Crit 2M", "", -1, true, Tools.EffectColor[0]),
	RegenCB("Régénération Coup Standard", "Standard Hit Regeneration", "Regen Coup Std", "Std Hit Regen", -1, false, Tools.EffectColor[0]),
	RegenM("Régénération Magique", "Magical Regeneration", "Regen Coup Mag", "Mag Regen", -1, false, Tools.EffectColor[0]),
	
	DegStd("Dégât Standard", "Stardard Damage", "Deg Std", "Std Dam", -1, true, Tools.EffectColor[0]), // DELETE
	DegStdPts("Dégât Standard", "Stardard Damage", "Deg Std", "Std Dam", -1, true, Tools.EffectColor[0]), // DELETE
	
	DCCMa("Dégât Critique au Maillet", "", "Deg Crit Ma 1M", "", -1, true, Tools.EffectColor[0]),
	TCCHa("Taux Critique à la Hache", "", "Taux Crit Ha 1M", "", -1, true, Tools.EffectColor[0]),
	TCCCanon("Taux Critique au Canon", "", "Taux Crit Can", "", -1, true, Tools.EffectColor[0]),
	
	DegStdMeca("Dégât Standard à l'arme Mécanique", "", "Deg Std Mec 1M", "", -1, true, Tools.EffectColor[0]), // DELETE
	DegStdMeca2M("Dégât Standard à l'arme Mécanique 2 Main", "", "Deg Std Mec 2M", "", -1, true, Tools.EffectColor[0]), // DELETE

	DegEp("Dégât à l'Épée", "", "Deg Ep 1M", "", -1, false, Tools.EffectColor[0]),
	DegMa("Dégât au Maillet", "", "Deg Ma 1M", "", -1, false, Tools.EffectColor[0]),
	DegHa("Dégât à la Hache", "", "Deg Ha 1M", "", -1, false, Tools.EffectColor[0]),
	DegEp2M("Dégât à l'Épée 2 Main", "", "Deg Ep 2M", "", -1, false, Tools.EffectColor[0]),
	DegMa2M("Dégât au Maillet 2 Main", "", "Deg Ma 2M", "", -1, false, Tools.EffectColor[0]),
	DegHa2M("Dégât à la Hache 2 Main", "", "Deg Ha 2M", "", -1, false, Tools.EffectColor[0]),
	DegMeca1M("Dégât à l'arme Méca", "", "Deg Meca 1M", "", -1, false, Tools.EffectColor[0]),
	DegMeca2M("Dégât à l'arme Méca 2 Main", "", "Deg Meca 2M", "", -1, false, Tools.EffectColor[0]),
	DegArc("Dégât à l'Arc", "", "Deg Arc", "", -1, true, Tools.EffectColor[0]),
	DegGun("Dégât au Pistolet", "", "Deg Gun", "", -1, true, Tools.EffectColor[0]),
	DegCanon("Dégât au Canon", "", "Deg Canon", "", -1, true, Tools.EffectColor[0]),
	DegLa("Dégât à la Lame", "", "Deg Lame", "", -1, true, Tools.EffectColor[0]),
	DegCle("Dégât à la Clé", "", "Deg Clé", "", -1, true, Tools.EffectColor[0]),
	
	DegBete("Dégât sur Bête", "", "Deg Bete", "", -1, true, Tools.EffectColor[0]),
	DegPlante("Dégât sur Plante", "", "Deg Plante", "", -1, true, Tools.EffectColor[0]),
	DegHuma("Dégât sur Humanoïde", "", "Deg Huma", "", -1, true, Tools.EffectColor[0]),
	DegElem("Dégât sur Élémentaire", "", "Deg Elem", "", -1, true, Tools.EffectColor[0]),
	DegMeca("Dégât sur Mécanique", "", "Deg Meca", "", -1, true, Tools.EffectColor[0]),
	DegMort("Dégât sur Mort-Vivant", "", "Deg Mort", "", -1, true, Tools.EffectColor[0]),
	DegDemon("Dégât sur Démon", "", "Deg Demon", "", -1, true, Tools.EffectColor[0]),
	
	IntComp("Interruption de Compétence", "", "Inter Comp", "", -1, true, Tools.EffectColor[0]),
	CostComp("Coût de Compétence", "", "Coût Comp", "", -1, true, Tools.EffectColor[0]),
	ReloadComp("Rechargement de Compétence", "Reload Skill", "Recharge Comp", "Reload Skill", -1, false, Tools.EffectColor[0]),
	Parade("Parade", "Block", "Parade", "Block", -1, true, Tools.EffectColor[0]),
	RParade("Dégât Parés", "", "Reduc Parade", "", -1, true, Tools.EffectColor[0]),
	
	RegenPV("Régénération de Point de Vie Assis", "", "Regen PV", "", -1, false, Tools.EffectColor[0]),
	RegenPM("Régénération de Point de Mana Assis", "", "Regen PM", "", -1, false, Tools.EffectColor[0]),
	CostPV("Coût en PV", "", "Coût PV", "", -1, false, Tools.EffectColor[0]),
	MEN("Menace", "", "Menace", "", -1, true, Tools.EffectColor[0]), // A REVOIR
	HealD("Soin Donné", "", "Soin Donné", "", -1, true, Tools.EffectColor[0]),
	HealR("Soin Reçu", "", "Soin Reçu", "", -1, true, Tools.EffectColor[0]),
	Bullet("Bonus d'Attaque à Distance", "", "Projectile", "", -1, true, Tools.EffectColor[7]),
	ReflectP("Dégât Physique Renvoyé", "", "Deg Phys Refl", "", -1, true, Tools.EffectColor[10]),
	ReflectM("Dégât Magique Renvoyé", "", "Deg Mag Refl", "", -1, true, Tools.EffectColor[11]),
	ReflectPene("Dégât Pénétration Renvoyé", "", "Deg Péné Refl", "", -1, true, Tools.EffectColor[7]),
	Shield("Bouclier de dégât", "Shield damage", "Bouclier", "Shield", -1, true, Tools.EffectColor[0]),
	Poisse("Taux d'échec de compétence", "Casting Fail Rate", "Taux Poisse", "Fail Rate", 100, true, Tools.EffectColor[0]),
	
	BoostCraft("Taux de réussite au Craft/Fortification", "", "Boost Craft", "", -1, true, Tools.EffectColor[0]),
	TimeCraft("Temps de Récolte/Entraînement/Craft", "", "Temps Craft", "", -1, true, Tools.EffectColor[0]),
	Mine("Matériaux Bonus Mine", "", "Mine", "", -1, true, Tools.EffectColor[0]),
	Chasse("Matériaux Bonus Chasse", "", "Chasse", "", -1, true, Tools.EffectColor[0]),
	Cueillete("Matériaux Bonus Cueilette", "", "Cueillette", "", -1, true, Tools.EffectColor[0]),
	Material("Matériel Sup.", "Sup. Material", "Matériel Sup.", "Sup. Material", -1, true, Tools.EffectColor[0]),
	
	NONE("Aucun", "None", "Aucun", "None", -1, true, Tools.EffectColor[6]);
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final int max;
	public final boolean entier;
	public final boolean isUpgradable;
	public final Color color;
	
    private TypeEffect(String fr, String en, String abbrevFR, String abbrevEN, int max, boolean entier, Color color) {
    	this.fr = fr;
    	this.en = en;
    	this.abbrevFR = abbrevFR;
    	this.abbrevEN = abbrevEN;
        this.max = max;
        this.entier = entier;
        this.isUpgradable = false;
        this.color = color;
    }
    
    private TypeEffect(String fr, String en, String abbrevFR, String abbrevEN, int max, boolean entier, boolean isUpgradable, Color color) {
    	this.fr = fr;
    	this.en = en;
    	this.abbrevFR = abbrevFR;
    	this.abbrevEN = abbrevEN;
        this.max = max;
        this.entier = entier;
        this.isUpgradable = isUpgradable;
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
	
	public static TypeEffect get(String name, Language lang) {
		for(TypeEffect type : TypeEffect.values()) {
			if(type.getInfo(lang).equals(name)) {
				return type;
			}
		}
		
		return null;
	}
}
