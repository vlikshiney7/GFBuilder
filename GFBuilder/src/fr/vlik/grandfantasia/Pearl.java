package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipable.Armor;
import fr.vlik.grandfantasia.equipable.Weapon;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Pearl implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Pearl.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Pearl[] dataWeapon = Loader.getWeaponPearl();
	private static Pearl[] dataArmor = Loader.getArmorPearl();
	private static Pearl[] dataWeaponCost = Loader.getWeaponCostPearl();
	private static Pearl[] dataArmorCost = Loader.getArmorCostPearl();
	
	private String name;
	private Quality quality;
	private Quality restricStuff;
	private boolean cumulable;
	private Icon icon;
	private Calculable[] effects;
	
	public Pearl() {
		this.name = "Aucun";
		this.quality = Quality.GREY;
		this.restricStuff = Quality.GREY;
		this.cumulable = true;
		this.icon = setIcon("null");
	}
	
	public Pearl(String name, Quality quality, Quality restricStuff, boolean cumulable, String path, Calculable[] effects) {
		this.name = name;
		this.restricStuff = restricStuff;
		this.cumulable = cumulable;
		this.quality = quality;
		this.icon = setIcon(path);
		this.effects = effects;
	}

	public String getName() {
		return this.name;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	public Quality getRestricStuff() {
		return this.restricStuff;
	}
	
	public boolean isCumulable() {
		return this.cumulable;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		
		for(int i = 0; i < this.effects.length; i++) {
			Calculable c = this.effects[i];
			
			if(c instanceof Effect) {
				tab[i] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof Proc) {
				tab[i] = new Proc((Proc) c);
			}
		}
		
		return tab;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Pearl.class.getResource(Tools.PATH24 + this.quality.index + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Pearl.class.getResource(PATH + path + Tools.PNG));
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
		
		if (!(obj instanceof Pearl)) {
			return false;
		}
		
		Pearl pearl = (Pearl) obj;
		boolean b = this.name.equals(pearl.name)
				&& this.quality == pearl.quality;
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		if(this.effects != null) {
			for(Calculable c : this.effects) {
				tooltip.append(c.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Pearl getWeapon(String name) {
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getArmor(String name) {
		for(Pearl pearl : Pearl.dataArmor) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getWeaponCost(String name) {
		for(Pearl pearl : Pearl.dataWeaponCost) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl getArmorCost(String name) {
		for(Pearl pearl : Pearl.dataArmorCost) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl[] getPossibleWeaponPearl(Weapon weapon) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getRestricStuff() != null) {
				if(weapon.getQuality() == pearl.getRestricStuff()) {
					result.add(pearl);
				}
			} else {
				result.add(pearl);
			}
		}
		
		Pearl[] cast = new Pearl[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Pearl[] getPossibleArmorPearl(Armor armor) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataWeapon) {
			if(pearl.getRestricStuff() != null) {
				if(armor.getQuality() == pearl.getRestricStuff()) {
					result.add(pearl);
				}
			} else {
				result.add(pearl);
			}
		}
		
		Pearl[] cast = new Pearl[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Pearl[] getWeaponCostPearl() {
		return Pearl.dataWeaponCost;
	}
	
	public static Pearl[] getArmorCostPearl() {
		return Pearl.dataArmorCost;
	}
	
	public static boolean isAlreadyCount(ArrayList<Pearl> notCombinablePearl, Pearl pearl) {
		boolean result = false;
		
		for(Pearl compare : notCombinablePearl) {
			if(compare.equals(pearl)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
