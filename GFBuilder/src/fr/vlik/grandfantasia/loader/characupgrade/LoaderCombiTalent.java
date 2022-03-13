package fr.vlik.grandfantasia.loader.characupgrade;

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
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tank Lourd"); put(Language.EN, "Heavy Tank"); }}, new int[] { 1, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tank de Lumière"); put(Language.EN, "Light Tank"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Général"); put(Language.EN, "General"); }}, new int[] { 2, 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Forgeron"); put(Language.EN, "Blacksmith"); }}, new int[] { 3, 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï du Vent"); put(Language.EN, "Wind Samurai"); }}, new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier du Vent"); put(Language.EN, "Wind Warrior"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerriers des Massacres"); put(Language.EN, "Massacre Trooper"); }}, new int[] { 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Capitaine d'Application de la Loi"); put(Language.EN, "Law Enforcement Captain"); }}, new int[] { 3, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Désorganisateur de Champ de Bataille"); put(Language.EN, "Battlefield Breaker"); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mercenaire de Combat"); put(Language.EN, "Combat Mercenary"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à l'Epée Géante"); put(Language.EN, "Greatsword Warrior"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à la Hache de Bataille"); put(Language.EN, "War Axe Warrior"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à Hache Légère"); put(Language.EN, "Light Axe Warrior"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Disciple"); put(Language.EN, "Disciple"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier au Maillet Géant"); put(Language.EN, "Great Hammer Warrior"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
		};
	}
	
	static CombiTalent[] getClass1() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tank de Lumière"); put(Language.EN, "Light Tank"); }}, new int[] { 1, 2, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier Canonisé"); put(Language.EN, "Holy Knight"); }}, new int[] { 2, 3, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.RDCCM, false, 50),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître dans l'Usage du Bouclier"); put(Language.EN, "Shield Master"); }}, new int[] { 3, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Parade, false, 18),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tank Lourd"); put(Language.EN, "Heavy Tank"); }}, new int[] { 1, 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier du Vent"); put(Language.EN, "Wind Warrior"); }}, new int[] { 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalier à la Frappe Puissante"); put(Language.EN, "Striker Knight"); }}, new int[] { 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.DCCP, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Capitaine d'Application de la Loi"); put(Language.EN, "Law Enforcement Captain"); }}, new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï du Vent"); put(Language.EN, "Wind Samurai"); }}, new int[] { 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerriers des Massacres"); put(Language.EN, "Massacre Trooper"); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mercenaire de Combat"); put(Language.EN, "Combat Mercenary"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à Hache Légère"); put(Language.EN, "Light Axe Warrior"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier au Maillet Géant"); put(Language.EN, "Great Hammer Warrior"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à l'Epée Géante"); put(Language.EN, "Greatsword Warrior"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier à la Hache de Bataille"); put(Language.EN, "War Axe Warrior"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Disciple"); put(Language.EN, "Disciple"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
		};
	}
	
	static CombiTalent[] getClass2() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur de Prime"); put(Language.EN, ""); }}, new int[] { 1, 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new StaticEffect(TypeStaticEffect.Combi2),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur du Vent"); put(Language.EN, "Wind Walker"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canonnier"); put(Language.EN, ""); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï"); put(Language.EN, "Samurai"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.RDCCP, false, 30),
				new Effect(TypeEffect.RDCCM, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur Véloce"); put(Language.EN, ""); }}, new int[] { 1, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur Stratégique"); put(Language.EN, ""); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassion de Longue Portée"); put(Language.EN, ""); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 3),
				new Effect(TypeEffect.VitAtkD, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier Lanceur de Lances"); put(Language.EN, "Piercing Spear Warrior"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canonnier"); put(Language.EN, "Cannoneer"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sniper"); put(Language.EN, "Hawkeye"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Homme Implorant la Vie"); put(Language.EN, "Disciple of Death"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Archer Tactique"); put(Language.EN, "Tactical Shooter"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éclaireur Rapide"); put(Language.EN, "Speedy Scout"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
		};
	}
	
	static CombiTalent[] getClass3() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur du Vent"); put(Language.EN, "Wind Walker"); }}, new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï Fantôme"); put(Language.EN, "Phantom Samurai"); }}, new int[] { 1, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasseur Assassin"); put(Language.EN, "Hunting Assassin"); }}, new int[] { 2, 3, 1, 1, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S12, 50, TypeValue.PARA),
				new SkillEffect(TypeSkillEffect.Class3S13, 50, TypeValue.PARA),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Apparition"); put(Language.EN, "Apparition"); }}, new int[] { 3, 1, 3, 3, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S14, 0, TypeValue.FUFU),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Samouraï"); put(Language.EN, "Samurai"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.RDCCP, false, 30),
				new Effect(TypeEffect.RDCCM, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur Véloce"); put(Language.EN, "Fast Walker"); }}, new int[] { 1, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sniper Caché"); put(Language.EN, "Hidden Sniper"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Saboteur"); put(Language.EN, "Saboteur"); }}, new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier Lanceur de Lances"); put(Language.EN, "Piercing Spear Warrior"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canonnier"); put(Language.EN, "Cannoneer"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sniper"); put(Language.EN, "Hawkeye"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Homme Implorant la Vie"); put(Language.EN, "Disciple of Death"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Archer Tactique"); put(Language.EN, "Tactical Shooter"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Éclaireur Rapide"); put(Language.EN, "Speedy Scout"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
		};
	}
	
	static CombiTalent[] getClass4() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clerc Martial Religieux"); put(Language.EN, "Holy Martial Monk"); }}, new int[] { 1, 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 5),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur de Lumière"); put(Language.EN, "Defender of Light"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DefP, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Disciple de Lumière"); put(Language.EN, "Disciple of Light"); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 15),
				new Effect(TypeEffect.AtkM, true, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Évèque"); put(Language.EN, "Bishop"); }}, new int[] { 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 20),
				new SkillEffect(TypeSkillEffect.Class4S15, 20, TypeValue.HEAL),
				new SkillEffect(TypeSkillEffect.Class4S16, 20, TypeValue.HEAL),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur de la Loi"); put(Language.EN, "Defender of Law"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 12),
				new Effect(TypeEffect.Parade, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guérisseur"); put(Language.EN, "High Healer"); }}, new int[] { 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new SkillEffect(TypeSkillEffect.Class4S17, 30, TypeValue.HEAL),
				new SkillEffect(TypeSkillEffect.Class4S18, 30, TypeValue.HEAL),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Juge Sacré"); put(Language.EN, "Holy Judge"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Effect(TypeEffect.DefP, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit en Mots Sacrés"); put(Language.EN, "Scholar of the Word"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraîneur de la Volonté"); put(Language.EN, "Trainer of Willpower"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.DefP, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit en Spiritualité"); put(Language.EN, "Spiritual Scholar"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur Magique"); put(Language.EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Missionaire"); put(Language.EN, "Preacher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Mana"); put(Language.EN, "Mana Messenger"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Economiseur d'Energie"); put(Language.EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass5() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Montagne Immobile"); put(Language.EN, "Immovable Mountain"); }}, new int[] { 1, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.MEN, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Antique de Loup"); put(Language.EN, "Ancient Wolf Spirit"); }}, new int[] { 2, 2, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 9),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aigle Majestueux Ancien"); put(Language.EN, "Flying Eagle Elder"); }}, new int[] { 3, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 8),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Roi de la Jungle"); put(Language.EN, "King of the Jungle"); }}, new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète en Sorcellerie"); put(Language.EN, "Witchcraft Prophet"); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 15),
				new Effect(TypeEffect.PM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rites de Anciens"); put(Language.EN, "Elder of Rites"); }}, new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 40),
				new Effect(TypeEffect.RTCCM, true, 40),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit Supérieur en Ensorcellement"); put(Language.EN, "High Sorcery Scholar"); }}, new int[] { 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète"); put(Language.EN, "Prophet"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Juge Sacré"); put(Language.EN, "Holy Judge"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 6),
				new Effect(TypeEffect.DefP, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit en Mots Sacrés"); put(Language.EN, "Scholar of the Word"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraîneur de la Volonté"); put(Language.EN, "Trainer of Willpower"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.DefP, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit en Spiritualité"); put(Language.EN, "Spiritual Scholar"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur Magique"); put(Language.EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Missionaire"); put(Language.EN, "Preacher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Mana"); put(Language.EN, "Mana Messenger"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Economiseur d'Energie"); put(Language.EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass6() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Flammes"); put(Language.EN, "Flame Master"); }}, new int[] { 1, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S11, 6, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mère des Glaces"); put(Language.EN, "Ice Master"); }}, new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Glace, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S12, 12, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître de l'Electricité"); put(Language.EN, "Lightning Master"); }}, new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S13, 8, TypeValue.DAMAGE),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Astrologue"); put(Language.EN, "Astrologer"); }}, new int[] { 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.MEN, true, -10),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grand Magicien"); put(Language.EN, "Archmage"); }}, new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste en Mana d'Âme"); put(Language.EN, "Soul Mana Observer"); }}, new int[] { 2, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit en Sorcellerie Avancée"); put(Language.EN, "High Sorcery Scholar"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète"); put(Language.EN, "Prophet"); }}, new int[] { 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magicien Mana d'âme"); put(Language.EN, ""); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chercheur en Sorcellerie"); put(Language.EN, "Sorcery Researcher"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 7),
				new Effect(TypeEffect.ReducStdD, false, 7),
				new Effect(TypeEffect.ReducSkillP, false, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit Spirituel"); put(Language.EN, "Spiritual Scholar"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chercheur en Puissance Magique"); put(Language.EN, "Magic Researcher"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur Magique"); put(Language.EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Mana"); put(Language.EN, "Mana Messenger"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mentor Magique"); put(Language.EN, "Mystic Mentor"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Economiseur d'Énergie"); put(Language.EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass7() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Homme Sage Démoniaque"); put(Language.EN, ""); }}, new int[] { 1, 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 10),
				new Effect(TypeEffect.DefP, true, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marionnettiste"); put(Language.EN, ""); }}, new int[] { 2, 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manipulateur Magie Noire"); put(Language.EN, ""); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
				new Effect(TypeEffect.CostComp, false, -10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Astrologue"); put(Language.EN, "Astrologer"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.MEN, true, -10),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Timonier d'Outremonde"); put(Language.EN, ""); }}, new int[] { 2, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Observateur de l'Âme de Mana"); put(Language.EN, ""); }}, new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit Supérieur en Ensorcellement"); put(Language.EN, ""); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophète"); put(Language.EN, "Prophet"); }}, new int[] { 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magicien Mana d'âme"); put(Language.EN, ""); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chercheur en Sorcellerie"); put(Language.EN, "Sorcery Researcher"); }}, new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 7),
				new Effect(TypeEffect.ReducStdD, false, 7),
				new Effect(TypeEffect.ReducSkillP, false, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Erudit Spirituel"); put(Language.EN, "Spiritual Scholar"); }}, new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chercheur en Puissance Magique"); put(Language.EN, "Magic Researcher"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur Magique"); put(Language.EN, "Magic Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Messager Mana"); put(Language.EN, "Mana Messenger"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mentor Magique"); put(Language.EN, "Mystic Mentor"); }}, new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Economiseur d'Énergie"); put(Language.EN, "Energy Saver"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass8() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Machiniste Ultime"); put(Language.EN, "Ultimate Machinist"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.VitAtk, false, 12),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Forteresse Ultime"); put(Language.EN, "Bastion"); }}, new int[] { 2, 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 20),
				new Effect(TypeEffect.PM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appareil de Mouvement Perpétuel"); put(Language.EN, "Kinetic"); }}, new int[] { 3, 2, 3, 3, }, new Calculable[] {
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 1),
				})
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grosse Rafale"); put(Language.EN, "Brawler"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guerrier Avancé"); put(Language.EN, "Supersoldier"); }}, new int[] { 2, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.TCCP, false, 3),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arme Géante"); put(Language.EN, "Thaumaturgy"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.TCCM, false, 3),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pistolet Automatique"); put(Language.EN, "Self-Propelled Gun"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robot Guerrier"); put(Language.EN, "Mecha Warrior"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Régulateur"); put(Language.EN, "Regulator"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur"); put(Language.EN, "Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure de Tempête"); put(Language.EN, "Galeguard"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure Furieuse"); put(Language.EN, "Frenzied Armor"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass9() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Granzort"); put(Language.EN, "Dark Conjuror"); }}, new int[] { 1, 1, 3, 3, }, new Calculable[] {
				new Condition(TypeCondition.PREPA, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 30),
					new Effect(TypeEffect.AtkD, true, 30),
					new Effect(TypeEffect.AtkM, true, 30),
				}),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fusilier Briselame"); put(Language.EN, "Bladesbane"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Supernova"); put(Language.EN, "Supernova"); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 12),
				new Effect(TypeEffect.TCCP, false, 8),
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étoile Filante"); put(Language.EN, "Shooting Star"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 15),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Soldat Combattant"); put(Language.EN, "Onslaught"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 5),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Machiniste d'Élite"); put(Language.EN, "Advanced Machinist"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.DCCP, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pistolet Automatique"); put(Language.EN, "Self-Propelled Gun"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robot Guerrier"); put(Language.EN, "Mecha Warrior"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Régulateur"); put(Language.EN, "Regulator"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défenseur"); put(Language.EN, "Defender"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure de Tempête"); put(Language.EN, "Galeguard"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure Furieuse"); put(Language.EN, "Frenzied Armor"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass10() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Couperet de l'Air"); put(Language.EN, "Air Chopper"); }}, new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 4),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Demi Seigneur"); put(Language.EN, "Dimensional Lord"); }}, new int[] { 2, 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 15),
				new Effect(TypeEffect.RTCCM, false, 15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame Démoniaque Frénétique"); put(Language.EN, "Frenzied Demonic Blade"); }}, new int[] { 3, 2, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 10),
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dérive Spatiale"); put(Language.EN, "Space Drift"); }}, new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Briseur Dimensionnel"); put(Language.EN, "Dimension Breaker"); }}, new int[] { 2, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vagabond du Temps"); put(Language.EN, "Time Drifter"); }}, new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame de la Faille de Cristal"); put(Language.EN, "Crystal Rift Blade"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur de la Lame Démoniaque"); put(Language.EN, "Demon Blade Lord"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Avant-Garde du Cristal Démoniaque"); put(Language.EN, "Demon Crystal Vanguard"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur des Ténèbres"); put(Language.EN, "Dark Walker"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voleur de Vie"); put(Language.EN, "Life Snatcher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Révélateur"); put(Language.EN, "Revealer"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass11() {
		return new CombiTalent[] {
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rage Démoniaque"); put(Language.EN, "Demonic Rager"); }}, new int[] { 1, 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Incantation des Cristaux"); put(Language.EN, "Release Crystals"); }}, new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Parasite du Cristal de Sang"); put(Language.EN, "Blood Crystal Parasite"); }}, new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new StaticEffect(TypeStaticEffect.Combi11),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Plaque de Cristal"); put(Language.EN, "Crystal Plating"); }}, new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marionnettiste"); put(Language.EN, "Puppeteer"); }}, new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 15),
				new Effect(TypeEffect.MEN, false, -15),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marionnette Berserker"); put(Language.EN, "Berserk Puppet"); }}, new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.TCCM, false, 6),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame de la Faille de Cristal"); put(Language.EN, "Crystal Rift Blade"); }}, new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Seigneur de la Lame Démoniaque"); put(Language.EN, "Demon Blade Lord"); }}, new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Avant-Garde du Cristal Démoniaque"); put(Language.EN, "Demon Crystal Vanguard"); }}, new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marcheur des Ténèbres"); put(Language.EN, "Dark Walker"); }}, new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voleur de Vie"); put(Language.EN, "Life Snatcher"); }}, new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new CombiTalent(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Révélateur"); put(Language.EN, "Revealer"); }}, new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
		};
	}
}
