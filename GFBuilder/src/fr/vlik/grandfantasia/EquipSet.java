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
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class EquipSet implements Writable {
	
	private static EquipSet[] dataArmor;
	private static EquipSet[] dataCapeRing;
	static {
		dataArmor = Loader.getArmorSet();
		loadData();
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
	
	/*
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
	}*/
	
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
		if(this.with2 == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.with2.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.with2[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.with2[i]);
			} else if(this.with2[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.with2[i]);
			} else if(this.with2[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.with2[i]);
			}
		}
		
		return tab;
	}
	
	public Calculable[] getWith3() {
		if(this.with3 == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.with3.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.with3[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.with3[i]);
			} else if(this.with3[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.with3[i]);
			} else if(this.with3[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.with3[i]);
			}
		}
		
		return tab;
	}
	
	public Calculable[] getWith4() {
		if(this.with4 == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.with4.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.with4[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.with4[i]);
			} else if(this.with4[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.with4[i]);
			} else if(this.with4[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.with4[i]);
			}
		}
		
		return tab;
	}
	
	public Calculable[] getWith5() {
		if(this.with5 == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.with5.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.with5[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.with5[i]);
			} else if(this.with5[i] instanceof Proc) {
				tab[i] = new Proc((Proc) this.with5[i]);
			} else if(this.with5[i] instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) this.with5[i]);
			}
		}
		
		return tab;
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
	
	public void toCode() {
		String code = "new EquipSet(\"" + this.name + "\", \"" + this.code + "\",\n";
		code += "\tnew Calculable[] {\n";
		
		for(Calculable c : this.with3) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				code += "\t\tnew Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
				
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
				
				code += "),\n";
			}
		}
		
		code += "\t},\n";
		
		code += "\tnew Calculable[] {\n";
		
		for(Calculable c : this.with4) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				code += "\t\tnew Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
				
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
				
				code += "),\n";
			}
		}
		
		code += "\t},\n";
		
		code += "\tnew Calculable[] {\n";
		
		for(Calculable c : this.with5) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				code += "\t\tnew Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
				
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
				
				code += "),\n";
			}
		}
		
		code += "\t}\n";
		
		code += "),";
		
		System.out.println(code);
	}
	
	public static void loadData() {
		ArrayList<EquipSet> list = new ArrayList<EquipSet>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					EquipSet.class.getResourceAsStream(Tools.RESOURCE + "capering/set.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String[] nbBonus = lineSplit[2].split(",");
				
				Effect[] with2 = new Effect[Integer.parseInt(nbBonus[0])];
				Effect[] with3 = new Effect[Integer.parseInt(nbBonus[1])];
				
				assert ((with2.length + with3.length) == (lineSplit.length - 3))
						: "Set capering line " + (list.size() + 1);
				
				for(int j = 0; j < Integer.parseInt(nbBonus[0]); j++) {
					with2[j] = new Effect(lineSplit[j+3]);
				}
				
				for(int j = 0; j < Integer.parseInt(nbBonus[1]); j++) {
					with3[j] = new Effect(lineSplit[j+3] + with2.length);
				}
				
				list.add(new EquipSet(lineSplit[0], lineSplit[1], with2, with3));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + EquipSet.class.getClass().getSimpleName() + " class");
		}
		
		EquipSet.dataCapeRing = new EquipSet[list.size()];
		for(int i = 0; i < dataCapeRing.length; i++) {
			dataCapeRing[i] = list.get(i);
		}
	}
	
	public static EquipSet[] getDataArmor() {
		return EquipSet.dataArmor;
	}
	
	public static EquipSet[] getDataCapeRing() {
		return EquipSet.dataCapeRing;
	}
}
