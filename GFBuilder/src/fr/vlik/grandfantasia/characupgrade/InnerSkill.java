package fr.vlik.grandfantasia.characupgrade;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(this.cooldown);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + this.costPM;
		result = prime * result + this.lvl;
		temp = Double.doubleToLongBits(this.timeCast);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + this.timeEffect;
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
		InnerSkill other = (InnerSkill) obj;
		if (Double.doubleToLongBits(this.cooldown) != Double.doubleToLongBits(other.cooldown)) {
			return false;
		}
		if (this.costPM != other.costPM) {
			return false;
		}
		if (this.lvl != other.lvl) {
			return false;
		}
		if (Double.doubleToLongBits(this.timeCast) != Double.doubleToLongBits(other.timeCast)) {
			return false;
		}
		return this.timeEffect == other.timeEffect;
	}
}
