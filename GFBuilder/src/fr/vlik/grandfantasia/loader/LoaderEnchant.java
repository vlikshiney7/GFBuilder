package fr.vlik.grandfantasia.loader;

import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equipable.Armor.ArmorType;
import fr.vlik.grandfantasia.equipable.Cape.CapeType;
import fr.vlik.grandfantasia.equipable.Ring.RingType;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderEnchant {
	
	static Map<Quality, Enchantment[]> getEnchant() {
		return new HashMap<Quality, Enchantment[]>() {{
			put(Quality.RED, getRed());
			put(Quality.PURPLE, getPurple());
			put(Quality.GOLD, getGold());
			put(Quality.ORANGE, getOrange());
			put(Quality.BLUE, getBlue());
			put(Quality.GREEN, getGreen());
		}};
	}
	
	private static Enchantment[] getRed() {
		return new Enchantment[] {
			
		};
	}
	
	private static Enchantment[] getPurple() {
		return new Enchantment[] {
			new Enchantment("d'Absorption énergétique", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 11, 17, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 20, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 21, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 31, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 39, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 43, true),
				}),
			new Enchantment("d'Esquive", 66, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment("d'Esquive", 76, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment("d'Esquive", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment("d'Esquive", 91, 95, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment("d'Esquive", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
				}),
			new Enchantment("d'Esquive", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 6),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 35, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 39, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 43, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 31, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 43, true),
				}),
			new Enchantment("de Parade", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment("de Parade", 71, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment("de Parade", 86, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment("de Précision", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment("de Précision", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment("de Précision", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment("de Précision", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment("de Précision", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment("de Précision", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 17),
				}),
			new Enchantment("de Tempérance", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment("de Tempérance", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment("de Tempérance", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -13),
				}),
			new Enchantment("de Tempérance", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -14),
				}),
			new Enchantment("de Tempérance", 86, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.MARTEAU2M, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -15),
				}),
			new Enchantment("de Vitalité", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitalité", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitalité", 76, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitalité", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitalité", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitalité", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 31, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 43, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 31, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 35, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.PURPLE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 39, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.PURPLE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.PURPLE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 43, true),
				}),
		};
	}
	
	private static Enchantment[] getGold() {
		return new Enchantment[] {
				new Enchantment("d'Absorption énergétique", 36, 45, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 46, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 11, 17, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 20, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Adversité", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 10),
						new Effect(TypeEffect.ReflectM, false, 10),
					}),
				new Enchantment("d'Agilité", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment("d'Agilité", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment("d'Agilité", 36, 55, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment("d'Agilité", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment("d'Agilité", 56, 65, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment("d'Agilité", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment("d'Agilité", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 23, true),
					}),
				new Enchantment("d'Agilité", 61, 65, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment("d'Agilité", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment("d'Agilité", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 27, true),
					}),
				new Enchantment("d'Agilité", 66, 75, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment("d'Agilité", 66, 75, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 13, true),
					}),
				new Enchantment("d'Agilité", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment("d'Agilité", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 29, true),
					}),
				new Enchantment("d'Agilité", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 31, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 16, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 33, true),
					}),
				new Enchantment("d'Agilité", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment("d'Agilité", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 35, true),
					}),
				new Enchantment("d'Agilité", 86, 90, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 16, true),
					}),
				new Enchantment("d'Agilité", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment("d'Agilité", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 37, true),
					}),
				new Enchantment("d'Agilité", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 39, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 18, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 20, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 41, true),
					}),
				new Enchantment("d'Esquive", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 2),
					}),
				new Enchantment("d'Esquive", 56, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 3),
					}),
				new Enchantment("d'Esquive", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 4),
					}),
				new Enchantment("d'Esquive", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
					}),
				new Enchantment("d'Explosion énergétique", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					}),
				new Enchantment("d'Intelligence", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment("d'Intelligence", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment("d'Intelligence", 36, 55, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment("d'Intelligence", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment("d'Intelligence", 56, 65, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment("d'Intelligence", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment("d'Intelligence", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 23, true),
					}),
				new Enchantment("d'Intelligence", 61, 65, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment("d'Intelligence", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment("d'Intelligence", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 27, true),
					}),
				new Enchantment("d'Intelligence", 66, 75, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment("d'Intelligence", 66, 75, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 13, true),
					}),
				new Enchantment("d'Intelligence", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment("d'Intelligence", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 29, true),
					}),
				new Enchantment("d'Intelligence", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 31, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 16, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 33, true),
					}),
				new Enchantment("d'Intelligence", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment("d'Intelligence", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 35, true),
					}),
				new Enchantment("d'Intelligence", 86, 90, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 16, true),
					}),
				new Enchantment("d'Intelligence", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment("d'Intelligence", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 37, true),
					}),
				new Enchantment("d'Intelligence", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 39, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 18, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 20, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 41, true),
					}),
				new Enchantment("de Coordination", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, WeaponType.LAME, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 3),
						new Effect(TypeEffect.RTCCM, false, 3),
					}),
				new Enchantment("de Force", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment("de Force", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment("de Force", 36, 55, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment("de Force", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment("de Force", 56, 65, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment("de Force", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment("de Force", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 23, true),
					}),
				new Enchantment("de Force", 61, 65, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment("de Force", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment("de Force", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 27, true),
					}),
				new Enchantment("de Force", 66, 75, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment("de Force", 66, 75, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 13, true),
					}),
				new Enchantment("de Force", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment("de Force", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 29, true),
					}),
				new Enchantment("de Force", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 31, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 16, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 33, true),
					}),
				new Enchantment("de Force", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment("de Force", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 35, true),
					}),
				new Enchantment("de Force", 86, 90, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 16, true),
					}),
				new Enchantment("de Force", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment("de Force", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 37, true),
					}),
				new Enchantment("de Force", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment("de Force", 91, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 39, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 18, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 20, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 41, true),
					}),
				new Enchantment("de l'Amplification", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 8),
					}),
				new Enchantment("de l'Ombre", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 3),
					}),
				new Enchantment("de la Détermination", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 10),
						new Effect(TypeEffect.RDCCM, false, 10),
					}),
				new Enchantment("de la Foudre", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 3),
					}),
				new Enchantment("de la Glace", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 3),
					}),
				new Enchantment("de la Mort", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 8),
					}),
				new Enchantment("de la Nature", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 3),
					}),
				new Enchantment("de la Parole", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					}),
				new Enchantment("de la Surveillance", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					}),
				new Enchantment("de Parade", 36, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 6),
					}),
				new Enchantment("de Parade", 61, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 7),
					}),
				new Enchantment("de Parade", 76, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 8),
					}),
				new Enchantment("de Parade", 91, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 9),
					}),
				new Enchantment("de Précision", 36, 45, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment("de Précision", 36, 45, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment("de Précision", 46, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment("de Précision", 46, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment("de Précision", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment("de Précision", 60, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment("de Précision", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment("de Précision", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment("de Précision", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment("de Précision", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment("de Précision", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment("de Précision", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment("de Précision", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment("de Précision", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment("de Précision", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment("de Précision", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment("de Précision", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment("de Précision", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment("de Précision", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment("de Précision", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 15),
					}),
				new Enchantment("de Précision", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment("de Précision", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 16),
					}),
				new Enchantment("de Soif Sanguine", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 3),
					}),
				new Enchantment("de Tempérance", 36, 45, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -6),
					}),
				new Enchantment("de Tempérance", 46, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -7),
					}),
				new Enchantment("de Tempérance", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -8),
					}),
				new Enchantment("de Tempérance", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -9),
					}),
				new Enchantment("de Tempérance", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -10),
					}),
				new Enchantment("de Tempérance", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment("de Tempérance", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment("de Tempérance", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -13),
					}),
				new Enchantment("de Tempérance", 86, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -14),
					}),
				new Enchantment("de Vitalité", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitalité", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitalité", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment("de Vitalité", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment("de Vitalité", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment("de Vitalité", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment("de Vitalité", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment("de Vitalité", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20, true),
					}),
				new Enchantment("de Vitesse", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment("de Vitesse", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitesse", 36, 55, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitesse", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment("de Vitesse", 56, 65, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment("de Vitesse", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitesse", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 23, true),
					}),
				new Enchantment("de Vitesse", 61, 65, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment("de Vitesse", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment("de Vitesse", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 27, true),
					}),
				new Enchantment("de Vitesse", 66, 75, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment("de Vitesse", 66, 75, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment("de Vitesse", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment("de Vitesse", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 29, true),
					}),
				new Enchantment("de Vitesse", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 31, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 33, true),
					}),
				new Enchantment("de Vitesse", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment("de Vitesse", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 35, true),
					}),
				new Enchantment("de Vitesse", 86, 90, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 16, true),
					}),
				new Enchantment("de Vitesse", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment("de Vitesse", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 37, true),
					}),
				new Enchantment("de Vitesse", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 39, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 18, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 20, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 41, true),
					}),
				new Enchantment("de Volonté", 36, 55, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment("de Volonté", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment("de Volonté", 36, 55, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment("de Volonté", 36, 55, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment("de Volonté", 56, 65, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment("de Volonté", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment("de Volonté", 56, 60, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 23, true),
					}),
				new Enchantment("de Volonté", 61, 65, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment("de Volonté", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment("de Volonté", 61, 65, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 27, true),
					}),
				new Enchantment("de Volonté", 66, 75, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment("de Volonté", 66, 75, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 13, true),
					}),
				new Enchantment("de Volonté", 66, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment("de Volonté", 66, 70, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 29, true),
					}),
				new Enchantment("de Volonté", 71, 75, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 31, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 16, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 33, true),
					}),
				new Enchantment("de Volonté", 81, 90, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 17, true),
					}),
				new Enchantment("de Volonté", 81, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 35, true),
					}),
				new Enchantment("de Volonté", 86, 90, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 16, true),
					}),
				new Enchantment("de Volonté", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment("de Volonté", 86, 90, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 37, true),
					}),
				new Enchantment("de Volonté", 91, 100, Quality.GOLD,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment("de Volonté", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment("de Volonté", 91, 95, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 39, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.GOLD,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 18, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 20, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 41, true),
					}),
				new Enchantment("des Mortels", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					}),
				new Enchantment("du Bonheur Pur", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 1),
						new Effect(TypeEffect.ReducM, false, 1),
					}),
				new Enchantment("du Feu", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 3),
					}),
				new Enchantment("du Réflexe", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					}),
				new Enchantment("du Sacré", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
					}),
				new Enchantment("du Sarcasme", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2),
					}),
				new Enchantment("du Sprint", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					}),
				new Enchantment("sans Tache", 6, 100, Quality.GOLD,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					}),
		};
	}
	
	private static Enchantment[] getOrange() {
		return new Enchantment[] {
				new Enchantment("d'Absorption énergétique", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Absorption énergétique", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
					new Calculable[] {
						new Proc(100, Activation.Standard, new Calculable[] {
							new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
						}),
					}),
				new Enchantment("d'Adversité", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 10),
						new Effect(TypeEffect.ReflectM, false, 10),
					}),
				new Enchantment("d'Agilité", 16, 25, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 1, true),
					}),
				new Enchantment("d'Agilité", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment("d'Agilité", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment("d'Agilité", 26, 45, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment("d'Agilité", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment("d'Agilité", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment("d'Agilité", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment("d'Agilité", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment("d'Agilité", 46, 55, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 2, true),
					}),
				new Enchantment("d'Agilité", 46, 60, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment("d'Agilité", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment("d'Agilité", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment("d'Agilité", 56, 70, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 3, true),
					}),
				new Enchantment("d'Agilité", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment("d'Agilité", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment("d'Agilité", 61, 70, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment("d'Agilité", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment("d'Agilité", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 15, true),
					}),
				new Enchantment("d'Agilité", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 8, true),
					}),
				new Enchantment("d'Agilité", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 17, true),
					}),
				new Enchantment("d'Agilité", 71, 85, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 4, true),
					}),
				new Enchantment("d'Agilité", 71, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment("d'Agilité", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment("d'Agilité", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 19, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 21, true),
					}),
				new Enchantment("d'Agilité", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 22, true),
					}),
				new Enchantment("d'Agilité", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 6, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 9, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment("d'Agilité", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 24, true),
					}),
				new Enchantment("d'Agilité", 86, 100, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 5, true),
					}),
				new Enchantment("d'Agilité", 86, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 10, true),
					}),
				new Enchantment("d'Agilité", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment("d'Agilité", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 26, true),
					}),
				new Enchantment("d'Agilité", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 7, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 11, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 13, true),
					}),
				new Enchantment("d'Agilité", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 28, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 12, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 14, true),
					}),
				new Enchantment("d'Agilité", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.AGI, false, 30, true),
					}),
				new Enchantment("d'Esquive", 16, 55, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 2),
					}),
				new Enchantment("d'Esquive", 56, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 3),
					}),
				new Enchantment("d'Esquive", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 4),
					}),
				new Enchantment("d'Esquive", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 5),
					}),
				new Enchantment("d'Explosion énergétique", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCM, false, 2),
					}),
				new Enchantment("d'Intelligence", 16, 25, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 1, true),
					}),
				new Enchantment("d'Intelligence", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment("d'Intelligence", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment("d'Intelligence", 26, 45, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment("d'Intelligence", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment("d'Intelligence", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment("d'Intelligence", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment("d'Intelligence", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment("d'Intelligence", 46, 55, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 2, true),
					}),
				new Enchantment("d'Intelligence", 46, 60, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment("d'Intelligence", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment("d'Intelligence", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment("d'Intelligence", 56, 70, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 3, true),
					}),
				new Enchantment("d'Intelligence", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment("d'Intelligence", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment("d'Intelligence", 61, 70, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment("d'Intelligence", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment("d'Intelligence", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 15, true),
					}),
				new Enchantment("d'Intelligence", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 8, true),
					}),
				new Enchantment("d'Intelligence", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 17, true),
					}),
				new Enchantment("d'Intelligence", 71, 85, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 4, true),
					}),
				new Enchantment("d'Intelligence", 71, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment("d'Intelligence", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment("d'Intelligence", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 19, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 21, true),
					}),
				new Enchantment("d'Intelligence", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 22, true),
					}),
				new Enchantment("d'Intelligence", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 6, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 9, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment("d'Intelligence", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 24, true),
					}),
				new Enchantment("d'Intelligence", 86, 100, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 5, true),
					}),
				new Enchantment("d'Intelligence", 86, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 10, true),
					}),
				new Enchantment("d'Intelligence", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment("d'Intelligence", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 26, true),
					}),
				new Enchantment("d'Intelligence", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 7, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 11, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 13, true),
					}),
				new Enchantment("d'Intelligence", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 28, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 12, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 14, true),
					}),
				new Enchantment("d'Intelligence", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.INT, false, 30, true),
					}),
				new Enchantment("de Coordination", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 3),
						new Effect(TypeEffect.RTCCM, false, 3),
					}),
				new Enchantment("de Force", 16, 25, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 1, true),
					}),
				new Enchantment("de Force", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment("de Force", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment("de Force", 26, 45, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment("de Force", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment("de Force", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment("de Force", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment("de Force", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment("de Force", 46, 55, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 2, true),
					}),
				new Enchantment("de Force", 46, 60, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment("de Force", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment("de Force", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment("de Force", 56, 70, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 3, true),
					}),
				new Enchantment("de Force", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment("de Force", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment("de Force", 61, 70, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment("de Force", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment("de Force", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 15, true),
					}),
				new Enchantment("de Force", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 8, true),
					}),
				new Enchantment("de Force", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 17, true),
					}),
				new Enchantment("de Force", 71, 85, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 4, true),
					}),
				new Enchantment("de Force", 71, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment("de Force", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment("de Force", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 19, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 21, true),
					}),
				new Enchantment("de Force", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 22, true),
					}),
				new Enchantment("de Force", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 6, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 9, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment("de Force", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 24, true),
					}),
				new Enchantment("de Force", 86, 100, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 5, true),
					}),
				new Enchantment("de Force", 86, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 10, true),
					}),
				new Enchantment("de Force", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment("de Force", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 26, true),
					}),
				new Enchantment("de Force", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 7, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 11, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 13, true),
					}),
				new Enchantment("de Force", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 28, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 12, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 14, true),
					}),
				new Enchantment("de Force", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.FCE, false, 30, true),
					}),
				new Enchantment("de l'Amplification", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCM, false, 8),
					}),
				new Enchantment("de l'Ombre", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Ombre, false, 3),
					}),
				new Enchantment("de la Détermination", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.RDCCP, false, 10),
						new Effect(TypeEffect.RDCCM, false, 10),
					}),
				new Enchantment("de la Foudre", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Foudre, false, 3),
					}),
				new Enchantment("de la Glace", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Glace, false, 3),
					}),
				new Enchantment("de la Mort", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.DCCP, false, 8),
					}),
				new Enchantment("de la Nature", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Nature, false, 3),
					}),
				new Enchantment("de la Parole", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 3),
					}),
				new Enchantment("de la Surveillance", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					}),
				new Enchantment("de Parade", 16, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 5),
					}),
				new Enchantment("de Parade", 36, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 6),
					}),
				new Enchantment("de Parade", 61, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 7),
					}),
				new Enchantment("de Parade", 76, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 8),
					}),
				new Enchantment("de Parade", 91, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.Parade, false, 9),
					}),
				new Enchantment("de Précision", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 2),
					}),
				new Enchantment("de Précision", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment("de Précision", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 3),
					}),
				new Enchantment("de Précision", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment("de Précision", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 4),
					}),
				new Enchantment("de Précision", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment("de Précision", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 5),
					}),
				new Enchantment("de Précision", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment("de Précision", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 6),
					}),
				new Enchantment("de Précision", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment("de Précision", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 7),
					}),
				new Enchantment("de Précision", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment("de Précision", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				new Enchantment("de Précision", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment("de Précision", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 9),
					}),
				new Enchantment("de Précision", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment("de Précision", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 10),
					}),
				new Enchantment("de Précision", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment("de Précision", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 11),
					}),
				new Enchantment("de Précision", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment("de Précision", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 12),
					}),
				new Enchantment("de Précision", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment("de Précision", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 13),
					}),
				new Enchantment("de Précision", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 15),
					}),
				new Enchantment("de Précision", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 14),
					}),
				new Enchantment("de Précision", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 16),
					}),
				new Enchantment("de Soif Sanguine", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.RegenCB, false, 3),
					}),
				new Enchantment("de Tempérance", 16, 25, Quality.ORANGE,
					new EnchantType[] { CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -4),
					}),
				new Enchantment("de Tempérance", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -5),
					}),
				new Enchantment("de Tempérance", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -6),
					}),
				new Enchantment("de Tempérance", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -7),
					}),
				new Enchantment("de Tempérance", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -8),
					}),
				new Enchantment("de Tempérance", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -9),
					}),
				new Enchantment("de Tempérance", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -10),
					}),
				new Enchantment("de Tempérance", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment("de Tempérance", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment("de Tempérance", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -11),
					}),
				new Enchantment("de Tempérance", 86, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.CostComp, false, -12),
					}),
				new Enchantment("de Vitalité", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment("de Vitalité", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment("de Vitalité", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment("de Vitalité", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment("de Vitalité", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment("de Vitalité", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment("de Vitalité", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment("de Vitalité", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitalité", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment("de Vitalité", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitalité", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment("de Vitalité", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment("de Vitalité", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.CLE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment("de Vitesse", 16, 25, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 1, true),
					}),
				new Enchantment("de Vitesse", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment("de Vitesse", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment("de Vitesse", 26, 45, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment("de Vitesse", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment("de Vitesse", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment("de Vitesse", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment("de Vitesse", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment("de Vitesse", 46, 55, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 2, true),
					}),
				new Enchantment("de Vitesse", 46, 60, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment("de Vitesse", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment("de Vitesse", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment("de Vitesse", 56, 70, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 3, true),
					}),
				new Enchantment("de Vitesse", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment("de Vitesse", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment("de Vitesse", 61, 70, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment("de Vitesse", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment("de Vitesse", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 15, true),
					}),
				new Enchantment("de Vitesse", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 8, true),
					}),
				new Enchantment("de Vitesse", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 17, true),
					}),
				new Enchantment("de Vitesse", 71, 85, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 4, true),
					}),
				new Enchantment("de Vitesse", 71, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment("de Vitesse", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitesse", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 19, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 21, true),
					}),
				new Enchantment("de Vitesse", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 22, true),
					}),
				new Enchantment("de Vitesse", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 6, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 9, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitesse", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 24, true),
					}),
				new Enchantment("de Vitesse", 86, 100, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 5, true),
					}),
				new Enchantment("de Vitesse", 86, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 10, true),
					}),
				new Enchantment("de Vitesse", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment("de Vitesse", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 26, true),
					}),
				new Enchantment("de Vitesse", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 7, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 11, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 13, true),
					}),
				new Enchantment("de Vitesse", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 28, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 12, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 14, true),
					}),
				new Enchantment("de Vitesse", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VIT, false, 30, true),
					}),
				new Enchantment("de Volonté", 16, 25, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 1, true),
					}),
				new Enchantment("de Volonté", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment("de Volonté", 16, 25, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment("de Volonté", 26, 45, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment("de Volonté", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment("de Volonté", 26, 35, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment("de Volonté", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment("de Volonté", 36, 45, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment("de Volonté", 46, 55, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 2, true),
					}),
				new Enchantment("de Volonté", 46, 60, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment("de Volonté", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment("de Volonté", 46, 55, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment("de Volonté", 56, 70, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 3, true),
					}),
				new Enchantment("de Volonté", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment("de Volonté", 56, 60, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment("de Volonté", 61, 70, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment("de Volonté", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment("de Volonté", 61, 65, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 15, true),
					}),
				new Enchantment("de Volonté", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 8, true),
					}),
				new Enchantment("de Volonté", 66, 70, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 17, true),
					}),
				new Enchantment("de Volonté", 71, 85, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 4, true),
					}),
				new Enchantment("de Volonté", 71, 80, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment("de Volonté", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment("de Volonté", 71, 75, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 19, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 21, true),
					}),
				new Enchantment("de Volonté", 76, 80, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 22, true),
					}),
				new Enchantment("de Volonté", 81, 90, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 6, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 9, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment("de Volonté", 81, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 24, true),
					}),
				new Enchantment("de Volonté", 86, 100, Quality.ORANGE,
					new EnchantType[] { RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 5, true),
					}),
				new Enchantment("de Volonté", 86, 85, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 10, true),
					}),
				new Enchantment("de Volonté", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment("de Volonté", 86, 90, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 26, true),
					}),
				new Enchantment("de Volonté", 91, 100, Quality.ORANGE,
					new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 7, true),
					}),
				new Enchantment("de Volonté", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 11, true),
					}),
				new Enchantment("de Volonté", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 13, true),
					}),
				new Enchantment("de Volonté", 91, 95, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 28, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 12, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 14, true),
					}),
				new Enchantment("de Volonté", 96, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
					new Calculable[] {
						new Effect(TypeEffect.VOL, false, 30, true),
					}),
				new Enchantment("des Mortels", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.TCCP, false, 2),
					}),
				new Enchantment("du Bonheur Pur", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.ReducP, false, 1),
						new Effect(TypeEffect.ReducM, false, 1),
					}),
				new Enchantment("du Feu", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Feu, false, 3),
					}),
				new Enchantment("du Réflexe", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtkD, false, 5),
					}),
				new Enchantment("du Sacré", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 3),
					}),
				new Enchantment("du Sarcasme", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
					new Calculable[] {
						new Effect(TypeEffect.MEN, false, 2),
					}),
				new Enchantment("du Sprint", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
					new Calculable[] {
						new Effect(TypeEffect.Depla, false, 2),
					}),
				new Enchantment("sans Tache", 6, 100, Quality.ORANGE,
					new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
					new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					}),
		};
	}
	
	private static Enchantment[] getBlue() {
		return new Enchantment[] {
			new Enchantment("d'Absorption énergétique", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1, 7, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Adversité", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			new Enchantment("d'Agilité", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 1, true),
				}),
			new Enchantment("d'Agilité", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment("d'Agilité", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 23, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 27, true),
				}),
			new Enchantment("d'Agilité", 66, 75, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 29, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 31, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 15, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment("d'Agilité", 81, 90, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 35, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment("d'Agilité", 91, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 39, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 19, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment("d'Arrache-Coeur", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 26, 36, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 56, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 56, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Énergie", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 200),
				}),
			new Enchantment("d'Énergie", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 250),
				}),
			new Enchantment("d'Énergie", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment("d'Énergie", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 400),
				}),
			new Enchantment("d'Énergie", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 500),
				}),
			new Enchantment("d'Énergie", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 550),
				}),
			new Enchantment("d'Énergie", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 550),
				}),
			new Enchantment("d'Énergie", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 600),
				}),
			new Enchantment("d'Énergie", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 600),
				}),
			new Enchantment("d'Énergie", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 650),
				}),
			new Enchantment("d'Énergie", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 650),
				}),
			new Enchantment("d'Énergie", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 700),
				}),
			new Enchantment("d'Énergie", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 700),
				}),
			new Enchantment("d'Énergie", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 750),
				}),
			new Enchantment("d'Énergie", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 750),
				}),
			new Enchantment("d'Énergie", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 800),
				}),
			new Enchantment("d'Énergie", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 800),
				}),
			new Enchantment("d'Énergie", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 850),
				}),
			new Enchantment("d'Énergie", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 850),
				}),
			new Enchantment("d'Énergie", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 900),
				}),
			new Enchantment("d'Énergie", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 900),
				}),
			new Enchantment("d'Énergie", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 950),
				}),
			new Enchantment("d'Esquive", 16, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 2),
				}),
			new Enchantment("d'Esquive", 56, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment("d'Esquive", 81, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment("d'Esquive", 91, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment("d'Explosion énergétique", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
				}),
			new Enchantment("d'Intelligence", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 1, true),
				}),
			new Enchantment("d'Intelligence", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment("d'Intelligence", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 23, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 27, true),
				}),
			new Enchantment("d'Intelligence", 66, 75, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 29, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 31, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 15, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment("d'Intelligence", 81, 90, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 35, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment("d'Intelligence", 91, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 39, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 19, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment("d'Investigation", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Brise-os", 91, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de Brisecrâne", 91, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 56, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Conquête", 91, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Coordination", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 3),
					new Effect(TypeEffect.RTCCM, false, 3),
				}),
			new Enchantment("de Décharge", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Force", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 1, true),
				}),
			new Enchantment("de Force", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment("de Force", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 23, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 27, true),
				}),
			new Enchantment("de Force", 66, 75, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 29, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 31, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 15, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment("de Force", 81, 90, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 35, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 39, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 19, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment("de l'Amplification", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 8),
				}),
			new Enchantment("de l'Ancienneté", 6, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 3),
				}),
			new Enchantment("de l'Hypnose", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Sleep),
					}),
				}),
			new Enchantment("de l'Ombre", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 3),
				}),
			new Enchantment("de la Chance", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de la Contagion", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 56, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Détermination", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				}),
			new Enchantment("de la Foudre", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 3),
				}),
			new Enchantment("de la Glace", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 3),
				}),
			new Enchantment("de la Malédiction", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de la Mort", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Enchantment("de la Nature", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 3),
				}),
			new Enchantment("de la Parole", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			new Enchantment("de la Plante Grimpante", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove),
					}),
				}),
			new Enchantment("de la Surveillance", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -2),
				}),
			new Enchantment("de la Toile", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove),
					}),
				}),
			new Enchantment("de Massacre", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 56, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 56, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Nagranok", 91, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Parade", 6, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
				}),
			new Enchantment("de Parade", 36, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
				}),
			new Enchantment("de Parade", 61, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment("de Parade", 76, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment("de Parade", 91, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment("de Précision", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 1),
				}),
			new Enchantment("de Précision", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment("de Précision", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
				}),
			new Enchantment("de Précision", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment("de Précision", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment("de Précision", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment("de Précision", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment("de Précision", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment("de Précision", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment("de Précision", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment("de Précision", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment("de Précision", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment("de Précision", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment("de Précision", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment("de Précision", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment("de Précision", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment("de Précision", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment("de Précision", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment("de Précision", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment("de Précision", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment("de Rigidité", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Rigueur", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Soif Sanguine", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 3),
				}),
			new Enchantment("de Tempérance", 6, 15, Quality.BLUE,
				new EnchantType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -3),
				}),
			new Enchantment("de Tempérance", 16, 25, Quality.BLUE,
				new EnchantType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -4),
				}),
			new Enchantment("de Tempérance", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -5),
				}),
			new Enchantment("de Tempérance", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -6),
				}),
			new Enchantment("de Tempérance", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -7),
				}),
			new Enchantment("de Tempérance", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -8),
				}),
			new Enchantment("de Tempérance", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -9),
				}),
			new Enchantment("de Tempérance", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				}),
			new Enchantment("de Tempérance", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment("de Tempérance", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment("de Tempérance", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment("de Tempérance", 86, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment("de Torture", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Transformation", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Tristesse", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 60),
					}),
				}),
			new Enchantment("de Vigueur", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 200),
				}),
			new Enchantment("de Vigueur", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 250),
				}),
			new Enchantment("de Vigueur", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment("de Vigueur", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment("de Vigueur", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 500),
				}),
			new Enchantment("de Vigueur", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 550),
				}),
			new Enchantment("de Vigueur", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 550),
				}),
			new Enchantment("de Vigueur", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 600),
				}),
			new Enchantment("de Vigueur", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 600),
				}),
			new Enchantment("de Vigueur", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 650),
				}),
			new Enchantment("de Vigueur", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 650),
				}),
			new Enchantment("de Vigueur", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 700),
				}),
			new Enchantment("de Vigueur", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 700),
				}),
			new Enchantment("de Vigueur", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 750),
				}),
			new Enchantment("de Vigueur", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 750),
				}),
			new Enchantment("de Vigueur", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 800),
				}),
			new Enchantment("de Vigueur", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 800),
				}),
			new Enchantment("de Vigueur", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 850),
				}),
			new Enchantment("de Vigueur", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 850),
				}),
			new Enchantment("de Vigueur", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 900),
				}),
			new Enchantment("de Vigueur", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 900),
				}),
			new Enchantment("de Vigueur", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 950),
				}),
			new Enchantment("de Vitalité", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment("de Vitalité", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment("de Vitalité", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitalité", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitalité", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitalité", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitalité", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitalité", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitalité", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitalité", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment("de Vitalité", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitalité", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitalité", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitesse", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 1, true),
				}),
			new Enchantment("de Vitesse", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment("de Vitesse", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 23, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 27, true),
				}),
			new Enchantment("de Vitesse", 66, 75, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 29, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 31, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 15, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment("de Vitesse", 81, 90, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 35, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment("de Vitesse", 91, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 39, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 19, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment("de Volonté", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 1, true),
				}),
			new Enchantment("de Volonté", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment("de Volonté", 6, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 23, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 27, true),
				}),
			new Enchantment("de Volonté", 66, 75, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 29, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 31, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 15, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment("de Volonté", 81, 90, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 35, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment("de Volonté", 91, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 39, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 19, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment("des Mortels", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new Enchantment("du Bonheur Pur", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 1),
					new Effect(TypeEffect.ReducM, false, 1),
				}),

			new Enchantment("du Casse-Tête", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 26, 36, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 56, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Choc", 6, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("du Fantôme", 6, 90, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("du Feu", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 3),
				}),
			new Enchantment("du Fléau", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 56, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fracas Osseux", 6, 90, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("du Malheur", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 60),
					}),
				}),
			new Enchantment("du Piège", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Piège", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12),
						new Effect(TypeEffect.PM, true, -12),
					}),
				}),
			new Enchantment("du Piège", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14),
						new Effect(TypeEffect.PM, true, -14),
					}),
				}),
			new Enchantment("du Piège", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16),
						new Effect(TypeEffect.PM, true, -16),
					}),
				}),
			new Enchantment("du Piège", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18),
						new Effect(TypeEffect.PM, true, -18),
					}),
				}),
			new Enchantment("du Piège", 56, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20),
						new Effect(TypeEffect.PM, true, -20),
					}),
				}),
			new Enchantment("du Réflexe", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 5),
				}),
			new Enchantment("du Sacré", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 3),
				}),
			new Enchantment("du Sadisme", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 56, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sarcasme", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 2),
				}),
			new Enchantment("du Silence", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("du Spectre", 6, 15, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 16, 25, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 26, 35, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 36, 45, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 46, 55, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 56, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Sprint", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
			new Enchantment("du Tatouage", 6, 15, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 16, 25, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 26, 35, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 36, 45, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 46, 55, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 56, 100, Quality.BLUE,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("Porte-Bonheur", 6, 100, Quality.BLUE,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 5),
				}),
			new Enchantment("sans Tache", 6, 100, Quality.BLUE,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 4),
				}),
		};
	}
	
	private static Enchantment[] getGreen() {
		return new Enchantment[] {
			new Enchantment("d'Absorption énergétique", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 1, 7, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 2, 8, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 3, 9, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 4, 10, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 5, 11, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 6, 12, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 7, 13, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 8, 14, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 9, 15, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 10, 16, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 18, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Absorption énergétique", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(100, Activation.Standard, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 12, 19, TypeRegen.REGENERATION),
					}),
				}),
			new Enchantment("d'Adversité", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReflectP, false, 10),
					new Effect(TypeEffect.ReflectM, false, 10),
				}),
			new Enchantment("d'Agilité", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 1, true),
				}),
			new Enchantment("d'Agilité", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment("d'Agilité", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment("d'Agilité", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 2, true),
				}),
			new Enchantment("d'Agilité", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment("d'Agilité", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 3, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment("d'Agilité", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 4, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 17, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 5, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 21, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment("d'Agilité", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 25, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 6, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 29, true),
				}),
			new Enchantment("d'Agilité", 66, 75, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 7, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 16, true),
				}),
			new Enchantment("d'Agilité", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 33, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 18, true),
				}),
			new Enchantment("d'Agilité", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 37, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 8, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 20, true),
				}),
			new Enchantment("d'Agilité", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 41, true),
				}),
			new Enchantment("d'Agilité", 81, 90, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 9, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 22, true),
				}),
			new Enchantment("d'Agilité", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 45, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 12, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 24, true),
				}),
			new Enchantment("d'Agilité", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 49, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 10, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 13, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 26, true),
				}),
			new Enchantment("d'Agilité", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 53, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 11, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 14, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 28, true),
				}),
			new Enchantment("d'Agilité", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.AGI, false, 57, true),
				}),
			new Enchantment("d'Arrache-Coeur", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 26, 36, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Arrache-Coeur", 56, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Empoisonnement", 56, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("d'Énergie", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 100),
				}),
			new Enchantment("d'Énergie", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 125),
				}),
			new Enchantment("d'Énergie", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 175),
				}),
			new Enchantment("d'Énergie", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 200),
				}),
			new Enchantment("d'Énergie", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 250),
				}),
			new Enchantment("d'Énergie", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 275),
				}),
			new Enchantment("d'Énergie", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 275),
				}),
			new Enchantment("d'Énergie", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 300),
				}),
			new Enchantment("d'Énergie", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 300),
				}),
			new Enchantment("d'Énergie", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 325),
				}),
			new Enchantment("d'Énergie", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 325),
				}),
			new Enchantment("d'Énergie", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment("d'Énergie", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 350),
				}),
			new Enchantment("d'Énergie", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 375),
				}),
			new Enchantment("d'Énergie", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 400),
				}),
			new Enchantment("d'Énergie", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 425),
				}),
			new Enchantment("d'Énergie", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 450),
				}),
			new Enchantment("d'Énergie", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PM, false, 478),
				}),
			new Enchantment("d'Esquive", 16, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 2),
				}),
			new Enchantment("d'Esquive", 56, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 3),
				}),
			new Enchantment("d'Esquive", 81, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 4),
				}),
			new Enchantment("d'Esquive", 91, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.ESQ, false, 5),
				}),
			new Enchantment("d'Explosion énergétique", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCM, false, 2),
				}),
			new Enchantment("d'Intelligence", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 1, true),
				}),
			new Enchantment("d'Intelligence", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment("d'Intelligence", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment("d'Intelligence", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 2, true),
				}),
			new Enchantment("d'Intelligence", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment("d'Intelligence", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 3, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment("d'Intelligence", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 4, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 17, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 5, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 21, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment("d'Intelligence", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 25, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 6, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 29, true),
				}),
			new Enchantment("d'Intelligence", 66, 75, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 7, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 16, true),
				}),
			new Enchantment("d'Intelligence", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 33, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 18, true),
				}),
			new Enchantment("d'Intelligence", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 37, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 8, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 20, true),
				}),
			new Enchantment("d'Intelligence", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 41, true),
				}),
			new Enchantment("d'Intelligence", 81, 90, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 9, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 11, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 22, true),
				}),
			new Enchantment("d'Intelligence", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 45, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 12, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 24, true),
				}),
			new Enchantment("d'Intelligence", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 49, true),
				}),
			new Enchantment("d'Intelligence", 91, 100, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 10, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 13, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 26, true),
				}),
			new Enchantment("d'Intelligence", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 53, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 14, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 28, true),
				}),
			new Enchantment("d'Intelligence", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.INT, false, 57, true),
				}),
			new Enchantment("d'Investigation", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Brise-os", 91, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de Brisecrâne", 91, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Brûlure", 56, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Conquête", 91, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Coordination", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RTCCP, false, 3),
					new Effect(TypeEffect.RTCCM, false, 3),
				}),
			new Enchantment("de Décharge", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Force", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 1, true),
				}),
			new Enchantment("de Force", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment("de Force", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment("de Force", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 2, true),
				}),
			new Enchantment("de Force", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment("de Force", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 3, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment("de Force", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 4, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 17, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 5, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 21, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment("de Force", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 25, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 6, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 29, true),
				}),
			new Enchantment("de Force", 66, 75, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 7, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 16, true),
				}),
			new Enchantment("de Force", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 33, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 18, true),
				}),
			new Enchantment("de Force", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 37, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 8, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 20, true),
				}),
			new Enchantment("de Force", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 41, true),
				}),
			new Enchantment("de Force", 81, 90, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 9, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 11, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 22, true),
				}),
			new Enchantment("de Force", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 45, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 12, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 24, true),
				}),
			new Enchantment("de Force", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 49, true),
				}),
			new Enchantment("de Force", 91, 100, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 10, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 13, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 26, true),
				}),
			new Enchantment("de Force", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 53, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 14, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 28, true),
				}),
			new Enchantment("de Force", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.FCE, false, 57, true),
				}),
			new Enchantment("de l'Amplification", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCM, false, 8),
				}),
			new Enchantment("de l'Ancienneté", 6, 95, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.XP, false, 3),
				}),
			new Enchantment("de l'Hypnose", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Sleep),
					}),
				}),
			new Enchantment("de l'Ombre", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Ombre, false, 3),
				}),
			new Enchantment("de la Chance", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de la Contagion", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Contagion", 56, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("de la Détermination", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.RDCCP, false, 10),
					new Effect(TypeEffect.RDCCM, false, 10),
				}),
			new Enchantment("de la Foudre", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Foudre, false, 3),
				}),
			new Enchantment("de la Glace", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Glace, false, 3),
				}),
			new Enchantment("de la Malédiction", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("de la Mort", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.DCCP, false, 8),
				}),
			new Enchantment("de la Nature", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Nature, false, 3),
				}),
			new Enchantment("de la Parole", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitComp, false, 3),
				}),
			new Enchantment("de la Plante Grimpante", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove),
					}),
				}),
			new Enchantment("de la Surveillance", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, -2),
				}),
			new Enchantment("de la Toile", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove),
					}),
				}),
			new Enchantment("de Massacre", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Massacre", 56, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -50, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -250, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Menace", 56, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -300, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("de Nagranok", 91, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Parade", 6, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 5),
				}),
			new Enchantment("de Parade", 36, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 6),
				}),
			new Enchantment("de Parade", 61, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 7),
				}),
			new Enchantment("de Parade", 76, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 8),
				}),
			new Enchantment("de Parade", 91, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.Parade, false, 9),
				}),
			new Enchantment("de Précision", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 1),
				}),
			new Enchantment("de Précision", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment("de Précision", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 2),
				}),
			new Enchantment("de Précision", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment("de Précision", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 3),
				}),
			new Enchantment("de Précision", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment("de Précision", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 4),
				}),
			new Enchantment("de Précision", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment("de Précision", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 5),
				}),
			new Enchantment("de Précision", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment("de Précision", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 6),
				}),
			new Enchantment("de Précision", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment("de Précision", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 7),
				}),
			new Enchantment("de Précision", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment("de Précision", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 8),
				}),
			new Enchantment("de Précision", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment("de Précision", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 9),
				}),
			new Enchantment("de Précision", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 10),
				}),
			new Enchantment("de Précision", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 11),
				}),
			new Enchantment("de Précision", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 12),
				}),
			new Enchantment("de Précision", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 13),
				}),
			new Enchantment("de Précision", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 15),
				}),
			new Enchantment("de Précision", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 14),
				}),
			new Enchantment("de Précision", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.Toucher, false, 16),
				}),
			new Enchantment("de Rigidité", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Rigueur", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Soif Sanguine", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.RegenCB, false, 3),
				}),
			new Enchantment("de Tempérance", 6, 15, Quality.GREEN,
				new EnchantType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -3),
				}),
			new Enchantment("de Tempérance", 16, 25, Quality.GREEN,
				new EnchantType[] { CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -4),
				}),
			new Enchantment("de Tempérance", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -5),
				}),
			new Enchantment("de Tempérance", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -6),
				}),
			new Enchantment("de Tempérance", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -7),
				}),
			new Enchantment("de Tempérance", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -8),
				}),
			new Enchantment("de Tempérance", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -9),
				}),
			new Enchantment("de Tempérance", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -10),
				}),
			new Enchantment("de Tempérance", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment("de Tempérance", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment("de Tempérance", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -11),
				}),
			new Enchantment("de Tempérance", 86, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.CostComp, false, -12),
				}),
			new Enchantment("de Torture", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, -100, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Transformation", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("de Tristesse", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 60),
					}),
				}),
			new Enchantment("de Vigueur", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 100),
				}),
			new Enchantment("de Vigueur", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 125),
				}),
			new Enchantment("de Vigueur", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 175),
				}),
			new Enchantment("de Vigueur", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 200),
				}),
			new Enchantment("de Vigueur", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 250),
				}),
			new Enchantment("de Vigueur", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 275),
				}),
			new Enchantment("de Vigueur", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 275),
				}),
			new Enchantment("de Vigueur", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 300),
				}),
			new Enchantment("de Vigueur", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 300),
				}),
			new Enchantment("de Vigueur", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 325),
				}),
			new Enchantment("de Vigueur", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 325),
				}),
			new Enchantment("de Vigueur", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment("de Vigueur", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 350),
				}),
			new Enchantment("de Vigueur", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 375),
				}),
			new Enchantment("de Vigueur", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 375),
				}),
			new Enchantment("de Vigueur", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment("de Vigueur", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 400),
				}),
			new Enchantment("de Vigueur", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 425),
				}),
			new Enchantment("de Vigueur", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 425),
				}),
			new Enchantment("de Vigueur", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 450),
				}),
			new Enchantment("de Vigueur", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 450),
				}),
			new Enchantment("de Vigueur", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.PV, false, 475),
				}),
			new Enchantment("de Vitalité", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment("de Vitalité", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment("de Vitalité", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitalité", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitalité", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitalité", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitalité", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitalité", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitalité", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitalité", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitalité", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22, true),
				}),
			new Enchantment("de Vitalité", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 24, true),
				}),
			new Enchantment("de Vitalité", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 26, true),
				}),
			new Enchantment("de Vitalité", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.CLE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28, true),
				}),
			new Enchantment("de Vitesse", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 1, true),
				}),
			new Enchantment("de Vitesse", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment("de Vitesse", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment("de Vitesse", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 2, true),
				}),
			new Enchantment("de Vitesse", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment("de Vitesse", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 3, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitesse", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 4, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 17, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 5, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 21, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitesse", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 25, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 6, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 29, true),
				}),
			new Enchantment("de Vitesse", 66, 75, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 7, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 16, true),
				}),
			new Enchantment("de Vitesse", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 33, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 18, true),
				}),
			new Enchantment("de Vitesse", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 37, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 8, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 20, true),
				}),
			new Enchantment("de Vitesse", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 41, true),
				}),
			new Enchantment("de Vitesse", 81, 90, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 9, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 11, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 22, true),
				}),
			new Enchantment("de Vitesse", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 45, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 12, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 24, true),
				}),
			new Enchantment("de Vitesse", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 49, true),
				}),
			new Enchantment("de Vitesse", 91, 100, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 10, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 13, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 26, true),
				}),
			new Enchantment("de Vitesse", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 53, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 14, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 28, true),
				}),
			new Enchantment("de Vitesse", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VIT, false, 57, true),
				}),
			new Enchantment("de Volonté", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment("de Volonté", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment("de Volonté", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 2, true),
				}),
			new Enchantment("de Volonté", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment("de Volonté", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 3, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment("de Volonté", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 4, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 17, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 5, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 21, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment("de Volonté", 56, 60, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 25, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 6, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 61, 65, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 29, true),
				}),
			new Enchantment("de Volonté", 66, 75, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 7, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 16, true),
				}),
			new Enchantment("de Volonté", 66, 70, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 33, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 18, true),
				}),
			new Enchantment("de Volonté", 71, 75, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 37, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 8, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 20, true),
				}),
			new Enchantment("de Volonté", 76, 80, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 41, true),
				}),
			new Enchantment("de Volonté", 81, 90, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 9, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 11, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 22, true),
				}),
			new Enchantment("de Volonté", 81, 85, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 45, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 12, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 24, true),
				}),
			new Enchantment("de Volonté", 86, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 49, true),
				}),
			new Enchantment("de Volonté", 91, 100, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 10, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 13, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 26, true),
				}),
			new Enchantment("de Volonté", 91, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 53, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.GANT, ArmorType.BOTTE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 14, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.RELIQUE, WeaponType.CLE, WeaponType.BOUCLIER, ArmorType.PLASTRON, ArmorType.JAMBIERE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 28, true),
				}),
			new Enchantment("de Volonté", 96, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA2M, WeaponType.BATON, WeaponType.LAME, },
				new Calculable[] {
					new Effect(TypeEffect.VOL, false, 57, true),
				}),
			new Enchantment("des Mortels", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.TCCP, false, 2),
				}),
			new Enchantment("du Bonheur Pur", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.BATON, WeaponType.LAME, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.ReducP, false, 1),
					new Effect(TypeEffect.ReducM, false, 1),
				}),

			new Enchantment("du Casse-Tête", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -20, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 26, 36, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -100, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Casse-Tête", 56, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
						new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Choc", 6, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("du Fantôme", 6, 90, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new Enchantment("du Feu", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Feu, false, 3),
				}),
			new Enchantment("du Fléau", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -20, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -40, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -60, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -80, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -100, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fléau", 56, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new RegenEffect(TypeEffect.PV, false, -120, TypeRegen.POISON, 1),
						new StaticEffect(TypeStaticEffect.AntiHeal),
					}),
				}),
			new Enchantment("du Fracas Osseux", 6, 90, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("du Malheur", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.Poisse, 60),
					}),
				}),
			new Enchantment("du Piège", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Piège", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -12),
						new Effect(TypeEffect.PM, true, -12),
					}),
				}),
			new Enchantment("du Piège", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -14),
						new Effect(TypeEffect.PM, true, -14),
					}),
				}),
			new Enchantment("du Piège", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -16),
						new Effect(TypeEffect.PM, true, -16),
					}),
				}),
			new Enchantment("du Piège", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -18),
						new Effect(TypeEffect.PM, true, -18),
					}),
				}),
			new Enchantment("du Piège", 56, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.PV, true, -20),
						new Effect(TypeEffect.PM, true, -20),
					}),
				}),
			new Enchantment("du Réflexe", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.CLE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtkD, false, 5),
				}),
			new Enchantment("du Sacré", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, WeaponType.BOUCLIER, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Sacre, false, 3),
				}),
			new Enchantment("du Sadisme", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -40, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -80, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -160, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -200, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sadisme", 56, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, -240, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Sarcasme", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.MECA1M, WeaponType.BOUCLIER, },
				new Calculable[] {
					new Effect(TypeEffect.MEN, false, 2),
				}),
			new Enchantment("du Silence", 6, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoSkill),
					}),
				}),
			new Enchantment("du Spectre", 6, 15, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 16, 25, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 26, 35, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 36, 45, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 46, 55, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Spectre", 56, 100, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, WeaponType.ARC, WeaponType.GUN, WeaponType.CANON, WeaponType.BATON, WeaponType.LAME, WeaponType.CLE, },
				new Calculable[] {
					new Proc(3, Activation.Attack, 5, new Calculable[] {
						new Effect(TypeEffect.PV, true, -10),
						new Effect(TypeEffect.PM, true, -10),
					}),
				}),
			new Enchantment("du Sprint", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.RELIQUE, ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Effect(TypeEffect.Depla, false, 2),
				}),
			new Enchantment("du Tatouage", 6, 15, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -20, -30, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 16, 25, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -50, -60, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 26, 35, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -80, -90, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 36, 45, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -110, -120, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 46, 55, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -140, -150, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("du Tatouage", 56, 100, Quality.GREEN,
				new EnchantType[] { ArmorType.CASQUE, ArmorType.PLASTRON, ArmorType.JAMBIERE, ArmorType.GANT, ArmorType.BOTTE, CapeType.CAPE, },
				new Calculable[] {
					new Proc(5, Activation.Attacked, 4, new Calculable[] {
						new Effect(TypeEffect.ReducP, false, -25, Target.OPPONENT),
						new RegenEffect(TypeEffect.PV, false, -170, -180, TypeRegen.POISON, 1),
					}),
				}),
			new Enchantment("Porte-Bonheur", 6, 95, Quality.GREEN,
				new EnchantType[] { RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.Loot, false, 5),
				}),
			new Enchantment("sans Tache", 6, 95, Quality.GREEN,
				new EnchantType[] { WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M, WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M, WeaponType.MECA1M, WeaponType.MECA2M, RingType.RING, },
				new Calculable[] {
					new Effect(TypeEffect.VitAtk, false, 4),
				}),
		};
	}
}
