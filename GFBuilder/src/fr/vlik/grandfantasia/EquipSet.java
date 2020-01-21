package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Armor;
import fr.vlik.grandfantasia.equipable.Cape;
import fr.vlik.grandfantasia.equipable.Ring;
import fr.vlik.grandfantasia.interfaces.Writable;

public class EquipSet implements Writable {
	
	private static EquipSet[] dataArmor;
	private static EquipSet[] dataCapeRing;
	static {
		loadData();
	}
	
	private String name;
	private String code;
	private int nbCurrentUsed;
	private ArrayList<Effect> with2 = new ArrayList<Effect>();
	private ArrayList<Effect> with3 = new ArrayList<Effect>();
	private ArrayList<Effect> with4 = new ArrayList<Effect>();
	private ArrayList<Effect> with5 = new ArrayList<Effect>();
	
	public EquipSet() {
		this.name = "Rien";
		this.code = "-1";
		this.nbCurrentUsed = 0;
	}
	
	private EquipSet(String name, String code, String[] with3, String[] with4, String[] with5) {
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
	
	private EquipSet(String name, String code, String[] with2, String[] with3) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		for(int i = 0; i < with2.length; i++) {
			this.with2.add(new Effect(with2[i]));
		}
		
		for(int i = 0; i < with3.length; i++) {
			this.with3.add(new Effect(with3[i]));
		}
	}
	
	public EquipSet(Armor[] armors) {
		String equipCode[] = { armors[0].getSetCode(), armors[1].getSetCode(), armors[2].getSetCode(), armors[3].getSetCode(), armors[4].getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		
		for(int i = 0; i < EquipSet.dataArmor.length; i++) {
			if(EquipSet.dataArmor[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataArmor[i].getName();
				this.with3 = EquipSet.dataArmor[i].getWith3();
				this.with4 = EquipSet.dataArmor[i].getWith4();
				this.with5 = EquipSet.dataArmor[i].getWith5();
				break;
			}
		}
		
	}

	public EquipSet(Ring[] rings, Cape cape) {
		String equipCode[] = { rings[0].getSetCode(), rings[1].getSetCode(), cape.getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		if(rings[0].getName().trim().equals(rings[1].getName().trim())) {
			this.nbCurrentUsed--;
		}
		
		for(int i = 0; i < EquipSet.dataCapeRing.length; i++) {
			if(EquipSet.dataCapeRing[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataCapeRing[i].getName();
				this.with2 = EquipSet.dataCapeRing[i].getWith2();
				this.with3 = EquipSet.dataCapeRing[i].getWith3();
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
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}

	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		tooltip.append("3 pièces :");
		for(Effect e : this.with3) {
			if(e.getType() != TypeEffect.NONE) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		tooltip.append("<br><br>");
		tooltip.append("4 pièces :");
		for(Effect e : this.with4) {
			if(e.getType() != TypeEffect.NONE) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		tooltip.append("<br><br>");
		tooltip.append("5 pièces :");
		for(Effect e : this.with5) {
			if(e.getType() != TypeEffect.NONE) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof EquipSet)) {
			return false;
		}
		
		EquipSet set = (EquipSet) obj;
		boolean b = this.name.equals(set.name)
				&& this.code == set.code
				&& this.nbCurrentUsed == set.nbCurrentUsed;
		
		return b;
	}
	
	public static void loadData() {
		ArrayList<ArrayList<EquipSet>> list = new ArrayList<ArrayList<EquipSet>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					EquipSet.class.getResourceAsStream(Tools.RESOURCE + "armor/set.txt"), "UTF-8"));
		) {
			list.add(new ArrayList<EquipSet>());
			
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] nbBonus = lineSplit[2].split(",");
				
				String[] with3 = new String[Integer.parseInt(nbBonus[0])];
				String[] with4 = new String[Integer.parseInt(nbBonus[1])];
				String[] with5 = new String[Integer.parseInt(nbBonus[2])];
				
				assert ((with3.length + with4.length + with5.length) == (lineSplit.length - 3))
						: "Set armor line " + (list.get(0).size() + 1);
				
				for(int i = 0; i < with3.length; i++) {
					with3[i] = lineSplit[i+3];
				}
				
				for(int i = 0; i < with4.length; i++) {
					with4[i] = lineSplit[i+3 + with3.length];
				}
				
				for(int i = 0; i < with5.length; i++) {
					with5[i] = lineSplit[i+3 + with3.length + with4.length];
				}
				
				list.get(0).add(new EquipSet(lineSplit[0], lineSplit[1], with3, with4, with5));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + EquipSet.class.getClass().getSimpleName() + " class");
		}
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					EquipSet.class.getResourceAsStream(Tools.RESOURCE + "capering/set.txt"), "UTF-8"));
		) {
			list.add(new ArrayList<EquipSet>());
			
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] nbBonus = lineSplit[2].split(",");
				
				String[] with2 = new String[Integer.parseInt(nbBonus[0])];
				String[] with3 = new String[Integer.parseInt(nbBonus[1])];
				
				assert ((with2.length + with3.length) == (lineSplit.length - 3))
						: "Set capering line " + (list.get(1).size() + 1);
				
				for(int i = 0; i < with2.length; i++) {
					with2[i] = lineSplit[i+3];
				}
				
				for(int i = 0; i < with3.length; i++) {
					with3[i] = lineSplit[i+3 + with2.length];
				}
				
				list.get(1).add(new EquipSet(lineSplit[0], lineSplit[1], with2, with3));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + EquipSet.class.getClass().getSimpleName() + " class");
		}
		
		EquipSet.dataArmor = new EquipSet[list.get(0).size()];
		for(int i = 0; i < dataArmor.length; i++) {
			dataArmor[i] = list.get(0).get(i);
		}
		
		EquipSet.dataCapeRing = new EquipSet[list.get(1).size()];
		for(int i = 0; i < dataCapeRing.length; i++) {
			dataCapeRing[i] = list.get(1).get(i);
		}
	}
	
	public static EquipSet[] getDataArmor() {
		return EquipSet.dataArmor;
	}
	
	public static EquipSet[] getDataCapeRing() {
		return EquipSet.dataCapeRing;
	}
}
