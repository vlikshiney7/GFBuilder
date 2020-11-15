package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.custom.CustomRing;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class CustomLoaderRing {
	
	static CustomRing[] getRing() {
		return new CustomRing[] {
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Boussole de Pleine Mer"); put(Language.EN, ""); }},
				100, "100blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.PV, false, 800),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Magatama d'Émeraude de Sakura"); put(Language.EN, ""); }},
				100, "100blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.PM, false, 400),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Épingle Rose Rouge"); put(Language.EN, ""); }},
				100, "100blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Feu, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Photo de Groupe des Rois des Sprites"); put(Language.EN, ""); }},
				100, "100blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Glace, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Vin du Roi des Pirates"); put(Language.EN, ""); }},
				100, "100blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Foudre, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Père du Phénix du Soleil"); put(Language.EN, ""); }},
				100, "100blanc5", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Nature, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau d'Os Sanglant"); put(Language.EN, ""); }},
				95, "28bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.PV, false, 720),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Clair de Lune"); put(Language.EN, ""); }},
				95, "gt5", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.PM, false, 360),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Médaillon de Verre Doré"); put(Language.EN, ""); }},
				95, "95blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Feu, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Tablette Runique Antique"); put(Language.EN, ""); }},
				95, "95blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Glace, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Torche en Acier"); put(Language.EN, ""); }},
				95, "90blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Foudre, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Cœur Mécanique"); put(Language.EN, ""); }},
				95, "60bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Nature, false, 14),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Défense de Mammouth Sacré"); put(Language.EN, ""); }},
				90, "90blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PV, false, 720),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Boucles d'Oreille de l'Ombre Lunaire"); put(Language.EN, ""); }},
				90, "messager4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PM, false, 360),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau d'Or du Sang du Démon"); put(Language.EN, ""); }},
				90, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PV, false, 360),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Clé du Coffre Glacé"); put(Language.EN, ""); }},
				90, "90blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PM, false, 180),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Torche du Géant du Temple"); put(Language.EN, ""); }},
				90, "90blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Feu, false, 13),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Feuille Glacée de l'Arbre Ingelable"); put(Language.EN, ""); }},
				90, "90blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Glace, false, 13),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Cendres du Dieu du Tonnerre"); put(Language.EN, ""); }},
				90, "90blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Foudre, false, 13),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau du Sourire de la Nymphe"); put(Language.EN, ""); }},
				90, "flora", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Nature, false, 13),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau de la Rose Sanglante"); put(Language.EN, ""); }},
				85, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PV, false, 640),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Foi Débauchée"); put(Language.EN, ""); }},
				85, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PM, false, 320),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Chasseur de Soleils"); put(Language.EN, ""); }},
				85, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PV, false, 320),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Sourire de Nymphe"); put(Language.EN, ""); }},
				85, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PM, false, 160),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Étoile de Mars"); put(Language.EN, ""); }},
				85, "85blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Feu, false, 12),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Diamant de Glace"); put(Language.EN, ""); }},
				85, "85blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Glace, false, 12),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Chaîne des Éclairs"); put(Language.EN, ""); }},
				85, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Foudre, false, 12),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Outil de Vie Extraterrestre"); put(Language.EN, ""); }},
				85, "messager2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Nature, false, 12),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bracelet de la Licorne"); put(Language.EN, ""); }},
				80, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau de Feu Concentré"); put(Language.EN, ""); }},
				80, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de Quartz Perlé"); put(Language.EN, ""); }},
				80, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau Magnétique de Glace"); put(Language.EN, ""); }},
				80, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Flamme Explosive"); put(Language.EN, ""); }},
				80, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Prisme Éblouissant"); put(Language.EN, ""); }},
				80, "80blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Machine de Maîtrise du Pouls"); put(Language.EN, ""); }},
				80, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Corail de Saphir Protecteur"); put(Language.EN, ""); }},
				80, "80blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau Sacré des Ancêtres"); put(Language.EN, ""); }},
				75, "100tarot", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bracelet de Perles du Grand Bleu"); put(Language.EN, ""); }},
				75, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Rubis Flamboyant"); put(Language.EN, ""); }},
				75, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Croissant de Glace"); put(Language.EN, ""); }},
				75, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Chaîne d'Illusion de Feu"); put(Language.EN, ""); }},
				75, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Dent de la Toundra Aride"); put(Language.EN, ""); }},
				75, "75blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Appareil de Charge Foudroyante"); put(Language.EN, ""); }},
				75, "60bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Crâne de la Bête Sacrée Géante"); put(Language.EN, ""); }},
				75, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de Crocs d'Ours"); put(Language.EN, ""); }},
				70, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Anneau d'Énergie Arcanique"); put(Language.EN, ""); }},
				70, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Pendentif du Royaume du Nord"); put(Language.EN, ""); }},
				70, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague d'Acier Glacial"); put(Language.EN, ""); }},
				70, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Pépite d'Ambre Rouge"); put(Language.EN, ""); }},
				70, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Oeil de l'Aube"); put(Language.EN, ""); }},
				70, "80blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Go-Go Gadget"); put(Language.EN, ""); }},
				70, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Corne de Corail enchantée"); put(Language.EN, ""); }},
				70, "80blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Général"); put(Language.EN, ""); }},
				65, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PV, false, 480),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Maître"); put(Language.EN, ""); }},
				65, "100tarot", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PM, false, 240),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Combattant du Feu"); put(Language.EN, ""); }},
				65, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PV, false, 240),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Bouclier Givré"); put(Language.EN, ""); }},
				65, "sombre11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PM, false, 120),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Dieu du Feu"); put(Language.EN, ""); }},
				65, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Feu, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de Lumière Douce Glaçante"); put(Language.EN, ""); }},
				65, "65blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Glace, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Pierre d'Eclair Irradiant"); put(Language.EN, ""); }},
				65, "65blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Foudre, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Côte de la Bête du Tonnerre"); put(Language.EN, ""); }},
				65, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Nature, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Grand Seigneur"); put(Language.EN, ""); }},
				60, "sombre0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PV, false, 480),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de la Dimension"); put(Language.EN, ""); }},
				60, "60blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PM, false, 240),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Roi-Empereur"); put(Language.EN, ""); }},
				60, "sombre15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PV, false, 240),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague d'Etoile"); put(Language.EN, ""); }},
				60, "tdb0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PM, false, 120),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de la Fission"); put(Language.EN, ""); }},
				60, "60bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Feu, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Glacier Polaire"); put(Language.EN, ""); }},
				60, "65blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Glace, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Isolant Électromagnétique"); put(Language.EN, ""); }},
				60, "100blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Foudre, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Orbite de Dragon Vert"); put(Language.EN, ""); }},
				60, "60blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Nature, false, 10),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Dragon Rouge"); put(Language.EN, ""); }},
				52, "50bleu", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Orbe du Dragon à Corne Rouge Sang"); put(Language.EN, ""); }},
				52, "50bleu", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Amulette de la Vengeance"); put(Language.EN, ""); }},
				52, "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 400),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Météorite Noire"); put(Language.EN, ""); }},
				52, "tdb12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 200),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de la Forteresse"); put(Language.EN, ""); }},
				52, "messager3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 200),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Baguette Couleur de Ciel"); put(Language.EN, ""); }},
				52, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 100),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Dent Gelée"); put(Language.EN, ""); }},
				52, "40bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Barrière Électromagnétique"); put(Language.EN, ""); }},
				52, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Foudre, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Crâne de Python Venimeux des Marais"); put(Language.EN, ""); }},
				52, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Nature, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de l'Homme de Fer"); put(Language.EN, ""); }},
				52, "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 400),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Coeur Sombre"); put(Language.EN, ""); }},
				52, "tdb12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 200),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de la Tour d'Or"); put(Language.EN, ""); }},
				52, "messager3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 200),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague Crépusculaire"); put(Language.EN, ""); }},
				52, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 100),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de la Dent Gelée"); put(Language.EN, ""); }},
				52, "40bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Dispositif d'emprisonnement de la Bête du Tonnerre"); put(Language.EN, ""); }},
				52, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Foudre, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Crâne de Gobelin Mutant"); put(Language.EN, ""); }},
				52, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Nature, false, 9),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Chef de la Guerre"); put(Language.EN, ""); }},
				44, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague Œil de Chat"); put(Language.EN, ""); }},
				44, "tdb11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Bouclier Céleste"); put(Language.EN, ""); }},
				44, "44blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague Scintillante"); put(Language.EN, ""); }},
				44, "40bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Précieuse Gemme Infernale"); put(Language.EN, ""); }},
				44, "44blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de Glace"); put(Language.EN, ""); }},
				44, "44blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Engin de Protection Électromagnétique"); put(Language.EN, ""); }},
				44, "44blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Yeux de Crapaud Géant Décomposé"); put(Language.EN, ""); }},
				44, "44blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de la Troupe Fracassante"); put(Language.EN, ""); }},
				44, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Pierre du Jeune Lion"); put(Language.EN, ""); }},
				44, "tdb11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de la Détermination"); put(Language.EN, ""); }},
				44, "44blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Légère et Fragile Bague d'Arcane"); put(Language.EN, ""); }},
				44, "40bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Royaume Ultime"); put(Language.EN, ""); }},
				44, "44blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Pays Nordique"); put(Language.EN, ""); }},
				44, "44blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Booster Electromagnétique"); put(Language.EN, ""); }},
				44, "44blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Oeil de l'Anaconda Ancestral"); put(Language.EN, ""); }},
				44, "44blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier des Morts"); put(Language.EN, ""); }},
				36, "36blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Fantôme"); put(Language.EN, ""); }},
				36, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier Céleste"); put(Language.EN, ""); }},
				36, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Lumière Magique"); put(Language.EN, ""); }},
				36, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de Feu"); put(Language.EN, ""); }},
				36, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Pierre Précieuse Lumineuse"); put(Language.EN, ""); }},
				36, "36blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Masque Électromagnétique"); put(Language.EN, ""); }},
				36, "36blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Os Crânien de Lézard Epineux"); put(Language.EN, ""); }},
				36, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de l'Enfer"); put(Language.EN, ""); }},
				36, "36blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Cadavre"); put(Language.EN, ""); }},
				36, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de Cristal"); put(Language.EN, ""); }},
				36, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de l'Aurore"); put(Language.EN, ""); }},
				36, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de Magma"); put(Language.EN, ""); }},
				36, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Gemme de Givre"); put(Language.EN, ""); }},
				36, "36blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Radiateur Magnétique"); put(Language.EN, ""); }},
				36, "36blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Crâne de Serpent des Marais"); put(Language.EN, ""); }},
				36, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de Dents de Loup"); put(Language.EN, ""); }},
				28, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague de Choc"); put(Language.EN, ""); }},
				28, "gvg1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de Perles"); put(Language.EN, ""); }},
				28, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Foudre, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague en Ambre"); put(Language.EN, ""); }},
				28, "gvg0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Nature, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier du Fantôme aux Dents Pourries"); put(Language.EN, ""); }},
				28, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague Explosive"); put(Language.EN, ""); }},
				28, "gvg1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier de l'Esprit de l'Océan"); put(Language.EN, ""); }},
				28, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Foudre, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Serpent Doré"); put(Language.EN, ""); }},
				28, "gvg0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Nature, false, 7),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Chaîne d'Acier"); put(Language.EN, ""); }},
				20, "sombre12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague d'Énergie"); put(Language.EN, ""); }},
				20, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier d'Affolement"); put(Language.EN, ""); }},
				20, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Foudre, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague d'Argent"); put(Language.EN, ""); }},
				20, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Nature, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Fine Chaîne d'Acier"); put(Language.EN, ""); }},
				20, "sombre12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague Electrisée"); put(Language.EN, ""); }},
				20, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Collier Brûlant"); put(Language.EN, ""); }},
				20, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Foudre, false, 6),
				}),
			new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, "Bague du Cristal de Neige"); put(Language.EN, ""); }},
				20, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Nature, false, 6),
				}),
		};
	}
}