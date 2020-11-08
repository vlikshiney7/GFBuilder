package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Effect;

public class Bullet implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Bullet.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Bullet[] data = Loader.getBullet();
	
	private String name;
	private int lvl;
	private Quality quality;
	private boolean reinca;
	private Icon icon;
	private Effect[] effects;
	
	public Bullet() {
		this.name = "Aucun";
		this.lvl = 0;
		this.quality = Quality.GREY;
		this.reinca = false;
		this.icon = setIcon("null");
	}
	
	public Bullet(String name, int lvl, Quality quality, boolean reinca, String path, Effect[] effects) {
		this.name = name;
		this.lvl = lvl;
		this.quality = quality;
		this.reinca = reinca;
		this.icon = setIcon(path);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	public Effect[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Effect[] tab = new Effect[this.effects.length];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Effect(this.effects[i]);
		}
		
		return tab;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Bullet.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Bullet.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		if(this.effects != null) {
			for(Effect e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Bullet get(String name) {
		for(Bullet bullet : Bullet.data) {
			if(bullet.getName().equals(name)) {
				return bullet;
			}
		}
		
		return null;
	}
	
	public static Bullet[] getPossibleBullet(int lvl, Reinca reinca) {
		ArrayList<Bullet> result = new ArrayList<Bullet>();
		
		result.add(new Bullet());
		
		for(Bullet bullet : Bullet.data) {
			if(bullet.getLvl() <= lvl) {
				if(!bullet.isReinca()) {
					result.add(bullet);
				} else {
					if(reinca.getLvl() > 0) {
						result.add(bullet);
					}
				}
			}
		}
		
		Bullet[] cast = new Bullet[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
