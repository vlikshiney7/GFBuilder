package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.loader.equip.LoaderBreastplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
class LoaderCustomBreastplate {
	
	static CustomArmor[] getBreastplate() {
		CustomArmor[] class1 = getGuerrier();
		CustomArmor[] class2 = getArcher();
		CustomArmor[] class3 = getPretre();
		CustomArmor[] class4 = getMage();
		CustomArmor[] class5 = getMeca();
		CustomArmor[] class6 = getVoyageur();
		
		CustomArmor[] result = new CustomArmor[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length];
		
		int i = 0;
		for(; i < class1.length; i++) {
			result[i] = class1[i];
		}

		for(int j = 0; j < class2.length; i++, j++) {
			result[i] = class2[j];
		}

		for(int j = 0; j < class3.length; i++, j++) {
			result[i] = class3[j];
		}
		
		for(int j = 0; j < class4.length; i++, j++) {
			result[i] = class4[j];
		}

		for(int j = 0; j < class5.length; i++, j++) {
			result[i] = class5[j];
		}
		
		for(int j = 0; j < class6.length; i++, j++) {
			result[i] = class6[j];
		}
		
		return result;
	}
	
	private static CustomArmor[] getGuerrier() {
		return new CustomArmor[] {
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Tyrannique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 820, true),
					new Effect(TypeEffect.DefM, false, 611, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 836, true),
					new Effect(TypeEffect.DefM, false, 599, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Gladiateur Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 820, true),
					new Effect(TypeEffect.DefM, false, 611, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 836, true),
					new Effect(TypeEffect.DefM, false, 599, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Feu de Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 794, true),
					new Effect(TypeEffect.DefM, false, 589, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Précipice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 810, true),
					new Effect(TypeEffect.DefM, false, 577, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Feu Solaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 794, true),
					new Effect(TypeEffect.DefM, false, 589, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Couchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 810, true),
					new Effect(TypeEffect.DefM, false, 577, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de la Baleine Blanche"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 773, true),
					new Effect(TypeEffect.DefM, false, 571, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 2.1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Grand Pèlerin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 788, true),
					new Effect(TypeEffect.DefM, false, 560, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 16),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de la Sentinelle des Enfers"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 757, true),
					new Effect(TypeEffect.DefM, false, 558, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Gardien du Sanctuaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 772, true),
					new Effect(TypeEffect.DefM, false, 547, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Danger des Plaines"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 746, true),
					new Effect(TypeEffect.DefM, false, 549, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Troubadour de la Justice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 761, true),
					new Effect(TypeEffect.DefM, false, 538, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 14),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure d'Orgueil"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 730, true),
					new Effect(TypeEffect.DefM, false, 535, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de Plaques du Silence Sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "77bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 744, true),
					new Effect(TypeEffect.DefM, false, 524, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Féroce Destructeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 719, true),
					new Effect(TypeEffect.DefM, false, 527, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure d'Exorcisation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "77bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 733, true),
					new Effect(TypeEffect.DefM, false, 516, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 12),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de l'Étoile de Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 703, true),
					new Effect(TypeEffect.DefM, false, 513, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de Jade Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 717, true),
					new Effect(TypeEffect.DefM, false, 503, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Sacrificateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 692, true),
					new Effect(TypeEffect.DefM, false, 504, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Lourde de l'Éblouissement Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 706, true),
					new Effect(TypeEffect.DefM, false, 494, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Carnage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 675, true),
					new Effect(TypeEffect.DefM, false, 490, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Légère Armure de la Hargne Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 689, true),
					new Effect(TypeEffect.DefM, false, 480, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuirasse Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 664, true),
					new Effect(TypeEffect.DefM, false, 481, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuirasse d'Améthyste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 677, true),
					new Effect(TypeEffect.DefM, false, 471, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuirasse à Cornes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 647, true),
					new Effect(TypeEffect.DefM, false, 468, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Haubert Solide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 660, true),
					new Effect(TypeEffect.DefM, false, 459, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de la Bête du Grondement du Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80nucleus4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 635, true),
					new Effect(TypeEffect.DefM, false, 458, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Défenseur de la Loi de l'Eglise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 648, true),
					new Effect(TypeEffect.DefM, false, 449, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de l'Intrépide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80nucleus4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 618, true),
					new Effect(TypeEffect.DefM, false, 444, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Glorieux Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 630, true),
					new Effect(TypeEffect.DefM, false, 435, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de l'Être Démoniaque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 606, true),
					new Effect(TypeEffect.DefM, false, 435, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Héros"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 624, true),
					new Effect(TypeEffect.DefM, false, 435, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 600, true),
					new Effect(TypeEffect.DefM, false, 430, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de l'Empereur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 618, true),
					new Effect(TypeEffect.DefM, false, 430, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Plate du Visage du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 602, true),
					new Effect(TypeEffect.DefM, false, 431, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron des Ducs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 615, true),
					new Effect(TypeEffect.DefM, false, 433, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron d'Os et de Sang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 551, true),
					new Effect(TypeEffect.DefM, false, 393, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 567, true),
					new Effect(TypeEffect.DefM, false, 393, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Squelette de la Bête Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "47vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 550, true),
					new Effect(TypeEffect.DefM, false, 392, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron Supérieur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 566, true),
					new Effect(TypeEffect.DefM, false, 391, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Meneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 501, true),
					new Effect(TypeEffect.DefM, false, 351, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Chevalier Gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 516, true),
					new Effect(TypeEffect.DefM, false, 356, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Dictateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 502, true),
					new Effect(TypeEffect.DefM, false, 355, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Plate du Chevalier Prétorien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 517, true),
					new Effect(TypeEffect.DefM, false, 361, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de la Bataille Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 447, true),
					new Effect(TypeEffect.DefM, false, 318, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Défenseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 460, true),
					new Effect(TypeEffect.DefM, false, 318, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Champ de Bataille Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 450, true),
					new Effect(TypeEffect.DefM, false, 316, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Tenace"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 461, true),
					new Effect(TypeEffect.DefM, false, 321, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure en Acier Renforcé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				28, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 385, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				27, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 390, true),
					new Effect(TypeEffect.DefM, false, 277, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de l'Avant-Garde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				19, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 328, true),
					new Effect(TypeEffect.DefM, false, 233, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuirasse d'Élite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				13, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 276, true),
					new Effect(TypeEffect.DefM, false, 196, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Costume Éclatant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				7, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "10blanc0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 217, true),
					new Effect(TypeEffect.DefM, false, 154, true),
				}),
		};
	}
	
	private static CustomArmor[] getArcher() {
		return new CustomArmor[] {
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bracelets Coucher de Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "65pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 697, true),
					new Effect(TypeEffect.DefM, false, 665, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de Coquille"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 683, true),
					new Effect(TypeEffect.DefM, false, 679, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bracelets du Promeneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 697, true),
					new Effect(TypeEffect.DefM, false, 665, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Bourreau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 683, true),
					new Effect(TypeEffect.DefM, false, 679, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bracelets de l'Araignée Fantôme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 675, true),
					new Effect(TypeEffect.DefM, false, 641, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de l'Ombre Sereine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "65pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 662, true),
					new Effect(TypeEffect.DefM, false, 654, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bracelets Étoile Filante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 675, true),
					new Effect(TypeEffect.DefM, false, 641, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Nocturne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 662, true),
					new Effect(TypeEffect.DefM, false, 654, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste de la Montagne Chantante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 657, true),
					new Effect(TypeEffect.DefM, false, 621, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 2.1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Traître Assassin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon6", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 644, true),
					new Effect(TypeEffect.DefM, false, 634, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 11),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de l'Archer Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 644, true),
					new Effect(TypeEffect.DefM, false, 608, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Garde Silencieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 631, true),
					new Effect(TypeEffect.DefM, false, 620, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Tunique de l'Ombre d'Argent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 634, true),
					new Effect(TypeEffect.DefM, false, 598, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste de la Lame Furtive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon6", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 622, true),
					new Effect(TypeEffect.DefM, false, 610, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Tunique du Pêcheur de Nuages"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 620, true),
					new Effect(TypeEffect.DefM, false, 583, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste du Serpent d'Émeraude"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 608, true),
					new Effect(TypeEffect.DefM, false, 595, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure de l'Horizon Lointain"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 611, true),
					new Effect(TypeEffect.DefM, false, 573, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Jambières du Mirage Ninja"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 599, true),
					new Effect(TypeEffect.DefM, false, 585, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Faucon d'Or"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 598, true),
					new Effect(TypeEffect.DefM, false, 559, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Ninja de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 586, true),
					new Effect(TypeEffect.DefM, false, 570, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste des Tempêtes Polaires"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon7", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 588, true),
					new Effect(TypeEffect.DefM, false, 549, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Guerrier Lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon8", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 576, true),
					new Effect(TypeEffect.DefM, false, 560, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste de l'Œil de Faucon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon7", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 573, true),
					new Effect(TypeEffect.DefM, false, 534, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Lorica du Seigneur de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon8", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 562, true),
					new Effect(TypeEffect.DefM, false, 545, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste Chaude de Nomade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 564, true),
					new Effect(TypeEffect.DefM, false, 524, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Corsage de Turquoise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 553, true),
					new Effect(TypeEffect.DefM, false, 535, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste Double"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 550, true),
					new Effect(TypeEffect.DefM, false, 510, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casaque Vermeille"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 539, true),
					new Effect(TypeEffect.DefM, false, 520, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Promeneur du Vent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "27vert2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 540, true),
					new Effect(TypeEffect.DefM, false, 499, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de l'Assassin Spectral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 529, true),
					new Effect(TypeEffect.DefM, false, 509, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure du Puissant Canonnier Lourd"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "27vert2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 525, true),
					new Effect(TypeEffect.DefM, false, 484, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Ajustée du Serpent Venimeux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 515, true),
					new Effect(TypeEffect.DefM, false, 494, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Léger Plastron Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 520, true),
					new Effect(TypeEffect.DefM, false, 484, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Collants du Fantôme Diabolique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 505, true),
					new Effect(TypeEffect.DefM, false, 484, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Panoplie du Troubadour"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 515, true),
					new Effect(TypeEffect.DefM, false, 478, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de la Plume Volante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 500, true),
					new Effect(TypeEffect.DefM, false, 478, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de la Tribu du Vent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 517, true),
					new Effect(TypeEffect.DefM, false, 480, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de l'Ombre Sereine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 502, true),
					new Effect(TypeEffect.DefM, false, 481, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Léger Plastron Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 472, true),
					new Effect(TypeEffect.DefM, false, 436, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Vêtements Moulants de la Volonté de Vivre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 459, true),
					new Effect(TypeEffect.DefM, false, 436, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Léger Plastron de la Comète"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 470, true),
					new Effect(TypeEffect.DefM, false, 435, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Vêtements moulants des Directions Fatales"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 461, true),
					new Effect(TypeEffect.DefM, false, 435, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Légère de l'Hymne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon9", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 429, true),
					new Effect(TypeEffect.DefM, false, 395, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Chemise de l'Officier des Affaires Spéciales"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 417, true),
					new Effect(TypeEffect.DefM, false, 395, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Armure Légère de la Dérive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon9", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 430, true),
					new Effect(TypeEffect.DefM, false, 398, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Chemise du Tueur au Trophée doré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 415, true),
					new Effect(TypeEffect.DefM, false, 400, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron de Poussière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 384, true),
					new Effect(TypeEffect.DefM, false, 353, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Sombre Maillot Moulant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 373, true),
					new Effect(TypeEffect.DefM, false, 353, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Plastron du Ranger"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 389, true),
					new Effect(TypeEffect.DefM, false, 355, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Vêtements Moulants Silencieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 375, true),
					new Effect(TypeEffect.DefM, false, 357, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe Légère du Sniper"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				28, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "27vert2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 321, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau de Cuir Ombre de Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				27, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 325, true),
					new Effect(TypeEffect.DefM, false, 308, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuir de Licorne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				19, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 273, true),
					new Effect(TypeEffect.DefM, false, 259, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau de Cuir de la Concentration"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				13, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 230, true),
					new Effect(TypeEffect.DefM, false, 218, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Légère Armure de Cuir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				7, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "10blanc2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 181, true),
					new Effect(TypeEffect.DefM, false, 172, true),
				}),
		};
	}
	
	private static CustomArmor[] getPretre() {
		return new CustomArmor[] {
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Cri du Faucon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "100pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 767, true),
					new Effect(TypeEffect.DefM, false, 573, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste de la Suprématie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 752, true),
					new Effect(TypeEffect.DefM, false, 584, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Sage de Verre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 767, true),
					new Effect(TypeEffect.DefM, false, 573, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste du Dompteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				100, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 752, true),
					new Effect(TypeEffect.DefM, false, 584, true),
					new Effect(TypeEffect.ESQ, false, 7),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Croissant d'Argent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 743, true),
					new Effect(TypeEffect.DefM, false, 554, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste du Pays des Merveilles"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 728, true),
					new Effect(TypeEffect.DefM, false, 566, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de la Lune Pure"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 743, true),
					new Effect(TypeEffect.DefM, false, 554, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.3),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste du Rêve Arc-en-Ciel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				95, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 728, true),
					new Effect(TypeEffect.DefM, false, 566, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de Soie Orientale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon10", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 723, true),
					new Effect(TypeEffect.DefM, false, 540, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 2.1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Veste des Quatre Saisons"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				90, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon11", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 709, true),
					new Effect(TypeEffect.DefM, false, 551, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 16),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Sage Solaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 708, true),
					new Effect(TypeEffect.DefM, false, 529, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Joueur de Flûte"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				87, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "80pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 694, true),
					new Effect(TypeEffect.DefM, false, 540, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de la Lueur de l'Aube"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon10", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 598, true),
					new Effect(TypeEffect.DefM, false, 521, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Toge de l'Empire de l'Esprit"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				85, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon11", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 684, true),
					new Effect(TypeEffect.DefM, false, 532, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 14),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Soutane de l'Idylle Aérienne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "77bleu4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 682, true),
					new Effect(TypeEffect.DefM, false, 510, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de l'Astronome Fou"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				82, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 669, true),
					new Effect(TypeEffect.DefM, false, 520, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de Dévotion Spirituelle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "77bleu4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 672, true),
					new Effect(TypeEffect.DefM, false, 502, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de Mauvais Augure"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				80, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "76bleu5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 659, true),
					new Effect(TypeEffect.DefM, false, 512, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 12),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Serviteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 657, true),
					new Effect(TypeEffect.DefM, false, 491, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de l'Oracle de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				77, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 644, true),
					new Effect(TypeEffect.DefM, false, 501, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Psaume Oraculaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon12", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 647, true),
					new Effect(TypeEffect.DefM, false, 483, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Châtiment Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				75, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon13", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 634, true),
					new Effect(TypeEffect.DefM, false, 493, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Souffle Charmeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon12", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 631, true),
					new Effect(TypeEffect.DefM, false, 471, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Mystère Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				72, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon13", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 619, true),
					new Effect(TypeEffect.DefM, false, 481, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Livrée Liturgique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 620, true),
					new Effect(TypeEffect.DefM, false, 464, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau de Chamane"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				70, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "75evo5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 608, true),
					new Effect(TypeEffect.DefM, false, 473, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 10),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe d'Azur Pâle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 605, true),
					new Effect(TypeEffect.DefM, false, 452, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Livrée Cérémoniale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				67, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "70nucleus5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 593, true),
					new Effect(TypeEffect.DefM, false, 461, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Pardon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 594, true),
					new Effect(TypeEffect.DefM, false, 443, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de Lumière Etoilée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				65, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon9", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 582, true),
					new Effect(TypeEffect.DefM, false, 452, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Disciple de Platine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 577, true),
					new Effect(TypeEffect.DefM, false, 431, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Ville Dorée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				62, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "icon9", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 566, true),
					new Effect(TypeEffect.DefM, false, 440, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Route Divine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 571, true),
					new Effect(TypeEffect.DefM, false, 432, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Chemise Magique Ecaille de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				60, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 555, true),
					new Effect(TypeEffect.DefM, false, 445, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Yeux Divins"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 566, true),
					new Effect(TypeEffect.DefM, false, 427, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Longue Robe des Lumières"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 550, true),
					new Effect(TypeEffect.DefM, false, 440, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Sage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 565, true),
					new Effect(TypeEffect.DefM, false, 430, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de la Particule Finale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				59, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "50pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 548, true),
					new Effect(TypeEffect.DefM, false, 441, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Jugement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 520, true),
					new Effect(TypeEffect.DefM, false, 393, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Plumes du Grand Chef"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 505, true),
					new Effect(TypeEffect.DefM, false, 404, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Oeil du Jugement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 518, true),
					new Effect(TypeEffect.DefM, false, 390, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Manteau à Plumes du Langage de la Forêt"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				51, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 506, true),
					new Effect(TypeEffect.DefM, false, 405, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Sceau Sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 473, true),
					new Effect(TypeEffect.DefM, false, 397, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Sprite des Arbres"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 459, true),
					new Effect(TypeEffect.DefM, false, 367, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Lumière Sacrée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95blanc5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 474, true),
					new Effect(TypeEffect.DefM, false, 400, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape Mélancolique pour l'Esprit de l'Ancêtre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				43, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "95pve5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 455, true),
					new Effect(TypeEffect.DefM, false, 370, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe de la Loi Eternelle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 422, true),
					new Effect(TypeEffect.DefM, false, 319, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Prophétie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 410, true),
					new Effect(TypeEffect.DefM, false, 328, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Monastère"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 424, true),
					new Effect(TypeEffect.DefM, false, 320, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Murmure Silencieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SAGE, },
				35, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 412, true),
					new Effect(TypeEffect.DefM, false, 330, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'éclat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				28, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 364, true),
					new Effect(TypeEffect.DefM, false, 283, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Evêque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				27, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "30pve4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 358, true),
					new Effect(TypeEffect.DefM, false, 278, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Fête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				19, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 310, true),
					new Effect(TypeEffect.DefM, false, 241, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gospel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				13, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "60evo5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 260, true),
					new Effect(TypeEffect.DefM, false, 202, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Robe du Prêtre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				7, ArmorType.PLASTRON, LoaderBreastplate.ICONPATH + "25pvp4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 205, true),
					new Effect(TypeEffect.DefM, false, 160, true),
				}),
		};
	}
	
	private static CustomArmor[] getMage() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getMeca() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getVoyageur() {
		return new CustomArmor[] {
			
		};
	}
}