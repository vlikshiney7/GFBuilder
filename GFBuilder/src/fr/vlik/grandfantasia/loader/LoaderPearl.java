package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderPearl {
	
	static Pearl[] getWeapon() {
		return new Pearl[] {
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Enfermement"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -30),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Brèche"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, false, 100, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Brutalité"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Magie"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 30),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Métamorphose"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Précision"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Sceau"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.AntiHeal, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Limbes"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique corrompue royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 5),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique corrompue vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 10),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PM, false, 15, TypeRegen.REGENERATION, 1),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -28),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de brèche royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, false, -100, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de brèche vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(20, Activation.Attack, 5, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, false, -100, Target.OPPONENT),
				}),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de brutalité royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de brutalité vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPtsM, false, 200),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de cage royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de cage vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, 100),
				new Proc(15, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de cruauté absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.AntiHeal, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de cruauté prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.AntiHeal, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de destruction absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.DegAtkM, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de destruction prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 10),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.DegAtkM, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de magie royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de magie vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -15),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 28),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de métamorphose royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de métamorphose vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo, Target.OPPONENT),
				}),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 15),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de passion absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 50),
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DCCM, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de passion prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.PV, true, 17),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 50),
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DCCM, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de précision royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de précision vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de restreinte absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -90, Target.OPPONENT),
					new Effect(TypeEffect.DefP, false, -500, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de restreinte prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new StaticEffect(TypeStaticEffect.AntiStun),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -90, Target.OPPONENT),
					new Effect(TypeEffect.DefP, false, -500, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de sceau royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.AntiHeal, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de sceau vindicateur"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.HealR, false, 10),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.AntiHeal, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des limbes royales"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des limbes vindicatrices"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Proc(20, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique du dévoreur absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 50),
					new Effect(TypeEffect.VitAtkD, false, 50),
					new Effect(TypeEffect.DegAtk, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique du dévoreur prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 10),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 50),
					new Effect(TypeEffect.VitAtkD, false, 50),
					new Effect(TypeEffect.DegAtk, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique du faucon absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.TCCP, false, 50),
					new Effect(TypeEffect.TCCM, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique du faucon prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 28),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.TCCP, false, 50),
					new Effect(TypeEffect.TCCM, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique rouillée royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 5),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique rouillée vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 10),
				new Effect(TypeEffect.ReducPtsM, false, 200),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 300),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance d'Exorcisme"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Oxydoréduction"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Décomposition"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Lacs gelés"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance des Moissonneurs"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance des Nimbes sacrées"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Nuits éternelles"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Origines du monde"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Ouragans"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Regards éteints"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Traqueurs"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Ciel rebelle"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Sprite de Feu"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.9),
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.9),
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bête"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 85),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 65),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 55),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sacrée"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 80),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'attaque - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'attaque standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'éruption - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'éruption standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'estompement - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -23),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -25),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'estompement standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -24),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'harmonie - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'harmonie standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'incantation - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'incantation standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'occultisme - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'occultisme standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de contrôle - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de contrôle standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de force - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de force standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de menace - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 23),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 25),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de menace standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 24),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de visée - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de visée standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des arcanes - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des arcanes standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 2"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 25),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "blue1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "white1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "orange1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "yellow1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "green1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "black1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 15),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes du débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Magique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Aggravation Physique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Magique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Amplitude Physique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Magique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.2),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance d'Optimisation Physique 1"); put(Language.EN, ""); }}, Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.2),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Attaque standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Éruption standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Estompement standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Harmonie standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Incantation standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Occultisme standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Contrôle standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Force standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Menace standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Visée standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique des Arcanes standard "); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
		};
	}
	
	static Pearl[] getArmor() {
		return new Pearl[] {
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Endurance Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 18),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Ingénierie Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 18),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Défense Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Forteresse Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 15),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Éclair Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Inchangée Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 20),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Pacifique Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 20),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Renaissance Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 999),
				new Effect(TypeEffect.RegenPM, false, 999),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Sécurité Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 20),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Spirituelle Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 18),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Stabilisatrice Supérieure"); put(Language.EN, ""); }}, Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'armure absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'armure prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.Glace, false, 300),
				new Proc(10, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Armure Chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.Sacre, false, 100),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 50, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'enchevêtrement royale"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.ReducPeneM, false, 10),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'enchevêtrement vindicatrice"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 20),
				new Effect(TypeEffect.ReducPeneM, false, 20),
				new Effect(TypeEffect.Ombre, false, 300),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 100, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'endurance dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 17),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'ingénierie dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de bénédiction absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Dispel),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de bénédiction prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Feu, false, 300),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Dispel),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de constance chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 12),
				new Effect(TypeEffect.HealR, false, 5),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de défense dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 14),
				new Effect(TypeEffect.Nature, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de distance chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 12),
				new Effect(TypeEffect.HealR, false, 5),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de forteresse dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 14),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de frontière absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 10),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de frontière prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 10),
				new Effect(TypeEffect.Foudre, false, 300),
				new Proc(10, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 30),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de guérison de l'âme chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 500),
				new Effect(TypeEffect.RegenPM, false, 500),
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de lorica absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.RDCCM, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de lorica prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, 500),
				new Effect(TypeEffect.ReducPtsM, false, 500),
				new Effect(TypeEffect.Ombre, false, 300),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.RDCCM, false, 50),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de méditation chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.Ombre, false, 100),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PM, false, 10, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de renaissance absolue"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new Condition(TypeCondition.DEATH, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 100, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, 100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de renaissance prestigieuse"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 300),
				new Effect(TypeEffect.Depla, false, 15),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Condition(TypeCondition.DEATH, new Calculable[] {
						new RegenEffect(TypeEffect.PV, true, 100, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, 100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de ténacité chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 8),
				new Effect(TypeEffect.ReducPtsP, false, 50),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique démoniaque chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 8),
				new Effect(TypeEffect.ReducPtsM, false, 150),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.CostComp, false, -66),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique épineuse chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Glace, false, 100),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique inchangée dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 19),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique morsure démoniaque chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.Foudre, false, 100),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique pacifique dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 19),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique renaissance dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 825),
				new Effect(TypeEffect.RegenPM, false, 825),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique sécurité dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 19),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique spirituelle dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 17),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique stabilisatrice dimensionnelle"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 19),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique tempêtueuse chaotique"); put(Language.EN, ""); }}, Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 9),
				new Effect(TypeEffect.IntComp, false, -10),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance d'Exorcisme"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Oxydoréduction"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Décomposition"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 5, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Lacs gelés"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Glace, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance des Moissonneurs"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de résonance des Nimbes sacrées"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Sacre, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Nuits éternelles"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Ombre, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Origines du monde"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 8, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Ouragans"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Nature, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Regards éteints"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 8, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Traqueurs"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Ciel rebelle"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Foudre, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Sprite de Feu"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Feu, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 11, true),
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 12, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 11, true),
				new Effect(TypeEffect.VOL, false, 8, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bête"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 11, true),
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 5"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 11, true),
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 11, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 9, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
				new Effect(TypeEffect.VOL, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Foudre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Glace, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Feu, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sacrée"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Sacre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Ombre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 4"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 3"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 2"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'endurance - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 12),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'endurance antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 9),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Endurance Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 14),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'endurance standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 13),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'ingénierie - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'ingénierie antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 7),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Ingénierie Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 12),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'ingénierie standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 11),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de défense - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 9),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de défense antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 6),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Défense Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 10),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de défense standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 10),
				new Effect(TypeEffect.Nature, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de forteresse - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 9),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de forteresse antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Forteresse Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 10),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de forteresse standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 10),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Éclair Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 12),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 11),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique inchangée - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 14),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique inchangée antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 11),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Inchangée Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 15),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique inchangée standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 15),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique pacifique - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 14),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique pacifique antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 11),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Pacifique Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 15),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique pacifique standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 15),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique renaissance - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 625),
				new Effect(TypeEffect.RegenPM, false, 625),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique renaissance antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 575),
				new Effect(TypeEffect.RegenPM, false, 575),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Renaissance Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 750),
				new Effect(TypeEffect.RegenPM, false, 750),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique renaissance standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 725),
				new Effect(TypeEffect.RegenPM, false, 725),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique sécurité - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 14),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique sécurité antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 11),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Sécurité Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 16),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique sécurité standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 15),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique spirituelle - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 12),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique spirituelle antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 9),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Spirituelle Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 14),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique spirituelle standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 13),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique stabilisatrice - Expert"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 14),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique stabilisatrice antique"); put(Language.EN, ""); }}, Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 11),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Stabilisatrice Intermédiaire"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 16),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique stabilisatrice standard"); put(Language.EN, ""); }}, Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 15),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Éradicateur d'Humanoïdes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance de l'Exorciste de Démons 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Briseur d'Élémentaires 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Chasseur de Bêtes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Faucheur de Plantes 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Fusionneur de Métal 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance du Purificateur de Morts-Vivants 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Foudroyante 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "blue1", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Glacée 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "white1", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Incendiaire 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "orange1", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Lumineuse 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Naturelle 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "green1", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Perle de Résonance Sombre 1"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "black1", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Endurance du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'endurance spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 7),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Ingénierie du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 9),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'ingénierie spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Défense du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 8),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de défense spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 4),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Forteresse du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 8),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de forteresse spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 4),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Éclair du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique éclair spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Inchangée du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 12),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique inchangée spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 9),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Pacifique du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 12),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique pacifique spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 9),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Renaissance du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 500),
				new Effect(TypeEffect.RegenPM, false, 500),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique renaissance spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 525),
				new Effect(TypeEffect.RegenPM, false, 525),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Sécurité du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique sécurité spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Spirituelle du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique spirituelle spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 7),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Stabilisatrice du Débutant"); put(Language.EN, ""); }}, Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique stabilisatrice spéciale"); put(Language.EN, ""); }}, Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 9),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Endurance de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique d'Ingénierie de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Défense de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 6),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique de Forteresse de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Éclair de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 4),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Inchangée de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Pacifique de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 8),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Renaissance de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 250),
				new Effect(TypeEffect.RegenPM, false, 250),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Sécurité de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Spirituelle de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Pierre runique Stabilisatrice de Base"); put(Language.EN, ""); }}, Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 8),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
		};
	}
	
	static Pearl[] getWeaponCost() {
		return new Pearl[] {
			new Pearl(),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Brillante Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme des Neiges Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Néant Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Éclair Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Féroce Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Tourbillon Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 315),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur d'Atômes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur d'Esprits Maléfiques"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Machines"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Magie"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Pitié"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Sagesse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 255),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 195),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 165),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Émeraude"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Ewan"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Houdini"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Illania"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Opale"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Affaiblisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 150),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Babama"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Bonne Alice"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Boxe Française"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Boxe Thaï"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Catch Américain"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Chuck Norris"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Diamant"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Fistandantilus"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Henri Potier"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Pamela Anderson"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Perle Noire"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Poésie Magique"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Quatrain Magique"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Quill"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de R. Balboa"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Rime Magique"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Rubis"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Saphir"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 90),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Siropas"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 225),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de l'Aube"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de l'Ombre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de la Foudre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de la Nature"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites des Flammes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites des Glaces"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 135),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau Épique d'Augmentation de Sorcellerie"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau Épique d'Explosion de Force"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau Épique de Charge"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.9),
				new Effect(TypeEffect.DCCP, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau Épique de Force Brute"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau Épique de Jugement Sacré"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.9),
				new Effect(TypeEffect.DCCM, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Algèbre Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Arithmétique Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Art Martial"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.2),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Escarmouche"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Étincelle Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Bagarre"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Bataille Rangée"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Bras de Fer"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Combat"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.1),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Duel Élégant"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Goutte Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Bêtes"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Démons"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Élémentaires"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Humains"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Métaux"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Morts"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Plantes"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 75),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Éclat de l'Aube"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "yellow3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Éther Brumeux"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "black3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de la Douceur Estivale"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "green3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Maître Martial"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Mélodie Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Note de Sorcellerie"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Physique Quantique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Source de Sorcellerie"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.1),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Symphonie Magique"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.2),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Troisième Dan"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Flammes du Brasier"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "orange3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Givre du Matin"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "cyan3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 45),
				}),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Électrique Pur"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "blue3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 45),
				}),
			}),
		};
	}
	
	static Pearl[] getArmorCost() {
		return new Pearl[] {
			new Pearl(),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Brillante Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Sacre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme des Neiges Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Glace, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme du Néant Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Ombre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Éclair Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Foudre, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Féroce Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Feu, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Gemme Tourbillon Radieuse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur d'Atômes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur d'Esprits Maléfiques"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 10, true),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.AGI, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Machines"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Pitié"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.VIT, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Rayonnance Anéantisseur de Sagesse"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Affaiblisseur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 7, true),
				new Effect(TypeEffect.VOL, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.INT, false, 7, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.AGI, false, 7, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Anéantisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur d'Élémentaires"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur d'Humains"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Bêtes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Démons"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Métaux"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Morts"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Combatteur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 6, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Émeraude"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Ewan"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Illania"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance d'Opale"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue4", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Affaiblisseur de Plantes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 4, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Babama"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Bonne Alice"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Diamant"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Perle Noire"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Quill"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Rubis"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Saphir"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de Siropas"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de l'Aube"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de l'Ombre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de la Foudre"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites de la Nature"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites des Flammes"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Sprites des Glaces"); put(Language.EN, ""); }}, Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Bêtes"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Démons"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Élémentaires"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Humains"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Métaux"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Morts"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 1, true),
				new Effect(TypeEffect.VOL, false, 1, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Appel des Plantes"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Éclat de l'Aube"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de l'Éther Brumeux"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance de la Douceur Estivale"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance des Flammes du Brasier"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance du Givre du Matin"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Pearl(new HashMap<Language, String>() {{ put(Language.FR, "Joyau de Résonance Électrique Pur"); put(Language.EN, ""); }}, Quality.GREEN, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
			}),
		};
	}
}
