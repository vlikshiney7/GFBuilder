package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class Grade implements Iconable, Writable {
	
	public static String PATH = Tools.RESOURCE + Grade.class.getSimpleName().toLowerCase() + "/";
	public static Grade[] data;
	static {
		loadData();
	}
	
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
		setIcon(path);
	}
	
	public static enum GradeName {
		BERSERKER(0), PALADIN(1),
		RANGER(2), ASSASSIN(3),
		CLERC(4), SAGE(5),
		SORCIER(6), NECROMANCIEN(7),
		METALLEUX(8), DEMOLISSEUR(9),
		SPATIODERIVEUR(10), CHRONODERIVEUR(11),
		NONE(-1);
		
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
	public void setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Grade.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		return this.lvlMin + " - " + this.lvlMax;
	}
	
	public static void loadData() {
		ArrayList<Grade> list = new ArrayList<Grade>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Grade.class.getResourceAsStream(PATH + "grade.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] name = lineSplit[0].split(",");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				Map<Language, String> lang = new HashMap<Language, String>();
				for(int i = 0; i < name.length; i++) {
					lang.put(Language.values()[i], name[i]);
				}
				
				list.add(new Grade(lang, GradeName.values()[Integer.parseInt(lineSplit[1])], Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), path));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Grade.class.getClass().getSimpleName() + " class");
		}
		
		Grade.data = new Grade[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Grade[] getData() {
		return Grade.data;
	}
	
	public static Grade[] getPossibleData(int lvl) {
		ArrayList<Grade> result = new ArrayList<Grade>();
		
		for(Grade grade : Grade.data) {
			if(grade.getLvlMin() <= lvl
					&& grade.getLvlMax() >= lvl) {
				
				result.add(grade);
			}
		}
		
		Grade[] cast = new Grade[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
