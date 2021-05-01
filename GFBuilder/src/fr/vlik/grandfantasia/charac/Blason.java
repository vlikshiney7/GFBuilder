package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class Blason extends IconBuff {
	
	private static final String PATH = Tools.RESOURCE + "sprite/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Blason[] data = LoaderCharacUpgrade.getBlason();
	
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
	
	public static enum BlasonType {
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
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Blason.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Blason)) {
			return false;
		}
		
		Blason equip = (Blason) obj;
		boolean b = this.name.equals(equip.name)
				&& this.lvl == equip.lvl;
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
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
		ArrayList<Blason> result = new ArrayList<Blason>();
		
		result.add(new Blason());
		
		for(Blason blason : Blason.data) {
			if(blason.getLvl() <= lvl && blason.getType() == type) {
				result.add(blason);
			}
		}
		
		return result.toArray(new Blason[result.size()]);
	}
}
