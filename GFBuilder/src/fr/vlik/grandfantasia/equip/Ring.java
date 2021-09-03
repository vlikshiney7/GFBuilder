package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customEquip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public final class Ring extends Equipment {
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Ring[] data = LoaderEquip.getRing();
	private static ArrayList<Ring> customData = new ArrayList<Ring>();
	
	private String setCode;
	private boolean uniqueEquip;
	
	public Ring() {
		super();
		
		this.setCode = "-1";
		this.uniqueEquip = false;
		this.icon = setIcon("null");
	}
	
	public Ring(Ring ring) {
		super(ring.getMap(), new GradeName[] { GradeName.NONE }, ring.getLvl(), ring.getQuality(), ring.isEnchantable(), ring.getEffects(), ring.getBonusXP());
		
		this.setCode = ring.getSetCode();
		this.uniqueEquip = ring.isUniqueEquip();
		this.icon = ring.getIcon();
	}
	
	public Ring(Map<Language, String> name, int lvl, Quality quality, boolean enchantable, String setCode, boolean uniqueEquip, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, new GradeName[] { GradeName.NONE } , lvl, quality, enchantable, effects, bonusXP);
		
		this.setCode = setCode;
		this.uniqueEquip = uniqueEquip;
		this.icon = setIcon(path);
	}
	
	public Ring(Map<Language, String> name, int lvl, Quality quality, String path, Calculable[] effects, String signature) {
		super(name, new GradeName[] { GradeName.NONE } , lvl, quality, effects, signature);
		
		this.setCode = "-1";
		this.uniqueEquip = false;
		this.icon = setIcon(path);
	}
	
	public static enum RingType implements EquipType {
		RING;
	}
	
	@Override
	public RingType getType() {
		return RingType.RING;
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isUniqueEquip() {
		return this.uniqueEquip;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Ring.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Ring.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public static void addCustom(Ring ring) {
		if(getCustom(ring.getName(Language.FR), ring.getQuality(), ring.getSignature()) == null) {
			int i = 1;
			boolean found = true;
			
			while(found) {
				found = false;
				for(Ring custom : Ring.customData) {
					if(custom.getName(Language.FR).equals(ring.getName(Language.FR))) {
						ring.addNumberName(i++);
						found = true;
						break;
					}
				}
			}
			
			Ring.customData.add(ring);
		}
	}
	
	public static Ring get(String name, Language lang) {
		for(Ring ring : Ring.data) {
			if(ring.getName(lang).equals(name)) {
				return ring;
			}
		}
		
		return null;
	}
	
	public static Ring getCustom(String name, Language lang) {
		for(Ring ring : Ring.customData) {
			if(ring.getName(lang).equals(name)) {
				return ring;
			}
		}
		
		return null;
	}
	
	public static Ring getCustom(String name, Quality quality, String signature) {
		for(Ring ring : Ring.customData) {
			if(CustomEquipment.deleteNumber(ring.getName(Language.FR)).equals(CustomEquipment.deleteNumber(name)) && ring.getQuality() == quality && ring.getSignature().equals(signature)) {
				return ring;
			}
		}
		
		return null;
	}
	
	public static Ring[] getCustomData() {
		Ring[] cast = new Ring[customData.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = customData.get(i);
		}
		
		return cast;
	}
	
	public static Ring[] getPossibleRing(int lvl, Ring toIgnore) {
		ArrayList<Ring> result = new ArrayList<Ring>();
		
		result.add(new Ring());
		
		for(Ring custom : Ring.customData) {
			if(custom.getLvl() <= lvl) {
				result.add(custom);
			}
		}
		
		for(Ring ring : Ring.data) {
			if(ring.getLvl() <= lvl) {
				result.add(ring);
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		return result.toArray(new Ring[result.size()]);
	}
}
