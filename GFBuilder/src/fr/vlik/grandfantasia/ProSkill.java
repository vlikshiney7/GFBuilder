package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class ProSkill implements Iconable, Writable {
	
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static ProSkill[][] data = Loader.getProSkill();
	
	private String name;
	private int lvl;
	private Icon icon;
	private Calculable[] effects;
	
	public ProSkill(String name, int lvl, String path, Calculable[] effects) {
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
	
	@Override
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
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(ProSkill.class.getResource(Tools.RESOURCE + "pro/" + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		return getTooltip(0);
	}
	
	public String getTooltip(int i) {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static ProSkill get(String name) {
		for(ProSkill[] grade : ProSkill.data) {
			for(ProSkill proSkill : grade) {
				if(proSkill.getName().equals(name)) {
					return proSkill;
				}
			}
		}
		
		return null;
	}
	
	public static ProSkill[] getPossibleProSkill(GradeName grade, int lvl) {
		ArrayList<ProSkill> result = new ArrayList<ProSkill>();
		
		for(ProSkill proSkill : ProSkill.data[grade.index]) {
			if(proSkill.getLvl() <= lvl) {
				result.add(proSkill);
			}
		}
		
		ProSkill[] cast = new ProSkill[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
