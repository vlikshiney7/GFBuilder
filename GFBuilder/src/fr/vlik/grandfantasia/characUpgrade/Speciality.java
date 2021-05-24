package fr.vlik.grandfantasia.characUpgrade;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.template.IconBuff;

public class Speciality extends IconBuff {
	
	private static final String PATH = Tools.RESOURCE + Speciality.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Speciality[][] data = LoaderCharacUpgrade.getSpeciality();
	
	private int lvl;
	
	public Speciality(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, effects);
		this.lvl = lvl;
		this.icon = setIcon(path);
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Speciality.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	public static Calculable multiplyEffect(Calculable effect, int point) {
		Calculable copy = null;
		
		if(effect instanceof Effect) {
			copy = new Effect((Effect) effect);
			copy.multiplyValue(point);
		} else if(effect instanceof Proc) {
			copy = new Proc((Proc) effect);
			copy.multiplyValue(point);
		}
		
		return copy;
	}
	
	public static Speciality[] getData(GradeName grade) {
		return Speciality.data[grade.index];
	}
}
