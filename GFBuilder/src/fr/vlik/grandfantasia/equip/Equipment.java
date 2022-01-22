package fr.vlik.grandfantasia.equip;

import java.util.Map;
import java.util.Map.Entry;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
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
	
	public Equipment() {
		super();
		this.grades = new GradeName[] {	GradeName.NONE };
		this.lvl = 0;
		this.enchantable = false;
	}
	
	public Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, Calculable[] effects, Calculable[] bonusXP) {
		super(name, quality, effects);
		this.grades = grades;
		this.lvl = lvl;
		this.enchantable = enchantable;
		this.bonusXP = bonusXP;
	}
	
	public Equipment(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, Calculable[] effects, String signature) {
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
		return Tools.getEffects(this.bonusXP);
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
					Calculable[] newTab = new Calculable[this.effects.length + 1];
					
					for(int i = 0; i < this.effects.length; i++) {
						newTab[i] = this.effects[i];
					}
					
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
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Equipment)) {
			return false;
		}
		
		Equipment equip = (Equipment) obj;
		boolean b = this.name.equals(equip.name)
				&& this.lvl == equip.lvl
				&& this.quality == equip.quality;
		
		return b;
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
		if(this.name.get(lang) == "") {
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
}
