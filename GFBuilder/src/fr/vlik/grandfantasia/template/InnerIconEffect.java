package fr.vlik.grandfantasia.template;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;

public class InnerIconEffect extends IconBuff {
	
	private static final Map<String, Icon> ICONS = new HashMap<>();
	private int lvlBuff;
	
	public InnerIconEffect(Map<Language, String> name, String path, int lvlBuff, Calculable[] effects) {
		super(name, effects);
		this.lvlBuff = lvlBuff;
		this.icon = setIcon(path);
	}
	
	public int getLvlbuff() {
		return this.lvlBuff;
	}
	
	@Override
	public String getSelectorInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return this.name.get(Language.FR) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
		}
		return this.name.get(lang) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(InnerIconEffect.class.getResource(Tools.RESOURCE + path + Tools.PNG)) );
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + this.lvlBuff;
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
		InnerIconEffect other = (InnerIconEffect) obj;
		return this.lvlBuff == other.lvlBuff;
	}
}
