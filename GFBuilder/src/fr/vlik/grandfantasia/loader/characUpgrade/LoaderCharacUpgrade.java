package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.CombiTalent;
import fr.vlik.grandfantasia.characUpgrade.Energy;
import fr.vlik.grandfantasia.characUpgrade.Nucleus;
import fr.vlik.grandfantasia.characUpgrade.ProSkill;
import fr.vlik.grandfantasia.characUpgrade.Speciality;
import fr.vlik.grandfantasia.characUpgrade.Stone;
import fr.vlik.grandfantasia.characUpgrade.Talent;
import fr.vlik.grandfantasia.characUpgrade.Title;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;

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
