package fr.vlik.grandfantasia.loader.customequip;

import java.util.EnumMap;

import fr.vlik.grandfantasia.customequip.CustomRing;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class LoaderCustomRing {
	
	static CustomRing[] getRing() {
		return new CustomRing[] {
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Boussole de Pleine Mer"); put(Language.EN, "Open Sea Compass"); }},
				100, "100blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.PV, false, 800),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magatama d'Émeraude de Sakura"); put(Language.EN, "Sakura Emerald Magatama"); }},
				100, "100blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.PM, false, 400),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épingle Rose Rouge"); put(Language.EN, "Crimson Rose Pin"); }},
				100, "100blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Feu, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Photo de Groupe des Rois des Sprites"); put(Language.EN, "Sprite King Group Photo"); }},
				100, "100blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Glace, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vin du Roi des Pirates"); put(Language.EN, "Pirate King's Wine Bottle"); }},
				100, "100blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Foudre, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Père du Phénix du Soleil"); put(Language.EN, "Sunfire Phoenix's Father"); }},
				100, "100blanc5", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 474, true),
					new Effect(TypeEffect.Nature, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau d'Os Sanglant"); put(Language.EN, "Blood Bone Ring"); }},
				95, "28bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.PV, false, 720),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clair de Lune"); put(Language.EN, "Postcard: Moonlight Forest (01)"); }},
				95, "gt5", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.PM, false, 360),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Médaillon de Verre Doré"); put(Language.EN, "Golden Glass Medallion"); }},
				95, "95blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Feu, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tablette Runique Antique"); put(Language.EN, "Ancient Rune Tablet"); }},
				95, "95blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Glace, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Torche en Acier"); put(Language.EN, "Steel Flame Torch"); }},
				95, "90blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Foudre, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cœur Mécanique"); put(Language.EN, "Mecha Power Core"); }},
				95, "60bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 458, true),
					new Effect(TypeEffect.Nature, false, 14),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense de Mammouth Sacré"); put(Language.EN, "Sanctuary Mammoth Tusk"); }},
				90, "90blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PV, false, 720),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Boucles d'Oreille de l'Ombre Lunaire"); put(Language.EN, "Lunashade Earrings"); }},
				90, "messager4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PM, false, 360),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau d'Or du Sang du Démon"); put(Language.EN, "Demon's Golden Bloodring"); }},
				90, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PV, false, 360),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clé du Coffre Glacé"); put(Language.EN, "Frozen Casket Key"); }},
				90, "90blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.PM, false, 180),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Torche du Géant du Temple"); put(Language.EN, "Temple Giant's Torch"); }},
				90, "90blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Feu, false, 13),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Feuille Glacée de l'Arbre Ingelable"); put(Language.EN, "Frostleaf from Unfrozen Tree"); }},
				90, "90blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Glace, false, 13),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cendres du Dieu du Tonnerre"); put(Language.EN, "Thunder God's Ashes"); }},
				90, "90blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Foudre, false, 13),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau du Sourire de la Nymphe"); put(Language.EN, "Nymph's Ring of Smiles"); }},
				90, "flora", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 441, true),
					new Effect(TypeEffect.Nature, false, 13),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau de la Rose Sanglante"); put(Language.EN, "Rose Thorn Ring"); }},
				85, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PV, false, 640),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Foi Débauchée"); put(Language.EN, "Distorted Faith"); }},
				85, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PM, false, 320),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Chasseur de Soleils"); put(Language.EN, "Sunhunter Pendant"); }},
				85, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PV, false, 320),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sourire de Nymphe"); put(Language.EN, "Maiden Droplet"); }},
				85, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.PM, false, 160),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étoile de Mars"); put(Language.EN, "Mars Stars"); }},
				85, "85blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Feu, false, 12),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Diamant de Glace"); put(Language.EN, "Icy Spirit Crystal"); }},
				85, "85blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Glace, false, 12),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaîne des Éclairs"); put(Language.EN, "Electric Chain"); }},
				85, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Foudre, false, 12),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Outil de Vie Extraterrestre"); put(Language.EN, "Alien Life Device"); }},
				85, "messager2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 425, true),
					new Effect(TypeEffect.Nature, false, 12),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bracelet de la Licorne"); put(Language.EN, "Unicorn's Tooth Bracelet"); }},
				80, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau de Feu Concentré"); put(Language.EN, "Red Flash Treasure Ring"); }},
				80, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de Quartz Perlé"); put(Language.EN, "Rose Quartz Pearl Necklace"); }},
				80, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau Magnétique de Glace"); put(Language.EN, "Sensitive Energy Ice Ring"); }},
				80, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Perle de Flamme Explosive"); put(Language.EN, "Shining Exploding Flame Jewel"); }},
				80, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Prisme Éblouissant"); put(Language.EN, "Brilliant Cool Prismatic Gemstone"); }},
				80, "80blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Machine de Maîtrise du Pouls"); put(Language.EN, "Pulse Resistance Device"); }},
				80, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corail de Saphir Protecteur"); put(Language.EN, "Green Pine Sapphire Coral"); }},
				80, "80blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau Sacré des Ancêtres"); put(Language.EN, "Ancient Elder's Ring"); }},
				75, "100tarot", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bracelet de Perles du Grand Bleu"); put(Language.EN, "Deep Sea Pearl Handlace"); }},
				75, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Rubis Flamboyant"); put(Language.EN, "Fire Ruby Ring"); }},
				75, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Croissant de Glace"); put(Language.EN, "Crescent Ice Necklace"); }},
				75, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaîne d'Illusion de Feu"); put(Language.EN, "Illusion Fire Lace"); }},
				75, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dent de la Toundra Aride"); put(Language.EN, "Permanent Tundra Tooth"); }},
				75, "75blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appareil de Charge Foudroyante"); put(Language.EN, "Thunder Charging Device"); }},
				75, "60bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crâne de la Bête Sacrée Géante"); put(Language.EN, "Bones of the Giant Holy Beast"); }},
				75, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 390, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de Crocs d'Ours"); put(Language.EN, "Merciless Beast Sharptooth Necklace"); }},
				70, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PV, false, 560),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anneau d'Énergie Arcanique"); put(Language.EN, "Arcane Energy Ring"); }},
				70, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PM, false, 280),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pendentif du Royaume du Nord"); put(Language.EN, "Northern Realm Pearl Necklace"); }},
				70, "28bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PV, false, 280),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague d'Acier Glacial"); put(Language.EN, "Antifreeze Steel Ring"); }},
				70, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.PM, false, 140),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pépite d'Ambre Rouge"); put(Language.EN, "Red-Forged Gem"); }},
				70, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Feu, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oeil de l'Aube"); put(Language.EN, "Gem of Dawn"); }},
				70, "80blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Glace, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Go-Go Gadget"); put(Language.EN, "Mini Electrometer"); }},
				70, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Foudre, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corne de Corail enchantée"); put(Language.EN, "Coral Giant Insect Horn"); }},
				70, "80blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 372, true),
					new Effect(TypeEffect.Nature, false, 11),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Général"); put(Language.EN, "General's Necklace"); }},
				65, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PV, false, 480),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Maître"); put(Language.EN, "Master Ring"); }},
				65, "100tarot", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PM, false, 240),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Combattant du Feu"); put(Language.EN, "Flame Warrior Necklace"); }},
				65, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PV, false, 240),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Bouclier Givré"); put(Language.EN, "Frost Barrier Ring"); }},
				65, "sombre11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.PM, false, 120),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Dieu du Feu"); put(Language.EN, "Fire God's Gem"); }},
				65, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Feu, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de Lumière Douce Glaçante"); put(Language.EN, "Cold Light Gemstone"); }},
				65, "65blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Glace, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre d'Eclair Irradiant"); put(Language.EN, "Lightning Radiation Stone"); }},
				65, "65blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Foudre, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Côte de la Bête du Tonnerre"); put(Language.EN, "Thunder Beast's Rib"); }},
				65, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 354, true),
					new Effect(TypeEffect.Nature, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Grand Seigneur"); put(Language.EN, "Overlord's Necklace"); }},
				60, "sombre0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PV, false, 480),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de la Dimension"); put(Language.EN, "Dimension Ring"); }},
				60, "60blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PM, false, 240),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Roi-Empereur"); put(Language.EN, "Monarch's Necklace"); }},
				60, "sombre15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PV, false, 240),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague d'Etoile"); put(Language.EN, "Star Ring"); }},
				60, "tdb0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.PM, false, 120),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de la Fission"); put(Language.EN, "Fusion Jewel"); }},
				60, "60bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Feu, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Glacier Polaire"); put(Language.EN, "Great Glacier Gem"); }},
				60, "65blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Glace, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Isolant Électromagnétique"); put(Language.EN, "Electromagnetic Insulator"); }},
				60, "100blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Foudre, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Orbite de Dragon Vert"); put(Language.EN, "Green Dragon Eye"); }},
				60, "60blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 336, true),
					new Effect(TypeEffect.Nature, false, 10),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Dragon Rouge"); put(Language.EN, "Red Dragon Jewel"); }},
				52, "50bleu", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Orbe du Dragon à Corne Rouge Sang"); put(Language.EN, "Bloody Horned Dragon Orb"); }},
				52, "50bleu", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amulette de la Vengeance"); put(Language.EN, "Amulet of Vengeance"); }},
				52, "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 400),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Météorite Noire"); put(Language.EN, "Black Meteorite Ring"); }},
				52, "tdb12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 200),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de la Forteresse"); put(Language.EN, "Fortress Necklace"); }},
				52, "messager3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 200),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Baguette Couleur de Ciel"); put(Language.EN, "Sheltering Sky Ring"); }},
				52, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 100),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme Dent Gelée"); put(Language.EN, "Frozen Fang Gem"); }},
				52, "40bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Barrière Électromagnétique"); put(Language.EN, "Electromagnetic Barrier Device"); }},
				52, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Foudre, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crâne de Python Venimeux des Marais"); put(Language.EN, "Poison Python Skull"); }},
				52, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Nature, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de l'Homme de Fer"); put(Language.EN, "Iron Man Necklace"); }},
				52, "tdb3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 400),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Coeur Sombre"); put(Language.EN, "Heart of Darkness Ring"); }},
				52, "tdb12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 200),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de la Tour d'Or"); put(Language.EN, "Golden Tower Necklace"); }},
				52, "messager3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PV, false, 200),
					new Effect(TypeEffect.Feu, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Crépusculaire"); put(Language.EN, "Ring of Dusk"); }},
				52, "sombre10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.PM, false, 100),
					new Effect(TypeEffect.Glace, false, 5),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de la Dent Gelée"); put(Language.EN, "Frozen-Fanged Gem"); }},
				52, "40bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dispositif d'emprisonnement de la Bête du Tonnerre"); put(Language.EN, "Thunder Beast Imprisoning Device"); }},
				52, "80blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Foudre, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crâne de Gobelin Mutant"); put(Language.EN, "Mutant Goblin's Skull"); }},
				52, "75blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 305, true),
					new Effect(TypeEffect.Nature, false, 9),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Chef de la Guerre"); put(Language.EN, "Warlord Necklace"); }},
				44, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Œil de Chat"); put(Language.EN, "Cat's Eye Ring"); }},
				44, "tdb11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Bouclier Céleste"); put(Language.EN, "Aegis Necklace"); }},
				44, "44blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Scintillante"); put(Language.EN, "Glow Ring"); }},
				44, "40bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Précieuse Gemme Infernale"); put(Language.EN, "Purgatory Jewel"); }},
				44, "44blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de Glace"); put(Language.EN, "Ice Gem"); }},
				44, "44blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Engin de Protection Électromagnétique"); put(Language.EN, "Electromagnetic Shielding Device"); }},
				44, "44blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Yeux de Crapaud Géant Décomposé"); put(Language.EN, "Giga Toad Eye"); }},
				44, "44blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de la Troupe Fracassante"); put(Language.EN, "Striker Corps Necklace"); }},
				44, "sombre14", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Pierre du Jeune Lion"); put(Language.EN, "Lion's Eye Stone Ring"); }},
				44, "tdb11", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de la Détermination"); put(Language.EN, "Necklace of Determination"); }},
				44, "44blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Légère et Fragile Bague d'Arcane"); put(Language.EN, "Arcane Twilight Ring"); }},
				44, "40bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Royaume Ultime"); put(Language.EN, "Ultimate Realm Gem"); }},
				44, "44blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme du Pays Nordique"); put(Language.EN, "Northern Country Gem"); }},
				44, "44blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Booster Electromagnétique"); put(Language.EN, "Electromagnetic Booster"); }},
				44, "44blanc3", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oeil de l'Anaconda Ancestral"); put(Language.EN, "Ancient Python Eye"); }},
				44, "44blanc4", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 272, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier des Morts"); put(Language.EN, "Necklace of the Dead"); }},
				36, "36blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Fantôme"); put(Language.EN, "Ghost Ring"); }},
				36, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier Céleste"); put(Language.EN, "Necklace of Heaven"); }},
				36, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Lumière Magique"); put(Language.EN, "Magic Light Ring"); }},
				36, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de Feu"); put(Language.EN, "Flame Jewel"); }},
				36, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre Précieuse Lumineuse"); put(Language.EN, "Cold Light Gem"); }},
				36, "36blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Masque Électromagnétique"); put(Language.EN, "Electromagnetic Cloaking Device"); }},
				36, "36blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Os Crânien de Lézard Epineux"); put(Language.EN, "Thorny Lizard Skull"); }},
				36, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de l'Enfer"); put(Language.EN, "Netherworld Necklace"); }},
				36, "36blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 320),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Cadavre"); put(Language.EN, "Corpse Ring"); }},
				36, "sombre1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 160),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de Cristal"); put(Language.EN, "Crystal Necklace"); }},
				36, "sombre6", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PV, false, 160),
					new Effect(TypeEffect.Feu, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de l'Aurore"); put(Language.EN, "Aurora Ring"); }},
				36, "tdb15", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.PM, false, 80),
					new Effect(TypeEffect.Glace, false, 4),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de Magma"); put(Language.EN, "Magma Gem"); }},
				36, "80blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Feu, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme de Givre"); put(Language.EN, "Frost Gem"); }},
				36, "36blanc1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Glace, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Radiateur Magnétique"); put(Language.EN, "Magnetic Field Emitter"); }},
				36, "36blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Foudre, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crâne de Serpent des Marais"); put(Language.EN, "Swamp Snake Skull"); }},
				36, "65blanc2", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 237, true),
					new Effect(TypeEffect.Nature, false, 8),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de Dents de Loup"); put(Language.EN, "Wolf Tooth Necklace"); }},
				28, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague de Choc"); put(Language.EN, "Impact Ring"); }},
				28, "gvg1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de Perles"); put(Language.EN, "Pearl Necklace"); }},
				28, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Foudre, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague en Ambre"); put(Language.EN, "Amber Ring"); }},
				28, "gvg0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Nature, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier du Fantôme aux Dents Pourries"); put(Language.EN, "Rotten-Toothed Ghost Necklace"); }},
				28, "80blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Feu, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Explosive"); put(Language.EN, "Explosion Ring"); }},
				28, "gvg1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Glace, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier de l'Esprit de l'Océan"); put(Language.EN, "Ocean Spirit Necklace"); }},
				28, "75blanc0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Foudre, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Serpent Doré"); put(Language.EN, "Golden Snake Ring"); }},
				28, "gvg0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 200, true),
					new Effect(TypeEffect.Nature, false, 7),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaîne d'Acier"); put(Language.EN, "Steel Chain"); }},
				20, "sombre12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague d'Énergie"); put(Language.EN, "Energy Ring"); }},
				20, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier d'Affolement"); put(Language.EN, "Fire-Quenching Necklace"); }},
				20, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Foudre, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague d'Argent"); put(Language.EN, "Silver Ring"); }},
				20, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Nature, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fine Chaîne d'Acier"); put(Language.EN, "Fine Steel Chain"); }},
				20, "sombre12", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Electrisée"); put(Language.EN, "Charging Ring"); }},
				20, "tdb10", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Collier Brûlant"); put(Language.EN, "Red Hot Necklace"); }},
				20, "89bleu1", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Foudre, false, 6),
				}),
			new CustomRing(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague du Cristal de Neige"); put(Language.EN, "Snow Crystal Ring"); }},
				20, "89bleu0", new Calculable[] {
					new Effect(TypeEffect.DefM, false, 157, true),
					new Effect(TypeEffect.Nature, false, 6),
				}),
		};
	}
}
