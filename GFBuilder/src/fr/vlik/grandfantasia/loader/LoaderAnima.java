package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Anima;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Condition.TypeCondition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.Target;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;

public class LoaderAnima {
	
	static Anima[] getAnima() {
		Anima[] purple = getPurple();
		Anima[] orange = getOrange();
		
		Anima[] result = new Anima[1 + purple.length + orange.length];
		
		int i = 1;
		result[0] = new Anima("Aucun", Quality.GREY, "null", (Calculable[]) null);
			
		for(int j = 0; j < purple.length; i++, j++) {
			result[i] = purple[j];
		}

		for(int j = 0; j < orange.length; i++, j++) {
			result[i] = orange[j];
		}
		
		return result;
	}
	
	private static Anima[] getPurple() {
		return new Anima[] {
			new Anima("Anima sylvestre transperçant", Quality.PURPLE, "vio0", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.1),
			        new Effect(TypeEffect.PeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.1),
			        new Effect(TypeEffect.PeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.1),
			        new Effect(TypeEffect.PeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.1),
			        new Effect(TypeEffect.PeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.2),
			        new Effect(TypeEffect.PeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.2),
			        new Effect(TypeEffect.PeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.2),
			        new Effect(TypeEffect.PeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.2),
			        new Effect(TypeEffect.PeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.3),
			        new Effect(TypeEffect.PeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.3),
			        new Effect(TypeEffect.PeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.3),
			        new Effect(TypeEffect.PeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.3),
			        new Effect(TypeEffect.PeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.4),
			        new Effect(TypeEffect.PeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.4),
			        new Effect(TypeEffect.PeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.4),
			        new Effect(TypeEffect.PeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.4),
			        new Effect(TypeEffect.PeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.5),
			        new Effect(TypeEffect.PeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.5),
			        new Effect(TypeEffect.PeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.5),
			        new Effect(TypeEffect.PeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.5),
			        new Effect(TypeEffect.PeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.6),
			        new Effect(TypeEffect.PeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.7),
			        new Effect(TypeEffect.PeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.8),
			        new Effect(TypeEffect.PeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 0.9),
			        new Effect(TypeEffect.PeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1),
			        new Effect(TypeEffect.PeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.1),
			        new Effect(TypeEffect.PeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.2),
			        new Effect(TypeEffect.PeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.3),
			        new Effect(TypeEffect.PeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.4),
			        new Effect(TypeEffect.PeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.5),
			        new Effect(TypeEffect.PeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.6),
			        new Effect(TypeEffect.PeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.7),
			        new Effect(TypeEffect.PeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.7),
			        new Effect(TypeEffect.PeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.7),
			        new Effect(TypeEffect.PeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 1.7),
			        new Effect(TypeEffect.PeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 2.1),
			        new Effect(TypeEffect.PeneM, false, 2.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 2.5),
			        new Effect(TypeEffect.PeneM, false, 2.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 2.9),
			        new Effect(TypeEffect.PeneM, false, 2.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 3.3),
			        new Effect(TypeEffect.PeneM, false, 3.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 3.7),
			        new Effect(TypeEffect.PeneM, false, 3.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 4.1),
			        new Effect(TypeEffect.PeneM, false, 4.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 4.5),
			        new Effect(TypeEffect.PeneM, false, 4.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 4.9),
			        new Effect(TypeEffect.PeneM, false, 4.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 5.3),
			        new Effect(TypeEffect.PeneM, false, 5.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PeneP, false, 5.7),
			        new Effect(TypeEffect.PeneM, false, 5.7),
			    },
			})),
			new Anima("Anima sylvestre gardien", Quality.PURPLE, "vio1", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.1),
			        new Effect(TypeEffect.ReducPeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.1),
			        new Effect(TypeEffect.ReducPeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.1),
			        new Effect(TypeEffect.ReducPeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.1),
			        new Effect(TypeEffect.ReducPeneM, false, 0.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.2),
			        new Effect(TypeEffect.ReducPeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.2),
			        new Effect(TypeEffect.ReducPeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.2),
			        new Effect(TypeEffect.ReducPeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.2),
			        new Effect(TypeEffect.ReducPeneM, false, 0.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.3),
			        new Effect(TypeEffect.ReducPeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.3),
			        new Effect(TypeEffect.ReducPeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.3),
			        new Effect(TypeEffect.ReducPeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.3),
			        new Effect(TypeEffect.ReducPeneM, false, 0.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.4),
			        new Effect(TypeEffect.ReducPeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.4),
			        new Effect(TypeEffect.ReducPeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.4),
			        new Effect(TypeEffect.ReducPeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.4),
			        new Effect(TypeEffect.ReducPeneM, false, 0.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.5),
			        new Effect(TypeEffect.ReducPeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.5),
			        new Effect(TypeEffect.ReducPeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.5),
			        new Effect(TypeEffect.ReducPeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.5),
			        new Effect(TypeEffect.ReducPeneM, false, 0.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.6),
			        new Effect(TypeEffect.ReducPeneM, false, 0.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.7),
			        new Effect(TypeEffect.ReducPeneM, false, 0.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.8),
			        new Effect(TypeEffect.ReducPeneM, false, 0.8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 0.9),
			        new Effect(TypeEffect.ReducPeneM, false, 0.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1),
			        new Effect(TypeEffect.ReducPeneM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.1),
			        new Effect(TypeEffect.ReducPeneM, false, 1.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.2),
			        new Effect(TypeEffect.ReducPeneM, false, 1.2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.3),
			        new Effect(TypeEffect.ReducPeneM, false, 1.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.4),
			        new Effect(TypeEffect.ReducPeneM, false, 1.4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.5),
			        new Effect(TypeEffect.ReducPeneM, false, 1.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.6),
			        new Effect(TypeEffect.ReducPeneM, false, 1.6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.7),
			        new Effect(TypeEffect.ReducPeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.7),
			        new Effect(TypeEffect.ReducPeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.7),
			        new Effect(TypeEffect.ReducPeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 1.7),
			        new Effect(TypeEffect.ReducPeneM, false, 1.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 2.1),
			        new Effect(TypeEffect.ReducPeneM, false, 2.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 2.5),
			        new Effect(TypeEffect.ReducPeneM, false, 2.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 2.9),
			        new Effect(TypeEffect.ReducPeneM, false, 2.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 3.3),
			        new Effect(TypeEffect.ReducPeneM, false, 3.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 3.7),
			        new Effect(TypeEffect.ReducPeneM, false, 3.7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 4.1),
			        new Effect(TypeEffect.ReducPeneM, false, 4.1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 4.5),
			        new Effect(TypeEffect.ReducPeneM, false, 4.5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 4.9),
			        new Effect(TypeEffect.ReducPeneM, false, 4.9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 5.3),
			        new Effect(TypeEffect.ReducPeneM, false, 5.3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.ReducPeneP, false, 5.7),
			        new Effect(TypeEffect.ReducPeneM, false, 5.7),
			    },
			})),
			new Anima("Anima sylvestre d'attaque", Quality.PURPLE, "vio2", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 6, true),
			        new Effect(TypeEffect.AtkD, false, 6, true),
			        new Effect(TypeEffect.AtkM, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 13, true),
			        new Effect(TypeEffect.AtkD, false, 13, true),
			        new Effect(TypeEffect.AtkM, false, 10, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 19, true),
			        new Effect(TypeEffect.AtkD, false, 19, true),
			        new Effect(TypeEffect.AtkM, false, 15, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 25, true),
			        new Effect(TypeEffect.AtkD, false, 25, true),
			        new Effect(TypeEffect.AtkM, false, 20, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 31, true),
			        new Effect(TypeEffect.AtkD, false, 31, true),
			        new Effect(TypeEffect.AtkM, false, 25, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 38, true),
			        new Effect(TypeEffect.AtkD, false, 38, true),
			        new Effect(TypeEffect.AtkM, false, 30, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 44, true),
			        new Effect(TypeEffect.AtkD, false, 44, true),
			        new Effect(TypeEffect.AtkM, false, 35, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 50, true),
			        new Effect(TypeEffect.AtkD, false, 50, true),
			        new Effect(TypeEffect.AtkM, false, 40, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 56, true),
			        new Effect(TypeEffect.AtkD, false, 56, true),
			        new Effect(TypeEffect.AtkM, false, 45, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 63, true),
			        new Effect(TypeEffect.AtkD, false, 63, true),
			        new Effect(TypeEffect.AtkM, false, 50, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 69, true),
			        new Effect(TypeEffect.AtkD, false, 69, true),
			        new Effect(TypeEffect.AtkM, false, 55, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 75, true),
			        new Effect(TypeEffect.AtkD, false, 75, true),
			        new Effect(TypeEffect.AtkM, false, 60, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 81, true),
			        new Effect(TypeEffect.AtkD, false, 81, true),
			        new Effect(TypeEffect.AtkM, false, 65, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 88, true),
			        new Effect(TypeEffect.AtkD, false, 88, true),
			        new Effect(TypeEffect.AtkM, false, 70, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 94, true),
			        new Effect(TypeEffect.AtkD, false, 94, true),
			        new Effect(TypeEffect.AtkM, false, 75, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 100, true),
			        new Effect(TypeEffect.AtkD, false, 100, true),
			        new Effect(TypeEffect.AtkM, false, 80, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 106, true),
			        new Effect(TypeEffect.AtkD, false, 106, true),
			        new Effect(TypeEffect.AtkM, false, 85, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 113, true),
			        new Effect(TypeEffect.AtkD, false, 113, true),
			        new Effect(TypeEffect.AtkM, false, 90, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 119, true),
			        new Effect(TypeEffect.AtkD, false, 119, true),
			        new Effect(TypeEffect.AtkM, false, 95, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 125, true),
			        new Effect(TypeEffect.AtkD, false, 125, true),
			        new Effect(TypeEffect.AtkM, false, 100, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 131, true),
			        new Effect(TypeEffect.AtkD, false, 131, true),
			        new Effect(TypeEffect.AtkM, false, 105, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 138, true),
			        new Effect(TypeEffect.AtkD, false, 138, true),
			        new Effect(TypeEffect.AtkM, false, 110, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 144, true),
			        new Effect(TypeEffect.AtkD, false, 144, true),
			        new Effect(TypeEffect.AtkM, false, 115, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 150, true),
			        new Effect(TypeEffect.AtkD, false, 150, true),
			        new Effect(TypeEffect.AtkM, false, 120, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 156, true),
			        new Effect(TypeEffect.AtkD, false, 156, true),
			        new Effect(TypeEffect.AtkM, false, 125, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 163, true),
			        new Effect(TypeEffect.AtkD, false, 163, true),
			        new Effect(TypeEffect.AtkM, false, 130, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 169, true),
			        new Effect(TypeEffect.AtkD, false, 169, true),
			        new Effect(TypeEffect.AtkM, false, 135, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 175, true),
			        new Effect(TypeEffect.AtkD, false, 175, true),
			        new Effect(TypeEffect.AtkM, false, 140, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 181, true),
			        new Effect(TypeEffect.AtkD, false, 181, true),
			        new Effect(TypeEffect.AtkM, false, 145, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 188, true),
			        new Effect(TypeEffect.AtkD, false, 188, true),
			        new Effect(TypeEffect.AtkM, false, 150, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 194, true),
			        new Effect(TypeEffect.AtkD, false, 194, true),
			        new Effect(TypeEffect.AtkM, false, 155, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 200, true),
			        new Effect(TypeEffect.AtkD, false, 200, true),
			        new Effect(TypeEffect.AtkM, false, 160, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 206, true),
			        new Effect(TypeEffect.AtkD, false, 206, true),
			        new Effect(TypeEffect.AtkM, false, 165, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 213, true),
			        new Effect(TypeEffect.AtkD, false, 213, true),
			        new Effect(TypeEffect.AtkM, false, 170, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 219, true),
			        new Effect(TypeEffect.AtkD, false, 219, true),
			        new Effect(TypeEffect.AtkM, false, 175, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 225, true),
			        new Effect(TypeEffect.AtkD, false, 225, true),
			        new Effect(TypeEffect.AtkM, false, 180, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 231, true),
			        new Effect(TypeEffect.AtkD, false, 231, true),
			        new Effect(TypeEffect.AtkM, false, 185, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 238, true),
			        new Effect(TypeEffect.AtkD, false, 238, true),
			        new Effect(TypeEffect.AtkM, false, 190, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 244, true),
			        new Effect(TypeEffect.AtkD, false, 244, true),
			        new Effect(TypeEffect.AtkM, false, 195, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 250, true),
			        new Effect(TypeEffect.AtkD, false, 250, true),
			        new Effect(TypeEffect.AtkM, false, 200, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 256, true),
			        new Effect(TypeEffect.AtkD, false, 256, true),
			        new Effect(TypeEffect.AtkM, false, 205, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 263, true),
			        new Effect(TypeEffect.AtkD, false, 263, true),
			        new Effect(TypeEffect.AtkM, false, 210, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 269, true),
			        new Effect(TypeEffect.AtkD, false, 269, true),
			        new Effect(TypeEffect.AtkM, false, 215, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 275, true),
			        new Effect(TypeEffect.AtkD, false, 275, true),
			        new Effect(TypeEffect.AtkM, false, 220, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 281, true),
			        new Effect(TypeEffect.AtkD, false, 281, true),
			        new Effect(TypeEffect.AtkM, false, 225, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 288, true),
			        new Effect(TypeEffect.AtkD, false, 288, true),
			        new Effect(TypeEffect.AtkM, false, 230, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 294, true),
			        new Effect(TypeEffect.AtkD, false, 294, true),
			        new Effect(TypeEffect.AtkM, false, 235, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 300, true),
			        new Effect(TypeEffect.AtkD, false, 300, true),
			        new Effect(TypeEffect.AtkM, false, 240, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 306, true),
			        new Effect(TypeEffect.AtkD, false, 306, true),
			        new Effect(TypeEffect.AtkM, false, 245, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 313, true),
			        new Effect(TypeEffect.AtkD, false, 313, true),
			        new Effect(TypeEffect.AtkM, false, 250, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 319, true),
			        new Effect(TypeEffect.AtkD, false, 319, true),
			        new Effect(TypeEffect.AtkM, false, 255, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 325, true),
			        new Effect(TypeEffect.AtkD, false, 325, true),
			        new Effect(TypeEffect.AtkM, false, 260, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 331, true),
			        new Effect(TypeEffect.AtkD, false, 331, true),
			        new Effect(TypeEffect.AtkM, false, 265, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 338, true),
			        new Effect(TypeEffect.AtkD, false, 338, true),
			        new Effect(TypeEffect.AtkM, false, 270, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 344, true),
			        new Effect(TypeEffect.AtkD, false, 344, true),
			        new Effect(TypeEffect.AtkM, false, 275, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 350, true),
			        new Effect(TypeEffect.AtkD, false, 350, true),
			        new Effect(TypeEffect.AtkM, false, 280, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 356, true),
			        new Effect(TypeEffect.AtkD, false, 356, true),
			        new Effect(TypeEffect.AtkM, false, 285, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 363, true),
			        new Effect(TypeEffect.AtkD, false, 363, true),
			        new Effect(TypeEffect.AtkM, false, 290, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 369, true),
			        new Effect(TypeEffect.AtkD, false, 369, true),
			        new Effect(TypeEffect.AtkM, false, 295, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 375, true),
			        new Effect(TypeEffect.AtkD, false, 375, true),
			        new Effect(TypeEffect.AtkM, false, 300, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 381, true),
			        new Effect(TypeEffect.AtkD, false, 381, true),
			        new Effect(TypeEffect.AtkM, false, 305, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 388, true),
			        new Effect(TypeEffect.AtkD, false, 388, true),
			        new Effect(TypeEffect.AtkM, false, 310, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 394, true),
			        new Effect(TypeEffect.AtkD, false, 394, true),
			        new Effect(TypeEffect.AtkM, false, 315, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 400, true),
			        new Effect(TypeEffect.AtkD, false, 400, true),
			        new Effect(TypeEffect.AtkM, false, 320, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 406, true),
			        new Effect(TypeEffect.AtkD, false, 406, true),
			        new Effect(TypeEffect.AtkM, false, 325, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 413, true),
			        new Effect(TypeEffect.AtkD, false, 413, true),
			        new Effect(TypeEffect.AtkM, false, 330, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 419, true),
			        new Effect(TypeEffect.AtkD, false, 419, true),
			        new Effect(TypeEffect.AtkM, false, 335, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 425, true),
			        new Effect(TypeEffect.AtkD, false, 425, true),
			        new Effect(TypeEffect.AtkM, false, 340, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 431, true),
			        new Effect(TypeEffect.AtkD, false, 431, true),
			        new Effect(TypeEffect.AtkM, false, 345, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 438, true),
			        new Effect(TypeEffect.AtkD, false, 438, true),
			        new Effect(TypeEffect.AtkM, false, 350, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 444, true),
			        new Effect(TypeEffect.AtkD, false, 444, true),
			        new Effect(TypeEffect.AtkM, false, 355, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 450, true),
			        new Effect(TypeEffect.AtkD, false, 450, true),
			        new Effect(TypeEffect.AtkM, false, 360, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 456, true),
			        new Effect(TypeEffect.AtkD, false, 456, true),
			        new Effect(TypeEffect.AtkM, false, 365, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 463, true),
			        new Effect(TypeEffect.AtkD, false, 463, true),
			        new Effect(TypeEffect.AtkM, false, 370, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 469, true),
			        new Effect(TypeEffect.AtkD, false, 469, true),
			        new Effect(TypeEffect.AtkM, false, 375, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 475, true),
			        new Effect(TypeEffect.AtkD, false, 475, true),
			        new Effect(TypeEffect.AtkM, false, 380, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 481, true),
			        new Effect(TypeEffect.AtkD, false, 481, true),
			        new Effect(TypeEffect.AtkM, false, 385, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 488, true),
			        new Effect(TypeEffect.AtkD, false, 488, true),
			        new Effect(TypeEffect.AtkM, false, 390, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 494, true),
			        new Effect(TypeEffect.AtkD, false, 494, true),
			        new Effect(TypeEffect.AtkM, false, 395, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 500, true),
			        new Effect(TypeEffect.AtkD, false, 500, true),
			        new Effect(TypeEffect.AtkM, false, 400, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 506, true),
			        new Effect(TypeEffect.AtkD, false, 506, true),
			        new Effect(TypeEffect.AtkM, false, 405, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 513, true),
			        new Effect(TypeEffect.AtkD, false, 513, true),
			        new Effect(TypeEffect.AtkM, false, 410, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 519, true),
			        new Effect(TypeEffect.AtkD, false, 519, true),
			        new Effect(TypeEffect.AtkM, false, 415, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 525, true),
			        new Effect(TypeEffect.AtkD, false, 525, true),
			        new Effect(TypeEffect.AtkM, false, 420, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 531, true),
			        new Effect(TypeEffect.AtkD, false, 531, true),
			        new Effect(TypeEffect.AtkM, false, 425, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 538, true),
			        new Effect(TypeEffect.AtkD, false, 538, true),
			        new Effect(TypeEffect.AtkM, false, 430, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 544, true),
			        new Effect(TypeEffect.AtkD, false, 544, true),
			        new Effect(TypeEffect.AtkM, false, 435, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 550, true),
			        new Effect(TypeEffect.AtkD, false, 550, true),
			        new Effect(TypeEffect.AtkM, false, 440, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 556, true),
			        new Effect(TypeEffect.AtkD, false, 556, true),
			        new Effect(TypeEffect.AtkM, false, 445, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 563, true),
			        new Effect(TypeEffect.AtkD, false, 563, true),
			        new Effect(TypeEffect.AtkM, false, 450, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 569, true),
			        new Effect(TypeEffect.AtkD, false, 569, true),
			        new Effect(TypeEffect.AtkM, false, 455, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 575, true),
			        new Effect(TypeEffect.AtkD, false, 575, true),
			        new Effect(TypeEffect.AtkM, false, 460, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 581, true),
			        new Effect(TypeEffect.AtkD, false, 581, true),
			        new Effect(TypeEffect.AtkM, false, 465, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 588, true),
			        new Effect(TypeEffect.AtkD, false, 588, true),
			        new Effect(TypeEffect.AtkM, false, 470, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 594, true),
			        new Effect(TypeEffect.AtkD, false, 594, true),
			        new Effect(TypeEffect.AtkM, false, 475, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 600, true),
			        new Effect(TypeEffect.AtkD, false, 600, true),
			        new Effect(TypeEffect.AtkM, false, 480, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 606, true),
			        new Effect(TypeEffect.AtkD, false, 606, true),
			        new Effect(TypeEffect.AtkM, false, 485, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 613, true),
			        new Effect(TypeEffect.AtkD, false, 613, true),
			        new Effect(TypeEffect.AtkM, false, 490, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 619, true),
			        new Effect(TypeEffect.AtkD, false, 619, true),
			        new Effect(TypeEffect.AtkM, false, 495, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 625, true),
			        new Effect(TypeEffect.AtkD, false, 625, true),
			        new Effect(TypeEffect.AtkM, false, 500, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			})),
			new Anima("Anima sylvestre de chasse", Quality.PURPLE, "vio3", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6),
			        new Effect(TypeEffect.DCCP, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7),
			        new Effect(TypeEffect.DCCP, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7),
			        new Effect(TypeEffect.DCCP, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7),
			        new Effect(TypeEffect.DCCP, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7),
			        new Effect(TypeEffect.DCCP, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7.7),
			        new Effect(TypeEffect.DCCP, false, 19),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 8.4),
			        new Effect(TypeEffect.DCCP, false, 21),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 9.1),
			        new Effect(TypeEffect.DCCP, false, 23),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 9.8),
			        new Effect(TypeEffect.DCCP, false, 25),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 10.5),
			        new Effect(TypeEffect.DCCP, false, 27),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 11.2),
			        new Effect(TypeEffect.DCCP, false, 29),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 11.9),
			        new Effect(TypeEffect.DCCP, false, 31),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 12.6),
			        new Effect(TypeEffect.DCCP, false, 33),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 13.3),
			        new Effect(TypeEffect.DCCP, false, 35),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 14),
			        new Effect(TypeEffect.DCCP, false, 38),
			    },
			})),
			new Anima("Anima sylvestre ésotérique", Quality.PURPLE, "vio4", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 15),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 6),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 7),
			        new Effect(TypeEffect.DCCM, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 7),
			        new Effect(TypeEffect.DCCM, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 7),
			        new Effect(TypeEffect.DCCM, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 7),
			        new Effect(TypeEffect.DCCM, false, 17),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 7.7),
			        new Effect(TypeEffect.DCCM, false, 19),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 8.4),
			        new Effect(TypeEffect.DCCM, false, 21),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 9.1),
			        new Effect(TypeEffect.DCCM, false, 23),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 9.8),
			        new Effect(TypeEffect.DCCM, false, 25),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 10.5),
			        new Effect(TypeEffect.DCCM, false, 27),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 11.2),
			        new Effect(TypeEffect.DCCM, false, 29),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 11.9),
			        new Effect(TypeEffect.DCCM, false, 31),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 12.6),
			        new Effect(TypeEffect.DCCM, false, 33),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 13.3),
			        new Effect(TypeEffect.DCCM, false, 35),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 14),
			        new Effect(TypeEffect.DCCM, false, 38),
			    },
			})),
			new Anima("Anima sylvestre redoutable", Quality.PURPLE, "vio5", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 12, true),
			        new Effect(TypeEffect.VIT, false, 10, true),
			        new Effect(TypeEffect.INT, false, 10, true),
			        new Effect(TypeEffect.VOL, false, 13, true),
			        new Effect(TypeEffect.AGI, false, 10, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 14, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 14, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 14, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 14, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 17, true),
			        new Effect(TypeEffect.VIT, false, 12, true),
			        new Effect(TypeEffect.INT, false, 12, true),
			        new Effect(TypeEffect.VOL, false, 15, true),
			        new Effect(TypeEffect.AGI, false, 12, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 18, true),
			        new Effect(TypeEffect.VIT, false, 14, true),
			        new Effect(TypeEffect.INT, false, 14, true),
			        new Effect(TypeEffect.VOL, false, 17, true),
			        new Effect(TypeEffect.AGI, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 19, true),
			        new Effect(TypeEffect.VIT, false, 15, true),
			        new Effect(TypeEffect.INT, false, 15, true),
			        new Effect(TypeEffect.VOL, false, 18, true),
			        new Effect(TypeEffect.AGI, false, 15, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 24, true),
			        new Effect(TypeEffect.VIT, false, 18, true),
			        new Effect(TypeEffect.INT, false, 18, true),
			        new Effect(TypeEffect.VOL, false, 22, true),
			        new Effect(TypeEffect.AGI, false, 18, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 29, true),
			        new Effect(TypeEffect.VIT, false, 22, true),
			        new Effect(TypeEffect.INT, false, 22, true),
			        new Effect(TypeEffect.VOL, false, 26, true),
			        new Effect(TypeEffect.AGI, false, 22, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 34, true),
			        new Effect(TypeEffect.VIT, false, 26, true),
			        new Effect(TypeEffect.INT, false, 26, true),
			        new Effect(TypeEffect.VOL, false, 30, true),
			        new Effect(TypeEffect.AGI, false, 26, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 39, true),
			        new Effect(TypeEffect.VIT, false, 30, true),
			        new Effect(TypeEffect.INT, false, 30, true),
			        new Effect(TypeEffect.VOL, false, 34, true),
			        new Effect(TypeEffect.AGI, false, 30, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 44, true),
			        new Effect(TypeEffect.VIT, false, 34, true),
			        new Effect(TypeEffect.INT, false, 34, true),
			        new Effect(TypeEffect.VOL, false, 38, true),
			        new Effect(TypeEffect.AGI, false, 34, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 49, true),
			        new Effect(TypeEffect.VIT, false, 38, true),
			        new Effect(TypeEffect.INT, false, 38, true),
			        new Effect(TypeEffect.VOL, false, 43, true),
			        new Effect(TypeEffect.AGI, false, 38, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 54, true),
			        new Effect(TypeEffect.VIT, false, 42, true),
			        new Effect(TypeEffect.INT, false, 42, true),
			        new Effect(TypeEffect.VOL, false, 48, true),
			        new Effect(TypeEffect.AGI, false, 42, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 59, true),
			        new Effect(TypeEffect.VIT, false, 46, true),
			        new Effect(TypeEffect.INT, false, 46, true),
			        new Effect(TypeEffect.VOL, false, 53, true),
			        new Effect(TypeEffect.AGI, false, 46, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 64, true),
			        new Effect(TypeEffect.VIT, false, 50, true),
			        new Effect(TypeEffect.INT, false, 50, true),
			        new Effect(TypeEffect.VOL, false, 58, true),
			        new Effect(TypeEffect.AGI, false, 50, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 69, true),
			        new Effect(TypeEffect.VIT, false, 54, true),
			        new Effect(TypeEffect.INT, false, 54, true),
			        new Effect(TypeEffect.VOL, false, 63, true),
			        new Effect(TypeEffect.AGI, false, 54, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			})),
			new Anima("Anima sylvestre embrasant", Quality.PURPLE, "vio6", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 15, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 30, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 45, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 60, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 75, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 90, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 105, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 120, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 135, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 150, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 165, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 180, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 195, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 210, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 225, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 240, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 255, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 270, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 285, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 300, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 315, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 330, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 345, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 360, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 375, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 390, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 405, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 420, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 435, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 450, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 465, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 480, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 495, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 510, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 525, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 540, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 555, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 570, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 585, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 600, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 615, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 630, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 645, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 660, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 675, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 690, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 705, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 720, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 735, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 750, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 765, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 780, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 795, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 810, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 825, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 840, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 855, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 870, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 885, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 900, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 915, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 930, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 945, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 960, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 975, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 990, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1005, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1020, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1035, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1050, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1065, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1080, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1095, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1110, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1125, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1140, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1155, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1170, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1185, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1200, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1215, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1230, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1245, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1260, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1275, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1290, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1305, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1320, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1335, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1350, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1365, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1380, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1395, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1410, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1425, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1440, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1455, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1470, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1485, true),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 1500, true),
			    },
			})),
			new Anima("Anima sylvestre de dextérité", Quality.PURPLE, "vio7", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 23),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 23),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 23),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 23),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 24),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 24),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 24),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 24),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 25),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 26),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 26),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 26),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 26),
			        new Effect(TypeEffect.ESQ, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 27),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 27),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 27),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 27),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 28),
			        new Effect(TypeEffect.ESQ, false, 14),
			    },
			})),
			new Anima("Anima sylvestre renforçant", Quality.PURPLE, "vio8", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 6, true),
			        new Effect(TypeEffect.DefM, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 12, true),
			        new Effect(TypeEffect.DefM, false, 9, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 17, true),
			        new Effect(TypeEffect.DefM, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 23, true),
			        new Effect(TypeEffect.DefM, false, 18, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 29, true),
			        new Effect(TypeEffect.DefM, false, 23, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 35, true),
			        new Effect(TypeEffect.DefM, false, 28, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 40, true),
			        new Effect(TypeEffect.DefM, false, 32, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 46, true),
			        new Effect(TypeEffect.DefM, false, 37, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 52, true),
			        new Effect(TypeEffect.DefM, false, 41, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 58, true),
			        new Effect(TypeEffect.DefM, false, 46, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 63, true),
			        new Effect(TypeEffect.DefM, false, 51, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 69, true),
			        new Effect(TypeEffect.DefM, false, 55, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 75, true),
			        new Effect(TypeEffect.DefM, false, 60, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 81, true),
			        new Effect(TypeEffect.DefM, false, 64, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 86, true),
			        new Effect(TypeEffect.DefM, false, 69, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 92, true),
			        new Effect(TypeEffect.DefM, false, 74, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 98, true),
			        new Effect(TypeEffect.DefM, false, 78, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 104, true),
			        new Effect(TypeEffect.DefM, false, 83, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 109, true),
			        new Effect(TypeEffect.DefM, false, 87, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 115, true),
			        new Effect(TypeEffect.DefM, false, 92, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 121, true),
			        new Effect(TypeEffect.DefM, false, 97, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 127, true),
			        new Effect(TypeEffect.DefM, false, 101, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 132, true),
			        new Effect(TypeEffect.DefM, false, 106, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 138, true),
			        new Effect(TypeEffect.DefM, false, 110, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 144, true),
			        new Effect(TypeEffect.DefM, false, 115, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 150, true),
			        new Effect(TypeEffect.DefM, false, 120, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 155, true),
			        new Effect(TypeEffect.DefM, false, 124, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 161, true),
			        new Effect(TypeEffect.DefM, false, 129, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 167, true),
			        new Effect(TypeEffect.DefM, false, 133, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 173, true),
			        new Effect(TypeEffect.DefM, false, 138, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 178, true),
			        new Effect(TypeEffect.DefM, false, 143, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 184, true),
			        new Effect(TypeEffect.DefM, false, 147, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 190, true),
			        new Effect(TypeEffect.DefM, false, 152, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 196, true),
			        new Effect(TypeEffect.DefM, false, 156, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 201, true),
			        new Effect(TypeEffect.DefM, false, 161, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 207, true),
			        new Effect(TypeEffect.DefM, false, 166, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 213, true),
			        new Effect(TypeEffect.DefM, false, 170, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 219, true),
			        new Effect(TypeEffect.DefM, false, 175, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 224, true),
			        new Effect(TypeEffect.DefM, false, 179, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 230, true),
			        new Effect(TypeEffect.DefM, false, 184, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 236, true),
			        new Effect(TypeEffect.DefM, false, 189, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 242, true),
			        new Effect(TypeEffect.DefM, false, 193, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 247, true),
			        new Effect(TypeEffect.DefM, false, 198, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 253, true),
			        new Effect(TypeEffect.DefM, false, 202, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 259, true),
			        new Effect(TypeEffect.DefM, false, 207, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 265, true),
			        new Effect(TypeEffect.DefM, false, 212, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 270, true),
			        new Effect(TypeEffect.DefM, false, 216, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 276, true),
			        new Effect(TypeEffect.DefM, false, 221, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 282, true),
			        new Effect(TypeEffect.DefM, false, 225, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 288, true),
			        new Effect(TypeEffect.DefM, false, 230, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 293, true),
			        new Effect(TypeEffect.DefM, false, 235, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 299, true),
			        new Effect(TypeEffect.DefM, false, 239, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 305, true),
			        new Effect(TypeEffect.DefM, false, 244, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 311, true),
			        new Effect(TypeEffect.DefM, false, 248, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 316, true),
			        new Effect(TypeEffect.DefM, false, 253, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 322, true),
			        new Effect(TypeEffect.DefM, false, 258, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 328, true),
			        new Effect(TypeEffect.DefM, false, 262, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 334, true),
			        new Effect(TypeEffect.DefM, false, 267, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 339, true),
			        new Effect(TypeEffect.DefM, false, 271, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 345, true),
			        new Effect(TypeEffect.DefM, false, 276, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 351, true),
			        new Effect(TypeEffect.DefM, false, 281, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 357, true),
			        new Effect(TypeEffect.DefM, false, 285, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 362, true),
			        new Effect(TypeEffect.DefM, false, 290, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 368, true),
			        new Effect(TypeEffect.DefM, false, 294, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 374, true),
			        new Effect(TypeEffect.DefM, false, 299, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 380, true),
			        new Effect(TypeEffect.DefM, false, 304, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 385, true),
			        new Effect(TypeEffect.DefM, false, 308, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 391, true),
			        new Effect(TypeEffect.DefM, false, 313, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 397, true),
			        new Effect(TypeEffect.DefM, false, 317, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 403, true),
			        new Effect(TypeEffect.DefM, false, 322, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 408, true),
			        new Effect(TypeEffect.DefM, false, 327, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 414, true),
			        new Effect(TypeEffect.DefM, false, 331, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 420, true),
			        new Effect(TypeEffect.DefM, false, 336, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 426, true),
			        new Effect(TypeEffect.DefM, false, 340, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 431, true),
			        new Effect(TypeEffect.DefM, false, 345, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 437, true),
			        new Effect(TypeEffect.DefM, false, 350, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 443, true),
			        new Effect(TypeEffect.DefM, false, 354, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 449, true),
			        new Effect(TypeEffect.DefM, false, 359, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 454, true),
			        new Effect(TypeEffect.DefM, false, 363, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 460, true),
			        new Effect(TypeEffect.DefM, false, 368, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 466, true),
			        new Effect(TypeEffect.DefM, false, 373, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 472, true),
			        new Effect(TypeEffect.DefM, false, 377, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 477, true),
			        new Effect(TypeEffect.DefM, false, 382, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 483, true),
			        new Effect(TypeEffect.DefM, false, 386, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 489, true),
			        new Effect(TypeEffect.DefM, false, 391, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 495, true),
			        new Effect(TypeEffect.DefM, false, 396, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 500, true),
			        new Effect(TypeEffect.DefM, false, 400, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 506, true),
			        new Effect(TypeEffect.DefM, false, 405, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 512, true),
			        new Effect(TypeEffect.DefM, false, 409, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 518, true),
			        new Effect(TypeEffect.DefM, false, 414, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 523, true),
			        new Effect(TypeEffect.DefM, false, 419, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 529, true),
			        new Effect(TypeEffect.DefM, false, 423, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 535, true),
			        new Effect(TypeEffect.DefM, false, 428, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 541, true),
			        new Effect(TypeEffect.DefM, false, 432, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 546, true),
			        new Effect(TypeEffect.DefM, false, 437, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 552, true),
			        new Effect(TypeEffect.DefM, false, 442, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 558, true),
			        new Effect(TypeEffect.DefM, false, 446, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 564, true),
			        new Effect(TypeEffect.DefM, false, 451, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 569, true),
			        new Effect(TypeEffect.DefM, false, 455, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 575, true),
			        new Effect(TypeEffect.DefM, false, 460, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 12),
			    },
			})),
			new Anima("Anima sylvestre d'Alice", Quality.PURPLE, "vioRoi1", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 1),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 0.5),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 0.5),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 3),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1.5),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 1.5),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 6),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2.5),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 2.5),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3.5),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3.5),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3.5),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3.5),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3.5),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3.5),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3.5),
			        new Effect(TypeEffect.DCCP, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3.5),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4.2),
			        new Effect(TypeEffect.DCCP, false, 10),
			        new Effect(TypeEffect.TCCM, false, 4.2),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4.9),
			        new Effect(TypeEffect.DCCP, false, 12),
			        new Effect(TypeEffect.TCCM, false, 4.9),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5.6),
			        new Effect(TypeEffect.DCCP, false, 14),
			        new Effect(TypeEffect.TCCM, false, 5.6),
			        new Effect(TypeEffect.DCCM, false, 14),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 6.3),
			        new Effect(TypeEffect.DCCP, false, 16),
			        new Effect(TypeEffect.TCCM, false, 6.3),
			        new Effect(TypeEffect.DCCM, false, 16),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7),
			        new Effect(TypeEffect.DCCP, false, 18),
			        new Effect(TypeEffect.TCCM, false, 7),
			        new Effect(TypeEffect.DCCM, false, 18),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 7.7),
			        new Effect(TypeEffect.DCCP, false, 20),
			        new Effect(TypeEffect.TCCM, false, 7.7),
			        new Effect(TypeEffect.DCCM, false, 20),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 8.4),
			        new Effect(TypeEffect.DCCP, false, 22),
			        new Effect(TypeEffect.TCCM, false, 8.4),
			        new Effect(TypeEffect.DCCM, false, 22),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 9.1),
			        new Effect(TypeEffect.DCCP, false, 24),
			        new Effect(TypeEffect.TCCM, false, 9.1),
			        new Effect(TypeEffect.DCCM, false, 24),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 9.8),
			        new Effect(TypeEffect.DCCP, false, 26),
			        new Effect(TypeEffect.TCCM, false, 9.8),
			        new Effect(TypeEffect.DCCM, false, 26),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 10.5),
			        new Effect(TypeEffect.DCCP, false, 28),
			        new Effect(TypeEffect.TCCM, false, 10.5),
			        new Effect(TypeEffect.DCCM, false, 28),
			    },
			})),
		};
	}
	
	private static Anima[] getOrange() {
		return new Anima[] {
			new Anima("Anima de Rétablissement", Quality.ORANGE, "ora0", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.HealD, false, 10),
				new Condition(TypeCondition.STATUT, new Calculable[] {
					new RegenEffect(TypeEffect.PV, true, 1, TypeRegen.REGENERATION),
					new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION),
				}),
				new Proc(0, Activation.Attack, 20, new Calculable[] {
					new Effect(TypeEffect.HealD, false, 1),
				}),
				new Proc(0, Activation.Attack, 20, new Calculable[] {
					new Effect(TypeEffect.PV, true, -20, Target.OPPONENT),
					new Effect(TypeEffect.PM, true, -20, Target.OPPONENT),
				}),
			}),
			new Anima("Anima de Rapidité", Quality.ORANGE, "ora1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 8),
				new Effect(TypeEffect.VitAtk, false, 10),
				new Effect(TypeEffect.VitComp, false, 10),
				new Proc(0, Activation.Attack, 20, new Calculable[] {
					new Effect(TypeEffect.HealD, false, 1),
				}),
				new Proc(0, Activation.Attack, 20, new Calculable[] {
					new Effect(TypeEffect.PV, true, -20, Target.OPPONENT),
					new Effect(TypeEffect.PM, true, -20, Target.OPPONENT),
				}),
			}),
			new Anima("Anima de Polyvalence", Quality.ORANGE, "ora2", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 2, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 3, true),
			        new Effect(TypeEffect.VIT, false, 2, true),
			        new Effect(TypeEffect.INT, false, 2, true),
			        new Effect(TypeEffect.VOL, false, 5, true),
			        new Effect(TypeEffect.AGI, false, 2, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 5, true),
			        new Effect(TypeEffect.VIT, false, 4, true),
			        new Effect(TypeEffect.INT, false, 4, true),
			        new Effect(TypeEffect.VOL, false, 7, true),
			        new Effect(TypeEffect.AGI, false, 4, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 8, true),
			        new Effect(TypeEffect.VIT, false, 5, true),
			        new Effect(TypeEffect.INT, false, 5, true),
			        new Effect(TypeEffect.VOL, false, 8, true),
			        new Effect(TypeEffect.AGI, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 9, true),
			        new Effect(TypeEffect.VIT, false, 7, true),
			        new Effect(TypeEffect.INT, false, 7, true),
			        new Effect(TypeEffect.VOL, false, 10, true),
			        new Effect(TypeEffect.AGI, false, 7, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 10, true),
			        new Effect(TypeEffect.VIT, false, 8, true),
			        new Effect(TypeEffect.INT, false, 8, true),
			        new Effect(TypeEffect.VOL, false, 11, true),
			        new Effect(TypeEffect.AGI, false, 8, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 12, true),
			        new Effect(TypeEffect.VIT, false, 10, true),
			        new Effect(TypeEffect.INT, false, 10, true),
			        new Effect(TypeEffect.VOL, false, 13, true),
			        new Effect(TypeEffect.AGI, false, 10, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 13, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.FCE, false, 14, true),
			        new Effect(TypeEffect.VIT, false, 11, true),
			        new Effect(TypeEffect.INT, false, 11, true),
			        new Effect(TypeEffect.VOL, false, 14, true),
			        new Effect(TypeEffect.AGI, false, 11, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			})),
			new Anima("Anima de Sort", Quality.ORANGE, "ora3", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCM, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 1),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 2),
			        new Effect(TypeEffect.DCCM, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 3),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 4),
			        new Effect(TypeEffect.DCCM, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCM, false, 5),
			        new Effect(TypeEffect.DCCM, false, 13),
			    },
			})),
			new Anima("Anima d'Exécution", Quality.ORANGE, "ora4", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.DCCP, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 1),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 2),
			        new Effect(TypeEffect.DCCP, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 3),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 4),
			        new Effect(TypeEffect.DCCP, false, 11),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 12),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.TCCP, false, 5),
			        new Effect(TypeEffect.DCCP, false, 13),
			    },
			})),
			new Anima("Anima de Courage", Quality.ORANGE, "ora5", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 6, true),
			        new Effect(TypeEffect.DefM, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 12, true),
			        new Effect(TypeEffect.DefM, false, 9, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 17, true),
			        new Effect(TypeEffect.DefM, false, 14, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 23, true),
			        new Effect(TypeEffect.DefM, false, 18, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 29, true),
			        new Effect(TypeEffect.DefM, false, 23, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 35, true),
			        new Effect(TypeEffect.DefM, false, 28, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 40, true),
			        new Effect(TypeEffect.DefM, false, 32, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 46, true),
			        new Effect(TypeEffect.DefM, false, 37, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 1),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 52, true),
			        new Effect(TypeEffect.DefM, false, 41, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 58, true),
			        new Effect(TypeEffect.DefM, false, 46, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 63, true),
			        new Effect(TypeEffect.DefM, false, 51, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 69, true),
			        new Effect(TypeEffect.DefM, false, 55, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 75, true),
			        new Effect(TypeEffect.DefM, false, 60, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 81, true),
			        new Effect(TypeEffect.DefM, false, 64, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 86, true),
			        new Effect(TypeEffect.DefM, false, 69, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 92, true),
			        new Effect(TypeEffect.DefM, false, 74, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 98, true),
			        new Effect(TypeEffect.DefM, false, 78, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 104, true),
			        new Effect(TypeEffect.DefM, false, 83, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 109, true),
			        new Effect(TypeEffect.DefM, false, 87, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 115, true),
			        new Effect(TypeEffect.DefM, false, 92, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 121, true),
			        new Effect(TypeEffect.DefM, false, 97, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 127, true),
			        new Effect(TypeEffect.DefM, false, 101, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 132, true),
			        new Effect(TypeEffect.DefM, false, 106, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 138, true),
			        new Effect(TypeEffect.DefM, false, 110, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 144, true),
			        new Effect(TypeEffect.DefM, false, 115, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 150, true),
			        new Effect(TypeEffect.DefM, false, 120, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 155, true),
			        new Effect(TypeEffect.DefM, false, 124, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 161, true),
			        new Effect(TypeEffect.DefM, false, 129, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 167, true),
			        new Effect(TypeEffect.DefM, false, 133, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 173, true),
			        new Effect(TypeEffect.DefM, false, 138, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 178, true),
			        new Effect(TypeEffect.DefM, false, 143, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 184, true),
			        new Effect(TypeEffect.DefM, false, 147, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 190, true),
			        new Effect(TypeEffect.DefM, false, 152, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 196, true),
			        new Effect(TypeEffect.DefM, false, 156, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 201, true),
			        new Effect(TypeEffect.DefM, false, 161, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 207, true),
			        new Effect(TypeEffect.DefM, false, 166, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 213, true),
			        new Effect(TypeEffect.DefM, false, 170, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 219, true),
			        new Effect(TypeEffect.DefM, false, 175, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 224, true),
			        new Effect(TypeEffect.DefM, false, 179, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 230, true),
			        new Effect(TypeEffect.DefM, false, 184, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 236, true),
			        new Effect(TypeEffect.DefM, false, 189, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 242, true),
			        new Effect(TypeEffect.DefM, false, 193, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 247, true),
			        new Effect(TypeEffect.DefM, false, 198, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 253, true),
			        new Effect(TypeEffect.DefM, false, 202, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 259, true),
			        new Effect(TypeEffect.DefM, false, 207, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 265, true),
			        new Effect(TypeEffect.DefM, false, 212, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 270, true),
			        new Effect(TypeEffect.DefM, false, 216, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 276, true),
			        new Effect(TypeEffect.DefM, false, 221, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 282, true),
			        new Effect(TypeEffect.DefM, false, 225, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 288, true),
			        new Effect(TypeEffect.DefM, false, 230, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 293, true),
			        new Effect(TypeEffect.DefM, false, 235, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 299, true),
			        new Effect(TypeEffect.DefM, false, 239, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 305, true),
			        new Effect(TypeEffect.DefM, false, 244, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 311, true),
			        new Effect(TypeEffect.DefM, false, 248, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 316, true),
			        new Effect(TypeEffect.DefM, false, 253, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 322, true),
			        new Effect(TypeEffect.DefM, false, 258, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 328, true),
			        new Effect(TypeEffect.DefM, false, 262, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 334, true),
			        new Effect(TypeEffect.DefM, false, 267, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 339, true),
			        new Effect(TypeEffect.DefM, false, 271, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 345, true),
			        new Effect(TypeEffect.DefM, false, 276, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 351, true),
			        new Effect(TypeEffect.DefM, false, 281, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 357, true),
			        new Effect(TypeEffect.DefM, false, 285, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 362, true),
			        new Effect(TypeEffect.DefM, false, 290, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 368, true),
			        new Effect(TypeEffect.DefM, false, 294, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 374, true),
			        new Effect(TypeEffect.DefM, false, 299, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.DefP, false, 380, true),
			        new Effect(TypeEffect.DefM, false, 304, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			        new Effect(TypeEffect.Parade, false, 8),
			    },
			})),
			new Anima("Anima de Discrétion", Quality.ORANGE, "ora6", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 10),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 11),
			        new Effect(TypeEffect.ESQ, false, 2),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 12),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 3),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 13),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 14),
			        new Effect(TypeEffect.ESQ, false, 4),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 15),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 5),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 16),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 17),
			        new Effect(TypeEffect.ESQ, false, 6),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 18),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 7),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 19),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 20),
			        new Effect(TypeEffect.ESQ, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 21),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 9),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Toucher, false, 22),
			        new Effect(TypeEffect.ESQ, false, 10),
			    },
			})),
			new Anima("Anima de Précision", Quality.ORANGE, "ora7", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 6, true),
			        new Effect(TypeEffect.AtkD, false, 6, true),
			        new Effect(TypeEffect.AtkM, false, 5, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 13, true),
			        new Effect(TypeEffect.AtkD, false, 13, true),
			        new Effect(TypeEffect.AtkM, false, 10, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 19, true),
			        new Effect(TypeEffect.AtkD, false, 19, true),
			        new Effect(TypeEffect.AtkM, false, 15, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 25, true),
			        new Effect(TypeEffect.AtkD, false, 25, true),
			        new Effect(TypeEffect.AtkM, false, 20, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 31, true),
			        new Effect(TypeEffect.AtkD, false, 31, true),
			        new Effect(TypeEffect.AtkM, false, 25, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 38, true),
			        new Effect(TypeEffect.AtkD, false, 38, true),
			        new Effect(TypeEffect.AtkM, false, 30, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 44, true),
			        new Effect(TypeEffect.AtkD, false, 44, true),
			        new Effect(TypeEffect.AtkM, false, 35, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 50, true),
			        new Effect(TypeEffect.AtkD, false, 50, true),
			        new Effect(TypeEffect.AtkM, false, 40, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 56, true),
			        new Effect(TypeEffect.AtkD, false, 56, true),
			        new Effect(TypeEffect.AtkM, false, 45, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 63, true),
			        new Effect(TypeEffect.AtkD, false, 63, true),
			        new Effect(TypeEffect.AtkM, false, 50, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 69, true),
			        new Effect(TypeEffect.AtkD, false, 69, true),
			        new Effect(TypeEffect.AtkM, false, 55, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 75, true),
			        new Effect(TypeEffect.AtkD, false, 75, true),
			        new Effect(TypeEffect.AtkM, false, 60, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 81, true),
			        new Effect(TypeEffect.AtkD, false, 81, true),
			        new Effect(TypeEffect.AtkM, false, 65, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 88, true),
			        new Effect(TypeEffect.AtkD, false, 88, true),
			        new Effect(TypeEffect.AtkM, false, 70, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 94, true),
			        new Effect(TypeEffect.AtkD, false, 94, true),
			        new Effect(TypeEffect.AtkM, false, 75, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 100, true),
			        new Effect(TypeEffect.AtkD, false, 100, true),
			        new Effect(TypeEffect.AtkM, false, 80, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 106, true),
			        new Effect(TypeEffect.AtkD, false, 106, true),
			        new Effect(TypeEffect.AtkM, false, 85, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 113, true),
			        new Effect(TypeEffect.AtkD, false, 113, true),
			        new Effect(TypeEffect.AtkM, false, 90, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 119, true),
			        new Effect(TypeEffect.AtkD, false, 119, true),
			        new Effect(TypeEffect.AtkM, false, 95, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 125, true),
			        new Effect(TypeEffect.AtkD, false, 125, true),
			        new Effect(TypeEffect.AtkM, false, 100, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 131, true),
			        new Effect(TypeEffect.AtkD, false, 131, true),
			        new Effect(TypeEffect.AtkM, false, 105, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 138, true),
			        new Effect(TypeEffect.AtkD, false, 138, true),
			        new Effect(TypeEffect.AtkM, false, 110, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 144, true),
			        new Effect(TypeEffect.AtkD, false, 144, true),
			        new Effect(TypeEffect.AtkM, false, 115, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 150, true),
			        new Effect(TypeEffect.AtkD, false, 150, true),
			        new Effect(TypeEffect.AtkM, false, 120, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 156, true),
			        new Effect(TypeEffect.AtkD, false, 156, true),
			        new Effect(TypeEffect.AtkM, false, 125, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 163, true),
			        new Effect(TypeEffect.AtkD, false, 163, true),
			        new Effect(TypeEffect.AtkM, false, 130, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 169, true),
			        new Effect(TypeEffect.AtkD, false, 169, true),
			        new Effect(TypeEffect.AtkM, false, 135, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 175, true),
			        new Effect(TypeEffect.AtkD, false, 175, true),
			        new Effect(TypeEffect.AtkM, false, 140, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 181, true),
			        new Effect(TypeEffect.AtkD, false, 181, true),
			        new Effect(TypeEffect.AtkM, false, 145, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 188, true),
			        new Effect(TypeEffect.AtkD, false, 188, true),
			        new Effect(TypeEffect.AtkM, false, 150, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 194, true),
			        new Effect(TypeEffect.AtkD, false, 194, true),
			        new Effect(TypeEffect.AtkM, false, 155, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 200, true),
			        new Effect(TypeEffect.AtkD, false, 200, true),
			        new Effect(TypeEffect.AtkM, false, 160, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 206, true),
			        new Effect(TypeEffect.AtkD, false, 206, true),
			        new Effect(TypeEffect.AtkM, false, 165, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 213, true),
			        new Effect(TypeEffect.AtkD, false, 213, true),
			        new Effect(TypeEffect.AtkM, false, 170, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 219, true),
			        new Effect(TypeEffect.AtkD, false, 219, true),
			        new Effect(TypeEffect.AtkM, false, 175, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 225, true),
			        new Effect(TypeEffect.AtkD, false, 225, true),
			        new Effect(TypeEffect.AtkM, false, 180, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 231, true),
			        new Effect(TypeEffect.AtkD, false, 231, true),
			        new Effect(TypeEffect.AtkM, false, 185, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 238, true),
			        new Effect(TypeEffect.AtkD, false, 238, true),
			        new Effect(TypeEffect.AtkM, false, 190, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 244, true),
			        new Effect(TypeEffect.AtkD, false, 244, true),
			        new Effect(TypeEffect.AtkM, false, 195, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 250, true),
			        new Effect(TypeEffect.AtkD, false, 250, true),
			        new Effect(TypeEffect.AtkM, false, 200, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 256, true),
			        new Effect(TypeEffect.AtkD, false, 256, true),
			        new Effect(TypeEffect.AtkM, false, 205, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 263, true),
			        new Effect(TypeEffect.AtkD, false, 263, true),
			        new Effect(TypeEffect.AtkM, false, 210, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 269, true),
			        new Effect(TypeEffect.AtkD, false, 269, true),
			        new Effect(TypeEffect.AtkM, false, 215, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 275, true),
			        new Effect(TypeEffect.AtkD, false, 275, true),
			        new Effect(TypeEffect.AtkM, false, 220, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 281, true),
			        new Effect(TypeEffect.AtkD, false, 281, true),
			        new Effect(TypeEffect.AtkM, false, 225, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 288, true),
			        new Effect(TypeEffect.AtkD, false, 288, true),
			        new Effect(TypeEffect.AtkM, false, 230, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 294, true),
			        new Effect(TypeEffect.AtkD, false, 294, true),
			        new Effect(TypeEffect.AtkM, false, 235, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 300, true),
			        new Effect(TypeEffect.AtkD, false, 300, true),
			        new Effect(TypeEffect.AtkM, false, 240, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 306, true),
			        new Effect(TypeEffect.AtkD, false, 306, true),
			        new Effect(TypeEffect.AtkM, false, 245, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 313, true),
			        new Effect(TypeEffect.AtkD, false, 313, true),
			        new Effect(TypeEffect.AtkM, false, 250, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 319, true),
			        new Effect(TypeEffect.AtkD, false, 319, true),
			        new Effect(TypeEffect.AtkM, false, 255, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 325, true),
			        new Effect(TypeEffect.AtkD, false, 325, true),
			        new Effect(TypeEffect.AtkM, false, 260, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 331, true),
			        new Effect(TypeEffect.AtkD, false, 331, true),
			        new Effect(TypeEffect.AtkM, false, 265, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 338, true),
			        new Effect(TypeEffect.AtkD, false, 338, true),
			        new Effect(TypeEffect.AtkM, false, 270, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 344, true),
			        new Effect(TypeEffect.AtkD, false, 344, true),
			        new Effect(TypeEffect.AtkM, false, 275, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 350, true),
			        new Effect(TypeEffect.AtkD, false, 350, true),
			        new Effect(TypeEffect.AtkM, false, 280, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 356, true),
			        new Effect(TypeEffect.AtkD, false, 356, true),
			        new Effect(TypeEffect.AtkM, false, 285, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 363, true),
			        new Effect(TypeEffect.AtkD, false, 363, true),
			        new Effect(TypeEffect.AtkM, false, 290, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 369, true),
			        new Effect(TypeEffect.AtkD, false, 369, true),
			        new Effect(TypeEffect.AtkM, false, 295, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 375, true),
			        new Effect(TypeEffect.AtkD, false, 375, true),
			        new Effect(TypeEffect.AtkM, false, 300, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 381, true),
			        new Effect(TypeEffect.AtkD, false, 381, true),
			        new Effect(TypeEffect.AtkM, false, 305, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 388, true),
			        new Effect(TypeEffect.AtkD, false, 388, true),
			        new Effect(TypeEffect.AtkM, false, 310, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 394, true),
			        new Effect(TypeEffect.AtkD, false, 394, true),
			        new Effect(TypeEffect.AtkM, false, 315, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 400, true),
			        new Effect(TypeEffect.AtkD, false, 400, true),
			        new Effect(TypeEffect.AtkM, false, 320, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 406, true),
			        new Effect(TypeEffect.AtkD, false, 406, true),
			        new Effect(TypeEffect.AtkM, false, 325, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.Atk, false, 413, true),
			        new Effect(TypeEffect.AtkD, false, 413, true),
			        new Effect(TypeEffect.AtkM, false, 330, true),
			        new Effect(TypeEffect.Toucher, false, 8),
			    },
			})),
			new Anima("Anima multi-noyaux", Quality.ORANGE, "ora8", new MultiEffect(1, new Calculable[][] {
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 15, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 30, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 45, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 60, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 75, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 90, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 105, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 120, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 135, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 150, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 165, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 180, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 195, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 210, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 225, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 240, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 255, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 270, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 285, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 300, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 315, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 330, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 345, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 360, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 375, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 390, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 405, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 420, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 435, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 450, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 465, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 480, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 495, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 510, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 525, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 540, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 555, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 570, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 585, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 600, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 615, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 630, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 645, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 660, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 675, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 690, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 705, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 720, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 735, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 750, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 765, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 780, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 795, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 810, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 825, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 840, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 855, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 870, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 885, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 900, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 915, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 930, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 945, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 960, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 975, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			    new Calculable[] {
			        new Effect(TypeEffect.PM, false, 990, true),
					new Condition(TypeEffect.PM, 20, new Calculable[] {
						new RegenEffect(TypeEffect.PM, false, 100, TypeRegen.REGENERATION, 1),
					}),
			    },
			})),
		};
	}
}
