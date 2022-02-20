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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabreloup Double Croc"); put(Language.EN, "Twin Fang Wolf Saber"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffe de Dragon"); put(Language.EN, "Dragon Claw"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, "Frost Twin Blades"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, WeaponType.EPEE1M, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine du Dragon Pourpre"); put(Language.EN, "Violet Dragontail"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Massue Écrase Cristal"); put(Language.EN, "Crystal Smasher Mace"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Cristal Jaune"); put(Language.EN, "Topaz Crystal Hammer - Blast"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU1M, "marteau1M/88bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1858, true),
					new Effect(TypeEffect.AtkM, false, 1068, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de Cristal Jaune"); put(Language.EN, "Topaz Crystal Hammer - Blast"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Outre-Espace"); put(Language.EN, "Golden Nebula Hammer"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de l'Etourdissement"); put(Language.EN, "Dizzy-Hit Hammer"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				37, WeaponType.MARTEAU1M, "marteau1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 596, true),
					new Effect(TypeEffect.AtkM, false, 345, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau du Juge"); put(Language.EN, "Judge's Gavel"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Rugissement de Lion"); put(Language.EN, "Lion Roar Axe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine de l'Empereur Malin"); put(Language.EN, "Malice - Emperor Fang"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine de l'empereur Malin"); put(Language.EN, "Malice Emperor Fang"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE1M, "hache1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette du Serpent Venimeux"); put(Language.EN, "Viper Hatchet"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				87, WeaponType.HACHE1M, "hache1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2073, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dent du Roi Cannibale"); put(Language.EN, "Cruel King's Jaws"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat"); put(Language.EN, "Battleaxe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Claymore Coupeuse de Tête"); put(Language.EN, "Head Taker Claymore"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Point d'Éclat"); put(Language.EN, "Ground Zero"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				90, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Point d'Éclat"); put(Language.EN, "Ground Zero"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				90, WeaponType.EPEE2M, "epee2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Géante Exotique"); put(Language.EN, "Exotic Greatsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, },
				89, WeaponType.EPEE2M, "epee2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3204, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Ondes de Métamorphose"); put(Language.EN, "Maddening Wave"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Conquérante du Grand Seigneur"); put(Language.EN, "Overlord's Sword of Conquest"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Destructrice Géante"); put(Language.EN, "Obliteration Sword"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Traces de Rune Cherche-Bête"); put(Language.EN, "Primal Beast Rune - Tracks"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.MARTEAU2M, "marteau2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3715, true),
					new Effect(TypeEffect.AtkM, false, 1495, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rune Cherche-Bête"); put(Language.EN, "Tracking Beast Rune"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Emblème des Bêtes Légendaires"); put(Language.EN, "Ancient Beast Totema"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du Péché Céleste"); put(Language.EN, "Sin's Burden Hammer"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Casse-colline"); put(Language.EN, "Giant's Hillsplitter Axe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Massacre Enflammé"); put(Language.EN, "Blazing Rampage Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				90, WeaponType.HACHE2M, "hache2M/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 4180, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Combat du Saurien"); put(Language.EN, "Raptor Wing Battle Axe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				86, WeaponType.HACHE2M, "hache2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3937, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache de Valyria"); put(Language.EN, "Wailing Skyblade"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du Roi Sacré"); put(Language.EN, "Holy King's Axe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache Primitive du Géant"); put(Language.EN, "Giant's Primitive Axe"); }},
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
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague courte aveuglante"); put(Language.EN, "Conqueror's Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.MARTEAU2M, "meca1M/91sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
					new Effect(TypeEffect.AtkM, false, 982, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague courte aveuglante"); put(Language.EN, "Conqueror's Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.MARTEAU2M, "meca1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
					new Effect(TypeEffect.AtkM, false, 982, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague Chérubim"); put(Language.EN, "Cherubim Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				95, WeaponType.MARTEAU2M, "meca1M/icon6", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
					new Effect(TypeEffect.AtkM, false, 918, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de feu Sang de lune"); put(Language.EN, "Bloodmoon Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				91, WeaponType.MARTEAU2M, "meca1M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1571, true),
					new Effect(TypeEffect.AtkM, false, 867, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée éblouissante du vide lunaire"); put(Language.EN, "Lunar Void Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MARTEAU2M, "meca1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
					new Effect(TypeEffect.AtkM, false, 854, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Croc acéré des orcs"); put(Language.EN, "Orcfang Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MARTEAU2M, "meca1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
					new Effect(TypeEffect.AtkM, false, 854, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpe-cavalerie"); put(Language.EN, "Cavalry Chopper"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				86, WeaponType.MARTEAU2M, "meca1M/86blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
					new Effect(TypeEffect.AtkM, false, 805, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée hivernale d'engelure"); put(Language.EN, "Frostbite Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				85, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1436, true),
					new Effect(TypeEffect.AtkM, false, 793, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame antique de sorcière"); put(Language.EN, "Profane Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				81, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
					new Effect(TypeEffect.AtkM, false, 744, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau tournoyant frénétique"); put(Language.EN, "Rage Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1326, true),
					new Effect(TypeEffect.AtkM, false, 732, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de torture"); put(Language.EN, "Torturer's Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				76, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
					new Effect(TypeEffect.AtkM, false, 685, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame secrète du Rôdeur"); put(Language.EN, "Lurker's Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				75, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1219, true),
					new Effect(TypeEffect.AtkM, false, 673, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée forgée de runes"); put(Language.EN, "Runic Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				71, WeaponType.MARTEAU2M, "meca1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1135, true),
					new Effect(TypeEffect.AtkM, false, 626, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Burin plume de phénix"); put(Language.EN, "Phoenix Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
					new Effect(TypeEffect.AtkM, false, 615, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de lumière de berseker en kaolinite"); put(Language.EN, "Berserker's Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				66, WeaponType.MARTEAU2M, "meca1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
					new Effect(TypeEffect.AtkM, false, 570, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet du pic enneigé"); put(Language.EN, "Snowcap Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				65, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1012, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée hacheuse"); put(Language.EN, "Razoredge Longsword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				61, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 933, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau brise-barrière"); put(Language.EN, "Barrierbane Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 836, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Petite lame de Coupe-gorge"); put(Language.EN, "Cutthroat's Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 836, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache ronde atypique"); put(Language.EN, "Constellation Axe"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				53, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 724, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Courte rapière rapide"); put(Language.EN, "Keenblade Rapier"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				51, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 742, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Trancheur d'homme"); put(Language.EN, "Savage Hacker"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				47, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 669, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau de guerre péremptoire"); put(Language.EN, "Despot's Warhammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				46, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 651, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Simple lame chirurgicale rouge"); put(Language.EN, "Surgical Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				44, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 616, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du commandant "); put(Language.EN, "Commander's Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				41, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 564, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache légère de gobelin"); put(Language.EN, "Goblin's Light Axe"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				37, WeaponType.MARTEAU2M, "meca1M/icon10", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 497, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau explosif"); put(Language.EN, "Steelforge Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				36, WeaponType.MARTEAU2M, "meca1M/icon9", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Elégance"); put(Language.EN, "Elegant Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				31, WeaponType.MARTEAU2M, "meca1M/icon8", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 402, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée lumineuse de raid de nuit"); put(Language.EN, "Ambusher's Longsword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				30, WeaponType.MARTEAU2M, "meca1M/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 386, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Baïonnette de l'esprit combattant"); put(Language.EN, "Courageous Bayonet"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				26, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame en acier trempé"); put(Language.EN, "Reinforced Steel Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				24, WeaponType.MARTEAU2M, "meca1M/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Courte lame du pouvoir militaire"); put(Language.EN, "Assault Blade"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				22, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 271, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Belle épée de fer"); put(Language.EN, "Sturdy Iron Sword"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				21, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 257, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de fer fragmentaire"); put(Language.EN, "Fragmentary Iron Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague standard de Kaslow"); put(Language.EN, "Kaslow Reinforced Dagger"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.MARTEAU2M, "meca1M/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marteau solide du protecteur"); put(Language.EN, "Defender's Solid Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				11, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 136, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Court marteau cruel"); put(Language.EN, "Crude Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				10, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 125, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Maillet de fer rouillé"); put(Language.EN, "Rusty Iron Hammer"); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				6, WeaponType.MARTEAU2M, "meca1M/31reinca", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 88, true),
				}),
		};
	}
	
	static CustomWeapon[] getMeca2M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd coupe-tête de héros"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.MECA2M, "meca2M/92sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3736, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large épée du diable pleureur lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				96, WeaponType.MECA2M, "meca2M/icon1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde faucille du diable brûlant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				95, WeaponType.MECA2M, "meca2M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3491, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde hache double lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				91, WeaponType.MECA2M, "meca2M/91blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3299, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hallebarde assassine géante du Feu Solaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MECA2M, "meca2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachette contondante d'armure lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.MECA2M, "meca2M/87bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large lame grognante lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				86, WeaponType.MECA2M, "meca2M/86blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3062, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache démente d'Hiver en cristal "); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				85, WeaponType.MECA2M, "meca2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3016, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Antique hache à chaîne lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				81, WeaponType.MECA2M, "meca2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2831, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée sauvage tourbillonnante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, WeaponType.MECA2M, "meca2M/85pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2785, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée frénétique du bourreau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				76, WeaponType.MECA2M, "meca2M/85pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2605, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache lourde de l'Exterminateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				75, WeaponType.MECA2M, "meca2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache lourde malchanceuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				71, WeaponType.MECA2M, "meca2M/80pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2384, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde machette de phénix chantant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, WeaponType.MECA2M, "meca2M/85pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2340, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde lame de pique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				66, WeaponType.MECA2M, "meca2M/85pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2168, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde lame edelweiss"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				65, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2126, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame lourde de Décapitation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				57, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1795, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grande claymore lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1755, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache lourde du massacre pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				54, WeaponType.MECA2M, "meca2M/51bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1676, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lance rouge gravitationnelle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				51, WeaponType.MECA2M, "meca2M/54bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1558, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache lourde de Trancheur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				48, WeaponType.MECA2M, "meca2M/51bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1443, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde épée lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				46, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1368, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde lame plate du cercle magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				45, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1331, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pique furtive du commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				41, WeaponType.MECA2M, "meca2M/54bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1185, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache lourde d'homme-bête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				38, WeaponType.MECA2M, "meca2M/51bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1079, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tueur en acier composite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				36, WeaponType.MECA2M, "meca2M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1010, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd marteau chancelant d'assaut"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				32, WeaponType.MECA2M, "meca2M/30ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 876, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde baïonnette classique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				31, WeaponType.MECA2M, "meca2M/54bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 843, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du valeureux combattant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				26, WeaponType.MECA2M, "meca2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 686, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache du combattant rodé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				24, WeaponType.MECA2M, "meca2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 626, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde masse raffinée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				21, WeaponType.MECA2M, "meca2M/30ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 540, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hache croissant de lune en laiton"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.MECA2M, "meca2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 405, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Large hache du protecteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				12, WeaponType.MECA2M, "meca2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 308, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde hache corrosive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				7, WeaponType.MECA2M, "meca2M/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 203, true),
				}),
		};
	}
	
	static CustomWeapon[] getArc() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Crépuscule"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.ARC, "arc/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2135, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Voleur de Cœur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.ARC, "arc/70gvg", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2135, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Long Œil de Lynx"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.ARC, "arc/38ora0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1995, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Court Polaris"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.ARC, "arc/59bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1995, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tueur d'Oiseau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.ARC, "arc/86bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1858, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Enflammé du Traqueur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				89, WeaponType.ARC, "arc/79pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1831, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Chant des Sirènes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, WeaponType.ARC, "arc/86bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1723, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Corail Rouge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				84, WeaponType.ARC, "arc/86bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1697, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Chimères - Capture"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				80, WeaponType.ARC, "arc/83bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1592, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Chimère"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				79, WeaponType.ARC, "arc/83bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1566, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Arc à Plumes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				75, WeaponType.ARC, "arc/icon2", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1463, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Paradis"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				74, WeaponType.ARC, "arc/icon2", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1438, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Chasse à l'Ours"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				70, WeaponType.ARC, "arc/72bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1337, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Trappeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				69, WeaponType.ARC, "arc/72bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1313, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Fossile de l'Echine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				65, WeaponType.ARC, "arc/38ora0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1215, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Cristal Bleu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				64, WeaponType.ARC, "arc/38ora0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1191, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Protection"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.ARC, "arc/18ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1096, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Souffle Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.ARC, "arc/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1145, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Guerre de la Navette Volante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				59, WeaponType.ARC, "arc/28ora1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1072, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Combat de Fête"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				59, WeaponType.ARC, "arc/48ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1098, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Sniper Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				59, WeaponType.ARC, "arc/28ora1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1070, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Explosif"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				51, WeaponType.ARC, "arc/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 890, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Arc Météore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				51, WeaponType.ARC, "arc/28ora1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 905, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Arc sans Ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				51, WeaponType.ARC, "arc/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 891, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Sniper"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				43, WeaponType.ARC, "arc/27bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 718, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Tranchant du Chasseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				43, WeaponType.ARC, "arc/18ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 726, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Guerre de l'Aile volante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				43, WeaponType.ARC, "arc/27bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 720, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc de Guerre Renforcé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				35, WeaponType.ARC, "arc/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 558, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Ailé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				35, WeaponType.ARC, "arc/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 570, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Arc à Champ de Bataille Particulier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				35, WeaponType.ARC, "arc/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 557, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Chasseur Précis"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.ARC, "arc/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 427, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Ciselé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				27, WeaponType.ARC, "arc/28ora1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 410, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Barbare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				27, WeaponType.ARC, "arc/34sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 424, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc du Chasseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.ARC, "arc/18ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 292, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Arc de l'Archer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				19, WeaponType.ARC, "arc/18ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 277, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Arc Classique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				19, WeaponType.ARC, "arc/43bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 282, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc d'Entraînement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				13, WeaponType.ARC, "arc/27bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 189, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Arc Puissant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				7, WeaponType.ARC, "arc/8blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 116, true),
				}),
		};
	}
	
	static CustomWeapon[] getGun() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lance-flamme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.GUN, "gun/81sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Cerberus Arquebus"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.GUN, "gun/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Poussiéreuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.GUN, "gun/81sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lance Cherche-cœur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.GUN, "gun/70gvg", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Imitateur Classique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.GUN, "gun/88bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Mousquet du Promeneur Lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				86, WeaponType.GUN, "gun/81sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2042, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tireur Fou"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				85, WeaponType.GUN, "gun/88bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1949, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil de l'Orage Éternel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				81, WeaponType.GUN, "gun/88bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1887, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Viseur de l'Invisible - Profondeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				80, WeaponType.GUN, "gun/83bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1857, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil du Coup Parfait"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				76, WeaponType.GUN, "gun/83bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1737, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Mousquet à Triple Baïonnette"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				75, WeaponType.GUN, "gun/81sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1707, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet-Harpon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				71, WeaponType.GUN, "gun/81sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1589, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Calibre 12mm"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				70, WeaponType.GUN, "gun/70bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Revolver Plombé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				66, WeaponType.GUN, "gun/70bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1446, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Carabine de Chasse en Argent de Milirus"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				65, WeaponType.GUN, "gun/48pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1417, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde Lance d'Argent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				61, WeaponType.GUN, "gun/48pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1306, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Carabine Runique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.GUN, "gun/63bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1278, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet Décapiteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.GUN, "gun/38ora1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1304, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tromblon d'Ingénieur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.GUN, "gun/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1065, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet Électromagnétique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.GUN, "gun/96sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1100, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet de Métal à Haute Pression"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.GUN, "gun/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1066, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet d'Acier Orné"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.GUN, "gun/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 862, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Carabine de Sniper"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.GUN, "gun/44sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 887, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil des Cadavres du Templier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.GUN, "gun/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 860, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet Renforcé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.GUN, "gun/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 673, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.GUN, "gun/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 688, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lance du Collectionneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.GUN, "gun/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 675, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet du Chasseur Remodelé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.GUN, "gun/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 499, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil à Lunette"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.GUN, "gun/28ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 505, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil à Double Canon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.GUN, "gun/icon2", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 513, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil du Sniper Embusqué"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.GUN, "gun/28ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 500, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet du Chasseur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.GUN, "gun/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 341, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tromblon de Combat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.GUN, "gun/50blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 352, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pistolet Arrondi"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.GUN, "gun/18ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 330, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Carabine de Tir Rapide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.GUN, "gun/50blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 355, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Carabine de Trappeur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				14, WeaponType.GUN, "gun/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 237, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fusil simple"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				8, WeaponType.GUN, "gun/8blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 157, true),
				}),
		};
	}
	
	static CustomWeapon[] getCanon() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde divine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				100, WeaponType.CANON, "canon/91sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie du couloir de la mort"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				96, WeaponType.CANON, "canon/icon2", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2360, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie surnaturelle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				95, WeaponType.CANON, "canon/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2327, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie de l'ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				91, WeaponType.CANON, "canon/91blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2199, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde astrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.CANON, "canon/88bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde des pionniers"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				90, WeaponType.CANON, "canon/88bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2167, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie d'artilleurs en armure lourde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				86, WeaponType.CANON, "canon/86blanc", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2042, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie d'Hiver du sol gelé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				85, WeaponType.CANON, "canon/80pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 2010, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon lourd d'archimage invocateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				81, WeaponType.CANON, "canon/80pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1887, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde de Gill"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				80, WeaponType.CANON, "canon/84pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1857, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie du bourreau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				76, WeaponType.CANON, "canon/84pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1737, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tir d'artillerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				75, WeaponType.CANON, "canon/80pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1707, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon lourd d'archimage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				71, WeaponType.CANON, "canon/80pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1589, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon lourd peau de dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				70, WeaponType.CANON, "canon/84pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1560, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie de l'observateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				66, WeaponType.CANON, "canon/84pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1446, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie du blizzard"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				65, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1417, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde baïonnette de soufre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				62, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1333, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon lourd tape-à-l'œil"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				59, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1251, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie-bouclier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				56, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1170, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde azur sans limites"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				52, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1065, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon lourd intelligent"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				51, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1039, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie de Couvert léger"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				49, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 987, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie déraisonnable"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				46, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 912, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd canon ésotérique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				42, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 814, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canon directif"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				41, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 790, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie en alliage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				36, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 673, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie légère du pécheur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				36, WeaponType.CANON, "canon/54sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 673, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Vieux canon lourd"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				31, WeaponType.CANON, "canon/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 562, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie de sniper silencieuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				28, WeaponType.CANON, "canon/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 499, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie du gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				26, WeaponType.CANON, "canon/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 457, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie magnifique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				21, WeaponType.CANON, "canon/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 360, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie de la cavalerie légère"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				20, WeaponType.CANON, "canon/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 341, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde en fer blanc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				16, WeaponType.CANON, "canon/14sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 270, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Artillerie lourde de défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				12, WeaponType.CANON, "canon/31reinca", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 205, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourde bombe calorimétrique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.METALLEUX, GradeName.DEMOLISSEUR, },
				7, WeaponType.CANON, "canon/31reinca", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 135, true),
				}),
		};
	}
	
	static CustomWeapon[] getRel() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bijou de Détermination"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, WeaponType.RELIQUE, "relique/icon0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 1232),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Charme de Dévotion"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.RELIQUE, "relique/icon1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 431),
					new Effect(TypeEffect.PM, false, 431),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Preuve de Vengeance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, WeaponType.RELIQUE, "relique/icon2", new Calculable[] {
					new Effect(TypeEffect.PM, false, 616),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Crâne de Tigre Géant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				100, WeaponType.RELIQUE, "relique/icon3", new Calculable[] {
					new Effect(TypeEffect.PV, false, 1232),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Cristal de Verre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				100, WeaponType.RELIQUE, "relique/icon4", new Calculable[] {
					new Effect(TypeEffect.PV, false, 431),
					new Effect(TypeEffect.PM, false, 431),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fragment de Comète"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, WeaponType.RELIQUE, "relique/icon5", new Calculable[] {
					new Effect(TypeEffect.PM, false, 616),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pierre de Morale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, WeaponType.RELIQUE, "relique/75gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 1144),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Boussole Divine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.RELIQUE, "relique/80gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 400),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Météore de Feu Stellaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, WeaponType.RELIQUE, "relique/59ora", new Calculable[] {
					new Effect(TypeEffect.PM, false, 572),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Flamme de la Dévotion"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				95, WeaponType.RELIQUE, "relique/icon6", new Calculable[] {
					new Effect(TypeEffect.PV, false, 1144),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Plume de Neige"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				95, WeaponType.RELIQUE, "relique/icon7", new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
					new Effect(TypeEffect.PM, false, 400),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Cœur des Géants des Montagnes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, WeaponType.RELIQUE, "relique/icon8", new Calculable[] {
					new Effect(TypeEffect.PM, false, 572),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lingot d'Or Rituel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				90, WeaponType.RELIQUE, "relique/icon9", new Calculable[] {
					new Effect(TypeEffect.PV, false, 739),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Badge du Miraculé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				90, WeaponType.RELIQUE, "relique/icon10", new Calculable[] {
					new Effect(TypeEffect.PV, false, 259),
					new Effect(TypeEffect.PM, false, 259),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fragment de la Prophétie de la Destinée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				90, WeaponType.RELIQUE, "relique/47bleu0", new Calculable[] {
					new Effect(TypeEffect.PM, false, 370),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pierre des Rêves du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				85, WeaponType.RELIQUE, "relique/75gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 678),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre de Purification"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				85, WeaponType.RELIQUE, "relique/90gold2", new Calculable[] {
					new Effect(TypeEffect.PV, false, 237),
					new Effect(TypeEffect.PM, false, 237),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tome des Démons Enchaînés"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				85, WeaponType.RELIQUE, "relique/39ora1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 339),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sceau Explosif du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				80, WeaponType.RELIQUE, "relique/80gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 616),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre de Dévotion Illimitée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				80, WeaponType.RELIQUE, "relique/95gold1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 216),
					new Effect(TypeEffect.PM, false, 216),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre Oublié de la Pierre Magique Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, WeaponType.RELIQUE, "relique/80gold1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 308),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Roche Frappée par la Foudre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				75, WeaponType.RELIQUE, "relique/59ora", new Calculable[] {
					new Effect(TypeEffect.PV, false, 563),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Fossile de Spritosaure Antique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				75, WeaponType.RELIQUE, "relique/39sprite", new Calculable[] {
					new Effect(TypeEffect.PV, false, 197),
					new Effect(TypeEffect.PM, false, 197),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grimoire de Sorcellerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				75, WeaponType.RELIQUE, "relique/39ora1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 282),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Quartz de Vitalité"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				70, WeaponType.RELIQUE, "relique/65gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 493),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Écorce Ensorcelée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				70, WeaponType.RELIQUE, "relique/icon11", new Calculable[] {
					new Effect(TypeEffect.PV, false, 173),
					new Effect(TypeEffect.PM, false, 173),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Papyrus d'Inspiration"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				70, WeaponType.RELIQUE, "relique/icon12", new Calculable[] {
					new Effect(TypeEffect.PM, false, 247),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Chevalière Protectrice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				65, WeaponType.RELIQUE, "relique/61sprite1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 423),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assiette Plate du Dogme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				65, WeaponType.RELIQUE, "relique/31reinca0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 148),
					new Effect(TypeEffect.PM, false, 148),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Formule du Livre du Chaos"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				65, WeaponType.RELIQUE, "relique/39ora1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 211),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marque de l'Eglise"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				60, WeaponType.RELIQUE, "relique/50gold0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 422),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame céleste gravée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				60, WeaponType.RELIQUE, "relique/59ora", new Calculable[] {
					new Effect(TypeEffect.PV, false, 148),
					new Effect(TypeEffect.PM, false, 148),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre de la Langue du Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				60, WeaponType.RELIQUE, "relique/95gold2", new Calculable[] {
					new Effect(TypeEffect.PM, false, 211),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marque du Jugement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				55, WeaponType.RELIQUE, "relique/50gold1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame légère runique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, WeaponType.RELIQUE, "relique/50gold1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 140),
					new Effect(TypeEffect.PM, false, 140),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre du Sceau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, WeaponType.RELIQUE, "relique/39ora1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 200),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marque des Lumières"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				55, WeaponType.RELIQUE, "relique/50gold1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 405),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pierre d'Ardoise de la Marque du Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				55, WeaponType.RELIQUE, "relique/50gold1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 135),
					new Effect(TypeEffect.PM, false, 145),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Code Interdit des Démons"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				55, WeaponType.RELIQUE, "relique/39ora1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 205),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Insigne de l'Ordre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				47, WeaponType.RELIQUE, "relique/70gold", new Calculable[] {
					new Effect(TypeEffect.PV, false, 352),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Serment"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				47, WeaponType.RELIQUE, "relique/70gold", new Calculable[] {
					new Effect(TypeEffect.PV, false, 123),
					new Effect(TypeEffect.PM, false, 123),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre Disparu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				47, WeaponType.RELIQUE, "relique/80gold1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 176),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marque de Chevalerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				47, WeaponType.RELIQUE, "relique/70gold", new Calculable[] {
					new Effect(TypeEffect.PV, false, 355),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assiette de Baptême de Bénédiction Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				47, WeaponType.RELIQUE, "relique/70gold", new Calculable[] {
					new Effect(TypeEffect.PV, false, 123),
					new Effect(TypeEffect.PM, false, 125),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre d'Oblivion"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				47, WeaponType.RELIQUE, "relique/80gold1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 177),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Insigne du Juste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				39, WeaponType.RELIQUE, "relique/91sprite1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 282),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Donateur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				39, WeaponType.RELIQUE, "relique/39sprite", new Calculable[] {
					new Effect(TypeEffect.PV, false, 99),
					new Effect(TypeEffect.PM, false, 99),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre du Sage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				39, WeaponType.RELIQUE, "relique/45sprite", new Calculable[] {
					new Effect(TypeEffect.PM, false, 141),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Insigne Renforceur de la Loi"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				39, WeaponType.RELIQUE, "relique/91sprite1", new Calculable[] {
					new Effect(TypeEffect.PV, false, 280),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assiette de Cérémonie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				39, WeaponType.RELIQUE, "relique/39sprite", new Calculable[] {
					new Effect(TypeEffect.PV, false, 100),
					new Effect(TypeEffect.PM, false, 95),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Tome de l'Intelligence"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				39, WeaponType.RELIQUE, "relique/45sprite", new Calculable[] {
					new Effect(TypeEffect.PM, false, 142),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Marque du Paladin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				31, WeaponType.RELIQUE, "relique/35sprite", new Calculable[] {
					new Effect(TypeEffect.PV, false, 210),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assiette de la Discipline"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				31, WeaponType.RELIQUE, "relique/31reinca0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 75),
					new Effect(TypeEffect.PM, false, 72),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre d'Etude de la Sorcellerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				31, WeaponType.RELIQUE, "relique/31reinca1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 105),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Emblème Pacifique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.PALADIN, },
				31, WeaponType.RELIQUE, "relique/35sprite", new Calculable[] {
					new Effect(TypeEffect.PV, false, 211),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Assiette Plate Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, },
				31, WeaponType.RELIQUE, "relique/31reinca0", new Calculable[] {
					new Effect(TypeEffect.PV, false, 74),
					new Effect(TypeEffect.PM, false, 74),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Livre de l'Esprit"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SORCIER, GradeName.NECROMANCIEN, },
				31, WeaponType.RELIQUE, "relique/31reinca1", new Calculable[] {
					new Effect(TypeEffect.PM, false, 106),
				}),
		};
	}
	
	static CustomWeapon[] getBaton() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton d'Âme Brisée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, WeaponType.BATON, "baton/70bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2313, true),
					new Effect(TypeEffect.AtkM, false, 2455, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Balance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				100, WeaponType.BATON, "baton/63bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2313, true),
					new Effect(TypeEffect.AtkM, false, 2455, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Phare"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, WeaponType.BATON, "baton/40ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2161, true),
					new Effect(TypeEffect.AtkM, false, 2294, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Spectral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				95, WeaponType.BATON, "baton/68pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2161, true),
					new Effect(TypeEffect.AtkM, false, 2294, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Yeux Maudits de l'Aile spirituelle"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				90, WeaponType.BATON, "baton/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2013, true),
					new Effect(TypeEffect.AtkM, false, 2136, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de Pitié"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				88, WeaponType.BATON, "baton/99ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1954, true),
					new Effect(TypeEffect.AtkM, false, 2074, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Oeil Stromboscopique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				85, WeaponType.BATON, "baton/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1809, true),
					new Effect(TypeEffect.AtkM, false, 1921, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Saint des Saints"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				83, WeaponType.BATON, "baton/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1809, true),
					new Effect(TypeEffect.AtkM, false, 1921, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Halo de l'Au-Delà - Transcendance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				80, WeaponType.BATON, "baton/84ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1724, true),
					new Effect(TypeEffect.AtkM, false, 1830, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Cercle Perlé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				78, WeaponType.BATON, "baton/84ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1668, true),
					new Effect(TypeEffect.AtkM, false, 1771, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de l'Aurore"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				75, WeaponType.BATON, "baton/99ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1585, true),
					new Effect(TypeEffect.AtkM, false, 1682, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton à Plume de Phénix"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				73, WeaponType.BATON, "baton/99ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1530, true),
					new Effect(TypeEffect.AtkM, false, 1624, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton d'Ermite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				70, WeaponType.BATON, "baton/70bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1449, true),
					new Effect(TypeEffect.AtkM, false, 1538, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sceptre Ambré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				68, WeaponType.BATON, "baton/70bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1395, true),
					new Effect(TypeEffect.AtkM, false, 1481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de la Croix Profonde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				65, WeaponType.BATON, "baton/40ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1316, true),
					new Effect(TypeEffect.AtkM, false, 1397, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Guide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				63, WeaponType.BATON, "baton/40ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1264, true),
					new Effect(TypeEffect.AtkM, false, 1342, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de l'Arcane"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				60, WeaponType.BATON, "baton/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1187, true),
					new Effect(TypeEffect.AtkM, false, 1260, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de la Sorcière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				60, WeaponType.BATON, "baton/95pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1066, true),
					new Effect(TypeEffect.AtkM, false, 1355, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de Mille ans"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				58, WeaponType.BATON, "baton/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1136, true),
					new Effect(TypeEffect.AtkM, false, 1206, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Croissant de Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				58, WeaponType.BATON, "baton/40ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1020, true),
					new Effect(TypeEffect.AtkM, false, 1310, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de la Genèse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				58, WeaponType.BATON, "baton/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1140, true),
					new Effect(TypeEffect.AtkM, false, 1200, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Magique de l'Officier de Cérémonie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				50, WeaponType.BATON, "baton/18ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 941, true),
					new Effect(TypeEffect.AtkM, false, 999, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Guide Magique "); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				50, WeaponType.BATON, "baton/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 824, true),
					new Effect(TypeEffect.AtkM, false, 1106, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de Conduite Élémentaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				50, WeaponType.BATON, "baton/18ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 942, true),
					new Effect(TypeEffect.AtkM, false, 1000, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Baguette de Métal du Démon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				42, WeaponType.BATON, "baton/10sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 756, true),
					new Effect(TypeEffect.AtkM, false, 802, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton d'enchevêtrement"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				42, WeaponType.BATON, "baton/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 672, true),
					new Effect(TypeEffect.AtkM, false, 880, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Bâton Magique en Argent Secret"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				42, WeaponType.BATON, "baton/10sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 758, true),
					new Effect(TypeEffect.AtkM, false, 809, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton à Lame de Cristal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				34, WeaponType.BATON, "baton/63bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 583, true),
					new Effect(TypeEffect.AtkM, false, 619, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de l'œil de Lumière"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				34, WeaponType.BATON, "baton/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 550, true),
					new Effect(TypeEffect.AtkM, false, 650, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton aux Gemmes Précieux"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				34, WeaponType.BATON, "baton/63bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 585, true),
					new Effect(TypeEffect.AtkM, false, 620, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Magique Supérieur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				26, WeaponType.BATON, "baton/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 425, true),
					new Effect(TypeEffect.AtkM, false, 451, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sceptre de Racine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				26, WeaponType.BATON, "baton/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 425, true),
					new Effect(TypeEffect.AtkM, false, 451, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton en Lune"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				26, WeaponType.BATON, "baton/30ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 380, true),
					new Effect(TypeEffect.AtkM, false, 490, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				18, WeaponType.BATON, "baton/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 270, true),
					new Effect(TypeEffect.AtkM, false, 315, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de Gemme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				18, WeaponType.BATON, "baton/14sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 283, true),
					new Effect(TypeEffect.AtkM, false, 301, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton du Sage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				18, WeaponType.BATON, "baton/63bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 256, true),
					new Effect(TypeEffect.AtkM, false, 330, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bâton de l'Ancien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				12, WeaponType.BATON, "baton/26blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 172, true),
					new Effect(TypeEffect.AtkM, false, 222, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canne de Bois Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, },
				6, WeaponType.BATON, "baton/10sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 100, true),
					new Effect(TypeEffect.AtkM, false, 133, true),
				}),
		};
	}
	
	static CustomWeapon[] getLame() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de crevasse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, WeaponType.LAME, "lame/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3415, true),
					new Effect(TypeEffect.AtkM, false, 2061, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame d'expulsion des âmes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, WeaponType.LAME, "lame/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3415, true),
					new Effect(TypeEffect.AtkM, false, 2061, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de la cité détruite"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				95, WeaponType.LAME, "lame/92sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3192, true),
					new Effect(TypeEffect.AtkM, false, 1927, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de décapitation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				95, WeaponType.LAME, "lame/icon3", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3192, true),
					new Effect(TypeEffect.AtkM, false, 1927, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffure Bestiale - Famine"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, WeaponType.LAME, "lame/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2972, true),
					new Effect(TypeEffect.AtkM, false, 1794, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de l'Épine d'Or"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				87, WeaponType.LAME, "lame/89bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2842, true),
					new Effect(TypeEffect.AtkM, false, 1716, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffure Bestiale - Absolu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				85, WeaponType.LAME, "lame/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2672, true),
					new Effect(TypeEffect.AtkM, false, 1614, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame d'attaque blanche"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				82, WeaponType.LAME, "lame/82blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2630, true),
					new Effect(TypeEffect.AtkM, false, 1463, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Foudre Mortelle - Isolation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, WeaponType.LAME, "lame/82blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2546, true),
					new Effect(TypeEffect.AtkM, false, 1537, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torpille"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				77, WeaponType.LAME, "lame/82blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2422, true),
					new Effect(TypeEffect.AtkM, false, 1462, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de Plume Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				75, WeaponType.LAME, "lame/85pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2340, true),
					new Effect(TypeEffect.AtkM, false, 1413, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Géant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				71, WeaponType.LAME, "lame/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2179, true),
					new Effect(TypeEffect.AtkM, false, 1316, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Assomoir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, WeaponType.LAME, "lame/82blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2140, true),
					new Effect(TypeEffect.AtkM, false, 1292, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame d'Apparat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				66, WeaponType.LAME, "lame/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1982, true),
					new Effect(TypeEffect.AtkM, false, 1196, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de la Roue de Feu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				65, WeaponType.LAME, "lame/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1944, true),
					new Effect(TypeEffect.AtkM, false, 1173, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de la Frappe d'Acier Rouge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				61, WeaponType.LAME, "lame/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1791, true),
					new Effect(TypeEffect.AtkM, false, 1081, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de Cristal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, WeaponType.LAME, "lame/32bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1752, true),
					new Effect(TypeEffect.AtkM, false, 1058, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Météorique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				60, WeaponType.LAME, "lame/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1760, true),
					new Effect(TypeEffect.AtkM, false, 1058, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Bombardier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				56, WeaponType.LAME, "lame/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1604, true),
					new Effect(TypeEffect.AtkM, false, 968, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de Variation"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				56, WeaponType.LAME, "lame/60bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1612, true),
					new Effect(TypeEffect.AtkM, false, 968, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Écrasante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				56, WeaponType.LAME, "lame/36sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1608, true),
					new Effect(TypeEffect.AtkM, false, 966, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de rune ancienne"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				48, WeaponType.LAME, "lame/56sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1319, true),
					new Effect(TypeEffect.AtkM, false, 796, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Protectrice"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				48, WeaponType.LAME, "lame/56sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1341, true),
					new Effect(TypeEffect.AtkM, false, 796, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Ancestrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				48, WeaponType.LAME, "lame/32bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1320, true),
					new Effect(TypeEffect.AtkM, false, 804, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame disciplinaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, WeaponType.LAME, "lame/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1050, true),
					new Effect(TypeEffect.AtkM, false, 634, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Refuge"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, WeaponType.LAME, "lame/32bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1056, true),
					new Effect(TypeEffect.AtkM, false, 634, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame du Péché"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				40, WeaponType.LAME, "lame/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1049, true),
					new Effect(TypeEffect.AtkM, false, 636, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame sauvage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				32, WeaponType.LAME, "lame/36sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 800, true),
					new Effect(TypeEffect.AtkM, false, 483, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de Pierre Originale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				32, WeaponType.LAME, "lame/36sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 808, true),
					new Effect(TypeEffect.AtkM, false, 483, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Colérique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				32, WeaponType.LAME, "lame/32vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 800, true),
					new Effect(TypeEffect.AtkM, false, 492, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame massive de métal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				24, WeaponType.LAME, "lame/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 572, true),
					new Effect(TypeEffect.AtkM, false, 345, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Ostéophyte"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				24, WeaponType.LAME, "lame/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 576, true),
					new Effect(TypeEffect.AtkM, false, 345, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Massive en Acier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				24, WeaponType.LAME, "lame/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 574, true),
					new Effect(TypeEffect.AtkM, false, 348, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grosse lame du Forgeron"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				16, WeaponType.LAME, "lame/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 370, true),
					new Effect(TypeEffect.AtkM, false, 223, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Excellente"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				16, WeaponType.LAME, "lame/26sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 381, true),
					new Effect(TypeEffect.AtkM, false, 223, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grosse lame"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				10, WeaponType.LAME, "lame/6bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 240, true),
					new Effect(TypeEffect.AtkM, false, 145, true),
				}),
		};
	}
	
	static CustomWeapon[] getCle() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clé de la dimension fragmentée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, WeaponType.CLE, "cle/96sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1743, true),
					new Effect(TypeEffect.AtkM, false, 747, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de l'honneur du Seigneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				100, WeaponType.CLE, "cle/96sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1743, true),
					new Effect(TypeEffect.AtkM, false, 747, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de l'éclaireur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				96, WeaponType.CLE, "cle/91sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1652, true),
					new Effect(TypeEffect.AtkM, false, 708, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de méthode magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				95, WeaponType.CLE, "cle/91sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1628, true),
					new Effect(TypeEffect.AtkM, false, 698, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du voile d'ombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				91, WeaponType.CLE, "cle/icon5", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1539, true),
					new Effect(TypeEffect.AtkM, false, 659, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef Astrale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, WeaponType.CLE, "cle/icon3", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1516, true),
					new Effect(TypeEffect.AtkM, false, 650, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du pionnier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				90, WeaponType.CLE, "cle/icon4", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1516, true),
					new Effect(TypeEffect.AtkM, false, 650, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef méca"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				86, WeaponType.CLE, "cle/icon3", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1429, true),
					new Effect(TypeEffect.AtkM, false, 612, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de givre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				85, WeaponType.CLE, "cle/76bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1407, true),
					new Effect(TypeEffect.AtkM, false, 603, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef aux ailes magiques"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				81, WeaponType.CLE, "cle/82bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1320, true),
					new Effect(TypeEffect.AtkM, false, 566, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef tranchante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				80, WeaponType.CLE, "cle/80gvg", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1299, true),
					new Effect(TypeEffect.AtkM, false, 557, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du bourreau"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				76, WeaponType.CLE, "cle/78bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1215, true),
					new Effect(TypeEffect.AtkM, false, 521, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef d'assassin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				75, WeaponType.CLE, "cle/78bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1194, true),
					new Effect(TypeEffect.AtkM, false, 512, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef d'Écaille de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				70, WeaponType.CLE, "cle/76bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1092, true),
					new Effect(TypeEffect.AtkM, false, 468, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du représentant de la loi"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				66, WeaponType.CLE, "cle/80gvg", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 1012, true),
					new Effect(TypeEffect.AtkM, false, 434, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du Blizzard"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				65, WeaponType.CLE, "cle/icon1", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 991, true),
					new Effect(TypeEffect.AtkM, false, 425, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef pointue"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				62, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 933, true),
					new Effect(TypeEffect.AtkM, false, 399, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef attrayante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				59, WeaponType.CLE, "cle/62bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 875, true),
					new Effect(TypeEffect.AtkM, false, 375, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du bouclier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				56, WeaponType.CLE, "cle/62bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 819, true),
					new Effect(TypeEffect.AtkM, false, 351, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef vide"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				52, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 745, true),
					new Effect(TypeEffect.AtkM, false, 319, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef sensible"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				51, WeaponType.CLE, "cle/icon0", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 727, true),
					new Effect(TypeEffect.AtkM, false, 311, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de fer sombre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				50, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 709, true),
					new Effect(TypeEffect.AtkM, false, 304, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef masquante"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				49, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 690, true),
					new Effect(TypeEffect.AtkM, false, 296, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef démesurée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				46, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 638, true),
					new Effect(TypeEffect.AtkM, false, 273, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de loi secrète"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				42, WeaponType.CLE, "cle/62bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 569, true),
					new Effect(TypeEffect.AtkM, false, 244, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de commande"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				41, WeaponType.CLE, "cle/62bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 553, true),
					new Effect(TypeEffect.AtkM, false, 237, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef d'alliage"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				36, WeaponType.CLE, "cle/38ora", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 471, true),
					new Effect(TypeEffect.AtkM, false, 201, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clé du pêcheur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				36, WeaponType.CLE, "cle/63pre", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 471, true),
					new Effect(TypeEffect.AtkM, false, 201, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du vieux système"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				31, WeaponType.CLE, "cle/39bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 393, true),
					new Effect(TypeEffect.AtkM, false, 168, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef silencieuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				28, WeaponType.CLE, "cle/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 349, true),
					new Effect(TypeEffect.AtkM, false, 149, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du Protecteur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				26, WeaponType.CLE, "cle/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 319, true),
					new Effect(TypeEffect.AtkM, false, 137, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef raffinée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				21, WeaponType.CLE, "cle/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 252, true),
					new Effect(TypeEffect.AtkM, false, 108, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de la cavalerie"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				20, WeaponType.CLE, "cle/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 238, true),
					new Effect(TypeEffect.AtkM, false, 102, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de fer blanc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				16, WeaponType.CLE, "cle/24sprite", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 189, true),
					new Effect(TypeEffect.AtkM, false, 81, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef de l'abri"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				12, WeaponType.CLE, "cle/6bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 143, true),
					new Effect(TypeEffect.AtkM, false, 61, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Clef du cadenas"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				7, WeaponType.CLE, "cle/6bleu", new Calculable[] {
					new Effect(TypeEffect.AtkD, false, 94, true),
					new Effect(TypeEffect.AtkM, false, 40, true),
				}),
		};
	}
	
	static CustomWeapon[] getBouclier() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Coquille Ultime"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				100, WeaponType.BOUCLIER, "bouclier/31reinca", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 705, true),
					new Effect(TypeEffect.DefM, false, 701, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Zombie Ailé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				100, WeaponType.BOUCLIER, "bouclier/54bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 705, true),
					new Effect(TypeEffect.DefM, false, 701, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Fer Dur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				95, WeaponType.BOUCLIER, "bouclier/31reinca", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 683, true),
					new Effect(TypeEffect.DefM, false, 676, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Infranchissable"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				95, WeaponType.BOUCLIER, "bouclier/38bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 683, true),
					new Effect(TypeEffect.DefM, false, 676, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Gardien du Rubis"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				90, WeaponType.BOUCLIER, "bouclier/86bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 661, true),
					new Effect(TypeEffect.DefM, false, 650, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Griffe de Loup"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				86, WeaponType.BOUCLIER, "bouclier/79ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 643, true),
					new Effect(TypeEffect.DefM, false, 631, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Gardien du Rubis"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				85, WeaponType.BOUCLIER, "bouclier/86bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 638, true),
					new Effect(TypeEffect.DefM, false, 626, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier d'Améthyste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				81, WeaponType.BOUCLIER, "bouclier/86bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 619, true),
					new Effect(TypeEffect.DefM, false, 605, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur du Sang Ailé - Extrême"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				80, WeaponType.BOUCLIER, "bouclier/84ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 615, true),
					new Effect(TypeEffect.DefM, false, 600, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Résistance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				76, WeaponType.BOUCLIER, "bouclier/84ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 596, true),
					new Effect(TypeEffect.DefM, false, 580, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rondache à Épines"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				75, WeaponType.BOUCLIER, "bouclier/80pre", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 591, true),
					new Effect(TypeEffect.DefM, false, 574, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier-Rasoir"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				71, WeaponType.BOUCLIER, "bouclier/80pre", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 572, true),
					new Effect(TypeEffect.DefM, false, 553, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Écu Clouté Lourd"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				70, WeaponType.BOUCLIER, "bouclier/70bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 567, true),
					new Effect(TypeEffect.DefM, false, 549, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pavois Écarlate"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				66, WeaponType.BOUCLIER, "bouclier/70bleu", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 548, true),
					new Effect(TypeEffect.DefM, false, 528, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lourd Bouclier du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				65, WeaponType.BOUCLIER, "bouclier/94ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 543, true),
					new Effect(TypeEffect.DefM, false, 522, true),
					new Effect(TypeEffect.Parade, false, 30),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Défense Céleste"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				61, WeaponType.BOUCLIER, "bouclier/94ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 523, true),
					new Effect(TypeEffect.DefM, false, 501, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier du Paladin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				60, WeaponType.BOUCLIER, "bouclier/28ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 518, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de l'Arbre du Monde"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				60, WeaponType.BOUCLIER, "bouclier/95pre", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 518, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Verre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				54, WeaponType.BOUCLIER, "bouclier/18ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 487, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Ecaille de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				54, WeaponType.BOUCLIER, "bouclier/31ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 487, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Cristal Chatoyant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				54, WeaponType.BOUCLIER, "bouclier/18ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 486, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Manteau des Armoiries de la Tour"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				46, WeaponType.BOUCLIER, "bouclier/26blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 444, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de l'Eclat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				46, WeaponType.BOUCLIER, "bouclier/28ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 444, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de l'Emblême Royal"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				46, WeaponType.BOUCLIER, "bouclier/26blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 445, true),
					new Effect(TypeEffect.Parade, false, 20),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Pavois Renforcé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				38, WeaponType.BOUCLIER, "bouclier/31reinca", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 400, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier du Chevalier Prétorien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				38, WeaponType.BOUCLIER, "bouclier/18ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 400, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier du Monstre Fantastique de la Forêt"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				38, WeaponType.BOUCLIER, "bouclier/31reinca", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 401, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de la Couronne Royale"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				30, WeaponType.BOUCLIER, "bouclier/28ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 352, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Doré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				30, WeaponType.BOUCLIER, "bouclier/31reinca", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 352, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier du Sacre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				30, WeaponType.BOUCLIER, "bouclier/28ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 354, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Bouclier de Protection"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				26, WeaponType.BOUCLIER, "bouclier/26blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 327, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				22, WeaponType.BOUCLIER, "bouclier/20blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 301, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Rond Raffiné"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				22, WeaponType.BOUCLIER, "bouclier/34sprite", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 301, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de Défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				22, WeaponType.BOUCLIER, "bouclier/20blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 305, true),
					new Effect(TypeEffect.Parade, false, 18),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Long Bouclier Plat"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				18, WeaponType.BOUCLIER, "bouclier/26blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 273, true),
					new Effect(TypeEffect.Parade, false, 16),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier à Croix"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				16, WeaponType.BOUCLIER, "bouclier/26blanc", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 259, true),
					new Effect(TypeEffect.Parade, false, 16),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Bouclier de Défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				16, WeaponType.BOUCLIER, "bouclier/31ora", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 259, true),
					new Effect(TypeEffect.Parade, false, 16),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Écu Ferré"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.CLERC, },
				10, WeaponType.BOUCLIER, "bouclier/6sprite", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 212, true),
					new Effect(TypeEffect.Parade, false, 16),
				}),
		};
	}
}
