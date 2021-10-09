package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Weapon extends Equipment {
	
	private static final String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Weapon[][] data = LoaderEquip.getWeapon();
	private static ArrayList<Weapon> customData = new ArrayList<Weapon>();
	
	protected WeaponType type;
	protected boolean uniqueEquip;
	protected boolean reinca;
	
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
	
	public static enum WeaponType implements EquipType {
		EPEE1M(0, "une épée une main", "", true), MARTEAU1M(1, "un marteau une main", "", true), HACHE1M(2, "une hache une main", "", true),
		EPEE2M(3, "une épée à deux mains", "", false), MARTEAU2M(4, "un marteau à deux mains", "", false), HACHE2M(5, "une hache à deux mains", "", false),
		MECA1M(6, "une arme mécanique une main", "", true), MECA2M(7, "une arme mécanique à deux mains", "", false),
		ARC(8, "un arc", "", false), GUN(9, "un pistolet", "", false), CANON(10, "un canon", "", false),
		RELIQUE(11, "une relique", "", false), BATON(12, "un bâton", "", false),
		LAME(13, "une lame", "", false), CLE(14, "une clé", "", false),
		BOUCLIER(15, "un bouclier", "", false),
		DEFAULT(16, "un défaut", "default", true),
		NONE(-1, "vide", "void", false);
		
		public final int index;
		public final String fr;
		public final String en;
		public final boolean isMainOneHand;
		 
	    private WeaponType(int index, String fr, String en, boolean isMainOneHand) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	        this.isMainOneHand = isMainOneHand;
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
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Weapon.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Weapon.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
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
			if(CustomEquipment.deleteNumber(weapon.getName(Language.FR)).equals(CustomEquipment.deleteNumber(name)) && weapon.getQuality() == quality && weapon.getSignature().equals(signature)) {
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
		ArrayList<Weapon> result = new ArrayList<Weapon>();
		int[] weaponType = null;
		switch (idList) {
			case 0 :
				weaponType = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 12, 13, 16 };
				break;
			case 1 : 
				weaponType = doubleWeapon ? new int[] { 0, 1, 2, 6, 15, 16 } : new int[] { 15 };
				break;
			case 2 :
				weaponType = new int[] { 8, 9, 10, 11, 14 };
				break;
		}
		
		result.add(new Weapon());
		
		for(Weapon custom : Weapon.customData) {
			if(!custom.containGrade(grade.getGrade())) {
				continue;
			}
			
			boolean allowType = false;
			for(int checkType : weaponType) {
				if(checkType == custom.getType().index) {
					allowType = true;
					break;
				}
			}
				 
			if(!allowType) {
				continue;
			}
			
			if(custom.getLvl() <= lvl) {
				if(!custom.isReinca()) {
					result.add(custom);
				} else {
					if(reinca.getLvl() > 0) {
						result.add(custom);
					}
				}
			}
		}
		
		for(int i = 0; i < weaponType.length; i++) {
			Weapon[] oneWeaponType = Weapon.data[weaponType[i]];
			for(int j = 0; j < oneWeaponType.length; j++) {
				if(!oneWeaponType[j].containGrade(grade.getGrade())) {
					continue;
				}
				
				if(oneWeaponType[j].getLvl() <= lvl) {
					if(!oneWeaponType[j].isReinca()) {
						result.add(oneWeaponType[j]);
					} else {
						if(reinca.getLvl() > 0) {
							result.add(oneWeaponType[j]);
						}
					}
				}
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		return result.toArray(new Weapon[result.size()]);
	}
}
