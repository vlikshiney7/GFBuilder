package fr.vlik.grandfantasia.equip;

import java.awt.Color;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class BonusEquipSet extends ColorBuff {
	
	private boolean isActivate;
	
	public BonusEquipSet() {
		super();
		this.isActivate = false;
	}
	
	public BonusEquipSet(BonusEquipSet bonusEquipSet, boolean isActivate) {
		super(bonusEquipSet.getMap(), bonusEquipSet.getQuality(), bonusEquipSet.getEffects());
		this.isActivate = isActivate;
	}
	
	public BonusEquipSet(Map<Language, String> name, Quality quality, Calculable[] effects) {
		super(name, quality, effects);
		this.isActivate = false;
	}
	
	public boolean isActivate() {
		return this.isActivate;
	}
	
	@Override
	public String getInfo(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(this.name.get(lang).equals("")) {
			result.append(this.name.get(Language.FR));
		} else {
			result.append(this.name.get(lang));
		}
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				result.append("\n\t- " + e.toString(lang));
			}
		}
		
		return result.toString().replaceAll("\n$", "");
	}
	
	@Override
	public Color getColor() {
		return this.isActivate ? Tools.itemColor[this.quality.index] : Tools.itemColor[0];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.isActivate ? 1231 : 1237);
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
		BonusEquipSet other = (BonusEquipSet) obj;
		return this.isActivate == other.isActivate;
	}
}
