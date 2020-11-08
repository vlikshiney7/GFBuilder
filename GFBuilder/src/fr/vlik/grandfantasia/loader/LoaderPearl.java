package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.Effect.Target;

public class LoaderPearl {
	
	static Pearl[] getWeapon() {
		return new Pearl[] {
			new Pearl("Pierre runique d'Attaque supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Enfermement", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -30),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Brèche", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, false, 100, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Brutalité", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Magie", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 30),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Métamorphose", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Précision", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Sceau", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(5, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill),
					new StaticEffect(TypeStaticEffect.AntiHeal),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes supérieure", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 12),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Limbes", Quality.GOLD, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique corrompue royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 5),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique corrompue vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
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
			new Pearl("Pierre runique d'Attaque dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'Éruption dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'Estompement dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -28),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'Incantation dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de brèche royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, 5, new Calculable[] {
					new Effect(TypeEffect.DefP, false, -100, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl("Pierre runique de brèche vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
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
			new Pearl("Pierre runique de brutalité royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de brutalité vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPtsM, false, 200),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.FCE, false, 200, true),
					new Effect(TypeEffect.VitAtk, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de cage royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove),
					new StaticEffect(TypeStaticEffect.NoSkill),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de cage vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, 100),
				new Proc(15, Activation.Attack, 2, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMove),
					new StaticEffect(TypeStaticEffect.NoSkill),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de Contrôle dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de cruauté absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill),
					new StaticEffect(TypeStaticEffect.AntiHeal),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de cruauté prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill),
					new StaticEffect(TypeStaticEffect.AntiHeal),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de destruction absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.DegAtkM, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl("Pierre runique de destruction prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 10),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 50),
					new Effect(TypeEffect.DegAtkM, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 300),
				}),
			}),
			new Pearl("Pierre runique de Force dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 300),
				}),
			}),
			new Pearl("Pierre runique de magie royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl("Pierre runique de magie vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -15),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.INT, false, 200, true),
					new Effect(TypeEffect.VitComp, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 300),
				}),
			}),
			new Pearl("Pierre runique de Menace dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 28),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl("Pierre runique de métamorphose royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de métamorphose vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Transfo),
				}),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 15),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de passion absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.ESQ, true, 50),
					new Effect(TypeEffect.DCCP, false, 100),
					new Effect(TypeEffect.DCCM, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl("Pierre runique de passion prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
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
			new Pearl("Pierre runique de précision royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de précision vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Proc(20, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.DCCP, false, 100),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de restreinte absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -90, Target.OPPONENT),
					new Effect(TypeEffect.DefP, false, -500, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de restreinte prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new StaticEffect(TypeStaticEffect.AntiStun),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -90, Target.OPPONENT),
					new Effect(TypeEffect.DefP, false, -500, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de sceau royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(10, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill),
					new StaticEffect(TypeStaticEffect.AntiHeal),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de sceau vindicateur", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.HealR, false, 10),
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoSkill),
					new StaticEffect(TypeStaticEffect.AntiHeal),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
			}),
			new Pearl("Pierre runique de Visée dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 300),
				}),
			}),
			new Pearl("Pierre runique des Arcanes dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 300),
				}),
			}),
			new Pearl("Pierre runique des limbes royales", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Proc(15, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl("Pierre runique des limbes vindicatrices", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Proc(20, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 300),
				}),
			}),
			new Pearl("Pierre runique du dévoreur absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 50),
					new Effect(TypeEffect.VitAtkD, false, 50),
					new Effect(TypeEffect.DegAtk, false, 200),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl("Pierre runique du dévoreur prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
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
			new Pearl("Pierre runique du faucon absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Proc(10, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 50),
					new Effect(TypeEffect.TCCP, false, 50),
					new Effect(TypeEffect.TCCM, false, 50),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl("Pierre runique du faucon prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
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
			new Pearl("Pierre runique rouillée royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 5),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique rouillée vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 10),
				new Effect(TypeEffect.ReducPtsM, false, 200),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 300),
				}),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 300),
				}),
			}),
			new Pearl("Joyau de résonance d'Exorcisme", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance d'Oxydoréduction", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance de Décomposition", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance des Lacs gelés", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 50),
				}),
			}),
			new Pearl("Joyau de résonance des Moissonneurs", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 65),
				}),
			}),
			new Pearl("Joyau de résonance des Nimbes sacrées", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 50),
				}),
			}),
			new Pearl("Joyau de Résonance des Nuits éternelles", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 50),
				}),
			}),
			new Pearl("Joyau de Résonance des Origines du monde", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance des Ouragans", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 50),
				}),
			}),
			new Pearl("Joyau de Résonance des Regards éteints", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance des Traqueurs", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 65),
				}),
			}),
			new Pearl("Joyau de Résonance du Ciel rebelle", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 50),
				}),
			}),
			new Pearl("Joyau de Résonance du Sprite de Feu", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 6),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.8),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.2),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.8),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.2),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.9),
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 5", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.9),
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 4", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 3", Quality.BLUE, null, true, "purple2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bête", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 5", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(6, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 85),
				}),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 65),
				}),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 55),
				}),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 50),
				}),
			}),
			new Pearl("Perle de Résonance Foudroyante", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Foudroyante 4", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 75),
				}),
			}),
			new Pearl("Perle de Résonance Foudroyante 3", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Foudroyante 2", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 30),
				}),
			}),
			new Pearl("Perle de Résonance Glacée", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Glacée 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 75),
				}),
			}),
			new Pearl("Perle de Résonance Glacée 3", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Glacée 2", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 30),
				}),
			}),
			new Pearl("Perle de Résonance Incendiaire", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Incendiaire 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 75),
				}),
			}),
			new Pearl("Perle de Résonance Incendiaire 3", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Incendiaire 2", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 30),
				}),
			}),
			new Pearl("Perle de Résonance Lumineuse 4", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 75),
				}),
			}),
			new Pearl("Perle de Résonance Lumineuse 3", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Lumineuse 2", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 30),
				}),
			}),
			new Pearl("Perle de Résonance Naturelle", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Naturelle 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Naturelle 3", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Naturelle 2", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 30),
				}),
			}),
			new Pearl("Perle de Résonance Sacrée", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Sombre", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Sombre 4", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 80),
				}),
			}),
			new Pearl("Perle de Résonance Sombre 3", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 45),
				}),
			}),
			new Pearl("Perle de Résonance Sombre 2", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 30),
				}),
			}),
			new Pearl("Pierre runique d'attaque - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Attaque antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Attaque intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'attaque standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'éruption - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'éruption standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'estompement - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -23),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -25),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'estompement standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -24),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'harmonie - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'harmonie standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'incantation - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'incantation standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique d'occultisme - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 13),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'occultisme standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 14),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de contrôle - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de contrôle standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl("Pierre runique de force - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de force standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 200),
				}),
			}),
			new Pearl("Pierre runique de menace - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 23),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 25),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de menace standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 24),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 200),
				}),
			}),
			new Pearl("Pierre runique de visée - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique de visée standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 200),
				}),
			}),
			new Pearl("Pierre runique des arcanes - Expert", Quality.BLUE, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 9),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes intermédiaire", Quality.BLUE, Quality.PURPLE, false, "blue2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique des arcanes standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 200),
				}),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 2", Quality.GREEN, null, true, "purple1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 25),
				}),
			}),
			new Pearl("Perle de Résonance Foudroyante 1", Quality.GREEN, null, true, "blue1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 15),
				}),
			}),
			new Pearl("Perle de Résonance Glacée 1", Quality.GREEN, null, true, "white1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 15),
				}),
			}),
			new Pearl("Perle de Résonance Incendiaire 1", Quality.GREEN, null, true, "orange1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 15),
				}),
			}),
			new Pearl("Perle de Résonance Lumineuse 1", Quality.GREEN, null, true, "yellow1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 15),
				}),
			}),
			new Pearl("Perle de Résonance Naturelle 1", Quality.GREEN, null, true, "green1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 15),
				}),
			}),
			new Pearl("Perle de Résonance Sombre 1", Quality.GREEN, null, true, "black1", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 15),
				}),
			}),
			new Pearl("Pierre runique d'Attaque du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Attaque spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 11),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 20),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 18),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes du débutant", Quality.GREEN, Quality.PURPLE, false, "green2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Perle de Résonance d'Aggravation Magique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl("Perle de Résonance d'Aggravation Physique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl("Perle de Résonance d'Amplitude Magique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
			}),
			new Pearl("Perle de Résonance d'Amplitude Physique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
			}),
			new Pearl("Perle de Résonance d'Optimisation Magique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.2),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl("Perle de Résonance d'Optimisation Physique 1", Quality.WHITE, null, true, "purple0", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.2),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl("Pierre runique d'Attaque standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Éruption standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Estompement standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Harmonie standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Incantation standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique d'Occultisme standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Contrôle standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Force standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Menace standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 15),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 100),
				}),
			}),
			new Pearl("Pierre runique de Visée standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 100),
				}),
			}),
			new Pearl("Pierre runique des Arcanes standard ", Quality.WHITE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 6),
				new Proc(3.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 100),
				}),
			}),
		};
	}
	
	static Pearl[] getArmor() {
		return new Pearl[] {
			new Pearl("Pierre runique d'Endurance Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 18),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'Ingénierie Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 18),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique de Défense Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de Forteresse Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 15),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Éclair Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Inchangée Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 20),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique Pacifique Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 20),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique de Renaissance Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 999),
				new Effect(TypeEffect.RegenPM, false, 999),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique de Sécurité Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 20),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Spirituelle Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 18),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Stabilisatrice Supérieure", Quality.GOLD, Quality.PURPLE, false, "purple1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'armure absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl("Pierre runique d'armure prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.Glace, false, 300),
				new Proc(10, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 30),
				}),
			}),
			new Pearl("Pierre runique d'Armure Chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.Sacre, false, 100),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 50, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl("Pierre runique d'enchevêtrement royale", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 10),
				new Effect(TypeEffect.ReducPeneM, false, 10),
			}),
			new Pearl("Pierre runique d'enchevêtrement vindicatrice", Quality.ORANGE, Quality.PURPLE, false, "yellow2", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 20),
				new Effect(TypeEffect.ReducPeneM, false, 20),
				new Effect(TypeEffect.Ombre, false, 300),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 100, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl("Pierre runique d'endurance dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 17),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl("Pierre runique d'ingénierie dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl("Pierre runique de bénédiction absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Dispel),
				}),
			}),
			new Pearl("Pierre runique de bénédiction prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Feu, false, 300),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Dispel),
				}),
			}),
			new Pearl("Pierre runique de constance chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 12),
				new Effect(TypeEffect.HealR, false, 5),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique de défense dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 14),
				new Effect(TypeEffect.Nature, false, 200),
			}),
			new Pearl("Pierre runique de distance chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 12),
				new Effect(TypeEffect.HealR, false, 5),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique de forteresse dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 14),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl("Pierre runique de frontière absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 10),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl("Pierre runique de frontière prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 10),
				new Effect(TypeEffect.Foudre, false, 300),
				new Proc(10, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 30),
				}),
			}),
			new Pearl("Pierre runique de guérison de l'âme chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 500),
				new Effect(TypeEffect.RegenPM, false, 500),
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique de lorica absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.RDCCM, false, 50),
				}),
			}),
			new Pearl("Pierre runique de lorica prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, 500),
				new Effect(TypeEffect.ReducPtsM, false, 500),
				new Effect(TypeEffect.Ombre, false, 300),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 50),
					new Effect(TypeEffect.RDCCM, false, 50),
				}),
			}),
			new Pearl("Pierre runique de méditation chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.Ombre, false, 100),
				new Proc(30, Activation.Attacked, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PM, false, 10, TypeRegen.REGENERATION, 1),
				}),
			}),
			new Pearl("Pierre runique de renaissance absolue", Quality.ORANGE, Quality.RED, false, "absolue", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 200),
				new Proc(7, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiDeath),
				}),
			}),
			new Pearl("Pierre runique de renaissance prestigieuse", Quality.ORANGE, Quality.RED, false, "prestigieuse", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 300),
				new Effect(TypeEffect.Depla, false, 15),
				new Proc(15, Activation.Attack, 10, new Calculable[] {
					new StaticEffect(TypeStaticEffect.AntiDeath),
				}),
			}),
			new Pearl("Pierre runique de ténacité chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 8),
				new Effect(TypeEffect.ReducPtsP, false, 50),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique démoniaque chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 8),
				new Effect(TypeEffect.ReducPtsM, false, 150),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique éclair chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.CostComp, false, -66),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique éclair dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl("Pierre runique épineuse chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Glace, false, 100),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
				}),
			}),
			new Pearl("Pierre runique inchangée dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 19),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl("Pierre runique morsure démoniaque chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.Foudre, false, 100),
				new Proc(20, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			}),
			new Pearl("Pierre runique pacifique dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 19),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl("Pierre runique renaissance dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 825),
				new Effect(TypeEffect.RegenPM, false, 825),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl("Pierre runique sécurité dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 19),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl("Pierre runique spirituelle dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 17),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl("Pierre runique stabilisatrice dimensionnelle", Quality.ORANGE, Quality.PURPLE, false, "purple2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 19),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl("Pierre runique tempêtueuse chaotique", Quality.ORANGE, Quality.PURPLE, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 9),
				new Effect(TypeEffect.IntComp, false, -10),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Joyau de résonance d'Exorcisme", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Joyau de Résonance d'Oxydoréduction", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Joyau de Résonance de Décomposition", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 5, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl("Joyau de Résonance des Lacs gelés", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Glace, false, 5),
			}),
			new Pearl("Joyau de résonance des Moissonneurs", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8, true),
			}),
			new Pearl("Joyau de résonance des Nimbes sacrées", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Sacre, false, 5),
			}),
			new Pearl("Joyau de Résonance des Nuits éternelles", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Ombre, false, 5),
			}),
			new Pearl("Joyau de Résonance des Origines du monde", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 8, true),
			}),
			new Pearl("Joyau de Résonance des Ouragans", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Nature, false, 5),
			}),
			new Pearl("Joyau de Résonance des Regards éteints", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 8, true),
			}),
			new Pearl("Joyau de Résonance des Traqueurs", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
			}),
			new Pearl("Joyau de Résonance du Ciel rebelle", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Foudre, false, 5),
			}),
			new Pearl("Joyau de Résonance du Sprite de Feu", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.Feu, false, 5),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 11, true),
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 12, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 11, true),
				new Effect(TypeEffect.VOL, false, 8, true),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bête", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 11, true),
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 5", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 11, true),
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 6, true),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 11, true),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 9, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 4", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 3", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
				new Effect(TypeEffect.VOL, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 2", Quality.BLUE, null, true, "red2", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl("Perle de Résonance Foudroyante", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Foudre, false, 8),
			}),
			new Pearl("Perle de Résonance Foudroyante 4", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl("Perle de Résonance Foudroyante 3", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl("Perle de Résonance Foudroyante 2", Quality.BLUE, null, true, "blue2", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl("Perle de Résonance Glacée", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Glace, false, 8),
			}),
			new Pearl("Perle de Résonance Glacée 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl("Perle de Résonance Glacée 3", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl("Perle de Résonance Glacée 2", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl("Perle de Résonance Incendiaire", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Feu, false, 8),
			}),
			new Pearl("Perle de Résonance Incendiaire 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl("Perle de Résonance Incendiaire 3", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl("Perle de Résonance Incendiaire 2", Quality.BLUE, null, true, "orange2", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl("Perle de Résonance Lumineuse 4", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl("Perle de Résonance Lumineuse 3", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl("Perle de Résonance Lumineuse 2", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl("Perle de Résonance Naturelle", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Pearl("Perle de Résonance Naturelle 4", Quality.BLUE, null, true, "white2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl("Perle de Résonance Naturelle 3", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl("Perle de Résonance Naturelle 2", Quality.BLUE, null, true, "green2", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl("Perle de Résonance Sacrée", Quality.BLUE, null, true, "yellow2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Sacre, false, 8),
			}),
			new Pearl("Perle de Résonance Sombre", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.Ombre, false, 8),
			}),
			new Pearl("Perle de Résonance Sombre 4", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl("Perle de Résonance Sombre 3", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl("Perle de Résonance Sombre 2", Quality.BLUE, null, true, "black2", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl("Pierre runique d'endurance - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 12),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'endurance antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 9),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'Endurance Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 14),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'endurance standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 13),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl("Pierre runique d'ingénierie - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'ingénierie antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 7),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'Ingénierie Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 12),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'ingénierie standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 11),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl("Pierre runique de défense - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 9),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de défense antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 6),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de Défense Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 10),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de défense standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 10),
				new Effect(TypeEffect.Nature, false, 200),
			}),
			new Pearl("Pierre runique de forteresse - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 9),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique de forteresse antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique de Forteresse Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 10),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique de forteresse standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 10),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl("Pierre runique éclair - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique éclair antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Éclair Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 12),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique éclair standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 11),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl("Pierre runique inchangée - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 14),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique inchangée antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 11),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique Inchangée Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 15),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique inchangée standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 15),
				new Effect(TypeEffect.Sacre, false, 200),
			}),
			new Pearl("Pierre runique pacifique - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 14),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique pacifique antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 11),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Pacifique Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 15),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique pacifique standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 15),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl("Pierre runique renaissance - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 625),
				new Effect(TypeEffect.RegenPM, false, 625),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique renaissance antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 575),
				new Effect(TypeEffect.RegenPM, false, 575),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Renaissance Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 750),
				new Effect(TypeEffect.RegenPM, false, 750),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique renaissance standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 725),
				new Effect(TypeEffect.RegenPM, false, 725),
				new Effect(TypeEffect.Feu, false, 200),
			}),
			new Pearl("Pierre runique sécurité - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 14),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique sécurité antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 11),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Sécurité Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 16),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique sécurité standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 15),
				new Effect(TypeEffect.Glace, false, 200),
			}),
			new Pearl("Pierre runique spirituelle - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 12),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique spirituelle antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 9),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Spirituelle Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 14),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique spirituelle standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 13),
				new Effect(TypeEffect.Ombre, false, 200),
			}),
			new Pearl("Pierre runique stabilisatrice - Expert", Quality.BLUE, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 14),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique stabilisatrice antique", Quality.BLUE, null, false, "orange2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 11),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique Stabilisatrice Intermédiaire", Quality.BLUE, Quality.PURPLE, false, "orange1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 16),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique stabilisatrice standard", Quality.BLUE, Quality.PURPLE, false, "white2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 15),
				new Effect(TypeEffect.Foudre, false, 200),
			}),
			new Pearl("Perle de Résonance de l'Éradicateur d'Humanoïdes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 3, true),
			}),
			new Pearl("Perle de Résonance de l'Exorciste de Démons 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 1, true),
			}),
			new Pearl("Perle de Résonance du Briseur d'Élémentaires 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Chasseur de Bêtes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Faucheur de Plantes 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new Pearl("Perle de Résonance du Fusionneur de Métal 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl("Perle de Résonance du Purificateur de Morts-Vivants 1", Quality.GREEN, null, true, "red1", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 1, true),
			}),
			new Pearl("Perle de Résonance Foudroyante 1", Quality.GREEN, null, true, "blue1", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
			}),
			new Pearl("Perle de Résonance Glacée 1", Quality.GREEN, null, true, "white1", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Pearl("Perle de Résonance Incendiaire 1", Quality.GREEN, null, true, "orange1", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 2),
			}),
			new Pearl("Perle de Résonance Lumineuse 1", Quality.GREEN, null, true, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 2),
			}),
			new Pearl("Perle de Résonance Naturelle 1", Quality.GREEN, null, true, "green1", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
			}),
			new Pearl("Perle de Résonance Sombre 1", Quality.GREEN, null, true, "black1", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 2),
			}),
			new Pearl("Pierre runique d'Endurance du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'endurance spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 7),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'Ingénierie du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 9),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'ingénierie spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique de Défense du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 8),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de défense spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 4),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de Forteresse du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 8),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique de forteresse spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 4),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Éclair du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique éclair spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Inchangée du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 12),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique inchangée spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 9),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique Pacifique du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 12),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique pacifique spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 9),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Renaissance du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 500),
				new Effect(TypeEffect.RegenPM, false, 500),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique renaissance spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 525),
				new Effect(TypeEffect.RegenPM, false, 525),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Sécurité du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique sécurité spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Spirituelle du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique spirituelle spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.PM, true, 7),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Stabilisatrice du Débutant", Quality.GREEN, Quality.PURPLE, false, "yellow1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique stabilisatrice spéciale", Quality.GREEN, null, false, "black2", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 9),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique d'Endurance de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique d'Ingénierie de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
			new Pearl("Pierre runique de Défense de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 6),
				new Effect(TypeEffect.Nature, false, 100),
			}),
			new Pearl("Pierre runique de Forteresse de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Éclair de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 4),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Inchangée de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.Sacre, false, 100),
			}),
			new Pearl("Pierre runique Pacifique de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 8),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Renaissance de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.RegenPV, false, 250),
				new Effect(TypeEffect.RegenPM, false, 250),
				new Effect(TypeEffect.Feu, false, 100),
			}),
			new Pearl("Pierre runique Sécurité de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.Glace, false, 100),
			}),
			new Pearl("Pierre runique Spirituelle de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.PM, true, 6),
				new Effect(TypeEffect.Ombre, false, 100),
			}),
			new Pearl("Pierre runique Stabilisatrice de Base", Quality.WHITE, Quality.PURPLE, false, "green1", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 8),
				new Effect(TypeEffect.Foudre, false, 100),
			}),
		};
	}
	
	static Pearl[] getWeaponCost() {
		return new Pearl[] {
			new Pearl(),
			new Pearl("Gemme Brillante Radieuse", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 315),
				}),
			}),
			new Pearl("Gemme des Neiges Radieuse", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 315),
				}),
			}),
			new Pearl("Gemme du Néant Radieuse", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 315),
				}),
			}),
			new Pearl("Gemme Éclair Radieuse", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 315),
				}),
			}),
			new Pearl("Gemme Féroce Radieuse", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 315),
				}),
			}),
			new Pearl("Gemme Tourbillon Radieuse", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 315),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur d'Atômes", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur d'Esprits Maléfiques", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Bêtes", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Machines", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Magie", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.8),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Pitié", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Plantes", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 255),
				}),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Sagesse", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 255),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur d'Élémentaires", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur d'Humains", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Bêtes", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Démons", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Métaux", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Morts", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur d'Élémentaires", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur d'Humains", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Bêtes", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Démons", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Métaux", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Morts", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Plantes", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 195),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur d'Élémentaires", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur d'Humains", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur de Bêtes", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur de Démons", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur de Métaux", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur de Morts", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance Combatteur de Plantes", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 165),
				}),
			}),
			new Pearl("Joyau de Résonance d'Émeraude", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance d'Ewan", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance d'Houdini", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new Pearl("Joyau de Résonance d'Illania", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance d'Opale", Quality.BLUE, null, true, "blue4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance de Affaiblisseur de Plantes", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 150),
				}),
			}),
			new Pearl("Joyau de Résonance de Babama", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance de Bonne Alice", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance de Boxe Française", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Pearl("Joyau de Résonance de Boxe Thaï", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
			}),
			new Pearl("Joyau de Résonance de Catch Américain", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl("Joyau de Résonance de Chuck Norris", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new Pearl("Joyau de Résonance de Diamant", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance de Fistandantilus", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Pearl("Joyau de Résonance de Henri Potier", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
				new Effect(TypeEffect.DCCM, false, 4),
			}),
			new Pearl("Joyau de Résonance de Pamela Anderson", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
				new Effect(TypeEffect.DCCP, false, 4),
			}),
			new Pearl("Joyau de Résonance de Perle Noire", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance de Poésie Magique", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl("Joyau de Résonance de Quatrain Magique", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Pearl("Joyau de Résonance de Quill", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance de R. Balboa", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Pearl("Joyau de Résonance de Rime Magique", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Pearl("Joyau de Résonance de Rubis", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance de Saphir", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Proc(4, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 90),
				}),
			}),
			new Pearl("Joyau de Résonance de Siropas", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(2.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 225),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites de l'Aube", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 135),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites de l'Ombre", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 135),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites de la Foudre", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 135),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites de la Nature", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 135),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites des Flammes", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 135),
				}),
			}),
			new Pearl("Joyau de Résonance des Sprites des Glaces", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Proc(4.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 135),
				}),
			}),
			new Pearl("Joyau Épique d'Augmentation de Sorcellerie", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
			}),
			new Pearl("Joyau Épique d'Explosion de Force", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new Pearl("Joyau Épique de Charge", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.9),
				new Effect(TypeEffect.DCCP, false, 6),
			}),
			new Pearl("Joyau Épique de Force Brute", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.8),
			}),
			new Pearl("Joyau Épique de Jugement Sacré", Quality.BLUE, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.9),
				new Effect(TypeEffect.DCCM, false, 6),
			}),
			new Pearl("Joyau de Résonance d'Algèbre Magique", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Pearl("Joyau de Résonance d'Arithmétique Magique", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.7),
			}),
			new Pearl("Joyau de Résonance d'Art Martial", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.2),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl("Joyau de Résonance d'Escarmouche", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
			}),
			new Pearl("Joyau de Résonance d'Étincelle Magique", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
			}),
			new Pearl("Joyau de Résonance de Bagarre", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl("Joyau de Résonance de Bataille Rangée", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl("Joyau de Résonance de Bras de Fer", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.3),
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Pearl("Joyau de Résonance de Combat", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.1),
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Pearl("Joyau de Résonance de Duel Élégant", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
			}),
			new Pearl("Joyau de Résonance de Goutte Magique", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Bêtes", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Démons", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Élémentaires", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Humains", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Métaux", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Morts", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Plantes", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 75),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Éclat de l'Aube", Quality.GREEN, null, true, "yellow3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 45),
				}),
			}),
			new Pearl("Joyau de Résonance de l'Éther Brumeux", Quality.GREEN, null, true, "black3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 45),
				}),
			}),
			new Pearl("Joyau de Résonance de la Douceur Estivale", Quality.GREEN, null, true, "green3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 45),
				}),
			}),
			new Pearl("Joyau de Résonance de Maître Martial", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.7),
			}),
			new Pearl("Joyau de Résonance de Mélodie Magique", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl("Joyau de Résonance de Note de Sorcellerie", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.5),
			}),
			new Pearl("Joyau de Résonance de Physique Quantique", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.3),
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Pearl("Joyau de Résonance de Source de Sorcellerie", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.1),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl("Joyau de Résonance de Symphonie Magique", Quality.GREEN, null, true, "purple3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 0.2),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Pearl("Joyau de Résonance de Troisième Dan", Quality.GREEN, null, true, "purple4", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
			}),
			new Pearl("Joyau de Résonance des Flammes du Brasier", Quality.GREEN, null, true, "orange3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 45),
				}),
			}),
			new Pearl("Joyau de Résonance du Givre du Matin", Quality.GREEN, null, true, "cyan3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 45),
				}),
			}),
			new Pearl("Joyau de Résonance Électrique Pur", Quality.GREEN, null, true, "blue3", new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 45),
				}),
			}),
		};
	}
	
	static Pearl[] getArmorCost() {
		return new Pearl[] {
			new Pearl(),
			new Pearl("Gemme Brillante Radieuse", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Sacre, false, 8),
			}),
			new Pearl("Gemme des Neiges Radieuse", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Glace, false, 8),
			}),
			new Pearl("Gemme du Néant Radieuse", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Ombre, false, 8),
			}),
			new Pearl("Gemme Éclair Radieuse", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Foudre, false, 8),
			}),
			new Pearl("Gemme Féroce Radieuse", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Feu, false, 8),
			}),
			new Pearl("Gemme Tourbillon Radieuse", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur d'Atômes", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur d'Esprits Maléfiques", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 10, true),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Bêtes", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.AGI, false, 4, true),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Machines", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Pitié", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Plantes", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
				new Effect(TypeEffect.VIT, false, 4, true),
			}),
			new Pearl("Joyau de Rayonnance Anéantisseur de Sagesse", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur d'Élémentaires", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur d'Humains", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 4, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Bêtes", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Démons", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Métaux", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl("Joyau de Résonance Affaiblisseur de Morts", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Anéantisseur d'Élémentaires", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 7, true),
				new Effect(TypeEffect.VOL, false, 4, true),
			}),
			new Pearl("Joyau de Résonance Anéantisseur d'Humains", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.INT, false, 7, true),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Bêtes", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Démons", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Métaux", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.AGI, false, 7, true),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Morts", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Pearl("Joyau de Résonance Anéantisseur de Plantes", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Combatteur d'Élémentaires", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new Pearl("Joyau de Résonance Combatteur d'Humains", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new Pearl("Joyau de Résonance Combatteur de Bêtes", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
			}),
			new Pearl("Joyau de Résonance Combatteur de Démons", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new Pearl("Joyau de Résonance Combatteur de Métaux", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Combatteur de Morts", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl("Joyau de Résonance Combatteur de Plantes", Quality.BLUE, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 6, true),
			}),
			new Pearl("Joyau de Résonance d'Émeraude", Quality.BLUE, null, true, "green4", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl("Joyau de Résonance d'Ewan", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Pearl("Joyau de Résonance d'Illania", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Glace, false, 6),
			}),
			new Pearl("Joyau de Résonance d'Opale", Quality.BLUE, null, true, "blue4", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl("Joyau de Résonance de Affaiblisseur de Plantes", Quality.BLUE, null, true, "turquoise3", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 4, true),
			}),
			new Pearl("Joyau de Résonance de Babama", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Sacre, false, 6),
			}),
			new Pearl("Joyau de Résonance de Bonne Alice", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Nature, false, 6),
			}),
			new Pearl("Joyau de Résonance de Diamant", Quality.BLUE, null, true, "yellow4", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl("Joyau de Résonance de Perle Noire", Quality.BLUE, null, true, "black4", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl("Joyau de Résonance de Quill", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Foudre, false, 6),
			}),
			new Pearl("Joyau de Résonance de Rubis", Quality.BLUE, null, true, "orange4", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl("Joyau de Résonance de Saphir", Quality.BLUE, null, true, "cyan4", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl("Joyau de Résonance de Siropas", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
				new Effect(TypeEffect.Feu, false, 6),
			}),
			new Pearl("Joyau de Résonance des Sprites de l'Aube", Quality.BLUE, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Sacre, false, 4),
			}),
			new Pearl("Joyau de Résonance des Sprites de l'Ombre", Quality.BLUE, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Ombre, false, 4),
			}),
			new Pearl("Joyau de Résonance des Sprites de la Foudre", Quality.BLUE, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Foudre, false, 4),
			}),
			new Pearl("Joyau de Résonance des Sprites de la Nature", Quality.BLUE, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Pearl("Joyau de Résonance des Sprites des Flammes", Quality.BLUE, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Feu, false, 4),
			}),
			new Pearl("Joyau de Résonance des Sprites des Glaces", Quality.BLUE, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.Glace, false, 4),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Bêtes", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Démons", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 1, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Élémentaires", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Humains", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Métaux", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1, true),
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Morts", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.INT, false, 1, true),
				new Effect(TypeEffect.VOL, false, 1, true),
			}),
			new Pearl("Joyau de Résonance de l'Appel des Plantes", Quality.GREEN, null, true, "turquoise4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new Pearl("Joyau de Résonance de l'Éclat de l'Aube", Quality.GREEN, null, true, "yellow3", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 2),
			}),
			new Pearl("Joyau de Résonance de l'Éther Brumeux", Quality.GREEN, null, true, "black3", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 2),
			}),
			new Pearl("Joyau de Résonance de la Douceur Estivale", Quality.GREEN, null, true, "green3", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
			}),
			new Pearl("Joyau de Résonance des Flammes du Brasier", Quality.GREEN, null, true, "orange3", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 2),
			}),
			new Pearl("Joyau de Résonance du Givre du Matin", Quality.GREEN, null, true, "cyan3", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Pearl("Joyau de Résonance Électrique Pur", Quality.GREEN, null, true, "blue3", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
			}),
		};
	}
}
