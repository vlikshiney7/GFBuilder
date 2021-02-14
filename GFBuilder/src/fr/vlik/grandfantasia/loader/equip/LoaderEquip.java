package fr.vlik.grandfantasia.loader.equip;

import java.util.HashMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Bullet;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ride;
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
	
	@SuppressWarnings("serial")
	public static Bullet[] getBullet() {
		return new Bullet[] {
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Incandescentes"); put(Language.EN, ""); }}, 80, Quality.BLUE, false, "80balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 6),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Canon des Ombres"); put(Language.EN, ""); }}, 80, Quality.BLUE, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.PeneP, false, 2),
				new Effect(TypeEffect.PeneM, false, 2),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche d'Obsidienne"); put(Language.EN, ""); }}, 80, Quality.BLUE, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 80),
				new Effect(TypeEffect.Toucher, false, 4),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles de Cuivre"); put(Language.EN, ""); }}, 70, Quality.BLUE, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 3),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Canon des Ombres"); put(Language.EN, ""); }}, 70, Quality.BLUE, false, "70obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 88),
				new Effect(TypeEffect.PeneP, false, 1),
				new Effect(TypeEffect.PeneM, false, 1),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche de Mithril"); put(Language.EN, ""); }}, 70, Quality.BLUE, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balle du Trou Noir"); put(Language.EN, ""); }}, 96, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche Interdimensionnelle"); put(Language.EN, ""); }}, 96, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus des Étoiles"); put(Language.EN, ""); }}, 96, Quality.GREEN, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balle Sableuse"); put(Language.EN, ""); }}, 91, Quality.GREEN, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche d'Étoile"); put(Language.EN, ""); }}, 91, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de l'Esprit ouvert"); put(Language.EN, ""); }}, 91, Quality.GREEN, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Carquois de Chasse à l'Ours"); put(Language.EN, ""); }}, 70, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Cartouches Dum-Dum"); put(Language.EN, ""); }}, 70, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Mise à feu"); put(Language.EN, ""); }}, 70, Quality.GREEN, false, "70obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 75),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles de Platine"); put(Language.EN, ""); }}, 60, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Météores"); put(Language.EN, ""); }}, 60, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 56),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus soniques"); put(Language.EN, ""); }}, 60, Quality.GREEN, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches du Sceau"); put(Language.EN, ""); }}, 50, Quality.GREEN, false, "80fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 49),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Munitions Ensorcelées"); put(Language.EN, ""); }}, 50, Quality.GREEN, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus glaçant"); put(Language.EN, ""); }}, 50, Quality.GREEN, false, "80obus0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Filantes"); put(Language.EN, ""); }}, 40, Quality.GREEN, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Munitions Explosives"); put(Language.EN, ""); }}, 40, Quality.GREEN, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 52),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus équilibrés"); put(Language.EN, ""); }}, 40, Quality.GREEN, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Cartouches Supersoniques"); put(Language.EN, ""); }}, 30, Quality.GREEN, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Acérées"); put(Language.EN, ""); }}, 30, Quality.GREEN, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Projectiles craquelant"); put(Language.EN, ""); }}, 30, Quality.GREEN, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles d'Acier"); put(Language.EN, ""); }}, 20, Quality.GREEN, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 35),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches de Fer Empennées"); put(Language.EN, ""); }}, 20, Quality.GREEN, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus à rafale"); put(Language.EN, ""); }}, 20, Quality.GREEN, false, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Canon en étain"); put(Language.EN, ""); }}, 10, Quality.GREEN, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Tranchantes"); put(Language.EN, ""); }}, 10, Quality.GREEN, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 22),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Projectiles Métalliques"); put(Language.EN, ""); }}, 10, Quality.GREEN, false, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balle Gelée +"); put(Language.EN, ""); }}, 90, Quality.WHITE, true, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balle Gelée"); put(Language.EN, ""); }}, 90, Quality.WHITE, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche du clair de lune +"); put(Language.EN, ""); }}, 90, Quality.WHITE, true, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 72),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèche du Clair de Lune"); put(Language.EN, ""); }}, 90, Quality.WHITE, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Clair de Lune +"); put(Language.EN, ""); }}, 90, Quality.WHITE, true, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Clair de Lune"); put(Language.EN, ""); }}, 90, Quality.WHITE, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Astrales +"); put(Language.EN, ""); }}, 85, Quality.WHITE, true, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Astrales"); put(Language.EN, ""); }}, 85, Quality.WHITE, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches brutales +"); put(Language.EN, ""); }}, 85, Quality.WHITE, true, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 70),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Brutales"); put(Language.EN, ""); }}, 85, Quality.WHITE, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus d'Âme brisée"); put(Language.EN, ""); }}, 85, Quality.WHITE, false, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Frappe des âmes +"); put(Language.EN, ""); }}, 85, Quality.WHITE, true, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Frappe des âmes"); put(Language.EN, ""); }}, 85, Quality.WHITE, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Fusantes +"); put(Language.EN, ""); }}, 80, Quality.WHITE, true, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Fusantes"); put(Language.EN, ""); }}, 80, Quality.WHITE, false, "96balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches tueuses +"); put(Language.EN, ""); }}, 80, Quality.WHITE, true, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Tueuses"); put(Language.EN, ""); }}, 80, Quality.WHITE, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 57),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus d'Acier brûlant +"); put(Language.EN, ""); }}, 80, Quality.WHITE, true, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus d'Acier brûlant"); put(Language.EN, ""); }}, 80, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Cartouches Brise-Armures +"); put(Language.EN, ""); }}, 50, Quality.WHITE, true, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Cartouches Brise-Armures"); put(Language.EN, ""); }}, 50, Quality.WHITE, false, "40balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches foudroyantes +"); put(Language.EN, ""); }}, 50, Quality.WHITE, true, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches Foudroyantes"); put(Language.EN, ""); }}, 50, Quality.WHITE, false, "96fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 41),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Vent perçant +"); put(Language.EN, ""); }}, 50, Quality.WHITE, true, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de Vent perçant"); put(Language.EN, ""); }}, 50, Quality.WHITE, false, "96obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Traçantes +"); put(Language.EN, ""); }}, 40, Quality.WHITE, true, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Traçantes"); put(Language.EN, ""); }}, 40, Quality.WHITE, false, "70balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches furtives +"); put(Language.EN, ""); }}, 40, Quality.WHITE, true, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches furtives"); put(Language.EN, ""); }}, 40, Quality.WHITE, false, "40fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus à fragmentation +"); put(Language.EN, ""); }}, 40, Quality.WHITE, true, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus à fragmentation"); put(Language.EN, ""); }}, 40, Quality.WHITE, false, "85obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles d'Acier +"); put(Language.EN, ""); }}, 30, Quality.WHITE, true, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles d'Acier"); put(Language.EN, ""); }}, 30, Quality.WHITE, false, "20balle", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches affinées +"); put(Language.EN, ""); }}, 30, Quality.WHITE, true, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 40),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches affinées"); put(Language.EN, ""); }}, 30, Quality.WHITE, false, "20fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus tranchant +"); put(Language.EN, ""); }}, 30, Quality.WHITE, true, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus tranchant"); put(Language.EN, ""); }}, 30, Quality.WHITE, false, "20obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles de Fer +"); put(Language.EN, ""); }}, 20, Quality.WHITE, true, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles de Fer"); put(Language.EN, ""); }}, 20, Quality.WHITE, false, "10balle0", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches robustes +"); put(Language.EN, ""); }}, 20, Quality.WHITE, true, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches robustes"); put(Language.EN, ""); }}, 20, Quality.WHITE, false, "70fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 24),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus en acier moulé +"); put(Language.EN, ""); }}, 20, Quality.WHITE, true, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus en acier moulé"); put(Language.EN, ""); }}, 20, Quality.WHITE, false, "30obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Grossières +"); put(Language.EN, ""); }}, 10, Quality.WHITE, true, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Balles Grossières"); put(Language.EN, ""); }}, 10, Quality.WHITE, false, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches de fer +"); put(Language.EN, ""); }}, 10, Quality.WHITE, true, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 28),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches de Fer"); put(Language.EN, ""); }}, 10, Quality.WHITE, false, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 18),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de précision +"); put(Language.EN, ""); }}, 10, Quality.WHITE, true, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus de précision"); put(Language.EN, ""); }}, 10, Quality.WHITE, false, "40obus", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Canon pratique"); put(Language.EN, ""); }}, 8, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Projectile Simple +"); put(Language.EN, ""); }}, 8, Quality.WHITE, true, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Projectile Simple"); put(Language.EN, ""); }}, 8, Quality.WHITE, false, "10balle1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches renforcées +"); put(Language.EN, ""); }}, 6, Quality.WHITE, true, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Flèches renforcées"); put(Language.EN, ""); }}, 6, Quality.WHITE, false, "10fleche", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 15),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus économique +"); put(Language.EN, ""); }}, 6, Quality.WHITE, true, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new HashMap<Language, String>() {{ put(Language.FR, "Obus économique"); put(Language.EN, ""); }}, 6, Quality.WHITE, false, "80obus1", new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
		};
	}
	
	public static Ride[] getRide() {
		return LoaderRide.getRide();
	}
}
