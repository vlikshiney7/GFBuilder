package fr.vlik.grandfantasia.loader.subEquip;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.subEquip.Anima;
import fr.vlik.grandfantasia.subEquip.Bague;
import fr.vlik.grandfantasia.subEquip.Costume;
import fr.vlik.grandfantasia.subEquip.Souvenir;
import fr.vlik.grandfantasia.subEquip.SouvenirEnchantment;
import fr.vlik.grandfantasia.subEquip.Synthesis;

@SuppressWarnings("serial")
public class LoaderSubEquip {
	
	public static Map<Quality, Synthesis[]> getRideSynthesis() {
		return new HashMap<Quality, Synthesis[]>() {{
			put(Quality.GOLD, LoaderSynthesis.getRideGold());
			put(Quality.ORANGE, LoaderSynthesis.getRideOrange());
			put(Quality.BLUE, LoaderSynthesis.getRideBlue());
			put(Quality.GREEN, LoaderSynthesis.getRideGreen());
			put(Quality.WHITE, LoaderSynthesis.getRideWhite());
		}};
	}
	
	public static Map<Quality, Synthesis[]> getThroneSynthesis() {
		return new HashMap<Quality, Synthesis[]>() {{
			put(Quality.GOLD, LoaderSynthesis.getThroneGold());
			put(Quality.ORANGE, LoaderSynthesis.getThroneOrange());
			put(Quality.BLUE, LoaderSynthesis.getThroneBlue());
			put(Quality.GREEN, LoaderSynthesis.getThroneGreen());
			put(Quality.WHITE, LoaderSynthesis.getThroneWhite());
		}};
	}
	
	public static Map<Quality, Costume[]> getCostume() {
		return new HashMap<Quality, Costume[]>() {{
			put(Quality.GOLD, LoaderCostume.getGold());
			put(Quality.BLUE, LoaderCostume.getBlue());
			put(Quality.GREEN, LoaderCostume.getGreen());
			put(Quality.WHITE, LoaderCostume.getWhite());
		}};
	}
	
	public static Bague[] getBague() {
		return new Bague[] {
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique"); put(Language.EN, "Magical Passion Ring"); }}, Quality.BLUE, "blue", new Effect[] {
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Atk, false, 10, true),
				new Effect(TypeEffect.AtkD, false, 10, true),
				new Effect(TypeEffect.AtkM, false, 10, true),
			}),
			new Bague(new HashMap<Language, String>() {{ put(Language.FR, "Bague Magique 5 carats"); put(Language.EN, "5-Carat Magical Passion Ring"); }}, Quality.GOLD, "gold", new Effect[] {
				new Effect(TypeEffect.FCE, false, 10, true),
				new Effect(TypeEffect.VIT, false, 10, true),
				new Effect(TypeEffect.INT, false, 10, true),
				new Effect(TypeEffect.VOL, false, 10, true),
				new Effect(TypeEffect.AGI, false, 10, true),
				new Effect(TypeEffect.Atk, false, 20, true),
				new Effect(TypeEffect.AtkD, false, 20, true),
				new Effect(TypeEffect.AtkM, false, 20, true),
			}),
		};
	}
	
	public static Anima[] getAnima() {
		return LoaderAnima.getAnima();
	}

	public static Souvenir[] getSouvenir() {
		return new Souvenir[] {
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Lézard des glaces en peluche"); put(Language.EN, ""); }}, 73, Quality.ORANGE, "73orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 460, true),
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.INT, false, 7, true),
				new Effect(TypeEffect.AGI, false, 7, true),
				new Effect(TypeEffect.Sacre, false, 15),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Singe de métal dur en peluche"); put(Language.EN, ""); }}, 68, Quality.GREEN, "68green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 402, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 4, true),
				new Effect(TypeEffect.Foudre, false, 13),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Fée Joyau du Val en peluche"); put(Language.EN, ""); }}, 63, Quality.WHITE, "63white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 347, true),
				new Effect(TypeEffect.PV, false, 480),
				new Effect(TypeEffect.Glace, false, 10),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Géant diabolique en peluche"); put(Language.EN, ""); }}, 58, Quality.ORANGE, "58orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 394, true),
				new Effect(TypeEffect.FCE, false, 6, true),
				new Effect(TypeEffect.INT, false, 6, true),
				new Effect(TypeEffect.AGI, false, 6, true),
				new Effect(TypeEffect.Nature, false, 14),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Gobelin masqué en peluche"); put(Language.EN, ""); }}, 53, Quality.GREEN, "53green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 340, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.Ombre, false, 11),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Chèvre cornue en peluche"); put(Language.EN, ""); }}, 48, Quality.WHITE, "48white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 272, true),
				new Effect(TypeEffect.PV, false, 400),
				new Effect(TypeEffect.Feu, false, 9),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Grosse chauve-souris vampire en peluche"); put(Language.EN, ""); }}, 43, Quality.ORANGE, "43orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 322, true),
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 4, true),
				new Effect(TypeEffect.Glace, false, 12),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Araignée sanguinaire en peluche"); put(Language.EN, ""); }}, 38, Quality.GREEN, "38green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 271, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 2, true),
				new Effect(TypeEffect.Sacre, false, 10),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Grosse larve en peluche"); put(Language.EN, ""); }}, 33, Quality.WHITE, "33white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 224, true),
				new Effect(TypeEffect.PV, false, 240),
				new Effect(TypeEffect.Foudre, false, 7),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Ourson en peluche"); put(Language.EN, ""); }}, 28, Quality.ORANGE, "28orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 240, true),
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Feu, false, 11),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Cerf noctambule en peluche"); put(Language.EN, ""); }}, 23, Quality.GREEN, "23green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 191, true),
				new Effect(TypeEffect.VIT, false, 1, true),
				new Effect(TypeEffect.VOL, false, 1, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Crabe à Carapace en peluche"); put(Language.EN, ""); }}, 18, Quality.WHITE, "18white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 145, true),
				new Effect(TypeEffect.PV, false, 160),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Souvenir(new HashMap<Language, String>() {{ put(Language.FR, "Poupée de Gélapin"); put(Language.EN, ""); }}, 12, Quality.WHITE, "12white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 103, true),
				new Effect(TypeEffect.PV, false, 80),
				new Effect(TypeEffect.Sacre, false, 5),
			}),
		};
	}
	
	public static SouvenirEnchantment[] getSouvenirEnchantment() {
		return LoaderSouvenirEnchantment.getSouvenirEnchantment();
	}
}
