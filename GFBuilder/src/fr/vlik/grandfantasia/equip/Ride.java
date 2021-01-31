package fr.vlik.grandfantasia.equip;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.subEquip.Anima;

public class Ride implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Ride.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Ride[] data = Loader.getRide();
	
	private String name;
	private int lvl;
	private boolean reinca;
	private Effect effect;
	private Icon icon;
	
	public Ride() {
		this.name = "Aucun";
		this.lvl = 0;
		this.reinca = false;
		this.effect = new Effect(TypeEffect.Depla, false, 0);
		this.icon = setIcon("null");
	}
	
	public Ride(String name, int lvl, boolean reinca, String path, Effect effect) {
		this.name = name;
		this.lvl = lvl;
		this.reinca = reinca;
		this.effect = effect;
		this.icon = setIcon(path);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public Effect getEffect() {
		return new Effect(this.effect);
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	@Override
	public Color getColor() {
		return this.name.equals("Rien") ? Tools.itemColor[0] : Tools.itemColor[4];
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Anima.class.getResource(Tools.PATH32 + "4.png"));
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
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		tooltip.append(this.effect.getTooltip());
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Ride get(String name) {
		for(Ride ride : Ride.data) {
			if(ride.getName().equals(name)) {
				return ride;
			}
		}
		
		return null;
	}
	
	public static Ride[] getPossibleMount(int lvl, Reinca reinca) {
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
		
		Ride[] cast = new Ride[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
