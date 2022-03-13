package fr.vlik.grandfantasia.subequip;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Souvenir extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Souvenir");
		put(Language.EN, "Souvenir");
	}};
	
	private static final String PATH = Tools.RESOURCE + Souvenir.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Souvenir[] data = LoaderSubEquip.getSouvenir();
	
	private int lvl;
	
	public Souvenir() {
		super();
		this.lvl = 0;
	}
	
	public Souvenir(Souvenir souvenir) {
		super(souvenir.getMap(), souvenir.getQuality(), souvenir.getEffects());
		this.lvl = this.getLvl();
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
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Souvenir.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	public void addStarBonus(double coef) {
		if(this.effects != null) {
			for(Calculable c : this.effects) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					
					if(e.getType().isUpgradable && !e.isPercent() && e.getWithReinca()) {
						e.changeValue(coef);
					}
				}
			}
		}
	}
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
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
		ArrayList<Souvenir> result = new ArrayList<>();
		
		result.add(new Souvenir());
		
		for(Souvenir souvenir : Souvenir.data) {
			if(souvenir.getLvl() <= lvl) {
				result.add(souvenir);
			}
		}
		
		return result.toArray(new Souvenir[result.size()]);
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
		Souvenir other = (Souvenir) obj;
		return this.lvl == other.lvl;
	}
}
