package fr.vlik.grandfantasia.equip;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public abstract class Equipment extends CompleteBuff {
	
	protected GradeName[] grades;
	protected int lvl;
	protected boolean enchantable;
	protected Calculable[] bonusXP;
	
	protected boolean isCustom = false;
	protected String signature = "";
	
	protected Equipment() {
		super();
		this.grades = new GradeName[] {	GradeName.NONE };
		this.lvl = 0;
		this.enchantable = false;
	}
	
	protected Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, Calculable[] effects, Calculable[] bonusXP) {
		super(name, quality, effects);
		this.grades = grades;
		this.lvl = lvl;
		this.enchantable = enchantable;
		this.bonusXP = bonusXP;
	}
	
	protected Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, Calculable[] effects, String signature) {
		super(name, quality, effects);
		this.grades = grades;
		this.lvl = lvl;
		this.enchantable = false;
		
		this.isCustom = true;
		this.signature = signature;
	}
	
	public GradeName[] getGrades() {
		return this.grades;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public boolean isEnchantable() {
		return this.enchantable;
	}
	
	public Calculable[] getBonusXP() {
		if(this.bonusXP == null) {
			return new Calculable[0];
		}
		
		Calculable[] tab = new Calculable[this.bonusXP.length];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = this.bonusXP[i].copy();
		}
		
		return tab;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(!this.enchantable || enchant == null || enchant.getEffects() == null) {
			return;
		}
		
		for(Calculable c : enchant.getEffects()) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				double value = e.getValue();
				boolean found = false;
				
				for(Calculable calculable : this.effects) {
					if(calculable instanceof Effect) {
						Effect get = (Effect) calculable;
						
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(value);
							
							found = true;
							break;
						}
					}
				}
				
				if(!found) {
					Calculable[] newTab = Arrays.copyOf(this.effects, this.effects.length + 1);
					newTab[this.effects.length] = e;
					
					this.effects = newTab;
				}
			}
		}
	}
	
	public boolean isCustom() {
		return this.isCustom;
	}
	
	public String getSignature() {
		return this.signature;
	}
	
	public abstract EquipType getType();
	
	public boolean containGrade(GradeName grade) {
		if(grade == GradeName.NONE) {
			return true;
		}
		
		return Tools.containObject(this.grades, grade);
	}
	
	protected void addNumberName(int num) {
		if(num == 1) {
			for(Entry<Language, String> entry : this.name.entrySet()) {
				this.name.put(entry.getKey(), entry.getValue() + " (1)");
			}
		} else {
			for(Entry<Language, String> entry : this.name.entrySet()) {
				this.name.put(entry.getKey(), entry.getValue().replace("(" + (num-1) + ")", "(" + num + ")"));
			}
		}
	}
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return "Lvl " + this.lvl + " - " + this.name.get(Language.FR);
		}
		return "Lvl " + this.lvl + " - " + this.name.get(lang);
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		if(this.bonusXP != null) {
			tooltip.append("<ul><b>Bonus XP Stuff lvl " + this.lvl + "</b>");
			
			for(Calculable e : this.bonusXP) {
				tooltip.append(e.getTooltip());
			}
			tooltip.append("</ul>");
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(this.bonusXP);
		result = prime * result + (this.enchantable ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(this.grades);
		result = prime * result + (this.isCustom ? 1231 : 1237);
		result = prime * result + this.lvl;
		result = prime * result + ((this.signature == null) ? 0 : this.signature.hashCode());
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
		Equipment other = (Equipment) obj;
		if (!Arrays.equals(this.bonusXP, other.bonusXP)) {
			return false;
		}
		if (this.enchantable != other.enchantable) {
			return false;
		}
		if (!Arrays.equals(this.grades, other.grades)) {
			return false;
		}
		if (this.isCustom != other.isCustom) {
			return false;
		}
		if (this.lvl != other.lvl) {
			return false;
		}
		if (this.signature == null) {
			if (other.signature != null) {
				return false;
			}
		} else if (!this.signature.equals(other.signature)) {
			return false;
		}
		return true;
	}
}
