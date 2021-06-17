package fr.vlik.grandfantasia.loader.subEquip;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.subEquip.Anima;
import fr.vlik.grandfantasia.subEquip.Bague;
import fr.vlik.grandfantasia.subEquip.CombiRunway;
import fr.vlik.grandfantasia.subEquip.Costume;
import fr.vlik.grandfantasia.subEquip.Runway;
import fr.vlik.grandfantasia.subEquip.Souvenir;
import fr.vlik.grandfantasia.subEquip.SouvenirEnchantment;
import fr.vlik.grandfantasia.subEquip.Synthesis;

@SuppressWarnings("serial")
public class LoaderSubEquip {
	
	public static Map<Quality, Synthesis[]> getRideSynthesis() {
		return new HashMap<Quality, Synthesis[]>() {{
			put(Quality.GOLD, LoaderSynthesis.getRideGold());
			put(Quality.ORANGE, LoaderSynthesis.getRideOrange());
			put(Quality.BLUE, LoaderSynthesis.getRideBlue());
			put(Quality.GREEN, LoaderSynthesis.getRideGreen());
			put(Quality.WHITE, LoaderSynthesis.getRideWhite());
		}};
	}
	
	public static Map<Quality, Synthesis[]> getThroneSynthesis() {
		return new HashMap<Quality, Synthesis[]>() {{
			put(Quality.GOLD, LoaderSynthesis.getThroneGold());
			put(Quality.ORANGE, LoaderSynthesis.getThroneOrange());
			put(Quality.BLUE, LoaderSynthesis.getThroneBlue());
			put(Quality.GREEN, LoaderSynthesis.getThroneGreen());
			put(Quality.WHITE, LoaderSynthesis.getThroneWhite());
		}};
	}
	
