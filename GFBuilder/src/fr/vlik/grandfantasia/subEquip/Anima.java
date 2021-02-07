package fr.vlik.grandfantasia.subEquip;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.CompleteBuff;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.MultiEffect;
import fr.vlik.grandfantasia.loader.subEquip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class Anima extends CompleteBuff {
	
	private static final String PATH = Tools.RESOURCE + Anima.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Anima[] data = LoaderSubEquip.getAnima();
	
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Anima(Map<Language, String> name, Quality quality, String path, Calculable[] effects) {
		super(name, quality, effects);
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Anima(Map<Language, String> name, Quality quality, String path, MultiEffect effects) {
		super(name, quality, null);
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public Calculable[] getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Anima.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Anima.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public static Anima[] getData(int lvl) {
		for(int i = 0; i < Anima.data.length; i++) {
			if(Anima.data[i].isMultiEffect()) {
				Anima.data[i].setEffects(lvl);
			}
		}
		
		return Anima.data;
	}
	
	public static Anima get(String name) {
		for(Anima anima : Anima.data) {
			if(anima.getName(Language.FR).equals(name)) {
				return anima;
			}
		}
		
		return null;
	}
}
