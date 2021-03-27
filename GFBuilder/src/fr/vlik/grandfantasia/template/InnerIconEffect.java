package fr.vlik.grandfantasia.template;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;

public class InnerIconEffect extends IconBuff {
	
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
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
	public String getInfo(Language lang) {
		if(this.name.get(lang) == "") {
			return this.name.get(Language.FR) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
		}
		return this.name.get(lang) + (this.lvlBuff != 0 ? " " + this.lvlBuff : "");
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(InnerIconEffect.class.getResource(Tools.RESOURCE + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
}
