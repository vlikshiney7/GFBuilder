package fr.vlik.grandfantasia.customequip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public abstract class CustomEquipment extends IconBuff {
	
	public static final int NUMBER_BONUS_GREEN = 3;
	public static final int NUMBER_BONUS_BLUE = 6;
	
	protected GradeName[] grades;
	protected int lvl;
	protected String iconName;
	protected String signature;
	
	protected CustomEquipment(Map<Language, String> name, GradeName[] grades, int lvl, Calculable[] effects) {
		super(name, effects);
		this.grades = grades;
		this.lvl = lvl;
		this.signature = "";
	}
	
	protected CustomEquipment(CustomEquipment equipment) {
		this.name = equipment.getMap();
		this.grades = equipment.getGrades();
		this.lvl = equipment.getLvl();
		this.effects = equipment.getEffects();
		this.signature = "";
	}
	
	@Override
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
	
	public abstract EquipType getType();
	
	@Override
	public String getSelectorInfo(Language lang) {
		if(this.name.get(lang) == null) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	public Calculable[] constructEffects(Quality quality, Enchantment[] enchant) {
		ArrayList<Calculable> listEffects = new ArrayList<>();
		
		if(quality == Quality.GREEN) {
			StringBuilder toSign = new StringBuilder();
			
			for(int i = 0; i < 3; i++) {
				listEffects.addAll(Arrays.asList(enchant[i].getEffects()));
				toSign.append(enchant[i].getName(Language.FR) + "/");
			}
			
			this.signature += toSign;
		} else if(quality == Quality.BLUE) {
			StringBuilder toSign = new StringBuilder();
			
			for(int i = 0; i < 6; i++) {
				listEffects.addAll(Arrays.asList(enchant[i].getEffects()));
				toSign.append(enchant[i].getName(Language.FR) + "/");
			}
			
			this.signature += toSign;
		}
		
		return listEffects.toArray(new Calculable[listEffects.size()]);
	}
	
	public static String deleteNumber(String name) {
		if(name.matches(".* \\([0-9]*\\)$")) {
			return name.replaceFirst(" \\([0-9]*\\)", "");
		}
		
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + ((this.iconName == null) ? 0 : this.iconName.hashCode());
		result = prime * result + this.lvl;
		result = prime * result + ((this.signature == null) ? 0 : this.signature.hashCode());
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
		CustomEquipment other = (CustomEquipment) obj;
		if (!Arrays.equals(this.grades, other.grades)) {
			return false;
		}
		if (this.iconName == null) {
			if (other.iconName != null) {
				return false;
			}
		} else if (!this.iconName.equals(other.iconName)) {
			return false;
		}
		if (this.lvl != other.lvl) {
			return false;
		}
		if (this.signature == null) {
			if (other.signature != null) {
				return false;
			}
		} else if (!this.signature.equals(other.signature)) {
			return false;
		}
		return true;
	}
}
