package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Effect;

public class Yggdrasil implements Writable, Iconable {
	
	public static String PATH = Tools.RESOURCE + Yggdrasil.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Yggdrasil[] data = Loader.getYggdrasil();
	
	private Map<Language, String> name;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Yggdrasil(Map<Language, String> name, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.icon = setIcon(path);
		this.effects = effects;
	}

	public String getName(Language lang) {
		return this.name.get(lang);
	}

	public ArrayList<Effect> getEffects() {
		return effects;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Yggdrasil.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	public static Yggdrasil[] getData() {
		return Yggdrasil.data;
	}
	
	public static Yggdrasil get(String name, Language lang) {
		for(Yggdrasil yggdrasil : Yggdrasil.data) {
			if(yggdrasil.getName(lang).equals(name)) {
				return yggdrasil;
			}
		}
		
		return null;
	}
}
