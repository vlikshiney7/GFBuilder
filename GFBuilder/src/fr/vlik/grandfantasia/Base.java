package fr.vlik.grandfantasia;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.loader.Loader;

public class Base {
	
	private static TypeEffect[] effect = { TypeEffect.FCE, TypeEffect.VIT, TypeEffect.INT, TypeEffect.VOL, TypeEffect.AGI };
	private static int[][][] data = Loader.getBase();

	public static int getBase(int id, GradeName grade, int lvl) {
		return Base.data[id][grade.index][lvl-1];
	}
	
	public static TypeEffect getEffect(int id) {
		return Base.effect[id];
	}
}
