package fr.vlik.gfbuilder;

import java.awt.Font;

import fr.vlik.gfbuilder.page.PageGeneral;
import fr.vlik.gfbuilder.page.PageTalent;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Talent;

public class Util {
	
	public static final Font TITLE = new Font("Open Sans", Font.BOLD, 14);
	
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
		} else if(grade.getGrade() == GradeName.BERSERKER && lvl > 31) {
			if(PageTalent.getInstance().getRadioButton(2).get(3).isSelected()) {
				Talent talent = PageTalent.getInstance().getTalent(8);
				return talent.getLvl()[0] > 0;
			}
		}
		
		return false;
	}
}
