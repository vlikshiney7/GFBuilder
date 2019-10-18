package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Tools {
	public static final String RESOURCE = "/fr/vlik/grandfantasia/resources/";
	public static final String PATH32 = "/fr/vlik/grandfantasia/resources/default/32-";
	public static final String PATH16 = "/fr/vlik/grandfantasia/resources/default/16-";
	
	public static final double[] coefFortif = { 1, 1.03, 1.06, 1.09, 1.12, 1.15, 1.18, 1.21, 1.24, 1.27, 1.31, 1.35, 1.39, 1.45, 1.51, 1.61, 1.67, 1.73, 1.83, 1.88, 1.98};
	public static final double[] coefRedFortifMin = { 1, 1.01, 1.02, 1.03, 1.04, 1.05, 1.06, 1.07, 1.08, 1.09, 1.10, 1.12, 1.14, 1.16, 1.18, 1.20, 1.22, 1.24, 1.26, 1.28, 1.30, 1.33, 1.36, 1.39, 1.42, 1.45, 1.48, 1.51, 1.54, 1.57, 1.60, 1.64, 1.68, 1.72, 1.76, 1.80, 1.84, 1.88, 1.92, 1.96, 2.00, 2.05, 2.10, 2.15, 2.20, 2.25, 2.30, 2.35, 2.40, 2.45, 2.50 };
	public static final double[] coefRedFortifMax = { 1, 1.02, 1.04, 1.06, 1.08, 1.10, 1.12, 1.14, 1.16, 1.18, 1.20, 1.23, 1.26, 1.29, 1.32, 1.35, 1.38, 1.41, 1.44, 1.47, 1.50, 1.54, 1.58, 1.62, 1.66, 1.70, 1.74, 1.78, 1.82, 1.86, 1.90, 1.96, 2.02, 2.08, 2.14, 2.20, 2.26, 2.32, 2.38, 2.44, 2.50, 2.59, 2.68, 2.77, 2.86, 2.95, 3.05, 3.15, 3.25, 3.35, 3.45 };
	
	public static final Color[] itemColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(255, 123, 0), new Color(234, 225, 0), new Color(252, 20, 236), new Color(255, 0, 0) };
	public static final Color[] reincaColor = { new Color(147, 147, 147), new Color(111, 225, 28) };
	public static final Color[] titleColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(5, 244, 230), new Color(255, 123, 0), new Color(234, 225, 0), new Color(251, 169, 207), new Color(254, 60, 88), new Color(255, 223, 255) };
	public static final Color[] costColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(234, 225, 0) };
	public static final Color[] speColor = { new Color(255, 255, 255), new Color(111, 225, 28), new Color(234, 225, 0) };
	
	public static final Color[] EffectColor = { new Color(215, 221, 222), new Color(235, 0, 0), new Color(91, 205, 8), new Color(13, 151, 215), new Color(232, 0, 216), new Color(214, 205, 0), new Color(147, 147, 147) };
	
	public static Icon constructIcon(ImageIcon back, ImageIcon front) {
		BufferedImage result = new BufferedImage(back.getIconWidth(), back.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.createGraphics();
		g.drawImage(back.getImage(), 0, 0, null);
		g.drawImage(front.getImage(), 0, 0, null);
		g.dispose();
		
		return new ImageIcon(result);
	}
}
