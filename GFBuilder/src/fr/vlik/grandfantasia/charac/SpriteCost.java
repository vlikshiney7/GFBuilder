package fr.vlik.grandfantasia.charac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static SpriteCost[] data = LoaderCharac.getSpriteCost();
	
	private SpriteCostType costType;
	
	public SpriteCost() {
		super();
	}
	
	public SpriteCost(Map<Language, String> name, Quality quality, SpriteCostType costType, String path, Calculable[] effects) {
		super(name, quality, path, effects);
		this.costType = costType;
	}
	
	public enum SpriteCostType {
		HEAD, BODY;
	}
	
	public SpriteCostType getType() {
		return this.costType;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(SpriteCost.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(SpriteCost.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	public static SpriteCost get(String name) {
		return get(SpriteCost.data, name, Language.FR);
	}
	
	public static SpriteCost[] getPossibleSpriteCost(int lvl, Reinca reinca, SpriteCostType costType) {
		List<SpriteCost> result = new ArrayList<>();
		
		result.add(new SpriteCost());
		
		if(costType == SpriteCostType.HEAD) {
			for(SpriteCost spriteCost : SpriteCost.data) {
				if(spriteCost.getType() == costType) {
					result.add(spriteCost);
				}
			}
		} else {
			if(lvl > 20 || reinca.getLvl() >= 1) {
				for(SpriteCost spriteCost : SpriteCost.data) {
					if(spriteCost.getType() == costType) {
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
