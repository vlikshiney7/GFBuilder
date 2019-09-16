package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Quality;
import fr.vlik.grandfantasia.Weapon.WeaponType;

public class Enchantment {
	
	public static final int[] EpMaHaMe45 = { 24, 25, 26, 27, 28, 8, 9, 10, 11, 14, 15, 21, 29 };
	public static final int[] ArcGunCanCle45 = { 24, 25, 26, 27, 28, 8, 9, 10, 11, 15, 22, 29 };
	public static final int[] BatonLame45 = { 24, 25, 26, 27, 28, 8, 9, 12, 13, 14, 15, 17, 19, 23, 29 };
	public static final int[] Rel45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 7, 12, 13, 15, 16, 20, 23 };
	public static final int[] Bou45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 15, 18, 19, 30 };
	
	public static final int[] EpMaHaMe6 = { 24, 25, 26, 27, 28, 29 };
	public static final int[] ArcGunCanCle6 = { 24, 25, 26, 27, 28, 29 };
	public static final int[] BatonLame6 = { 24, 25, 26, 27, 28, 14, 29 };
	public static final int[] Rel6 = { 24, 25, 26, 27, 28, 16 };
	public static final int[] Bou6 = { 24, 25, 26, 27, 28 };
	
	public static final int[] Armor45 = { 24, 25, 26, 27, 28, 0, 1, 2, 3, 4, 5, 6, 7, 17, 18, 19, 20 };
	public static final int[] Armor6 = { 24, 25, 26, 27, 28, 6 };
	
	public static final int[] CapeRing = { 24, 25, 26, 27, 28 };
	
	private static Enchantment[] data;
	static {
		loadData();
	}
	
	private String name;
	private boolean fixValue;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Enchantment() {
		this.name = " ";
	}
	
	public Enchantment(String name, boolean isFix, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isFixValue() {
		return this.fixValue;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public static void loadData() {
		ArrayList<Enchantment> list = new ArrayList<Enchantment>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/enchantement.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
					effects.add(new Effect(lineSplit[j+3]));
				
				list.add(new Enchantment(lineSplit[0], Boolean.parseBoolean(lineSplit[1]), effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Enchantment.class.getClass().getSimpleName() + " class");
		}
		
		Enchantment.data = new Enchantment[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Enchantment[] getPossibleWeaponEnchant(Quality quality, WeaponType type) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		if(type.index < 8) {
			if(quality == Quality.ORANGE || quality == Quality.GOLD) {
				for(int index : Enchantment.EpMaHaMe45) {
					result.add(Enchantment.data[index]);
				}
			} else if(quality == Quality.PURPLE) {
				for(int index : Enchantment.EpMaHaMe6) {
					result.add(Enchantment.data[index]);
				}
			}
		} else if(type.index < 11 || type == WeaponType.CLE) {
			if(quality == Quality.ORANGE || quality == Quality.GOLD) {
				for(int index : Enchantment.ArcGunCanCle45) {
					result.add(Enchantment.data[index]);
				}
			} else if(quality == Quality.PURPLE) {
				for(int index : Enchantment.ArcGunCanCle6) {
					result.add(Enchantment.data[index]);
				}
			}
		} else if(type == WeaponType.RELIQUE) {
			if(quality == Quality.ORANGE || quality == Quality.GOLD) {
				for(int index : Enchantment.Rel45) {
					result.add(Enchantment.data[index]);
				}
			} else if(quality == Quality.PURPLE) {
				for(int index : Enchantment.Rel6) {
					result.add(Enchantment.data[index]);
				}
			}
		} else if(type == WeaponType.BATON || type == WeaponType.LAME) {
			if(quality == Quality.ORANGE || quality == Quality.GOLD) {
				for(int index : Enchantment.BatonLame45) {
					result.add(Enchantment.data[index]);
				}
			} else if(quality == Quality.PURPLE) {
				for(int index : Enchantment.BatonLame6) {
					result.add(Enchantment.data[index]);
				}
			}
		} else if(type == WeaponType.BOUCLIER) {
			if(quality == Quality.ORANGE || quality == Quality.GOLD) {
				for(int index : Enchantment.Bou45) {
					result.add(Enchantment.data[index]);
				}
			} else if(quality == Quality.PURPLE) {
				for(int index : Enchantment.Bou6) {
					result.add(Enchantment.data[index]);
				}
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getPossibleArmorEnchant(Quality quality) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		if(quality == Quality.ORANGE || quality == Quality.GOLD) {
			for(int index : Enchantment.Armor45) {
				result.add(Enchantment.data[index]);
			}
		} else if(quality == Quality.PURPLE) {
			for(int index : Enchantment.Armor6) {
				result.add(Enchantment.data[index]);
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Enchantment[] getPossibleCapeRingEnchant() {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(int index : Enchantment.CapeRing) {
			result.add(Enchantment.data[index]);
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
