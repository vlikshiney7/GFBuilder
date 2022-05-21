package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.customequip.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.loader.equip.LoaderEquip;
import fr.vlik.grandfantasia.stats.Calculable;

public final class Ring extends Equipment {
	
	private static final String PATH = Tools.RESOURCE + "capering/" + Ring.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	private static Ring[] data = LoaderEquip.getRing();
	private static ArrayList<Ring> customData = new ArrayList<>();
	
	private static Tag[] tags = new Tag[] { Tag.BOSS, Tag.DONJON, Tag.FORMULE, Tag.GVG, Tag.QUETE, Tag.TAROT, Tag.OTHER, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD };
	
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
	
	public enum RingType implements EquipType {
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
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Ring.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return Tools.constructIcon(back, object);
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
		return get(Ring.data, name, lang);
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
		return Arrays.copyOf(customData.toArray(new Ring[0]), customData.size());
	}
	
	public static Ring[] getPossibleRing(int lvl, Ring toIgnore) {
		ArrayList<Ring> result = new ArrayList<>();
		
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

	public static Tag[] getTags() {
		return Ring.tags;
	}
	
	public static Quality[] getQualities() {
		return Ring.qualities;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.setCode == null) ? 0 : this.setCode.hashCode());
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
		Ring other = (Ring) obj;
		if (this.setCode == null) {
			if (other.setCode != null) {
				return false;
			}
		} else if (!this.setCode.equals(other.setCode)) {
			return false;
		}
		return this.uniqueEquip == other.uniqueEquip;
	}
}
