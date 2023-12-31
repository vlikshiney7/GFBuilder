package fr.vlik.grandfantasia.loader.equip;

import java.util.EnumMap;
import java.util.stream.Stream;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.MultipleHit;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.SkillEffect.TypeValue;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderEquipSet extends LoaderTemplate {
	
	static EquipSet[] getArmor() {
		return Stream.of(getGuerrier(), getArcher(), getPretre(), getMage(), getMeca(), getVoyageur(), getAll()).flatMap(Stream::of).toArray(EquipSet[]::new);
	}
	
	private static EquipSet[] getGuerrier() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de terre du roi de la bataille"); put(Language.EN, ""); }}, "90red0", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Trembleur de terre"); put(Language.EN, ""); }}, "10ans90red0", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fierté pétrifiante"); put(Language.EN, ""); }}, "100vio0", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur Arlong"); put(Language.EN, ""); }}, "90vio0", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Belliqueux d'Aiolia"); put(Language.EN, ""); }}, "80vio0", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissante de Khal Drogo"); put(Language.EN, ""); }}, "100gold0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 60),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.DegDuo, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 20),
					new Effect(TypeEffect.DegHa2M, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 60),
					new SkillEffect(TypeSkillEffect.Class0S0, 10, TypeValue.DURATION),
					new Proc(7, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sanguinaire Kenpachi"); put(Language.EN, ""); }}, "90gold0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.VIT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.VitAtk, false, 23),
					new Proc(20, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 10),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Trembleur de terre"); put(Language.EN, ""); }}, "10ans90gold0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.VIT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.VitAtk, false, 23),
					new Proc(20, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 10),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vengeance de Mordred"); put(Language.EN, ""); }}, "80gold0",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 20),
					new Effect(TypeEffect.FCE, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros Bestial"); put(Language.EN, ""); }}, "100pve0",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.VIT, false, 15),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 15),
					new Proc(10, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Glace, false, 20),
						new Effect(TypeEffect.DegFeu, false, 600),
					}, 18),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explorateur Fondu"); put(Language.EN, ""); }}, "95pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Proc(100, Activation.Attack, 4, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 3),
					}, 0.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Feu Fanatique"); put(Language.EN, ""); }}, "90pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.TCCP, false, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de l'Ours Terrifiant"); put(Language.EN, ""); }}, "85pve0",
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Effect(TypeEffect.VIT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie du Maître"); put(Language.EN, ""); }}, "80pve0",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.FCE, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur du Berserker"); put(Language.EN, ""); }}, "75pve0",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
					new Effect(TypeEffect.VIT, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21),
					new Effect(TypeEffect.TCCP, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier Suprême"); put(Language.EN, ""); }}, "70pve0",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 8),
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Boucher de Saphaël"); put(Language.EN, ""); }}, "65pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.DCCP, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new SkillEffect(TypeSkillEffect.Class0S1, 40, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marquis de l'ombre"); put(Language.EN, ""); }}, "60pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S6, 30, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destructrice à Lame d'Acier"); put(Language.EN, ""); }}, "50pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8),
					new Effect(TypeEffect.VIT, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S3, 20, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier robuste"); put(Language.EN, ""); }}, "40pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
				},
				new Calculable[] {
					new Proc(50, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Officier tactique"); put(Language.EN, ""); }}, "30pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Garde d'Elite"); put(Language.EN, ""); }}, "20pve0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S4, 50, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Apostat"); put(Language.EN, ""); }}, "100pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Effect(TypeEffect.FCE, false, 66),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 94),
					new Effect(TypeEffect.ReducStdP, false, 33),
					new Effect(TypeEffect.ReducStdD, false, 33),
					new Effect(TypeEffect.ReducSkillP, false, 33),
					new SkillEffect(TypeSkillEffect.Class0S5, 83, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 39),
					new Effect(TypeEffect.PeneP, false, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Apostat"); put(Language.EN, ""); }}, "100pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.FCE, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 85),
					new Effect(TypeEffect.ReducStdP, false, 30),
					new Effect(TypeEffect.ReducStdD, false, 30),
					new Effect(TypeEffect.ReducSkillP, false, 30),
					new SkillEffect(TypeSkillEffect.Class0S5, 75, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 35),
					new Effect(TypeEffect.PeneP, false, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Courroux Sanguinaire"); put(Language.EN, ""); }}, "95pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.FCE, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 88),
					new Effect(TypeEffect.ReducStdP, false, 28),
					new Effect(TypeEffect.ReducStdD, false, 28),
					new Effect(TypeEffect.ReducSkillP, false, 28),
					new SkillEffect(TypeSkillEffect.Class0S5, 55, TypeValue.DAMAGE),
					new Proc(30, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 33),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -193, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Courroux Sanguinaire"); put(Language.EN, ""); }}, "95pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.FCE, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 80),
					new Effect(TypeEffect.ReducStdP, false, 25),
					new Effect(TypeEffect.ReducStdD, false, 25),
					new Effect(TypeEffect.ReducSkillP, false, 25),
					new SkillEffect(TypeSkillEffect.Class0S5, 50, TypeValue.DAMAGE),
					new Proc(30, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -175, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Gladiateur du Hokuto"); put(Language.EN, ""); }}, "85pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.FCE, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 88),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Effect(TypeEffect.CostComp, false, -88),
					new Proc(25, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -165, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gladiateur du Hokuto"); put(Language.EN, ""); }}, "85pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 32),
					new Effect(TypeEffect.RTCCM, false, 32),
					new Effect(TypeEffect.FCE, false, 38),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 80),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.CostComp, false, -80),
					new Proc(25, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 27),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -150, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance d'Héraclès (Reforgé)"); put(Language.EN, ""); }}, "75pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 83),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Effect(TypeEffect.CostComp, false, -77),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 28),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -165, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance d'Héraclès"); put(Language.EN, ""); }}, "75pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 36),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 75),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.CostComp, false, -70),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 25),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -150, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Stratégie de Sun Tzu (Reforgée)"); put(Language.EN, ""); }}, "65pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.FCE, false, 31),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 66),
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -110, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -110, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Stratégie de Sun Tzu"); put(Language.EN, ""); }}, "65pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.FCE, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -100, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi Diabolique (Reforgée)"); put(Language.EN, ""); }}, "55pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 55),
					new SkillEffect(TypeSkillEffect.Class0S6, 33, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 11),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -82, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -82, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi du mal"); put(Language.EN, ""); }}, "55pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 50),
					new SkillEffect(TypeSkillEffect.Class0S6, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Général Diabolique (Reforgé)"); put(Language.EN, ""); }}, "45pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.FCE, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 34),
					new SkillEffect(TypeSkillEffect.Class0S6, 22, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -55, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -55, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Général Diabolique"); put(Language.EN, ""); }}, "45pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.FCE, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 30),
					new SkillEffect(TypeSkillEffect.Class0S6, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hurlement de Conan (Reforgé)"); put(Language.EN, ""); }}, "25pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new Effect(TypeEffect.FCE, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 22),
					new SkillEffect(TypeSkillEffect.Class0S6, 12, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -34, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -34, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hurlement de Conan"); put(Language.EN, ""); }}, "25pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.FCE, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 20),
					new SkillEffect(TypeSkillEffect.Class0S6, 10, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -30, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -30, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dieu de la Guerre"); put(Language.EN, ""); }}, "80nucleus0",
				new Calculable[] {
					new Effect(TypeEffect.ReducStdD, false, 25),
					new SkillEffect(TypeSkillEffect.Class0S7, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 1100),
					}),
				},
				new Calculable[] {
					new Proc(35, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 30),
						new Effect(TypeEffect.DefP, true, 18),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armée Sanguinaire"); put(Language.EN, ""); }}, "70nucleus0",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18),
					new SkillEffect(TypeSkillEffect.Class0S8, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(45, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.DefP, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marquis du Chaos"); put(Language.EN, ""); }}, "60nucleus0",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S9, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Proc(20, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 35),
					}, 8),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -75, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -75, Target.OPPONENT),
					}, 17),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hurlement Divin"); put(Language.EN, ""); }}, "80lingot0",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegGlace, false, 1100),
					}),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S8, 30, TypeValue.DAMAGE),
					new Proc(20, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Proc(25, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 70),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif de Mort"); put(Language.EN, ""); }}, "70lingot0",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new SkillEffect(TypeSkillEffect.Class0S7, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(30, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 35),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marquis de la Destruction"); put(Language.EN, ""); }}, "60lingot0",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S2, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S1, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 35),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Proc(50, Activation.Phys, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 800),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Féroce Tigre de Combat"); put(Language.EN, ""); }}, "90gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 70),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -120, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -120, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rage du Minotaure"); put(Language.EN, ""); }}, "80gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 65),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -100, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Conquête d'Attila"); put(Language.EN, ""); }}, "70gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Destructeur (Réincarné)"); put(Language.EN, ""); }}, "100evo0R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Destructeur"); put(Language.EN, ""); }}, "100evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ravageur (Réincarné)"); put(Language.EN, ""); }}, "90evo0R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ravageur"); put(Language.EN, ""); }}, "90evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Gladiateur (Réincarné)"); put(Language.EN, ""); }}, "75evo0R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Gladiateur"); put(Language.EN, ""); }}, "75evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Berserker (Réincarné)"); put(Language.EN, ""); }}, "60evo0R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Berserker"); put(Language.EN, ""); }}, "60evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Guerrier (Réincarné)"); put(Language.EN, ""); }}, "30evo0R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Guerrier"); put(Language.EN, ""); }}, "30evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne de l'Honneur et du Triomphe"); put(Language.EN, ""); }}, "90red1", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Triomphe"); put(Language.EN, ""); }}, "10ans90red1", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Immortalité du damné"); put(Language.EN, ""); }}, "100vio1", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Templier Résolu"); put(Language.EN, ""); }}, "90vio1", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur Voldo"); put(Language.EN, ""); }}, "80vio1", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épique de Brienne"); put(Language.EN, ""); }}, "100gold1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.DegStdP, false, 18),
					new Effect(TypeEffect.DegSkillP, false, 18),
					new Effect(TypeEffect.Parade, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Effect(TypeEffect.MEN, false, 30),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.FCE, true, 40),
						new Effect(TypeEffect.ReflectP_old, false, 50),
						new Effect(TypeEffect.ReflectM_old, false, 50),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.Sacre, false, 15),
					new Effect(TypeEffect.Ombre, false, 15),
					new Effect(TypeEffect.Foudre, false, 15),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.Glace, false, 15),
					new Effect(TypeEffect.Nature, false, 15),
					new SkillEffect(TypeSkillEffect.Class1S0, 50, TypeValue.DAMAGE),
					new Proc(10, Activation.Attacked, 1.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vertueux Parsifal"); put(Language.EN, ""); }}, "90gold1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.MEN, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VitAtk, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 30),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefM, true, 40),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Triomphe"); put(Language.EN, ""); }}, "10ans90gold1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.MEN, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VitAtk, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 30),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefM, true, 40),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Châtiment de Baldur"); put(Language.EN, ""); }}, "80gold1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.VIT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new Effect(TypeEffect.Parade, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Plume Verte"); put(Language.EN, ""); }}, "100pve1",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.Ombre, false, 20),
					new Proc(15, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.DegStdD, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.DegSkillP, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
					}, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Proc(10, Activation.Attacked, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION, 1),
					}, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier Béni"); put(Language.EN, ""); }}, "95pve1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 20),
					new Effect(TypeEffect.MEN, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.Toucher, false, 5),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefM, true, 50),
						new Effect(TypeEffect.ReflectP_old, false, 50),
						new Effect(TypeEffect.ReflectM_old, false, 50),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ailes Divines"); put(Language.EN, ""); }}, "90pve1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21),
					new Effect(TypeEffect.MEN, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme du Lion Glorieux"); put(Language.EN, ""); }}, "85pve1",
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.VIT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Colère Divine"); put(Language.EN, ""); }}, "80pve1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier Céleste"); put(Language.EN, ""); }}, "75pve1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.Parade, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 45),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
					new StaticEffect(TypeStaticEffect.AntiStun),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pureté du Paladin"); put(Language.EN, ""); }}, "70pve1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new Effect(TypeEffect.VOL, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.DCCP, false, 70),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier de l'Eclipse Blanche"); put(Language.EN, ""); }}, "65pve1",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Effect(TypeEffect.Parade, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S1, 15, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S2, 50, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Duc Impérial"); put(Language.EN, ""); }}, "60pve1",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S3, 12, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.PV, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 45),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destructeur"); put(Language.EN, ""); }}, "50pve1",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S4, 15, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 35),
					new Effect(TypeEffect.VIT, false, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier du Fort"); put(Language.EN, ""); }}, "40pve1",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S8, 50, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new Effect(TypeEffect.MEN, false, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Gardien éclairé"); put(Language.EN, ""); }}, "100pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39),
					new Effect(TypeEffect.FCE, false, 28),
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 94),
					new Effect(TypeEffect.PV, true, 22),
					new SkillEffect(TypeSkillEffect.Class1S6, 83, TypeValue.DAMAGE),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 28),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.Parade, false, 33),
					new Effect(TypeEffect.PeneP, false, 17),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(35, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien éclairé"); put(Language.EN, ""); }}, "100pvp1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35),
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 85),
					new Effect(TypeEffect.PV, true, 20),
					new SkillEffect(TypeSkillEffect.Class1S6, 75, TypeValue.DAMAGE),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 25),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.Parade, false, 30),
					new Effect(TypeEffect.PeneP, false, 15),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(35, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Bouclier du Monde Encyclique"); put(Language.EN, ""); }}, "95pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 88),
					new Effect(TypeEffect.PV, true, 19),
					new SkillEffect(TypeSkillEffect.Class1S6, 55, TypeValue.DAMAGE),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 13),
					new Effect(TypeEffect.Parade, false, 28),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier du Monde Encyclique"); put(Language.EN, ""); }}, "95pvp1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 80),
					new Effect(TypeEffect.PV, true, 17),
					new SkillEffect(TypeSkillEffect.Class1S6, 50, TypeValue.DAMAGE),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 18),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 12),
					new Effect(TypeEffect.Parade, false, 25),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Vindicateur Shichibukai"); put(Language.EN, ""); }}, "85pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.FCE, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 83),
					new Effect(TypeEffect.PV, true, 19),
					new Effect(TypeEffect.Parade, false, 22),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 17),
					}, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(32, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vindicateur Shichibukai"); put(Language.EN, ""); }}, "85pvp1",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.FCE, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 75),
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.Parade, false, 20),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 15),
					}, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(32, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense infinie (Reforgé)"); put(Language.EN, ""); }}, "75pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.FCE, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 77),
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.Parade, false, 22),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(33, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ardeur de Zatoichi"); put(Language.EN, ""); }}, "75pvp1",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.VIT, false, 23),
					new Effect(TypeEffect.FCE, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 70),
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.Parade, false, 20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vertu de Galahad (Reforgé)"); put(Language.EN, ""); }}, "65pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.FCE, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 66),
					new Effect(TypeEffect.Parade, false, 17),
					new Effect(TypeEffect.PV, true, 12),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vertu de Galahad"); put(Language.EN, ""); }}, "65pvp1",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.VIT, false, 18),
					new Effect(TypeEffect.FCE, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.Parade, false, 15),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense absolue (Reforgée)"); put(Language.EN, ""); }}, "55pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Effect(TypeEffect.FCE, false, 8),
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 55),
					new SkillEffect(TypeSkillEffect.Class1S7, 44, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.Parade, false, 17),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense absolue"); put(Language.EN, ""); }}, "55pvp1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 50),
					new SkillEffect(TypeSkillEffect.Class1S7, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.Parade, false, 15),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense Parfaite (Reforgé)"); put(Language.EN, ""); }}, "45pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 34),
					new SkillEffect(TypeSkillEffect.Class1S7, 27, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 12),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense parfaite"); put(Language.EN, ""); }}, "45pvp1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.FCE, false, 5),
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 30),
					new SkillEffect(TypeSkillEffect.Class1S7, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 10),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense de Lancelot (Reforgé)"); put(Language.EN, ""); }}, "25pvp1R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.FCE, false, 4),
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 22),
					new SkillEffect(TypeSkillEffect.Class1S8, 12, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.Parade, false, 12),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -35, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense de Lancelot"); put(Language.EN, ""); }}, "25pvp1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.FCE, false, 3),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new SkillEffect(TypeSkillEffect.Class1S8, 10, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 10),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Thaumaturge Exalté"); put(Language.EN, ""); }}, "80nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new SkillEffect(TypeSkillEffect.Class1S9, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 8),
					new Proc(18, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -40, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Licorne Céleste"); put(Language.EN, ""); }}, "70nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.FCE, false, 21),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdD, false, 40),
					new SkillEffect(TypeSkillEffect.Class1S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Juge Impérial"); put(Language.EN, ""); }}, "60nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Proc(45, Activation.Attack, 10, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoItem, Target.OPPONENT),
					}, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new SkillEffect(TypeSkillEffect.Class1S11, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 22),
					new Effect(TypeEffect.AGI, false, 22),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voix de la Création"); put(Language.EN, ""); }}, "80lingot1",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21),
					new SkillEffect(TypeSkillEffect.Class1S5, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new Proc(60, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -40, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier des Saints"); put(Language.EN, ""); }}, "70lingot1",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.Foudre, false, 60),
					new Effect(TypeEffect.Feu, false, 60),
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.AGI, false, 21),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S9, 35, TypeValue.DAMAGE),
					new Proc(27, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 40),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 22),
					new Proc(32, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.ReducSkillP, false, 75),
						new Effect(TypeEffect.ReducSkillM, false, 75),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien Impérial"); put(Language.EN, ""); }}, "60lingot1",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new SkillEffect(TypeSkillEffect.Class1S8, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 10),
					new Effect(TypeEffect.FCE, false, 18),
					new Effect(TypeEffect.MEN, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rhino des Cieux Sacrés"); put(Language.EN, ""); }}, "90gvg1",
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 70),
					new Effect(TypeEffect.VIT, false, 27),
					new Effect(TypeEffect.VOL, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.PV, true, 17),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force des Titans"); put(Language.EN, ""); }}, "80gvg1",
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 65),
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.VOL, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.PV, true, 17),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Noblesse de Siegfried"); put(Language.EN, ""); }}, "70gvg1",
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.VOL, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.PV, true, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Croisé (Réincarné)"); put(Language.EN, ""); }}, "100evo1R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Croisé"); put(Language.EN, ""); }}, "100evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Templier (Réincarné)"); put(Language.EN, ""); }}, "90evo1R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Templier"); put(Language.EN, ""); }}, "90evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Vindicateur (Réincarné)"); put(Language.EN, ""); }}, "75evo1R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Vindicateur"); put(Language.EN, ""); }}, "75evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Paladin (Réincarné)"); put(Language.EN, ""); }}, "60evo1R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Paladin"); put(Language.EN, ""); }}, "60evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}

	private static EquipSet[] getArcher() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tir du Prédateur Silencieux"); put(Language.EN, ""); }}, "90red2", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Prédateur"); put(Language.EN, ""); }}, "10ans90red2", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Faucon tempétueux"); put(Language.EN, ""); }}, "100vio2", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dévastateur de Mihawk"); put(Language.EN, ""); }}, "90vio2", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cavalier du Vent"); put(Language.EN, ""); }}, "80vio2", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Céleste de Kikyo"); put(Language.EN, ""); }}, "100gold2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 60),
					new Effect(TypeEffect.Depla, false, 10),
					new Effect(TypeEffect.RegenCB, false, 8),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S2, 35, TypeValue.DAMAGE),
					new Proc(18, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, -18, Target.OPPONENT),
						new Effect(TypeEffect.DegStdD, false, -18, Target.OPPONENT),
						new Effect(TypeEffect.DegSkillP, false, -18, Target.OPPONENT),
						new Effect(TypeEffect.Toucher, false, -18, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new RegenEffect(TypeEffect.PM, false, 35, TypeRegen.ABSORPTION),
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Visée Quincy"); put(Language.EN, ""); }}, "90gold2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.ESQ, true, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 16),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -40, Target.OPPONENT),
					}, 40),
				}),

			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Prédateur"); put(Language.EN, ""); }}, "10ans90gold2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.ESQ, true, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 16),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -40, Target.OPPONENT),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sauvagerie d'Artémis"); put(Language.EN, ""); }}, "80gold2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new Effect(TypeEffect.ESQ, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
					new SkillEffect(TypeSkillEffect.Class2S1, 8, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S3, 8, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soleil Hurlant"); put(Language.EN, ""); }}, "100pve2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.DegStdP, false, 10),
					new Effect(TypeEffect.DegStdD, false, 10),
					new Effect(TypeEffect.DegSkillP, false, 10),
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.VitAtkD, false, 10),
					new Proc(100, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 300),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new Proc(20, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
					}, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne des Vents"); put(Language.EN, ""); }}, "95pve2",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.VitAtkD, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
					new Effect(TypeEffect.DCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Effect(TypeEffect.ESQ, true, 10),
					new Proc(10, Activation.Attack, 7, 5, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 2),
						new Effect(TypeEffect.DegStdD, false, 2),
						new Effect(TypeEffect.DegSkillP, false, 2),
					}, 1.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Lunaire"); put(Language.EN, ""); }}, "90pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 14),
					new Effect(TypeEffect.CostComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de l'Onyx Intrépide"); put(Language.EN, ""); }}, "85pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
					new Effect(TypeEffect.DCCP, false, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glorieux Traqueur"); put(Language.EN, ""); }}, "80pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 8, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S3, 8, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sniper Météoritique"); put(Language.EN, ""); }}, "75pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14),
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.CostComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fougue de Manco Capac"); put(Language.EN, ""); }}, "70pve2",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new Effect(TypeEffect.AtkD, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.DCCP, false, 45),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ranger Distant"); put(Language.EN, ""); }}, "65pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 12, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
					new Effect(TypeEffect.DCCP, false, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ailes Célestes"); put(Language.EN, ""); }}, "60pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S4, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 15),
					new Effect(TypeEffect.AGI, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de canonnier"); put(Language.EN, ""); }}, "50pve2",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S5, 40, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Regard d'Aigle"); put(Language.EN, ""); }}, "40pve2",
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur de Vent"); put(Language.EN, ""); }}, "30pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 45),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur de la Jungle"); put(Language.EN, ""); }}, "20pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S0, 35, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Sombretrappeur"); put(Language.EN, ""); }}, "100pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Effect(TypeEffect.AGI, false, 44),
					new Effect(TypeEffect.VIT, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 94),
					new Effect(TypeEffect.Toucher, false, 33),
					new Effect(TypeEffect.ESQ, false, 33),
					new Effect(TypeEffect.TCCP, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 33),
					new Effect(TypeEffect.PeneP, false, 17),
					new SkillEffect(TypeSkillEffect.Class2S3, 28, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 28, TypeValue.DURATION),
					new Proc(65, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -193, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sombretrappeur"); put(Language.EN, ""); }}, "100pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.VIT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 85),
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.TCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Effect(TypeEffect.PeneP, false, 15),
					new SkillEffect(TypeSkillEffect.Class2S3, 25, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 25, TypeValue.DURATION),
					new Proc(65, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -175, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Héros Fantôme"); put(Language.EN, ""); }}, "95pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.AGI, false, 39),
					new Effect(TypeEffect.VIT, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 83),
					new Effect(TypeEffect.Toucher, false, 28),
					new Effect(TypeEffect.ESQ, false, 28),
					new Effect(TypeEffect.TCCP, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 24),
					new Effect(TypeEffect.CostComp, false, -88),
					new SkillEffect(TypeSkillEffect.Class2S3, 18, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 18, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -165, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros Fantôme"); put(Language.EN, ""); }}, "95pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.AGI, false, 35),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 75),
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.TCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 25),
					new Effect(TypeEffect.CostComp, false, -80),
					new SkillEffect(TypeSkillEffect.Class2S3, 20, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 20, TypeValue.DURATION),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -150, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros Fantôme"); put(Language.EN, ""); }}, "95pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.AGI, false, 35),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 75),
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.TCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 25),
					new Effect(TypeEffect.CostComp, false, -80),
					new SkillEffect(TypeSkillEffect.Class2S3, 20, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 20, TypeValue.DURATION),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Traqueur de Grand Line"); put(Language.EN, ""); }}, "85pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.AGI, false, 31),
					new Effect(TypeEffect.VIT, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 83),
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.TCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 28),
					new Effect(TypeEffect.CostComp, false, -88),
					new SkillEffect(TypeSkillEffect.Class2S3, 22, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 22, TypeValue.DURATION),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -138, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -138, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Traqueur de Grand Line"); put(Language.EN, ""); }}, "85pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.AGI, false, 28),
					new Effect(TypeEffect.VIT, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 75),
					new Effect(TypeEffect.Toucher, false, 27),
					new Effect(TypeEffect.TCCP, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Effect(TypeEffect.CostComp, false, -80),
					new SkillEffect(TypeSkillEffect.Class2S3, 16, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 16, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -125, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -125, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi céleste (Reforgé)"); put(Language.EN, ""); }}, "75pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.AGI, false, 29),
					new Effect(TypeEffect.VIT, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 77),
					new Effect(TypeEffect.Toucher, false, 28),
					new Effect(TypeEffect.TCCP, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new SkillEffect(TypeSkillEffect.Class2S3, 18, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -138, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -138, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi céleste"); put(Language.EN, ""); }}, "75pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.AGI, false, 26),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 70),
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.TCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new SkillEffect(TypeSkillEffect.Class2S3, 16, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -125, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -125, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vigilance d'Häyhä (Reforgée)"); put(Language.EN, ""); }}, "65pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.AGI, false, 31),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 66),
					new Effect(TypeEffect.TCCP, false, 22),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 16, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S3, 18, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -110, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -110, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vigilance d'Häyhä"); put(Language.EN, ""); }}, "65pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.AGI, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.TCCP, false, 20),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 16, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S3, 16, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros Céleste (Reforgée)"); put(Language.EN, ""); }}, "55pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.AGI, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 55),
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.Toucher, false, 13),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 10, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -82, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -82, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros Céleste"); put(Language.EN, ""); }}, "55pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.AGI, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 50),
					new Effect(TypeEffect.Toucher, false, 12),
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 8, TypeValue.DURATION),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -50, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hardi Céleste (Reforgé)"); put(Language.EN, ""); }}, "45pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.AGI, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 34),
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 7, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -55, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -55, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hardi Céleste"); put(Language.EN, ""); }}, "45pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.AGI, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 30),
					new Effect(TypeEffect.Toucher, false, 6),
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 6, TypeValue.DURATION),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Précision de Sogeking (Reforgé)"); put(Language.EN, ""); }}, "25pvp2R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new Effect(TypeEffect.AGI, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 22),
					new Effect(TypeEffect.Toucher, false, 6),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 7, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -34, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -34, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Précision de Sogeking"); put(Language.EN, ""); }}, "25pvp2",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.Toucher, false, 5),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S1, 6, TypeValue.DURATION),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -30, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -30, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Agilité Surnaturelle"); put(Language.EN, ""); }}, "80nucleus2",
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 22),
					new Effect(TypeEffect.Nature, false, 70),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S7, 60, TypeValue.DAMAGE),
					new Proc(42, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectM_old, false, 60),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25),
					new Effect(TypeEffect.TCCGun, false, 28),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant des Sylves"); put(Language.EN, ""); }}, "70nucleus2",
				new Calculable[] {
					new Proc(20, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 10),
					}, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new SkillEffect(TypeSkillEffect.Class2S8, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 18),
					new Proc(40, Activation.Attack, 13, new Calculable[] {
						new Effect(TypeEffect.CostComp, false, 900, Target.OPPONENT),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chuchoteur des Soupirs"); put(Language.EN, ""); }}, "60nucleus2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Proc(23, Activation.Attack, 11, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
					new SkillEffect(TypeSkillEffect.Class2S9, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 10),
					new Proc(35, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 70, Target.OPPONENT), // TODO Uniquement sur Skill HEAL
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vogueur de Vent"); put(Language.EN, ""); }}, "80lingot2",
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 30),
					new Effect(TypeEffect.Sacre, false, 70),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S10, 4, TypeValue.DURATION),
					new StaticEffect(TypeStaticEffect.x2STD_old, 26),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.PV, true, 15),
					new Proc(40, Activation.Attack, 9, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoHeal),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle des Limbes"); put(Language.EN, ""); }}, "70lingot2",
				new Calculable[] {
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 800),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18),
					new SkillEffect(TypeSkillEffect.Class2S11, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 30),
					new Proc(32, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 25),
						new Effect(TypeEffect.ReflectM_old, false, 25),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Promeneur des Nuages"); put(Language.EN, ""); }}, "60lingot2",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegGlace, false, 700),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 30),
					new SkillEffect(TypeSkillEffect.Class2S12, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoHeal),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grand Oiseau Bleu"); put(Language.EN, ""); }}, "90gvg2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 27),
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 70),
					new Effect(TypeEffect.AtkD, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new Proc(30, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maléfices de la Harpie"); put(Language.EN, ""); }}, "80gvg2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 27),
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 65),
					new Effect(TypeEffect.AtkD, true, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new Proc(27, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Feinte de Geronimo"); put(Language.EN, ""); }}, "70gvg2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25),
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.AtkD, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Prédateur (Réincarné)"); put(Language.EN, ""); }}, "100evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Obscure"); put(Language.EN, ""); }}, "100evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sniper (Réincarné)"); put(Language.EN, ""); }}, "90evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sniper"); put(Language.EN, ""); }}, "90evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Traqueur (Réincarné)"); put(Language.EN, ""); }}, "75evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Traqueur"); put(Language.EN, ""); }}, "75evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ranger (Réincarné)"); put(Language.EN, ""); }}, "60evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ranger"); put(Language.EN, ""); }}, "60evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Archer (Réincarné)"); put(Language.EN, ""); }}, "30evo2R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Archer"); put(Language.EN, ""); }}, "30evo2",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Percée de l'Assassin Ninja"); put(Language.EN, ""); }}, "90red3", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Ninja assassin"); put(Language.EN, ""); }}, "10ans90red3", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Orage de l'ombre"); put(Language.EN, ""); }}, "100vio3", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut des Kage"); put(Language.EN, ""); }}, "90vio3", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur des Ombres"); put(Language.EN, ""); }}, "80vio3", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furtif de Kakashi"); put(Language.EN, ""); }}, "100gold3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.VitAtkDuo, false, 35),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S3, 80, TypeValue.DAMAGE),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdP, false, 20),
					new Effect(TypeEffect.DegStdD, false, 20),
					new Effect(TypeEffect.DegSkillP, false, 20),
					new Effect(TypeEffect.MEN, false, -40),
					new SkillEffect(TypeSkillEffect.Class3S0, 50, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3Skill_old),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furtivité du CP9"); put(Language.EN, ""); }}, "90gold3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.ESQ, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 17),
					new Effect(TypeEffect.VitAtkDuo, false, 30),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 100),
						new Effect(TypeEffect.Depla, false, 25),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Ninja assassin"); put(Language.EN, ""); }}, "10ans90gold3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.ESQ, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 17),
					new Effect(TypeEffect.VitAtkDuo, false, 30),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 100),
						new Effect(TypeEffect.Depla, false, 25),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombres de Loki"); put(Language.EN, ""); }}, "80gold3",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bourreau Fantôme"); put(Language.EN, ""); }}, "100pve3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 50),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Effect(TypeEffect.DegOmbre, false, 350),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
					new Proc(20, Activation.Attack, 3, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -30, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ninja Démoniaque"); put(Language.EN, ""); }}, "95pve3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.ESQ, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new Effect(TypeEffect.DegDuo, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdP, false, 10),
					new Effect(TypeEffect.DegStdD, false, 10),
					new Effect(TypeEffect.DegSkillP, false, 10),
					new Proc(10, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.FCE, true, 50),
						new Effect(TypeEffect.TCCP, false, 20),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombres Éphémères"); put(Language.EN, ""); }}, "90pve3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.ESQ, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
					new Effect(TypeEffect.DegDuo, false, 25),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, false, 50),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de la Panthère Ténébreuse"); put(Language.EN, ""); }}, "85pve3",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.AGI, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Proc(20, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 50),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "6ème Sens Ninja"); put(Language.EN, ""); }}, "80pve3",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 50),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre Embrasée"); put(Language.EN, ""); }}, "75pve3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7),
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rigueur d'al Sabah"); put(Language.EN, ""); }}, "70pve3",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassin à la Lame Cachée"); put(Language.EN, ""); }}, "65pve3",
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new SkillEffect(TypeSkillEffect.Class3S1, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection du Samouraï Fantôme"); put(Language.EN, ""); }}, "60pve3",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.FCE, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
					new Effect(TypeEffect.AGI, false, 7),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume Ciselé"); put(Language.EN, ""); }}, "50pve3",
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S2, 50, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.FCE, false, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Embuscade"); put(Language.EN, ""); }}, "40pve3",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Assassin nécrotique"); put(Language.EN, ""); }}, "100pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39),
					new Effect(TypeEffect.AGI, false, 28),
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 28),
						new Effect(TypeEffect.Depla, false, 28),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 94),
					new Effect(TypeEffect.Toucher, false, 28),
					new Effect(TypeEffect.ESQ, false, 28),
					new SkillEffect(TypeSkillEffect.Class3S3, 110, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 83),
					new Effect(TypeEffect.PV, true, 33),
					new Effect(TypeEffect.PeneP, false, 17),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 39),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassin scarifié"); put(Language.EN, ""); }}, "100pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35),
					new Effect(TypeEffect.AGI, false, 25),
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 25),
						new Effect(TypeEffect.Depla, false, 25),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 85),
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.ESQ, false, 25),
					new SkillEffect(TypeSkillEffect.Class3S3, 100, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Effect(TypeEffect.PV, true, 30),
					new Effect(TypeEffect.PeneP, false, 15),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 35),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Samouraï Fantôme"); put(Language.EN, ""); }}, "95pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33),
					new Effect(TypeEffect.AGI, false, 22),
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 22),
						new Effect(TypeEffect.Depla, false, 22),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 88),
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.ESQ, false, 22),
					new SkillEffect(TypeSkillEffect.Class3S3, 83, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 83),
					new Effect(TypeEffect.PV, true, 28),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï Fantôme"); put(Language.EN, ""); }}, "95pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.AGI, false, 20),
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 80),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.ESQ, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S3, 75, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Effect(TypeEffect.PV, true, 25),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Ninja de Konoha"); put(Language.EN, ""); }}, "85pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.AGI, false, 14),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 22),
						new Effect(TypeEffect.Depla, false, 22),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 83),
					new Effect(TypeEffect.DegDuo, false, 24),
					new Effect(TypeEffect.Toucher, false, 19),
					new Proc(30, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Effect(TypeEffect.PV, true, 19),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ninja de Konoha"); put(Language.EN, ""); }}, "85pvp3",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 27),
					new Effect(TypeEffect.AGI, false, 13),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 75),
					new Effect(TypeEffect.DegDuo, false, 22),
					new Effect(TypeEffect.Toucher, false, 17),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Effect(TypeEffect.PV, true, 17),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fourberie de Lucrezia (Reforgé)"); put(Language.EN, ""); }}, "75pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 28),
					new Effect(TypeEffect.AGI, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 77),
					new Effect(TypeEffect.DegDuo, false, 22),
					new Effect(TypeEffect.Toucher, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Effect(TypeEffect.PV, true, 17),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fourberie de Lucrezia"); put(Language.EN, ""); }}, "75pvp3",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.AGI, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 70),
					new Effect(TypeEffect.DegDuo, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Effect(TypeEffect.PV, true, 15),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sabotage de Fawkes (Reforgée)"); put(Language.EN, ""); }}, "65pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.AGI, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 66),
					new Effect(TypeEffect.DegDuo, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 44),
					new Effect(TypeEffect.PV, true, 11),
					new Proc(35, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sabotage de Fawkes"); put(Language.EN, ""); }}, "65pvp3",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.AGI, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.DegDuo, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new Effect(TypeEffect.PV, true, 10),
					new Proc(35, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combattant de l'Enfer (Reforgé)"); put(Language.EN, ""); }}, "55pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18),
					new Effect(TypeEffect.AGI, false, 9),
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 55),
					new SkillEffect(TypeSkillEffect.Class3S4, 33, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 82),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 29),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héros infernal"); put(Language.EN, ""); }}, "55pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15),
					new Effect(TypeEffect.AGI, false, 7),
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 50),
					new SkillEffect(TypeSkillEffect.Class3S4, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 25),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combattant au Lion Bleu (Reforgé)"); put(Language.EN, ""); }}, "45pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new Effect(TypeEffect.AGI, false, 7),
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 34),
					new SkillEffect(TypeSkillEffect.Class3S4, 22, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 17),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combattant du lion bleu"); put(Language.EN, ""); }}, "45pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Effect(TypeEffect.AGI, false, 5),
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new SkillEffect(TypeSkillEffect.Class3S4, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre de Kakashi (Reforgé)"); put(Language.EN, ""); }}, "25pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Effect(TypeEffect.AGI, false, 7),
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 22),
					new SkillEffect(TypeSkillEffect.Class3S4, 17, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 12),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre de Kakashi"); put(Language.EN, ""); }}, "25pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8),
					new Effect(TypeEffect.AGI, false, 5),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S4, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Proc(30, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 10),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vision Nocturne"); put(Language.EN, ""); }}, "80nucleus3",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18),
					new SkillEffect(TypeSkillEffect.Class3S5, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegFoudre, false, 1000),
					}),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.VOL, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.VIT, false, -50, Target.OPPONENT),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crocs du Cobra"); put(Language.EN, ""); }}, "70nucleus3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S6, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(25, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 700),
					}, 9),
				},
				new Calculable[] {
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -25, Target.OPPONENT),
					}, 9),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samourai du Poison"); put(Language.EN, ""); }}, "60nucleus3",
				new Calculable[] {
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new SkillEffect(TypeSkillEffect.Class3S7, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Proc(40, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectM_old, false, 70),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre de Terreur"); put(Language.EN, ""); }}, "80lingot3",
				new Calculable[] {
					new Proc(18, Activation.Attacked, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 380, TypeRegen.REGENERATION, 2),
					}, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new SkillEffect(TypeSkillEffect.Class3S6, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(33, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre Diabolique"); put(Language.EN, ""); }}, "70lingot3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S5, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(33, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectM_old, false, 50),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 18),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 20),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samourai du Tonnerre"); put(Language.EN, ""); }}, "60lingot3",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S2, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 25),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 35),
					new Effect(TypeEffect.DegOmbre, false, 700),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chien-Loup Zombie"); put(Language.EN, ""); }}, "90gvg3",
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 70),
					new Effect(TypeEffect.FCE, false, 27),
					new Effect(TypeEffect.AGI, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.ESQ, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DegDuo, false, 25),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie du Lycan"); put(Language.EN, ""); }}, "80gvg3",
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 65),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.AGI, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.ESQ, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DegDuo, false, 22),
					new Proc(37, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 40),
					}, 22.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon Sombre Atma"); put(Language.EN, ""); }}, "70gvg3",
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.AGI, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DegDuo, false, 20),
					new Proc(35, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Kage (Réincarné)"); put(Language.EN, ""); }}, "100evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Kage"); put(Language.EN, ""); }}, "100evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shinobi (Réincarné)"); put(Language.EN, ""); }}, "90evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shinobi"); put(Language.EN, ""); }}, "90evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ninja (Réincarné)"); put(Language.EN, ""); }}, "75evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Ninja"); put(Language.EN, ""); }}, "75evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Assassin (Réincarné)"); put(Language.EN, ""); }}, "60evo3R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Assassin"); put(Language.EN, ""); }}, "60evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}

	private static EquipSet[] getPretre() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Louanges de l'Esprit Sacré Gardien"); put(Language.EN, ""); }}, "90red4", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Esprit Sacré"); put(Language.EN, ""); }}, "10ans90red4", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction"); put(Language.EN, ""); }}, "100vio4", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Culte Solaire"); put(Language.EN, ""); }}, "90vio4", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sage illuminé"); put(Language.EN, ""); }}, "80vio4", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Divine de l'ordre des Istaris"); put(Language.EN, ""); }}, "100gold4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.VOL, false, 40),
					new SkillEffect(TypeSkillEffect.Class4S1, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.MEN, false, -35),
					new SkillEffect(TypeSkillEffect.Class4S1, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -55),
					new RegenEffect(TypeEffect.PM, false, 65, TypeRegen.REGENERATION, 2),
					new SkillEffect(TypeSkillEffect.Class4S2, 10, TypeValue.DURATION)
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Purification de Zehel"); put(Language.EN, ""); }}, "90gold4",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.ESQ, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 17),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 23),
					new Effect(TypeEffect.VitComp, false, 22),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 3000, TypeRegen.REGENERATION),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de l'Esprit sacré"); put(Language.EN, ""); }}, "10ans90gold4",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.ESQ, true, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 17),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 23),
					new Effect(TypeEffect.VitComp, false, 22),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 3000, TypeRegen.REGENERATION),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ferveur de Freya"); put(Language.EN, ""); }}, "80gold4",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 45),
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.Atk, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 45),
					new Effect(TypeEffect.PV, true, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien Miraculeux"); put(Language.EN, ""); }}, "100pve4",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -40),
					new Effect(TypeEffect.DegSkillM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 25),
					new Effect(TypeEffect.Sacre, false, 25),
					new Effect(TypeEffect.Ombre, false, 25),
					new Effect(TypeEffect.Foudre, false, 25),
					new Effect(TypeEffect.Feu, false, 25),
					new Effect(TypeEffect.Glace, false, 25),
					new Effect(TypeEffect.Nature, false, 25),
					new Effect(TypeEffect.CostComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ouragan Nordique"); put(Language.EN, ""); }}, "95pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new Proc(10, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -50),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.ESQ, false, 30),
					new Proc(10, Activation.Attack, 3, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 40),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaste Messager"); put(Language.EN, ""); }}, "90pve4",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14),
					new Effect(TypeEffect.MEN, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.DefM, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Proc(50, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de la Colombe Bienfaisante"); put(Language.EN, ""); }}, "85pve4",
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new Effect(TypeEffect.MEN, false, -30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.PV, true, 5),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 15),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grande Rédemption"); put(Language.EN, ""); }}, "80pve4",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.INT, false, 21),
					new Effect(TypeEffect.Atk, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.PM, true, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chants de Voix Divine"); put(Language.EN, ""); }}, "75pve4",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.DefM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.Toucher, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.TCCM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne Guerrier"); put(Language.EN, ""); }}, "70pve4",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21),
					new Effect(TypeEffect.Atk, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new StaticEffect(TypeStaticEffect.AntiStun),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Templier Sacré"); put(Language.EN, ""); }}, "65pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.Parade, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new SkillEffect(TypeSkillEffect.Class4S3, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.IntComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ordre Originel"); put(Language.EN, ""); }}, "60pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9),
					new Effect(TypeEffect.INT, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.IntComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.TCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Déesse de l'Aube"); put(Language.EN, ""); }}, "50pve4",
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6),
					new Effect(TypeEffect.VIT, false, 9),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S4, 75, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soleil Levant"); put(Language.EN, ""); }}, "40pve4",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdP, false, 15),
					new Effect(TypeEffect.DegStdD, false, 15),
					new Effect(TypeEffect.DegSkillP, false, 15),
					new Effect(TypeEffect.DegSkillM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lumière de la grâce"); put(Language.EN, ""); }}, "30pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clerc Priant"); put(Language.EN, ""); }}, "20pve4",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S7, 20, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Sauveur"); put(Language.EN, ""); }}, "100pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 66),
					new Effect(TypeEffect.VitComp, false, 33),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Effect(TypeEffect.IntComp, false, -88),
					new Effect(TypeEffect.Atk, true, 28),
					new Effect(TypeEffect.AtkM, true, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 22),
					new Effect(TypeEffect.PeneM, false, 17),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new SkillEffect(TypeSkillEffect.Class4S5, 110, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -72, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sauveur"); put(Language.EN, ""); }}, "100pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.IntComp, false, -80),
					new Effect(TypeEffect.Atk, true, 25),
					new Effect(TypeEffect.AtkM, true, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 20),
					new Effect(TypeEffect.PeneM, false, 15),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new SkillEffect(TypeSkillEffect.Class4S5, 100, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -65, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Secte Originelle"); put(Language.EN, ""); }}, "95pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.VitComp, false, 28),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.IntComp, false, -88),
					new Effect(TypeEffect.Atk, true, 22),
					new Effect(TypeEffect.AtkM, true, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 17),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new SkillEffect(TypeSkillEffect.Class4S5, 83, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -72, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Secte Originelle"); put(Language.EN, ""); }}, "95pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.VitComp, false, 25),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.IntComp, false, -80),
					new Effect(TypeEffect.Atk, true, 20),
					new Effect(TypeEffect.AtkM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 15),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new SkillEffect(TypeSkillEffect.Class4S5, 75, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -65, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Rédempteur de Shibusen"); put(Language.EN, ""); }}, "85pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 42),
					new Effect(TypeEffect.VitComp, false, 24),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 8.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Atk, true, 19),
					new Effect(TypeEffect.AtkM, true, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 13),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -55, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rédempteur de Shibusen"); put(Language.EN, ""); }}, "85pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 38),
					new Effect(TypeEffect.VitComp, false, 22),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Atk, true, 17),
					new Effect(TypeEffect.AtkM, true, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 12),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -50, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dévotion de Zenaïda (Reforgée)"); put(Language.EN, ""); }}, "75pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Effect(TypeEffect.VitComp, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Atk, true, 17),
					new Effect(TypeEffect.AtkM, true, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 12),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dévotion de Zenaïda"); put(Language.EN, ""); }}, "75pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 36),
					new Effect(TypeEffect.VitComp, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(50, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -50, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Apaisement de Galien (Reforgée)"); put(Language.EN, ""); }}, "65pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 31),
					new Effect(TypeEffect.VitComp, false, 17),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.Atk, true, 11),
					new Effect(TypeEffect.AtkM, true, 11),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(40, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Apaisement de Galien"); put(Language.EN, ""); }}, "65pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.VitComp, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(40, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -50, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Secte du Secret Suprême"); put(Language.EN, ""); }}, "55pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.IntComp, false, -82),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S6, 66, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -55, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Secte Esotérique Supérieure"); put(Language.EN, ""); }}, "55pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.IntComp, false, -75),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ancienne Secte Secrète (Reforgé)"); put(Language.EN, ""); }}, "45pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.IntComp, false, -66),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S6, 44, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -32, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ancienne Secte Secrète"); put(Language.EN, ""); }}, "45pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.IntComp, false, -60),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S7, 40, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -30, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saint Eto (Reforgé)"); put(Language.EN, ""); }}, "25pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new Effect(TypeEffect.IntComp, false, -55),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S0, 34, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -17, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saint Eto"); put(Language.EN, ""); }}, "25pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.IntComp, false, -50),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S0, 30, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -15, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Supplique de la Déesse"); put(Language.EN, ""); }}, "80nucleus4",
				new Calculable[] {
					new Proc(36, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 1000),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 13),
					new SkillEffect(TypeSkillEffect.Class4S8, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31),
					new Proc(25, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
						new Effect(TypeEffect.ReflectM_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Piété Millénaire"); put(Language.EN, ""); }}, "70nucleus4",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new SkillEffect(TypeSkillEffect.Class4S9, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new RegenEffect(TypeEffect.PM, false, 400, 800, TypeRegen.ABSORPTION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(35, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitComp, false, -40, Target.OPPONENT),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Jugement du Fanatique"); put(Language.EN, ""); }}, "60nucleus4",
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
					new Effect(TypeEffect.Foudre, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 23),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ailes de la Sérénité"); put(Language.EN, ""); }}, "80lingot4",
				new Calculable[] {
					new Proc(28, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 65, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new SkillEffect(TypeSkillEffect.Class4S9, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 45),
					new Effect(TypeEffect.VOL, false, 26),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prière de Vierge"); put(Language.EN, ""); }}, "70lingot4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new SkillEffect(TypeSkillEffect.Class4S8, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -45, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -45, Target.OPPONENT),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 40),
					new Effect(TypeEffect.PV, true, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fanatique"); put(Language.EN, ""); }}, "60lingot4",
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 15),
					new Effect(TypeEffect.Feu, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Proc(22, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.CostComp, false, 550, Target.OPPONENT),
					}, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.DCCM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lotus Sacré"); put(Language.EN, ""); }}, "90gvg4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 25),
					new Effect(TypeEffect.Toucher, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vaillance du Léviathan"); put(Language.EN, ""); }}, "80gvg4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 22),
					new Effect(TypeEffect.Toucher, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 20),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pureté du Clerc"); put(Language.EN, ""); }}, "70gvg4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.INT, false, 5),
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Archange (Réincarné)"); put(Language.EN, ""); }}, "100evo4R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Divine"); put(Language.EN, ""); }}, "100evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Exorciste (Réincarné)"); put(Language.EN, ""); }}, "90evo4R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Exorciste"); put(Language.EN, ""); }}, "90evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Rédempteur (Réincarné)"); put(Language.EN, ""); }}, "75evo4R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Rédempteur"); put(Language.EN, ""); }}, "75evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Clerc (Réincarné)"); put(Language.EN, ""); }}, "60evo4R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Clerc"); put(Language.EN, ""); }}, "60evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Prêtre (Réincarné)"); put(Language.EN, ""); }}, "30evo4R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Prêtre"); put(Language.EN, ""); }}, "30evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mantra Sacré Salvateur"); put(Language.EN, ""); }}, "90red5", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Salvateur"); put(Language.EN, ""); }}, "10ans90red5", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prière de l'Aube"); put(Language.EN, ""); }}, "100vio5", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vérité Divine"); put(Language.EN, ""); }}, "90vio5", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète Omniscient"); put(Language.EN, ""); }}, "80vio5", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tribale de Thrall"); put(Language.EN, ""); }}, "100gold5",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.ReducSkillM, false, 18),
					new SkillEffect(TypeSkillEffect.Class5S0, 6, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class5S1, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S2, 50, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S3, 50, TypeValue.DAMAGE),
					new Proc(20, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 30),
						new Effect(TypeEffect.VitAtk, false, 60),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit de Tao Ren"); put(Language.EN, ""); }}, "90gold5",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
					new StaticEffect(TypeStaticEffect.x3STD_old),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 80),
						new Effect(TypeEffect.RDCCM, false, 80),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Salvateur"); put(Language.EN, ""); }}, "10ans90gold5",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
					new StaticEffect(TypeStaticEffect.x3STD_old),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 80),
						new Effect(TypeEffect.RDCCM, false, 80),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur de Fenrir"); put(Language.EN, ""); }}, "80gold5",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Triple, 50, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Ancestral"); put(Language.EN, ""); }}, "100pve5",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.VitAtk, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
					new Proc(10, Activation.Attack, 8, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 5),
						new Effect(TypeEffect.ESQ, false, 5),
					}, 0.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.DegSacre, false, 400),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ode à la Vie"); put(Language.EN, ""); }}, "95pve5",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new RegenEffect(TypeEffect.PV, false, 75, TypeRegen.REGENERATION, 5),
					new RegenEffect(TypeEffect.PM, false, 75, TypeRegen.REGENERATION, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.PM, true, 15),
					new Effect(TypeEffect.MEN, false, -30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oracle Prolixe"); put(Language.EN, ""); }}, "90pve5",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 28),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 30),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de l'Aigle Perspicace"); put(Language.EN, ""); }}, "85pve5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.INT, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 20),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tables Tournantes"); put(Language.EN, ""); }}, "80pve5",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.VitComp, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3Skill_old, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Jugement des Dieux"); put(Language.EN, ""); }}, "75pve5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.DefM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 30),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Secret de Chimère"); put(Language.EN, ""); }}, "70pve5",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.INT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 25),
					new Effect(TypeEffect.RDCCM, false, 25),
					new Effect(TypeEffect.PV, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sage du Soleil Levant"); put(Language.EN, ""); }}, "65pve5",
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.FCE, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S4, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.PV, true, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Promeneur du Ciel"); put(Language.EN, ""); }}, "60pve5",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.INT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprits Sacrés"); put(Language.EN, ""); }}, "50pve5",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11),
					new SkillEffect(TypeSkillEffect.Class5S5, 15, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Plumes Bariolées"); put(Language.EN, ""); }}, "40pve5",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S6, 10, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3),
					new Effect(TypeEffect.INT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Intuition sauvage"); put(Language.EN, ""); }}, "100pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39),
					new Effect(TypeEffect.INT, false, 39),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Effect(TypeEffect.VOL, false, 33),
					new SkillEffect(TypeSkillEffect.Class5S8, 66, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3STD_old, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 44),
					new Effect(TypeEffect.Toucher, false, 39),
					new Effect(TypeEffect.PeneM, false, 17),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -248, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Intuition sauvage"); put(Language.EN, ""); }}, "100pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35),
					new Effect(TypeEffect.INT, false, 35),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.VOL, false, 30),
					new SkillEffect(TypeSkillEffect.Class5S8, 60, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3STD_old, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 40),
					new Effect(TypeEffect.Toucher, false, 35),
					new Effect(TypeEffect.PeneM, false, 15),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -225, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -45, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Psionique"); put(Language.EN, ""); }}, "95pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33),
					new Effect(TypeEffect.INT, false, 33),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.VOL, false, 22),
					new SkillEffect(TypeSkillEffect.Class5S8, 50, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3STD_old, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 39),
					new Effect(TypeEffect.Toucher, false, 33),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -44, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brute Psionique"); put(Language.EN, ""); }}, "95pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.VOL, false, 20),
					new SkillEffect(TypeSkillEffect.Class5S8, 45, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3STD_old, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 35),
					new Effect(TypeEffect.Toucher, false, 30),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Oracle d'Amestris"); put(Language.EN, ""); }}, "85pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.INT, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 8.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.VOL, false, 11),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 35),
					new Effect(TypeEffect.Toucher, false, 24),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -187, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -33, Target.OPPONENT),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oracle d'Amestris"); put(Language.EN, ""); }}, "85pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.INT, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.VOL, false, 10),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 32),
					new Effect(TypeEffect.Toucher, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -170, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ruse de Sun Wukong (Reforgé)"); put(Language.EN, ""); }}, "75pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.INT, false, 19),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 33),
					new Effect(TypeEffect.Toucher, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -187, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ruse de Sun Wukong"); put(Language.EN, ""); }}, "75pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19),
					new Effect(TypeEffect.INT, false, 17),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.Toucher, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -170, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Illusion de Kuzunoha (Reforgé)"); put(Language.EN, ""); }}, "65pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Effect(TypeEffect.INT, false, 14),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 28),
					new Effect(TypeEffect.Toucher, false, 17),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Illusion de Kuzunoha"); put(Language.EN, ""); }}, "65pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.INT, false, 13),
					new Proc(90, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.Toucher, false, 15),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -150, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Bestial (Reforgé)"); put(Language.EN, ""); }}, "55pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13),
					new Effect(TypeEffect.INT, false, 13),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new SkillEffect(TypeSkillEffect.Class5S9, 33, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 22),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -165, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héraut bestial élégant"); put(Language.EN, ""); }}, "55pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.INT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new SkillEffect(TypeSkillEffect.Class5S9, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coursier Céleste (Reforgé)"); put(Language.EN, ""); }}, "45pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.INT, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new SkillEffect(TypeSkillEffect.Class5S9, 22, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -82, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coursier céleste"); put(Language.EN, ""); }}, "45pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new SkillEffect(TypeSkillEffect.Class5S9, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -75, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éléments d'Asakura (Reforgé)"); put(Language.EN, ""); }}, "25pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new SkillEffect(TypeSkillEffect.Class5S9, 17, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -50, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éléments d'Asakura"); put(Language.EN, ""); }}, "25pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new SkillEffect(TypeSkillEffect.Class5S9, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -45, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur de Tempêtes"); put(Language.EN, ""); }}, "80nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.DCCM, false, 25),
				},
				new Calculable[] {
					new Proc(25, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -40, Target.OPPONENT),
					}, 9),
				},
				new Calculable[] {
					new Condition(TypeEffect.PV, 35, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 200, 350, TypeRegen.REGENERATION, 3),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Totem des Ancêtres"); put(Language.EN, ""); }}, "70nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 20),
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 23),
					new Proc(20, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 25),
					}, 12),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.INT, false, -170, Target.OPPONENT),
					}, 14),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prix de la Raison"); put(Language.EN, ""); }}, "60nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new SkillEffect(TypeSkillEffect.Class5S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Proc(18, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -60, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -15, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 900),
						new Effect(TypeEffect.Depla, false, -10, Target.OPPONENT),
					}, 9),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mélopée des Montagnes"); put(Language.EN, ""); }}, "80lingot5",
				new Calculable[] {
					new Proc(15, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.DefM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 15),
					new Effect(TypeEffect.VitAtk, false, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Œil du Cyclone"); put(Language.EN, ""); }}, "70lingot5",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.RTCCM, false, -18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(18, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
						new Effect(TypeEffect.DefM, true, 40),
					}, 9),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.VOL, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.VIT, false, -70, Target.OPPONENT),
					}, 14),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Équilibre de la Nature"); put(Language.EN, ""); }}, "60lingot5",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14),
					new SkillEffect(TypeSkillEffect.Class5S11, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attacked, 9, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, -60, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grand Bois Divin"); put(Language.EN, ""); }}, "90gvg5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.VOL, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Effect(TypeEffect.PV, true, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 35),
					new Effect(TypeEffect.Toucher, false, 30),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -195, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement des Dryades"); put(Language.EN, ""); }}, "80gvg5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Effect(TypeEffect.VOL, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
					new Effect(TypeEffect.ReducSkillM, false, 12),
					new Effect(TypeEffect.PV, true, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 32),
					new Effect(TypeEffect.Toucher, false, 27),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -185, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Érudition de Diviciacos"); put(Language.EN, ""); }}, "70gvg5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.Toucher, false, 25),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Druide (Réincarné)"); put(Language.EN, ""); }}, "100evo5R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Éternelle"); put(Language.EN, ""); }}, "100evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shaman (Réincarné)"); put(Language.EN, ""); }}, "90evo5R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shaman"); put(Language.EN, ""); }}, "90evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Oracle (Réincarné)"); put(Language.EN, ""); }}, "75evo5R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Oracle"); put(Language.EN, ""); }}, "75evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sage (Réincarné)"); put(Language.EN, ""); }}, "60evo5R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sage"); put(Language.EN, ""); }}, "60evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}

	private static EquipSet[] getMage() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Avatar du Guide Magique"); put(Language.EN, ""); }}, "90red6", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Archimage"); put(Language.EN, ""); }}, "10ans90red6", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étoiles de l'enfer"); put(Language.EN, ""); }}, "100vio6", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psynergie Elémentaire"); put(Language.EN, ""); }}, "90vio6", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Disciple de Gaia"); put(Language.EN, ""); }}, "80vio6", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Enchantée d'Elminster"); put(Language.EN, ""); }}, "100gold6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 60),
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.AtkM, true, 15, WeaponType.BATON),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -18),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 18),
					new SkillEffect(TypeSkillEffect.Class6S14, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new SkillEffect(TypeSkillEffect.Class6S15, 10, TypeValue.DURATION),
					new Proc(18, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 25),
						new Effect(TypeEffect.DCCM, false, 25),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mystogan L'Exilé"); put(Language.EN, ""); }}, "90gold6",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.VIT, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.INT, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.TCCM, false, 17),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 100),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire d'Archimage"); put(Language.EN, ""); }}, "10ans90gold6",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.VIT, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.INT, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.TCCM, false, 17),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 100),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arcanes de Cronos"); put(Language.EN, ""); }}, "80gold6",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.INT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -8),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.AtkM, true, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Illusion de Verre"); put(Language.EN, ""); }}, "100pve6",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.DCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 20),
						new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 1),
					}, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
					new Proc(20, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 40),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Forme Enchantée"); put(Language.EN, ""); }}, "95pve6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(100, Activation.Mag, new Calculable[] {
						new Effect(TypeEffect.DegGlace, false, 500),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Proc(40, Activation.Attack, 3, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 5),
					}, 0.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Poussière d'Étoile Filante"); put(Language.EN, ""); }}, "90pve6",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.INT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.TCCM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme de l'Hibou Impassible"); put(Language.EN, ""); }}, "85pve6",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.VIT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -30),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de la Déviation de la Mana"); put(Language.EN, ""); }}, "80pve6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -8),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.AtkM, true, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Élément Astral"); put(Language.EN, ""); }}, "75pve6",
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Effect(TypeEffect.INT, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.VOL, false, 7),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.TCCM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Quatrième Dimension"); put(Language.EN, ""); }}, "70pve6",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 35),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set d'élément glorieux"); put(Language.EN, ""); }}, "65pve6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S16, 25, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de la voie lactée infinie"); put(Language.EN, ""); }}, "60pve6",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
					new Effect(TypeEffect.INT, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de conducteur de navette"); put(Language.EN, ""); }}, "50pve6",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.INT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set du prisme de cristaux colorés"); put(Language.EN, ""); }}, "40pve6",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de l'Adepte"); put(Language.EN, ""); }}, "30pve6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set magique"); put(Language.EN, ""); }}, "20pve6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S17, 8, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Maître-démon"); put(Language.EN, ""); }}, "100pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 66),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.Toucher, false, 39),
					new Effect(TypeEffect.ESQ, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 44),
					new Effect(TypeEffect.ReducStdP, false, 33),
					new Effect(TypeEffect.ReducStdD, false, 33),
					new Effect(TypeEffect.ReducSkillP, false, 33),
					new Effect(TypeEffect.PeneM, false, 17),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -248, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -248, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fourvoyé"); put(Language.EN, ""); }}, "100pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 60),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Toucher, false, 35),
					new Effect(TypeEffect.ESQ, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 40),
					new Effect(TypeEffect.ReducStdP, false, 30),
					new Effect(TypeEffect.ReducStdD, false, 30),
					new Effect(TypeEffect.ReducSkillP, false, 30),
					new Effect(TypeEffect.PeneM, false, 15),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -225, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -225, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Doyen Sorcier"); put(Language.EN, ""); }}, "95pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 55),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Toucher, false, 33),
					new Effect(TypeEffect.ESQ, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 39),
					new Effect(TypeEffect.ReducStdP, false, 28),
					new Effect(TypeEffect.ReducStdD, false, 28),
					new Effect(TypeEffect.ReducSkillP, false, 28),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Doyen Sorcier"); put(Language.EN, ""); }}, "95pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducStdP, false, 25),
					new Effect(TypeEffect.ReducStdD, false, 25),
					new Effect(TypeEffect.ReducSkillP, false, 25),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Archimage du Royaume de Fiore"); put(Language.EN, ""); }}, "85pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 42),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 8.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Toucher, false, 24),
					new Effect(TypeEffect.ESQ, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducStdP, false, 24),
					new Effect(TypeEffect.ReducStdD, false, 24),
					new Effect(TypeEffect.ReducSkillP, false, 24),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Archimage du Royaume de Fiore"); put(Language.EN, ""); }}, "85pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 38),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.ESQ, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 32),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}, 7.5),
				}),

			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement de Calypso (Reforgée)"); put(Language.EN, ""); }}, "75pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.ESQ, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement de Calypso"); put(Language.EN, ""); }}, "75pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 36),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.ESQ, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir de Melchior (Reforgée)"); put(Language.EN, ""); }}, "65pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.Toucher, false, 17),
					new Effect(TypeEffect.ESQ, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir de Melchior"); put(Language.EN, ""); }}, "65pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 28),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.ESQ, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Doyen Mana"); put(Language.EN, ""); }}, "55pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 24),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.ESQ, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set d'ancien de mana"); put(Language.EN, ""); }}, "55pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sage de l'Énergie (Reforgé)"); put(Language.EN, ""); }}, "45pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 17),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -82, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de sage de l'aube"); put(Language.EN, ""); }}, "45pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -75, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie d'Elric (Reforgé)"); put(Language.EN, ""); }}, "25pvp6R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 12),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -50, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie d'Elric"); put(Language.EN, ""); }}, "25pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -45, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Connaissance Ultime"); put(Language.EN, ""); }}, "80nucleus6",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S2, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(20, Activation.Mag, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 1100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 20),
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.VOL, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Colère de Thor"); put(Language.EN, ""); }}, "70nucleus6",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18),
					new SkillEffect(TypeSkillEffect.Class6S4, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReflectP_old, false, 40),
					new Proc(60, Activation.Attacked, 12, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -45, Target.OPPONENT),
					}, 14),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3Skill_old, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Essence de la Magie"); put(Language.EN, ""); }}, "60nucleus6",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillP, false, 35),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dieu du Savoir"); put(Language.EN, ""); }}, "80lingot6",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18),
					new Proc(32, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -30, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
					}, 9),
				},
				new Calculable[] {
					new Proc(20, Activation.Mag, new Calculable[] {
						new Effect(TypeEffect.DegFeu, false, 1100),
					}),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S4, 30, TypeValue.DAMAGE),
					new Proc(17, Activation.Attack, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 500, 800, TypeRegen.REGENERATION, 2),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tourbillon de Glace"); put(Language.EN, ""); }}, "70lingot6",
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -25, Target.OPPONENT),
					}, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new SkillEffect(TypeSkillEffect.Class6S18, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5),
					new Proc(35, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, -60, Target.OPPONENT),
						new Effect(TypeEffect.DegStdD, false, -60, Target.OPPONENT),
						new Effect(TypeEffect.DegSkillP, false, -60, Target.OPPONENT),
					}, 9),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Univers"); put(Language.EN, ""); }}, "60lingot6",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -120, Target.OPPONENT),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gland Améthyste"); put(Language.EN, ""); }}, "90gvg6",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.INT, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new Effect(TypeEffect.TCCM, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -195, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mirage des Djinns"); put(Language.EN, ""); }}, "80gvg6",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.INT, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.TCCM, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 32),
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oracle d'Hécate"); put(Language.EN, ""); }}, "70gvg6",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.INT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.TCCM, false, 10),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Proc(60, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Arcaniste (Réincarné)"); put(Language.EN, ""); }}, "100evo6R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Déicide"); put(Language.EN, ""); }}, "100evo6",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Avatar (Réincarné)"); put(Language.EN, ""); }}, "90evo6R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Avatar"); put(Language.EN, ""); }}, "90evo6",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Archimage (Réincarné)"); put(Language.EN, ""); }}, "75evo6R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Archimage"); put(Language.EN, ""); }}, "75evo6",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sorcier (Réincarné)"); put(Language.EN, ""); }}, "60evo6R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Sorcier"); put(Language.EN, ""); }}, "60evo6",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Mage (Réincarné)"); put(Language.EN, ""); }}, "30evo6R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Mage"); put(Language.EN, ""); }}, "30evo6",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction Psychique de l'Apôtre"); put(Language.EN, ""); }}, "90red7", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Apôtre"); put(Language.EN, ""); }}, "10ans90red", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hérésie démoniaque"); put(Language.EN, ""); }}, "100vio7", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cavalier de Thanatos"); put(Language.EN, ""); }}, "90vio7", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dresseur Shinigami"); put(Language.EN, ""); }}, "80vio7", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démoniaques d'Hassaï"); put(Language.EN, ""); }}, "100gold7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.ReducStdP, false, 30, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 30, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 30, WeaponType.BATON),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.VitComp, false, 20),
					new SkillEffect(TypeSkillEffect.Class7S15, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new SkillEffect(TypeSkillEffect.Class7S16, 50, TypeValue.DAMAGE),
					new Proc(18, Activation.Attack, 1.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombres de Gekko Moriah"); put(Language.EN, ""); }}, "90gold7",
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
					new Effect(TypeEffect.ReducSkillM, false, 17),
					new Effect(TypeEffect.DCCM, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.Depla, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
					new Proc(20, Activation.Attacked, 8, 3, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 15),
						new Effect(TypeEffect.DefM, true, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire d'Apôtre"); put(Language.EN, ""); }}, "10ans90gold7",
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
					new Effect(TypeEffect.ReducSkillM, false, 17),
					new Effect(TypeEffect.DCCM, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.Depla, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
					new Proc(20, Activation.Attacked, 8, 3, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 15),
						new Effect(TypeEffect.DefM, true, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spectre de l'Ankou"); put(Language.EN, ""); }}, "80gold7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.INT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 10, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S17, 10, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Œil Démoniaque"); put(Language.EN, ""); }}, "100pve7",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Proc(100, Activation.Mag, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 600),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.DegSkillM, false, 10),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 30),
						new Effect(TypeEffect.VitComp, false, 20),
						new Effect(TypeEffect.MEN, false, 50, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corruption Spirituelle"); put(Language.EN, ""); }}, "95pve7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Proc(100, Activation.Mag, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 500),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -20, Target.OPPONENT),
						new Effect(TypeEffect.Ombre, false, -10, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armée des Morts"); put(Language.EN, ""); }}, "90pve7",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.DCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme du Corbeau Éternel"); put(Language.EN, ""); }}, "85pve7",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.AtkM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution des Chaînes Mortelles"); put(Language.EN, ""); }}, "80pve7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.INT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 10),
					new Effect(TypeEffect.VitComp, false, 5),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 8, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S17, 8, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon Destructeur"); put(Language.EN, ""); }}, "75pve7",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14),
					new SkillEffect(TypeSkillEffect.Class7S1, 60, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S18, 60, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.VitComp, false, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Férocité d'Erik le Rouge"); put(Language.EN, ""); }}, "70pve7",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 12, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S11, 12, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S17, 12, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.TCCM, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set d'enfer noir"); put(Language.EN, ""); }}, "65pve7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S0, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 15),
					new Effect(TypeEffect.MEN, false, -15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de disciple du sentier maléfique"); put(Language.EN, ""); }}, "60pve7",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S19, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 30, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set d'esprit"); put(Language.EN, ""); }}, "50pve7",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S0, 35, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de chaos"); put(Language.EN, ""); }}, "40pve7",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4),
					new Effect(TypeEffect.INT, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Chaos élémentaire"); put(Language.EN, ""); }}, "100pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33),
					new Effect(TypeEffect.INT, false, 33),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.Depla, false, 28),
					new Effect(TypeEffect.Toucher, false, 39),
					new Effect(TypeEffect.ESQ, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 44),
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.PeneM, false, 17),
					new SkillEffect(TypeSkillEffect.Class7S21, 138, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S22, 138, TypeValue.DAMAGE),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaos élémentaire"); put(Language.EN, ""); }}, "100pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Depla, false, 25),
					new Effect(TypeEffect.Toucher, false, 35),
					new Effect(TypeEffect.ESQ, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 40),
					new Effect(TypeEffect.VitComp, false, 45),
					new Effect(TypeEffect.PeneM, false, 15),
					new SkillEffect(TypeSkillEffect.Class7S21, 125, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S22, 125, TypeValue.DAMAGE),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Faucheur"); put(Language.EN, ""); }}, "95pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.INT, false, 28),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 22),
					new Effect(TypeEffect.Toucher, false, 33),
					new Effect(TypeEffect.ESQ, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 39),
					new Effect(TypeEffect.VitComp, false, 44),
					new SkillEffect(TypeSkillEffect.Class7S21, 110, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S22, 110, TypeValue.DAMAGE),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Créateur de Faucheur d'Âmes"); put(Language.EN, ""); }}, "95pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.INT, false, 25),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 20),
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 35),
					new Effect(TypeEffect.VitComp, false, 40),
					new SkillEffect(TypeSkillEffect.Class7S21, 100, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S22, 100, TypeValue.DAMAGE),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Démoniste de Soul Society"); put(Language.EN, ""); }}, "85pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.INT, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 8.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 19),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 22),
					new Effect(TypeEffect.PV, true, 24),
					new Effect(TypeEffect.VitComp, false, 33),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démoniste de Soul Society"); put(Language.EN, ""); }}, "85pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.INT, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.Toucher, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 20),
					new Effect(TypeEffect.PV, true, 22),
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Damnation de Raspoutine (Reforgé)"); put(Language.EN, ""); }}, "75pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.INT, false, 20),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.Toucher, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 19),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(88, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Damnation de Raspoutine"); put(Language.EN, ""); }}, "75pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18),
					new Effect(TypeEffect.INT, false, 18),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 15),
					new Effect(TypeEffect.Toucher, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 17),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Occultisme de Faust (Reforgé)"); put(Language.EN, ""); }}, "65pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.INT, false, 17),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.Toucher, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 17),
					new Effect(TypeEffect.PV, true, 17),
					new Proc(77, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Occultisme de Faust"); put(Language.EN, ""); }}, "65pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13),
					new Effect(TypeEffect.INT, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Depla, false, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new Effect(TypeEffect.PV, true, 15),
					new Proc(70, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destructeur du Néant"); put(Language.EN, ""); }}, "55pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11),
					new Effect(TypeEffect.INT, false, 13),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.Depla, false, 12),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 28, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 82),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destructeur du trou noir"); put(Language.EN, ""); }}, "55pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 25, TypeValue.DAMAGE),
					new Proc(75, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Alien (Reforgé)"); put(Language.EN, ""); }}, "45pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 17, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 55),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set d'extraterrestre"); put(Language.EN, ""); }}, "45pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.INT, false, 7),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 15, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme d'Hellscythe (Reforgé)"); put(Language.EN, ""); }}, "25pvp7R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.Depla, false, 4),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 12, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 55),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme d'Hellscythe"); put(Language.EN, ""); }}, "25pvp7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.INT, false, 7),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.Depla, false, 3),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S20, 10, TypeValue.DAMAGE),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction de l'Au-Delà"); put(Language.EN, ""); }}, "80nucleus7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 50),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18),
					new SkillEffect(TypeSkillEffect.Class7S23, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Proc(50, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 8),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pleurs des Damnés"); put(Language.EN, ""); }}, "70nucleus7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new SkillEffect(TypeSkillEffect.Class7S23, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(40, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, false, 9),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager de l'Épouvante"); put(Language.EN, ""); }}, "60nucleus7",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new SkillEffect(TypeSkillEffect.Class7S24, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, 20, Target.OPPONENT),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Râle du Dieu Agonisant"); put(Language.EN, ""); }}, "80lingot7",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18),
					new SkillEffect(TypeSkillEffect.Class7S23, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 24),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -30, Target.OPPONENT),
					}, 7),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Doigt d'Hadès"); put(Language.EN, ""); }}, "70lingot7",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22),
					new SkillEffect(TypeSkillEffect.Class7S25, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(42, Activation.Attack, 9, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager de l'Horreur"); put(Language.EN, ""); }}, "60lingot7",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new SkillEffect(TypeSkillEffect.Class7S26, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
						new Effect(TypeEffect.DefM, true, 20),
					}, 14),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Obscur du Dragon"); put(Language.EN, ""); }}, "90gvg7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Effect(TypeEffect.INT, false, 22),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.VitComp, false, 17),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 15, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S17, 15, TypeValue.DURATION),
					new Proc(70, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Effroi de la Banshee"); put(Language.EN, ""); }}, "80gvg7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.INT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.VitComp, false, 17),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 12, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S17, 12, TypeValue.DURATION),
					new Proc(70, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Savoir Interdit de Frankenstein"); put(Language.EN, ""); }}, "70gvg7",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 15),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Depla, false, 15),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 10, TypeValue.DURATION),
					new Proc(60, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Faucheur (Réincarné)"); put(Language.EN, ""); }}, "100evo7R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Psychique"); put(Language.EN, ""); }}, "100evo7",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shinigami (Réincarné)"); put(Language.EN, ""); }}, "90evo7R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Shinigami"); put(Language.EN, ""); }}, "90evo7",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Démoniste (Réincarné)"); put(Language.EN, ""); }}, "75evo7R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Démoniste"); put(Language.EN, ""); }}, "75evo7",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Nécromancien (Réincarné)"); put(Language.EN, ""); }}, "60evo7R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Nécromancien"); put(Language.EN, ""); }}, "60evo7",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}
	
	private static EquipSet[] getMeca() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entaille ultime"); put(Language.EN, ""); }}, "90red8", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Suradanceur"); put(Language.EN, ""); }}, "10ans90red8", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon Frappe-pierre"); put(Language.EN, ""); }}, "100vio8", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ailes Célestes Envoûtantes"); put(Language.EN, ""); }}, "90vio8", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Trépas de Glace et d'Étoiles"); put(Language.EN, ""); }}, "80vio8", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Général divin du centre de la Terre"); put(Language.EN, ""); }}, "100gold8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 70),
					new Effect(TypeEffect.DegStdP, false, 15),
					new Effect(TypeEffect.DegStdD, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 100),
					new Effect(TypeEffect.Sacre, false, 15),
					new Effect(TypeEffect.Ombre, false, 15),
					new Effect(TypeEffect.Foudre, false, 15),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.Glace, false, 15),
					new Effect(TypeEffect.Nature, false, 15),
					new Proc(20, Activation.Attacked, 1.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 75, Target.OPPONENT),
						new Effect(TypeEffect.ReflectM_old, false, 75, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Suradanceur"); put(Language.EN, ""); }}, "10ans90gold8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.MEN, true, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new SkillEffect(TypeSkillEffect.Class8S0, 40, TypeValue.DAMAGE),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
					new Proc(20, Activation.Attacked, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}, 3),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brume rugissante effrayante"); put(Language.EN, ""); }}, "90gold8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.MEN, true, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new SkillEffect(TypeSkillEffect.Class8S0, 40, TypeValue.DAMAGE),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
					new Proc(20, Activation.Attacked, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}, 3),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arme de zone gelée"); put(Language.EN, ""); }}, "80gold8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VIT, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 30),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 40),
					new Proc(10, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Démon traqueur"); put(Language.EN, ""); }}, "100pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 44),
					new Effect(TypeEffect.VIT, false, 33),
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 55),
					new Effect(TypeEffect.Ombre, false, 55),
					new Effect(TypeEffect.Foudre, false, 55),
					new Effect(TypeEffect.Feu, false, 55),
					new Effect(TypeEffect.Glace, false, 55),
					new Effect(TypeEffect.Nature, false, 55),
					new Effect(TypeEffect.ESQ, true, 28),
					new Effect(TypeEffect.ReducStdP, false, 33),
					new Effect(TypeEffect.ReducStdD, false, 33),
					new Effect(TypeEffect.ReducSkillP, false, 33),
					new Effect(TypeEffect.ReducSkillM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 72),
					new Effect(TypeEffect.PV, true, 28),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 39),
						new Effect(TypeEffect.VitComp, false, 39),
					}, 4),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon traqueur"); put(Language.EN, ""); }}, "100pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 50),
					new Effect(TypeEffect.Ombre, false, 50),
					new Effect(TypeEffect.Foudre, false, 50),
					new Effect(TypeEffect.Feu, false, 50),
					new Effect(TypeEffect.Glace, false, 50),
					new Effect(TypeEffect.Nature, false, 50),
					new Effect(TypeEffect.ESQ, true, 25),
					new Effect(TypeEffect.ReducStdP, false, 30),
					new Effect(TypeEffect.ReducStdD, false, 30),
					new Effect(TypeEffect.ReducSkillP, false, 30),
					new Effect(TypeEffect.ReducSkillM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 65),
					new Effect(TypeEffect.PV, true, 25),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 35),
						new Effect(TypeEffect.VitComp, false, 35),
					}, 4),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50),
					}, 4),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Mort Dévoreuse d'Âmes"); put(Language.EN, ""); }}, "95pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39),
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 44),
					new Effect(TypeEffect.Ombre, false, 44),
					new Effect(TypeEffect.Foudre, false, 44),
					new Effect(TypeEffect.Feu, false, 44),
					new Effect(TypeEffect.Glace, false, 44),
					new Effect(TypeEffect.Nature, false, 44),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.ReducStdP, false, 28),
					new Effect(TypeEffect.ReducStdD, false, 28),
					new Effect(TypeEffect.ReducSkillP, false, 28),
					new Effect(TypeEffect.ReducSkillM, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 66),
					new Effect(TypeEffect.RDCCM, false, 66),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mort Dévoreuse d'Âmes"); put(Language.EN, ""); }}, "95pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35),
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 25),
					new Effect(TypeEffect.ReducStdD, false, 25),
					new Effect(TypeEffect.ReducSkillP, false, 25),
					new Effect(TypeEffect.ReducSkillM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 60),
					new Effect(TypeEffect.RDCCM, false, 60),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Mort désintégrante"); put(Language.EN, ""); }}, "85pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33),
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 44),
					new Effect(TypeEffect.Ombre, false, 44),
					new Effect(TypeEffect.Foudre, false, 44),
					new Effect(TypeEffect.Feu, false, 44),
					new Effect(TypeEffect.Glace, false, 44),
					new Effect(TypeEffect.Nature, false, 44),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Effect(TypeEffect.ReducSkillM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 66),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(70, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mort désintégrante"); put(Language.EN, ""); }}, "85pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 60),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(70, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ravageur de Massacre (Reforgé)"); put(Language.EN, ""); }}, "75pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 18),
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 44),
					new Effect(TypeEffect.Ombre, false, 44),
					new Effect(TypeEffect.Foudre, false, 44),
					new Effect(TypeEffect.Feu, false, 44),
					new Effect(TypeEffect.Glace, false, 44),
					new Effect(TypeEffect.Nature, false, 44),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
					new Effect(TypeEffect.ReducSkillM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 55),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(60, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ravageur de Massacre"); put(Language.EN, ""); }}, "75pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VIT, false, 16),
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(60, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat Sanglant (Reforgé)"); put(Language.EN, ""); }}, "65pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18),
					new Effect(TypeEffect.VIT, false, 13),
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 44),
					new Effect(TypeEffect.Ombre, false, 44),
					new Effect(TypeEffect.Foudre, false, 44),
					new Effect(TypeEffect.Feu, false, 44),
					new Effect(TypeEffect.Glace, false, 44),
					new Effect(TypeEffect.Nature, false, 44),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.ReducStdP, false, 11),
					new Effect(TypeEffect.ReducStdD, false, 11),
					new Effect(TypeEffect.ReducSkillP, false, 11),
					new Effect(TypeEffect.ReducSkillM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 55),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat Sanglant"); put(Language.EN, ""); }}, "65pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16),
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur Maniaque (Reforgé)"); put(Language.EN, ""); }}, "55pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13),
					new Effect(TypeEffect.VIT, false, 11),
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 33),
					new Effect(TypeEffect.Ombre, false, 33),
					new Effect(TypeEffect.Foudre, false, 33),
					new Effect(TypeEffect.Feu, false, 33),
					new Effect(TypeEffect.Glace, false, 33),
					new Effect(TypeEffect.Nature, false, 33),
					new Effect(TypeEffect.ESQ, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 44),
					new Effect(TypeEffect.PV, true, 11),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur Maniaque"); put(Language.EN, ""); }}, "55pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new Effect(TypeEffect.Ombre, false, 30),
					new Effect(TypeEffect.Foudre, false, 30),
					new Effect(TypeEffect.Feu, false, 30),
					new Effect(TypeEffect.Glace, false, 30),
					new Effect(TypeEffect.Nature, false, 30),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 40),
					new Effect(TypeEffect.PV, true, 10),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassin Maniaque (Reforgé)"); put(Language.EN, ""); }}, "45pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 17),
					new Effect(TypeEffect.Ombre, false, 17),
					new Effect(TypeEffect.Foudre, false, 17),
					new Effect(TypeEffect.Feu, false, 17),
					new Effect(TypeEffect.Glace, false, 17),
					new Effect(TypeEffect.Nature, false, 17),
					new Effect(TypeEffect.ESQ, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 32),
					new Effect(TypeEffect.PV, true, 8),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassin Maniaque"); put(Language.EN, ""); }}, "45pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8),
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 15),
					new Effect(TypeEffect.Ombre, false, 15),
					new Effect(TypeEffect.Foudre, false, 15),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.Glace, false, 15),
					new Effect(TypeEffect.Nature, false, 15),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 30),
					new Effect(TypeEffect.PV, true, 7),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robuste Samuraï (Reforgé)"); put(Language.EN, ""); }}, "25pvp8R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 12),
					new Effect(TypeEffect.Ombre, false, 12),
					new Effect(TypeEffect.Foudre, false, 12),
					new Effect(TypeEffect.Feu, false, 12),
					new Effect(TypeEffect.Glace, false, 12),
					new Effect(TypeEffect.Nature, false, 12),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 22),
					new Effect(TypeEffect.RDCCM, false, 22),
					new Effect(TypeEffect.PV, true, 6),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robuste Samuraï"); put(Language.EN, ""); }}, "25pvp8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5),
					new Effect(TypeEffect.VIT, false, 5),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 10),
					new Effect(TypeEffect.Ombre, false, 10),
					new Effect(TypeEffect.Foudre, false, 10),
					new Effect(TypeEffect.Feu, false, 10),
					new Effect(TypeEffect.Glace, false, 10),
					new Effect(TypeEffect.Nature, false, 10),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 20),
					new Effect(TypeEffect.RDCCM, false, 20),
					new Effect(TypeEffect.PV, true, 5),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bretteur Nomade (Reforgé)"); put(Language.EN, ""); }}, "25pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 12),
					new Effect(TypeEffect.Ombre, false, 12),
					new Effect(TypeEffect.Foudre, false, 12),
					new Effect(TypeEffect.Feu, false, 12),
					new Effect(TypeEffect.Glace, false, 12),
					new Effect(TypeEffect.Nature, false, 12),
					new Effect(TypeEffect.TCCP, false, 6),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Proc(30, Activation.Attack, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 0, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bretteur Nomade"); put(Language.EN, ""); }}, "25pvp9",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 10),
					new Effect(TypeEffect.Ombre, false, 10),
					new Effect(TypeEffect.Foudre, false, 10),
					new Effect(TypeEffect.Feu, false, 10),
					new Effect(TypeEffect.Glace, false, 10),
					new Effect(TypeEffect.Nature, false, 10),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Proc(30, Activation.Attack, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 0, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Excellent guerrier"); put(Language.EN, ""); }}, "100pve8",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 20),
					new Effect(TypeEffect.RTCCP, false, 10),
					new Effect(TypeEffect.RTCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.Sacre, false, 10),
					new Effect(TypeEffect.Ombre, false, 10),
					new Effect(TypeEffect.Foudre, false, 10),
					new Effect(TypeEffect.Feu, false, 10),
					new Effect(TypeEffect.Glace, false, 10),
					new Effect(TypeEffect.Nature, false, 10),
					new Proc(15, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.Depla, false, -20, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Proc(15, Activation.Attacked, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION, 1),
						new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 1),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Garde impérial"); put(Language.EN, ""); }}, "95pve8",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.DCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new Proc(20, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ouragan du Val de la fissure"); put(Language.EN, ""); }}, "90pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.DefP, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.MEN, false, 25),
					new StaticEffect(TypeStaticEffect.x2STD_old, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new SkillEffect(TypeSkillEffect.Class8S0, 40, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Péché du pénitent"); put(Language.EN, ""); }}, "85pve8",
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Proc(50, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 40),
						new Effect(TypeEffect.ReducStdD, false, 40),
						new Effect(TypeEffect.ReducSkillP, false, 40),
						new Effect(TypeEffect.ReducSkillM, false, 40),
					}, 60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flamme de glace bleue"); put(Language.EN, ""); }}, "80pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VIT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 30),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.5),
					}, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon enragé"); put(Language.EN, ""); }}, "75pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new Effect(TypeEffect.Atk, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 45),
					new Effect(TypeEffect.PM, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit dansant"); put(Language.EN, ""); }}, "70pve8",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new Effect(TypeEffect.DefM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21),
					new Effect(TypeEffect.DCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 35),
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hémophilie"); put(Language.EN, ""); }}, "65pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5),
					new Effect(TypeEffect.Atk, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new SkillEffect(TypeSkillEffect.Class8S1, 40, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur Bondinouri"); put(Language.EN, ""); }}, "60pve8",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.PV, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Faucille de pillage"); put(Language.EN, ""); }}, "50pve8",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gladiateur belliqueux"); put(Language.EN, ""); }}, "40pve8",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Agent de renseignement"); put(Language.EN, ""); }}, "30pve8",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Garde imposant"); put(Language.EN, ""); }}, "20pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2),
				},
				null,
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balayage radical"); put(Language.EN, ""); }}, "80nucleus8",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Proc(35, Activation.Standard, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Double, 60),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
					new SkillEffect(TypeSkillEffect.Class8S2, 35, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaînes Lumifer"); put(Language.EN, ""); }}, "70nucleus8",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new StaticEffect(TypeStaticEffect.x2STD_old, 30),
					new Proc(30, Activation.Standard, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Double),
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gladiateur flamboyant"); put(Language.EN, ""); }}, "60nucleus8",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S3, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class8S4, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 50),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 60),
					}, 20),
				},
				new Calculable[] {
					new Proc(50, Activation.Phys, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 800),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démogorgon pleureur"); put(Language.EN, ""); }}, "80lingot8",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 40),
						new Effect(TypeEffect.DefP, true, 18),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Proc(30, Activation.Attack, 10, 5, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S5, 1, TypeValue.NUMBER),
						new Effect(TypeEffect.ReducStdP, false, 3),
						new Effect(TypeEffect.ReducStdD, false, 3),
						new Effect(TypeEffect.ReducSkillP, false, 3),
						new Effect(TypeEffect.ReducSkillM, false, 3),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaînes Mortefer"); put(Language.EN, ""); }}, "70lingot8",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S2, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.VIT, true, -10, Target.OPPONENT),
						new Effect(TypeEffect.VOL, true, -10, Target.OPPONENT),
					}, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gladiateur Ballarcane"); put(Language.EN, ""); }}, "60lingot8",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S3, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class8S4, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new Effect(TypeEffect.RDCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 50),
					new StaticEffect(TypeStaticEffect.x2STD_old, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Brisée du prédateur nocturne"); put(Language.EN, ""); }}, "90gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 38),
					new Effect(TypeEffect.VIT, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Effect(TypeEffect.ReducStdP, false, 25),
					new Effect(TypeEffect.ReducStdD, false, 25),
					new Effect(TypeEffect.ReducSkillP, false, 25),
					new Effect(TypeEffect.ReducSkillM, false, 25),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 35),
					new Proc(50, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat sans fin"); put(Language.EN, ""); }}, "80gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 30),
					new Proc(50, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance éternelle"); put(Language.EN, ""); }}, "70gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
					new Proc(40, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Oméga (Réincarné)"); put(Language.EN, ""); }}, "100evo8R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Oméga"); put(Language.EN, ""); }}, "100evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Mégatron (Réincarné)"); put(Language.EN, ""); }}, "90evo8R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "5e Évolution du Machiniste"); put(Language.EN, ""); }}, "90evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Prime (Réincarné)"); put(Language.EN, ""); }}, "75evo8R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Prime"); put(Language.EN, ""); }}, "75evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Métalleux (Réincarné)"); put(Language.EN, ""); }}, "60evo8R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Métalleux"); put(Language.EN, ""); }}, "60evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Machiniste (Réincarné)"); put(Language.EN, ""); }}, "30evo8R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Machiniste"); put(Language.EN, ""); }}, "30evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Horloge de Foudre Galvatron"); put(Language.EN, ""); }}, "90red9", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Galvatron"); put(Language.EN, ""); }}, "10ans90red9", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Marchelune"); put(Language.EN, ""); }}, "100vio9", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon du Requiem"); put(Language.EN, ""); }}, "90vio9", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Surcharge Âme de feu"); put(Language.EN, ""); }}, "80vio9", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combattant Loup lunaire"); put(Language.EN, ""); }}, "100gold9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 80),
					new Effect(TypeEffect.ESQ, true, 10),
					new Effect(TypeEffect.DCCP, false, 25),
					new Effect(TypeEffect.PeneP, false, 15),
					new Effect(TypeEffect.PeneM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 20),
					new Effect(TypeEffect.TCCP, false, 20),
					new StaticEffect(TypeStaticEffect.x3STD_old, 10),
					new Proc(15, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -10, Target.OPPONENT),
					}, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.MEN, false, -30),
					new Proc(20, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 30),
						new Effect(TypeEffect.AtkM, true, 30),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Adieu aux Sables Jaunes"); put(Language.EN, ""); }}, "90gold9",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 45),
					new Effect(TypeEffect.VitAtkD, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new Effect(TypeEffect.Depla, false, 10),
					new SkillEffect(TypeSkillEffect.Class9S6, 60, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Galvatron"); put(Language.EN, ""); }}, "10ans90gold9",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 45),
					new Effect(TypeEffect.VitAtkD, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new Effect(TypeEffect.Depla, false, 10),
					new SkillEffect(TypeSkillEffect.Class9S6, 60, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bête des Flammes du Démon"); put(Language.EN, ""); }}, "80gold9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.PM, true, 20),
				},
				new Calculable[] {
					new Proc(75, Activation.Crit, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.5),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 20),
					new SkillEffect(TypeSkillEffect.Class9S7, 30, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ranger astral malicieux"); put(Language.EN, ""); }}, "100pve9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 60),
					new Effect(TypeEffect.DCCP, false, 15),
					new Effect(TypeEffect.PeneP, false, 10),
					new Effect(TypeEffect.PeneM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
					new Effect(TypeEffect.VitAtkD, false, 20),
					new Effect(TypeEffect.TCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.MEN, false, -20),
					new Proc(15, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 20),
						new Effect(TypeEffect.AtkM, true, 20),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur spectral"); put(Language.EN, ""); }}, "95pve9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 15),
					new SkillEffect(TypeSkillEffect.Class9S8, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 40),
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
					new Proc(10, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aile de la Tempête de Sable"); put(Language.EN, ""); }}, "90pve9",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.VitAtkD, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 10),
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new SkillEffect(TypeSkillEffect.Class9S6, 45, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oriflamme du Tonnerre"); put(Language.EN, ""); }}, "85pve9",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 35),
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 50),
						new Effect(TypeEffect.Depla, false, 15),
					}, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bombardement Ardent"); put(Language.EN, ""); }}, "80pve9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25),
					new Effect(TypeEffect.AtkD, true, 20),
				},
				new Calculable[] {
					new Proc(50, Activation.Crit, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.5),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.DCCP, false, 35),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cavalerie céleste"); put(Language.EN, ""); }}, "75pve9",
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "La Fracture"); put(Language.EN, ""); }}, "70pve9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 20),
					new Effect(TypeEffect.CostComp, false, -60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Espion Aile de la nuit"); put(Language.EN, ""); }}, "65pve9",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 20),
					new Effect(TypeEffect.ESQ, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15),
					new SkillEffect(TypeSkillEffect.Class9S6, 60, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glorieux Seigneur"); put(Language.EN, ""); }}, "60pve9",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S9, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 10, TypeValue.DURATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maraudeur"); put(Language.EN, ""); }}, "50pve9",
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S4, 40, TypeValue.DAMAGE),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pilleurs du fort"); put(Language.EN, ""); }}, "40pve9",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7),
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Rédempteur"); put(Language.EN, ""); }}, "100pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 50),
					new Effect(TypeEffect.RTCCM, false, 50),
					new Effect(TypeEffect.AGI, false, 66),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 66),
					new Effect(TypeEffect.Ombre, false, 66),
					new Effect(TypeEffect.Foudre, false, 66),
					new Effect(TypeEffect.Feu, false, 66),
					new Effect(TypeEffect.Glace, false, 66),
					new Effect(TypeEffect.Nature, false, 66),
					new Effect(TypeEffect.TCCP, false, 39),
					new Effect(TypeEffect.Toucher, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 94),
					new Proc(80, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S1, 1, TypeValue.RELOAD),
					}),
					new Proc(20, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète sain"); put(Language.EN, ""); }}, "100pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 45),
					new Effect(TypeEffect.RTCCM, false, 45),
					new Effect(TypeEffect.AGI, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.Foudre, false, 60),
					new Effect(TypeEffect.Feu, false, 60),
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.Toucher, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 85),
					new Proc(80, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S1, 1, TypeValue.RELOAD),
					}),
					new Proc(20, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Héraut royal"); put(Language.EN, ""); }}, "95pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 44),
					new Effect(TypeEffect.RTCCM, false, 44),
					new Effect(TypeEffect.AGI, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 55),
					new Effect(TypeEffect.Ombre, false, 55),
					new Effect(TypeEffect.Foudre, false, 55),
					new Effect(TypeEffect.Feu, false, 55),
					new Effect(TypeEffect.Glace, false, 55),
					new Effect(TypeEffect.Nature, false, 55),
					new Effect(TypeEffect.TCCP, false, 33),
					new Effect(TypeEffect.Toucher, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 88),
					new Proc(70, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S1, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Nigimitama"); put(Language.EN, ""); }}, "95pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 40),
					new Effect(TypeEffect.RTCCM, false, 40),
					new Effect(TypeEffect.AGI, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 50),
					new Effect(TypeEffect.Ombre, false, 50),
					new Effect(TypeEffect.Foudre, false, 50),
					new Effect(TypeEffect.Feu, false, 50),
					new Effect(TypeEffect.Glace, false, 50),
					new Effect(TypeEffect.Nature, false, 50),
					new Effect(TypeEffect.TCCP, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 80),
					new Proc(70, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S1, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Pilleur d'âme"); put(Language.EN, ""); }}, "85pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.AGI, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 55),
					new Effect(TypeEffect.Ombre, false, 55),
					new Effect(TypeEffect.Foudre, false, 55),
					new Effect(TypeEffect.Feu, false, 55),
					new Effect(TypeEffect.Glace, false, 55),
					new Effect(TypeEffect.Nature, false, 55),
					new Effect(TypeEffect.TCCP, false, 28),
					new Effect(TypeEffect.Toucher, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 88),
					new Proc(60, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Apôtre de l'Arracheur d'Âme"); put(Language.EN, ""); }}, "85pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.AGI, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 50),
					new Effect(TypeEffect.Ombre, false, 50),
					new Effect(TypeEffect.Foudre, false, 50),
					new Effect(TypeEffect.Feu, false, 50),
					new Effect(TypeEffect.Glace, false, 50),
					new Effect(TypeEffect.Nature, false, 50),
					new Effect(TypeEffect.TCCP, false, 25),
					new Effect(TypeEffect.Toucher, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 80),
					new Proc(60, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danseur des rafales (Reforgé)"); put(Language.EN, ""); }}, "75pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.AGI, false, 39),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 50),
					new Effect(TypeEffect.Ombre, false, 50),
					new Effect(TypeEffect.Foudre, false, 50),
					new Effect(TypeEffect.Feu, false, 50),
					new Effect(TypeEffect.Glace, false, 50),
					new Effect(TypeEffect.Nature, false, 50),
					new Effect(TypeEffect.TCCP, false, 28),
					new Effect(TypeEffect.Toucher, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 80),
					new Proc(44, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danseur des rafales"); put(Language.EN, ""); }}, "75pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.AGI, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 45),
					new Effect(TypeEffect.Ombre, false, 45),
					new Effect(TypeEffect.Foudre, false, 45),
					new Effect(TypeEffect.Feu, false, 45),
					new Effect(TypeEffect.Glace, false, 45),
					new Effect(TypeEffect.Nature, false, 45),
					new Effect(TypeEffect.TCCP, false, 25),
					new Effect(TypeEffect.Toucher, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Proc(40, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danseur des rafales automnales (Reforgé)"); put(Language.EN, ""); }}, "65pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.AGI, false, 31),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 44),
					new Effect(TypeEffect.Ombre, false, 44),
					new Effect(TypeEffect.Foudre, false, 44),
					new Effect(TypeEffect.Feu, false, 44),
					new Effect(TypeEffect.Glace, false, 44),
					new Effect(TypeEffect.Nature, false, 44),
					new Effect(TypeEffect.TCCP, false, 22),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 80),
					new Proc(33, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danseur des Rafales Automnales"); put(Language.EN, ""); }}, "65pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.AGI, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Proc(30, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Boucher de l'Ombre (Reforgé)"); put(Language.EN, ""); }}, "55pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.AGI, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 33),
					new Effect(TypeEffect.Ombre, false, 33),
					new Effect(TypeEffect.Foudre, false, 33),
					new Effect(TypeEffect.Feu, false, 33),
					new Effect(TypeEffect.Glace, false, 33),
					new Effect(TypeEffect.Nature, false, 33),
					new Effect(TypeEffect.TCCP, false, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Proc(33, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Boucher de l'Ombre"); put(Language.EN, ""); }}, "55pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.AGI, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new Effect(TypeEffect.Ombre, false, 30),
					new Effect(TypeEffect.Foudre, false, 30),
					new Effect(TypeEffect.Feu, false, 30),
					new Effect(TypeEffect.Glace, false, 30),
					new Effect(TypeEffect.Nature, false, 30),
					new Effect(TypeEffect.TCCP, false, 12),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 70),
					new Proc(30, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sombre chasseur des ombres (Reforgé)"); put(Language.EN, ""); }}, "45pvp9R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.AGI, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 17),
					new Effect(TypeEffect.Ombre, false, 17),
					new Effect(TypeEffect.Foudre, false, 17),
					new Effect(TypeEffect.Feu, false, 17),
					new Effect(TypeEffect.Glace, false, 17),
					new Effect(TypeEffect.Nature, false, 17),
					new Effect(TypeEffect.TCCP, false, 9),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 65),
					new Proc(30, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur des Ombres"); put(Language.EN, ""); }}, "45pvp9",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.AGI, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 15),
					new Effect(TypeEffect.Ombre, false, 15),
					new Effect(TypeEffect.Foudre, false, 15),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.Glace, false, 15),
					new Effect(TypeEffect.Nature, false, 15),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.Toucher, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 60),
					new Proc(30, Activation.CritPhys, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S3, 1, TypeValue.RELOAD),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Excellence ultime"); put(Language.EN, ""); }}, "80nucleus9",
				new Calculable[] {
					new Proc(30, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 1100)
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attack, 4, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 40),
						new Effect(TypeEffect.TCCP, false, 20),
					}),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chanoine du Crépuscule"); put(Language.EN, ""); }}, "70nucleus9",
				new Calculable[] {
					new Proc(40, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 900)
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Proc(30, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 40),
						new Effect(TypeEffect.TCCP, false, 20),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guide nocturne"); put(Language.EN, ""); }}, "60nucleus9",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Proc(20, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 10),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new SkillEffect(TypeSkillEffect.Class8S4, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Excellence divine"); put(Language.EN, ""); }}, "80lingot9",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Proc(30, Activation.Attacked, new Calculable[] {
						new MultipleHit(TypeMultipleHit.ReflectM, 50)
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
						new StaticEffect(TypeStaticEffect.NoItem, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 40),
					new Proc(30, Activation.Attack, 10, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtkGun, false, 3),
						new SkillEffect(TypeSkillEffect.Class8S5, 1, TypeValue.NUMBER),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chanoine Grognecieux"); put(Language.EN, ""); }}, "70lingot9",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD_old, 25),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, new Calculable[] {
						new MultipleHit(TypeMultipleHit.ReflectP, 30)
					}),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.SetClass9),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chef nocturne"); put(Language.EN, ""); }}, "60lingot9",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new SkillEffect(TypeSkillEffect.Class9S9, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProSkillC10L1),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aigle démon"); put(Language.EN, ""); }}, "90gvg9",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.Foudre, false, 60),
					new Effect(TypeEffect.Feu, false, 60),
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.AGI, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkGun, false, 25),
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 30),
					new Effect(TypeEffect.TCCM, false, 30),
					new Proc(35, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -60, Target.OPPONENT),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Feu de crevasse"); put(Language.EN, ""); }}, "80gvg9",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 65),
					new Effect(TypeEffect.Ombre, false, 65),
					new Effect(TypeEffect.Foudre, false, 65),
					new Effect(TypeEffect.Feu, false, 65),
					new Effect(TypeEffect.Glace, false, 65),
					new Effect(TypeEffect.Nature, false, 65),
					new Effect(TypeEffect.AGI, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkGun, false, 20),
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 25),
					new Effect(TypeEffect.TCCM, false, 25),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -60, Target.OPPONENT),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur d'élite invisible"); put(Language.EN, ""); }}, "70gvg9",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.Foudre, false, 60),
					new Effect(TypeEffect.Feu, false, 60),
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.Nature, false, 60),
					new Effect(TypeEffect.AGI, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkGun, false, 15),
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.TCCM, false, 20),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Suprême (Réincarné)"); put(Language.EN, ""); }}, "100evo9R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Suprême"); put(Language.EN, ""); }}, "100evo9",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Galvatron (Réincarné)"); put(Language.EN, ""); }}, "90evo9R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "5e Évolution du Démolisseur"); put(Language.EN, ""); }}, "90evo9",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Optimus (Réincarné)"); put(Language.EN, ""); }}, "75evo9R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Optimus"); put(Language.EN, ""); }}, "75evo9",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Démolisseur (Réincarné)"); put(Language.EN, ""); }}, "60evo9R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Démolisseur"); put(Language.EN, ""); }}, "60evo9",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}

	private static EquipSet[] getVoyageur() {
		return new EquipSet[] {
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Sauvage de Dimensionaliste"); put(Language.EN, ""); }}, "90red10", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Dimensionaliste"); put(Language.EN, ""); }}, "10ans90red10", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume illusoire - Juge d'outremonde"); put(Language.EN, ""); }}, "100vio10", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Trou noir - Dispersion Demis"); put(Language.EN, ""); }}, "90vio10", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Univers - Aventurier de l'extrême"); put(Language.EN, ""); }}, "80vio10", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Stalactite de l'Ombre"); put(Language.EN, ""); }}, "100gold10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.DefM, true, 10),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.DefP, true, 25),
					new Condition(TypeEffect.PM, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.REGENERATION, 2),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prisme de Cristal"); put(Language.EN, ""); }}, "90gold10",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 3),
					new Effect(TypeEffect.DefM, true, 3),
					new Effect(TypeEffect.VOL, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.VOL, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.TCCM, false, 17),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 30, TypeRegen.REGENERATION),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Dimensionaliste"); put(Language.EN, ""); }}, "10ans90gold10",
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 3),
					new Effect(TypeEffect.DefM, true, 3),
					new Effect(TypeEffect.VOL, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.VOL, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.TCCM, false, 17),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 30, TypeRegen.REGENERATION),
					}, 40),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hérétique Cristallin"); put(Language.EN, ""); }}, "80gold10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -8),
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.PM, true, 10),
				},
				new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 50, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, false, 50, TypeRegen.REGENERATION),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mirage cristallin"); put(Language.EN, ""); }}, "100pve10",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 10),
						new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION, 1),
					}, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
					new Proc(50, Activation.Standard, 4, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 10),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction du Cristal Runique"); put(Language.EN, ""); }}, "95pve10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.DegOmbre, false, 500),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
					new Proc(40, Activation.Attack, 4, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 5),
					}, 0.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal radieux"); put(Language.EN, ""); }}, "90pve10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur Sprite"); put(Language.EN, ""); }}, "85pve10",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.VOL, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 15),
					new Effect(TypeEffect.RDCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -30),
					new Effect(TypeEffect.TCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éclat cristallin hérétique"); put(Language.EN, ""); }}, "80pve10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -10),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grand Voyageur"); put(Language.EN, ""); }}, "75pve10",
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 20),
					new Effect(TypeEffect.INT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14),
					new Effect(TypeEffect.VOL, false, 7),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.TCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Mutant"); put(Language.EN, ""); }}, "70pve10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21),
					new Effect(TypeEffect.VOL, true, 15),
				},
				new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 60, TypeRegen.REGENERATION, 1),
					new RegenEffect(TypeEffect.PM, false, 60, TypeRegen.REGENERATION, 1),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 40),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Arc-en-Ciel"); put(Language.EN, ""); }}, "65pve10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
					new Effect(TypeEffect.VOL, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal infini"); put(Language.EN, ""); }}, "60pve10",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.Toucher, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur Temporel"); put(Language.EN, ""); }}, "50pve10",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 50),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal déviant"); put(Language.EN, ""); }}, "40pve10",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ermite"); put(Language.EN, ""); }}, "30pve10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, true, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristallisées"); put(Language.EN, ""); }}, "20pve10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5),
				},
				null,
				new Calculable[] {
					new Effect(TypeEffect.VOL, true, 1),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Source de Cristal Jaillissante"); put(Language.EN, ""); }}, "100pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 66),
					new Proc(85, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 550, TypeRegen.ABSORPTION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.PM, true, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 44),
					new Effect(TypeEffect.RDCCM, false, 33),
					new Effect(TypeEffect.VitComp, false, 17),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.PM, true, -33, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Source de Cristal Jaillissante"); put(Language.EN, ""); }}, "100pvp10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Proc(85, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.ABSORPTION),
					}, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.PM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 40),
					new Effect(TypeEffect.RDCCM, false, 30),
					new Effect(TypeEffect.AtkM, true, 15),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.PM, true, -30, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Voyageur intermittent"); put(Language.EN, ""); }}, "95pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 55),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.ESQ, false, 33),
					new Effect(TypeEffect.Toucher, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 39),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur intermittent"); put(Language.EN, ""); }}, "95pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Voyageur runique"); put(Language.EN, ""); }}, "85pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 44),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ESQ, true, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 55),
					new Effect(TypeEffect.RTCCM, false, 55),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur runique"); put(Language.EN, ""); }}, "85pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ESQ, true, -50, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 50),
					new Effect(TypeEffect.RTCCM, false, 50),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur rayonnant (Reforgé)"); put(Language.EN, ""); }}, "75pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 44),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 40),
					new Effect(TypeEffect.RTCCM, false, 40),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducStdP, false, 33),
					new Effect(TypeEffect.ReducStdD, false, 33),
					new Effect(TypeEffect.ReducSkillP, false, 33),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur rayonnant"); put(Language.EN, ""); }}, "75pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 30),
					new Effect(TypeEffect.ReducStdD, false, 30),
					new Effect(TypeEffect.ReducSkillP, false, 30),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur prismatique (Reforgé)"); put(Language.EN, ""); }}, "65pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.ESQ, false, 28),
					new Effect(TypeEffect.Toucher, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducStdP, false, 22),
					new Effect(TypeEffect.ReducStdD, false, 22),
					new Effect(TypeEffect.ReducSkillP, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
					}, 7.5),
				}),

			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur prismatique"); put(Language.EN, ""); }}, "65pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ancien du cristal (Reforgé)"); put(Language.EN, ""); }}, "55pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -22, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -22, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.ESQ, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tenue Ancien du cristal"); put(Language.EN, ""); }}, "55pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -20, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sage de Cristal (Reforgé)"); put(Language.EN, ""); }}, "45pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -55, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.TCCP, false, 22),
					new Effect(TypeEffect.TCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 17),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -82, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sage cristallin"); put(Language.EN, ""); }}, "45pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -35, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 18),
					new Effect(TypeEffect.RTCCM, false, 18),
					new Effect(TypeEffect.TCCP, false, 18),
					new Effect(TypeEffect.TCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -42, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Source de Cristal (Reforgé)"); put(Language.EN, ""); }}, "25pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, 34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 17),
					new Effect(TypeEffect.RTCCM, false, 17),
					new Effect(TypeEffect.TCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 12),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -50, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Source de Cristal"); put(Language.EN, ""); }}, "25pvp10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, 30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.TCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -45, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du cristal"); put(Language.EN, ""); }}, "80nucleus10",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new Effect(TypeEffect.DefM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 3),
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.VOL, false, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance du cristal"); put(Language.EN, ""); }}, "70nucleus10",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3Skill_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Proc(50, Activation.Attacked, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
						new Effect(TypeEffect.DefM, true, -50, Target.OPPONENT),
					}, 14),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de célérité"); put(Language.EN, ""); }}, "60nucleus10",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.VIT, false, 120),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Porteur du cristal"); put(Language.EN, ""); }}, "80lingot10",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 3),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 500, 1000, TypeRegen.REGENERATION, 2),
					}, 12),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 10, 500, TypeRegen.REGENERATION, 2),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance du cristal de givre"); put(Language.EN, ""); }}, "70lingot10",
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -5, Target.OPPONENT),
					}, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Proc(35, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ReducSkillP, false, 20),
						new Effect(TypeEffect.ReducSkillM, false, 20),
					}, 9),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gemme robuste"); put(Language.EN, ""); }}, "60lingot10",
				new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 5, TypeRegen.REGENERATION, 1),
					new RegenEffect(TypeEffect.PM, false, 5, TypeRegen.REGENERATION, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -120),
					}, 11),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Agate mutante"); put(Language.EN, ""); }}, "90gvg10",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 29),
					new Effect(TypeEffect.RTCCM, false, 29),
					new Effect(TypeEffect.VOL, false, 29),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 20),
					new Effect(TypeEffect.TCCM, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducStdP, false, 30),
					new Effect(TypeEffect.ReducStdD, false, 30),
					new Effect(TypeEffect.ReducSkillP, false, 30),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -195, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur temporel"); put(Language.EN, ""); }}, "80gvg10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.TCCM, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -50, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 25),
					new Effect(TypeEffect.ReducStdD, false, 25),
					new Effect(TypeEffect.ReducSkillP, false, 25),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -185, Target.OPPONENT),
					}, 7.5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tenue d'Éternité"); put(Language.EN, ""); }}, "70gvg10",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.TCCM, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution d'outremonde (Réincarné)"); put(Language.EN, ""); }}, "100evo10R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution d'outremonde"); put(Language.EN, ""); }}, "100evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution des univers fantastiques (Réincarné)"); put(Language.EN, ""); }}, "90evo10R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de l'Exorciste"); put(Language.EN, ""); }}, "90evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Maître Demis (Réincarné)"); put(Language.EN, ""); }}, "75evo10R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution des univers fantastiques"); put(Language.EN, ""); }}, "75evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),

			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Maître Demis (Réincarné)"); put(Language.EN, ""); }}, "60evo10R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Demis"); put(Language.EN, ""); }}, "60evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Voyageur (Réincarné)"); put(Language.EN, ""); }}, "30evo10R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(10, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Voyageur"); put(Language.EN, ""); }}, "30evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Brise-Temps"); put(Language.EN, ""); }}, "90red11", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Véritable Brise-temps"); put(Language.EN, ""); }}, "10ans90red11", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume temporel - voyageur des ères"); put(Language.EN, ""); }}, "100vio11", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appareil - contrôle de pantin"); put(Language.EN, ""); }}, "90vio11", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Temps - Gardien"); put(Language.EN, ""); }}, "80vio11", null, null, null),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Spatio-temporel"); put(Language.EN, ""); }}, "100gold11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.RegenPM, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 20),
					new Effect(TypeEffect.DegSkillM, false, 20),
					new Proc(18, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1000, TypeRegen.ABSORPTION),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destructeur de l'Âme"); put(Language.EN, ""); }}, "90gold11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 3),
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
					new Proc(20, Activation.Attacked, 8, 3, new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set stellaire de Brise-temps"); put(Language.EN, ""); }}, "10ans90gold11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 3),
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25),
					new Effect(TypeEffect.VitComp, false, 18),
					new Proc(20, Activation.Attacked, 8, 3, new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 15),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lien de Cristal"); put(Language.EN, ""); }}, "80gold11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.AtkM, true, 8),
					new Effect(TypeEffect.VOL, true, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Panorama"); put(Language.EN, ""); }}, "100pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.AtkM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.DegSkillM, false, 10),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 10),
						new Effect(TypeEffect.VitComp, false, 20),
						new Effect(TypeEffect.AtkM, true, 5),
					}, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fléau de Cristal"); put(Language.EN, ""); }}, "95pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.DegSkillM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -20, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur du carnage"); put(Language.EN, ""); }}, "90pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.PM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, true, 20),
					new Effect(TypeEffect.DCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur nocturne"); put(Language.EN, ""); }}, "85pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal mortel"); put(Language.EN, ""); }}, "80pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21),
					new Effect(TypeEffect.VOL, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.VitComp, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Effect(TypeEffect.DCCM, false, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éclat de Cristal"); put(Language.EN, ""); }}, "75pve11",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.VitComp, false, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi des profondeurs cristallines"); put(Language.EN, ""); }}, "70pve11",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.TCCM, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal ténébreux"); put(Language.EN, ""); }}, "65pve11",
				new Calculable[] {
					new Effect(TypeEffect.VOL, true, 15),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 20),
					new Effect(TypeEffect.MEN, false, -10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur magique"); put(Language.EN, ""); }}, "60pve11",
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
					new Effect(TypeEffect.INT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.VOL, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolutif de Cristal"); put(Language.EN, ""); }}, "50pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal"); put(Language.EN, ""); }}, "40pve11",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12),
					new Effect(TypeEffect.VOL, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Cristal Chaotique"); put(Language.EN, ""); }}, "100pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Effect(TypeEffect.VOL, false, 33),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -220, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.Depla, false, 28),
					new Effect(TypeEffect.RegenPM, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 17),
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.PM, true, 6),
					new Proc(30, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Chaotique"); put(Language.EN, ""); }}, "100pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -200, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Depla, false, 25),
					new Effect(TypeEffect.RegenPM, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 15),
					new Effect(TypeEffect.VitComp, false, 45),
					new Effect(TypeEffect.PM, true, 5),
					new Proc(30, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Gardien du temps"); put(Language.EN, ""); }}, "95pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 55),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 22),
					new Effect(TypeEffect.Toucher, false, 33),
					new Effect(TypeEffect.ESQ, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 6),
					new Effect(TypeEffect.VitComp, false, 44),
					new Effect(TypeEffect.PV, true, 39),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du temps"); put(Language.EN, ""); }}, "95pvp11",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 50),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 20),
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.VitComp, false, 40),
					new Effect(TypeEffect.PV, true, 35),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "(Reforgé) Créateur du cristal"); put(Language.EN, ""); }}, "85pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22),
					new Effect(TypeEffect.VOL, false, 22),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -55, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 11),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 11),
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.PM, true, 6),
					new Effect(TypeEffect.AtkM, true, 22),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Créateur du cristal"); put(Language.EN, ""); }}, "85pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -50, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 10),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.AtkM, true, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur ténébreux (Reforgé)"); put(Language.EN, ""); }}, "75pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22),
					new Effect(TypeEffect.VOL, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 28),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 22),
					new Effect(TypeEffect.PM, true, 22),
					new Proc(88, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur ténébreux"); put(Language.EN, ""); }}, "75pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 25),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 20),
					new Effect(TypeEffect.PM, true, 20),
					new Proc(85, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Genèse spatio-temporelle (Reforgé)"); put(Language.EN, ""); }}, "65pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11),
					new Effect(TypeEffect.VOL, false, 22),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.Depla, false, 17),
					new Effect(TypeEffect.Toucher, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 17),
					new Effect(TypeEffect.PM, true, 17),
					new Proc(80, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Genèse spatio-temporelle"); put(Language.EN, ""); }}, "65pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Depla, false, 15),
					new Effect(TypeEffect.Toucher, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new Effect(TypeEffect.PM, true, 15),
					new Proc(70, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Genèse cristalline (Reforgé)"); put(Language.EN, ""); }}, "55pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18),
					new Effect(TypeEffect.VOL, false, 18),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -22, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.Depla, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 50),
					new Effect(TypeEffect.INT, false, 28),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tenue Genèse cristalline"); put(Language.EN, ""); }}, "55pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -20, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 45),
					new Effect(TypeEffect.INT, false, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tenue de Voyageur (Reforgé)"); put(Language.EN, ""); }}, "45pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8),
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -55, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.TCCM, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 5),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 55),
						new Effect(TypeEffect.ReflectM_old, false, 55),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tenue de Voyageur"); put(Language.EN, ""); }}, "45pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8),
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -35, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 24),
					new Effect(TypeEffect.RTCCM, false, 24),
					new Effect(TypeEffect.TCCM, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 3),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 25),
						new Effect(TypeEffect.ReflectM_old, false, 25),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runes sacrificielles (Reforgé)"); put(Language.EN, ""); }}, "25pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8),
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 34, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.TCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 30),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 55),
						new Effect(TypeEffect.ReflectM_old, false, 55),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runes sacrificielles"); put(Language.EN, ""); }}, "25pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.VOL, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.TCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
						new Effect(TypeEffect.ReflectM_old, false, 50),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristallin d'incantation"); put(Language.EN, ""); }}, "80nucleus11",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Proc(50, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.PeneM, false, -50, Target.OPPONENT),
					}, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 50),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur désespéré"); put(Language.EN, ""); }}, "70nucleus11",
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit du voyageur"); put(Language.EN, ""); }}, "60nucleus11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.AGI, false, 20),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyageur sur le déclin"); put(Language.EN, ""); }}, "80lingot11",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, -30),
						new Effect(TypeEffect.DegStdD, false, -30),
					}, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi de la catastrophe"); put(Language.EN, ""); }}, "70lingot11",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.AGI, false, 30),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 9, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}, 30),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction du voyageur"); put(Language.EN, ""); }}, "60lingot11",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
					}, 14),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Os de dragon Crystalis"); put(Language.EN, ""); }}, "90gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -50, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 7),
					new Effect(TypeEffect.Depla, false, 22),
					new Effect(TypeEffect.VitComp, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 60),
					new Effect(TypeEffect.RegenPM, false, 60),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal dégénéré"); put(Language.EN, ""); }}, "80gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.Depla, false, 20),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 50),
					new Effect(TypeEffect.RegenPM, false, 50),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal d'éternité"); put(Language.EN, ""); }}, "70gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}, 7.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.Depla, false, 20),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.PM, true, 15),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Pillard (Réincarné)"); put(Language.EN, ""); }}, "100evo11R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(20, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Pillard"); put(Language.EN, ""); }}, "100evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de chronoverse (Réincarné)"); put(Language.EN, ""); }}, "90evo11R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(16, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution du Gourou"); put(Language.EN, ""); }}, "90evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Maître Chronos (Réincarné)"); put(Language.EN, ""); }}, "75evo11R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(14, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de chronoverse"); put(Language.EN, ""); }}, "75evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Maître Chronos (Réincarné)"); put(Language.EN, ""); }}, "60evo11R",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 24),
					new Proc(12, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 10, TypeRegen.REGENERATION),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution de Chronos"); put(Language.EN, ""); }}, "60evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
		};
	}
	
	private static EquipSet[] getAll() {
		return new EquipSet[] {
			new EquipSet(),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance suprême de Tarot"); put(Language.EN, ""); }}, "100tarot0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
					new Proc(100, Activation.Attack, 6, 5, new Calculable[] {
						new Effect(TypeEffect.Atk, false, 3),
						new Effect(TypeEffect.AtkD, false, 3),
					}, 0.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35),
					new Effect(TypeEffect.FCE, false, 40),
					new Proc(15, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 50),
						new Proc(100, Activation.Phys, new Calculable[] {
							new Effect(TypeEffect.DegSacre, false, 4000),
						}),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot Roue de la fortune"); put(Language.EN, ""); }}, "100tarot1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 75),
					new Proc(12, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 25),
						new Effect(TypeEffect.DCCM, false, 65),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot Mort"); put(Language.EN, ""); }}, "100tarot2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 70),
					new Effect(TypeEffect.Depla, false, 12),
					new Effect(TypeEffect.DefP, true, 20),
					new Effect(TypeEffect.DefM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Proc(100, Activation.Attacked, 10, 15, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 1),
						new Effect(TypeEffect.ReducStdD, false, 1),
						new Effect(TypeEffect.ReducSkillP, false, 1),
						new Effect(TypeEffect.ReducSkillM, false, 1),
					}, 0.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.VOL, false, 55),
					new Proc(8, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2000),
						new Proc(100, Activation.Phys, new Calculable[] {
							new Effect(TypeEffect.DegOmbre, false, 1500),
						}),
					}, 13),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot - Force"); put(Language.EN, ""); }}, "95tarot0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.TCCP, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
					new Proc(100, Activation.Attack, 6, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 5),
					}, 0.5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 55),
					new Proc(12, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 14),
						new Effect(TypeEffect.FCE, true, 45),
					}, 16),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot - Zodiaque"); put(Language.EN, ""); }}, "95tarot1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.TCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 55),
					new Proc(12, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 20),
						new Effect(TypeEffect.IntComp, false, -65),
						new Effect(TypeEffect.DCCM, false, 40),
					}, 12),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tarot - Lune"); put(Language.EN, ""); }}, "95tarot2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.Depla, false, 8),
					new Effect(TypeEffect.DefP, true, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 35),
					new Proc(100, Activation.Attack, 3, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -15, Target.OPPONENT),
						new Effect(TypeEffect.VitComp, false, -10, Target.OPPONENT),
					}, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 55),
					new Effect(TypeEffect.DefM, true, 20),
					new Proc(12, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 60),
						new Effect(TypeEffect.ReducStdD, false, 60),
						new Effect(TypeEffect.ReducSkillP, false, 60),
						new Effect(TypeEffect.ReducSkillM, false, 60),
					}, 25),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amant Tarot"); put(Language.EN, ""); }}, "90tarot0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 50),
					new Effect(TypeEffect.ESQ, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.DefP, true, 15),
					new Effect(TypeEffect.DefM, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.RDCCP, false, 25),
					new Effect(TypeEffect.RDCCM, false, 25),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Proc(5, Activation.Attack, 30, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Triple, 100, 100),
						}),
					}, 180),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon Tarot"); put(Language.EN, ""); }}, "90tarot1",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
					new Effect(TypeEffect.VOL, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.VitComp, false, 25),
					new Proc(5, Activation.Attack, 30, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Triple, 100, 100),
						}),
					}, 180),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ermite Tarot"); put(Language.EN, ""); }}, "90tarot2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 50),
					new Effect(TypeEffect.Toucher, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 50),
					new Effect(TypeEffect.Atk, true, 10),
					new Effect(TypeEffect.AtkD, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 20),
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.VitAtk, false, 25),
					new Proc(5, Activation.Attack, 30, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Triple, 100, 100),
						}),
					}, 180),
				}),
		};
	}	

	static EquipSet[] getCapeRing() {
		return new EquipSet[] {
			new EquipSet(),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de la Gloire Meurtrière"); put(Language.EN, ""); }}, "tdb0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 60),
					new Effect(TypeEffect.VIT, false, 60),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 50),
					}),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.RDCCP, false, -35, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set du Dragon Émeraude"); put(Language.EN, ""); }}, "tdb1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.AGI, false, 60),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 5),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, true, -25, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set de la Foi Ancestrale"); put(Language.EN, ""); }}, "tdb2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.HealD, false, 20),
					new Effect(TypeEffect.HealR, false, 20),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 30),
						new Effect(TypeEffect.Depla, false, 10),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set du Squelette Maudit"); put(Language.EN, ""); }}, "tdb3",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.INT, false, 60),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.Shield, false, 4000),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Set du Champion"); put(Language.EN, ""); }}, "tdb4",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.AGI, false, 20),
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DegStdP, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DegStdD, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DegSkillP, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DegSkillM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse de lunesang"); put(Language.EN, ""); }}, "90sombre",
				new Calculable[] {
					new Proc(10, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
						new Effect(TypeEffect.Depla, false, 5),
					}, 15),
				},
				new Calculable[] {
					new Proc(10, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 10),
						new Effect(TypeEffect.DCCM, false, 10),
					}),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réminiscence de la bête divine"); put(Language.EN, ""); }}, "80sombre",
				new Calculable[] {
					new Proc(50, Activation.Attacked, 5, 5, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 60),
						new Effect(TypeEffect.RegenPM, false, 5),
					}, 2),
				},
				new Calculable[] {
					new Proc(10, Activation.Attacked, 5, 10, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 2),
						new Effect(TypeEffect.VitComp, false, 2),
					}, 5),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lumicloche du temps"); put(Language.EN, ""); }}, "70sombre",
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.CostComp, false, -15),
				},
				new Calculable[] {
					new Proc(60, Activation.Attacked, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Dispel),
					}, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lignée interdite"); put(Language.EN, ""); }}, "60sombre",
				new Calculable[] {
					new Proc(50, Activation.Attacked, 5, 3, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 40),
						new Effect(TypeEffect.RegenPM, false, 5),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Visiteur étranger"); put(Language.EN, ""); }}, "50sombre",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
					new Condition(TypeCondition.RAYON16, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 5, Target.ALLY),
						new Effect(TypeEffect.DefM, true, 5, Target.ALLY),
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 12),
					}, 10),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Caché"); put(Language.EN, ""); }}, "40sombre",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Proc(65, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 30),
						new Effect(TypeEffect.ReducStdD, false, 30),
						new Effect(TypeEffect.ReducSkillP, false, 30),
						new Effect(TypeEffect.ReducSkillM, false, 30),
						new StaticEffect(TypeStaticEffect.Block),
						new Proc(100, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 10),
						}),
					}, 20),
				}),
			new EquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marque de vitesse"); put(Language.EN, ""); }}, "30sombre",
				new Calculable[] {
					new Proc(100, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 150, TypeRegen.ABSORPTION),
					}, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 6),
					new Effect(TypeEffect.VitComp, false, 6),
				}),
		};
	}
}
