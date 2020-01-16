package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;

public class MultiEffect {
	
	private static MultiEffect[] data;
	static {
		loadData();
	}
	
	private String code;
	private int lvlMin;
	private int lvlMax;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public MultiEffect(String code, int lvlMin, ArrayList<ArrayList<Effect>> effects) {
		this.code = code;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMin + effects.size() - 1;
		this.effects = effects;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public ArrayList<ArrayList<Effect>> getEffects() {
		ArrayList<ArrayList<Effect>> list = new ArrayList<ArrayList<Effect>>(this.effects.size());
		
		for(int i = 0; i < list.size(); i++) {
			list.add(new ArrayList<Effect>(effects.get(i).size()));
			
			for(Effect effect : effects.get(i)) {
				list.get(i).add(new Effect(effect));
			}
		}
		
		return list;
	}
	
	public ArrayList<Effect> getEffectsFromLvl(int lvl) {
		int index = lvl > this.lvlMax ? this.lvlMax - this.lvlMin : lvl - this.lvlMin;
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.get(index).size());
		for(Effect effect : this.effects.get(index)) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public static void loadData() {
		ArrayList<MultiEffect> list = new ArrayList<MultiEffect>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MultiEffect.class.getResourceAsStream(Tools.RESOURCE + "multiEffect.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineInfoSplit = line.split("/");
				ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(Integer.parseInt(lineInfoSplit[3]));
				
				for(int i = 0; i < Integer.parseInt(lineInfoSplit[3]); i++) {
					effects.add(new ArrayList<Effect>(Integer.parseInt(lineInfoSplit[1])));
				}
				
				for(int i = 0; i < Integer.parseInt(lineInfoSplit[1]); i++) {
					line = reader.readLine();
					
					String[] lineSplit = line.split("/");
					TypeEffect typeEffect = TypeEffect.valueOf(lineSplit[0]);
					boolean isPercent = Boolean.parseBoolean(lineSplit[1]);
					String[] values = lineSplit[2].split(",");
					boolean isReinca = Boolean.parseBoolean(lineSplit[3]);
					
					WeaponType withWeapon;
					try {
						withWeapon = WeaponType.values()[Integer.parseInt(lineSplit[4])];
					} catch (ArrayIndexOutOfBoundsException e) {
						withWeapon = WeaponType.NONE;
					}
					
					for(int j = 0; j < values.length; j++) {
						effects.get(j).add(new Effect(typeEffect, isPercent, Double.parseDouble(values[j]), isReinca, withWeapon, null));
					}
				}
				
				list.add(new MultiEffect(lineInfoSplit[0], Integer.parseInt(lineInfoSplit[2]), effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + MultiEffect.class.getClass().getSimpleName() + " class");
		}
		
		MultiEffect.data = new MultiEffect[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static MultiEffect getFromCode(String code) {
		for(MultiEffect multi : MultiEffect.data) {
			if(multi.getCode().equals(code)) return multi;
		}
		
		return null;
	}
}
