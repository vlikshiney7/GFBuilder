package fr.vlik.grandfantasia.enums;

import java.awt.Color;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeStaticEffect implements Colorable, Writable {
	
	x2STD("Dégât x2 sur Coup Standard", "Damage x2 in standard hit", "DEG x2 STD", "DAM x2 STD", Tools.EffectColor[7]),
	x3STD("Dégât x3 sur Coup Standard", "Damage x3 in standard hit", "DEG x3 STD", "DAM x3 STD", Tools.EffectColor[10]),
	x2Skill("Dégât x2", "Damage x2", "DEG x2", "DAM x2", Tools.EffectColor[7]),
	x3Skill("Dégât x3", "Damage x3", "DEG x3", "DAM x3", Tools.EffectColor[10]),
	
	Poisse("Taux d'échec de compétence", "Casting Fail Rate", "Taux Poisse", "Fail Rate", Tools.EffectColor[8]),
	AntiStun("Immunité au coma et étourdissement", "Immune to dizziness and stun", "Anti Stun", "Anti Stun", Tools.EffectColor[12]),
	AntiDodo("Immunité à l'endormissement", "Immune to sleep", "Anti Dodo", "Anti Sleep", Tools.EffectColor[12]),
	
	DegNature716("716 Dégâts Nature sur attaque physique", "716 Natural Damage with physical attack", "716 Deg Nature", "716 Natural Dam", Tools.EffectColor[12]),
	DegNature541("541 Dégâts Nature sur attaque physique", "541 Natural Damage with physical attack", "541 Deg Nature", "541 Natural Dam", Tools.EffectColor[12]),
	DegFeu294("294 Dégâts Feu sur attaque physique", "294 Fire Damage with physical attack", "294 Deg Feu", "294 Fire Dam", Tools.EffectColor[10]),
	
	ProcT0L85Q5("Défense Physique -100", "Physical défense -100", "DÉF -100", "DEF -100", Tools.EffectColor[0]),
	ProcT0L80Q5N0("PM de l'ennemi -3500 ~ -5000", "Opponent MP -3500 ~ -5000", "PM -3500 ~ -5000", "MP -3500 ~ -5000", Tools.EffectColor[0]),
	ProcT0L80Q5N1("VOL de l'ennemi -180", "Opponent WIL -180", "VOL -180", "WIL -180", Tools.EffectColor[0]),
	ProcT0L80Q3("Déplacement de l'ennemi -30%", "Opponent speed -30%", "Dépla -30%", "Speed -30%", Tools.EffectColor[0]),
	ProcT0L70Q3("Compétences bloquées", "Skills blocked", "Anti Compétences", "Anti Skills", Tools.EffectColor[8]),
	ProcT0L50Q5("Déplacement de l'ennemi -50%", "Opponent speed -50%", "Dépla -50%", "Speed -50%", Tools.EffectColor[0]),
	ProcT0L48Q4("Poison 4 : -200 PV chaque 2 secondes", "Poison 4 : -200 HP per 2 seconds", "-200 PV / 2s", "-200 HP / 2s", Tools.EffectColor[8]),
	;
	
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
