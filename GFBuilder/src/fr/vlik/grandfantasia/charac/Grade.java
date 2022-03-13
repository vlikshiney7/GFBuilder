package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;

public class Grade implements Iconable, Writable {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Classe");
		put(Language.EN, "Class");
	}};
	
	public static final String PATH = Tools.RESOURCE + Grade.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, Icon> ICONS = new HashMap<>();
	public static final Grade[] data = LoaderCharac.getGrade();
	
	private Map<Language, String> name;
	private GradeName grade;
	private int lvlMin;
	private int lvlMax;
	private Icon icon;
	
	public Grade(Map<Language, String> name, GradeName grade, int lvlMin, int lvlMax, String path) {
		this.name = name;
		this.grade = grade;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.icon = setIcon(path);
	}
	
	public enum GradeName {
		BERSERKER(0), PALADIN(1),
		RANGER(2), ASSASSIN(3),
		CLERC(4), SAGE(5),
		SORCIER(6), NECROMANCIEN(7),
		METALLEUX(8), DEMOLISSEUR(9),
		SPATIODERIVEUR(10), CHRONODERIVEUR(11),
		NONE(0);
		
		public final int index;
		 
	    private GradeName(int index) {
	        this.index = index;
	    }
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public GradeName getGrade() {
		return this.grade;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Grade.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		return this.lvlMin + " - " + this.lvlMax;
	}
	
	public static Grade[] getData() {
		return Grade.data;
	}
	
	public static Grade get(String name, Language lang) {
		for(Grade grade : Grade.data) {
			if(grade.getName(lang).equals(name)) {
				return grade;
			}
		}
		
		return null;
	}
	
	public static Grade[] getPossibleGrade(int lvl) {
		ArrayList<Grade> result = new ArrayList<>();
		
		for(Grade grade : Grade.data) {
			if(grade.getLvlMin() <= lvl
					&& grade.getLvlMax() >= lvl) {
				
				result.add(grade);
			}
		}
		
		Grade[] cast = new Grade[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
