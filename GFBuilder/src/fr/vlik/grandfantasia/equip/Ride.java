package fr.vlik.grandfantasia.equip;

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
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Ride extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Monture");
		put(Language.EN, "Ride");
	}};
	
	private static final String PATH = Tools.RESOURCE + Ride.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Ride[] data = LoaderEquip.getRide();
	
	private int lvl;
	private boolean reinca;
	private RideType type = RideType.NORMAL;
	
	public Ride() {
		super();
		this.lvl = 0;
		this.quality = Quality.GREY;
		this.reinca = false;
	}
	
	public Ride(Map<Language, String> name, int lvl, boolean reinca, String path, Effect[] effects) {
		super(name, Quality.ORANGE, effects);
		this.lvl = lvl;
		this.reinca = reinca;
		this.icon = setIcon(path);
	}
	
	public Ride(Map<Language, String> name, int lvl, boolean reinca, RideType type, String path, Effect[] effects) {
		super(name, Quality.ORANGE, effects);
		this.lvl = lvl;
		this.reinca = reinca;
		this.type = type;
		this.icon = setIcon(path);
	}
	
	public enum RideType implements EquipType {
		NORMAL, NERF;
	}
	
	public RideType getType() {
		return this.type;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Ride.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Ride.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	@Override
	public String getSelectorInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	public static Ride get(String name) {
		for(Ride ride : Ride.data) {
			if(ride.getName(Language.FR).equals(name)) {
				return ride;
			}
		}
		
		return null;
	}
	
	public static Ride[] getPossibleRide(int lvl, Reinca reinca) {
		ArrayList<Ride> result = new ArrayList<>();
		
		result.add(new Ride());
		
		if(reinca.getLvl() > 0) {
			for(Ride ride : Ride.data) {
				if(ride.getLvl() <= lvl) {
					result.add(ride);
				}
			}
		} else {
			for(Ride ride : Ride.data) {
				if(ride.getLvl() <= lvl && !ride.isReinca()) {
					result.add(ride);
				}
			}
		}
		
		return result.toArray(new Ride[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvl;
		result = prime * result + (this.reinca ? 1231 : 1237);
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
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
		Ride other = (Ride) obj;
		if (this.lvl != other.lvl) {
			return false;
		}
		if (this.reinca != other.reinca) {
			return false;
		}
		if (this.type != other.type) {
			return false;
		}
		return true;
	}
}
