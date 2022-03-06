package fr.vlik.grandfantasia.loader.equip;

import java.util.EnumMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Bullet;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ride;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Effect;

public class LoaderEquip extends LoaderTemplate {
	
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
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Incandescentes"); put(Language.EN, "Radiant Bullets"); }}, 80, Quality.BLUE, false, "80balle", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 6),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canon des Ombres"); put(Language.EN, "Shadow Cannon"); }}, 80, Quality.BLUE, false, "80obus0", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.PeneP, false, 2),
				new Effect(TypeEffect.PeneM, false, 2),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche d'Obsidienne"); put(Language.EN, "Obsidian Arrow"); }}, 80, Quality.BLUE, false, "80fleche", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 80),
				new Effect(TypeEffect.Toucher, false, 4),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles de Cuivre"); put(Language.EN, "Copper Bullets"); }}, 70, Quality.BLUE, false, "70balle", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 97),
				new Effect(TypeEffect.VitAtk, false, 3),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canon des Ombres"); put(Language.EN, "Shadow Cannon"); }}, 70, Quality.BLUE, false, "70obus", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 88),
				new Effect(TypeEffect.PeneP, false, 1),
				new Effect(TypeEffect.PeneM, false, 1),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche de Mithril"); put(Language.EN, "Mithril Arrow"); }}, 70, Quality.BLUE, false, "70fleche", Tag.GVG, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balle du Trou Noir"); put(Language.EN, "Black Hole Bullet"); }}, 96, Quality.GREEN, false, "96balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche Interdimensionnelle"); put(Language.EN, "Dimensional Arrow"); }}, 96, Quality.GREEN, false, "96fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus des Étoiles"); put(Language.EN, "Celestial Shells"); }}, 96, Quality.GREEN, false, "96obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 96),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balle Sableuse"); put(Language.EN, "Sandy Bullet"); }}, 91, Quality.GREEN, false, "70balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche d'Étoile"); put(Language.EN, "Meteor Arrow"); }}, 91, Quality.GREEN, false, "80fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de l'Esprit ouvert"); put(Language.EN, "Enlightenment Shells"); }}, 91, Quality.GREEN, false, "80obus0", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 91),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Carquois de Chasse à l'Ours"); put(Language.EN, "Shining Runic Arrow"); }}, 70, Quality.GREEN, false, "96fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cartouches Dum-Dum"); put(Language.EN, "Godhunter Bullet"); }}, 70, Quality.GREEN, false, "96balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Mise à feu"); put(Language.EN, "Explosive Artillery Shell"); }}, 70, Quality.GREEN, false, "70obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 75),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles de Platine"); put(Language.EN, "Platinum Bullet"); }}, 60, Quality.GREEN, false, "96balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Météores"); put(Language.EN, "Meteor Arrow"); }}, 60, Quality.GREEN, false, "80fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 56),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus soniques"); put(Language.EN, "Sonic Shells"); }}, 60, Quality.GREEN, false, "96obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches du Sceau"); put(Language.EN, "Seal Arrow"); }}, 50, Quality.GREEN, false, "80fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 49),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Munitions Ensorcelées"); put(Language.EN, "Spellbreaker Shell"); }}, 50, Quality.GREEN, false, "96balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus glaçant"); put(Language.EN, "Cold Snap Artillery Shell"); }}, 50, Quality.GREEN, false, "80obus0", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Filantes"); put(Language.EN, "Pulse Arrow"); }}, 40, Quality.GREEN, false, "40fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Munitions Explosives"); put(Language.EN, "Incendiary Round"); }}, 40, Quality.GREEN, false, "40balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 52),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus équilibrés"); put(Language.EN, "Balanced Shells"); }}, 40, Quality.GREEN, false, "40obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cartouches Supersoniques"); put(Language.EN, "Supersonic Bullet"); }}, 30, Quality.GREEN, false, "70balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Acérées"); put(Language.EN, "Space Traveler's Arrow"); }}, 30, Quality.GREEN, false, "96fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Projectiles craquelant"); put(Language.EN, "Berserker's Shells"); }}, 30, Quality.GREEN, false, "30obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles d'Acier"); put(Language.EN, "Steel Bullet"); }}, 20, Quality.GREEN, false, "20balle", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 35),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches de Fer Empennées"); put(Language.EN, "Iron Feather Arrow"); }}, 20, Quality.GREEN, false, "20fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus à rafale"); put(Language.EN, "Rapid-fire Artillery Shell"); }}, 20, Quality.GREEN, false, "20obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canon en étain"); put(Language.EN, "Tin Cannon"); }}, 10, Quality.GREEN, false, "30obus", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Tranchantes"); put(Language.EN, "Sharp Arrow"); }}, 10, Quality.GREEN, false, "70fleche", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 22),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Projectiles Métalliques"); put(Language.EN, "Special-Type Metal Projectile"); }}, 10, Quality.GREEN, false, "10balle0", Tag.SPRITE, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balle Gelée +"); put(Language.EN, "Frost Bullet - Modded"); }}, 90, Quality.WHITE, true, "40balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balle Gelée"); put(Language.EN, "Frost Bullet"); }}, 90, Quality.WHITE, false, "40balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche du clair de lune +"); put(Language.EN, "Moonshadow Arrow - Modded"); }}, 90, Quality.WHITE, true, "40fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 72),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèche du Clair de Lune"); put(Language.EN, "Moonshadow Arrow"); }}, 90, Quality.WHITE, false, "40fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 62),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Clair de Lune +"); put(Language.EN, "Moonlight Artillery Shell - Modded"); }}, 90, Quality.WHITE, true, "30obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 86),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Clair de Lune"); put(Language.EN, "Moonlight Artillery Shell"); }}, 90, Quality.WHITE, false, "30obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 76),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Astrales +"); put(Language.EN, "Astral Bullet - Modded"); }}, 85, Quality.WHITE, true, "20balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Astrales"); put(Language.EN, "Astral Bullet"); }}, 85, Quality.WHITE, false, "20balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches brutales +"); put(Language.EN, "Violent Arrow - Modded"); }}, 85, Quality.WHITE, true, "20fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 70),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Brutales"); put(Language.EN, "Violent Arrow"); }}, 85, Quality.WHITE, false, "20fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus d'Âme brisée"); put(Language.EN, "Shattered Soul Shells"); }}, 85, Quality.WHITE, false, "85obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Frappe des âmes +"); put(Language.EN, "Soul Ripper Artillery Shell - Modded"); }}, 85, Quality.WHITE, true, "40obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 83),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Frappe des âmes"); put(Language.EN, "Soul Ripper Artillery Shell"); }}, 85, Quality.WHITE, false, "40obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 73),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Fusantes +"); put(Language.EN, "Quenching Bullet - Modded"); }}, 80, Quality.WHITE, true, "96balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Fusantes"); put(Language.EN, "Quenching Bullet"); }}, 80, Quality.WHITE, false, "96balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches tueuses +"); put(Language.EN, "Killing Arrow - Modded"); }}, 80, Quality.WHITE, true, "96fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 67),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Tueuses"); put(Language.EN, "Killing Arrow"); }}, 80, Quality.WHITE, false, "96fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 57),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus d'Acier brûlant +"); put(Language.EN, "Scorching Artillery Shell - Modded"); }}, 80, Quality.WHITE, true, "80obus1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 79),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus d'Acier brûlant"); put(Language.EN, "Scorching Artillery Shell"); }}, 80, Quality.WHITE, false, "80obus1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 69),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cartouches Brise-Armures +"); put(Language.EN, "Armor-Piercing Bullet - Modded"); }}, 50, Quality.WHITE, true, "40balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cartouches Brise-Armures"); put(Language.EN, "Armor-Piercing Bullet"); }}, 50, Quality.WHITE, false, "40balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches foudroyantes +"); put(Language.EN, "Force Arrow - Modded"); }}, 50, Quality.WHITE, true, "96fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 51),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches Foudroyantes"); put(Language.EN, "Force Arrow"); }}, 50, Quality.WHITE, false, "96fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 41),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Vent perçant +"); put(Language.EN, "Windstorm Artillery Shell - Modded"); }}, 50, Quality.WHITE, true, "96obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 60),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de Vent perçant"); put(Language.EN, "Windstorm Artillery Shell"); }}, 50, Quality.WHITE, false, "96obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 50),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Traçantes +"); put(Language.EN, "Sharpshooter Bullet - Modded"); }}, 40, Quality.WHITE, true, "70balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Traçantes"); put(Language.EN, "Sharpshooter Bullet"); }}, 40, Quality.WHITE, false, "70balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches furtives +"); put(Language.EN, "Steel Arrow - Modded"); }}, 40, Quality.WHITE, true, "40fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches furtives"); put(Language.EN, "Steel Arrow"); }}, 40, Quality.WHITE, false, "40fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus à fragmentation +"); put(Language.EN, "Sundering Artillery Shell - Modded"); }}, 40, Quality.WHITE, true, "85obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 53),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus à fragmentation"); put(Language.EN, "Sundering Artillery Shell"); }}, 40, Quality.WHITE, false, "85obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 43),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles d'Acier +"); put(Language.EN, "Steel Bullet - Modded"); }}, 30, Quality.WHITE, true, "20balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles d'Acier"); put(Language.EN, "Steel Bullet"); }}, 30, Quality.WHITE, false, "20balle", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches affinées +"); put(Language.EN, "Striker Arrow - Modded"); }}, 30, Quality.WHITE, true, "20fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 40),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches affinées"); put(Language.EN, "Striker Arrow"); }}, 30, Quality.WHITE, false, "20fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus tranchant +"); put(Language.EN, "Sharp Shot Artillery Shell - Modded"); }}, 30, Quality.WHITE, true, "20obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 46),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus tranchant"); put(Language.EN, "Sharp Shot Artillery Shell"); }}, 30, Quality.WHITE, false, "20obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 36),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles de Fer +"); put(Language.EN, "Iron Bullet - Modded"); }}, 20, Quality.WHITE, true, "10balle0", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles de Fer"); put(Language.EN, "Iron Bullet"); }}, 20, Quality.WHITE, false, "10balle0", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches robustes +"); put(Language.EN, "Iron Arrow - Modded"); }}, 20, Quality.WHITE, true, "70fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 34),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches robustes"); put(Language.EN, "Iron Arrow"); }}, 20, Quality.WHITE, false, "70fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 24),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus en acier moulé +"); put(Language.EN, "Steel Casting Artillery Shell - Modded"); }}, 20, Quality.WHITE, true, "30obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 39),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus en acier moulé"); put(Language.EN, "Steel Casting Artillery Shell"); }}, 20, Quality.WHITE, false, "30obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 29),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Grossières +"); put(Language.EN, "Crude Bullet - Modded"); }}, 10, Quality.WHITE, true, "10balle1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balles Grossières"); put(Language.EN, "Crude Bullet"); }}, 10, Quality.WHITE, false, "10balle1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches de fer +"); put(Language.EN, "Fortified Arrow - Modded"); }}, 10, Quality.WHITE, true, "10fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 28),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches de Fer"); put(Language.EN, "Fortified Arrow"); }}, 10, Quality.WHITE, false, "10fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 18),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de précision +"); put(Language.EN, "Precision Artillery Shell - Modded"); }}, 10, Quality.WHITE, true, "40obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 31),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus de précision"); put(Language.EN, "Precision Artillery Shell"); }}, 10, Quality.WHITE, false, "40obus", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 21),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canon pratique"); put(Language.EN, "Handy Cannon"); }}, 8, Quality.WHITE, false, "80obus1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Projectile Simple +"); put(Language.EN, "Simple Projectile - Modded"); }}, 8, Quality.WHITE, true, "10balle1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Projectile Simple"); put(Language.EN, "Simple Projectile"); }}, 8, Quality.WHITE, false, "10balle1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches renforcées +"); put(Language.EN, "Wooden Arrow - Modded"); }}, 6, Quality.WHITE, true, "10fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 25),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flèches renforcées"); put(Language.EN, "Wooden Arrow"); }}, 6, Quality.WHITE, false, "10fleche", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 15),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus économique +"); put(Language.EN, "Lightweight Artillery Shell - Modded"); }}, 6, Quality.WHITE, true, "80obus1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 30),
			}),
			new Bullet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obus économique"); put(Language.EN, "Lightweight Artillery Shell"); }}, 6, Quality.WHITE, false, "80obus1", Tag.MARCHAND, new Effect[] {
				new Effect(TypeEffect.Bullet, false, 20),
			}),
		};
	}
	
	public static Ride[] getRide() {
		return LoaderRide.getRide();
	}
}
