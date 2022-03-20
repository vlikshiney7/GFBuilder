package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customequip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipupgrade.Fortification;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Weapon extends Equipment {
	
	private static final String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Weapon[][] data = LoaderEquip.getWeapon();
	private static ArrayList<Weapon> customData = new ArrayList<>();
	
	private static Tag[] tags = new Tag[] { Tag.BOSS, Tag.DONJON, Tag.EVENT, Tag.FORMULE, Tag.GVG, Tag.PVP, Tag.QUETE, Tag.SPRITE, Tag.OTHER, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD, Quality.PURPLE, Quality.RED };
	
	protected WeaponType type;
	protected boolean uniqueEquip;
	protected boolean reinca;
	
	private Tag[] tag;
	
	public Weapon() {
		super();
		
		this.type = WeaponType.NONE;
		this.uniqueEquip = false;
		this.reinca = false;
		this.icon = setIcon("null");
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getMap(), weapon.getGrades(), weapon.getLvl(), weapon.getQuality(), weapon.isEnchantable(), weapon.getEffects(), weapon.getBonusXP());
		
		this.type = weapon.getType();
		this.uniqueEquip = weapon.isUniqueEquip();
		this.reinca = weapon.isReinca();
		this.icon = weapon.getIcon();
		this.effects = weapon.getEffects();
	}
	
	public Weapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String path, Tag[] tags, Calculable[] effects, Calculable[] bonusXP) {
		this(name, grades, lvl, quality, enchantable, type, uniqueEquip, reinca, path, effects, bonusXP);
		this.tag = tags;
	}
	
	public Weapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.uniqueEquip = uniqueEquip;
		this.reinca = reinca;
		this.icon = setIcon(path);
	}
	
	public Weapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, WeaponType type, String path, Calculable[] effects, String signature) {
		super(name, grades, lvl, quality, effects, signature);
		
		this.type = type;
		this.uniqueEquip = false;
		this.reinca = false;
		this.icon = setIcon(path);
	}
	
	@SuppressWarnings("serial")
	public enum WeaponType implements EquipType, Filterable, Writable {
		EPEE1M(0, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épée 1M"); put(Language.EN, "1H Sword"); }}, true),
		MARTEAU1M(1, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marteau 1M"); put(Language.EN, "1H Hammer"); }}, true),
		HACHE1M(2, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hache 1M"); put(Language.EN, "1H Axe"); }}, true),
		EPEE2M(3, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épée 2M"); put(Language.EN, "2H Sword"); }}, false),
		MARTEAU2M(4, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marteau 2M"); put(Language.EN, "2H Hammer"); }}, false),
		HACHE2M(5, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hache 2M"); put(Language.EN, "2H Axe"); }}, false),
		MECA1M(6, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arme Méca 1M"); put(Language.EN, "1H Meca Weapon"); }}, true),
		MECA2M(7, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arme Méca 2M"); put(Language.EN, "2H Meca Weapon"); }}, false),
		ARC(8, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arc"); put(Language.EN, "Bow"); }}, false),
		GUN(9, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pistolet"); put(Language.EN, "Gun"); }}, false),
		CANON(10, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canon"); put(Language.EN, "Canon"); }}, false),
		RELIQUE(11, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Relique"); put(Language.EN, "Relic"); }}, false),
		BATON(12, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bâton"); put(Language.EN, "Staff"); }}, false),
		LAME(13, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame"); put(Language.EN, "Blade"); }}, false),
		CLE(14, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clé"); put(Language.EN, "Key"); }}, false),
		BOUCLIER(15, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier"); put(Language.EN, "Shield"); }}, false),
		DEFAULT(16, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défaut"); put(Language.EN, "Default"); }}, true),
		NONE(-1, new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vide"); put(Language.EN, "Void"); }}, false);
		
		public final int index;
		public final Map<Language, String> lang;
		public final boolean isMainOneHand;
		
	    private WeaponType(int index, Map<Language, String> lang, boolean isMainOneHand) {
	        this.index = index;
	        this.lang = lang;
	        this.isMainOneHand = isMainOneHand;
	    }
	    
		public String getName(Language lang) {
			return this.lang.get(lang);
		}
	    
		public String getSelectorInfo(Language lang) {
			return this.lang.get(lang);
		}
		
		public String getFullInfo(Language lang) {
			return this.lang.get(lang);
		}
	}
	
	@Override
	public WeaponType getType() {
		return this.type;
	}
	
	public boolean isUniqueEquip() {
		return this.uniqueEquip;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public Tag[] getTag() {
		return this.tag;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Weapon.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Weapon.class.getResource(PATH + path + Tools.PNG)) );
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	public void addFortif(Fortification fortif) {
		if(this.effects != null) {
			modifyAttack(fortif.getCoef());
		}
	}

	public void addShieldBonus(double shieldDefP, double shieldDefM) {
		for(Calculable c : this.effects) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				
				if(e.getType() == TypeEffect.DefP && !e.isPercent() && e.getWithReinca()) {
					e.changeValue(shieldDefP / 100 + 1);
				} else if(e.getType() == TypeEffect.DefM && !e.isPercent() && e.getWithReinca()) {
					e.changeValue(shieldDefM / 100 + 1);
				}
			}
		}
	}
	
	public void doubleWeapon() {
		if(this.effects != null) {
			modifyAttack(0.75);
		}
	}
	
	protected void modifyAttack(double coef) {
		for(Calculable c : this.effects) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				
				if(e.getType().isUpgradable && !e.isPercent() && e.getWithReinca()) {
					e.changeValue(coef);
				}
			}
		}
	}
	
	public static void addCustom(Weapon weapon) {
		if(getCustom(weapon.getName(Language.FR), weapon.getQuality(), weapon.getSignature()) == null) {
			int i = 1;
			boolean found = true;
			
			while(found) {
				found = false;
				for(Weapon custom : Weapon.customData) {
					if(custom.getName(Language.FR).equals(weapon.getName(Language.FR))) {
						weapon.addNumberName(i++);
						found = true;
						break;
					}
				}
			}
			
			Weapon.customData.add(weapon);
		}
	}
	
	public static Weapon get(String name, Language lang) {
		for(Weapon[] type : Weapon.data) {
			for(Weapon weapon : type) {
				if(weapon.getName(lang).equals(name)) {
					return weapon;
				}
			}
		}
		
		return null;
	}
	
	public static Weapon getCustom(String name, Language lang) {
		for(Weapon weapon : Weapon.customData) {
			if(weapon.getName(lang).equals(name)) {
				return weapon;
			}
		}
		
		return null;
	}
	
	public static Weapon getCustom(String name, Quality quality, String signature) {
		for(Weapon weapon : Weapon.customData) {
			if(CustomEquipment.deleteNumber(weapon.getName(Language.FR)).equals(CustomEquipment.deleteNumber(name))
					&& weapon.getQuality() == quality
					&& weapon.getSignature().equals(signature)) {
				
				return weapon;
			}
		}
		
		return null;
	}
	
	public static Weapon[] getCustomData() {
		Weapon[] cast = new Weapon[customData.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = customData.get(i);
		}
		
		return cast;
	}
	
	public static Weapon[] getPossibleWeapon(int idList, Grade grade, int lvl, Reinca reinca, Weapon toIgnore, boolean doubleWeapon) {
		ArrayList<Weapon> result = new ArrayList<>();
		WeaponType[] weaponType = Weapon.getWeaponType(idList, doubleWeapon);
		
		result.add(new Weapon());
		
		for(Weapon custom : Weapon.customData) {
			
			Map<Object, Object> properties = new HashMap<>();
			properties.put(custom.getGrades(), grade.getGrade());
			properties.put(custom.getLvl(), lvl);
			properties.put(custom.isReinca(), reinca);
			properties.put(weaponType, custom.getType());
			
			if(Tools.evaluateProperties(properties)) {
				result.add(custom);
			}
		}
		
		for(int i = 0; i < weaponType.length; i++) {
			Weapon[] oneWeaponType = Weapon.data[weaponType[i].index];
			
			for(int j = 0; j < oneWeaponType.length; j++) {
				Map<Object, Object> properties = new HashMap<>();
				properties.put(oneWeaponType[j].getGrades(), grade.getGrade());
				properties.put(oneWeaponType[j].getLvl(), lvl);
				properties.put(oneWeaponType[j].isReinca(), reinca);
				
				if(Tools.evaluateProperties(properties)) {
					result.add(oneWeaponType[j]);
				}
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		return result.toArray(new Weapon[result.size()]);
	}
	
	public static Weapon[] applyFilters(Weapon[] possible, Weapon choice, String key, Filterable[] filter, boolean andValue) {
		ArrayList<Weapon> result = new ArrayList<>();
		
		result.add(new Weapon());
		if(!choice.equals(new Weapon())
				&& Tools.containObject(possible, choice)) {
			
			result.add(choice);
		}
		
		for(Weapon weapon : possible) {
			boolean[] filters = new boolean[] {
				Tools.searchOnName(key, weapon.getMap(), andValue),
				Tools.containObject(filter, weapon.getQuality()),
				//Tools.containFilter(filter, weapon.getTag()),
				Tools.containObject(filter, weapon.getType()),
			};
			
			if(andValue ? Filterable.andValue(filters) : Filterable.orValue(filters)
					&& !choice.equals(weapon)) {
				
				result.add(weapon);
			}
		}
		
		return result.toArray(new Weapon[result.size()]);
	}
	
	public static Tag[] getTags() {
		return Weapon.tags;
	}
	
	public static Quality[] getQualities() {
		return Weapon.qualities;
	}
	
	public static WeaponType[] getWeaponType(int idList, boolean doubleWeapon) {
		switch (idList) {
			case 0 :
				return new WeaponType[] {
					WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M,
					WeaponType.EPEE2M, WeaponType.MARTEAU2M, WeaponType.HACHE2M,
					WeaponType.MECA1M, WeaponType.MECA2M,
					WeaponType.BATON, WeaponType.LAME,
					WeaponType.DEFAULT,
				};
			case 1 :
				if(doubleWeapon) {
					return new WeaponType[] {
						WeaponType.EPEE1M, WeaponType.MARTEAU1M, WeaponType.HACHE1M,
						WeaponType.MECA1M, WeaponType.BOUCLIER, WeaponType.DEFAULT,
					};
				} else {
					return new WeaponType[] {
						WeaponType.BOUCLIER,
					};
				}
			case 2 :
				return new WeaponType[] {
					WeaponType.ARC, WeaponType.GUN, WeaponType.CANON,
					WeaponType.RELIQUE, WeaponType.CLE,
				};
			default:
				break;
		}
		
		return new WeaponType[0];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.reinca ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(this.tag);
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		result = prime * result + (this.uniqueEquip ? 1231 : 1237);
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
		Weapon other = (Weapon) obj;
		if (this.reinca != other.reinca) {
			return false;
		}
		if (!Arrays.equals(this.tag, other.tag)) {
			return false;
		}
		if (this.type != other.type) {
			return false;
		}
		return this.uniqueEquip == other.uniqueEquip;
	}
}
