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
}
