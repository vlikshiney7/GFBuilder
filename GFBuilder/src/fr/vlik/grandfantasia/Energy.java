package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class Energy implements Iconable, Writable {
	
	public static String PATH = Tools.RESOURCE + Energy.class.getSimpleName().toLowerCase() + "/";
	private static Energy[] data;
	static {
		data = Loader.getEnergy();
	}
	
	private final Map<Language, String> name;
	private final ArrayList<Effect> effects;
	private final Icon icon;
	
	public Energy (Map<Language, String> name, String path, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
		this.icon = setIcon(path);
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public Icon setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object =  new ImageIcon(Energy.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Effect multiplyEffect(Effect effect, int point) {
		return new Effect(effect.getType(), effect.isPercent(), effect.getValue() * point, effect.getWithReinca(), effect.getWithWeapon(), null);
	}
	
	public static Energy[] getData() {
		return Energy.data;
	}
}
