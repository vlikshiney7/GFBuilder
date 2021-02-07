package fr.vlik.grandfantasia.characUpgrade;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Speciality {
	
	public static String PATH = Tools.RESOURCE + Speciality.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Speciality[][] data = Loader.getSpeciality();
	
	private String name;
	private int lvl;
	private Calculable[] effects;
	private Icon icon;
	
	public Speciality(String name, int lvl, String path, Calculable[] effects) {
		this.name = name;
		this.lvl = lvl;
		this.icon = setIcon(path);
		this.effects = effects;
	}

	public String getName() {
		return this.name;
	}

	public int getLvl() {
		return this.lvl;
	}
	
	public Icon getIcon() {
		return this.icon;
	}

	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else if(this.effects[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.effects[i]);
			} else if(this.effects[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.effects[i]);
			}
		}
		
		return tab;
	}
	
	private Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Speciality.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder(this.getName());
		if(this.effects != null) {
			for(Calculable e : this.effects) {
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
	
	public static Speciality[] getData(GradeName grade) {
		return Speciality.data[grade.index];
	}
}
