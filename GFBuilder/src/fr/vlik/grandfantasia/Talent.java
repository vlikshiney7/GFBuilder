package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public final class Talent implements Writable {
	
	public static String PATH = Tools.RESOURCE + Talent.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Talent[][] data = Loader.getTalent();
	
	private String name;
	private int[] lvl;
	private Icon icon;
	private Calculable[][] effects;
	
	public Talent() {
		this.name = "";
		this.lvl =  new int[] { 0 };
		this.icon = setIcon("null");
	}
	
	public Talent(String name, int[] lvl, String path, Calculable[][] effects) {
		this.name = name;
		this.lvl = lvl;
		this.icon = setIcon(path);
		this.effects = effects;
	}
	
	public Talent(Talent talent, int index) {
		this.name = talent.getName();
		this.lvl = new int[] { talent.getLvl()[index] };
		this.effects = new Calculable[1][];
		this.effects[0] = talent.getEffects(index);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public Icon getIcon() {
		return this.icon;
	}
	
	public Calculable[] getEffects(int i) {
		Calculable[] list = new Calculable[this.effects[i].length];
		
		for(int j = 0; j < this.effects[i].length; j++) {
			Calculable c = this.effects[i][j];
			
			if(c instanceof Effect) {
				list[j] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				list[j] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				list[j] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof Proc) {
				list[j] = new Proc((Proc) c);
			} else if(c instanceof Condition) {
				list[j] = new Condition((Condition) c);
			}
		}
		
		return list;
	}
	
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Talent.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl[0];
	}
	
	@Override
	public String getTooltip() {
		return getTooltip(0);
	}
	
	public String getTooltip(int i) {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		if(this.effects != null) {
			for(Calculable e : this.effects[i]) {
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static ArrayList<ArrayList<Talent>> getPossibleTalent(GradeName grade, int lvl) {
		ArrayList<ArrayList<Talent>> result = new ArrayList<ArrayList<Talent>>();
		for(int i = 0; i < 24; i++) {
			result.add(new ArrayList<Talent>());
			Talent currentTalent = Talent.data[grade.index][i];
			for(int j = 0; j < currentTalent.getLvl().length; j++) {
				if(currentTalent.getLvl()[j] <= lvl) {
					result.get(i).add(new Talent(currentTalent, j));
				} else {
					break;
				}
			}
		}
		
		return result;
	}
	
	public static Talent[][] getData() {
		return Talent.data;
	}
}
