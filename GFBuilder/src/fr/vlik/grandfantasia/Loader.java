package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.HashMap;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipable.Bague;
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
	
	public static Yggdrasil[] getYggdrasil() {
		return new Yggdrasil[] {
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "0 - Aucun"); put(Language.EN, "0 - None"); }}, "null", new ArrayList<Effect>()),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "1 - Alice"); put(Language.EN, "1 - Alice"); }}, "boss1", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, false, 15));
					add(new Effect(TypeEffect.VIT, false, 15));
					add(new Effect(TypeEffect.INT, false, 15));
					add(new Effect(TypeEffect.VOL, false, 15));
					add(new Effect(TypeEffect.AGI, false, 15));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "2 - Ronto"); put(Language.EN, "2 - Ronto"); }}, "boss2", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, false, 15));
					add(new Effect(TypeEffect.VIT, false, 15));
					add(new Effect(TypeEffect.INT, false, 15));
					add(new Effect(TypeEffect.VOL, false, 15));
					add(new Effect(TypeEffect.AGI, false, 15));
					add(new Effect(TypeEffect.XP, false, 5));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "3 - Bodor"); put(Language.EN, "3 - Bodor"); }}, "boss3", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, false, 15));
					add(new Effect(TypeEffect.VIT, false, 15));
					add(new Effect(TypeEffect.INT, false, 15));
					add(new Effect(TypeEffect.VOL, false, 15));
					add(new Effect(TypeEffect.AGI, false, 15));
					add(new Effect(TypeEffect.XP, false, 5));
					add(new Effect(TypeEffect.DegP, false, 3));
					add(new Effect(TypeEffect.DegM, false, 3));
					add(new Effect(TypeEffect.PeneP, false, 3));
					add(new Effect(TypeEffect.PeneM, false, 3));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "4 - Smulca"); put(Language.EN, "4 - Smulca"); }}, "boss4", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 5));
					add(new Effect(TypeEffect.VIT, true, 5));
					add(new Effect(TypeEffect.INT, true, 5));
					add(new Effect(TypeEffect.VOL, true, 5));
					add(new Effect(TypeEffect.AGI, true, 5));
					add(new Effect(TypeEffect.XP, false, 5));
					add(new Effect(TypeEffect.DegP, false, 3));
					add(new Effect(TypeEffect.DegM, false, 3));
					add(new Effect(TypeEffect.PeneP, false, 3));
					add(new Effect(TypeEffect.PeneM, false, 3));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "5 - Ewan"); put(Language.EN, "5 - Ewan"); }}, "boss5", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 5));
					add(new Effect(TypeEffect.VIT, true, 5));
					add(new Effect(TypeEffect.INT, true, 5));
					add(new Effect(TypeEffect.VOL, true, 5));
					add(new Effect(TypeEffect.AGI, true, 5));
					add(new Effect(TypeEffect.XP, false, 8));
					add(new Effect(TypeEffect.DegP, false, 3));
					add(new Effect(TypeEffect.DegM, false, 3));
					add(new Effect(TypeEffect.PeneP, false, 3));
					add(new Effect(TypeEffect.PeneM, false, 3));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "6 - Bahadolo"); put(Language.EN, "6 - Bahadolo"); }}, "boss6", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 5));
					add(new Effect(TypeEffect.VIT, true, 5));
					add(new Effect(TypeEffect.INT, true, 5));
					add(new Effect(TypeEffect.VOL, true, 5));
					add(new Effect(TypeEffect.AGI, true, 5));
					add(new Effect(TypeEffect.XP, false, 8));
					add(new Effect(TypeEffect.DegP, false, 5));
					add(new Effect(TypeEffect.DegM, false, 5));
					add(new Effect(TypeEffect.PeneP, false, 5));
					add(new Effect(TypeEffect.PeneM, false, 5));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "7 - Quill"); put(Language.EN, "7 - Quill"); }}, "boss7", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 10));
					add(new Effect(TypeEffect.VIT, true, 10));
					add(new Effect(TypeEffect.INT, true, 10));
					add(new Effect(TypeEffect.VOL, true, 10));
					add(new Effect(TypeEffect.AGI, true, 10));
					add(new Effect(TypeEffect.XP, false, 8));
					add(new Effect(TypeEffect.DegP, false, 5));
					add(new Effect(TypeEffect.DegM, false, 5));
					add(new Effect(TypeEffect.PeneP, false, 5));
					add(new Effect(TypeEffect.PeneM, false, 5));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "8 - Mosunk"); put(Language.EN, "8 - Mosunk"); }}, "boss8", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 10));
					add(new Effect(TypeEffect.VIT, true, 10));
					add(new Effect(TypeEffect.INT, true, 10));
					add(new Effect(TypeEffect.VOL, true, 10));
					add(new Effect(TypeEffect.AGI, true, 10));
					add(new Effect(TypeEffect.XP, false, 11));
					add(new Effect(TypeEffect.DegP, false, 5));
					add(new Effect(TypeEffect.DegM, false, 5));
					add(new Effect(TypeEffect.PeneP, false, 5));
					add(new Effect(TypeEffect.PeneM, false, 5));
				}}),
				new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "9 - Jundo"); put(Language.EN, "9 - Jundo"); }}, "boss9", new ArrayList<Effect>() {{
					add(new Effect(TypeEffect.FCE, true, 10));
					add(new Effect(TypeEffect.VIT, true, 10));
					add(new Effect(TypeEffect.INT, true, 10));
					add(new Effect(TypeEffect.VOL, true, 10));
					add(new Effect(TypeEffect.AGI, true, 10));
					add(new Effect(TypeEffect.XP, false, 11));
					add(new Effect(TypeEffect.DegP, false, 7));
					add(new Effect(TypeEffect.DegM, false, 7));
					add(new Effect(TypeEffect.PeneP, false, 7));
					add(new Effect(TypeEffect.PeneM, false, 7));
				}})
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
							}}, new ArrayList<Calculable>() ),
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
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sacrelame victorieuse de Bodor"); put(Language.EN, "Bodor's Victorious Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							100, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/100pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2830, true));
								add(new Effect(TypeEffect.FCE, false, 38, true));
								add(new Effect(TypeEffect.VIT, false, 28, true));
								add(new Effect(TypeEffect.AGI, false, 30, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 8));
								add(new Effect(TypeEffect.DCCP, false, 10));
								add(new Effect(TypeEffect.Sacre, false, 25));
								add(new Effect(TypeEffect.Ombre, false, 25));
								add(new Effect(TypeEffect.Foudre, false, 25));
								add(new Effect(TypeEffect.Feu, false, 25));
								add(new Effect(TypeEffect.Glace, false, 25));
								add(new Effect(TypeEffect.Nature, false, 25));
								add(new Proc(100, Activation.Attack, 2, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.Depla, false, 1));
									add(new Effect(TypeEffect.Toucher, false, 1));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Croc de Vipère"); put(Language.EN, "Viper Fang Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							99, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/99pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2457, true));
								add(new Effect(TypeEffect.FCE, false, 95, true));
								add(new Effect(TypeEffect.VIT, false, 46, true));
								add(new Effect(TypeEffect.AGI, false, 27, true));
								add(new Effect(TypeEffect.RegenCB, false, 15));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.VitAtk, false, 20));
									add(new Effect(TypeEffect.ESQ, false, 20));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Toxique de Sprite"); put(Language.EN, "Sprite's Poisoned Shortsword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							96, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/38ora2", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2023, true));
								add(new Effect(TypeEffect.FCE, false, 28, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Jugement Éternel"); put(Language.EN, "Judgment Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/95vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3325, true));
								add(new Effect(TypeEffect.FCE, false, 143, true));
								add(new Effect(TypeEffect.VIT, false, 50, true));
								add(new Effect(TypeEffect.AGI, false, 59, true));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée buster de Zack"); put(Language.EN, "Holy Avenger"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/95gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2992, true));
								add(new Effect(TypeEffect.FCE, false, 121, true));
								add(new Effect(TypeEffect.VIT, false, 59, true));
								add(new Effect(TypeEffect.AGI, false, 48, true));
								add(new Effect(TypeEffect.VitAtk, false, 18));
								add(new Proc(20, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.x2STD, 25));
									add(new Effect(TypeEffect.ESQ, false, 15));
									add(new Effect(TypeEffect.TCCP, false, 15));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Berimaru Ardente de Bodor"); put(Language.EN, "Bodor - Blazing Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/95pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2327, true));
								add(new Effect(TypeEffect.FCE, false, 32, true));
								add(new Effect(TypeEffect.VIT, false, 22, true));
								add(new Effect(TypeEffect.AGI, false, 24, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 8));
								add(new Effect(TypeEffect.DCCP, false, 10));
								add(new Effect(TypeEffect.Nature, false, 40));
								add(new Proc(100, Activation.Attack, 2, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.Depla, false, 1));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, "Victory Short Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							95, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/95blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1662, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Féroce Mystique"); put(Language.EN, "Mystical Fiery Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							94, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/94pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2295, true));
								add(new Effect(TypeEffect.FCE, false, 81, true));
								add(new Effect(TypeEffect.VIT, false, 26, true));
								add(new Effect(TypeEffect.AGI, false, 23, true));
								add(new Effect(TypeEffect.VitAtk, false, 10));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.ESQ, false, 10));
									add(new Effect(TypeEffect.TCCP, false, 10));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Brûlante de Sprite"); put(Language.EN, "Sprite's Burning Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							91, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1885, true));
								add(new Effect(TypeEffect.FCE, false, 26, true));
							}}, new ArrayList<Calculable>() ),
					new RedWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Serment du Chevalier"); put(Language.EN, "Trial Knight's Oath"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							90, Quality.RED, false, WeaponType.EPEE1M, true, false, "epee1M/90red", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 3406, true));
								add(new Effect(TypeEffect.FCE, false, 154, true));
								add(new Effect(TypeEffect.VIT, false, 54, true));
								add(new Effect(TypeEffect.AGI, false, 64, true));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}},
							new ArrayList<Calculable>(),
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
								add(new Effect(TypeEffect.Atk, false, 3096, true));
								add(new Effect(TypeEffect.FCE, false, 128, true));
								add(new Effect(TypeEffect.VIT, false, 45, true));
								add(new Effect(TypeEffect.AGI, false, 54, true));
								add(new Effect(TypeEffect.Toucher, false, 20));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Équarrisseur de Zodd Nosferatu"); put(Language.EN, "Soul: Cut"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							90, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/90gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2786, true));
								add(new Effect(TypeEffect.FCE, false, 110, true));
								add(new Effect(TypeEffect.VIT, false, 44, true));
								add(new Effect(TypeEffect.AGI, false, 48, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 20));
								add(new Proc(15, Activation.Attack, 5, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.DegOmbre, false, 1000));
									add(new Effect(TypeEffect.DCCP, false, 30));
									add(new Effect(TypeEffect.DefP, true, -10));
									add(new Effect(TypeEffect.DefM, true, -10));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Divine - Aile en Or"); put(Language.EN, "Divine Blade - Golden Wing"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							89, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/89pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2136, true));
								add(new Effect(TypeEffect.FCE, false, 72, true));
								add(new Effect(TypeEffect.VIT, false, 22, true));
								add(new Effect(TypeEffect.AGI, false, 26, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.ESQ, false, 8));
								add(new Proc(10, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.DegEp, false, 25));
									add(new Effect(TypeEffect.VitAtk, false, 10));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Bleue enflammée"); put(Language.EN, "Burning Cobalt Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							86, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/86bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2333, true));
								add(new Effect(TypeEffect.FCE, false, 36, true));
								add(new Effect(TypeEffect.AGI, false, 36, true));
								add(new Effect(TypeEffect.Toucher, false, 15));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Gelée des Sprites"); put(Language.EN, "Sprite's Frost Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							86, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/84pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1750, true));
								add(new Effect(TypeEffect.AGI, false, 24, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, "Frost Twin Blades"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							86, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/79pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1458, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée de Cendre d'Amaterasu"); put(Language.EN, "Dragon's Mark Flame"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							85, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/85vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2872, true));
								add(new Effect(TypeEffect.FCE, false, 119, true));
								add(new Effect(TypeEffect.VIT, false, 43, true));
								add(new Effect(TypeEffect.AGI, false, 52, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Zanpakuto Enflammé du Dragon"); put(Language.EN, "Dragonbane Dark Rock"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							85, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/85gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2585, true));
								add(new Effect(TypeEffect.FCE, false, 99, true));
								add(new Effect(TypeEffect.VIT, false, 45, true));
								add(new Effect(TypeEffect.AGI, false, 50, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 25));
								add(new Proc(10, Activation.Attack, 5, 5, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.Poisse, 10));
									add(new StaticEffect(TypeStaticEffect.ProcT0L85Q5));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Glaciale d'Hitsugaya"); put(Language.EN, "Bodor - Icefrost Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							85, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/85pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2010, true));
								add(new Effect(TypeEffect.FCE, false, 28, true));
								add(new Effect(TypeEffect.VIT, false, 18, true));
								add(new Effect(TypeEffect.AGI, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 8));
								add(new Effect(TypeEffect.DCCP, false, 10));
								add(new Effect(TypeEffect.Nature, false, 40));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lave du Volcan du Dragon"); put(Language.EN, "Dragonblade Lava"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							84, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/84pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1980, true));
								add(new Effect(TypeEffect.FCE, false, 72, true));
								add(new Effect(TypeEffect.VIT, false, 20, true));
								add(new Effect(TypeEffect.AGI, false, 24, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 25));
								add(new Proc(10, Activation.Attack, 5, 5, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.Poisse, 10));
									add(new StaticEffect(TypeStaticEffect.ProcT0L85Q5));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Assaut Inébranlable"); put(Language.EN, "Breakthrough Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							81, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/81bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2157, true));
								add(new Effect(TypeEffect.FCE, false, 34, true));
								add(new Effect(TypeEffect.AGI, false, 34, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Glace Brûlante de Sprite"); put(Language.EN, "Sprite's Flaming Ice Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							81, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/79pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1618, true));
								add(new Effect(TypeEffect.AGI, false, 22, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torturée"); put(Language.EN, "Darklock Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							81, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/86bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1348, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epée Ikazuchi Jumeaux"); put(Language.EN, "Electric Gnash"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							80, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/80vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2653, true));
								add(new Effect(TypeEffect.FCE, false, 95, true));
								add(new Effect(TypeEffect.VIT, false, 34, true));
								add(new Effect(TypeEffect.AGI, false, 41, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Vierge Immaculée"); put(Language.EN, "Absolute Tyrant - Ice Lord"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							80, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/80gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2387, true));
								add(new Effect(TypeEffect.FCE, false, 67, true));
								add(new Effect(TypeEffect.VIT, false, 27, true));
								add(new Effect(TypeEffect.AGI, false, 42, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new Effect(TypeEffect.FCE, false, 50));
								add(new Proc(15, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L80Q5N0));
									add(new StaticEffect(TypeStaticEffect.ProcT0L80Q5N1));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sombre Sournoiserie"); put(Language.EN, "Shadowheart Stinger"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							80, Quality.BLUE, false, WeaponType.EPEE1M, true, false, "epee1M/80gvg", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2122, true));
								add(new Effect(TypeEffect.FCE, false, 44, true));
								add(new Effect(TypeEffect.VIT, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
								add(new Proc(10, Activation.Attack, 4.5, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L80Q3));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Invincible Tyrannie"); put(Language.EN, "Unbeatable Tyrant - Icebound"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							79, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/79pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1827, true));
								add(new Effect(TypeEffect.FCE, false, 18, true));
								add(new Effect(TypeEffect.VIT, false, 18, true));
								add(new Effect(TypeEffect.AGI, false, 24, true));
								add(new Effect(TypeEffect.Toucher, false, 14));
								add(new Effect(TypeEffect.FCE, false, 50));
								add(new Proc(15, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L80Q5N0));
									add(new StaticEffect(TypeStaticEffect.ProcT0L80Q5N1));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Double Lame du Levant"); put(Language.EN, "Sunset Double Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							76, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/81bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1984, true));
								add(new Effect(TypeEffect.FCE, false, 32, true));
								add(new Effect(TypeEffect.AGI, false, 32, true));
								add(new Effect(TypeEffect.Toucher, false, 14));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Tribu Engloutie"); put(Language.EN, "Sunken Lost Tribe"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							76, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/66pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1488, true));
								add(new Effect(TypeEffect.AGI, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Rapière d'Empereur Déchu"); put(Language.EN, "Emperor's Sword of Northern Light"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							75, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/75vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2438, true));
								add(new Effect(TypeEffect.FCE, false, 80, true));
								add(new Effect(TypeEffect.VIT, false, 30, true));
								add(new Effect(TypeEffect.AGI, false, 50, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Royale de la Providence"); put(Language.EN, "Royal Sword - Holy Salvation"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							75, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/75gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2194, true));
								add(new Effect(TypeEffect.FCE, false, 64, true));
								add(new Effect(TypeEffect.VIT, false, 24, true));
								add(new Effect(TypeEffect.AGI, false, 40, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new Proc(5, Activation.Attack, 5, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.TCCP, false, 100));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de l'Empereur"); put(Language.EN, "Emperor's Sword - Ruthless Sanction"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							74, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/74pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1677, true));
								add(new Effect(TypeEffect.FCE, false, 17, true));
								add(new Effect(TypeEffect.VIT, false, 17, true));
								add(new Effect(TypeEffect.AGI, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Proc(5, Activation.Attack, 5, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.TCCP, false, 100));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Grand Sabre Elsaien"); put(Language.EN, "Sword of Monster Bone"); }},
									new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
									72, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new ArrayList<Calculable>() {{
										add(new Effect(TypeEffect.Atk, false, 1850, true));
										add(new Effect(TypeEffect.FCE, false, 30, true));
										add(new Effect(TypeEffect.AGI, false, 30, true));
										add(new Effect(TypeEffect.Toucher, false, 12));
									}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Pourpre des Sprites"); put(Language.EN, "Sprite Purple Edge Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							71, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/65ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1362, true));
								add(new Effect(TypeEffect.AGI, false, 18, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame des Limbes Profondes"); put(Language.EN, "Galactic Sword of Destruction"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							70, Quality.PURPLE, true, WeaponType.EPEE1M, true, false, "epee1M/70vio", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2229, true));
								add(new Effect(TypeEffect.FCE, false, 75, true));
								add(new Effect(TypeEffect.VIT, false, 27, true));
								add(new Effect(TypeEffect.AGI, false, 48, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Empereur Déchu"); put(Language.EN, "Fallen Emperor - Dark Night"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							70, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/70gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 2005, true));
								add(new Effect(TypeEffect.FCE, false, 60, true));
								add(new Effect(TypeEffect.VIT, false, 22, true));
								add(new Effect(TypeEffect.AGI, false, 38, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new Effect(TypeEffect.RegenCB, false, 30));
								add(new Effect(TypeEffect.CostComp, false, -45));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame d'Acier Noir"); put(Language.EN, "Silent Headhunter"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							70, Quality.BLUE, false, WeaponType.EPEE1M, true, false, "epee1M/70gvg", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1782, true));
								add(new Effect(TypeEffect.FCE, false, 40, true));
								add(new Effect(TypeEffect.VIT, false, 16, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
								add(new Proc(10, Activation.Attack, 3, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L70Q3));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre en Écailles de Dragon Rouge"); put(Language.EN, "Bodor's Lunatic Blade"); }},
							new GradeName[] { GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							68, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/68ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1502, true));
								add(new Effect(TypeEffect.FCE, false, 10, true));
								add(new Effect(TypeEffect.VIT, false, 20, true));
								add(new Effect(TypeEffect.AGI, false, 18, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 7));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive à Lame Cruelle"); put(Language.EN, "Fallen Emperor - Merciless"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							66, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/66pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1446, true));
								add(new Effect(TypeEffect.FCE, false, 20, true));
								add(new Effect(TypeEffect.VIT, false, 18, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.RegenCB, false, 30));
								add(new Effect(TypeEffect.CostComp, false, -45));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Rituelle de Décapitation"); put(Language.EN, "Beheading Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							66, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1653, true));
								add(new Effect(TypeEffect.FCE, false, 28, true));
								add(new Effect(TypeEffect.AGI, false, 28, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Machette Ciselée"); put(Language.EN, "Northern Bandit's Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							66, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/80gvg", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1033, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Justice de l'Empereur"); put(Language.EN, "Grandleon"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							65, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/95gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1822, true));
								add(new Effect(TypeEffect.FCE, false, 55, true));
								add(new Effect(TypeEffect.VIT, false, 17, true));
								add(new Effect(TypeEffect.AGI, false, 40, true));
								add(new Effect(TypeEffect.Toucher, false, 18));
								add(new Proc(15, Activation.Attack, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.TCCP, false, 20));
									add(new Effect(TypeEffect.Depla, false, 20));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Conquérante du Chevalier Noir"); put(Language.EN, "Black Knight's Crusade Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							65, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/65ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1417, true));
								add(new Effect(TypeEffect.FCE, false, 20, true));
								add(new Effect(TypeEffect.VIT, false, 10, true));
								add(new Effect(TypeEffect.AGI, false, 12, true));
								add(new Effect(TypeEffect.Toucher, false, 12));
								add(new Effect(TypeEffect.TCCP, false, 6));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Vérité de l'Empereur"); put(Language.EN, "Emperor's Sword of Truth"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							63, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/63pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1361, true));
								add(new Effect(TypeEffect.FCE, false, 20, true));
								add(new Effect(TypeEffect.VIT, false, 12, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
								add(new Proc(15, Activation.Attack, 10, new ArrayList<Calculable>() {{
									add(new Effect(TypeEffect.TCCP, false, 20));
									add(new Effect(TypeEffect.Depla, false, 20));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée en Os de Dragon Originel"); put(Language.EN, "Original Dragonbone Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							63, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1555, true));
								add(new Effect(TypeEffect.FCE, false, 32, true));
								add(new Effect(TypeEffect.VIT, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague Violette Sauvage"); put(Language.EN, "Wild Purple Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							61, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/34sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1493, true));
								add(new Effect(TypeEffect.VIT, false, 30, true));
								add(new Effect(TypeEffect.AGI, false, 22, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Pierre de Cristal Sanglante des Sprites"); put(Language.EN, "Sprite's Blood Crystal Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							61, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/38ora2", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1120, true));
								add(new Effect(TypeEffect.VIT, false, 14, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame de l'Eternité de Bodor"); put(Language.EN, "Bodor's Sword of Eternity"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							60, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/60gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1643, true));
								add(new Effect(TypeEffect.FCE, false, 34, true));
								add(new Effect(TypeEffect.VIT, false, 14, true));
								add(new Effect(TypeEffect.AGI, false, 48, true));
								add(new Effect(TypeEffect.Toucher, false, 15));
								add(new StaticEffect(TypeStaticEffect.x3Skill, 20));
								add(new StaticEffect(TypeStaticEffect.DegNature716, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Marquis Bodor (Reforgée)"); put(Language.EN, "(Reforged) Bodor's Marquis Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							60, Quality.ORANGE, false, WeaponType.EPEE1M, true, true, "epee1M/60pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1409, true));
								add(new Effect(TypeEffect.FCE, false, 14, true));
								add(new Effect(TypeEffect.VIT, false, 22, true));
								add(new Effect(TypeEffect.Toucher, false, 9));
								add(new Effect(TypeEffect.TCCP, false, 5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Marquis Bodor"); put(Language.EN, "Bodor's Marquis Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							60, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/60pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1280, true));
								add(new Effect(TypeEffect.FCE, false, 13, true));
								add(new Effect(TypeEffect.VIT, false, 20, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
								add(new Effect(TypeEffect.TCCP, false, 5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Sanglante Vengeance Douloureuse"); put(Language.EN, "Blood Blade - Pain of Vengeance"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							60, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/58pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1461, true));
								add(new Effect(TypeEffect.AGI, false, 33, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Légendaire, Le Roi Immuable"); put(Language.EN, "Legendary Sword - Immovable King"); }},
							new GradeName[] { GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							58, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/58ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1240, true));
								add(new Effect(TypeEffect.FCE, false, 20, true));
								add(new Effect(TypeEffect.VIT, false, 9, true));
								add(new Effect(TypeEffect.AGI, false, 4, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
								add(new Effect(TypeEffect.TCCP, false, 3.5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Coeur de Lion"); put(Language.EN, "Lionheart Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							58, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/65ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1224, true));
								add(new Effect(TypeEffect.FCE, false, 13, true));
								add(new Effect(TypeEffect.VIT, false, 7, true));
								add(new Effect(TypeEffect.AGI, false, 13, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 20));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Promesses de Bodor"); put(Language.EN, "Bodor's Sword of Promises"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							58, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/58pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1256, true));
								add(new Effect(TypeEffect.FCE, false, 11, true));
								add(new Effect(TypeEffect.VIT, false, 17, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
								add(new StaticEffect(TypeStaticEffect.x3Skill, 20));
								add(new StaticEffect(TypeStaticEffect.DegNature541, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Royale Coeur de Lion"); put(Language.EN, "Lionheart - Sword of Kings"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							58, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/58bleu", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1398, true));
								add(new Effect(TypeEffect.FCE, false, 29, true));
								add(new Effect(TypeEffect.AGI, false, 15, true));
								add(new Effect(TypeEffect.Toucher, false, 10));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Sprites du Trône"); put(Language.EN, "Sprite's Sword of Thrones"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							54, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 958, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 4));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Cristal Céleste"); put(Language.EN, "Heavenly Crystal Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							52, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/48ora0", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1216, true));
								add(new Effect(TypeEffect.FCE, false, 21, true));
								add(new Effect(TypeEffect.AGI, false, 15, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Éclair Ultime"); put(Language.EN, "Ultimate Lightning"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							50, Quality.GOLD, true, WeaponType.EPEE1M, true, false, "epee1M/50gold", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 1303, true));
								add(new Effect(TypeEffect.FCE, false, 26, true));
								add(new Effect(TypeEffect.VIT, false, 10, true));
								add(new Effect(TypeEffect.AGI, false, 36, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
								add(new Effect(TypeEffect.Foudre, false, 15));
								add(new Proc(15, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L50Q5));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Ofanim"); put(Language.EN, "Sword of Thrones"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							50, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/48vert", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 724, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Ecaille de Dragon Vert"); put(Language.EN, "Green Dragonscale Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							48, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/48ora1", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 962, true));
								add(new Effect(TypeEffect.FCE, false, 9, true));
								add(new Effect(TypeEffect.VIT, false, 9, true));
								add(new Effect(TypeEffect.AGI, false, 9, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 15));
								add(new Proc(30, Activation.Attack, 20, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L48Q4));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Lumière Dorée"); put(Language.EN, "Golden Lightning"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							48, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/48pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 969, true));
								add(new Effect(TypeEffect.VIT, false, 10, true));
								add(new Effect(TypeEffect.AGI, false, 13, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
								add(new Effect(TypeEffect.Foudre, false, 15));
								add(new Proc(15, Activation.Attack, 8, new ArrayList<Calculable>() {{
									add(new StaticEffect(TypeStaticEffect.ProcT0L50Q5));
								}}));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Spectrale; Flamme du Dragon de Glace"); put(Language.EN, "Phantom Sword - Ice Dragon Flame"); }},
							new GradeName[] { GradeName.ASSASSIN, },
							48, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/48ora0", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 970, true));
								add(new Effect(TypeEffect.FCE, false, 18, true));
								add(new Effect(TypeEffect.AGI, false, 9, true));
								add(new Effect(TypeEffect.Toucher, false, 8));
								add(new Effect(TypeEffect.TCCP, false, 3));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Familiale du Noble"); put(Language.EN, "Noble's Heirloom Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							48, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/48vert", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 824, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 4));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier Bodor (Reforgé)"); put(Language.EN, "(Reforged) Bodor's Knight Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							45, Quality.ORANGE, false, WeaponType.EPEE1M, true, true, "epee1M/45pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 985, true));
								add(new Effect(TypeEffect.FCE, false, 10, true));
								add(new Effect(TypeEffect.VIT, false, 13, true));
								add(new Effect(TypeEffect.Toucher, false, 7));
								add(new Effect(TypeEffect.TCCP, false, 3));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier Bodor"); put(Language.EN, "Bodor's Knight Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							45, Quality.ORANGE, false, WeaponType.EPEE1M, true, false, "epee1M/45pvp", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 895, true));
								add(new Effect(TypeEffect.FCE, false, 9, true));
								add(new Effect(TypeEffect.VIT, false, 12, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
								add(new Effect(TypeEffect.TCCP, false, 3));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dieu de la Guerre au Visage Vert"); put(Language.EN, "Green-Faced God of War"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							44, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/38ora0", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 986, true));
								add(new Effect(TypeEffect.VIT, false, 13, true));
								add(new Effect(TypeEffect.AGI, false, 15, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Sprites du Seigneur de Guerre"); put(Language.EN, "Sprite's Warlord Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							44, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 739, true));
								add(new Effect(TypeEffect.AGI, false, 8, true));
								add(new Effect(TypeEffect.Toucher, false, 2));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue Épée des Ruines à Os Blanc"); put(Language.EN, "Whitebone Relic Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							40, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 656, true));
								add(new Effect(TypeEffect.VIT, false, 8, true));
								add(new Effect(TypeEffect.Toucher, false, 2));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Crapule Courageuse"); put(Language.EN, "Brigand's Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							40, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/40blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 547, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Epine de Rose Sanglante"); put(Language.EN, "Bloody Rose"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							38, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/38ora2", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 720, true));
								add(new Effect(TypeEffect.FCE, false, 6, true));
								add(new Effect(TypeEffect.VIT, false, 5, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 4));
								add(new Effect(TypeEffect.RegenCB, false, 5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier de la Forteresse"); put(Language.EN, "Fortress Defender"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							38, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/38ora1", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 728, true));
								add(new Effect(TypeEffect.VIT, false, 11, true));
								add(new Effect(TypeEffect.AGI, false, 7, true));
								add(new Effect(TypeEffect.Toucher, false, 4));
								add(new Effect(TypeEffect.MEN, false, 15));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Rage d'Akuma"); put(Language.EN, "Nightmare's Wrath"); }},
							new GradeName[] { GradeName.ASSASSIN, },
							38, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/38ora0", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 740, true));
								add(new Effect(TypeEffect.FCE, false, 14, true));
								add(new Effect(TypeEffect.AGI, false, 7, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
								add(new Effect(TypeEffect.TCCP, false, 2.5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Découpe Rouge Flamme"); put(Language.EN, "Red Flame Cutting"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							36, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/91sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 770, true));
								add(new Effect(TypeEffect.FCE, false, 21, true));
								add(new Effect(TypeEffect.Toucher, false, 6));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Petit Couteau des Sprites de Destruction"); put(Language.EN, "Sprite's Destruction Dagger"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							34, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/34sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 539, true));
								add(new Effect(TypeEffect.AGI, false, 6, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Champion réincarné"); put(Language.EN, "Reincarnated Champion's Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
							31, Quality.BLUE, false, WeaponType.EPEE1M, false, true, "epee1M/31rein", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 618, true));
								add(new Effect(TypeEffect.FCE, false, 12, true));
								add(new Effect(TypeEffect.AGI, false, 8, true));
							}}, new ArrayList<Calculable>() ),
					
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de la Destruction"); put(Language.EN, "Destruction Dagger"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							30, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/30blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 386, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine Enflammée"); put(Language.EN, "Flaming Fang"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							28, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/94pre", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 498, true));
								add(new Effect(TypeEffect.FCE, false, 7, true));
								add(new Effect(TypeEffect.VIT, false, 5, true));
								add(new Effect(TypeEffect.AGI, false, 3, true));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 15));
								add(new StaticEffect(TypeStaticEffect.DegFeu294));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague de l'Onde Verte"); put(Language.EN, "Green Wave Blade"); }},
							new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
							28, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/28ora", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 510, true));
								add(new Effect(TypeEffect.FCE, false, 3, true));
								add(new Effect(TypeEffect.VIT, false, 2, true));
								add(new Effect(TypeEffect.AGI, false, 10, true));
								add(new Effect(TypeEffect.Toucher, false, 4));
								add(new Effect(TypeEffect.TCCP, false, 2));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Gobelin"); put(Language.EN, "Goblin Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							28, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/44sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 570, true));
								add(new Effect(TypeEffect.FCE, false, 15, true));
								add(new Effect(TypeEffect.AGI, false, 5, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Métallique des Sprites"); put(Language.EN, "Sprite's Metal Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							24, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/24sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 358, true));
								add(new Effect(TypeEffect.AGI, false, 4, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Éminente Épée du Chevalier"); put(Language.EN, "High Knight Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							24, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 298, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Métal"); put(Language.EN, "Metal Blade"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							20, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/18ora1", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 244, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée d'Aube"); put(Language.EN, "Sword of Dawn"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							18, Quality.ORANGE, true, WeaponType.EPEE1M, true, false, "epee1M/18ora1", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 305, true));
								add(new Effect(TypeEffect.FCE, false, 3, true));
								add(new Effect(TypeEffect.VIT, false, 3, true));
								add(new Effect(TypeEffect.AGI, false, 3, true));
								add(new StaticEffect(TypeStaticEffect.x2Skill, 15));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Mortelle Diabolique"); put(Language.EN, "Evil-Slaying Sword"); }},
							new GradeName[] { GradeName.RANGER, GradeName.ASSASSIN, },
							18, Quality.ORANGE, true, WeaponType.EPEE1M, false, false, "epee1M/18ora0", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 315, true));
								add(new Effect(TypeEffect.VIT, false, 3, true));
								add(new Effect(TypeEffect.AGI, false, 6, true));
								add(new Effect(TypeEffect.Toucher, false, 2));
								add(new Effect(TypeEffect.TCCP, false, 1.5));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier"); put(Language.EN, "Knight Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							16, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 193, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive Runique des Sprites"); put(Language.EN, "Sprite's Well-Made Iron Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							14, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/31rein", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 203, true));
								add(new Effect(TypeEffect.AGI, false, 2, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée du Gardien"); put(Language.EN, "Guardian Longsword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							12, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/24blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 147, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Fer Raffinée"); put(Language.EN, "Well-Made Iron Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							10, Quality.WHITE, false, WeaponType.EPEE1M, false, false, "epee1M/10blanc", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 125, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive des Sprites"); put(Language.EN, "Sprite's Iron Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							8, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/8sprite", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 127, true));
								add(new Effect(TypeEffect.AGI, false, 2, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Brave de Siwa"); put(Language.EN, "Brave Sword of Siwa Village"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, },
							6, Quality.BLUE, false, WeaponType.EPEE1M, false, false, "epee1M/31rein", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 203, true));
								add(new Effect(TypeEffect.AGI, false, 2, true));
							}}, new ArrayList<Calculable>() ),
					new Weapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Prémices du Voyage de Muha"); put(Language.EN, "Muha's Horizon-Chaser Sword"); }},
							new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
							6, Quality.GREEN, false, WeaponType.EPEE1M, false, false, "epee1M/6vert", new ArrayList<Calculable>() {{
								add(new Effect(TypeEffect.Atk, false, 106, true));
								add(new Effect(TypeEffect.FCE, false, 2, true));
							}}, new ArrayList<Calculable>() )
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
