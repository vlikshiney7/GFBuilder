package fr.vlik.grandfantasia.loader.characupgrade;

import java.util.EnumMap;

import fr.vlik.grandfantasia.characupgrade.Talent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
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
public class LoaderTalent extends LoaderTemplate {
	
	static Talent[] getClass0() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Art de l'Épée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 12),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 13),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Hache"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 6),
					new Effect(TypeEffect.TCCP, false, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 8),
					new Effect(TypeEffect.TCCP, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 10),
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 11),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 12),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 13),
					new Effect(TypeEffect.TCCP, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Maillet"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 6),
					new Proc(5, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 8),
					new Proc(5, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 10),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 12),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 14),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 16),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vie Tenace"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.RTCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.RTCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.RTCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.RTCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.RTCCP, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Armes à une Main"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 4),
					new Effect(TypeEffect.DegHa, false, 4),
					new Effect(TypeEffect.DegMa, false, 4),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.DegHa, false, 6),
					new Effect(TypeEffect.DegMa, false, 6),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.DegHa, false, 8),
					new Effect(TypeEffect.DegMa, false, 8),
					new Effect(TypeEffect.VitAtk, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 9),
					new Effect(TypeEffect.DegHa, false, 9),
					new Effect(TypeEffect.DegMa, false, 9),
					new Effect(TypeEffect.VitAtk, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.DegHa, false, 10),
					new Effect(TypeEffect.DegMa, false, 10),
					new Effect(TypeEffect.VitAtk, false, 29),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.DegHa, false, 11),
					new Effect(TypeEffect.DegMa, false, 11),
					new Effect(TypeEffect.VitAtk, false, 31),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Armes à deux Mains"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 4),
					new Effect(TypeEffect.DegHa2M, false, 4),
					new Effect(TypeEffect.DegMa2M, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 7),
					new Effect(TypeEffect.DegHa2M, false, 7),
					new Effect(TypeEffect.DegMa2M, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 10),
					new Effect(TypeEffect.DegHa2M, false, 10),
					new Effect(TypeEffect.DegMa2M, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 12),
					new Effect(TypeEffect.DegHa2M, false, 12),
					new Effect(TypeEffect.DegMa2M, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 14),
					new Effect(TypeEffect.DegHa2M, false, 14),
					new Effect(TypeEffect.DegMa2M, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 16),
					new Effect(TypeEffect.DegHa2M, false, 16),
					new Effect(TypeEffect.DegMa2M, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Peau Rêche et Chair Dure"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "0-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 13),
					new Effect(TypeEffect.ReducStdD, false, 13),
					new Effect(TypeEffect.ReducSkillP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 11),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Posture Délicate"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "0-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 15),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 20),
					new Effect(TypeEffect.ESQ, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 30),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 40),
					new Effect(TypeEffect.ESQ, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.ESQ, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ambidextrie"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "0-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 25),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 30),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 32),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 34),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 36),
					new StaticEffect(TypeStaticEffect.Duo),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura d'Exécration"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "0-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 65),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 75),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Fulgurant"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "0-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Maniaque"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "0-11", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 2),
					new Effect(TypeEffect.DCC2M, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 4),
					new Effect(TypeEffect.DCC2M, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 6),
					new Effect(TypeEffect.DCC2M, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 7),
					new Effect(TypeEffect.DCC2M, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 8),
					new Effect(TypeEffect.DCC2M, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC2M, false, 9),
					new Effect(TypeEffect.DCC2M, false, 40),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Posture Foudroyante"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 10),
					new Effect(TypeEffect.AGI, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 10),
					new Effect(TypeEffect.AGI, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 20),
					new Effect(TypeEffect.AGI, false, 40),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Parade Salvatrice"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.RDCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.RDCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RDCCP, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rupture Magique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Règne du Feu"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-15", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 30),
					new Effect(TypeEffect.FCE, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 30),
					new Effect(TypeEffect.FCE, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.FCE, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier Expert"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-16", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
					new Effect(TypeEffect.RTCCP, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
					new Effect(TypeEffect.RTCCP, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Barrière Magique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement Martial"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VIT, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement d'Athlète"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5),
					new Effect(TypeEffect.AGI, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.AGI, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.AGI, false, 35),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat Absolu"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VOL, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VOL, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.VOL, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du Sabre"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S11, 3, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class0S12, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S11, 6, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class0S12, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S11, 9, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class0S12, 9, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Secousses en Chaîne"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-22", new Calculable[][] {
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 2),
					new SkillEffect(TypeSkillEffect.Class0S13, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 5),
					new SkillEffect(TypeSkillEffect.Class0S13, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 8),
					new SkillEffect(TypeSkillEffect.Class0S13, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 25, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sublimation de la Destinée"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new SkillEffect(TypeSkillEffect.Class0S15, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S16, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new SkillEffect(TypeSkillEffect.Class0S15, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S16, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15),
					new SkillEffect(TypeSkillEffect.Class0S15, 35, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S16, 35, TypeValue.DAMAGE),
				},
			}),
		};
	}
	
	static Talent[] getClass1() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Art de l'Épée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 12),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 13),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Hache"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 6),
					new Effect(TypeEffect.TCCP, false, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 8),
					new Effect(TypeEffect.TCCP, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 10),
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 11),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 12),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 13),
					new Effect(TypeEffect.TCCP, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Maillet"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 6),
					new Proc(5, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 8),
					new Proc(5, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 10),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 12),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 14),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 16),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vie Tenace"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.RTCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.RTCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.RTCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.RTCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.RTCCP, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Armes à une Main"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 4),
					new Effect(TypeEffect.DegHa, false, 4),
					new Effect(TypeEffect.DegMa, false, 4),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.DegHa, false, 6),
					new Effect(TypeEffect.DegMa, false, 6),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.DegHa, false, 8),
					new Effect(TypeEffect.DegMa, false, 8),
					new Effect(TypeEffect.VitAtk, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 9),
					new Effect(TypeEffect.DegHa, false, 9),
					new Effect(TypeEffect.DegMa, false, 9),
					new Effect(TypeEffect.VitAtk, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.DegHa, false, 10),
					new Effect(TypeEffect.DegMa, false, 10),
					new Effect(TypeEffect.VitAtk, false, 29),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.DegHa, false, 11),
					new Effect(TypeEffect.DegMa, false, 11),
					new Effect(TypeEffect.VitAtk, false, 31),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Armes à deux Mains"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 4),
					new Effect(TypeEffect.DegHa2M, false, 4),
					new Effect(TypeEffect.DegMa2M, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 7),
					new Effect(TypeEffect.DegHa2M, false, 7),
					new Effect(TypeEffect.DegMa2M, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 10),
					new Effect(TypeEffect.DegHa2M, false, 10),
					new Effect(TypeEffect.DegMa2M, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 12),
					new Effect(TypeEffect.DegHa2M, false, 12),
					new Effect(TypeEffect.DegMa2M, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 14),
					new Effect(TypeEffect.DegHa2M, false, 14),
					new Effect(TypeEffect.DegMa2M, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 16),
					new Effect(TypeEffect.DegHa2M, false, 16),
					new Effect(TypeEffect.DegMa2M, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bouclier"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "1-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 3),
					new Effect(TypeEffect.IntComp, false, -20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
					new Effect(TypeEffect.IntComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
					new Effect(TypeEffect.IntComp, false, -30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 11),
					new Effect(TypeEffect.IntComp, false, -35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 13),
					new Effect(TypeEffect.IntComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 15),
					new Effect(TypeEffect.IntComp, false, -45),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Peau Rêche et Chair Dure"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "0-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 13),
					new Effect(TypeEffect.ReducStdD, false, 13),
					new Effect(TypeEffect.ReducSkillP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.DefP, true, 11),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Posture Délicate"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "0-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 15),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 20),
					new Effect(TypeEffect.ESQ, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 30),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 40),
					new Effect(TypeEffect.ESQ, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.ESQ, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Parade Puissante"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "1-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 10),
					new SkillEffect(TypeSkillEffect.Class1S12, 6, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 6, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 12),
					new SkillEffect(TypeSkillEffect.Class1S12, 8, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 8, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 8, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 14),
					new SkillEffect(TypeSkillEffect.Class1S12, 10, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 10, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 10, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 15),
					new SkillEffect(TypeSkillEffect.Class1S12, 15, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 15, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 15, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 16),
					new SkillEffect(TypeSkillEffect.Class1S12, 20, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 20, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 20, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 17),
					new SkillEffect(TypeSkillEffect.Class1S12, 25, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S13, 25, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class1S14, 25, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté de Fer"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "1-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 14),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 18),
					new Effect(TypeEffect.VitComp, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 22),
					new Effect(TypeEffect.VitComp, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 23),
					new Effect(TypeEffect.VitComp, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 24),
					new Effect(TypeEffect.VitComp, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 25),
					new Effect(TypeEffect.VitComp, false, 70),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura d'Exécration"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "0-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 65),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 75),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esquive Magique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 5),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 5),
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 6),
					new Effect(TypeEffect.Depla, false, 7),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Destruction Mortelle"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.Toucher, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dégâts Puissants"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Règne de Glace"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-15", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 30),
					new Effect(TypeEffect.ReducSkillM, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Création de Menace"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 10),
					new Effect(TypeEffect.VitAtk, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 12),
					new Effect(TypeEffect.VitAtk, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 14),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur Décuplée"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 3),
					new Effect(TypeEffect.FCE, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 3),
					new Effect(TypeEffect.FCE, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 4),
					new Effect(TypeEffect.FCE, false, 35),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vérité Fondamentale"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-18", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S15, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S16, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S17, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S15, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S16, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S17, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S15, 35, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S16, 35, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S17, 35, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Enchaînement Obscur"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 30),
					new StaticEffect(TypeStaticEffect.x2STD_old, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bataille Lumineuse"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.DegStdP, false, 5),
					new Effect(TypeEffect.DegStdD, false, 5),
					new Effect(TypeEffect.DegSkillP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.DegStdP, false, 6),
					new Effect(TypeEffect.DegStdD, false, 6),
					new Effect(TypeEffect.DegSkillP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new Effect(TypeEffect.DegStdP, false, 7),
					new Effect(TypeEffect.DegStdD, false, 7),
					new Effect(TypeEffect.DegSkillP, false, 7),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Garde Spéciale"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 2),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 4),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 6),
					new Effect(TypeEffect.VIT, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sublimation du Sacré"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "1-22", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new SkillEffect(TypeSkillEffect.Class1S18, 20, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class1S19, 20, TypeValue.HEAL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new SkillEffect(TypeSkillEffect.Class1S18, 25, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class1S19, 25, TypeValue.HEAL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 30),
					new SkillEffect(TypeSkillEffect.Class1S18, 30, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class1S19, 30, TypeValue.HEAL),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gloire Sacrée"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "1-23", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S20, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S21, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S20, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S21, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class1S20, 26, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class1S21, 26, TypeValue.DAMAGE),
				},
			}),
		};
	}
	
	static Talent[] getClass2() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Art de l'Épée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 12),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 13),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Tir"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "2-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 6),
					new Effect(TypeEffect.DegGun, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 8),
					new Effect(TypeEffect.DegGun, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 10),
					new Effect(TypeEffect.DegGun, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 13),
					new Effect(TypeEffect.DegGun, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 16),
					new Effect(TypeEffect.DegGun, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 18),
					new Effect(TypeEffect.DegGun, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Sniper"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "2-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réaction Réflexe"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.ReducStdP, false, 6),
					new Effect(TypeEffect.ReducStdD, false, 6),
					new Effect(TypeEffect.ReducSkillP, false, 6),
					new Effect(TypeEffect.ReducSkillM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 9),
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
					new Effect(TypeEffect.ReducSkillM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 14),
					new Effect(TypeEffect.ReducStdP, false, 14),
					new Effect(TypeEffect.ReducStdD, false, 14),
					new Effect(TypeEffect.ReducSkillP, false, 14),
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.ReducStdP, false, 16),
					new Effect(TypeEffect.ReducStdD, false, 16),
					new Effect(TypeEffect.ReducSkillP, false, 16),
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Critique Mortel"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sprint"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prémonition"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "2-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 8),
					new Effect(TypeEffect.RDCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 13),
					new Effect(TypeEffect.RDCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 18),
					new Effect(TypeEffect.RDCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 23),
					new Effect(TypeEffect.RDCCP, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RDCCP, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 32),
					new Effect(TypeEffect.RDCCP, false, 65),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tir Rapide"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "2-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 26),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Visée"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "2-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fuite Explosive Magique"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "2-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 6),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 12),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 18),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 24),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 36),
					new Effect(TypeEffect.ESQ, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Précision"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "2-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 1),
					new Effect(TypeEffect.DCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
					new Effect(TypeEffect.DCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.DCCP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 9),
					new Effect(TypeEffect.DCCP, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 11),
					new Effect(TypeEffect.DCCP, false, 19),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Défense"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "2-11", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.DegEp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
					new Effect(TypeEffect.DegEp, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -30),
					new Effect(TypeEffect.DegEp, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -35),
					new Effect(TypeEffect.DegEp, false, 80),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.DegEp, false, 100),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -45),
					new Effect(TypeEffect.DegEp, false, 120),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Génie du Combat"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert en Destruction"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Raid d'Élite"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 7),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 7),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 8),
					new Effect(TypeEffect.Toucher, false, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance au Malin"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 8),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre du Vent"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "2-16", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 6),
					new Effect(TypeEffect.ESQ, false, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise de Menace"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -18),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -22),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réaction de Survie"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "2-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.AGI, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.AGI, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15),
					new Effect(TypeEffect.AGI, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance Suprême"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "2-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.AGI, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.AGI, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Mortel"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "2-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bond Transcendant"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-23", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S3, 1, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S3, 2.5, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 2.5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S3, 4, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class2S6, 4, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Visée du Point Faible"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-20", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S13, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class2S14, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S13, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class2S14, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S13, 35, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class2S14, 35, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Triple Enchaînement"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "2-23", new Calculable[][] {
				new Calculable[] {
					new Proc(2, Activation.Skill, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Triple, 70, 50),
					}),
				},
				new Calculable[] {
					new Proc(5, Activation.Skill, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Triple, 70, 50),
					}),
				},
				new Calculable[] {
					new Proc(8, Activation.Skill, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Triple, 70, 50),
					}),
				},
			}),
		};
	}
	
	static Talent[] getClass3() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Art de l'Épée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 11),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 12),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 13),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Tir"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "2-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Sniper"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "2-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réaction Réflexe"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.ReducStdP, false, 6),
					new Effect(TypeEffect.ReducStdD, false, 6),
					new Effect(TypeEffect.ReducSkillP, false, 6),
					new Effect(TypeEffect.ReducSkillM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 9),
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
					new Effect(TypeEffect.ReducSkillM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 14),
					new Effect(TypeEffect.ReducStdP, false, 14),
					new Effect(TypeEffect.ReducStdD, false, 14),
					new Effect(TypeEffect.ReducSkillP, false, 14),
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.ReducStdP, false, 16),
					new Effect(TypeEffect.ReducStdD, false, 16),
					new Effect(TypeEffect.ReducSkillP, false, 16),
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Critique Mortel"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sprint"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "2-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prémonition"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "2-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 8),
					new Effect(TypeEffect.RDCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 13),
					new Effect(TypeEffect.RDCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 18),
					new Effect(TypeEffect.RDCCP, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 23),
					new Effect(TypeEffect.RDCCP, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RDCCP, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 32),
					new Effect(TypeEffect.RDCCP, false, 65),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Furtif"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "3-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCC1M, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renforcement Démoniaque"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "3-8", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 6, TypeValue.ESQ),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 9, TypeValue.ESQ),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 12, TypeValue.ESQ),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 13, TypeValue.ESQ),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 14, TypeValue.ESQ),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S8, 15, TypeValue.ESQ),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame Fatale"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "3-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 60, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 65, false, WeaponType.EPEE1M),
					new Effect(TypeEffect.TCCP, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque fouettée"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "3-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 15),
					new Effect(TypeEffect.DegDuo, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 20),
					new Effect(TypeEffect.DegDuo, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 25),
					new Effect(TypeEffect.DegDuo, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 25),
					new Effect(TypeEffect.DegDuo, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 25),
					new Effect(TypeEffect.DegDuo, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 25),
					new Effect(TypeEffect.DegDuo, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fuite Explosive Magique"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "2-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 6),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 12),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 18),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 24),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 36),
					new Effect(TypeEffect.ESQ, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert en Lames Jumelles"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 10),
					new Effect(TypeEffect.FCE, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 12),
					new Effect(TypeEffect.FCE, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 15),
					new Effect(TypeEffect.FCE, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat Physique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.Toucher, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sublimation du Corps"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 4),
					new Effect(TypeEffect.PM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.PM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.PM, true, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection de l'Ombre"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.ESQ, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -12),
					new Effect(TypeEffect.ESQ, false, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître Assassin"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "2-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.FCE, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.FCE, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.FCE, false, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esquive Fatale"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.RTCCM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RTCCM, false, 7),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Avancée Furtive"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-22", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.AGI, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.AGI, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.AGI, false, 50),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loi du Talion"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Enchaînement Brutal"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD_old, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD_old, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD_old, 9),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Raid du K.O."); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
					new SkillEffect(TypeSkillEffect.Class3S9, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S10, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 8),
					new SkillEffect(TypeSkillEffect.Class3S9, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S10, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new SkillEffect(TypeSkillEffect.Class3S9, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S10, 25, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Machine à Tuer"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "2-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 5),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 10),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 15),
					new Effect(TypeEffect.TCCP, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sublimation de l'Ombre"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "2-16", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S5, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S11, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S5, 29, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S11, 29, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S5, 35, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class3S11, 35, TypeValue.DAMAGE),
				},
			}),
		};
	}
	
	static Talent[] getClass4() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Maillet"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 6),
					new Proc(5, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 8),
					new Proc(5, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 10),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 12),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 14),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 16),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Défense Magique"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vie Tenace"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.RTCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.RTCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.RTCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.RTCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.RTCCP, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie Abondante"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 8),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 9),
					new Effect(TypeEffect.RTCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.RTCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 11),
					new Effect(TypeEffect.RTCCM, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 12),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 13),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guide Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -70),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bouclier"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "1-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 3),
					new Effect(TypeEffect.IntComp, false, -20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
					new Effect(TypeEffect.IntComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
					new Effect(TypeEffect.IntComp, false, -30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 11),
					new Effect(TypeEffect.IntComp, false, -35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 13),
					new Effect(TypeEffect.IntComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 15),
					new Effect(TypeEffect.IntComp, false, -45),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir du Sacré"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "4-7", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 11, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 11, TypeValue.HEAL),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 13, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 13, TypeValue.HEAL),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 15, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 15, TypeValue.HEAL),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 20, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 20, TypeValue.HEAL),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 25, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 25, TypeValue.HEAL),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S10, 30, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class4S11, 30, TypeValue.HEAL),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur Sacrée"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "4-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Barrière Bénie"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "4-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 11),
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 13),
					new Effect(TypeEffect.ReducStdP, false, 7),
					new Effect(TypeEffect.ReducStdD, false, 7),
					new Effect(TypeEffect.ReducSkillP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 16),
					new Effect(TypeEffect.ReducStdP, false, 9),
					new Effect(TypeEffect.ReducStdD, false, 9),
					new Effect(TypeEffect.ReducSkillP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 18),
					new Effect(TypeEffect.ReducStdP, false, 11),
					new Effect(TypeEffect.ReducStdD, false, 11),
					new Effect(TypeEffect.ReducSkillP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 13),
					new Effect(TypeEffect.ReducStdD, false, 13),
					new Effect(TypeEffect.ReducSkillP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.RParade, false, 22),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance des Arcanes"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "4-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 20),
					new Effect(TypeEffect.RTCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 22),
					new Effect(TypeEffect.RTCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 26),
					new Effect(TypeEffect.RTCCM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 30),
					new Effect(TypeEffect.RTCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 34),
					new Effect(TypeEffect.RTCCM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 38),
					new Effect(TypeEffect.RTCCM, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maillet Décisif"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "4-11", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 2, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 2, false, WeaponType.MARTEAU2M),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 4, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 4, false, WeaponType.MARTEAU2M),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 6, false, WeaponType.MARTEAU2M),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 8, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 8, false, WeaponType.MARTEAU2M),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 10, false, WeaponType.MARTEAU2M),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 12, false, WeaponType.MARTEAU1M),
					new Effect(TypeEffect.TCCP, false, 12, false, WeaponType.MARTEAU2M),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Acuité Magique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "4-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 7),
					new Effect(TypeEffect.Toucher, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de la Vie"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 4),
					new Effect(TypeEffect.VIT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 4),
					new Effect(TypeEffect.VIT, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 4),
					new Effect(TypeEffect.VIT, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant Réactif"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-22", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mur Protecteur"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RTCCM, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 8),
					new Effect(TypeEffect.RTCCM, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître Bouclier"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
					new Effect(TypeEffect.RParade, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
					new Effect(TypeEffect.RParade, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
					new Effect(TypeEffect.RParade, false, 11),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Plaie Cicatrisée"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 800, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 1000, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 6),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 1200, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Meurtres en Série"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-17", new Calculable[][] {
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 23),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Velléités d'Attaque"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "2-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 45),
					new Effect(TypeEffect.VIT, false, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cœur Magique"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "4-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.DefM, true, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.DefM, true, 9),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir Divin"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15),
					new Effect(TypeEffect.DegStdP, false, 5),
					new Effect(TypeEffect.DegSkillP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15),
					new Effect(TypeEffect.DegStdP, false, 10),
					new Effect(TypeEffect.DegSkillP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.DegStdP, false, 15),
					new Effect(TypeEffect.DegSkillP, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie du Sacré"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 5),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 600, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 5),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 800, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 6),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1000, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explosion Sacrée"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "1-18", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S12, 10, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S13, 10, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S14, 10, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S12, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S13, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S14, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class4S12, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S13, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class4S14, 18, TypeValue.DAMAGE),
				},
			}),
		};
	}
	
	static Talent[] getClass5() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Maillet"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 6),
					new Proc(5, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 8),
					new Proc(5, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 10),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 12),
					new Proc(5, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 14),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 16),
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Défense Magique"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vie Tenace"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.RTCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.RTCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.RTCCP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.RTCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.RTCCP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.RTCCP, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie Abondante"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 8),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 9),
					new Effect(TypeEffect.RTCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.RTCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 11),
					new Effect(TypeEffect.RTCCM, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 12),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 13),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guide Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -70),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier de la Jungle"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "5-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
					new StaticEffect(TypeStaticEffect.Duo),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new StaticEffect(TypeStaticEffect.Duo),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charlatan de la Nature"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "5-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense au Bâton"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aigle Majestueux d'Élite"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "5-9", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
						new Effect(TypeEffect.TCCM, false, 1),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 4),
						new Effect(TypeEffect.TCCM, false, 2),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 6),
						new Effect(TypeEffect.TCCM, false, 3),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 8),
						new Effect(TypeEffect.TCCM, false, 4),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 10),
						new Effect(TypeEffect.TCCM, false, 5),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.AIGLE, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 12),
						new Effect(TypeEffect.TCCM, false, 6),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Spectral d'Élite"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "5-10", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 2),
						new Effect(TypeEffect.TCCP, false, 2),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
						new Effect(TypeEffect.TCCP, false, 4),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
						new Effect(TypeEffect.TCCP, false, 6),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
						new Effect(TypeEffect.TCCP, false, 8),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
						new Effect(TypeEffect.TCCP, false, 10),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.LOUP, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
						new Effect(TypeEffect.TCCP, false, 12),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Singe Géant d'Élite"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "5-11", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 120),
						new Effect(TypeEffect.Atk, false, 30),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 240),
						new Effect(TypeEffect.Atk, false, 60),
					}),
				},

				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 520),
						new Effect(TypeEffect.Atk, false, 120),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 1200),
						new Effect(TypeEffect.Atk, false, 180),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 1180),
						new Effect(TypeEffect.Atk, false, 240),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.SINGE, new Calculable[] {
						new Effect(TypeEffect.PV, false, 2560),
						new Effect(TypeEffect.Atk, false, 300),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert en Bâton"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "4-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 16, false, WeaponType.BATON),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 17, false, WeaponType.BATON),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Précision d'Attaque"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 18),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme du Combattant"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.Feu, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.Feu, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.Feu, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Protecteur"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 8),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 500, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 8),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 700, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 10),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 1000, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Totale"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.DCCP, false, 22),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Position de Défense"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new Effect(TypeEffect.MEN, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new Effect(TypeEffect.MEN, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.MEN, false, 26),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sagesse de la Tempête"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new SkillEffect(TypeSkillEffect.Class5S12, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S13, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25),
					new SkillEffect(TypeSkillEffect.Class5S12, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S13, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new SkillEffect(TypeSkillEffect.Class5S12, 22, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S13, 22, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appel du Combattant"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "3-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.FCE, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Effect(TypeEffect.FCE, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.FCE, false, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Feinte Critique"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 9),
					new Effect(TypeEffect.RTCCM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 10),
					new Effect(TypeEffect.RTCCM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 11),
					new Effect(TypeEffect.RTCCM, false, 11),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aigle Enragé"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "5-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S14, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S15, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S14, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S15, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S14, 26, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S15, 26, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Sanguinaire"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "5-22", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S16, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S17, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S16, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S17, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S16, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class5S17, 25, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Singe Féroce"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-17", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S18, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S18, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S18, 26, TypeValue.DAMAGE),
				},
			}),
		};
	}
	
	static Talent[] getClass6() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explosion Magique Enchaînée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "6-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Défense Magique"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie Abondante"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 8),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 9),
					new Effect(TypeEffect.RTCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.RTCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 11),
					new Effect(TypeEffect.RTCCM, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 12),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 13),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Attaque Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "6-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guide Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -70),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense au Bâton"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Croissance Explosive Magique"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "6-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new Effect(TypeEffect.TCCM, false, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 13),
					new Effect(TypeEffect.TCCM, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 16),
					new Effect(TypeEffect.TCCM, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
					new Effect(TypeEffect.TCCM, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.TCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 22),
					new Effect(TypeEffect.TCCM, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement Focalisé"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "6-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -15),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -25),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -35),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -45),
					new Effect(TypeEffect.VitComp, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -55),
					new Effect(TypeEffect.VitComp, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -65),
					new Effect(TypeEffect.VitComp, false, 26),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Élément Flamme"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "6-9", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 12, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 12, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 12, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 18, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 21, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 21, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 21, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 24, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 24, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 24, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S0, 27, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S1, 27, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S2, 27, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Élément Éclair"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "6-10", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 10, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 10, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 10, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 12, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 12, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 12, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 14, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 14, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 14, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 16, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 16, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 16, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 18, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S3, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S4, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S5, 20, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Élément Glace"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "6-11", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 11, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 11, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 11, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 14, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 14, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 14, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 17, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 17, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 17, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S6, 26, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S7, 26, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class6S8, 26, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Physique d'Acier"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.DefP, true, 22),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magie Sans Pitié"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 15),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 16),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 17),
					new Effect(TypeEffect.Toucher, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge Magique Violente"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "1-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sagesse Occulte"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 45),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Calcul Magique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "3-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -35),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -40),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -45),
					new Effect(TypeEffect.VitComp, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vigueur Retrouvée"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 19),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Couverture Magistrale"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -17),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -19),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Surplus d'Énergie"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "0-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
					new Effect(TypeEffect.INT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
					new Effect(TypeEffect.INT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 16),
					new Effect(TypeEffect.INT, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Don de la Nature"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "6-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.VIT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 30),
					new Effect(TypeEffect.VIT, false, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance en Crise"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "5-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S9, 1, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class6S10, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S9, 2.5, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class6S10, 2.5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class6S9, 4, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class6S10, 4, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance d'Attaque"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.VIT, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Incantation Appliquée"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "6-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -10),
					new Effect(TypeEffect.RDCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -20),
					new Effect(TypeEffect.RDCCM, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -30),
					new Effect(TypeEffect.RDCCM, false, 40),
				},
			}),
		};
	}
	
	static Talent[] getClass7() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explosion Magique Enchaînée"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "6-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Défense Magique"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie Abondante"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 8),
					new Effect(TypeEffect.RTCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 9),
					new Effect(TypeEffect.RTCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.RTCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 11),
					new Effect(TypeEffect.RTCCM, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 12),
					new Effect(TypeEffect.RTCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 13),
					new Effect(TypeEffect.RTCCM, false, 17),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Attaque Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "6-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 21),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guide Magique"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -70),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense au Bâton"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 8, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 12, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 18, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 20, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 22, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 24, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement Focalisé"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "6-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -15),
					new Effect(TypeEffect.VitComp, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -25),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -35),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -45),
					new Effect(TypeEffect.VitComp, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -55),
					new Effect(TypeEffect.VitComp, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -65),
					new Effect(TypeEffect.VitComp, false, 26),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obscure Magie"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "7-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
					new SkillEffect(TypeSkillEffect.Class7S0, 5, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 5, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
					new SkillEffect(TypeSkillEffect.Class7S0, 7, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 7, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
					new SkillEffect(TypeSkillEffect.Class7S0, 9, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 9, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
					new SkillEffect(TypeSkillEffect.Class7S0, 12, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 12, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new SkillEffect(TypeSkillEffect.Class7S0, 15, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 15, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 18),
					new SkillEffect(TypeSkillEffect.Class7S0, 18, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class7S1, 18, TypeValue.DAMAGE),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appel de l'Enfer"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "7-9", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 1, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 1, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 15, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 15, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 2, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 2, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 25, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 25, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 3, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 3, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 35, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 35, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 4, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 4, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 40, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 40, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 5, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 5, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 45, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 45, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S2, 6, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S3, 6, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S4, 50, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S5, 50, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vent de la Sorcière"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "7-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new SkillEffect(TypeSkillEffect.Class7S6, 1, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 1, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 7),
					new SkillEffect(TypeSkillEffect.Class7S6, 2, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 2, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 9),
					new SkillEffect(TypeSkillEffect.Class7S6, 3, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 3, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 11),
					new SkillEffect(TypeSkillEffect.Class7S6, 4, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 4, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 13),
					new SkillEffect(TypeSkillEffect.Class7S6, 5, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 5, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
					new SkillEffect(TypeSkillEffect.Class7S6, 6, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S7, 6, TypeValue.LEVEL),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protecteur des Ténèbres"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "7-11", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -7),
					new SkillEffect(TypeSkillEffect.Class7S8, 1, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 1, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new SkillEffect(TypeSkillEffect.Class7S8, 2, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 2, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -13),
					new SkillEffect(TypeSkillEffect.Class7S8, 3, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 3, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new SkillEffect(TypeSkillEffect.Class7S8, 4, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 4, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -17),
					new SkillEffect(TypeSkillEffect.Class7S8, 5, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 5, TypeValue.LEVEL),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -19),
					new SkillEffect(TypeSkillEffect.Class7S8, 6, TypeValue.LEVEL),
					new SkillEffect(TypeSkillEffect.Class7S9, 6, TypeValue.LEVEL),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corps de Bronze"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 6),
					new Effect(TypeEffect.VIT, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction Ancestrale"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "4-20", new Calculable[][] {
				new Calculable[] {
					new Proc(5, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				},
				new Calculable[] {
					new Proc(5, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				},
				new Calculable[] {
					new Proc(6, Activation.Attack, 7, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection des Ancêtres"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "0-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.RDCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.RDCCP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RDCCP, false, 26),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Retentissant"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "1-18", new Calculable[][] {
				new Calculable[] {
					new Proc(5, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun),
					}),
				},
				new Calculable[] {
					new Proc(6, Activation.Attack, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun),
					}),
				},
				new Calculable[] {
					new Proc(7, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre Volante"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "0-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 10),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 10),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Forme Fantôme"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "2-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 9),
					new Effect(TypeEffect.ReducStdD, false, 9),
					new Effect(TypeEffect.ReducSkillP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pacte de l'Enfer"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
					new Effect(TypeEffect.INT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 6),
					new Effect(TypeEffect.INT, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 7),
					new Effect(TypeEffect.INT, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Couverture Surnaturelle"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "6-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.ESQ, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 30),
					new Effect(TypeEffect.ESQ, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon Vivace"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "1-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -18),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -21),
					new Effect(TypeEffect.Depla, false, 6),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Illusionniste"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "0-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 1, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S11, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 2, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S11, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S10, 3, TypeValue.DURATION),
					new SkillEffect(TypeSkillEffect.Class7S11, 3, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ordre du Sang Noir"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "1-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new SkillEffect(TypeSkillEffect.Class7S12, 10, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class7S13, 10, TypeValue.HEAL),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new SkillEffect(TypeSkillEffect.Class7S12, 13, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class7S13, 13, TypeValue.HEAL),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new SkillEffect(TypeSkillEffect.Class7S12, 15, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class7S13, 15, TypeValue.HEAL),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Commandant Spectral"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S14, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S14, 9, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class7S14, 12, TypeValue.DURATION),
				},
			}),
		};
	}
	
	static Talent[] getClass8() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ultra rapide"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 3),
					new Effect(TypeEffect.Depla, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 6),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 9),
					new Effect(TypeEffect.Depla, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 12),
					new Effect(TypeEffect.Depla, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 18),
					new Effect(TypeEffect.Depla, false, 13),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Instrument de Précision"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appareil d'Amélioration"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
					new Effect(TypeEffect.TCCM, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.TCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.TCCM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 9),
					new Effect(TypeEffect.TCCM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 11),
					new Effect(TypeEffect.TCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 13),
					new Effect(TypeEffect.TCCM, false, 13),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste du Canon lourd"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 6),
					new Effect(TypeEffect.VitAtk, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 8),
					new Effect(TypeEffect.VitAtk, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 8),
					new Effect(TypeEffect.VitAtk, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 9),
					new Effect(TypeEffect.VitAtk, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
					new Effect(TypeEffect.VitAtk, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 11),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste des Machines Légères"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 4),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 6),
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 8),
					new Effect(TypeEffect.VitAtk, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 10),
					new Effect(TypeEffect.VitAtk, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 12),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 14),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste des Machines Lourdes"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 9),
					new Effect(TypeEffect.DCCP, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 11),
					new Effect(TypeEffect.DCCP, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 13),
					new Effect(TypeEffect.DCCP, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification Deux Armes"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "8-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 10),
					new Effect(TypeEffect.TCCP, false, 3),
					new Effect(TypeEffect.TCCM, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 13),
					new Effect(TypeEffect.TCCP, false, 4),
					new Effect(TypeEffect.TCCM, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 16),
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.TCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 19),
					new Effect(TypeEffect.TCCP, false, 6),
					new Effect(TypeEffect.TCCM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 22),
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.TCCM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 25),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.TCCM, false, 8),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification Armure"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "8-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.RTCCM, false, 5),
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.RTCCM, false, 7),
					new Effect(TypeEffect.RDCCP, false, 15),
					new Effect(TypeEffect.RDCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 9),
					new Effect(TypeEffect.RTCCM, false, 9),
					new Effect(TypeEffect.RDCCP, false, 20),
					new Effect(TypeEffect.RDCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 11),
					new Effect(TypeEffect.RTCCM, false, 11),
					new Effect(TypeEffect.RDCCP, false, 25),
					new Effect(TypeEffect.RDCCM, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 13),
					new Effect(TypeEffect.RTCCM, false, 13),
					new Effect(TypeEffect.RDCCP, false, 30),
					new Effect(TypeEffect.RDCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.RDCCP, false, 35),
					new Effect(TypeEffect.RDCCM, false, 35),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification Psionique"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "8-8", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S6, 7, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Perforation"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "8-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Robotique"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "8-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 10),
					new Effect(TypeEffect.ReducStdP, false, 6),
					new Effect(TypeEffect.ReducStdD, false, 6),
					new Effect(TypeEffect.ReducSkillP, false, 6),
					new Effect(TypeEffect.ReducSkillM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 9),
					new Effect(TypeEffect.ReducStdD, false, 9),
					new Effect(TypeEffect.ReducSkillP, false, 9),
					new Effect(TypeEffect.ReducSkillM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
					new Effect(TypeEffect.ReducStdP, false, 12),
					new Effect(TypeEffect.ReducStdD, false, 12),
					new Effect(TypeEffect.ReducSkillP, false, 12),
					new Effect(TypeEffect.ReducSkillM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 50),
					new Effect(TypeEffect.ReducStdP, false, 18),
					new Effect(TypeEffect.ReducStdD, false, 18),
					new Effect(TypeEffect.ReducSkillP, false, 18),
					new Effect(TypeEffect.ReducSkillM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 60),
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
					new Effect(TypeEffect.ReducSkillM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Amortissement"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "8-11", new Calculable[][] {
				new Calculable[] {
					new Proc(20, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.5),
					}),
				},
				new Calculable[] {
					new Proc(22, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.6),
					}),
				},
				new Calculable[] {
					new Proc(24, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.7),
					}),
				},
				new Calculable[] {
					new Proc(26, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.8),
					}),
				},
				new Calculable[] {
					new Proc(28, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.9),
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence de Précision"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "8-12", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 20, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 25, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 30, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence de Défense"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "8-13", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 3, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 4, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 5, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence de Fission"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "8-14", new Calculable[][] {
				new Calculable[] {
					new Proc(10, Activation.Attack, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Dispel),
					}),
				},
				new Calculable[] {
					new Proc(12, Activation.Attack, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Dispel),
					}),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Dispel),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pénétration Critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "8-15", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Crit, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 7),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 8),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 9),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense Critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "8-16", new Calculable[][] {
				new Calculable[] {
					new Proc(15, Activation.Crit, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Block),
					}),
				},
				new Calculable[] {
					new Proc(17, Activation.Crit, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Block),
					}),
				},
				new Calculable[] {
					new Proc(20, Activation.Crit, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Block),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Régénération Critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "8-17", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Crited, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 3, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crited, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 4, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crited, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 5, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification du Démon"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "8-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 17),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification Robotique"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "8-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.AGI, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.AGI, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification Armure"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "8-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.Ombre, false, 20),
					new Effect(TypeEffect.Foudre, false, 20),
					new Effect(TypeEffect.Feu, false, 20),
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.Nature, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new Effect(TypeEffect.Ombre, false, 30),
					new Effect(TypeEffect.Foudre, false, 30),
					new Effect(TypeEffect.Feu, false, 30),
					new Effect(TypeEffect.Glace, false, 30),
					new Effect(TypeEffect.Nature, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Effect(TypeEffect.Ombre, false, 40),
					new Effect(TypeEffect.Foudre, false, 40),
					new Effect(TypeEffect.Feu, false, 40),
					new Effect(TypeEffect.Glace, false, 40),
					new Effect(TypeEffect.Nature, false, 40),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur Infinie"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "8-21", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S7, 0.5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S7, 0.7, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S7, 0.9, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Régénération Infinie"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "8-22", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S8, 5, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class8S8, 10, TypeValue.MANA),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S8, 6, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class8S8, 12, TypeValue.MANA),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S8, 7, TypeValue.HEAL),
					new SkillEffect(TypeSkillEffect.Class8S8, 14, TypeValue.MANA),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lacérations Infinies"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "8-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 3),
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 5),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 7),
					new Effect(TypeEffect.TCCP, false, 5),
				},
			}),
		};
	}
	
	static Talent[] getClass9() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ultra rapide"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 3),
					new Effect(TypeEffect.Depla, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 6),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 9),
					new Effect(TypeEffect.Depla, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 12),
					new Effect(TypeEffect.Depla, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 18),
					new Effect(TypeEffect.Depla, false, 13),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Instrument de Précision"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appareil d'Amélioration"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "8-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
					new Effect(TypeEffect.TCCM, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.TCCM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.TCCM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 9),
					new Effect(TypeEffect.TCCM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 11),
					new Effect(TypeEffect.TCCM, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 13),
					new Effect(TypeEffect.TCCM, false, 13),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste du Canon lourd"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 6),
					new Effect(TypeEffect.VitAtk, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 8),
					new Effect(TypeEffect.VitAtk, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 8),
					new Effect(TypeEffect.VitAtk, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 9),
					new Effect(TypeEffect.VitAtk, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 10),
					new Effect(TypeEffect.VitAtk, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkD, true, 11),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste des Machines Légères"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 4),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 6),
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 8),
					new Effect(TypeEffect.VitAtk, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 10),
					new Effect(TypeEffect.VitAtk, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 12),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 14),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste des Machines Lourdes"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "8-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 9),
					new Effect(TypeEffect.DCCP, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 11),
					new Effect(TypeEffect.DCCP, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 13),
					new Effect(TypeEffect.DCCP, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegMeca2M, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explosion Améliorée"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "9-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
					new Effect(TypeEffect.DCCM, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
					new Effect(TypeEffect.DCCM, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Effect(TypeEffect.DCCM, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Effect(TypeEffect.DCCM, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 60),
					new Effect(TypeEffect.DCCM, false, 60),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chargement Rapide"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "9-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 27),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification Élémentaire"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "9-8", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class9S0, 7, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Pénétration"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "9-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 3),
					new Effect(TypeEffect.TCCP, false, 6),
					new Effect(TypeEffect.TCCM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 4.5),
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.TCCM, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 6),
					new Effect(TypeEffect.TCCP, false, 8),
					new Effect(TypeEffect.TCCM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 7.5),
					new Effect(TypeEffect.TCCP, false, 9),
					new Effect(TypeEffect.TCCM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 9),
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 10),
					new Effect(TypeEffect.TCCP, false, 11),
					new Effect(TypeEffect.TCCM, false, 11),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Mouvement"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "9-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 16),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chargement Éclair"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "9-11", new Calculable[][] {
				new Calculable[] {
					new Proc(15, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.5),
					}),
				},
				new Calculable[] {
					new Proc(16, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.6),
					}),
				},
				new Calculable[] {
					new Proc(17, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.7),
					}),
				},
				new Calculable[] {
					new Proc(18, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.8),
					}),
				},
				new Calculable[] {
					new Proc(19, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 0.9),
					}),
				},
				new Calculable[] {
					new Proc(20, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence de déplacement"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "9-12", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(15, Activation.Attack, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Push, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(17, Activation.Attack, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Push, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(20, Activation.Attack, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Push, Target.OPPONENT),
						}),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence d'esquive"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "9-13", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -50, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -60, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -70, Target.OPPONENT),
						}),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence Magique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "9-14", new Calculable[][] {
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -6, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -7, Target.OPPONENT),
						}),
					}),
				},
				new Calculable[] {
					new Condition(TypeCondition.INTER3, new Calculable[] {
						new Proc(100, Activation.Attack, 8, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -8, Target.OPPONENT),
						}),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche Critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "9-15", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 5),
						new Effect(TypeEffect.PeneM, false, 5),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 6),
						new Effect(TypeEffect.PeneM, false, 6),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 7),
						new Effect(TypeEffect.PeneM, false, 7),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Récupération critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "9-16", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 0.8, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PV, true, 1.2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PV, true, 1.4, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.Crit, 8, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.2, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PV, true, 1.6, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Recharge Critique"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "9-17", new Calculable[][] {
				new Calculable[] {
					new Proc(20, Activation.Crit, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S5, 1, TypeValue.NUMBER),
					}),
				},
				new Calculable[] {
					new Proc(25, Activation.Crit, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S5, 1, TypeValue.NUMBER),
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Crit, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class8S5, 1, TypeValue.NUMBER),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification du Cœur"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "9-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5),
					new Effect(TypeEffect.VIT, false, 5),
					new Effect(TypeEffect.INT, false, 5),
					new Effect(TypeEffect.VOL, false, 5),
					new Effect(TypeEffect.AGI, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8),
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.INT, false, 8),
					new Effect(TypeEffect.VOL, false, 8),
					new Effect(TypeEffect.AGI, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new Effect(TypeEffect.VIT, false, 12),
					new Effect(TypeEffect.INT, false, 12),
					new Effect(TypeEffect.VOL, false, 12),
					new Effect(TypeEffect.AGI, false, 12),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification Arme mécanique"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "9-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
					new Effect(TypeEffect.DCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 25),
					new Effect(TypeEffect.DCCM, false, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Modification Propulseur"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "9-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new Effect(TypeEffect.ESQ, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
					new Effect(TypeEffect.ESQ, false, 30),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accélération Téléportation"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "9-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 3),
					new Proc(100, Activation.Attacked, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class9S2, 0.5, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S3, 0.5, TypeValue.RELOAD),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5),
					new Proc(100, Activation.Attacked, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class9S2, 0.6, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S3, 0.6, TypeValue.RELOAD),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 7),
					new Proc(100, Activation.Attacked, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class9S2, 0.7, TypeValue.RELOAD),
						new SkillEffect(TypeSkillEffect.Class9S3, 0.7, TypeValue.RELOAD),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accélération Furtivité"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "9-22", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 3),
					new SkillEffect(TypeSkillEffect.Class9S4, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 4),
					new SkillEffect(TypeSkillEffect.Class9S4, 8, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new SkillEffect(TypeSkillEffect.Class9S4, 10, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accélération Missile"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "9-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
					new Effect(TypeEffect.TCCM, false, 3),
					new SkillEffect(TypeSkillEffect.Class9S5, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 4),
					new Effect(TypeEffect.TCCM, false, 4),
					new SkillEffect(TypeSkillEffect.Class9S5, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.TCCM, false, 5),
					new SkillEffect(TypeSkillEffect.Class9S5, 7, TypeValue.DURATION),
				},
			}),
		};
	}
	
	static Talent[] getClass10() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Lame"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 12),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 14),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 16),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton-clé"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 5),
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.CostComp, false, -20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.CostComp, false, -30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 26),
					new Effect(TypeEffect.CostComp, false, -60),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Mortel"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.2, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.4, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.6, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.8, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION),
					}, 3),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combustion de Cristal"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume du Chaos"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 5),
					new Effect(TypeEffect.ReducPeneM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 14),
					new Effect(TypeEffect.ReducPeneM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 23),
					new Effect(TypeEffect.ReducPeneM, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 32),
					new Effect(TypeEffect.ReducPeneM, false, 32),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 41),
					new Effect(TypeEffect.ReducPeneM, false, 41),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 50),
					new Effect(TypeEffect.ReducPeneM, false, 50),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marche du Néant"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combo Magique"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "10-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 8),
					new StaticEffect(TypeStaticEffect.x2STD_old, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
					new StaticEffect(TypeStaticEffect.x2STD_old, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 12),
					new StaticEffect(TypeStaticEffect.x2STD_old, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 14),
					new StaticEffect(TypeStaticEffect.x2STD_old, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 16),
					new StaticEffect(TypeStaticEffect.x2STD_old, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 18),
					new StaticEffect(TypeStaticEffect.x2STD_old, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame Démoniaque"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "10-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification Cristalline"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "10-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 8),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 9),
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.VitAtk, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 11),
					new Effect(TypeEffect.VitAtk, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 12),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 13),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pénétration Spatiale"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "10-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.PeneM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Royaume"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "10-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 10),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Effect(TypeEffect.DefP, true, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
					new Effect(TypeEffect.DefP, true, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.DefP, true, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 50),
					new Effect(TypeEffect.DefP, true, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 60),
					new Effect(TypeEffect.DefP, true, 25),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force du Royaume du Vide"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "10-11", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S0, 7, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame Magique Sans Pitié"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "10-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Effect(TypeEffect.Depla, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 7),
					new Effect(TypeEffect.Depla, false, 9),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corps Démoniaque"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "10-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 5),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 6),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 7),
					new Effect(TypeEffect.ESQ, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sceau de Cristal"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "10-14", new Calculable[][] {
				new Calculable[] {
					new Proc(10, Activation.CritMag, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(11, Activation.CritMag, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(12, Activation.CritMag, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerre Véritable"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "10-15", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Double, 5),
						}),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Double, 7),
						}),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Proc(100, Activation.Attack, new Calculable[] {
							new MultipleHit(TypeMultipleHit.Double, 10),
						}),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien Briseur de Sort"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "10-16", new Calculable[][] {
				new Calculable[] {
					new Proc(5, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 100),
					}),
				},
				new Calculable[] {
					new Proc(7, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 100),
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 100),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge du Cristal de Sang"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "10-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 2),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 3),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2.2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 4),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2.4, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "L'Ambition du Voyageur"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "10-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réflexion magique"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "10-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chaîne de Sang"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "10-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 17),
					new StaticEffect(TypeStaticEffect.x3STD_old, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x3STD_old, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Déclencher l'Impact"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "10-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new SkillEffect(TypeSkillEffect.Class10S1, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new SkillEffect(TypeSkillEffect.Class10S1, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new SkillEffect(TypeSkillEffect.Class10S1, 3, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vide Infini"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "10-22", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S2, 0.5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S2, 0.7, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class10S2, 1, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe de Bouclier"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "10-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new SkillEffect(TypeSkillEffect.Class10S3, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
					new SkillEffect(TypeSkillEffect.Class10S3, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
					new SkillEffect(TypeSkillEffect.Class10S3, 3, TypeValue.DURATION),
				},
			}),
		};
	}
	
	static Talent[] getClass11() {
		return new Talent[] {
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Lame"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 6),
					new Effect(TypeEffect.Toucher, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 8),
					new Effect(TypeEffect.Toucher, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 10),
					new Effect(TypeEffect.Toucher, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 12),
					new Effect(TypeEffect.Toucher, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 14),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegLa, false, 16),
					new Effect(TypeEffect.Toucher, false, 18),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialité Bâton-clé"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 5),
					new Effect(TypeEffect.CostComp, false, -10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.CostComp, false, -20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.CostComp, false, -30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.CostComp, false, -40),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 23),
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 26),
					new Effect(TypeEffect.CostComp, false, -60),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Mortel"); put(Language.EN, ""); }}, new int[] { 6, 14, 31, 61, 86, 91 }, "10-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.2, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.4, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.6, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 1.8, TypeRegen.REGENERATION),
					}, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION),
					}, 3),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combustion de Cristal"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9),
					new Effect(TypeEffect.DCCM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 13),
					new Effect(TypeEffect.DCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new Effect(TypeEffect.DCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 18),
					new Effect(TypeEffect.DCCM, false, 24),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume du Chaos"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 5),
					new Effect(TypeEffect.ReducPeneM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 14),
					new Effect(TypeEffect.ReducPeneM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 23),
					new Effect(TypeEffect.ReducPeneM, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 32),
					new Effect(TypeEffect.ReducPeneM, false, 32),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 41),
					new Effect(TypeEffect.ReducPeneM, false, 41),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 50),
					new Effect(TypeEffect.ReducPeneM, false, 50),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marche du Néant"); put(Language.EN, ""); }}, new int[] { 16, 28, 46, 66, 86, 91 }, "10-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Perfusion du Bâton-clé"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "11-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 5),
					new StaticEffect(TypeStaticEffect.x2STD_old, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 7),
					new StaticEffect(TypeStaticEffect.x2STD_old, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 9),
					new StaticEffect(TypeStaticEffect.x2STD_old, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 11),
					new StaticEffect(TypeStaticEffect.x2STD_old, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 13),
					new StaticEffect(TypeStaticEffect.x2STD_old, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 15),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de Cristal"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "11-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 8),
					new Effect(TypeEffect.ReducStdD, false, 8),
					new Effect(TypeEffect.ReducSkillP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 11),
					new Effect(TypeEffect.ReducStdD, false, 11),
					new Effect(TypeEffect.ReducSkillP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 14),
					new Effect(TypeEffect.ReducStdD, false, 14),
					new Effect(TypeEffect.ReducSkillP, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 17),
					new Effect(TypeEffect.ReducStdD, false, 17),
					new Effect(TypeEffect.ReducSkillP, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 20),
					new Effect(TypeEffect.ReducStdD, false, 20),
					new Effect(TypeEffect.ReducSkillP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 23),
					new Effect(TypeEffect.ReducStdD, false, 23),
					new Effect(TypeEffect.ReducSkillP, false, 23),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Concentration d'Incantation"); put(Language.EN, ""); }}, new int[] { 31, 41, 50, 69, 86, 91 }, "11-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -15),
					new Effect(TypeEffect.Toucher, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -25),
					new Effect(TypeEffect.Toucher, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -35),
					new Effect(TypeEffect.Toucher, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -45),
					new Effect(TypeEffect.Toucher, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -55),
					new Effect(TypeEffect.Toucher, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -65),
					new Effect(TypeEffect.Toucher, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combustion du Cristal"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "11-9", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new Effect(TypeEffect.DCCM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new Effect(TypeEffect.DCCM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new Effect(TypeEffect.DCCM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Effect(TypeEffect.DCCM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Effect(TypeEffect.DCCM, false, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 7),
					new Effect(TypeEffect.DCCM, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume de Chronos"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "11-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.Depla, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
					new Effect(TypeEffect.Depla, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -30),
					new Effect(TypeEffect.Depla, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -35),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.Depla, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -45),
					new Effect(TypeEffect.Depla, false, 14),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force de la Maîtrise du Temps"); put(Language.EN, ""); }}, new int[] { 46, 50, 54, 72, 86, 91 }, "11-11", new Calculable[][] {
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 3, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 4, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 5, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 6, TypeValue.DURATION),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class11S0, 7, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut de la Clé Magique"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "11-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 5),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
					new Effect(TypeEffect.DCCM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 15),
					new Effect(TypeEffect.DCCM, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spectre de l'Ombre"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "11-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 5),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 6),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCM, false, 7),
					new Effect(TypeEffect.ESQ, false, 15),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal Tremblant"); put(Language.EN, ""); }}, new int[] { 66, 80, 91 }, "11-14", new Calculable[][] {
				new Calculable[] {
					new Proc(10, Activation.CritMag, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(11, Activation.CritMag, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(12, Activation.CritMag, 2, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pénétration de Mana"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "11-15", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 7),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 8),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 9),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection de Chronos"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "11-16", new Calculable[][] {
				new Calculable[] {
					new Proc(30, Activation.CritedPhys, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 50),
					}),
				},
				new Calculable[] {
					new Proc(32, Activation.CritedPhys, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 55),
					}),
				},
				new Calculable[] {
					new Proc(35, Activation.CritedPhys, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 60),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge du Cristal"); put(Language.EN, ""); }}, new int[] { 70, 83, 93 }, "11-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 2),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 3),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2.2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 4),
					new Proc(100, Activation.CritMag, new Calculable[] {
						new RegenEffect(TypeEffect.PM, true, 2.4, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "L'Esprit du Voyageur"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "11-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VIT, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VIT, false, 20),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réflexion de la Frappe Royale"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "11-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP_old, false, 100),
						new Effect(TypeEffect.ReflectM_old, false, 100),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe de l'Ombre"); put(Language.EN, ""); }}, new int[] { 73, 87, 97 }, "11-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new StaticEffect(TypeStaticEffect.x3STD_old, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
					new StaticEffect(TypeStaticEffect.x3STD_old, 10),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Déclencher l'Explosion"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "11-21", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new SkillEffect(TypeSkillEffect.Class11S1, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 15),
					new SkillEffect(TypeSkillEffect.Class11S1, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new SkillEffect(TypeSkillEffect.Class11S1, 3, TypeValue.DURATION),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mort Éternelle"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "11-22", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 3),
					new Proc(100, Activation.CritedMag, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class11S2, 0.5, TypeValue.RELOAD),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 4),
					new Proc(100, Activation.CritedMag, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class11S2, 0.7, TypeValue.RELOAD),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 5),
					new Proc(100, Activation.CritedMag, new Calculable[] {
						new SkillEffect(TypeSkillEffect.Class11S2, 1, TypeValue.RELOAD),
					}),
				},
			}),
			new Talent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier de Lumière"); put(Language.EN, ""); }}, new int[] { 77, 90, 100 }, "11-23", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 3),
					new SkillEffect(TypeSkillEffect.Class11S3, 1, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 4),
					new SkillEffect(TypeSkillEffect.Class11S3, 2, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new SkillEffect(TypeSkillEffect.Class11S3, 3, TypeValue.DURATION),
				},
			}),
		};
	}
}
