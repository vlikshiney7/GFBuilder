package fr.vlik.grandfantasia;

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
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.Proc.Activation;

@SuppressWarnings("serial")
public class Loader {

	public static Reinca[] getReinca() {
		return new Reinca[] {
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, 1, 1, 100, 0, "none"),
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Niveau 1 - Éval 1"); put(Language.EN, "Level 1 - Eval 1"); }}, 1.045, 1, 65, 1, "lvl1"),
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Niveau 1 - Éval 2"); put(Language.EN, "Level 1 - Eval 2"); }}, 1.08, 66, 85, 1, "lvl1"),
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Niveau 1 - Éval 3"); put(Language.EN, "Level 1 - Eval 3"); }}, 1.12, 86, 90, 1, "lvl1"),
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Niveau 1 - Éval 4"); put(Language.EN, "Level 1 - Eval 4"); }}, 1.16, 91, 99, 1, "lvl1"),
				new Reinca(new HashMap<Language, String>() {{ put(Language.FR, "Niveau 1 - Éval 5"); put(Language.EN, "Level 1 - Eval 5"); }}, 1.2, 100, 100, 1, "lvl1")
		};
	}
	
	public static Weapon[][] getWeapon() {
		return new Weapon[][] {
			new Weapon[] {
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Croc de brisé de serpent féérique noir"); put(Language.EN, "Serpentine Shadowfang"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							100, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/100vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3558, true));
								add(new Effect(TypeEffect.FCE, false, 155, true));
								add(new Effect(TypeEffect.VIT, false, 71, true));
								add(new Effect(TypeEffect.AGI, false, 49, true));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Croc de Chauve-souris"); put(Language.EN, "Murderous Slasher"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							100, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/100gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3202, true));
								add(new Effect(TypeEffect.FCE, false, 145, true));
								add(new Effect(TypeEffect.VIT, false, 64, true));
								add(new Effect(TypeEffect.AGI, false, 43, true));
								add(new Effect(TypeEffect.RegenCB, false, 25));
								add(new Proc(20, Activation.Attack, 5, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.x2STD, 25));
									add(new Effect(TypeEffect.VitAtk, false, 25));
									add(new Effect(TypeEffect.ESQ, false, 25));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sacrelame victorieuse de Bodor"); put(Language.EN, "Bodor's Victorious Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							100, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/100pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2830));
								add(new Effect(TypeEffect.FCE, false, 38));
								add(new Effect(TypeEffect.VIT, false, 28));
								add(new Effect(TypeEffect.AGI, false, 30));
								add(new Effect(TypeEffect.Toucher, false, 12, false));
								add(new Effect(TypeEffect.TCCP, false, 8, false));
								add(new Effect(TypeEffect.DCCP, false, 10, false));
								add(new Effect(TypeEffect.Sacre, false, 25, false));
								add(new Effect(TypeEffect.Ombre, false, 25, false));
								add(new Effect(TypeEffect.Foudre, false, 25, false));
								add(new Effect(TypeEffect.Feu, false, 25, false));
								add(new Effect(TypeEffect.Glace, false, 25, false));
								add(new Effect(TypeEffect.Nature, false, 25, false));
								add(new Proc(100, Activation.Attack, 2, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.Depla, false, 1));
									add(new Effect(TypeEffect.Toucher, false, 1));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Croc de Vipère"); put(Language.EN, "Viper Fang Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							99, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/99pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2457));
								add(new Effect(TypeEffect.FCE, false, 95));
								add(new Effect(TypeEffect.VIT, false, 46));
								add(new Effect(TypeEffect.AGI, false, 27));
								add(new Effect(TypeEffect.RegenCB, false, 15));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.VitAtk, false, 20));
									add(new Effect(TypeEffect.ESQ, false, 20));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Toxique de Sprite"); put(Language.EN, "Sprite's Poisoned Shortsword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							96, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/38ora2", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2023));
								add(new Effect(TypeEffect.FCE, false, 28));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Jugement Éternel"); put(Language.EN, "Judgment Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/95vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3325));
								add(new Effect(TypeEffect.FCE, false, 143));
								add(new Effect(TypeEffect.VIT, false, 50));
								add(new Effect(TypeEffect.AGI, false, 59));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée buster de Zack"); put(Language.EN, "Holy Avenger"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/95gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2992));
								add(new Effect(TypeEffect.FCE, false, 121));
								add(new Effect(TypeEffect.VIT, false, 59));
								add(new Effect(TypeEffect.AGI, false, 48));
								add(new Effect(TypeEffect.VitAtk, false, 18));
								add(new Proc(20, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.x2STD, 25));
									add(new Effect(TypeEffect.ESQ, false, 15));
									add(new Effect(TypeEffect.TCCP, false, 15));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Berimaru Ardente de Bodor"); put(Language.EN, "Bodor - Blazing Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/95pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2327));
								add(new Effect(TypeEffect.FCE, false, 32));
								add(new Effect(TypeEffect.VIT, false, 22));
								add(new Effect(TypeEffect.AGI, false, 24));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 8));
								add(new Effect(TypeEffect.DCCP, false, 10));
								add(new Effect(TypeEffect.Nature, false, 40));
								add(new Proc(100, Activation.Attack, 2, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.Depla, false, 1));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, "Victory Short Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/95blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1662));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Féroce Mystique"); put(Language.EN, "Mystical Fiery Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							94, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/94pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2295));
								add(new Effect(TypeEffect.FCE, false, 81));
								add(new Effect(TypeEffect.VIT, false, 26));
								add(new Effect(TypeEffect.AGI, false, 23));
								add(new Effect(TypeEffect.VitAtk, false, 10));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.ESQ, false, 10));
									add(new Effect(TypeEffect.TCCP, false, 10));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Brûlante de Sprite"); put(Language.EN, "Sprite's Burning Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							91, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1885));
								add(new Effect(TypeEffect.FCE, false, 26));
							}}, new ArrayList<Effect>() ),
					new RedWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Serment du Chevalier"); put(Language.EN, "Trial Knight's Oath"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							90, Quality.RED, false, WeaponType.EPEE1M, true, false, "epee1M/90red", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3406));
								add(new Effect(TypeEffect.FCE, false, 154));
								add(new Effect(TypeEffect.VIT, false, 54));
								add(new Effect(TypeEffect.AGI, false, 64));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}},
							new ArrayList<Effect>(),
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
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée du Roi Tenrô"); put(Language.EN, "King Lionheart"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							90, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/90vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3096));
								add(new Effect(TypeEffect.FCE, false, 128));
								add(new Effect(TypeEffect.VIT, false, 45));
								add(new Effect(TypeEffect.AGI, false, 54));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Équarrisseur de Zodd Nosferatu"); put(Language.EN, "Soul: Cut"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							90, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/90gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2786));
								add(new Effect(TypeEffect.FCE, false, 110));
								add(new Effect(TypeEffect.VIT, false, 44));
								add(new Effect(TypeEffect.AGI, false, 48));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 20));
								add(new Proc(15, Activation.Attack, 5, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.DegOmbre, false, 1000));
									add(new Effect(TypeEffect.DCCP, false, 30));
									add(new Effect(TypeEffect.DefP, true, -10));
									add(new Effect(TypeEffect.DefM, true, -10));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Divine - Aile en Or"); put(Language.EN, "Divine Blade - Golden Wing"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							89, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/89pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2136));
								add(new Effect(TypeEffect.FCE, false, 72));
								add(new Effect(TypeEffect.VIT, false, 22));
								add(new Effect(TypeEffect.AGI, false, 26));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.ESQ, false, 8));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.DegEp, false, 25));
									add(new Effect(TypeEffect.VitAtk, false, 10));
								}}));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Bleue enflammée"); put(Language.EN, "Burning Cobalt Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							86, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/86bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2333));
								add(new Effect(TypeEffect.FCE, false, 36));
								add(new Effect(TypeEffect.AGI, false, 36));
								add(new Effect(TypeEffect.Toucher, false, 15));
							}}, new ArrayList<Effect>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Gelée des Sprites"); put(Language.EN, "Sprite's Frost Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							86, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/84pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1750));
								add(new Effect(TypeEffect.AGI, false, 24));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Effect>() ),
					},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			},
			new Weapon[] {
					
			}
		};
	}
	
	public static Fortification[] getFortification() {
		return new Fortification[] {
				new Fortification("+0", Fortification.LEVEL[0], 1),
				new Fortification("+1", Fortification.LEVEL[1], 1.03),
				new Fortification("+2", Fortification.LEVEL[1], 1.06),
				new Fortification("+3", Fortification.LEVEL[1], 1.09),
				new Fortification("+4", Fortification.LEVEL[1], 1.12),
				new Fortification("+5", Fortification.LEVEL[1], 1.15),
				new Fortification("+6", Fortification.LEVEL[1], 1.18),
				new Fortification("+7", Fortification.LEVEL[1], 1.21),
				new Fortification("+8", Fortification.LEVEL[2], 1.24),
				new Fortification("+9", Fortification.LEVEL[2], 1.27),
				new Fortification("+10", Fortification.LEVEL[2], 1.31),
				new Fortification("+11", Fortification.LEVEL[3], 1.35),
				new Fortification("+12", Fortification.LEVEL[3], 1.39),
				new Fortification("+13", Fortification.LEVEL[3], 1.45),
				new Fortification("+14", Fortification.LEVEL[2], 1.51),
				new Fortification("+15", Fortification.LEVEL[2], 1.61),
				new Fortification("+16", Fortification.LEVEL[4], 1.67),
				new Fortification("+17", Fortification.LEVEL[4], 1.73),
				new Fortification("+18", Fortification.LEVEL[4], 1.83),
				new Fortification("+19", Fortification.LEVEL[3], 1.88),
				new Fortification("+20", Fortification.LEVEL[3], 1.98)
		};
	}
	
	public static RedFortification[] getRedFortification() {
		return new RedFortification[] {
				new RedFortification("+0", RedFortification.LEVEL[0], 1, 1, 1, 0),
				new RedFortification("+1", RedFortification.LEVEL[1], 1.015, 1.01, 1.02, 0),
				new RedFortification("+2", RedFortification.LEVEL[1], 1.03, 1.02, 1.04, 0),
				new RedFortification("+3", RedFortification.LEVEL[1], 1.045, 1.03, 1.06, 0),
				new RedFortification("+4", RedFortification.LEVEL[1], 1.06, 1.04, 1.08, 0),
				new RedFortification("+5", RedFortification.LEVEL[1], 1.075, 1.05, 1.1, 0),
				new RedFortification("+6", RedFortification.LEVEL[1], 1.09, 1.06, 1.12, 0),
				new RedFortification("+7", RedFortification.LEVEL[1], 1.105, 1.07, 1.14, 0),
				new RedFortification("+8", RedFortification.LEVEL[1], 1.12, 1.08, 1.16, 0),
				new RedFortification("+9", RedFortification.LEVEL[1], 1.135, 1.09, 1.18, 0),
				new RedFortification("+10", RedFortification.LEVEL[1], 1.15, 1.10, 1.2, 1),
				new RedFortification("+11", RedFortification.LEVEL[2], 1.175, 1.12, 1.23, 1),
				new RedFortification("+12", RedFortification.LEVEL[2], 1.2, 1.14, 1.26, 1),
				new RedFortification("+13", RedFortification.LEVEL[2], 1.225, 1.16, 1.29, 1),
				new RedFortification("+14", RedFortification.LEVEL[2], 1.25, 1.18, 1.32, 1),
				new RedFortification("+15", RedFortification.LEVEL[2], 1.275, 1.2, 1.35, 1),
				new RedFortification("+16", RedFortification.LEVEL[2], 1.3, 1.22, 1.38, 1),
				new RedFortification("+17", RedFortification.LEVEL[2], 1.325, 1.24, 1.41, 1),
				new RedFortification("+18", RedFortification.LEVEL[2], 1.35, 1.26, 1.44, 1),
				new RedFortification("+19", RedFortification.LEVEL[2], 1.375, 1.28, 1.47, 1),
				new RedFortification("+20", RedFortification.LEVEL[3], 1.4, 1.3, 1.5, 2),
				new RedFortification("+21", RedFortification.LEVEL[3], 1.435, 1.33, 1.54, 2),
				new RedFortification("+22", RedFortification.LEVEL[3], 1.47, 1.36, 1.58, 2),
				new RedFortification("+23", RedFortification.LEVEL[3], 1.505, 1.39, 1.62, 2),
				new RedFortification("+24", RedFortification.LEVEL[3], 1.54, 1.42, 1.66, 2),
				new RedFortification("+25", RedFortification.LEVEL[3], 1.575, 1.45, 1.7, 2),
				new RedFortification("+26", RedFortification.LEVEL[3], 1.61, 1.48, 1.74, 2),
				new RedFortification("+27", RedFortification.LEVEL[3], 1.645, 1.51, 1.78, 2),
				new RedFortification("+28", RedFortification.LEVEL[3], 1.68, 1.54, 1.82, 2),
				new RedFortification("+29", RedFortification.LEVEL[3], 1.715, 1.57, 1.86, 2),
				new RedFortification("+30", RedFortification.LEVEL[3], 1.75, 1.6, 1.9, 3),
				new RedFortification("+31", RedFortification.LEVEL[4], 1.8, 1.64, 1.96, 3),
				new RedFortification("+32", RedFortification.LEVEL[4], 1.85, 1.68, 2.02, 3),
				new RedFortification("+33", RedFortification.LEVEL[4], 1.9, 1.72, 2.08, 3),
				new RedFortification("+34", RedFortification.LEVEL[4], 1.95, 1.76, 2.14, 3),
				new RedFortification("+35", RedFortification.LEVEL[4], 2, 1.80, 2.2, 3),
				new RedFortification("+36", RedFortification.LEVEL[4], 2.05, 1.84, 2.26, 3),
				new RedFortification("+37", RedFortification.LEVEL[4], 2.1, 1.88, 2.32, 3),
				new RedFortification("+38", RedFortification.LEVEL[4], 2.15, 1.92, 2.38, 3),
				new RedFortification("+39", RedFortification.LEVEL[4], 2.2, 1.96, 2.44, 3),
				new RedFortification("+40", RedFortification.LEVEL[4], 2.25, 2, 2.5, 4),
				new RedFortification("+41", RedFortification.LEVEL[5], 2.315, 2.05, 2.58, 4),
				new RedFortification("+42", RedFortification.LEVEL[5], 2.38, 2.1, 2.66, 4),
				//---------------------------------------------------------------------------
				new RedFortification("+43", RedFortification.LEVEL[5], 2.445, 2.15, 2.74, 4),
				new RedFortification("+44", RedFortification.LEVEL[5], 2.51, 2.2, 2.82, 4),
				new RedFortification("+45", RedFortification.LEVEL[5], 2.575, 2.25, 2.9, 4),
				new RedFortification("+46", RedFortification.LEVEL[5], 2.64, 2.3, 2.98, 4),
				new RedFortification("+47", RedFortification.LEVEL[5], 2.705, 2.35, 3.06, 4),
				new RedFortification("+48", RedFortification.LEVEL[5], 2.77, 2.4, 3.14, 4),
				new RedFortification("+49", RedFortification.LEVEL[5], 2.835, 2.45, 3.22, 4),
				new RedFortification("+50", RedFortification.LEVEL[5], 2.9, 2.5, 3.3, 5)
		};
	}
	
	public static Bague[] getBague() {
		return new Bague[] {
				new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", new ArrayList<Effect>()),
				new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique"); put(Language.EN, "Magical Passion Ring"); }}, Quality.BLUE, "blue", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, false, 3, true));
					add(new Effect(TypeEffect.VIT, false, 3, true));
					add(new Effect(TypeEffect.INT, false, 3, true));
					add(new Effect(TypeEffect.VOL, false, 3, true));
					add(new Effect(TypeEffect.AGI, false, 3, true));
					add(new Effect(TypeEffect.Atk, false, 10, true));
					add(new Effect(TypeEffect.AtkD, false, 10, true));
					add(new Effect(TypeEffect.AtkM, false, 10, true));
				}}),
				new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique 5 carats"); put(Language.EN, "5-Carat Magical Passion Ring"); }}, Quality.GOLD, "gold", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, false, 10, true));
					add(new Effect(TypeEffect.VIT, false, 10, true));
					add(new Effect(TypeEffect.INT, false, 10, true));
					add(new Effect(TypeEffect.VOL, false, 10, true));
					add(new Effect(TypeEffect.AGI, false, 10, true));
					add(new Effect(TypeEffect.Atk, false, 20, true));
					add(new Effect(TypeEffect.AtkD, false, 20, true));
					add(new Effect(TypeEffect.AtkM, false, 20, true));
				}})
		};
	}

	public static Energy[] getEnergy() {
		return new Energy[] {
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Écarlate"); put(Language.EN, "Crimson"); }}, "red", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.PV, false, 24));
				}}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Indigo"); put(Language.EN, "Azure"); }}, "blue", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.PM, false, 10));
				}}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Orange"); put(Language.EN, "Citrus"); }}, "orange", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.Atk, false, 13));
					add(new Effect(TypeEffect.AtkD, false, 10));
				}}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Violette"); put(Language.EN, "Violet"); }}, "purple", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.AtkM, false, 10));
				}}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Émeraude"); put(Language.EN, "Emerald"); }}, "green", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.DefP, false, 6));
				}}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Rose"); put(Language.EN, "Peach"); }}, "pink", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.DefM, false, 5));
				}})
		};
	}
}
