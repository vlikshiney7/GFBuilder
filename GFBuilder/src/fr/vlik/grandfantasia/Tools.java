package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.text.Normalizer;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Filtrable;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.TransformEffect;

public class Tools {
	public static final String RESOURCE = "/fr/vlik/grandfantasia/resources/";
	public static final String PATH32 = "/fr/vlik/grandfantasia/resources/default/32-";
	public static final String PATH24 = "/fr/vlik/grandfantasia/resources/default/24-";
	public static final String PATH16 = "/fr/vlik/grandfantasia/resources/default/16-";
	
	public static final Color[] itemColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(255, 123, 0), new Color(234, 225, 0), new Color(252, 20, 236), new Color(255, 0, 0) };
	public static final Color[] reincaColor = { new Color(147, 147, 147), new Color(111, 225, 28) };
	public static final Color[] titleColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(5, 244, 230), new Color(255, 123, 0), new Color(234, 225, 0), new Color(251, 169, 207), new Color(254, 60, 88), new Color(255, 223, 255) };
	public static final Color[] costColor = { new Color(147, 147, 147), new Color(255, 255, 255), new Color(111, 225, 28), new Color(33, 171, 235), new Color(234, 225, 0) };
	public static final Color[] speColor = { new Color(255, 255, 255), new Color(111, 225, 28), new Color(234, 225, 0) };
	
	public static final Color[] EffectColor = { new Color(215, 221, 222), new Color(235, 0, 0), new Color(91, 205, 8), new Color(13, 151, 215), new Color(232, 0, 216), new Color(214, 205, 0), new Color(147, 147, 147), new Color(255, 255, 100), new Color(150, 100, 150), new Color(100, 100, 255), new Color(255, 100, 100), new Color(113, 251, 255), new Color(191, 255, 108) };
	public static final String PNG = ".png";
	
	public static Icon constructIcon(ImageIcon back, ImageIcon front) {
		BufferedImage result = new BufferedImage(back.getIconWidth(), back.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.createGraphics();
		g.drawImage(back.getImage(), 0, 0, null);
		g.drawImage(front.getImage(), 0, 0, null);
		g.dispose();
		
		return new ImageIcon(result);
	}
	
	public static String simplifyString(String entry) {
		String result = entry.replaceAll(" ", "").toLowerCase();
		result = Normalizer.normalize(result, Normalizer.Form.NFD);
		result = result.replaceAll("[^\\p{ASCII}]", "");
		
		return result;
	}
	
	public static boolean searchOnName(String key, String name) {
		key = Tools.simplifyString(key);
		name = Tools.simplifyString(name);
		
		if(key.equals("")) {
			return false;
		}
		
		return name.matches(".*(" + key + ").*");
	}
	
	public static boolean searchOnName(String key, Map<Language, String> names) {
		
		for(String name : names.values()) {
			if(searchOnName(key, name)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static boolean contains(Filtrable[] tabFilter, Filtrable filter) {
		for(Filtrable element : tabFilter) {
			if(filter.equals(element)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean contains(Filtrable[] tabFilter, Filtrable[] filter) {
		if(filter == null) {
			return false;
		}
		
		for(Filtrable element : filter) {
			if(contains(tabFilter, element)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Calculable[] getEffects(Calculable[] tabEffects) {
		if(tabEffects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[tabEffects.length];
		for(int i = 0; i < tab.length; i++) {
			if(tabEffects[i] instanceof Condition) {
				tab[i] = new Condition((Condition) tabEffects[i]);
			} else if(tabEffects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) tabEffects[i]);
			} else if(tabEffects[i] instanceof Proc) {
				tab[i] = new Proc((Proc) tabEffects[i]);
			} else if(tabEffects[i] instanceof RegenEffect) {
				tab[i] = new RegenEffect((RegenEffect) tabEffects[i]);
			} else if(tabEffects[i] instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) tabEffects[i]);
			} else if(tabEffects[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) tabEffects[i]);
			} else if(tabEffects[i] instanceof TransformEffect) {
				tab[i] = new TransformEffect((TransformEffect) tabEffects[i]);
			}
		}
		
		return tab;
	}
}
