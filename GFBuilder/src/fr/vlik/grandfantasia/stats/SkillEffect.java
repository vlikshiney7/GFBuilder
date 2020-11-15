package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeSkillEffect;

public class SkillEffect implements Calculable {
	
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
	
	public static enum TypeValue {
		DAMAGE("Dégât", "damage"),
		DURATION("Durée", "duration"),
		HEAL("Soin", "heal"),
		MANA("Mana", "mana"),
		ESQ("Esquive", "evasion"),
		NUMBER("Nombre", "number"),
		PARA("Durée paralysie", "paralysis duration"),
		FUFU("Mouvement non réduite", "No reduce movement"),
		RELOAD("Rechargement", "Reload");
		
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
	
	public double getValue() {
		return this.value;
	}
	
	public TypeValue getType() {
		return this.type;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.type == TypeValue.FUFU || this.type == TypeValue.RELOAD) {
			tooltip.append(this.type.fr + " de \"" + this.skill.fr + "\"");
		} else {
			tooltip.append(this.type.fr + " de \"" + this.skill.fr + "\" +" + this.value);
		}
		//tooltip.append("\"" + this.skill.en + "\" " + this.type.en + " +" + this.value);
		
		if(this.type == TypeValue.DAMAGE || this.type == TypeValue.HEAL || this.type == TypeValue.MANA || this.type == TypeValue.PARA) {
			tooltip.append("%");
		} else if(this.type == TypeValue.DURATION) {
			tooltip.append("s");
		}
		
		return "<li>" + tooltip + "</li>";
	}

	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			if(this.type == TypeValue.FUFU || this.type == TypeValue.RELOAD) {
				result.append(this.type.fr + " de \"" + this.skill.fr + "\"");
			} else {
				result.append(this.skill.fr + " +" + this.value);
			}
			
			if(this.type == TypeValue.DAMAGE || this.type == TypeValue.HEAL || this.type == TypeValue.MANA || this.type == TypeValue.PARA) {
				result.append("%");
			} else if(this.type == TypeValue.DURATION) {
				result.append("s");
			}
		} else {
			if(this.type == TypeValue.FUFU || this.type == TypeValue.RELOAD) {
				result.append(this.type.en + " of \"" + this.skill.en + "\"");
			} else {
				result.append(this.skill.en + " +" + this.value);
			}
			
			if(this.type == TypeValue.DAMAGE || this.type == TypeValue.HEAL || this.type == TypeValue.MANA || this.type == TypeValue.PARA) {
				result.append("%");
			} else if(this.type == TypeValue.DURATION) {
				result.append("s");
			}
		}
		
		return result.toString();
	}
}
