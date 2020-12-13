package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.SkillEffect.TypeValue;

public class LoaderCombiTalent {
	
	static CombiTalent[] getClass0() {
		return new CombiTalent[] {
			new CombiTalent("Tank Lourd", new int[] { 1, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent("Tank de Lumière", new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent("Général", new int[] { 2, 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 4),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent("Forgeron", new int[] { 3, 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.DefP, true, 7),
			}),
			new CombiTalent("Samouraï du Vent", new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent("Guerrier du Vent", new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent("Guerriers des Massacres", new int[] { 2, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent("Capitaine d'Application de la Loi", new int[] { 3, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Désorganisateur de Champ de Bataille", new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Mercenaire de Combat", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent("Guerrier à l'Epée Géante", new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent("Guerrier à la Hache de Bataille", new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent("Guerrier à la Hache Lumineuse", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent("Disciple", new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
			new CombiTalent("Guerrier au Maillet Géant", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
		};
	}
	
	static CombiTalent[] getClass1() {
		return new CombiTalent[] {
			new CombiTalent("Tank de Lumière", new int[] { 1, 2, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 5),
			}),
			new CombiTalent("Chevalier Canonisé", new int[] { 2, 3, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.RDCCM, false, 50),
			}),
			new CombiTalent("Maître dans l'Usage du Bouclier", new int[] { 3, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Parade, false, 18),
			}),
			new CombiTalent("Tank Lourd", new int[] { 1, 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 3),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent("Guerrier du Vent", new int[] { 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.ESQ, false, 10),
			}),
			new CombiTalent("Chevalier à la Frappe Puissante", new int[] { 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.DCCP, false, 20),
			}),
			new CombiTalent("Capitaine d'Application de la Loi", new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Samouraï du Vent", new int[] { 1, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent("Guerriers des Massacres", new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 15),
				new Effect(TypeEffect.Atk, true, 4),
			}),
			new CombiTalent("Mercenaire de Combat", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
			}),
			new CombiTalent("Guerrier à la Hache Lumineuse", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent("Guerrier au Maillet Géant", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent("Guerrier à l'Epée Géante", new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 12),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new CombiTalent("Guerrier à la Hache de Bataille", new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent("Disciple", new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
				new Effect(TypeEffect.VitComp, false, 15),
			}),
		};
	}
	
	static CombiTalent[] getClass2() {
		return new CombiTalent[] {
			
		};
	}
	
	static CombiTalent[] getClass3() {
		return new CombiTalent[] {
			new CombiTalent("Marcheur du Vent", new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent("Samouraï Fantôme", new int[] { 1, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent("Chasseur Assassin", new int[] { 2, 3, 1, 1, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S12, 50, TypeValue.PARA),
				new SkillEffect(TypeSkillEffect.Class3S13, 50, TypeValue.PARA),
			}),
			new CombiTalent("Apparition", new int[] { 3, 1, 3, 3, }, new Calculable[] {
				new SkillEffect(TypeSkillEffect.Class3S14, 0, TypeValue.FUFU),
			}),
			new CombiTalent("Samouraï", new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.RDCCP, false, 30),
				new Effect(TypeEffect.RDCCM, false, 30),
			}),
			new CombiTalent("Marcheur Véloce", new int[] { 1, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent("Sniper Caché", new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -15),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new CombiTalent("Saboteur", new int[] { 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -20),
			}),
			new CombiTalent("Guerrier Lanceur de Lances", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 20),
			}),
			new CombiTalent("Canonnier", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 5),
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new CombiTalent("Sniper", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 30),
			}),
			new CombiTalent("Homme Implorant la Vie", new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.Atk, true, 5),
			}),
			new CombiTalent("Archer Tactique", new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 9),
				new Effect(TypeEffect.DefM, true, 9),
			}),
			new CombiTalent("Éclaireur Rapide", new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.MEN, false, -15),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
		};
	}
	
	static CombiTalent[] getClass4() {
		return new CombiTalent[] {
			
		};
	}
	
	static CombiTalent[] getClass5() {
		return new CombiTalent[] {
			new CombiTalent("Montagne Immobile", new int[] { 1, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 12),
				new Effect(TypeEffect.MEN, false, 5),
			}),
			new CombiTalent("Esprit Antique de Loup", new int[] { 2, 2, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 9),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent("Aigle Majestueux Ancien", new int[] { 3, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 8),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new CombiTalent("Roi de la Jungle", new int[] { 1, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 20),
			}),
			new CombiTalent("Prophète en Sorcellerie", new int[] { 2, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 15),
				new Effect(TypeEffect.PM, true, 5),
			}),
			new CombiTalent("Rites de Anciens", new int[] { 3, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 40),
				new Effect(TypeEffect.RTCCM, true, 40),
			}),
			new CombiTalent("Erudit Supérieur en Ensorcellement", new int[] { 3, 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, false, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent("Prophète", new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent("Juge Sacré", new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.DefP, true, 6),
			}),
			new CombiTalent("Erudit en Mots Sacrés", new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.AtkM, true, 5),
			}),
			new CombiTalent("Entraîneur de la Volonté", new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PM, true, 10),
				new Effect(TypeEffect.DefP, true, 10),
			}),
			new CombiTalent("Erudit en Spiritualité", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent("Défenseur Magique", new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Missionaire", new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 10),
			}),
			new CombiTalent("Messager Mana", new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent("Economiseur d'Energie", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass6() {
		return new CombiTalent[] {
			new CombiTalent("Maître des Flammes", new int[] { 1, 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S11, 6, TypeValue.DAMAGE),
			}),
			new CombiTalent("Mère des Glaces", new int[] { 2, 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.Glace, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S12, 12, TypeValue.DAMAGE),
			}),
			new CombiTalent("Maître de l'Electricité", new int[] { 3, 2, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 10),
				new SkillEffect(TypeSkillEffect.Class6S13, 8, TypeValue.DAMAGE),
			}),
			new CombiTalent("Astrologue", new int[] { 1, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.MEN, true, -10),
				new Effect(TypeEffect.DCCM, false, 15),
			}),
			new CombiTalent("Grand Magicien", new int[] { 1, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Toucher, false, 15),
			}),
			new CombiTalent("Spécialiste en Mana d'�me", new int[] { 2, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefM, true, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new CombiTalent("Erudit en Sorcellerie Avancée", new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 6),
				new Effect(TypeEffect.Sacre, false, 10),
				new Effect(TypeEffect.Ombre, false, 10),
				new Effect(TypeEffect.Foudre, false, 10),
				new Effect(TypeEffect.Feu, false, 10),
				new Effect(TypeEffect.Glace, false, 10),
				new Effect(TypeEffect.Nature, false, 10),
			}),
			new CombiTalent("Rédempteur", new int[] { 3, 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 15),
			}),
			new CombiTalent("Magicien Mana d'âme", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 7),
				new Effect(TypeEffect.AtkM, true, 4),
			}),
			new CombiTalent("Chercheur en Sorcellerie", new int[] { 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 7),
			}),
			new CombiTalent("Erudit Spirituel", new int[] { 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 5),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent("Chercheur en Puissance Magique", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Toucher, false, 12),
			}),
			new CombiTalent("Défenseur Magique", new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Messager Mana", new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 10),
				new Effect(TypeEffect.DefM, true, 7),
			}),
			new CombiTalent("Mentor Magique", new int[] { 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, true, 3),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent("Economiseur d'énergie", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -10),
				new Effect(TypeEffect.PM, true, 3),
			}),
		};
	}
	
	static CombiTalent[] getClass7() {
		return new CombiTalent[] {
			
		};
	}
	
	static CombiTalent[] getClass8() {
		return new CombiTalent[] {
			new CombiTalent("Machiniste Ultime", new int[] { 1, 2, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 3),
				new Effect(TypeEffect.VitAtk, false, 12),
			}),
			new CombiTalent("Forteresse Ultime", new int[] { 2, 3, 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.PV, true, 20),
				new Effect(TypeEffect.PM, true, 10),
			}),
			new CombiTalent("Appareil de Mouvement Perpétuel", new int[] { 3, 2, 3, 3, }, new Calculable[] {
				new Proc(100, Activation.Crit, new Calculable[] {
					new Effect(TypeEffect.ReloadComp, false, 1),
				})
			}),
			new CombiTalent("Grosse Rafale", new int[] { 1, 3, 2, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 8),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Guerrier Avancé", new int[] { 2, 2, 1, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.TCCP, false, 3),
			}),
			new CombiTalent("Arme Géante", new int[] { 3, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 3),
				new Effect(TypeEffect.CostComp, false, -15),
			}),
			new CombiTalent("Pistolet Automatique", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 20),
			}),
			new CombiTalent("Robot Guerrier", new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 8),
				new Effect(TypeEffect.VitAtk, false, 4),
			}),
			new CombiTalent("Régulateur", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 8),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new CombiTalent("Défenseur", new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 10),
				new Effect(TypeEffect.DCCP, false, 10),
			}),
			new CombiTalent("Armure de Tempête", new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 3),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
			new CombiTalent("Armure Furieuse", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 5),
				new Effect(TypeEffect.TCCP, false, 5),
			}),
		};
	}
	
	static CombiTalent[] getClass9() {
		return new CombiTalent[] {
			
		};
	}
	
	static CombiTalent[] getClass10() {
		return new CombiTalent[] {
			
		};
	}
	
	static CombiTalent[] getClass11() {
		return new CombiTalent[] {
			new CombiTalent("Rage Démoniaque", new int[] { 1, 1, 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.DefP, true, 10),
				new Effect(TypeEffect.DefM, true, 10),
			}),
			new CombiTalent("Incantation des Cristaux", new int[] { 2, 1, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 6),
			}),
			new CombiTalent("Parasite du Cristal de Sang", new int[] { 3, 1, 2, 2, }, new Calculable[] {
				new StaticEffect(TypeStaticEffect.Combi11),
			}),
			new CombiTalent("Plaque de Cristal", new int[] { 1, 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.DefM, true, 8),
			}),
			new CombiTalent("Marionnettiste", new int[] { 2, 1, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 15),
				new Effect(TypeEffect.MEN, false, -15),
			}),
			new CombiTalent("Marionnette Berserker", new int[] { 3, 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.TCCM, false, 6),
			}),
			new CombiTalent("Lame de la Faille de Cristal", new int[] { 1, 1, }, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 8),
			}),
			new CombiTalent("Seigneur de la Lame Démoniaque", new int[] { 1, 2, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.ESQ, false, 8),
			}),
			new CombiTalent("Avant-Garde du Cristal Démoniaque", new int[] { 2, 2, }, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 5),
				new Effect(TypeEffect.Depla, false, 8),
			}),
			new CombiTalent("Marcheur des Ténèbres", new int[] { 2, 3, }, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 10),
				new Effect(TypeEffect.Toucher, false, 10),
			}),
			new CombiTalent("Voleur de Vie", new int[] { 3, 1, }, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 3),
				new Effect(TypeEffect.TCCM, false, 5),
			}),
			new CombiTalent("Révélateur", new int[] { 3, 3, }, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.Toucher, false, 5),
			}),
		};
	}
}
