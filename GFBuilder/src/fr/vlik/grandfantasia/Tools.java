package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.text.Normalizer;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.interfaces.Filterable;

public class Tools {
	public static final String RESOURCE = "/fr/vlik/grandfantasia/resources/";
	public static final String PATH32 = RESOURCE + "default/32-";
	public static final String PATH24 = RESOURCE + "default/24-";
	public static final String PATH16 = RESOURCE + "default/16-";
	
	public static final Color[] itemColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(255, 123, 0), new Color(234, 225, 0), new Color(252, 20, 236), new Color(255, 0, 0) };
	public static final Color[] reincaColor = { new Color(147, 147, 147), new Color(111, 225, 28) };
	public static final Color[] titleColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(5, 244, 230), new Color(255, 123, 0), new Color(234, 225, 0), new Color(251, 169, 207), new Color(254, 60, 88), new Color(255, 223, 255) };
	public static final Color[] costColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(234, 225, 0) };
	public static final Color[] speColor = { new Color(255, 255, 255), new Color(111, 225, 28), new Color(234, 225, 0) };
	
	public static final Color[] EffectColor = { new Color(215, 221, 222), new Color(235, 0, 0), new Color(91, 205, 8), new Color(13, 151, 215), new Color(232, 0, 216), new Color(214, 205, 0), new Color(147, 147, 147), new Color(255, 255, 100), new Color(150, 100, 150), new Color(100, 100, 255), new Color(255, 100, 100), new Color(113, 251, 255), new Color(191, 255, 108) };
	public static final String PNG = ".png";
	
	private Tools() {}
	
	public static Icon constructIcon(ImageIcon back, ImageIcon front) {
		if(front == null) {
			return back;
		}
		
		BufferedImage result = new BufferedImage(back.getIconWidth(), back.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.createGraphics();
		g.drawImage(back.getImage(), 0, 0, null);
		g.drawImage(front.getImage(), 0, 0, null);
		g.dispose();
		
		return new ImageIcon(result);
	}
	
	public static String simplifyString(String entry) {
		String result = entry.replace(" ", "").toLowerCase();
		result = Normalizer.normalize(result, Normalizer.Form.NFD);
		result = result.replaceAll("[^\\p{ASCII}]", "");
		
		return result;
	}
	
	public static boolean searchOnName(String key, String name, boolean andValue) {
		key = Tools.simplifyString(key);
		name = Tools.simplifyString(name);
		
		if(key.equals("")) {
			return andValue;
		}
		
		return name.matches(".*" + key + ".*");
	}
	
	public static boolean searchOnName(String key, Map<Language, String> names, boolean andValue) {
		
		for(String name : names.values()) {
			if(searchOnName(key, name, andValue)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean containFilter(Filterable[] tabFilter, Filterable[] filter) {
		if(filter == null) {
			return false;
		}
		
		for(Filterable element : filter) {
			if(containObject(tabFilter, element)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean containObject(Object[] tab, Object element) {
		for(Object tabElement : tab) {
			if(tabElement.equals(element)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean evaluateProperties(Map<Object, Object> properties) {
		for(Entry<Object, Object> entry : properties.entrySet()) {
			if(!evaluateProperty(entry)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean evaluateProperty(Entry<Object, Object> entry) {
		if(entry.getKey() instanceof Integer) {
			return (Integer) entry.getKey() <= (Integer) entry.getValue();
		} else if(entry.getKey() instanceof Boolean) {
			if(Boolean.FALSE.equals(entry.getKey())) {
				return true;
			} else {
				return ((Reinca) entry.getValue()).getLvl() > 0;
			}
		} else if(entry.getValue() instanceof Quality) {
			if((Quality) entry.getKey() != null) {
				return (Quality) entry.getKey() == (Quality) entry.getValue();
			} else {
				return true;
			}
		} else if(entry.getKey() instanceof GradeName) {
			return (GradeName) entry.getKey() == (GradeName) entry.getValue() || (GradeName) entry.getValue() == GradeName.NONE;
		} else if(entry.getKey() instanceof ArmorType) {
			return (ArmorType) entry.getKey() == (ArmorType) entry.getValue();
		} else if(entry.getKey() instanceof Object[]) {
			boolean compare = containObject((Object[]) entry.getKey(), entry.getValue());
			
			if(!compare) {
				if(entry.getValue() instanceof GradeName) {
					return (GradeName) entry.getValue() == GradeName.NONE;
				}
			} else {
				return compare;
			}
		} else {
			System.out.println("Type non reconnu : " + entry.getKey().getClass().getSimpleName());
		}
		
		return false;
	}
}
