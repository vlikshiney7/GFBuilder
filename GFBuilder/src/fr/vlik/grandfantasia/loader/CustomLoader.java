package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.custom.CustomArmor;
import fr.vlik.grandfantasia.custom.CustomCape;
import fr.vlik.grandfantasia.custom.CustomRing;
import fr.vlik.grandfantasia.custom.CustomWeapon;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class CustomLoader {
	
	public static CustomWeapon[][] getCustomWeapon() {
		return new CustomWeapon[][] {
			CustomLoaderWeapon.getEp1M(),
			CustomLoaderWeapon.getMa1M(),
			CustomLoaderWeapon.getHa1M(),
			CustomLoaderWeapon.getEp2M(),
			CustomLoaderWeapon.getMa2M(),
			CustomLoaderWeapon.getHa2M(),
			CustomLoaderWeapon.getMeca1M(),
			CustomLoaderWeapon.getMeca2M(),
			CustomLoaderWeapon.getArc(),
			CustomLoaderWeapon.getGun(),
			CustomLoaderWeapon.getCanon(),
			CustomLoaderWeapon.getRel(),
			CustomLoaderWeapon.getBaton(),
			CustomLoaderWeapon.getLame(),
			CustomLoaderWeapon.getCle(),
			CustomLoaderWeapon.getBouclier(),
		};
	}
	
	public static CustomArmor[][] getCustomArmor() {
		return new CustomArmor[][] {
			CustomLoaderHelmet.getHelmet(),
			CustomLoaderBreastplate.getBreastplate(),
			CustomLoaderLegging.getLegging(),
			CustomLoaderGauntlet.getGauntlet(),
			CustomLoaderBoot.getBoot()
		};
	}
	
	public static CustomCape[] getCustomCape() {
		return CustomLoaderCape.getCape();
	}
	
	public static CustomRing[] getCustomRing() {
		return CustomLoaderRing.getRing();
	}
	
	public static Enchantment[] getWeaponEnchantment() {
		return new Enchantment[] {
			new Enchantment("du Sprint", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
			}),
			new Enchantment("du Bonheur Pur", new Calculable[] {
				new Effect(TypeEffect.ReducP, false, 1),
				new Effect(TypeEffect.ReducM, false, 1),
			}),
			new Enchantment("Sans Tâche", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
			}),
			new Enchantment("de Réflexe", new Calculable[] {
				new Effect(TypeEffect.VitAtkD, false, 5),
			}),
			new Enchantment("du Sarcasme", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 2),
			}),
			new Enchantment("de la Surveillance", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -2),
			}),
			new Enchantment("de Parole", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Enchantment("de Soif Sanguine", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 3),
			}),
			new Enchantment("de Coordination", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
				new Effect(TypeEffect.RTCCM, false, 3),
			}),
			new Enchantment("de la Détermination", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 10),
				new Effect(TypeEffect.RDCCM, false, 10),
			}),
			new Enchantment("des Mortels", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
			}),
			new Enchantment("d'Explosion Énergétique", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 2),
			}),
			new Enchantment("de la Mort", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 8),
			}),
			new Enchantment("de l'Amplification", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 8),
			}),
			new Enchantment("d'Adversité", new Calculable[] {
				new Effect(TypeEffect.ReflectP, false, 10),
				new Effect(TypeEffect.ReflectM, false, 10),
			}),
			new Enchantment("du Sacré", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 3),
			}),
			new Enchantment("de l'Ombre", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 3),
			}),
			new Enchantment("de la Foudre", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 3),
			}),
			new Enchantment("du Feu", new Calculable[] {
				new Effect(TypeEffect.Feu, false, 3),
			}),
			new Enchantment("de la Glace", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 3),
			}),
			new Enchantment("de la Nature", new Calculable[] {
				new Effect(TypeEffect.Nature, false, 3),
			}),
			new Enchantment("du Spectre", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Gel),
				}),
			}),
			new Enchantment("de la Malédiction", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoPhys),
				}),
			}),
			new Enchantment("du Silence", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.NoMag),
				}),
			}),
			new Enchantment("de Massacre", new Calculable[] {
				new Proc(3, Activation.Attack, 4, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Massacre),
				}),
			}),
			new Enchantment("de Menace", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Menace),
				}),
			}),
			new Enchantment("de Conquête", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new Effect(TypeEffect.AtkM, true, -30, Target.OPPONENT),
					new Effect(TypeEffect.DefM, true, -30, Target.OPPONENT),
					new StaticEffect(TypeStaticEffect.Conquete),
				}),
			}),
			new Enchantment("de l'Hypnose", new Calculable[] {
				new Proc(3, Activation.Attack, 5, new Calculable[] {
					new StaticEffect(TypeStaticEffect.Sleep),
				}),
			}),
		};
	}
	
	public static Enchantment[] getArmorEnchantment() {
		return new Enchantment[] {
			
		};
	}
	
	public static Enchantment[] getCapeEnchantment() {
		return new Enchantment[] {
			
		};
	}
	
	public static Enchantment[] getRingEnchantment() {
		return new Enchantment[] {
			
		};
	}
}
