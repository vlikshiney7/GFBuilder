package fr.vlik.grandfantasia.template;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class IconBuff extends Buff implements Iconable {
	
	private static final String PATH = Tools.RESOURCE + IconBuff.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	
	protected Icon icon;
	
	public IconBuff() {
		super();
		this.icon = setIcon("null");
	}
	
	public IconBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, effects);
		this.icon = setIcon(path);
	}
	
	public IconBuff(Map<Language, String> name, Calculable[] effects) {
		super(name, effects);
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(IconBuff.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
}
