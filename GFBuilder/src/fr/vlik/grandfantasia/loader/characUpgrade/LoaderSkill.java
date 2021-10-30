package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.Skill;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;

@SuppressWarnings("serial")
public class LoaderSkill {

	static Skill[][] getPassiveSkill() {
		return new Skill[][] {
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Défense experte"); put(Language.EN, "Defense Expert"); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Endurance au combat"); put(Language.EN, "Battle Stamina"); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en berserker"); put(Language.EN, ""); }}, 31, "31-0", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Défense experte"); put(Language.EN, "Defense Expert"); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Endurance au combat"); put(Language.EN, "Battle Stamina"); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en paladin"); put(Language.EN, "Evolution on paladin"); }}, new int[] { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, }, "31-1", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 140, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 180, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 220, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 260, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 300, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 340, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 380, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 420, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 460, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 500, TypeCalcul.BASE),
					},
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, "Marksman"); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, "Dual Weapon Fighting"); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en ranger"); put(Language.EN, ""); }}, 31, "31-2", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, "Marksman"); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, "Dual Weapon Fighting"); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en assassin"); put(Language.EN, "Evolution on assassin"); }}, 31, "31-3", new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, "Magic Resistant"); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Restauration de PM"); put(Language.EN, "Mana Restoration"); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en clerc"); put(Language.EN, ""); }}, 31, "31-4", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, "Magic Resistant"); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Restauration de PM"); put(Language.EN, "Mana Restoration"); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en sage"); put(Language.EN, ""); }}, 31, "31-5", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, "Magic Adept"); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, "Magic Sharpshooter"); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en sorcier"); put(Language.EN, "Evolution on wizard"); }}, 31, "31-6", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, "Magic Adept"); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, "Magic Sharpshooter"); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en nécromancien"); put(Language.EN, "Evolution on necromancer"); }}, 31, "31-7", new Calculable[] {
					new Effect(TypeEffect.PV, false, 400, TypeCalcul.BASE),
					new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "ORDI de Technopolis"); put(Language.EN, ""); }}, new int[] { 6, 31, 66, }, "4-0", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 3),
					},
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Microprocesseur de combat multi-coeur"); put(Language.EN, ""); }}, 16, "4-1", new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 0.5),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Double armes mécaniques"); put(Language.EN, ""); }}, 31, "4-2", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en métalleux"); put(Language.EN, ""); }}, 31, "31-8", null),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Maîtrise de Mécha gravité"); put(Language.EN, "Mecha Gravity Mastery"); }}, 66, "66-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "ORDI de Technopolis"); put(Language.EN, ""); }}, new int[] { 6, 31, 66, }, "4-0", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 3),
					},
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Microprocesseur de combat multi-coeur"); put(Language.EN, ""); }}, 16, "4-1", new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 0.5),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Double armes mécaniques"); put(Language.EN, ""); }}, 31, "4-2", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en démolisseur"); put(Language.EN, ""); }}, 31, "31-9", null),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Maîtrise d'Interférence électromagnétique"); put(Language.EN, "Electromagnetic Interference Mastery"); }}, 66, "66-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Passive9, 5),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, "Crystal Resonance"); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
						new Effect(TypeEffect.DegStdP, false, 5),
						new Effect(TypeEffect.DegStdD, false, 5),
						new Effect(TypeEffect.DegSkillP, false, 5),
						new Effect(TypeEffect.DegSkillM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
						new Effect(TypeEffect.DegStdP, false, 20),
						new Effect(TypeEffect.DegStdD, false, 20),
						new Effect(TypeEffect.DegSkillP, false, 20),
						new Effect(TypeEffect.DegSkillM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, "Space Crystal Core"); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				//new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en spatiodériveur"); put(Language.EN, ""); }}, 31, "31-10", null),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Poids de l'univers"); put(Language.EN, "Power of the Universe"); }}, 66, "66-2", new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.Atk, 50, TypeEffect.AtkM, TypeCalcul.CONVERTALL),
					new Effect(TypeEffect.AtkD, 50, TypeEffect.AtkM, TypeCalcul.CONVERTALL),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, "Crystal Resonance"); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
						new Effect(TypeEffect.DegStdP, false, 5),
						new Effect(TypeEffect.DegStdD, false, 5),
						new Effect(TypeEffect.DegSkillP, false, 5),
						new Effect(TypeEffect.DegSkillM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
						new Effect(TypeEffect.DegStdP, false, 20),
						new Effect(TypeEffect.DegStdD, false, 20),
						new Effect(TypeEffect.DegSkillP, false, 20),
						new Effect(TypeEffect.DegSkillM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, "Space Crystal Core"); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en chronodériveur"); put(Language.EN, "Evolution on time traveler"); }}, 31, "31-11", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Pouvoir du Temps"); put(Language.EN, "Chronos Power"); }}, 66, "66-3", new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			},
		};
	}
	
	static Skill[] getUpgradeSkill() {
		return new Skill[] {
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-0-0", "86-0-0", "86-0-1", "86-0-1", "86-0-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 50),
						new Effect(TypeEffect.VIT, false, 30),
						new Effect(TypeEffect.DefP, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 55),
						new Effect(TypeEffect.VIT, false, 35),
						new Effect(TypeEffect.DefP, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new Effect(TypeEffect.VIT, false, 40),
						new Effect(TypeEffect.DefP, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 65),
						new Effect(TypeEffect.VIT, false, 45),
						new Effect(TypeEffect.DefP, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 70),
						new Effect(TypeEffect.VIT, false, 50),
						new Effect(TypeEffect.DefP, true, 14),
					},
			}),
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme Agile"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-1-0", "86-1-0", "86-1-1", "86-1-1", "86-1-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30),
						new Effect(TypeEffect.AGI, false, 50),
						new Effect(TypeEffect.Atk, true, 3),
						new Effect(TypeEffect.AtkD, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 35),
						new Effect(TypeEffect.AGI, false, 55),
						new Effect(TypeEffect.Atk, true, 4),
						new Effect(TypeEffect.AtkD, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 40),
						new Effect(TypeEffect.AGI, false, 60),
						new Effect(TypeEffect.Atk, true, 5),
						new Effect(TypeEffect.AtkD, true, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 45),
						new Effect(TypeEffect.AGI, false, 65),
						new Effect(TypeEffect.Atk, true, 6),
						new Effect(TypeEffect.AtkD, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 50),
						new Effect(TypeEffect.AGI, false, 70),
						new Effect(TypeEffect.Atk, true, 7),
						new Effect(TypeEffect.AtkD, true, 7),
					},
			}),
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme Pure"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-2-0", "86-2-0", "86-2-1", "86-2-1", "86-2-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14),
						new Effect(TypeEffect.INT, false, 50),
						new Effect(TypeEffect.VOL, false, 14),
						new Effect(TypeEffect.AtkM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17),
						new Effect(TypeEffect.INT, false, 55),
						new Effect(TypeEffect.VOL, false, 17),
						new Effect(TypeEffect.AtkM, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
						new Effect(TypeEffect.INT, false, 60),
						new Effect(TypeEffect.VOL, false, 20),
						new Effect(TypeEffect.AtkM, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23),
						new Effect(TypeEffect.INT, false, 65),
						new Effect(TypeEffect.VOL, false, 23),
						new Effect(TypeEffect.AtkM, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26),
						new Effect(TypeEffect.INT, false, 70),
						new Effect(TypeEffect.VOL, false, 26),
						new Effect(TypeEffect.AtkM, true, 14),
					},
			}),
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme Magique"); put(Language.EN, "Mystic Soul"); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-3-0", "86-3-0", "86-3-1", "86-3-1", "86-3-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14),
						new Effect(TypeEffect.INT, false, 30),
						new Effect(TypeEffect.VOL, false, 14),
						new Effect(TypeEffect.AtkM, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17),
						new Effect(TypeEffect.INT, false, 35),
						new Effect(TypeEffect.VOL, false, 17),
						new Effect(TypeEffect.AtkM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
						new Effect(TypeEffect.INT, false, 40),
						new Effect(TypeEffect.VOL, false, 20),
						new Effect(TypeEffect.AtkM, true, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23),
						new Effect(TypeEffect.INT, false, 45),
						new Effect(TypeEffect.VOL, false, 23),
						new Effect(TypeEffect.AtkM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26),
						new Effect(TypeEffect.INT, false, 50),
						new Effect(TypeEffect.VOL, false, 26),
						new Effect(TypeEffect.AtkM, true, 7),
					},
			}),
			null,
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Cristal du Temps"); put(Language.EN, ""); }},
				new int[] { 16, 31, 66, }, new String[] { "5-1", "5-1", "5-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -5),
					},
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -10),
					},
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -15),
					},
			}),
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme brisée"); put(Language.EN, ""); }},
				new int[] { 6, 66, }, new String[] { "reinca-0", "reinca-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.XP, false, 10),
						new Effect(TypeEffect.Loot, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.XP, false, 13),
						new Effect(TypeEffect.Loot, false, 5),
					},
			}),
		};
	}
}
