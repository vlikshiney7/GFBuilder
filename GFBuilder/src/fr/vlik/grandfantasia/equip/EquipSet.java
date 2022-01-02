package fr.vlik.grandfantasia.equip;

import java.util.Arrays;
import java.util.HashMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class EquipSet implements Writable {
	
	private static EquipSet[] dataArmor = LoaderEquip.getArmorSet();
	private static EquipSet[] dataCapeRing = LoaderEquip.getCapeRingSet();
	
	private String name;
	private String code;
	private int nbCurrentUsed;
	
	private BonusEquipSet bonus2pieces;
	private BonusEquipSet bonus3pieces;
	private BonusEquipSet bonus4pieces;
	private BonusEquipSet bonus5pieces;
	
	public EquipSet() {
		this.name = "Aucun";
		this.code = "-1";
		this.nbCurrentUsed = 0;
		
		this.bonus2pieces = new BonusEquipSet();
		this.bonus3pieces = new BonusEquipSet();
		this.bonus4pieces = new BonusEquipSet();
		this.bonus5pieces = new BonusEquipSet();
	}
	
	@SuppressWarnings("serial")
	public EquipSet(String name, String code, Calculable[] with3, Calculable[] with4, Calculable[] with5) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.bonus3pieces = new BonusEquipSet(new HashMap<Language, String>() {{ put(Language.FR, "Bonus pour 3 pièces de set"); put(Language.EN, "3 Piece Set Bonus"); }}, Quality.BLUE, with3);
		this.bonus4pieces = new BonusEquipSet(new HashMap<Language, String>() {{ put(Language.FR, "Bonus pour 4 pièces de set"); put(Language.EN, "4 Piece Set Bonus"); }}, Quality.ORANGE, with4);
		this.bonus5pieces = new BonusEquipSet(new HashMap<Language, String>() {{ put(Language.FR, "Bonus pour 5 pièces de set"); put(Language.EN, "5 Piece Set Bonus"); }}, Quality.GOLD, with5);
	}
	
	@SuppressWarnings("serial")
	public EquipSet(String name, String code, Calculable[] with2, Calculable[] with3) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.bonus2pieces = new BonusEquipSet(new HashMap<Language, String>() {{ put(Language.FR, "Bonus pour 2 pièces de set"); put(Language.EN, "2 Piece Set Bonus"); }}, Quality.GREEN, with2);
		this.bonus3pieces = new BonusEquipSet(new HashMap<Language, String>() {{ put(Language.FR, "Bonus pour 3 pièces de set"); put(Language.EN, "3 Piece Set Bonus"); }}, Quality.BLUE, with3);
	}
	
	public EquipSet(Armor[] armors) {
		String equipCode[] = { armors[0].getSetCode(), armors[1].getSetCode(), armors[2].getSetCode(), armors[3].getSetCode(), armors[4].getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		
		if(this.nbCurrentUsed < 3) {
			this.code = "-1";
		}
		
		for(int i = 0; i < EquipSet.dataArmor.length; i++) {
			if(EquipSet.dataArmor[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataArmor[i].getName();
				
				this.bonus3pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus3(), this.nbCurrentUsed >= 3);
				this.bonus4pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus4(), this.nbCurrentUsed >= 4);
				this.bonus5pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus5(), this.nbCurrentUsed >= 5);
				break;
			}
		}
	}
	
	public EquipSet(Ring[] rings, Cape cape) {
		String equipCode[] = { rings[0].getSetCode(), rings[1].getSetCode(), cape.getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		if(rings[0].getName(Language.FR).trim().equals(rings[1].getName(Language.FR).trim())) {
			this.nbCurrentUsed--;
		}
		
		if(this.nbCurrentUsed < 2) {
			this.code = "-1";
		}
		
		for(int i = 0; i < EquipSet.dataCapeRing.length; i++) {
			if(EquipSet.dataCapeRing[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataCapeRing[i].getName();
				
				this.bonus2pieces = new BonusEquipSet(EquipSet.dataCapeRing[i].getBonus2(), this.nbCurrentUsed >= 2);
				this.bonus3pieces = new BonusEquipSet(EquipSet.dataCapeRing[i].getBonus3(), this.nbCurrentUsed >= 3);
				
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
	
	public BonusEquipSet getBonus2() {
		return this.bonus2pieces;
	}
	
	public BonusEquipSet getBonus3() {
		return this.bonus3pieces;
	}
	
	public BonusEquipSet getBonus4() {
		return this.bonus4pieces;
	}
	
	public BonusEquipSet getBonus5() {
		return this.bonus5pieces;
	}
	
	public int getNbCurrentUsed() {
		return this.nbCurrentUsed;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}

	@Override
	public String getTooltip() {
		return this.name;
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
	
	public static EquipSet[] getDataArmor() {
		return EquipSet.dataArmor;
	}
	
	public static EquipSet[] getDataCapeRing() {
		return EquipSet.dataCapeRing;
	}
}
