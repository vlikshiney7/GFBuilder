package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.LoveBuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.gameBuff.GuildBuff;
import fr.vlik.grandfantasia.gameBuff.IslandBuff;
import fr.vlik.grandfantasia.gameBuff.Yggdrasil;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.TransformEffect;
import fr.vlik.grandfantasia.stats.TransformEffect.TypeTransformation;

@SuppressWarnings("serial")
public class Loader {
	
	public static Yggdrasil[] getYggdrasil() {
		return new Yggdrasil[] {
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "0 - Aucun"); put(Language.EN, "0 - None"); }}, "boss0", null),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "1 - Alice"); put(Language.EN, "1 - Alice"); }}, "boss1", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "2 - Ronto"); put(Language.EN, "2 - Ronto"); }}, "boss2", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.XP, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "3 - Bodor"); put(Language.EN, "3 - Bodor"); }}, "boss3", new Effect[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.DegStdP, false, 3),
				new Effect(TypeEffect.DegStdD, false, 3),
				new Effect(TypeEffect.DegSkillP, false, 3),
				new Effect(TypeEffect.DegSkillM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "4 - Smulca"); put(Language.EN, "4 - Smulca"); }}, "boss4", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.DegStdP, false, 3),
				new Effect(TypeEffect.DegStdD, false, 3),
				new Effect(TypeEffect.DegSkillP, false, 3),
				new Effect(TypeEffect.DegSkillM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "5 - Ewan"); put(Language.EN, "5 - Ewan"); }}, "boss5", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegStdP, false, 3),
				new Effect(TypeEffect.DegStdD, false, 3),
				new Effect(TypeEffect.DegSkillP, false, 3),
				new Effect(TypeEffect.DegSkillM, false, 3),
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.PeneM, false, 3),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "6 - Bahadolo"); put(Language.EN, "6 - Bahadolo"); }}, "boss6", new Effect[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegStdP, false, 5),
				new Effect(TypeEffect.DegStdD, false, 5),
				new Effect(TypeEffect.DegSkillP, false, 5),
				new Effect(TypeEffect.DegSkillM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "7 - Quill"); put(Language.EN, "7 - Quill"); }}, "boss7", new Effect[] {
				new Effect(TypeEffect.FCE, true, 10),
				new Effect(TypeEffect.VIT, true, 10),
				new Effect(TypeEffect.INT, true, 10),
				new Effect(TypeEffect.VOL, true, 10),
				new Effect(TypeEffect.AGI, true, 10),
				new Effect(TypeEffect.XP, false, 8),
				new Effect(TypeEffect.DegStdP, false, 5),
				new Effect(TypeEffect.DegStdD, false, 5),
				new Effect(TypeEffect.DegSkillP, false, 5),
				new Effect(TypeEffect.DegSkillM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "8 - Mosunk"); put(Language.EN, "8 - Mosunk"); }}, "boss8", new Effect[] {
				new Effect(TypeEffect.FCE, true, 10),
				new Effect(TypeEffect.VIT, true, 10),
				new Effect(TypeEffect.INT, true, 10),
				new Effect(TypeEffect.VOL, true, 10),
				new Effect(TypeEffect.AGI, true, 10),
				new Effect(TypeEffect.XP, false, 11),
				new Effect(TypeEffect.DegStdP, false, 5),
				new Effect(TypeEffect.DegStdD, false, 5),
				new Effect(TypeEffect.DegSkillP, false, 5),
				new Effect(TypeEffect.DegSkillM, false, 5),
				new Effect(TypeEffect.PeneP, false, 5),
				new Effect(TypeEffect.PeneM, false, 5),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "9 - Jundo"); put(Language.EN, "9 - Jundo"); }}, "boss9", new Effect[] {
				new Effect(TypeEffect.FCE, true, 10),
				new Effect(TypeEffect.VIT, true, 10),
				new Effect(TypeEffect.INT, true, 10),
				new Effect(TypeEffect.VOL, true, 10),
				new Effect(TypeEffect.AGI, true, 10),
				new Effect(TypeEffect.XP, false, 11),
				new Effect(TypeEffect.DegStdP, false, 7),
				new Effect(TypeEffect.DegStdD, false, 7),
				new Effect(TypeEffect.DegSkillP, false, 7),
				new Effect(TypeEffect.DegSkillM, false, 7),
				new Effect(TypeEffect.PeneP, false, 7),
				new Effect(TypeEffect.PeneM, false, 7),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "10 - Siropas"); put(Language.EN, "10 - Siropas"); }}, "boss10", new Effect[] {
				new Effect(TypeEffect.FCE, true, 15),
				new Effect(TypeEffect.VIT, true, 15),
				new Effect(TypeEffect.INT, true, 15),
				new Effect(TypeEffect.VOL, true, 15),
				new Effect(TypeEffect.AGI, true, 15),
				new Effect(TypeEffect.XP, false, 11),
				new Effect(TypeEffect.DegStdP, false, 7),
				new Effect(TypeEffect.DegStdD, false, 7),
				new Effect(TypeEffect.DegSkillP, false, 7),
				new Effect(TypeEffect.DegSkillM, false, 7),
				new Effect(TypeEffect.PeneP, false, 7),
				new Effect(TypeEffect.PeneM, false, 7),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "11 - Ilannia"); put(Language.EN, "11 - Ilannia"); }}, "boss11", new Effect[] {
				new Effect(TypeEffect.FCE, true, 15),
				new Effect(TypeEffect.VIT, true, 15),
				new Effect(TypeEffect.INT, true, 15),
				new Effect(TypeEffect.VOL, true, 15),
				new Effect(TypeEffect.AGI, true, 15),
				new Effect(TypeEffect.XP, false, 15),
				new Effect(TypeEffect.DegStdP, false, 7),
				new Effect(TypeEffect.DegStdD, false, 7),
				new Effect(TypeEffect.DegSkillP, false, 7),
				new Effect(TypeEffect.DegSkillM, false, 7),
				new Effect(TypeEffect.PeneP, false, 7),
				new Effect(TypeEffect.PeneM, false, 7),
			}),
			new Yggdrasil(new HashMap<Language, String>() {{ put(Language.FR, "12 - Eugénie"); put(Language.EN, "12 - Ginny"); }}, "boss12", new Effect[] {
				new Effect(TypeEffect.FCE, true, 15),
				new Effect(TypeEffect.VIT, true, 15),
				new Effect(TypeEffect.INT, true, 15),
				new Effect(TypeEffect.VOL, true, 15),
				new Effect(TypeEffect.AGI, true, 15),
				new Effect(TypeEffect.XP, false, 15),
				new Effect(TypeEffect.DegStdP, false, 10),
				new Effect(TypeEffect.DegStdD, false, 10),
				new Effect(TypeEffect.DegSkillP, false, 10),
				new Effect(TypeEffect.DegSkillM, false, 10),
				new Effect(TypeEffect.PeneP, false, 10),
				new Effect(TypeEffect.PeneM, false, 10),
			}),
		};
	}
	
	public static IslandBuff[] getIslandBuff() {
		return new IslandBuff[] {
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, null),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Accord du Roi des Sprites 5"); put(Language.EN, "Sprite King's Boon 5"); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 20),
				new Effect(TypeEffect.VIT, false, 20),
				new Effect(TypeEffect.INT, false, 20),
				new Effect(TypeEffect.VOL, false, 20),
				new Effect(TypeEffect.AGI, false, 20),
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Accord du Roi des Sprites 4"); put(Language.EN, "Sprite King's Boon 4"); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Accord du Roi des Sprites 3"); put(Language.EN, "Sprite King's Boon 3"); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Accord du Roi des Sprites 2"); put(Language.EN, "Sprite King's Boon 2"); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Accord du Roi des Sprites 1"); put(Language.EN, "Sprite King's Boon 1"); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arme de l'Arrogance 5"); put(Language.EN, "Arrogant Weapon 5"); }}, new Calculable[] {
				new Proc(14, Activation.CritPhys, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
				}),
				new Proc(14, Activation.CritMag, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arme de l'Arrogance 4"); put(Language.EN, "Arrogant Weapon 4"); }}, new Calculable[] {
				new Proc(13, Activation.CritPhys, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
				}),
				new Proc(13, Activation.CritMag, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arme de l'Arrogance 3"); put(Language.EN, "Arrogant Weapon 3"); }}, new Calculable[] {
				new Proc(12, Activation.CritPhys, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
				}),
				new Proc(12, Activation.CritMag, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arme de l'Arrogance 2"); put(Language.EN, "Arrogant Weapon 2"); }}, new Calculable[] {
				new Proc(11, Activation.CritPhys, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
				}),
				new Proc(11, Activation.CritMag, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arme de l'Arrogance 1"); put(Language.EN, "Arrogant Weapon 1"); }}, new Calculable[] {
				new Proc(10, Activation.CritPhys, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys, Target.OPPONENT),
				}),
				new Proc(10, Activation.CritMag, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cauchemar du Jour du Destin 5"); put(Language.EN, "Day of Destiny Nightmare 5"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, -5),
				new Effect(TypeEffect.Loot, false, -5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cauchemar du Jour du Destin 4"); put(Language.EN, "Day of Destiny Nightmare 4"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, -4),
				new Effect(TypeEffect.Loot, false, -4),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cauchemar du Jour du Destin 3"); put(Language.EN, "Day of Destiny Nightmare 3"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, -4),
				new Effect(TypeEffect.Loot, false, -4),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cauchemar du Jour du Destin 2"); put(Language.EN, "Day of Destiny Nightmare 2"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, -3),
				new Effect(TypeEffect.Loot, false, -3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cauchemar du Jour du Destin 1"); put(Language.EN, "Day of Destiny Nightmare 1"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, -3),
				new Effect(TypeEffect.Loot, false, -3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Chance de Gobelin 5"); put(Language.EN, "Goblin's Luck 5"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
				new Effect(TypeEffect.Cueillete, false, 3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Chance de Gobelin 4"); put(Language.EN, "Goblin's Luck 4"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
				new Effect(TypeEffect.Cueillete, false, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Chance de Gobelin 3"); put(Language.EN, "Goblin's Luck 3"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.Cueillete, false, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Chance de Gobelin 2"); put(Language.EN, "Goblin's Luck 2"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.Cueillete, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Chance de Gobelin 1"); put(Language.EN, "Goblin's Luck 1"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 1),
				new Effect(TypeEffect.Cueillete, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de Quill 5"); put(Language.EN, "Quill's Punishment 5"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, -140),
				new Effect(TypeEffect.PM, false, -140),
				new Effect(TypeEffect.Poisse, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de Quill 4"); put(Language.EN, "Quill's Punishment 4"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, -130),
				new Effect(TypeEffect.PM, false, -130),
				new Effect(TypeEffect.Poisse, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de Quill 3"); put(Language.EN, "Quill's Punishment 3"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, -120),
				new Effect(TypeEffect.PM, false, -120),
				new Effect(TypeEffect.Poisse, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de Quill 2"); put(Language.EN, "Quill's Punishment 2"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, -110),
				new Effect(TypeEffect.PM, false, -110),
				new Effect(TypeEffect.Poisse, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment de Quill 1"); put(Language.EN, "Quill's Punishment 1"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, -100),
				new Effect(TypeEffect.PM, false, -100),
				new Effect(TypeEffect.Poisse, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Ermite Sprite 5"); put(Language.EN, "Sprite Hermit 5"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Proc(50, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.XP, false, 9, Target.SPRITE),
				}),
				new Proc(10, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.Material, false, 1, Target.SPRITE),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Ermite Sprite 4"); put(Language.EN, "Sprite Hermit 4"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 4),
				new Proc(50, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.XP, false, 8, Target.SPRITE),
				}),
				new Proc(10, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.Material, false, 1, Target.SPRITE),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Ermite Sprite 3"); put(Language.EN, "Sprite Hermit 3"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 4),
				new Proc(50, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.XP, false, 7, Target.SPRITE),
				}),
				new Proc(10, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.Material, false, 1, Target.SPRITE),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Ermite Sprite 2"); put(Language.EN, "Sprite Hermit 2"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
				new Proc(50, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.XP, false, 6, Target.SPRITE),
				}),
				new Proc(10, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.Material, false, 1, Target.SPRITE),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Ermite Sprite 1"); put(Language.EN, "Sprite Hermit 1"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
				new Proc(50, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.XP, false, 5, Target.SPRITE),
				}),
				new Proc(10, Activation.Meditation, new Calculable[] {
					new Effect(TypeEffect.Material, false, 1, Target.SPRITE),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Jeune beauté de lumière 5"); put(Language.EN, "Ethereal Beauty 5"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.XP, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Jeune beauté de lumière 4"); put(Language.EN, "Ethereal Beauty 4"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.XP, false, 5),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Jeune beauté de lumière 3"); put(Language.EN, "Ethereal Beauty 3"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.XP, false, 4),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Jeune beauté de lumière 2"); put(Language.EN, "Ethereal Beauty 2"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.XP, false, 4),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Jeune beauté de lumière 1"); put(Language.EN, "Ethereal Beauty 1"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.XP, false, 3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Journée Ordinaire 5"); put(Language.EN, "Ordinary Day 5"); }}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 1, 120, TypeRegen.REGENERATION, 1),
				new RegenEffect(TypeEffect.PM, false, 1, 60, TypeRegen.REGENERATION, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Journée Ordinaire 4"); put(Language.EN, "Ordinary Day 4"); }}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 1, 120, TypeRegen.REGENERATION, 1),
				new RegenEffect(TypeEffect.PM, false, 1, 56, TypeRegen.REGENERATION, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Journée Ordinaire 3"); put(Language.EN, "Ordinary Day 3"); }}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 1, 110, TypeRegen.REGENERATION, 1),
				new RegenEffect(TypeEffect.PM, false, 1, 56, TypeRegen.REGENERATION, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Journée Ordinaire 2"); put(Language.EN, "Ordinary Day 2"); }}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 1, 110, TypeRegen.REGENERATION, 1),
				new RegenEffect(TypeEffect.PM, false, 1, 50, TypeRegen.REGENERATION, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Journée Ordinaire 1"); put(Language.EN, "Ordinary Day 1"); }}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 1, 100, TypeRegen.REGENERATION, 1),
				new RegenEffect(TypeEffect.PM, false, 1, 50, TypeRegen.REGENERATION, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Monstre de Foire 5"); put(Language.EN, "Weird Attraction 5"); }}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 3),
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.Atk, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.AtkD, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.AtkM, true, -3, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Monstre de Foire 4"); put(Language.EN, "Weird Attraction 4"); }}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 2),
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -3, Target.OPPONENT),
					new Effect(TypeEffect.Atk, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkD, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkM, true, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Monstre de Foire 3"); put(Language.EN, "Weird Attraction 3"); }}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 2),
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.Atk, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkD, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkM, true, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Monstre de Foire 2"); put(Language.EN, "Weird Attraction 2"); }}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.Atk, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkD, true, -2, Target.OPPONENT),
					new Effect(TypeEffect.AtkM, true, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Monstre de Foire"); put(Language.EN, "Weird Attraction 1"); }}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -1, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -1, Target.OPPONENT),
					new Effect(TypeEffect.Atk, true, -1, Target.OPPONENT),
					new Effect(TypeEffect.AtkD, true, -1, Target.OPPONENT),
					new Effect(TypeEffect.AtkM, true, -1, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Murmures du Roi des Sprites 5"); put(Language.EN, "Sprite King's Whispers 5"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 160),
				new Effect(TypeEffect.PM, false, 160),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Murmures du Roi des Sprites 4"); put(Language.EN, "Spring King's Whispers 4"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 160),
				new Effect(TypeEffect.PM, false, 160),
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Murmures du Roi des Sprites 3"); put(Language.EN, "Sprite King's Whispers 3"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 130),
				new Effect(TypeEffect.PM, false, 130),
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Murmures du Roi des Sprites 2"); put(Language.EN, "Sprite King's Whispers 2"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 130),
				new Effect(TypeEffect.PM, false, 130),
				new Effect(TypeEffect.Depla, false, 1),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Murmures du Roi des Sprites 1"); put(Language.EN, "Sprite King's Whispers 1"); }}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 100),
				new Effect(TypeEffect.PM, false, 100),
				new Effect(TypeEffect.Depla, false, 1),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Nouvelle Star de Saphaël 5"); put(Language.EN, "Saphael's New Star 5"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Nouvelle Star de Saphaël 4"); put(Language.EN, "Saphael's New Star 4"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Nouvelle Star de Saphaël 3"); put(Language.EN, "Saphael's New Star 3"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Nouvelle Star de Saphaël 2"); put(Language.EN, "Saphael's New Star 2"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Nouvelle Star de Saphaël 1"); put(Language.EN, "Saphael's New Star 1"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Photosynthèse 5"); put(Language.EN, "Photosynthesis 5"); }}, new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 1, 50, TypeRegen.ABSORPTION),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Photosynthèse 4"); put(Language.EN, "Photosynthesis 4"); }}, new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 1, 45, TypeRegen.ABSORPTION),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Photosynthèse 3"); put(Language.EN, "Photosynthesis 3"); }}, new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 1, 40, TypeRegen.ABSORPTION),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Photosynthèse 2"); put(Language.EN, "Photosynthesis 2"); }}, new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 1, 35, TypeRegen.ABSORPTION),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Photosynthèse 1"); put(Language.EN, "Photosynthesis 1"); }}, new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 1, 30, TypeRegen.ABSORPTION),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Prix Stimulant 5"); put(Language.EN, "Price of Excitement 5"); }}, new Calculable[] {
				new Proc(2, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 58),
					new RegenEffect(TypeEffect.PV, false, -1, -50, TypeRegen.REGENERATION, 2),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Prix Stimulant 4"); put(Language.EN, "Price of Excitement 4"); }}, new Calculable[] {
				new Proc(2, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 56),
					new RegenEffect(TypeEffect.PV, false, -1, -50, TypeRegen.REGENERATION, 2),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Prix Stimulant 3"); put(Language.EN, "Price of Excitement 3"); }}, new Calculable[] {
				new Proc(2, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 54),
					new RegenEffect(TypeEffect.PV, false, -1, -50, TypeRegen.REGENERATION, 2),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Prix Stimulant 2"); put(Language.EN, "Price of Excitement 2"); }}, new Calculable[] {
				new Proc(2, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 52),
					new RegenEffect(TypeEffect.PV, false, -1, -50, TypeRegen.REGENERATION, 2),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Prix Stimulant 1"); put(Language.EN, "Price of Excitement 1"); }}, new Calculable[] {
				new Proc(2, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 50),
					new RegenEffect(TypeEffect.PV, false, -1, -50, TypeRegen.REGENERATION, 2),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection de Yoda 5"); put(Language.EN, "Phoebios' Protection 5"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 210),
				new Effect(TypeEffect.DefM, false, 210),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection de Yoda 4"); put(Language.EN, "Phoebios' Protection 4"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 190),
				new Effect(TypeEffect.DefM, false, 190),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection de Yoda 3"); put(Language.EN, "Phoebios' Protection 3"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 160),
				new Effect(TypeEffect.DefM, false, 160),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection de Yoda 2"); put(Language.EN, "Phoebios' Protection 2"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 130),
				new Effect(TypeEffect.DefM, false, 130),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection de Yoda 1"); put(Language.EN, "Phoebios' Protection 1"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 100),
				new Effect(TypeEffect.DefM, false, 100),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -2, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rhume des Foins Insulaire 5"); put(Language.EN, "Island Heat Fever 5"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, -18),
				new Effect(TypeEffect.DefM, false, -18),
				new StaticEffect(TypeStaticEffect.Push, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rhume des Foins Insulaire 4"); put(Language.EN, "Island Heat Fever 4"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, -16),
				new Effect(TypeEffect.DefM, false, -16),
				new StaticEffect(TypeStaticEffect.Push, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rhume des Foins Insulaire 3"); put(Language.EN, "Island Heat Fever 3"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, -14),
				new Effect(TypeEffect.DefM, false, -14),
				new StaticEffect(TypeStaticEffect.Push, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rhume des Foins Insulaire 2"); put(Language.EN, "Island Heat Fever 2"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, -12),
				new Effect(TypeEffect.DefM, false, -12),
				new StaticEffect(TypeStaticEffect.Push, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rhume des Foins Insulaire 1"); put(Language.EN, "Island Heat Fever 1"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, -10),
				new Effect(TypeEffect.DefM, false, -10),
				new StaticEffect(TypeStaticEffect.Push, 1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sort des Îles 5"); put(Language.EN, "Island Hex 5"); }}, new Calculable[] {
				new Condition(TypeCondition.RAYON, 2, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -3, Target.ALLY),
					new Effect(TypeEffect.DefM, true, -3, Target.ALLY),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sort des Îles 4"); put(Language.EN, "Island Hex 4"); }}, new Calculable[] {
				new Condition(TypeCondition.RAYON, 2, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -3, Target.ALLY),
					new Effect(TypeEffect.DefM, true, -2, Target.ALLY),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sort des Îles 3"); put(Language.EN, "Island Hex 3"); }}, new Calculable[] {
				new Condition(TypeCondition.RAYON, 2, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -2, Target.ALLY),
					new Effect(TypeEffect.DefM, true, -2, Target.ALLY),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sort des Îles 2"); put(Language.EN, "Island Hex 2"); }}, new Calculable[] {
				new Condition(TypeCondition.RAYON, 2, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -2, Target.ALLY),
					new Effect(TypeEffect.DefM, true, -1, Target.ALLY),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sort des Îles 1"); put(Language.EN, "Island Hex 1"); }}, new Calculable[] {
				new Condition(TypeCondition.RAYON, 2, new Calculable[] {
					new Effect(TypeEffect.DefP, true, -1, Target.ALLY),
					new Effect(TypeEffect.DefM, true, -1, Target.ALLY),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Percepteur 5"); put(Language.EN, "Debt Collector Sprite 5"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
				new Effect(TypeEffect.Loot, false, -3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Percepteur 4"); put(Language.EN, "Debt Collector Sprite 4"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.Loot, false, -3),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Percepteur 3"); put(Language.EN, "Debt Collector Sprite 3"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.Loot, false, -2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Percepteur 2"); put(Language.EN, "Debt Collector Sprite 2"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 1),
				new Effect(TypeEffect.Loot, false, -2),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Percepteur 1"); put(Language.EN, "Debt Collector Sprite 1"); }}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 1),
				new Effect(TypeEffect.Loot, false, -1),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Volonté de Phoebios 5"); put(Language.EN, "Phoebios's Will 5"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 250),
				new Effect(TypeEffect.DefM, false, 270),
				new Proc(4, Activation.Attack, 10, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform31),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new Effect(TypeEffect.DegStdP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -5, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Très puissant mystère des aborigènes 4"); put(Language.EN, "Most powerful mystery of the aboriginals 4"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 240),
				new Effect(TypeEffect.DefM, false, 260),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform31),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new Effect(TypeEffect.DegStdP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -5, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Volonté de Phoebios 3"); put(Language.EN, "Phoebios's Will 3"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 230),
				new Effect(TypeEffect.DefM, false, 250),
				new Proc(3, Activation.Attack, 10, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform31),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new Effect(TypeEffect.DegStdP, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -4, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Très puissant mystère des aborigènes 2"); put(Language.EN, "Most powerful mystery of the aboriginals 2"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 220),
				new Effect(TypeEffect.DefM, false, 240),
				new Proc(2, Activation.Attack, 10, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform31),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new Effect(TypeEffect.DegStdP, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -4, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -4, Target.OPPONENT),
				}),
			}),
			new IslandBuff(new HashMap<Language, String>() {{ put(Language.FR, "Très puissant mystère des aborigènes 1"); put(Language.EN, "Most powerful mystery of the aboriginals 1"); }}, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 210),
				new Effect(TypeEffect.DefM, false, 230),
				new Proc(2, Activation.Attack, 10, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform31),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new Effect(TypeEffect.DegStdP, false, -3, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -3, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -3, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -3, Target.OPPONENT),
				}),
			}),
		};
	}
	
	public static GuildBuff[] getGuildBuff() {
		return new GuildBuff[] {
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Épreuve du roi des Sprites"); put(Language.EN, ""); }}, "xp0", new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Bénédiction interdimensionnelle d'Eugénie"); put(Language.EN, ""); }}, "xp1", new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.Loot, false, 20),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Bénédiction Secrète d'Alice"); put(Language.EN, "Alice's Secret Blessing"); }}, "0-0", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 7),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Barrière Naturelle d'Alice"); put(Language.EN, "Alice's Natural Barrier"); }}, "0-1", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Aria de défense d'Alice"); put(Language.EN, "Alice's Aria of Defense"); }}, "0-2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Tempête de Sable de Ronto"); put(Language.EN, "Ronto's Sandstorm Dashing"); }}, "1-0", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Poussière Terrestre de Ronto"); put(Language.EN, "Ronto's Earth Dust"); }}, "1-1", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 25),
				new Effect(TypeEffect.Nature, false, 25),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 500),
				}),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 500),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Bénédiction colérique de Ronto"); put(Language.EN, "Ronto's Wrathful Blessing"); }}, "1-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 7),
				new Effect(TypeEffect.TCCM, false, 7),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Corne de Bataille de Bodor"); put(Language.EN, "Bodor's Battle Horn"); }}, "2-0", new Calculable[] {
				new Effect(TypeEffect.PV, true, 8),
				new Effect(TypeEffect.PM, true, 8),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Armure Sacrée de Bodor"); put(Language.EN, "Bodor's Temple Armor"); }}, "2-1", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 25),
				new Effect(TypeEffect.Nature, false, 25),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 500),
				}),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 500),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Cri de bataille de Bodor"); put(Language.EN, "Bodor's Cry of Battle"); }}, "2-2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 7),
				new Effect(TypeEffect.AtkD, true, 7),
				new Effect(TypeEffect.AtkM, true, 7),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Force Sismique de Smulca"); put(Language.EN, "Smulca, Highland Lord"); }}, "3-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.ReflectP_old, false, 100),
					new Effect(TypeEffect.ReflectM_old, false, 100),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Forme de Bœuf de Smulca"); put(Language.EN, "Smulca, Highland Lord"); }}, "3-1", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitComp, false, 4),
				new Effect(TypeEffect.CostComp, false, -10),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection Montagneuse de Smulca"); put(Language.EN, "Smulca, Highland Lord"); }}, "3-2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Exécution sans pitié d'Ewan"); put(Language.EN, "Ewan, General of Spirits"); }}, "4-0", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Forme Morbide d'Ewan"); put(Language.EN, "Ewan, General of Spirits"); }}, "4-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 8),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Regard Noir d'Ewan"); put(Language.EN, "Ewan, General of Spirits"); }}, "4-2", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection Aquatique de Bahadolo"); put(Language.EN, ""); }}, "5-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Retour de Tsunami de Bahadolo"); put(Language.EN, ""); }}, "5-1", new Calculable[] {
				new Proc(15, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.ReflectP_old, false, 70),
					new Effect(TypeEffect.ReflectM_old, false, 70),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Tempête Enragée de Bahadolo"); put(Language.EN, ""); }}, "5-2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 25),
				new Effect(TypeEffect.Glace, false, 25),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Leggings Venteux de Quill"); put(Language.EN, "Quill, Hurricane Prince"); }}, "6-0", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 12),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Rugissement Tempétueux de Quill"); put(Language.EN, "Quill, Hurricane Prince"); }}, "6-1", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.DCCM, false, 10),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Tornade Orageuse de Quill"); put(Language.EN, "Quill, Hurricane Prince"); }}, "6-2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Magie Chanceuse de Mosunk"); put(Language.EN, "Mosunk, Elder of Serenity"); }}, "7-0", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Armure Magique de Mosunk"); put(Language.EN, "Mosunk, Elder of Serenity"); }}, "7-1", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 5),
				new Effect(TypeEffect.DegStdD, false, 5),
				new Effect(TypeEffect.DegSkillP, false, 5),
				new Effect(TypeEffect.DegSkillM, false, 5),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Lumière Bénie de Mosunk"); put(Language.EN, "Mosunk, Elder of Serenity"); }}, "7-2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Boost de Vie de Jundo"); put(Language.EN, "Jundo, Eternal Mother"); }}, "8-0", new Calculable[] {
				new Effect(TypeEffect.PV, true, 12),
				new Effect(TypeEffect.PM, true, 12),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Pouvoir Primal de Jundo"); put(Language.EN, "Jundo, Eternal Mother"); }}, "8-1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Immunité Naturelle de Jundo"); put(Language.EN, "Jundo, Eternal Mother"); }}, "8-2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 20),
				new Effect(TypeEffect.Ombre, false, 20),
				new Effect(TypeEffect.Foudre, false, 20),
				new Effect(TypeEffect.Feu, false, 20),
				new Effect(TypeEffect.Glace, false, 20),
				new Effect(TypeEffect.Nature, false, 20),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Vision Ardente de Siropas"); put(Language.EN, "Siropas, Underworld King"); }}, "9-0", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, true, 12),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Protection Enflammée de Siropas"); put(Language.EN, "Siropas, Underworld King"); }}, "9-1", new Calculable[] {
				new Proc(15, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 15),
					new Effect(TypeEffect.RTCCM, false, 15),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Armure Brûlante de Siropas"); put(Language.EN, "Siropas, Underworld King"); }}, "9-2", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Encouragement d'Ilannia"); put(Language.EN, "Ilannia's Encouragement"); }}, "10-0", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 6),
				new Effect(TypeEffect.VitAtkD, false, 6),
				new Effect(TypeEffect.VitAtkM, false, 6),
				new Effect(TypeEffect.VitComp, false, 6),
				new Effect(TypeEffect.CostComp, false, -10),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier Gelé d'Ilannia"); put(Language.EN, "Ilannia's Frost Shield"); }}, "10-1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Armure Glacée d'Ilannia"); put(Language.EN, "Ilannia's Frozen Armor"); }}, "10-2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 50),
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 1000),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Pouvoir Interdimensionnel d'Eugénie"); put(Language.EN, "Ginny's Cross-Dimensional Power"); }}, "11-0", new Calculable[] {
				new Proc(10, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 500),
					new Effect(TypeEffect.DegOmbre, false, 500),
					new Effect(TypeEffect.DegFoudre, false, 500),
					new Effect(TypeEffect.DegFeu, false, 500),
					new Effect(TypeEffect.DegGlace, false, 500),
					new Effect(TypeEffect.DegNature, false, 500),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Frappe Interdimensionnelle d'Eugénie"); put(Language.EN, "Ginny's Cross-Dimensional Strike"); }}, "11-1", new Calculable[] {
				new Condition(TypeEffect.PV, 50, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 5),
					new Effect(TypeEffect.TCCM, false, 5),
					new Effect(TypeEffect.DefP, true, 10),
					new Effect(TypeEffect.DefM, true, 10),
				}),
				new Condition(TypeEffect.PV, 15, new Calculable[] {
					new Proc(100, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 100),
						new Effect(TypeEffect.TCCM, false, 100),
						new Effect(TypeEffect.DefP, true, 20),
						new Effect(TypeEffect.DefM, true, 20),
					}),
				}),
			}),
			new GuildBuff(new HashMap<Language, String>() {{ put(Language.FR, "Arrivée Interdimensionnelle d'Eugénie"); put(Language.EN, "Ginny's Cross-Dimensional Arrival"); }}, "11-2", new Calculable[] {
				new Proc(3, Activation.Attack, new Calculable[] {
					new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc1),
					new Effect(TypeEffect.Atk, true, 4),
					new Effect(TypeEffect.AtkD, true, 4),
					new Effect(TypeEffect.AtkM, true, 4),
					new Effect(TypeEffect.VitAtk, false, 4),
					new Effect(TypeEffect.TCCP, false, 4),
					new Effect(TypeEffect.TCCM, false, 4),
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
					new Effect(TypeEffect.ESQ, false, 5),
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			}),
		};
	}
	
	public static LoveBuff[] getLoveBuff() {
		return new LoveBuff[] {
			new LoveBuff(new HashMap<Language, String>() {{ put(Language.FR, "Inactif"); put(Language.EN, "Inactive"); }}, "32-0", null),
			new LoveBuff(new HashMap<Language, String>() {{ put(Language.FR, "Conflit Conjugal"); put(Language.EN, "Crisis of Ennui"); }}, "love0", new Calculable[] {
				new Effect(TypeEffect.PV, false, 9),
				new Effect(TypeEffect.PM, false, 9),
			}),
			new LoveBuff(new HashMap<Language, String>() {{ put(Language.FR, "Feux Éteint"); put(Language.EN, ""); }}, "love1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new LoveBuff(new HashMap<Language, String>() {{ put(Language.FR, "Douce Compagnie"); put(Language.EN, "Sweet Companionship"); }}, "love2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new LoveBuff(new HashMap<Language, String>() {{ put(Language.FR, "Étreinte sauvage"); put(Language.EN, ""); }}, "love3", new Calculable[] {
				new Effect(TypeEffect.PV, true, 9),
				new Effect(TypeEffect.PM, true, 9),
				new Effect(TypeEffect.Atk, true, 9),
				new Effect(TypeEffect.AtkM, true, 9),
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
		};
	}
}
