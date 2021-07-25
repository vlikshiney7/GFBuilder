package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.characUpgrade.ProSkill;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderProSkill {
	
	static ProSkill[] getClass0() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Possession du Dieu de feu 1"); put(Language.EN, "Fire God Possession 1"); }}, 66, "0-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFeu, false, 200),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Possession du Dieu de feu 2"); put(Language.EN, "Fire God Possession 2"); }}, 86, "0-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFeu, false, 400),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Possession du Dieu de feu 3"); put(Language.EN, "Fire God Possession 3"); }}, 91, "0-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFeu, false, 600),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Force exorcisante 1"); put(Language.EN, "Exorcising Force 1"); }}, 66, "0-1", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1.5, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 5, 10, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Force exorcisante 2"); put(Language.EN, "Exorcising Force 2"); }}, 86, "0-1", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 10, 20, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Force exorcisante 3"); put(Language.EN, "Exorcising Force 3"); }}, 91, "0-1", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 5, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 15, 30, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Perce-armure 1"); put(Language.EN, ""); }}, 86, "0-2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Perce-armure 2"); put(Language.EN, ""); }}, 91, "0-2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 20, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Contre-attaque prompte"); put(Language.EN, ""); }}, 91, "0-3", new Calculable[] {
				new Proc(10, Activation.Attacked, 10, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 100),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass1() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Lumière sacrée 1"); put(Language.EN, "Divine Light 1"); }}, 66, "1-0", new Calculable[] {
				new Proc(20, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 600),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Lumière sacrée 2"); put(Language.EN, "Divine Light 2"); }}, 86, "1-0", new Calculable[] {
				new Proc(20, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 700),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Lumière sacrée 3"); put(Language.EN, "Divine Light 3"); }}, 91, "1-0", new Calculable[] {
				new Proc(20, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 15),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegSacre, false, 1000),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment sacré 1"); put(Language.EN, "Sacred Punishment 1"); }}, 66, "1-1", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 10),
				new Effect(TypeEffect.DegStdD, false, 10),
				new Effect(TypeEffect.DegSkillP, false, 10),
				new Effect(TypeEffect.DegSkillM, false, 10),
				new Effect(TypeEffect.MEN, false, 10),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment sacré 2"); put(Language.EN, "Sacred Punishment 2"); }}, 86, "1-1", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 20),
				new Effect(TypeEffect.DegStdD, false, 20),
				new Effect(TypeEffect.DegSkillP, false, 20),
				new Effect(TypeEffect.DegSkillM, false, 20),
				new Effect(TypeEffect.MEN, false, 20),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment sacré 3"); put(Language.EN, "Sacred Punishment 3"); }}, 91, "1-1", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 30),
				new Effect(TypeEffect.DegStdD, false, 30),
				new Effect(TypeEffect.DegSkillP, false, 30),
				new Effect(TypeEffect.DegSkillM, false, 30),
				new Effect(TypeEffect.MEN, false, 35),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Pavois du Roi 1"); put(Language.EN, "King's Bulwark 1"); }}, 86, "1-2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 7),
				new Effect(TypeEffect.RParade, false, 7),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Pavois du Roi 2"); put(Language.EN, "King's Bulwark 2"); }}, 91, "1-2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 15),
				new Effect(TypeEffect.DefM, true, 15),
				new Effect(TypeEffect.RParade, false, 15),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Château blindé"); put(Language.EN, ""); }}, 91, "1-3", new Calculable[] {
				new Proc(10, Activation.Attacked, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProSkillC1),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass2() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Assaut foudroyant 1"); put(Language.EN, "Lightning Assault 1"); }}, 66, "2-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 3),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFoudre, false, 200),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Assaut foudroyant 2"); put(Language.EN, "Lightning Assault 2"); }}, 86, "2-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 6),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFoudre, false, 400),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Assaut foudroyant 3"); put(Language.EN, "Lightning Assault 3"); }}, 91, "2-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 10),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegFoudre, false, 600),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tir sournois 1"); put(Language.EN, "Cunning Shot 1"); }}, 66, "2-1", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 3, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 5, 10, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tir sournois 2"); put(Language.EN, "Cunning Shot 2"); }}, 86, "2-1", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 3, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 10, 20, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tir sournois 3"); put(Language.EN, "Cunning Shot 3"); }}, 91, "2-1", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10, Target.OPPONENT),
				new RegenEffect(TypeEffect.PM, false, 15, 30, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sprint de victoire 1"); put(Language.EN, "Victory Rush 1"); }}, 86, "2-2", new Calculable[] {
				new Proc(40, Activation.Crit, 5, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 5),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sprint de victoire 2"); put(Language.EN, "Victory Rush 2"); }}, 91, "2-2", new Calculable[] {
				new Proc(40, Activation.Crit, 5, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Contre-attaque soudaine"); put(Language.EN, ""); }}, 91, "2-3", new Calculable[] {
				new Proc(15, Activation.Attack, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Push, Target.OPPONENT),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass3() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Forme spectrale 1"); put(Language.EN, "Shadow Form 1"); }}, 66, "3-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 10),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 250),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Forme spectrale 2"); put(Language.EN, "Shadow Form 2"); }}, 86, "3-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 500),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Forme spectrale 3"); put(Language.EN, "Shadow Form 3"); }}, 91, "3-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Proc(100, Activation.Standard, new Calculable[] {
						new Effect(TypeEffect.DegOmbre, false, 700),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Soif de sang 1"); put(Language.EN, "Bloodlust 1"); }}, 66, "3-1", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 1.5),
				new Effect(TypeEffect.MEN, false, -10),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Soif de sang 2"); put(Language.EN, "Bloodlust 2"); }}, 86, "3-1", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 3),
				new Effect(TypeEffect.MEN, false, -20),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Soif de sang 3"); put(Language.EN, "Bloodlust 3"); }}, 91, "3-1", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 5),
				new Effect(TypeEffect.MEN, false, -30),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sournoiserie maléfique 1"); put(Language.EN, "Devil's Cunning 1"); }}, 86, "3-2", new Calculable[] {
				new Proc(5, Activation.Attack, 1.5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sournoiserie maléfique 2"); put(Language.EN, "Devil's Cunning 2"); }}, 91, "3-2", new Calculable[] {
				new Proc(15, Activation.Attack, 1.5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tromperie"); put(Language.EN, ""); }}, 91, "3-3", new Calculable[] {
				new Proc(30, Activation.Crit, 5, 5, new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, -2, Target.OPPONENT),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass4() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Oracle sacré 1"); put(Language.EN, "Sacred Oracle 1"); }}, 66, "4-0", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new RegenEffect(TypeEffect.PM, false, 15, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Oracle sacré 2"); put(Language.EN, "Sacred Oracle 2"); }}, 86, "4-0", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new RegenEffect(TypeEffect.PM, false, 25, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Oracle sacré 3"); put(Language.EN, "Sacred Oracle 3"); }}, 91, "4-0", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 15),
				new RegenEffect(TypeEffect.PM, false, 40, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Combo de lumière 1"); put(Language.EN, "Light Combo 1"); }}, 66, "4-1", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 10),
				new StaticEffect(TypeStaticEffect.x3Skill_old, 2),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Combo de lumière 2"); put(Language.EN, "Light Combo 2"); }}, 86, "4-1", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 15),
				new StaticEffect(TypeStaticEffect.x3Skill_old, 5),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Combo de lumière 3"); put(Language.EN, "Light Combo 3"); }}, 91, "4-1", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 20),
				new StaticEffect(TypeStaticEffect.x3Skill_old, 8),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Amnistie divine 1"); put(Language.EN, "Divine Amnesty 1"); }}, 86, "4-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new Proc(25, Activation.Attack, 1.5, new Calculable[] {
					new Effect(TypeEffect.MEN, false, -200),
					new RegenEffect(TypeEffect.PV, false, 500, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.REGENERATION),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Amnistie divine 2"); put(Language.EN, "Divine Amnesty 2"); }}, 91, "4-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(25, Activation.Attack, 1.5, new Calculable[] {
					new Effect(TypeEffect.MEN, false, -500),
					new RegenEffect(TypeEffect.PV, false, 1000, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, false, 1000, TypeRegen.REGENERATION),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Verdict final"); put(Language.EN, ""); }}, 91, "4-3", new Calculable[] {
				new Proc(5, Activation.Attacked, 2.5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -75, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass5() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Nature sacrée 1"); put(Language.EN, "Sacred Nature 1"); }}, 66, "5-0", new Calculable[] {
				new Proc(15, Activation.Attack, 9, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
					new Effect(TypeEffect.DegNature, false, 100),
					new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Nature sacrée 2"); put(Language.EN, "Sacred Nature 2"); }}, 86, "5-0", new Calculable[] {
				new Proc(15, Activation.Attack, 9, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
					new Effect(TypeEffect.DegNature, false, 300),
					new RegenEffect(TypeEffect.PM, false, 150, TypeRegen.REGENERATION, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Nature sacrée 3"); put(Language.EN, "Sacred Nature 3"); }}, 91, "5-0", new Calculable[] {
				new Proc(15, Activation.Attack, 9, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 500),
					new Effect(TypeEffect.DegNature, false, 500),
					new RegenEffect(TypeEffect.PM, false, 200, TypeRegen.REGENERATION, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sarcasmes 1"); put(Language.EN, "Taunting Stance 1"); }}, 66, "5-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Proc(10, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.MEN, false, 100),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sarcasmes 2"); put(Language.EN, "Taunting Stance 2"); }}, 86, "5-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 30),
				new Proc(10, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
					new Effect(TypeEffect.ReducSkillM, false, 10),
					new Effect(TypeEffect.MEN, false, 300),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Sarcasmes 3"); put(Language.EN, "Taunting Stance 3"); }}, 91, "5-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 40),
				new Proc(10, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 15),
					new Effect(TypeEffect.ReducStdD, false, 15),
					new Effect(TypeEffect.ReducSkillP, false, 15),
					new Effect(TypeEffect.ReducSkillM, false, 15),
					new Effect(TypeEffect.MEN, false, 500),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cours du fleuve 1"); put(Language.EN, "Raging River 1"); }}, 86, "5-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new Proc(50, Activation.Crit, 2, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -5, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoItem, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cours du fleuve 2"); put(Language.EN, "Raging River 2"); }}, 91, "5-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(50, Activation.Crit, 2, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoItem, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Instinct primaire"); put(Language.EN, ""); }}, 91, "5-3", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 20),
					new StaticEffect(TypeStaticEffect.x2STD_old, 75),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass6() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Coeur de rime 1"); put(Language.EN, ""); }}, 66, "6-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 250),
					new Effect(TypeEffect.TCCM, false, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Coeur de rime 2"); put(Language.EN, ""); }}, 86, "6-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 500),
					new Effect(TypeEffect.TCCM, false, 6),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Coeur de rime 3"); put(Language.EN, ""); }}, 91, "6-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 750),
					new Effect(TypeEffect.TCCM, false, 10),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tissage de feu 1"); put(Language.EN, "Fireweave 1"); }}, 66, "6-1", new Calculable[] {
				new Proc(15, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new RegenEffect(TypeEffect.PM, false, 200, TypeRegen.REGENERATION),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tissage de feu 2"); put(Language.EN, "Fireweave 2"); }}, 86, "6-1", new Calculable[] {
				new Proc(15, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.REGENERATION),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Tissage de feu 3"); put(Language.EN, "Fireweave 3"); }}, 91, "6-1", new Calculable[] {
				new Proc(15, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 5),
					new RegenEffect(TypeEffect.PM, false, 800, TypeRegen.REGENERATION),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Conjuration de Foudre 1"); put(Language.EN, "Thunder Conjuration 1"); }}, 86, "6-2", new Calculable[] {
				new Proc(60, Activation.Crit, 6, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
					new Effect(TypeEffect.MEN, false, -15),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Conjuration de Foudre 2"); put(Language.EN, "Thunder Conjuration 2"); }}, 91, "6-2", new Calculable[] {
				new Proc(60, Activation.Crit, 6, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
					new Effect(TypeEffect.MEN, false, -30),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Anneau de Terre"); put(Language.EN, "Ring of Earth"); }}, 91, "6-3", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProSkillC6),
					new Proc(100, Activation.Attacked, 5, new Calculable[] {
						new Effect(TypeEffect.INT, true, 20),
					}),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass7() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Incantation des ombres 1"); put(Language.EN, "Shadow Incantation 1"); }}, 66, "7-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 250),
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Incantation des ombres 2"); put(Language.EN, "Shadow Incantation 2"); }}, 86, "7-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 500),
					new Effect(TypeEffect.VitComp, false, 6),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Incantation des ombres 3"); put(Language.EN, "Shadow Incantation 3"); }}, 91, "7-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 750),
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cœur de goule 1"); put(Language.EN, "Ghoul's Heart 1"); }}, 66, "7-1", new Calculable[] {
				new Proc(15, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, -3, Target.OPPONENT),
					new Effect(TypeEffect.TCCM, false, -3, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cœur de goule 2"); put(Language.EN, "Ghoul's Heart 2"); }}, 86, "7-1", new Calculable[] {
				new Proc(20, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, -6, Target.OPPONENT),
					new Effect(TypeEffect.TCCM, false, -6, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cœur de goule 3"); put(Language.EN, "Ghoul's Heart 3"); }}, 91, "7-1", new Calculable[] {
				new Proc(25, Activation.Attack, 3, new Calculable[] {
					new Effect(TypeEffect.TCCP, false, -10, Target.OPPONENT),
					new Effect(TypeEffect.TCCM, false, -10, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Marque mortelle 1"); put(Language.EN, "Death's Mark 1"); }}, 86, "7-2", new Calculable[] {
				new Proc(15, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, -10, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillM, false, -5, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Marque mortelle 2"); put(Language.EN, "Death's Mark 2"); }}, 91, "7-2", new Calculable[] {
				new Proc(15, Activation.Attack, 6, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, -25, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillM, false, -10, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Retour du revenant"); put(Language.EN, ""); }}, 91, "7-3", new Calculable[] {
				new Proc(20, Activation.Attack, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Dispel),
					new RegenEffect(TypeEffect.PV, false, 1000, TypeRegen.REGENERATION),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass8() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Surcharge 1"); put(Language.EN, "Overload 1"); }}, 66, "8-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 250),
					new Effect(TypeEffect.VitAtk, false, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Surcharge 2"); put(Language.EN, "Overload 2"); }}, 86, "8-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 500),
					new Effect(TypeEffect.VitAtk, false, 6),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Surcharge 3"); put(Language.EN, "Overload 3"); }}, 91, "8-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 750),
					new Effect(TypeEffect.VitAtk, false, 10),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Plasma pulsé 1"); put(Language.EN, "Pulsed Plasma 1"); }}, 66, "8-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.RegenCB, false, 1),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Plasma pulsé 2"); put(Language.EN, "Pulsed Plasma 2"); }}, 86, "8-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Effect(TypeEffect.RegenCB, false, 3),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Plasma pulsé 3"); put(Language.EN, "Pulsed Plasma 3"); }}, 91, "8-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 30),
				new Effect(TypeEffect.RegenCB, false, 5),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Équipement de secours 1"); put(Language.EN, "Backup Equipment 1"); }}, 86, "8-2", new Calculable[] {
				new Proc(10, Activation.Attacked, 10, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 150, TypeRegen.REGENERATION, 2),
					new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 2),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Équipement de secours 2"); put(Language.EN, "Backup Equipment 2"); }}, 91, "8-2", new Calculable[] {
				new Proc(10, Activation.Attacked, 10, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 300, TypeRegen.REGENERATION, 2),
					new RegenEffect(TypeEffect.PM, false, 250, TypeRegen.REGENERATION, 2),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier du cœur"); put(Language.EN, ""); }}, 91, "8-3", new Calculable[] {
				new Proc(20, Activation.Attack, 20, new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProSkillC8),
					new Proc(100, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
					}),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass9() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bain de sang 1"); put(Language.EN, "Rampage 1"); }}, 66, "9-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
					new Effect(TypeEffect.TCCP, false, 3),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bain de sang 2"); put(Language.EN, "Rampage 2"); }}, 86, "9-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 400),
					new Effect(TypeEffect.TCCP, false, 6),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bain de sang 3"); put(Language.EN, "Rampage 3"); }}, 91, "9-0", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 600),
					new Effect(TypeEffect.TCCP, false, 10),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Injection de feu 1"); put(Language.EN, "Flame Injection 1"); }}, 66, "9-1", new Calculable[] {
				new Proc(60, Activation.Crit, 6, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, -2, Target.OPPONENT),
					new Effect(TypeEffect.ReducStdD, false, -2, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillP, false, -2, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillM, false, -2, Target.OPPONENT),
					new Effect(TypeEffect.VitAtkD, false, -5, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Injection de feu 2"); put(Language.EN, "Flame Injection 2"); }}, 86, "9-1", new Calculable[] {
				new Proc(60, Activation.Crit, 6, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.ReducStdD, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillP, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillM, false, -5, Target.OPPONENT),
					new Effect(TypeEffect.VitAtkD, false, -10, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Injection de feu 3"); put(Language.EN, "Flame Injection 3"); }}, 91, "9-1", new Calculable[] {
				new Proc(60, Activation.Crit, 6, new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, -8, Target.OPPONENT),
					new Effect(TypeEffect.ReducStdD, false, -8, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillP, false, -8, Target.OPPONENT),
					new Effect(TypeEffect.ReducSkillM, false, -8, Target.OPPONENT),
					new Effect(TypeEffect.VitAtkD, false, -15, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bombe de sang 1"); put(Language.EN, "Bloodlust Bombardment 1"); }}, 86, "9-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new RegenEffect(TypeEffect.PV, false, 20, TypeRegen.ABSORPTION),
				new RegenEffect(TypeEffect.PM, false, 20, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bombe de sang 2"); put(Language.EN, "Bloodlust Bombardment 2"); }}, 91, "9-2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -25),
				new RegenEffect(TypeEffect.PV, false, 50, TypeRegen.ABSORPTION),
				new RegenEffect(TypeEffect.PM, false, 50, TypeRegen.ABSORPTION),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier magnétique"); put(Language.EN, ""); }}, 91, "9-3", new Calculable[] {
				new Proc(15, Activation.Attacked, 3, new Calculable[] {
					new Effect(TypeEffect.DegStdP, false, -10, Target.OPPONENT),
					new Effect(TypeEffect.DegStdD, false, -10, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillP, false, -10, Target.OPPONENT),
					new Effect(TypeEffect.DegSkillM, false, -10, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass10() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Attaque aérienne 1"); put(Language.EN, "Air Strike 1"); }}, 66, "10-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 3),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Attaque aérienne 2"); put(Language.EN, "Air Strike 2"); }}, 86, "10-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 6),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -400, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Attaque aérienne 3"); put(Language.EN, "Air Strike 3"); }}, 91, "10-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 10),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -600, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Protection aérienne 1"); put(Language.EN, "Air Barrier 1"); }}, 66, "10-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.ReducSkillM, false, 3),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Protection aérienne 2"); put(Language.EN, "Air Barrier 2"); }}, 86, "10-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Effect(TypeEffect.ReducStdP, false, 6),
				new Effect(TypeEffect.ReducStdD, false, 6),
				new Effect(TypeEffect.ReducSkillP, false, 6),
				new Effect(TypeEffect.ReducSkillM, false, 6),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Protection aérienne 3"); put(Language.EN, "Air Barrier 3"); }}, 91, "10-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 30),
				new Effect(TypeEffect.ReducStdP, false, 10),
				new Effect(TypeEffect.ReducStdD, false, 10),
				new Effect(TypeEffect.ReducSkillP, false, 10),
				new Effect(TypeEffect.ReducSkillM, false, 10),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de condensation 1"); put(Language.EN, "Dew Shield 1"); }}, 86, "10-2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProSkillC10L1),
					new Proc(100, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 10),
						new Effect(TypeEffect.DegStdD, false, 10),
						new Effect(TypeEffect.DegSkillP, false, 10),
						new Effect(TypeEffect.DegSkillM, false, 10),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Bouclier de condensation 2"); put(Language.EN, "Dew Shield 2"); }}, 91, "10-2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.ProSkillC10L2),
					new Proc(100, Activation.Attacked, 10, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 20),
						new Effect(TypeEffect.DegStdD, false, 20),
						new Effect(TypeEffect.DegSkillP, false, 20),
						new Effect(TypeEffect.DegSkillM, false, 20),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cristal de transparence"); put(Language.EN, ""); }}, 91, "10-3", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new RegenEffect(TypeEffect.PM, false, 80, TypeRegen.ABSORPTION),
				}),
			}),
		};
	}
	
	static ProSkill[] getClass11() {
		return new ProSkill[] {
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Extermination temporelle 1"); put(Language.EN, "Time Extermination 1"); }}, 66, "11-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 3),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Extermination temporelle 2"); put(Language.EN, "Time Extermination 2"); }}, 86, "11-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 6),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -400, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Extermination temporelle 3"); put(Language.EN, "Time Extermination 3"); }}, 91, "11-0", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 10),
					new Proc(100, Activation.Attack, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -600, TypeRegen.POISON),
					}),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Roi du Temps 1"); put(Language.EN, "Schedule Mastering 1"); }}, 66, "11-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new Effect(TypeEffect.DegStdP, false, 10),
				new Effect(TypeEffect.DegStdD, false, 10),
				new Effect(TypeEffect.DegSkillP, false, 10),
				new Effect(TypeEffect.DegSkillM, false, 10),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Roi du Temps 2"); put(Language.EN, "Schedule Mastering 2"); }}, 86, "11-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Effect(TypeEffect.DegStdP, false, 12),
				new Effect(TypeEffect.DegStdD, false, 12),
				new Effect(TypeEffect.DegSkillP, false, 12),
				new Effect(TypeEffect.DegSkillM, false, 12),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Roi du Temps 3"); put(Language.EN, "Schedule Mastering 3"); }}, 91, "11-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -30),
				new Effect(TypeEffect.DegStdP, false, 15),
				new Effect(TypeEffect.DegStdD, false, 15),
				new Effect(TypeEffect.DegSkillP, false, 15),
				new Effect(TypeEffect.DegSkillM, false, 15),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Charge temporelle 1"); put(Language.EN, "Time Charge 1"); }}, 86, "11-2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, 20, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Charge temporelle 2"); put(Language.EN, "Time Charge 2"); }}, 91, "11-2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, 20, Target.OPPONENT),
				}),
			}),
			new ProSkill(new HashMap<Language, String>() {{ put(Language.FR, "Cristal de Soif de sang"); put(Language.EN, ""); }}, 91, "11-3", new Calculable[] {
				new Proc(15, Activation.Attack, 8, new Calculable[] {
					new Effect(TypeEffect.RegenM, false, 5),
					new Effect(TypeEffect.DCCM, false, 10),
				}),
			}),
		};
	}
}
