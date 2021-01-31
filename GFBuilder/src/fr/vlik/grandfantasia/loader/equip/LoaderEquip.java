package fr.vlik.grandfantasia.loader.equip;

import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Bullet;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.stats.Effect;

public class LoaderEquip {
	
	public static Weapon[][] getWeapon() {
		return new Weapon[][] {
			LoaderWeapon.getEp1M(),
			LoaderWeapon.getMa1M(),
			LoaderWeapon.getHa1M(),
			LoaderWeapon.getEp2M(),
			LoaderWeapon.getMa2M(),
			LoaderWeapon.getHa2M(),
			LoaderWeapon.getMeca1M(),
			LoaderWeapon.getMeca2M(),
			LoaderWeapon.getArc(),
			LoaderWeapon.getGun(),
			LoaderWeapon.getCanon(),
			LoaderWeapon.getRel(),
			LoaderWeapon.getBaton(),
			LoaderWeapon.getLame(),
			LoaderWeapon.getCle(),
			LoaderWeapon.getBouclier(),
			LoaderWeapon.getDefault(),
		};
	}
	
	public static Armor[][] getArmor() {
		return new Armor[][] {
			LoaderHelmet.getHelmet(),
			LoaderBreastplate.getBreastplate(),
			LoaderLegging.getLegging(),
			LoaderGauntlet.getGauntlet(),
			LoaderBoot.getBoot()
		};
	}
	
	public static EquipSet[] getArmorSet() {
		return LoaderEquipSet.getArmor();
	}

	public static EquipSet[] getCapeRingSet() {
		return LoaderEquipSet.getCapeRing();
	}
	
	public static Cape[] getCape() {
		return LoaderCape.getCape();
	}
	
	public static Ring[] getRing() {
		return LoaderRing.getRing();
	}
	
