package fr.vlik.grandfantasia.equip;

import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Bullet extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Projectile");
		put(Language.EN, "Projectile");
	}};
	
	private static final String PATH = Tools.RESOURCE + Bullet.class.getSimpleName().toLowerCase() + File.separator;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
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
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Bullet.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
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
		ArrayList<Bullet> result = new ArrayList<>();
		
		result.add(new Bullet());
		
		for(Bullet bullet : Bullet.data) {
			Map<Object, Object> properties = new HashMap<>();
			properties.put(bullet.getLvl(), lvl);
			properties.put(bullet.isReinca(), reinca);
			
			if(Tools.evaluateProperties(properties)) {
				result.add(bullet);
			}
		}
		
		return result.toArray(new Bullet[result.size()]);
	}
	
	public static Bullet[] applyFilters(Bullet[] possible, Bullet choice, String key, Filterable[] filter, boolean andValue) {
		ArrayList<Bullet> result = new ArrayList<>();
		
		result.add(new Bullet());
		if(!choice.equals(new Bullet())
				&& Tools.containObject(possible, choice)) {
			
			result.add(choice);
		}
		
		for(Bullet bullet : possible) {
			boolean[] filters = new boolean[] {
				Tools.searchOnName(key, bullet.getMap(), andValue),
				Tools.containObject(filter, bullet.getQuality()),
				Tools.containObject(filter, bullet.getTag()),
			};
			
			if(andValue ? Filterable.andValue(filters) : Filterable.orValue(filters)
					&& !choice.equals(bullet)) {
				
				result.add(bullet);
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvl;
		result = prime * result + (this.reinca ? 1231 : 1237);
		result = prime * result + ((this.tag == null) ? 0 : this.tag.hashCode());
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
		Bullet other = (Bullet) obj;
		if (this.lvl != other.lvl) {
			return false;
		}
		if (this.reinca != other.reinca) {
			return false;
		}
		return this.tag == other.tag;
	}
}
