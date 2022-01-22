package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customEquip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Armor extends Equipment {
	
	private static final String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static Armor[][] data = LoaderEquip.getArmor();
	private static ArrayList<Armor> customData = new ArrayList<Armor>();

	private static Tag[] tags = new Tag[] { Tag.BOSS, Tag.DONJON, Tag.EVENT, Tag.FORMULE, Tag.GVG, Tag.PVP, Tag.QUETE, Tag.SPRITE, Tag.TAROT, Tag.OTHER, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD, Quality.PURPLE, Quality.RED };
	
	private ArmorType type;
	private String setCode;
	private boolean reinca;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	private Tag[] tag;
	
	public Armor() {
		super();
		
		this.type = ArmorType.NONE;
		this.setCode = "-1";
		this.reinca = false;
		this.isMultiEffect = false;
		this.icon = setIcon("null");
	}
	
	public Armor(Armor armor) {
		super(armor.getMap(), armor.getGrades(), armor.getLvl(), armor.getQuality(), armor.isEnchantable(), armor.getEffects(), armor.getBonusXP());
		
		this.type = armor.getType();
		this.setCode = armor.getSetCode();
		this.reinca = armor.isReinca();
		this.isMultiEffect = armor.isMultiEffect();
		this.multiEffects = armor.getMultiEffect();
		this.icon = armor.getIcon();
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, Tag[] tags, Calculable[] effects, Calculable[] bonusXP) {
		this(name, grades, lvl, quality, enchantable, reinca, type, setCode, path, effects, bonusXP);
		
		this.tag = tags;
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, MultiEffect effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, null, bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, ArmorType type, String path, Calculable[] effects, String signature) {
		super(name, grades, lvl, quality, effects, signature);
		
		this.type = type;
		this.setCode = "-1";
		this.reinca = false;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public static enum ArmorType implements EquipType {
		CASQUE(0, "casque", "helmet"),
		PLASTRON(1, "plastron", "breastplate"),
		JAMBIERE(2, "jambière", "legging"),
		GANT(3, "gantelet", "gauntlet"),
		BOTTE(4, "botte", "boot"),
		NONE(-1, "vide", "void");
		
		public final int index;
		public final String fr;
		public final String en;
		 
	    private ArmorType(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	@Override
	public ArmorType getType() {
		return this.type;
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}

	public Tag[] getTag() {
		return this.tag;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public MultiEffect getMultiEffect() {
		return this.isMultiEffect ? new MultiEffect(this.multiEffects.getLvlMin(), this.multiEffects.getEffects()) : null;
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public Calculable[] getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Armor.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Armor.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public void addFortif(Fortification fortif) {
		if(this.effects != null) {
			modifyDefense(fortif.getCoef());
		}
	}
	
	protected void modifyDefense(double coef) {
		for(Calculable c : this.effects) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				
				if(e.getType().isUpgradable && !e.isPercent() && e.getWithReinca()) {
					e.changeValue(coef);
				}
			}
		}
	}
	
	public static void addCustom(Armor armor) {
		if(getCustom(armor.getName(Language.FR), armor.getQuality(), armor.getSignature()) == null) {
			int i = 1;
			boolean found = true;
			
			while(found) {
				found = false;
				for(Armor custom : Armor.customData) {
					if(custom.getName(Language.FR).equals(armor.getName(Language.FR))) {
						armor.addNumberName(i++);
						found = true;
						break;
					}
				}
			}
			
			Armor.customData.add(armor);
		}
	}
	
	public static Armor get(String name, Language lang, int list) {
		for(Armor armor : Armor.data[list]) {
			if(armor.getName(lang).equals(name)) {
				return armor;
			}
		}
		
		return null;
	}
	
	public static Armor getCustom(String name, Language lang) {
		for(Armor armor : Armor.customData) {
			if(armor.getName(lang).equals(name)) {
				return armor;
			}
		}
		
		return null;
	}
	
	public static Armor getCustom(String name, Quality quality, String signature) {
		for(Armor armor : Armor.customData) {
			if(CustomEquipment.deleteNumber(armor.getName(Language.FR)).equals(CustomEquipment.deleteNumber(name)) && armor.getQuality() == quality && armor.getSignature().equals(signature)) {
				return armor;
			}
		}
		
		return null;
	}
	
	public static Armor[] getCustomData() {
		Armor[] cast = new Armor[customData.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = customData.get(i);
		}
		
		return cast;
	}
	
	public static Armor[] getPossibleArmor(int idList, Grade grade, int lvl, Reinca reinca) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		ArmorType armorType = ArmorType.values()[idList];
		
		result.add(new Armor());
		
		for(Armor custom : Armor.customData) {
			Map<Object, Object> properties = new HashMap<Object, Object>();
			properties.put(custom.getGrades(), grade.getGrade());
			properties.put(custom.getLvl(), lvl);
			properties.put(custom.isReinca(), reinca);
			properties.put(custom.getType(), armorType);
			
			if(Tools.evaluateProperties(properties)) {
				result.add(custom);
			}
		}
		
		for(Armor armor : Armor.data[idList]) {
			Map<Object, Object> properties = new HashMap<Object, Object>();
			properties.put(armor.getGrades(), grade.getGrade());
			properties.put(armor.getLvl(), lvl);
			properties.put(armor.isReinca(), reinca);
			
			if(Tools.evaluateProperties(properties)) {
				if(armor.isMultiEffect()) {
					armor.setEffects(lvl);
				}
				result.add(armor);
			}
		}
		
		return result.toArray(new Armor[result.size()]);
	}
	
	public static Armor[] applyFilters(Armor[] possible, Armor choice, String key, Filterable[] filter, boolean andValue) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		
		result.add(new Armor());
		if(!choice.equals(new Armor())) {
			if(Tools.containObject(possible, choice)) {
				result.add(choice);
			}
		}
		
		for(Armor armor : possible) {
			boolean[] filters = new boolean[] {
				Tools.searchOnName(key, armor.getMap(), andValue),
				Tools.containObject(filter, armor.getQuality()),
				//Tools.containFilter(filter, armor.getTag()),
			};
			
			if(andValue ? Filterable.andValue(filters) : Filterable.orValue(filters)) {
				if(!choice.equals(armor)) {
					result.add(armor);
				}
			}
		}
		
		return result.toArray(new Armor[result.size()]);
	}
	
	public static Tag[] getTags() {
		return Armor.tags;
	}
	
	public static Quality[] getQualities() {
		return Armor.qualities;
	}
}
