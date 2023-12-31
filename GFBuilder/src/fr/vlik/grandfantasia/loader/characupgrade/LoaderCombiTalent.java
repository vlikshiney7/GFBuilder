package fr.vlik.grandfantasia.loader.characupgrade;

import static fr.vlik.grandfantasia.enums.Check.CHECK;
import static fr.vlik.grandfantasia.enums.Language.EN;
import static fr.vlik.grandfantasia.enums.Language.FR;

import java.util.EnumMap;

import fr.vlik.grandfantasia.characupgrade.CombiTalent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.SkillEffect.TypeValue;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderCombiTalent extends LoaderTemplate {
	
	static CombiTalent[] getClass0() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Tank Lourd"); put(EN, "Heavy Tank"); }}, new int[] { 1, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Tank de Lumière"); put(EN, "Light Tank"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Général"); put(EN, "General"); }}, new int[] { 2, 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Forgeron"); put(EN, "Blacksmith"); }}, new int[] { 3, 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Samouraï du Vent"); put(EN, "Wind Samurai"); }}, new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier du Vent"); put(EN, "Wind Warrior"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerriers des Massacres"); put(EN, "Massacre Trooper"); }}, new int[] { 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Capitaine d'Application de la Loi"); put(EN, "Law Enforcement Captain"); }}, new int[] { 3, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Désorganisateur de Champ de Bataille"); put(EN, "Battlefield Breaker"); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Mercenaire de Combat"); put(EN, "Combat Mercenary"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à l'Epée Géante"); put(EN, "Greatsword Warrior"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à la Hache de Bataille"); put(EN, "War Axe Warrior"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à Hache Légère"); put(EN, "Light Axe Warrior"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Disciple"); put(EN, "Disciple"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier au Maillet Géant"); put(EN, "Great Hammer Warrior"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
		};
	}
	
	static CombiTalent[] getClass1() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Tank de Lumière"); put(EN, "Light Tank"); }}, new int[] { 1, 2, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chevalier Canonisé"); put(EN, "Holy Knight"); }}, new int[] { 2, 3, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.RDCCM, false, 50),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Maître dans l'Usage du Bouclier"); put(EN, "Shield Master"); }}, new int[] { 3, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Parade, false, 18),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Tank Lourd"); put(EN, "Heavy Tank"); }}, new int[] { 1, 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier du Vent"); put(EN, "Wind Warrior"); }}, new int[] { 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chevalier à la Frappe Puissante"); put(EN, "Striker Knight"); }}, new int[] { 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.DCCP, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Capitaine d'Application de la Loi"); put(EN, "Law Enforcement Captain"); }}, new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Samouraï du Vent"); put(EN, "Wind Samurai"); }}, new int[] { 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerriers des Massacres"); put(EN, "Massacre Trooper"); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Mercenaire de Combat"); put(EN, "Combat Mercenary"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à Hache Légère"); put(EN, "Light Axe Warrior"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier au Maillet Géant"); put(EN, "Great Hammer Warrior"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à l'Epée Géante"); put(EN, "Greatsword Warrior"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier à la Hache de Bataille"); put(EN, "War Axe Warrior"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Disciple"); put(EN, "Disciple"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
		};
	}
	
	static CombiTalent[] getClass2() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chasseur de Prime"); put(EN, ""); }}, new int[] { 1, 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new StaticEffect(TypeStaticEffect.Combi2),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur du Vent"); put(EN, "Wind Walker"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Canonnier"); put(EN, ""); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Samouraï"); put(EN, "Samurai"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.RDCCP, false, 30),
				new Effect(TypeEffect.RDCCM, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur Véloce"); put(EN, ""); }}, new int[] { 1, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Tireur Stratégique"); put(EN, ""); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Assassion de Longue Portée"); put(EN, ""); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier Lanceur de Lances"); put(EN, "Piercing Spear Warrior"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Canonnier"); put(EN, "Cannoneer"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Sniper"); put(EN, "Hawkeye"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Homme Implorant la Vie"); put(EN, "Disciple of Death"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Archer Tactique"); put(EN, "Tactical Shooter"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Éclaireur Rapide"); put(EN, "Speedy Scout"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
		};
	}
	
	static CombiTalent[] getClass3() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur du Vent"); put(EN, "Wind Walker"); }}, new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Samouraï Fantôme"); put(EN, "Phantom Samurai"); }}, new int[] { 1, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chasseur Assassin"); put(EN, "Hunting Assassin"); }}, new int[] { 2, 3, 1, 1, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S12, 50, TypeValue.PARA),
				new SkillEffect(TypeSkillEffect.Class3S13, 50, TypeValue.PARA),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Apparition"); put(EN, "Apparition"); }}, new int[] { 3, 1, 3, 3, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S14, 0, TypeValue.FUFU),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Samouraï"); put(EN, "Samurai"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.RDCCP, false, 30),
				new Effect(TypeEffect.RDCCM, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur Véloce"); put(EN, "Fast Walker"); }}, new int[] { 1, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Sniper Caché"); put(EN, "Hidden Sniper"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Saboteur"); put(EN, "Saboteur"); }}, new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier Lanceur de Lances"); put(EN, "Piercing Spear Warrior"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Canonnier"); put(EN, "Cannoneer"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Sniper"); put(EN, "Hawkeye"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Homme Implorant la Vie"); put(EN, "Disciple of Death"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Archer Tactique"); put(EN, "Tactical Shooter"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Éclaireur Rapide"); put(EN, "Speedy Scout"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
		};
	}
	
	static CombiTalent[] getClass4() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Clerc Martial Religieux"); put(EN, "Holy Martial Monk"); }}, new int[] { 1, 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur de Lumière"); put(EN, "Defender of Light"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DefP, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Disciple de Lumière"); put(EN, "Disciple of Light"); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 15),
				new Effect(TypeEffect.AtkM, true, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Évèque"); put(EN, "Bishop"); }}, new int[] { 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 20),
				new SkillEffect(TypeSkillEffect.Class4S15, 20, TypeValue.HEAL),
				new SkillEffect(TypeSkillEffect.Class4S16, 20, TypeValue.HEAL),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur de la Loi"); put(EN, "Defender of Law"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Parade, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guérisseur"); put(EN, "High Healer"); }}, new int[] { 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new SkillEffect(TypeSkillEffect.Class4S17, 30, TypeValue.HEAL),
				new SkillEffect(TypeSkillEffect.Class4S18, 30, TypeValue.HEAL),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Juge Sacré"); put(EN, "Holy Judge"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Effect(TypeEffect.DefP, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit en Mots Sacrés"); put(EN, "Scholar of the Word"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Entraîneur de la Volonté"); put(EN, "Trainer of Willpower"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.DefP, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit en Spiritualité"); put(EN, "Spiritual Scholar"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur Magique"); put(EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Missionaire"); put(EN, "Preacher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Messager Mana"); put(EN, "Mana Messenger"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Economiseur d'Energie"); put(EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass5() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Montagne Immobile"); put(EN, "Immovable Mountain"); }}, new int[] { 1, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.MEN, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Esprit Antique de Loup"); put(EN, "Ancient Wolf Spirit"); }}, new int[] { 2, 2, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 9),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Aigle Majestueux Ancien"); put(EN, "Flying Eagle Elder"); }}, new int[] { 3, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 8),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Roi de la Jungle"); put(EN, "King of the Jungle"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Prophète en Sorcellerie"); put(EN, "Witchcraft Prophet"); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 15),
				new Effect(TypeEffect.PM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Rites de Anciens"); put(EN, "Elder of Rites"); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(CHECK, TypeEffect.RDCCP, false, 40),
				new Effect(CHECK, TypeEffect.RDCCM, false, 40),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit Supérieur en Ensorcellement"); put(EN, "High Sorcery Scholar"); }}, new int[] { 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Prophète"); put(EN, "Prophet"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Juge Sacré"); put(EN, "Holy Judge"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Effect(TypeEffect.DefP, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit en Mots Sacrés"); put(EN, "Scholar of the Word"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Entraîneur de la Volonté"); put(EN, "Trainer of Willpower"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.DefP, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit en Spiritualité"); put(EN, "Spiritual Scholar"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur Magique"); put(EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Missionaire"); put(EN, "Preacher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Messager Mana"); put(EN, "Mana Messenger"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Economiseur d'Energie"); put(EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass6() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Maître des Flammes"); put(EN, "Flame Master"); }}, new int[] { 1, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S11, 6, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Mère des Glaces"); put(EN, "Ice Master"); }}, new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Glace, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S12, 12, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Maître de l'Electricité"); put(EN, "Lightning Master"); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S13, 8, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Astrologue"); put(EN, "Astrologer"); }}, new int[] { 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.MEN, true, -10),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Grand Magicien"); put(EN, "Archmage"); }}, new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Spécialiste en Mana d'Âme"); put(EN, "Soul Mana Observer"); }}, new int[] { 2, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit en Sorcellerie Avancée"); put(EN, "High Sorcery Scholar"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Prophète"); put(EN, "Prophet"); }}, new int[] { 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Magicien Mana d'âme"); put(EN, ""); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chercheur en Sorcellerie"); put(EN, "Sorcery Researcher"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 7),
				new Effect(TypeEffect.ReducStdD, false, 7),
				new Effect(TypeEffect.ReducSkillP, false, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit Spirituel"); put(EN, "Spiritual Scholar"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chercheur en Puissance Magique"); put(EN, "Magic Researcher"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur Magique"); put(EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Messager Mana"); put(EN, "Mana Messenger"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Mentor Magique"); put(EN, "Mystic Mentor"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Economiseur d'Énergie"); put(EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass7() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Homme Sage Démoniaque"); put(EN, ""); }}, new int[] { 1, 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.DefP, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marionnettiste"); put(EN, ""); }}, new int[] { 2, 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Manipulateur Magie Noire"); put(EN, ""); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.CostComp, false, -10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Astrologue"); put(EN, "Astrologer"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.MEN, true, -10),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Timonier d'Outremonde"); put(EN, ""); }}, new int[] { 2, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Observateur de l'Âme de Mana"); put(EN, ""); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit Supérieur en Ensorcellement"); put(EN, ""); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Prophète"); put(EN, "Prophet"); }}, new int[] { 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Magicien Mana d'âme"); put(EN, ""); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chercheur en Sorcellerie"); put(EN, "Sorcery Researcher"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 7),
				new Effect(TypeEffect.ReducStdD, false, 7),
				new Effect(TypeEffect.ReducSkillP, false, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Erudit Spirituel"); put(EN, "Spiritual Scholar"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Chercheur en Puissance Magique"); put(EN, "Magic Researcher"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur Magique"); put(EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Messager Mana"); put(EN, "Mana Messenger"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Mentor Magique"); put(EN, "Mystic Mentor"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Economiseur d'Énergie"); put(EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass8() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Machiniste Ultime"); put(EN, "Ultimate Machinist"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.VitAtk, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Forteresse Ultime"); put(EN, "Bastion"); }}, new int[] { 2, 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 20),
				new Effect(TypeEffect.PM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Appareil de Mouvement Perpétuel"); put(EN, "Kinetic"); }}, new int[] { 3, 2, 3, 3, }, new Calculable[] {
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 1),
				})
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Grosse Rafale"); put(EN, "Brawler"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Guerrier Avancé"); put(EN, "Supersoldier"); }}, new int[] { 2, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.TCCP, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Arme Géante"); put(EN, "Thaumaturgy"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Pistolet Automatique"); put(EN, "Self-Propelled Gun"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Robot Guerrier"); put(EN, "Mecha Warrior"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Régulateur"); put(EN, "Regulator"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur"); put(EN, "Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Armure de Tempête"); put(EN, "Galeguard"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Armure Furieuse"); put(EN, "Frenzied Armor"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass9() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Granzort"); put(EN, "Dark Conjuror"); }}, new int[] { 1, 1, 3, 3, }, new Calculable[] {
				new Condition(TypeCondition.PREPA, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 30),
					new Effect(TypeEffect.AtkD, true, 30),
					new Effect(TypeEffect.AtkM, true, 30),
				}),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Fusilier Briselame"); put(EN, "Bladesbane"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Supernova"); put(EN, "Supernova"); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.TCCP, false, 8),
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Étoile Filante"); put(EN, "Shooting Star"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 15),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Soldat Combattant"); put(EN, "Onslaught"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Machiniste d'Élite"); put(EN, "Advanced Machinist"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.DCCP, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Pistolet Automatique"); put(EN, "Self-Propelled Gun"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Robot Guerrier"); put(EN, "Mecha Warrior"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Régulateur"); put(EN, "Regulator"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Défenseur"); put(EN, "Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Armure de Tempête"); put(EN, "Galeguard"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Armure Furieuse"); put(EN, "Frenzied Armor"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass10() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Couperet de l'Air"); put(EN, "Air Chopper"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 4),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Demi Seigneur"); put(EN, "Dimensional Lord"); }}, new int[] { 2, 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new Effect(TypeEffect.RTCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Lame Démoniaque Frénétique"); put(EN, "Frenzied Demonic Blade"); }}, new int[] { 3, 2, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Dérive Spatiale"); put(EN, "Space Drift"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Briseur Dimensionnel"); put(EN, "Dimension Breaker"); }}, new int[] { 2, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Vagabond du Temps"); put(EN, "Time Drifter"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Lame de la Faille de Cristal"); put(EN, "Crystal Rift Blade"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Seigneur de la Lame Démoniaque"); put(EN, "Demon Blade Lord"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Avant-Garde du Cristal Démoniaque"); put(EN, "Demon Crystal Vanguard"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur des Ténèbres"); put(EN, "Dark Walker"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Voleur de Vie"); put(EN, "Life Snatcher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Révélateur"); put(EN, "Revealer"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass11() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Rage Démoniaque"); put(EN, "Demonic Rager"); }}, new int[] { 1, 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Incantation des Cristaux"); put(EN, "Release Crystals"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Parasite du Cristal de Sang"); put(EN, "Blood Crystal Parasite"); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new StaticEffect(TypeStaticEffect.Combi11),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Plaque de Cristal"); put(EN, "Crystal Plating"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marionnettiste"); put(EN, "Puppeteer"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 15),
				new Effect(TypeEffect.MEN, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marionnette Berserker"); put(EN, "Berserk Puppet"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.TCCM, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Lame de la Faille de Cristal"); put(EN, "Crystal Rift Blade"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Seigneur de la Lame Démoniaque"); put(EN, "Demon Blade Lord"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Avant-Garde du Cristal Démoniaque"); put(EN, "Demon Crystal Vanguard"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Marcheur des Ténèbres"); put(EN, "Dark Walker"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Voleur de Vie"); put(EN, "Life Snatcher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(FR, "Révélateur"); put(EN, "Revealer"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
		};
	}
}
