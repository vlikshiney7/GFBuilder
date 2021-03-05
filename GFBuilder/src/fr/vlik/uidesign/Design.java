package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;

public class Design {
	
	public static final String RESOURCE = "/fr/vlik/uidesign/images/";
	public static final String PNG = ".png";
	
	public static final Font TITLE = new Font("Open Sans", Font.BOLD, 16);
	public static final Font SUBTITLE = new Font("Open Sans", Font.PLAIN, 14);
	public static final Font TEXT = new Font("Open Sans", Font.PLAIN, 12);
	public static final Font BUTTON = new Font("Open Sans", Font.PLAIN, 16);
	public static final Font EDIT = new Font("Open Sans", Font.BOLD, 14);
	public static final Font TABPANE = new Font("Open Sans", Font.PLAIN, 24);
	
	public static final Color[] UIColor = { new Color(32, 34, 37), new Color(47, 49, 54), new Color(54, 57, 63), new Color(172, 173, 175), new Color(75, 27, 29) };
	public static final Color[] FontColor = { new Color(215, 221, 222), new Color(240, 89, 89) };
	
	public static final Color[] GREY_COLOR = { new Color(32, 34, 37), new Color(40, 43, 45), new Color(22, 24, 25) };
	public static final Color[] RED_COLOR = { new Color(75, 27, 29), new Color(97, 24, 26), new Color(53, 30, 33) };
	public static final Color[] YELLOW_COLOR = { new Color(75, 77, 29), new Color(97, 99, 26), new Color(53, 55, 33) };
	public static final Color[] GREEN_COLOR = { new Color(25, 77, 36), new Color(22, 99, 35), new Color(28, 55, 36) };
	
	@SuppressWarnings("serial")
	public static final Map<Color, String> iconLink = new HashMap<Color, String>() {{
		put(Tools.itemColor[0], "0");
		put(Tools.itemColor[1], "1");
		put(Tools.itemColor[2], "2");
		put(Tools.itemColor[3], "3");
		put(Tools.itemColor[4], "4");
		put(Tools.itemColor[5], "5");
		put(Tools.itemColor[6], "6");
		put(Tools.itemColor[7], "7");
		put(Tools.titleColor[8], "8");
	}};
	
	public static Icon disableIcon(ImageIcon back) {
		ImageIcon disable = new ImageIcon(JCustomRadioButton.class.getResource(Design.RESOURCE + "radio/disable" + Design.PNG));
		BufferedImage result = new BufferedImage(back.getIconWidth(), back.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.createGraphics();
		g.drawImage(back.getImage(), 0, 0, null);
		g.drawImage(disable.getImage(), 0, 0, null);
		g.dispose();
		
		return new ImageIcon(result);
	}
}
