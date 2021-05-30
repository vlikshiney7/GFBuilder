package fr.vlik.grandfantasia.loader.characUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.characUpgrade.Title;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Âme Évolutive"); put(Language.EN, "Master of Treasures"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.Loot, false, 20),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amour Éternel"); put(Language.EN, "Wedding Gift Giver"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Artiste du Coup Critique"); put(Language.EN, "Critical Assault"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.PV, true, 7),
				new Effect(TypeEffect.PM, true, 7),
				new Proc(100, Activation.Crit, 15, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 5),
					new Effect(TypeEffect.DCCM, false, 5),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "BANKAI"); put(Language.EN, "BANKAI"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Primes"); put(Language.EN, "Jack of all trades"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.Loot, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.DCCP, false, 7),
				new Effect(TypeEffect.DCCM, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Cœur de Démon"); put(Language.EN, "Demon Heart"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Proc(1, Activation.Attack, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform0),
				})
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Contremaître de l'Île"); put(Language.EN, "Island Overseer"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.PV, true, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dernier Rempart"); put(Language.EN, "Last Man Standing"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.VIT, false, 15),
				new Proc(5, Activation.Attacked, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -20, Target.OPPONENT),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dieu de la Guerre"); put(Language.EN, "Stainless Knight"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Directeur de l'Île"); put(Language.EN, "Island Director"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Disciple du Hokuto"); put(Language.EN, "Overdrive!"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Feu Sacré"); put(Language.EN, "Sweetest Heart"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.DCCM, false, 5),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Force de la Nature"); put(Language.EN, "Icy Monarch"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Force Titanesque"); put(Language.EN, "Empowered Force"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 7),
				new Condition(TypeEffect.PV, 15, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 100),
					new Effect(TypeEffect.DefM, true, 100),
					new Effect(TypeEffect.Depla, false, 10),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Génie Surdoué"); put(Language.EN, "Shinigami"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grâce Divine"); put(Language.EN, "Fist of Justice"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.XP, false, 20),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Hakuna MataSprite"); put(Language.EN, "Ghoulish Warlord"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.RDCCM, false, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Proc(1, Activation.Attacked, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform1),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héritage d'Ezio"); put(Language.EN, "The Rogue Knight"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Depla, false, 5),
				new Proc(1, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -25, Target.OPPONENT),
					new RegenEffect(TypeEffect.PV, true, -2, TypeRegen.POISON, 3),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Hors-la-loi"); put(Language.EN, "Outlaw"); }}, Quality.P8TITLE, 20, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Insulaire Populaire"); put(Language.EN, "Popular Islander"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.ReducP_old, false, 2),
				new Effect(TypeEffect.ReducM_old, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Jiminy Cricket"); put(Language.EN, "Conscience Keeper"); }}, Quality.P8TITLE, 0, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître d'Armes"); put(Language.EN, "Master of Arms"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.Parade, false, 10),
				new Effect(TypeEffect.PM, false, -20),
				new StaticEffect(TypeStaticEffect.x2STD, 20),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître de l'Île Populaire"); put(Language.EN, "Popular Island Master"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.ReducP_old, false, 4),
				new Effect(TypeEffect.ReducM_old, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Éléments"); put(Language.EN, "Exterminator of the Abyss"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.VitComp, false, 7),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.INT, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître du Donjon"); put(Language.EN, "Troll Master"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Loot, false, 20),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Majordome de l'Île"); put(Language.EN, "Island Butler"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.PV, true, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Manager de l'Île"); put(Language.EN, "Island Manager"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.PV, true, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Miraculé des Sprites"); put(Language.EN, "Unbreakable"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DegP_old, false, 5),
				new Effect(TypeEffect.DegM_old, false, 5),
				new Effect(TypeEffect.XP, false, 20),
				new Condition(TypeEffect.PV, 20, 30, new Calculable[] {
					new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Muraille Ultime"); put(Language.EN, "Messenger of Steel"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Oeil de faucon"); put(Language.EN, "Tower of Defense"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.AGI, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pirate des 7 mers"); put(Language.EN, "Conqueror of the Seven Seas"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 7),
				new Effect(TypeEffect.DCCM, false, 7),
				new Effect(TypeEffect.ESQ, true, 5),
				new Proc(1, Activation.Attacked, 30, new Calculable[] {
					new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Prince de Kaslow"); put(Language.EN, "Prince of Kaslow"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Propriétaire Populaire de l'Île"); put(Language.EN, "Popular Island Owner"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ReducP_old, false, 3),
				new Effect(TypeEffect.ReducM_old, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Rage du Berserk"); put(Language.EN, "Winds of Fury"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.RegenCB, false, 5),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkD, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi des Ombres"); put(Language.EN, "Crazed Combatant"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DCCP, false, 5),
				new Effect(TypeEffect.DCCM, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur des Arcanes"); put(Language.EN, "Nerd Club"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur Populaire de l'Île"); put(Language.EN, "Popular Island Lord"); }}, Quality.P8TITLE, 15, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.ReducP_old, false, 5),
				new Effect(TypeEffect.ReducM_old, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sprite Express"); put(Language.EN, "Lightspeed"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkM, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Superhéros"); put(Language.EN, "Like a Boss"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.ReducP_old, false, 5),
				new Effect(TypeEffect.ReducM_old, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vétéran d'Élite"); put(Language.EN, "Elite Warrior"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
				new Effect(TypeEffect.Atk, true, -5),
				new Effect(TypeEffect.AtkM, true, -5),
				new Effect(TypeEffect.VitComp, false, 7),
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.VitAtkD, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "World Boss"); put(Language.EN, "Sprite Messenger Title"); }}, Quality.P8TITLE, 1, false, GradeName.NONE, Tag.TITLEP8, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur du domaine du chaos"); put(Language.EN, "Conqueror of the Chaos Realm"); }}, Quality.RED, 70, true, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Éternel ressuscité"); put(Language.EN, "Reborn Immortal"); }}, Quality.RED, 31, true, GradeName.NONE, Tag.REINCA, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.VIT, false, 20),
				new Effect(TypeEffect.VOL, false, 20),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien ressuscité"); put(Language.EN, "Reborn Guardian"); }}, Quality.RED, 31, true, GradeName.NONE, Tag.REINCA, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.VIT, false, 12),
				new Effect(TypeEffect.VOL, false, 12),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le retour du fils des Sprites"); put(Language.EN, "Reborn Sprite Child"); }}, Quality.RED, 31, true, GradeName.NONE, Tag.REINCA, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager de l'espoir ressuscité"); put(Language.EN, "Reborn Messenger of Hope"); }}, Quality.RED, 31, true, GradeName.NONE, Tag.REINCA, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Célèbre Duelliste"); put(Language.EN, "Famous Duelist"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Monstres - Champion"); put(Language.EN, "Monster Raider Champion"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitAtkD, false, 8),
				new Effect(TypeEffect.VitAtkM, false, 8),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Monstres - Élite"); put(Language.EN, "Monster Raider Elite"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Monstres - Gladiateur"); put(Language.EN, "Monster Raider Gladiator"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 6),
				new Effect(TypeEffect.VitAtkD, false, 6),
				new Effect(TypeEffect.VitAtkM, false, 6),
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.ESQ, true, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Monstres - Mercenaire"); put(Language.EN, "Monster Raider Mercenary"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 2),
				new Effect(TypeEffect.VitAtkD, false, 2),
				new Effect(TypeEffect.VitAtkM, false, 2),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Couple Béni par le Roi des Sprites"); put(Language.EN, "Couple Blessed by the Sprite King"); }}, Quality.PURPLE, 20, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Monstres - Champion"); put(Language.EN, "Monster Conqueror Champion"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 5),
				new Effect(TypeEffect.ReducM_old, false, 5),
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Monstres - Élite"); put(Language.EN, "Monster Conqueror Elite"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 3),
				new Effect(TypeEffect.ReducM_old, false, 3),
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Monstres - Gladiateur"); put(Language.EN, "Monster Conqueror Gladiator"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 4),
				new Effect(TypeEffect.ReducM_old, false, 4),
				new Effect(TypeEffect.DCCP, false, 8),
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Monstres - Mercenaire"); put(Language.EN, "Monster Conqueror Mercenary"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 2),
				new Effect(TypeEffect.ReducM_old, false, 2),
				new Effect(TypeEffect.DCCP, false, 4),
				new Effect(TypeEffect.DCCM, false, 4),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Encyclopédie Sprite"); put(Language.EN, "Sprite Encyclopedia"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.RANK, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert en Duels"); put(Language.EN, "Duel Expert"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gladiateur Champion"); put(Language.EN, "Champion Gladiator"); }}, Quality.PURPLE, 21, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gladiateur Émergeant"); put(Language.EN, "Emerging Gladiator"); }}, Quality.PURPLE, 21, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Illustre Messager des Sprites"); put(Language.EN, "Famed Sprite Messenger"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Duels"); put(Language.EN, "Duel Master"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.TCCP, false, 4),
				new Effect(TypeEffect.TCCM, false, 4),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, 4),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Gladiateur"); put(Language.EN, "Master Gladiator"); }}, Quality.PURPLE, 21, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.ESQ, true, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi des Duels"); put(Language.EN, "King of Duels"); }}, Quality.PURPLE, 31, false, GradeName.NONE, Tag.RANK, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi Gladiateur"); put(Language.EN, "Regal Gladiator"); }}, Quality.PURPLE, 21, false, GradeName.NONE, Tag.RANK, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Star des Gladiateurs"); put(Language.EN, "Star Gladiator"); }}, Quality.PURPLE, 21, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.ESQ, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Traqueur de Monstres - Champion"); put(Language.EN, "Monster Vanquisher Champion"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
				new Effect(TypeEffect.VitAtkM, false, 5),
				new Effect(TypeEffect.Toucher, false, 9),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Traqueur de Monstres - Élite"); put(Language.EN, "Monster Vanquisher Elite"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 4),
				new Effect(TypeEffect.DCCM, false, 4),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitAtkM, false, 3),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Traqueur de Monstres - Gladiateur"); put(Language.EN, "Monster Vanquisher Gladiator"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 6),
				new Effect(TypeEffect.DCCM, false, 6),
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Toucher, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Traqueur de Monstres - Mercenaire"); put(Language.EN, "Monster Vanquisher Mercenary"); }}, Quality.PURPLE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bénéficiaire du testament du Chevalier des Prairies"); put(Language.EN, ""); }}, Quality.GOLD, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 10000),
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Depla, false, -30),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Braconnier suprême"); put(Language.EN, "Monster Hunter King"); }}, Quality.GOLD, 96, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Capitulation du Duc des Sables"); put(Language.EN, "Duke of Sands' Surrender"); }}, Quality.GOLD, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 10000),
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.Depla, false, -30),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Consul de Mosunk"); put(Language.EN, "Keeper of Secrets"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 2, WeaponType.BATON),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Cupidon Amoureux"); put(Language.EN, "Third Anniversary - Thank You!"); }}, Quality.GOLD, 5, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform3),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur des Glaces d'Ilannia"); put(Language.EN, "Defender of the Frost"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegHa2M, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegGlace, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Délégué de Quayle"); put(Language.EN, "Seeker of the Storm"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Diplomate de Siropas"); put(Language.EN, "Lord of Darkness"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de WorldBoss"); put(Language.EN, "Day of Destiny Illusionary"); }}, Quality.GOLD, 170, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Élu de Bodor"); put(Language.EN, "Grassland Guardian"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.Parade, false, 5),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Émissaire d'Ewan"); put(Language.EN, "Warden of the Dead"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegHa, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegOmbre, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Envoyé d'Alice"); put(Language.EN, "Woodland Messenger"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegArc, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -5),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegNature, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur du Cauchemar du Marin"); put(Language.EN, "Crying Sailor Seeker"); }}, Quality.GOLD, 183, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.Toucher, false, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Favori de Bahadolo"); put(Language.EN, "Champion of the Sea"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Force Brute"); put(Language.EN, "Ruler of the Day of Destiny"); }}, Quality.GOLD, 170, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.VitAtk, false, 8),
				new Effect(TypeEffect.VitComp, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien des Secrets"); put(Language.EN, "Secret Destiny Discoverer"); }}, Quality.GOLD, 66, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform4),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien du Royaume de Saphaël"); put(Language.EN, "Guardian of Saphael"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 2),
				new Effect(TypeEffect.DegMa, false, 2),
				new Effect(TypeEffect.DegHa, false, 2),
				new Effect(TypeEffect.DegEp2M, false, 2),
				new Effect(TypeEffect.DegMa2M, false, 2),
				new Effect(TypeEffect.DegHa2M, false, 2),
				new Effect(TypeEffect.DegArc, false, 2),
				new Effect(TypeEffect.DegGun, false, 2),
				new Effect(TypeEffect.AtkM, true, 2, WeaponType.BATON),
				new Effect(TypeEffect.PV, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Génie de Freyja"); put(Language.EN, "The Art of Greed"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.VitComp, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gladiateur de l'Épreuve sans fin"); put(Language.EN, "Endless Trial Master"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Toucher, false, 9),
				new Effect(TypeEffect.ESQ, true, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Golem-Tanker"); put(Language.EN, "So Hard"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.DefP, true, 4),
				new Effect(TypeEffect.DefM, true, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Amiral de la Marine"); put(Language.EN, "Honorary Crying Sailor"); }}, Quality.GOLD, 183, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.Toucher, false, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héraut de Smulca"); put(Language.EN, "Highlander"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegHa2M, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Lien Éternel"); put(Language.EN, "Eternal Bond"); }}, Quality.GOLD, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new RegenEffect(TypeEffect.PV, true, 2, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, true, 2, TypeRegen.REGENERATION, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Lumière Divine"); put(Language.EN, "Endless Light Blessing"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître du Destin"); put(Language.EN, "Romantic Sprite Messenger of Love"); }}, Quality.GOLD, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, false, 100),
				new Effect(TypeEffect.PM, false, -100),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Mandataire de Jundo"); put(Language.EN, "Savior of Gaia"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.PV, true, -3),
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Membre honoraire Éternel Gélapin"); put(Language.EN, ""); }}, Quality.GOLD, 95, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 400),
				new Effect(TypeEffect.PM, false, 400),
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager d'Eugénie"); put(Language.EN, "Ginny's Messenger"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Passion durable"); put(Language.EN, "Robust Passion"); }}, Quality.GOLD, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 9),
				new Effect(TypeEffect.DCCM, false, 9),
				new Effect(TypeEffect.TCCP, false, 9),
				new Effect(TypeEffect.TCCM, false, 9),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pêcheur de Piranhas"); put(Language.EN, "Greed is Good"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Porte-parole de Ronto"); put(Language.EN, "Wasteland Warrior"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.REPUTATION, new Calculable[] {
				new Effect(TypeEffect.DegGun, false, 2),
				new Effect(TypeEffect.PV, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi des Sprites Sage"); put(Language.EN, "Sprite King of Wisdom"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.PV, true, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Super Lumière Divine sans fin"); put(Language.EN, "Glorious Endless Light Blessing"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.VitAtkD, false, 12),
				new Effect(TypeEffect.VitComp, false, 12),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Survivant du Dédale"); put(Language.EN, "Maze Survivor"); }}, Quality.GOLD, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform5),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Témoin des Pensées de la Reine de la Forêt"); put(Language.EN, "Witness of Forest Queen's Thoughts"); }}, Quality.GOLD, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 10000),
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.DefM, true, 10),
				new Effect(TypeEffect.Depla, false, -30),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de la Grande Guerre"); put(Language.EN, "Conqueror of the Great War"); }}, Quality.GOLD, 1, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
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
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Achevez le tour 60 du Pandemonium."); put(Language.EN, "Nightmare Corridor 60-Round Champ"); }}, Quality.ORANGE, 86, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.VitAtk, false, -3),
				new Effect(TypeEffect.VitComp, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Âme de Galvatron"); put(Language.EN, "Bombardier's Soul"); }}, Quality.ORANGE, 186, false, GradeName.DEMOLISSEUR, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Âme de Mégatron"); put(Language.EN, "Cogmaster's Soul"); }}, Quality.ORANGE, 186, false, GradeName.METALLEUX, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 30),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Analyseur du Pays Arc-en-Ciel"); put(Language.EN, "Prismata Puzzler"); }}, Quality.ORANGE, 91, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 2),
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Athée de Carso"); put(Language.EN, "Carso Atheist"); }}, Quality.ORANGE, 96, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 1000),
				new Effect(TypeEffect.PM, false, 1000),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bourreau du chaos spatio-temporel"); put(Language.EN, "Time and Space Chaos Terminator"); }}, Quality.ORANGE, 31, false, GradeName.NONE, Tag.TDB, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 7),
				new Effect(TypeEffect.PeneM, false, 7),
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Briseur de Dimension déformée"); put(Language.EN, "Dimensional Destroyer"); }}, Quality.ORANGE, 96, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefP, true, -7),
				new Effect(TypeEffect.DefM, true, -7),
				new Proc(25, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFoudre, false, 1000),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion en 10 Rounds de Pandemonium"); put(Language.EN, "Nightmare Corridor 10-Round Champ"); }}, Quality.ORANGE, 61, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion en 20 Rounds de Pandemonium"); put(Language.EN, "Nightmare Corridor 20-Round Champ"); }}, Quality.ORANGE, 61, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.TCCM, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion en 30 Rounds de Pandemonium"); put(Language.EN, "Nightmare Corridor 30-Round Champ"); }}, Quality.ORANGE, 61, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion en 45 Rounds du Pandemonium"); put(Language.EN, "Nightmare Corridor 45-Round Champ"); }}, Quality.ORANGE, 75, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dominateur de Kaslow Bouillonnante"); put(Language.EN, "Seething Kaslow Dominator"); }}, Quality.ORANGE, 186, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 8),
				new Effect(TypeEffect.AtkD, true, 8),
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Équipe Trésor de la Forêt"); put(Language.EN, "Forest Treasure Seeker"); }}, Quality.ORANGE, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Condition(TypeCondition.SANCTU1, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Évolution du gourou"); put(Language.EN, "Monk's Soul"); }}, Quality.ORANGE, 86, false, GradeName.CHRONODERIVEUR, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
				new Proc(100, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 80),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Excavateur des sables"); put(Language.EN, "Sand Treasure Excavator"); }}, Quality.ORANGE, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Condition(TypeCondition.SANCTU2, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Exorciste"); put(Language.EN, "Reaper"); }}, Quality.ORANGE, 186, false, GradeName.CLERC, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ReducPtsP, false, -50),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Forteresse"); put(Language.EN, "Mechanical Fortress Seeker"); }}, Quality.ORANGE, 85, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.PM, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Tour"); put(Language.EN, "Phoenix Tower Explorer"); }}, Quality.ORANGE, 85, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.PV, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Tour du Phénix"); put(Language.EN, "Phoenix Tower Explorer"); }}, Quality.ORANGE, 68, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.MEN, false, 10),
				new Effect(TypeEffect.PV, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur des Flammes"); put(Language.EN, "Black Flame Ruins Seeker"); }}, Quality.ORANGE, 90, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur du Labyrinthe"); put(Language.EN, "Forbidden Temple Seeker"); }}, Quality.ORANGE, 95, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DefP, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héraut de Coeur de Lion Embrasé"); put(Language.EN, ""); }}, Quality.ORANGE, 186, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héritier Légendaire"); put(Language.EN, "Legendary Heir"); }}, Quality.ORANGE, 72, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.TCCP, false, -3),
				new Effect(TypeEffect.TCCM, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros des Terres du Nord"); put(Language.EN, "Northland Hero"); }}, Quality.ORANGE, 71, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.DegAtkD, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Inquisiteur de la Frégate du Désespoir"); put(Language.EN, "Ship of Despair Inquisitor"); }}, Quality.ORANGE, 177, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Intercepteur de Dimension déformée"); put(Language.EN, "Dimensional Distorter"); }}, Quality.ORANGE, 196, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 7200),
				new Effect(TypeEffect.PM, false, 7200),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La fin du monde"); put(Language.EN, "The end of the world"); }}, Quality.ORANGE, 1, false, GradeName.NONE, Tag.TDB, new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Effect(TypeEffect.HealR, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.Depla, false, 18),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Archimage"); put(Language.EN, "Avatar's Soul"); }}, Quality.ORANGE, 186, false, GradeName.SORCIER, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Flammes Noires"); put(Language.EN, "Master of Black Flame"); }}, Quality.ORANGE, 73, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Rédempteur"); put(Language.EN, "Saint's Soul"); }}, Quality.ORANGE, 86, false, GradeName.SPATIODERIVEUR, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Shinobi"); put(Language.EN, "Windshadow's Soul"); }}, Quality.ORANGE, 186, false, GradeName.ASSASSIN, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 2),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maraudeur de la Prairie"); put(Language.EN, ""); }}, Quality.ORANGE, 71, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Condition(TypeCondition.SANCTU3, new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 15),
					new Effect(TypeEffect.VitAtkD, false, 15),
					new Effect(TypeEffect.VitAtkM, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Massacre au paradis"); put(Language.EN, "Heavenly Slaughter"); }}, Quality.ORANGE, 31, false, GradeName.NONE, Tag.TDB, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 15),
				new Effect(TypeEffect.VitAtkD, false, 15),
				new Effect(TypeEffect.VitComp, false, 15),
				new Effect(TypeEffect.Depla, false, 15),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Minotaure du Dédale"); put(Language.EN, "Forbidden Temple Conqueror"); }}, Quality.ORANGE, 78, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.DefP, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Nakama Pirate"); put(Language.EN, "Condemned Island Pioneer"); }}, Quality.ORANGE, 188, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.PM, true, -15),
				new Condition(TypeEffect.PV, 20, new Calculable[] {
					new Proc(35, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Observateur de la Côte des Naufrages"); put(Language.EN, "Border Patrol"); }}, Quality.ORANGE, 69, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.DegAtkD, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Professionnel de SOS Fantômes"); put(Language.EN, "Ghost Buster"); }}, Quality.ORANGE, 69, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.TCCP, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur d'Eugénie"); put(Language.EN, "Ginny's Protector"); }}, Quality.ORANGE, 91, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ravageur"); put(Language.EN, "Shattered Void Breaker"); }}, Quality.ORANGE, 186, false, GradeName.BERSERKER, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 20),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ravageur de la Fracture du Vide"); put(Language.EN, "Shattered Void Breaker"); }}, Quality.ORANGE, 97, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 5),
				new Effect(TypeEffect.VIT, true, 5),
				new Effect(TypeEffect.INT, true, 5),
				new Effect(TypeEffect.VOL, true, 5),
				new Effect(TypeEffect.AGI, true, 5),
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.ReducPeneM, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Rayon de lumière"); put(Language.EN, "Light of Hope"); }}, Quality.ORANGE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, -8),
				new Effect(TypeEffect.DefM, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Récupérateur des Mines"); put(Language.EN, "Mine Liberator"); }}, Quality.ORANGE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 15),
				new Effect(TypeEffect.XP, false, 2),
				new Effect(TypeEffect.DefP, true, -8),
				new Effect(TypeEffect.DefM, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Réouverture de la Mine Effondrée"); put(Language.EN, "Mine Reopener"); }}, Quality.ORANGE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.PM, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Révolution de Kaslow en Flammes"); put(Language.EN, "Blazing Kaslow Revolutionary"); }}, Quality.ORANGE, 86, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 7),
				new Effect(TypeEffect.DefM, true, 4),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Rouleur de Mécaniques"); put(Language.EN, "Cyber Conquerer"); }}, Quality.ORANGE, 63, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.PM, true, -8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sauveur de la Terre d'Elsa"); put(Language.EN, "Elsaland Savior"); }}, Quality.ORANGE, 73, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.DefM, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sauveur du Sanctuaire"); put(Language.EN, "Temple Savior"); }}, Quality.ORANGE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -10),
				new Effect(TypeEffect.Depla, false, -2),
				new Effect(TypeEffect.ReducP_old, false, 2),
				new Effect(TypeEffect.ReducM_old, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur du Sanctuaire de l'Abandon"); put(Language.EN, "Forsaken Temple Ruler"); }}, Quality.ORANGE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
				new Effect(TypeEffect.ReducP_old, false, -50),
				new Effect(TypeEffect.ReducM_old, false, -50),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sensei Zen"); put(Language.EN, "Legendary Knight"); }}, Quality.ORANGE, 72, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Shaman"); put(Language.EN, "Shaman's Soul"); }}, Quality.ORANGE, 186, false, GradeName.SAGE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ReducAtkM, false, -80),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Shinigami"); put(Language.EN, "Shadowlord's Soul"); }}, Quality.ORANGE, 186, false, GradeName.NECROMANCIEN, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.DegOmbre, false, 80),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sniper"); put(Language.EN, "Hawkeye's Soul"); }}, Quality.ORANGE, 186, false, GradeName.RANGER, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Atk, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Spritophile"); put(Language.EN, "Every Day is Sprite Day"); }}, Quality.ORANGE, 31, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
				new Effect(TypeEffect.PV, true, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Témoin d'un destin brisé"); put(Language.EN, ""); }}, Quality.ORANGE, 98, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Proc(5, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 5),
					new Effect(TypeEffect.ReflectM, false, 5),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Templier"); put(Language.EN, "Crusader's Soul"); }}, Quality.ORANGE, 186, false, GradeName.PALADIN, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
			}),
		};
	}
	
	private static Title[] getBlue() {
		return new Title[] {
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "À l'étouffée !"); put(Language.EN, "All Choked Up!"); }}, Quality.BLUE, 17, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "À la rescousse du Sprite piégé"); put(Language.EN, "Rescue the Trapped Sprite"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amateur de Gâteau de Lune"); put(Language.EN, "Mooncake Aficionado"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, true, 200),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ambassadeur de l'amour"); put(Language.EN, "Love Ambassador"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ambassadeur du Chocolat de l'Amour"); put(Language.EN, "Valentine Chocolate Ambassador"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, false, 2),
				new Effect(TypeEffect.DefM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ami des sorcières"); put(Language.EN, "The Witch's Friend"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amitié Inter Espèce"); put(Language.EN, "Interspecies Friendship"); }}, Quality.BLUE, 71, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.Depla, false, 6),
				new Effect(TypeEffect.Loot, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amour Courtois"); put(Language.EN, "Courageous Romance"); }}, Quality.BLUE, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amour Interdit"); put(Language.EN, "Forbidden Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amour Niais"); put(Language.EN, "Hopeful Romance"); }}, Quality.BLUE, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amour pour Toujours"); put(Language.EN, "Enduring Romance"); }}, Quality.BLUE, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amoureux Ensorcelé"); put(Language.EN, "Pompatus of Love"); }}, Quality.BLUE, 53, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ange de bienveillance"); put(Language.EN, "Welcoming Angel"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Apôtre des Profondeurs"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Proc(5, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 1000),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Appelez-moi le roi de la fête"); put(Language.EN, "Call me the celebration king"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8),
				new Effect(TypeEffect.Loot, false, 8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Arbre Saint"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform32),
				new StaticEffect(TypeStaticEffect.NoMove),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Aujourd'hui, je n'ai pas de limites"); put(Language.EN, "Limitless"); }}, Quality.BLUE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bénédiction de Joline"); put(Language.EN, "Jolin's Blessing of Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 1),
				new Effect(TypeEffect.Depla, false, 9),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Béni soit l'amour"); put(Language.EN, "Blessed Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1),
				new RegenEffect(TypeEffect.PV, false, 13, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 14, TypeRegen.REGENERATION, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bien mal acquis"); put(Language.EN, "One Should not Take Things for Granted"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new RegenEffect(TypeEffect.PV, false, 5, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 5, TypeRegen.REGENERATION, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bourreau des Rebelles"); put(Language.EN, "Skullcrusher"); }}, Quality.BLUE, 57, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Brise-nuit"); put(Language.EN, "Night Crusher"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Ombre, false, 50),
				new Proc(5, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegSacre, false, 1000),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Certificat d'Appréciation"); put(Language.EN, "Certificate of Appreciation"); }}, Quality.BLUE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Cette odeur de mai"); put(Language.EN, "May's Unique Fragrance"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 15),
				}),
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion de l'Amour et de la Paix"); put(Language.EN, "Champion of Love and Peace"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion X-Legend"); put(Language.EN, "X-Legend's Fearless Champion"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 1),
				new Effect(TypeEffect.AtkM, true, 1),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de la Tour des bêtes"); put(Language.EN, "Vilefiend Raider"); }}, Quality.BLUE, 1, false, GradeName.NONE, Tag.TDB, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 7),
				new Effect(TypeEffect.AtkD, true, 7),
				new Effect(TypeEffect.AtkM, true, 7),
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Monstres"); put(Language.EN, "Endurance Monster Raider"); }}, Quality.BLUE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
				new Effect(TypeEffect.VitAtkM, false, 4),
				new Effect(TypeEffect.Depla, false, 4),
				new Effect(TypeEffect.DefP, true, -6),
				new Effect(TypeEffect.DefM, true, -6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur du Monstrounet du Nouvel An"); put(Language.EN, "Little Year Monster Victor"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.DegP_old, false, 2),
				new Effect(TypeEffect.DegM_old, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chevalier du Cristal"); put(Language.EN, "Crystal Warrior"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Christmas placeholder"); put(Language.EN, "Christmas placeholder"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Citrouille sentinelle"); put(Language.EN, "Pumpkin Night Watchman"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.PV, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Clair comme de l'Eau"); put(Language.EN, "Watered Down"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new RegenEffect(TypeEffect.PV, false, 10, 15, TypeRegen.REGENERATION, 10),
				new RegenEffect(TypeEffect.PM, false, 10, 15, TypeRegen.REGENERATION, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Coeur vagabond"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ReducP_old, false, 5),
				new Effect(TypeEffect.ReducM_old, false, 5),
				new RegenEffect(TypeEffect.PM, false, 10, TypeRegen.REGENERATION, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Collectionneur d'oeufs de Pâques"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Combattant d'Élite"); put(Language.EN, "Gladiator"); }}, Quality.BLUE, 57, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.TCCP, false, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Compagnon du lapin de Célébration Lunaire"); put(Language.EN, "Mid-Autumn Moon Rabbit's Companion"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 5),
				new RegenEffect(TypeEffect.PV, false, 15, 20, TypeRegen.REGENERATION, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Confiseur de l'amour"); put(Language.EN, "Matchmaker"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new StaticEffect(TypeStaticEffect.Poisse, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Corsaire Indomptable"); put(Language.EN, "Mighty Pirate"); }}, Quality.BLUE, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Cosméto-Poing"); put(Language.EN, "Splendid Punch"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitComp, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Costumadier"); put(Language.EN, "Fancy Dresser"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.PV, false, 400),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Crapule Pirate"); put(Language.EN, "Evil Pirate"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur du Cristal"); put(Language.EN, "Crystal Defender"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new Effect(TypeEffect.PV, false, 100),
				new Effect(TypeEffect.PM, false, 100),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Demi de Mêlée"); put(Language.EN, "Person Who Knows the Truth"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Démolisseur à la rescousse"); put(Language.EN, "Demolitionist Rescue"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dentiste de la Gueule Rugissante"); put(Language.EN, "Roaring Maw Raider"); }}, Quality.BLUE, 50, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.DefP, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Détective désigné"); put(Language.EN, "Elected Investigator"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 5),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dieu de la bonne chair"); put(Language.EN, "Delicatessen Deity"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.RTCCP, false, -10),
				new Effect(TypeEffect.RTCCM, false, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dieu du Cristal"); put(Language.EN, "Crystal Hero"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Monstres"); put(Language.EN, "Courageous Monster Conqueror"); }}, Quality.BLUE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitAtkD, false, 10),
				new Effect(TypeEffect.VitAtkM, false, 10),
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.DefP, true, -12),
				new Effect(TypeEffect.DefM, true, -12),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dose d'amour et de justice"); put(Language.EN, "Scrub of Love and Justice"); }}, Quality.BLUE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform28),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Écrivain fantastique"); put(Language.EN, "Unique Wonderbook Writer"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 15),
				}),
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Écrivain Populaire"); put(Language.EN, "Best-Selling Author"); }}, Quality.BLUE, 1, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Efficacité élevée"); put(Language.EN, "Effective Assailant"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Embrouillé"); put(Language.EN, "Befuddled"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Nature, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Entremetteur de Saphaël"); put(Language.EN, "Interspecies Friendship"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Envoyé des Anciens"); put(Language.EN, "Vanguard of the Ancients"); }}, Quality.BLUE, 60, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Espoir de Gaïa"); put(Language.EN, "Gaia's Last Hope"); }}, Quality.BLUE, 56, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.ESQ, true, -1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Espoir verdoyant"); put(Language.EN, "Green Hopes"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new RegenEffect(TypeEffect.PV, false, 100, TypeRegen.REGENERATION, 3),
				new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Esprit de Thanksgiving"); put(Language.EN, "Thanksgiving Spirit"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Étoile de l'Ange de Noël"); put(Language.EN, "Christmas Guardian Star"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Éxécuteur du Devoir Divin"); put(Language.EN, "Divine Duty Executant"); }}, Quality.BLUE, 65, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert du Défi"); put(Language.EN, "Challenge Expert"); }}, Quality.BLUE, 68, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de l'Île Condamnée"); put(Language.EN, "Condemned Island Seeker"); }}, Quality.BLUE, 188, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, true, 10),
				new Effect(TypeEffect.PM, true, -15),
				new Condition(TypeEffect.PV, 20, new Calculable[] {
					new Proc(35, Activation.Attacked, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 100000, TypeRegen.REGENERATION),
						new RegenEffect(TypeEffect.PM, true, -100, TypeRegen.REGENERATION),
					}),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Cité"); put(Language.EN, "Ancient City of Vines Seeker"); }}, Quality.BLUE, 80, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Frégate du Désespoir"); put(Language.EN, "Ship of Despair Seeker"); }}, Quality.BLUE, 177, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.PV, false, 6000),
				new Effect(TypeEffect.PM, false, 6000),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Gueule"); put(Language.EN, "Roaring Maw Seeker"); }}, Quality.BLUE, 70, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.DefP, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Tombe"); put(Language.EN, "Holy King's Tomb Seeker"); }}, Quality.BLUE, 75, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur du Temps"); put(Language.EN, "Time Seeker"); }}, Quality.BLUE, 65, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DefP, true, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Exterminateur d'Halloween"); put(Language.EN, "Halloween Exterminator"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
				new Effect(TypeEffect.DegSacre, false, 200),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Faisons la fête avec l'idole"); put(Language.EN, "Celebrate with Idol"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.VitComp, false, 2),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Fée terrestre"); put(Language.EN, "Earthbound Fairy"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 200),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "File au vent"); put(Language.EN, "Wind Rider"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Proc(100, Activation.Nothing, 2, 10, new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
				new Proc(100, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.Depla, false, -30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Flash"); put(Language.EN, "Shining Beacon"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 250),
				new Effect(TypeEffect.PM, false, 250),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Forban Pirate"); put(Language.EN, "Conqueror of the Praetorian Guard"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Garde démoniaque"); put(Language.EN, "Demonic Guard"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 2),
				new Effect(TypeEffect.ReducP_old, false, -10),
				new Effect(TypeEffect.ReducM_old, false, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de l'amour"); put(Language.EN, "Guardian of Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de l'Archipel Millénaire"); put(Language.EN, "Golden Sandbar Keeper"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de la Baie Bleue"); put(Language.EN, "Blue Bay Harbor Guard"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de la Tombe du Roi"); put(Language.EN, "Steward of the King's Tomb"); }}, Quality.BLUE, 56, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.PV, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien du Campement Sylvestre"); put(Language.EN, "Forest Campsite Keeper"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform8),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien du dîner de la Veille du Nouvel An"); put(Language.EN, "Guardian of New Year's Eve Dinner"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
				new Effect(TypeEffect.FCE, true, 3),
				new Effect(TypeEffect.VIT, true, 3),
				new Effect(TypeEffect.INT, true, 3),
				new Effect(TypeEffect.VOL, true, 3),
				new Effect(TypeEffect.AGI, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gaveur de poulette"); put(Language.EN, "Chicken-Eating Helper"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.INVOCATION, NameTransform.Invoc0),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Général du Cristal"); put(Language.EN, "Crystal Knight"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Général Psychique"); put(Language.EN, "Psychic General"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Goûteur de chocolat"); put(Language.EN, "Chocolate Gourmand"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD, 1),
				new StaticEffect(TypeStaticEffect.x3STD, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Conquérant de Saphaël"); put(Language.EN, "X-Legend 10th Anniversary Conqueror"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand explorateur"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.INT, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Génie"); put(Language.EN, "See For Yourself"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Maître tout Puissant"); put(Language.EN, "Praised One"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 14),
				new Effect(TypeEffect.VitAtkD, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Manchot de Noël"); put(Language.EN, "Big Christmas Penguin"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform9),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grande bienveillance"); put(Language.EN, "Justice is Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 5),
				new RegenEffect(TypeEffect.PV, false, 15, 20, TypeRegen.REGENERATION, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gros Blasé"); put(Language.EN, "Posse"); }}, Quality.BLUE, 84, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 10),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerrier invincible"); put(Language.EN, "Invincible Warrior"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 2),
				new Effect(TypeEffect.VIT, true, 2),
				new Effect(TypeEffect.INT, true, 2),
				new Effect(TypeEffect.VOL, true, 2),
				new Effect(TypeEffect.AGI, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héraut royal des Sprites"); put(Language.EN, "Royal Forerunner Sprite Messenger"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héritier du Dieu du casino"); put(Language.EN, "Gambling God's Successor"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros du Ratafia"); put(Language.EN, "Ratafia Hero"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros en Herbe"); put(Language.EN, "Bite-Sized Wonder Man"); }}, Quality.BLUE, 21, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Homme-bête assassin"); put(Language.EN, "Beastman Assassin"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.FCE, true, 2),
				new Effect(TypeEffect.VIT, true, 2),
				new Effect(TypeEffect.INT, true, 2),
				new Effect(TypeEffect.VOL, true, 2),
				new Effect(TypeEffect.AGI, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Honorable compagnon"); put(Language.EN, "Guard Honorable Teammate"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Proc(5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 50),
				}),
				new Proc(5, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 50),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Hurler à la lune"); put(Language.EN, "Lunar Accuser"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Inébranlable foi en l'amour"); put(Language.EN, "Still Believe in Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.INT, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Infini"); put(Language.EN, "Unlimited"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VIT, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Intoxication estivale"); put(Language.EN, "Summer Intoxication"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.RegenPV, false, 100),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Invention géniale"); put(Language.EN, "Ingenious Innovation"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Atk, true, -2),
				new Effect(TypeEffect.AtkD, true, -2),
				new Effect(TypeEffect.AtkM, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Jardinier d'élite"); put(Language.EN, "Pro Gardener"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Proc(10, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 100),
				}),
				new Proc(10, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 100),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Je suis le roi dindon"); put(Language.EN, "I am the Turkey King"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform10),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Je vous aurai !"); put(Language.EN, "I'll Get You"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
				new Effect(TypeEffect.AGI, true, 1),
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Joueur de légende"); put(Language.EN, "Legendary Player"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform11),
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform12),
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform13),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Jour de baptême"); put(Language.EN, "Day of Naming"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "L'affliction du monstre"); put(Language.EN, "The sorrow of the monster"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 10),
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "L'argent est roi"); put(Language.EN, "Money Talks"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.Loot, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La tradition du maître des Cookies de Lune"); put(Language.EN, "Mooncake Master's Tradition"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La Tribu Légendaire"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.AGI, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La voie de la Forêt"); put(Language.EN, "Forest's Champion"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.VitComp, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le cochon d'or est en forme !"); put(Language.EN, "Gold Pig on a Strong Roll"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
				new Effect(TypeEffect.DCCP, false, 2),
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le copain de l'épouvantail"); put(Language.EN, "Scarecrow's Friend"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform29),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le Gardien du Futur"); put(Language.EN, "Guardian of the Future"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le gardien du plateau"); put(Language.EN, "Guardian of the Plateau"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Sacre, false, 1),
				new Effect(TypeEffect.Ombre, false, 1),
				new Effect(TypeEffect.Foudre, false, 1),
				new Effect(TypeEffect.Feu, false, 1),
				new Effect(TypeEffect.Glace, false, 1),
				new Effect(TypeEffect.Nature, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le glas de la victoire à l'aube"); put(Language.EN, "The bell of victory at dawn"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.PM, true, 5),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le Grand Sauveur"); put(Language.EN, "Hope's Savior"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le miracle qu'est l'amour"); put(Language.EN, "Love is a miracle"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.Sacre, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le pacificateur"); put(Language.EN, "Peacemaker"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Le roi de la loterie"); put(Language.EN, "Aspiring Lottery King"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.Loot, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Légende parmi les légendes"); put(Language.EN, "Legend of Legends"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform14),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Les Soldes de Mayk"); put(Language.EN, "Mayk's Grand Sale"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.RegenPV, false, 100),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "M. Mission Possible"); put(Language.EN, "Mr. Mission Possible"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Alchimiste"); put(Language.EN, "Master Alchemist"); }}, Quality.BLUE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître de l'Oeuf de Pâques Magique"); put(Language.EN, ""); }}, Quality.BLUE, 17, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Boules de neige"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DegGlace, false, 87),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Farces"); put(Language.EN, "True Prankmaster"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.XP, false, 10),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître du Dragon de Feu"); put(Language.EN, "Firefighter"); }}, Quality.BLUE, 56, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.DegAtkD, false, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître en dissipation de désastres"); put(Language.EN, "Master of Dispelling Disasters"); }}, Quality.BLUE, 83, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître enivré"); put(Language.EN, "Drunken Master"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître farceur"); put(Language.EN, "Master Prankster"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform15),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Majin"); put(Language.EN, "Closed Beta Upgrade Majin"); }}, Quality.BLUE, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.XP, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Marathonien"); put(Language.EN, "Determination is Key"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 80),
				new Effect(TypeEffect.PM, false, 80),
				new Effect(TypeEffect.Depla, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Mégère Pirate"); put(Language.EN, "Good Pirate"); }}, Quality.BLUE, 186, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Membre essentiel"); put(Language.EN, "Essential Member"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Membre Honoraire du Clan Infernal"); put(Language.EN, "Honorary Love Stinks Member"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.Atk, false, 2),
				new Effect(TypeEffect.AtkM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager des Sprites Instruit"); put(Language.EN, "Knowledgeable Sprite Messenger"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.PM, true, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Migraine paternelle"); put(Language.EN, "Papa's Headache"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Moi, super-héros"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform33),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Montagnard au Pied Sûr"); put(Language.EN, "White Spring Poet"); }}, Quality.BLUE, 67, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Noël solitaire"); put(Language.EN, "Lonely Christmas"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 5),
				new Effect(TypeEffect.RTCCM, false, 5),
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Parfait fêtard"); put(Language.EN, "Party Animal"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 6),
				new Effect(TypeEffect.TCCM, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Péché mignon du Roi Lapin malin"); put(Language.EN, "Wily Bunny King's favorite"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, 1),
				new Effect(TypeEffect.Loot, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pilote de bateau-dragon estival"); put(Language.EN, "Dragon Boat Pilot"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.ESQ, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Plaisir sans fin"); put(Language.EN, "Boundary Breaker"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 200),
				new Effect(TypeEffect.AtkM, true, 2),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pleine lune automnale"); put(Language.EN, "Autumn Full Moon"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pourfendeur de célibat"); put(Language.EN, "Single Terminator"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 3),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Preux Chevalier"); put(Language.EN, "Don't Ask, It's Terrible"); }}, Quality.BLUE, 81, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2),
				new Effect(TypeEffect.INT, false, 2),
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Prophète Visionnaire"); put(Language.EN, "Great Prophet"); }}, Quality.BLUE, 63, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur de Baie"); put(Language.EN, "Blue Bay Watcher"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.PV, false, 500),
				new Effect(TypeEffect.PM, false, 500),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur des Sprite"); put(Language.EN, "Sprite Protector"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur du Camp Sauvage"); put(Language.EN, "Wilderness Campsite Recoverer"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform16),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Purificateur Fanatique"); put(Language.EN, "The Purifier"); }}, Quality.BLUE, 62, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.DefP, true, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Qu'est-ce que l'amour ?"); put(Language.EN, "What is love?"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.RegenPV, false, 250),
				new Effect(TypeEffect.RegenPM, false, 250),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Que des sentiments purs"); put(Language.EN, "Beyond the Original Sensations"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform30),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Remède miracle"); put(Language.EN, "Insider Trading"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
				new Effect(TypeEffect.DefP, false, 150),
				new Effect(TypeEffect.DefM, false, 150),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Représentant de la Douce nuit"); put(Language.EN, "Xmas Representative"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi de la friture"); put(Language.EN, "Dumpling Kaiser"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PM, false, 500),
				new Effect(TypeEffect.DCCP, false, 3),
				new Effect(TypeEffect.DCCM, false, 3),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi des Pirates"); put(Language.EN, "True Black Bone Pirate"); }}, Quality.BLUE, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi des porcs"); put(Language.EN, "Lord of Oinks"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Seigneur du Cristal"); put(Language.EN, "Crystal Master"); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Service client au top"); put(Language.EN, ""); }}, Quality.BLUE, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Condition(TypeCondition.SPRITE, new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Singe de mon coeur"); put(Language.EN, "Primate Love"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 5),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Super Citrouille vertueuse"); put(Language.EN, "Righteous Super Pumpkin"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 5),
				new Effect(TypeEffect.Feu, false, 5),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Glace, false, 5),
				new Effect(TypeEffect.Nature, false, 5),
				new Effect(TypeEffect.Ombre, false, 5),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Supérieur du Centurion"); put(Language.EN, "Presence Above Centurion"); }}, Quality.BLUE, 79, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Supernova"); put(Language.EN, "Supernova"); }}, Quality.BLUE, 67, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.TCCP, false, -2),
				new Effect(TypeEffect.TCCM, false, -2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Témoin du rituel de résurrection"); put(Language.EN, "Witness the Resurrection Ceremony"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VIT, true, 1),
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tisseur de marées"); put(Language.EN, "Tide Weaver"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Traqueur de Monstres"); put(Language.EN, "Perseverant Monster Vanquisher"); }}, Quality.BLUE, 17, false, GradeName.NONE, Tag.RANK, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 7),
				new Effect(TypeEffect.VitAtkD, false, 7),
				new Effect(TypeEffect.VitAtkM, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.DefP, true, -9),
				new Effect(TypeEffect.DefM, true, -9),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tronche d'ange"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Troubles de la nature"); put(Language.EN, "Nature's Prayer"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.HealD, false, 10),
				new Effect(TypeEffect.HealR, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tueur de Déesse"); put(Language.EN, "Goddess Slayer"); }}, Quality.BLUE, 80, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.Depla, false, 3),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Un Brin d'Amour"); put(Language.EN, "Cupid's Helper"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Un flot de bonne fortune"); put(Language.EN, "Uninterruptable Good Luck"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Un messager chaleureux dans le froid"); put(Language.EN, "Deliverer of Joy"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Veilleur mystérieux"); put(Language.EN, "Midnight Snowfall Watcher"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.PM, false, 300),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Veuve de glace et de feu"); put(Language.EN, "Fire and Ice Mourner"); }}, Quality.BLUE, 80, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 50),
				new Effect(TypeEffect.Glace, false, 50),
				new Proc(5, Activation.Attack, new Calculable[] {
					new Effect(TypeEffect.DegFeu, false, 1000),
					new Effect(TypeEffect.DegGlace, false, 1000),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vous cherchez quelque chose ?"); put(Language.EN, "Lost and Found"); }}, Quality.BLUE, 72, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 9),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Voyageur au Coeur Brisé"); put(Language.EN, ""); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, true, 6),
				new Effect(TypeEffect.PM, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Voyageur Temporel"); put(Language.EN, "Time Traveler"); }}, Quality.BLUE, 46, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 7),
				new Effect(TypeEffect.DefP, true, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "4e Dimension - Gardien sylvestre"); put(Language.EN, "Alternate Dimension Forest Keeper"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new StaticEffect(TypeStaticEffect.x2STD, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "9e anniversaire de Muse Girl"); put(Language.EN, "9th Anniversary Muse Legend"); }}, Quality.BLUE, 15, false, GradeName.NONE, Tag.EVENT, new Calculable[] {
				new Effect(TypeEffect.PV, false, 900),
				new Effect(TypeEffect.PM, false, 900),
				new Effect(TypeEffect.VOL, false, 9),
			}),
		};
	}

	private static Title[] getGreen() {
		return new Title[] {
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Adepte de l'Agent"); put(Language.EN, "Agent's Follower"); }}, Quality.GREEN, 78, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 10),
				new Effect(TypeEffect.Atk, true, -3),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Agent Double"); put(Language.EN, "The Infiltrator"); }}, Quality.GREEN, 62, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Aimer sans Regrets"); put(Language.EN, "Shameless Lover"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.TCCM, false, 10),
				new Effect(TypeEffect.ESQ, true, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Âme de Dragon Noir"); put(Language.EN, "Phantom Dragon Punisher"); }}, Quality.GREEN, 51, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ami de l'Océan"); put(Language.EN, "Hero of the High Seas"); }}, Quality.GREEN, 38, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ami des Grayds"); put(Language.EN, "Myriglia's Ally"); }}, Quality.GREEN, 91, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.INT, false, 8),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Amitié de l'Apprentie Sorcière"); put(Language.EN, "Friendship Magic"); }}, Quality.GREEN, 89, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5),
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Analyseur de Rêve"); put(Language.EN, "Dream Decoder"); }}, Quality.GREEN, 91, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Annonciateur de Mauvaises Nouvelles"); put(Language.EN, "Harbinger of Sorrow"); }}, Quality.GREEN, 62, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Arracheur de Pétales"); put(Language.EN, "Flower Queen Champion"); }}, Quality.GREEN, 77, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Assaillant de Tour"); put(Language.EN, "Tower Assault"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Assassin du Dirigeant"); put(Language.EN, "Assassin of the Ruler"); }}, Quality.GREEN, 96, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 30),
				}),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Assistant de Kuma"); put(Language.EN, "Kuma's Assistant"); }}, Quality.GREEN, 168, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Assistant du Garde de Kaslow"); put(Language.EN, "Kaslow Guard Assistant"); }}, Quality.GREEN, 80, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VitAtk, false, -4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Avatar"); put(Language.EN, "Exorcism Master"); }}, Quality.GREEN, 79, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bannisseur de l'Esprit d'Epée"); put(Language.EN, "Sword Spirit Champion"); }}, Quality.GREEN, 71, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Baron par Alliance"); put(Language.EN, "Grandbaron Liberator"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bête et Naïf"); put(Language.EN, "So Naive"); }}, Quality.GREEN, 83, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bienfaiteur de l'Île aux Trois Côtes"); put(Language.EN, "Prism Island Defender"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Bûcheron Infatigable"); put(Language.EN, "Marsh Madness"); }}, Quality.GREEN, 46, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Buveur sans Soif"); put(Language.EN, "Hot Spring Enthusiast"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform17),
				new Effect(TypeEffect.Depla, false, -120),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Démons"); put(Language.EN, "Demon Crusher"); }}, Quality.GREEN, 36, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur Élite"); put(Language.EN, "Champion of Deep Roar"); }}, Quality.GREEN, 25, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(1.5, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 15),
				}),
				new Proc(1.5, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chevalier à Plumes"); put(Language.EN, "Dark Sunbird Knight"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Combattant du Crime"); put(Language.EN, "Peacekeeper"); }}, Quality.GREEN, 46, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Commandant"); put(Language.EN, "Commander"); }}, Quality.GREEN, 79, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Compagnon Ailé"); put(Language.EN, "Celestia Companion"); }}, Quality.GREEN, 81, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, -4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Concierge de la Mine Écroulée"); put(Language.EN, "Collapsed Mine Cleanser"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PM, false, 300),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VitComp, false, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Conquérant de la Caverne de l'Écho"); put(Language.EN, "Echo Cave Explorer"); }}, Quality.GREEN, 40, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Cortex Maximus"); put(Language.EN, "Wish I Had My GPS"); }}, Quality.GREEN, 81, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur de fer -Quatrième Dimension"); put(Language.EN, "Dimensional Ironwheel Defender"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform18),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur de l'Eau Bénite"); put(Language.EN, "Holy Water Defender"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.Depla, false, 6),
				new Effect(TypeEffect.Loot, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur du Plateau de l'Espoir"); put(Language.EN, "Dreamer's Plateau Defender"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform19),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Destructeur de Preuve"); put(Language.EN, "Evidence Destroyer"); }}, Quality.GREEN, 81, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Toucher, false, -4),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Détective Autodidacte"); put(Language.EN, "Self-Appointed Sherlock Holmes"); }}, Quality.GREEN, 76, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Disciple de Carso"); put(Language.EN, "Disciple of Carso"); }}, Quality.GREEN, 80, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dompteur de Loups Sauvages"); put(Language.EN, "White Wolf Warrior"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dresseur de Lions"); put(Language.EN, "Lion Tamer"); }}, Quality.GREEN, 31, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Dure Vérité"); put(Language.EN, "Harsh Truth"); }}, Quality.GREEN, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Éleveur de Poulets"); put(Language.EN, "Dawn Sunbird Knight"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ennemi des Pirates"); put(Language.EN, "Rabble Rouser"); }}, Quality.GREEN, 38, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Envahisseur Fou"); put(Language.EN, "Crazy Invader"); }}, Quality.GREEN, 40, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 3),
				new Effect(TypeEffect.DefP, true, -3),
				new Effect(TypeEffect.DefM, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Étudiant de l'Académie"); put(Language.EN, "Magic Academy Scholar"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Excavateur du Temple Déserté"); put(Language.EN, "Temple Archaeologist"); }}, Quality.GREEN, 36, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert au Bras de Fer"); put(Language.EN, "Iron Ape Champion"); }}, Quality.GREEN, 66, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert de la Colère"); put(Language.EN, "Wraith Expert"); }}, Quality.GREEN, 82, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert Jardinier"); put(Language.EN, "Champion of Deep Scourge"); }}, Quality.GREEN, 15, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 10),
				}),
				new Proc(1, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 10),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Caverne"); put(Language.EN, "Spelunker"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Depla, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Caverne de la Prairie"); put(Language.EN, "Spelunker"); }}, Quality.GREEN, 20, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur de la Mine"); put(Language.EN, "Forbidden Mine Seeker"); }}, Quality.GREEN, 52, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateur Intrépide"); put(Language.EN, "Treasure Appraisal Specialist"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.DegAtkD, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorateurs de la Forêt lumineuse"); put(Language.EN, "Dazzledell Explorer"); }}, Quality.GREEN, 93, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Loot, false, 10),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Explorez les membres pour trouver les reliques de Technopolis."); put(Language.EN, "Relic Runner"); }}, Quality.GREEN, 89, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Exterminateur d'Insectes"); put(Language.EN, "Mantis-Fist Champion"); }}, Quality.GREEN, 75, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Exterminateur d'insectes robots"); put(Language.EN, "Mecha-Exterminator"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Foudre, false, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Faust"); put(Language.EN, "Listener"); }}, Quality.GREEN, 79, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Fléau des Dragons"); put(Language.EN, "Raging Flame"); }}, Quality.GREEN, 56, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Fléau des Moustiques"); put(Language.EN, "Flyswatter"); }}, Quality.GREEN, 18, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de Kansas Palembang"); put(Language.EN, "Kalambang Guardian"); }}, Quality.GREEN, 96, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de la Nature"); put(Language.EN, "Keeper of the Wilds"); }}, Quality.GREEN, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Geek Surdoué"); put(Language.EN, "Silver Pilot"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Grand Méchant Loup"); put(Language.EN, "Night Wolf Warrior"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Groupe de riposte du Temple Oublié"); put(Language.EN, "Forsaken Assaulter"); }}, Quality.GREEN, 88, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.VOL, false, 8),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerrier ayant vaincu Gardien de Tombe Homme-bête"); put(Language.EN, "Keeper of Beastman Tomb Victor"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 30),
				}),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerrier ayant vaincu Griffe de l'Effroi"); put(Language.EN, "Claw of Fear Victor"); }}, Quality.GREEN, 69, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerrier ayant vaincu Seigneur de la Forêt du Triste Sprite"); put(Language.EN, "Lord of Sprite Tear Forest Victor"); }}, Quality.GREEN, 78, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerriers combattant Foudre rugissante"); put(Language.EN, "Lightning Rider"); }}, Quality.GREEN, 96, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 30),
				}),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerriers combattant la Fuite d'essence"); put(Language.EN, "Grease Monkey"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Guerriers combattant Sire Fungus"); put(Language.EN, "Fungicidal Tendencies"); }}, Quality.GREEN, 93, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héritier de la Fournaise"); put(Language.EN, "Successor of Fire"); }}, Quality.GREEN, 21, false, GradeName.NONE, Tag.PVP, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform20),
				new Effect(TypeEffect.Depla, false, -100),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros de la Crête Dimensionnelle"); put(Language.EN, "Dimensional Ridge Liberator"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.TCCP, false, 10),
				new Effect(TypeEffect.ESQ, true, -10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros de la Tribu des Dragons"); put(Language.EN, "Ally of the Dragon Tribe"); }}, Quality.GREEN, 45, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.DegAtkD, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros des Côtes Dimensionnelles"); put(Language.EN, "Dimensional Beach Hero"); }}, Quality.GREEN, 76, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros des Mines Dimensionnelles"); put(Language.EN, "Dimensional Mine Defender"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.PV, false, 300),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Indiana Jones"); put(Language.EN, "Deserted Temple Seeker"); }}, Quality.GREEN, 55, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.ESQ, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ingénieur Talentueux"); put(Language.EN, "Golden Pilot"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.PV, true, -45),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Insecticide"); put(Language.EN, "Bugslayer"); }}, Quality.GREEN, 64, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Inspiration"); put(Language.EN, "Inspiration"); }}, Quality.GREEN, 82, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Jouer au plus bête"); put(Language.EN, "Dumb and Dumber"); }}, Quality.GREEN, 80, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La lumière au bout du tunnel"); put(Language.EN, "Light in the Darkness"); }}, Quality.GREEN, 91, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.PV, true, 3),
				new Effect(TypeEffect.PM, true, 3),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "La Mode des Carapaces"); put(Language.EN, "Carapace Fashion"); }}, Quality.GREEN, 70, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Lanceur d'alerte"); put(Language.EN, "Whistleblower"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Depla, false, -7),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Libérateur de la Vallée de la lumière"); put(Language.EN, "Dazzledell Liberator"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform21),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître des Sprites"); put(Language.EN, "Spritemaster"); }}, Quality.GREEN, 51, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
				new Effect(TypeEffect.INT, false, 1),
				new Effect(TypeEffect.VOL, false, 1),
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître du Temps"); put(Language.EN, "Time Warden"); }}, Quality.GREEN, 51, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Maître Tacticien"); put(Language.EN, "Chief Tactician"); }}, Quality.GREEN, 63, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Mangeur d'Insectes"); put(Language.EN, "Entomologist"); }}, Quality.GREEN, 82, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 2),
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 15),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Meilleur Gardien de But"); put(Language.EN, "Best Goalkeeper"); }}, Quality.GREEN, 56, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.Atk, true, -3),
				new Effect(TypeEffect.AtkM, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Membre du Syndicat"); put(Language.EN, "Iron Stone Engineer"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Membre Spécial de l'Expédition Royale"); put(Language.EN, "Special Member of Royal Expedition"); }}, Quality.GREEN, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager Cauchemar"); put(Language.EN, "Nightmare Messenger"); }}, Quality.GREEN, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager de la Justice"); put(Language.EN, "Hammer of Justice"); }}, Quality.GREEN, 20, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager des Sprites en Entraînement"); put(Language.EN, "Sprite Messenger in Training"); }}, Quality.GREEN, 31, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager du Vent"); put(Language.EN, "Super Courier"); }}, Quality.GREEN, 83, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.DefP, true, -50),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager Exceptionnel"); put(Language.EN, "Superfly Sprite Messenger"); }}, Quality.GREEN, 71, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2),
				new Effect(TypeEffect.INT, false, 2),
				new Effect(TypeEffect.VOL, false, 2),
				new Effect(TypeEffect.AGI, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Nettoyeur du Monstre de Boue"); put(Language.EN, "Muddy Buddy"); }}, Quality.GREEN, 61, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Nomade du Désert"); put(Language.EN, "Wasteland Wanderer"); }}, Quality.GREEN, 41, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Nounou d'Enfer"); put(Language.EN, "Mighty Nanny"); }}, Quality.GREEN, 79, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3),
				new Effect(TypeEffect.VOL, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ombres Chinoises"); put(Language.EN, "Violet Shadow"); }}, Quality.GREEN, 75, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Péninsule du Chagrin - Garde de Fer"); put(Language.EN, "Sorrow Peninsula's Guardian"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform22),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pote avec Kuda"); put(Language.EN, "Kuda's Comrade"); }}, Quality.GREEN, 88, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Atk, true, 3),
				new Effect(TypeEffect.DefP, true, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pourfendeur des Scythes"); put(Language.EN, "Scythes Slayer"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Pourfendeur du Mal"); put(Language.EN, "Sameil Champion"); }}, Quality.GREEN, 76, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Prière fervente"); put(Language.EN, "Pious Protector"); }}, Quality.GREEN, 15, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.HealR, false, 2),
				new Effect(TypeEffect.DefP, true, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Prospecteur de la Mine Interdite"); put(Language.EN, "Forbidden Mine Rescuer"); }}, Quality.GREEN, 31, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.Toucher, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protéger l'Enfant du Miracle"); put(Language.EN, "Miracle Child Protector"); }}, Quality.GREEN, 91, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Depla, false, 7),
				new Effect(TypeEffect.VitAtk, false, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Purificateur des Montagnes de Verre"); put(Language.EN, "Glazefrost Mountains Purifier"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform23),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ressusciteur du Port escarpé"); put(Language.EN, "Riptide Revivalist"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform24),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Roi de la Destruction"); put(Language.EN, "Bringer of Ruin"); }}, Quality.GREEN, 94, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 8),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.ESQ, true, -5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sauveur du Bassin fumant"); put(Language.EN, "Valiant Vaporizer"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform25),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Secours Immédiats"); put(Language.EN, "Immediate Rescue"); }}, Quality.GREEN, 61, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 6),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sentinelle de la Montagne"); put(Language.EN, "Mountain Climber"); }}, Quality.GREEN, 50, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Sherlock Sprite"); put(Language.EN, "Sprite Detective"); }}, Quality.GREEN, 84, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Soin Essentiel"); put(Language.EN, "Essential Care"); }}, Quality.GREEN, 86, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.Depla, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Soutien des mines - Quatrième Dimension"); put(Language.EN, "Dimensional Steam Cheerleader"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform26),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Spécialiste du Surimi"); put(Language.EN, "King Crab Champion"); }}, Quality.GREEN, 71, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Spéléologue"); put(Language.EN, "Cave Seeker"); }}, Quality.GREEN, 50, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 5),
				new Effect(TypeEffect.DefP, true, -3),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Super Pilote"); put(Language.EN, "Ace Pilot"); }}, Quality.GREEN, 61, false, GradeName.NONE, Tag.DONJON, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Super-Touriste"); put(Language.EN, "Ignorant Tourist"); }}, Quality.GREEN, 81, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.Atk, true, -50),
				new Effect(TypeEffect.DefP, true, 2),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tortue Ninja"); put(Language.EN, "Shell-Shock Champion"); }}, Quality.GREEN, 83, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Trafiquant d'Ivoire"); put(Language.EN, "Elephanticide Champion"); }}, Quality.GREEN, 80, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Trop Choux mais Mortels"); put(Language.EN, "Adorable but Deadly"); }}, Quality.GREEN, 93, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tueur de Dragons"); put(Language.EN, "Dragonslayer"); }}, Quality.GREEN, 41, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tueur de Vermine"); put(Language.EN, "Exterminator"); }}, Quality.GREEN, 38, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Tueur pourpre - Quatrième Dimension"); put(Language.EN, "Dimensional Crimson Slayer"); }}, Quality.GREEN, 15, false, GradeName.NONE, Tag.CHRONO, new Calculable[] {
				new TransformEffect(TypeTransformation.TRANSFORMATION, NameTransform.Transform27),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vaincre les guerriers du cristal magique expérimental"); put(Language.EN, "Defeat the Magic Crystal Half Experiment's Warriors"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vaincre les guerriers du général des Hommes-bêtes"); put(Language.EN, "Defeat the Beastman All-Out Assault General's Warriors"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Proc(3, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 30),
				}),
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vaincre les guerriers du héros des Mauvais esprits"); put(Language.EN, "Defeat the Erosion Fox Demon Hero's Warriors"); }}, Quality.GREEN, 0, false, GradeName.NONE, Tag.OTHER, new Calculable[] {
				new Proc(3, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 30),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de Ken"); put(Language.EN, "Mantis-Fist Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de la Boue"); put(Language.EN, "Muddy Victor"); }}, Quality.GREEN, 80, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de Leonardo"); put(Language.EN, "Shell-Shock Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de Nagranok"); put(Language.EN, "Sword Spirit Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de Pazuzu"); put(Language.EN, "Sameil Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur de Seymour"); put(Language.EN, "Flower Queen Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Colonel"); put(Language.EN, "Elephanticide Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Crabe Géant"); put(Language.EN, "King Crab Victor"); }}, Quality.GREEN, 90, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Cyclope"); put(Language.EN, "Victorious Tactician"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegHuma, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Démon"); put(Language.EN, "Demon Victor"); }}, Quality.GREEN, 55, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Dragon spectral"); put(Language.EN, "Phantom Dragon Victor"); }}, Quality.GREEN, 70, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Dragon Zombie"); put(Language.EN, "Dragon Victor"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMort, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Feu"); put(Language.EN, "Flame Victor"); }}, Quality.GREEN, 75, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Gorille d'Acier"); put(Language.EN, "Iron Ape Victor"); }}, Quality.GREEN, 85, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Lion"); put(Language.EN, "Lion Victor"); }}, Quality.GREEN, 50, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Vainqueur du Marécage"); put(Language.EN, "Marsh Victor"); }}, Quality.GREEN, 65, false, GradeName.NONE, Tag.BOSS, new Calculable[] {
				new Proc(2, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 20),
				}),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Votre pire cauchemar"); put(Language.EN, "Your Worst Nightmare"); }}, Quality.GREEN, 60, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 1),
			}),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Voyageur Temporel"); put(Language.EN, "Time Traveler"); }}, Quality.GREEN, 62, false, GradeName.NONE, Tag.QUETE, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3),
				new Effect(TypeEffect.VIT, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
				new Effect(TypeEffect.Depla, false, -3),
			}),
		};
	}

	private static Title[] getWhite() {
		return new Title[] {
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ambassadeur des Rois des Sprites"); put(Language.EN, "Emissary of the Sprite Kings"); }}, Quality.WHITE, 0, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ami des Gélapins"); put(Language.EN, "Jelly Rabbit Fan"); }}, Quality.WHITE, 20, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ange du Paradis Perdu"); put(Language.EN, "Deepfathom Diver"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Champion de l'Ile de Siwa"); put(Language.EN, "Champion of Siwa Island"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chasseur de Gros Gibier"); put(Language.EN, "Big Game Hunter"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Chevalier de l'Ordre du Gélapin"); put(Language.EN, "Jelly Rabbit Knight"); }}, Quality.WHITE, 70, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Coeur de Pierre"); put(Language.EN, ""); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Collectionneur Maniaque"); put(Language.EN, "Master of the Universe"); }}, Quality.WHITE, 0, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Conseillé avisé d'Ilya"); put(Language.EN, "Shining Star of Ilya"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur du Plateau"); put(Language.EN, "Defender of the Plateau"); }}, Quality.WHITE, 24, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Disciple de la Lumière"); put(Language.EN, "Disciple of Brilliance"); }}, Quality.WHITE, 24, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Disciple de Maître Nanco"); put(Language.EN, "In Sprite Combat Training"); }}, Quality.WHITE, 31, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Enfant des Fleurs"); put(Language.EN, "Wilderness Survivalist"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Espoir de la Plaine"); put(Language.EN, "Monster Hunter"); }}, Quality.WHITE, 11, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Étoile Filante de Saphaël"); put(Language.EN, "Saphael Shooting Star"); }}, Quality.WHITE, 0, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert en pigments"); put(Language.EN, "Expert in Pigment Research"); }}, Quality.WHITE, 71, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Expert gazier"); put(Language.EN, "Expert in Gas Research"); }}, Quality.WHITE, 71, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Fan des Gélapins"); put(Language.EN, "Jelly Rabbit Cheerleader"); }}, Quality.WHITE, 30, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien de l'Héritage"); put(Language.EN, "Sentinel of the Ancients"); }}, Quality.WHITE, 24, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gardien des Mines"); put(Language.EN, "Steam Mine Investigator"); }}, Quality.WHITE, 11, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gélapin héros"); put(Language.EN, "Jelly Rabbit Hero"); }}, Quality.WHITE, 100, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Gélapin prophète"); put(Language.EN, "Jelly Rabbit Prophet"); }}, Quality.WHITE, 90, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Groupie des Gélapins"); put(Language.EN, "Jelly Rabbit Warrior"); }}, Quality.WHITE, 40, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Héros des Gélapins"); put(Language.EN, "Jelly Rabbit Guardian"); }}, Quality.WHITE, 50, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Lecteur Insatiable"); put(Language.EN, "Ravenous Reader"); }}, Quality.WHITE, 10, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager Corrompu"); put(Language.EN, "Dark Messenger"); }}, Quality.WHITE, 10, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager d'Élite"); put(Language.EN, "Master Sprite Messenger"); }}, Quality.WHITE, 44, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Messager de l'Automne"); put(Language.EN, "First Taste of Autumn"); }}, Quality.WHITE, 0, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Noble chevalier de Kaslow"); put(Language.EN, "Honorary Kaslow Knight"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Ombre parmi les Ombres"); put(Language.EN, "Nightwalker"); }}, Quality.WHITE, 10, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Président du Fanclub des Gélapins"); put(Language.EN, "Bestest Jelly Rabbit EVER"); }}, Quality.WHITE, 80, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur de la Forêt"); put(Language.EN, "Friend of the Forest"); }}, Quality.WHITE, 11, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur des Gélapins"); put(Language.EN, "Jelly Rabbit Protector"); }}, Quality.WHITE, 60, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur des Thermes"); put(Language.EN, "Spirit of the Sands"); }}, Quality.WHITE, 0, false, GradeName.NONE, Tag.OTHER, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Savant génial de Technopolis"); put(Language.EN, "Jale Steam Corp. Advisor"); }}, Quality.WHITE, 1, false, GradeName.NONE, Tag.REPUTATION, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Stan Pas Trop Mal"); put(Language.EN, "Stan's Not Half Bad"); }}, Quality.WHITE, 20, false, GradeName.NONE, Tag.QUETE, null),
			new Title(new HashMap<Language, String>() {{ put(Language.FR, "Touriste des Îles"); put(Language.EN, "Island Tourist"); }}, Quality.WHITE, 15, false, GradeName.NONE, Tag.QUETE, null),
		};
	}
}