	public static Bullet[] getBullet() {
		return new Bullet[] {
			new Bullet("Balles Incandescentes", 80, Quality.BLUE, false, "80balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 6),
			}),
			new Bullet("Canon des Ombres", 80, Quality.BLUE, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.PeneP, false, 2),
				new Effect(TypeEffect.PeneM, false, 2),
			}),
			new Bullet("Flèche d'Obsidienne", 80, Quality.BLUE, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 80),
				new Effect(TypeEffect.Toucher, false, 4),
			}),
			new Bullet("Balles de Cuivre", 70, Quality.BLUE, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 3),
			}),
			new Bullet("Canon des Ombres", 70, Quality.BLUE, false, "70obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 88),
				new Effect(TypeEffect.PeneP, false, 1),
				new Effect(TypeEffect.PeneM, false, 1),
			}),
			new Bullet("Flèche de Mithril", 70, Quality.BLUE, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new Bullet("Balle du Trou Noir", 96, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet("Flèche Interdimensionnelle", 96, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet("Obus des Étoiles", 96, Quality.GREEN, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet("Balle Sableuse", 91, Quality.GREEN, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet("Flèche d'Étoile", 91, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet("Obus de l'Esprit ouvert", 91, Quality.GREEN, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet("Carquois de Chasse à l'Ours", 70, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet("Cartouches Dum-Dum", 70, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet("Obus de Mise à feu", 70, Quality.GREEN, false, "70obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 75),
			}),
			new Bullet("Balles de Platine", 60, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet("Flèches Météores", 60, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 56),
			}),
			new Bullet("Obus soniques", 60, Quality.GREEN, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet("Flèches du Sceau", 50, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 49),
			}),
			new Bullet("Munitions Ensorcelées", 50, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet("Obus glaçant", 50, Quality.GREEN, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet("Flèches Filantes", 40, Quality.GREEN, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet("Munitions Explosives", 40, Quality.GREEN, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 52),
			}),
			new Bullet("Obus équilibrés", 40, Quality.GREEN, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet("Cartouches Supersoniques", 30, Quality.GREEN, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet("Flèches Acérées", 30, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet("Projectiles craquelant", 30, Quality.GREEN, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet("Balles d'Acier", 20, Quality.GREEN, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 35),
			}),
			new Bullet("Flèches de Fer Empennées", 20, Quality.GREEN, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet("Obus à rafale", 20, Quality.GREEN, false, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet("Canon en étain", 10, Quality.GREEN, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet("Flèches Tranchantes", 10, Quality.GREEN, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 22),
			}),
			new Bullet("Projectiles Métalliques", 10, Quality.GREEN, false, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet("Balle Gelée +", 90, Quality.WHITE, true, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet("Balle Gelée", 90, Quality.WHITE, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet("Flèche du clair de lune +", 90, Quality.WHITE, true, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 72),
			}),
			new Bullet("Flèche du Clair de Lune", 90, Quality.WHITE, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet("Obus de Clair de Lune +", 90, Quality.WHITE, true, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet("Obus de Clair de Lune", 90, Quality.WHITE, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet("Balles Astrales +", 85, Quality.WHITE, true, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet("Balles Astrales", 85, Quality.WHITE, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet("Flèches brutales +", 85, Quality.WHITE, true, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 70),
			}),
			new Bullet("Flèches Brutales", 85, Quality.WHITE, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet("Obus d'Âme brisée", 85, Quality.WHITE, false, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet("Obus de Frappe des âmes +", 85, Quality.WHITE, true, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet("Obus de Frappe des âmes", 85, Quality.WHITE, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet("Balles Fusantes +", 80, Quality.WHITE, true, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet("Balles Fusantes", 80, Quality.WHITE, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet("Flèches tueuses +", 80, Quality.WHITE, true, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet("Flèches Tueuses", 80, Quality.WHITE, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 57),
			}),
			new Bullet("Obus d'Acier brûlant +", 80, Quality.WHITE, true, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet("Obus d'Acier brûlant", 80, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet("Cartouches Brise-Armures +", 50, Quality.WHITE, true, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet("Cartouches Brise-Armures", 50, Quality.WHITE, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet("Flèches foudroyantes +", 50, Quality.WHITE, true, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet("Flèches Foudroyantes", 50, Quality.WHITE, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 41),
			}),
			new Bullet("Obus de Vent perçant +", 50, Quality.WHITE, true, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet("Obus de Vent perçant", 50, Quality.WHITE, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet("Balles Traçantes +", 40, Quality.WHITE, true, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet("Balles Traçantes", 40, Quality.WHITE, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet("Flèches furtives +", 40, Quality.WHITE, true, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet("Flèches furtives", 40, Quality.WHITE, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet("Obus à fragmentation +", 40, Quality.WHITE, true, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet("Obus à fragmentation", 40, Quality.WHITE, false, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet("Balles d'Acier +", 30, Quality.WHITE, true, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet("Balles d'Acier", 30, Quality.WHITE, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet("Flèches affinées +", 30, Quality.WHITE, true, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 40),
			}),
			new Bullet("Flèches affinées", 30, Quality.WHITE, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet("Obus tranchant +", 30, Quality.WHITE, true, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet("Obus tranchant", 30, Quality.WHITE, false, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet("Balles de Fer +", 20, Quality.WHITE, true, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet("Balles de Fer", 20, Quality.WHITE, false, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet("Flèches robustes +", 20, Quality.WHITE, true, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet("Flèches robustes", 20, Quality.WHITE, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 24),
			}),
			new Bullet("Obus en acier moulé +", 20, Quality.WHITE, true, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet("Obus en acier moulé", 20, Quality.WHITE, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet("Balles Grossières +", 10, Quality.WHITE, true, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet("Balles Grossières", 10, Quality.WHITE, false, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet("Flèches de fer +", 10, Quality.WHITE, true, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 28),
			}),
			new Bullet("Flèches de Fer", 10, Quality.WHITE, false, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 18),
			}),
			new Bullet("Obus de précision +", 10, Quality.WHITE, true, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet("Obus de précision", 10, Quality.WHITE, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet("Canon pratique", 8, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet("Projectile Simple +", 8, Quality.WHITE, true, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet("Projectile Simple", 8, Quality.WHITE, false, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet("Flèches renforcées +", 6, Quality.WHITE, true, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet("Flèches renforcées", 6, Quality.WHITE, false, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 15),
			}),
			new Bullet("Obus économique +", 6, Quality.WHITE, true, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet("Obus économique", 6, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
		};
	}
}
