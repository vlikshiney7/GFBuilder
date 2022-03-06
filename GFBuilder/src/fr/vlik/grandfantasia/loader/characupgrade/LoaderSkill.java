package fr.vlik.grandfantasia.loader.characupgrade;

import java.util.EnumMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.characupgrade.InnerSkill;
import fr.vlik.grandfantasia.characupgrade.Skill;
import fr.vlik.grandfantasia.characupgrade.SkillNew;
import fr.vlik.grandfantasia.characupgrade.SkillNew.SkillType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeDamage;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.DamageEffect;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderSkill extends LoaderTemplate {
	
	static SkillNew[] getGuerrier() {
		return new SkillNew[] {
			new SkillNew(new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, }, SkillType.BUFF, false, "0-autobuff-0", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Stress"); put(Language.EN, ""); }}, 1,
					"0-autobuff-0-0", 19, 30, 0, 6, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 22),
						new Effect(TypeEffect.MEN, false, 100),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Stress"); put(Language.EN, ""); }}, 2,
					"0-autobuff-0-0", 26, 30, 0, 12, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 34),
						new Effect(TypeEffect.MEN, false, 100),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Stress"); put(Language.EN, ""); }}, 3,
					"0-autobuff-0-0", 26, 30, 0, 18, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 46),
						new Effect(TypeEffect.MEN, false, 100),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Stress"); put(Language.EN, ""); }}, 4,
					"0-autobuff-0-0", 34, 30, 0, 24, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 58),
						new Effect(TypeEffect.MEN, false, 100),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Montée de Sang Chaud"); put(Language.EN, ""); }}, 1,
					"0-autobuff-0-1", 86, 30, 0, 68, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 150),
						new Effect(TypeEffect.MEN, false, 125),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Montée de Sang Chaud"); put(Language.EN, ""); }}, 2,
					"0-autobuff-0-1", 94, 30, 0, 78, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 200),
						new Effect(TypeEffect.MEN, false, 125),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Audace Ultime"); put(Language.EN, ""); }}, 1,
					"0-autobuff-0-1", 102, 30, 0, 88, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 250),
						new Effect(TypeEffect.MEN, false, 125),
					}, 20),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Audace Ultime"); put(Language.EN, ""); }}, 2,
					"0-autobuff-0-2", 110, 30, 0, 98, new Calculable[] {
						new Effect(TypeEffect.DegPtsStdP, false, 300),
						new Effect(TypeEffect.MEN, false, 125),
					}, 20),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, }, SkillType.DAMAGE, false, "0-damage-0", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 1,
					"0-damage-0-0", 25, 4, 0, 6, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 100),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 2,
					"0-damage-0-0", 25, 4, 0, 10, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 141),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 3,
					"0-damage-0-0", 35, 4, 0, 14, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 178),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 4,
					"0-damage-0-0", 35, 4, 0, 18, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 213),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 5,
					"0-damage-0-0", 45, 4, 0, 22, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 247),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de la Déferlante Céleste"); put(Language.EN, ""); }}, 6,
					"0-damage-0-0", 45, 4, 0, 26, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 279),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fracture Céleste"); put(Language.EN, ""); }}, 1,
					"0-damage-0-1", 115, 4, 0, 68, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 579),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fracture Céleste"); put(Language.EN, ""); }}, 2,
					"0-damage-0-1", 115, 4, 0, 78, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 638),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut Olympien"); put(Language.EN, ""); }}, 1,
					"0-damage-0-1", 115, 4, 0, 88, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 697),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut Olympien"); put(Language.EN, ""); }}, 2,
					"0-damage-0-2", 115, 4, 0, 98, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 756),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, }, SkillType.DEBUFF, false, "0-debuff-0", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Barre"); put(Language.EN, ""); }}, 1,
					"0-debuff-0-0", 25, 10, 0, 8, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Phys, 97),
						new Effect(TypeEffect.DegPtsStdP, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Barre"); put(Language.EN, ""); }}, 2,
					"0-debuff-0-0", 35, 10, 0, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Phys, 128),
						new Effect(TypeEffect.DegPtsStdP, false, -50, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Barre"); put(Language.EN, ""); }}, 3,
					"0-debuff-0-0", 35, 10, 0, 16, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Phys, 157),
						new Effect(TypeEffect.DegPtsStdP, false, -60, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Barre"); put(Language.EN, ""); }}, 4,
					"0-debuff-0-0", 35, 10, 0, 20, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Phys, 184),
						new Effect(TypeEffect.DegPtsStdP, false, -70, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Barre"); put(Language.EN, ""); }}, 5,
					"0-debuff-0-0", 45, 10, 0, 24, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Phys, 210),
						new Effect(TypeEffect.DegPtsStdP, false, -80, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Désarmante"); put(Language.EN, ""); }}, 1,
					"0-debuff-0-1", 115, 10, 0, 68, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 463),
						new Effect(TypeEffect.DegPtsStdP, false, -200, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, -20, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Désarmante"); put(Language.EN, ""); }}, 2,
					"0-debuff-0-1", 125, 10, 0, 78, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 463),
						new Effect(TypeEffect.DegPtsStdP, false, -250, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, -20, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut Ravageur"); put(Language.EN, ""); }}, 1,
					"0-debuff-0-1", 135, 10, 0, 88, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 463),
						new Effect(TypeEffect.DegPtsStdP, false, -300, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, -20, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut Ravageur"); put(Language.EN, ""); }}, 2,
					"0-debuff-0-2", 145, 10, 0, 98, new Calculable[] {
						new StaticEffect(TypeStaticEffect.AddCharge),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 463),
						new Effect(TypeEffect.DegPtsStdP, false, -350, Target.OPPONENT),
						new Effect(TypeEffect.ESQ, false, -20, Target.OPPONENT),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.DEBUFF, false, "0-debuff-1", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de terre"); put(Language.EN, ""); }}, 1,
					"0-debuff-1-0", 42, 12, 0, 16, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 84),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de terre"); put(Language.EN, ""); }}, 2,
					"0-debuff-1-0", 42, 12, 0, 20, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 99),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de terre"); put(Language.EN, ""); }}, 3,
					"0-debuff-1-0", 54, 12, 0, 24, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 114),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de terre"); put(Language.EN, ""); }}, 4,
					"0-debuff-1-0", 54, 12, 0, 28, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 127),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Séisme Paralysant"); put(Language.EN, ""); }}, 1,
					"0-debuff-1-1", 138, 12, 0, 70, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 256),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Séisme Paralysant"); put(Language.EN, ""); }}, 2,
					"0-debuff-1-1", 138, 12, 0, 80, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 284),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fissure Terrestre"); put(Language.EN, ""); }}, 0,
					"0-debuff-1-1", 138, 12, 0, 90, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 312),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fissure Terrestre"); put(Language.EN, ""); }}, 2,
					"0-debuff-1-2", 138, 12, 0, 100, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 340),
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
						new Effect(TypeEffect.VitAtkD, false, -40, Target.OPPONENT),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.DEBUFF, false, "0-debuff-2", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de bouclier"); put(Language.EN, ""); }}, 1,
					"0-debuff-2-0", 35, 12, 0, 16, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 282),
						new Effect(TypeEffect.MEN, false, 250),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de bouclier"); put(Language.EN, ""); }}, 2,
					"0-debuff-2-0", 45, 12, 0, 22, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 398),
						new Effect(TypeEffect.MEN, false, 400),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de bouclier"); put(Language.EN, ""); }}, 3,
					"0-debuff-2-0", 45, 12, 0, 28, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 511),
						new Effect(TypeEffect.MEN, false, 650),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute"); put(Language.EN, ""); }}, 1,
					"0-debuff-2-1", 115, 12, 0, 70, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 1026),
						new Effect(TypeEffect.MEN, false, 1600),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute"); put(Language.EN, ""); }}, 2,
					"0-debuff-2-1", 115, 12, 0, 80, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 1576),
						new Effect(TypeEffect.MEN, false, 1700),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Puissant"); put(Language.EN, ""); }}, 1,
					"0-debuff-2-1", 115, 12, 0, 90, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 2126),
						new Effect(TypeEffect.MEN, false, 1900),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Puissant"); put(Language.EN, ""); }}, 2,
					"0-debuff-2-2", 115, 12, 0, 100, new Calculable[] {
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 2676),
						new Effect(TypeEffect.MEN, false, 2050),
						new StaticEffect(TypeStaticEffect.Stun, Target.OPPONENT),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.DEBUFF, true, "0-debuff-3", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cyclone Intimidant"); put(Language.EN, ""); }}, 1,
					"0-debuff-3", 65, 15, 0, 31, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 130),
						new Proc(100, Activation.Nothing, 3, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
							new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
							new RegenEffect(TypeEffect.PV, false, -100, -200, TypeRegen.POISON, 1),
							new RegenEffect(TypeEffect.PM, false, -100, -200, TypeRegen.POISON, 1),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cyclone Intimidant"); put(Language.EN, ""); }}, 2,
					"0-debuff-3", 110, 15, 0, 66, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 220),
						new Proc(100, Activation.Nothing, 3, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -40, Target.OPPONENT),
							new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
							new RegenEffect(TypeEffect.PV, false, -150, -300, TypeRegen.POISON, 1),
							new RegenEffect(TypeEffect.PM, false, -150, -300, TypeRegen.POISON, 1),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cyclone Intimidant"); put(Language.EN, ""); }}, 3,
					"0-debuff-3", 155, 15, 0, 86, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 270),
						new Proc(100, Activation.Nothing, 3, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
							new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
							new RegenEffect(TypeEffect.PV, false, -300, -600, TypeRegen.POISON, 1),
							new RegenEffect(TypeEffect.PM, false, -300, -600, TypeRegen.POISON, 1),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cyclone Intimidant"); put(Language.EN, ""); }}, 4,
					"0-debuff-3", 200, 15, 0, 91, new Calculable[] {
						new DamageEffect(TypeDamage.AOE, 6),
						new DamageEffect(TypeDamage.Standard),
						new DamageEffect(TypeDamage.Phys, 330),
						new Proc(100, Activation.Nothing, 3, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -60, Target.OPPONENT),
							new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
							new RegenEffect(TypeEffect.PV, false, -450, -900, TypeRegen.POISON, 1),
							new RegenEffect(TypeEffect.PM, false, -450, -900, TypeRegen.POISON, 1),
						}),
					}),
			}),/*
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 45, 30, 0, 31, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 45, 30, 0, 36, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 56, 30, 0, 42, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 56, 30, 0, 48, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 71, 30, 0, 54, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguine"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 71, 30, 0, 60, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Folie Sanguinaire"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 86, 30, 0, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Folie Sanguinaire"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 105, 30, 0, 74, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Folie Sanguinaire"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 124, 30, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Berserker Sanguinaire"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 143, 30, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Berserker Sanguinaire"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 162, 30, 0, 98, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 60, 6, 0, 31, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 60, 6, 0, 34, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 60, 6, 0, 38, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 75, 6, 0, 42, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 75, 6, 0, 46, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 75, 6, 0, 50, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 95, 6, 0, 54, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 8,
					"ICONCODESKILL", 95, 6, 0, 58, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vague de Pouvoir"); put(Language.EN, ""); }}, 9,
					"ICONCODESKILL", 120, 6, 0, 62, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 120, 6, 0, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 130, 6, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 140, 6, 0, 74, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 140, 6, 0, 78, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 150, 6, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Méga Onde de Choc"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 160, 6, 0, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Méga Onde de Choc"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 170, 6, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Méga Onde de Choc"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 180, 6, 0, 94, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Méga Onde de Choc"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 190, 6, 0, 98, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de guerre"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 72, 10, 0, 31, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de guerre"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 72, 10, 0, 38, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de guerre"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 90, 10, 0, 46, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de guerre"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 114, 10, 0, 54, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de guerre"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 130, 10, 0, 62, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de Guerre"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 138, 10, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri de Guerre"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 138, 10, 0, 80, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hurlement Guerrier"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 138, 10, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hurlement Guerrier"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 138, 10, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 60, 8, 1, 32, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 60, 8, 1, 38, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 75, 8, 1, 44, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 75, 8, 1, 50, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 95, 8, 1, 56, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Taureau"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 120, 8, 0, 62, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Bison Futé"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 130, 8, 1, 68, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charge de Bison Futé"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 140, 8, 1, 74, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 72, 12, 0, 32, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 72, 12, 0, 36, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 72, 12, 0, 40, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 90, 12, 0, 44, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 90, 12, 0, 48, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 114, 12, 0, 52, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 114, 12, 0, 56, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 8,
					"ICONCODESKILL", 114, 12, 0, 60, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Terrestre"); put(Language.EN, ""); }}, 9,
					"ICONCODESKILL", 130, 12, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Terrestre"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 138, 12, 0, 68, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Terrestre"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 168, 12, 0, 72, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Terrestre"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 168, 12, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Terrestre"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 168, 12, 0, 80, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Terrestre"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 174, 12, 0, 84, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Titanesque"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 180, 12, 0, 88, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Titanesque"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 186, 12, 0, 92, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Titanesque"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 192, 12, 0, 96, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Titanesque"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 198, 12, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement de guerre terrible"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 72, 10, 0, 32, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement de guerre terrible"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 72, 10, 0, 40, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement de guerre terrible"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 90, 10, 0, 48, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement de guerre terrible"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 114, 10, 0, 56, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement de guerre terrible"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 134, 10, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Terrifiant"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 138, 10, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Terrifiant"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 138, 10, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Terrifiant"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 138, 10, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Sauvage Terrifiant"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 148, 10, 0, 88, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Sauvage Terrifiant"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 158, 10, 0, 94, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cri Sauvage Terrifiant"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 168, 10, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 60, 6, 0, 34, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 60, 6, 0, 38, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 75, 6, 0, 42, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 75, 6, 0, 46, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 75, 6, 0, 50, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 95, 6, 0, 54, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 95, 6, 0, 58, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 120, 6, 0, 62, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique Guerrier"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 120, 6, 0, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique Guerrier"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 130, 6, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique Guerrier"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 140, 6, 0, 74, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique Guerrier"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 150, 6, 0, 78, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Sismique Guerrier"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 160, 6, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Démoniaque"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 170, 6, 0, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Démoniaque"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 180, 6, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Démoniaque"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 190, 6, 0, 94, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Démoniaque"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 200, 6, 0, 98, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 60, 12, 0, 36, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 60, 12, 0, 40, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 75, 12, 0, 44, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 75, 12, 0, 48, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 95, 12, 0, 52, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 95, 12, 0, 56, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 95, 12, 0, 60, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Destructeur"); put(Language.EN, ""); }}, 8,
					"ICONCODESKILL", 120, 12, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Ravageur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 130, 12, 0, 68, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Ravageur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 140, 12, 0, 72, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Ravageur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 140, 12, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Ravageur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 140, 12, 0, 80, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Ravageur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 150, 12, 0, 84, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Démolisseur"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 160, 12, 0, 88, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Démolisseur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 170, 12, 0, 92, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Démolisseur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 180, 12, 0, 96, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Démolisseur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 190, 12, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Abyssale"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 72, 6, 0, 40, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Abyssale"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 90, 6, 0, 46, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Abyssale"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 114, 6, 0, 52, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Abyssale"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 114, 6, 0, 58, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Abyssale"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 130, 6, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Sidérale"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 138, 6, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Sidérale"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 146, 6, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Sidérale"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 152, 6, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Super Frappe Intersidérale"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 158, 6, 0, 88, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Super Frappe Intersidérale"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 164, 6, 0, 94, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Super Frappe Intersidérale"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 170, 6, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du chaos"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 45, 30, 0, 40, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du chaos"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 56, 30, 0, 46, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du chaos"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 71, 30, 0, 52, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du chaos"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 71, 30, 0, 58, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du chaos"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 86, 30, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Démente"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 86, 30, 0, 70, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Démente"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 86, 30, 0, 80, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du Berserker"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 86, 30, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du Berserker"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 86, 30, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réveil de la Force"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 86, 60, 0, 61, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réveil de la Force"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 86, 60, 0, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réveil de la Force"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 105, 60, 0, 72, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réveil de la Force"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 105, 60, 0, 78, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réveil de la Force"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 124, 60, 0, 84, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 150, 30, 0, 61, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 150, 30, 0, 64, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 150, 30, 0, 68, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 180, 30, 0, 72, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 180, 30, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 180, 30, 0, 80, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 210, 30, 0, 84, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 8,
					"ICONCODESKILL", 240, 30, 0, 88, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison"); put(Language.EN, ""); }}, 9,
					"ICONCODESKILL", 270, 30, 0, 92, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison du Champion"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 300, 30, 0, 96, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérison du Champion"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 330, 30, 0, 100, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 130, 25, 1, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 150, 25, 1, 71, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 170, 25, 1, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 190, 25, 1, 81, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 210, 25, 1, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 230, 25, 1, 91, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Meurtrière"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 250, 25, 1, 96, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 180, 12, 0, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 210, 12, 0, 71, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 240, 12, 0, 76, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 270, 12, 0, 81, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 300, 12, 0, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 330, 12, 0, 91, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saut Lacérateur"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 360, 12, 0, 96, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sursaut Magique"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 120, 600, 0, 66, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flash Gordon"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 86, 180, 0, 66, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Surnaturelle"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 100, 300, 0, 66, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 100, 25, 0, 67, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 113, 25, 0, 73, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 126, 25, 0, 79, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 139, 25, 0, 85, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 152, 25, 0, 91, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Zèle"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 165, 25, 0, 97, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 130, 20, 0, 68, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 150, 20, 0, 75, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 170, 20, 0, 82, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 190, 20, 0, 89, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défi"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 210, 20, 0, 96, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 114, 13, 0, 69, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 128, 13, 0, 73, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 142, 13, 0, 77, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 156, 13, 0, 81, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 170, 13, 0, 85, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", 184, 13, 0, 89, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 7,
					"ICONCODESKILL", 198, 13, 0, 93, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Sanglant"); put(Language.EN, ""); }}, 8,
					"ICONCODESKILL", 212, 13, 0, 97, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crash d'Accélération"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 198, 60, 0, 84, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bain de Sang Ultime"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 150, 30, 0, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bain de Sang Ultime"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 150, 30, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bain de Sang Ultime"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 150, 30, 0, 94, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bain de Sang Ultime"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 150, 30, 0, 98, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, true, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Acharnement"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 100, 30, 0, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Acharnement"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 200, 30, 0, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indomptable"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", 180, 60, 0, 87, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indomptable"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", 200, 60, 0, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indomptable"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", 220, 60, 0, 93, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indomptable"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", 240, 60, 0, 96, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indomptable"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", 260, 60, 0, 99, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Combattant Embrasé"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 388, 240, 10, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif de Bataille Embrasée"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 242, 6, -1, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Retour de Sang"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 242, 4, -1, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fureur du Gladiateur"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 242, 60, 0, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cicatrice de Guerre"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", 242, 12, 0, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, true, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme brisée a"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", -1, -1, -1, 6, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme brisée ß"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", -1, -1, -1, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme brisée ?"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", -1, -1, -1, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme brisée d"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", -1, -1, -1, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, true, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, 6, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, 16, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, 31, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, 31, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", -1, -1, -1, 91, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Glissade Mortelle"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", -1, -1, -1, 91, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sueurs Froides"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sueurs Froides"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sueurs Froides"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sueurs Froides"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sueurs Froides"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),*/
			new SkillNew(new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, }, SkillType.PASSIVE, false, "0-passive-0", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense experte"); put(Language.EN, "Defense Expert"); }}, 0,
					"0-passive-0", -1, -1, -1, 6, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
					}),
			}),/*
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Pompe"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Pompe"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Pompe"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Pompe"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque du Coup de Pompe"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Violent"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Violent"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Violent"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Violent"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Bouclier Violent"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance au combat"); put(Language.EN, ""); }}, 0,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde d'Énergie Puissante"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde d'Énergie Puissante"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde d'Énergie Puissante"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde d'Énergie Puissante"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde d'Énergie Puissante"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche de la Violente Tornade"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche de la Violente Tornade"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche de la Violente Tornade"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche de la Violente Tornade"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brèche de la Violente Tornade"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguinaire"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguinaire"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguinaire"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguinaire"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soif Sanguinaire"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de Terre"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de Terre"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de Terre"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de Terre"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tremblement de Terre"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Exterminateur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Exterminateur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Exterminateur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Exterminateur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Exterminateur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Folle du Chaos"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Folle du Chaos"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Folle du Chaos"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Folle du Chaos"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Folle du Chaos"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Géante"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Géante"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Géante"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Géante"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balafre Géante"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psychose Sanguinaire"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psychose Sanguinaire"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psychose Sanguinaire"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psychose Sanguinaire"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psychose Sanguinaire"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, 66, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, 72, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, 78, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, 84, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, 90, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Persévérance"); put(Language.EN, ""); }}, 6,
					"ICONCODESKILL", -1, -1, -1, 96, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc Puissant"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc Puissant"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc Puissant"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc Puissant"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Onde de Choc Puissant"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tornade Géante"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tornade Géante"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tornade Géante"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tornade Géante"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tornade Géante"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Destructeur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Destructeur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Destructeur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Destructeur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magma Destructeur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Dévastateur"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Dévastateur"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Dévastateur"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Dévastateur"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle Dévastateur"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fièvre de Sang Chaud"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fièvre de Sang Chaud"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fièvre de Sang Chaud"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fièvre de Sang Chaud"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fièvre de Sang Chaud"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Déroutante"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Déroutante"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Déroutante"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Déroutante"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Déroutante"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Frénétique"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Frénétique"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Frénétique"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Frénétique"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse Frénétique"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Intersidérale"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Intersidérale"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Intersidérale"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Intersidérale"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe Intersidérale"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute Féroce"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute Féroce"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute Féroce"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute Féroce"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup de Brute Féroce"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, -1, new Calculable[] {
						
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, false, "CODESKILL", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }}, 1,
					"ICONCODESKILL", -1, -1, -1, 86, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }}, 2,
					"ICONCODESKILL", -1, -1, -1, 89, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }}, 3,
					"ICONCODESKILL", -1, -1, -1, 92, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }}, 4,
					"ICONCODESKILL", -1, -1, -1, 95, new Calculable[] {
						
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }}, 5,
					"ICONCODESKILL", -1, -1, -1, 98, new Calculable[] {
						
					}),
			}),*/
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.PROSKILL, false, "0-proskill-0", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Possession du Dieu de feu"); put(Language.EN, "Fire God Possession"); }}, 1,
					"0-proskill-0", -1, 20, -1, 66, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 3),
						new Proc(100, Activation.Standard, new Calculable[] {
							new Effect(TypeEffect.DegFeu, false, 200),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Possession du Dieu de feu"); put(Language.EN, "Fire God Possession"); }}, 2,
					"0-proskill-0", -1, 20, -1, 86, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
						new Proc(100, Activation.Standard, new Calculable[] {
							new Effect(TypeEffect.DegFeu, false, 400),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Possession du Dieu de feu"); put(Language.EN, "Fire God Possession"); }}, 3,
					"0-proskill-0", -1, 20, -1, 91, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
						new Proc(100, Activation.Standard, new Calculable[] {
							new Effect(TypeEffect.DegFeu, false, 600),
						}),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.PROSKILL, false, "0-proskill-1", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force exorcisante"); put(Language.EN, "Exorcising Force"); }}, 1,
					"0-proskill-1", -1, -1, -1, 66, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 1.5, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, 5, 10, TypeRegen.ABSORPTION),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force exorcisante"); put(Language.EN, "Exorcising Force"); }}, 2,
					"0-proskill-1", -1, -1, -1, 86, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 3, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, 10, 20, TypeRegen.ABSORPTION),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force exorcisante"); put(Language.EN, "Exorcising Force"); }}, 3,
					"0-proskill-1", -1, -1, -1, 91, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 5, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, 15, 30, TypeRegen.ABSORPTION),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.PROSKILL, false, "0-proskill-2", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Perce-Armure"); put(Language.EN, ""); }}, 1,
					"0-proskill-2", -1, 15, -1, 86, new Calculable[] {
						new Proc(10, Activation.Attack, 10, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 10, Target.OPPONENT),
						}),
					}),
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Perce-Armure"); put(Language.EN, ""); }}, 2,
					"0-proskill-2", -1, 15, -1, 91, new Calculable[] {
						new Proc(10, Activation.Attack, 10, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 20, Target.OPPONENT),
						}),
					}),
			}),
			new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.PROSKILL, false, "0-proskill-3", new InnerSkill[] {
				new InnerSkill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Contre-attaque prompte"); put(Language.EN, ""); }}, 1,
					"0-proskill-3", -1, 15, -1, 91, new Calculable[] {
						new Proc(10, Activation.Attacked, 10, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 100),
						}),
					}),
			}),
		};
	}

	static Skill[][] getPassiveSkill() {
		return new Skill[][] {
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense experte"); put(Language.EN, "Defense Expert"); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance au combat"); put(Language.EN, "Battle Stamina"); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en berserker"); put(Language.EN, ""); }}, 31, "31-0", null),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense experte"); put(Language.EN, "Defense Expert"); }}, 6, "0-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 10),
					new Effect(TypeEffect.ReducStdD, false, 10),
					new Effect(TypeEffect.ReducSkillP, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance au combat"); put(Language.EN, "Battle Stamina"); }}, 16, "0-1", new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 20),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en paladin"); put(Language.EN, "Evolution on paladin"); }}, new int[] { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, }, "31-1", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 140, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 180, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 220, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 260, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 300, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 340, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 380, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 420, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 460, TypeCalcul.BASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, false, 800, TypeCalcul.BASE),
						new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
						new Effect(TypeEffect.DefP, false, 500, TypeCalcul.BASE),
					},
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, "Marksman"); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, "Dual Weapon Fighting"); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en ranger"); put(Language.EN, ""); }}, 31, "31-2", null),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur d'élite"); put(Language.EN, "Marksman"); }}, 6, "1-0", new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 30),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat à l'arme double"); put(Language.EN, "Dual Weapon Fighting"); }}, 16, "1-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en assassin"); put(Language.EN, "Evolution on assassin"); }}, 31, "31-3", new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 12),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, "Magic Resistant"); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Restauration de PM"); put(Language.EN, "Mana Restoration"); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en clerc"); put(Language.EN, ""); }}, 31, "31-4", null),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance à la magie"); put(Language.EN, "Magic Resistant"); }}, 6, "2-0", new Calculable[] {
					new Effect(TypeEffect.ReducSkillM, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Restauration de PM"); put(Language.EN, "Mana Restoration"); }}, 16, "2-1", new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 20),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en sage"); put(Language.EN, ""); }}, 31, "31-5", null),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, "Magic Adept"); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, "Magic Sharpshooter"); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en sorcier"); put(Language.EN, "Evolution on wizard"); }}, 31, "31-6", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Adepte de la magie"); put(Language.EN, "Magic Adept"); }}, 6, "3-0", new Calculable[] {
					new Effect(TypeEffect.DegSkillM, false, 10),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur d'élite magique"); put(Language.EN, "Magic Sharpshooter"); }}, 16, "3-1", new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 3),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en nécromancien"); put(Language.EN, "Evolution on necromancer"); }}, 31, "31-7", new Calculable[] {
					new Effect(TypeEffect.PV, false, 400, TypeCalcul.BASE),
					new Effect(TypeEffect.PM, false, 400, TypeCalcul.BASE),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "ORDI de Technopolis"); put(Language.EN, ""); }}, new int[] { 6, 31, 66, }, "4-0", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 3),
					},
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Microprocesseur de combat multi-coeur"); put(Language.EN, ""); }}, 16, "4-1", new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 0.5),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Double armes mécaniques"); put(Language.EN, ""); }}, 31, "4-2", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en métalleux"); put(Language.EN, ""); }}, 31, "31-8", null),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise de Mécha gravité"); put(Language.EN, "Mecha Gravity Mastery"); }}, 66, "66-0", new Calculable[] {
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.DefP, true, 5),
					new Effect(TypeEffect.DefM, true, 5),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "ORDI de Technopolis"); put(Language.EN, ""); }}, new int[] { 6, 31, 66, }, "4-0", new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.BoostCraft, false, 3),
					},
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Microprocesseur de combat multi-coeur"); put(Language.EN, ""); }}, 16, "4-1", new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 0.5),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Double armes mécaniques"); put(Language.EN, ""); }}, 31, "4-2", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Duo),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en démolisseur"); put(Language.EN, ""); }}, 31, "31-9", null),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise d'Interférence électromagnétique"); put(Language.EN, "Electromagnetic Interference Mastery"); }}, 66, "66-1", new Calculable[] {
					new StaticEffect(TypeStaticEffect.Passive9, 5),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, "Crystal Resonance"); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
						new Effect(TypeEffect.DegStdP, false, 5),
						new Effect(TypeEffect.DegStdD, false, 5),
						new Effect(TypeEffect.DegSkillP, false, 5),
						new Effect(TypeEffect.DegSkillM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
						new Effect(TypeEffect.DegStdP, false, 20),
						new Effect(TypeEffect.DegStdD, false, 20),
						new Effect(TypeEffect.DegSkillP, false, 20),
						new Effect(TypeEffect.DegSkillM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, "Space Crystal Core"); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				//new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en spatiodériveur"); put(Language.EN, ""); }}, 31, "31-10", null),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Poids de l'univers"); put(Language.EN, "Power of the Universe"); }}, 66, "66-2", new Calculable[] {
					new Effect(TypeEffect.Depla, false, 5),
					new Effect(TypeEffect.ReducStdP, false, 5),
					new Effect(TypeEffect.ReducStdD, false, 5),
					new Effect(TypeEffect.ReducSkillP, false, 5),
					new Effect(TypeEffect.ReducSkillM, false, 5),
					new Effect(TypeEffect.Atk, 50, TypeEffect.AtkM, TypeCalcul.CONVERTALL),
					new Effect(TypeEffect.AtkD, 50, TypeEffect.AtkM, TypeCalcul.CONVERTALL),
				}),
			},
			new Skill[] {
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résonance cristalline"); put(Language.EN, "Crystal Resonance"); }}, 6, "5-0", new Calculable[] {
					new Condition(TypeEffect.PV, new int[] { 67, 100, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
					}),
					new Condition(TypeEffect.PV, new int[] { 34, 66, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
						new Effect(TypeEffect.DegStdP, false, 5),
						new Effect(TypeEffect.DegStdD, false, 5),
						new Effect(TypeEffect.DegSkillP, false, 5),
						new Effect(TypeEffect.DegSkillM, false, 5),
					}),
					new Condition(TypeEffect.PV, new int[] { 1, 33, }, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
						new Effect(TypeEffect.ReducSkillM, false, 10),
						new Effect(TypeEffect.DegStdP, false, 20),
						new Effect(TypeEffect.DegStdD, false, 20),
						new Effect(TypeEffect.DegSkillP, false, 20),
						new Effect(TypeEffect.DegSkillM, false, 20),
						new Effect(TypeEffect.CostPV, false, -100),
					}),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Noyau de Cristallisation de l'Espace"); put(Language.EN, "Space Crystal Core"); }}, 31, "5-2", new Calculable[] {
					new Effect(TypeEffect.PeneP, false, 5),
					new Effect(TypeEffect.PeneM, false, 5),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évolution en chronodériveur"); put(Language.EN, "Evolution on time traveler"); }}, 31, "31-11", new Calculable[] {
					new Effect(TypeEffect.PM, false, 800, TypeCalcul.BASE),
				}),
				new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir du Temps"); put(Language.EN, "Chronos Power"); }}, 66, "66-3", new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 10),
				}),
			},
		};
	}
	
	static Skill[] getUpgradeSkill() {
		return new Skill[] {
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Invincible"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-0-0", "86-0-0", "86-0-1", "86-0-1", "86-0-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 50),
						new Effect(TypeEffect.VIT, false, 30),
						new Effect(TypeEffect.DefP, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 55),
						new Effect(TypeEffect.VIT, false, 35),
						new Effect(TypeEffect.DefP, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 60),
						new Effect(TypeEffect.VIT, false, 40),
						new Effect(TypeEffect.DefP, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 65),
						new Effect(TypeEffect.VIT, false, 45),
						new Effect(TypeEffect.DefP, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 70),
						new Effect(TypeEffect.VIT, false, 50),
						new Effect(TypeEffect.DefP, true, 14),
					},
			}),
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Agile"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-1-0", "86-1-0", "86-1-1", "86-1-1", "86-1-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30),
						new Effect(TypeEffect.AGI, false, 50),
						new Effect(TypeEffect.Atk, true, 3),
						new Effect(TypeEffect.AtkD, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 35),
						new Effect(TypeEffect.AGI, false, 55),
						new Effect(TypeEffect.Atk, true, 4),
						new Effect(TypeEffect.AtkD, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 40),
						new Effect(TypeEffect.AGI, false, 60),
						new Effect(TypeEffect.Atk, true, 5),
						new Effect(TypeEffect.AtkD, true, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 45),
						new Effect(TypeEffect.AGI, false, 65),
						new Effect(TypeEffect.Atk, true, 6),
						new Effect(TypeEffect.AtkD, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 50),
						new Effect(TypeEffect.AGI, false, 70),
						new Effect(TypeEffect.Atk, true, 7),
						new Effect(TypeEffect.AtkD, true, 7),
					},
			}),
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Pure"); put(Language.EN, ""); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-2-0", "86-2-0", "86-2-1", "86-2-1", "86-2-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14),
						new Effect(TypeEffect.INT, false, 50),
						new Effect(TypeEffect.VOL, false, 14),
						new Effect(TypeEffect.AtkM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17),
						new Effect(TypeEffect.INT, false, 55),
						new Effect(TypeEffect.VOL, false, 17),
						new Effect(TypeEffect.AtkM, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
						new Effect(TypeEffect.INT, false, 60),
						new Effect(TypeEffect.VOL, false, 20),
						new Effect(TypeEffect.AtkM, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23),
						new Effect(TypeEffect.INT, false, 65),
						new Effect(TypeEffect.VOL, false, 23),
						new Effect(TypeEffect.AtkM, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26),
						new Effect(TypeEffect.INT, false, 70),
						new Effect(TypeEffect.VOL, false, 26),
						new Effect(TypeEffect.AtkM, true, 14),
					},
			}),
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme Magique"); put(Language.EN, "Mystic Soul"); }},
				new int[] { 86, 89, 92, 95, 98, }, new String[] { "86-3-0", "86-3-0", "86-3-1", "86-3-1", "86-3-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14),
						new Effect(TypeEffect.INT, false, 30),
						new Effect(TypeEffect.VOL, false, 14),
						new Effect(TypeEffect.AtkM, true, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17),
						new Effect(TypeEffect.INT, false, 35),
						new Effect(TypeEffect.VOL, false, 17),
						new Effect(TypeEffect.AtkM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
						new Effect(TypeEffect.INT, false, 40),
						new Effect(TypeEffect.VOL, false, 20),
						new Effect(TypeEffect.AtkM, true, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23),
						new Effect(TypeEffect.INT, false, 45),
						new Effect(TypeEffect.VOL, false, 23),
						new Effect(TypeEffect.AtkM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26),
						new Effect(TypeEffect.INT, false, 50),
						new Effect(TypeEffect.VOL, false, 26),
						new Effect(TypeEffect.AtkM, true, 7),
					},
			}),
			null,
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal du Temps"); put(Language.EN, ""); }},
				new int[] { 16, 31, 66, }, new String[] { "5-1", "5-1", "5-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -5),
					},
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -10),
					},
					new Calculable[] {
						new Effect(TypeEffect.TimeCraft, false, -15),
					},
			}),
			new Skill(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Âme brisée"); put(Language.EN, ""); }},
				new int[] { 6, 66, }, new String[] { "reinca-0", "reinca-1", }, new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.XP, false, 10),
						new Effect(TypeEffect.Loot, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.XP, false, 13),
						new Effect(TypeEffect.Loot, false, 5),
					},
			}),
		};
	}
}
