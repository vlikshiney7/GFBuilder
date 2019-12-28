package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Reinca implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Reinca.class.getSimpleName().toLowerCase() + "/";
	public static Reinca[] data;
	static {
		loadData();
	}
	
	private Map<Language, String> name;
	private double coef;
	private int lvlMin;
	private int lvlMax;
	private int lvl;
	private Icon icon;
	
	public Reinca(Map<Language, String> name, double coef, int lvlMin, int lvlMax, int lvl, String path) {
		this.name = name;
		this.coef = coef;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.lvl = lvl;
		setIcon(path);
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public double getCoef() {
		return this.coef;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	@Override
	public Color getColor() {
		return Tools.reincaColor[this.lvl];
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
		StringBuilder tooltip = new StringBuilder("Coef :");
		tooltip.append("<br>");
		tooltip.append(this.coef);
		tooltip.append("<br>");
		tooltip.append("Lvl : " + this.lvlMin + " - " + this.lvlMax);
		
		return "<html>" + tooltip + "</html>";
	}
	
	private static void loadData() {
		ArrayList<Reinca> list = new ArrayList<Reinca>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Reinca.class.getResourceAsStream(PATH + "reinca.txt"), "UTF-8"));
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
				
				
				list.add(new Reinca(lang, Double.parseDouble(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]), path));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Anima.class.getClass().getSimpleName() + " class");
		}
		
		Reinca.data = new Reinca[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Reinca[] getData() {
		return Reinca.data;
	}
	
	public static Reinca get(String name, Language lang) {
		for(Reinca reinca : Reinca.data) {
			if(reinca.getName(lang).equals(name)) {
				return reinca;
			}
		}
		
		return null;
	}

	public static Reinca[] getPossibleData(int lvl) {
		ArrayList<Reinca> result = new ArrayList<Reinca>();
		
		for(Reinca reinca : Reinca.data) {
			if(reinca.getLvlMin() <= lvl
					&& reinca.getLvlMax() >= lvl) {
				
				result.add(reinca);
			}
		}
		
		Reinca[] cast = new Reinca[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
