package fr.vlik.grandfantasia.custom;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.Icon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public abstract class CustomEquipment implements Iconable, Writable {
	
	public final static int NumberBonusGreen = 3;
	public final static int NumberBonusBlue = 6;
	
	protected Map<Language, String> name;
	protected GradeName[] grades;
	protected int lvl;
	protected String iconName;
	protected String signature;
	protected Icon icon;
	protected Calculable[] effects;
	
	public CustomEquipment(Map<Language, String> name, GradeName[] grades, int lvl, Calculable[] effects) {
		this.name = name;
		this.grades = grades;
		this.lvl = lvl;
		this.effects = effects;
		this.signature = "";
	}
	
	protected Map<Language, String> getMap() {
		return this.name;
	}
	
	public String getName(Language lang) {
		return this.name.get(lang);
	}
	
	public GradeName[] getGrades() {
		return this.grades;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public String getIconName() {
		return this.iconName;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public abstract Icon setIcon(String path);
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else {
				tab[i] = this.effects[i];
			}
		}
		
		return tab;
	}
	
	public abstract EnchantType getType();
	
	public boolean containGrade(GradeName grade) {
		if(grade == GradeName.NONE) {
			return true;
		}
		
		for(GradeName element : this.grades) {
			if(element == grade) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof CustomEquipment)) {
			return false;
		}
		
		CustomEquipment equip = (CustomEquipment) obj;
		boolean b = this.name.equals(equip.name)
				&& this.lvl == equip.lvl;
		
		return b;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(this.name.get(lang) == null) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}
	
	public Calculable[] constructEffects(Quality quality, Enchantment[] enchant) {
		ArrayList<Calculable> listEffects = new ArrayList<Calculable>();
		
		if(quality == Quality.GREEN) {
			for(int i = 0; i < 3; i++) {
				for(Calculable c : enchant[i].getEffects()) {
					listEffects.add(c);
				}
				
				this.signature += enchant[i].getName() + "/";
			}
		} else if(quality == Quality.BLUE) {
			for(int i = 0; i < 6; i++) {
				for(Calculable c : enchant[i].getEffects()) {
					listEffects.add(c);
				}
				
				this.signature += enchant[i].getName() + "/";
			}
		}
		
		Calculable[] tabEffects = new Calculable[listEffects.size()];
		tabEffects = listEffects.toArray(tabEffects);
		
		return tabEffects;
	}
}
