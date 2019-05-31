package fr.vlik.gfbuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class EquipSet {

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
	
	public EquipSet(ArrayList<EquipSet> listEquipSet, Armor[] armors) {
		String equipCode[] = { armors[0].getSetCode(), armors[1].getSetCode(), armors[2].getSetCode(), armors[3].getSetCode(), armors[4].getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		for(int i = 0; i < listEquipSet.size(); i++) {
			if(listEquipSet.get(i).getCode().equals(this.code)) {
				this.name = listEquipSet.get(i).getName();
				this.with3 = listEquipSet.get(i).getWith3();
				this.with4 = listEquipSet.get(i).getWith4();
				this.with5 = listEquipSet.get(i).getWith5();
				break;
			}
		}
		
	}

	public EquipSet(ArrayList<EquipSet> listEquipSet, Ring[] rings, Cape cape) {
		String equipCode[] = { rings[0].getSetCode(), rings[1].getSetCode(), cape.getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		for(int i = 0; i < listEquipSet.size(); i++) {
			if(listEquipSet.get(i).getCode().equals(this.code)) {
				this.name = listEquipSet.get(i).getName();
				this.with2 = listEquipSet.get(i).getWith2();
				this.with3 = listEquipSet.get(i).getWith3();
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
}
