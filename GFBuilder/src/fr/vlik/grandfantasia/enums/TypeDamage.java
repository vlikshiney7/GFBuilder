package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeDamage implements Colorable, Writable {
	
	Standard("Standard", "Standard", "Standard", "Standard", Tools.EffectColor[0]),
	Phys("Physique", "Physical", "Phys", "Phys", Tools.EffectColor[0]),
	Mag("Magique", "Magic", "Mag", "Mag", Tools.EffectColor[0]),
	AOE("Attaque de zone", "Area attack", "AOE", "AOE", Tools.EffectColor[0]),
	;
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final Color color;
	
	private TypeDamage(String fr, String en, String abbrevFR, String abbrevEN, Color color) {
    	this.fr = fr;
    	this.en = en;
    	this.abbrevFR = abbrevFR;
    	this.abbrevEN = abbrevEN;
        this.color = color;
    }

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public String getInfo(Language lang) {
		return lang == Language.FR ? this.abbrevFR : this.abbrevEN;
	}

	@Override
	public String getTooltip() {
		return this.fr;
	}
}
