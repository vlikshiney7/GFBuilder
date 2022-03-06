package fr.vlik.grandfantasia.loader.subequip;

import java.util.EnumMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.subequip.SouvenirEnchantment;

public class LoaderSouvenirEnchantment extends LoaderTemplate {
	
	@SuppressWarnings("serial")
	static SouvenirEnchantment[] getSouvenirEnchantment() {
		return new SouvenirEnchantment[] {
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 1, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 2, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 3, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 65, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 8, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 11, true),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 1, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 2, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 5, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 56, 65, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 75, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 8, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 9, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 10, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 11, true),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.INT, false, 1, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.INT, false, 2, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.INT, false, 3, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.INT, false, 4, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.INT, false, 5, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 65, new Calculable[] {
				new Effect(TypeEffect.INT, false, 6, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.INT, false, 8, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.INT, false, 9, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.INT, false, 10, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.INT, false, 11, true),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 1, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 2, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 3, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 4, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 65, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 6, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 7, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 8, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 9, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 10, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 11, true),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 1, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 2, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 3, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 4, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 65, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 6, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 7, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 8, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 10, true),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.AGI, false, 11, true),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 1),
				new Effect(TypeEffect.ToucherD, false, 1),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 2),
				new Effect(TypeEffect.ToucherD, false, 2),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 3),
				new Effect(TypeEffect.ToucherD, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 4),
				new Effect(TypeEffect.ToucherD, false, 4),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 5),
				new Effect(TypeEffect.ToucherD, false, 5),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 6),
				new Effect(TypeEffect.ToucherD, false, 6),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 7),
				new Effect(TypeEffect.ToucherD, false, 7),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 8),
				new Effect(TypeEffect.ToucherD, false, 8),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 9),
				new Effect(TypeEffect.ToucherD, false, 9),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 10),
				new Effect(TypeEffect.ToucherD, false, 10),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 11),
				new Effect(TypeEffect.ToucherD, false, 11),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 12),
				new Effect(TypeEffect.ToucherD, false, 12),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 13),
				new Effect(TypeEffect.ToucherD, false, 13),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 14),
				new Effect(TypeEffect.ToucherD, false, 14),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 6, 55, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 56, 80, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 81, 90, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 4),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 100, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 5),
			}),

			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 6, 15, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 16, 25, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 4),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 26, 35, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 5),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 36, 45, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 6),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 46, 55, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 7),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 56, 60, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 8),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 61, 65, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 9),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 10),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 11),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 12),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 11),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 12),
			}),
			
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de la Mort"); put(Language.EN, "Death"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Sivalee"); put(Language.EN, "Magic Burst"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de l'Impératrice"); put(Language.EN, "Amplifying"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Furuguru"); put(Language.EN, "Verbal"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Randy Locke"); put(Language.EN, "Spotless"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de Shishio"); put(Language.EN, "Swift"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ténébreux"); put(Language.EN, "Dark"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Nature, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Feu, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Glace, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "de l'Ancienneté"); put(Language.EN, "Veteran"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.XP, false, 3),
			}),
			new SouvenirEnchantment(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Porte-Bonheur"); put(Language.EN, "Lucky"); }}, 6, 100, new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
		};
	}
}
