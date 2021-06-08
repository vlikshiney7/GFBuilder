package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomCape;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class LoaderCustomCape {

	static CustomCape[] getCape() {
		CustomCape[] class1 = getGuerrier();
		CustomCape[] class2 = getArcher();
		CustomCape[] class3 = getPretre();
		CustomCape[] class4 = getMage();
		CustomCape[] class5 = getMeca();
		CustomCape[] class6 = getVoyageur();
		
		CustomCape[] result = new CustomCape[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length];
		
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
	
	private static CustomCape[] getGuerrier() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Lune du Loup"); put(Language.EN, "Wolf Moon Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 94, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Vagabond"); put(Language.EN, "Wanderer Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 94, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Feu Infernal"); put(Language.EN, "Hell Scorch Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 123, true),
					new Effect(TypeEffect.DefM, false, 91, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Tempête Estivale"); put(Language.EN, "Summer Storm Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 123, true),
					new Effect(TypeEffect.DefM, false, 91, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Courageux"); put(Language.EN, "Fearless Believer Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 87, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Courageux"); put(Language.EN, "Fearless Believer Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 87, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gardien Violent"); put(Language.EN, "Violent Guardian Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				85, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 115, true),
					new Effect(TypeEffect.DefM, false, 84, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Bien et du Mal"); put(Language.EN, "Darklight Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 81, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Hécatombe"); put(Language.EN, "Northern Bloodbath Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				75, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 77, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Pelisse des Conquérants"); put(Language.EN, "Battleheart Cloak"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 74, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Héros Déterminé"); put(Language.EN, "Big Dipper Hero Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				65, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 98, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Rideau de l'Empereur"); put(Language.EN, "Emperor's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 93, true),
					new Effect(TypeEffect.DefM, false, 67, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Héros"); put(Language.EN, "Hero's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 93, true),
					new Effect(TypeEffect.DefM, false, 67, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Samouraï"); put(Language.EN, "Templar's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Mort"); put(Language.EN, "Death Adder Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Sentinelle Sacrée"); put(Language.EN, "Holy Sentry's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape marquée de Sang"); put(Language.EN, "Bloodstained Sigil Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 61, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Forteresse"); put(Language.EN, "Fortress Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Guerrier"); put(Language.EN, "Warrior's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Mur Fortifié"); put(Language.EN, "Fortress Wall Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 56, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Chevalier"); put(Language.EN, "Knight's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				39, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 73, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Officier"); put(Language.EN, "Soldier's Mantle"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				39, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 72, true),
					new Effect(TypeEffect.DefM, false, 50, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Soldat au Combat"); put(Language.EN, "Combatant's Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 45, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Trophée"); put(Language.EN, "Championship Cape"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 63, true),
					new Effect(TypeEffect.DefM, false, 44, true),
				}),
		};
	}
	
	private static CustomCape[] getArcher() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Spectre Hurlant"); put(Language.EN, "Ghost Howl Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				100, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Marcheur des Ombres"); put(Language.EN, "Shadow Walker Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				100, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Foudroyante"); put(Language.EN, "Thunder Grove Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				95, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Feuille d'Automne"); put(Language.EN, "Autumn Leaf Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Audacieux"); put(Language.EN, "Dauntless Believer Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				90, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 99, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Audacieux"); put(Language.EN, "Dauntless Believer Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				90, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 99, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Rôdeur Rapide"); put(Language.EN, "Shadowglide Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				85, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 93, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Rapide Perfection"); put(Language.EN, "Quickshot Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				80, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Éclaireur"); put(Language.EN, "Snow Hermit Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				75, "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 86, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Caban des Aventuriers"); put(Language.EN, "Dark Spirit Cloak"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				70, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 82, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Volante"); put(Language.EN, "Mantle of Flight"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				65, "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 78, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Roi"); put(Language.EN, "Fearless King Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				60, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 78, true),
					new Effect(TypeEffect.DefM, false, 74, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Habit de l'Aile Volante"); put(Language.EN, "Flying Wing Mantle"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				60, "green2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 78, true),
					new Effect(TypeEffect.DefM, false, 74, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Promeneur Céleste"); put(Language.EN, "Skywalker Mantle"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Habit de Plumes de Phénix"); put(Language.EN, "Phoenix Pinion Mantle"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Ombre Rapide"); put(Language.EN, "Swift Shadow Mantle"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 69, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Dragon Doré"); put(Language.EN, "Golden Dragon Mantle"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 69, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle en Peau de Dragon"); put(Language.EN, "Dragonskin Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 64, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Cristal"); put(Language.EN, "Devious Crystal Cloak"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				47, "purple1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 64, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau Aile de Dragon"); put(Language.EN, "Dragonwing Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Ranger"); put(Language.EN, "Ranger Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Elégant Châle"); put(Language.EN, "Elegant Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 56, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle Epineux"); put(Language.EN, "Thorn Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 54, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Randonnée Forestière"); put(Language.EN, "Sylvan Cape"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 53, true),
					new Effect(TypeEffect.DefM, false, 50, true),
				}),
		};
	}
	
	private static CustomCape[] getPretre() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Flamme d'Hiver"); put(Language.EN, "Winterflame Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				100, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 116, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Délivrance"); put(Language.EN, "Deliverance Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				100, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 116, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Sables"); put(Language.EN, "Dry Sand Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				95, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 113, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Renouveau Printanier"); put(Language.EN, "Spring Rebirth Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				95, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 113, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Dévoué"); put(Language.EN, "Selfless Believer Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				90, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 109, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Dévoué"); put(Language.EN, "Selfless Believer Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				90, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 109, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voyant du Monde"); put(Language.EN, "Worldseer Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				85, "green0", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 105, true),
					new Effect(TypeEffect.DefM, false, 82, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Dieu sur Terre"); put(Language.EN, "Heaven's Down Mantle"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				80, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 101, true),
					new Effect(TypeEffect.DefM, false, 79, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Chant Envoûtant"); put(Language.EN, "Northwind Song Cloak"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				75, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 98, true),
					new Effect(TypeEffect.DefM, false, 76, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Mante des Protecteurs"); put(Language.EN, "Angel Feather Cloak"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				70, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 94, true),
					new Effect(TypeEffect.DefM, false, 73, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Messager Sacré"); put(Language.EN, "Holy Messenger's Mantle"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				65, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 90, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Soleil Levant"); put(Language.EN, "Rising Sun Mantle"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Pape"); put(Language.EN, "Pontiff's Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Roue Magique"); put(Language.EN, "Magic Wheel Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Feuilles de Vie"); put(Language.EN, "Leaf of Life Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Grand Instructeur"); put(Language.EN, "Drillmaster's Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Kirin"); put(Language.EN, "Kirin Mantle"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle d'Ecaille Légère"); put(Language.EN, "Lightscale Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				47, "purple1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Commandement"); put(Language.EN, "Cape of Precepts"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				47, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle Brillant de l'Ecaille"); put(Language.EN, "Shining Scale Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				47, "purple1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 59, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Foi"); put(Language.EN, "Faith Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 52, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Loi Magique"); put(Language.EN, "Cape of the Magic Law"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle Sacré"); put(Language.EN, "Holy Cape"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 59, true),
					new Effect(TypeEffect.DefM, false, 47, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Voeu"); put(Language.EN, "Cape of Wishes"); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				31, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 58, true),
					new Effect(TypeEffect.DefM, false, 48, true),
				}),
		};
	}
	
	private static CustomCape[] getMage() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Arrogante"); put(Language.EN, "Arrogant Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 95, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Lien Éternel"); put(Language.EN, "Eternal Bond Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 95, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Permafrost"); put(Language.EN, "Permafrost Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Gel Hivernal"); put(Language.EN, "Winter Frost Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Sans Esprit"); put(Language.EN, "Mindless Believer Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				90, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Croyant Sans Esprit"); put(Language.EN, "Mindless Believer Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				90, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Genèse Sombre"); put(Language.EN, "Dark Genesis Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				85, "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 86, true),
					new Effect(TypeEffect.DefM, false, 82, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Fracas Maléfique"); put(Language.EN, "Death Rattle Mantle"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 83, true),
					new Effect(TypeEffect.DefM, false, 79, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Pétrification"); put(Language.EN, "Frosty Prison Cloak"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				75, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 80, true),
					new Effect(TypeEffect.DefM, false, 76, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Pèlerine des Érudits"); put(Language.EN, "Mystic Arbiter's Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				70, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 77, true),
					new Effect(TypeEffect.DefM, false, 73, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Vieux Mage"); put(Language.EN, "Ancient Mage's Mantle"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				65, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 73, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Oeil Magique"); put(Language.EN, "All-Seeing Eye Mantle"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				60, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 70, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Habit des Profondeurs Noires"); put(Language.EN, "Mantle of the Abyss"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 70, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Ténèbres"); put(Language.EN, "Netherworld Mantle"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 66, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Cérémonie"); put(Language.EN, "Ceremonial Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 66, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Abysse des Morts"); put(Language.EN, "Dead Abyss Mantle"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 66, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau Légendaire"); put(Language.EN, "Legendary Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 66, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle Chauve-Souris"); put(Language.EN, "Bat Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				47, "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle à Motifs Magiques"); put(Language.EN, "Runic Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				47, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Chauve-Souris Fantôme"); put(Language.EN, "Devil Bat Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				47, "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 59, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle à Carreaux"); put(Language.EN, "Checkered Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 55, true),
					new Effect(TypeEffect.DefM, false, 52, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle"); put(Language.EN, "Secret Workings Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 55, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Magicien"); put(Language.EN, "Cape of the Magi"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				31, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 48, true),
					new Effect(TypeEffect.DefM, false, 46, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de l'Amuseur"); put(Language.EN, "Entertainer's Cape"); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				31, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 47, true),
					new Effect(TypeEffect.DefM, false, 45, true),
				}),
		};
	}
	
	private static CustomCape[] getMeca() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Vent érodant"); put(Language.EN, "Gust Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				100, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 94, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voyage de fantômes nocturnes"); put(Language.EN, "Deadman's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				100, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle d'Éole soufflant"); put(Language.EN, "Northwind Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				100, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 127, true),
					new Effect(TypeEffect.DefM, false, 94, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'horizon d'Esprit d'obscurité"); put(Language.EN, "Hellion's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				100, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 105, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Fendeur de terre"); put(Language.EN, "Earthsplitter Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				95, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 123, true),
					new Effect(TypeEffect.DefM, false, 91, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Destructeur"); put(Language.EN, "Destroyer's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Résonnance venteuse"); put(Language.EN, "Resonance Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				95, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 123, true),
					new Effect(TypeEffect.DefM, false, 91, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Apôtre de cauchemar"); put(Language.EN, "Cultist's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 101, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Croyant inncocent"); put(Language.EN, "Believer's Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				90, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 87, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Croyant continu"); put(Language.EN, "Zealot's Cape"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				90, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 99, true),
					new Effect(TypeEffect.DefM, false, 97, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle des Tièdes ondulations"); put(Language.EN, "Ripple Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				85, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 115, true),
					new Effect(TypeEffect.DefM, false, 84, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape mince de Pisteur nocturne"); put(Language.EN, "Stalker's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				85, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 93, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Voyage solitaire"); put(Language.EN, "Wanderer's Cape"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				85, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 115, true),
					new Effect(TypeEffect.DefM, false, 84, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Vent fantôme chantant"); put(Language.EN, "Whisperwind Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				80, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 81, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle des Fantômes murmurants"); put(Language.EN, "Phantom Cape"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				80, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 92, true),
					new Effect(TypeEffect.DefM, false, 90, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle des Pleurs des Enfers"); put(Language.EN, "Underworld Cape"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 111, true),
					new Effect(TypeEffect.DefM, false, 81, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Froid du nord"); put(Language.EN, "Frost Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				75, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 77, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Épine de Permafrost"); put(Language.EN, "Permafrost Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				75, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 86, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Neige exotique"); put(Language.EN, "Whiteout Cape"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				75, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 77, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Teinte de lamelle"); put(Language.EN, "Melancholy Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				70, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 74, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Queue de phénix"); put(Language.EN, "Phoenix Cape"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				70, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 82, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de pouvoir réformé"); put(Language.EN, "Transformative Cape"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 74, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Contre-attaquant"); put(Language.EN, "Riposte Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				65, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 98, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Esprits maléfiques"); put(Language.EN, "Haunted Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				65, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 78, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Vent supérieur"); put(Language.EN, "Squall Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				60, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 93, true),
					new Effect(TypeEffect.DefM, false, 67, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Ombre diabolique"); put(Language.EN, "Cursed Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 78, true),
					new Effect(TypeEffect.DefM, false, 74, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Vent contraire"); put(Language.EN, "Headwind Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				55, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Dissimulés"); put(Language.EN, "Concealing Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Béhémoth le croque-mort"); put(Language.EN, "Behemoth Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				55, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Mort-vivant des cimetières"); put(Language.EN, "Funereal Cape"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				55, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle du Grand vent"); put(Language.EN, "Gale Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				47, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de l'Ombre de minuit"); put(Language.EN, "Nightshade Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 64, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Tour de forteresse"); put(Language.EN, "Bastion Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				47, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Voix des esprits maléfiques"); put(Language.EN, "Haunted Cape"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				47, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 64, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de Libération"); put(Language.EN, "Liberation Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				39, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 73, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Furtivité"); put(Language.EN, "Stealth Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				39, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Fluctuations"); put(Language.EN, "Flux Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				39, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 73, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Courbes encerclantes"); put(Language.EN, "Encircling Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				39, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 57, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Châle de la Brise d'assaut"); put(Language.EN, "Assault Cape"); }},
				new GradeName[] { GradeName.METALLEUX, },
				31, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 45, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de L'Espion du reflet"); put(Language.EN, "Espionage Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				31, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 54, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Rechercheurs"); put(Language.EN, "Seeker's Cloak"); }},
				new GradeName[] { GradeName.METALLEUX, },
				31, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 64, true),
					new Effect(TypeEffect.DefM, false, 45, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape des Explorateurs"); put(Language.EN, "Explorer's Cloak"); }},
				new GradeName[] { GradeName.DEMOLISSEUR, },
				31, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 54, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
		};
	}
	
	private static CustomCape[] getVoyageur() {
		return new CustomCape[] {
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Lien Limité"); put(Language.EN, "Limited Bond Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voyageur Fou"); put(Language.EN, "Madman Traveler Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 106, true),
					new Effect(TypeEffect.DefM, false, 90, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Cristal du Monde"); put(Language.EN, "Crystal World Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				95, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Cristalline Gelée"); put(Language.EN, "Deepfrost Crystal Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				95, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 102, true),
					new Effect(TypeEffect.DefM, false, 88, true),
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Voyageur Impitoyable"); put(Language.EN, "Ruthless Traveler's Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 99, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Saint"); put(Language.EN, "Saint's Shroud"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 99, true),
					new Effect(TypeEffect.DefM, false, 85, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau d'Énergie Cristalline"); put(Language.EN, "Crystal Energy Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				85, "black1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 96, true),
					new Effect(TypeEffect.DefM, false, 82, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau de Souffle du Voyageur"); put(Language.EN, "Traveler Breath Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 119, true),
					new Effect(TypeEffect.DefM, false, 79, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Cristal Polaire"); put(Language.EN, "Coldfrost Crystal Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				75, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 89, true),
					new Effect(TypeEffect.DefM, false, 76, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape en cristal du Punisseur"); put(Language.EN, "Crystalwork Punisher Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 85, true),
					new Effect(TypeEffect.DefM, false, 73, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau du Vieil Ermite"); put(Language.EN, "Ancient Hermit Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				65, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 81, true),
					new Effect(TypeEffect.DefM, false, 70, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau d'Horizon"); put(Language.EN, "Horizon Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, "purple2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 78, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau Cristallin Noir"); put(Language.EN, "Black Crystal Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, "red2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 78, true),
					new Effect(TypeEffect.DefM, false, 66, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape d'Outsider"); put(Language.EN, "Outsider Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Cristalline"); put(Language.EN, "Careless: Deep Crystalline Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 63, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Manteau d'Abysse du Voyageur"); put(Language.EN, "Traveler Abyss Mantle"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				55, "black2", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Affabulée"); put(Language.EN, "Fable Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				55, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 74, true),
					new Effect(TypeEffect.DefM, false, 62, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Marionnette"); put(Language.EN, "Puppet Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				47, "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de Cristal à grain"); put(Language.EN, "Crystal Grain Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				47, "green1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 58, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape de la Marionnette Fantôme"); put(Language.EN, "Ghost Puppet Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				47, "red1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 67, true),
					new Effect(TypeEffect.DefM, false, 59, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Cristalline Carrée"); put(Language.EN, "Square Crystal Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 52, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape Magique du Cristal"); put(Language.EN, "Crystal Magic Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				39, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 61, true),
					new Effect(TypeEffect.DefM, false, 51, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Maître Mage"); put(Language.EN, "Magimaster Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				31, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 53, true),
					new Effect(TypeEffect.DefM, false, 46, true),
				}),
			new CustomCape(new HashMap<Language, String>() {{ put(Language.FR, "Cape du Voyageur d'un autre monde"); put(Language.EN, "Otherworld Traveler Cape"); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				31, "blue", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 52, true),
					new Effect(TypeEffect.DefM, false, 45, true),
				}),
		};
	}
}
