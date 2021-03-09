package fr.vlik.grandfantasia.subEquip;

import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Bague extends CompleteBuff {
	
	private static final String PATH = Tools.RESOURCE + Bague.class.getSimpleName().toLowerCase() + "/";
	private static Bague[] data = LoaderSubEquip.getBague();
	
	public Bague(Map<Language, String> name, Quality quality, String path, Effect[] effects) {
		super(name, quality, effects);
		this.icon = setIcon(path);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Bague.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Bague.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public static Bague[] getData() {
		return Bague.data;
	}
	
	public static Bague get(String name, Language lang) {
		for(Bague bague : Bague.data) {
			if(bague.getName(lang).equals(name)) {
				return bague;
			}
		}
		
		return null;
	}
}
