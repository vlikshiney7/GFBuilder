package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.EquipSet;
import fr.vlik.grandfantasia.Fortification;
import fr.vlik.grandfantasia.ProSkill;
import fr.vlik.grandfantasia.RedFortification;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Speciality;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.grandfantasia.Yggdrasil;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Armor;
import fr.vlik.grandfantasia.equipable.Bague;
import fr.vlik.grandfantasia.equipable.Cape;
import fr.vlik.grandfantasia.equipable.Ring;
import fr.vlik.grandfantasia.equipable.Weapon;
import fr.vlik.grandfantasia.stats.Effect;

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
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "0 - Aucun"); put(Language.EN, "0 - None"); }}, "null", null),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "1 - Alice"); put(Language.EN, "1 - Alice"); }}, "boss1", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "2 - Ronto"); put(Language.EN, "2 - Ronto"); }}, "boss2", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.XP, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "3 - Bodor"); put(Language.EN, "3 - Bodor"); }}, "boss3", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.DegP, false, 3),
				new Effect(TypeEffect.DegM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "4 - Smulca"); put(Language.EN, "4 - Smulca"); }}, "boss4", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.DegP, false, 3),
				new Effect(TypeEffect.DegM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "5 - Ewan"); put(Language.EN, "5 - Ewan"); }}, "boss5", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegP, false, 3),
				new Effect(TypeEffect.DegM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "6 - Bahadolo"); put(Language.EN, "6 - Bahadolo"); }}, "boss6", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.DegM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "7 - Quill"); put(Language.EN, "7 - Quill"); }}, "boss7", new Effect[] {
				new Effect(TypeEffect.FCE, true, 10),
				new Effect(TypeEffect.VIT, true, 10),
				new Effect(TypeEffect.INT, true, 10),
				new Effect(TypeEffect.VOL, true, 10),
				new Effect(TypeEffect.AGI, true, 10),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.DegM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "8 - Mosunk"); put(Language.EN, "8 - Mosunk"); }}, "boss8", new Effect[] {
				new Effect(TypeEffect.FCE, true, 10),
				new Effect(TypeEffect.VIT, true, 10),
				new Effect(TypeEffect.INT, true, 10),
				new Effect(TypeEffect.VOL, true, 10),
				new Effect(TypeEffect.AGI, true, 10),
				new Effect(TypeEffect.XP, false, 11),
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.DegM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "9 - Jundo"); put(Language.EN, "9 - Jundo"); }}, "boss9", new Effect[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.VIT, true, 10),
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.VOL, true, 10),
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.XP, false, 11),
					new Effect(TypeEffect.DegP, false, 7),
					new Effect(TypeEffect.DegM, false, 7),
					new Effect(TypeEffect.PeneP, false, 7),
					new Effect(TypeEffect.PeneM, false, 7),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "10 - Siropas"); put(Language.EN, "10 - Siropas"); }}, "boss10", new Effect[] {
					new Effect(TypeEffect.FCE, true, 15),
					new Effect(TypeEffect.VIT, true, 15),
					new Effect(TypeEffect.INT, true, 15),
					new Effect(TypeEffect.VOL, true, 15),
					new Effect(TypeEffect.AGI, true, 15),
					new Effect(TypeEffect.XP, false, 11),
					new Effect(TypeEffect.DegP, false, 7),
					new Effect(TypeEffect.DegM, false, 7),
					new Effect(TypeEffect.PeneP, false, 7),
					new Effect(TypeEffect.PeneM, false, 7),
			})
		};
	}
	
	public static Weapon[][] getWeapon() {
		return new Weapon[][] {
			LoaderWeapon.getEp1M(),
			LoaderWeapon.getMa1M(),
			LoaderWeapon.getHa1M(),
			LoaderWeapon.getEp2M(),
			LoaderWeapon.getMa2M(),
			LoaderWeapon.getHa2M(),
			LoaderWeapon.getMeca1M(),
			LoaderWeapon.getMeca2M(),
			LoaderWeapon.getArc(),
			LoaderWeapon.getGun(),
			LoaderWeapon.getCanon(),
			LoaderWeapon.getRel(),
			LoaderWeapon.getBaton(),
			LoaderWeapon.getLame(),
			LoaderWeapon.getCle(),
			LoaderWeapon.getBouclier(),
			LoaderWeapon.getDefault(),
		};
	}
	
	public static Armor[][] getArmor() {
		return new Armor[][] {
			LoaderHelmet.getHelmet(),
			LoaderBreastplate.getBreastplate(),
			LoaderLegging.getLegging(),
			LoaderGauntlet.getGauntlet(),
			LoaderBoot.getBoot()
		};
	}

	public static EquipSet[] getArmorSet() {
		return LoaderEquipSet.getArmor();
	}

	public static EquipSet[] getCapeRingSet() {
		return LoaderEquipSet.getCapeRing();
	}
	
	public static Cape[] getCape() {
		return LoaderCape.getCape();
	}
	
	public static Ring[] getRing() {
		return LoaderRing.getRing();
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
			new RedFortification("+43", RedFortification.LEVEL[5], 2.45, 2.15, 2.75, 4),
			new RedFortification("+44", RedFortification.LEVEL[5], 2.52, 2.2, 2.84, 4),
			new RedFortification("+45", RedFortification.LEVEL[5], 2.595, 2.25, 2.94, 4),
			new RedFortification("+46", RedFortification.LEVEL[5], 2.67, 2.3, 3.04, 4),
			new RedFortification("+47", RedFortification.LEVEL[5], 2.75, 2.35, 3.15, 4),
			//------- CONJECTURE ---------------------------------------------------------
			new RedFortification("+48", RedFortification.LEVEL[5], 2.83, 2.4, 3.26, 4),
			new RedFortification("+49", RedFortification.LEVEL[5], 2.91, 2.45, 3.37, 4),
			new RedFortification("+50", RedFortification.LEVEL[5], 2.99, 2.5, 3.48, 5),
		};
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
	
	public static Bague[] getBague() {
		return new Bague[] {
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique"); put(Language.EN, "Magical Passion Ring"); }}, Quality.BLUE, "blue", new Effect[] {
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Atk, false, 10, true),
				new Effect(TypeEffect.AtkD, false, 10, true),
				new Effect(TypeEffect.AtkM, false, 10, true),
			}),
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique 5 carats"); put(Language.EN, "5-Carat Magical Passion Ring"); }}, Quality.GOLD, "gold", new Effect[] {
				new Effect(TypeEffect.FCE, false, 10, true),
				new Effect(TypeEffect.VIT, false, 10, true),
				new Effect(TypeEffect.INT, false, 10, true),
				new Effect(TypeEffect.VOL, false, 10, true),
				new Effect(TypeEffect.AGI, false, 10, true),
				new Effect(TypeEffect.Atk, false, 20, true),
				new Effect(TypeEffect.AtkD, false, 20, true),
				new Effect(TypeEffect.AtkM, false, 20, true),
			}),
		};
	}

	public static Energy[] getEnergy() {
		return new Energy[] {
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Écarlate"); put(Language.EN, "Crimson"); }}, "red", new Effect[] {
					new Effect(TypeEffect.PV, false, 24),
				}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Indigo"); put(Language.EN, "Azure"); }}, "blue", new Effect[] {
					new Effect(TypeEffect.PM, false, 10),
				}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Orange"); put(Language.EN, "Citrus"); }}, "orange", new Effect[] {
					new Effect(TypeEffect.Atk, false, 13),
					new Effect(TypeEffect.AtkD, false, 10),
				}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Violette"); put(Language.EN, "Violet"); }}, "purple", new Effect[] {
					new Effect(TypeEffect.AtkM, false, 10),
				}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Émeraude"); put(Language.EN, "Emerald"); }}, "green", new Effect[] {
					new Effect(TypeEffect.DefP, false, 6),
				}),
				new Energy(new HashMap<Language, String>() {{ put(Language.FR, "Rose"); put(Language.EN, "Peach"); }}, "pink", new Effect[] {
					new Effect(TypeEffect.DefM, false, 5),
				}),
		};
	}
}
