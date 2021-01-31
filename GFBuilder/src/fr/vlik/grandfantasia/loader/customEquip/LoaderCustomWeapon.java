package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.custom.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class LoaderCustomWeapon {
	
	static CustomWeapon[] getEp1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Couteau de l'Éventreur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabreloup Double Croc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/58pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffe de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, WeaponType.EPEE1M, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine du Dragon Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1392, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torturée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Sanglante de Jade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1326, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Double Pointe"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				76, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rapière de Duel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				75, WeaponType.EPEE1M, "epee1M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1219, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Sanguin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				71, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1135, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Ouvragé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Machette Ciselée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Flamme Violette"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				65, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1012, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague du Guide Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				61, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 933, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Conquérant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 913, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Tête de Fantôme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 920, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Meneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 760, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Ailes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 766, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Sceau Héroïque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 761, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Noble"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 616, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Guerrier de la Tribu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 624, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Comte"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 618, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Runes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Légère à Motifs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 485, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Manuscrit Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 480, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Lourde à Axe Tranchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 356, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir des Montagnes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/30blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 360, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Lame Aiguisée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 357, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Éminente Épée du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				24, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 244, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Elégance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 246, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Combat au Front"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 245, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				16, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée du Gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				12, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				6, WeaponType.EPEE1M, "epee1M/6vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 88, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				4, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 72, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte de Défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				3, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 65, true),
				}),
		};
	}
	
	static CustomWeapon[] getMa1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue Primitive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2135, true),
					new Effect(TypeEffect.AtkM, false, 1227, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue Écrase Cristal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.MARTEAU1M, "marteau1M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2135, true),
					new Effect(TypeEffect.AtkM, false, 1227, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Fer Hérissé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.MARTEAU1M, "marteau1M/28ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1995, true),
					new Effect(TypeEffect.AtkM, false, 1147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue du Commandement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.MARTEAU1M, "marteau1M/45bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1995, true),
					new Effect(TypeEffect.AtkM, false, 1147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Cristal Jaune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1858, true),
					new Effect(TypeEffect.AtkM, false, 1068, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Cristal Jaune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1858, true),
					new Effect(TypeEffect.AtkM, false, 1068, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Affrontement Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				88, WeaponType.MARTEAU1M, "marteau1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1804, true),
					new Effect(TypeEffect.AtkM, false, 1037, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Outre-Espace"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				85, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1670, true),
					new Effect(TypeEffect.AtkM, false, 960, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse Démoniaque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				83, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1670, true),
					new Effect(TypeEffect.AtkM, false, 960, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Démon Zéro"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				80, WeaponType.MARTEAU1M, "marteau1M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1592, true),
					new Effect(TypeEffect.AtkM, false, 915, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau des Quatre Esprits"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				78, WeaponType.MARTEAU1M, "marteau1M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1540, true),
					new Effect(TypeEffect.AtkM, false, 885, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Brise-Glace"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				75, WeaponType.MARTEAU1M, "marteau1M/icon11", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1463, true),
					new Effect(TypeEffect.AtkM, false, 841, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau des Stalactites"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				72, WeaponType.MARTEAU1M, "marteau1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1387, true),
					new Effect(TypeEffect.AtkM, false, 798, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse Tribale de Cuivre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				70, WeaponType.MARTEAU1M, "marteau1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1337, true),
					new Effect(TypeEffect.AtkM, false, 769, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Corne d'Auroch"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				67, WeaponType.MARTEAU1M, "marteau1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1263, true),
					new Effect(TypeEffect.AtkM, false, 726, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Fer Magique à Frappe Lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				65, WeaponType.MARTEAU1M, "marteau1M/28ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1215, true),
					new Effect(TypeEffect.AtkM, false, 699, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Combat de Fer Rouge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				62, WeaponType.MARTEAU1M, "marteau1M/28ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1143, true),
					new Effect(TypeEffect.AtkM, false, 657, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Fracas"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU1M, "marteau1M/40vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1096, true),
					new Effect(TypeEffect.AtkM, false, 630, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sceptre du Jugement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU1M, "marteau1M/icon6", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1105, true),
					new Effect(TypeEffect.AtkM, false, 630, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Fer de l'Arbitre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 935, true),
					new Effect(TypeEffect.AtkM, false, 538, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau à Clous du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/50blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 947, true),
					new Effect(TypeEffect.AtkM, false, 538, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd Marteau Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 936, true),
					new Effect(TypeEffect.AtkM, false, 540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Grand Chef"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 760, true),
					new Effect(TypeEffect.AtkM, false, 437, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Bataille Cérémonielle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/45bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 770, true),
					new Effect(TypeEffect.AtkM, false, 437, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Premier Ancêtre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 761, true),
					new Effect(TypeEffect.AtkM, false, 438, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Assommant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				37, WeaponType.MARTEAU1M, "marteau1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 597, true),
					new Effect(TypeEffect.AtkM, false, 343, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Démon Géant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				37, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 605, true),
					new Effect(TypeEffect.AtkM, false, 343, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Etourdissement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				37, WeaponType.MARTEAU1M, "marteau1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 596, true),
					new Effect(TypeEffect.AtkM, false, 345, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Juge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				29, WeaponType.MARTEAU1M, "marteau1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 445, true),
					new Effect(TypeEffect.AtkM, false, 256, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Manoir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				29, WeaponType.MARTEAU1M, "marteau1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 450, true),
					new Effect(TypeEffect.AtkM, false, 256, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Loi"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				29, WeaponType.MARTEAU1M, "marteau1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 446, true),
					new Effect(TypeEffect.AtkM, false, 255, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				24, WeaponType.MARTEAU1M, "marteau1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 358, true),
					new Effect(TypeEffect.AtkM, false, 206, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet Bestial Strié"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 308, true),
					new Effect(TypeEffect.AtkM, false, 177, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau tranchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/50blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 312, true),
					new Effect(TypeEffect.AtkM, false, 177, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Bête Sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 307, true),
					new Effect(TypeEffect.AtkM, false, 180, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				16, WeaponType.MARTEAU1M, "marteau1M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 232, true),
					new Effect(TypeEffect.AtkM, false, 133, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Acéré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				13, WeaponType.MARTEAU1M, "marteau1M/13sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 189, true),
					new Effect(TypeEffect.AtkM, false, 109, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Bois Renforcé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				10, WeaponType.MARTEAU1M, "marteau1M/8sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 151, true),
					new Effect(TypeEffect.AtkM, false, 87, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse de Métal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				7, WeaponType.MARTEAU1M, "marteau1M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 116, true),
					new Effect(TypeEffect.AtkM, false, 67, true),
				}),
		};
	}
	
	static CustomWeapon[] getHa1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Cornue"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE1M, "hache1M/54sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Rugissement de Lion"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette de Foudre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette des Sables"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, WeaponType.HACHE1M, "hache1M/54bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine de l'Empereur Malin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine de l'empereur Malin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette du Serpent Venimeux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				87, WeaponType.HACHE1M, "hache1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2073, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dent du Roi Cannibale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				85, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1949, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir en Malachite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				82, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1918, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Brillante de l'Orgueil"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, WeaponType.HACHE1M, "hache1M/82bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1857, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Jade Brillant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				77, WeaponType.HACHE1M, "hache1M/82bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1766, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir Phosphorescent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				75, WeaponType.HACHE1M, "hache1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1707, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Airain"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				73, WeaponType.HACHE1M, "hache1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1648, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fendoir à Banquise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, WeaponType.HACHE1M, "hache1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache-Stalactite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				68, WeaponType.HACHE1M, "hache1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1503, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Guideuse à Motif Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				65, WeaponType.HACHE1M, "hache1M/48ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1417, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Acier Lourd du Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				63, WeaponType.HACHE1M, "hache1M/48ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1361, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Lumière Glorieuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1278, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Diable Brisée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE1M, "hache1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1299, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Griffes de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1117, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Décapitante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1125, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Lame du Dragon Volant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1120, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Fatale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 912, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache d'Argent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/18ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 923, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Guerre Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 915, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Foudre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 719, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Brise-Armure"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 721, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Eclair à Coup Critique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 717, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Berserker"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 541, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Charge Militaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 550, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Rugissante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Puissante Hache de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				24, WeaponType.HACHE1M, "hache1M/30bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 418, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Briseuse d'Os"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 379, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Esprit Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 381, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Pulvérisante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 380, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Guerre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				16, WeaponType.HACHE1M, "hache1M/16blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 270, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Fer de Mêlée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				14, WeaponType.HACHE1M, "hache1M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 237, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Bois Spéciale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				10, WeaponType.HACHE1M, "hache1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 176, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				8, WeaponType.HACHE1M, "hache1M/16blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 148, true),
				}),
		};
	}
	
	static CustomWeapon[] getEp2M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpeur de Yéti"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				100, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3736, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Claymore Coupeuse de Tête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				100, WeaponType.EPEE2M, "epee2M/30ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3736, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Sommet"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				95, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3491, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à 2 mains Couperet de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				95, WeaponType.EPEE2M, "epee2M/36sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3491, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Point d'Éclat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				90, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Point d'Éclat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				90, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante Exotique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				89, WeaponType.EPEE2M, "epee2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3204, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ondes de Métamorphose"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				85, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2923, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Sabre en Saphir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				84, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2969, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ciel Englouti - Anéantissement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, WeaponType.EPEE2M, "epee2M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2785, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue Épée de l'Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				79, WeaponType.EPEE2M, "epee2M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2740, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Claymore Ardente"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				75, WeaponType.EPEE2M, "epee2M/75pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde Épée Bâtarde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				74, WeaponType.EPEE2M, "epee2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2516, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Épée de Duel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				70, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2340, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Claymore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				69, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2297, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Emeraude Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				65, WeaponType.EPEE2M, "epee2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2126, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large Épée de la Jungle Reculée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				64, WeaponType.EPEE2M, "epee2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2084, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Sort Rompu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				60, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1917, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Couperet de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				60, WeaponType.EPEE2M, "epee2M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1956, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Marquis"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1715, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Alien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1765, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Conquérante du Grand Seigneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1720, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Général"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1405, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Coupante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1432, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Marshal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1410, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Destruction"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grosse Épée Décisive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1156, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Destructrice Géante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1116, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive à Dents de Scie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 843, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Noire de Naggaroth"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/32blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 855, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Fracassante Sertie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 842, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Tranchante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				26, WeaponType.EPEE2M, "epee2M/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 686, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Guerrier Chargeant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 597, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Ver Géant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 610, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Guerrier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 600, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Épée Fracassante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				18, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Attaque Furtive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				15, WeaponType.EPEE2M, "epee2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 380, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Cérémoniale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				15, WeaponType.EPEE2M, "epee2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 391, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large Épée Géante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				12, WeaponType.EPEE2M, "epee2M/12blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 308, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante à Lame de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				9, WeaponType.EPEE2M, "epee2M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 242, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				6, WeaponType.EPEE2M, "epee2M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 184, true),
				}),
		};
	}
	
	static CustomWeapon[] getMa2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getHa2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getMeca1M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getMeca2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getArc() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getGun() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getCanon() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getRel() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getBaton() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getLame() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getCle() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getBouclier() {
		return new CustomWeapon[] {
			
		};
	}
}
