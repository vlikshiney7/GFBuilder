package fr.vlik.grandfantasia.equipUpgrade;

import java.awt.Color;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equipUpgrade.LoaderEquipUpgrade;

public class Fortification implements Colorable, Writable {
	
	public static final Color[] LEVEL = new Color[] { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(254, 60, 88) };
	private static Fortification[] data = LoaderEquipUpgrade.getFortification();
	
	private final String name;
	private final Color display;
	private final double coef;
	
	public Fortification(String name, Color display, double coef) {
		this.name = name;
		this.display = display;
		this.coef = coef;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCoef() {
		return this.coef;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}

	@Override
	public String getTooltip() {
		return "<html>Bonus<br>+" + (Math.round((coef-1) * 100)) + "%</html>";
	}
	
	@Override
	public Color getColor() {
		return this.display;
	}
	
	public static Fortification[] getData() {
		return Fortification.data;
	}
	
	public static Fortification get(String name) {
		for(Fortification fortif : Fortification.data) {
			if(fortif.getName().equals(name)) {
				return fortif;
			}
		}
		
		return null;
	}
}
