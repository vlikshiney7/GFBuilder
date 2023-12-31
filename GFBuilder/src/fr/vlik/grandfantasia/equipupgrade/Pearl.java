package fr.vlik.grandfantasia.equipupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.loader.equipupgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Pearl extends CompleteBuff {

	private static final String PATH = Tools.RESOURCE + Pearl.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	
	private static Pearl[] dataWeapon = LoaderEquipUpgrade.getWeaponPearl();
	private static Pearl[] dataArmor = LoaderEquipUpgrade.getArmorPearl();
	private static Pearl[] dataWeaponCost = LoaderEquipUpgrade.getWeaponCostPearl();
	private static Pearl[] dataArmorCost = LoaderEquipUpgrade.getArmorCostPearl();
	
	private static Tag[] tags = new Tag[] { Tag.FORMULE, Tag.GVG, Tag.MARCHAND, Tag.QUETE, Tag.REPUTATION, Tag.TDB, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD };
	
	private Quality restricStuff;
	private boolean cumulable;
	
	private Tag[] tag;
	
	public Pearl() {
		super();
		this.restricStuff = Quality.GREY;
		this.cumulable = true;
	}
	
	public Pearl(Map<Language, String> name, Quality quality, Quality restricStuff, boolean cumulable, String path, Tag[] tags, Calculable[] effects) {
		this(name, quality, restricStuff, cumulable, path, effects);
		this.tag = tags;
	}
	
	public Pearl(Map<Language, String> name, Quality quality, Quality restricStuff, boolean cumulable, String path, Calculable[] effects) {
		super(name, quality, effects);
		this.restricStuff = restricStuff;
		this.cumulable = cumulable;
		this.icon = setIcon(path);
	}
	
	public Quality getRestricStuff() {
		return this.restricStuff;
	}
	
	public boolean isCumulable() {
		return this.cumulable;
	}

	public Tag[] getTag() {
		return this.tag;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Pearl.class.getResource(Tools.PATH24 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Pearl.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	public static Pearl getWeapon(String name) {
		return get(Pearl.dataWeapon, name, Language.FR);
	}
	
	public static Pearl getArmor(String name) {
		return get(Pearl.dataArmor, name, Language.FR);
	}
	
	public static Pearl getWeaponCost(String name) {
		return get(Pearl.dataWeaponCost, name, Language.FR);
	}
	
	public static Pearl getArmorCost(String name) {
		return get(Pearl.dataArmorCost, name, Language.FR);
	}
	
	public static Pearl[] getPossibleWeaponPearl(Weapon weapon) {
		List<Pearl> result = new ArrayList<>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataWeapon) {
			Map<Object, Object> properties = new HashMap<>();
			properties.put(pearl.getRestricStuff(), weapon.getQuality());
			
			if(Tools.evaluateProperties(properties)) {
				result.add(pearl);
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}

	public static Pearl[] getPossibleArmorPearl(Armor armor) {
		List<Pearl> result = new ArrayList<>();
		
		result.add(new Pearl());
		
		for(Pearl pearl : Pearl.dataArmor) {
			Map<Object, Object> properties = new HashMap<>();
			properties.put(pearl.getRestricStuff(), armor.getQuality());
			
			if(Tools.evaluateProperties(properties)) {
				result.add(pearl);
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] applyFilters(Pearl[] possible, Pearl choice, String key, Filterable[] filter, boolean andValue) {
		List<Pearl> result = new ArrayList<>();
		
		result.add(new Pearl());
		if(!choice.equals(new Pearl())
				&& Tools.containObject(possible, choice)) {
			
			result.add(choice);
		}
		
		for(Pearl pearl : possible) {
			boolean[] filters = new boolean[] {
				Tools.searchOnName(key, pearl.getMap(), andValue),
				Tools.containObject(filter, pearl.getQuality()),
				//Tools.containFilter(filter, armor.getTag()),
			};
			
			if( (andValue ? Filterable.andValue(filters) : Filterable.orValue(filters))
					&& !choice.equals(pearl)) {
				
				result.add(pearl);
			}
		}
		
		return result.toArray(new Pearl[result.size()]);
	}
	
	public static Pearl[] getWeaponCostPearl() {
		return Pearl.dataWeaponCost;
	}
	
	public static Pearl[] getArmorCostPearl() {
		return Pearl.dataArmorCost;
	}
	
	public static boolean isAlreadyCount(List<Pearl> notCombinablePearl, Pearl pearl) {
		boolean result = false;
		
		for(Pearl compare : notCombinablePearl) {
			if(compare.equals(pearl)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static Tag[] getTags() {
		return Pearl.tags;
	}
	
	public static Quality[] getQualities() {
		return Pearl.qualities;
	}

	public static Filterable[][] getFilters() {
		return new Filterable[][] {
			//getTags(),
			getQualities(),
		};
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.cumulable ? 1231 : 1237);
		result = prime * result + ((this.restricStuff == null) ? 0 : this.restricStuff.hashCode());
		result = prime * result + Arrays.hashCode(this.tag);
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
		Pearl other = (Pearl) obj;
		if (this.cumulable != other.cumulable) {
			return false;
		}
		if (this.restricStuff != other.restricStuff) {
			return false;
		}
		return Arrays.equals(this.tag, other.tag);
	}
}
