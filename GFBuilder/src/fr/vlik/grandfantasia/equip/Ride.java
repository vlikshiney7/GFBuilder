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
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Ride extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Monture");
		put(Language.EN, "Ride");
	}};
	
	private static final String PATH = Tools.RESOURCE + Ride.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
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
	
	public static enum RideType implements EquipType {
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
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Ride.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
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
		ArrayList<Ride> result = new ArrayList<Ride>();
		
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
}
