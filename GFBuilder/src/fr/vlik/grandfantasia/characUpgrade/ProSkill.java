package fr.vlik.grandfantasia.characUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.IconBuff;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;

public class ProSkill extends IconBuff {
	
	private static final String PATH = Tools.RESOURCE + ProSkill.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static ProSkill[][] data = LoaderCharacUpgrade.getProSkill();
	
	private int lvl;
	
	public ProSkill(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, effects);
		this.lvl = lvl;
		this.icon = setIcon(path);
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(ProSkill.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
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
				if(proSkill.getName(Language.FR).equals(name)) {
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
		return result.toArray(cast);
	}
}
