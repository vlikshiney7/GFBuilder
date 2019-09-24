package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;

public class Pearl {
	
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
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Pearl(String name, Quality quality, boolean purpulOnly, boolean cumulable, String path, String[] effects) {
		this.name = name;
		this.purpulOnly = purpulOnly;
		this.cumulable = cumulable;
		this.quality = quality;
		this.img = setIcon(path, this.quality);
		
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

	public boolean isPurpulOnly() {
		return this.purpulOnly;
	}
	
	public boolean isCumulable() {
		return this.cumulable;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	
	public Color getColor() {
		return Consts.itemColor[this.quality.index];
	}
	
	private BufferedImage setIcon(String path, Quality quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/16-" + quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/pearls/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
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
		String[] filesName = { "weapons/pearl", "armors/pearl", "costumes/pearlWeapon", "costumes/pearlArmor" };
		
		for(int i = 0; i < filesName.length; i++) {
			list.add(new ArrayList<Pearl>());
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/" + filesName[i] + ".txt"), "UTF-8"));
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
	
	public static Pearl[] getPossibleWeaponPearl(Quality quality) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		for(int i = 0; i < Pearl.dataWeapon.length; i++) {
			if(Pearl.dataWeapon[i].isPurpulOnly()) {
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
			if(Pearl.dataArmor[i].isPurpulOnly()) {
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
