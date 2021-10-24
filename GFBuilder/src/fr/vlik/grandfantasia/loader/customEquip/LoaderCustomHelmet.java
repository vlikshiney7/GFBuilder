package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
class LoaderCustomHelmet {
	
	static CustomArmor[] getHelmet() {
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
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque Tyrannique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.CASQUE, "casques/80nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 635, true),
					new Effect(TypeEffect.DefM, false, 473, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.CASQUE, "casques/25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 647, true),
					new Effect(TypeEffect.DefM, false, 464, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Gladiateur Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.CASQUE, "casques/50vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 635, true),
					new Effect(TypeEffect.DefM, false, 473, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.CASQUE, "casques/40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 647, true),
					new Effect(TypeEffect.DefM, false, 464, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque Feu de Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.CASQUE, "casques/40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 615, true),
					new Effect(TypeEffect.DefM, false, 456, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Précipice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.CASQUE, "casques/25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 627, true),
					new Effect(TypeEffect.DefM, false, 447, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Feu Solaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.CASQUE, "casques/60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 615, true),
					new Effect(TypeEffect.DefM, false, 456, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Couchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.CASQUE, "casques/100pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 627, true),
					new Effect(TypeEffect.DefM, false, 447, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de la Baleine Blanche"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				90, ArmorType.CASQUE, "casques/icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 595, true),
					new Effect(TypeEffect.DefM, false, 439, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.6),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Grand Pèlerin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				90, ArmorType.CASQUE, "casques/icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 607, true),
					new Effect(TypeEffect.DefM, false, 430, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 11),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de la Sentinelle des Enfers"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				86, ArmorType.CASQUE, "casques/80pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 578, true),
					new Effect(TypeEffect.DefM, false, 426, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Gardien du Sanctuaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				86, ArmorType.CASQUE, "casques/80pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 590, true),
					new Effect(TypeEffect.DefM, false, 418, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Danger des Plaines"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				85, ArmorType.CASQUE, "casques/icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 574, true),
					new Effect(TypeEffect.DefM, false, 422, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.4),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Troubadour de la Justice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				85, ArmorType.CASQUE, "casques/icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 585, true),
					new Effect(TypeEffect.DefM, false, 414, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque d'Orgueil"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				81, ArmorType.CASQUE, "casques/87bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 558, true),
					new Effect(TypeEffect.DefM, false, 408, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Heaume du Silence Sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				81, ArmorType.CASQUE, "casques/86bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 569, true),
					new Effect(TypeEffect.DefM, false, 400, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Féroce Destructeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				80, ArmorType.CASQUE, "casques/87bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 553, true),
					new Effect(TypeEffect.DefM, false, 405, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Heaume d'Exorcisation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				80, ArmorType.CASQUE, "casques/86bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 564, true),
					new Effect(TypeEffect.DefM, false, 397, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de l'Étoile de Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				76, ArmorType.CASQUE, "casques/75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 536, true),
					new Effect(TypeEffect.DefM, false, 391, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Jade Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				76, ArmorType.CASQUE, "casques/75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 547, true),
					new Effect(TypeEffect.DefM, false, 383, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Sacrificateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				75, ArmorType.CASQUE, "casques/icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 532, true),
					new Effect(TypeEffect.DefM, false, 388, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Heaume de l'Éblouissement Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				75, ArmorType.CASQUE, "casques/icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 543, true),
					new Effect(TypeEffect.DefM, false, 380, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Carnage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				71, ArmorType.CASQUE, "casques/icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 515, true),
					new Effect(TypeEffect.DefM, false, 374, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de la Hargne Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				71, ArmorType.CASQUE, "casques/icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 525, true),
					new Effect(TypeEffect.DefM, false, 367, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				70, ArmorType.CASQUE, "casques/75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 511, true),
					new Effect(TypeEffect.DefM, false, 370, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Couronne d'Améthyste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				70, ArmorType.CASQUE, "casques/75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 521, true),
					new Effect(TypeEffect.DefM, false, 363, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cimier de Bronze"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				66, ArmorType.CASQUE, "casques/70nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 493, true),
					new Effect(TypeEffect.DefM, false, 356, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Heaume de Guetteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				66, ArmorType.CASQUE, "casques/70nucleus1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 503, true),
					new Effect(TypeEffect.DefM, false, 349, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de la Bête du Grondement du Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				65, ArmorType.CASQUE, "casques/50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 488, true),
					new Effect(TypeEffect.DefM, false, 353, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Défenseur de la Loi de l'Eglise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				65, ArmorType.CASQUE, "casques/icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 498, true),
					new Effect(TypeEffect.DefM, false, 346, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de l'Intrépide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				61, ArmorType.CASQUE, "casques/50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 471, true),
					new Effect(TypeEffect.DefM, false, 338, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Glorieux Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				61, ArmorType.CASQUE, "casques/icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 481, true),
					new Effect(TypeEffect.DefM, false, 331, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de l'Être Démoniaque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				60, ArmorType.CASQUE, "casques/60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 466, true),
					new Effect(TypeEffect.DefM, false, 335, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque à Visière du Héros"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				60, ArmorType.CASQUE, "casques/25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 480, true),
					new Effect(TypeEffect.DefM, false, 335, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				58, ArmorType.CASQUE, "casques/50vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 457, true),
					new Effect(TypeEffect.DefM, false, 327, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de l'Empereur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				58, ArmorType.CASQUE, "casques/50pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 470, true),
					new Effect(TypeEffect.DefM, false, 327, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Visage du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				58, ArmorType.CASQUE, "casques/50vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 456, true),
					new Effect(TypeEffect.DefM, false, 326, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque des Ducs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				58, ArmorType.CASQUE, "casques/50pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 471, true),
					new Effect(TypeEffect.DefM, false, 327, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque d'Os et de Sang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				50, ArmorType.CASQUE, "casques/50vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 419, true),
					new Effect(TypeEffect.DefM, false, 298, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				50, ArmorType.CASQUE, "casques/50pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 431, true),
					new Effect(TypeEffect.DefM, false, 298, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Dictateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				50, ArmorType.CASQUE, "casques/50vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 420, true),
					new Effect(TypeEffect.DefM, false, 298, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque Supérieur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				50, ArmorType.CASQUE, "casques/50pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 432, true),
					new Effect(TypeEffect.DefM, false, 297, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Meneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				42, ArmorType.CASQUE, "casques/icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 380, true),
					new Effect(TypeEffect.DefM, false, 270, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque à Cornes du Chevalier Gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				42, ArmorType.CASQUE, "casques/40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 391, true),
					new Effect(TypeEffect.DefM, false, 270, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Dictateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				42, ArmorType.CASQUE, "casques/icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 381, true),
					new Effect(TypeEffect.DefM, false, 271, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque à Corne du Chevalier Prétorien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				42, ArmorType.CASQUE, "casques/40pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 390, true),
					new Effect(TypeEffect.DefM, false, 271, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Barre de la Bataille Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				34, ArmorType.CASQUE, "casques/40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 339, true),
					new Effect(TypeEffect.DefM, false, 241, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Défenseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				34, ArmorType.CASQUE, "casques/25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 349, true),
					new Effect(TypeEffect.DefM, false, 241, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Champ de Bataille Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				34, ArmorType.CASQUE, "casques/40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 337, true),
					new Effect(TypeEffect.DefM, false, 242, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Tenace"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				34, ArmorType.CASQUE, "casques/25pvp1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 348, true),
					new Effect(TypeEffect.DefM, false, 242, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				26, ArmorType.CASQUE, "casques/30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 294, true),
					new Effect(TypeEffect.DefM, false, 209, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Casque de l'Avant-Garde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				18, ArmorType.CASQUE, "casques/100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 246, true),
					new Effect(TypeEffect.DefM, false, 175, true),
				}),
		};
	}
	
	private static CustomArmor[] getArcher() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getPretre() {
		return new CustomArmor[] {
			
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