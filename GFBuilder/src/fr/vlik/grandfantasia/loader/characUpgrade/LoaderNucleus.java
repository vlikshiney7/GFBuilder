package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.Nucleus;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.TransformEffect;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.TransformEffect.TypeTransformation;

@SuppressWarnings("serial")
public class LoaderNucleus {
	
	static Nucleus[][] getNucleus() {
		return new Nucleus[][] {
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +4%"); put(Language.EN, "STR +4%"); }}, Quality.GREEN, "FCEgreen", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +2%"); put(Language.EN, "VIT +2%"); }}, Quality.GREEN, "VITgreen", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 2),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +4%"); put(Language.EN, "INT +4%"); }}, Quality.GREEN, "INTgreen", new Calculable[] {
					new Effect(TypeEffect.INT, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +2%"); put(Language.EN, "WIL +2%"); }}, Quality.GREEN, "VOLgreen", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 2),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +4%"); put(Language.EN, "AGI +4%"); }}, Quality.GREEN, "AGIgreen", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 4),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +5%"); put(Language.EN, "STR +5%"); }}, Quality.BLUE, "FCEblue", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +3%"); put(Language.EN, "VIT +3%"); }}, Quality.BLUE, "VITblue", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 3),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +5%"); put(Language.EN, "INT +5%"); }}, Quality.BLUE, "INTblue", new Calculable[] {
					new Effect(TypeEffect.INT, true, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +3%"); put(Language.EN, "WIL +3%"); }}, Quality.BLUE, "VOLblue", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 3),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +5%"); put(Language.EN, "AGI +5%"); }}, Quality.BLUE, "AGIblue", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 5),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +6%"); put(Language.EN, "STR +6%"); }}, Quality.BLUE, "FCEblue", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +4%"); put(Language.EN, "VIT +4%"); }}, Quality.BLUE, "VITblue", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +6%"); put(Language.EN, "INT +6%"); }}, Quality.BLUE, "INTblue", new Calculable[] {
					new Effect(TypeEffect.INT, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +4%"); put(Language.EN, "WIL +4%"); }}, Quality.BLUE, "VOLblue", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 4),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +6%"); put(Language.EN, "AGI +6%"); }}, Quality.BLUE, "AGIblue", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 6),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8%"); put(Language.EN, "STR +8%"); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6%"); put(Language.EN, "VIT +6%"); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8%"); put(Language.EN, "INT +8%"); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6%"); put(Language.EN, "WIL +6%"); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8%"); put(Language.EN, "AGI +8%"); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8% - Réduc"); put(Language.EN, "STR +8% - Reduc"); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 6),
						new Effect(TypeEffect.ReducStdD, false, 6),
						new Effect(TypeEffect.ReducSkillP, false, 6),
						new Effect(TypeEffect.ReducSkillM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6% - Réduc"); put(Language.EN, "VIT +6% - Reduc"); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 6),
						new Effect(TypeEffect.ReducStdD, false, 6),
						new Effect(TypeEffect.ReducSkillP, false, 6),
						new Effect(TypeEffect.ReducSkillM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8% - Réduc"); put(Language.EN, "INT +8% - Reduc"); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 6),
						new Effect(TypeEffect.ReducStdD, false, 6),
						new Effect(TypeEffect.ReducSkillP, false, 6),
						new Effect(TypeEffect.ReducSkillM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6% - Réduc"); put(Language.EN, "WIL +6% - Reduc"); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 6),
						new Effect(TypeEffect.ReducStdD, false, 6),
						new Effect(TypeEffect.ReducSkillP, false, 6),
						new Effect(TypeEffect.ReducSkillM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8% - Réduc"); put(Language.EN, "AGI +8% - Reduc"); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
					new Proc(20, Activation.Attacked, 3, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 6),
						new Effect(TypeEffect.ReducStdD, false, 6),
						new Effect(TypeEffect.ReducSkillP, false, 6),
						new Effect(TypeEffect.ReducSkillM, false, 6),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8% - Pirate"); put(Language.EN, "STR +8% - Pirate"); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6% - Pirate"); put(Language.EN, "VIT +6% - Pirate"); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8% - Pirate"); put(Language.EN, "INT +8% - Pirate"); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6% - Pirate"); put(Language.EN, "WIL +6% - Pirate"); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8% - Pirate"); put(Language.EN, "AGI +8% - Pirate"); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc2),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +8% - Baha"); put(Language.EN, "STR +8% - Baha"); }}, Quality.ORANGE, "FCEorange", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc3),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +6% - Baha"); put(Language.EN, "VIT +6% - Baha"); }}, Quality.ORANGE, "VITorange", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc3),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +8% - Baha"); put(Language.EN, "INT +8% - Baha"); }}, Quality.ORANGE, "INTorange", new Calculable[] {
					new Effect(TypeEffect.INT, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc3),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +6% - Baha"); put(Language.EN, "WIL +6% - Baha"); }}, Quality.ORANGE, "VOLorange", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 6),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc3),
					}),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +8% - Baha"); put(Language.EN, "AGI +8% - Baha"); }}, Quality.ORANGE, "AGIorange", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 8),
					new Proc(0, Activation.Attack, 3, new Calculable[] {
						new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc3),
					}),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10%"); put(Language.EN, "STR +10%"); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8%"); put(Language.EN, "VIT +8%"); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10%"); put(Language.EN, "INT +10%"); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8%"); put(Language.EN, "WIL +8%"); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10%"); put(Language.EN, "AGI +10%"); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +5%"); put(Language.EN, "STR +10% - Speed +5%"); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +5%"); put(Language.EN, "VIT +8%- Speed +5%"); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +5%"); put(Language.EN, "INT +10%- Speed +5%"); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +5%"); put(Language.EN, "WIL +8%- Speed +5%"); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +5%"); put(Language.EN, "AGI +10%- Speed +5%"); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 5),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +10%"); put(Language.EN, "STR +10% - Speed +10%"); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +10%"); put(Language.EN, "VIT +8% - Speed +10%"); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +10%"); put(Language.EN, "INT +10% - Speed +10%"); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +10%"); put(Language.EN, "WIL +8% - Speed +10%"); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +10%"); put(Language.EN, "AGI +10% - Speed +10%"); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +10% - Depla +15%"); put(Language.EN, "STR +10% - Speed +15%"); }}, Quality.GOLD, "FCEgold", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +8% - Depla +15%"); put(Language.EN, "VIT +8% - Speed +15%"); }}, Quality.GOLD, "VITgold", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 8),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +10% - Depla +15%"); put(Language.EN, "INT +10% - Speed +15%"); }}, Quality.GOLD, "INTgold", new Calculable[] {
					new Effect(TypeEffect.INT, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +8% - Depla +15%"); put(Language.EN, "WIL +8% - Speed +15%"); }}, Quality.GOLD, "VOLgold", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 8),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +10% - Depla +15%"); put(Language.EN, "AGI +10% - Speed +15%"); }}, Quality.GOLD, "AGIgold", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12%"); put(Language.EN, "STR +12%"); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10%"); put(Language.EN, "VIT +10%"); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12%"); put(Language.EN, "INT +12%"); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10%"); put(Language.EN, "WIL +10%"); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12%"); put(Language.EN, "AGI +12%"); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12% - Depla +10%"); put(Language.EN, "STR +12% - Speed +10%"); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10% - Depla +10%"); put(Language.EN, "VIT +10% - Speed +10%"); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12% - Depla +10%"); put(Language.EN, "INT +12% - Speed +10%"); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10% - Depla +10%"); put(Language.EN, "WIL +10% - Speed +10%"); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12% - Depla +10%"); put(Language.EN, "AGI +12% - Speed +10%"); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
					new Effect(TypeEffect.Depla, false, 10),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "FCE +12% - Depla +15%"); put(Language.EN, "STR +12% - Speed +15%"); }}, Quality.PURPLE, "FCEpurple", new Calculable[] {
					new Effect(TypeEffect.FCE, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VIT +10% - Depla +15%"); put(Language.EN, "VIT +10% - Speed +15%"); }}, Quality.PURPLE, "VITpurple", new Calculable[] {
					new Effect(TypeEffect.VIT, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "INT +12% - Depla +15%"); put(Language.EN, "INT +12% - Speed +15%"); }}, Quality.PURPLE, "INTpurple", new Calculable[] {
					new Effect(TypeEffect.INT, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "VOL +10% - Depla +15%"); put(Language.EN, "WIL +10% - Speed +15%"); }}, Quality.PURPLE, "VOLpurple", new Calculable[] {
					new Effect(TypeEffect.VOL, true, 10),
					new Effect(TypeEffect.Depla, false, 15),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "AGI +12% - Depla +15%"); put(Language.EN, "AGI +12% - Speed +15%"); }}, Quality.PURPLE, "AGIpurple", new Calculable[] {
					new Effect(TypeEffect.AGI, true, 12),
					new Effect(TypeEffect.Depla, false, 15),
				}),
			},
			new Nucleus[] {
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Pierre de Soif Sanguine"); put(Language.EN, ""); }}, Quality.ORANGE, "skill0", new Calculable[] {
					new Effect(TypeEffect.DegStdP, false, 10),
					new Effect(TypeEffect.DegStdD, false, 10),
					new Effect(TypeEffect.MEN, false, -30),
				}),
				new Nucleus(new HashMap<Language, String>() {{ put(Language.FR, "Pierre d'Oriflamme de Confrontation"); put(Language.EN, ""); }}, Quality.ORANGE, "skill1", new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 20),
					new Effect(TypeEffect.Ombre, false, 20),
					new Effect(TypeEffect.Foudre, false, 20),
					new Effect(TypeEffect.Feu, false, 20),
					new Effect(TypeEffect.Glace, false, 20),
					new Effect(TypeEffect.Nature, false, 20),
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.ReducPtsStdP, false, 20),
					new Effect(TypeEffect.ReducPtsStdD, false, 20),
					new Effect(TypeEffect.ReducPtsP, false, 20),
					new Effect(TypeEffect.ReducPtsM, false, 20),
				}),
			},
		};
	}
}
