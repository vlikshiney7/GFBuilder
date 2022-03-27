package fr.vlik.grandfantasia.equip;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class EquipSet implements Writable {
	
	private static EquipSet[] dataArmor = LoaderEquip.getArmorSet();
	private static EquipSet[] dataCapeRing = LoaderEquip.getCapeRingSet();
	
	private Map<Language, String> name;
	private String code;
	private int nbCurrentUsed;
	
	private BonusEquipSet bonus2pieces;
	private BonusEquipSet bonus3pieces;
	private BonusEquipSet bonus4pieces;
	private BonusEquipSet bonus5pieces;
	
	@SuppressWarnings("serial")
	public EquipSet() {
		this.name = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }};
		this.code = "-1";
		this.nbCurrentUsed = 0;
		
		this.bonus2pieces = new BonusEquipSet();
		this.bonus3pieces = new BonusEquipSet();
		this.bonus4pieces = new BonusEquipSet();
		this.bonus5pieces = new BonusEquipSet();
	}
	
	@SuppressWarnings("serial")
	public EquipSet(Map<Language, String> name, String code, Calculable[] with3, Calculable[] with4, Calculable[] with5) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.bonus3pieces = new BonusEquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonus pour 3 pièces de set"); put(Language.EN, "3 Piece Set Bonus"); }}, Quality.BLUE, with3);
		this.bonus4pieces = new BonusEquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonus pour 4 pièces de set"); put(Language.EN, "4 Piece Set Bonus"); }}, Quality.ORANGE, with4);
		this.bonus5pieces = new BonusEquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonus pour 5 pièces de set"); put(Language.EN, "5 Piece Set Bonus"); }}, Quality.GOLD, with5);
	}
	
	@SuppressWarnings("serial")
	public EquipSet(Map<Language, String> name, String code, Calculable[] with2, Calculable[] with3) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.bonus2pieces = new BonusEquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonus pour 2 pièces de set"); put(Language.EN, "2 Piece Set Bonus"); }}, Quality.GREEN, with2);
		this.bonus3pieces = new BonusEquipSet(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bonus pour 3 pièces de set"); put(Language.EN, "3 Piece Set Bonus"); }}, Quality.BLUE, with3);
	}
	
	public EquipSet(Armor[] armors) {
		String[] equipCode = { armors[0].getSetCode(), armors[1].getSetCode(), armors[2].getSetCode(), armors[3].getSetCode(), armors[4].getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		
		if(this.nbCurrentUsed < 3) {
			this.code = "-1";
		}
		
		for(int i = 0; i < EquipSet.dataArmor.length; i++) {
			if(EquipSet.dataArmor[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataArmor[i].getMap();
				
				this.bonus3pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus3(), this.nbCurrentUsed >= 3);
				this.bonus4pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus4(), this.nbCurrentUsed >= 4);
				this.bonus5pieces = new BonusEquipSet(EquipSet.dataArmor[i].getBonus5(), this.nbCurrentUsed >= 5);
				break;
			}
		}
	}
	
	public EquipSet(Ring[] rings, Cape cape) {
		String[] equipCode = { rings[0].getSetCode(), rings[1].getSetCode(), cape.getSetCode() };
		
		this.nbCurrentUsed = getMaxCount(equipCode);
		if(rings[0].getName(Language.FR).trim().equals(rings[1].getName(Language.FR).trim())) {
			this.nbCurrentUsed--;
		}
		
		if(this.nbCurrentUsed < 2) {
			this.code = "-1";
		}
		
		for(int i = 0; i < EquipSet.dataCapeRing.length; i++) {
			if(EquipSet.dataCapeRing[i].getCode().equals(this.code)) {
				this.name = EquipSet.dataCapeRing[i].getMap();
				
				this.bonus2pieces = new BonusEquipSet(EquipSet.dataCapeRing[i].getBonus2(), this.nbCurrentUsed >= 2);
				this.bonus3pieces = new BonusEquipSet(EquipSet.dataCapeRing[i].getBonus3(), this.nbCurrentUsed >= 3);
				
				break;
			}
		}
	}
	
	public Map<Language, String> getMap() {
		return new EnumMap<>(this.name);
	}
	
	public String getName(Language lang) {
		if(this.name == null) {
			return "";
		} else if(this.name.get(lang) == null || this.name.get(lang).equals("")) {
			return this.name.get(Language.FR);
		}
		
		return this.name.get(lang);
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
	
	public String getSelectorInfo(Language lang) {
		return getName(lang);
	}
	
	public String getFullInfo(Language lang) {
		return getName(lang);
	}
	
	private int getMaxCount(String[] equipCode) {
		Arrays.sort(equipCode);
		int maxCount = 1;
		int currCount = 1;
		String currentCode = equipCode[0];
		
		for(int i = 1; i < equipCode.length; i++) {
			if(equipCode[i].equals(equipCode[i-1])) {
				currCount++;
			} else {
				if(currCount > maxCount) {
					maxCount = currCount;
					currentCode = equipCode[i-1];
				}
				currCount = 1;
			}
		}
		if(currCount > maxCount) {
			maxCount = currCount;
			currentCode = equipCode[equipCode.length-1];
		}
		
		this.code = currentCode;
		
		return maxCount;
	}
	
	public static EquipSet[] getDataArmor() {
		return EquipSet.dataArmor;
	}
	
	public static EquipSet[] getDataCapeRing() {
		return EquipSet.dataCapeRing;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.bonus2pieces == null) ? 0 : this.bonus2pieces.hashCode());
		result = prime * result + ((this.bonus3pieces == null) ? 0 : this.bonus3pieces.hashCode());
		result = prime * result + ((this.bonus4pieces == null) ? 0 : this.bonus4pieces.hashCode());
		result = prime * result + ((this.bonus5pieces == null) ? 0 : this.bonus5pieces.hashCode());
		result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + this.nbCurrentUsed;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EquipSet other = (EquipSet) obj;
		if (this.bonus2pieces == null) {
			if (other.bonus2pieces != null) {
				return false;
			}
		} else if (!this.bonus2pieces.equals(other.bonus2pieces)) {
			return false;
		}
		if (this.bonus3pieces == null) {
			if (other.bonus3pieces != null) {
				return false;
			}
		} else if (!this.bonus3pieces.equals(other.bonus3pieces)) {
			return false;
		}
		if (this.bonus4pieces == null) {
			if (other.bonus4pieces != null) {
				return false;
			}
		} else if (!this.bonus4pieces.equals(other.bonus4pieces)) {
			return false;
		}
		if (this.bonus5pieces == null) {
			if (other.bonus5pieces != null) {
				return false;
			}
		} else if (!this.bonus5pieces.equals(other.bonus5pieces)) {
			return false;
		}
		if (this.code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!this.code.equals(other.code)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return this.nbCurrentUsed == other.nbCurrentUsed;
	}
}
