package fr.vlik.grandfantasia.equip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.stats.Calculable;

public class RedWeapon extends Weapon {
	
	private Calculable[][] starEffects;
	
	public RedWeapon(RedWeapon redWeapon) {
		super(redWeapon);
		this.starEffects = redWeapon.getStarEffects();
	}
	
	public RedWeapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String iconPath, Tag[] tags, Calculable[] effects, Calculable[] bonusXP, Calculable[][] starEffects) {
		super(name, grades, lvl, quality, enchantable, type, uniqueEquip, reinca, iconPath, tags, effects, bonusXP);
		this.starEffects = starEffects;
	}
	
	public RedWeapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String iconPath, Calculable[] effects, Calculable[] bonusXP, Calculable[][] starEffects) {
		super(name, grades, lvl, quality, enchantable, type, uniqueEquip, reinca, iconPath, effects, bonusXP);
		this.starEffects = starEffects;
	}
	
	public Calculable[][] getStarEffects() {
		if(this.starEffects == null) {
			return new Calculable[0][0];
		}
		
		Calculable[][] list = new Calculable[this.starEffects.length][];
		
		for(int i = 0; i < this.starEffects.length; i++) {
			if(this.starEffects[i] == null) {
				list[i] = new Calculable[0];
			}
			
			Calculable[] tab = new Calculable[this.starEffects[i].length];
			for(int j = 0; j < tab.length; j++) {
				tab[j] = this.starEffects[i][j].copy();
			}
			
			list[i] = tab;
		}
		
		return list;
	}
	
	public Calculable[] getStarEffects(int nbStar) {
		if(this.starEffects == null) {
			return new Calculable[0];
		}
		
		List<Calculable> list = new ArrayList<>();
		
		for(int i = 0; i < nbStar; i++) {
			Calculable[] tab = new Calculable[this.starEffects[i].length];
			for(int j = 0; j < tab.length; j++) {
				tab[j] = this.starEffects[i][j].copy();
			}
			
			list.addAll(Arrays.asList(tab));
		}
		
		return list.toArray(new Calculable[list.size()]);
	}
	
	public void addFortif(double value) {
		if(this.effects != null) {
			double coefFortif = (value - 100) / 100 + 1;
			modifyAttack(coefFortif);
		}
	}
	
	@Override
	public String getFullInfo(Language lang) {
		StringBuilder result = new StringBuilder(super.getFullInfo(lang));
		
		if(this.starEffects != null) {
			result.append(LINE);
			
			for(int i = 0; i < this.starEffects.length; i++) {
				result.append(LINE + TAB + "<b>Fortification +" + ((i+1)*10) + "</b>" + TAB);
				
				if(this.starEffects[i] != null) {
					for(Calculable e : this.starEffects[i]) {
						result.append(LINE + TAB + TAB + "• " + e.getFullInfo(lang) + TAB);
					}
				}
			}
		}
		
		return toHTML(result);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(this.starEffects);
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
		RedWeapon other = (RedWeapon) obj;
		return Arrays.deepEquals(this.starEffects, other.starEffects);
	}
}
