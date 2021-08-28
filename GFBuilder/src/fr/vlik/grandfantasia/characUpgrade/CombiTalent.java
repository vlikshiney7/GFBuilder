package fr.vlik.grandfantasia.characUpgrade;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public final class CombiTalent extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Spécialité");
		put(Language.EN, "Speciality");
	}};
	
	private static String PATH = Tools.RESOURCE + Talent.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static CombiTalent[][] data = LoaderCharacUpgrade.getCombiTalent();
	
	private int[] code;
	
	public CombiTalent() {
		super();
		this.icon = setIcon("void");
	}
	
	public CombiTalent(Map<Language, String> name, int[] code, Calculable[] effects) {
		super(name, effects);
		this.code = code;
		this.icon = setIcon("combi");
	}
	
	public int[] getCode() {
		return this.code;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "";
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>" + this.name.get(Language.FR) + "</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
	
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(CombiTalent.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	public static CombiTalent getCombiTalent(GradeName grade, int[] code) {
		for(CombiTalent combi : CombiTalent.data[grade.index]) {
			boolean verif = true;
			for(int i = 0; i < combi.getCode().length; i++) {
				if(combi.getCode()[i] != code[i]) {
					verif = !verif;
					break;
				}
			}
			
			if(verif) {
				return combi;
			}
		}
		
		return new CombiTalent();
	}
}
