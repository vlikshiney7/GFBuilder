package fr.vlik.grandfantasia.loader;

import java.util.ArrayList;
import java.util.HashMap;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipable.RedWeapon;
import fr.vlik.grandfantasia.equipable.Weapon;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderWeapon {
	
	static Weapon[] getEp1M() {
		return new Weapon[] {
			new RedWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Serment du Chevalier"); put(Language.EN, "Trial Knight's Oath"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, Quality.RED, false, WeaponType.EPEE1M, true, false, "epee1M/90red", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3406, true),
					new Effect(TypeEffect.FCE, false, 154, true),
					new Effect(TypeEffect.VIT, false, 54, true),
					new Effect(TypeEffect.AGI, false, 64, true),
					new Effect(TypeEffect.Toucher, false, 20),
				}, null,
				new ArrayList<ArrayList<Calculable>>() {{
					add(new ArrayList<Calculable>() {{
						add(new Effect(TypeEffect.FCE, false, 10));
					}});
					add(new ArrayList<Calculable>() {{
						add(new Effect(TypeEffect.FCE, true, 1));
					}});
					add(new ArrayList<Calculable>() {{
						add(new Effect(TypeEffect.PV, true, 5));
						add(new Effect(TypeEffect.PM, true, 5));
					}});
					add(new ArrayList<Calculable>() {{
						add(new Effect(TypeEffect.VitAtk, false, 5));
					}});
					add(new ArrayList<Calculable>() {{
						add(new Effect(TypeEffect.DegP, false, 3));
					}});
				}}),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Croc de brisé de serpent féérique noir"); put(Language.EN, "Serpentine Shadowfang"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/100vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3558, true),
					new Effect(TypeEffect.FCE, false, 155, true),
					new Effect(TypeEffect.VIT, false, 71, true),
					new Effect(TypeEffect.AGI, false, 49, true),
					new Effect(TypeEffect.Toucher, false, 20),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Jugement Éternel"); put(Language.EN, "Judgment Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/95vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3325, true),
					new Effect(TypeEffect.FCE, false, 143, true),
					new Effect(TypeEffect.VIT, false, 50, true),
					new Effect(TypeEffect.AGI, false, 59, true),
					new Effect(TypeEffect.Toucher, false, 20),
				},  null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée du Roi Tenrô"); put(Language.EN, "King Lionheart"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/90vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3096, true),
					new Effect(TypeEffect.FCE, false, 128, true),
					new Effect(TypeEffect.VIT, false, 45, true),
					new Effect(TypeEffect.AGI, false, 54, true),
					new Effect(TypeEffect.Toucher, false, 20),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée de Cendre d'Amaterasu"); put(Language.EN, "Dragon's Mark Flame"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/85vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2872, true),
					new Effect(TypeEffect.FCE, false, 119, true),
					new Effect(TypeEffect.VIT, false, 43, true),
					new Effect(TypeEffect.AGI, false, 52, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée Ikazuchi Jumeaux"); put(Language.EN, "Electric Gnash"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/80vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2653, true),
					new Effect(TypeEffect.FCE, false, 95, true),
					new Effect(TypeEffect.VIT, false, 34, true),
					new Effect(TypeEffect.AGI, false, 41, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Rapière d'Empereur Déchu"); put(Language.EN, "Emperor's Sword of Northern Light"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				75, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/75vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2438, true),
					new Effect(TypeEffect.FCE, false, 80, true),
					new Effect(TypeEffect.VIT, false, 30, true),
					new Effect(TypeEffect.AGI, false, 50, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame des Limbes Profondes"); put(Language.EN, "Galactic Sword of Destruction"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/70vio", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2229, true),
					new Effect(TypeEffect.FCE, false, 75, true),
					new Effect(TypeEffect.VIT, false, 27, true),
					new Effect(TypeEffect.AGI, false, 48, true),
					new Effect(TypeEffect.Toucher, false, 18),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Croc de Chauve-souris"); put(Language.EN, "Murderous Slasher"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/100gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 3202, true),
					new Effect(TypeEffect.FCE, false, 145, true),
					new Effect(TypeEffect.VIT, false, 64, true),
					new Effect(TypeEffect.AGI, false, 43, true),
					new Effect(TypeEffect.RegenCB, false, 25),
					new Proc(20, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD, 25),
						new Effect(TypeEffect.VitAtk, false, 25),
						new Effect(TypeEffect.ESQ, false, 25),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée buster de Zack"); put(Language.EN, "Holy Avenger"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/95gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2992, true),
					new Effect(TypeEffect.FCE, false, 121, true),
					new Effect(TypeEffect.VIT, false, 59, true),
					new Effect(TypeEffect.AGI, false, 48, true),
					new Effect(TypeEffect.VitAtk, false, 18),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD, 25),
						new Effect(TypeEffect.ESQ, false, 15),
						new Effect(TypeEffect.TCCP, false, 15),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Équarrisseur de Zodd Nosferatu"); put(Language.EN, "Soul: Cut"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/90gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2786, true),
					new Effect(TypeEffect.FCE, false, 110, true),
					new Effect(TypeEffect.VIT, false, 44, true),
					new Effect(TypeEffect.AGI, false, 48, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new StaticEffect(TypeStaticEffect.x2Skill, 20),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 1000),
						new Effect(TypeEffect.DCCP, false, 30),
						new Effect(TypeEffect.DefP, true, -10),
						new Effect(TypeEffect.DefM, true, -10),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Zanpakuto Enflammé du Dragon"); put(Language.EN, "Dragonbane Dark Rock"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/85gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2585, true),
					new Effect(TypeEffect.FCE, false, 99, true),
					new Effect(TypeEffect.VIT, false, 45, true),
					new Effect(TypeEffect.AGI, false, 50, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new StaticEffect(TypeStaticEffect.x2Skill, 25),
					new Proc(10, Activation.Attack, 5, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 10),
						new Effect(TypeEffect.DefP, false, -100, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Vierge Immaculée"); put(Language.EN, "Absolute Tyrant - Ice Lord"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/80gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2387, true),
					new Effect(TypeEffect.FCE, false, 67, true),
					new Effect(TypeEffect.VIT, false, 27, true),
					new Effect(TypeEffect.AGI, false, 42, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new Effect(TypeEffect.FCE, false, 50),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcT0L80Q5),
						new Effect(TypeEffect.VOL, false, -180, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Royale de la Providence"); put(Language.EN, "Royal Sword - Holy Salvation"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				75, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/75gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2194, true),
					new Effect(TypeEffect.FCE, false, 64, true),
					new Effect(TypeEffect.VIT, false, 24, true),
					new Effect(TypeEffect.AGI, false, 40, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new Proc(5, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Empereur Déchu"); put(Language.EN, "Fallen Emperor - Dark Night"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/70gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2005, true),
					new Effect(TypeEffect.FCE, false, 60, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.AGI, false, 38, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new Effect(TypeEffect.RegenCB, false, 30),
					new Effect(TypeEffect.CostComp, false, -45),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Justice de l'Empereur"); put(Language.EN, "Grandleon"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				65, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/95gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1822, true),
					new Effect(TypeEffect.FCE, false, 55, true),
					new Effect(TypeEffect.VIT, false, 17, true),
					new Effect(TypeEffect.AGI, false, 40, true),
					new Effect(TypeEffect.Toucher, false, 18),
					new Proc(15, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de l'Eternité de Bodor"); put(Language.EN, "Bodor's Sword of Eternity"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/60gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1643, true),
					new Effect(TypeEffect.FCE, false, 34, true),
					new Effect(TypeEffect.VIT, false, 14, true),
					new Effect(TypeEffect.AGI, false, 48, true),
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x3Skill, 20),
					new Proc(10, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegPNature, false, 716),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Éclair Ultime"); put(Language.EN, "Ultimate Lightning"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				50, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/50gold", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1303, true),
					new Effect(TypeEffect.FCE, false, 26, true),
					new Effect(TypeEffect.VIT, false, 10, true),
					new Effect(TypeEffect.AGI, false, 36, true),
					new Effect(TypeEffect.Toucher, false, 8),
					new Effect(TypeEffect.Foudre, false, 15),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sacrelame victorieuse de Bodor"); put(Language.EN, "Bodor's Victorious Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/100pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2830, true),
					new Effect(TypeEffect.FCE, false, 38, true),
					new Effect(TypeEffect.VIT, false, 28, true),
					new Effect(TypeEffect.AGI, false, 30, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.DCCP, false, 10),
					new Effect(TypeEffect.Sacre, false, 25),
					new Effect(TypeEffect.Ombre, false, 25),
					new Effect(TypeEffect.Foudre, false, 25),
					new Effect(TypeEffect.Feu, false, 25),
					new Effect(TypeEffect.Glace, false, 25),
					new Effect(TypeEffect.Nature, false, 25),
					new Proc(100, Activation.Attack, 2, 10, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 1),
						new Effect(TypeEffect.Toucher, false, 1),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Croc de Vipère"); put(Language.EN, "Viper Fang Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				99, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/99pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2457, true),
					new Effect(TypeEffect.FCE, false, 95, true),
					new Effect(TypeEffect.VIT, false, 46, true),
					new Effect(TypeEffect.AGI, false, 27, true),
					new Effect(TypeEffect.RegenCB, false, 15),
					new Proc(10, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
						new Effect(TypeEffect.ESQ, false, 20),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Berimaru Ardente de Bodor"); put(Language.EN, "Bodor - Blazing Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/95pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2327, true),
					new Effect(TypeEffect.FCE, false, 32, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.AGI, false, 24, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.DCCP, false, 10),
					new Effect(TypeEffect.Nature, false, 40),
					new Proc(100, Activation.Attack, 2, 10, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 1),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Féroce Mystique"); put(Language.EN, "Mystical Fiery Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				94, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2295, true),
					new Effect(TypeEffect.FCE, false, 81, true),
					new Effect(TypeEffect.VIT, false, 26, true),
					new Effect(TypeEffect.AGI, false, 23, true),
					new Effect(TypeEffect.VitAtk, false, 10),
					new Proc(10, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 10),
						new Effect(TypeEffect.TCCP, false, 10),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Divine - Aile en Or"); put(Language.EN, "Divine Blade - Golden Wing"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				89, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/89pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2136, true),
					new Effect(TypeEffect.FCE, false, 72, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.AGI, false, 26, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.ESQ, false, 8),
					new Proc(10, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DegEp, false, 25),
						new Effect(TypeEffect.VitAtk, false, 10),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Glaciale d'Hitsugaya"); put(Language.EN, "Bodor - Icefrost Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/85pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2010, true),
					new Effect(TypeEffect.FCE, false, 28, true),
					new Effect(TypeEffect.VIT, false, 18, true),
					new Effect(TypeEffect.AGI, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.DCCP, false, 10),
					new Effect(TypeEffect.Nature, false, 40),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lave du Volcan du Dragon"); put(Language.EN, "Dragonblade Lava"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				84, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1980, true),
					new Effect(TypeEffect.FCE, false, 72, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.AGI, false, 24, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new StaticEffect(TypeStaticEffect.x2Skill, 25),
					new Proc(10, Activation.Attack, 5, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 10),
						new Effect(TypeEffect.DefP, false, -100, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Invincible Tyrannie"); put(Language.EN, "Unbeatable Tyrant - Icebound"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				79, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1827, true),
					new Effect(TypeEffect.FCE, false, 18, true),
					new Effect(TypeEffect.VIT, false, 18, true),
					new Effect(TypeEffect.AGI, false, 24, true),
					new Effect(TypeEffect.Toucher, false, 14),
					new Effect(TypeEffect.FCE, false, 50),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcT0L80Q5),
						new Effect(TypeEffect.VOL, false, -180, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de l'Empereur"); put(Language.EN, "Emperor's Sword - Ruthless Sanction"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				74, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/74pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1677, true),
					new Effect(TypeEffect.FCE, false, 17, true),
					new Effect(TypeEffect.VIT, false, 17, true),
					new Effect(TypeEffect.AGI, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Proc(5, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre en Écailles de Dragon Rouge"); put(Language.EN, "Bodor's Lunatic Blade"); }},
				new GradeName[] { GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				68, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/68ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1502, true),
					new Effect(TypeEffect.FCE, false, 10, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.AGI, false, 18, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.TCCP, false, 7),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive à Lame Cruelle"); put(Language.EN, "Fallen Emperor - Merciless"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/66pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1446, true),
					new Effect(TypeEffect.FCE, false, 20, true),
					new Effect(TypeEffect.VIT, false, 18, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.RegenCB, false, 30),
					new Effect(TypeEffect.CostComp, false, -45),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Conquérante du Chevalier Noir"); put(Language.EN, "Black Knight's Crusade Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				65, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/65ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1417, true),
					new Effect(TypeEffect.FCE, false, 20, true),
					new Effect(TypeEffect.VIT, false, 10, true),
					new Effect(TypeEffect.AGI, false, 12, true),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.TCCP, false, 6),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Vérité de l'Empereur"); put(Language.EN, "Emperor's Sword of Truth"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				63, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/63pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1361, true),
					new Effect(TypeEffect.FCE, false, 20, true),
					new Effect(TypeEffect.VIT, false, 12, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 10),
					new Proc(15, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Marquis Bodor (Reforgée)"); put(Language.EN, "(Reforged) Bodor's Marquis Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.ORANGE, false, WeaponType.EPEE1M, true, true, "epee1M/60pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1409, true),
					new Effect(TypeEffect.FCE, false, 14, true),
					new Effect(TypeEffect.VIT, false, 22, true),
					new Effect(TypeEffect.Toucher, false, 9),
					new Effect(TypeEffect.TCCP, false, 5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Marquis Bodor"); put(Language.EN, "Bodor's Marquis Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/60pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1280, true),
					new Effect(TypeEffect.FCE, false, 13, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 8),
					new Effect(TypeEffect.TCCP, false, 5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Légendaire, Le Roi Immuable"); put(Language.EN, "Legendary Sword - Immovable King"); }},
				new GradeName[] { GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				58, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/58ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
					new Effect(TypeEffect.FCE, false, 20, true),
					new Effect(TypeEffect.VIT, false, 9, true),
					new Effect(TypeEffect.AGI, false, 4, true),
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.TCCP, false, 3.5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Coeur de Lion"); put(Language.EN, "Lionheart Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				58, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/65ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1224, true),
					new Effect(TypeEffect.FCE, false, 13, true),
					new Effect(TypeEffect.VIT, false, 7, true),
					new Effect(TypeEffect.AGI, false, 13, true),
					new Effect(TypeEffect.Toucher, false, 8),
					new StaticEffect(TypeStaticEffect.x2Skill, 20),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Promesses de Bodor"); put(Language.EN, "Bodor's Sword of Promises"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				58, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/58pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1256, true),
					new Effect(TypeEffect.FCE, false, 11, true),
					new Effect(TypeEffect.VIT, false, 17, true),
					new Effect(TypeEffect.Toucher, false, 8),
					new StaticEffect(TypeStaticEffect.x3Skill, 20),
					new Proc(10, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegPNature, false, 541),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Ecaille de Dragon Vert"); put(Language.EN, "Green Dragonscale Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				48, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 962, true),
					new Effect(TypeEffect.FCE, false, 9, true),
					new Effect(TypeEffect.VIT, false, 9, true),
					new Effect(TypeEffect.AGI, false, 9, true),
					new Effect(TypeEffect.Toucher, false, 6),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
					new Proc(30, Activation.Attack, 20, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcT0L48Q4),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lumière Dorée"); put(Language.EN, "Golden Lightning"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				48, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/48pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 969, true),
					new Effect(TypeEffect.VIT, false, 10, true),
					new Effect(TypeEffect.AGI, false, 13, true),
					new Effect(TypeEffect.Toucher, false, 6),
					new Effect(TypeEffect.Foudre, false, 15),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Spectrale; Flamme du Dragon de Glace"); put(Language.EN, "Phantom Sword - Ice Dragon Flame"); }},
				new GradeName[] { GradeName.ASSASSIN, },
				48, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/48ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 970, true),
					new Effect(TypeEffect.FCE, false, 18, true),
					new Effect(TypeEffect.AGI, false, 9, true),
					new Effect(TypeEffect.Toucher, false, 8),
					new Effect(TypeEffect.TCCP, false, 3),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier Bodor (Reforgé)"); put(Language.EN, "(Reforged) Bodor's Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				45, Quality.ORANGE, false, WeaponType.EPEE1M, true, true, "epee1M/45pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 985, true),
					new Effect(TypeEffect.FCE, false, 10, true),
					new Effect(TypeEffect.VIT, false, 13, true),
					new Effect(TypeEffect.Toucher, false, 7),
					new Effect(TypeEffect.TCCP, false, 3),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier Bodor"); put(Language.EN, "Bodor's Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				45, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/45pvp", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 895, true),
					new Effect(TypeEffect.FCE, false, 9, true),
					new Effect(TypeEffect.VIT, false, 12, true),
					new Effect(TypeEffect.Toucher, false, 6),
					new Effect(TypeEffect.TCCP, false, 3),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epine de Rose Sanglante"); put(Language.EN, "Bloody Rose"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				38, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/38ora2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 720, true),
					new Effect(TypeEffect.FCE, false, 6, true),
					new Effect(TypeEffect.VIT, false, 5, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 4),
					new Effect(TypeEffect.RegenCB, false, 5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier de la Forteresse"); put(Language.EN, "Fortress Defender"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				38, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/38ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 728, true),
					new Effect(TypeEffect.VIT, false, 11, true),
					new Effect(TypeEffect.AGI, false, 7, true),
					new Effect(TypeEffect.Toucher, false, 4),
					new Effect(TypeEffect.MEN, false, 15),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Rage d'Akuma"); put(Language.EN, "Nightmare's Wrath"); }},
				new GradeName[] { GradeName.ASSASSIN, },
				38, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 740, true),
					new Effect(TypeEffect.FCE, false, 14, true),
					new Effect(TypeEffect.AGI, false, 7, true),
					new Effect(TypeEffect.Toucher, false, 6),
					new Effect(TypeEffect.TCCP, false, 2.5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine Enflammée"); put(Language.EN, "Flaming Fang"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/94pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 498, true),
					new Effect(TypeEffect.FCE, false, 7, true),
					new Effect(TypeEffect.VIT, false, 5, true),
					new Effect(TypeEffect.AGI, false, 3, true),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
					new Effect(TypeEffect.DegPFeu, false, 294),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de l'Onde Verte"); put(Language.EN, "Green Wave Blade"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				28, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/28ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 510, true),
					new Effect(TypeEffect.FCE, false, 3, true),
					new Effect(TypeEffect.VIT, false, 2, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 4),
					new Effect(TypeEffect.TCCP, false, 2),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Aube"); put(Language.EN, "Sword of Dawn"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				18, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 305, true),
					new Effect(TypeEffect.FCE, false, 3, true),
					new Effect(TypeEffect.VIT, false, 3, true),
					new Effect(TypeEffect.AGI, false, 3, true),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Mortelle Diabolique"); put(Language.EN, "Evil-Slaying Sword"); }},
				new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
				18, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/18ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 315, true),
					new Effect(TypeEffect.VIT, false, 3, true),
					new Effect(TypeEffect.AGI, false, 6, true),
					new Effect(TypeEffect.Toucher, false, 2),
					new Effect(TypeEffect.TCCP, false, 1.5),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Bleue enflammée"); put(Language.EN, "Burning Cobalt Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2333, true),
					new Effect(TypeEffect.FCE, false, 36, true),
					new Effect(TypeEffect.AGI, false, 36, true),
					new Effect(TypeEffect.Toucher, false, 15),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Assaut Inébranlable"); put(Language.EN, "Breakthrough Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2157, true),
					new Effect(TypeEffect.FCE, false, 34, true),
					new Effect(TypeEffect.AGI, false, 34, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sombre Sournoiserie"); put(Language.EN, "Shadowheart Stinger"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, Quality.BLUE, false, WeaponType.EPEE1M, true, false, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2122, true),
					new Effect(TypeEffect.FCE, false, 44, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 10),
					new Proc(10, Activation.Attack, 4.5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Double Lame du Levant"); put(Language.EN, "Sunset Double Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				76, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1984, true),
					new Effect(TypeEffect.FCE, false, 32, true),
					new Effect(TypeEffect.AGI, false, 32, true),
					new Effect(TypeEffect.Toucher, false, 14),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Sabre Elsaien"); put(Language.EN, "Sword of Monster Bone"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				72, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1850, true),
					new Effect(TypeEffect.FCE, false, 30, true),
					new Effect(TypeEffect.AGI, false, 30, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame d'Acier Noir"); put(Language.EN, "Silent Headhunter"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, Quality.BLUE, false, WeaponType.EPEE1M, true, false, "epee1M/70gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1782, true),
					new Effect(TypeEffect.FCE, false, 40, true),
					new Effect(TypeEffect.VIT, false, 16, true),
					new Effect(TypeEffect.Toucher, false, 10),
					new Proc(10, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Rituelle de Décapitation"); put(Language.EN, "Beheading Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1653, true),
					new Effect(TypeEffect.FCE, false, 28, true),
					new Effect(TypeEffect.AGI, false, 28, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée en Os de Dragon Originel"); put(Language.EN, "Original Dragonbone Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				63, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1555, true),
					new Effect(TypeEffect.FCE, false, 32, true),
					new Effect(TypeEffect.VIT, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague Violette Sauvage"); put(Language.EN, "Wild Purple Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				61, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/34sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1493, true),
					new Effect(TypeEffect.VIT, false, 30, true),
					new Effect(TypeEffect.AGI, false, 22, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Sanglante Vengeance Douloureuse"); put(Language.EN, "Blood Blade - Pain of Vengeance"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/58pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1461, true),
					new Effect(TypeEffect.AGI, false, 33, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Royale Coeur de Lion"); put(Language.EN, "Lionheart - Sword of Kings"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				58, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/58bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1398, true),
					new Effect(TypeEffect.FCE, false, 29, true),
					new Effect(TypeEffect.AGI, false, 15, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Cristal Céleste"); put(Language.EN, "Heavenly Crystal Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/48ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1216, true),
					new Effect(TypeEffect.FCE, false, 21, true),
					new Effect(TypeEffect.AGI, false, 15, true),
					new Effect(TypeEffect.Toucher, false, 8),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dieu de la Guerre au Visage Vert"); put(Language.EN, "Green-Faced God of War"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 986, true),
					new Effect(TypeEffect.VIT, false, 13, true),
					new Effect(TypeEffect.AGI, false, 15, true),
					new Effect(TypeEffect.Toucher, false, 6),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpe Rouge Flamme"); put(Language.EN, "Red Flame Cutting"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 770, true),
					new Effect(TypeEffect.FCE, false, 21, true),
					new Effect(TypeEffect.Toucher, false, 6),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Champion réincarné"); put(Language.EN, "Reincarnated Champion's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				31, Quality.BLUE, false, WeaponType.EPEE1M, false, true, "epee1M/31rein", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 618, true),
					new Effect(TypeEffect.FCE, false, 12, true),
					new Effect(TypeEffect.AGI, false, 8, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Gobelin"); put(Language.EN, "Goblin Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 570, true),
					new Effect(TypeEffect.FCE, false, 15, true),
					new Effect(TypeEffect.AGI, false, 5, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Brave de Siwa"); put(Language.EN, "Brave Sword of Siwa Village"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
				6, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/31rein", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 203, true),
					new Effect(TypeEffect.AGI, false, 2, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Toxique de Sprite"); put(Language.EN, "Sprite's Poisoned Shortsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				96, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/38ora2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 2023, true),
					new Effect(TypeEffect.FCE, false, 28, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Brûlante de Sprite"); put(Language.EN, "Sprite's Burning Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				91, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1885, true),
					new Effect(TypeEffect.FCE, false, 26, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Gelée des Sprites"); put(Language.EN, "Sprite's Frost Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/84pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1750, true),
					new Effect(TypeEffect.AGI, false, 24, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Glace Brûlante de Sprite"); put(Language.EN, "Sprite's Flaming Ice Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1618, true),
					new Effect(TypeEffect.AGI, false, 22, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Tribu Engloutie"); put(Language.EN, "Sunken Lost Tribe"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				76, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/66pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1488, true),
					new Effect(TypeEffect.AGI, false, 20, true),
					new Effect(TypeEffect.Toucher, false, 12),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Pourpre des Sprites"); put(Language.EN, "Sprite Purple Edge Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				71, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/65ora", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1362, true),
					new Effect(TypeEffect.AGI, false, 18, true),
					new Effect(TypeEffect.Toucher, false, 10),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Pierre de Cristal Sanglante des Sprites"); put(Language.EN, "Sprite's Blood Crystal Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				61, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/38ora2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1120, true),
					new Effect(TypeEffect.VIT, false, 14, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Sprites du Trône"); put(Language.EN, "Sprite's Sword of Thrones"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				54, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 958, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 4),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Familiale du Noble"); put(Language.EN, "Noble's Heirloom Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				48, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 824, true),
					new Effect(TypeEffect.AGI, false, 10, true),
					new Effect(TypeEffect.Toucher, false, 4),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Sprites du Seigneur de Guerre"); put(Language.EN, "Sprite's Warlord Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 739, true),
					new Effect(TypeEffect.AGI, false, 8, true),
					new Effect(TypeEffect.Toucher, false, 2),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue Épée des Ruines à Os Blanc"); put(Language.EN, "Whitebone Relic Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				40, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 656, true),
					new Effect(TypeEffect.VIT, false, 8, true),
					new Effect(TypeEffect.Toucher, false, 2),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Petit Couteau des Sprites de Destruction"); put(Language.EN, "Sprite's Destruction Dagger"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				34, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/34sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 539, true),
					new Effect(TypeEffect.AGI, false, 6, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Métallique des Sprites"); put(Language.EN, "Sprite's Metal Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				24, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 358, true),
					new Effect(TypeEffect.AGI, false, 4, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive Runique des Sprites"); put(Language.EN, "Sprite's Well-Made Iron Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				14, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/31rein", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 203, true),
					new Effect(TypeEffect.AGI, false, 2, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive des Sprites"); put(Language.EN, "Sprite's Iron Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				8, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/8sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 127, true),
					new Effect(TypeEffect.AGI, false, 2, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Prémices du Voyage de Muha"); put(Language.EN, "Muha's Horizon-Chaser Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				6, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/6vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 106, true),
					new Effect(TypeEffect.FCE, false, 2, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, "Victory Short Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, "Frost Twin Blades"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torturée"); put(Language.EN, "Darklock Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Machette Ciselée"); put(Language.EN, "Northern Bandit's Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Ofanim"); put(Language.EN, "Sword of Thrones"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				50, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 724, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Crapule Courageuse"); put(Language.EN, "Brigand's Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				40, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/40blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 547, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de la Destruction"); put(Language.EN, "Destruction Dagger"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				30, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/30blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 386, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Éminente Épée du Chevalier"); put(Language.EN, "High Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				24, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Métal"); put(Language.EN, "Metal Blade"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 244, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier"); put(Language.EN, "Knight Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				16, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée du Gardien"); put(Language.EN, "Guardian Longsword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				12, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 147, true),
				}, null ),
			new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Fer Raffinée"); put(Language.EN, "Well-Made Iron Sword"); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				10, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 125, true),
				}, null ),
		};
	}
	
	static Weapon[] getMa1M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getHa1M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getEp2M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getMa2M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getHa2M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getMeca1M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getMeca2M() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getArc() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getGun() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getCanon() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getRel() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getBaton() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getLame() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getCle() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getBouclier() {
		return new Weapon[] {
			
		};
	}
	
	static Weapon[] getDefault() {
		return new Weapon[] {
			
		};
	}
}
