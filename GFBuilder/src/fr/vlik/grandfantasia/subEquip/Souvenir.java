package fr.vlik.grandfantasia.subEquip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Souvenir extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Souvenir");
		put(Language.EN, "Souvenir");
	}};
	
	private static final String PATH = Tools.RESOURCE + Souvenir.class.getSimpleName().toLowerCase() + "/";
	private static Souvenir[] data = LoaderSubEquip.getSouvenir();
	
	private int lvl;
	
	public Souvenir() {
		super();
		this.lvl = 0;
	}
	
	public Souvenir(Map<Language, String> name, int lvl, Quality quality, String path, Effect[] effects) {
		super(name, quality, effects);
		this.lvl = lvl;
		this.icon = setIcon(path);
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Souvenir.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Souvenir.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	public static Souvenir get(String name) {
		for(Souvenir souvenir : Souvenir.data) {
			if(souvenir.getName(Language.FR).equals(name)) {
				return souvenir;
			}
		}
		
		return null;
	}
	
	public static Souvenir[] getPossibleSouvenir(int lvl) {
		ArrayList<Souvenir> result = new ArrayList<Souvenir>();
		
		result.add(new Souvenir());
		
		for(Souvenir souvenir : Souvenir.data) {
			if(souvenir.getLvl() <= lvl) {
				result.add(souvenir);
			}
		}
		
		return result.toArray(new Souvenir[result.size()]);
	}
}
