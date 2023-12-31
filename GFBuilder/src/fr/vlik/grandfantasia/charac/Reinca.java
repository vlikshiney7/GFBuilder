package fr.vlik.grandfantasia.charac;

import java.awt.Color;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;

public class Reinca implements FullRenderer {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Réincarnation");
		put(Language.EN, "Rebirth");
	}};
	
	private static final String PATH = Tools.RESOURCE + Reinca.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Color[] LEVEL = { new Color(147, 147, 147), new Color(111, 225, 28) };
	private static final Map<String, Icon> ICONS = new HashMap<>();
	public static final Reinca[] data = LoaderCharac.getReinca();
	
	private final Map<Language, String> name;
	private final double coef;
	private final int lvlMin;
	private final int lvlMax;
	private final int lvl;
	private final Icon icon;
	
	public Reinca(Map<Language, String> name, double coef, int lvlMin, int lvlMax, int lvl, String path) {
		this.name = name;
		this.coef = coef;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.lvl = lvl;
		this.icon = setIcon(path);
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
		return Reinca.LEVEL[this.lvl];
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Reinca.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public String getSelectorInfo(Language lang) {
		return this.name.get(lang);
	}
	
	public String getFullInfo(Language lang) {
		StringBuilder tooltip = new StringBuilder("Coef :");
		tooltip.append("<br>");
		tooltip.append(this.coef);
		tooltip.append("<br>");
		tooltip.append("Lvl : " + this.lvlMin + " - " + this.lvlMax);
		
		return "<html>" + tooltip + "</html>";
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

	public static Reinca[] getPossibleReinca(int lvl) {
		List<Reinca> result = new ArrayList<>();
		
		for(Reinca reinca : Reinca.data) {
			if(reinca.getLvlMin() <= lvl
					&& reinca.getLvlMax() >= lvl) {
				
				result.add(reinca);
			}
		}
		
		return result.toArray(new Reinca[result.size()]);
	}
}
