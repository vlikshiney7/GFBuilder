package fr.vlik.grandfantasia.characUpgrade;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public final class CombiTalent implements Writable {
	
	private static CombiTalent[][] data = Loader.getCombiTalent();
	
	private String name;
	private int[] code;
	private Calculable[] effects;
	
	public CombiTalent() {
		this.name = "";
	}
	
	public CombiTalent(String name, int[] code, Calculable[] effects) {
		this.name = name;
		this.code = code;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getCode() {
		return this.code;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		for(int i = 0; i < tab.length; i++) {
			if(this.effects[i] instanceof Effect) {
				tab[i] = new Effect((Effect) this.effects[i]);
			} else {
				tab[i] = this.effects[i];
			}
		}
		
		return tab;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static CombiTalent getCombiTalent(GradeName grade, int[] code) {
		CombiTalent result = new CombiTalent();
		for(CombiTalent combi : CombiTalent.data[grade.index]) {
			boolean verif = true;
			for(int i = 0; i < combi.getCode().length; i++) {
				if(combi.getCode()[i] != code[i]) {
					verif = !verif;
					break;
				}
			}
			
			if(verif) {
				result = combi;
				break;
			}
		}
		
		return result;
	}
}
