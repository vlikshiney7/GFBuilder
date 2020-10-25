package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Cape;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;

@SuppressWarnings("serial")
public class LoaderCape {

	static Cape[] getCape() {
		Cape[] class1 = getGuerrier();
		Cape[] class2 = getArcher();
		Cape[] class3 = getPretre();
		Cape[] class4 = getMage();
		Cape[] class5 = getMeca();
		Cape[] class6 = getVoyageur();
		Cape[] classAll = getAll();
		
		Cape[] result = new Cape[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length + classAll.length];
		
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
		
		for(int j = 0; j < classAll.length; i++, j++) {
			result[i] = classAll[j];
		}
		
		return result;
	}

	private static Cape[] getGuerrier() {
		return new Cape[] {
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Martiale Suprême"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, Quality.GOLD, true, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 185, true),
					new Effect(TypeEffect.DefM, false, 140, true),
					new Effect(TypeEffect.FCE, false, 60, true),
					new Effect(TypeEffect.VIT, false, 53, true),
					new Effect(TypeEffect.AGI, false, 46, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Sceau : Cape Martiale de la Nature"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				88, Quality.GOLD, true, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 153, true),
					new Effect(TypeEffect.DefM, false, 108, true),
					new Effect(TypeEffect.FCE, false, 48, true),
					new Effect(TypeEffect.VIT, false, 42, true),
					new Effect(TypeEffect.AGI, false, 38, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Courage de Krang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, Quality.GOLD, true, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 144, true),
					new Effect(TypeEffect.DefM, false, 98, true),
					new Effect(TypeEffect.FCE, false, 54, true),
					new Effect(TypeEffect.VIT, false, 35, true),
					new Effect(TypeEffect.AGI, false, 31, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Combat de Krang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, Quality.GOLD, true, "-1", "purple0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 144, true),
					new Effect(TypeEffect.DefM, false, 98, true),
					new Effect(TypeEffect.FCE, false, 39, true),
					new Effect(TypeEffect.VIT, false, 54, true),
					new Effect(TypeEffect.AGI, false, 27, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Courage de Meshuga"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, Quality.GOLD, true, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 125, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.FCE, false, 44, true),
					new Effect(TypeEffect.VIT, false, 41, true),
					new Effect(TypeEffect.AGI, false, 27, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Fureur d'Envie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, Quality.GOLD, true, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 125, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.FCE, false, 50, true),
					new Effect(TypeEffect.VIT, false, 33, true),
					new Effect(TypeEffect.AGI, false, 29, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Mental d'Envie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, Quality.GOLD, true, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 125, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.FCE, false, 37, true),
					new Effect(TypeEffect.VIT, false, 50, true),
					new Effect(TypeEffect.AGI, false, 25, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Tricotée du Courage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, Quality.GOLD, true, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 116, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.FCE, false, 44, true),
					new Effect(TypeEffect.VIT, false, 25, true),
					new Effect(TypeEffect.AGI, false, 19, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Tricotée de l'Esprit Combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, Quality.GOLD, true, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 116, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.FCE, false, 29, true),
					new Effect(TypeEffect.VIT, false, 44, true),
					new Effect(TypeEffect.AGI, false, 15, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Ailes de courage de garde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 145, true),
					new Effect(TypeEffect.DefM, false, 103, true),
					new Effect(TypeEffect.FCE, false, 50, true),
					new Effect(TypeEffect.VIT, false, 26, true),
					new Effect(TypeEffect.PV, false, 480),
					new Effect(TypeEffect.PM, false, 270),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Premier Mouvement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				86, Quality.BLUE, false, "-1", "green0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 141, true),
					new Effect(TypeEffect.DefM, false, 100, true),
					new Effect(TypeEffect.FCE, false, 38, true),
					new Effect(TypeEffect.VIT, false, 38, true),
					new Effect(TypeEffect.PV, false, 480),
					new Effect(TypeEffect.PM, false, 320),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Bravoure Décisive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 130, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.FCE, false, 42, true),
					new Effect(TypeEffect.VIT, false, 26, true),
					new Effect(TypeEffect.PV, false, 450),
					new Effect(TypeEffect.PM, false, 250),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau Rouge du Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				76, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 129, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.FCE, false, 34, true),
					new Effect(TypeEffect.VIT, false, 34, true),
					new Effect(TypeEffect.PV, false, 430),
					new Effect(TypeEffect.PM, false, 270),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Courageux Combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, Quality.BLUE, false, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 120, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.FCE, false, 40, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.PV, false, 430),
					new Effect(TypeEffect.PM, false, 220),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Puissance de Khagda"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				66, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 118, true),
					new Effect(TypeEffect.DefM, false, 84, true),
					new Effect(TypeEffect.FCE, false, 30, true),
					new Effect(TypeEffect.VIT, false, 30, true),
					new Effect(TypeEffect.PV, false, 405),
					new Effect(TypeEffect.PM, false, 245),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Preneur de Vie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				63, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 114, true),
					new Effect(TypeEffect.DefM, false, 82, true),
					new Effect(TypeEffect.FCE, false, 29, true),
					new Effect(TypeEffect.VIT, false, 27, true),
					new Effect(TypeEffect.PV, false, 380),
					new Effect(TypeEffect.PM, false, 220),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Habit du Sauveur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 79, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.AGI, false, 22, true),
					new Effect(TypeEffect.PV, false, 500),
					new Effect(TypeEffect.PM, false, 100),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Chevalier Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				55, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 105, true),
					new Effect(TypeEffect.DefM, false, 75, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.VOL, false, 16, true),
					new Effect(TypeEffect.PV, false, 450),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Fort Inébranlable"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				47, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 68, true),
					new Effect(TypeEffect.FCE, false, 16, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 50),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Habit du Chevalier de Haut Vol"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				39, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 86, true),
					new Effect(TypeEffect.DefM, false, 61, true),
					new Effect(TypeEffect.FCE, false, 16, true),
					new Effect(TypeEffect.VIT, false, 12, true),
					new Effect(TypeEffect.PV, false, 200),
					new Effect(TypeEffect.PM, false, 100),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Luisante de Sang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				47, Quality.GREEN, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 86, true),
					new Effect(TypeEffect.DefM, false, 61, true),
					new Effect(TypeEffect.FCE, false, 10, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Guerrier Royal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				39, Quality.GREEN, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 77, true),
					new Effect(TypeEffect.DefM, false, 55, true),
					new Effect(TypeEffect.FCE, false, 8, true),
				}, null ),
		};
	}

	private static Cape[] getArcher() {
		return new Cape[] {
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Fatale Sonique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				90, Quality.GOLD, false, "-1", "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 176, true),
					new Effect(TypeEffect.DefM, false, 149, true),
					new Effect(TypeEffect.FCE, false, 55, true),
					new Effect(TypeEffect.VIT, false, 48, true),
					new Effect(TypeEffect.AGI, false, 56, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Divine : Cape du Vent Furtif"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				88, Quality.GOLD, false, "-1", "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 144, true),
					new Effect(TypeEffect.DefM, false, 117, true),
					new Effect(TypeEffect.FCE, false, 43, true),
					new Effect(TypeEffect.VIT, false, 38, true),
					new Effect(TypeEffect.AGI, false, 47, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Agilité de Krang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.GOLD, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 109, true),
					new Effect(TypeEffect.FCE, false, 30, true),
					new Effect(TypeEffect.VIT, false, 36, true),
					new Effect(TypeEffect.AGI, false, 54, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Mortelle de Krang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.GOLD, false, "-1", "purple0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 109, true),
					new Effect(TypeEffect.FCE, false, 54, true),
					new Effect(TypeEffect.VIT, false, 27, true),
					new Effect(TypeEffect.AGI, false, 39, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Furtivité de Meshuga"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.GOLD, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.FCE, false, 39, true),
					new Effect(TypeEffect.VIT, false, 29, true),
					new Effect(TypeEffect.AGI, false, 44, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Flèche d'Envie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.GOLD, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.FCE, false, 28, true),
					new Effect(TypeEffect.VIT, false, 34, true),
					new Effect(TypeEffect.AGI, false, 50, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Ombre d'Envie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.GOLD, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.FCE, false, 50, true),
					new Effect(TypeEffect.VIT, false, 25, true),
					new Effect(TypeEffect.AGI, false, 37, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Légère Cape Tricotée de l'Alchimiste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.GOLD, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 97, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.FCE, false, 18, true),
					new Effect(TypeEffect.VIT, false, 26, true),
					new Effect(TypeEffect.AGI, false, 44, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Tricotée Mortelle de l'Alchimiste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.GOLD, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 97, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.FCE, false, 44, true),
					new Effect(TypeEffect.VIT, false, 15, true),
					new Effect(TypeEffect.AGI, false, 29, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Précision de sniper"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				100, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 130, true),
					new Effect(TypeEffect.DefM, false, 124, true),
					new Effect(TypeEffect.VIT, false, 32, true),
					new Effect(TypeEffect.AGI, false, 52, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 400),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Aile d'éclat perçante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				90, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 121, true),
					new Effect(TypeEffect.DefM, false, 115, true),
					new Effect(TypeEffect.VIT, false, 28, true),
					new Effect(TypeEffect.AGI, false, 48, true),
					new Effect(TypeEffect.PV, false, 375),
					new Effect(TypeEffect.PM, false, 375),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Sténographe"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				87, Quality.BLUE, false, "-1", "purple1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 118, true),
					new Effect(TypeEffect.DefM, false, 112, true),
					new Effect(TypeEffect.VIT, false, 34, true),
					new Effect(TypeEffect.AGI, false, 42, true),
					new Effect(TypeEffect.PV, false, 450),
					new Effect(TypeEffect.PM, false, 350),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Agilité des Dryades"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				82, Quality.BLUE, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 113, true),
					new Effect(TypeEffect.DefM, false, 108, true),
					new Effect(TypeEffect.VIT, false, 32, true),
					new Effect(TypeEffect.AGI, false, 40, true),
					new Effect(TypeEffect.PV, false, 425),
					new Effect(TypeEffect.PM, false, 325),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Grands Vents"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 100, true),
					new Effect(TypeEffect.DefM, false, 127, true),
					new Effect(TypeEffect.VIT, false, 28, true),
					new Effect(TypeEffect.AGI, false, 40, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 300),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau d'Agilité"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				77, Quality.BLUE, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 109, true),
					new Effect(TypeEffect.DefM, false, 103, true),
					new Effect(TypeEffect.VIT, false, 30, true),
					new Effect(TypeEffect.AGI, false, 38, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 300),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voleur Agile"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.BLUE, false, "-1", "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 112, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.AGI, false, 40, true),
					new Effect(TypeEffect.PV, false, 325),
					new Effect(TypeEffect.PM, false, 325),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Mandra d'Adresse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				66, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 98, true),
					new Effect(TypeEffect.DefM, false, 93, true),
					new Effect(TypeEffect.VIT, false, 25, true),
					new Effect(TypeEffect.AGI, false, 35, true),
					new Effect(TypeEffect.PV, false, 375),
					new Effect(TypeEffect.PM, false, 275),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape en Ecailles de Dragon Blanc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				63, Quality.BLUE, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 100, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.FCE, false, 28, true),
					new Effect(TypeEffect.AGI, false, 28, true),
					new Effect(TypeEffect.PV, false, 350),
					new Effect(TypeEffect.PM, false, 250),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Habit Aile de Lumière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.FCE, false, 20, true),
					new Effect(TypeEffect.AGI, false, 24, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 200),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voyageur Temporel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				55, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 87, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.INT, false, 18, true),
					new Effect(TypeEffect.AGI, false, 18, true),
					new Effect(TypeEffect.PV, false, 420),
					new Effect(TypeEffect.PM, false, 30),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Habit Aile de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				47, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 80, true),
					new Effect(TypeEffect.DefM, false, 76, true),
					new Effect(TypeEffect.VIT, false, 15, true),
					new Effect(TypeEffect.AGI, false, 21, true),
					new Effect(TypeEffect.PV, false, 350),
					new Effect(TypeEffect.PM, false, 100),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Chant de la Nature"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				39, Quality.BLUE, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 72, true),
					new Effect(TypeEffect.DefM, false, 68, true),
					new Effect(TypeEffect.FCE, false, 18, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.PV, false, 180),
					new Effect(TypeEffect.PM, false, 120),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Châle Elaboré de Chaînes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				47, Quality.GREEN, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 72, true),
					new Effect(TypeEffect.DefM, false, 68, true),
					new Effect(TypeEffect.VIT, false, 10, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Voyageur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				39, Quality.GREEN, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 61, true),
					new Effect(TypeEffect.AGI, false, 8, true),
				}, null ),
		};
	}

	private static Cape[] getPretre() {
		return new Cape[] {
			
		};
	}

	private static Cape[] getMage() {
		return new Cape[] {
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Grandes Profondeurs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				90, Quality.GOLD, true, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 161, true),
					new Effect(TypeEffect.DefM, false, 164, true),
					new Effect(TypeEffect.VIT, false, 51, true),
					new Effect(TypeEffect.INT, false, 59, true),
					new Effect(TypeEffect.VOL, false, 49, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Savoir de Gargantua"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, Quality.GOLD, true, "-1", "purple1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 107, true),
					new Effect(TypeEffect.DefM, false, 131, true),
					new Effect(TypeEffect.VIT, false, 32, true),
					new Effect(TypeEffect.INT, false, 56, true),
					new Effect(TypeEffect.VOL, false, 32, true),
				}, null ),
		};
	}

	private static Cape[] getMeca() {
		return new Cape[] {
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape incomparable de Dieu fou"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, Quality.GOLD, true, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 121, true),
					new Effect(TypeEffect.VIT, false, 32, true),
					new Effect(TypeEffect.VOL, false, 45, true),
					new Effect(TypeEffect.AGI, false, 59, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape galactique de Tempo rapide de danse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				88, Quality.GOLD, true, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 152, true),
					new Effect(TypeEffect.DefM, false, 108, true),
					new Effect(TypeEffect.FCE, false, 55, true),
					new Effect(TypeEffect.VIT, false, 42, true),
					new Effect(TypeEffect.VOL, false, 31, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Confrontation de Krang"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, Quality.GOLD, true, "-1", "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 141, true),
					new Effect(TypeEffect.DefM, false, 100, true),
					new Effect(TypeEffect.FCE, false, 54, true),
					new Effect(TypeEffect.VIT, false, 41, true),
					new Effect(TypeEffect.VOL, false, 33, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Bénédiction de Gargantua"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, Quality.GOLD, true, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 117, true),
					new Effect(TypeEffect.DefM, false, 111, true),
					new Effect(TypeEffect.VIT, false, 31, true),
					new Effect(TypeEffect.VOL, false, 42, true),
					new Effect(TypeEffect.AGI, false, 55, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape dure d'Envie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, Quality.GOLD, true, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 129, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.FCE, false, 48, true),
					new Effect(TypeEffect.VIT, false, 36, true),
					new Effect(TypeEffect.VOL, false, 28, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Attrait de Paresse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, Quality.GOLD, true, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 107, true),
					new Effect(TypeEffect.DefM, false, 102, true),
					new Effect(TypeEffect.VIT, false, 27, true),
					new Effect(TypeEffect.VOL, false, 35, true),
					new Effect(TypeEffect.AGI, false, 50, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Justice armée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, Quality.GOLD, true, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 125, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.FCE, false, 40, true),
					new Effect(TypeEffect.VIT, false, 33, true),
					new Effect(TypeEffect.AGI, false, 39, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape tressée claquante d'Alchimiste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				60, Quality.GOLD, true, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 116, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.FCE, false, 40, true),
					new Effect(TypeEffect.VIT, false, 32, true),
					new Effect(TypeEffect.VOL, false, 24, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape tressée de contre-attaque d'Alchimiste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				60, Quality.GOLD, true, "-1", "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 97, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.VIT, false, 23, true),
					new Effect(TypeEffect.VOL, false, 31, true),
					new Effect(TypeEffect.AGI, false, 42, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Pluie d'étoiles filantes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 156, true),
					new Effect(TypeEffect.DefM, false, 111, true),
					new Effect(TypeEffect.FCE, false, 45, true),
					new Effect(TypeEffect.AGI, false, 39, true),
					new Effect(TypeEffect.PV, false, 510),
					new Effect(TypeEffect.PM, false, 290),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Aile choquante de bombardement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 145, true),
					new Effect(TypeEffect.DefM, false, 103, true),
					new Effect(TypeEffect.FCE, false, 41, true),
					new Effect(TypeEffect.AGI, false, 35, true),
					new Effect(TypeEffect.PV, false, 480),
					new Effect(TypeEffect.PM, false, 270),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Étoile de lave"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				86, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 141, true),
					new Effect(TypeEffect.DefM, false, 100, true),
					new Effect(TypeEffect.FCE, false, 38, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.VOL, false, 18, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Martyr"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				86, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 117, true),
					new Effect(TypeEffect.DefM, false, 111, true),
					new Effect(TypeEffect.VIT, false, 17, true),
					new Effect(TypeEffect.VOL, false, 21, true),
					new Effect(TypeEffect.AGI, false, 38, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Démon flottant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				83, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 137, true),
					new Effect(TypeEffect.DefM, false, 98, true),
					new Effect(TypeEffect.FCE, false, 36, true),
					new Effect(TypeEffect.VIT, false, 19, true),
					new Effect(TypeEffect.VOL, false, 17, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Oriflamme de la Lutte effrénée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 130, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.FCE, false, 38, true),
					new Effect(TypeEffect.AGI, false, 30, true),
					new Effect(TypeEffect.PV, false, 450),
					new Effect(TypeEffect.PM, false, 250),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau de Guerrier météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				79, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.VIT, false, 14, true),
					new Effect(TypeEffect.VOL, false, 21, true),
					new Effect(TypeEffect.AGI, false, 33, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Vent voltigeant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				77, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 131, true),
					new Effect(TypeEffect.DefM, false, 93, true),
					new Effect(TypeEffect.FCE, false, 32, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.VOL, false, 16, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Oriflamme de la Charge intrépide du taureau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, Quality.BLUE, false, "-1", "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 120, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.FCE, false, 35, true),
					new Effect(TypeEffect.AGI, false, 25, true),
					new Effect(TypeEffect.PV, false, 430),
					new Effect(TypeEffect.PM, false, 220),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Créateur du monde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				60, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 79, true),
					new Effect(TypeEffect.FCE, false, 22, true),
					new Effect(TypeEffect.VIT, false, 16, true),
					new Effect(TypeEffect.VOL, false, 14, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Créateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				60, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.VIT, false, 11, true),
					new Effect(TypeEffect.VOL, false, 14, true),
					new Effect(TypeEffect.AGI, false, 27, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Hallebarde gravante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				55, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 87, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.VIT, false, 7, true),
					new Effect(TypeEffect.VOL, false, 10, true),
					new Effect(TypeEffect.AGI, false, 19, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape éthérée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				55, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 87, true),
					new Effect(TypeEffect.DefM, false, 83, true),
					new Effect(TypeEffect.VIT, false, 7, true),
					new Effect(TypeEffect.VOL, false, 10, true),
					new Effect(TypeEffect.AGI, false, 19, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape lourde de Plume du zodiaque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				47, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 68, true),
					new Effect(TypeEffect.FCE, false, 16, true),
					new Effect(TypeEffect.VIT, false, 11, true),
					new Effect(TypeEffect.VOL, false, 9, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Écrasement galactique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				39, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 72, true),
					new Effect(TypeEffect.DefM, false, 68, true),
					new Effect(TypeEffect.VIT, false, 5, true),
					new Effect(TypeEffect.VOL, false, 8, true),
					new Effect(TypeEffect.AGI, false, 15, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape lourde de Puissante onde de choc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, },
				38, Quality.BLUE, false, "-1", "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 60, true),
					new Effect(TypeEffect.FCE, false, 13, true),
					new Effect(TypeEffect.VIT, false, 8, true),
					new Effect(TypeEffect.VOL, false, 7, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Bruit assaillant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				38, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 71, true),
					new Effect(TypeEffect.DefM, false, 67, true),
					new Effect(TypeEffect.VIT, false, 6, true),
					new Effect(TypeEffect.VOL, false, 9, true),
					new Effect(TypeEffect.AGI, false, 13, true),
				}, null ),
		};
	}

	private static Cape[] getVoyageur() {
		return new Cape[] {
			
		};
	}

	private static Cape[] getAll() {
		return new Cape[] {
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Berserker"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.GOLD, false, "tdb0", "tdb0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 152, true),
					new Effect(TypeEffect.DefM, false, 108, true),
					new Effect(TypeEffect.FCE, false, 48, true),
					new Effect(TypeEffect.VIT, false, 40, true),
					new Effect(TypeEffect.VOL, false, 40, true),
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 5),
						new Effect(TypeEffect.RTCCM, false, 5),
						new Effect(TypeEffect.MEN, false, 5),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Tête de dragon de jade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.GOLD, false, "tdb1", "tdb1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 121, true),
					new Effect(TypeEffect.VIT, false, 40, true),
					new Effect(TypeEffect.VOL, false, 40, true),
					new Effect(TypeEffect.AGI, false, 48, true),
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
						new Effect(TypeEffect.Depla, false, 3),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Capuche de Lumière Sacrée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.GOLD, false, "tdb2", "tdb2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 140, true),
					new Effect(TypeEffect.DefM, false, 133, true),
					new Effect(TypeEffect.FCE, false, 44, true),
					new Effect(TypeEffect.INT, false, 44, true),
					new Effect(TypeEffect.VOL, false, 40, true),
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.IntComp, false, -45),
						new Effect(TypeEffect.VitComp, false, 13),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Crâne Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.GOLD, false, "tdb3", "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 114, true),
					new Effect(TypeEffect.DefM, false, 145, true),
					new Effect(TypeEffect.INT, false, 44, true),
					new Effect(TypeEffect.VOL, false, 44, true),
					new Effect(TypeEffect.AGI, false, 40, true),
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -60),
						new Effect(TypeEffect.RegenPM, false, 40),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Roi Sans Peur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.GOLD, false, "tdb4", "tdb4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 107, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.FCE, false, 43, true),
					new Effect(TypeEffect.INT, false, 43, true),
					new Effect(TypeEffect.AGI, false, 42, true),
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 5),
						new Effect(TypeEffect.TCCM, false, 5),
						new Effect(TypeEffect.VitAtk, false, 5),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Berserker"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.ORANGE, false, "tdb0", "tdb0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 138, true),
					new Effect(TypeEffect.DefM, false, 98, true),
					new Effect(TypeEffect.FCE, false, 28, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.VOL, false, 22, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Tête de dragon de jade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.ORANGE, false, "tdb1", "tdb1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 115, true),
					new Effect(TypeEffect.DefM, false, 109, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.VOL, false, 22, true),
					new Effect(TypeEffect.AGI, false, 28, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Capuche de Lumière Sacrée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.ORANGE, false, "tdb2", "tdb2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 126, true),
					new Effect(TypeEffect.DefM, false, 120, true),
					new Effect(TypeEffect.FCE, false, 25, true),
					new Effect(TypeEffect.INT, false, 25, true),
					new Effect(TypeEffect.VOL, false, 22, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Crâne Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.ORANGE, false, "tdb3", "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 103, true),
					new Effect(TypeEffect.DefM, false, 131, true),
					new Effect(TypeEffect.INT, false, 25, true),
					new Effect(TypeEffect.VOL, false, 25, true),
					new Effect(TypeEffect.AGI, false, 22, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Roi Sans Peur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.ORANGE, false, "tdb4", "tdb4", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 92, true),
					new Effect(TypeEffect.FCE, false, 24, true),
					new Effect(TypeEffect.INT, false, 24, true),
					new Effect(TypeEffect.AGI, false, 24, true),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau d'Abysse d'Elf Noir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 94, true),
					new Effect(TypeEffect.DefM, false, 126, true),
					new RegenEffect(TypeEffect.PV, false, 59, 61, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 90, 94, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gélapin divin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 98, true),
					new Effect(TypeEffect.DefM, false, 94, true),
					new RegenEffect(TypeEffect.PM, false, 61, 64, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gélapin téméraire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 128, true),
					new RegenEffect(TypeEffect.PV, false, 109, 113, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape mythique du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, Quality.BLUE, false, "-1", "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 128, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new RegenEffect(TypeEffect.PV, false, 109, 113, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 61, 64, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Infernale de Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 156, true),
					new Effect(TypeEffect.DefM, false, 111, true),
					new RegenEffect(TypeEffect.PV, false, 89, 93, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 48, 50, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape lunesang de l'infini"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.BLUE, false, "90sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 133, true),
					new Effect(TypeEffect.DefM, false, 126, true),
					new Effect(TypeEffect.PV, false, 720),
					new Effect(TypeEffect.PM, false, 360),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du palais Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 91, true),
					new Effect(TypeEffect.DefM, false, 87, true),
					new RegenEffect(TypeEffect.PM, false, 56, 59, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gélapin érudit"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new RegenEffect(TypeEffect.PV, false, 99, 103, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Néant du Sprite sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 82, true),
					new Effect(TypeEffect.DefM, false, 72, true),
					new RegenEffect(TypeEffect.PV, false, 69, 73, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 42, 44, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de gardien sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb0", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 3, new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 1),
						new Effect(TypeEffect.ReducPeneM, false, 1),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'envolée fantastique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb1", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 2),
						new Effect(TypeEffect.ReducM, false, 2),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape hydrophobe"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb2", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.Ombre, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.Foudre, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.Feu, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.Glace, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.Nature, false, 10, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, 5, Target.OPPONENT),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape sans-fin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb3", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.FCE, true, -5, Target.OPPONENT),
						new Effect(TypeEffect.VIT, true, -5, Target.OPPONENT),
						new Effect(TypeEffect.INT, true, -5, Target.OPPONENT),
						new Effect(TypeEffect.VOL, true, -5, Target.OPPONENT),
						new Effect(TypeEffect.AGI, true, -5, Target.OPPONENT),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du bout de l'éternité"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb4", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 5),
						new Effect(TypeEffect.AtkM, true, 5),
						new Effect(TypeEffect.DCCP, false, 1),
						new Effect(TypeEffect.DCCM, false, 1),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Cri de Guerre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb0", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 5),
						new Effect(TypeEffect.RTCCM, false, 5),
						new Effect(TypeEffect.MEN, false, 5),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Orties"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb1", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
						new Effect(TypeEffect.Depla, false, 3),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Bénédiction Divine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb2", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.IntComp, false, -45),
						new Effect(TypeEffect.VitComp, false, 13),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Dieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb3", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -60),
						new Effect(TypeEffect.RegenPM, false, 40),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Extrême"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "tdb4", new Calculable[] {
				}, new Calculable[] {
					new Proc(5, Activation.Crit, 5, 2, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 5),
						new Effect(TypeEffect.TCCM, false, 5),
						new Effect(TypeEffect.VitAtk, false, 5),
					}),
				}),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du guide de la bête divine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "80sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 123, true),
					new Effect(TypeEffect.DefM, false, 117, true),
					new Effect(TypeEffect.PV, false, 640),
					new Effect(TypeEffect.PM, false, 320),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 76, true),
					new Effect(TypeEffect.DefM, false, 69, true),
					new RegenEffect(TypeEffect.PV, false, 59, 63, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 36, 38, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Dynastie de Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 84, true),
					new Effect(TypeEffect.DefM, false, 80, true),
					new RegenEffect(TypeEffect.PM, false, 51, 53, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Charmante de Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 110, true),
					new RegenEffect(TypeEffect.PV, false, 89, 93, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Âme du Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, Quality.BLUE, false, "black1", "red2", new MultiEffect(70, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 73, true),
						new Effect(TypeEffect.DefM, false, 69, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 74, true),
						new Effect(TypeEffect.DefM, false, 69, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 74, true),
						new Effect(TypeEffect.DefM, false, 70, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 75, true),
						new Effect(TypeEffect.DefM, false, 70, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 76, true),
						new Effect(TypeEffect.DefM, false, 70, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 77, true),
						new Effect(TypeEffect.DefM, false, 71, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 77, true),
						new Effect(TypeEffect.DefM, false, 71, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 78, true),
						new Effect(TypeEffect.DefM, false, 71, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 79, true),
						new Effect(TypeEffect.DefM, false, 71, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 80, true),
						new Effect(TypeEffect.DefM, false, 72, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 80, true),
						new Effect(TypeEffect.DefM, false, 72, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 81, true),
						new Effect(TypeEffect.DefM, false, 72, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 82, true),
						new Effect(TypeEffect.DefM, false, 73, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 82, true),
						new Effect(TypeEffect.DefM, false, 73, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 83, true),
						new Effect(TypeEffect.DefM, false, 74, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 84, true),
						new Effect(TypeEffect.DefM, false, 74, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 85, true),
						new Effect(TypeEffect.DefM, false, 74, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 86, true),
						new Effect(TypeEffect.DefM, false, 75, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 86, true),
						new Effect(TypeEffect.DefM, false, 75, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 87, true),
						new Effect(TypeEffect.DefM, false, 76, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, false, 88, true),
						new Effect(TypeEffect.DefM, false, 76, true),
						new RegenEffect(TypeEffect.PV, false, 72, 76, TypeRegen.REGENERATION, 5),
						new RegenEffect(TypeEffect.PM, false, 45, 47, TypeRegen.REGENERATION, 5),
					},
				}), null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape lumicloche du gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, Quality.BLUE, false, "70sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 112, true),
					new Effect(TypeEffect.DefM, false, 107, true),
					new Effect(TypeEffect.PV, false, 560),
					new Effect(TypeEffect.PM, false, 280),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Céleste du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 77, true),
					new Effect(TypeEffect.DefM, false, 73, true),
					new RegenEffect(TypeEffect.PM, false, 46, 48, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Roi des Lapins Gélatineux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 101, true),
					new RegenEffect(TypeEffect.PV, false, 79, 83, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Infernale de Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 70, true),
					new Effect(TypeEffect.DefM, false, 66, true),
					new RegenEffect(TypeEffect.PV, false, 49, 53, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 30, 32, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape divine de la lignée interdite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, Quality.BLUE, false, "60sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.PV, false, 480),
					new Effect(TypeEffect.PM, false, 240),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Démoniaque de Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 63, true),
					new RegenEffect(TypeEffect.PV, false, 39, 43, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 24, 26, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gélapin Saint"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 70, true),
					new Effect(TypeEffect.DefM, false, 66, true),
					new RegenEffect(TypeEffect.PM, false, 41, 43, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Arès du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new RegenEffect(TypeEffect.PV, false, 69, 73, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de peau de lion de l'étranger"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				50, Quality.BLUE, false, "50sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 91, true),
					new Effect(TypeEffect.DefM, false, 86, true),
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 200),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Esprit du Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				50, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 63, true),
					new RegenEffect(TypeEffect.PV, false, 30, 32, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 18, 20, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Divine du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				50, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 63, true),
					new RegenEffect(TypeEffect.PM, false, 35, 37, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Âme Guerrière du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				50, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 83, true),
					new RegenEffect(TypeEffect.PV, false, 59, 63, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Mystérieuse cape de silence"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, Quality.BLUE, false, "40sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 80, true),
					new Effect(TypeEffect.DefM, false, 76, true),
					new Effect(TypeEffect.PV, false, 320),
					new Effect(TypeEffect.PM, false, 160),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Démoniaque du Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 56, true),
					new Effect(TypeEffect.DefM, false, 53, true),
					new RegenEffect(TypeEffect.PV, false, 25, 27, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 15, 17, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Sacrée du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 56, true),
					new Effect(TypeEffect.DefM, false, 53, true),
					new RegenEffect(TypeEffect.PM, false, 29, 31, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Combat Féroce du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new RegenEffect(TypeEffect.PV, false, 49, 53, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Marque de vitesse cape d'invisibilité"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				30, Quality.BLUE, false, "30sombre", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 69, true),
					new Effect(TypeEffect.DefM, false, 65, true),
					new Effect(TypeEffect.PV, false, 220),
					new Effect(TypeEffect.PM, false, 120),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Corrompue du Sprite Sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				30, Quality.BLUE, false, "-1", "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 47, true),
					new Effect(TypeEffect.DefM, false, 45, true),
					new RegenEffect(TypeEffect.PV, false, 20, 22, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 12, 14, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Magique du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				30, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 47, true),
					new Effect(TypeEffect.DefM, false, 45, true),
					new RegenEffect(TypeEffect.PM, false, 23, 25, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Bataille du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				30, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 63, true),
					new RegenEffect(TypeEffect.PV, false, 39, 43, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Mana du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				20, Quality.BLUE, false, "-1", "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 40, true),
					new Effect(TypeEffect.DefM, false, 39, true),
					new RegenEffect(TypeEffect.PM, false, 18, 20, TypeRegen.REGENERATION, 5),
				}, null ),
			new Cape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Vie du Gélapin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				20, Quality.BLUE, false, "-1", "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 54, true),
					new RegenEffect(TypeEffect.PV, false, 30, 34, TypeRegen.REGENERATION, 5),
				}, null ),
		};
	}
}
