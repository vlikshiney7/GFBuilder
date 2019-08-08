package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grade {
	
	private String[] name;
	private int indexClass;
	private int lvlMin;
	private int lvlMax;
	private BufferedImage icon;
	
	public Grade(String[] name, int indexClass, int lvlMin, int lvlMax, String path) {
		this.name = name;
		this.indexClass = indexClass;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.icon = setIcon(path);
	}
	
	public String getName(int lang) {
		return this.name[lang];
	}
	
	public int getIndex() {
		return this.indexClass;
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/grade/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
}
