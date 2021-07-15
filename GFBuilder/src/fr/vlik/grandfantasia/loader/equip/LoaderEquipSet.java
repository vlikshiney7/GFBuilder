package fr.vlik.grandfantasia.loader.equip;

import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
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

public class LoaderEquipSet {
	
	static EquipSet[] getArmor() {
		EquipSet[] class1 = getGuerrier();
		EquipSet[] class2 = getArcher();
		EquipSet[] class3 = getPretre();
		EquipSet[] class4 = getMage();
		EquipSet[] class5 = getMeca();
		EquipSet[] class6 = getVoyageur();
		EquipSet[] classAll = getAll();
		
		EquipSet[] result = new EquipSet[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length + classAll.length];
		
		int i = 0;
		for(; i < class1.length; i++) {
			result[i] = class1[i];
		}
		
		for(int j = 0; j < class2.length; i++, j++) {
			result[i] = class2[j];
		}
		
		for(int j = 0; j < class3.length; i++, j++) {
			result[i] = class3[j];
		}
		
		for(int j = 0; j < class4.length; i++, j++) {
			result[i] = class4[j];
		}

		for(int j = 0; j < class5.length; i++, j++) {
			result[i] = class5[j];
		}
		
		for(int j = 0; j < class6.length; i++, j++) {
			result[i] = class6[j];
		}
		
		for(int j = 0; j < classAll.length; i++, j++) {
			result[i] = classAll[j];
		}
		
		return result;
	}