	public static Map<Quality, Costume[]> getCostume() {
		return new HashMap<Quality, Costume[]>() {{
			put(Quality.GOLD, LoaderCostume.getGold());
			put(Quality.BLUE, LoaderCostume.getBlue());
			put(Quality.GREEN, LoaderCostume.getGreen());
			put(Quality.WHITE, LoaderCostume.getWhite());
		}};
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
	
	public static Anima[] getAnima() {
		return LoaderAnima.getAnima();
	}
	
	public static Runway[] getRunway() {
		return new Runway[] {
			new Runway("Archimage", new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Atk, true, 1),
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Runway("Aurore", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
			}),
			new Runway("Berserker", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Runway("Bouclier", new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
				new Effect(TypeEffect.PM, true, 2),
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.ReducSkillM, false, 3),
				new Proc(0, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 100),
					new Effect(TypeEffect.ReflectM, false, 100),
				}),
			}),
			new Runway("Bravoure", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
			}),
			new Runway("Chance", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
				new Effect(TypeEffect.RTCCP, false, 2),
				new Effect(TypeEffect.RTCCM, false, 2),
			}),
			new Runway("Enchantement", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
			new Runway("Folie", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.BoostCraft, false, 2),
			}),
			new Runway("Gardien", new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 3),
			}),
			new Runway("Hymne", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 4),
			}),
			new Runway("Illusion", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Runway("Lutte", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD_old, 5),
			}),
			new Runway("Malédiction", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 5),
			}),
			new Runway("Praetor", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.AGI, false, 6),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Runway("Prêtre", new Calculable[] {
				new Effect(TypeEffect.ReducM_old, false, 3),
			}),
			new Runway("Ranger", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.ESQ, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Runway("Rapidité", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Runway("Sagesse", new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Runway("Sceau de VOL", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 14),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Runway("Sorcier", new Calculable[] {
				new Effect(TypeEffect.DegM_old, false, 3),
			}),
			new Runway("Synthétisation", new Calculable[] {
				new Effect(TypeEffect.BoostCraft, false, 2),
				new Effect(TypeEffect.RTCCP, false, 4),
				new Effect(TypeEffect.RTCCM, false, 4),
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.RDCCM, false, 8),
			}),
			new Runway("Tempête", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Runway("Turbo", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.VitAtk, false, 2),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
		};
	}
	
	public static CombiRunway[] getCombiRunway() {
		return new CombiRunway[] {
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Arme"); put(Language.EN, "Weapon Runway"); }},
				new Runway[] {
					Runway.get("Lutte"),
					Runway.get("Malédiction"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Tête"); put(Language.EN, "Head Runway"); }},
				new Runway[] {
					Runway.get("Prêtre"),
					Runway.get("Hymne"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Tenue"); put(Language.EN, "Body Runway"); }},
				new Runway[] {
					Runway.get("Sceau de VOL"),
					Runway.get("Tempête"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Dos"); put(Language.EN, "Back Runway"); }},
				new Runway[] {
					Runway.get("Turbo"),
					Runway.get("Synthétisation"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Nouveauté"); put(Language.EN, "New Runway"); }},
				new Runway[] {
					Runway.get("Bravoure"),
					Runway.get("Ranger"),
					Runway.get("Praetor"),
				}),
		};
	}

	public static Souvenir[] getSouvenir() {
		return new Souvenir[] {
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Lézard des glaces en peluche"); put(Language.EN, "Chillclaw Lizard Doll"); }}, 73, Quality.ORANGE, "73orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 460, true),
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.INT, false, 7, true),
				new Effect(TypeEffect.AGI, false, 7, true),
				new Effect(TypeEffect.Sacre, false, 15),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Singe de métal dur en peluche"); put(Language.EN, "Golden Armored Ape Doll"); }}, 68, Quality.GREEN, "68green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 402, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 4, true),
				new Effect(TypeEffect.Foudre, false, 13),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Fée Joyau du Val en peluche"); put(Language.EN, "Snow Faerie Sprite Doll"); }}, 63, Quality.WHITE, "63white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 347, true),
				new Effect(TypeEffect.PV, false, 480),
				new Effect(TypeEffect.Glace, false, 10),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Géant diabolique en peluche"); put(Language.EN, "Evil Eye Doll"); }}, 58, Quality.ORANGE, "58orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 394, true),
				new Effect(TypeEffect.FCE, false, 6, true),
				new Effect(TypeEffect.INT, false, 6, true),
				new Effect(TypeEffect.AGI, false, 6, true),
				new Effect(TypeEffect.Nature, false, 14),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Gobelin masqué en peluche"); put(Language.EN, "Masked Goblin Doll"); }}, 53, Quality.GREEN, "53green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 340, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.Ombre, false, 11),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Chèvre cornue en peluche"); put(Language.EN, "Crook-Horned Goat Doll"); }}, 48, Quality.WHITE, "48white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 272, true),
				new Effect(TypeEffect.PV, false, 400),
				new Effect(TypeEffect.Feu, false, 9),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Grosse chauve-souris vampire en peluche"); put(Language.EN, "Fat Vampire Bat Doll"); }}, 43, Quality.ORANGE, "43orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 322, true),
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 4, true),
				new Effect(TypeEffect.Glace, false, 12),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Araignée sanguinaire en peluche"); put(Language.EN, "Blood Spider Doll"); }}, 38, Quality.GREEN, "38green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 271, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 2, true),
				new Effect(TypeEffect.Sacre, false, 10),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Grosse larve en peluche"); put(Language.EN, "Pinchworm Doll"); }}, 33, Quality.WHITE, "33white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 224, true),
				new Effect(TypeEffect.PV, false, 240),
				new Effect(TypeEffect.Foudre, false, 7),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Ourson en peluche"); put(Language.EN, "Honey Bear Doll"); }}, 28, Quality.ORANGE, "28orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 240, true),
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Feu, false, 11),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Cerf noctambule en peluche"); put(Language.EN, "Woodland Deer Doll"); }}, 23, Quality.GREEN, "23green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 191, true),
				new Effect(TypeEffect.VIT, false, 1, true),
				new Effect(TypeEffect.VOL, false, 1, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Crabe à Carapace en peluche"); put(Language.EN, "Shell Crab Doll"); }}, 18, Quality.WHITE, "18white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 145, true),
				new Effect(TypeEffect.PV, false, 160),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Poupée de Gélapin"); put(Language.EN, "Jelly Rabbit Doll"); }}, 12, Quality.WHITE, "12white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 103, true),
				new Effect(TypeEffect.PV, false, 80),
				new Effect(TypeEffect.Sacre, false, 5),
			}),
		};
	}
	
	public static SouvenirEnchantment[] getSouvenirEnchantment() {
		return LoaderSouvenirEnchantment.getSouvenirEnchantment();
	}
}
