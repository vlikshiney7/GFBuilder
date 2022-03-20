package fr.vlik.grandfantasia.characupgrade;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class ProSkill extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Énergie professionnelle");
		put(Language.EN, "Professional energy");
	}};
	
	private static final String PATH = Tools.RESOURCE + ProSkill.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, Icon> ICONS = new HashMap<>();
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
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(ProSkill.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getSelectorInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + super.getSelectorInfo(lang);
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
		ArrayList<ProSkill> result = new ArrayList<>();
		
		for(ProSkill proSkill : ProSkill.data[grade.index]) {
			if(proSkill.getLvl() <= lvl) {
				result.add(proSkill);
			}
		}
		
		return result.toArray(new ProSkill[result.size()]);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvl;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProSkill other = (ProSkill) obj;
		return this.lvl == other.lvl;
	}
}
