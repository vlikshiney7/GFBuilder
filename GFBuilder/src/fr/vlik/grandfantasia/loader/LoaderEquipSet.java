package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.EquipSet;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
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
			result[i] = class2[j];
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
					new StaticEffect(TypeStaticEffect.x2STD, 25),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 60),
					new StaticEffect(TypeStaticEffect.SkillC0N1),
					new Proc(7, Activation.Attack, 2.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Immobilisation),
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
					new StaticEffect(TypeStaticEffect.x2STD, 20),
				}),
			new EquipSet("Héros Bestial", "100pve0",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new Effect(TypeEffect.VitAtk, false, 20),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.VIT, false, 15),
					new StaticEffect(TypeStaticEffect.x2STD, 20),
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
					new Effect(TypeEffect.ReducP, false, 15),
					new Effect(TypeEffect.ReducM, false, 15),
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
					new Effect(TypeEffect.ReducP, false, 10),
					new Effect(TypeEffect.ReducM, false, 10),
					new Effect(TypeEffect.VIT, false, 21),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
					new StaticEffect(TypeStaticEffect.x2STD, 20),
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
					new StaticEffect(TypeStaticEffect.x2STD, 20),
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
					new Effect(TypeEffect.ReducP, false, 10),
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 8),
					new StaticEffect(TypeStaticEffect.x3STD, 20),
				}),
			new EquipSet("Boucher de Saphaël", "65pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD, 12),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.DCCP, false, 50),
				},
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new StaticEffect(TypeStaticEffect.SkillC0N2),
				}),
			new EquipSet("Marquis de l'ombre", "60pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14),
					new Effect(TypeEffect.TCCP, false, 5),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC0N3),
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
					new StaticEffect(TypeStaticEffect.SkillC0N4),
				}),
			new EquipSet("Guerrier robuste", "40pve0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD),
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
					new StaticEffect(TypeStaticEffect.x2STD, 15),
				}),
			new EquipSet("Garde d'Elite", "20pve0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2),
				},
				null,
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC0N5),
				}),
			new EquipSet("Apostat", "100pvp0",
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 38),
					new Effect(TypeEffect.RTCCM, false, 38),
					new Effect(TypeEffect.FCE, false, 60),
				},
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 85),
					new Effect(TypeEffect.ReducP, false, 30),
					new StaticEffect(TypeStaticEffect.SkillC0N6),
					new Proc(35, Activation.Attack, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 35),
					new Effect(TypeEffect.PeneP, false, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP100N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP100N2),
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
					new Effect(TypeEffect.ReducP, false, 25),
					new StaticEffect(TypeStaticEffect.SkillC0N7),
					new Proc(30, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 30),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP95N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP95N2),
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
					new Effect(TypeEffect.ReducP, false, 20),
					new Effect(TypeEffect.CostComp, false, -80),
					new Proc(25, Activation.Attacked, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 27),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP85N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP85N2),
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
					new Effect(TypeEffect.ReducP, false, 22),
					new Effect(TypeEffect.CostComp, false, -77),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 28),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP75N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP75N2),
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
					new Effect(TypeEffect.ReducP, false, 20),
					new Effect(TypeEffect.CostComp, false, -70),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 25),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP85N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP85N2),
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
					new Effect(TypeEffect.ReducP, false, 17),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 22),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65RN1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65RN2),
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
					new Effect(TypeEffect.ReducP, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 20),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N8),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 11),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55RN1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55RN2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 10),
					new Proc(75, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55N2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP45N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP45N2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP55N2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25RN1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25RN2),
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
					new StaticEffect(TypeStaticEffect.SkillC0N13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 7),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25N2),
					}),
				}),
			new EquipSet("Dieu de la Guerre", "80nucleus0",
				new Calculable[] {
					new Effect(TypeEffect.RDegAtkD, false, 25),
					new StaticEffect(TypeStaticEffect.SkillC0N14),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28),
					new StaticEffect(TypeStaticEffect.ProcSetC0Nuc80, 50),
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
					new StaticEffect(TypeStaticEffect.SkillC0N15),
				},
				new Calculable[] {
					new Proc(45, Activation.Attacked, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0Nuc70),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.DefP, true, 15),
				}),
			new EquipSet("Marquis du Chaos", "60nucleus0",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC0N16),
					new StaticEffect(TypeStaticEffect.SkillC0N17),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22),
					new Proc(20, Activation.Attacked, 6, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 35),
					}),
				},
				new Calculable[] {
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0Nuc60N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0Nuc60N2),
					}),
				}),
			new EquipSet("Hurlement Divin", "80lingot0",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 30),
					new StaticEffect(TypeStaticEffect.ProcSetC0Lin80, 50),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC0N15),
					new Proc(20, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
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
					new StaticEffect(TypeStaticEffect.SkillC0N18),
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
					new StaticEffect(TypeStaticEffect.SkillC0N19),
					new StaticEffect(TypeStaticEffect.SkillC0N20),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 35),
					new Effect(TypeEffect.Depla, false, 5),
				},
				new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new StaticEffect(TypeStaticEffect.DegNature800, 50),
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
					new Effect(TypeEffect.ReducP, false, 12),
					new Effect(TypeEffect.ReducM, false, 12),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD, 17),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N2),
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
					new Effect(TypeEffect.ReducP, false, 10),
					new Effect(TypeEffect.ReducM, false, 10),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x3STD, 15),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0GVG70),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
			new EquipSet("Immortalité du damné", "100vio1", null, null, null),
			new EquipSet("Templier Résolu", "90vio1", null, null, null),
			new EquipSet("Défenseur Voldo", "80vio1", null, null, null),
			new EquipSet("Épique de Brienne", "100gold1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.DegP, false, 18),
					new Effect(TypeEffect.Parade, false, 30),
				},
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 15),
					new Effect(TypeEffect.ReducM, false, 15),
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
					new Proc(10, Activation.Attacked, 1.5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
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
					new StaticEffect(TypeStaticEffect.x3Skill, 30),
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
					new StaticEffect(TypeStaticEffect.x2STD, 10),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVE90N1),
						new StaticEffect(TypeStaticEffect.ProcSetC1PVE90N2),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 20),
					new Proc(10, Activation.Attacked, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVE90N3),
					}),
				}),
			new EquipSet("Chevalier Béni", "95pve1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 40),
					new Effect(TypeEffect.DegP, false, 20),
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
					new StaticEffect(TypeStaticEffect.x2STD, 20),
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
					new StaticEffect(TypeStaticEffect.x2STD, 10),
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
					new StaticEffect(TypeStaticEffect.SkillC1N2),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC1N3),
				}),
			new EquipSet("Duc Impérial", "60pve1",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC1N4),
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
					new StaticEffect(TypeStaticEffect.x2STD, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC1N5),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 35),
					new Effect(TypeEffect.VIT, false, 11),
				}),
			new EquipSet("Chevalier du Fort", "40pve1",
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.SkillC1N6),
				},
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7),
				},
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 10),
					new Effect(TypeEffect.MEN, false, 25),
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
					new StaticEffect(TypeStaticEffect.SkillC1N7),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
					new StaticEffect(TypeStaticEffect.SkillC1N8),
					new Proc(40, Activation.Attacked, 15, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 18),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 12),
					new Effect(TypeEffect.Parade, false, 25),
					new StaticEffect(TypeStaticEffect.AntiStun),
					new Proc(30, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP75),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP75),
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
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
					new StaticEffect(TypeStaticEffect.SkillC1N9),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 9),
					new Effect(TypeEffect.Parade, false, 17),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP75),
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
					new StaticEffect(TypeStaticEffect.SkillC1N10),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 8),
					new Effect(TypeEffect.Parade, false, 15),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
					new StaticEffect(TypeStaticEffect.SkillC1N11),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 12),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP75),
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
					new StaticEffect(TypeStaticEffect.SkillC1N12),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 10),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP100),
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
					new StaticEffect(TypeStaticEffect.SkillC1N13),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 6),
					new Effect(TypeEffect.Parade, false, 12),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP25R),
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
					new StaticEffect(TypeStaticEffect.SkillC1N14),
				},
				new Calculable[] {
					new Effect(TypeEffect.PV, true, 5),
					new Effect(TypeEffect.Parade, false, 10),
					new Proc(25, Activation.Attack, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1PVP25),
					}),
				}),
			new EquipSet("Thaumaturge Exalté", "80nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new StaticEffect(TypeStaticEffect.SkillC1N15),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 8),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 8),
					new Proc(18, Activation.Attacked, 7, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1Nuc80),
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
					new StaticEffect(TypeStaticEffect.SkillC1N16),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 15),
					new StaticEffect(TypeStaticEffect.x3STD, 30),
				}),
			new EquipSet("Juge Impérial", "60nucleus1",
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 20),
					new Proc(45, Activation.Attack, 10, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AntiItem),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
					new StaticEffect(TypeStaticEffect.SkillC1N17),
				},
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 22),
					new Effect(TypeEffect.AGI, false, 22),
				}),
			new EquipSet("Voix de la Création", "80lingot1",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21),
					new StaticEffect(TypeStaticEffect.SkillC1N18),
				},
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new Proc(60, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC1Lin80),
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
					new StaticEffect(TypeStaticEffect.SkillC1N19),
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
					new Effect(TypeEffect.TCCP, false, 30),
					new Effect(TypeEffect.AGI, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new StaticEffect(TypeStaticEffect.SkillC1N20),
				},
				new Calculable[] {
					new Effect(TypeEffect.Atk, true, 10),
					new Effect(TypeEffect.FCE, false, 18),
					new Effect(TypeEffect.MEN, false, 10),
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
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0GVG70),
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
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP65N1),
						new StaticEffect(TypeStaticEffect.ProcSetC0GVG70),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new StaticEffect(TypeStaticEffect.SkillC3N1),
					new Proc(15, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.DegP, false, 20),
					new Effect(TypeEffect.MEN, false, -40),
					new StaticEffect(TypeStaticEffect.SkillC3N2),
					new StaticEffect(TypeStaticEffect.x3Skill),
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
					new Effect(TypeEffect.ReducM, false, 10),
					new Effect(TypeEffect.DegOmbre, false, 350),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD, 15),
					new Proc(20, Activation.Attack, 3, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC3PVE90),
						new StaticEffect(TypeStaticEffect.ProcSetC1PVE90N2),
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
					new Effect(TypeEffect.DegP, false, 10),
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
					new Effect(TypeEffect.ReducP, false, 20),
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new EquipSet("Assassin à la Lame Cachée", "65pve3",
				new Calculable[] {
					new Effect(TypeEffect.DegDuo, false, 10),
				},
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12),
					new StaticEffect(TypeStaticEffect.SkillC3N3),
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
					new StaticEffect(TypeStaticEffect.SkillC3N4),
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
					new StaticEffect(TypeStaticEffect.SkillC2N1),
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
					new StaticEffect(TypeStaticEffect.SkillC3N5),
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
					new StaticEffect(TypeStaticEffect.SkillC3N6),
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
					new StaticEffect(TypeStaticEffect.SkillC3N7),
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
					new StaticEffect(TypeStaticEffect.SkillC3N8),
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
					new StaticEffect(TypeStaticEffect.SkillC3N9),
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
					new StaticEffect(TypeStaticEffect.SkillC3N10),
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
					new StaticEffect(TypeStaticEffect.SkillC3N11),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25RN1),
						new StaticEffect(TypeStaticEffect.ProcSetC2PVP25R),
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
					new StaticEffect(TypeStaticEffect.SkillC3N12),
					new Proc(50, Activation.Attack, 15, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC0PVP25N1),
						new StaticEffect(TypeStaticEffect.ProcSetC2PVP25),
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
					new StaticEffect(TypeStaticEffect.SkillC3N13),
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
					new StaticEffect(TypeStaticEffect.SkillC3N14),
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
					new StaticEffect(TypeStaticEffect.SkillC3N15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProcSetC3Nuc80N1, 15),
				},
				new Calculable[] {
					new Proc(45, Activation.Attack, 9, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC3Nuc80N2),
						new StaticEffect(TypeStaticEffect.ProcSetC3Nuc80N3),
					}),
				}),
			new EquipSet("Crocs du Cobra", "70nucleus3",
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20),
					new StaticEffect(TypeStaticEffect.SkillC3N16),
				},
				new Calculable[] {
					new Proc(25, Activation.Attacked, 7, new Calculable[] {
						new Effect(TypeEffect.RegenPV, false, 700),
					}),
				},
				new Calculable[] {
					new Proc(20, Activation.Attack, 7, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC3Nuc70),
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
					new StaticEffect(TypeStaticEffect.SkillC3N17),
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
						new StaticEffect(TypeStaticEffect.ProcSetC3Lin80),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21),
					new StaticEffect(TypeStaticEffect.SkillC3N16),
				},
				new Calculable[] {
					new Proc(33, Activation.Attack, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Immobilisation),
					}),
				}),
			new EquipSet("Ombre Diabolique", "70lingot3",
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20),
					new StaticEffect(TypeStaticEffect.SkillC3N15),
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
					new StaticEffect(TypeStaticEffect.SkillC3N18),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Proc(16, Activation.Attacked, 0, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetEvo),
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
					new Effect(TypeEffect.ReducP, false, 30),
					new Effect(TypeEffect.PeneM, false, 15),
				}),
		};
	}

	private static EquipSet[] getMeca() {
		return new EquipSet[] {
			new EquipSet("Entaille ultime", "90red8", null, null, null),
			new EquipSet("Démon Frappe-pierre", "100vio8", null, null, null),
			new EquipSet("Ailes Célestes Envoûtantes", "90vio8", null, null, null),
			new EquipSet("Trépas de Glace et d'Étoiles", "80vio8", null, null, null),
			new EquipSet("Général divin du centre de la Terre", "100gold",
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
						new StaticEffect(TypeStaticEffect.Stun),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 40),
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.ReducP, false, 15),
					new Effect(TypeEffect.ReducM, false, 15),
					new Proc(20, Activation.Attacked, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC8GOLD100),
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
					new StaticEffect(TypeStaticEffect.SkillC8N1),
					new Proc(20, Activation.Attacked, 8, new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new StaticEffect(TypeStaticEffect.AntiStun),
					}),
					new Proc(20, Activation.Attacked, 10, new Calculable[] {
						new StaticEffect(TypeStaticEffect.ProcSetC8GOLD90),
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
						new StaticEffect(TypeStaticEffect.ProcSetC8GOLD80),
					}),
				}),
		};
	}

	private static EquipSet[] getVoyageur() {
		return new EquipSet[] {
				
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
					new StaticEffect(TypeStaticEffect.x3STD, 15),
					new Proc(100, Activation.Attack, 6, 5, new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 3),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35),
					new Effect(TypeEffect.FCE, false, 40),
					new Proc(15, Activation.Attack, 6, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 50),
						new StaticEffect(TypeStaticEffect.DegSacre4000),
					}),
				}),
			new EquipSet("Tarot Roue de la fortune", "100tarot1",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 60),
					new Effect(TypeEffect.VitComp, false, 15),
				},
				new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 15),
					new StaticEffect(TypeStaticEffect.x3Skill, 15),
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
						new Effect(TypeEffect.ReducP, false, 1),
						new Effect(TypeEffect.ReducM, false, 1),
					})
				},
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
					new Effect(TypeEffect.VOL, false, 55),
					new Proc(8, Activation.Attack, 7, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2000),
						new StaticEffect(TypeStaticEffect.DegOmbre1500),
					}),
				}),
			new EquipSet("Tarot - Force", "95tarot0",
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 50),
					new Effect(TypeEffect.TCCP, false, 15),
				},
				new Calculable[] {
					new StaticEffect(TypeStaticEffect.x2STD, 20),
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
					new StaticEffect(TypeStaticEffect.x2Skill, 20),
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
						new StaticEffect(TypeStaticEffect.ProcSetLune1),
						new StaticEffect(TypeStaticEffect.ProcSetLune2),
					}),
				},
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 55),
					new Effect(TypeEffect.DefM, true, 20),
					new Proc(12, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 60),
						new Effect(TypeEffect.ReducM, false, 60),
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
					new StaticEffect(TypeStaticEffect.ProcSetAmant, 25),
					new Proc(5, Activation.Attack, 30, new Calculable[] {
						new StaticEffect(TypeStaticEffect.x3Skill, 100),
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
						new StaticEffect(TypeStaticEffect.x3Skill, 100),
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
						new StaticEffect(TypeStaticEffect.x3Skill, 100),
					}),
				}),
		};
	}
}
