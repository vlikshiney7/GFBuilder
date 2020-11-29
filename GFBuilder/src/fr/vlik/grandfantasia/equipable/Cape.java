package fr.vlik.grandfantasia.equipable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Cape extends Equipment {
	
	public static String PATH = Tools.RESOURCE + "capering/" + Cape.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Cape[] data = Loader.getCape();
	private static ArrayList<Cape> customData = new ArrayList<Cape>();
	
	private String setCode;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Cape() {
		super();
		
		this.setCode = "-1";
		this.isMultiEffect = false;
		this.icon = setIcon("null");
	}
	
	public Cape(Cape cape) {
		super(cape.getMap(), cape.getGrades(), cape.getLvl(), cape.getQuality(), cape.isEnchantable(), cape.getEffects(), cape.getBonusXP());
		
		this.setCode = cape.getSetCode();
		this.icon = cape.getIcon();
	}
	
	public Cape(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, String setCode, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.setCode = setCode;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Cape(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, String setCode, String path, MultiEffect effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, null, bonusXP);
		
		this.setCode = setCode;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public Cape(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, String path, Calculable[] effects, String signature) {
		super(name, grades, lvl, quality, effects, signature);
		
		this.setCode = "-1";
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public static enum CapeType implements EnchantType {
		CAPE;
	}
	
	@Override
	public CapeType getType() {
		return CapeType.CAPE;
	}
	
	public String getSetCode() {
		return this.setCode;
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
		ImageIcon back = new ImageIcon(Cape.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Cape.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public void toCode(String path) {
		String code = "new Cape(new HashMap<Language, String>() {{ put(Language.FR, \"" + this.name.get(Language.FR) + "\"); put(Language.EN, \"\"); }},\n";
		
		code += "\tnew GradeName[] { ";
		for(GradeName grade : this.grades) {
			code += "GradeName." + grade + ", ";
		}
		code += "},\n";
		
		code += "\t" + this.lvl + ", ";
		code += "Quality." + this.quality + ", ";
		code += this.enchantable + ", ";
		code += "\"" + this.setCode + "\", ";
		code += "\"" + path + "\", ";
		code += "new Calculable[] {\n";
		
		for(Calculable c : this.effects) {
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
		
		code += "\t}, null ),";
		
		code = code.replace(".0)", ")");
		code = code.replace(".0,", ",");
		
		System.out.println(code);
	}
	
	public static void addCustom(Cape cape) {
		Cape.customData.add(cape);
	}
	
	public static Cape get(String name, Language lang) {
		for(Cape cape : Cape.data) {
			if(cape.getName(lang).equals(name)) {
				return cape;
			}
		}
		
		return null;
	}
	
	public static Cape getCustom(String name, Language lang) {
		for(Cape cape : Cape.customData) {
			if(cape.getName(lang).equals(name)) {
				return cape;
			}
		}
		
		return null;
	}
	
	public static Cape getCustom(String name, Quality quality, String signature) {
		for(Cape cape : Cape.customData) {
			if(cape.getName(Language.FR).equals(name) && cape.getQuality() == quality && cape.getSignature().equals(signature)) {
				return cape;
			}
		}
		
		return null;
	}
	
	public static Cape[] getCustomData() {
		Cape[] cast = new Cape[customData.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = customData.get(i);
		}
		
		return cast;
	}
	
	public static Cape[] getPossibleCape(GradeName grade, int lvl) {
		ArrayList<Cape> result = new ArrayList<Cape>();
		
		result.add(new Cape());
		
		for(Cape custom : Cape.customData) {
			if(custom.getLvl() <= lvl && custom.containGrade(grade)) {
				result.add(custom);
			}
		}
		
		for(Cape cape : Cape.data) {
			if(cape.getLvl() <= lvl && cape.containGrade(grade)) {
				if(cape.isMultiEffect()) {
					cape.setEffects(lvl);
				}
				result.add(cape);
			}
		}
		
		Cape[] cast = new Cape[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
