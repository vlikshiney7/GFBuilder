package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.MainFrame;

public class Grade {
	
	private static Grade[] data;
	static {
		loadData();
	}
	
	private String[] name;
	private GradeName grade;
	private int lvlMin;
	private int lvlMax;
	private BufferedImage icon;
	
	public Grade(String[] name, GradeName grade, int lvlMin, int lvlMax, String path) {
		this.name = name;
		this.grade = grade;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.icon = setIcon(path);
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
	
	public String getName(int lang) {
		return this.name[lang];
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
	
	public BufferedImage getIcon() {
		return this.icon;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/grade/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public static void loadData() {
		ArrayList<Grade> list = new ArrayList<Grade>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/grade/grade.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] name = lineSplit[0].split(",");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				list.add(new Grade(name, GradeName.values()[Integer.parseInt(lineSplit[1])], Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), path));
				
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
