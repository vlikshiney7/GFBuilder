package fr.vlik.gfbuilder;

import java.awt.Color;

public class Consts {
	public static final double[] coefReinca = { 1, 1.045, 1.08, 1.12, 1.16, 1.2 };
	public static final double[] coefFortif = { 1, 1.03, 1.06, 1.09, 1.12, 1.15, 1.18, 1.21, 1.24, 1.27, 1.31, 1.35, 1.39, 1.45, 1.51, 1.61, 1.67, 1.73, 1.83, 1.88, 1.98};
	public static final double[] coefRedFortif = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.15666, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.56, 0.59, 0, 0, 0, 1.76666, 0, 0, 0, 0, 2.00875, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.02875 };
	
	public static final Color[] itemColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(255, 123, 0), new Color(234, 225, 0), new Color(252, 20, 236), new Color(255, 0, 0) };
	public static final Color[] reincaColor = { new Color(255, 255, 255), new Color(111, 225, 28) };
	public static final Color[] titleColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(5, 244, 230), new Color(255, 123, 0), new Color(234, 225, 0), new Color(251, 169, 207), new Color(254, 60, 88), new Color(255, 223, 255) };
	
	public static final Color[] UIColor = { new Color(32, 34, 37), new Color(47, 49, 54), new Color(54, 57, 63), new Color(172, 173, 175) };
	public static final Color[] FontColor = { new Color(215, 221, 222) };
}
