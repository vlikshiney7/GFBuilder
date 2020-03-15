package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class MultiEffect {
	
	private static MultiEffect[] data;
	static {
		loadData();
	}
	
	private String code;
	private int lvlMin;
	private int lvlMax;
	private Effect[][] effects;
	
	public MultiEffect(String code, int lvlMin, Effect[][] effects) {
		this.code = code;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMin + effects.length - 1;
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
	
	public Effect[][] getEffects() {
		Effect[][] tabs = new Effect[this.effects.length][];
		
		for(int i = 0; i < tabs.length; i++) {
			Effect[] tab = new Effect[this.effects[i].length];
			
			for(int j = 0; j < tab.length; j++) {
				tab[j] = this.effects[i][j];
			}
			
			tabs[i] = tab;
		}
		
		return tabs;
	}
	
	public Calculable[] getEffectsFromLvl(int lvl) {
		int index = lvl > this.lvlMax ? this.lvlMax - this.lvlMin : lvl - this.lvlMin;
		
		Calculable[] tab = new Calculable[this.effects[index].length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.effects[index][i];
		}
		
		return tab;
	}
	/*
	public String toCode() {
		String code = "new MultiEffect(\"";
		code += this.code + "\", ";
		code += this.lvlMin + ", ";
		code += "new ArrayList<ArrayList<Effect>>() {{\n";
		
		for(ArrayList<Effect> array : this.effects) {
			code += "\tadd(new ArrayList<Effect>() {{\n";
			
			for(Effect e : array) {
				code += "\t\tadd(new Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
				
				if(e.getTransfert() != null) {
					code += ", " + e.getWithReinca();
					code += ", WeaponType." + e.getWithWeapon();
					code += ", TypeEffect." + e.getTransfert();
					continue;
				}
				
				if(e.getWithWeapon() != WeaponType.NONE) {
					code += ", " + e.getWithReinca();
					code += ", WeaponType." + e.getWithWeapon();
					continue;
				}
				
				if(e.getWithReinca()) {
					code += ", " + e.getWithReinca();
				}
				
				code += "));\n";
			}
			
			code += "\t}});\n";
		}
		
		code += "}})";
		
		return code;
	}*/
	
	public static void loadData() {
		ArrayList<MultiEffect> list = new ArrayList<MultiEffect>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MultiEffect.class.getResourceAsStream(Tools.RESOURCE + "multiEffect.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineInfoSplit = line.split("/");
				Effect[][] effects = new Effect[Integer.parseInt(lineInfoSplit[3])][];
				
				for(int i = 0; i < Integer.parseInt(lineInfoSplit[3]); i++) {
					effects[i] = new Effect[Integer.parseInt(lineInfoSplit[1])];
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
						effects[j][i] = new Effect(typeEffect, isPercent, Double.parseDouble(values[j]), isReinca, withWeapon);
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
