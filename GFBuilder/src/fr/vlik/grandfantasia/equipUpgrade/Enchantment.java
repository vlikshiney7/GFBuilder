package fr.vlik.grandfantasia.equipUpgrade;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.custom.CustomEquipment;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.EnchantType;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Enchantment implements Colorable, Writable {
	
	protected static Map<Quality, Enchantment[]> data = Loader.getEnchant();
	
	private String name;
	private int lvlMin;
	private int lvlMax;
	private Quality quality;
	private EnchantType[] tabType;
	private Calculable[] effects;
	
	public Enchantment() {
		this.name = " ";
		this.lvlMin = 0;
		this.lvlMax = 100;
		this.quality = Quality.GREY;
	}
	
	public Enchantment(String name, int lvlMin, int lvlMax, Quality quality, EnchantType[] tabType, Calculable[] effects) {
		this.name = name;
		this.lvlMin = lvlMin;
		this.lvlMax = lvlMax;
		this.quality = quality;
		this.tabType = tabType;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvlMin() {
		return this.lvlMin;
	}
	
	public int getLvlMax() {
		return this.lvlMax;
	}
	
	public Quality getQuality() {
		return this.quality;
	}
	
	public EnchantType[] getTabType() {
		return this.tabType;
	}
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		
		for(int i = 0; i < this.effects.length; i++) {
			Calculable c = this.effects[i];
			
			if(c instanceof Effect) {
				tab[i] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof RegenEffect) {
				tab[i] = new RegenEffect((RegenEffect) c);
			} else if(c instanceof Proc) {
				tab[i] = new Proc((Proc) c);
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
		StringBuilder tooltip = new StringBuilder("<ul><b>Statistique</b>");
		
		if(this.effects != null) {
			for(Calculable e : this.effects) {
				tooltip.append(e.getTooltip());
			}
		}
		tooltip.append("</ul>");
		
		return "<html>" + tooltip + "</html>";
	}

	@Override
	public Color getColor() {
		return this.quality.getColor();
	}
	
	public boolean containType(EnchantType type) {
		if(this.tabType == null) {
			return false;
		}
		
		for(EnchantType element : this.tabType) {
			if(element == type) {
				return true;
			}
		}
		
		return false;
	}
	
	public static Enchantment get(Equipment equip, String name) {
		if(equip.getQuality() != Quality.GREY) {
			for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
				if(enchant.getName().equals(name)
					&& equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
					
					return enchant;
				}
			}
		}
		
		return null;
	}
	
	public static Enchantment get(CustomEquipment equip, Quality quality, String name) {
		if(quality != Quality.GREY) {
			for(Enchantment enchant : Enchantment.data.get(quality)) {
				if(enchant.getName().equals(name)
					&& equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()
					&& enchant.containType(equip.getType())) {
					
					return enchant;
				}
			}
		}
		
		return null;
	}
	
	public static Enchantment[] getPossibleEnchant(Equipment equip) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		
		result.add(new Enchantment());
		
		for(Enchantment enchant : Enchantment.data.get(equip.getQuality())) {
			if(equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()) {
				if(enchant.containType(equip.getType())) {
					result.add(enchant);
				}
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
	
	public static Enchantment[] getPossibleEnchant(CustomEquipment equip, Quality quality) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		
		result.add(new Enchantment());
		
		if(equip != null && (quality == Quality.GREEN || quality == Quality.BLUE)) {
			for(Enchantment enchant : Enchantment.data.get(quality)) {
				if(equip.getLvl() >= enchant.getLvlMin() && equip.getLvl() <= enchant.getLvlMax()) {
					if(enchant.containType(equip.getType())) {
						result.add(enchant);
					}
				}
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
