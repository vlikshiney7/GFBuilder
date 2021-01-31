package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Effect;

public class Energy implements Iconable, Writable {
	
	public static String PATH = Tools.RESOURCE + Energy.class.getSimpleName().toLowerCase() + "/";
	private static Energy[] data = Loader.getEnergy();
	
	private final Map<Language, String> name;
	private final Effect[] effects;
	private final Icon icon;
	
	public Energy (Map<Language, String> name, String path, Effect[] effects) {
		this.name = name;
		this.effects = effects;
		this.icon = setIcon(path);
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public Effect[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Effect[] tab = new Effect[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Effect(this.effects[i]);
		}
		return tab;
	}
	
	public Icon setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object =  new ImageIcon(Energy.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		if(this.effects != null) {
			for(Effect e : this.effects) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Effect multiplyEffect(Effect effect, int point) {
		Effect copy = new Effect(effect);
		copy.multiplyValue(point);
		return copy;
	}
	
	public static Energy[] getData() {
		return Energy.data;
	}
}
