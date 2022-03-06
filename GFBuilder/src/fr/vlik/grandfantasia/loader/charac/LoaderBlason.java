package fr.vlik.grandfantasia.loader.charac;

import java.util.EnumMap;
import java.util.stream.Stream;

import fr.vlik.grandfantasia.charac.Blason;
import fr.vlik.grandfantasia.charac.Blason.BlasonType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;

@SuppressWarnings("serial")
public class LoaderBlason extends LoaderTemplate {
	
	static Blason[] getBlason() {
		return Stream.of(getOff(), getDef()).flatMap(Stream::of).toArray(Blason[]::new);
	}
	
	private static Blason[] getOff() {
		return new Blason[] {
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expertise de la Garde 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 5, false, WeaponType.BOUCLIER),
					new Effect(TypeEffect.DefM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Épée 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Hache 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa2M, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Masse 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie du Tireur 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegGun, false, 8),
					new Effect(TypeEffect.DCCP, false, 8, false, WeaponType.GUN),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Archer 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 8),
					new Effect(TypeEffect.DCCP, false, 8, false, WeaponType.ARC),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Épée 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Hache 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Magie 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 8, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdP, false, 8, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 8, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 8, false, WeaponType.BATON),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie du Grand Marteau 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa2M, false, 8),
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 6"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 16),
					new Effect(TypeEffect.AtkD, true, 16),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Doubles Lames 4"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 5),
					new Effect(TypeEffect.DegDuo, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 6"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 22),
					new Effect(TypeEffect.TCCP, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 6"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 22),
					new Effect(TypeEffect.TCCM, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 6"); put(Language.EN, ""); }},
				100, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 16),
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expertise de la Garde 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 4, false, WeaponType.BOUCLIER),
					new Effect(TypeEffect.DefM, true, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Épée 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Hache 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Masse 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie du Tireur 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegGun, false, 7),
					new Effect(TypeEffect.DCCP, false, 7, false, WeaponType.GUN),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Archer 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 7),
					new Effect(TypeEffect.DCCP, false, 7, false, WeaponType.ARC),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Épée 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Hache 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Magie 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdP, false, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 7, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 7, false, WeaponType.BATON),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie du Grand Marteau 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa2M, false, 7),
					new Effect(TypeEffect.DCCP, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 5"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 14),
					new Effect(TypeEffect.AtkD, true, 14),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Doubles Lames 3"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 4),
					new Effect(TypeEffect.DegDuo, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 5"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 20),
					new Effect(TypeEffect.TCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 5"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 20),
					new Effect(TypeEffect.TCCM, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 5"); put(Language.EN, ""); }},
				95, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 14),
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expertise de la Garde 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 3, false, WeaponType.BOUCLIER),
					new Effect(TypeEffect.DefM, true, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Épée 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Hache 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa2M, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Masse 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie du Tireur 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegGun, false, 6),
					new Effect(TypeEffect.DCCP, false, 6, false, WeaponType.GUN),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Archer 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 6),
					new Effect(TypeEffect.DCCP, false, 6, false, WeaponType.ARC),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Épée 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Hache 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Magie 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 6, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdP, false, 6, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 6, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 6, false, WeaponType.BATON),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie du Grand Marteau 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa2M, false, 6),
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Doubles Lames 2"); put(Language.EN, ""); }},
				90, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 3),
					new Effect(TypeEffect.DegDuo, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expertise de la Garde 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 2, false, WeaponType.BOUCLIER),
					new Effect(TypeEffect.DefM, true, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Épée 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Longue Hache 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie de la Masse 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frénésie du Tireur 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegGun, false, 5),
					new Effect(TypeEffect.DCCP, false, 5, false, WeaponType.GUN),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Archer 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegArc, false, 5),
					new Effect(TypeEffect.DCCP, false, 5, false, WeaponType.ARC),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de l'Épée 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegEp, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Hache 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegHa, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie de la Magie 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 5, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdP, false, 5, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducStdD, false, 5, false, WeaponType.BATON),
					new Effect(TypeEffect.ReducSkillP, false, 5, false, WeaponType.BATON),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Furie du Grand Marteau 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DegMa2M, false, 5),
					new Effect(TypeEffect.DCCP, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Doubles Lames 1"); put(Language.EN, ""); }},
				85, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.VitAtkDuo, false, 2),
					new Effect(TypeEffect.DegDuo, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de la Déesse de la Lune 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 1100, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 12),
					new Effect(TypeEffect.AtkD, true, 12),
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Murmure de Méditation 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 120),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
					new Effect(TypeEffect.TCCP, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sérénité Divine 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 120),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
					new Effect(TypeEffect.TCCM, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Temple 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1100, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 4"); put(Language.EN, ""); }},
				80, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de la Déesse de la Lune 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 900, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 12),
					new Effect(TypeEffect.AtkD, true, 12),
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Murmure de Méditation 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 110),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
					new Effect(TypeEffect.TCCP, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sérénité Divine 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 110),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
					new Effect(TypeEffect.TCCM, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Temple 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 800, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 3"); put(Language.EN, ""); }},
				75, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de la Déesse de la Lune 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 800, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 12),
					new Effect(TypeEffect.AtkD, true, 12),
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Murmure de Méditation 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 100),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sérénité Divine 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 100),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
					new Effect(TypeEffect.TCCM, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Temple 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 700, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 2"); put(Language.EN, ""); }},
				68, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de la Déesse de la Lune 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 800, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne du Dieu de la Guerre 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 12),
					new Effect(TypeEffect.AtkD, true, 12),
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Murmure de Méditation 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 90),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rugissement Furieux 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
					new Effect(TypeEffect.TCCP, false, 1),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sérénité Divine 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 90),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sonate Démoniaque 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
					new Effect(TypeEffect.TCCM, false, 1),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Temple 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 700, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse des Lutins 1"); put(Language.EN, ""); }},
				61, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 80),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 80),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 12),
					new Effect(TypeEffect.AtkD, true, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 700, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle renforcées 3"); put(Language.EN, ""); }},
				55, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 600, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 70),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 70),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 11),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 11),
					new Effect(TypeEffect.AtkD, true, 11),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 600, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle renforcées 2"); put(Language.EN, ""); }},
				53, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 60),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 60),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 10),
					new Effect(TypeEffect.AtkD, true, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 600, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle renforcées 1"); put(Language.EN, ""); }},
				51, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 500, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 50),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 50),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 9),
					new Effect(TypeEffect.AtkD, true, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 500, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle 3"); put(Language.EN, ""); }},
				41, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 400, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 40),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 40),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 8),
					new Effect(TypeEffect.AtkD, true, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 400, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle 2"); put(Language.EN, ""); }},
				31, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 300, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Rage 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art Démoniaque 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Méditation 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPM, false, 30),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de Repos 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.RegenPV, false, 30),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction magique 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de l'Esprit Guerrier 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 7),
					new Effect(TypeEffect.AtkD, true, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant de Vie 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 400, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant du Miracle 1"); put(Language.EN, ""); }},
				21, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PM, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 300, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'encouragement 3"); put(Language.EN, ""); }},
				15, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 6),
					new Effect(TypeEffect.AtkD, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'inspiration 3"); put(Language.EN, ""); }},
				15, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la guérison 3"); put(Language.EN, ""); }},
				15, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 12, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 300, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'encouragement 2"); put(Language.EN, ""); }},
				8, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 4),
					new Effect(TypeEffect.AtkD, true, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'inspiration 2"); put(Language.EN, ""); }},
				8, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la guérison 2"); put(Language.EN, ""); }},
				8, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 9, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 200, TypeRegen.REGENERATION),
					}),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'encouragement 1"); put(Language.EN, ""); }},
				0, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Atk, true, 2),
					new Effect(TypeEffect.AtkD, true, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'inspiration 1"); put(Language.EN, ""); }},
				0, BlasonType.OFFENSIVE, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la guérison 1"); put(Language.EN, ""); }},
				0, BlasonType.OFFENSIVE, new Calculable[] {
					new Condition(TypeEffect.PV, 70, 6, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, 200, TypeRegen.REGENERATION),
					}),
				}),
		};
	}
	
	private static Blason[] getDef() {
		return new Blason[] {
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Foudre 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 23),
					new Effect(TypeEffect.VOL, false, 28),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Glace 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 23),
					new Effect(TypeEffect.INT, false, 35),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nature 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 23),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nuit 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 23),
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Feu 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 23),
					new Effect(TypeEffect.Depla, false, 6),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Morceau du Promeneur du Vent 2"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 16),
					new Effect(TypeEffect.Depla, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sainteté du Sacré 4"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 23),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Mur de Lumière 2"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 16),
					new Effect(TypeEffect.PV, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Titan 2"); put(Language.EN, ""); }},
				100, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 16),
					new Effect(TypeEffect.PV, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Foudre 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 23),
					new Effect(TypeEffect.VOL, false, 28),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Glace 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 23),
					new Effect(TypeEffect.INT, false, 35),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nature 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 23),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nuit 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 23),
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Feu 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 23),
					new Effect(TypeEffect.Depla, false, 6),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Morceau du Promeneur du Vent"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 13),
					new Effect(TypeEffect.Depla, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sainteté du Sacré 3"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 23),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Mur de Lumière"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 14),
					new Effect(TypeEffect.PV, true, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Symphonie du Titan"); put(Language.EN, ""); }},
				95, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 14),
					new Effect(TypeEffect.PV, true, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Foudre 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 23),
					new Effect(TypeEffect.VOL, false, 28),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Glace 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 23),
					new Effect(TypeEffect.INT, false, 35),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nature 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 23),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nuit 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 23),
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Feu 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 23),
					new Effect(TypeEffect.Depla, false, 6),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sainteté du Sacré 2"); put(Language.EN, ""); }},
				90, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 23),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.PM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Foudre 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 22),
					new Effect(TypeEffect.VOL, false, 28),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Glace 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 22),
					new Effect(TypeEffect.INT, false, 35),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nature 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 22),
					new Effect(TypeEffect.AGI, false, 40),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien de la Nuit 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 22),
					new Effect(TypeEffect.FCE, false, 40),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Feu 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 22),
					new Effect(TypeEffect.Depla, false, 6),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sainteté du Sacré 1"); put(Language.EN, ""); }},
				85, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 22),
					new Effect(TypeEffect.VIT, false, 20),
					new Effect(TypeEffect.PM, true, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura Royale 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 21),
					new Effect(TypeEffect.FCE, false, 40),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonne Étoile 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 21),
					new Effect(TypeEffect.VIT, false, 20),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme Printanier 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 21),
					new Effect(TypeEffect.AGI, false, 40),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Concerto du Mur de Lumière 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 12),
					new Effect(TypeEffect.VitComp, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fanfare du Dieu du Feu 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 21),
					new Effect(TypeEffect.Depla, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mélodie de la Marche du Vent 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 11),
					new Effect(TypeEffect.VitAtk, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rhapsodie de Titan 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.Parade, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tambour du Dieu du Tonnerre 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 21),
					new Effect(TypeEffect.VOL, false, 28),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse de la Reine de Glace 4"); put(Language.EN, ""); }},
				80, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 21),
					new Effect(TypeEffect.INT, false, 35),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura Royale 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 21),
					new Effect(TypeEffect.FCE, false, 30),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonne Étoile 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 21),
					new Effect(TypeEffect.VIT, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme Printanier 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 21),
					new Effect(TypeEffect.AGI, false, 30),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Concerto du Mur de Lumière 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 12),
					new Effect(TypeEffect.VitComp, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fanfare du Dieu du Feu 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 21),
					new Effect(TypeEffect.Depla, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mélodie de la Marche du Vent 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new Effect(TypeEffect.VitAtk, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rhapsodie de Titan 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.Parade, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tambour du Dieu du Tonnerre 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 21),
					new Effect(TypeEffect.VOL, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse de la Reine de Glace 3"); put(Language.EN, ""); }},
				75, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 21),
					new Effect(TypeEffect.INT, false, 30),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura Royale 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 21),
					new Effect(TypeEffect.FCE, false, 20),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonne Étoile 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 21),
					new Effect(TypeEffect.VIT, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme Printanier 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 21),
					new Effect(TypeEffect.AGI, false, 20),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Concerto du Mur de Lumière 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 12),
					new Effect(TypeEffect.VitComp, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fanfare du Dieu du Feu 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 21),
					new Effect(TypeEffect.Depla, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mélodie de la Marche du Vent 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new Effect(TypeEffect.VitAtk, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rhapsodie de Titan 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.Parade, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tambour du Dieu du Tonnerre 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 21),
					new Effect(TypeEffect.VOL, false, 14),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse de la Reine de Glace 2"); put(Language.EN, ""); }},
				68, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 21),
					new Effect(TypeEffect.INT, false, 20),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aura Royale 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 21),
					new Effect(TypeEffect.FCE, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonne Étoile 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 21),
					new Effect(TypeEffect.VIT, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Charme Printanier 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 21),
					new Effect(TypeEffect.AGI, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Concerto du Mur de Lumière 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 12),
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fanfare du Dieu du Feu 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 21),
					new Effect(TypeEffect.Depla, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mélodie de la Marche du Vent 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
					new Effect(TypeEffect.VitAtk, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rhapsodie de Titan 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
					new Effect(TypeEffect.Parade, false, 1),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tambour du Dieu du Tonnerre 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 21),
					new Effect(TypeEffect.VOL, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Valse de la Reine de Glace 1"); put(Language.EN, ""); }},
				61, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 21),
					new Effect(TypeEffect.INT, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier renforcé 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres renforcée 3"); put(Language.EN, ""); }},
				55, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 21),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 11),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier renforcé 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 11),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres renforcée 2"); put(Language.EN, ""); }},
				53, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 18),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier renforcé 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 10),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres renforcée 1"); put(Language.EN, ""); }},
				51, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 15),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres 3"); put(Language.EN, ""); }},
				41, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 12),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 8),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres 2"); put(Language.EN, ""); }},
				31, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 9),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Ombres Volantes 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'unité 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chant d'Acier 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 7),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à l'Eclair 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection à la Glace 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Glace, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection aux Flammes 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Feu, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Divine 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection naturelle 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Nature, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection Ténèbres 1"); put(Language.EN, ""); }},
				21, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'Esquive 3"); put(Language.EN, ""); }},
				15, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Protection 3"); put(Language.EN, ""); }},
				15, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Boucliers Magiques 3"); put(Language.EN, ""); }},
				15, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 6),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'Esquive 2"); put(Language.EN, ""); }},
				8, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Protection 2"); put(Language.EN, ""); }},
				8, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Boucliers Magiques 2"); put(Language.EN, ""); }},
				8, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 4),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de l'Esquive 1"); put(Language.EN, ""); }},
				0, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art de la Protection 1"); put(Language.EN, ""); }},
				0, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefP, true, 2),
				}),
			new Blason(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des Boucliers Magiques 1"); put(Language.EN, ""); }},
				0, BlasonType.DEFENSIVE, new Calculable[] {
					new Effect(TypeEffect.DefM, true, 2),
				}),
		};
	}
}
