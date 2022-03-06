package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;

public class Base {
	
	private static TypeEffect[] effect = { TypeEffect.FCE, TypeEffect.VIT, TypeEffect.INT, TypeEffect.VOL, TypeEffect.AGI };
	private static int[][][] data = LoaderCharac.getBase();
	
	private Base() {}

	public static Effect[] getBase(Grade grade, int lvl) {
		ArrayList<Effect> result = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			result.add(new Effect(Base.effect[i], false, Base.data[i][grade.getGrade().index][lvl-1], true, TypeCalcul.BASE));
		}
		
		result.add(new Effect(TypeEffect.TCCP, false, 5, TypeCalcul.BASE));
		result.add(new Effect(TypeEffect.TCCM, false, 5, TypeCalcul.BASE));
		result.add(new Effect(TypeEffect.PV, false, 100, TypeCalcul.BASE));
		result.add(new Effect(TypeEffect.PM, false, 50, TypeCalcul.BASE));
		result.add(new Effect(TypeEffect.DCCP, false, 50, TypeCalcul.BASE));
		result.add(new Effect(TypeEffect.DCCM, false, 50, TypeCalcul.BASE));
		
		return result.toArray(new Effect[result.size()]);
	}
}
