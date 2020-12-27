package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Title;
import fr.vlik.grandfantasia.enums.NameTransform;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.TransformEffect;
import fr.vlik.grandfantasia.stats.TransformEffect.TypeTransformation;

public class LoaderTitle {
	
	static Title[] getTitle() {
		Title[] P8 = getP8();
		Title[] red = getRed();
		Title[] purple = getPurple();
		Title[] gold = getGold();
		Title[] orange = getOrange();
		Title[] blue = getBlue();
		Title[] green = getGreen();
		Title[] white = getWhite();
		
		Title[] result = new Title[P8.length + red.length + purple.length + gold.length + orange.length + blue.length + green.length + white.length];
		
		int i = 0;
		for(; i < P8.length; i++) {
			result[i] = P8[i];
		}

		for(int j = 0; j < red.length; i++, j++) {
			result[i] = red[j];
		}

		for(int j = 0; j < purple.length; i++, j++) {
			result[i] = purple[j];
		}
		
		for(int j = 0; j < gold.length; i++, j++) {
			result[i] = gold[j];
		}

		for(int j = 0; j < orange.length; i++, j++) {
			result[i] = orange[j];
		}
		
		for(int j = 0; j < blue.length; i++, j++) {
			result[i] = blue[j];
		}
		
		for(int j = 0; j < green.length; i++, j++) {
			result[i] = green[j];
		}
		
		for(int j = 0; j < white.length; i++, j++) {
			result[i] = white[j];
		}
		
		return result;
	}

