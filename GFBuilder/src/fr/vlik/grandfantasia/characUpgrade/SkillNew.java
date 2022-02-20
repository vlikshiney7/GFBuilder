package fr.vlik.grandfantasia.characUpgrade;

import fr.vlik.grandfantasia.charac.Grade.GradeName;

public class SkillNew {
	
	private GradeName[] grades;
	private SkillType skillType;
	private boolean isReinca;
	private String skillCode;
	private InnerSkill[] innerSkill;
	
	public SkillNew(GradeName[] grades, SkillType skillType, boolean isReinca, String skillCode, InnerSkill[] innerSkill) {
		this.grades = grades;
		this.skillType = skillType;
		this.isReinca = isReinca;
		this.skillCode = skillCode;
		this.innerSkill = innerSkill;
	}
	
	public static enum SkillType {
		INNE(0, "Compétence innée", "Innate skill"),
		PASSIVE(1, "Compétence passive", "Passive skill"),
		DAMAGE(2, "Compétence agressive", "Agressive skill"),
		AUTOBUFF(3, "Buff personnel", "Self buff"),
		BUFF(4, "Buff", "Buff"),
		DEBUFF(5, "Debuff", "Debuff"),
		HEAL(6, "Heal", "Heal");
		
		public final int index;
		public final String fr;
		public final String en;
		 
	    private SkillType(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public GradeName[] getGrades() {
		return this.grades;
	}
	
	public SkillType getSkillType() {
		return this.skillType;
	}
	
	public boolean isReinca() {
		return this.isReinca;
	}
	
	public String getSkillCode() {
		return this.skillCode;
	}
	
	public InnerSkill[] getInnerSkill() {
		return this.innerSkill;
	}
}
