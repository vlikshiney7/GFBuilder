package fr.vlik.grandfantasia.loader.charac;

import java.util.HashMap;

import fr.vlik.grandfantasia.charac.SpriteCost;
import fr.vlik.grandfantasia.charac.SpriteCost.SpriteCostType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.StaticEffect;

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
						new Effect(TypeEffect.ReducStdP, false, 11),
						new Effect(TypeEffect.ReducStdD, false, 11),
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
						new Effect(TypeEffect.ReducStdP, false, 12),
						new Effect(TypeEffect.ReducStdD, false, 12),
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
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Sprite maternel"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10145", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DegSkillP, false, 5),
						new Effect(TypeEffect.DegSkillM, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Sprite maternel"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20135", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Shiba empaillé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10141", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Shiba empaillé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20131", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ESQ, false, 12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Chat Rose Malicieux pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10143", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, -10, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Tenue de soubrette rose"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20133", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Sprite éveillé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20090", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Sprite éveillé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10098", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe piranha pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10133", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe piranha adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10133", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe piranha fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10133", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe piranha de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10133", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCP, false, 10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement Piranha pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20123", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement Piranha adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20123", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement Piranha fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20123", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement Piranha luxueux pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20123", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe grenouille pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10121", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe grenouille adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10121", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe grenouille fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10121", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe grenouille de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10121", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement grenouille pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20111", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 2),
						new Effect(TypeEffect.ReflectM, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement grenouille adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20111", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 4),
						new Effect(TypeEffect.ReflectM, false, 4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement grenouille fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20111", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 8),
						new Effect(TypeEffect.ReflectM, false, 8),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement grenouille de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20111", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 16),
						new Effect(TypeEffect.ReflectM, false, 16),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe poisson-globe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10128", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCM, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe poisson-globe adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10128", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCM, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe poisson-globe fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10128", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCM, false, 4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe poisson-globe de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10128", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.RTCCM, false, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement poisson-globe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20118", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement poisson-globe adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20118", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement poisson-globe fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20118", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement de poisson-globe de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20118", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe crevette pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10134", null),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe crevette adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10134", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 1),
						new Effect(TypeEffect.DegStdD, false, 1),
						new Effect(TypeEffect.DegSkillP, false, 1),
						new Effect(TypeEffect.DegSkillM, false, 1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe crevette fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10134", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 2),
						new Effect(TypeEffect.DegStdD, false, 2),
						new Effect(TypeEffect.DegSkillP, false, 2),
						new Effect(TypeEffect.DegSkillM, false, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Coiffe crevette de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10134", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DegStdP, false, 3),
						new Effect(TypeEffect.DegStdD, false, 3),
						new Effect(TypeEffect.DegSkillP, false, 3),
						new Effect(TypeEffect.DegSkillM, false, 3),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement crevette pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20124", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -1),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement crevette adorable pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20124", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement crevette fashion pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20124", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -4),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Équipement crevette de luxe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20124", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Bonnet Glace à la menthe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10140", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Sacre, false, 16),
						new Effect(TypeEffect.Ombre, false, 16),
						new Effect(TypeEffect.Foudre, false, 16),
						new Effect(TypeEffect.Feu, false, 16),
						new Effect(TypeEffect.Glace, false, 16),
						new Effect(TypeEffect.Nature, false, 16),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Set Glace à la menthe pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20130", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 12),
						new Effect(TypeEffect.ReducStdD, false, 12),
						new Effect(TypeEffect.ReducSkillP, false, 12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau d'Œuf Cassé pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10085", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume d'Œuf Cassé pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20079", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Choppeur pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10087", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Blouson en cuir pour Sprite"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20081", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 9),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Toque de Chef Cuistot Gourmand"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10137", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.DefP, true, 2),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Chef Cuistot Gourmand"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20127", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 10, WeaponType.BOUCLIER),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Masque à lèvres rouges"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10004", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau d'Holmes"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10016", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 8),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau Champignon"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10022", new Calculable[] {
					new Proc(15, Activation.Attack, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -60, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -60, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau de Magicien"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10029", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitComp, false, 10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Masque de Bal Costumé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10003", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducSkillM, false, 10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Masque d'Oreille à Oreille"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10005", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, 12),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Barbe de Brigand"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10009", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Atk, true, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Afro Arc-en-Ciel"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10012", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReflectP, false, 35),
						new Effect(TypeEffect.ReflectM, false, 35),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casquette du Duc"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10017", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.MEN, false, -10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Casque de sécurité de mineur"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10021", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 10),
						new Effect(TypeEffect.ReducStdD, false, 10),
						new Effect(TypeEffect.ReducSkillP, false, 10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Chapeau pastèque"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.HEAD, "F10024", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkM, true, 7),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume en bandage"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20001", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.ReducStdP, false, 5),
						new Effect(TypeEffect.ReducStdD, false, 5),
						new Effect(TypeEffect.ReducSkillP, false, 5),
						new Effect(TypeEffect.ReducSkillM, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Collants Noirs"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20003", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume de Clown Bariolé"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20004", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.VitAtk, false, 10),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Habits moulants blancs de Greece"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20012", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Parade, false, 5),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Pantalon de Gallus"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20005", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Toucher, false, 15),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Bavoir du Jardin d'Enfant"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20010", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new StaticEffect(TypeStaticEffect.NoMove),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Uniforme de Détenu"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20011", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, 8),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Maillot de bain deux pièces"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20013", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.Depla, false, -50, Target.OPPONENT),
						new Effect(TypeEffect.VitAtk, false, -40, Target.OPPONENT),
					}),
				}),
			new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, "Costume Col en V"); put(Language.EN, ""); }},
				Quality.WHITE, SpriteCostType.BODY, "F20017", new Calculable[] {
					new Proc(Activation.Sprite, 12, new Calculable[] {
						new Effect(TypeEffect.AtkD, true, 7),
					}),
				}),
		};
	}
}
