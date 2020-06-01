package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;

public class SkillEffect implements Calculable {
	
	private TypeSkillEffect skill;
	private int value;
	private TypeValue type;
	
	
	public SkillEffect(TypeSkillEffect skill, int value, TypeValue type) {
		this.skill = skill;
		this.value = value;
		this.type = type;
	}
	
	public SkillEffect(SkillEffect skillEffect) {
		this.skill = skillEffect.getSkill();
		this.value = skillEffect.getValue();
		this.type = skillEffect.getType();
	}
	
	public static enum TypeValue {
		DAMAGE("Dégât", "damage"),
		DURATION("Durée", "duration"),
		NUMBER("Nombre", "number");
		
		public final String fr;
		public final String en;
		 
	    private TypeValue(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public TypeSkillEffect getSkill() {
		return this.skill;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public TypeValue getType() {
		return this.type;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		tooltip.append(this.type.fr + " de \"" + this.skill.fr + "\" +" + this.value);
		//tooltip.append("\"" + this.skill.en + "\" " + this.type.en + " +" + this.value);
		
		if(this.type == TypeValue.DAMAGE) {
			tooltip.append("%");
		} else if(this.type == TypeValue.DURATION) {
			tooltip.append("s");
		}
		
		return "<li>" + tooltip + "</li>";
	}

	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			result.append(this.skill.fr + " +" + this.value);
			
			if(this.type == TypeValue.DAMAGE) {
				result.append("%");
			} else if(this.type == TypeValue.DURATION) {
				result.append("s");
			}
		} else {
			result.append(this.skill.en + "+" + this.value);
			
			if(this.type == TypeValue.DAMAGE) {
				result.append("%");
			} else if(this.type == TypeValue.DURATION) {
				result.append("s");
			}
		}
		
		
		return result.toString();
	}
}
