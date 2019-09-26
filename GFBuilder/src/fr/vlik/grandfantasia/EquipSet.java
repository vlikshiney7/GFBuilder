package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import fr.vlik.grandfantasia.equipment.Armor;
import fr.vlik.grandfantasia.equipment.Cape;
import fr.vlik.grandfantasia.equipment.Ring;

public class EquipSet {
	
	private static EquipSet[] data;
	static {
		loadData();
	}
	
	private String name;
	private String code;
	private final int nbCurrentUsed;
	private ArrayList<Effect> with2 = new ArrayList<Effect>();
	private ArrayList<Effect> with3 = new ArrayList<Effect>();
	private ArrayList<Effect> with4 = new ArrayList<Effect>();
	private ArrayList<Effect> with5 = new ArrayList<Effect>();
	
	public EquipSet(String name, String code, String[] with3, String[] with4, String[] with5) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		for(int i = 0; i < with3.length; i++) {
			this.with3.add(new Effect(with3[i]));
		}
		for(int i = 0; i < with4.length; i++) {
			this.with4.add(new Effect(with4[i]));
		}
		for(int i = 0; i < with5.length; i++) {
			this.with5.add(new Effect(with5[i]));
		}
		
	}
	
	public EquipSet(Armor[] armors) {
		String equipCode[] = { armors[0].getSetCode(), armors[1].getSetCode(), armors[2].getSetCode(), armors[3].getSetCode(), armors[4].getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		
		for(int i = 0; i < EquipSet.data.length; i++) {
			if(EquipSet.data[i].getCode().equals(this.code)) {
				this.name = EquipSet.data[i].getName();
				this.with3 = EquipSet.data[i].getWith3();
				this.with4 = EquipSet.data[i].getWith4();
				this.with5 = EquipSet.data[i].getWith5();
				break;
			}
		}
		
	}

	public EquipSet(Ring[] rings, Cape cape) {
		String equipCode[] = { rings[0].getSetCode(), rings[1].getSetCode(), cape.getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		for(int i = 0; i < EquipSet.data.length; i++) {
			if(EquipSet.data[i].getCode().equals(this.code)) {
				this.name = EquipSet.data[i].getName();
				this.with2 = EquipSet.data[i].getWith2();
				this.with3 = EquipSet.data[i].getWith3();
				break;
			}
		}
	}

	public String getName() {
		return this.name;
	}

	public String getCode() {
		return this.code;
	}
	
	public ArrayList<Effect> getWith2() {
		return new ArrayList<Effect>(with2);
	}

	public ArrayList<Effect> getWith3() {
		return new ArrayList<Effect>(with3);
	}
	
	public ArrayList<Effect> getWith4() {
		return new ArrayList<Effect>(with4);
	}
	
	public ArrayList<Effect> getWith5() {
		return new ArrayList<Effect>(with5);
	}

	public int getNbCurrentUsed() {
		return this.nbCurrentUsed;
	}
	
	private int getMaxCount(String[] equipCode) {
		Arrays.sort(equipCode);
		int max_count = 1;
		int curr_count = 1;
		String currentCode = equipCode[0];
		
		for(int i = 1; i < equipCode.length; i++) {
			if(equipCode[i].equals(equipCode[i-1])) curr_count++;
			else {
				if(curr_count > max_count) {
					max_count = curr_count;
					currentCode = equipCode[i-1];
				}
				curr_count = 1;
			}
		}
		if(curr_count > max_count) {
			max_count = curr_count;
			currentCode = equipCode[equipCode.length-1];
		}
		
		this.code = currentCode;
		
		return max_count;
	}
	
	public static void loadData() {
		ArrayList<EquipSet> list = new ArrayList<EquipSet>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					EquipSet.class.getResourceAsStream(Consts.RESOURCE + "armor/set.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] nbBonus = lineSplit[2].split(",");
				String[] with3 = new String[Integer.parseInt(nbBonus[0])];
				String[] with4 = new String[Integer.parseInt(nbBonus[1])];
				String[] with5 = new String[Integer.parseInt(nbBonus[2])];
				for(int i = 0; i < with3.length; i++) with3[i] = lineSplit[i+3];
				for(int i = 0; i < with4.length; i++) with4[i] = lineSplit[i+3+with3.length];
				for(int i = 0; i < with5.length; i++) with5[i] = lineSplit[i+3+with3.length+with4.length];
				
				list.add(new EquipSet(lineSplit[0], lineSplit[1], with3, with4, with5));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + EquipSet.class.getClass().getSimpleName() + " class");
		}
		
		EquipSet.data = new EquipSet[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static EquipSet[] getData() {
		return EquipSet.data;
	}
}
