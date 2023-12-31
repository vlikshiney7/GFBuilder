package fr.vlik.grandfantasia.stats;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;

public class SkillEffect extends Calculable {
	
	private TypeSkillEffect skill;
	private double value;
	private TypeValue type;
	
	
	public SkillEffect(TypeSkillEffect skill, double value, TypeValue type) {
		this.skill = skill;
		this.value = value;
		this.type = type;
	}
	
	public SkillEffect(SkillEffect skillEffect) {
		this.skill = skillEffect.getSkill();
		this.value = skillEffect.getValue();
		this.type = skillEffect.getType();
	}
	
	public Calculable copy() {
		return new SkillEffect(this);
	}
	
	public enum TypeValue {
		DAMAGE("Dégât", "damage"),
		DURATION("Durée", "duration"),
		HEAL("Soin", "heal"),
		MANA("Mana", "mana"),
		ESQ("Esquive", "evasion"),
		NUMBER("Nombre", "number"),
		PARA("Durée paralysie", "paralysis duration"),
		FUFU("Mouvement non réduite", "No reduce movement"),
		RELOAD("Rechargement", "Reload"),
		LEVEL("Niveau", "Level");
		
		public final Map<Language, String> skill;
		 
	    @SuppressWarnings("serial")
		private TypeValue(String fr, String en) {
	    	this.skill = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, fr); put(Language.EN, en); }};
	    }
	    
	    public String getName(Language lang) {
			if(this.skill == null) {
				return "";
			} else if(this.skill.get(lang) == null || this.skill.get(lang).equals("")) {
				return this.skill.get(Language.FR);
			}
			
			return this.skill.get(lang);
		}
	}
	
	public TypeSkillEffect getSkill() {
		return this.skill;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public TypeValue getType() {
		return this.type;
	}
	
	public void multiplyValue(int factor) {
		this.value *= factor;
	}
	
	public String getName(Language lang) {
		return this.skill.getName(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.skill.getName(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.type == TypeValue.FUFU || this.type == TypeValue.RELOAD) {
				result += this.type.getName(lang) + " de \"" + this.skill.getName(lang) + "\"";
			} else {
				result += this.skill.getName(lang) + " +" + this.value;
			}
			
			if(this.type == TypeValue.DAMAGE || this.type == TypeValue.HEAL || this.type == TypeValue.MANA || this.type == TypeValue.PARA) {
				result += "%";
			} else if(this.type == TypeValue.DURATION) {
				result += "s";
			}
		} else {
			if(this.type == TypeValue.FUFU || this.type == TypeValue.RELOAD) {
				result += this.type.getName(lang) + " of \"" + this.skill.getName(lang) + "\"";
			} else {
				result += this.skill.getName(lang) + " +" + this.value;
			}
			
			if(this.type == TypeValue.DAMAGE || this.type == TypeValue.HEAL || this.type == TypeValue.MANA || this.type == TypeValue.PARA) {
				result += "%";
			} else if(this.type == TypeValue.DURATION) {
				result += "s";
			}
		}
		
		return result;
	}
}
