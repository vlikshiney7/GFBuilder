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
	NoMove("Immobilisation", "Immobilization", "Immobilisation", "Immobilization", Tools.EffectColor[8]),
	NoSkill("Compétences bloquées", "Skills blocked", "Silence", "Anti Skills", Tools.EffectColor[8]),
	NoPhys("Compétences physique bloquées", "Physical skills blocked", "Silence physique", "Anti Phys Skills", Tools.EffectColor[8]),
	NoMag("Compétences magique bloquées", "Magical skills blocked", "Silence magique", "Anti Mag Skills", Tools.EffectColor[8]),
	AntiItem("Objet bloqué", "Object blocked", "Anti Objet", "Anti Item", Tools.EffectColor[8]),
	Stun("Étourdissement", "Stun", "Stun", "Stun", Tools.EffectColor[8]),
	Push("Repousse l'ennemi", "Opponent push", "Push", "Push", Tools.EffectColor[8]),
	Sleep("Endormissement", "Sleep", "Sommeil", "Sleep", Tools.EffectColor[8]),
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[12]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[12]),
	AntiHeal("Soin bloqué", "Heal blocked", "Anti Soin", "Anti Heal", Tools.EffectColor[8]),
	AntiDeath("Évite une mort", "Avoid one death", "Anti mort", "Anti death", Tools.EffectColor[8]),
	Dispel("Suppression aléatoire d'un état négatif", "Auto dispel one random negative statut", "Dispel d'un malus", "Dispel one malus", Tools.EffectColor[0]),
	Block("Bloque un dégât", "Bloc one damage", "Bloque un dégât", "Bloc one damage", Tools.EffectColor[0]),
	Gel("Gel : PV et PM -20%", "Frost: HP and MP -20%", "PV/PM -20%", "HP/MP -20%", Tools.EffectColor[0]),
	Transfo("Transformation", "Transformation", "Transformation", "Transformation", Tools.EffectColor[0]),
	Duo("Permet d'équiper 2 armes", "Allow to equip 2 weapons", "2 armes possible", "2 weapons allowed", Tools.EffectColor[0]),
	
	Menace("-300 PV par seconde", "-300 HP per second", "-300 PV / s", "-300 HP / s", Tools.EffectColor[8]),
	Massacre("-240 PM par seconde", "-240 MP per second", "-240 PM / s", "-240 MP / s", Tools.EffectColor[8]),
	Conquete("-120 PM par seconde", "-120 MP per second", "-120 PM / s", "-120 MP / s", Tools.EffectColor[8]),
	
	Title0("Transformation Démon Géant", "Giant Evil transformation", "Démon Géant", "Giant Evil", Tools.EffectColor[8]),
	Title1("Si PV<15%", "If HP<15%", "Si PV<15%", "If HP<15%", Tools.EffectColor[8]),
	Title2("Transformation Lion", "Lion transformation", "Lion", "Lion", Tools.EffectColor[8]),
	Title3("-2% PV chaque 3s pendant 12s", "-2% HP per 3s for 12s", "-2% PV / 3s", "-2% HP / 3s", Tools.EffectColor[8]),
	Title4("Si PV<20%", "If HP<20%", "Si PV<20%", "If HP<20%", Tools.EffectColor[8]),
	Title5("Transformation Pirate", "Pirate transformation", "Pirate", "Pirate", Tools.EffectColor[8]),
	Title6("Transformation Sprite Géant", "Giant Sprite transformation", "Sprite Géant", "Giant Sprite", Tools.EffectColor[8]),
	Title7("Transformation Disciple", "Disciple transformation", "Disciple", "Disciple", Tools.EffectColor[8]),
	Title8("Transformation Créature effrayante", "Scary creature transformation", "Créature effrayante", "Scary creature", Tools.EffectColor[8]),
	Title9("Transformation Gélapin Pirate", "Pirate Jelly Rabbit transformation", "Gélapin Pirate", "Pirate Jelly Rabbit", Tools.EffectColor[8]),
	Title10("Transformation Soldat Insecte Géant", "Giant Soldier Insect transformation", "Soldat Insecte Géant", "Giant Soldier Insect", Tools.EffectColor[8]),
	Title11("Transformation Plante Géante", "Giant Plant transformation", "Plante Géante", "Giant Plant", Tools.EffectColor[8]),
	Title12("Transformation Grand Manchot de Noël", "Great Christmas Penguin transformation", "Grand Manchot de Noël", "Great Christmas Penguin", Tools.EffectColor[8]),
	Title13("Transformation Roi des dindes de Thanksgiving", "Thanksgiving turkey king transformation", "Roi des dindes de Thanksgiving", "Thanksgiving turkey king", Tools.EffectColor[8]),
	Title14("Transformation Jajar Gélapin angélique", "Jajar Angelic Jelly Rabbit transformation", "Jajar Gélapin angélique", "Jajar Angelic Jelly Rabbit", Tools.EffectColor[8]),
	Title15("Transformation Lulhu Gélapin démoniaque", "Lulhu Demonic Jelly Rabbit transformation", "Lulhu Gélapin démoniaque", "Lulhu Demonic Jelly Rabbit", Tools.EffectColor[8]),
	Title16("Transformation Gughu Gélapin glouton", "Gughu Gluttonous Jelly Rabbit transformation", "Gughu Gélapin glouton", "Gughu Gluttonous Jelly Rabbit", Tools.EffectColor[8]),
	Title17("Transformation Ballon festif", "Festive balloon transformation", "Ballon festif", "Festive balloon", Tools.EffectColor[8]),
	Title18("Transformation Maître farceur", "Master joker transformation", "Maître farceur", "Master joker", Tools.EffectColor[8]),
	Title19("Transformation Cavalier Géant", "Giant Horseman transformation", "Cavalier Géant", "Giant Horseman", Tools.EffectColor[8]),
	Title20("Transformation Gélapin des Sources", "Sources Jelly Rabit transformation", "Gélapin des Sources", "Sources Jelly Rabit", Tools.EffectColor[8]),
	Title21("Transformation Agarma, le Vil'marée", "Treacherous Torrent, Enigmus transformation", "Agarma, le Vil'marée", "Treacherous Torrent, Enigmus", Tools.EffectColor[8]),
	Title22("Transformation Miaoubline", "Felissan transformation", "Miaoubline", "Felissan", Tools.EffectColor[8]),
	Title23("Transformation Monstre de l'Arène de Feu", "Fire Arena Monster transformation", "Monstre de l'Arène de Feu", "Fire Arena Monster", Tools.EffectColor[8]),
	Title24("Transformation Gardien Grayd", "Guardian Grayd transformation", "Gardien Grayd", "Guardian Grayd", Tools.EffectColor[8]),
	Title25("Transformation Bête du Feu Éternel", "Eternal Fire Beast transformation", "Bête du Feu Éternel", "Eternal Fire Beast", Tools.EffectColor[8]),
	Title26("Transformation Chevreuil Sauvage", "Wild Deer transformation", "Chevreuil Sauvage", "Wild Deer", Tools.EffectColor[8]),
	Title27("Transformation Capitaine blindé du Kansas", "Kansas Armored Captain transformation", "Capitaine blindé du Kansas", "Kansas Armored Captain", Tools.EffectColor[8]),
	Title28("Transformation Insecte géant", "Giant insect transformation", "Insecte géant", "Giant insect", Tools.EffectColor[8]),
	Title29("Transformation Gadouillos, Boue Mangetout", "Muddy Maw, Gaius transformation", "Gadouillos, Boue Mangetout", "Muddy Maw, Gaius", Tools.EffectColor[8]),
	Title30("Transformation Kutila, Vétéran", "Field Marshal, Kutila transformation", "Kutila, Vétéran", "Field Marshal, Kutila", Tools.EffectColor[8]),
	Title31("Transformation Bulles bleues", "Blue bubbles transformation", "Bulles bleues", "Blue bubbles", Tools.EffectColor[8]),
	Title32("Transformation Citrouille", "Pumpkin transformation", "Citrouille", "Pumpkin", Tools.EffectColor[8]),
	
	Anima0("+1% PV et PM à chaque effet reçu", "+1% HP and MP when receive effect", "+1% PV/PM par effet", "+1% HP/MP per effect", Tools.EffectColor[8]),
	Anima1("Si PM<20%", "If MP<20%", "Si PM<20%", "If MP<20%", Tools.EffectColor[8]),
	
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
