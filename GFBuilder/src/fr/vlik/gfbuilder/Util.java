package fr.vlik.gfbuilder;

import fr.vlik.gfbuilder.page.PageGeneral;
import fr.vlik.gfbuilder.page.PageTalent;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;

public class Util {
	
	public static String[] setFortifFormat(int nb) {
		String[] result = new String[nb+1];
		
		for(int i = 0; i <= nb; i++) {
			result[i] = "+" + i;
		}
		
		return result;
	}
	
	public static boolean allowedDoubleWeapon() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(grade.getGrade() == GradeName.METALLEUX || grade.getGrade() == GradeName.DEMOLISSEUR) {
			return lvl >= 31;
		} else if(grade.getGrade() == GradeName.RANGER || grade.getGrade() == GradeName.ASSASSIN) {
			return lvl >= 16;
		} else if(grade.getGrade() == GradeName.BERSERKER && lvl >= 31) {
			return PageTalent.getInstance().getSelectedIndex(2) == 3;
		} else if(grade.getGrade() == GradeName.SAGE && lvl >= 31) {
			return PageTalent.getInstance().getSelectedIndex(2) == 1;
		}
		
		return false;
	}
}
