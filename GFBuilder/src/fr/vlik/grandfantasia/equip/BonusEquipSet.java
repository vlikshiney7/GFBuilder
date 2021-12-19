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
		String info = "";
		
		if(this.name.get(lang).equals("")) {
			info += this.name.get(Language.FR);
		} else {
			info += this.name.get(lang);
		}
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				info += "\n\t- " + e.toString(lang);
			}
		}
		
		return info.replaceAll("\n$", "");
	}
	
	@Override
	public Color getColor() {
		return this.isActivate ? Tools.itemColor[this.quality.index] : Tools.itemColor[0];
	}
}
