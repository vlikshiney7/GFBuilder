package fr.vlik.grandfantasia.characupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.InnerIconEffect;

public class Skill extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME_PASSIVE = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Compétences passives");
		put(Language.EN, "Passive skills");
	}};
	
	private static Skill[][] dataPassive = LoaderCharacUpgrade.getPassiveSkill();
	private static Skill[] dataUpgrade = LoaderCharacUpgrade.getUpgradeSkill();
	
	private int[] lvl;
	private InnerIconEffect[] lvlEffect;
	
	@SuppressWarnings("serial")
	public Skill(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, effects);
		this.lvl = new int[] { lvl };
		String lvlSkill = "Lvl " + lvl + " - ";
		
		this.lvlEffect = new InnerIconEffect[] {
			new InnerIconEffect(new EnumMap<Language, String>(Language.class) {{
				put(Language.FR, lvlSkill + name.get(Language.FR));
				put(Language.EN, lvlSkill + name.get(Language.EN));
			}}, "skill/" + path, 0, effects)
		};
	}
	
	@SuppressWarnings("serial")
	public Skill(Map<Language, String> name, int[] lvl, String path, Calculable[][] lvlEffects) {
		super(name, null);
		this.lvl = lvl;
		
		this.lvlEffect = new InnerIconEffect[lvlEffects.length];
		for(int i = 0; i < lvlEffects.length; i++) {
			int oneLvl = i+1;
			String lvlSkill = "Lvl " + this.lvl[i] + " - ";
			
			Calculable[] effect = lvlEffects[i];
			this.lvlEffect[i] = new InnerIconEffect(new EnumMap<Language, String>(Language.class) {{
				put(Language.FR, lvlSkill + name.get(Language.FR));
				put(Language.EN, lvlSkill + name.get(Language.EN));
			}}, "skill/" + path, oneLvl, effect);
		}
	}
	
	@SuppressWarnings("serial")
	public Skill(Map<Language, String> name, int[] lvl, String[] path, Calculable[][] lvlEffects) {
		super(name, null);
		this.lvl = lvl;
		
		this.lvlEffect = new InnerIconEffect[lvlEffects.length+1];
		this.lvlEffect[0] = new InnerIconEffect(new HashMap<Language, String>() {{
			put(Language.FR, name.get(Language.FR) + " - Non acquis");
			put(Language.EN, name.get(Language.EN) + " - Not acquired");
		}}, "skill/32-7", 0, null);
		
		for(int i = 0; i < lvlEffects.length; i++) {
			int oneLvl = i+1;
			String lvlSkill = "Lvl " + this.lvl[i] + " - ";
			
			Calculable[] effect = lvlEffects[i];
			this.lvlEffect[i+1] = new InnerIconEffect(new HashMap<Language, String>() {{
				put(Language.FR, lvlSkill + name.get(Language.FR));
				put(Language.EN, lvlSkill + name.get(Language.EN));
			}}, "skill/" + path[i], oneLvl, effect);
		}
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public InnerIconEffect getCurrentEffect(int lvl) {
		for(int i = this.lvl.length-1; i >= 0; i--) {
			if(lvl >= this.lvl[i]) {
				return this.lvlEffect[i];
			}
		}
		
		return null;
	}
	
	public InnerIconEffect[] getInnerSkill(int lvl) {
		ArrayList<InnerIconEffect> result = new ArrayList<>();
		result.add(this.lvlEffect[0]);
		
		for(int i = 0; i < this.lvl.length; i++) {
			if(this.lvl[i] <= lvl) {
				result.add(this.lvlEffect[i+1]);
			}
		}
		
		return result.toArray(new InnerIconEffect[result.size()]);
	}
	
	public static Skill[] getPassiveSkill(Grade grade) {
		return Skill.dataPassive[grade.getGrade().index];
	}
	
	public static Skill getUpgradeSkill(Grade grade) {
		return Skill.dataUpgrade[grade.getGrade().index / 2];
	}
	
	public static Skill getReinca() {
		return Skill.dataUpgrade[6];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lvl);
		result = prime * result + Arrays.hashCode(lvlEffect);
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
		Skill other = (Skill) obj;
		if (!Arrays.equals(lvl, other.lvl)) {
			return false;
		}
		return Arrays.equals(lvlEffect, other.lvlEffect);
	}
}
