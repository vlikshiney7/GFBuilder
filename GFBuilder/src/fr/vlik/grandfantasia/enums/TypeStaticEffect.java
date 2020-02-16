package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeStaticEffect implements Colorable, Writable {
	
	x2STD("Dégât x2 sur Coup Standard", "Damage x2 in standard hit", "DEG x2 STD", "DAM x2 STD", Tools.EffectColor[0]),
	x3STD("Dégât x3 sur Coup Standard", "Damage x3 in standard hit", "DEG x3 STD", "DAM x3 STD", Tools.EffectColor[0]),
	x2Skill("Dégât x2", "Damage x2", "DEG x2", "DAM x2", Tools.EffectColor[0]),
	x3Skill("Dégât x3", "Damage x3", "DEG x3", "DAM x3", Tools.EffectColor[0]),
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[0]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[0]);
	
	public final String fr;
	public final String en;
	public final String abbrevFR;
	public final String abbrevEN;
	public final Color color;
	
    private TypeStaticEffect(String fr, String en, String abbrevFR, String abbrevEN, Color color) {
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
	
	public static TypeStaticEffect get(String name, Language lang) {
		for(TypeStaticEffect type : TypeStaticEffect.values()) {
			if(type.getInfo(lang).equals(name)) {
				return type;
			}
		}
		
		return null;
	}
}