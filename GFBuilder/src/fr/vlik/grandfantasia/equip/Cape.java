package fr.vlik.grandfantasia.equip;

import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customequip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public class Cape extends Equipment {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Cape");
		put(Language.EN, "Cape");
	}};
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Cape.class.getSimpleName().toLowerCase() + File.separator;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Cape[] data = LoaderEquip.getCape();
	private static ArrayList<Cape> customData = new ArrayList<>();
	
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
	
	public enum CapeType implements EquipType {
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
		ImageIcon back = new ImageIcon(Cape.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Cape.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
	}
	
	public static void addCustom(Cape cape) {
		if(getCustom(cape.getName(Language.FR), cape.getQuality(), cape.getSignature()) == null) {
			int i = 1;
			boolean found = true;
			
			while(found) {
				found = false;
				for(Cape custom : Cape.customData) {
					if(custom.getName(Language.FR).equals(cape.getName(Language.FR))) {
						cape.addNumberName(i++);
						found = true;
						break;
					}
				}
			}
			
			Cape.customData.add(cape);
		}
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
			if(CustomEquipment.deleteNumber(cape.getName(Language.FR)).equals(CustomEquipment.deleteNumber(name)) && cape.getQuality() == quality && cape.getSignature().equals(signature)) {
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
		ArrayList<Cape> result = new ArrayList<>();
		
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
		
		return result.toArray(new Cape[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.isMultiEffect ? 1231 : 1237);
		result = prime * result + ((this.multiEffects == null) ? 0 : this.multiEffects.hashCode());
		result = prime * result + ((this.setCode == null) ? 0 : this.setCode.hashCode());
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
		Cape other = (Cape) obj;
		if (this.isMultiEffect != other.isMultiEffect) {
			return false;
		}
		if (this.multiEffects == null) {
			if (other.multiEffects != null) {
				return false;
			}
		} else if (!this.multiEffects.equals(other.multiEffects)) {
			return false;
		}
		if (this.setCode == null) {
			if (other.setCode != null) {
				return false;
			}
		} else if (!this.setCode.equals(other.setCode)) {
			return false;
		}
		return true;
	}
}
