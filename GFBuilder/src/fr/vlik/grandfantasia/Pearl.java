package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Pearl implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Pearl.class.getSimpleName().toLowerCase() + "/";
	private static Pearl[] dataWeapon;
	private static Pearl[] dataArmor;
	private static Pearl[] dataWeaponCost;
	private static Pearl[] dataArmorCost;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private boolean purpulOnly;
	private boolean cumulable;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Pearl(String name, Quality quality, boolean purpulOnly, boolean cumulable, String path, String[] effects) {
		this.name = name;
		this.purpulOnly = purpulOnly;
		this.cumulable = cumulable;
		this.quality = quality;
		setIcon(path);
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}

	public String getName() {
		return this.name;
	}
	
	public Quality getQuality() {
		return this.quality;
	}

	public boolean isPurpleOnly() {
		return this.purpulOnly;
	}
	
	public boolean isCumulable() {
		return this.cumulable;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	@Override
	public void setIcon(String path) {
		ImageIcon back = new ImageIcon(Pearl.class.getResource(Tools.PATH24 + this.quality.index + ".png"));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Pearl.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = (object != null) ? Tools.constructIcon(back, object) : back;
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
		
		if(b && this.effects.size() == pearl.effects.size()) {
			for(int i = 0; i < this.effects.size(); i++) {
				if(!this.effects.get(i).equals(pearl.getEffects().get(i))) {
					return false;
				}
			}
		} else {
			return false;
		}
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<Pearl>> list = new ArrayList<ArrayList<Pearl>>();
		String[] filesName = { "weapon/pearl", "armor/pearl", "costume/pearlWeapon", "costume/pearlArmor" };
		
		for(int i = 0; i < filesName.length; i++) {
			list.add(new ArrayList<Pearl>());
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						Pearl.class.getResourceAsStream(Tools.RESOURCE + filesName[i] + ".txt"), "UTF-8"));
			) {
				String line = reader.readLine();
				while (line != null) {
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1] + ".png";
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[1])];
					
					String[] effects = new String[Integer.parseInt(lineSplit[4])];
					for(int j = 0; j < effects.length; j++) effects[j] = lineSplit[j+5];
					
					Pearl pearl = new Pearl(lineSplit[0], quality, Boolean.parseBoolean(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path, effects);
					list.get(i).add(pearl);
					
					line = reader.readLine();
				}
			}  catch (IOException e) {
				System.out.println("Error with " + Pearl.class.getClass().getSimpleName() + " class");
			}
		}
		
		Pearl.dataWeapon = new Pearl[list.get(0).size()];
		for(int i = 0; i < dataWeapon.length; i++) {
			dataWeapon[i] = list.get(0).get(i);
		}
		
		Pearl.dataArmor = new Pearl[list.get(1).size()];
		for(int i = 0; i < dataArmor.length; i++) {
			dataArmor[i] = list.get(1).get(i);
		}
		
		
		Pearl.dataWeaponCost = new Pearl[list.get(2).size()];
		for(int i = 0; i < dataWeaponCost.length; i++) {
			dataWeaponCost[i] = list.get(2).get(i);
		}
		
		Pearl.dataArmorCost = new Pearl[list.get(3).size()];
		for(int i = 0; i < dataArmorCost.length; i++) {
			dataArmorCost[i] = list.get(3).get(i);
		}
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
	
	public static Pearl getCost(String name) {
		for(Pearl pearl : Pearl.dataWeaponCost) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		for(Pearl pearl : Pearl.dataArmorCost) {
			if(pearl.getName().equals(name)) {
				return pearl;
			}
		}
		
		return null;
	}
	
	public static Pearl[] getPossibleWeaponPearl(Quality quality) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		for(int i = 0; i < Pearl.dataWeapon.length; i++) {
			if(Pearl.dataWeapon[i].isPurpleOnly()) {
				if(quality == Quality.PURPLE) {
					result.add(Pearl.dataWeapon[i]);
				}
			} else {
				result.add(Pearl.dataWeapon[i]);
			}
		}
		
		Pearl[] cast = new Pearl[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Pearl[] getPossibleArmorPearl(Quality quality) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		for(int i = 0; i < Pearl.dataArmor.length; i++) {
			if(Pearl.dataArmor[i].isPurpleOnly()) {
				if(quality == Quality.PURPLE) {
					result.add(Pearl.dataArmor[i]);
				}
			} else {
				result.add(Pearl.dataArmor[i]);
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
