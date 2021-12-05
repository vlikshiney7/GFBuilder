package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.loader.equip.LoaderBoot;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
class LoaderCustomBoot {
	
	static CustomArmor[] getBoot() {
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
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Tyranniques"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "80nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 439, true),
					new Effect(TypeEffect.DefM, false, 326, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "62vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 448, true),
					new Effect(TypeEffect.DefM, false, 319, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Gladiateur Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 439, true),
					new Effect(TypeEffect.DefM, false, 326, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Chant Éolien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 448, true),
					new Effect(TypeEffect.DefM, false, 319, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Feu de Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 425, true),
					new Effect(TypeEffect.DefM, false, 314, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Précipice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 433, true),
					new Effect(TypeEffect.DefM, false, 308, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Feu Solaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "60evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 425, true),
					new Effect(TypeEffect.DefM, false, 314, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Couchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 433, true),
					new Effect(TypeEffect.DefM, false, 308, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 13),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de la Baleine Blanche"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				90, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 416, true),
					new Effect(TypeEffect.DefM, false, 307, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.6),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Grand Pèlerin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				90, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 425, true),
					new Effect(TypeEffect.DefM, false, 301, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 11),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de la Sentinelle des Enfers"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				86, ArmorType.BOTTE, LoaderBoot.ICONPATH + "80pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 405, true),
					new Effect(TypeEffect.DefM, false, 298, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Gardien du Sanctuaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				86, ArmorType.BOTTE, LoaderBoot.ICONPATH + "80pve1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 413, true),
					new Effect(TypeEffect.DefM, false, 292, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Danger des Plaines"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				85, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 402, true),
					new Effect(TypeEffect.DefM, false, 295, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.4),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Troubadour de la Justice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				85, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 410, true),
					new Effect(TypeEffect.DefM, false, 289, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 9),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes d'Orgueil"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				81, ArmorType.BOTTE, LoaderBoot.ICONPATH + "88bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 390, true),
					new Effect(TypeEffect.DefM, false, 286, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Silence Sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				81, ArmorType.BOTTE, LoaderBoot.ICONPATH + "86bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 398, true),
					new Effect(TypeEffect.DefM, false, 280, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Féroce Destructeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				80, ArmorType.BOTTE, LoaderBoot.ICONPATH + "88bleu0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 387, true),
					new Effect(TypeEffect.DefM, false, 283, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes d'Exorcisation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				80, ArmorType.BOTTE, LoaderBoot.ICONPATH + "86bleu1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 395, true),
					new Effect(TypeEffect.DefM, false, 277, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Étoile de Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				76, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 375, true),
					new Effect(TypeEffect.DefM, false, 274, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de Jade Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				76, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 383, true),
					new Effect(TypeEffect.DefM, false, 269, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Sacrificateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				75, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 373, true),
					new Effect(TypeEffect.DefM, false, 271, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Éblouissement Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				75, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 381, true),
					new Effect(TypeEffect.DefM, false, 266, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Carnage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				71, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 360, true),
					new Effect(TypeEffect.DefM, false, 261, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de la Hargne Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				71, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 367, true),
					new Effect(TypeEffect.DefM, false, 256, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Barbares"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				70, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 357, true),
					new Effect(TypeEffect.DefM, false, 259, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes d'Améthyste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				70, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 364, true),
					new Effect(TypeEffect.DefM, false, 254, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottines de Marche"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				66, ArmorType.BOTTE, LoaderBoot.ICONPATH + "70nucleus0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 345, true),
					new Effect(TypeEffect.DefM, false, 249, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Rangers de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				66, ArmorType.BOTTE, LoaderBoot.ICONPATH + "70nucleus1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 352, true),
					new Effect(TypeEffect.DefM, false, 244, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de la Bête du Grondement du Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				65, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 342, true),
					new Effect(TypeEffect.DefM, false, 247, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Défenseur de la Loi de l'Eglise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				65, ArmorType.BOTTE, LoaderBoot.ICONPATH + "95pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 349, true),
					new Effect(TypeEffect.DefM, false, 242, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de l'Intrépide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				61, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 329, true),
					new Effect(TypeEffect.DefM, false, 237, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Glorieux Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				61, ArmorType.BOTTE, LoaderBoot.ICONPATH + "95pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 336, true),
					new Effect(TypeEffect.DefM, false, 232, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de l'Être Démoniaque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				60, ArmorType.BOTTE, LoaderBoot.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 326, true),
					new Effect(TypeEffect.DefM, false, 234, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Héros"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				60, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 326, true),
					new Effect(TypeEffect.DefM, false, 234, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées d'Os et de Sang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 307, true),
					new Effect(TypeEffect.DefM, false, 219, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 316, true),
					new Effect(TypeEffect.DefM, false, 219, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de la Carcasse de la Bête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 307, true),
					new Effect(TypeEffect.DefM, false, 219, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées Supérieures"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 316, true),
					new Effect(TypeEffect.DefM, false, 219, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Meneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 280, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Chevalier Gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 288, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de Dictateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 280, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de Chevalier Prétorien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 288, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Vieux Champ de Bataille"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 252, true),
					new Effect(TypeEffect.DefM, false, 179, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Défenseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 259, true),
					new Effect(TypeEffect.DefM, false, 179, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Champ de Bataille Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 252, true),
					new Effect(TypeEffect.DefM, false, 179, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Défenseur Tenace"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 259, true),
					new Effect(TypeEffect.DefM, false, 179, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, ArmorType.BOTTE, LoaderBoot.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 222, true),
					new Effect(TypeEffect.DefM, false, 157, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Commandant de l'Avant- Poste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, ArmorType.BOTTE, LoaderBoot.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 222, true),
					new Effect(TypeEffect.DefM, false, 157, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de Défense Blindées"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 184, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de l'Avant-Garde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 190, true),
					new Effect(TypeEffect.DefM, false, 134, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de Bataille Courageuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 190, true),
					new Effect(TypeEffect.DefM, false, 134, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées d'Élite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				16, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 163, true),
					new Effect(TypeEffect.DefM, false, 116, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Éclatantes Bottes Blindées"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				10, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 134, true),
					new Effect(TypeEffect.DefM, false, 95, true),
				}),
		};
	}
	
	private static CustomArmor[] getArcher() {
		return new CustomArmor[] {
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Coucher de Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "65pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 373, true),
					new Effect(TypeEffect.DefM, false, 356, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de Coquille"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 366, true),
					new Effect(TypeEffect.DefM, false, 363, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Promeneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 373, true),
					new Effect(TypeEffect.DefM, false, 356, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Bourreau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				100, ArmorType.BOTTE, LoaderBoot.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 366, true),
					new Effect(TypeEffect.DefM, false, 363, true),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Araignée Fantôme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 361, true),
					new Effect(TypeEffect.DefM, false, 342, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Ombre Sereine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "65pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 354, true),
					new Effect(TypeEffect.DefM, false, 349, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Étoile Filante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 361, true),
					new Effect(TypeEffect.DefM, false, 342, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Nocturnes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				95, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 354, true),
					new Effect(TypeEffect.DefM, false, 349, true),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.TCCP, false, 1.8),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de la Montagne Chantante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				90, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 354, true),
					new Effect(TypeEffect.DefM, false, 334, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.DCCP, false, 16),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Traître Assassin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				90, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 347, true),
					new Effect(TypeEffect.DefM, false, 341, true),
					new Effect(TypeEffect.ESQ, false, 4),
					new Effect(TypeEffect.TCCP, false, 1.6),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Archer Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				86, ArmorType.BOTTE, LoaderBoot.ICONPATH + "88bleu2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 344, true),
					new Effect(TypeEffect.DefM, false, 324, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Garde Silencieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				86, ArmorType.BOTTE, LoaderBoot.ICONPATH + "80pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 337, true),
					new Effect(TypeEffect.DefM, false, 331, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Chaussures de l'Ombre d'Argent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				85, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 342, true),
					new Effect(TypeEffect.DefM, false, 321, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.DCCP, false, 14),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottines de la Lame Furtive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				85, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon5", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 335, true),
					new Effect(TypeEffect.DefM, false, 328, true),
					new Effect(TypeEffect.ESQ, false, 3),
					new Effect(TypeEffect.TCCP, false, 1.4),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Chaussures du Pêcheur de Nuages"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				81, ArmorType.BOTTE, LoaderBoot.ICONPATH + "88bleu2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 332, true),
					new Effect(TypeEffect.DefM, false, 311, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Serpent d'Émeraude"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				81, ArmorType.BOTTE, LoaderBoot.ICONPATH + "86bleu3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 325, true),
					new Effect(TypeEffect.DefM, false, 317, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Horizon Lointain"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				80, ArmorType.BOTTE, LoaderBoot.ICONPATH + "88bleu2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 329, true),
					new Effect(TypeEffect.DefM, false, 309, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.DCCP, false, 12),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Mirage Ninja"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				80, ArmorType.BOTTE, LoaderBoot.ICONPATH + "86bleu3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 323, true),
					new Effect(TypeEffect.DefM, false, 315, true),
					new Effect(TypeEffect.ESQ, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.2),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Faucon d'Or"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				76, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 319, true),
					new Effect(TypeEffect.DefM, false, 298, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes du Ninja de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				76, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 313, true),
					new Effect(TypeEffect.DefM, false, 304, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes des Tempêtes Polaires"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				75, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon6", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 316, true),
					new Effect(TypeEffect.DefM, false, 295, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Souples du Guerrier Lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				75, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon7", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 310, true),
					new Effect(TypeEffect.DefM, false, 301, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de l'Œil de Faucon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				71, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon6", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 306, true),
					new Effect(TypeEffect.DefM, false, 284, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Souples Seigneur de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				71, ArmorType.BOTTE, LoaderBoot.ICONPATH + "icon7", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 300, true),
					new Effect(TypeEffect.DefM, false, 290, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Souples de Nomade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				70, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 304, true),
					new Effect(TypeEffect.DefM, false, 282, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Sandales de Turquoise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				70, ArmorType.BOTTE, LoaderBoot.ICONPATH + "75evo3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 298, true),
					new Effect(TypeEffect.DefM, false, 288, true),
					new Effect(TypeEffect.ESQ, false, 1),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de Patrouilleur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				66, ArmorType.BOTTE, LoaderBoot.ICONPATH + "70nucleus2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 294, true),
					new Effect(TypeEffect.DefM, false, 272, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottines Pourpres"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				66, ArmorType.BOTTE, LoaderBoot.ICONPATH + "70nucleus3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 288, true),
					new Effect(TypeEffect.DefM, false, 277, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Promeneur du Vent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				65, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 291, true),
					new Effect(TypeEffect.DefM, false, 269, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes de l'Assassin Spectral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				65, ArmorType.BOTTE, LoaderBoot.ICONPATH + "65pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 285, true),
					new Effect(TypeEffect.DefM, false, 274, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Tireur à l'Arme Lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				61, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 280, true),
					new Effect(TypeEffect.DefM, false, 258, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Serpent Venimeux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				61, ArmorType.BOTTE, LoaderBoot.ICONPATH + "65pve2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 274, true),
					new Effect(TypeEffect.DefM, false, 263, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées Célestes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				60, ArmorType.BOTTE, LoaderBoot.ICONPATH + "60pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 280, true),
					new Effect(TypeEffect.DefM, false, 260, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Fantôme Diabolique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				60, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 272, true),
					new Effect(TypeEffect.DefM, false, 260, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 263, true),
					new Effect(TypeEffect.DefM, false, 243, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de la Volonté de Vivre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 256, true),
					new Effect(TypeEffect.DefM, false, 243, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de la Comète"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 263, true),
					new Effect(TypeEffect.DefM, false, 243, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées des Directions Fatales"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				54, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 256, true),
					new Effect(TypeEffect.DefM, false, 243, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de l'Hymne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 240, true),
					new Effect(TypeEffect.DefM, false, 221, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de l'Officier des Affaires Spéciales"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 233, true),
					new Effect(TypeEffect.DefM, false, 221, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de la Dérive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "54vert0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 240, true),
					new Effect(TypeEffect.DefM, false, 221, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Tueur au Trophée d'Or"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				46, ArmorType.BOTTE, LoaderBoot.ICONPATH + "30pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 233, true),
					new Effect(TypeEffect.DefM, false, 221, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées de Poussière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 216, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes Sombres"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 210, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Ranger"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 216, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes Silencieuses"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, },
				38, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 210, true),
					new Effect(TypeEffect.DefM, false, 199, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes Ombre de Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				30, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 185, true),
					new Effect(TypeEffect.DefM, false, 175, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de la Nuit Etoilée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				30, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 185, true),
					new Effect(TypeEffect.DefM, false, 175, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Bottes Blindées du Sniper"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 153, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de Licorne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 158, true),
					new Effect(TypeEffect.DefM, false, 149, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes du Voleur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				22, ArmorType.BOTTE, LoaderBoot.ICONPATH + "50pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 158, true),
					new Effect(TypeEffect.DefM, false, 149, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Cuissardes de la Concentration"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				16, ArmorType.BOTTE, LoaderBoot.ICONPATH + "100pve0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 136, true),
					new Effect(TypeEffect.DefM, false, 128, true),
				}),
			new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, "Sandales Légères"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				10, ArmorType.BOTTE, LoaderBoot.ICONPATH + "40pve3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 105, true),
				}),
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