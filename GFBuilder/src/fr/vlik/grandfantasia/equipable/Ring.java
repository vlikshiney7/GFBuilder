package fr.vlik.grandfantasia.equipable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public final class Ring extends Equipment {
	
	public static String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Ring[] data;
	static {
		loadData();
	}

	private String setCode;
	private boolean uniqueEquip;
	
	public Ring(Ring ring) {
		super(ring.getMap(), ring.getGrades(), ring.getLvl(), ring.getQuality(), ring.isEnchantable(), ring.getEffects(), ring.getBonusXP());
		
		this.setCode = ring.getSetCode();
		this.uniqueEquip = ring.isUniqueEquip();
		this.icon = ring.getIcon();
	}
	
	public Ring(Map<Language, String> name, int lvl, Quality quality, boolean enchantable, String setCode, boolean uniqueEquip, String path, ArrayList<Calculable> effects, ArrayList<Effect> bonusXP) {
		super(name, new GradeName[] { GradeName.NONE } , lvl, quality, enchantable, effects, bonusXP);
		
		this.setCode = setCode;
		this.uniqueEquip = uniqueEquip;
		this.icon = setIcon(path);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isUniqueEquip() {
		return this.uniqueEquip;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Ring.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Ring.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) {
			return;
		}
		
		if(!this.enchantable) {
			return;
		}
		
		if(enchant.isFixValue()) {
			for(Effect e : enchant.getEffects()) {
				this.effects.add(e);
			}
		} else {
			for(Effect e : enchant.getEffects()) {
				int value = Enchantment.getValue(this, e.getType());
				boolean found = false;
				
				for(Calculable calculable : this.effects) {
					if(calculable instanceof Effect) {
						Effect get = (Effect) calculable;
							
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(value);
							
							found = true;
							break;
						}
					}
				}
				
				if(!found) {
					e.addEnchantValue(value);
					this.effects.add(e);
				}
			}
		}
	}
	
	public static void loadData() {
		ArrayList<Ring> list = new ArrayList<Ring>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Ring.class.getResourceAsStream(PATH + "ring.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1];
				
				Map<Language, String> names = new HashMap<Language, String>();
				names.put(Language.FR, lineSplit[0]);
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[3])];
				
				String[] effectSplit = lineSplit[6].split(",");
				
				ArrayList<Calculable> effects = new ArrayList<Calculable>(Integer.parseInt(effectSplit[0]));
				for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
					effects.add(new Effect(lineSplit[j+7]));
				
				ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
				for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
					bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
				
				
				Ring ring = new Ring(
						names, Integer.parseInt(lineSplit[1]), quality, Boolean.parseBoolean(lineSplit[4]),
						lineSplit[2], Boolean.parseBoolean(lineSplit[5]), path, effects, bonusXP
						);
				list.add(ring);
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Ring.class.getClass().getSimpleName() + " class");
		}
		
		Ring.data = new Ring[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Ring get(String name, Language lang) {
		for(Ring ring : Ring.data) {
			if(ring.getName(lang).equals(name)) {
				return ring;
			}
		}
		
		return null;
	}
	
	public static Ring[] getPossibleRing(int lvl, Ring toIgnore) {
		ArrayList<Ring> result = new ArrayList<Ring>();
		
		for(Ring ring : Ring.data) {
			if(ring.getLvl() <= lvl) {
				result.add(ring);
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		Ring[] cast = new Ring[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
