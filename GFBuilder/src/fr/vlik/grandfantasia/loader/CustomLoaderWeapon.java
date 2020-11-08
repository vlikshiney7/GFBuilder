package fr.vlik.grandfantasia.loader;

import java.util.HashMap;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.custom.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class CustomLoaderWeapon {
	
	static CustomWeapon[] getEp1M() {
		return new CustomWeapon[] {
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Couteau de l'Éventreur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabreloup Double Croc"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				100, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1779, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte Victorieuse"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Lunaire"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				95, WeaponType.EPEE1M, "epee1M/58pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1662, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Griffe de Dragon"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				90, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1548, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Katanas du Givre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				86, WeaponType.EPEE1M, "epee1M/79pre", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1458, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Canine du Dragon Pourpre"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				85, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1392, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Lame Torturée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				81, WeaponType.EPEE1M, "epee1M/86bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1348, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Sanglante de Jade"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				80, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1326, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Double Pointe"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				76, WeaponType.EPEE1M, "epee1M/81bleu", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1240, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Rapière de Duel"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				75, WeaponType.EPEE1M, "epee1M/icon7", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1219, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Sanguin"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				71, WeaponType.EPEE1M, "epee1M/95blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1135, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Sabre Ouvragé"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				70, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1114, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Machette Ciselée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				66, WeaponType.EPEE1M, "epee1M/80gvg", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1033, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de la Flamme Violette"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				65, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 1012, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Dague du Guide Magique"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				61, WeaponType.EPEE1M, "epee1M/48ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 933, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Conquérant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 913, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Tête de Fantôme"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				60, WeaponType.EPEE1M, "epee1M/38ora0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 920, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Meneur"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 760, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée des Ailes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 766, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Sceau Héroïque"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				52, WeaponType.EPEE1M, "epee1M/24sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 761, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Noble"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 616, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Guerrier de la Tribu"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/44sprite", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 624, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Grand Comte"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				44, WeaponType.EPEE1M, "epee1M/icon2", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 618, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Runes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 481, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Légère à Motifs"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon4", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 485, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Manuscrit Ancestral"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				36, WeaponType.EPEE1M, "epee1M/icon0", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 480, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Lourde à Axe Tranchant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 356, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Hachoir des Montagnes"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/30blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 360, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée à Lame Aiguisée"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				28, WeaponType.EPEE1M, "epee1M/icon5", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 357, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Éminente Épée du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				24, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 298, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Commandant"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 244, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de l'Elégance"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/48vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 246, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Combat au Front"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				20, WeaponType.EPEE1M, "epee1M/18ora1", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 245, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée du Chevalier"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				16, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 193, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Longue épée du Gardien"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				12, WeaponType.EPEE1M, "epee1M/24blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 147, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Glaive"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, },
				6, WeaponType.EPEE1M, "epee1M/6vert", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 88, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée de Fer"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				4, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 72, true),
				}),
			new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, "Épée Courte de Défense"); put(Language.EN, ""); }},
				new GradeName[] { GradeName.BERSERKER, GradeName.PALADIN, GradeName.RANGER, GradeName.ASSASSIN, GradeName.CLERC, GradeName.SAGE, GradeName.SORCIER, GradeName.NECROMANCIEN, GradeName.METALLEUX, GradeName.DEMOLISSEUR, GradeName.SPATIODERIVEUR, GradeName.CHRONODERIVEUR, },
				3, WeaponType.EPEE1M, "epee1M/10blanc", new Calculable[] {
					new Effect(TypeEffect.Atk, false, 65, true),
				}),
		};
	}
	
	static CustomWeapon[] getMa1M() {
		return new CustomWeapon[] {
			 
		};
	}
	
	static CustomWeapon[] getHa1M() {
		return new CustomWeapon[] {
			 
		};
	}
	
	static CustomWeapon[] getEp2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getMa2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getHa2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getMeca1M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getMeca2M() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getArc() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getGun() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getCanon() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getRel() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getBaton() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getLame() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getCle() {
		return new CustomWeapon[] {
			
		};
	}
	
	static CustomWeapon[] getBouclier() {
		return new CustomWeapon[] {
			
		};
	}
}
