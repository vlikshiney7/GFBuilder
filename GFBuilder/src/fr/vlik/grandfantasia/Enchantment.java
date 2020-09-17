package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Armor;
import fr.vlik.grandfantasia.equipable.Armor.ArmorType;
import fr.vlik.grandfantasia.equipable.Cape;
import fr.vlik.grandfantasia.equipable.Ring;
import fr.vlik.grandfantasia.equipable.Weapon;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Enchantment implements Writable {
	
	private static Enchantment[] data;
	private static Enchantment[] redData;
	public final static Map<TypeEffect, String> retrieveName = loadRetrieveName();
	private static ArrayList<ArrayList<Map<Quality, Map<Integer, ArrayList<Integer>>>>> value = new ArrayList<ArrayList<Map<Quality, Map<Integer, ArrayList<Integer>>>>>();
	static {
		loadData();
		loadRetrieveName();
	}
	
	private String name;
	private WeaponType[][] type;
	private boolean[] armor;
	private boolean cape;
	private boolean ring;
	private boolean fixValue;
	private int nbLvl;
	private Calculable[] effects;
	
	public Enchantment() {
		this.name = " ";
	}
	
	public Enchantment(String name, WeaponType[][] type, boolean[] armor, boolean cape, boolean ring, boolean fixValue, Calculable[] effects) {
		this.name = name;
		this.type = type;
		this.armor = armor;
		this.cape = cape;
		this.ring = ring;
		this.fixValue = fixValue;
		this.effects = effects;
	}
	
	public Enchantment(String name, WeaponType[] type, boolean armor, int nbLvl, Calculable[] effects) {
		this.name = name;
		this.type = new WeaponType[1][];
		this.type[0] = type;
		this.armor = new boolean[1];
		this.armor[0] = armor;
		this.nbLvl = nbLvl;
		this.effects = effects;
	}
	
	public Enchantment(String name, Calculable[] effects) {
		this.name = name;
		this.effects = effects;
	}

	public String getName() {
		return this.name;
	}
	
	public boolean isArmor(Quality quality) {
		if(quality == Quality.ORANGE || quality == Quality.GOLD || quality == Quality.RED) {
			return this.armor[0];
		} else if(quality == Quality.PURPLE) {
			return this.armor[1];
		}
		
		return false;
	}
	
	public boolean isCape() {
		return this.cape;
	}
	
	public boolean isRing() {
		return this.ring;
	}
	
	public boolean isFixValue() {
		return this.fixValue;
	}
	
	public int getNbLvl() {
		return this.nbLvl;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else {
				tab[i] = this.effects[i];
			}
		}
		
		return tab;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
	
	public boolean containType(WeaponType type, Quality quality) {
		if(type == WeaponType.NONE) {
			return false;
		}
		
		if(quality == Quality.ORANGE || quality == Quality.GOLD || quality == Quality.RED) {
			for(WeaponType element : this.type[0]) {
				if(element == type) {
					return true;
				}
			}
		} else if(quality == Quality.PURPLE) {
			for(WeaponType element : this.type[1]) {
				if(element == type) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void loadData() {
		ArrayList<Enchantment> list = new ArrayList<Enchantment>();
		ArrayList<Enchantment> redList = new ArrayList<Enchantment>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Enchantment.class.getResourceAsStream(Tools.RESOURCE + "enchantement.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (!line.equals("")) {
				String[] lineSplit = line.split("/");
				
				WeaponType[][] type = new WeaponType[2][];
				for(int i = 0; i < 2; i++) {
					String[] weaponType = lineSplit[i+1].split(",");
					WeaponType[] byQuality = new WeaponType[weaponType.length];
					
					for(int j = 0; j < weaponType.length; j++) {
						if(Integer.parseInt(weaponType[j]) == -1) {
							byQuality[j] = WeaponType.values()[17];
						} else {
							byQuality[j] = WeaponType.values()[Integer.parseInt(weaponType[j])];
						}
					}
					
					type[i] = byQuality;
				}
				
				String[] armorSplit = lineSplit[3].split(",");
				boolean[] armor = new boolean[2];
				for(int i = 0; i < 2; i++) {
					armor[i] = Boolean.parseBoolean(armorSplit[i]);
				}
				
				Calculable[] effects = new Calculable[Integer.parseInt(lineSplit[5])];
				for(int j = 0; j < Integer.parseInt(lineSplit[5]); j++) {
					effects[j] = new Effect(lineSplit[j+6]);
				}
				
				list.add(new Enchantment(lineSplit[0], type, armor, Boolean.parseBoolean(armorSplit[2]), Boolean.parseBoolean(armorSplit[3]), Boolean.parseBoolean(lineSplit[4]), effects));
				
				line = reader.readLine();
			}
			
			line = reader.readLine();
			
			while(line != null) {
				String[] lineSplit = line.split("/");
				
				String[] weaponType = lineSplit[1].split(",");
				WeaponType[] type = new WeaponType[weaponType.length];
				
				for(int j = 0; j < weaponType.length; j++) {
					if(Integer.parseInt(weaponType[j]) == -1) {
						type[j] = WeaponType.values()[17];
					} else {
						type[j] = WeaponType.values()[Integer.parseInt(weaponType[j])];
					}
				}
				
				Calculable[] effects = new Calculable[Integer.parseInt(lineSplit[4])];
				for(int i = 0; i < Integer.parseInt(lineSplit[4]); i++) {
					effects[i] = new Effect(lineSplit[i+5]);
				}
				
				redList.add(new Enchantment(lineSplit[0], type, Boolean.parseBoolean(lineSplit[2]), Integer.parseInt(lineSplit[3]), effects));
				
				line = reader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error with " + Enchantment.class.getClass().getSimpleName() + " class");
		}
		
		Enchantment.data = new Enchantment[list.size()];
		for(int i = 0; i < data.length; i++) {
			Enchantment.data[i] = list.get(i);
		}
		
		Enchantment.redData = new Enchantment[redList.size()];
		for(int i = 0; i < redData.length; i++) {
			Enchantment.redData[i] = redList.get(i);
		}
		
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Enchantment.class.getResourceAsStream(Tools.RESOURCE + "noFixEnchant.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			while (line != null) {
				Enchantment.value.add(new ArrayList<Map<Quality, Map<Integer, ArrayList<Integer>>>>());
				
				int nbType = Integer.parseInt(line.split("/")[0]);
				line = reader.readLine();
				
				for(int i = 0; i < nbType; i++) {
					Map<Quality, Map<Integer, ArrayList<Integer>>> byQuality = new HashMap<Quality, Map<Integer, ArrayList<Integer>>>();
					
					for(int j = 0; j < 3; j++) {
						line = reader.readLine();
						String[] lineSplit = line.split("/");
						
						Quality quality = Quality.values()[Integer.parseInt(lineSplit[0])];
						
						Map<Integer, ArrayList<Integer>> byLvl = new HashMap<Integer, ArrayList<Integer>>();
						
						for(int k = 1; k < lineSplit.length; k++) {
							String[] lvlValue = lineSplit[k].split(",");
							
							ArrayList<Integer> values = new ArrayList<Integer>();
							
							for(int l = 1; l < lvlValue.length; l++) {
								values.add(Integer.parseInt(lvlValue[l]));
							}
							
							byLvl.put(Integer.parseInt(lvlValue[0]), values);
						}
						
						byQuality.put(quality, byLvl);
					}
					
					Enchantment.value.get(Enchantment.value.size()-1).add(byQuality);
					line = reader.readLine();
				}
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Enchantment.class.getClass().getSimpleName() + " class");
		}
	}
	
	private static Map<TypeEffect, String> loadRetrieveName() {
		HashMap<TypeEffect, String> map = new HashMap<TypeEffect, String>();
		
		map.put(TypeEffect.FCE, "de Force");
		map.put(TypeEffect.VIT, "de Vitalité");
		map.put(TypeEffect.INT, "d'Intelligence");
		map.put(TypeEffect.VOL, "de Volonté");
		map.put(TypeEffect.AGI, "d'Agilité");
		map.put(TypeEffect.Toucher, "de Précision");
		map.put(TypeEffect.Parade, "de Parade");
		map.put(TypeEffect.ESQ, "d'Esquive");
		
		return map;
	}
	
	public static Enchantment[] getPossibleWeaponEnchant(Quality quality, WeaponType type) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data) {
			if(enchant.containType(type, quality)) {
				result.add(enchant);
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment get(String name) {
		for(Enchantment enchant : Enchantment.data) {
			if(enchant.getName().equals(name)) {
				return enchant;
			}
		}
		
		return null;
	}
	
	public static Enchantment getRed(String name) {
		for(Enchantment enchant : Enchantment.redData) {
			if(enchant.getName().equals(name)) {
				return enchant;
			}
		}
		
		return null;
	}
	
	public static Enchantment[] getPossibleArmorEnchant(Quality quality) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data) {
			if(enchant.isArmor(quality)) {
				result.add(enchant);
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getPossibleCapeEnchant() {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data) {
			if(enchant.isCape()) {
				result.add(enchant);
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getPossibleRingEnchant() {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data) {
			if(enchant.isRing()) {
				result.add(enchant);
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getWeaponRedEnchant(WeaponType type, Enchantment ignore1, Enchantment ignore2) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.redData) {
			if(enchant.containType(type, Quality.RED)) {
				result.add(enchant);
			}
		}
		
		if(ignore1 != null && !ignore1.equals(new Enchantment())) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null && !ignore2.equals(new Enchantment())) {
			result.remove(ignore2);
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getArmorRedEnchant(Enchantment ignore1, Enchantment ignore2) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.redData) {
			if(enchant.isArmor(Quality.RED)) {
				result.add(enchant);
			}
		}
		
		if(ignore1 != null && !ignore1.equals(new Enchantment())) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null && !ignore2.equals(new Enchantment())) {
			result.remove(ignore2);
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static int getValue(Weapon weapon, TypeEffect type) {
		int lvl = weapon.getLvl();
		Quality quality = weapon.getQuality();
		WeaponType weaponType = weapon.getType();
		
		int[] indexStat = { 0, 0, 0, 4, 4, 4, 0, 4, 1, 1, 1, 2, 4, 4, 2, 3, 0 };
		int[] indexPrecis = { 0, 0, 0, 3, 3, 3, 0, 3, 1, 1, 1, -1, 3, 3, 2, -1, 0 };
		
		try {
			if(type == TypeEffect.FCE || type == TypeEffect.VIT || type == TypeEffect.INT || type == TypeEffect.VOL || type == TypeEffect.AGI) {
				return Enchantment.value.get(0).get(indexStat[weaponType.index]).get(quality).get(lvl).get(0);
			} else if(type == TypeEffect.Toucher) {
				return Enchantment.value.get(1).get(indexPrecis[weaponType.index]).get(quality).get(lvl).get(0);
			} else if(type == TypeEffect.Parade) {
				return Enchantment.value.get(3).get(0).get(quality).get(lvl).get(0);
			}
		} catch (NullPointerException e) {
			System.out.println("Enchantment missing :\n"
					+ "- Type : " + weaponType + "\n"
					+ "- Level : " + lvl + "\n"
					+ "- Quality : " + quality + "\n"
					+ "- Effect : " + type + "\n");
			return 0;
		}
		return 0;
	}
	
	public static int getValue(Armor armor, TypeEffect type) {
		int lvl = armor.getLvl();
		Quality quality = armor.getQuality();
		
		try {
			if(type == TypeEffect.FCE || type == TypeEffect.VIT || type == TypeEffect.INT || type == TypeEffect.VOL || type == TypeEffect.AGI) {
				ArrayList<Integer> getter = Enchantment.value.get(0).get(5).get(quality).get(lvl);
				if(getter.size() == 1) {
					return getter.get(0);
				} else {
					int typeArmor = armor.getType() == ArmorType.CASQUE || armor.getType() == ArmorType.GANT || armor.getType() == ArmorType.BOTTE ? 0 : 1;
					return getter.get(typeArmor);
				}
			} else if(type == TypeEffect.ESQ) {
				return Enchantment.value.get(2).get(0).get(quality).get(lvl).get(0);
			}
		} catch (NullPointerException e) {
			System.out.println("Enchantment missing :\n"
					+ "- Type : Armor\n"
					+ "- Level : " + lvl + "\n"
					+ "- Quality : " + quality + "\n"
					+ "- Effect : " + type + "\n");
			return 0;
		}
		return 0;
	}
	
	public static int getValue(Cape cape, TypeEffect type) {
		int lvl = cape.getLvl();
		Quality quality = cape.getQuality();
		
		try {
			if(type == TypeEffect.FCE || type == TypeEffect.VIT || type == TypeEffect.INT || type == TypeEffect.VOL || type == TypeEffect.AGI) {
				ArrayList<Integer> getter = Enchantment.value.get(0).get(5).get(quality).get(lvl);
				if(getter.size() == 1) {
					return getter.get(0);
				} else {
					return getter.get(1);
				}
			} else if(type == TypeEffect.ESQ) {
				return Enchantment.value.get(2).get(1).get(quality).get(lvl).get(0);
			}
		} catch (NullPointerException e) {
			System.out.println("Enchantment missing :\n"
					+ "- Type : Cape\n"
					+ "- Level : " + lvl + "\n"
					+ "- Quality : " + quality + "\n"
					+ "- Effect : " + type + "\n");
			return 0;
		}
		return 0;
	}
	
	public static int getValue(Ring ring, TypeEffect type) {
		int lvl = ring.getLvl();
		Quality quality = ring.getQuality();
		
		try {
			if(type == TypeEffect.FCE || type == TypeEffect.VIT || type == TypeEffect.INT || type == TypeEffect.VOL || type == TypeEffect.AGI) {
				return Enchantment.value.get(0).get(6).get(quality).get(lvl).get(0);
			} else if(type == TypeEffect.Toucher) {
				return Enchantment.value.get(1).get(4).get(quality).get(lvl).get(0);
			} else if(type == TypeEffect.ESQ) {
				return Enchantment.value.get(2).get(1).get(quality).get(lvl).get(0);
			}
		} catch (NullPointerException e) {
			System.out.println("Enchantment missing :\n"
					+ "- Type : Ring\n"
					+ "- Level : " + lvl + "\n"
					+ "- Quality : " + quality + "\n"
					+ "- Effect : " + type + "\n");
			return 0;
		}
		return 0;
	}
	
	public static Effect multiplyEffect(Effect effect, int lvl) {
		Effect copy = new Effect(effect);
		copy.multiplyValue(lvl);
		return copy;
	}
}
