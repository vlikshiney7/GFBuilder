package fr.vlik.grandfantasia.template;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.stats.Calculable;

public abstract class IconBuff extends Buff implements Iconable {
	
	private static final String PATH = Tools.RESOURCE + IconBuff.class.getSimpleName().toLowerCase() + File.separator;
	private static final Map<String, Icon> ICONS = new HashMap<>();
	
	protected Icon icon;
	
	protected IconBuff() {
		super();
		this.icon = setIcon("null");
	}
	
	protected IconBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, effects);
		this.icon = setIcon(path);
	}
	
	protected IconBuff(Map<Language, String> name, Calculable[] effects) {
		super(name, effects);
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(IconBuff.class.getResource(PATH + path + Tools.PNG)) );
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.icon == null) ? 0 : this.icon.hashCode());
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
		IconBuff other = (IconBuff) obj;
		if (this.icon == null) {
			if (other.icon != null) {
				return false;
			}
		} else if (!this.icon.equals(other.icon)) {
			return false;
		}
		return true;
	}
}
