package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.characUpgrade.Talent;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.SkillEffect.TypeValue;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class LoaderTalent {
	
	static Talent[] getClass0() {
		return new Talent[] {
			new Talent("Spécialité Art de l'Épée", new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
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
			new Talent("Spécialité Hache", new int[] { 6, 14, 31, 61, 86, 91 }, "0-1", new Calculable[][] {
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
			new Talent("Spécialité Maillet", new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
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
			new Talent("Vie Tenace", new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
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
			new Talent("Spécialité Armes à une Main", new int[] { 16, 28, 46, 66, 86, 91 }, "0-4", new Calculable[][] {
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
			new Talent("Spécialité Armes à deux Mains", new int[] { 16, 28, 46, 66, 86, 91 }, "0-5", new Calculable[][] {
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
			new Talent("Peau Rêche et Chair Dure", new int[] { 31, 41, 50, 69, 86, 91 }, "0-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 11),
				},
			}),
			new Talent("Posture Délicate", new int[] { 31, 41, 50, 69, 86, 91 }, "0-7", new Calculable[][] {
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
			new Talent("Ambidextrie", new int[] { 31, 41, 50, 69, 86, 91 }, "0-8", new Calculable[][] {
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
			new Talent("Aura d'Exécration", new int[] { 46, 50, 54, 72, 86, 91 }, "0-9", new Calculable[][] {
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
			new Talent("Coup Fulgurant", new int[] { 46, 50, 54, 72, 86, 91 }, "0-10", new Calculable[][] {
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
			new Talent("Attaque Maniaque", new int[] { 46, 50, 54, 72, 86, 91 }, "0-11", new Calculable[][] {
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
			new Talent("Posture Foudroyante", new int[] { 66, 80, 91 }, "0-12", new Calculable[][] {
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
			new Talent("Parade Salvatrice", new int[] { 66, 80, 91 }, "0-13", new Calculable[][] {
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
			new Talent("Rupture Magique", new int[] { 66, 80, 91 }, "0-14", new Calculable[][] {
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
			new Talent("Règne du Feu", new int[] { 70, 83, 93 }, "0-15", new Calculable[][] {
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
			new Talent("Bouclier Expert", new int[] { 70, 83, 93 }, "0-16", new Calculable[][] {
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
			new Talent("Barrière Magique", new int[] { 70, 83, 93 }, "0-17", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 12),
				},
			}),
			new Talent("Entraînement Martial", new int[] { 73, 87, 97 }, "0-18", new Calculable[][] {
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
			new Talent("Entraînement d'Athlète", new int[] { 73, 87, 97 }, "0-19", new Calculable[][] {
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
			new Talent("Combat Absolu", new int[] { 73, 87, 97 }, "0-20", new Calculable[][] {
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
			new Talent("Danse du Sabre", new int[] { 77, 90, 100 }, "0-21", new Calculable[][] {
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
			new Talent("Secousses en Chaîne", new int[] { 77, 90, 100 }, "0-22", new Calculable[][] {
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD, 2),
					new SkillEffect(TypeSkillEffect.Class0S13, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD, 5),
					new SkillEffect(TypeSkillEffect.Class0S13, 23, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 23, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD, 8),
					new SkillEffect(TypeSkillEffect.Class0S13, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S14, 25, TypeValue.DAMAGE),
				},
			}),
			new Talent("Sublimation de la Destinée", new int[] { 77, 90, 100 }, "0-23", new Calculable[][] {
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
			new Talent("Spécialité Art de l'Épée", new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
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
			new Talent("Spécialité Hache", new int[] { 6, 14, 31, 61, 86, 91 }, "0-1", new Calculable[][] {
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
			new Talent("Spécialité Maillet", new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
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
			new Talent("Vie Tenace", new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
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
			new Talent("Spécialité Armes à une Main", new int[] { 16, 28, 46, 66, 86, 91 }, "0-4", new Calculable[][] {
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
			new Talent("Spécialité Armes à deux Mains", new int[] { 16, 28, 46, 66, 86, 91 }, "0-5", new Calculable[][] {
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
			new Talent("Spécialité Bouclier", new int[] { 31, 41, 50, 69, 86, 91 }, "1-6", new Calculable[][] {
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
			new Talent("Peau Rêche et Chair Dure", new int[] { 31, 41, 50, 69, 86, 91 }, "0-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 8),
					new Effect(TypeEffect.NONE, false, 0),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 13),
					new Effect(TypeEffect.NONE, false, 0),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.NONE, false, 0),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.DefP, true, 11),
				},
			}),
			new Talent("Posture Délicate", new int[] { 31, 41, 50, 69, 86, 91 }, "0-7", new Calculable[][] {
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
			new Talent("Parade Puissante", new int[] { 46, 50, 54, 72, 86, 91 }, "1-9", new Calculable[][] {
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
			new Talent("Volonté de Fer", new int[] { 46, 50, 54, 72, 86, 91 }, "1-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 14),
					new Effect(TypeEffect.VitComp, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 18),
					new Effect(TypeEffect.VitComp, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 22),
					new Effect(TypeEffect.VitComp, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 23),
					new Effect(TypeEffect.VitComp, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 24),
					new Effect(TypeEffect.VitComp, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 25),
					new Effect(TypeEffect.VitComp, false, 70),
				},
			}),
			new Talent("Aura d'Exécration", new int[] { 46, 50, 54, 72, 86, 91 }, "0-9", new Calculable[][] {
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
			new Talent("Esquive Magique", new int[] { 66, 80, 91 }, "1-12", new Calculable[][] {
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
			new Talent("Destruction Mortelle", new int[] { 66, 80, 91 }, "1-13", new Calculable[][] {
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
			new Talent("Dégâts Puissants", new int[] { 66, 80, 91 }, "1-14", new Calculable[][] {
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
			new Talent("Règne de Glace", new int[] { 70, 83, 93 }, "1-15", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.ReducM, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.ReducM, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 30),
					new Effect(TypeEffect.ReducM, false, 6),
				},
			}),
			new Talent("Création de Menace", new int[] { 70, 83, 93 }, "0-19", new Calculable[][] {
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
			new Talent("Fureur Décuplée", new int[] { 70, 83, 93 }, "1-17", new Calculable[][] {
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
			new Talent("Vérité Fondamentale", new int[] { 73, 87, 97 }, "1-18", new Calculable[][] {
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
			new Talent("Enchaînement Obscur", new int[] { 73, 87, 97 }, "1-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 30),
					new StaticEffect(TypeStaticEffect.x2STD, 21),
				},
			}),
			new Talent("Bataille Lumineuse", new int[] { 73, 87, 97 }, "1-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.DegP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.DegP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 30),
					new Effect(TypeEffect.DegP, false, 7),
				},
			}),
			new Talent("Garde Spéciale", new int[] { 77, 90, 100 }, "0-18", new Calculable[][] {
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
			new Talent("Sublimation du Sacré", new int[] { 77, 90, 100 }, "1-22", new Calculable[][] {
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
			new Talent("Gloire Sacrée", new int[] { 77, 90, 100 }, "1-23", new Calculable[][] {
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
			new Talent("Spécialité Art de l'Épée", new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
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
			new Talent("Spécialité Tir", new int[] { 6, 14, 31, 61, 86, 91 }, "2-1", new Calculable[][] {
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
			new Talent("Spécialité Sniper", new int[] { 6, 14, 31, 61, 86, 91 }, "2-2", new Calculable[][] {
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
			new Talent("Réaction Réflexe", new int[] { 16, 28, 46, 66, 86, 91 }, "2-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.ReducP, false, 6),
					new Effect(TypeEffect.ReducM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 9),
					new Effect(TypeEffect.ReducP, false, 8),
					new Effect(TypeEffect.ReducM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
					new Effect(TypeEffect.ReducP, false, 10),
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.ReducP, false, 12),
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 14),
					new Effect(TypeEffect.ReducP, false, 14),
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.ReducP, false, 16),
					new Effect(TypeEffect.ReducM, false, 16),
				},
			}),
			new Talent("Coup Critique Mortel", new int[] { 16, 28, 46, 66, 86, 91 }, "2-4", new Calculable[][] {
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
			new Talent("Sprint", new int[] { 16, 28, 46, 66, 86, 91 }, "2-5", new Calculable[][] {
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
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "2-6", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "2-7", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "2-8", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "2-9", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "2-10", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "2-11", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "2-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "2-13", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "0-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "0-14", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "2-16", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "2-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "2-19", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "2-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "0-23", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "0-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "2-23", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
		};
	}
	
	static Talent[] getClass3() {
		return new Talent[] {
			new Talent("Spécialité Art de l'Épée", new int[] { 6, 14, 31, 61, 86, 91 }, "0-0", new Calculable[][] {
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
			new Talent("Spécialité Tir", new int[] { 6, 14, 31, 61, 86, 91 }, "2-1", new Calculable[][] {
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
			new Talent("Spécialité Sniper", new int[] { 6, 14, 31, 61, 86, 91 }, "2-2", new Calculable[][] {
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
			new Talent("Réaction Réflexe", new int[] { 16, 28, 46, 66, 86, 91 }, "2-3", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
					new Effect(TypeEffect.ReducP, false, 6),
					new Effect(TypeEffect.ReducM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 9),
					new Effect(TypeEffect.ReducP, false, 8),
					new Effect(TypeEffect.ReducM, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
					new Effect(TypeEffect.ReducP, false, 10),
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.ReducP, false, 12),
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 14),
					new Effect(TypeEffect.ReducP, false, 14),
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Effect(TypeEffect.ReducP, false, 16),
					new Effect(TypeEffect.ReducM, false, 16),
				},
			}),
			new Talent("Coup Critique Mortel", new int[] { 16, 28, 46, 66, 86, 91 }, "2-4", new Calculable[][] {
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
			new Talent("Sprint", new int[] { 16, 28, 46, 66, 86, 91 }, "2-5", new Calculable[][] {
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
			new Talent("Prémonition", new int[] { 31, 41, 50, 69, 86, 91 }, "2-6", new Calculable[][] {
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
			new Talent("Coup Furtif", new int[] { 31, 41, 50, 69, 86, 91 }, "3-7", new Calculable[][] {
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
			new Talent("Renforcement Démoniaque", new int[] { 31, 41, 50, 69, 86, 91 }, "3-8", new Calculable[][] {
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
			new Talent("Lame Fatale", new int[] { 46, 50, 54, 72, 86, 91 }, "3-9", new Calculable[][] {
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
			new Talent("Attaque fouettée", new int[] { 46, 50, 54, 72, 86, 91 }, "3-10", new Calculable[][] {
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
			new Talent("Fuite Explosive Magique", new int[] { 46, 50, 54, 72, 86, 91 }, "2-9", new Calculable[][] {
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
			new Talent("Expert en Lames Jumelles", new int[] { 66, 80, 91 }, "2-13", new Calculable[][] {
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
			new Talent("Combat Physique", new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
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
			new Talent("Sublimation du Corps", new int[] { 66, 80, 91 }, "0-18", new Calculable[][] {
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
			new Talent("Protection de l'Ombre", new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
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
			new Talent("Maître Assassin", new int[] { 70, 83, 93 }, "2-23", new Calculable[][] {
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
			new Talent("Esquive Fatale", new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
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
			new Talent("Avancée Furtive", new int[] { 73, 87, 97 }, "1-22", new Calculable[][] {
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
			new Talent("Loi du Talion", new int[] { 73, 87, 97 }, "0-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
			}),
			new Talent("Enchaînement Brutal", new int[] { 73, 87, 97 }, "1-14", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new StaticEffect(TypeStaticEffect.x2STD, 9),
				},
			}),
			new Talent("Raid du K.O.", new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
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
			new Talent("Machine à Tuer", new int[] { 77, 90, 100 }, "2-12", new Calculable[][] {
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
			new Talent("Sublimation de l'Ombre", new int[] { 77, 90, 100 }, "2-16", new Calculable[][] {
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
			new Talent("Spécialité Maillet", new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
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
			new Talent("Spécialité Défense Magique", new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 20),
				},
			}),
			new Talent("Spécialité Bâton", new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
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
			new Talent("Vie Tenace", new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
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
			new Talent("Énergie Abondante", new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
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
			new Talent("Guide Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
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
			new Talent("Spécialité Bouclier", new int[] { 31, 41, 50, 69, 86, 91 }, "1-6", new Calculable[][] {
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
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "4-7", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "4-8", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "4-9", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "4-10", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "4-11", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "4-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "0-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "1-22", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "1-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "0-17", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "2-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "4-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "0-19", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "1-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
		};
	}
	
	static Talent[] getClass5() {
		return new Talent[] {
			new Talent("Spécialité Maillet", new int[] { 6, 14, 31, 61, 86, 91 }, "0-2", new Calculable[][] {
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
			new Talent("Spécialité Défense Magique", new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 20),
				},
			}),
			new Talent("Spécialité Bâton", new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
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
			new Talent("Vie Tenace", new int[] { 16, 28, 46, 66, 86, 91 }, "0-3", new Calculable[][] {
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
			new Talent("Énergie Abondante", new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
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
			new Talent("Guide Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
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
			new Talent("Guerrier de la Jungle", new int[] { 31, 41, 50, 69, 86, 91 }, "5-6", new Calculable[][] {
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
			new Talent("Charlatan de la Nature", new int[] { 31, 41, 50, 69, 86, 91 }, "5-7", new Calculable[][] {
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
			new Talent("Défense au Bâton", new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 8, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 12, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 20, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 22, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 24, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent("Aigle Majestueux d'Élite", new int[] { 46, 50, 54, 72, 86, 91 }, "5-9", new Calculable[][] {
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
			new Talent("Loup Spectral d'Élite", new int[] { 46, 50, 54, 72, 86, 91 }, "5-10", new Calculable[][] {
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
			new Talent("Singe Géant d'Élite", new int[] { 46, 50, 54, 72, 86, 91 }, "5-11", new Calculable[][] {
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
			new Talent("Expert en Bâton", new int[] { 66, 80, 91 }, "4-12", new Calculable[][] {
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
			new Talent("Précision d'Attaque", new int[] { 66, 80, 91 }, "1-13", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 18),
					new StaticEffect(TypeStaticEffect.x2Skill, 10),
				},
			}),
			new Talent("Âme du Combattant", new int[] { 66, 80, 91 }, "2-23", new Calculable[][] {
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
			new Talent("Esprit Protecteur", new int[] { 70, 83, 93 }, "0-13", new Calculable[][] {
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
			new Talent("Attaque Totale", new int[] { 70, 83, 93 }, "1-18", new Calculable[][] {
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
			new Talent("Position de Défense", new int[] { 70, 83, 93 }, "3-17", new Calculable[][] {
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
			new Talent("Sagesse de la Tempête", new int[] { 73, 87, 97 }, "1-23", new Calculable[][] {
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
			new Talent("Appel du Combattant", new int[] { 73, 87, 97 }, "3-21", new Calculable[][] {
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
			new Talent("Feinte Critique", new int[] { 73, 87, 97 }, "1-12", new Calculable[][] {
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
			new Talent("Aigle Enragé", new int[] { 77, 90, 100 }, "5-21", new Calculable[][] {
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
			new Talent("Loup Sanguinaire", new int[] { 77, 90, 100 }, "5-22", new Calculable[][] {
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
			new Talent("Singe Féroce", new int[] { 77, 90, 100 }, "0-17", new Calculable[][] {
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
			new Talent("Explosion Magique Enchaînée", new int[] { 6, 14, 31, 61, 86, 91 }, "6-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new StaticEffect(TypeStaticEffect.x2Skill, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new StaticEffect(TypeStaticEffect.x2Skill, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new StaticEffect(TypeStaticEffect.x2Skill, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new StaticEffect(TypeStaticEffect.x2Skill, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new StaticEffect(TypeStaticEffect.x2Skill, 21),
				},
			}),
			new Talent("Spécialité Défense Magique", new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 20),
				},
			}),
			new Talent("Spécialité Bâton", new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
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
			new Talent("Énergie Abondante", new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
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
			new Talent("Spécialité Attaque Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "6-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 21),
				},
			}),
			new Talent("Guide Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
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
			new Talent("Défense au Bâton", new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 8, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 2),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 12, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 18, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 20, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 22, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 24, false, WeaponType.BATON),
					new Effect(TypeEffect.ESQ, false, 12),
				},
			}),
			new Talent("Croissance Explosive Magique", new int[] { 31, 41, 50, 69, 86, 91 }, "6-7", new Calculable[][] {
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
			new Talent("Envoûtement Focalisé", new int[] { 31, 41, 50, 69, 86, 91 }, "6-8", new Calculable[][] {
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
			new Talent("Élément Flamme", new int[] { 46, 50, 54, 72, 86, 91 }, "6-9", new Calculable[][] {
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
			new Talent("Élément Éclair", new int[] { 46, 50, 54, 72, 86, 91 }, "6-10", new Calculable[][] {
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
			new Talent("Élément Glace", new int[] { 46, 50, 54, 72, 86, 91 }, "6-11", new Calculable[][] {
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
			new Talent("Physique d'Acier", new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
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
			new Talent("Magie Sans Pitié", new int[] { 66, 80, 91 }, "1-20", new Calculable[][] {
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
			new Talent("Charge Magique Violente", new int[] { 66, 80, 91 }, "1-17", new Calculable[][] {
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
			new Talent("Sagesse Occulte", new int[] { 70, 83, 93 }, "1-19", new Calculable[][] {
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
			new Talent("Calcul Magique", new int[] { 70, 83, 93 }, "3-21", new Calculable[][] {
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
			new Talent("Vigueur Retrouvée", new int[] { 70, 83, 93 }, "0-18", new Calculable[][] {
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
			new Talent("Couverture Magistrale", new int[] { 73, 87, 97 }, "0-21", new Calculable[][] {
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
			new Talent("Surplus d'Énergie", new int[] { 73, 87, 97 }, "0-17", new Calculable[][] {
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
			new Talent("Don de la Nature", new int[] { 73, 87, 97 }, "6-20", new Calculable[][] {
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
			new Talent("Puissance en Crise", new int[] { 77, 90, 100 }, "5-21", new Calculable[][] {
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
			new Talent("Résistance d'Attaque", new int[] { 77, 90, 100 }, "0-13", new Calculable[][] {
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
			new Talent("Incantation Appliquée", new int[] { 77, 90, 100 }, "6-23", new Calculable[][] {
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
			new Talent("Explosion Magique Enchaînée", new int[] { 6, 14, 31, 61, 86, 91 }, "6-0", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new StaticEffect(TypeStaticEffect.x2Skill, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new StaticEffect(TypeStaticEffect.x2Skill, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new StaticEffect(TypeStaticEffect.x2Skill, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new StaticEffect(TypeStaticEffect.x2Skill, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new StaticEffect(TypeStaticEffect.x2Skill, 21),
				},
			}),
			new Talent("Spécialité Défense Magique", new int[] { 6, 14, 31, 61, 86, 91 }, "4-1", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducM, false, 20),
				},
			}),
			new Talent("Spécialité Bâton", new int[] { 6, 14, 31, 61, 86, 91 }, "4-2", new Calculable[][] {
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
			new Talent("Énergie Abondante", new int[] { 16, 28, 46, 66, 86, 91 }, "4-4", new Calculable[][] {
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
			new Talent("Spécialité Attaque Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "6-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 21),
				},
			}),
			new Talent("Guide Magique", new int[] { 16, 28, 46, 66, 86, 91 }, "4-5", new Calculable[][] {
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
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "5-8", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "6-8", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 31, 41, 50, 69, 86, 91 }, "7-8", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "7-9", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "7-10", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "7-11", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "2-19", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "4-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "0-13", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "1-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "0-19", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "2-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "1-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "6-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "1-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "0-21", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "1-17", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "3-21", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
		};
	}
	
	static Talent[] getClass8() {
		return new Talent[] {
			new Talent("Ultra rapide", new int[] { 6, 14, 31, 61, 86, 91 }, "8-0", new Calculable[][] {
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
			new Talent("Instrument de Précision", new int[] { 6, 14, 31, 61, 86, 91 }, "8-1", new Calculable[][] {
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
			new Talent("Appareil d'Amélioration", new int[] { 6, 14, 31, 61, 86, 91 }, "8-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
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
			}),
			new Talent("Spécialiste du Canon lourd", new int[] { 16, 28, 46, 66, 86, 91 }, "8-3", new Calculable[][] {
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
			new Talent("Spécialiste des Machines Légères", new int[] { 16, 28, 46, 66, 86, 91 }, "8-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 4),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 6),
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 8),
					new Effect(TypeEffect.VitAtk, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 10),
					new Effect(TypeEffect.VitAtk, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 12),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 14),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
			}),
			new Talent("Spécialiste des Machines Lourdes", new int[] { 16, 28, 46, 66, 86, 91 }, "8-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 9),
					new Effect(TypeEffect.DCCP, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 11),
					new Effect(TypeEffect.DCCP, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 13),
					new Effect(TypeEffect.DCCP, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
			}),
			new Talent("Amplification Deux Armes", new int[] { 31, 41, 50, 69, 86, 91 }, "8-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 10),
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 13),
					new Effect(TypeEffect.TCCP, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 16),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 19),
					new Effect(TypeEffect.TCCP, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 22),
					new Effect(TypeEffect.TCCP, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 25),
					new Effect(TypeEffect.TCCP, false, 8),
				},
			}),
			new Talent("Amplification Armure", new int[] { 31, 41, 50, 69, 86, 91 }, "8-7", new Calculable[][] {
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
			new Talent("Amplification Psionique", new int[] { 31, 41, 50, 69, 86, 91 }, "8-8", new Calculable[][] {
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
			new Talent("Amélioration Perforation", new int[] { 46, 50, 54, 72, 86, 91 }, "8-9", new Calculable[][] {
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
			new Talent("Amélioration Robotique", new int[] { 46, 50, 54, 72, 86, 91 }, "8-10", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 10),
					new Effect(TypeEffect.ReducP, false, 6),
					new Effect(TypeEffect.ReducM, false, 6),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Effect(TypeEffect.ReducP, false, 9),
					new Effect(TypeEffect.ReducM, false, 9),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 30),
					new Effect(TypeEffect.ReducP, false, 12),
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.ReducP, false, 15),
					new Effect(TypeEffect.ReducM, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 50),
					new Effect(TypeEffect.ReducP, false, 18),
					new Effect(TypeEffect.ReducM, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 60),
					new Effect(TypeEffect.ReducP, false, 20),
					new Effect(TypeEffect.ReducM, false, 20),
				},
			}),
			new Talent("Amélioration Amortissement", new int[] { 46, 50, 54, 72, 86, 91 }, "8-11", new Calculable[][] {
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
			new Talent("Interférence de Précision", new int[] { 66, 80, 91 }, "8-12", new Calculable[][] {
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
			new Talent("Interférence de Défense", new int[] { 66, 80, 91 }, "8-13", new Calculable[][] {
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
			new Talent("Interférence de Fission", new int[] { 66, 80, 91 }, "8-14", new Calculable[][] {
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
			new Talent("Pénétration Critique", new int[] { 70, 83, 93 }, "8-15", new Calculable[][] {
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
			new Talent("Défense Critique", new int[] { 70, 83, 93 }, "8-16", new Calculable[][] {
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
			new Talent("Régénération Critique", new int[] { 70, 83, 93 }, "8-17", new Calculable[][] {
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
			new Talent("Modification du Démon", new int[] { 73, 87, 97 }, "8-18", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
					new StaticEffect(TypeStaticEffect.x2Skill, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 17),
					new StaticEffect(TypeStaticEffect.x2Skill, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x2Skill, 15),
				},
			}),
			new Talent("Modification Robotique", new int[] { 73, 87, 97 }, "8-19", new Calculable[][] {
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
			new Talent("Modification Armure", new int[] { 73, 87, 97 }, "8-20", new Calculable[][] {
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
			new Talent("Fureur Infinie", new int[] { 77, 90, 100 }, "8-21", new Calculable[][] {
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
			new Talent("Régénération Infinie", new int[] { 77, 90, 100 }, "8-22", new Calculable[][] {
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
			new Talent("Lacérations Infinies", new int[] { 77, 90, 100 }, "8-23", new Calculable[][] {
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
			new Talent("Ultra rapide", new int[] { 6, 14, 31, 61, 86, 91 }, "8-0", new Calculable[][] {
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
			new Talent("Instrument de Précision", new int[] { 6, 14, 31, 61, 86, 91 }, "8-1", new Calculable[][] {
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
			new Talent("Appareil d'Amélioration", new int[] { 6, 14, 31, 61, 86, 91 }, "8-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
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
			}),
			new Talent("Spécialiste du Canon lourd", new int[] { 16, 28, 46, 66, 86, 91 }, "8-3", new Calculable[][] {
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
			new Talent("Spécialiste des Machines Légères", new int[] { 16, 28, 46, 66, 86, 91 }, "8-4", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 4),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 6),
					new Effect(TypeEffect.VitAtk, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 8),
					new Effect(TypeEffect.VitAtk, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 10),
					new Effect(TypeEffect.VitAtk, false, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 12),
					new Effect(TypeEffect.VitAtk, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca, false, 14),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
			}),
			new Talent("Spécialiste des Machines Lourdes", new int[] { 16, 28, 46, 66, 86, 91 }, "8-5", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 9),
					new Effect(TypeEffect.DCCP, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 11),
					new Effect(TypeEffect.DCCP, false, 24),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 13),
					new Effect(TypeEffect.DCCP, false, 27),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegStdMeca2M, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
			}),
			new Talent("Explosion Améliorée", new int[] { 31, 41, 50, 69, 86, 91 }, "9-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 60),
				},
			}),
			new Talent("Chargement Rapide", new int[] { 31, 41, 50, 69, 86, 91 }, "9-7", new Calculable[][] {
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
			new Talent("Amplification Élémentaire", new int[] { 31, 41, 50, 69, 86, 91 }, "9-8", new Calculable[][] {
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
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "9-9", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "9-10", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 46, 50, 54, 72, 86, 91 }, "9-11", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "9-12", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "9-13", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 66, 80, 91 }, "9-14", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "9-15", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "9-16", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 70, 83, 93 }, "9-17", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "9-18", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "9-19", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 73, 87, 97 }, "9-20", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "9-21", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "9-22", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
			new Talent("", new int[] { 77, 90, 100 }, "9-23", new Calculable[][] {
				new Calculable[] {
				},
				new Calculable[] {
				},
				new Calculable[] {
				},
			}),
		};
	}
	
	static Talent[] getClass10() {
		return new Talent[] {
			new Talent("Spécialité Lame", new int[] { 6, 14, 31, 61, 86, 91 }, "10-0", new Calculable[][] {
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
			new Talent("Spécialité Bâton-clé", new int[] { 6, 14, 31, 61, 86, 91 }, "10-1", new Calculable[][] {
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
			new Talent("Cristal Mortel", new int[] { 6, 14, 31, 61, 86, 91 }, "10-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.4, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.6, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.8, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent("Combustion de Cristal", new int[] { 16, 28, 46, 66, 86, 91 }, "10-3", new Calculable[][] {
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
			new Talent("Royaume du Chaos", new int[] { 16, 28, 46, 66, 86, 91 }, "10-4", new Calculable[][] {
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
			new Talent("Marche du Néant", new int[] { 16, 28, 46, 66, 86, 91 }, "10-5", new Calculable[][] {
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
			new Talent("Combo Magique", new int[] { 31, 41, 50, 69, 86, 91 }, "11-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 8),
					new StaticEffect(TypeStaticEffect.x2STD, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
					new StaticEffect(TypeStaticEffect.x2STD, 13),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 12),
					new StaticEffect(TypeStaticEffect.x2STD, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 14),
					new StaticEffect(TypeStaticEffect.x2STD, 19),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 16),
					new StaticEffect(TypeStaticEffect.x2STD, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 18),
					new StaticEffect(TypeStaticEffect.x2STD, 25),
				},
			}),
			new Talent("Lame Démoniaque", new int[] { 31, 41, 50, 69, 86, 91 }, "10-7", new Calculable[][] {
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
			new Talent("Amplification Cristalline", new int[] { 31, 41, 50, 69, 86, 91 }, "10-8", new Calculable[][] {
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
			new Talent("Pénétration Spatiale", new int[] { 46, 50, 54, 72, 86, 91 }, "10-9", new Calculable[][] {
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
			new Talent("Gardien du Royaume", new int[] { 46, 50, 54, 72, 86, 91 }, "10-10", new Calculable[][] {
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
			new Talent("Force du Royaume du Vide", new int[] { 46, 50, 54, 72, 86, 91 }, "10-11", new Calculable[][] {
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
			new Talent("Lame Magique Sans Pitié", new int[] { 66, 80, 91 }, "10-12", new Calculable[][] {
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
			new Talent("Corps Démoniaque", new int[] { 66, 80, 91 }, "10-13", new Calculable[][] {
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
			new Talent("Sceau de Cristal", new int[] { 66, 80, 91 }, "10-14", new Calculable[][] {
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
			new Talent("Guerre Véritable", new int[] { 70, 83, 93 }, "10-15", new Calculable[][] {
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.DegM, false, 5),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.DegM, false, 7),
					}),
				},
				new Calculable[] {
					new Proc(100, Activation.CritMag, 8, new Calculable[] {
						new Effect(TypeEffect.DegM, false, 10),
					}),
				},
			}),
			new Talent("Gardien Briseur de Sort", new int[] { 70, 83, 93 }, "10-16", new Calculable[][] {
				new Calculable[] {
					new Proc(5, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducM, false, 100),
					}),
				},
				new Calculable[] {
					new Proc(7, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducM, false, 100),
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducM, false, 100),
					}),
				},
			}),
			new Talent("Charge du Cristal de Sang", new int[] { 70, 83, 93 }, "10-17", new Calculable[][] {
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
			new Talent("L'Ambition du Voyageur", new int[] { 73, 87, 97 }, "10-18", new Calculable[][] {
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
			new Talent("Réflexion magique", new int[] { 73, 87, 97 }, "10-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
			}),
			new Talent("Chaîne de Sang", new int[] { 73, 87, 97 }, "10-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 17),
					new StaticEffect(TypeStaticEffect.x3STD, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x3STD, 10),
				},
			}),
			new Talent("Déclencher l'Impact", new int[] { 77, 90, 100 }, "10-21", new Calculable[][] {
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
			new Talent("Vide Infini", new int[] { 77, 90, 100 }, "10-22", new Calculable[][] {
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
			new Talent("Frappe de Bouclier", new int[] { 77, 90, 100 }, "10-23", new Calculable[][] {
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
			new Talent("Spécialité Lame", new int[] { 6, 14, 31, 61, 86, 91 }, "10-0", new Calculable[][] {
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
			new Talent("Spécialité Bâton-clé", new int[] { 6, 14, 31, 61, 86, 91 }, "10-1", new Calculable[][] {
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
			new Talent("Cristal Mortel", new int[] { 6, 14, 31, 61, 86, 91 }, "10-2", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 1),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.2, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.4, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 4),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.6, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1.8, TypeRegen.REGENERATION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 6),
					new Proc(0, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION),
					}),
				},
			}),
			new Talent("Combustion de Cristal", new int[] { 16, 28, 46, 66, 86, 91 }, "10-3", new Calculable[][] {
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
			new Talent("Royaume du Chaos", new int[] { 16, 28, 46, 66, 86, 91 }, "10-4", new Calculable[][] {
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
			new Talent("Marche du Néant", new int[] { 16, 28, 46, 66, 86, 91 }, "10-5", new Calculable[][] {
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
			new Talent("Perfusion du Bâton-clé", new int[] { 31, 41, 50, 69, 86, 91 }, "11-6", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 5),
					new StaticEffect(TypeStaticEffect.x2STD, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 7),
					new StaticEffect(TypeStaticEffect.x2STD, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 9),
					new StaticEffect(TypeStaticEffect.x2STD, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 11),
					new StaticEffect(TypeStaticEffect.x2STD, 16),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 13),
					new StaticEffect(TypeStaticEffect.x2STD, 18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 15),
					new StaticEffect(TypeStaticEffect.x2STD, 20),
				},
			}),
			new Talent("Gardien de Cristal", new int[] { 31, 41, 50, 69, 86, 91 }, "11-7", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 14),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 23),
				},
			}),
			new Talent("Concentration d'Incantation", new int[] { 31, 41, 50, 69, 86, 91 }, "11-8", new Calculable[][] {
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
			new Talent("Combustion du Cristal", new int[] { 46, 50, 54, 72, 86, 91 }, "11-9", new Calculable[][] {
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
			new Talent("Royaume de Chronos", new int[] { 46, 50, 54, 72, 86, 91 }, "11-10", new Calculable[][] {
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
			new Talent("Force de la Maîtrise du Temps", new int[] { 46, 50, 54, 72, 86, 91 }, "11-11", new Calculable[][] {
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
			new Talent("Assaut de la Clé Magique", new int[] { 66, 80, 91 }, "11-12", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 5),
					new Effect(TypeEffect.DCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 10),
					new Effect(TypeEffect.DCCM, false, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM, false, 15),
					new Effect(TypeEffect.DCCM, false, 15),
				},
			}),
			new Talent("Spectre de l'Ombre", new int[] { 66, 80, 91 }, "11-13", new Calculable[][] {
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
			new Talent("Cristal Tremblant", new int[] { 66, 80, 91 }, "11-14", new Calculable[][] {
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
			new Talent("Pénétration de Mana", new int[] { 70, 83, 93 }, "11-15", new Calculable[][] {
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
			new Talent("Protection de Chronos", new int[] { 70, 83, 93 }, "11-16", new Calculable[][] {
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
			new Talent("Charge du Cristal", new int[] { 70, 83, 93 }, "11-17", new Calculable[][] {
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
			new Talent("L'Esprit du Voyageur", new int[] { 73, 87, 97 }, "11-18", new Calculable[][] {
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
			new Talent("Réflexion de la Frappe Royale", new int[] { 73, 87, 97 }, "11-19", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25),
					new Proc(50, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				},
			}),
			new Talent("Frappe de l'Ombre", new int[] { 73, 87, 97 }, "11-20", new Calculable[][] {
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new StaticEffect(TypeStaticEffect.x3STD, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -15),
					new StaticEffect(TypeStaticEffect.x3STD, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
					new StaticEffect(TypeStaticEffect.x3STD, 10),
				},
			}),
			new Talent("Déclencher l'Explosion", new int[] { 77, 90, 100 }, "11-21", new Calculable[][] {
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
			new Talent("Mort Éternelle", new int[] { 77, 90, 100 }, "11-22", new Calculable[][] {
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
			new Talent("Bouclier de Lumière", new int[] { 77, 90, 100 }, "11-23", new Calculable[][] {
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
