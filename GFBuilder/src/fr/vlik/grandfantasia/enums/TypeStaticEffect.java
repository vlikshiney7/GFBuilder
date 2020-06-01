package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeStaticEffect implements Colorable, Writable {
	
	x2STD("Dégât x2 sur Coup Standard", "Damage x2 in standard hit", "DEG x2 STD", "DAM x2 STD", Tools.EffectColor[7]),
	x3STD("Dégât x3 sur Coup Standard", "Damage x3 in standard hit", "DEG x3 STD", "DAM x3 STD", Tools.EffectColor[10]),
	x2Skill("Dégât x2", "Damage x2", "DEG x2", "DAM x2", Tools.EffectColor[7]),
	x3Skill("Dégât x3", "Damage x3", "DEG x3", "DAM x3", Tools.EffectColor[10]),
	
	Poisse("Taux d'échec de compétence", "Casting Fail Rate", "Taux Poisse", "Fail Rate", Tools.EffectColor[8]),
	Immobilisation("Immobilisation", "Immobilization", "Immobilisation", "Immobilization", Tools.EffectColor[8]),
	NoSkill("Compétences bloquées", "Skills blocked", "Silence", "Anti Skills", Tools.EffectColor[8]),
	AntiItem("Objet bloqué", "Object blocked", "Anti Objet", "Anti Item", Tools.EffectColor[8]),
	Stun("Étourdissement", "Stun", "Stun", "Stun", Tools.EffectColor[8]),
	Sleep("Endormissement", "Sleep", "Sommeil", "Sleep", Tools.EffectColor[8]),
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[12]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[12]),
	Dispel("Suppression aléatoire d'un état négatif", "Auto dispel one random negative statut", "Dispel d'un malus", "Dispel one malus", Tools.EffectColor[0]),
	
	ProcT0N0("PM de l'ennemi -3500 ~ -5000", "Opponent MP -3500 ~ -5000", "PM -3500 ~ -5000", "MP -3500 ~ -5000", Tools.EffectColor[0]),
	ProcT0N1("Poison 4 : -200 PV chaque 2 secondes", "Poison 4 : -200 HP per 2 seconds", "-200 PV / 2s", "-200 HP / 2s", Tools.EffectColor[8]),
	ProcT1N0("Régénération de tout les PV et PM", "Restore all HP and MP", "Regen 100% PV/PM", "Regen 100% HP/MP", Tools.EffectColor[0]),
	
	ProcSetTDB("4000 points de bouclier", "4000 points of shield", "4000 pts de bouclier", "4000 pts of shield", Tools.EffectColor[0]),
	ProcSetSombre40("Bloque un dégât", "Bloc one damage", "Bloque un dégât", "Bloc one damage", Tools.EffectColor[0]),
	ProcSetSombre30("Absorption de 150 PV à l'ennemi", "150 of opponent's HP absorbing", "Absorbe 150 PV", "150 HP absorbing", Tools.EffectColor[0]),
	ProcSetEvo("Régénération de 10% PV", "Regeneration of 10% HP", "Regen 10% PV", "Regen 10% HP", Tools.EffectColor[0]),
	ProcSetC1PVE90("Régénération de 2% PV par seconde", "Regeneration of 2% HP per second", "+2% PV / s", "+2% HP / s", Tools.EffectColor[0]),
	ProcSetC3Lin80("Régénération de 380 PV chaque 2 secondes", "Regeneration of 380 HP per 2 seconds", "+380 PV / 2s", "+380 HP / 2s", Tools.EffectColor[0]),
	ProcSetC8GOLD90("-300 PV par seconde", "-300 HP per second", "-300 PV / s", "-300 HP / s", Tools.EffectColor[0]),
	ProcSetC8PVE100("Récupération de 1% PV et PM par seconde", "Recover HP and MP by 1% per second", "+1% PV et PM / s", "+1% HP and MP / s", Tools.EffectColor[0]),
	ProcSetC9PVP25("Rechargement de la Frappe foudroyante", "Lightning Stab cooldown reset", "Frappe foudroyante rechargé", "Lightning Stab reset", Tools.EffectColor[0]),
	ProcSetC11GOLD100("Absorption de 1000 PM à l'ennemi", "1000 of opponent's PM absorbing", "Absorbe 1000 PM", "1000 MP absorbing", Tools.EffectColor[0]),
	
	;
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final Color color;
	
    private TypeStaticEffect(String fr, String en, String abbrevFR, String abbrevEN, Color color) {
    	this.fr = fr;
    	this.en = en;
    	this.abbrevFR = abbrevFR;
    	this.abbrevEN = abbrevEN;
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
