package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.TypeStaticEffect;

public class StaticEffect implements Calculable {
	
	private TypeStaticEffect type;
	private int taux = -1;
	
	
	public StaticEffect(TypeStaticEffect type) {
		this.type = type;
	}
	
	public StaticEffect(TypeStaticEffect type, int taux) {
		this.type = type;
		this.taux = taux;
	}
	
	public StaticEffect(StaticEffect staticEffect) {
		this.type = staticEffect.getType();
		this.taux = staticEffect.getTaux();
	}
	
	public TypeStaticEffect getType() {
		return this.type;
	}
	
	public int getTaux() {
		return this.taux;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.taux == -1) {
			tooltip.append(this.type.abbrevFR);
		} else {
			tooltip.append(this.taux + "% " + this.type.abbrevFR);
		}
		return "<li>" + tooltip + "</li>";
	}
}
