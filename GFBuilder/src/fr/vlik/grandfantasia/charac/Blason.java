package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class Blason extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Blason");
		put(Language.EN, "Blazon");
	}};
	
	private static final String PATH = Tools.RESOURCE + "sprite/";
	private static final Map<String, Icon> ICONS = new HashMap<>();
	private static Blason[] data = LoaderCharac.getBlason();
	
	private int lvl;
	private BlasonType type;
	
	public Blason() {
		super();
		this.lvl = 0;
	}
	
	public Blason(Map<Language, String> name, int lvl, BlasonType type, Calculable[] effects) {
		super(name, effects);
		this.lvl = lvl;
		this.type = type;
		this.icon = setIcon(type == BlasonType.OFFENSIVE ? "atk" : "def");
	}
	
	public enum BlasonType {
		OFFENSIVE(0), DEFENSIVE(1);
		
		public final int type;
		 
	    private BlasonType(int type) {
	        this.type = type;
	    }
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public BlasonType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Blason.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getSelectorInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	public static Blason get(String name) {
		for(Blason blason : Blason.data) {
			if(blason.getName(Language.FR).equals(name)) {
				return blason;
			}
		}
		
		return null;
	}
	
	public static Blason[] getPossibleBlason(int lvl, BlasonType type) {
		ArrayList<Blason> result = new ArrayList<>();
		
		result.add(new Blason());
		
		for(Blason blason : Blason.data) {
			if(blason.getLvl() <= lvl && blason.getType() == type) {
				result.add(blason);
			}
		}
		
		return result.toArray(new Blason[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvl;
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
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
		Blason other = (Blason) obj;
		if (this.lvl != other.lvl) {
			return false;
		}
		return this.type == other.type;
	}
}
