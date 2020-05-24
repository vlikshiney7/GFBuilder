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
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[12]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[12]),
	Dispel("Suppression aléatoire d'un état négatif", "Auto dispel one random negative statut", "Dispel d'un malus", "Dispel one malus", Tools.EffectColor[0]),
	
	ProcT0L80Q5("PM de l'ennemi -3500 ~ -5000", "Opponent MP -3500 ~ -5000", "PM -3500 ~ -5000", "MP -3500 ~ -5000", Tools.EffectColor[0]),
	ProcT0L48Q4("Poison 4 : -200 PV chaque 2 secondes", "Poison 4 : -200 HP per 2 seconds", "-200 PV / 2s", "-200 HP / 2s", Tools.EffectColor[8]),
	
	ProcSetTDB("4000 points de bouclier", "4000 points of shield", "4000 pts de bouclier", "4000 pts of shield", Tools.EffectColor[0]),
	ProcSetSombre40("Bloque un dégât", "Bloc one damage", "Bloque un dégât", "Bloc one damage", Tools.EffectColor[0]),
	ProcSetSombre30("Absorption de 150 PV à l'ennemi", "150 of opponent's HP absorbing", "Absorbe 150 PV", "150 HP absorbing", Tools.EffectColor[0]),
	ProcSetEvo("Régénération de 10% PV", "Regeneration of 10% HP", "Regen 10% PV", "Regen 10% HP", Tools.EffectColor[0]),
	ProcSetC1PVE90("Régénération de 2% PV par seconde", "Regeneration of 2% HP per second", "+2% PV / s", "+2% HP / s", Tools.EffectColor[0]),
	ProcSetC3Lin80("Régénération de 380 PV chaque 2 secondes", "Regeneration of 380 HP per 2 seconds", "+380 PV / 2s", "+380 HP / 2s", Tools.EffectColor[0]),
	ProcSetC8GOLD90("-300 PV par seconde", "-300 HP per second", "-300 PV / s", "-300 HP / s", Tools.EffectColor[0]),
	ProcSetC8GOLD80("Recharge des compétences de 1s", "Skills cooldown decrease by 1s", "Recharge comp 1s", "Reload skill 1s", Tools.EffectColor[0]),
	ProcSetC11GOLD100("Absorption de 1000 PM à l'ennemi", "1000 of opponent's PM absorbing", "Absorbe 1000 PM", "1000 MP absorbing", Tools.EffectColor[0]),
	ProcSetC11PVP00("Rechargement des compétences de 1s sur critique reçu", "Skill cooldown reduction of 1s when receive critical hit", "Compétence -1s critique reçu", "-1s skill cooldown critical hit", Tools.EffectColor[0]),
	
	SkillC0N1("Durée de Fureur du Gladiateur +10s", "Warlord Fury duration +10s", "Fureur du Gladiateur +10s", "Warlord Fury +10s", Tools.EffectColor[0]),
	SkillC0N2("Dégât de Choc Sismique +40%", "Ground Pulse Wave damage +40%", "Choc Sismique +40%", "Ground Pulse Wave +40%", Tools.EffectColor[0]),
	SkillC0N3("Dégât de Brèche de la Violente Tornade +30%", "Wild Whirlwind Slash damage +30%", "Brèche de la Violente Tornade +30%", "Wild Whirlwind Slash +30%", Tools.EffectColor[0]),
	SkillC0N4("Durée de Danse du chaos +20s", "Dance of Chaos duration +20s", "Danse du chaos +20s", "Dance of Chaos +20s", Tools.EffectColor[0]),
	SkillC0N5("Dégât de Frappe de Déferlement d'Air +50%", "Skybreaker Strike damage +50%", "Frappe de Déferlement d'Air +50%", "Skybreaker Strike +50%", Tools.EffectColor[0]),
	SkillC0N6("Dégâts de Méga Tornade +75%", "Super Twister's Chop damage +75%", "Méga Tornade +75%", "Super Twister's Chop +75%", Tools.EffectColor[0]),
	SkillC0N7("Dégâts de Méga Tornade +50%", "Super Twister's Chop damage +50%", "Méga Tornade +50%", "Super Twister's Chop +50%", Tools.EffectColor[0]),
	SkillC0N8("Dégâts d'Entaille de la Violente Tornade +33%", "Wild Whirlwind Slash damage +33%", "Entaille de la Violente Tornade +33%", "Wild Whirlwind Slash +33%", Tools.EffectColor[0]),
	SkillC0N9("Dégâts d'Entaille de la Violente Tornade +30%", "Wild Whirlwind Slash damage +30%", "Entaille de la Violente Tornade +30%", "Wild Whirlwind Slash +30%", Tools.EffectColor[0]),
	SkillC0N10("Dégâts d'Entaille de la Violente Tornade +22%", "Wild Whirlwind Slash damage +22%", "Entaille de la Violente Tornade +22%", "Wild Whirlwind Slash +22%", Tools.EffectColor[0]),
	SkillC0N11("Dégâts d'Entaille de la Violente Tornade +20%", "Wild Whirlwind Slash damage +20%", "Entaille de la Violente Tornade +20%", "Wild Whirlwind Slash +20%", Tools.EffectColor[0]),
	SkillC0N12("Dégâts d'Entaille de la Violente Tornade +12%", "Wild Whirlwind Slash damage +12%", "Entaille de la Violente Tornade +12%", "Wild Whirlwind Slash +12%", Tools.EffectColor[0]),
	SkillC0N13("Dégâts d'Entaille de la Violente Tornade +10%", "Wild Whirlwind Slash damage +10%", "Entaille de la Violente Tornade +10%", "Wild Whirlwind Slash +10%", Tools.EffectColor[0]),
	SkillC0N14("Dégâts de Magma Terrestre +30%", "Earth's Core Impact damage +30%", "Magma Terrestre +30%", "Earth's Core Impact +30%", Tools.EffectColor[0]),
	SkillC0N15("Dégâts de Souffle Ravageur +30%", "Shattering Blow damage +30%", "Souffle Ravageur +30%", "Shattering Blow +30%", Tools.EffectColor[0]),
	SkillC0N16("Dégâts de Choc Terrestre +30%", "Earth Shock damage +30%", "Choc Terrestre +30%", "Earth Shock +30%", Tools.EffectColor[0]),
	SkillC0N17("Dégâts de Vague de Pouvoir +30%", "Power Wave damage +30%", "Vague de Pouvoir +30%", "Power Wave +30%", Tools.EffectColor[0]),
	SkillC0N18("Dégâts de Magma Terrestre +25%", "Earth's Core Impact damage +25%", "Magma Terrestre +25%", "Earth's Core Impact +25%", Tools.EffectColor[0]),
	SkillC0N19("Dégâts de Souffle Destructeur +25%", "Crushing Blow damage +25%", "Souffle Destructeur +25%", "Crushing Blow +25%", Tools.EffectColor[0]),
	SkillC0N20("Dégâts de Choc Sismique +25%", "Ground Pulse Wave damage +25%", "Choc Sismique +25%", "Ground Pulse Wave +25%", Tools.EffectColor[0]),
	
	SkillC1N1("Dégât de Lame Ensanglantée +50%", "Carnage Blade Strike damage +50%", "Lame Ensanglantée +50%", "Carnage Blade Strike +50%", Tools.EffectColor[0]),
	SkillC1N2("Durée de Lame de Vertu +15s", "Saintly Blade duration +15s", "Lame de Vertu +15s", "Saintly Blade +15s", Tools.EffectColor[0]),
	SkillC1N3("Dégât de Coup de Justice +50%", "Strike of Justice damage +50%", "Coup de Justice +50%", "Strike of Justice +50%", Tools.EffectColor[0]),
	SkillC1N4("Durée de Bouclier vengeur +12s", "Shield of Thorns duration +12s", "Bouclier vengeur +12s", "Shield of Thorns +12s", Tools.EffectColor[0]),
	SkillC1N5("Durée de Lame sacrée +15s", "Edge of Righteousness duration +15s", "Lame sacrée +15s", "Edge of Righteousness +15s", Tools.EffectColor[0]),
	SkillC1N6("Dégât de Frappe du Bouclier Puissant +50%", "Mighty Shield Bash damage +50%", "Frappe du Bouclier Puissant +50%", "Mighty Shield Bash +50%", Tools.EffectColor[0]),
	SkillC1N7("Dégâts d'Embrasement Sacré +75%", "Super Holy Blaze damage +75%", "Embrasement Sacré +75%", "Super Holy Blaze +75%", Tools.EffectColor[0]),
	SkillC1N8("Dégâts d'Embrasement Sacré +50%", "Super Holy Blaze damage +50%", "Embrasement Sacré +50%", "Super Holy Blaze +50%", Tools.EffectColor[0]),
	SkillC1N9("Dégâts de Radiance Éternelle +44%", "Eternal Radiance damage +44%", "Radiance Éternelle +44%", "Eternal Radiance +44%", Tools.EffectColor[0]),
	SkillC1N10("Dégâts de Radiance Éternelle +40%", "Eternal Radiance damage +40%", "Radiance Éternelle +40%", "Eternal Radiance damage +40%", Tools.EffectColor[0]),
	SkillC1N11("Dégâts de Radiance Éternelle +27%", "Eternal Radiance damage +27%", "Radiance Éternelle +27%", "Eternal Radiance +27%", Tools.EffectColor[0]),
	SkillC1N12("Dégâts de Radiance Éternelle +25%", "Eternal Radiance damage +25%", "Radiance Éternelle +25%", "Eternal Radiance damage +25%", Tools.EffectColor[0]),
	SkillC1N13("Dégâts de Coup de Bouclier Puissant +12%", "Mighty Shield Bash damage +12%", "Coup de Bouclier Puissant +12%", "Mighty Shield Bash +12%", Tools.EffectColor[0]),
	SkillC1N14("Dégâts de Coup de Bouclier Puissant +10%", "Mighty Shield Bash damage +10%", "Coup de Bouclier Puissant +10%", "Mighty Shield Bash +10%", Tools.EffectColor[0]),
	SkillC1N15("Dégâts de Brise-Armure +30%", "Armor-Cracking Assault damage +30%", "Brise-Armure +30%", "Armor-Cracking Assault +30%", Tools.EffectColor[0]),
	SkillC1N16("Dégâts de Coup de Bouclier Lourd +30%", "Shield Smite damage +30%", "Coup de Bouclier Lourd +30%", "Shield Smite +30%", Tools.EffectColor[0]),
	SkillC1N17("Dégâts de Grenade du Sacré +25%", "Holy Light Grenade damage +25%", "Grenade du Sacré +25%", "Holy Light Grenade +25%", Tools.EffectColor[0]),
	SkillC1N18("Dégâts de Coup Sacré +30%", "Holy Strike damage +30%", "Coup Sacré +30%", "Holy Strike +30%", Tools.EffectColor[0]),
	SkillC1N19("Dégâts de Brise-Armure +35%", "Armor-Cracking Assault damage +35%", "Brise-Armure +35%", "Armor-Cracking Assault +35%", Tools.EffectColor[0]),
	SkillC1N20("Dégâts de Coup de Bouclier Puissant +25%", "Mighty Shield Bash damage +25%", "Coup de Bouclier Puissant +25%", "Mighty Shield Bash +25%", Tools.EffectColor[0]),
	
	SkillC2N1("Dégât de Tir puissant +35%", "Power Shot damage +35%", "Tir puissant +35%", "Power Shot +35%", Tools.EffectColor[0]),
	
	SkillC3N1("Dégât de Coup Mortel +80%", "Lethal Strike damage +80%", "Coup Mortel +80%", "Lethal Strike +80%", Tools.EffectColor[0]),
	SkillC3N2("Dégât de Lame des Ténèbres +50%", "Dark Stab damage +50%", "Lame des Ténèbres +50%", "Dark Stab +50%", Tools.EffectColor[0]),
	SkillC3N3("Dégât d'Épine de l'Ombre Trouble +30%", "Blurred Shadow Thorn damage +30%", "Épine de l'Ombre Trouble +30%", "Blurred Shadow Thorn +30%", Tools.EffectColor[0]),
	SkillC3N4("Dégât de Furtive du Démon +50%", "Shadow Demon Strike damage +50%", "Furtive du Démon +50%", "Shadow Demon Strike +30%", Tools.EffectColor[0]),
	SkillC3N5("Dégât de Coup Mortel +100%", "Lethal Strike damage +100%", "Coup Mortel +100%", "Lethal Strike +100%", Tools.EffectColor[0]),
	SkillC3N6("Dégât de Coup Mortel +75%", "Lethal Strike damage +75%", "Coup Mortel +75%", "Lethal Strike +75%", Tools.EffectColor[0]),
	SkillC3N7("Dégât de Coup de Grâce +33%", "Coup de Grâce damage +33%", "Coup de Grâce +33%", "Coup de Grâce +33%", Tools.EffectColor[0]),
	SkillC3N8("Dégât de Coup de Grâce +30%", "Coup de Grâce damage +30%", "Coup de Grâce +30%", "Coup de Grâce +30%", Tools.EffectColor[0]),
	SkillC3N9("Dégât de Coup de Grâce +22%", "Coup de Grâce damage +22%", "Coup de Grâce +22%", "Coup de Grâce +22%", Tools.EffectColor[0]),
	SkillC3N10("Dégât de Coup de Grâce +20%", "Coup de Grâce damage +20%", "Coup de Grâce +20%", "Coup de Grâce +20%", Tools.EffectColor[0]),
	SkillC3N11("Durée de Réflexes de Mangouste +7s", "Mongoose Reflexes duration +7s", "Réflexes de Mangouste +7s", "Mongoose Reflexes +7s", Tools.EffectColor[0]),
	SkillC3N12("Durée de Réflexes de Mangouste +6s", "Mongoose Reflexes duration +6s", "Réflexes de Mangouste +6s", "Mongoose Reflexes +6s", Tools.EffectColor[0]),
	SkillC3N13("Dégât de Coup de Grâce +17%", "Coup de Grâce damage +17%", "Coup de Grâce +17%", "Coup de Grâce +17%", Tools.EffectColor[0]),
	SkillC3N14("Dégât de Coup de Grâce +15%", "Coup de Grâce damage +15%", "Coup de Grâce +15%", "Coup de Grâce +15%", Tools.EffectColor[0]),
	SkillC3N15("Dégât d'Épine de l'Ombre +20%", "Shadow Stab damage +20%", "Épine de l'Ombre +20%", "Shadow Stab +20%", Tools.EffectColor[0]),
	SkillC3N16("Dégât de Contre-la-Montre Dégénéré +35%", "Enhanced Clock Cleaner damage +35%", "Contre-la-Montre Dégénéré +35%", "Enhanced Clock Cleaner +35%", Tools.EffectColor[0]),
	SkillC3N17("Dégât de Baiser de la Faucheuse +25%", "Reaper's Kiss damage +25%", "Baiser de la Faucheuse +25%", "Reaper's Kiss +25%", Tools.EffectColor[0]),
	SkillC3N18("Dégât de Furtive du Démon +25%", "Shadow Demon Strike damage +25%", "Furtive du Démon +25%", "Shadow Demon Strike +25%", Tools.EffectColor[0]),
	
	SkillC8N1("Dégât d'Impact nucléaire +40%", "Nuclear Impact damage +40%", "Impact nucléaire +40%", "Nuclear Impact +40%", Tools.EffectColor[0]),
	
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
