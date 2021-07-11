package fr.vlik.grandfantasia.loader.charac;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.SpriteCost;
import fr.vlik.grandfantasia.charac.SpriteCost.SpriteCostType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;

@SuppressWarnings("serial")
public class LoaderSpriteCost {
	
	static SpriteCost[] getSpriteCost() {
		SpriteCost[] green = getGreen();
		SpriteCost[] white = getWhite();
		
		SpriteCost[] result = new SpriteCost[1 + green.length + white.length];
		
		int i = 1;
		result[0] = new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, SpriteCostType.HEAD, "null", null);
			
		for(int j = 0; j < green.length; i++, j++) {
			result[i] = green[j];
		}
		
		for(int j = 0; j < white.length; i++, j++) {
			result[i] = white[j];
		}
		
		return result;
	}
	
	private static SpriteCost[] getGreen() {
		return new SpriteCost[] {
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Armure d'Acier de Destruction de Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20032", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque d'Acier de Destruction du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10031", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -9, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Destructeur du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20006", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 11, WeaponType.BOUCLIER),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Destructeur du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10037", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 13),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Canonnier de Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20033", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, 8),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Canonnier de Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10005", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, -9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement du Royaume du Sniper de Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20009", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 11),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau du Royaume du Sniper de Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10020", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -11),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Sprite de Déesse de l'Aube"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20036", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillP, false, 11),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Diadème de Sprite de la Déesse de l'Aube"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10033", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -11, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -11, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Sprite d'Esprit Sacré"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20029", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 11),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Couronne de Sprite d'Esprit Sacré"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10004", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 16),
						new Effect(TypeEffect.Ombre, false, 16),
						new Effect(TypeEffect.Foudre, false, 16),
						new Effect(TypeEffect.Feu, false, 16),
						new Effect(TypeEffect.Glace, false, 16),
						new Effect(TypeEffect.Nature, false, 16),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Sprite de Voyageur dans le Temps"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20014", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 8),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe de Sprite Voyageur dans le Temps"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10044", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -31, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement Fantomatique du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20038", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 36),
						new Effect(TypeEffect.ReflectM, false, 36),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe Fantomatique du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10035", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -31, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Marquis du Sprite Sombre"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20006", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque du Marquis de Sprite Sombre"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10014", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Duc Impérial du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20039", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 12, WeaponType.BOUCLIER),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Duc Impérial du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10045", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 14),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement d'Aile du Paradis du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20038", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau d'Aile du Paradis du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10006", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, -10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Samouraï de l'Ombre du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20032", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Samouraï de l'Ombre du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10040", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Fondation de l'Ordre du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20038", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillP, false, 12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Couronne de Fondation de l'Ordre du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10041", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.TCCP, false, -11, Target.OPPONENT),
						new Effect(TypeEffect.TCCM, false, -11, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Sprite de l'Arpenteur des Nuées"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20037", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 11),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Sprite de l'Arpenteur des Nuées"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10001", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 17),
						new Effect(TypeEffect.Ombre, false, 17),
						new Effect(TypeEffect.Foudre, false, 17),
						new Effect(TypeEffect.Feu, false, 17),
						new Effect(TypeEffect.Glace, false, 17),
						new Effect(TypeEffect.Nature, false, 17),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement de Galaxie Infinie du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20038", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe de Galaxie Infinie du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10043", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefM, true, -32, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Vêtement d'Âme Damnée du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "A20042", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 37),
						new Effect(TypeEffect.ReflectM, false, 37),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Masque d'Âme Damnée du Sprite"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "A10027", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -32, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Catch Noir"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "F10078", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 15),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de Catch Blanc"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.HEAD, "F10079", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, -30, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Tenue de Catch Noire"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "F20076", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Tenue de Catch Blanche"); put(Language.EN, ""); }},
				Quality.GREEN, SpriteCostType.BODY, "F20077", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 35),
						new Effect(TypeEffect.ReflectM, false, 35),
					}),
				}),
		};
	}
	
	private static SpriteCost[] getWhite() {
		return new SpriteCost[] {
			
		};
	}
}
