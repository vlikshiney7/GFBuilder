package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.NucleusEnchantment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderNucleusEnchantment {
	
	static NucleusEnchantment[] getNucleusEnchantment() {
		return new NucleusEnchantment[] {
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Lapin spirituel"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, true, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sage monarque"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Lumière Sacrée"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "De l'Ombre"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Nature"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Foudre"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Feu"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Glace"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vache sanglante"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tigre arcanique"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Inébranlable"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 1),
						new Effect(TypeEffect.DefM, true, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 2),
						new Effect(TypeEffect.DefM, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 3),
						new Effect(TypeEffect.DefM, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 4),
						new Effect(TypeEffect.DefM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 5),
						new Effect(TypeEffect.DefM, true, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Foi"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 1),
						new Effect(TypeEffect.ReducStdD, false, 1),
						new Effect(TypeEffect.ReducSkillP, false, 1),
						new Effect(TypeEffect.ReducSkillM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 2),
						new Effect(TypeEffect.ReducStdD, false, 2),
						new Effect(TypeEffect.ReducSkillP, false, 2),
						new Effect(TypeEffect.ReducSkillM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 3),
						new Effect(TypeEffect.ReducStdD, false, 3),
						new Effect(TypeEffect.ReducSkillP, false, 3),
						new Effect(TypeEffect.ReducSkillM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 4),
						new Effect(TypeEffect.ReducStdD, false, 4),
						new Effect(TypeEffect.ReducSkillP, false, 4),
						new Effect(TypeEffect.ReducSkillM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Renard spirituel"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 1),
						new Effect(TypeEffect.RTCCM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 2),
						new Effect(TypeEffect.RTCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 3),
						new Effect(TypeEffect.RTCCM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 4),
						new Effect(TypeEffect.RTCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 5),
						new Effect(TypeEffect.RTCCM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Ours géant"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 1),
						new Effect(TypeEffect.RDCCM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 2),
						new Effect(TypeEffect.RDCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 3),
						new Effect(TypeEffect.RDCCM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 4),
						new Effect(TypeEffect.RDCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 5),
						new Effect(TypeEffect.RDCCM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Plume divine"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -1),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -3),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -4),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Molosse arcanique"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Lion arcanique"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Molosse enragé"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur Lion"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vantardise folle"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Ours de guerre"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Guépard"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Singe écarlate"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tortue ténébreuse"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tortue maléfique"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "De Force"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "De Vitalité"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "D'Intelligence"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 30),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "De Volonté"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 30),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "D'Agilité"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 30),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Antilope véloce"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Contrôle"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -1),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -2),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -3),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -4),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Débordement"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Divinité"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.HealD, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealD, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealD, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealD, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealD, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Force inébranlable"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 2.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sagesse inébranlable"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 2.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Agilité inébranlable"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 2.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Force contrôlée"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 2.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 3, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sagesse contrôlée"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 2.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 3, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Agilité contrôlée"); put(Language.EN, ""); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 2.5, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 3, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur"); put(Language.EN, "Overlord"); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, true, 1, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VIT, true, 1, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.INT, true, 1, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VOL, true, 1, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.AGI, true, 1, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, true, 2, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VIT, true, 2, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.INT, true, 2, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VOL, true, 2, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.AGI, true, 2, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, true, 3, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VIT, true, 3, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.INT, true, 3, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VOL, true, 3, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.AGI, true, 3, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, true, 4, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VIT, true, 4, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.INT, true, 4, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VOL, true, 4, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.AGI, true, 4, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, true, 5, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VIT, true, 5, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.INT, true, 5, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.VOL, true, 5, TypeCalcul.CONVERTBASE),
						new Effect(TypeEffect.AGI, true, 5, TypeCalcul.CONVERTBASE),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Cruauté"); put(Language.EN, "Cruel"); }},
				new Calculable[][] {
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2Skill_old, 7),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2Skill_old, 7),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2Skill_old, 7),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2Skill_old, 7),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2Skill_old, 7),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Brute"); put(Language.EN, "Brute"); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 5),
					},
				}),
			new NucleusEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Sagesse"); put(Language.EN, "Sagacious"); }},
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DegSkillM, false, 5),
					},
				}),
		};
	}
}
