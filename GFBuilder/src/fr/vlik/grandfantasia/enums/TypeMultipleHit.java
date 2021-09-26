package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeMultipleHit implements Colorable, Writable {
	
	Double("Dégât x2", "Damage x2", "Deg x2", "Dam x2", Tools.EffectColor[7]),
	Triple("Dégât x3", "Damage x3", "Deg x3", "Dam x3", Tools.EffectColor[10]),
	ReflectP("Dégât Physique Renvoyé", "", "Deg Phys Refl", "", Tools.EffectColor[10]),
	ReflectM("Dégât Magique Renvoyé", "", "Deg Mag Refl", "", Tools.EffectColor[11]),
	;
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final Color color;
	
	private TypeMultipleHit(String fr, String en, String abbrevFR, String abbrevEN, Color color) {
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