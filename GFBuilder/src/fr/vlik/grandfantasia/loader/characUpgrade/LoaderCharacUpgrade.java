package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Blason;
import fr.vlik.grandfantasia.characUpgrade.CombiTalent;
import fr.vlik.grandfantasia.characUpgrade.Energy;
import fr.vlik.grandfantasia.characUpgrade.Nucleus;
import fr.vlik.grandfantasia.characUpgrade.Skill;
import fr.vlik.grandfantasia.characUpgrade.ProSkill;
import fr.vlik.grandfantasia.characUpgrade.Speciality;
import fr.vlik.grandfantasia.characUpgrade.Stone;
import fr.vlik.grandfantasia.characUpgrade.Talent;
import fr.vlik.grandfantasia.characUpgrade.Title;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.TransformEffect;
import fr.vlik.grandfantasia.stats.TransformEffect.TypeTransformation;

@SuppressWarnings("serial")
public class LoaderCharacUpgrade {
	
	public static Title[] getTitle() {
		return LoaderTitle.getTitle();
	}
	
	public static Talent[][] getTalent() {
		return new Talent[][] {
			LoaderTalent.getClass0(),
			LoaderTalent.getClass1(),
			LoaderTalent.getClass2(),
			LoaderTalent.getClass3(),
			LoaderTalent.getClass4(),
			LoaderTalent.getClass5(),
			LoaderTalent.getClass6(),
			LoaderTalent.getClass7(),
			LoaderTalent.getClass8(),
			LoaderTalent.getClass9(),
			LoaderTalent.getClass10(),
			LoaderTalent.getClass11(),
		};
	}
	
	public static Talent[] getVoidTalent() {
		return new Talent[] {
			new Talent("void-0"),
			new Talent("void-1"),
			new Talent("void-2"),
			new Talent("void-3"),
			new Talent("void-4"),
			new Talent("void-5"),
			new Talent("void-6"),
			new Talent("void-7"),
		};
	}
	
	public static CombiTalent[][] getCombiTalent() {
		return new CombiTalent[][] {
			LoaderCombiTalent.getClass0(),
			LoaderCombiTalent.getClass1(),
			LoaderCombiTalent.getClass2(),
			LoaderCombiTalent.getClass3(),
			LoaderCombiTalent.getClass4(),
			LoaderCombiTalent.getClass5(),
			LoaderCombiTalent.getClass6(),
			LoaderCombiTalent.getClass7(),
			LoaderCombiTalent.getClass8(),
			LoaderCombiTalent.getClass9(),
			LoaderCombiTalent.getClass10(),
			LoaderCombiTalent.getClass11(),
		};
	}
	
	public static Speciality[][] getSpeciality() {
		return new Speciality[][] {
			LoaderSpeciality.getClass0(),
			LoaderSpeciality.getClass1(),
			LoaderSpeciality.getClass2(),
			LoaderSpeciality.getClass3(),
			LoaderSpeciality.getClass4(),
			LoaderSpeciality.getClass5(),
			LoaderSpeciality.getClass6(),
			LoaderSpeciality.getClass7(),
			LoaderSpeciality.getClass8(),
			LoaderSpeciality.getClass9(),
			LoaderSpeciality.getClass10(),
			LoaderSpeciality.getClass11(),
		};
	}
	
