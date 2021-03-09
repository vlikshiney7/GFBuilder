package fr.vlik.grandfantasia.loader.customEquip;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class LoaderCustomWeapon {
	
	static CustomWeapon[] getEp1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Couteau de l'Éventreur"); put(Language.EN, "Reaper Knife"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabreloup Double Croc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, "Victory Short Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Lunaire"); put(Language.EN, "Moonsky Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/58pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffe de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, "Frost Twin Blades"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, WeaponType.EPEE1M, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine du Dragon Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1392, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torturée"); put(Language.EN, "Darklock Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Sanglante de Jade"); put(Language.EN, "Peerless Blade - Blood Jade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1326, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Double Pointe"); put(Language.EN, "Double-Pointed Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				76, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rapière de Duel"); put(Language.EN, "Saint Toya's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				75, WeaponType.EPEE1M, "epee1M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1219, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Sanguin"); put(Language.EN, "Blood-Red Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				71, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1135, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Ouvragé"); put(Language.EN, "Arctic Chieftan's Broadsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Machette Ciselée"); put(Language.EN, "Northern Bandit's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Flamme Violette"); put(Language.EN, "Violet Flame Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				65, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1012, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague du Guide Magique"); put(Language.EN, "Mystic Tracer Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				61, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 933, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Conquérant"); put(Language.EN, "Conqueror Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 913, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Tête de Fantôme"); put(Language.EN, "Ghost-Faced Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 920, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Meneur"); put(Language.EN, "Soverign Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 760, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Ailes"); put(Language.EN, "Winged Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 766, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Sceau Héroïque"); put(Language.EN, "Hero's Seal Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 761, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Noble"); put(Language.EN, "Noble's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 616, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Guerrier de la Tribu"); put(Language.EN, "Tribal Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 624, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Comte"); put(Language.EN, "Grand Count's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 618, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Runes"); put(Language.EN, "Rune Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Légère à Motifs"); put(Language.EN, "Light Tracer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 485, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Manuscrit Ancestral"); put(Language.EN, "Ancient Rune Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 480, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Lourde à Axe Tranchant"); put(Language.EN, "Axe-Edge Heavy Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 356, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir des Montagnes"); put(Language.EN, "Highlander Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/30blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 360, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Lame Aiguisée"); put(Language.EN, "Strongedge Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 357, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Éminente Épée du Chevalier"); put(Language.EN, "High Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				24, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Commandant"); put(Language.EN, "Commander's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 244, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Elégance"); put(Language.EN, "Elegant Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 246, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Combat au Front"); put(Language.EN, "Frontline Battle Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 245, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier"); put(Language.EN, "(Reforged) Bodor's Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				16, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée du Gardien"); put(Language.EN, "Guardian Longsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				12, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive"); put(Language.EN, "Silverfire Dragon Lance"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				6, WeaponType.EPEE1M, "epee1M/6vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 88, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Fer"); put(Language.EN, "Iron Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				4, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 72, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte de Défense"); put(Language.EN, "Parrying Dagger"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				3, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 65, true),
				}),
		};
	}
	
	static CustomWeapon[] getMa1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue Primitive"); put(Language.EN, "Primitive Mace"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Fer Hérissé"); put(Language.EN, "Spiked Iron Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.MARTEAU1M, "marteau1M/28ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1995, true),
					new Effect(TypeEffect.AtkM, false, 1147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue du Commandement"); put(Language.EN, "Commanding Mace"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Affrontement Sauvage"); put(Language.EN, "Wild Battle Hammer"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse Démoniaque"); put(Language.EN, "Demon Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				83, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1670, true),
					new Effect(TypeEffect.AtkM, false, 960, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Démon Zéro"); put(Language.EN, "Extreme Demonhammer - Emptiness"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				80, WeaponType.MARTEAU1M, "marteau1M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1592, true),
					new Effect(TypeEffect.AtkM, false, 915, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau des Quatre Esprits"); put(Language.EN, "Four-Spirit Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				78, WeaponType.MARTEAU1M, "marteau1M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1540, true),
					new Effect(TypeEffect.AtkM, false, 885, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Brise-Glace"); put(Language.EN, "Snow Princess Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				75, WeaponType.MARTEAU1M, "marteau1M/icon11", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1463, true),
					new Effect(TypeEffect.AtkM, false, 841, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau des Stalactites"); put(Language.EN, "Ancestral Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				72, WeaponType.MARTEAU1M, "marteau1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1387, true),
					new Effect(TypeEffect.AtkM, false, 798, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse Tribale de Cuivre"); put(Language.EN, "Judge's Hammer of Law"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				70, WeaponType.MARTEAU1M, "marteau1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1337, true),
					new Effect(TypeEffect.AtkM, false, 769, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Corne d'Auroch"); put(Language.EN, "Ancient Sound Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				67, WeaponType.MARTEAU1M, "marteau1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1263, true),
					new Effect(TypeEffect.AtkM, false, 726, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Fer Magique à Frappe Lourde"); put(Language.EN, "Heavy Strike Iron Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				65, WeaponType.MARTEAU1M, "marteau1M/28ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1215, true),
					new Effect(TypeEffect.AtkM, false, 699, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Combat de Fer Rouge"); put(Language.EN, "Red Iron Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				62, WeaponType.MARTEAU1M, "marteau1M/28ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1143, true),
					new Effect(TypeEffect.AtkM, false, 657, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Fracas"); put(Language.EN, "High-Impact Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU1M, "marteau1M/40vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1096, true),
					new Effect(TypeEffect.AtkM, false, 630, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sceptre du Jugement"); put(Language.EN, "Scepter of Judgment"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU1M, "marteau1M/icon6", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1105, true),
					new Effect(TypeEffect.AtkM, false, 630, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Fer de l'Arbitre"); put(Language.EN, "Judgemaster's Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 935, true),
					new Effect(TypeEffect.AtkM, false, 538, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau à Clous du Démon"); put(Language.EN, "Devil's Hook Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/50blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 947, true),
					new Effect(TypeEffect.AtkM, false, 538, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd Marteau Magique"); put(Language.EN, "Gigaton Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				53, WeaponType.MARTEAU1M, "marteau1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 936, true),
					new Effect(TypeEffect.AtkM, false, 540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Grand Chef"); put(Language.EN, "Big Boss Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 760, true),
					new Effect(TypeEffect.AtkM, false, 437, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Bataille Cérémonielle"); put(Language.EN, "Ceremonial Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/45bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 770, true),
					new Effect(TypeEffect.AtkM, false, 437, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Premier Ancêtre"); put(Language.EN, "Primal Maul"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				45, WeaponType.MARTEAU1M, "marteau1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 761, true),
					new Effect(TypeEffect.AtkM, false, 438, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Assommant"); put(Language.EN, "Brain Scrambler"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				37, WeaponType.MARTEAU1M, "marteau1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 597, true),
					new Effect(TypeEffect.AtkM, false, 343, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Démon Géant"); put(Language.EN, "Great Troll's Hammer"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Manoir"); put(Language.EN, "Palatial Mace"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				29, WeaponType.MARTEAU1M, "marteau1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 450, true),
					new Effect(TypeEffect.AtkM, false, 256, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Loi"); put(Language.EN, "Hammer of Law"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				29, WeaponType.MARTEAU1M, "marteau1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 446, true),
					new Effect(TypeEffect.AtkM, false, 255, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Combat"); put(Language.EN, "Combat Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				24, WeaponType.MARTEAU1M, "marteau1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 358, true),
					new Effect(TypeEffect.AtkM, false, 206, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet Bestial Strié"); put(Language.EN, "Beast Impulse"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 308, true),
					new Effect(TypeEffect.AtkM, false, 177, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau tranchant"); put(Language.EN, "Sharp-Toothed Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/50blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 312, true),
					new Effect(TypeEffect.AtkM, false, 177, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Bête Sauvage"); put(Language.EN, "Wild Beast Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				21, WeaponType.MARTEAU1M, "marteau1M/96sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 307, true),
					new Effect(TypeEffect.AtkM, false, 180, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Fer"); put(Language.EN, "Spiked Iron Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				16, WeaponType.MARTEAU1M, "marteau1M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 232, true),
					new Effect(TypeEffect.AtkM, false, 133, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Acéré"); put(Language.EN, "Sharp-Toothed Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				13, WeaponType.MARTEAU1M, "marteau1M/13sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 189, true),
					new Effect(TypeEffect.AtkM, false, 109, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Bois Renforcé"); put(Language.EN, "Fortified Wooden Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				10, WeaponType.MARTEAU1M, "marteau1M/8sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 151, true),
					new Effect(TypeEffect.AtkM, false, 87, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse de Métal"); put(Language.EN, "Metal Mace"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				7, WeaponType.MARTEAU1M, "marteau1M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 116, true),
					new Effect(TypeEffect.AtkM, false, 67, true),
				}),
		};
	}
	
	static CustomWeapon[] getHa1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Cornue"); put(Language.EN, "Horned Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE1M, "hache1M/54sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Rugissement de Lion"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette de Foudre"); put(Language.EN, "Lightning Hatchet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette des Sables"); put(Language.EN, "Sand Digger Hatchet"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette du Serpent Venimeux"); put(Language.EN, "Viper Hatchet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				87, WeaponType.HACHE1M, "hache1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2073, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dent du Roi Cannibale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				85, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1949, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir en Malachite"); put(Language.EN, "Abyss Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				82, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1918, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Brillante de l'Orgueil"); put(Language.EN, "Haughty King - Brilliant Jade Fang"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, WeaponType.HACHE1M, "hache1M/82bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1857, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Jade Brillant"); put(Language.EN, "Brilliant Jade Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				77, WeaponType.HACHE1M, "hache1M/82bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1766, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir Phosphorescent"); put(Language.EN, "Icy Mooncleaver Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				75, WeaponType.HACHE1M, "hache1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1707, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Airain"); put(Language.EN, "Bone Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				73, WeaponType.HACHE1M, "hache1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1648, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fendoir à Banquise"); put(Language.EN, "Ice-Edge Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, WeaponType.HACHE1M, "hache1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache-Stalactite"); put(Language.EN, "Arctic Freezing Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				68, WeaponType.HACHE1M, "hache1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1503, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Guideuse à Motif Magique"); put(Language.EN, "Runic Guiding Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				65, WeaponType.HACHE1M, "hache1M/48ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1417, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Acier Lourd du Guerrier"); put(Language.EN, "Heavy Steel Warrior's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				63, WeaponType.HACHE1M, "hache1M/48ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1361, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Lumière Glorieuse"); put(Language.EN, "Axe of Glory"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1278, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Diable Brisée"); put(Language.EN, "Demon Buster Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE1M, "hache1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1299, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Griffes de Dragon"); put(Language.EN, "Dragon's Claw"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1117, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Décapitante"); put(Language.EN, "Executioner's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1125, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Lame du Dragon Volant"); put(Language.EN, "Flying Dragon Razor Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				54, WeaponType.HACHE1M, "hache1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1120, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Fatale"); put(Language.EN, "Death Dealer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 912, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache d'Argent"); put(Language.EN, "Silver Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/18ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 923, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Guerre Pourpre"); put(Language.EN, "Crimson Slaughter Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				46, WeaponType.HACHE1M, "hache1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 915, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Foudre"); put(Language.EN, "Thunderstrike Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 719, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Brise-Armure"); put(Language.EN, "Helmsplitter"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 721, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Eclair à Coup Critique"); put(Language.EN, "Thunderstorm Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				38, WeaponType.HACHE1M, "hache1M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 717, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Berserker"); put(Language.EN, "Berserker Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 541, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Charge Militaire"); put(Language.EN, "Desperado Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 550, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Rugissante"); put(Language.EN, "Roaring Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				30, WeaponType.HACHE1M, "hache1M/46bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Puissante Hache de Combat"); put(Language.EN, "Crazy Battle Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				24, WeaponType.HACHE1M, "hache1M/30bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 418, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Briseuse d'Os"); put(Language.EN, "Bonecrusher"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 379, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Esprit Ancestral"); put(Language.EN, "Axe of the Ancients"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 381, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Pulvérisante"); put(Language.EN, "Smashing Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				22, WeaponType.HACHE1M, "hache1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 380, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Guerre"); put(Language.EN, "Demonfire Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				16, WeaponType.HACHE1M, "hache1M/16blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 270, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Fer de Mêlée"); put(Language.EN, "Iron Melee Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				14, WeaponType.HACHE1M, "hache1M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 237, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Bois Spéciale"); put(Language.EN, "Deluxe Woodcutter's Axe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpeur de Yéti"); put(Language.EN, "Yeti Chopper"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				100, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3736, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Claymore Coupeuse de Tête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				100, WeaponType.EPEE2M, "epee2M/30ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3736, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Sommet"); put(Language.EN, "Summit Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				95, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3491, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à 2 mains Couperet de Fer"); put(Language.EN, "Ironcleaver Greatsword"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante Exotique"); put(Language.EN, "Exotic Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				89, WeaponType.EPEE2M, "epee2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3204, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ondes de Métamorphose"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				85, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2923, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Sabre en Saphir"); put(Language.EN, "Flaming Sword"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				84, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2969, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ciel Englouti - Anéantissement"); put(Language.EN, "Annihilation - Sky Swallower"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, WeaponType.EPEE2M, "epee2M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2785, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue Épée de l'Ombre"); put(Language.EN, "Long Shadow Sword"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				79, WeaponType.EPEE2M, "epee2M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2740, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Claymore Ardente"); put(Language.EN, "Crimson Lord's Winged Sword"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				75, WeaponType.EPEE2M, "epee2M/75pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde Épée Bâtarde"); put(Language.EN, "Crazy Fight Bastard Sword"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				74, WeaponType.EPEE2M, "epee2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2516, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Épée de Duel"); put(Language.EN, "Great Jade Frostblade"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				70, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2340, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Claymore"); put(Language.EN, "Silver Carving Blade"); }},
				new GradeName[] { GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				69, WeaponType.EPEE2M, "epee2M/69blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2297, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Emeraude Ancestrale"); put(Language.EN, "Ancient Emerald Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				65, WeaponType.EPEE2M, "epee2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2126, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large Épée de la Jungle Reculée"); put(Language.EN, "Lost Jungle Broadsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				64, WeaponType.EPEE2M, "epee2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2084, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Sort Rompu"); put(Language.EN, "Spellbreaker"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				60, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1917, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Couperet de Fer"); put(Language.EN, "Ironcleaver Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				60, WeaponType.EPEE2M, "epee2M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1956, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Marquis"); put(Language.EN, "Marquis Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1715, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Alien"); put(Language.EN, "Alien Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1765, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Conquérante du Grand Seigneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				55, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1720, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Général"); put(Language.EN, "General's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1405, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Coupante"); put(Language.EN, "Keen Chopper"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1432, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Marshal"); put(Language.EN, "Marshal's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				47, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1410, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Destruction"); put(Language.EN, "Obliteration Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grosse Épée Décisive"); put(Language.EN, "Decisive Striker"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1156, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Destructrice Géante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				39, WeaponType.EPEE2M, "epee2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1116, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive à Dents de Scie"); put(Language.EN, "Sawtooth"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 843, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Noire de Naggaroth"); put(Language.EN, "Ginsu Deluxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/32blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 855, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Fracassante Sertie"); put(Language.EN, "Iron Teeth Slasher"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				31, WeaponType.EPEE2M, "epee2M/47bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 842, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Tranchante"); put(Language.EN, "Razor Slasher Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				26, WeaponType.EPEE2M, "epee2M/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 686, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Guerrier Chargeant"); put(Language.EN, "Desperado Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 597, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Ver Géant"); put(Language.EN, "Giant Worm Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 610, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Guerrier"); put(Language.EN, "Great Warrior's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				23, WeaponType.EPEE2M, "epee2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 600, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Épée Fracassante"); put(Language.EN, "Great Slasher Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				18, WeaponType.EPEE2M, "epee2M/18blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Attaque Furtive"); put(Language.EN, "Assault Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				15, WeaponType.EPEE2M, "epee2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 380, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Cérémoniale"); put(Language.EN, "Axeblade Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				15, WeaponType.EPEE2M, "epee2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 391, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large Épée Géante"); put(Language.EN, "Mighty Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				12, WeaponType.EPEE2M, "epee2M/12blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 308, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante à Lame de Fer"); put(Language.EN, "Iron Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				9, WeaponType.EPEE2M, "epee2M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 242, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante"); put(Language.EN, "Griffon Claw Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				6, WeaponType.EPEE2M, "epee2M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 184, true),
				}),
		};
	}
	
	static CustomWeapon[] getMa2M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet Sismique"); put(Language.EN, "Earthshaker Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.MARTEAU2M, "marteau2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4269, true),
					new Effect(TypeEffect.AtkM, false, 1718, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse de Charon"); put(Language.EN, "Soul Ferry Mace"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.MARTEAU2M, "marteau2M/20ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4269, true),
					new Effect(TypeEffect.AtkM, false, 1718, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Siège"); put(Language.EN, "Siege Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.MARTEAU2M, "marteau2M/97sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3990, true),
					new Effect(TypeEffect.AtkM, false, 1606, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Étoile du Matin à Deux Têtes"); put(Language.EN, "Two-headed Morningstar"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.MARTEAU2M, "marteau2M/70gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3990, true),
					new Effect(TypeEffect.AtkM, false, 1606, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Traces de Rune Cherche-Bête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU2M, "marteau2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3715, true),
					new Effect(TypeEffect.AtkM, false, 1495, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rune Cherche-Bête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU2M, "marteau2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3715, true),
					new Effect(TypeEffect.AtkM, false, 1495, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Épine d'Or"); put(Language.EN, "Gold Spine Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				87, WeaponType.MARTEAU2M, "marteau2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3553, true),
					new Effect(TypeEffect.AtkM, false, 1430, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Emblème des Bêtes Légendaires"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				85, WeaponType.MARTEAU2M, "marteau2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3341, true),
					new Effect(TypeEffect.AtkM, false, 1345, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Béni"); put(Language.EN, "White Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				82, WeaponType.MARTEAU2M, "marteau2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3288, true),
					new Effect(TypeEffect.AtkM, false, 1219, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Foudre Mortelle - Rêves Brisés"); put(Language.EN, "Critical Thunder - Shatterbolt"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				80, WeaponType.MARTEAU2M, "marteau2M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3183, true),
					new Effect(TypeEffect.AtkM, false, 1281, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Foudre"); put(Language.EN, "Thunder Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				77, WeaponType.MARTEAU2M, "marteau2M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3028, true),
					new Effect(TypeEffect.AtkM, false, 1219, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Marteau Céleste"); put(Language.EN, "Heaven Feather Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				75, WeaponType.MARTEAU2M, "marteau2M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2926, true),
					new Effect(TypeEffect.AtkM, false, 1178, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Masse du Géant"); put(Language.EN, "Anger Greathammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				71, WeaponType.MARTEAU2M, "marteau2M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2724, true),
					new Effect(TypeEffect.AtkM, false, 1097, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assommoir"); put(Language.EN, "Noble Wilderness Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				70, WeaponType.MARTEAU2M, "marteau2M/66blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2675, true),
					new Effect(TypeEffect.AtkM, false, 1077, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau d'Apparat"); put(Language.EN, "Forged Giant Steel Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				66, WeaponType.MARTEAU2M, "marteau2M/66blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2478, true),
					new Effect(TypeEffect.AtkM, false, 997, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Roue de Feu"); put(Language.EN, "Fire Wheel Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				65, WeaponType.MARTEAU2M, "marteau2M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2430, true),
					new Effect(TypeEffect.AtkM, false, 978, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de la Frappe d'Acier Rouge"); put(Language.EN, "Red Steel Blow Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				61, WeaponType.MARTEAU2M, "marteau2M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2239, true),
					new Effect(TypeEffect.AtkM, false, 901, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Cristal"); put(Language.EN, "Crystal Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU2M, "marteau2M/62bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2191, true),
					new Effect(TypeEffect.AtkM, false, 882, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Météorite"); put(Language.EN, "Meteorite Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.MARTEAU2M, "marteau2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2200, true),
					new Effect(TypeEffect.AtkM, false, 882, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Siège Démoniaque"); put(Language.EN, "Demon Siege Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				56, WeaponType.MARTEAU2M, "marteau2M/97sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2006, true),
					new Effect(TypeEffect.AtkM, false, 807, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet Mutant"); put(Language.EN, "Alternate Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				56, WeaponType.MARTEAU2M, "marteau2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2015, true),
					new Effect(TypeEffect.AtkM, false, 807, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Massacreur de Monstres"); put(Language.EN, "Monster Masher"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				56, WeaponType.MARTEAU2M, "marteau2M/97sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2010, true),
					new Effect(TypeEffect.AtkM, false, 805, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau à Motifs Ancestraux"); put(Language.EN, "Ancient Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				48, WeaponType.MARTEAU2M, "marteau2M/32bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1649, true),
					new Effect(TypeEffect.AtkM, false, 664, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Guerre du Protecteur"); put(Language.EN, "Defender's Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				48, WeaponType.MARTEAU2M, "marteau2M/42blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1677, true),
					new Effect(TypeEffect.AtkM, false, 664, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Peuple Ancestral"); put(Language.EN, "Hammer of the Ancients"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				48, WeaponType.MARTEAU2M, "marteau2M/32bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1650, true),
					new Effect(TypeEffect.AtkM, false, 670, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet Vengeur"); put(Language.EN, "Retribution"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				40, WeaponType.MARTEAU2M, "marteau2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1313, true),
					new Effect(TypeEffect.AtkM, false, 529, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Protection"); put(Language.EN, "Mallet of Protection"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				40, WeaponType.MARTEAU2M, "marteau2M/97sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1321, true),
					new Effect(TypeEffect.AtkM, false, 529, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Péché Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				40, WeaponType.MARTEAU2M, "marteau2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1312, true),
					new Effect(TypeEffect.AtkM, false, 530, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Combat Féroce"); put(Language.EN, "Fierce Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				32, WeaponType.MARTEAU2M, "marteau2M/42blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1001, true),
					new Effect(TypeEffect.AtkM, false, 403, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Original Maillet de Pierre Géant"); put(Language.EN, "Original Stone Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				32, WeaponType.MARTEAU2M, "marteau2M/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1010, true),
					new Effect(TypeEffect.AtkM, false, 403, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de Guerre de l'Irritable"); put(Language.EN, "Bristling Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				32, WeaponType.MARTEAU2M, "marteau2M/42blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1000, true),
					new Effect(TypeEffect.AtkM, false, 410, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau Dur du Dictateur"); put(Language.EN, "Hard Taskmaster's Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				26, WeaponType.MARTEAU2M, "marteau2M/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 784, true),
					new Effect(TypeEffect.AtkM, false, 316, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Métal Lourd"); put(Language.EN, "Heavy Metal Mallet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				24, WeaponType.MARTEAU2M, "marteau2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 716, true),
					new Effect(TypeEffect.AtkM, false, 288, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue Épineuse"); put(Language.EN, "Mace of Thorns"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				24, WeaponType.MARTEAU2M, "marteau2M/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 720, true),
					new Effect(TypeEffect.AtkM, false, 288, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau d'Acier Renforcé"); put(Language.EN, "Steelsmash Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				24, WeaponType.MARTEAU2M, "marteau2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 718, true),
					new Effect(TypeEffect.AtkM, false, 290, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Gros Maillet du Forgeron"); put(Language.EN, "Smithy's Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				16, WeaponType.MARTEAU2M, "marteau2M/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 463, true),
					new Effect(TypeEffect.AtkM, false, 186, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Excellent Maillet de Combat"); put(Language.EN, "Excellent Warhammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				16, WeaponType.MARTEAU2M, "marteau2M/42blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 477, true),
					new Effect(TypeEffect.AtkM, false, 186, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Masse"); put(Language.EN, "Mighty Mace"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				10, WeaponType.MARTEAU2M, "marteau2M/10sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 301, true),
					new Effect(TypeEffect.AtkM, false, 121, true),
				}),
		};
	}
	
	static CustomWeapon[] getHa2M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Tyran"); put(Language.EN, "Tyrant Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE2M, "hache2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4803, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Casse-colline"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				100, WeaponType.HACHE2M, "hache2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4803, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Hache Ouragan"); put(Language.EN, "Windstorm Great Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, WeaponType.HACHE2M, "hache2M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4489, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Tornade de Dragon"); put(Language.EN, "Dragon Tornado Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				95, WeaponType.HACHE2M, "hache2M/70gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4489, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Massacre Enflammé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE2M, "hache2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4180, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat du Saurien"); put(Language.EN, "Raptor Wing Battle Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				86, WeaponType.HACHE2M, "hache2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3937, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Valyria"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				85, WeaponType.HACHE2M, "hache2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3758, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ravageur"); put(Language.EN, "(Reincarnated) Deathknight's Soul Helmet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				81, WeaponType.HACHE2M, "hache2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3640, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ailes Nocturnes - Illusion"); put(Language.EN, "Darknight Wings - Illusion"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				80, WeaponType.HACHE2M, "hache2M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3581, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Aile Obscure"); put(Language.EN, "Darkwing Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				76, WeaponType.HACHE2M, "hache2M/83bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3349, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Double Hache Titanesque"); put(Language.EN, "Dominatus Twinblade Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				75, WeaponType.HACHE2M, "hache2M/icon6", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3292, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande Hache Sombre"); put(Language.EN, "Darkness Two-Edge Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				72, WeaponType.HACHE2M, "hache2M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3121, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Sapeur"); put(Language.EN, "Yeti Brave's Tomahawk"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				70, WeaponType.HACHE2M, "hache2M/67blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3009, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hallebarde Lourde"); put(Language.EN, "Blazing Blood Ice Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				67, WeaponType.HACHE2M, "hache2M/67blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2843, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de l'Hérétique"); put(Language.EN, "Heretic's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				65, WeaponType.HACHE2M, "hache2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2733, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Veineux"); put(Language.EN, "Blood Vein Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				62, WeaponType.HACHE2M, "hache2M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2572, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Destructeur"); put(Language.EN, "Saboteur's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE2M, "hache2M/46sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2465, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Demie-Lune"); put(Language.EN, "Halfmoon Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				60, WeaponType.HACHE2M, "hache2M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2477, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Grand Seigneur"); put(Language.EN, "Overlord's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				57, WeaponType.HACHE2M, "hache2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2308, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Chef de Guerre"); put(Language.EN, "Warrior Chief Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				57, WeaponType.HACHE2M, "hache2M/52blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2315, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Roi Sacré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				57, WeaponType.HACHE2M, "hache2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2312, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat du Général"); put(Language.EN, "General's Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				49, WeaponType.HACHE2M, "hache2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1904, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de la Mort"); put(Language.EN, "Death Adder"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				49, WeaponType.HACHE2M, "hache2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1923, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Seigneur de Guerre"); put(Language.EN, "Warlord's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				49, WeaponType.HACHE2M, "hache2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1908, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Géante Barbare"); put(Language.EN, "Barbarian Giant Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				41, WeaponType.HACHE2M, "hache2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1523, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fracassante Hache d'Acier"); put(Language.EN, "Steel Thunder Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				41, WeaponType.HACHE2M, "hache2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1537, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Primitive du Géant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				41, WeaponType.HACHE2M, "hache2M/16sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1525, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Long Crochet"); put(Language.EN, "Longhook Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				33, WeaponType.HACHE2M, "hache2M/60bleu1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1169, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache en Lune"); put(Language.EN, "Moon Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				33, WeaponType.HACHE2M, "hache2M/36sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1178, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Guerre à Eperon de Requin"); put(Language.EN, "Shark Tail Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				33, WeaponType.HACHE2M, "hache2M/60bleu1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1170, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache des Champs de Bataille"); put(Language.EN, "Battlefield Warrior's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				26, WeaponType.HACHE2M, "hache2M/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 882, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat Royale"); put(Language.EN, "Royal Battleaxe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				25, WeaponType.HACHE2M, "hache2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 843, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Pierre Aiguisée"); put(Language.EN, "Stoneblade Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				25, WeaponType.HACHE2M, "hache2M/56sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 850, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Tranchante"); put(Language.EN, "Warrior's Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				18, WeaponType.HACHE2M, "hache2M/33bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 588, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Longue d'Officier"); put(Language.EN, "Striker Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				17, WeaponType.HACHE2M, "hache2M/33bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 554, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Coupante"); put(Language.EN, "Cutting Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				17, WeaponType.HACHE2M, "hache2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 558, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache à Double Tranchant"); put(Language.EN, "Dual-Blade Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				11, WeaponType.HACHE2M, "hache2M/6blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 367, true),
				}),
		};
	}
	
	static CustomWeapon[] getMeca1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague courte aveuglante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.MARTEAU2M, "meca1M/91sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
					new Effect(TypeEffect.AtkM, false, 982, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague courte aveuglante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.MARTEAU2M, "meca1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
					new Effect(TypeEffect.AtkM, false, 982, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague Chérubim"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				95, WeaponType.MARTEAU2M, "meca1M/icon6", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
					new Effect(TypeEffect.AtkM, false, 918, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de feu Sang de lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				91, WeaponType.MARTEAU2M, "meca1M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1571, true),
					new Effect(TypeEffect.AtkM, false, 867, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée éblouissante du vide lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MARTEAU2M, "meca1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
					new Effect(TypeEffect.AtkM, false, 854, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Croc acéré des orcs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MARTEAU2M, "meca1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
					new Effect(TypeEffect.AtkM, false, 854, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpe-cavalerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				86, WeaponType.MARTEAU2M, "meca1M/86blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
					new Effect(TypeEffect.AtkM, false, 805, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée hivernale d'engelure"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				85, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1436, true),
					new Effect(TypeEffect.AtkM, false, 793, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame antique de sorcière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				81, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
					new Effect(TypeEffect.AtkM, false, 744, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau tournoyant frénétique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1326, true),
					new Effect(TypeEffect.AtkM, false, 732, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de torture"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				76, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
					new Effect(TypeEffect.AtkM, false, 685, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame secrète du Rôdeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				75, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1219, true),
					new Effect(TypeEffect.AtkM, false, 673, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée forgée de runes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				71, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1135, true),
					new Effect(TypeEffect.AtkM, false, 626, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Burin plume de phénix"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
					new Effect(TypeEffect.AtkM, false, 615, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de lumière de berseker en kaolinite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				66, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
					new Effect(TypeEffect.AtkM, false, 570, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du pic enneigé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				65, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1012, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée hacheuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				61, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 933, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau brise-barrière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 836, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Petite lame de Coupe-gorge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 836, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache ronde atypique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				53, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 724, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Courte rapière rapide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				51, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 742, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Trancheur d'homme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				47, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 669, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de guerre péremptoire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				46, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 651, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Simple lame chirurgicale rouge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				44, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 616, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du commandant "); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				41, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 564, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache légère de gobelin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				37, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 497, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau explosif"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				36, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Elégance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				31, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 402, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée lumineuse de raid de nuit"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				30, WeaponType.MARTEAU2M, "meca1M/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 386, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Baïonnette de l'esprit combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				26, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame en acier trempé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				24, WeaponType.MARTEAU2M, "meca1M/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Courte lame du pouvoir militaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				22, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 271, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Belle épée de fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				21, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 257, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de fer fragmentaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague standard de Kaslow"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau solide du protecteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				11, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 136, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Court marteau cruel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				10, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 125, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de fer rouillé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				6, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 88, true),
				}),
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
