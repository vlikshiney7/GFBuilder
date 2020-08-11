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
	Push("Repousse l'ennemi", "Opponent push", "Push", "Push", Tools.EffectColor[8]),
	Sleep("Endormissement", "Sleep", "Sommeil", "Sleep", Tools.EffectColor[8]),
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[12]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[12]),
	AntiHeal("Soin bloqué", "Heal blocked", "Anti Soin", "Anti Heal", Tools.EffectColor[8]),
	Dispel("Suppression aléatoire d'un état négatif", "Auto dispel one random negative statut", "Dispel d'un malus", "Dispel one malus", Tools.EffectColor[0]),
	Block("Bloque un dégât", "Bloc one damage", "Bloque un dégât", "Bloc one damage", Tools.EffectColor[0]),
	Duo("Permet d'équiper 2 armes", "Allow to equip 2 weapons", "2 armes possible", "2 weapons allowed", Tools.EffectColor[0]),
	
	ProcT0N0("PM de l'ennemi -3500 ~ -5000", "Opponent MP -3500 ~ -5000", "PM -3500 ~ -5000", "MP -3500 ~ -5000", Tools.EffectColor[0]),
	ProcT0N1("Poison 4 : -200 PV chaque 2 secondes", "Poison 4 : -200 HP per 2 seconds", "-200 PV / 2s", "-200 HP / 2s", Tools.EffectColor[8]),
	ProcT6N0("Brûlure 2 : -50 PV chaque 2 secondes", "Burn 2 : -50 HP per 2 seconds", "-50 PV / 2s", "-50 HP / 2s", Tools.EffectColor[8]),
	ProcT10N0("-80 PV chaque 2 secondes", "-80 HP per 2 seconds", "-80 PV / 2s", "-80 HP / 2s", Tools.EffectColor[8]),
	ProcT10N1("-40 PV chaque 2 secondes", "-40 HP per 2 seconds", "-40 PV / 2s", "-40 HP / 2s", Tools.EffectColor[8]),
	
	ProcTDB0("PV de l'ennemi -700", "Opponent HP -700", "PV -700", "HP -700", Tools.EffectColor[0]),
	ProcTDB0C("PV de l'ennemi -3000", "Opponent HP -3000", "PV -3000", "HP -3000", Tools.EffectColor[0]),
	ProcTDB1C("PV de l'ennemi -1000", "Opponent HP -1000", "PV -1000", "HP -1000", Tools.EffectColor[0]),
	ProcTDB3("PV de l'ennemi -500", "Opponent HP -500", "PV -500", "HP -500", Tools.EffectColor[0]),
	ProcTDB4C("PV de l'ennemi -2000", "Opponent HP -2000", "PV -2000", "HP -2000", Tools.EffectColor[0]),
	ProcTDB5C("Dégâts d'attaque +3000", "Attack damage +3000", "Dégât +3000", "Damage +3000", Tools.EffectColor[0]),
	ProcTDB7C("5000 points de bouclier", "5000 points of shield", "5000 pts de bouclier", "5000 pts of shield", Tools.EffectColor[0]),
	
	ProcSetTDB("4000 points de bouclier", "4000 points of shield", "4000 pts de bouclier", "4000 pts of shield", Tools.EffectColor[0]),
	ProcSetC4NU80("Si PV<35%, régénération de 200~350 chaque 3 secondes", "If HP<35%, recover of 200~350 HP per 3 seconds", "Si PV<35%, +200~350 PV / 3s", "If HP<35%, +200~350 HP / 3s", Tools.EffectColor[0]),
	ProcSetC8GOLD90("PV de l'ennemi -300 par seconde", "Opponent HP -300 per second", "-300 PV / s", "-300 HP / s", Tools.EffectColor[0]),
	ProcSetC9PVP25("Rechargement de la Frappe foudroyante", "Lightning Stab cooldown reset", "Frappe foudroyante rechargé", "Lightning Stab reset", Tools.EffectColor[0]),
	
	ProSkillC1("20% réduction de dégât, maximum 3 coups", "20% damage reduction, 3 hits maximum", "20% reduc, max 3 coups", "20% reduc, 3 hits max", Tools.EffectColor[0]),
	ProSkillC6("Bloque 50% des dégâts, maximum 750 points", "50% damage blocked, 750 points maximum", "Bloque 50% deg, max 750 pts", "50% dam blocked, 750 pts max", Tools.EffectColor[0]),
	ProSkillC8("20% réduction de dégât, maximum 5 coups", "20% damage reduction, 5 hits maximum", "20% reduc, max 5 coups", "20% reduc, 5 hits max", Tools.EffectColor[0]),
	ProSkillC10L1("30% réduction de dégât, maximum 3 coups", "30% damage reduction, 3 hits maximum", "30% reduc, max 3 coups", "30% reduc, 3 hits max", Tools.EffectColor[0]),
	ProSkillC10L2("40% réduction de dégât, maximum 3 coups", "40% damage reduction, 3 hits maximum", "40% reduc, max 3 coups", "40% reduc, 3 hits max", Tools.EffectColor[0]),
	
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
