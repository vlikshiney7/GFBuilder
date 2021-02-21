package fr.vlik.grandfantasia.equip;

import java.util.Arrays;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class EquipSet implements Writable {
	
	private static EquipSet[] dataArmor;
	private static EquipSet[] dataCapeRing;
	static {
		dataArmor = LoaderEquip.getArmorSet();
		dataCapeRing = LoaderEquip.getCapeRingSet();
	}
	
	private String name;
	private String code;
	private int nbCurrentUsed;
	private Calculable[] with2;
	private Calculable[] with3;
	private Calculable[] with4;
	private Calculable[] with5;
	
	public EquipSet() {
		this.name = "Rien";
		this.code = "-1";
		this.nbCurrentUsed = 0;
	}
	
	public EquipSet(String name, String code, Calculable[] with3, Calculable[] with4, Calculable[] with5) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.with3 = with3;
		this.with4 = with4;
		this.with5 = with5;
	}
	
	public EquipSet(String name, String code, Calculable[] with2, Calculable[] with3) {
		this.name = name;
		this.code = code;
		this.nbCurrentUsed = 0;
		
		this.with2 = with2;
		this.with3 = with3;
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
		if(rings[0].getName(Language.FR).trim().equals(rings[1].getName(Language.FR).trim())) {
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
	
	public Calculable[] getWith2() {
		return Tools.getEffects(this.with2);
	}
	
	public Calculable[] getWith3() {
		return Tools.getEffects(this.with3);
	}
	
	public Calculable[] getWith4() {
		return Tools.getEffects(this.with4);
	}
	
	public Calculable[] getWith5() {
		return Tools.getEffects(this.with5);
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
		if(this.with3 != null) {
			for(Calculable c : this.with3) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					if(e.getType() != TypeEffect.NONE) {
						tooltip.append("<br>");
						tooltip.append(e.getTooltip());
					}
				}
			}
		}
		
		tooltip.append("<br><br>");
		tooltip.append("4 pièces :");
		if(this.with4 != null) {
			for(Calculable c : this.with4) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					if(e.getType() != TypeEffect.NONE) {
						tooltip.append("<br>");
						tooltip.append(e.getTooltip());
					}
				}
			}
		}
		
		tooltip.append("<br><br>");
		tooltip.append("5 pièces :");
		if(this.with5 != null) {
			for(Calculable c : this.with5) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					if(e.getType() != TypeEffect.NONE) {
						tooltip.append("<br>");
						tooltip.append(e.getTooltip());
					}
				}
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
	
	public static EquipSet[] getDataArmor() {
		return EquipSet.dataArmor;
	}
	
	public static EquipSet[] getDataCapeRing() {
		return EquipSet.dataCapeRing;
	}
}