	private static EquipSet[] getGuerrier() {
		return new EquipSet[] {
			new EquipSet("Tremblement de terre du roi de la bataille", "90red0", null, null, null),
			new EquipSet("Trembleur de terre", "10ans90red0", null, null, null),
			new EquipSet("Fierté pétrifiante", "100vio0", null, null, null),
			new EquipSet("Seigneur Arlong", "90vio0", null, null, null),
			new EquipSet("Belliqueux d'Aiolia", "80vio0", null, null, null),
			new EquipSet("Puissante de Khal Drogo", "100gold0",
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
			new EquipSet("Sanguinaire Kenpachi", "90gold0",
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
					}),
				}),
			new EquipSet("Set stellaire de Trembleur de terre", "10ans90gold0",
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
					}),
				}),
			new EquipSet("Vengeance de Mordred", "80gold0",
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
			new EquipSet("Héros Bestial", "100pve0",
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
					}),
				}),
			new EquipSet("Explorateur Fondue", "95pve0",
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
					}),
				}),
			new EquipSet("Feu Fanatique", "90pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
					new Effect(TypeEffect.DCCP, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Effect(TypeEffect.TCCP, false, 25),
				}),
			new EquipSet("Âme de l'Ours Terrifiant", "85pve0",
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -10),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
					new Effect(TypeEffect.VIT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
				}),
			new EquipSet("Furie du Maître", "80pve0",
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
			new EquipSet("Fureur du Berserker", "75pve0",
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
			new EquipSet("Guerrier Suprême", "70pve0",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.DefP, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 8),
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
				}),
			new EquipSet("Boucher de Saphaël", "65pve0",
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
			new EquipSet("Marquis de l'ombre", "60pve0",
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
			new EquipSet("Destructrice à Lame d'Acier", "50pve0",
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
			new EquipSet("Guerrier robuste", "40pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
				},
				new Calculable[] {
					new Proc(50, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 100),
					}),
				}),
			new EquipSet("Officier tactique", "30pve0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				}),
			new EquipSet("Garde d'Elite", "20pve0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S4, 50, TypeValue.DAMAGE),
				}),
			new EquipSet("(Reforgé) Apostat", "100pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Effect(TypeEffect.FCE, false, 66),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 94),
					new Effect(TypeEffect.ReducP_old, false, 33),
					new SkillEffect(TypeSkillEffect.Class0S5, 83, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 39),
					new Effect(TypeEffect.PeneP, false, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet("Apostat", "100pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.FCE, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 85),
					new Effect(TypeEffect.ReducP_old, false, 30),
					new SkillEffect(TypeSkillEffect.Class0S5, 75, TypeValue.DAMAGE),
					new Proc(35, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 35),
					new Effect(TypeEffect.PeneP, false, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -200, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Courroux Sanguinaire", "95pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.FCE, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 88),
					new Effect(TypeEffect.ReducP_old, false, 28),
					new SkillEffect(TypeSkillEffect.Class0S5, 55, TypeValue.DAMAGE),
					new Proc(30, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 33),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -193, Target.OPPONENT),
					}),
				}),
			new EquipSet("Courroux Sanguinaire", "95pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.FCE, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 80),
					new Effect(TypeEffect.ReducP_old, false, 25),
					new SkillEffect(TypeSkillEffect.Class0S5, 50, TypeValue.DAMAGE),
					new Proc(30, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Gladiateur du Hokuto", "85pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.FCE, false, 42),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 88),
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Effect(TypeEffect.CostComp, false, -88),
					new Proc(25, Activation.Attacked, 13, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -165, Target.OPPONENT),
					}),
				}),
			new EquipSet("Gladiateur du Hokuto", "85pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 32),
					new Effect(TypeEffect.RTCCM, false, 32),
					new Effect(TypeEffect.FCE, false, 38),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 80),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.CostComp, false, -80),
					new Proc(25, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 27),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet("Empereur de la destruction (Reforgé)", "75pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 83),
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Effect(TypeEffect.CostComp, false, -77),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 28),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -165, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -165, Target.OPPONENT),
					}),
				}),
			new EquipSet("Puissance d'Héraclès", "75pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 36),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 75),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.CostComp, false, -70),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 25),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -150, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -150, Target.OPPONENT),
					}),
				}),
			new EquipSet("Stratégie de Sun Tzu (Reforgée)", "65pvp0R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 28),
					new Effect(TypeEffect.RTCCM, false, 28),
					new Effect(TypeEffect.FCE, false, 31),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 66),
					new Effect(TypeEffect.ReducP_old, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -110, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -110, Target.OPPONENT),
					}),
				}),
			new EquipSet("Stratégie de Sun Tzu", "65pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.FCE, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 60),
					new Effect(TypeEffect.ReducP_old, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet("Roi Diabolique (Reforgée)", "55pvp0R",
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
			new EquipSet("Roi du mal", "55pvp0",
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
			new EquipSet("Général Diabolique (Reforgé)", "45pvp0R",
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
					}),
				}),
			new EquipSet("Général Diabolique", "45pvp0",
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
			new EquipSet("Hurlement de Conan (Reforgé)", "25pvp0R",
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
					}),
				}),
			new EquipSet("Hurlement de Conan", "25pvp0",
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
					}),
				}),
			new EquipSet("Dieu de la Guerre", "80nucleus0",
				new Calculable[] {
					new Effect(TypeEffect.RDegAtkD, false, 25),
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
			new EquipSet("Armée Sanguinaire", "70nucleus0",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18),
					new SkillEffect(TypeSkillEffect.Class0S8, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(45, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.DefP, true, 15),
				}),
			new EquipSet("Marquis du Chaos", "60nucleus0",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S9, 30, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Proc(20, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 35),
					}),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -75, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -75, Target.OPPONENT),
					}),
				}),
			new EquipSet("Hurlement Divin", "80lingot0",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.DegGlace, false, 1100),
					}),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S8, 30, TypeValue.DAMAGE),
					new Proc(20, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Proc(25, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 70),
					}),
				}),
			new EquipSet("Soif de Mort", "70lingot0",
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
						new Effect(TypeEffect.ReflectP, false, 35),
					}),
				}),
			new EquipSet("Marquis de Destruction", "60lingot0",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class0S2, 25, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class0S1, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Proc(50, Activation.Phys, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 800),
					}),
				}),
			new EquipSet("Féroce Tigre de Combat", "90gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 70),
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -120, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -120, Target.OPPONENT),
					}),
				}),
			new EquipSet("Rage du Minotaure", "80gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 65),
					new Effect(TypeEffect.ReducP_old, false, 12),
					new Effect(TypeEffect.ReducM_old, false, 12),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.AGI, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet("Conquête d'Attila", "70gvg0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 25),
					new Effect(TypeEffect.RTCCM, false, 25),
					new Effect(TypeEffect.FCE, false, 20),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 60),
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.INT, false, -100, Target.OPPONENT),
					}),
				}),
			new EquipSet("Évolution du Destructeur (Réincarné)", "100evo0R",
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
			new EquipSet("Évolution du Destructeur", "100evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Ravageur (Réincarné)", "90evo0R",
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
			new EquipSet("Évolution du Ravageur", "90evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Gladiateur (Réincarné)", "75evo0R",
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
			new EquipSet("Évolution du Gladiateur", "75evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Berserker (Réincarné)", "60evo0R",
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
			new EquipSet("Évolution du Berserker", "60evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Guerrier (Réincarné)", "30evo0R",
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
			new EquipSet("Évolution du Guerrier", "30evo0",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet("Hymne de l'Honneur et du Triomphe", "90red1", null, null, null),
			new EquipSet("Véritable Triomphe", "10ans90red1", null, null, null),
			new EquipSet("Immortalité du damné", "100vio1", null, null, null),
			new EquipSet("Templier Résolu", "90vio1", null, null, null),
			new EquipSet("Défenseur Voldo", "80vio1", null, null, null),
			new EquipSet("Épique de Brienne", "100gold1",
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
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.ReflectM, false, 50),
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
			new EquipSet("Vertueux Parsifal", "90gold1",
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
			new EquipSet("Set stellaire de Triomphe", "10ans90gold1",
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
			new EquipSet("Châtiment de Baldur", "80gold1",
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
			new EquipSet("Plume Verte", "100pve1",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Effect(TypeEffect.DefP, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20),
					new Effect(TypeEffect.Ombre, false, 20),
					new Proc(15, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.DegP_old, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Proc(10, Activation.Attacked, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION, 1),
					}),
				}),
			new EquipSet("Chevalier Béni", "95pve1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Effect(TypeEffect.DegP_old, false, 20),
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
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.ReflectM, false, 50),
					}),
				}),
			new EquipSet("Ailes Divines", "90pve1",
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
			new EquipSet("Âme du Lion Glorieux", "85pve1",
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
			new EquipSet("Colère Divine", "80pve1",
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
			new EquipSet("Guerrier Céleste", "75pve1",
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
			new EquipSet("Pureté du Paladin", "70pve1",
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
			new EquipSet("Chevalier de l'Eclipse Blanche", "65pve1",
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
			new EquipSet("Duc Impérial", "60pve1",
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
			new EquipSet("Destructeur", "50pve1",
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
			new EquipSet("Chevalier du Fort", "40pve1",
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
			new EquipSet("(Reforgé) Gardien éclairé", "100pvp1R",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.Parade, false, 33),
					new Effect(TypeEffect.PeneP, false, 17),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(35, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet("Gardien éclairé", "100pvp1",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
					new Effect(TypeEffect.Parade, false, 30),
					new Effect(TypeEffect.PeneP, false, 15),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(35, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Bouclier du Monde Encyclique", "95pvp1R",
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
			new EquipSet("Bouclier du Monde Encyclique", "95pvp1",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 12),
					new Effect(TypeEffect.Parade, false, 25),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Vindicateur Shichibukai", "85pvp1R",
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
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(32, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55, Target.OPPONENT),
					}),
				}),
			new EquipSet("Vindicateur Shichibukai", "85pvp1",
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
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(32, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
				}),
			new EquipSet("Défense infinie (Reforgé)", "75pvp1R",
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
			new EquipSet("Ardeur de Zatoichi", "75pvp1",
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
					}),
				}),
			new EquipSet("Vertu de Galahad (Reforgé)", "65pvp1R",
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
			new EquipSet("Vertu de Galahad", "65pvp1",
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
					}),
				}),
			new EquipSet("Défense absolue (Reforgée)", "55pvp1R",
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
			new EquipSet("Défense absolue", "55pvp1",
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
					}),
				}),
			new EquipSet("Défense Parfaite (Reforgé)", "45pvp1R",
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
					}),
				}),
			new EquipSet("Défense parfaite", "45pvp1",
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
			new EquipSet("Défense de Lancelot (Reforgé)", "25pvp1R",
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
					}),
				}),
			new EquipSet("Défense de Lancelot", "25pvp1",
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
					}),
				}),
			new EquipSet("Thaumaturge Exalté", "80nucleus1",
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
			new EquipSet("Licorne Céleste", "70nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 60),
					new Effect(TypeEffect.FCE, false, 21),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducAtkD, false, 70),
					new SkillEffect(TypeSkillEffect.Class1S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD_old, 30),
				}),
			new EquipSet("Juge Impérial", "60nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Proc(45, Activation.Attack, 10, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoItem, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new SkillEffect(TypeSkillEffect.Class1S11, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 22),
					new Effect(TypeEffect.AGI, false, 22),
				}),
			new EquipSet("Voix de la Création", "80lingot1",
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
					}),
				}),
			new EquipSet("Chevalier des Saints", "70lingot1",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 22),
					new Proc(32, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.ReducComp, false, 75),
					}),
				}),
			new EquipSet("Gardien Impérial", "60lingot1",
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
			new EquipSet("Rhino des Cieux Sacrés", "90gvg1",
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
			new EquipSet("Force des Titans", "80gvg1",
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
					}),
				}),
			new EquipSet("Noblesse de Siegfried", "70gvg1",
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
			new EquipSet("Évolution du Croisé (Réincarné)", "100evo1R",
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
			new EquipSet("Évolution du Croisé", "100evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Templier (Réincarné)", "90evo1R",
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
			new EquipSet("Évolution du Templier", "90evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Vindicateur (Réincarné)", "75evo1R",
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
			new EquipSet("Évolution du Vindicateur", "75evo1",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Paladin (Réincarné)", "60evo1R",
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
			new EquipSet("Évolution du Paladin", "60evo1",
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
			new EquipSet("Percée de l'Assassin Ninja", "90red3", null, null, null),
			new EquipSet("Véritable Ninja assassin", "10ans90red3", null, null, null),
			new EquipSet("Orage de l'ombre", "100vio3", null, null, null),
			new EquipSet("Assaut des Kage", "90vio3", null, null, null),
			new EquipSet("Chasseur des Ombres", "80vio3", null, null, null),
			new EquipSet("Furtif de Kakashi", "100gold3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.AGI, false, 30),
					new Effect(TypeEffect.VitAtkDuo, false, 35),
				},
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S3, 80, TypeValue.DAMAGE),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegP_old, false, 20),
					new Effect(TypeEffect.MEN, false, -40),
					new SkillEffect(TypeSkillEffect.Class3S0, 50, TypeValue.DAMAGE),
					new StaticEffect(TypeStaticEffect.x3Skill_old),
				}),
			new EquipSet("Furtivité du CP9", "90gold3",
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
						new Effect(TypeEffect.ESQ, false, 100),
						new Effect(TypeEffect.Depla, false, 25),
					}),
				}),
			new EquipSet("Set stellaire du Ninja assassin", "10ans90gold3",
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
						new Effect(TypeEffect.ESQ, false, 100),
						new Effect(TypeEffect.Depla, false, 25),
					}),
				}),
			new EquipSet("Ombres de Loki", "80gold3",
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
					}),
				}),
			new EquipSet("Bourreau Fantôme", "100pve3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.ESQ, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 50),
					new Effect(TypeEffect.ReducM_old, false, 10),
					new Effect(TypeEffect.DegOmbre, false, 350),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
					new Proc(20, Activation.Attack, 3, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -30, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
					}),
				}),
			new EquipSet("Ninja Démoniaque", "95pve3",
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
					new Effect(TypeEffect.DegP_old, false, 10),
					new Proc(10, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.FCE, true, 50),
						new Effect(TypeEffect.TCCP, false, 20),
					}),
				}),
			new EquipSet("Ombres Éphémères", "90pve3",
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
			new EquipSet("Âme de la Panthère Ténébreuse", "85pve3",
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
			new EquipSet("6ème Sens Ninja", "80pve3",
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
			new EquipSet("Ombre Embrasée", "75pve3",
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
			new EquipSet("Rigueur d'al Sabah", "70pve3",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.FCE, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new EquipSet("Assassin à la Lame Cachée", "65pve3",
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
			new EquipSet("Protection du Samouraï Fantôme", "60pve3",
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
			new EquipSet("Royaume Ciselé", "50pve3",
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
			new EquipSet("Embuscade", "40pve3",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 15),
				}),
			new EquipSet("Chasseur de Vent", "30pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 45),
				}),
			new EquipSet("Chasseur de la Jungle", "20pve2",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class2S0, 35, TypeValue.DAMAGE),
				}),
			new EquipSet("(Reforgé) Assassin scarifié", "100pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39),
					new Effect(TypeEffect.AGI, false, 28),
					new Effect(TypeEffect.RTCCP, false, 42),
					new Effect(TypeEffect.RTCCM, false, 42),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 28),
						new Effect(TypeEffect.Depla, false, 28),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 94),
					new Effect(TypeEffect.Toucher, false, 28),
					new Effect(TypeEffect.ESQ, false, 28),
					new SkillEffect(TypeSkillEffect.Class3S3, 110, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 83),
					new Effect(TypeEffect.PV, true, 33),
					new Effect(TypeEffect.PeneP, false, 17),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 39),
					}),
				}),
			new EquipSet("Assassin scarifié", "100pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35),
					new Effect(TypeEffect.AGI, false, 25),
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 25),
						new Effect(TypeEffect.Depla, false, 25),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 85),
					new Effect(TypeEffect.Toucher, false, 25),
					new Effect(TypeEffect.ESQ, false, 25),
					new SkillEffect(TypeSkillEffect.Class3S3, 100, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Effect(TypeEffect.PV, true, 30),
					new Effect(TypeEffect.PeneP, false, 15),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 35),
					}),
				}),
			new EquipSet("(Reforgé) Samouraï Fantôme", "95pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33),
					new Effect(TypeEffect.AGI, false, 22),
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 22),
						new Effect(TypeEffect.Depla, false, 22),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 88),
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.ESQ, false, 22),
					new SkillEffect(TypeSkillEffect.Class3S3, 83, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 83),
					new Effect(TypeEffect.PV, true, 28),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}),
				}),
			new EquipSet("Samouraï Fantôme", "95pvp3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.AGI, false, 20),
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Proc(40, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 80),
					new Effect(TypeEffect.Toucher, false, 20),
					new Effect(TypeEffect.ESQ, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S3, 75, TypeValue.DAMAGE),
					new Proc(35, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 75),
					new Effect(TypeEffect.PV, true, 25),
					new Proc(45, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}),
				}),
			new EquipSet("(Reforgé) Ninja de Konoha", "85pvp3R",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 33),
					new Effect(TypeEffect.RTCCM, false, 33),
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.AGI, false, 14),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 22),
						new Effect(TypeEffect.Depla, false, 22),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 83),
					new Effect(TypeEffect.DegDuo, false, 24),
					new Effect(TypeEffect.Toucher, false, 19),
					new Proc(30, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 55),
					new Effect(TypeEffect.PV, true, 19),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 33),
					}),
				}),
			new EquipSet("Ninja de Konoha", "85pvp3",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 27),
					new Effect(TypeEffect.AGI, false, 13),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 20),
						new Effect(TypeEffect.Depla, false, 20),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 75),
					new Effect(TypeEffect.DegDuo, false, 22),
					new Effect(TypeEffect.Toucher, false, 17),
					new Proc(30, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 50),
					new Effect(TypeEffect.PV, true, 17),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 30),
					}),
				}),
			new EquipSet("Fourberie de Lucrezia (Reforgé)", "75pvp3R",
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
			new EquipSet("Fourberie de Lucrezia", "75pvp3",
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
					}),
				}),
			new EquipSet("Sabotage de Fawkes (Reforgée)", "65pvp3R",
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
			new EquipSet("Sabotage de Fawkes", "65pvp3",
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
					}),
				}),
			new EquipSet("Combattant de l'Enfer (Reforgé)", "55pvp3R",
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
			new EquipSet("Héros infernal", "55pvp3",
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
			new EquipSet("Combattant au Lion Bleu (Reforgé)", "45pvp3R",
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
					}),
				}),
			new EquipSet("Combattant du lion bleu", "45pvp3",
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
			new EquipSet("Précision de Sogeking (Reforgé)", "25pvp2R",
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
					}),
				}),
			new EquipSet("Précision de Sogeking", "25pvp2",
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
					}),
				}),
			new EquipSet("Ombre de Kakashi (Reforgé)", "25pvp3R",
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
					}),
				}),
			new EquipSet("Ombre de Kakashi", "25pvp3",
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
					}),
				}),
			new EquipSet("Vision Nocturne", "80nucleus3",
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
					}),
				}),
			new EquipSet("Crocs du Cobra", "70nucleus3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S6, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(25, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 700),
					}),
				},
				new Calculable[] {
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -25, Target.OPPONENT),
					}),
				}),
			new EquipSet("Samourai du Poison", "60nucleus3",
				new Calculable[] {
					new Proc(35, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new SkillEffect(TypeSkillEffect.Class3S7, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 40),
					new Proc(40, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 70),
					}),
				}),
			new EquipSet("Ombre de Terreur", "80lingot3",
				new Calculable[] {
					new Proc(18, Activation.Attacked, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 380, TypeRegen.REGENERATION, 2),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new SkillEffect(TypeSkillEffect.Class3S6, 35, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(33, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new EquipSet("Ombre Diabolique", "70lingot3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new SkillEffect(TypeSkillEffect.Class3S5, 20, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(33, Activation.Attacked, 0, new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 50),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 18),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 20),
					}),
				}),
			new EquipSet("Samourai du Tonnerre", "60lingot3",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class3S2, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 25),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 35),
					new Effect(TypeEffect.DegOmbre, false, 700),
				}),
			new EquipSet("Chien-Loup Zombie", "90gvg3",
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
			new EquipSet("Frénésie du Lycan", "80gvg3",
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
					}),
				}),
			new EquipSet("Dragon Sombre Atma", "70gvg3",
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
			new EquipSet("Évolution du Kage (Réincarné)", "100evo3R",
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
			new EquipSet("Évolution du Kage", "100evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Shinobi (Réincarné)", "90evo3R",
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
			new EquipSet("Évolution du Shinobi", "90evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Ninja (Réincarné)", "75evo3R",
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
			new EquipSet("Évolution du Ninja", "75evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de l'Assassin (Réincarné)", "60evo3R",
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
			new EquipSet("Évolution de l'Assassin", "60evo3",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de l'Archer (Réincarné)", "30evo2R",
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
			new EquipSet("Évolution de l'Archer", "30evo2",
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
			new EquipSet("Louanges de l'Esprit Sacré Gardien", "90red4", null, null, null),
			new EquipSet("Véritable Esprit Sacré", "10ans90red4", null, null, null),
			new EquipSet("Bénédiction", "100vio4", null, null, null),
			new EquipSet("Culte Solaire", "90vio4", null, null, null),
			new EquipSet("Sage illuminé", "80vio4", null, null, null),
			new EquipSet("Divine de l'ordre des Istaris", "100gold4",
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
			new EquipSet("Purification de Zehel", "90gold4",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.ESQ, false, 25),
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
					}),
				}),
			new EquipSet("Set stellaire de l'Esprit sacré", "10ans90gold4",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.ESQ, false, 25),
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
					}),
				}),
			new EquipSet("Ferveur de Freya", "80gold4",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 45),
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 45),
					new Effect(TypeEffect.PV, true, 10),
				}),
			new EquipSet("Gardien Miraculeux", "100pve4",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 10),
					new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -40),
					new Effect(TypeEffect.DegM_old, false, 20),
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
			new EquipSet("Ouragan Nordique", "95pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.CostComp, false, -50),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new Proc(10, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -50),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.ESQ, false, 30),
					new Proc(10, Activation.Attack, 3, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 40),
					}),
				}),
			new EquipSet("Chaste Messager", "90pve4",
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
			new EquipSet("Âme de la Colombe Bienfaisante", "85pve4",
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
			new EquipSet("Grande Rédemption", "80pve4",
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
			new EquipSet("Chants de Voix Divine", "75pve4",
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
			new EquipSet("Hymne Guerrier", "70pve4",
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
			new EquipSet("Templier Sacré", "65pve4",
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
			new EquipSet("Ordre Originel", "60pve4",
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
			new EquipSet("Déesse de l'Aube", "50pve4",
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
			new EquipSet("Soleil Levant", "40pve4",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2),
					new Effect(TypeEffect.VIT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegP_old, false, 15),
					new Effect(TypeEffect.DegM_old, false, 15),
				}),
			new EquipSet("Lumière de la grâce", "30pve4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.IntComp, false, -60),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				}),
			new EquipSet("Clerc Priant", "20pve4",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2),
				},
				null,
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S7, 20, TypeValue.DURATION),
				}),
			new EquipSet("(Reforgé) Sauveur", "100pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 66),
					new Effect(TypeEffect.VitComp, false, 33),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Sauveur", "100pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("(Reforgé) Secte Originelle", "95pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.VitComp, false, 28),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Secte Originelle", "95pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21),
					new Effect(TypeEffect.VitComp, false, 25),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("(Reforgé) Rédempteur de Shibusen", "85pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 42),
					new Effect(TypeEffect.VitComp, false, 24),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Rédempteur de Shibusen", "85pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 38),
					new Effect(TypeEffect.VitComp, false, 22),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Dévotion de Zenaïda (Reforgée)", "75pvp4R",
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
			new EquipSet("Dévotion de Zenaïda", "75pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 36),
					new Effect(TypeEffect.VitComp, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Apaisement de Galien (Reforgée)", "65pvp4R",
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
			new EquipSet("Apaisement de Galien", "65pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new Effect(TypeEffect.VitComp, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Secte du Secret Suprême (Reforgée)", "55pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Secte Esotérique Supérieure", "55pvp4",
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
			new EquipSet("Ancienne Secte Secrète (Reforgé)", "45pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -55, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Ancienne Secte Secrète", "45pvp4",
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
			new EquipSet("Saint Eto (Reforgé)", "25pvp4R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -34, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Saint Eto", "25pvp4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, -30, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Supplique de la Déesse", "80nucleus4",
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
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.ReflectM, false, 50),
					}),
				}),
			new EquipSet("Piété Millénaire", "70nucleus4",
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
					}),
				}),
			new EquipSet("Jugement du Fanatique", "60nucleus4",
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -25),
					new Effect(TypeEffect.Foudre, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12),
					new Proc(30, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 23),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet("Ailes de la Sérénité", "80lingot4",
				new Calculable[] {
					new Proc(28, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 65, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new SkillEffect(TypeSkillEffect.Class4S9, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCM, false, 45),
					new Effect(TypeEffect.VOL, false, 26),
				}),
			new EquipSet("Prière de Vierge", "70lingot4",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new SkillEffect(TypeSkillEffect.Class4S8, 40, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -45, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -45, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 40),
					new Effect(TypeEffect.PV, true, 10),
				}),
			new EquipSet("Fanatique", "60lingot4",
				new Calculable[] {
					new Effect(TypeEffect.DefM, true, 15),
					new Effect(TypeEffect.Feu, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Proc(22, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.CostComp, false, 550, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.DCCM, false, 15),
				}),
			new EquipSet("Lotus Sacré", "90gvg4",
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
			new EquipSet("Vaillance du Léviathan", "80gvg4",
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
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 20),
					}),
				}),
			new EquipSet("Pureté du Clerc", "70gvg4",
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
			new EquipSet("Évolution de l'Archange (Réincarné)", "100evo4R",
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
			new EquipSet("Âme Divine", "100evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de l'Exorciste (Réincarné)", "90evo4R",
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
			new EquipSet("Évolution de l'Exorciste", "90evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Rédempteur (Réincarné)", "75evo4R",
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
			new EquipSet("Évolution du Rédempteur", "75evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Clerc (Réincarné)", "60evo4R",
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
			new EquipSet("Évolution du Clerc", "60evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Prêtre (Réincarné)", "30evo4R",
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
			new EquipSet("Évolution du Prêtre", "30evo4",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			
			new EquipSet("Mantra Sacré Salvateur", "90red5", null, null, null),
			new EquipSet("Véritable Salvateur", "10ans90red5", null, null, null),
			new EquipSet("Prière de l'Aube", "100vio5", null, null, null),
			new EquipSet("Vérité Divine", "90vio5", null, null, null),
			new EquipSet("Prophète Omniscient", "80vio5", null, null, null),
			new EquipSet("Tribale de Thrall", "100gold5",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.ReducP_old, false, 18),
					new Effect(TypeEffect.ReducM_old, false, 18),
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
			new EquipSet("Esprit de Tao Ren", "90gold5",
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
						new Effect(TypeEffect.ReducP_old, false, 80),
						new Effect(TypeEffect.ReducM_old, false, 80),
					}),
				}),
			new EquipSet("Set stellaire de Salvateur", "10ans90gold5",
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
						new Effect(TypeEffect.ReducP_old, false, 80),
						new Effect(TypeEffect.ReducM_old, false, 80),
					}),
				}),
			new EquipSet("Fureur de Fenrir", "80gold5",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 30),
					new Effect(TypeEffect.VitAtk, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				}),
			new EquipSet("Cri Ancestral", "100pve5",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.Feu, false, 15),
					new Effect(TypeEffect.DegSacre, false, 400),
				}),
			new EquipSet("Ode à la Vie", "95pve5",
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
			new EquipSet("Oracle Prolixe", "90pve5",
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
			new EquipSet("Âme de l'Aigle Perspicace", "85pve5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14),
					new Effect(TypeEffect.INT, false, 40),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			new EquipSet("Tables Tournantes", "80pve5",
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
			new EquipSet("Jugement des Dieux", "75pve5",
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
			new EquipSet("Secret de Chimère", "70pve5",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.INT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 25),
					new Effect(TypeEffect.RDCCM, false, 25),
					new Effect(TypeEffect.PV, true, 15),
				}),
			new EquipSet("Sage du Soleil Levant", "65pve5",
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
			new EquipSet("Promeneur Céleste", "60pve5",
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.INT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
				}),
			new EquipSet("Esprits Sacrés", "50pve5",
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
			new EquipSet("Plume Colorée", "40pve5",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class5S6, 10, TypeValue.DURATION),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3),
					new Effect(TypeEffect.INT, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
				}),
			new EquipSet("(Reforgé) Intuition sauvage", "100pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39),
					new Effect(TypeEffect.INT, false, 39),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Intuition sauvage", "100pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35),
					new Effect(TypeEffect.INT, false, 35),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("(Reforgé) Brute Psionique", "95pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33),
					new Effect(TypeEffect.INT, false, 33),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Brute Psionique", "95pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 30),
					new Effect(TypeEffect.INT, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("(Reforgé) Oracle d'Amestris", "85pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Effect(TypeEffect.INT, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Oracle d'Amestris", "85pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.INT, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Ruse de Sun Wukong (Reforgé)", "75pvp5R",
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
			new EquipSet("Ruse de Sun Wukong", "75pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19),
					new Effect(TypeEffect.INT, false, 17),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Illusion de Kuzunoha (Reforgé)", "65pvp5R",
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
			new EquipSet("Illusion de Kuzunoha", "65pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15),
					new Effect(TypeEffect.INT, false, 13),
					new Proc(90, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Messager Bestial (Reforgé)", "55pvp5R",
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
			new EquipSet("Héraut bestial élégant", "55pvp5",
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
			new EquipSet("Coursier Céleste (Reforgé)", "45pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8),
					new Effect(TypeEffect.INT, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -55, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Coursier céleste", "45pvp5",
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
			new EquipSet("Éléments d'Asakura (Reforgé)", "25pvp5R",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -34, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Éléments d'Asakura", "25pvp5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
					new Effect(TypeEffect.INT, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -30, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Chasseur de Tempêtes", "80nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.DCCM, false, 25),
				},
				new Calculable[] {
					new Proc(25, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -40, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Condition(TypeEffect.PV, 35, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 200, 350, TypeRegen.REGENERATION, 3),
					}),
				}),
			new EquipSet("Totem des Ancêtres", "70nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.ReducM_old, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 23),
					new Proc(20, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 25),
					}),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.INT, false, -170, Target.OPPONENT),
					}),
				}),
			new EquipSet("Prix de la Raison", "60nucleus5",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new SkillEffect(TypeSkillEffect.Class5S10, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10),
					new Proc(18, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -60, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -15, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DegNature, false, 900),
						new Effect(TypeEffect.Depla, false, -10, Target.OPPONENT),
					}),
				}),
			new EquipSet("Mélopée des Montagnes", "80lingot5",
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
			new EquipSet("Oeil du Cyclone", "70lingot5",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 22),
					new Effect(TypeEffect.RTCCM, false, -18),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(18, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
						new Effect(TypeEffect.DefM, true, 40),
					}),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.VOL, false, -100, Target.OPPONENT),
						new Effect(TypeEffect.VIT, false, -70, Target.OPPONENT),
					}),
				}),
			new EquipSet("Équilibre de la Nature", "60lingot5",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14),
					new SkillEffect(TypeSkillEffect.Class5S11, 25, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Proc(15, Activation.Attacked, 9, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, -60, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2Skill_old, 12),
				}),
			new EquipSet("Grand Bois Divin", "90gvg5",
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
					new Effect(TypeEffect.ReducP_old, false, 12),
					new Effect(TypeEffect.ReducM_old, false, 12),
					new Effect(TypeEffect.PV, true, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 35),
					new Effect(TypeEffect.Toucher, false, 30),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -195, Target.OPPONENT),
					}),
				}),
			new EquipSet("Envoûtement des Dryades", "80gvg5",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17),
					new Effect(TypeEffect.VOL, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Nature, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.ReducP_old, false, 12),
					new Effect(TypeEffect.ReducM_old, false, 12),
					new Effect(TypeEffect.PV, true, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 32),
					new Effect(TypeEffect.Toucher, false, 27),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -185, Target.OPPONENT),
					}),
				}),
			new EquipSet("Érudition de Diviciacos", "70gvg5",
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
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.Toucher, false, 25),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.AGI, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet("Évolution du Druide (Réincarné)", "100evo5R",
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
			new EquipSet("Âme Éternelle", "100evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Shaman (Réincarné)", "90evo5R",
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
			new EquipSet("Évolution du Shaman", "90evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de l'Oracle (Réincarné)", "75evo5R",
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
			new EquipSet("Évolution de l'Oracle", "75evo5",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Sage (Réincarné)", "60evo5R",
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
			new EquipSet("Évolution du Sage", "60evo5",
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
			new EquipSet("Enchantée d'Elminster", "100gold6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 60),
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.AtkM, true, 15, false, WeaponType.BATON),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -18),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
				}),
			new EquipSet("Fourvoyé", "100pvp6",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Toucher, true, 35),
					new Effect(TypeEffect.ESQ, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 40),
					new Effect(TypeEffect.ReducP_old, false, 30),
					new Effect(TypeEffect.PeneM, false, 15),
				}),
		};
	}
	
	private static EquipSet[] getMeca() {
		return new EquipSet[] {
			new EquipSet("Entaille ultime", "90red8", null, null, null),
			new EquipSet("Véritable Suradanceur", "10ans90red8", null, null, null),
			new EquipSet("Démon Frappe-pierre", "100vio8", null, null, null),
			new EquipSet("Ailes Célestes Envoûtantes", "90vio8", null, null, null),
			new EquipSet("Trépas de Glace et d'Étoiles", "80vio8", null, null, null),
			new EquipSet("Général divin du centre de la Terre", "100gold8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 70),
					new Effect(TypeEffect.DegStd, false, 15),
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 75, Target.OPPONENT),
						new Effect(TypeEffect.ReflectM, false, 75, Target.OPPONENT),
					}),
				}),
			new EquipSet("Set stellaire de Suradanceur", "10ans90gold8",
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
					}),
				}),
			new EquipSet("Brume rugissante effrayante", "90gold8",
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
					}),
				}),
			new EquipSet("Arme de zone gelée", "80gold8",
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
					}),
				}),
			new EquipSet("(Reforgé) Démon traqueur", "100pvp8R",
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
					new Effect(TypeEffect.ReducP_old, false, 33),
					new Effect(TypeEffect.ReducM_old, false, 33),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 72),
					new Effect(TypeEffect.PV, true, 28),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 39),
						new Effect(TypeEffect.VitComp, false, 39),
					}),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -55),
					}),
				}),
			new EquipSet("Démon traqueur", "100pvp8",
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
					new Effect(TypeEffect.ReducP_old, false, 30),
					new Effect(TypeEffect.ReducM_old, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 65),
					new Effect(TypeEffect.PV, true, 25),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 35),
						new Effect(TypeEffect.VitComp, false, 35),
					}),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50),
					}),
				}),
			new EquipSet("(Reforgé) Mort Dévoreuse d'Âmes", "95pvp8R",
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
					new Effect(TypeEffect.ReducP_old, false, 28),
					new Effect(TypeEffect.ReducM_old, false, 28),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 66),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet("Mort Dévoreuse d'Âmes", "95pvp8",
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
					new Effect(TypeEffect.ReducP_old, false, 25),
					new Effect(TypeEffect.ReducM_old, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 60),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(80, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet("(Reforgé) Mort désintégrante", "85pvp8R",
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
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Effect(TypeEffect.ReducM_old, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 66),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(70, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet("Mort désintégrante", "85pvp8",
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
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.ReducM_old, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 60),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(70, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet("Ravageur de Massacre (Reforgé)", "75pvp8R",
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
					new Effect(TypeEffect.ReducP_old, false, 17),
					new Effect(TypeEffect.ReducM_old, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 55),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(60, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 33),
						new Effect(TypeEffect.VitComp, false, 33),
					}),
				}),
			new EquipSet("Ravageur de Massacre", "75pvp8",
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
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(60, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet("Combat Sanglant (Reforgé)", "65pvp8R",
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
					new Effect(TypeEffect.ReducP_old, false, 11),
					new Effect(TypeEffect.ReducM_old, false, 11),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 55),
					new Effect(TypeEffect.PV, true, 22),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet("Combat Sanglant", "65pvp8",
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
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.PV, true, 20),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet("Seigneur Maniaque (Reforgé)", "55pvp8R",
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
			new EquipSet("Seigneur Maniaque", "55pvp8",
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
			new EquipSet("Assassin Maniaque (Reforgé)", "45pvp8R",
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
			new EquipSet("Assassin Maniaque", "45pvp8",
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
			new EquipSet("Robuste Samuraï (Reforgé)", "25pvp8R",
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
					new Effect(TypeEffect.PV, true, 6),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 32),
						new Effect(TypeEffect.VitComp, false, 32),
					}),
				}),
			new EquipSet("Robuste Samuraï", "25pvp8",
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
					new Effect(TypeEffect.PV, true, 5),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 30),
						new Effect(TypeEffect.VitComp, false, 30),
					}),
				}),
			new EquipSet("Bretteur Nomade (Reforgé)", "25pvp9R",
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
						new SkillEffect(TypeSkillEffect.Class9S1, 0, TypeValue.RELOAD),
					}),
				}),
			new EquipSet("Bretteur Nomade", "25pvp9",
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
						new SkillEffect(TypeSkillEffect.Class9S1, 0, TypeValue.RELOAD),
					}),
				}),
			new EquipSet("Excellent guerrier", "100pve8",
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
					new Effect(TypeEffect.ReducP_old, false, 10),
					new Effect(TypeEffect.ReducM_old, false, 10),
					new Proc(15, Activation.Attacked, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION, 1),
						new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 1),
					}),
				}),
			new EquipSet("Garde impérial", "95pve8",
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
			new EquipSet("Ouragan du Val de la fissure", "90pve8",
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
			new EquipSet("Péché du pénitent", "85pve8",
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
						new Effect(TypeEffect.ReducP_old, false, 40),
						new Effect(TypeEffect.ReducM_old, false, 40),
					}),
				}),
			new EquipSet("Flamme de glace bleue", "80pve8",
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
					}),
				}),
			new EquipSet("Démon enragé", "75pve8",
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
			new EquipSet("Esprit dansant", "70pve8",
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
			new EquipSet("Hémophilie", "65pve8",
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
			new EquipSet("Seigneur Bondinouri", "60pve8",
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
			new EquipSet("Faucille de pillage", "50pve8",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7),
					new Effect(TypeEffect.VitAtk, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 15),
				}),
			new EquipSet("Gladiateur belliqueux", "40pve8",
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
			new EquipSet("Agent de renseignement", "30pve8",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
				}),
			new EquipSet("Garde imposant", "20pve8",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2),
				},
				null,
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
				}),
			new EquipSet("Balayage radical", "80nucleus8",
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 7),
					new Effect(TypeEffect.ESQ, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new StaticEffect(TypeStaticEffect.x2STD_old, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
					new SkillEffect(TypeSkillEffect.Class8S2, 35, TypeValue.DAMAGE),
				}),
			new EquipSet("Chaînes Lumifer", "70nucleus8",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new StaticEffect(TypeStaticEffect.x2STD_old, 30),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Proc(20, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 50),
					}),
				}),
			new EquipSet("Gladiateur flamboyant", "60nucleus8",
				new Calculable[] {
					new SkillEffect(TypeSkillEffect.Class8S3, 20, TypeValue.DAMAGE),
					new SkillEffect(TypeSkillEffect.Class8S4, 30, TypeValue.DAMAGE),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 50),
					new Proc(20, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 60),
					}),
				},
				new Calculable[] {
					new Proc(50, Activation.Phys, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 800),
					}),
				}),
			new EquipSet("Démogorgon pleureur", "80lingot8",
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
						new Effect(TypeEffect.ReducP_old, false, 3),
						new Effect(TypeEffect.ReducM_old, false, 3),
					}),
				}),
			new EquipSet("Chaînes Mortefer", "70lingot8",
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
					}),
				}),
			new EquipSet("Gladiateur Ballarcane", "60lingot8",
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
			new EquipSet("Âme Brisée du prédateur nocturne", "90gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 38),
					new Effect(TypeEffect.VIT, false, 23),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Effect(TypeEffect.ReducP_old, false, 25),
					new Effect(TypeEffect.ReducM_old, false, 25),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 35),
					new Proc(50, Activation.Attack, 9, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}),
				}),
			new EquipSet("Combat sans fin", "80gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.FCE, false, 30),
					new Effect(TypeEffect.VIT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.ReducM_old, false, 20),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 30),
					new Proc(50, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}),
				}),
			new EquipSet("Puissance éternelle", "70gvg8",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 27),
					new Effect(TypeEffect.RTCCM, false, 27),
					new Effect(TypeEffect.FCE, false, 22),
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 17),
					new Effect(TypeEffect.ReducP_old, false, 15),
					new Effect(TypeEffect.ReducM_old, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 20),
					new Proc(40, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 30),
					}),
				}),
			new EquipSet("Évolution de l'Oméga (Réincarné)", "100evo8R",
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
			new EquipSet("Évolution de l'Oméga", "100evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Mégatron (Réincarné)", "90evo8R",
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
			new EquipSet("5e Évolution du Machiniste", "90evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Prime (Réincarné)", "75evo8R",
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
			new EquipSet("Évolution du Prime", "75evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Métalleux (Réincarné)", "60evo8R",
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
			new EquipSet("Évolution du Métalleux", "60evo8",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Machiniste (Réincarné)", "30evo8R",
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
			new EquipSet("Évolution du Machiniste", "30evo8",
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
			new EquipSet("Danse Sauvage de Dimensionaliste", "90red10", null, null, null),
			new EquipSet("Véritable Dimensionaliste", "10ans90red10", null, null, null),
			new EquipSet("Royaume illusoire - Juge d'outremonde", "100vio10", null, null, null),
			new EquipSet("Trou noir - Dispersion Demis", "90vio10", null, null, null),
			new EquipSet("Univers - Aventurier de l'extrême", "80vio10", null, null, null),
			new EquipSet("Stalactite de l'Ombre", "100gold10",
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
			new EquipSet("Prisme de Cristal", "90gold10",
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
					}),
				}),
			new EquipSet("Set stellaire de Dimensionaliste", "10ans90gold10",
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
					}),
				}),
			new EquipSet("Hérétique Cristallin", "80gold10",
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
			new EquipSet("Mirage cristallin", "100pve10",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -50),
					new Proc(50, Activation.Standard, 4, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 10),
					}),
				}),
			new EquipSet("Malédiction du Cristal Runique", "95pve10",
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
					}),
				}),
			new EquipSet("Cristal radieux", "90pve10",
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
			new EquipSet("Voyageur Sprite", "85pve10",
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
			new EquipSet("Éclat cristallin hérétique", "80pve10",
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
			new EquipSet("Grand Voyageur", "75pve10",
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Effect(TypeEffect.ReducM_old, false, 20),
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
			new EquipSet("Cristal Mutant", "70pve10",
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
			new EquipSet("Cristal Arc-en-Ciel", "65pve10",
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
			new EquipSet("Cristal infini", "60pve10",
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
			new EquipSet("Voyageur Temporel", "50pve10",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 50),
				}),
			new EquipSet("Cristal déviant", "40pve10",
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
			new EquipSet("Ermite", "30pve10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, true, 1),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 20),
				}),
			new EquipSet("Cristallisées", "20pve10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5),
				},
				null,
				new Calculable[] {
					new Effect(TypeEffect.VOL, true, 1),
				}),
			new EquipSet("(Reforgé) Source de Cristal Jaillissante", "100pvp10R",
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
			new EquipSet("Source de Cristal Jaillissante", "100pvp10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Proc(85, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.ABSORPTION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.PM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 40),
					new Effect(TypeEffect.RDCCM, false, 30),
					new Effect(TypeEffect.VitComp, false, 15),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.PM, true, -30, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Voyageur intermittent", "95pvp10R",
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
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -220, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur intermittent", "95pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 50),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 30),
					new Effect(TypeEffect.RTCCM, false, 30),
					new Effect(TypeEffect.ESQ, false, 30),
					new Effect(TypeEffect.Toucher, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Proc(80, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.VOL, false, -200, Target.OPPONENT),
					}),
				}),
			new EquipSet("(Reforgé) Voyageur runique", "85pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 44),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, -55, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 55),
					new Effect(TypeEffect.RTCCM, false, 55),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur runique", "85pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 50),
					new Effect(TypeEffect.RTCCM, false, 50),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur rayonnant (Reforgé)", "75pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 44),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 40),
					new Effect(TypeEffect.RTCCM, false, 40),
					new Effect(TypeEffect.ESQ, false, 22),
					new Effect(TypeEffect.Toucher, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducP_old, false, 33),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -220, Target.OPPONENT),
					}),
				}),
			new EquipSet("Tenue de Voyageur rayonnant", "75pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.ESQ, false, 20),
					new Effect(TypeEffect.Toucher, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducP_old, false, 30),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -200, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur prismatique (Reforgé)", "65pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.ESQ, false, 28),
					new Effect(TypeEffect.Toucher, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 33),
					new Effect(TypeEffect.ReducP_old, false, 22),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -193, Target.OPPONENT),
					}),
				}),

			new EquipSet("Tenue de Voyageur prismatique", "65pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Glace, false, -100, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.ESQ, false, 25),
					new Effect(TypeEffect.Toucher, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Proc(70, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet("Ancien du cristal (Reforgé)", "55pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -22, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -22, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Tenue Ancien du cristal", "55pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -20, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Sage de Cristal (Reforgé)", "45pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -55, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Tenue du Sage cristallin", "45pvp10",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -35, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Source de Cristal (Reforgé)", "25pvp10R",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, 34, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Source de Cristal", "25pvp10",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.INT, false, 30, Target.OPPONENT),
					}),
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
					}),
				}),
			new EquipSet("Gardien du cristal", "80nucleus10",
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
			new EquipSet("Puissance du cristal", "70nucleus10",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3Skill_old, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Proc(50, Activation.Attacked, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.DefP, true, 50, Target.OPPONENT),
					}),
				}),
			new EquipSet("Cristal de célérité", "60nucleus10",
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
					}),
				}),
			new EquipSet("Porteur du cristal", "80lingot10",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 3),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Proc(15, Activation.Attack, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 500, 1000, TypeRegen.REGENERATION, 2),
					}),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 10, 500, TypeRegen.REGENERATION, 2),
					}),
				}),
			new EquipSet("Puissance du cristal de givre", "70lingot10",
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -5, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
				},
				new Calculable[] {
					new Proc(35, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DegP_old, false, -20, Target.OPPONENT),
						new Effect(TypeEffect.DegM_old, false, -20, Target.OPPONENT),
					}),
				}),
			new EquipSet("Gemme robuste", "60lingot10",
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
					}),
				}),
			new EquipSet("Agate mutante", "90gvg10",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 35),
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -195, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur temporel à la dérive", "80gvg10",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 30),
					new Effect(TypeEffect.ReducP_old, false, 25),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -185, Target.OPPONENT),
					}),
				}),
			new EquipSet("Tenue d'Éternité", "70gvg10",
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
					new Effect(TypeEffect.ReducP_old, false, 20),
					new Proc(60, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, -175, Target.OPPONENT),
					}),
				}),
			new EquipSet("Évolution d'outremonde (Réincarné)", "100evo10R",
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
			new EquipSet("Évolution d'outremonde", "100evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution des univers fantastiques (Réincarné)", "90evo10R",
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
			new EquipSet("Évolution de l'Exorciste", "90evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Maître Demis (Réincarné)", "75evo10R",
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
			new EquipSet("Évolution des univers fantastiques", "75evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),

			new EquipSet("Évolution du Maître Demis (Réincarné)", "60evo10R",
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
			new EquipSet("Évolution de Demis", "60evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution du Voyageur (Réincarné)", "30evo10R",
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
			new EquipSet("Évolution du Voyageur", "30evo10",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Frappe Brise-Temps", "90red11", null, null, null),
			new EquipSet("Véritable Brise-temps", "10ans90red11", null, null, null),
			new EquipSet("Royaume temporel - voyageur des ères", "100vio11", null, null, null),
			new EquipSet("Appareil - contrôle de pantin", "90vio11", null, null, null),
			new EquipSet("Temps - Gardien", "80vio11", null, null, null),
			new EquipSet("Cristal Spatio-temporel", "100gold11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new Effect(TypeEffect.VOL, false, 30),
					new Effect(TypeEffect.ReducP_old, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 60),
					new Effect(TypeEffect.VitComp, false, 20),
					new Effect(TypeEffect.RegenPM, false, 35),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 20),
					new Effect(TypeEffect.DegM_old, false, 20),
					new Proc(18, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1000, TypeRegen.ABSORPTION),
					}),
				}),
			new EquipSet("Destructeur de l'Âme", "90gold11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
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
						new Effect(TypeEffect.DegM_old, false, 15),
					}),
				}),
			new EquipSet("Set stellaire de Brise-temps", "10ans90gold11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
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
						new Effect(TypeEffect.DegM_old, false, 15),
					}),
				}),
			new EquipSet("Lien de Cristal", "80gold11",
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
			new EquipSet("Panorama", "100pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.AtkM, true, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducAtk, false, 15),
					new Effect(TypeEffect.ReducComp, false, 15),
					new Effect(TypeEffect.PM, true, 10),
					new Effect(TypeEffect.DegM_old, false, 10),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 10),
						new Effect(TypeEffect.VitComp, false, 20),
						new Effect(TypeEffect.AtkM, true, 5),
					}),
				}),
			new EquipSet("Fléau de Cristal", "95pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.TCCM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
					new Effect(TypeEffect.DegM_old, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 15),
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -20, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -20, Target.OPPONENT),
					}),
				}),
			new EquipSet("Voyageur du carnage", "90pve11",
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
			new EquipSet("Voyageur nocturne", "85pve11",
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
			new EquipSet("Cristal mortel", "80pve11",
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
			new EquipSet("Éclat de Cristal", "75pve11",
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
			new EquipSet("Roi des profondeurs cristallines", "70pve11",
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
			new EquipSet("Cristal ténébreux", "65pve11",
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
			new EquipSet("Voyageur magique", "60pve11",
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
			new EquipSet("Évolutif de Cristal", "50pve11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 15),
				}),
			new EquipSet("Cristal", "40pve11",
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
			new EquipSet("(Reforgé) Cristal Chaotique", "100pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33),
					new Effect(TypeEffect.VOL, false, 33),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -220, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 39),
					new Effect(TypeEffect.RTCCM, false, 39),
					new Effect(TypeEffect.Depla, false, 28),
					new Effect(TypeEffect.RegenPM, false, 55),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM_old, false, 17),
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.PM, true, 6),
					new Proc(30, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				}),
			new EquipSet("Cristal Chaotique", "100pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 30),
					new Effect(TypeEffect.VOL, false, 30),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.VIT, false, -200, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 35),
					new Effect(TypeEffect.RTCCM, false, 35),
					new Effect(TypeEffect.Depla, false, 25),
					new Effect(TypeEffect.RegenPM, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegM_old, false, 15),
					new Effect(TypeEffect.VitComp, false, 45),
					new Effect(TypeEffect.PM, true, 5),
					new Proc(30, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReloadComp, false, 1),
					}),
				}),
			new EquipSet("(Reforgé) Gardien du temps", "95pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 55),
					new Proc(85, Activation.Attack, 22, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("Gardien du temps", "95pvp11",
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 50),
					new Proc(85, Activation.Attack, 20, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("(Reforgé) Créateur du cristal", "85pvp11R",
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
			new EquipSet("Créateur du cristal", "85pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(15, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -50, Target.OPPONENT),
					}),
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
			new EquipSet("Voyageur ténébreux (Reforgé)", "75pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22),
					new Effect(TypeEffect.VOL, false, 22),
					new Proc(85, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					})
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("Tenue de Voyageur ténébreux", "75pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(85, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					})
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("Genèse spatio-temporelle (Reforgé)", "65pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11),
					new Effect(TypeEffect.VOL, false, 22),
					new Proc(75, Activation.Attack, 17, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					})
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("Tenue Genèse spatio-temporelle", "65pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					})
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
						new Effect(TypeEffect.ReflectP, false, 100),
						new Effect(TypeEffect.ReflectM, false, 100),
					}),
				}),
			new EquipSet("Genèse cristalline (Reforgé)", "55pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18),
					new Effect(TypeEffect.VOL, false, 18),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -22, Target.OPPONENT),
					})
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
			new EquipSet("Tenue Genèse cristalline", "55pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -20, Target.OPPONENT),
					})
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
			new EquipSet("Tenue de Voyageur (Reforgé)", "45pvp11R",
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
					new Effect(TypeEffect.DegM_old, false, 5),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 55),
						new Effect(TypeEffect.ReflectM, false, 55),
					}),
				}),
			new EquipSet("Tenue de Voyageur", "45pvp11",
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
					new Effect(TypeEffect.DegM_old, false, 3),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 25),
						new Effect(TypeEffect.ReflectM, false, 25),
					}),
				}),
			new EquipSet("Runes sacrificielles (Reforgé)", "25pvp11R",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8),
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 34, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 22),
					new Effect(TypeEffect.RTCCM, false, 22),
					new Effect(TypeEffect.TCCM, false, 22),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 30),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 55),
						new Effect(TypeEffect.ReflectM, false, 55),
					}),
				}),
			new EquipSet("Runes sacrificielles", "25pvp11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7),
					new Effect(TypeEffect.VOL, false, 8),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 20),
					new Effect(TypeEffect.RTCCM, false, 20),
					new Effect(TypeEffect.TCCM, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10),
					new Proc(50, Activation.Attack, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.ReflectM, false, 50),
					}),
				}),
			new EquipSet("Cristallin d'incantation", "80nucleus11",
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new Proc(50, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.PeneP, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.PeneM, false, -50, Target.OPPONENT),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20),
					new Proc(50, Activation.Attack, 8, new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 50),
					}),
				}),
			new EquipSet("Voyageur désespéré", "70nucleus11",
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
					}),
				}),
			new EquipSet("Esprit du voyageur", "60nucleus11",
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10),
					new Effect(TypeEffect.VOL, false, 10),
					new Effect(TypeEffect.AGI, false, 20),
				},
				new Calculable[] {
					new Proc(30, Activation.Attack, 10, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
					}),
				}),
			new EquipSet("Voyageur sur le déclin", "80lingot11",
				new Calculable[] {
					new Effect(TypeEffect.PM, true, 5),
					new Proc(50, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DegStd, false, -30),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 40),
					new Effect(TypeEffect.PM, true, 3),
				},
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 40),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 20),
				}),
			new EquipSet("Roi de la catastrophe", "70lingot11",
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
					}),
				}),
			new EquipSet("Malédiction du voyageur", "60lingot11",
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
					}),
				}),
			new EquipSet("Os de dragon Crystalis", "90gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25),
					new Effect(TypeEffect.VOL, false, 25),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -50, Target.OPPONENT),
					}),
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
			new EquipSet("Cristal dégénéré", "80gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20),
					new Effect(TypeEffect.VOL, false, 20),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
					}),
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
			new EquipSet("Tenue Cristal d'éternité", "70gvg11",
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15),
					new Effect(TypeEffect.VOL, false, 15),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new Effect(TypeEffect.Ombre, false, -100, Target.OPPONENT),
					}),
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
			new EquipSet("Évolution de Pillard (Réincarné)", "100evo11R",
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
			new EquipSet("Évolution de Pillard", "100evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de chronoverse (Réincarné)", "90evo11R",
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
			new EquipSet("Évolution du Gourou", "90evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de Maître Chronos (Réincarné)", "75evo11R",
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
			new EquipSet("Évolution de chronoverse", "75evo11",
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 20),
				}),
			new EquipSet("Évolution de Maître Chronos (Réincarné)", "60evo11R",
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
			new EquipSet("Évolution de Chronos", "60evo11",
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
			new EquipSet("Rien", "-1", null, null, null),
			new EquipSet("Résistance suprême de Tarot", "100tarot0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.TCCP, false, 10),
					new Effect(TypeEffect.DCCP, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD_old, 15),
					new Proc(100, Activation.Attack, 6, 5, new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 3),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35),
					new Effect(TypeEffect.FCE, false, 40),
					new Proc(15, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 50),
						new Proc(100, Activation.Phys, new Calculable[] {
							new Effect(TypeEffect.DegSacre, false, 4000),
						}),
					}),
				}),
			new EquipSet("Tarot Roue de la fortune", "100tarot1",
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
					}),
				}),
			new EquipSet("Tarot Mort", "100tarot2",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 70),
					new Effect(TypeEffect.Depla, false, 12),
					new Effect(TypeEffect.DefP, true, 20),
					new Effect(TypeEffect.DefM, true, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Proc(100, Activation.Attacked, 10, 15, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 1),
						new Effect(TypeEffect.ReducM_old, false, 1),
					})
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
					}),
				}),
			new EquipSet("Tarot - Force", "95tarot0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.TCCP, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD_old, 20),
					new Proc(100, Activation.Attack, 6, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 5),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 55),
					new Proc(12, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 14),
						new Effect(TypeEffect.FCE, true, 45),
					}),
				}),
			new EquipSet("Tarot - Zodiaque", "95tarot1",
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
					}),
				}),
			new EquipSet("Tarot - Lune", "95tarot2",
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
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 55),
					new Effect(TypeEffect.DefM, true, 20),
					new Proc(12, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 60),
						new Effect(TypeEffect.ReducM_old, false, 60),
					}),
				}),
			new EquipSet("Amant Tarot", "90tarot0",
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
					new Proc(25, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 50),
						new Effect(TypeEffect.ReflectM, false, 50),
					}),
					new Proc(5, Activation.Attack, 30, new Calculable[] {
						new MultipleHit(TypeMultipleHit.Triple, 100),
					}),
				}),
			new EquipSet("Démon Tarot", "90tarot1",
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
						new MultipleHit(TypeMultipleHit.Triple, 100),
					}),
				}),
			new EquipSet("Ermite Tarot", "90tarot2",
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
						new MultipleHit(TypeMultipleHit.Triple, 100),
					}),
				}),
		};
	}	

	static EquipSet[] getCapeRing() {
		return new EquipSet[] {
			new EquipSet("Rien", "-1", null, null),
			new EquipSet("Set de la Gloire Meurtrière", "tdb0",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 60),
					new Effect(TypeEffect.VIT, false, 60),
					new Proc(5, Activation.Attacked, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 50),
					}),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.RDCCP, false, -35, Target.OPPONENT),
					}),
				}),
			new EquipSet("Set du Dragon Émeraude", "tdb1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.AGI, false, 60),
					new StaticEffect(TypeStaticEffect.x3Skill_old, 5),
				},
				new Calculable[] {
					new Proc(5, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, -25, Target.OPPONENT),
					}),
				}),
			new EquipSet("Set de la Foi Ancestrale", "tdb2",
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
			new EquipSet("Set du Squelette Maudit", "tdb3",
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
			new EquipSet("Set du Champion", "tdb4",
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
						new Effect(TypeEffect.Atk, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
					}),
				}),
			new EquipSet("Danse de lunesang", "90sombre",
				new Calculable[] {
					new Proc(10, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
						new Effect(TypeEffect.Depla, false, 5),
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 10),
						new Effect(TypeEffect.DCCM, false, 10),
					}),
				}),
			new EquipSet("Réminiscence de la bête divine", "80sombre",
				new Calculable[] {
					new Proc(50, Activation.Attacked, 5, 5, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 60),
						new Effect(TypeEffect.RegenPM, false, 5),
					}),
				},
				new Calculable[] {
					new Proc(10, Activation.Attacked, 5, 10, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 2),
						new Effect(TypeEffect.VitComp, false, 2),
					}),
				}),
			new EquipSet("Lumicloche du temps", "70sombre",
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -40),
					new Effect(TypeEffect.CostComp, false, -15),
				},
				new Calculable[] {
					new Proc(60, Activation.Attacked, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Dispel),
					}),
				}),
			new EquipSet("Lignée interdite", "60sombre",
				new Calculable[] {
					new Proc(50, Activation.Attacked, 5, 3, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 40),
						new Effect(TypeEffect.RegenPM, false, 5),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			new EquipSet("Visiteur étranger", "50sombre",
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
					}),
				}),
			new EquipSet("Caché", "40sombre",
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
				},
				new Calculable[] {
					new Proc(65, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 30),
						new Effect(TypeEffect.ReducM_old, false, 30),
						new StaticEffect(TypeStaticEffect.Block),
						new Proc(100, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 10),
						}),
					}),
				}),
			new EquipSet("Marque de vitesse", "30sombre",
				new Calculable[] {
					new Proc(100, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 150, TypeRegen.ABSORPTION),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 6),
					new Effect(TypeEffect.VitComp, false, 6),
				}),
		};
	}
}
