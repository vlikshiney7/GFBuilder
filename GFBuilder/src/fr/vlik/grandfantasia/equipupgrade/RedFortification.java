package fr.vlik.grandfantasia.equipupgrade;

import java.awt.Color;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.equipupgrade.LoaderEquipUpgrade;

public class RedFortification extends Fortification {
	
	public static final Color[] LEVEL = new Color[] { new Color(147, 147, 147), new Color(33, 171, 235), new Color(234, 225, 0), new Color(3, 114, 107), new Color(5, 178, 166), new Color(5, 244, 230) };
	private static RedFortification[] data = LoaderEquipUpgrade.getRedFortification();
	
	private final double coefMin;
	private final double coefMax;
	private final int star;

	public RedFortification(String name, Color display, double coef, double coefMin, double coefMax, int star) {
		super(name, display, coef);
		this.coefMin = coefMin;
		this.coefMax = coefMax;
		this.star = star;
	}
	
	public double getCoefMin() {
		return this.coefMin;
	}
	
	public double getCoefMax() {
		return this.coefMax;
	}
	
	public int getStar() {
		return this.star;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.getName();
	}

	@Override
	public String getTooltip() {
		return "<html>Étoile bonus : " + this.star
				+ "<br>Bonus"
				+ "<br>Min : +" + (Math.round((this.coefMin-1) * 100)) + "%"
				+ "<br>Moy : +" + ((double) Math.round((this.getCoef()-1) * 1000) / 10) + "%"
				+ "<br>Max : +" + (Math.round((this.coefMax-1) * 100)) + "%</html>";
	}
	
	public static RedFortification[] getData() {
		return RedFortification.data;
	}
	
	public static RedFortification get(String name) {
		for(RedFortification fortif : RedFortification.data) {
			if(fortif.getName().equals(name)) {
				return fortif;
			}
		}
		
		return null;
	}
}
