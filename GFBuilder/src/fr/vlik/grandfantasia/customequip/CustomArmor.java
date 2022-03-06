package fr.vlik.grandfantasia.customequip;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customequip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomArmor extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + File.separator;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	public static CustomArmor[][] data = LoaderCustom.getCustomArmor();
	public static final double INCREASE_VALUE_GREEN = 1.06;
	public static final double INCREASE_VALUE_BLUE = 1.18;
	
	private ArmorType type;
	
	public CustomArmor(CustomArmor armor) {
		super(armor);
		
		this.type = armor.getType();
		this.icon = armor.getIcon();
		this.iconName = armor.getIconName();
	}
	
	public CustomArmor(Map<Language, String> name, GradeName[] grades, int lvl, ArmorType type, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.type = type;
		this.icon = setIcon(path != null ? path : "null");
	}
	
	@Override
	public ArmorType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomArmor.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(CustomArmor.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.iconName = path;
		
		return Tools.constructIcon(back, object);
	}
	
	public Armor transformToArmor(Quality quality, Enchantment[] enchant) {
		CustomArmor newCustom = new CustomArmor(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomArmor.INCREASE_VALUE_GREEN);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect) {
					Effect e = (Effect) newCustom.getEffects()[i];
					if(e.getType().isUpgradable) {
						e.changeValue(CustomArmor.INCREASE_VALUE_BLUE);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else {
				mergeEffect[i] = newCustom.getEffects()[i];
			}
		}
		
		for(int i = 0; i < tabEffects.length; i++) {
			mergeEffect[newCustom.getEffects().length + i] = tabEffects[i];
		}
		
		return new Armor(newCustom.name, newCustom.grades, newCustom.lvl, quality, newCustom.type, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomArmor get(String name, Language lang) {
		for(CustomArmor[] type : CustomArmor.data) {
			for(CustomArmor custom : type) {
				if(custom.getName(lang).equals(name)) {
					return custom;
				}
			}
		}
		
		return null;
	}
	
	public static CustomArmor[] getPossibleArmor(ArmorType type, Grade grade, int lvl) {
		ArrayList<CustomArmor> result = new ArrayList<>();
		
		for(int i = 0; i < data[type.index].length; i++) {
			CustomArmor armor = data[type.index][i];
			
			if(armor.getLvl() == lvl && Tools.containObject(armor.getGrades(), grade.getGrade())) {
				result.add(armor);
			}
		}
		
		return result.toArray(new CustomArmor[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomArmor custom = CustomArmor.get(CustomEquipment.deleteNumber(name), Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			for(int i = 0; i < 3; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		} else if(quality == Quality.BLUE) {
			for(int i = 0; i < 6; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		}
		
		Armor armor = custom.transformToArmor(quality, tabEnchant);
		
		Armor.addCustom(armor);
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomArmor other = (CustomArmor) obj;
		return this.type == other.type;
	}
}
