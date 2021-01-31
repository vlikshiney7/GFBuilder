package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.characUpgrade.Speciality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class LoaderSpeciality {
	
	static Speciality[] getClass0() {
		return new Speciality[] {
			new Speciality("Force Frénétique", 45, "0-0", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality("Coup Critique Mortelle", 45, "0-1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.8),
			}),
			new Speciality("Maître dans l'Usage de la Hache", 45, "0-2", new Calculable[] {
				new Effect(TypeEffect.DegStdHa, false, 1.5),
			}),
			new Speciality("Confession Brutable", 45, "0-3", new Calculable[] {
				new Effect(TypeEffect.DegHumaP, false, 50),
				new Effect(TypeEffect.DegHumaP, true, 1),
			}),
			new Speciality("Armes à Vacillement", 45, "0-4", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality("Tatouage Ardent", 45, "0-5", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 3),
			}),
			new Speciality("Détection de Défaut", 60, "0-6", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality("Cœur Féroce", 60, "0-7", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9),
			}),
			new Speciality("Volonté Tenace", 60, "0-8", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 2),
				new Effect(TypeEffect.RTCCM, false, 2),
			}),
			new Speciality("Forme Rapide", 60, "0-9", new Calculable[] {
				new Effect(TypeEffect.DegDuo, false, 1.5),
			}),
			new Speciality("Carrure de Fer", 75, "0-10", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality("Peau Lumineuse", 75, "0-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality("Ombre Sanguinaire", 75, "0-12", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Speciality("Figure de Proue", 75, "0-13", new Calculable[] {
				new Effect(TypeEffect.Parade, false, 1),
			}),
			new Speciality("Exploration du Cerveau", 75, "0-14", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Assaut", 75, "0-15", new Calculable[] {
				new Effect(TypeEffect.DegEp2M, false, 1),
				new Effect(TypeEffect.DegMa2M, false, 1),
				new Effect(TypeEffect.DegHa2M, false, 1),
			}),
			new Speciality("Endurance", 91, "0-16", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 1),
			}),
			new Speciality("La réponse", 91, "0-17", new Calculable[] {
				new Effect(TypeEffect.VitAtkDuo, false, 1),
			}),
			new Speciality("Abus de faiblesse", 91, "0-18", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Speciality("Bain de sang", 91, "0-19", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 0.5),
			}),
		};
	}
	
	static Speciality[] getClass1() {
		return new Speciality[] {
			new Speciality("Assassin de Mort-Vivant", 45, "1-0", new Calculable[] {
				new Effect(TypeEffect.DegMortM, false, 50),
			}),
			new Speciality("Maitre dans l'usage du bouclier", 45, "1-1", new Calculable[] {
				new Effect(TypeEffect.Parade, false, 1),
			}),
			new Speciality("Entrainement à la résistance", 45, "1-2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality("Pas de lumière", 45, "1-3", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1.1),
			}),
			new Speciality("Connaitre son ennemi", 45, "1-4", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality("Foi en la lumière sacrée", 45, "1-5", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 1),
				new Effect(TypeEffect.Ombre, false, 1),
				new Effect(TypeEffect.Foudre, false, 1),
				new Effect(TypeEffect.Feu, false, 1),
				new Effect(TypeEffect.Glace, false, 1),
				new Effect(TypeEffect.Nature, false, 1),
			}),
			new Speciality("Chevalerie", 60, "1-6", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality("Provocation de l'entraîneur", 60, "1-7", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
			}),
			new Speciality("Injection de force", 60, "1-8", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality("Protection du sprite", 60, "1-9", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
				new Effect(TypeEffect.ReducM, false, 1),
			}),
			new Speciality("Meneur", 75, "1-10", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1.2),
				new Effect(TypeEffect.DegMa, false, 1.2),
				new Effect(TypeEffect.DegHa, false, 1.2),
			}),
			new Speciality("Protection divine", 75, "1-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality("Sans merci", 75, "1-12", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Speciality("Esprit Alerte", 75, "1-13", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality("Mouvement lucide", 75, "1-14", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Speciality("Frappe du juge", 75, "1-15", new Calculable[] {
				new Effect(TypeEffect.DegEp2M, false, 1.2),
				new Effect(TypeEffect.DegMa2M, false, 1.2),
				new Effect(TypeEffect.DegHa2M, false, 1.2),
			}),
			new Speciality("Immense Lumière", 91, "1-16", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Présence d'Esprit", 91, "1-17", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 5),
			}),
			new Speciality("Bouclier", 91, "1-18", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality("Hardiesse", 91, "1-19", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 1.5),
				new Effect(TypeEffect.VOL, false, 5),
			}),
		};
	}
	
	static Speciality[] getClass2() {
		return new Speciality[] {
			new Speciality("", 45, "2-0", new Calculable[] {
			}),
			new Speciality("", 45, "2-1", new Calculable[] {
			}),
			new Speciality("", 45, "2-2", new Calculable[] {
			}),
			new Speciality("", 45, "2-3", new Calculable[] {
			}),
			new Speciality("", 45, "2-4", new Calculable[] {
			}),
			new Speciality("", 45, "2-5", new Calculable[] {
			}),
			new Speciality("", 60, "2-6", new Calculable[] {
			}),
			new Speciality("", 60, "2-7", new Calculable[] {
			}),
			new Speciality("", 60, "2-8", new Calculable[] {
			}),
			new Speciality("", 60, "2-9", new Calculable[] {
			}),
			new Speciality("", 75, "2-10", new Calculable[] {
			}),
			new Speciality("", 75, "2-11", new Calculable[] {
			}),
			new Speciality("", 75, "2-12", new Calculable[] {
			}),
			new Speciality("", 75, "2-13", new Calculable[] {
			}),
			new Speciality("", 75, "2-14", new Calculable[] {
			}),
			new Speciality("", 75, "2-15", new Calculable[] {
			}),
			new Speciality("", 91, "2-16", new Calculable[] {
			}),
			new Speciality("", 91, "2-17", new Calculable[] {
			}),
			new Speciality("", 91, "2-18", new Calculable[] {
			}),
			new Speciality("", 91, "2-19", new Calculable[] {
			}),
		};
	}
	
	static Speciality[] getClass3() {
		return new Speciality[] {
			new Speciality("Vivacité Tourbillonnante", 45, "3-0", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1.5),
			}),
			new Speciality("Aussi Lent qu'une Fôret", 45, "3-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality("Rapine Ardente", 45, "3-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Speciality("Inébranlable comme une Montagne", 45, "3-3", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Mise au Point", 45, "3-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 3),
			}),
			new Speciality("Position Accroupie", 45, "3-5", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1),
			}),
			new Speciality("Cœur du Combattant", 60, "3-6", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.FCE, false, 4),
			}),
			new Speciality("Démon de Boucher", 60, "3-7", new Calculable[] {
				new Effect(TypeEffect.DegDemonP, false, 80),
				new Effect(TypeEffect.DegDemonP, true, 1),
			}),
			new Speciality("Maître de Kendo", 60, "3-8", new Calculable[] {
				new Effect(TypeEffect.DegStdEp, false, 1.5),
			}),
			new Speciality("Main du Revers de l'Ombre", 60, "3-9", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality("Entraînement de Spartiate", 75, "3-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality("Volonté du Survivant", 75, "3-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality("Regard Perçant", 75, "3-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality("Protection du Visage", 75, "3-13", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
			}),
			new Speciality("Attaque aux Tripes", 75, "3-14", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1.5),
			}),
			new Speciality("Bouquet Final", 75, "3-15", new Calculable[] {
				new Effect(TypeEffect.DegDuo, false, 1.2),
			}),
			new Speciality("Art des couteaux fusants", 91, "3-16", new Calculable[] {
				new Effect(TypeEffect.VitAtkDuo, false, 1),
			}),
			new Speciality("Puissante taillade", 91, "3-17", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1.5),
			}),
			new Speciality("Raffinement de l'esprit", 91, "3-18", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Puissance de l'ombre", 91, "3-19", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 3),
			}),
		};
	}
	
	static Speciality[] getClass4() {
		return new Speciality[] {
			new Speciality("", 45, "4-0", new Calculable[] {
			}),
			new Speciality("", 45, "4-1", new Calculable[] {
			}),
			new Speciality("", 45, "4-2", new Calculable[] {
			}),
			new Speciality("", 45, "4-3", new Calculable[] {
			}),
			new Speciality("", 45, "4-4", new Calculable[] {
			}),
			new Speciality("", 45, "4-5", new Calculable[] {
			}),
			new Speciality("", 60, "4-6", new Calculable[] {
			}),
			new Speciality("", 60, "4-7", new Calculable[] {
			}),
			new Speciality("", 60, "4-8", new Calculable[] {
			}),
			new Speciality("", 60, "4-9", new Calculable[] {
			}),
			new Speciality("", 75, "4-10", new Calculable[] {
			}),
			new Speciality("", 75, "4-11", new Calculable[] {
			}),
			new Speciality("", 75, "4-12", new Calculable[] {
			}),
			new Speciality("", 75, "4-13", new Calculable[] {
			}),
			new Speciality("", 75, "4-14", new Calculable[] {
			}),
			new Speciality("", 75, "4-15", new Calculable[] {
			}),
			new Speciality("", 91, "4-16", new Calculable[] {
			}),
			new Speciality("", 91, "4-17", new Calculable[] {
			}),
			new Speciality("", 91, "4-18", new Calculable[] {
			}),
			new Speciality("", 91, "4-19", new Calculable[] {
			}),
		};
	}
	
	static Speciality[] getClass5() {
		return new Speciality[] {
			new Speciality("Esprit de l'Aigle Majestueux", 45, "5-0", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1.5),
			}),
			new Speciality("Esprit de Loup Spectral", 45, "5-1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Speciality("Esprit de Singe Géant", 45, "5-2", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
				new Effect(TypeEffect.ReducM, false, 1),
			}),
			new Speciality("Maître dans l'Usage des Plantes", 45, "5-3", new Calculable[] {
				new Effect(TypeEffect.DegPlanteM, false, 50),
				new Effect(TypeEffect.DegPlanteM, true, 1),
			}),
			new Speciality("Totem d'Autorité", 45, "5-4", new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 1),
			}),
			new Speciality("Arc-en-Ciel", 45, "5-5", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 1),
				new Effect(TypeEffect.Ombre, false, 1),
				new Effect(TypeEffect.Foudre, false, 1),
				new Effect(TypeEffect.Feu, false, 1),
				new Effect(TypeEffect.Glace, false, 1),
				new Effect(TypeEffect.Nature, false, 1),
			}),
			new Speciality("Déclaration de la Tête Tribale", 60, "5-6", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality("Physique Robuste", 60, "5-7", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality("Main Supersonique", 60, "5-8", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality("Murmures du Vent", 60, "5-9", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1),
			}),
			new Speciality("Béatitude du Dieu du Vent", 75, "5-10", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Miracle des Rochers", 75, "5-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality("Héritage des Arcanes", 75, "5-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality("Anticipation Stellaire", 75, "5-13", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new Speciality("Force des Ancêtres", 75, "5-14", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality("Arts Tribaux", 75, "5-15", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality("Griffe de loup démoniaque", 91, "5-16", new Calculable[] {
				new Effect(TypeEffect.DegP, false, 1.5),
			}),
			new Speciality("Appel du fier faucon", 91, "5-17", new Calculable[] {
				new Effect(TypeEffect.DegM, false, 1.5),
			}),
			new Speciality("Pranayama de la nature", 91, "5-18", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Rage du singe", 91, "5-19", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 1),
				new Effect(TypeEffect.RTCCM, false, 1),
			}),
		};
	}
	
	static Speciality[] getClass6() {
		return new Speciality[] {
			new Speciality("Maître dans l'Usage de la Magie", 45, "6-0", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality("Résistance des Éléments", 45, "6-1", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
				new Effect(TypeEffect.Feu, false, 2),
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Speciality("Masque des Éléments", 45, "6-2", new Calculable[] {
				new Effect(TypeEffect.ReducM, false, 2),
			}),
			new Speciality("Sort des Éléments", 45, "6-3", new Calculable[] {
				new Effect(TypeEffect.DegElemM, false, 50),
				new Effect(TypeEffect.DegElemM, true, 1),
			}),
			new Speciality("Volonté de la Sorcellerie", 45, "6-4", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Parler Clairement", 45, "6-5", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -3),
			}),
			new Speciality("Connaissance Runique", 60, "6-6", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality("Etude de la magie", 60, "6-7", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality("Ombre Magique", 60, "6-8", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 3),
			}),
			new Speciality("Expert en Explosion Magique", 60, "6-9", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality("Existence des Éléments", 75, "6-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Speciality("Chamana de Vide", 75, "6-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
				new Effect(TypeEffect.MEN, false, -1.5),
			}),
			new Speciality("Armure des Arcanes", 75, "6-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality("Perspicacité", 75, "6-13", new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 2),
			}),
			new Speciality("Redimensionnement", 75, "6-14", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Chamana de Gravité", 75, "6-15", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
			}),
			new Speciality("Énergie transcendée", 91, "6-16", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality("Entraînement de l'esprit", 91, "6-17", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 9),
			}),
			new Speciality("Inscriptions ultimes", 91, "6-18", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.INT, false, 3),
			}),
			new Speciality("Bâton gravé", 91, "6-19", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1, false, WeaponType.BATON),
			}),
		};
	}
	
	static Speciality[] getClass7() {
		return new Speciality[] {
			new Speciality("", 45, "7-0", new Calculable[] {
			}),
			new Speciality("", 45, "7-1", new Calculable[] {
			}),
			new Speciality("", 45, "7-2", new Calculable[] {
			}),
			new Speciality("", 45, "7-3", new Calculable[] {
			}),
			new Speciality("", 45, "7-4", new Calculable[] {
			}),
			new Speciality("", 45, "7-5", new Calculable[] {
			}),
			new Speciality("", 60, "7-6", new Calculable[] {
			}),
			new Speciality("", 60, "7-7", new Calculable[] {
			}),
			new Speciality("", 60, "7-8", new Calculable[] {
			}),
			new Speciality("", 60, "7-9", new Calculable[] {
			}),
			new Speciality("", 75, "7-10", new Calculable[] {
			}),
			new Speciality("", 75, "7-11", new Calculable[] {
			}),
			new Speciality("", 75, "7-12", new Calculable[] {
			}),
			new Speciality("", 75, "7-13", new Calculable[] {
			}),
			new Speciality("", 75, "7-14", new Calculable[] {
			}),
			new Speciality("", 75, "7-15", new Calculable[] {
			}),
			new Speciality("", 91, "7-16", new Calculable[] {
			}),
			new Speciality("", 91, "7-17", new Calculable[] {
			}),
			new Speciality("", 91, "7-18", new Calculable[] {
			}),
			new Speciality("", 91, "7-19", new Calculable[] {
			}),
		};
	}
	
	static Speciality[] getClass8() {
		return new Speciality[] {
			new Speciality("Amélioration d'Impact", 45, "8-0", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality("Correction réticule", 45, "8-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1.5),
			}),
			new Speciality("Choc de Surcadençage", 45, "8-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Speciality("Maître Arme mécanique", 45, "8-3", new Calculable[] {
				new Effect(TypeEffect.DegStdMeca, false, 1.5),
				new Effect(TypeEffect.DegStdMeca2M, false, 1.5),
			}),
			new Speciality("Énergie à Neutrons", 45, "8-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality("Étude robotique", 45, "8-5", new Calculable[] {
				new Effect(TypeEffect.DegMecaP, false, 50),
				new Effect(TypeEffect.DegMecaP, true, 1),
			}),
			new Speciality("Accélération Mécanique", 60, "8-6", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality("Transfert de Mouvement", 60, "8-7", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Speciality("Lame de Phase", 60, "8-8", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 1.5),
			}),
			new Speciality("Maître d'Armes mécaniques doubles", 60, "8-9", new Calculable[] {
				new Effect(TypeEffect.DegStdMeca, false, 1),
			}),
			new Speciality("Coeur d'Acier", 75, "8-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Speciality("Armure de Coeur", 75, "8-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality("Volonté aggressive", 75, "8-12", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1.5),
				new Effect(TypeEffect.ReducM, false, 1.5),
			}),
			new Speciality("Bouclier à Neutrons", 75, "8-13", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
			}),
			new Speciality("Recherche Mécanique", 75, "8-14", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.VIT, false, 4),
			}),
			new Speciality("Amélioration d'Arme mécanique", 75, "8-15", new Calculable[] {
				new Effect(TypeEffect.DegStdMeca2M, false, 1.5),
			}),
			new Speciality("Transfert de Neutrons", 91, "8-16", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.FCE),
			}),
			new Speciality("Amplification de Phase", 91, "8-17", new Calculable[] {
				new Effect(TypeEffect.VitAtk, 3, TypeEffect.TCCP),
			}),
			new Speciality("Camouflage Optique", 91, "8-18", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Puissance Nucléaire", 91, "8-19", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
		};
	}
	
	static Speciality[] getClass9() {
		return new Speciality[] {
			new Speciality("", 45, "9-0", new Calculable[] {
			}),
			new Speciality("", 45, "9-1", new Calculable[] {
			}),
			new Speciality("", 45, "9-2", new Calculable[] {
			}),
			new Speciality("", 45, "9-3", new Calculable[] {
			}),
			new Speciality("", 45, "9-4", new Calculable[] {
			}),
			new Speciality("", 45, "9-5", new Calculable[] {
			}),
			new Speciality("", 60, "9-6", new Calculable[] {
			}),
			new Speciality("", 60, "9-7", new Calculable[] {
			}),
			new Speciality("", 60, "9-8", new Calculable[] {
			}),
			new Speciality("", 60, "9-9", new Calculable[] {
			}),
			new Speciality("", 75, "9-10", new Calculable[] {
			}),
			new Speciality("", 75, "9-11", new Calculable[] {
			}),
			new Speciality("", 75, "9-12", new Calculable[] {
			}),
			new Speciality("", 75, "9-13", new Calculable[] {
			}),
			new Speciality("", 75, "9-14", new Calculable[] {
			}),
			new Speciality("", 75, "9-15", new Calculable[] {
			}),
			new Speciality("", 91, "9-16", new Calculable[] {
			}),
			new Speciality("", 91, "9-17", new Calculable[] {
			}),
			new Speciality("", 91, "9-18", new Calculable[] {
			}),
			new Speciality("", 91, "9-19", new Calculable[] {
			}),
		};
	}
	
	static Speciality[] getClass10() {
		return new Speciality[] {
			new Speciality("Fortifier Magie", 45, "10-0", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality("Contrôle du Royaume", 45, "10-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality("Combustion Cristalline", 45, "10-2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Speciality("Maîtrise de la lame", 45, "10-3", new Calculable[] {
				new Effect(TypeEffect.DegLa, false, 1.5),
			}),
			new Speciality("Drainage Magique", 45, "10-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality("Accumulation Cristalline", 45, "10-5", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Danse des Lames", 60, "10-6", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality("Contrôle de Pouvoir Magique", 60, "10-7", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality("Lame Briseuse de Royaume", 60, "10-8", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 1.5),
			}),
			new Speciality("Gardien du Royaume", 60, "10-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
			}),
			new Speciality("Gardien Briseur de Magie", 75, "10-10", new Calculable[] {
				new Effect(TypeEffect.ReducM, false, 2),
			}),
			new Speciality("Bouclier Magique", 75, "10-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1.5),
			}),
			new Speciality("Volonté du Néant", 75, "10-12", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1.5),
				new Effect(TypeEffect.ReducM, false, 1.5),
			}),
			new Speciality("Épée Magique Gardienne", 75, "10-13", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 3),
			}),
			new Speciality("Ascension de Lame Magique", 75, "10-14", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4),
				new Effect(TypeEffect.INT, false, 5),
			}),
			new Speciality("Transfert de Position", 75, "10-15", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Échange de Capacité", 91, "10-16", new Calculable[] {
				new Effect(TypeEffect.FCE, 3, TypeEffect.INT),
			}),
			new Speciality("Échange de Cristal", 91, "10-17", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL),
			}),
			new Speciality("Cristallisation du Sang", 91, "10-18", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality("Combustion Temporelle", 91, "10-19", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
		};
	}
	
	static Speciality[] getClass11() {
		return new Speciality[] {
			new Speciality("Fortifier Cristal", 45, "11-0", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality("Contrôle du Royaume", 45, "11-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality("Vibration Cristalline", 45, "11-2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Speciality("Maîtrise du Baton-Clé", 45, "11-3", new Calculable[] {
				new Effect(TypeEffect.DegStdLa, false, 1.5),
			}),
			new Speciality("Drainage Magique", 45, "11-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality("Accumulation de Magie", 45, "11-5", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality("Danse du cristal", 60, "11-6", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality("Contrôle du Pouvoir Magique", 60, "11-7", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality("Déformation Temporele", 60, "11-8", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 1),
			}),
			new Speciality("Royaume de Chronos", 60, "11-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1.5),
			}),
			new Speciality("Bouclier Cristal Gardien", 75, "11-10", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 2),
			}),
			new Speciality("Bouclier Temporel", 75, "11-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality("Volonté du Maître du Temps", 75, "11-12", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
				new Effect(TypeEffect.ReducM, false, 1),
			}),
			new Speciality("Marionnette de Gardien", 75, "11-13", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
			}),
			new Speciality("Amélioration de la Clé Magique", 75, "11-14", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 4),
				new Effect(TypeEffect.INT, false, 5),
			}),
			new Speciality("Transfert de Position", 75, "11-15", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality("Transfert de Chronos", 91, "11-16", new Calculable[] {
				new Effect(TypeEffect.AGI, 3, TypeEffect.INT),
			}),
			new Speciality("Echange de Cristal", 91, "11-17", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL),
			}),
			new Speciality("Esprit Gardien", 91, "11-18", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -3),
			}),
			new Speciality("Rupture Temporelle", 91, "11-19", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
		};
	}
}
