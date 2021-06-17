package fr.vlik.grandfantasia.loader.equipUpgrade;

import java.util.HashMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equip.Cape.CapeType;
import fr.vlik.grandfantasia.equip.Ring.RingType;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderEnchant {
	
	static Enchantment[] getRed() {
		return new Enchantment[] {
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Auto-guérison"); put(Language.EN, "Self-healing"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Résistance"); put(Language.EN, "Resistant"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 1),
						new Effect(TypeEffect.Ombre, false, 1),
						new Effect(TypeEffect.Foudre, false, 1),
						new Effect(TypeEffect.Feu, false, 1),
						new Effect(TypeEffect.Glace, false, 1),
						new Effect(TypeEffect.Nature, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 2),
						new Effect(TypeEffect.Ombre, false, 2),
						new Effect(TypeEffect.Foudre, false, 2),
						new Effect(TypeEffect.Feu, false, 2),
						new Effect(TypeEffect.Glace, false, 2),
						new Effect(TypeEffect.Nature, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
						new Effect(TypeEffect.Ombre, false, 3),
						new Effect(TypeEffect.Foudre, false, 3),
						new Effect(TypeEffect.Feu, false, 3),
						new Effect(TypeEffect.Glace, false, 3),
						new Effect(TypeEffect.Nature, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 4),
						new Effect(TypeEffect.Ombre, false, 4),
						new Effect(TypeEffect.Foudre, false, 4),
						new Effect(TypeEffect.Feu, false, 4),
						new Effect(TypeEffect.Glace, false, 4),
						new Effect(TypeEffect.Nature, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 5),
						new Effect(TypeEffect.Ombre, false, 5),
						new Effect(TypeEffect.Foudre, false, 5),
						new Effect(TypeEffect.Feu, false, 5),
						new Effect(TypeEffect.Glace, false, 5),
						new Effect(TypeEffect.Nature, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 6),
						new Effect(TypeEffect.Ombre, false, 6),
						new Effect(TypeEffect.Foudre, false, 6),
						new Effect(TypeEffect.Feu, false, 6),
						new Effect(TypeEffect.Glace, false, 6),
						new Effect(TypeEffect.Nature, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 7),
						new Effect(TypeEffect.Ombre, false, 7),
						new Effect(TypeEffect.Foudre, false, 7),
						new Effect(TypeEffect.Feu, false, 7),
						new Effect(TypeEffect.Glace, false, 7),
						new Effect(TypeEffect.Nature, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 8),
						new Effect(TypeEffect.Ombre, false, 8),
						new Effect(TypeEffect.Foudre, false, 8),
						new Effect(TypeEffect.Feu, false, 8),
						new Effect(TypeEffect.Glace, false, 8),
						new Effect(TypeEffect.Nature, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 9),
						new Effect(TypeEffect.Ombre, false, 9),
						new Effect(TypeEffect.Foudre, false, 9),
						new Effect(TypeEffect.Feu, false, 9),
						new Effect(TypeEffect.Glace, false, 9),
						new Effect(TypeEffect.Nature, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 10),
						new Effect(TypeEffect.Ombre, false, 10),
						new Effect(TypeEffect.Foudre, false, 10),
						new Effect(TypeEffect.Feu, false, 10),
						new Effect(TypeEffect.Glace, false, 10),
						new Effect(TypeEffect.Nature, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Ténébreux"); put(Language.EN, "Dark"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural "); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 87, 100,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.PV, true, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.PM, true, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Blindé"); put(Language.EN, "Armored"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 2),
						new Effect(TypeEffect.DefM, true, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 4),
						new Effect(TypeEffect.DefM, true, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 6),
						new Effect(TypeEffect.DefM, true, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 8),
						new Effect(TypeEffect.DefM, true, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 10),
						new Effect(TypeEffect.DefM, true, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 12),
						new Effect(TypeEffect.DefM, true, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 14),
						new Effect(TypeEffect.DefM, true, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 16),
						new Effect(TypeEffect.DefM, true, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 18),
						new Effect(TypeEffect.DefM, true, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.DefP, true, 20),
						new Effect(TypeEffect.DefM, true, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Purlock"); put(Language.EN, "Blessed"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 1),
						new Effect(TypeEffect.ReducM_old, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 2),
						new Effect(TypeEffect.ReducM_old, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 3),
						new Effect(TypeEffect.ReducM_old, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 4),
						new Effect(TypeEffect.ReducM_old, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 5),
						new Effect(TypeEffect.ReducM_old, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 6),
						new Effect(TypeEffect.ReducM_old, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 7),
						new Effect(TypeEffect.ReducM_old, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 8),
						new Effect(TypeEffect.ReducM_old, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 9),
						new Effect(TypeEffect.ReducM_old, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 10),
						new Effect(TypeEffect.ReducM_old, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Molilada"); put(Language.EN, "Coordinated"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 2),
						new Effect(TypeEffect.RTCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 4),
						new Effect(TypeEffect.RTCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 6),
						new Effect(TypeEffect.RTCCM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 8),
						new Effect(TypeEffect.RTCCM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 10),
						new Effect(TypeEffect.RTCCM, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 12),
						new Effect(TypeEffect.RTCCM, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 14),
						new Effect(TypeEffect.RTCCM, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 16),
						new Effect(TypeEffect.RTCCM, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 18),
						new Effect(TypeEffect.RTCCM, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 20),
						new Effect(TypeEffect.RTCCM, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Urkate"); put(Language.EN, "Perservering"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 2),
						new Effect(TypeEffect.RDCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 4),
						new Effect(TypeEffect.RDCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 6),
						new Effect(TypeEffect.RDCCM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 8),
						new Effect(TypeEffect.RDCCM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 10),
						new Effect(TypeEffect.RDCCM, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 12),
						new Effect(TypeEffect.RDCCM, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 14),
						new Effect(TypeEffect.RDCCM, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 16),
						new Effect(TypeEffect.RDCCM, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 18),
						new Effect(TypeEffect.RDCCM, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 20),
						new Effect(TypeEffect.RDCCM, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Surveillance"); put(Language.EN, "Overlooking "); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -3),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -6),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -9),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -12),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -15),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -18),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -21),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -24),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -27),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -30),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Adversité"); put(Language.EN, "Counter"); }}, 90, 100,
				new EquipType[] { WeaponType.RELIQUE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Contre-attaque"); put(Language.EN, "Counter-attacker"); }}, 90, 100,
				new EquipType[] { WeaponType.RELIQUE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReflectM, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur"); put(Language.EN, "Protective"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 200, 350, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 400, 550, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 600, 750, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 800, 950, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1000, 1150, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1200, 1350, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1400, 1550, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1600, 1750, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1800, 1950, TypeRegen.REGENERATION, 3),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 2000, 2150, TypeRegen.REGENERATION, 3),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Mur de boucliers"); put(Language.EN, "Shield Waller"); }}, 90, 100,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Défenseur"); put(Language.EN, "Defender"); }}, 90, 100,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sacré"); put(Language.EN, "Holy"); }}, 90, 100,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 3000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 6000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 9000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 12000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 15000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 18000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 21000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 24000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 27000),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.Attacked, 5, new Calculable[] {
							new Effect(TypeEffect.Shield, false, 30000),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Inspiration divine"); put(Language.EN, "Guided-by-God"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 300, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 600, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 900, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 1200, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 1500, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 1800, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 2100, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 2400, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 2700, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 3000, TypeRegen.REGENERATION, 1),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Hurleur de bataille"); put(Language.EN, "Battle Cryer"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 300, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 600, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 900, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1200, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1500, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 1800, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 2100, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 2400, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 2700, TypeRegen.REGENERATION, 1),
						}),
					},
					new Calculable[] {
						new Proc(20, Activation.CritMag, 3, new Calculable[] {
							new RegenEffect(TypeEffect.PV, false, 3000, TypeRegen.REGENERATION, 1),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Rituel"); put(Language.EN, "Ritual"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(5, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(5, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(5, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(5, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
					new Calculable[] {
						new Proc(5, Activation.Attacked, new Calculable[] {
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
							new StaticEffect(TypeStaticEffect.Dispel),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Maître des vents"); put(Language.EN, "Windbreaker"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -14, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -16, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -20, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Maraudeur"); put(Language.EN, "Marauder"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 50, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 60, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 70, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 80, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 90, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 100, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tyran"); put(Language.EN, "Tyrant"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sauvage"); put(Language.EN, "Savage"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Réduit au silence"); put(Language.EN, "Silenced"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Brise-cœur"); put(Language.EN, "Heart Breaker"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Immuable"); put(Language.EN, "Unwavering"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 25, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 35, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 45, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tornade"); put(Language.EN, "Tornado"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -25, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -35, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -45, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Frémissement"); put(Language.EN, "Quake"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -12, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -12, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -12, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -12, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -12, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -14, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -14, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -14, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -14, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -14, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -14, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -16, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -16, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -16, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -16, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -16, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -16, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -18, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -18, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -18, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -18, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -18, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -20, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -20, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -20, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -20, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -20, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -20, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Intimidant"); put(Language.EN, "Intimidating"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -25, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -35, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -45, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Barbare"); put(Language.EN, "Torturous"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Châtiment"); put(Language.EN, "Punishing"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -21, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -24, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -27, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Immobilisation"); put(Language.EN, "Binding"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -14, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -16, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -20, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Dominant"); put(Language.EN, "Dominating"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -14, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -16, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -18, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -20, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Écrasant"); put(Language.EN, "Overwhelming"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -25, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -35, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -45, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Oppressant"); put(Language.EN, "Oppresive"); }}, 87, 100,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -25, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -35, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -45, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Sivalee"); put(Language.EN, "Magic Burst"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Impératrice"); put(Language.EN, "Amplifying"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 21),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 24),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 27),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 30),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly "); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Mort"); put(Language.EN, "Death"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 21),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 24),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 27),
					},
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 30),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Furuguru"); put(Language.EN, "Verbal"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Randy Locke"); put(Language.EN, "Spotless"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Shishio"); put(Language.EN, "Swift"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1, 3, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 2, 4, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 3, 5, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 4, 6, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 5, 7, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 6, 8, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 7, 9, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 8, 10, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 11, TypeRegen.ABSORPTION),
					},
					new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 12, TypeRegen.ABSORPTION),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Soif Sanguine"); put(Language.EN, "Bloodthirsty"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 3),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sarcasme"); put(Language.EN, "Taunting"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 21),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 24),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 27),
					},
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 30),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Double"); put(Language.EN, "Dual"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 1),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 2),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 3),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 4),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 5),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 6),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 7),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 8),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 9),
					},
					new Calculable[] {
						new StaticEffect(TypeStaticEffect.x2STD_old, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sauvage"); put(Language.EN, "Savage"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, Target.OPPONENT, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 2),
							new Effect(TypeEffect.DegM_old, false, 2),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, Target.OPPONENT, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 4),
							new Effect(TypeEffect.DegM_old, false, 4),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, Target.OPPONENT, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 6),
							new Effect(TypeEffect.DegM_old, false, 6),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, Target.OPPONENT, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 8),
							new Effect(TypeEffect.DegM_old, false, 8),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, Target.OPPONENT, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 10),
							new Effect(TypeEffect.DegM_old, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vengeur"); put(Language.EN, "Retaliating"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 2),
							new Effect(TypeEffect.DegM_old, false, 2),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 4),
							new Effect(TypeEffect.DegM_old, false, 4),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 6),
							new Effect(TypeEffect.DegM_old, false, 6),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 8),
							new Effect(TypeEffect.DegM_old, false, 8),
						}),
					},
					new Calculable[] {
						new Condition(TypeEffect.PV, 33, new Calculable[] {
							new Effect(TypeEffect.DegP_old, false, 10),
							new Effect(TypeEffect.DegM_old, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Scandaleux"); put(Language.EN, "Outrageous"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneP, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brèche"); put(Language.EN, "Piercing"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.PeneM, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Mur de Fer"); put(Language.EN, "Iron Wall"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneP, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Protecteur"); put(Language.EN, "Protective"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.ReducPeneM, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Suffocation"); put(Language.EN, "Suffocating"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -5),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -15),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -20),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, -25),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Épuisement"); put(Language.EN, "Straining"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 30, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 40, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.CostComp, false, 50, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vicieux"); put(Language.EN, "Vicious"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Brutal"); put(Language.EN, "Brutal"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Réduit au silence"); put(Language.EN, "Silenced"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Blasphématoire"); put(Language.EN, "Blasphemous"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Dispersion"); put(Language.EN, "Dispersed"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, -200, -350, TypeRegen.POISON, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, -400, -550, TypeRegen.POISON, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, -600, -750, TypeRegen.POISON, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, -800, -950, TypeRegen.POISON, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, -1000, -1150, TypeRegen.POISON, 1),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Inexpliqué"); put(Language.EN, "Unexplained"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Poisse, false, 25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vengeur "); put(Language.EN, ""); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Depla, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Chute libre"); put(Language.EN, "Skyfall"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -2, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -4, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -6, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -8, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Sacre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Ombre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Foudre, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Feu, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Glace, false, -10, Target.OPPONENT),
							new Effect(TypeEffect.Nature, false, -10, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Élu"); put(Language.EN, "Chosen"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.Toucher, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Enragé"); put(Language.EN, "Raging"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, -15, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Tremblement"); put(Language.EN, "Trembling"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -3, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -9, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -12, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, -15, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Contrainte"); put(Language.EN, "Restraining"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, -10, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Despotique"); put(Language.EN, "Domineering"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -2, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -4, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -6, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -8, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, -10, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Pression"); put(Language.EN, "Pressuring"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Exploitation"); put(Language.EN, "Exploiting"); }}, 90, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -5, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -10, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -15, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -20, Target.OPPONENT),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attack, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, -25, Target.OPPONENT),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 35),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 40),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 45),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 50),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 40),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 50),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 60),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 70),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 80),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 90),
					},
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 100),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 30),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 35),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 40),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 45),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 50),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 30),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 40),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 50),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 60),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 70),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 80),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 90),
					},
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 100),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 20),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 25),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 30),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 35),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 40),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 45),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 50),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Antoraya"); put(Language.EN, "Sprint"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 1),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 3),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 5),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 7),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 9),
					},
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -1),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -2),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -3),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -4),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -5),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -6),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -7),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -8),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -9),
					},
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -10),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Précis"); put(Language.EN, "Precise"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Soins"); put(Language.EN, "Healing"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 2),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 4),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 6),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 8),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 10),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 12),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 14),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 16),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 18),
					},
					new Calculable[] {
						new Effect(TypeEffect.HealR, false, 20),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Converti"); put(Language.EN, "Converted"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Atk, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 10, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Transféré"); put(Language.EN, "Transferred"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 10, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Transformé"); put(Language.EN, "Transformed"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 10, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Reconfiguré"); put(Language.EN, "Reconfigured"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.Atk, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 10, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 12, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 14, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 16, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 18, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.Atk, 20, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Puissance"); put(Language.EN, "Torque"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 10, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 12, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 14, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 16, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 18, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkD, 20, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Redirigé"); put(Language.EN, "Diverted"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 10, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 12, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 14, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 16, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 18, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AtkM, 20, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vital"); put(Language.EN, "Vital"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Vigoureux"); put(Language.EN, "Vigorous"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sensible"); put(Language.EN, "Sensitive"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.2, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.3, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.4, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.5, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.6, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.7, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.8, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.9, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1, TypeEffect.PV, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Musclé"); put(Language.EN, "Bulked-Up"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 0.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 1.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.FCE, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Superfuté"); put(Language.EN, "Super-Smart"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 0.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 1.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.INT, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sensibilisé"); put(Language.EN, "Sensitized"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 0.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.4, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.6, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 1.8, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
					new Calculable[] {
						new Effect(TypeEffect.AGI, 2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Armure de guerre"); put(Language.EN, "War Armor"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DefP, true, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Retour du soldat"); put(Language.EN, "Returning Soldier"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 5),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 7),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Ravagé par la guerre"); put(Language.EN, "War-Ravaged"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 5),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 7),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.TCCP, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Évolution guerrière"); put(Language.EN, "War Soul"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.DCCP, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Cri de guerre"); put(Language.EN, "War Cry"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtk, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sniper"); put(Language.EN, "Hawkeye"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.VitAtkD, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Dominant"); put(Language.EN, "Dominating"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -15),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -21),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -24),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -27),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -30),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Clerc sacré"); put(Language.EN, "Holy Cleric"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritPhys, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Cuirasse évolutive"); put(Language.EN, "Soul Armor"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DefM, true, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Infuseur d'âme"); put(Language.EN, "Soul Infuser"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 5),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 7),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.ESQ, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Sournois"); put(Language.EN, "Sneaky"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 1),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 5),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 7),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.TCCM, false, 10),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Terreur spirituelle"); put(Language.EN, "Soul Terror"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.DCCM, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Cantique"); put(Language.EN, "Hymnal"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.VitComp, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Inarrêtable"); put(Language.EN, "Unstoppable"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -3),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -9),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -15),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -21),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -24),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -27),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.IntComp, false, -30),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Guérisseur sacré"); put(Language.EN, "Holy Healer"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 2),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 4),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 6),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 8),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 10),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 12),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 14),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 16),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 18),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.CritMag, 5, new Calculable[] {
							new Effect(TypeEffect.HealR, false, 20),
						}),
					},
				}),
			new RedEnchantment(new HashMap<Language, String>() {{ put(Language.FR, "Mort-Vivant"); put(Language.EN, "Undead"); }}, 87, 100,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[][] {
					new Calculable[] {
						new Proc(3, Activation.Attacked, 2, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 4, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 6, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 8, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 10, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 12, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 14, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 16, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 18, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
					new Calculable[] {
						new Proc(3, Activation.Attacked, 20, new Calculable[] {
							new Condition(TypeCondition.DEATH, new Calculable[] {
								new Effect(TypeEffect.Depla, false, 100),
							}),
						}),
					},
				}),
		};
	}
	
	static Enchantment[] getPurple() {
		return new Enchantment[] {
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 11, 17, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 20, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 21, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 43, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 66, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 76, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 43, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 43, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 71, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 86, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 17),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -15),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 43, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.PURPLE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 43, true),
				}),
		};
	}
	
	static Enchantment[] getGold() {
		return new Enchantment[] {
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 36, 45, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 46, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 11, 17, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 20, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Adversité"); put(Language.EN, "Counter"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 10),
						new Effect(TypeEffect.ReflectM, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 65, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 23, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 27, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 29, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 31, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 33, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 35, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 37, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 39, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 41, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 56, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Explosion énergétique"); put(Language.EN, "Magic Burst"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 65, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 23, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 27, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 29, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 31, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 33, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 35, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 37, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 39, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 41, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Coordination"); put(Language.EN, "Coordinated"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, WeaponType.LAME, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 3),
						new Effect(TypeEffect.RTCCM, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 65, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 23, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 27, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 29, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 31, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 33, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 35, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 37, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 39, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 41, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Amplification"); put(Language.EN, "Amplifying"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ombre"); put(Language.EN, "Dark"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Détermination"); put(Language.EN, "Perservering"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 10),
						new Effect(TypeEffect.RDCCM, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Mort"); put(Language.EN, "Death "); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural "); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Parole"); put(Language.EN, "Verbal"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Surveillance"); put(Language.EN, "Overlooking "); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 36, 60, Quality.GOLD,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 61, 75, Quality.GOLD,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 76, 90, Quality.GOLD,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 60, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 15),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 16),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Soif Sanguine"); put(Language.EN, "Bloodthirsty"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 36, 45, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 46, 55, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -13),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -14),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 65, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 27, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 29, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 31, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 33, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 35, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 37, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 39, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 41, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 55, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 65, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 23, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 27, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 29, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 31, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 33, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 35, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 16, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 37, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 100, Quality.GOLD,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 39, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 20, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 41, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly "); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Bonheur Pur"); put(Language.EN, "Blessed"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 1),
						new Effect(TypeEffect.ReducM_old, false, 1),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Réflexe"); put(Language.EN, "Swift"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sarcasme"); put(Language.EN, "Taunting"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sprint"); put(Language.EN, "Sprint"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "sans Tache"); put(Language.EN, "Spotless"); }}, 6, 100, Quality.GOLD,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					}),
		};
	}
		
	static Enchantment[] getOrange() {
		return new Enchantment[] {
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Adversité"); put(Language.EN, "Counter"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 10),
						new Effect(TypeEffect.ReflectM, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 1, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 45, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 60, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 70, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 70, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 85, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 21, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 22, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 24, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 26, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 28, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 30, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 16, 55, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 56, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Explosion énergétique"); put(Language.EN, "Magic Burst"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 1, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 45, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 60, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 70, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 70, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 85, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 21, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 22, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 24, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 26, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 28, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 30, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Coordination"); put(Language.EN, "Coordinated"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 3),
						new Effect(TypeEffect.RTCCM, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 1, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 45, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 60, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 70, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 70, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 85, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 21, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 22, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 24, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 26, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 28, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Amplification"); put(Language.EN, "Amplifying"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ombre"); put(Language.EN, "Dark"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Détermination"); put(Language.EN, "Perservering"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 10),
						new Effect(TypeEffect.RDCCM, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Mort"); put(Language.EN, "Death "); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural "); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Parole"); put(Language.EN, "Verbal"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Surveillance"); put(Language.EN, "Overlooking "); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 16, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 36, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 61, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 76, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 15),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 16),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Soif Sanguine"); put(Language.EN, "Bloodthirsty"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -4),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -6),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -7),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -8),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -9),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -10),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 1, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 45, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 60, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 70, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 70, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 85, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 21, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 22, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 24, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 28, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 1, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 45, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 60, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 70, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 70, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 17, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 85, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 80, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 21, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 22, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 24, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 100, Quality.ORANGE,
					new EquipType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 85, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 26, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 100, Quality.ORANGE,
					new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 13, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 28, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 30, true),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly "); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Bonheur Pur"); put(Language.EN, "Blessed"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, 1),
						new Effect(TypeEffect.ReducM_old, false, 1),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Réflexe"); put(Language.EN, "Swift"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sarcasme"); put(Language.EN, "Taunting"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sprint"); put(Language.EN, "Sprint"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					}),
				new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "sans Tache"); put(Language.EN, "Spotless"); }}, 6, 100, Quality.ORANGE,
					new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					}),
		};
	}
	
	static Enchantment[] getBlue() {
		return new Enchantment[] {
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1, 7, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Adversité"); put(Language.EN, "Counter"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 23, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 27, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 26, 36, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 56, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 200),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 250),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 400),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 500),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 550),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 550),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 600),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 600),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 650),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 650),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 700),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 700),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 750),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 750),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 800),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 800),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 850),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 850),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 900),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 900),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 950),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 16, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 56, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Explosion énergétique"); put(Language.EN, "Magic Burst"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 23, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 27, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Investigation"); put(Language.EN, "Interrogator"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brise-os"); put(Language.EN, "Bonecrushing"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brisecrâne"); put(Language.EN, "Headsmasher"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Conquête"); put(Language.EN, "Heartsnatcher"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Coordination"); put(Language.EN, "Coordinated"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 3),
					new Effect(TypeEffect.RTCCM, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Décharge"); put(Language.EN, "Electrifying"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 23, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 27, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Amplification"); put(Language.EN, "Amplifying"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ancienneté"); put(Language.EN, "Veteran"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Hypnose"); put(Language.EN, "Hypnotizer"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Sleep, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ombre"); put(Language.EN, "Dark"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Chance"); put(Language.EN, "Arbitrary"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Détermination"); put(Language.EN, "Perservering"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Malédiction"); put(Language.EN, "Curse"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Mort"); put(Language.EN, "Death "); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural "); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Parole"); put(Language.EN, "Verbal"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Plante Grimpante"); put(Language.EN, "Vine"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Surveillance"); put(Language.EN, "Overlooking "); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Toile"); put(Language.EN, "Spider Web"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Nagranok"); put(Language.EN, "Illusionary"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 6, 35, Quality.BLUE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 36, 60, Quality.BLUE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 61, 75, Quality.BLUE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 76, 90, Quality.BLUE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 1),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Rigidité"); put(Language.EN, "Rigid"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Rigueur"); put(Language.EN, "Stiff"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Soif Sanguine"); put(Language.EN, "Bloodthirsty"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Torture"); put(Language.EN, "Torture"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Transformation"); put(Language.EN, "Transforming"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tristesse"); put(Language.EN, "Sadness"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 200),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 250),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 500),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 550),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 550),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 600),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 600),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 650),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 650),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 700),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 700),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 750),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 750),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 800),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 800),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 850),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 850),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 900),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 900),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 950),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 23, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 27, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 23, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 27, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 31, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 35, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 39, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly "); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Bonheur Pur"); put(Language.EN, "Blessed"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 1),
					new Effect(TypeEffect.ReducM_old, false, 1),
				}),

			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 26, 36, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 56, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Choc"); put(Language.EN, "Shocking"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fantôme"); put(Language.EN, "Illusionary"); }}, 6, 90, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fracas Osseux"); put(Language.EN, "Bonecrushing"); }}, 6, 90, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Malheur"); put(Language.EN, "Unfortunate"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12),
						new Effect(TypeEffect.PM, true, -12),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14),
						new Effect(TypeEffect.PM, true, -14),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16),
						new Effect(TypeEffect.PM, true, -16),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18),
						new Effect(TypeEffect.PM, true, -18),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20),
						new Effect(TypeEffect.PM, true, -20),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Réflexe"); put(Language.EN, "Swift"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sarcasme"); put(Language.EN, "Taunting"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Silence"); put(Language.EN, "Silence"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -10, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -12, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -14, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -16, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -18, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -20, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sprint"); put(Language.EN, "Sprint"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 6, 15, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 16, 25, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 26, 35, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 36, 45, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 46, 55, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 56, 100, Quality.BLUE,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "Porte-Bonheur"); put(Language.EN, "Lucky"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "sans Tache"); put(Language.EN, "Spotless"); }}, 6, 100, Quality.BLUE,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 4),
				}),
		};
	}
	
	static Enchantment[] getGreen() {
		return new Enchantment[] {
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1, 7, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Absorption énergétique"); put(Language.EN, "Mana-Drain"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Adversité"); put(Language.EN, "Counter"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 75, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 45, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 49, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 53, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Agilité"); put(Language.EN, "Agility"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 57, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 26, 36, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Arrache-Coeur"); put(Language.EN, ""); }}, 56, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Empoisonnement"); put(Language.EN, "Venomous"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 100),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 125),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 175),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 200),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 250),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 275),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 275),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 300),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 300),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 325),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 325),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 375),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 400),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 425),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 450),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Énergie"); put(Language.EN, "Mana"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 478),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 16, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 56, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Esquive"); put(Language.EN, "Evasion"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Explosion énergétique"); put(Language.EN, "Magic Burst"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 75, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 45, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 49, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 53, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Intelligence"); put(Language.EN, "Intelligence"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 57, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "d'Investigation"); put(Language.EN, "Interrogator"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brise-os"); put(Language.EN, "Bonecrushing"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brisecrâne"); put(Language.EN, "Headsmasher"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Brûlure"); put(Language.EN, "Scorching"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Conquête"); put(Language.EN, "Heartsnatcher"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Coordination"); put(Language.EN, "Coordinated"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 3),
					new Effect(TypeEffect.RTCCM, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Décharge"); put(Language.EN, "Electrifying"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 75, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 45, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 49, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 53, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Force"); put(Language.EN, "Strength"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 57, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Amplification"); put(Language.EN, "Amplifying"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ancienneté"); put(Language.EN, "Veteran"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Hypnose"); put(Language.EN, "Hypnotizer"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Sleep, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de l'Ombre"); put(Language.EN, "Dark"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Chance"); put(Language.EN, "Arbitrary"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Contagion"); put(Language.EN, "Contagious"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Détermination"); put(Language.EN, "Perservering"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Foudre"); put(Language.EN, "Thunderous"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Glace"); put(Language.EN, "Icy"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Malédiction"); put(Language.EN, "Curse"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Mort"); put(Language.EN, "Death "); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Nature"); put(Language.EN, "Natural "); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Parole"); put(Language.EN, "Verbal"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Plante Grimpante"); put(Language.EN, "Vine"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Surveillance"); put(Language.EN, "Overlooking "); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de la Toile"); put(Language.EN, "Spider Web"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Massacre"); put(Language.EN, "Slaughterer"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Menace"); put(Language.EN, "Sinister"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Nagranok"); put(Language.EN, "Illusionary"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 6, 35, Quality.GREEN,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 36, 60, Quality.GREEN,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 61, 75, Quality.GREEN,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 76, 90, Quality.GREEN,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Parade"); put(Language.EN, "Blocking"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 1),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Précision"); put(Language.EN, "Accuracy"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Rigidité"); put(Language.EN, "Rigid"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Rigueur"); put(Language.EN, "Stiff"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Soif Sanguine"); put(Language.EN, "Bloodthirsty"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -4),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -6),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -7),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -8),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -9),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tempérance"); put(Language.EN, "Saving"); }}, 86, 100, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Torture"); put(Language.EN, "Torture"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Transformation"); put(Language.EN, "Transforming"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Tristesse"); put(Language.EN, "Sadness"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 100),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 125),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 175),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 200),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 250),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 275),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 275),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 300),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 300),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 325),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 325),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 375),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 375),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 425),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 425),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 450),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 450),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vigueur"); put(Language.EN, "Health"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 475),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitalité"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 1, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 75, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 45, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 49, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 53, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Vitesse"); put(Language.EN, "Vitality"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 57, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 56, 60, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 61, 65, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 29, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 75, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 66, 70, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 71, 75, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 76, 80, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 90, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 22, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 81, 85, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 45, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 24, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 86, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 49, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 100, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 26, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 91, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 53, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 28, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "de Volonté"); put(Language.EN, "Will"); }}, 96, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 57, true),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "des Mortels"); put(Language.EN, "Deadly "); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Bonheur Pur"); put(Language.EN, "Blessed"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReducP_old, false, 1),
					new Effect(TypeEffect.ReducM_old, false, 1),
				}),

			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 26, 36, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Casse-Tête"); put(Language.EN, "Headsmasher"); }}, 56, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Choc"); put(Language.EN, "Shocking"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fantôme"); put(Language.EN, "Illusionary"); }}, 6, 90, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Feu"); put(Language.EN, "Enflamed"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fléau"); put(Language.EN, "Pestilence"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.NoHeal, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Fracas Osseux"); put(Language.EN, "Bonecrushing"); }}, 6, 90, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Malheur"); put(Language.EN, "Unfortunate"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Poisse, false, 60, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12),
						new Effect(TypeEffect.PM, true, -12),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14),
						new Effect(TypeEffect.PM, true, -14),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16),
						new Effect(TypeEffect.PM, true, -16),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18),
						new Effect(TypeEffect.PM, true, -18),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Piège"); put(Language.EN, "Tricky"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20),
						new Effect(TypeEffect.PM, true, -20),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Réflexe"); put(Language.EN, "Swift"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sacré"); put(Language.EN, "Luminous"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 3),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sadisme"); put(Language.EN, "Sadistic"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sarcasme"); put(Language.EN, "Taunting"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Silence"); put(Language.EN, "Silence"); }}, 6, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -10, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -12, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -14, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -16, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -18, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Spectre"); put(Language.EN, "Ghost"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20, Target.OPPONENT),
						new Effect(TypeEffect.PM, true, -20, Target.OPPONENT),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Sprint"); put(Language.EN, "Sprint"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 6, 15, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 16, 25, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 26, 35, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 36, 45, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 46, 55, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "du Tatouage"); put(Language.EN, "Tattoo"); }}, 56, 100, Quality.GREEN,
				new EquipType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP_old, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "Porte-Bonheur"); put(Language.EN, "Lucky"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 5),
				}),
			new Enchantment(new HashMap<Language, String>() {{ put(Language.FR, "sans Tache"); put(Language.EN, "Spotless"); }}, 6, 95, Quality.GREEN,
				new EquipType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 4),
				}),
		};
	}
}
