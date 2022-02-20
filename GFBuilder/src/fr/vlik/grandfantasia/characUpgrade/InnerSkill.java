package fr.vlik.grandfantasia.characUpgrade;

import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerIconEffect;

public class InnerSkill extends InnerIconEffect {
	
	private int costPM;
	private double cooldown;
	private double timeCast;
	private int lvl;
	private int timeEffect = 0;

	public InnerSkill(Map<Language, String> name, int lvlBuff, String path, int costPM, double cooldown, double timeCast, int lvl, Calculable[] effects, int timeEffect) {
		super(name, path, lvlBuff, effects);
		this.costPM = costPM;
		this.cooldown = cooldown;
		this.timeCast = timeCast;
		this.lvl = lvl;
		this.timeEffect = timeEffect;
	}
	
	public InnerSkill(Map<Language, String> name, int lvlBuff, String path, int costPM, double cooldown, double timeCast, int lvl, Calculable[] effects) {
		super(name, path, lvlBuff, effects);
		this.costPM = costPM;
		this.cooldown = cooldown;
		this.timeCast = timeCast;
		this.lvl = lvl;
	}

	public int getCostPM() {
		return this.costPM;
	}
	
	public double getCooldown() {
		return this.cooldown;
	}
	
	public double getTimeCast() {
		return this.timeCast;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public int getTimeEffect() {
		return this.timeEffect;
	}
}
