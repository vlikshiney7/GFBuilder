package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Filtrable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Bullet extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Projectile");
		put(Language.EN, "Projectile");
	}};
	
	private static final String PATH = Tools.RESOURCE + Bullet.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Bullet[] data = LoaderEquip.getBullet();
	
	private static Tag[] tags = new Tag[] { Tag.GVG, Tag.MARCHAND, Tag.SPRITE, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE };
	
	private int lvl;
	private boolean reinca;
	
	private Tag tag;
	
	public Bullet() {
		super();
		this.lvl = 0;
		this.reinca = false;
	}
	
	public Bullet(Map<Language, String> name, int lvl, Quality quality, boolean reinca, String path, Tag tag, Effect[] effects) {
		this(name, lvl, quality, reinca, path, effects);
		this.tag = tag;
	}
	
	public Bullet(Map<Language, String> name, int lvl, Quality quality, boolean reinca, String path, Effect[] effects) {
		super(name, quality, effects);
		this.lvl = lvl;
		this.reinca = reinca;
		this.icon = setIcon(path);
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public Tag getTag() {
		return this.tag;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Bullet.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
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
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Bullet)) {
			return false;
		}
		
		Bullet bullet = (Bullet) obj;
		boolean b = this.name.equals(bullet.name)
				&& this.lvl == bullet.lvl
				&& this.quality == bullet.quality;
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	public static Bullet get(String name) {
		for(Bullet bullet : Bullet.data) {
			if(bullet.getName(Language.FR).equals(name)) {
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
		
		return result.toArray(new Bullet[result.size()]);
	}
	
	public static Bullet[] getPossibleBullet(int lvl, Reinca reinca, String key, Filtrable[] filter, Bullet choice, boolean andValue) {
		ArrayList<Bullet> result = new ArrayList<Bullet>();
		
		result.add(new Bullet());
		if(!choice.equals(new Bullet())) {
			result.add(choice);
		}
		
		for(Bullet bullet : Bullet.data) {
			if(bullet.getLvl() <= lvl) {
				if(!bullet.isReinca()) {
					if(andValue) {
						if(Tools.searchOnName(key, bullet.getMap(), andValue)
							&& Tools.contains(filter, bullet.getQuality()) && Tools.contains(filter, bullet.getTag())) {
							
							if(!choice.equals(bullet)) {
								result.add(bullet);
							}
						}
					} else {
						if(Tools.searchOnName(key, bullet.getMap(), andValue)
							|| Tools.contains(filter, bullet.getQuality()) || Tools.contains(filter, bullet.getTag())) {
							
							if(!choice.equals(bullet)) {
								result.add(bullet);
							}
						}
					}
				} else {
					if(reinca.getLvl() > 0) {
						if(andValue) {
							if(Tools.searchOnName(key, bullet.getMap(), andValue)
								&& Tools.contains(filter, bullet.getQuality()) && Tools.contains(filter, bullet.getTag())) {
								
								if(!choice.equals(bullet)) {
									result.add(bullet);
								}
							}
						} else {
							if(Tools.searchOnName(key, bullet.getMap(), andValue)
								|| Tools.contains(filter, bullet.getQuality()) || Tools.contains(filter, bullet.getTag())) {
								
								if(!choice.equals(bullet)) {
									result.add(bullet);
								}
							}
						}
					}
				}
			}
		}
		
		return result.toArray(new Bullet[result.size()]);
	}
	
	public static Tag[] getTags() {
		return Bullet.tags;
	}
	
	public static Quality[] getQualities() {
		return Bullet.qualities;
	}
}