	private static Title[] getP8() {
		return new Title[] {
			new Title("Âme Évolutive", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.Loot, false, 20),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Amour Éternel", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Artiste du Coup Critique", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 7),
				new Effect(TypeEffect.PM, true, 7),
				new Proc(100, Activation.Crit, 15, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 5),
					new Effect(TypeEffect.DCCM, false, 5),
				}),
			}),
			new Title("BANKAI", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Proc(100, Activation.CritPhys, 10, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 5),
					new Effect(TypeEffect.VitAtk, false, 7),
				}),
				new Proc(100, Activation.CritMag, 10, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 5),
					new Effect(TypeEffect.VitComp, false, 7),
				}),
			}),
			new Title("Chasseur de Primes", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.Loot, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.DCCP, false, 7),
				new Effect(TypeEffect.DCCM, false, 7),
			}),
			new Title("Cœur de Démon", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Proc(1, Activation.Attack, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform0),
				})
			}),
			new Title("Contremaître de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.PV, true, 6),
			}),
			new Title("Dernier Rempart", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.VIT, false, 15),
				new Proc(5, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -20, Target.OPPONENT),
				}),
			}),
			new Title("Dieu de la Guerre", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Proc(100, Activation.CritPhys, 15, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 5),
					new Effect(TypeEffect.VitAtk, false, 5),
				}),
				new Proc(100, Activation.CritMag, 15, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 5),
					new Effect(TypeEffect.VitComp, false, 5),
				}),
			}),
			new Title("Directeur de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.PV, true, 10),
			}),
			new Title("Disciple du Hokuto", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title("Feu Sacré", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.DCCM, false, 5),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Force de la Nature", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title("Force Titanesque", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 7),
				new Condition(TypeEffect.PV, 15, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 100),
					new Effect(TypeEffect.DefM, true, 100),
					new Effect(TypeEffect.Depla, false, 10),
				}),
			}),
			new Title("Génie Surdoué", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
			}),
			new Title("Grâce Divine", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Hakuna MataSprite", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.RDCCM, false, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Proc(1, Activation.Attacked, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform1),
				}),
			}),
			new Title("Héritage d'Ezio", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Depla, false, 5),
				new Proc(1, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -25, Target.OPPONENT),
					new RegenEffect(TypeEffect.PV, true, -2, TypeRegen.POISON, 3),
				}),
			}),
			new Title("Hors-la-loi", Quality.P8TITLE, 20, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Insulaire Populaire", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.ReducP, false, 2),
				new Effect(TypeEffect.ReducM, false, 2),
			}),
			new Title("Jiminy Cricket", Quality.P8TITLE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Maître d'Armes", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.Parade, false, 10),
				new Effect(TypeEffect.PM, false, -20),
				new StaticEffect(TypeStaticEffect.x2STD, 20),
			}),
			new Title("Maître de l'Île Populaire", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.ReducP, false, 4),
				new Effect(TypeEffect.ReducM, false, 4),
			}),
			new Title("Maître des Éléments", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.VitComp, false, 7),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.INT, false, 10),
			}),
			new Title("Maître du Donjon", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Loot, false, 20),
			}),
			new Title("Majordome de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.PV, true, 4),
			}),
			new Title("Manager de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.PV, true, 8),
			}),
			new Title("Miraculé des Sprites", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DegP, false, 5),
				new Effect(TypeEffect.DegM, false, 5),
				new Effect(TypeEffect.XP, false, 20),
				new Condition(TypeEffect.PV, 20, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
				}),
			}),
			new Title("Muraille Ultime", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new Title("Oeil de faucon", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.AGI, false, 10),
			}),
			new Title("Pirate des 7 mers", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 7),
				new Effect(TypeEffect.DCCM, false, 7),
				new Effect(TypeEffect.ESQ, true, 5),
				new Proc(1, Activation.Attacked, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
				}),
			}),
			new Title("Prince de Kaslow", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Title("Propriétaire Populaire de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ReducP, false, 3),
				new Effect(TypeEffect.ReducM, false, 3),
			}),
			new Title("Rage du Berserk", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.RegenCB, false, 5),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkD, false, 8),
			}),
			new Title("Roi des Ombres", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Title("Seigneur des Arcanes", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
			}),
			new Title("Seigneur Populaire de l'Île", Quality.P8TITLE, 15, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.ReducP, false, 5),
				new Effect(TypeEffect.ReducM, false, 5),
			}),
			new Title("Sprite Express", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkM, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Superhéros", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.ReducP, false, 5),
				new Effect(TypeEffect.ReducM, false, 5),
			}),
			new Title("Vétéran d'Élite", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, -5),
				new Effect(TypeEffect.AtkM, true, -5),
				new Effect(TypeEffect.VitComp, false, 7),
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.VitAtkD, false, 7),
			}),
			new Title("World Boss", Quality.P8TITLE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TITLEP8,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.XP, false, 10),
			}),
		};
	}

	private static Title[] getRed() {
		return new Title[] {
			new Title("Dompteur du domaine du chaos", Quality.RED, 70, true, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Éternel ressuscité", Quality.RED, 31, true, GradeName.NONE, new Tag[] {
				Tag.REINCA,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.VIT, false, 20),
				new Effect(TypeEffect.VOL, false, 20),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Gardien ressuscité", Quality.RED, 31, true, GradeName.NONE, new Tag[] {
				Tag.REINCA,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.VIT, false, 12),
				new Effect(TypeEffect.VOL, false, 12),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title("Le retour du fils des Sprites", Quality.RED, 31, true, GradeName.NONE, new Tag[] {
				Tag.REINCA,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title("Messager de l'espoir ressuscité", Quality.RED, 31, true, GradeName.NONE, new Tag[] {
				Tag.REINCA,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.Depla, false, 4),
			}),
		};
	}

	private static Title[] getPurple() {
		return new Title[] {
			new Title("Célèbre Duelliste", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title("Chasseur de Monstres - Champion", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkD, false, 8),
				new Effect(TypeEffect.VitAtkM, false, 8),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Chasseur de Monstres - Élite", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Chasseur de Monstres - Gladiateur", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 6),
				new Effect(TypeEffect.VitAtkD, false, 6),
				new Effect(TypeEffect.VitAtkM, false, 6),
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.ESQ, true, 4),
			}),
			new Title("Chasseur de Monstres - Mercenaire", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 2),
				new Effect(TypeEffect.VitAtkD, false, 2),
				new Effect(TypeEffect.VitAtkM, false, 2),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 2),
			}),
			new Title("Couple Béni par le Roi des Sprites", Quality.PURPLE, 20, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
			}),
			new Title("Dompteur de Monstres - Champion", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 5),
				new Effect(TypeEffect.ReducM, false, 5),
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new Title("Dompteur de Monstres - Élite", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 3),
				new Effect(TypeEffect.ReducM, false, 3),
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title("Dompteur de Monstres - Gladiateur", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 4),
				new Effect(TypeEffect.ReducM, false, 4),
				new Effect(TypeEffect.DCCP, false, 8),
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title("Dompteur de Monstres - Mercenaire", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 2),
				new Effect(TypeEffect.ReducM, false, 2),
				new Effect(TypeEffect.DCCP, false, 4),
				new Effect(TypeEffect.DCCM, false, 4),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title("Encyclopédie Sprite", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.PV, true, 10),
			}),
			new Title("Expert en Duels", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title("Gladiateur Champion", Quality.PURPLE, 21, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Gladiateur Émergeant", Quality.PURPLE, 21, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Illustre Messager des Sprites", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Maître des Duels", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.TCCP, false, 4),
				new Effect(TypeEffect.TCCM, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new Title("Maître Gladiateur", Quality.PURPLE, 21, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.ESQ, true, 4),
			}),
			new Title("Roi des Duels", Quality.PURPLE, 31, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Roi Gladiateur", Quality.PURPLE, 21, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 8),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.AtkM, true, 8),
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.TCCP, false, 0.8),
				new Effect(TypeEffect.TCCM, false, 0.8),
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Star des Gladiateurs", Quality.PURPLE, 21, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ESQ, true, -2),
			}),
			new Title("Traqueur de Monstres - Champion", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
				new Effect(TypeEffect.VitAtkM, false, 5),
				new Effect(TypeEffect.Toucher, false, 9),
			}),
			new Title("Traqueur de Monstres - Élite", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 4),
				new Effect(TypeEffect.DCCM, false, 4),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitAtkM, false, 3),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title("Traqueur de Monstres - Gladiateur", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Toucher, false, 7),
			}),
			new Title("Traqueur de Monstres - Mercenaire", Quality.PURPLE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
				new Effect(TypeEffect.DCCM, false, 2),
				new Effect(TypeEffect.VitAtk, false, 2),
				new Effect(TypeEffect.VitAtkD, false, 2),
				new Effect(TypeEffect.VitAtkM, false, 2),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
		};
	}

	private static Title[] getGold() {
		return new Title[] {
			new Title("Braconnier suprême", Quality.GOLD, 96, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title("Consul de Mosunk", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdBa, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title("Cupidon Amoureux", Quality.GOLD, 5, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform3),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Défenseur des Glaces d'Ilannia", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdHa2M, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 50),
				}),
			}),
			new Title("Délégué de Quayle", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdEp, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 50),
				}),
			}),
			new Title("Diplomate de Siropas", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdMa, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 50),
				}),
			}),
			new Title("Dompteur de WorldBoss", Quality.GOLD, 170, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
			}),
			new Title("Élu de Bodor", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.Parade, false, 5),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title("Émissaire d'Ewan", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdHa, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 50),
				}),
			}),
			new Title("Envoyé d'Alice", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdArc, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 50),
				}),
			}),
			new Title("Explorateur du Cauchemar du Marin", Quality.GOLD, 183, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.Toucher, false, -8),
			}),
			new Title("Favori de Bahadolo", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdMa, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title("Force Brute", Quality.GOLD, 170, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
			}),
			new Title("Gardien des Secrets", Quality.GOLD, 66, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform4),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Gardien du Royaume de Saphaël", Quality.GOLD, 0, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStd, false, 2),
				new Effect(TypeEffect.PV, true, 5),
			}),
			new Title("Génie de Freyja", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.VitComp, false, 5),
			}),
			new Title("Gladiateur de l'Épreuve sans fin", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.ESQ, true, 6),
			}),
			new Title("Golem-Tanker", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
			}),
			new Title("Grand Amiral de la Marine", Quality.GOLD, 183, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.Toucher, false, -8),
			}),
			new Title("Héraut de Smulca", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdHa2M, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title("Lien Éternel", Quality.GOLD, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION, 10),
			}),
			new Title("Lumière Divine", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title("Maître du Destin", Quality.GOLD, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 100),
				new Effect(TypeEffect.PM, false, -100),
			}),
			new Title("Mandataire de Jundo", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -3),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 50),
				}),
			}),
			new Title("Membre honoraire Éternel Gélapin", Quality.GOLD, 95, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 400),
				new Effect(TypeEffect.PM, false, 400),
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Messager d'Eugénie", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Passion durable", Quality.GOLD, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 9),
				new Effect(TypeEffect.DCCM, false, 9),
				new Effect(TypeEffect.TCCP, false, 9),
				new Effect(TypeEffect.TCCM, false, 9),
			}),
			new Title("Pêcheur de Piranhas", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
			}),
			new Title("Porte-parole de Ronto", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, new Calculable[] {
				new Effect(TypeEffect.DegStdGun, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title("Roi des Sprites Sage", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.PV, true, 8),
			}),
			new Title("Super Lumière Divine sans fin", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.VitAtkD, false, 12),
				new Effect(TypeEffect.VitComp, false, 12),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title("Survivant du Dédale", Quality.GOLD, 31, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform5),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Témoin des Pensées de la Reine de la Forêt", Quality.GOLD, 71, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 10000),
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.DefM, true, 10),
				new Effect(TypeEffect.Depla, false, -30),
			}),
			new Title("Vainqueur de la Grande Guerre", Quality.GOLD, 1, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.HealR, false, 5),
				new Proc(5, Activation.Attacked, 12, new Calculable[] {
					new Effect(TypeEffect.ReducPeneP, false, 50),
					new Effect(TypeEffect.ReducPeneM, false, 50),
				}),
			}),
		};
	}

	private static Title[] getOrange() {
		return new Title[] {
			new Title("Achevez le tour 60 du Pandemonium.", Quality.ORANGE, 86, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.VitAtk, false, -3),
				new Effect(TypeEffect.VitComp, false, -3),
			}),
			new Title("Âme de Galvatron", Quality.ORANGE, 186, false, GradeName.DEMOLISSEUR, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title("Âme de Mégatron", Quality.ORANGE, 186, false, GradeName.METALLEUX, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 30),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title("Analyseur du Pays Arc-en-Ciel", Quality.ORANGE, 91, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 2),
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Athée de Carso", Quality.ORANGE, 96, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 1000),
				new Effect(TypeEffect.PM, false, 1000),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new Title("Bourreau du chaos spatio-temporel", Quality.ORANGE, 31, false, GradeName.NONE, new Tag[] {
				Tag.TDB,
			}, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 7),
				new Effect(TypeEffect.PeneM, false, 7),
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title("Briseur de Dimension déformée", Quality.ORANGE, 96, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefP, true, -7),
				new Effect(TypeEffect.DefM, true, -7),
				new Proc(25, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 1000),
				}),
			}),
			new Title("Champion en 10 Rounds de Pandemonium", Quality.ORANGE, 61, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title("Champion en 20 Rounds de Pandemonium", Quality.ORANGE, 61, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.TCCM, false, -3),
			}),
			new Title("Champion en 30 Rounds de Pandemonium", Quality.ORANGE, 61, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title("Champion en 45 Rounds du Pandemonium", Quality.ORANGE, 75, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title("Dominateur de Kaslow Bouillonnante", Quality.ORANGE, 186, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 8),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new Title("Équipe Trésor de la Forêt", Quality.ORANGE, 71, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 30),
			}),
			new Title("Évolution du gourou", Quality.ORANGE, 86, false, GradeName.CHRONODERIVEUR, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
				new Proc(100, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 80),
				}),
			}),
			new Title("Exorciste", Quality.ORANGE, 186, false, GradeName.CLERC, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, -50),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Explorateur de la Forteresse", Quality.ORANGE, 85, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.PM, true, -8),
			}),
			new Title("Explorateur de la Tour", Quality.ORANGE, 85, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.PV, true, -8),
			}),
			new Title("Explorateur de la Tour du Phénix", Quality.ORANGE, 68, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.PV, true, -8),
			}),
			new Title("Explorateur des Flammes", Quality.ORANGE, 90, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title("Explorateur du Labyrinthe", Quality.ORANGE, 95, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DefP, true, -8),
			}),
			new Title("Héraut de Coeur de Lion Embrasé", Quality.ORANGE, 186, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title("Héritier Légendaire", Quality.ORANGE, 72, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.TCCP, false, -3),
				new Effect(TypeEffect.TCCM, false, -3),
			}),
			new Title("Héros des Terres du Nord", Quality.ORANGE, 71, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.DegAtkD, false, -3),
			}),
			new Title("Inquisiteur de la Frégate du Désespoir", Quality.ORANGE, 177, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -5),
			}),
			new Title("Intercepteur de Dimension déformée", Quality.ORANGE, 196, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 7200),
				new Effect(TypeEffect.PM, false, 7200),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title("La fin du monde", Quality.ORANGE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TDB,
			}, new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title("Maître Archimage", Quality.ORANGE, 186, false, GradeName.SORCIER, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Maître des Flammes Noires", Quality.ORANGE, 73, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title("Maître Rédempteur", Quality.ORANGE, 86, false, GradeName.SPATIODERIVEUR, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Maître Shinobi", Quality.ORANGE, 186, false, GradeName.ASSASSIN, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 2),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title("Massacre au paradis", Quality.ORANGE, 31, false, GradeName.NONE, new Tag[] {
				Tag.TDB,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 15),
				new Effect(TypeEffect.VitAtkD, false, 15),
				new Effect(TypeEffect.VitComp, false, 15),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title("Minotaure du Dédale", Quality.ORANGE, 78, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.DefP, true, -8),
			}),
			new Title("Nakama Pirate", Quality.ORANGE, 188, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.PM, true, -15),
				new Condition(TypeEffect.PV, 20, new Calculable[] {
					new Proc(35, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Title("Observateur de la Côte des Naufrages", Quality.ORANGE, 69, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.DegAtkD, false, -3),
			}),
			new Title("Professionnel de SOS Fantômes", Quality.ORANGE, 69, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.TCCP, false, -3),
			}),
			new Title("Protecteur d'Eugénie", Quality.ORANGE, 91, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Ravageur", Quality.ORANGE, 186, false, GradeName.BERSERKER, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 20),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
			}),
			new Title("Ravageur de la Fracture du Vide", Quality.ORANGE, 97, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.ReducPeneM, false, 5),
			}),
			new Title("Rayon de lumière", Quality.ORANGE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, -8),
				new Effect(TypeEffect.DefM, true, -8),
			}),
			new Title("Récupérateur des Mines", Quality.ORANGE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 15),
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.DefP, true, -8),
				new Effect(TypeEffect.DefM, true, -8),
			}),
			new Title("Réouverture de la Mine Effondrée", Quality.ORANGE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
			}),
			new Title("Révolution de Kaslow en Flammes", Quality.ORANGE, 86, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title("Rouleur de Mécaniques", Quality.ORANGE, 63, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.PM, true, -8),
			}),
			new Title("Sauveur de la Terre d'Elsa", Quality.ORANGE, 73, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.DefM, true, -3),
			}),
			new Title("Sauveur du Sanctuaire", Quality.ORANGE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new Effect(TypeEffect.Depla, false, -2),
				new Effect(TypeEffect.ReducP, false, 2),
				new Effect(TypeEffect.ReducM, false, 2),
			}),
			new Title("Seigneur du Sanctuaire de l'Abandon", Quality.ORANGE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
				new Effect(TypeEffect.ReducP, false, -50),
				new Effect(TypeEffect.ReducM, false, -50),
			}),
			new Title("Sensei Zen", Quality.ORANGE, 72, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title("Shaman", Quality.ORANGE, 186, false, GradeName.SAGE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducAtkM, false, -80),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Shinigami", Quality.ORANGE, 186, false, GradeName.NECROMANCIEN, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegOmbre, false, 80),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Sniper", Quality.ORANGE, 186, false, GradeName.RANGER, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title("Spritophile", Quality.ORANGE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.PV, true, 6),
			}),
			new Title("Templier", Quality.ORANGE, 186, false, GradeName.PALADIN, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
			}),
		};
	}
	
	private static Title[] getBlue() {
		return new Title[] {
			new Title("À l'étouffée !", Quality.BLUE, 17, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
			}),
			new Title("À la rescousse du Sprite piégé", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Amateur de Gâteau de Lune", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, true, 200),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Ambassadeur de l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Ambassadeur du Chocolat de l'Amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, false, 2),
				new Effect(TypeEffect.DefM, false, 2),
			}),
			new Title("Ami des sorcières", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title("Amitié Inter Espèce", Quality.BLUE, 71, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.Depla, false, 6),
				new Effect(TypeEffect.Loot, false, 6),
			}),
			new Title("Amour Courtois", Quality.BLUE, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Amour Interdit", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Amour Niais", Quality.BLUE, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
			}),
			new Title("Amour pour Toujours", Quality.BLUE, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
			}),
			new Title("Amoureux Ensorcelé", Quality.BLUE, 53, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title("Ange de bienveillance", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title("Appelez-moi le roi de la fête", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8),
				new Effect(TypeEffect.Loot, false, 8),
			}),
			new Title("Aujourd'hui, je n'ai pas de limites", Quality.BLUE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Bénédiction de Joline", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 1),
				new Effect(TypeEffect.Depla, false, 9),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Béni soit l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1),
				new RegenEffect(TypeEffect.PV, false, 13, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 14, TypeRegen.REGENERATION, 10),
			}),
			new Title("Bien mal acquis", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new RegenEffect(TypeEffect.PV, false, 5, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 5, TypeRegen.REGENERATION, 10),
			}),
			new Title("Bourreau des Rebelles", Quality.BLUE, 57, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title("Brise-nuit", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Ombre, false, 50),
				new Proc(5, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 1000),
				}),
			}),
			new Title("Certificat d'Appréciation", Quality.BLUE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title("Cette odeur de mai", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlanteP, false, 15),
				}),
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlanteM, false, 15),
				}),
			}),
			new Title("Champion de l'Amour et de la Paix", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Champion X-Legend", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 1),
				new Effect(TypeEffect.AtkM, true, 1),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Chasseur de la Tour des bêtes", Quality.BLUE, 1, false, GradeName.NONE, new Tag[] {
				Tag.TDB,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 7),
				new Effect(TypeEffect.AtkD, true, 7),
				new Effect(TypeEffect.AtkM, true, 7),
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title("Chasseur de Monstres", Quality.BLUE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Depla, false, 4),
				new Effect(TypeEffect.DefP, true, -6),
				new Effect(TypeEffect.DefM, true, -6),
			}),
			new Title("Chasseur du Monstrounet du Nouvel An", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.DegP, false, 2),
				new Effect(TypeEffect.DegM, false, 2),
			}),
			new Title("Chevalier du Cristal", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.PVP,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
			}),
			new Title("Christmas placeholder", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title("Citrouille sentinelle", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.PV, true, 3),
			}),
			new Title("Clair comme de l'Eau", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 10, 15, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 10, 15, TypeRegen.REGENERATION, 10),
			}),
			new Title("Coeur vagabond", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 5),
				new Effect(TypeEffect.ReducM, false, 5),
				new RegenEffect(TypeEffect.PM, false, 10, TypeRegen.REGENERATION, 10),
			}),
			new Title("Collectionneur d'oeufs de Pâques", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title("Combattant d'Élite", Quality.BLUE, 57, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.TCCP, false, -2),
			}),
			new Title("Compagnon du lapin de Célébration Lunaire", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 5),
				new RegenEffect(TypeEffect.PV, false, 15, 20, TypeRegen.REGENERATION, 5),
			}),
			new Title("Confiseur de l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new StaticEffect(TypeStaticEffect.Poisse, 5),
			}),
			new Title("Corsaire Indomptable", Quality.BLUE, 60, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title("Cosméto-Poing", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitComp, false, 4),
			}),
			new Title("Costumadier", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.PV, false, 400),
			}),
			new Title("Crapule Pirate", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform6),
			}),
			new Title("Défenseur du Cristal", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.PVP,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 100),
				new Effect(TypeEffect.PM, false, 100),
			}),
			new Title("Demi de Mêlée", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new Title("Démolisseur à la rescousse", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Dentiste de la Gueule Rugissante", Quality.BLUE, 50, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.DefP, true, -10),
			}),
			new Title("Détective désigné", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 5),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Dieu de la bonne chair", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.RTCCP, false, -10),
				new Effect(TypeEffect.RTCCM, false, -10),
			}),
			new Title("Dieu du Cristal", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.PVP,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
			}),
			new Title("Dompteur de Monstres", Quality.BLUE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.VitAtkM, false, 10),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.DefP, true, -12),
				new Effect(TypeEffect.DefM, true, -12),
			}),
			new Title("Dose d'amour et de justice", Quality.BLUE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform28),
			}),
			new Title("Écrivain fantastique", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMortP, true, 2),
				new Effect(TypeEffect.DegMortP, false, 15),
				new Effect(TypeEffect.DegMortM, true, 2),
				new Effect(TypeEffect.DegMortM, false, 15),
			}),
			new Title("Écrivain Populaire", Quality.BLUE, 1, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title("Efficacité élevée", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title("Embrouillé", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Nature, false, 5),
			}),
			new Title("Entremetteur de Saphaël", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Envoyé des Anciens", Quality.BLUE, 60, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title("Espoir de Gaïa", Quality.BLUE, 56, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.ESQ, true, -1),
			}),
			new Title("Espoir verdoyant", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new RegenEffect(TypeEffect.PV, false, 100, TypeRegen.REGENERATION, 3),
				new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 3),
			}),
			new Title("Esprit de Thanksgiving", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title("Étoile de l'Ange de Noël", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Éxécuteur du Devoir Divin", Quality.BLUE, 65, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title("Expert du Défi", Quality.BLUE, 68, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.DegBeteP, true, 3),
				new Effect(TypeEffect.DegBeteP, false, 20),
			}),
			new Title("Explorateur de l'Île Condamnée", Quality.BLUE, 188, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.PM, true, -15),
				new Condition(TypeEffect.PV, 20, new Calculable[] {
					new Proc(35, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Title("Explorateur de la Cité", Quality.BLUE, 80, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title("Explorateur de la Frégate du Désespoir", Quality.BLUE, 177, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -5),
			}),
			new Title("Explorateur de la Gueule", Quality.BLUE, 70, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.DefP, true, -10),
			}),
			new Title("Explorateur de la Tombe", Quality.BLUE, 75, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title("Explorateur du Temps", Quality.BLUE, 65, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DefP, true, -5),
			}),
			new Title("Exterminateur d'Halloween", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
				new Effect(TypeEffect.DegSacre, false, 200),
			}),
			new Title("Faisons la fête avec l'idole", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.VitComp, false, 2),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title("Fée terrestre", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 200),
			}),
			new Title("File au vent", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Proc(100, Activation.Nothing, 2, 10, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
				new Proc(100, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -30),
				}),
			}),
			new Title("Flash", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 250),
				new Effect(TypeEffect.PM, false, 250),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Forban Pirate", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
			}),
			new Title("Garde démoniaque", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 2),
				new Effect(TypeEffect.ReducP, false, -10),
				new Effect(TypeEffect.ReducM, false, -10),
			}),
			new Title("Gardien de l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title("Gardien de l'Archipel Millénaire", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
			}),
			new Title("Gardien de la Baie Bleue", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform7),
			}),
			new Title("Gardien de la Tombe du Roi", Quality.BLUE, 56, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title("Gardien du Campement Sylvestre", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform8),
			}),
			new Title("Gardien du dîner de la Veille du Nouvel An", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.FCE, true, 3),
				new Effect(TypeEffect.VIT, true, 3),
				new Effect(TypeEffect.INT, true, 3),
				new Effect(TypeEffect.VOL, true, 3),
				new Effect(TypeEffect.AGI, true, 3),
			}),
			new Title("Gaveur de poulette", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc0),
			}),
			new Title("Général du Cristal", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.PVP,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
			}),
			new Title("Général Psychique", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill, 3),
			}),
			new Title("Goûteur de chocolat", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 1),
				new StaticEffect(TypeStaticEffect.x3STD, 1),
			}),
			new Title("Grand Conquérant de Saphaël", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Grand Génie", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
			}),
			new Title("Grand Maître tout Puissant", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 14),
				new Effect(TypeEffect.VitAtkD, false, 7),
			}),
			new Title("Grand Manchot de Noël", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform9),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Grande bienveillance", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 5),
				new RegenEffect(TypeEffect.PV, false, 15, 20, TypeRegen.REGENERATION, 5),
			}),
			new Title("Gros Blasé", Quality.BLUE, 84, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.DegHumaP, true, 1),
				new Effect(TypeEffect.DegHumaP, false, 10),
			}),
			new Title("Guerrier invincible", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 2),
				new Effect(TypeEffect.VIT, true, 2),
				new Effect(TypeEffect.INT, true, 2),
				new Effect(TypeEffect.VOL, true, 2),
				new Effect(TypeEffect.AGI, true, 2),
			}),
			new Title("Héraut royal des Sprites", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title("Héritier du Dieu du casino", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Héros du Ratafia", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Héros en Herbe", Quality.BLUE, 21, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Homme-bête assassin", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 2),
				new Effect(TypeEffect.VIT, true, 2),
				new Effect(TypeEffect.INT, true, 2),
				new Effect(TypeEffect.VOL, true, 2),
				new Effect(TypeEffect.AGI, true, 2),
			}),
			new Title("Honorable compagnon", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 5),
				new Effect(TypeEffect.DegHumaP, false, 50),
				new Effect(TypeEffect.DegHumaM, true, 5),
				new Effect(TypeEffect.DegHumaM, false, 50),
			}),
			new Title("Hurler à la lune", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Inébranlable foi en l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, true, 2),
			}),
			new Title("Infini", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, true, 5),
			}),
			new Title("Intoxication estivale", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.RegenPV, false, 100),
			}),
			new Title("Invention géniale", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Atk, true, -2),
				new Effect(TypeEffect.AtkD, true, -2),
				new Effect(TypeEffect.AtkM, true, -2),
			}),
			new Title("Jardinier d'élite", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteP, true, 10),
				new Effect(TypeEffect.DegPlanteP, false, 100),
				new Effect(TypeEffect.DegPlanteM, true, 10),
				new Effect(TypeEffect.DegPlanteM, false, 100),
			}),
			new Title("Je suis le roi dindon", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform10),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Je vous aurai !", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
				new Effect(TypeEffect.AGI, true, 1),
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Title("Joueur de légende", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform11),
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform12),
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform13),
			}),
			new Title("Jour de baptême", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new Title("L'affliction du monstre", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 10),
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title("L'argent est roi", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.Loot, false, 10),
			}),
			new Title("La tradition du maître des Cookies de Lune", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new Title("La voie de la Forêt", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.VitComp, false, 5),
			}),
			new Title("Le copain de l'épouvantail", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform29),
			}),
			new Title("Le Gardien du Futur", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title("Le gardien du plateau", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Sacre, false, 1),
				new Effect(TypeEffect.Ombre, false, 1),
				new Effect(TypeEffect.Foudre, false, 1),
				new Effect(TypeEffect.Feu, false, 1),
				new Effect(TypeEffect.Glace, false, 1),
				new Effect(TypeEffect.Nature, false, 1),
			}),
			new Title("Le glas de la victoire à l'aube", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title("Le Grand Sauveur", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Le miracle qu'est l'amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.Sacre, false, 10),
			}),
			new Title("Le pacificateur", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Le roi de la loterie", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.Loot, false, 3),
			}),
			new Title("Légende parmi les légendes", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform14),
			}),
			new Title("Les Soldes de Mayk", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.RegenPV, false, 100),
			}),
			new Title("M. Mission Possible", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title("Maître Alchimiste", Quality.BLUE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Maître de l'Oeuf de Pâques Magique", Quality.BLUE, 17, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Maître des Boules de neige", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DegGlace, false, 87),
			}),
			new Title("Maître des Farces", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title("Maître du Dragon de Feu", Quality.BLUE, 56, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.DegAtkD, false, -2),
			}),
			new Title("Maître en dissipation de désastres", Quality.BLUE, 83, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.DegHumaP, true, 3),
				new Effect(TypeEffect.DegHumaP, false, 20),
			}),
			new Title("Maître enivré", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Maître farceur", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform15),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Majin", Quality.BLUE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Marathonien", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 80),
				new Effect(TypeEffect.PM, false, 80),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title("Mégère Pirate", Quality.BLUE, 186, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
			}),
			new Title("Membre essentiel", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Membre Honoraire du Clan Infernal", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.Atk, false, 2),
				new Effect(TypeEffect.AtkM, false, 2),
			}),
			new Title("Messager des Sprites Instruit", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.PM, true, 4),
			}),
			new Title("Migraine paternelle", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Montagnard au Pied Sûr", Quality.BLUE, 67, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("Parfait fêtard", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Effect(TypeEffect.TCCM, false, 6),
			}),
			new Title("Péché mignon du Roi Lapin malin", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, 1),
				new Effect(TypeEffect.Loot, false, 3),
			}),
			new Title("Pilote de bateau-dragon estival", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title("Plaisir sans fin", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.AtkM, true, 2),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
			new Title("Pleine lune automnale", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title("Pourfendeur de célibat", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 3),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title("Preux Chevalier", Quality.BLUE, 81, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2),
				new Effect(TypeEffect.INT, false, 2),
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Title("Prophète Visionnaire", Quality.BLUE, 63, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title("Protecteur de Baie", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
			}),
			new Title("Protecteur des Sprite", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Title("Protecteur du Camp Sauvage", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform16),
			}),
			new Title("Purificateur Fanatique", Quality.BLUE, 62, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title("Qu'est-ce que l'amour ?", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.RegenPV, false, 250),
				new Effect(TypeEffect.RegenPM, false, 250),
			}),
			new Title("Que des sentiments purs", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform30),
			}),
			new Title("Remède miracle", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.DefP, false, 150),
				new Effect(TypeEffect.DefM, false, 150),
			}),
			new Title("Représentant de la Douce nuit", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
			}),
			new Title("Roi de la friture", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.DCCP, false, 3),
				new Effect(TypeEffect.DCCM, false, 3),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Roi des Pirates", Quality.BLUE, 86, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Roi des porcs", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title("Seigneur du Cristal", Quality.BLUE, 31, false, GradeName.NONE, new Tag[] {
				Tag.PVP,
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title("Singe de mon coeur", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title("Super Citrouille vertueuse", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 5),
				new Effect(TypeEffect.Feu, false, 5),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Glace, false, 5),
				new Effect(TypeEffect.Nature, false, 5),
				new Effect(TypeEffect.Ombre, false, 5),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title("Supérieur du Centurion", Quality.BLUE, 79, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.DegPlanteM, true, 3),
				new Effect(TypeEffect.DegPlanteM, false, 20),
			}),
			new Title("Supernova", Quality.BLUE, 67, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.TCCP, false, -2),
				new Effect(TypeEffect.TCCM, false, -2),
			}),
			new Title("Témoin du rituel de résurrection", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, true, 1),
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Title("Tisseur de marées", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Title("Traqueur de Monstres", Quality.BLUE, 17, false, GradeName.NONE, new Tag[] {
				Tag.RANK,
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.VitAtkD, false, 7),
				new Effect(TypeEffect.VitAtkM, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.DefP, true, -9),
				new Effect(TypeEffect.DefM, true, -9),
			}),
			new Title("Troubles de la nature", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Effect(TypeEffect.HealR, false, 10),
			}),
			new Title("Tueur de Déesse", Quality.BLUE, 80, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.DegDemonM, true, 3),
				new Effect(TypeEffect.DegDemonM, false, 20),
			}),
			new Title("Un Brin d'Amour", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Un flot de bonne fortune", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title("Un messager chaleureux dans le froid", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title("Veilleur mystérieux", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title("Veuve de glace et de feu", Quality.BLUE, 80, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 50),
				new Effect(TypeEffect.Glace, false, 50),
				new Proc(5, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 1000),
					new Effect(TypeEffect.DegGlace, false, 1000),
				}),
			}),
			new Title("Vous cherchez quelque chose ?", Quality.BLUE, 72, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 9),
			}),
			new Title("Voyageur au Coeur Brisé", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title("Voyageur Temporel", Quality.BLUE, 46, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DefP, true, -5),
			}),
			new Title("4e Dimension - Gardien sylvestre", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new StaticEffect(TypeStaticEffect.x2STD, 3),
			}),
			new Title("9e anniversaire de Muse Girl", Quality.BLUE, 15, false, GradeName.NONE, new Tag[] {
				Tag.EVENT,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 900),
				new Effect(TypeEffect.PM, false, 900),
				new Effect(TypeEffect.VOL, false, 9),
			}),
		};
	}

	private static Title[] getGreen() {
		return new Title[] {
			new Title("Adepte de l'Agent", Quality.GREEN, 78, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Atk, true, -3),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title("Agent Double", Quality.GREEN, 62, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Aimer sans Regrets", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.TCCM, false, 10),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title("Âme de Dragon Noir", Quality.GREEN, 51, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 2),
				new Effect(TypeEffect.DegBeteP, false, 20),
			}),
			new Title("Ami de l'Océan", Quality.GREEN, 38, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title("Ami des Grayds", Quality.GREEN, 91, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.INT, false, 8),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title("Amitié de l'Apprentie Sorcière", Quality.GREEN, 89, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Analyseur de Rêve", Quality.GREEN, 91, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title("Annonciateur de Mauvaises Nouvelles", Quality.GREEN, 62, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Title("Arracheur de Pétales", Quality.GREEN, 77, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteM, true, 2),
				new Effect(TypeEffect.DegPlanteM, false, 20),
			}),
			new Title("Assaillant de Tour", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title("Assassin du Dirigeant", Quality.GREEN, 96, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 3),
				new Effect(TypeEffect.DegHumaP, false, 30),
				new Effect(TypeEffect.DegHumaM, true, 3),
				new Effect(TypeEffect.DegHumaM, false, 30),
			}),
			new Title("Assistant de Kuma", Quality.GREEN, 168, false, GradeName.NONE, new Tag[] {
				Tag.DONJON,
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new Title("Assistant du Garde de Kaslow", Quality.GREEN, 80, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VitAtk, false, -4),
			}),
			new Title("Avatar", Quality.GREEN, 79, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Bannisseur de l'Esprit d'Epée", Quality.GREEN, 71, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMecaM, true, 2),
				new Effect(TypeEffect.DegMecaM, false, 20),
			}),
			new Title("Baron par Alliance", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
			}),
			new Title("Bête et Naïf", Quality.GREEN, 83, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title("Bienfaiteur de l'Île aux Trois Côtes", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title("Bûcheron Infatigable", Quality.GREEN, 46, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteP, true, 2),
				new Effect(TypeEffect.DegPlanteP, false, 20),
			}),
			new Title("Buveur sans Soif", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform17),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title("Chasseur de Démons", Quality.GREEN, 36, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemP, true, 2),
				new Effect(TypeEffect.DegElemP, false, 20),
			}),
			new Title("Chasseur Élite", Quality.GREEN, 25, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 1.5),
				new Effect(TypeEffect.DegBeteP, false, 15),
				new Effect(TypeEffect.DegBeteM, true, 1.5),
				new Effect(TypeEffect.DegBeteM, false, 15),
			}),
			new Title("Chevalier à Plumes", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Combattant du Crime", Quality.GREEN, 46, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title("Commandant", Quality.GREEN, 79, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title("Compagnon Ailé", Quality.GREEN, 81, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, -4),
			}),
			new Title("Concierge de la Mine Écroulée", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VitComp, false, -10),
			}),
			new Title("Conquérant de la Caverne de l'Écho", Quality.GREEN, 40, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title("Cortex Maximus", Quality.GREEN, 81, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title("Défenseur de fer -Quatrième Dimension", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform18),
			}),
			new Title("Défenseur de l'Eau Bénite", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 6),
				new Effect(TypeEffect.Loot, false, 6),
			}),
			new Title("Défenseur du Plateau de l'Espoir", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform19),
			}),
			new Title("Destructeur de Preuve", Quality.GREEN, 81, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Toucher, false, -4),
			}),
			new Title("Détective Autodidacte", Quality.GREEN, 76, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Disciple de Carso", Quality.GREEN, 80, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title("Dompteur de Loups Sauvages", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Dresseur de Lions", Quality.GREEN, 31, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonP, true, 2),
				new Effect(TypeEffect.DegDemonP, false, 20),
			}),
			new Title("Dure Vérité", Quality.GREEN, 86, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title("Éleveur de Poulets", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Ennemi des Pirates", Quality.GREEN, 38, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Title("Envahisseur Fou", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.DefP, true, -3),
				new Effect(TypeEffect.DefM, true, -3),
			}),
			new Title("Étudiant de l'Académie", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title("Excavateur du Temple Déserté", Quality.GREEN, 36, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title("Expert au Bras de Fer", Quality.GREEN, 66, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegMecaP, true, 2),
				new Effect(TypeEffect.DegMecaP, false, 20),
			}),
			new Title("Expert de la Colère", Quality.GREEN, 82, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.DegDemonM, true, 2),
				new Effect(TypeEffect.DegDemonM, false, 20),
			}),
			new Title("Expert Jardinier", Quality.GREEN, 15, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteP, true, 1),
				new Effect(TypeEffect.DegPlanteP, false, 10),
				new Effect(TypeEffect.DegPlanteM, true, 1),
				new Effect(TypeEffect.DegPlanteM, false, 10),
			}),
			new Title("Explorateur de la Caverne", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title("Explorateur de la Caverne de la Prairie", Quality.GREEN, 20, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title("Explorateur de la Mine", Quality.GREEN, 52, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Explorateur Intrépide", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegAtkD, false, 1),
			}),
			new Title("Explorateurs de la Forêt lumineuse", Quality.GREEN, 93, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Explorez les membres pour trouver les reliques de Technopolis.", Quality.GREEN, 89, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title("Exterminateur d'Insectes", Quality.GREEN, 75, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaM, true, 2),
				new Effect(TypeEffect.DegHumaM, false, 20),
			}),
			new Title("Exterminateur d'insectes robots", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Faust", Quality.GREEN, 79, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title("Fléau des Dragons", Quality.GREEN, 56, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonM, true, 2),
				new Effect(TypeEffect.DegDemonM, false, 20),
			}),
			new Title("Fléau des Moustiques", Quality.GREEN, 18, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Gardien de Kansas Palembang", Quality.GREEN, 96, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Gardien de la Nature", Quality.GREEN, 20, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Geek Surdoué", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Grand Méchant Loup", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Groupe de riposte du Temple Oublié", Quality.GREEN, 88, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.VOL, false, 8),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title("Guerrier ayant vaincu Gardien de Tombe Homme-bête", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonP, true, 3),
				new Effect(TypeEffect.DegDemonP, false, 30),
				new Effect(TypeEffect.DegDemonM, true, 3),
				new Effect(TypeEffect.DegDemonM, false, 30),
			}),
			new Title("Guerrier ayant vaincu Griffe de l'Effroi", Quality.GREEN, 69, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 3),
				new Effect(TypeEffect.DegBeteP, false, 30),
			}),
			new Title("Guerrier ayant vaincu Seigneur de la Forêt du Triste Sprite", Quality.GREEN, 78, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteM, true, 3),
				new Effect(TypeEffect.DegBeteM, false, 30),
			}),
			new Title("Guerriers combattant Foudre rugissante", Quality.GREEN, 96, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemP, true, 3),
				new Effect(TypeEffect.DegElemP, false, 30),
				new Effect(TypeEffect.DegElemM, true, 3),
				new Effect(TypeEffect.DegElemM, false, 30),
			}),
			new Title("Guerriers combattant la Fuite d'essence", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegMecaP, true, 3),
				new Effect(TypeEffect.DegMecaP, false, 30),
			}),
			new Title("Guerriers combattant Sire Fungus", Quality.GREEN, 93, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteM, true, 3),
				new Effect(TypeEffect.DegPlanteM, false, 30),
			}),
			new Title("Héritier de la Fournaise", Quality.GREEN, 21, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform20),
				new Effect(TypeEffect.Depla, false, -100),
			}),
			new Title("Héros de la Crête Dimensionnelle", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title("Héros de la Tribu des Dragons", Quality.GREEN, 45, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegAtkD, false, 1),
			}),
			new Title("Héros des Côtes Dimensionnelles", Quality.GREEN, 76, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Héros des Mines Dimensionnelles", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, -5),
			}),
			new Title("Indiana Jones", Quality.GREEN, 55, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title("Ingénieur Talentueux", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title("Insecticide", Quality.GREEN, 64, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Inspiration", Quality.GREEN, 82, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Jouer au plus bête", Quality.GREEN, 80, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title("La lumière au bout du tunnel", Quality.GREEN, 91, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title("La Mode des Carapaces", Quality.GREEN, 70, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Lanceur d'alerte", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Depla, false, -7),
			}),
			new Title("Libérateur de la Vallée de la lumière", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform21),
			}),
			new Title("Maître des Sprites", Quality.GREEN, 51, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
				new Effect(TypeEffect.INT, false, 1),
				new Effect(TypeEffect.VOL, false, 1),
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title("Maître du Temps", Quality.GREEN, 51, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 1),
			}),
			new Title("Maître Tacticien", Quality.GREEN, 63, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 2),
				new Effect(TypeEffect.DegHumaP, false, 20),
			}),
			new Title("Mangeur d'Insectes", Quality.GREEN, 82, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
				new Effect(TypeEffect.DegBeteP, true, 2),
				new Effect(TypeEffect.DegBeteP, false, 15),
			}),
			new Title("Meilleur Gardien de But", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Atk, true, -3),
				new Effect(TypeEffect.AtkM, true, -3),
			}),
			new Title("Membre du Syndicat", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Title("Membre Spécial de l'Expédition Royale", Quality.GREEN, 86, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title("Messager Cauchemar", Quality.GREEN, 86, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Messager de la Justice", Quality.GREEN, 20, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Messager des Sprites en Entraînement", Quality.GREEN, 31, false, GradeName.NONE, null),
			new Title("Messager du Vent", Quality.GREEN, 83, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.DefP, true, -50),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Messager Exceptionnel", Quality.GREEN, 71, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2),
				new Effect(TypeEffect.INT, false, 2),
				new Effect(TypeEffect.VOL, false, 2),
				new Effect(TypeEffect.AGI, false, 2),
			}),
			new Title("Nettoyeur du Monstre de Boue", Quality.GREEN, 61, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemM, true, 2),
				new Effect(TypeEffect.DegElemM, false, 20),
			}),
			new Title("Nomade du Désert", Quality.GREEN, 41, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Nounou d'Enfer", Quality.GREEN, 79, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Ombres Chinoises", Quality.GREEN, 75, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Péninsule du Chagrin - Garde de Fer", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform22),
			}),
			new Title("Pote avec Kuda", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.DefP, true, 3),
			}),
			new Title("Pourfendeur des Scythes", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 3),
				new Effect(TypeEffect.DegBeteP, false, 30),
			}),
			new Title("Pourfendeur du Mal", Quality.GREEN, 76, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegMortM, true, 2),
				new Effect(TypeEffect.DegMortM, false, 20),
			}),
			new Title("Prière fervente", Quality.GREEN, 15, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 2),
				new Effect(TypeEffect.DefP, true, 2),
			}),
			new Title("Prospecteur de la Mine Interdite", Quality.GREEN, 31, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title("Protéger l'Enfant du Miracle", Quality.GREEN, 91, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title("Purificateur des Montagnes de Verre", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform23),
			}),
			new Title("Ressusciteur du Port escarpé", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform24),
			}),
			new Title("Roi de la Destruction", Quality.GREEN, 94, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 8),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.ESQ, true, -5),
			}),
			new Title("Sauveur du Bassin fumant", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform25),
			}),
			new Title("Secours Immédiats", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title("Sentinelle de la Montagne", Quality.GREEN, 50, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title("Sherlock Sprite", Quality.GREEN, 84, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Title("Soin Essentiel", Quality.GREEN, 86, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title("Soutien des mines - Quatrième Dimension", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform26),
			}),
			new Title("Spécialiste du Surimi", Quality.GREEN, 71, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteM, true, 2),
				new Effect(TypeEffect.DegBeteM, false, 20),
			}),
			new Title("Spéléologue", Quality.GREEN, 50, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title("Super Pilote", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title("Super-Touriste", Quality.GREEN, 81, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, -50),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title("Tortue Ninja", Quality.GREEN, 83, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonP, true, 2),
				new Effect(TypeEffect.DegDemonP, false, 20),
				new Effect(TypeEffect.DegHumaP, true, 2),
				new Effect(TypeEffect.DegHumaP, false, 20),
			}),
			new Title("Trafiquant d'Ivoire", Quality.GREEN, 80, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 2),
				new Effect(TypeEffect.DegBeteP, false, 20),
				new Effect(TypeEffect.DegMortP, true, 2),
				new Effect(TypeEffect.DegMortP, false, 20),
			}),
			new Title("Trop Choux mais Mortels", Quality.GREEN, 93, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 3),
				new Effect(TypeEffect.DegHumaP, false, 30),
			}),
			new Title("Tueur de Dragons", Quality.GREEN, 41, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.DegMortP, true, 2),
				new Effect(TypeEffect.DegMortP, false, 20),
			}),
			new Title("Tueur de Vermine", Quality.GREEN, 38, false, GradeName.NONE, new Tag[] {
				
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
			}),
			new Title("Tueur pourpre - Quatrième Dimension", Quality.GREEN, 15, false, GradeName.NONE, new Tag[] {
				Tag.CHRONO,
			}, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform27),
			}),
			new Title("Vaincre les guerriers du cristal magique expérimental", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemM, true, 3),
				new Effect(TypeEffect.DegElemM, false, 30),
			}),
			new Title("Vaincre les guerriers du général des Hommes-bêtes", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 3),
				new Effect(TypeEffect.DegHumaP, false, 30),
				new Effect(TypeEffect.DegHumaM, true, 3),
				new Effect(TypeEffect.DegHumaM, false, 30),
			}),
			new Title("Vaincre les guerriers du héros des Mauvais esprits", Quality.GREEN, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaM, true, 3),
				new Effect(TypeEffect.DegHumaM, false, 30),
			}),
			new Title("Vainqueur de Ken", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaM, true, 2),
				new Effect(TypeEffect.DegHumaM, false, 20),
			}),
			new Title("Vainqueur de la Boue", Quality.GREEN, 80, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemM, true, 2),
				new Effect(TypeEffect.DegElemM, false, 20),
			}),
			new Title("Vainqueur de Leonardo", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonP, true, 2),
				new Effect(TypeEffect.DegDemonP, false, 20),
				new Effect(TypeEffect.DegHumaP, true, 2),
				new Effect(TypeEffect.DegHumaP, false, 20),
			}),
			new Title("Vainqueur de Nagranok", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMecaM, true, 2),
				new Effect(TypeEffect.DegMecaM, false, 20),
			}),
			new Title("Vainqueur de Pazuzu", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMortM, true, 2),
				new Effect(TypeEffect.DegMortM, false, 20),
			}),
			new Title("Vainqueur de Seymour", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteM, true, 2),
				new Effect(TypeEffect.DegPlanteM, false, 20),
			}),
			new Title("Vainqueur du Colonel", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 2),
				new Effect(TypeEffect.DegBeteP, false, 20),
				new Effect(TypeEffect.DegMortP, true, 2),
				new Effect(TypeEffect.DegMortP, false, 20),
			}),
			new Title("Vainqueur du Crabe Géant", Quality.GREEN, 90, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteM, true, 2),
				new Effect(TypeEffect.DegBeteM, false, 20),
			}),
			new Title("Vainqueur du Cyclope", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegHumaP, true, 2),
				new Effect(TypeEffect.DegHumaP, false, 20),
			}),
			new Title("Vainqueur du Démon", Quality.GREEN, 55, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegElemP, true, 2),
				new Effect(TypeEffect.DegElemP, false, 20),
			}),
			new Title("Vainqueur du Dragon spectral", Quality.GREEN, 70, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegBeteP, true, 2),
				new Effect(TypeEffect.DegBeteP, false, 20),
			}),
			new Title("Vainqueur du Dragon Zombie", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMortP, true, 2),
				new Effect(TypeEffect.DegMortP, false, 20),
			}),
			new Title("Vainqueur du Feu", Quality.GREEN, 75, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonM, true, 2),
				new Effect(TypeEffect.DegDemonM, false, 20),
			}),
			new Title("Vainqueur du Gorille d'Acier", Quality.GREEN, 85, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegMecaP, true, 2),
				new Effect(TypeEffect.DegMecaP, false, 20),
			}),
			new Title("Vainqueur du Lion", Quality.GREEN, 50, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegDemonP, true, 2),
				new Effect(TypeEffect.DegDemonP, false, 20),
			}),
			new Title("Vainqueur du Marécage", Quality.GREEN, 65, false, GradeName.NONE, new Tag[] {
				Tag.BOSS,
			}, new Calculable[] {
				new Effect(TypeEffect.DegPlanteP, true, 2),
				new Effect(TypeEffect.DegPlanteP, false, 20),
			}),
			new Title("Votre pire cauchemar", Quality.GREEN, 60, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 1),
			}),
			new Title("Voyageur Temporel", Quality.GREEN, 62, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
		};
	}

	private static Title[] getWhite() {
		return new Title[] {
			new Title("Ambassadeur des Rois des Sprites", Quality.WHITE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Ami des Gélapins", Quality.WHITE, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Ange du Paradis Perdu", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Champion de l'Ile de Siwa", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Chasseur de Gros Gibier", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Chevalier de l'Ordre du Gélapin", Quality.WHITE, 70, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Coeur de Pierre", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Collectionneur Maniaque", Quality.WHITE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Conseillé avisé d'Ilya", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Défenseur du Plateau", Quality.WHITE, 24, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Disciple de la Lumière", Quality.WHITE, 24, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Disciple de Maître Nanco", Quality.WHITE, 31, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Enfant des Fleurs", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Espoir de la Plaine", Quality.WHITE, 11, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Étoile Filante de Saphaël", Quality.WHITE, 0, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Expert en pigments", Quality.WHITE, 71, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Expert gazier", Quality.WHITE, 71, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Fan des Gélapins", Quality.WHITE, 30, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Gardien de l'Héritage", Quality.WHITE, 24, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Gardien des Mines", Quality.WHITE, 11, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Gélapin héros", Quality.WHITE, 100, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Gélapin prophète", Quality.WHITE, 90, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Groupie des Gélapins", Quality.WHITE, 40, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Héros des Gélapins", Quality.WHITE, 50, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Lecteur Insatiable", Quality.WHITE, 10, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Messager Corrompu", Quality.WHITE, 10, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Messager d'Élite", Quality.WHITE, 44, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Messager de l'Automne", Quality.WHITE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Noble chevalier de Kaslow", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Ombre parmi les Ombres", Quality.WHITE, 10, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Président du Fanclub des Gélapins", Quality.WHITE, 80, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Protecteur de la Forêt", Quality.WHITE, 11, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Protecteur des Gélapins", Quality.WHITE, 60, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Protecteur des Thermes", Quality.WHITE, 0, false, GradeName.NONE, new Tag[] {
				Tag.OTHER,
			}, null),
			new Title("Savant génial de Technopolis", Quality.WHITE, 1, false, GradeName.NONE, new Tag[] {
				Tag.REPUTATION,
			}, null),
			new Title("Stan Pas Trop Mal", Quality.WHITE, 20, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
			new Title("Touriste des Îles", Quality.WHITE, 15, false, GradeName.NONE, new Tag[] {
				Tag.QUETE,
			}, null),
		};
	}
}
