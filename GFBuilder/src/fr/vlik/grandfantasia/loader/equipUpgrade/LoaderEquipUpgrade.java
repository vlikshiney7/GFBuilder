package fr.vlik.grandfantasia.loader.equipUpgrade;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipUpgrade.CombiRunway;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.equipUpgrade.Runway;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class LoaderEquipUpgrade {
	
	@SuppressWarnings("serial")
	public static Map<Quality, Enchantment[]> getEnchant() {
		return new HashMap<Quality, Enchantment[]>() {{
			put(Quality.RED, LoaderEnchant.getRed());
			put(Quality.PURPLE, LoaderEnchant.getPurple());
			put(Quality.GOLD, LoaderEnchant.getGold());
			put(Quality.ORANGE, LoaderEnchant.getOrange());
			put(Quality.BLUE, LoaderEnchant.getBlue());
			put(Quality.GREEN, LoaderEnchant.getGreen());
		}};
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
			new RedFortification("+48", RedFortification.LEVEL[5], 2.83, 2.4, 3.26, 4),
			new RedFortification("+49", RedFortification.LEVEL[5], 2.915, 2.45, 3.38, 4),
			new RedFortification("+50", RedFortification.LEVEL[5], 3, 2.5, 3.5, 5),
		};
	}
	
	public static Pearl[] getWeaponPearl() {
		return LoaderPearl.getWeapon();
	}
	
	public static Pearl[] getArmorPearl() {
		return LoaderPearl.getArmor();
	}
	
	public static Pearl[] getWeaponCostPearl() {
		return LoaderPearl.getWeaponCost();
	}
	
	public static Pearl[] getArmorCostPearl() {
		return LoaderPearl.getArmorCost();
	}
	
	public static XpStuff[] getXpStuff() {
		return LoaderXpStuff.getXpStuff();
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
				new Effect(TypeEffect.ReducP, false, 3),
				new Effect(TypeEffect.ReducM, false, 3),
				new Proc(0, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 100),
					new Effect(TypeEffect.ReflectM, false, 100),
				}),
			}),
			new Runway("Bravoure", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.DefP, true, 2),
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
				new Effect(TypeEffect.ReducP, false, 3),
			}),
			new Runway("Hymne", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 4),
			}),
			new Runway("Illusion", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Runway("Lutte", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 5),
			}),
			new Runway("Malédiction", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill, 5),
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
				new Effect(TypeEffect.ReducM, false, 3),
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
			new Runway("Sorcier", new Calculable[] {
				new Effect(TypeEffect.DegM, false, 3),
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
	
	@SuppressWarnings("serial")
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
					Runway.get("Sorcier"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Tenue"); put(Language.EN, "Body Runway"); }},
				new Runway[] {
					Runway.get("Berserker"),
					Runway.get("Tempête"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Dos"); put(Language.EN, "Back Runway"); }},
				new Runway[] {
					Runway.get("Turbo"),
					Runway.get("Folie"),
				}),
			new CombiRunway(new HashMap<Language, String>() {{ put(Language.FR, "Runway Nouveauté"); put(Language.EN, "New Runway"); }},
				new Runway[] {
					Runway.get("Chance"),
					Runway.get("Ranger"),
					Runway.get("Praetor"),
				}),
		};
	}
}