	public static Skill[][] getPassiveSkill() {
		return new Skill[][] {
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Défense experte"); put(Language.EN, ""); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Endurance au combat"); put(Language.EN, ""); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en berserker"); put(Language.EN, ""); }}, 31, "31-0", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Défense experte"); put(Language.EN, ""); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Endurance au combat"); put(Language.EN, ""); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en paladin"); put(Language.EN, ""); }}, 31, "31-1", new Calculable[] {
					new Effect(TypeEffect.DefP, false, 500, TypeCalcul.BASE),
					new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
					new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, ""); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, ""); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en ranger"); put(Language.EN, ""); }}, 31, "31-2", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, ""); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, ""); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en assassin"); put(Language.EN, ""); }}, 31, "31-3", new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, ""); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Restauration de PM"); put(Language.EN, ""); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en clerc"); put(Language.EN, ""); }}, 31, "31-4", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, ""); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Restauration de PM"); put(Language.EN, ""); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en sage"); put(Language.EN, ""); }}, 31, "31-5", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, ""); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, ""); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en sorcier"); put(Language.EN, ""); }}, 31, "31-6", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, ""); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, ""); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en nécromancien"); put(Language.EN, ""); }}, 31, "31-7", new Calculable[] {
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
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en métalleux"); put(Language.EN, ""); }}, 31, "31-8", null),
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
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en démolisseur"); put(Language.EN, ""); }}, 31, "31-9", null),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, ""); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 10),
						new Effect(TypeEffect.ReducM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 5),
						new Effect(TypeEffect.ReducM, false, 5),
						new Effect(TypeEffect.DegP, false, 5),
						new Effect(TypeEffect.DegM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 10),
						new Effect(TypeEffect.ReducM, false, 10),
						new Effect(TypeEffect.DegP, false, 20),
						new Effect(TypeEffect.DegM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, ""); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en spatiodériveur"); put(Language.EN, ""); }}, 31, "31-10", null),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Poids de l'univers"); put(Language.EN, ""); }}, 66, "66-0", new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.ReducP, false, 5),
					new Effect(TypeEffect.ReducM, false, 5),
					new Effect(TypeEffect.Atk, 50, TypeEffect.AtkM, TypeCalcul.CONVERT),
				}),
			},
			new Skill[] {
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, ""); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 10),
						new Effect(TypeEffect.ReducM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 5),
						new Effect(TypeEffect.ReducM, false, 5),
						new Effect(TypeEffect.DegP, false, 5),
						new Effect(TypeEffect.DegM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 10),
						new Effect(TypeEffect.ReducM, false, 10),
						new Effect(TypeEffect.DegP, false, 20),
						new Effect(TypeEffect.DegM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, ""); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Évolution en chronodériveur"); put(Language.EN, ""); }}, 31, "31-11", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
				new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Pouvoir du Temps"); put(Language.EN, ""); }}, 66, "66-1", new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			},
		};
	}
	
	public static Skill[] getUpgradeSkill() {
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
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 35),
						new Effect(TypeEffect.AGI, false, 55),
						new Effect(TypeEffect.Atk, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 40),
						new Effect(TypeEffect.AGI, false, 60),
						new Effect(TypeEffect.Atk, true, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 45),
						new Effect(TypeEffect.AGI, false, 65),
						new Effect(TypeEffect.Atk, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 50),
						new Effect(TypeEffect.AGI, false, 70),
						new Effect(TypeEffect.Atk, true, 7),
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
			new Skill(new HashMap<Language, String>() {{ put(Language.FR, "Âme Magique"); put(Language.EN, ""); }},
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
	
	public static ProSkill[][] getProSkill() {
		return new ProSkill[][] {
			LoaderProSkill.getClass0(),
			LoaderProSkill.getClass1(),
			LoaderProSkill.getClass2(),
			LoaderProSkill.getClass3(),
			LoaderProSkill.getClass4(),
			LoaderProSkill.getClass5(),
			LoaderProSkill.getClass6(),
			LoaderProSkill.getClass7(),
			LoaderProSkill.getClass8(),
			LoaderProSkill.getClass9(),
			LoaderProSkill.getClass10(),
			LoaderProSkill.getClass11(),
		};
	}
	
	public static Nucleus[][] getNucleus() {
		return new Nucleus[][] {
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +4%"); put(Language.EN, ""); }}, Quality.GREEN, "FCEgreen", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +2%"); put(Language.EN, ""); }}, Quality.GREEN, "VITgreen", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 2),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +4%"); put(Language.EN, ""); }}, Quality.GREEN, "INTgreen", new Calculable[] {
					new Effect(TypeEffect.INT, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +2%"); put(Language.EN, ""); }}, Quality.GREEN, "VOLgreen", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 2),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +4%"); put(Language.EN, ""); }}, Quality.GREEN, "AGIgreen", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 4),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +5%"); put(Language.EN, ""); }}, Quality.BLUE, "FCEblue", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +3%"); put(Language.EN, ""); }}, Quality.BLUE, "VITblue", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 3),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +5%"); put(Language.EN, ""); }}, Quality.BLUE, "INTblue", new Calculable[] {
					new Effect(TypeEffect.INT, true, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +3%"); put(Language.EN, ""); }}, Quality.BLUE, "VOLblue", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 3),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +5%"); put(Language.EN, ""); }}, Quality.BLUE, "AGIblue", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 5),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, ""); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +6%"); put(Language.EN, ""); }}, Quality.BLUE, "FCEblue", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +4%"); put(Language.EN, ""); }}, Quality.BLUE, "VITblue", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +6%"); put(Language.EN, ""); }}, Quality.BLUE, "INTblue", new Calculable[] {
					new Effect(TypeEffect.INT, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +4%"); put(Language.EN, ""); }}, Quality.BLUE, "VOLblue", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +6%"); put(Language.EN, ""); }}, Quality.BLUE, "AGIblue", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 6),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, ""); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8%"); put(Language.EN, ""); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6%"); put(Language.EN, ""); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8%"); put(Language.EN, ""); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6%"); put(Language.EN, ""); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8%"); put(Language.EN, ""); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8% - Réduc"); put(Language.EN, ""); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 6),
						new Effect(TypeEffect.ReducM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6% - Réduc"); put(Language.EN, ""); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 6),
						new Effect(TypeEffect.ReducM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8% - Réduc"); put(Language.EN, ""); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 6),
						new Effect(TypeEffect.ReducM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6% - Réduc"); put(Language.EN, ""); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 6),
						new Effect(TypeEffect.ReducM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8% - Réduc"); put(Language.EN, ""); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 6),
						new Effect(TypeEffect.ReducM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8% - Pirate"); put(Language.EN, ""); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6% - Pirate"); put(Language.EN, ""); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8% - Pirate"); put(Language.EN, ""); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6% - Pirate"); put(Language.EN, ""); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8% - Pirate"); put(Language.EN, ""); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, ""); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10%"); put(Language.EN, ""); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8%"); put(Language.EN, ""); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10%"); put(Language.EN, ""); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8%"); put(Language.EN, ""); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10%"); put(Language.EN, ""); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +5%"); put(Language.EN, ""); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +5%"); put(Language.EN, ""); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +5%"); put(Language.EN, ""); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +5%"); put(Language.EN, ""); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +5%"); put(Language.EN, ""); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +10%"); put(Language.EN, ""); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +10%"); put(Language.EN, ""); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +10%"); put(Language.EN, ""); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +10%"); put(Language.EN, ""); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +10%"); put(Language.EN, ""); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +15%"); put(Language.EN, ""); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +15%"); put(Language.EN, ""); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +15%"); put(Language.EN, ""); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +15%"); put(Language.EN, ""); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +15%"); put(Language.EN, ""); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, ""); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12%"); put(Language.EN, ""); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12%"); put(Language.EN, ""); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12%"); put(Language.EN, ""); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12% - Depla +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10% - Depla +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12% - Depla +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10% - Depla +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12% - Depla +10%"); put(Language.EN, ""); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12% - Depla +15%"); put(Language.EN, ""); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10% - Depla +15%"); put(Language.EN, ""); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12% - Depla +15%"); put(Language.EN, ""); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10% - Depla +15%"); put(Language.EN, ""); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12% - Depla +15%"); put(Language.EN, ""); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
			},
		};
	}
	
	public static Stone[] getStone() {
		return new Stone[] {
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Doctrines bien-aimées de Werther"); put(Language.EN, ""); }}, Quality.WHITE, "doctrine", new Calculable[] {
				new Effect(TypeEffect.RegenPM, false, 250),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Griffe de la Brute cristalline magique"); put(Language.EN, ""); }}, Quality.WHITE, "griffe", new Calculable[] {
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Pierre de Bénédiction de la Baie Bleue"); put(Language.EN, ""); }}, Quality.GREEN, "blueBay", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Gri-Gri porte-bonheur pour loterie"); put(Language.EN, ""); }} , Quality.WHITE, "grigri", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Carte de type bien manchot"); put(Language.EN, ""); }}, Quality.WHITE, "manchot", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Corne du Roi Triomphant"); put(Language.EN, ""); }}, Quality.WHITE, "corne", new Calculable[] {
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.DegM, false, 5),
				new Effect(TypeEffect.RegenPV, false, 250),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Pierre d'Invocation de Robolol de Hawk"); put(Language.EN, ""); }}, Quality.WHITE, "robolol", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Sac Trésor du Zéphyr"); put(Language.EN, ""); }}, Quality.WHITE, "sac", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Cristal magique du Chronodériveur"); put(Language.EN, ""); }}, Quality.GREEN, "chrono", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
				new Effect(TypeEffect.VIT, true, 1),
				new Effect(TypeEffect.INT, true, 1),
				new Effect(TypeEffect.VOL, true, 1),
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Pierre de chance du Mauvais esprit"); put(Language.EN, ""); }}, Quality.WHITE, "esprit", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Corne de Bataille de Smulca"); put(Language.EN, ""); }}, Quality.WHITE, "smulca", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Branche verte"); put(Language.EN, ""); }}, Quality.WHITE, "branche", new Calculable[] {
				new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 3),
			}),
			new Stone(new HashMap<Language, String>() {{ put(Language.FR, "Serment de 400 ans"); put(Language.EN, ""); }}, Quality.WHITE, "serment", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 40),
				new RegenEffect(TypeEffect.PV, true, -6, TypeRegen.REGENERATION, 1),
			}),
		};
	}
	
	public static Energy[] getEnergy() {
		return new Energy[] {
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Écarlate"); put(Language.EN, "Crimson"); }}, "red", new Effect[] {
				new Effect(TypeEffect.PV, false, 24, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Indigo"); put(Language.EN, "Azure"); }}, "blue", new Effect[] {
				new Effect(TypeEffect.PM, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Orange"); put(Language.EN, "Citrus"); }}, "orange", new Effect[] {
				new Effect(TypeEffect.Atk, false, 13, TypeCalcul.ADDITIONAL),
				new Effect(TypeEffect.AtkD, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Violette"); put(Language.EN, "Violet"); }}, "purple", new Effect[] {
				new Effect(TypeEffect.AtkM, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Émeraude"); put(Language.EN, "Emerald"); }}, "green", new Effect[] {
				new Effect(TypeEffect.DefP, false, 6, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Rose"); put(Language.EN, "Peach"); }}, "pink", new Effect[] {
				new Effect(TypeEffect.DefM, false, 5, TypeCalcul.ADDITIONAL),
			}),
		};
	}
	
	public static Blason[] getBlason() {
		return LoaderBlason.getBlason();
	}
}
