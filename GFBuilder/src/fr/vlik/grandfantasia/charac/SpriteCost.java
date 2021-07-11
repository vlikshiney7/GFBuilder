package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.charac.LoaderCharac;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class SpriteCost extends CompleteBuff {
	
	private static final String PATH = Tools.RESOURCE + "sprite/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static SpriteCost[] data = LoaderCharac.getSpriteCost();
	
	private SpriteCostType costType;
	
	public SpriteCost() {
		super();
		this.costType = SpriteCostType.BODY;
	}
	
	public SpriteCost(Map<Language, String> name, Quality quality, SpriteCostType costType, String path, Calculable[] effects) {
		super(name, quality, path, effects);
		this.costType = costType;
	}
	
	public static enum SpriteCostType {
		HEAD, BODY;
	}
	
	public SpriteCostType getType() {
		return this.costType;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(SpriteCost.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(SpriteCost.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public static SpriteCost get(String name) {
		for(SpriteCost spriteCost : SpriteCost.data) {
			if(spriteCost.getName(Language.FR).equals(name)) {
				return spriteCost;
			}
		}
		
		return null;
	}
	
	public static SpriteCost[] getPossibleSpriteCost(int lvl, SpriteCostType costType) {
		ArrayList<SpriteCost> result = new ArrayList<SpriteCost>();
		
		if(costType == SpriteCostType.HEAD) {
			for(SpriteCost spriteCost : SpriteCost.data) {
				if(spriteCost.getType() == costType) {
					result.add(spriteCost);
				}
			}
		} else {
			result.add(new SpriteCost());
			if(lvl > 20) {
				for(SpriteCost spriteCost : SpriteCost.data) {
					if(spriteCost.getType() == costType && lvl > 20) {
						result.add(spriteCost);
					}
				}
			}
		}
		
		return result.toArray(new SpriteCost[result.size()]);
	}
	
	public static SpriteCost[] getData() {
		return SpriteCost.data;
	}
}
