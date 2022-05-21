package fr.vlik.grandfantasia.subequip;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.MultiEffect;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Anima extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Anima");
		put(Language.EN, "Anima");
	}};
	
	private static final String PATH = Tools.RESOURCE + Anima.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Anima[] data = LoaderSubEquip.getAnima();
	
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Anima() {
		super();
		this.isMultiEffect = false;
	}
	
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
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Anima.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
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
		return get(Anima.data, name, Language.FR);
	}
}
