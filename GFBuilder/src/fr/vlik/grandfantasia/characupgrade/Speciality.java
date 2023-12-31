package fr.vlik.grandfantasia.characupgrade;

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
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.template.IconBuff;

public class Speciality extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Spécialité");
		put(Language.EN, "Speciality");
	}};
	
	private static final String PATH = Tools.RESOURCE + Speciality.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, Icon> ICONS = new HashMap<>();
	private static Speciality[][] data = LoaderCharacUpgrade.getSpeciality();
	
	private int lvl;
	
	public Speciality(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, effects);
		this.lvl = lvl;
		this.icon = setIcon(path);
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	@Override
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(TAB + TAB + "<b>" + this.name.get(lang) + "</b>" + TAB + TAB);
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append(LINE + TAB + "• " + e.getFullInfo(lang) + TAB);
			}
		}
		
		return toHTML(result);
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Speciality.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public static Calculable multiplyEffect(Calculable effect, int point) {
		Calculable copy = null;
		
		if(effect instanceof Effect e) {
			copy = new Effect(e);
			copy.multiplyValue(point);
		} else if(effect instanceof Proc p) {
			copy = new Proc(p);
			copy.multiplyValue(point);
		}
		
		return copy;
	}
	
	public static Speciality[] getData(GradeName grade) {
		return Speciality.data[grade.index];
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
		Speciality other = (Speciality) obj;
		return this.lvl == other.lvl;
	}
}
