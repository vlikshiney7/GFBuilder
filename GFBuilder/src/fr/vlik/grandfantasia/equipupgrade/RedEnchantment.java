package fr.vlik.grandfantasia.equipupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;

public class RedEnchantment extends Enchantment {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Enchantement");
		put(Language.EN, "Enchantment");
	}};
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> SUB_CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Raffinage");
		put(Language.EN, "Refining");
	}};
	
	private InnerEffect[] lvlEffect;
	private boolean isRefining = false;
	
	public RedEnchantment() {
		super();
	}
	
	public RedEnchantment(Map<Language, String> name, int lvlMin, int lvlMax, EquipType[] tabType, Calculable[][] lvlEffect) {
		super(name, lvlMin, lvlMax, Quality.RED, tabType, null);
		
		this.lvlEffect = new InnerEffect[lvlEffect.length];
		for(int i = 0; i < lvlEffect.length; i++) {
			int lvl = i+1;
			this.lvlEffect[i] = new InnerEffect(name, lvl, lvlEffect[i]);
		}
	}
	
	public RedEnchantment(Map<Language, String> name, int lvlMin, int lvlMax, EquipType[] tabType, Calculable[][] lvlEffect, boolean isRefining) {
		super(name, lvlMin, lvlMax, Quality.RED, tabType, null);
		
		this.lvlEffect = new InnerEffect[lvlEffect.length];
		for(int i = 0; i < lvlEffect.length; i++) {
			int lvl = i+1;
			this.lvlEffect[i] = new InnerEffect(name, lvl, lvlEffect[i]);
		}
		
		this.isRefining = isRefining;
	}
	
	public boolean isRefining() {
		return this.isRefining;
	}
	
	@Override
	public String getFullInfo(Language lang) {
		if(this.lvlEffect == null) {
			return "";
		}
		return this.lvlEffect[0].getFullInfo(lang);
	}
	
	public InnerEffect[] getInnerEffect() {
		return this.lvlEffect;
	}
	
	public InnerEffect getInnerEffect(int lvl) {
		if(lvl == 0 || this.lvlEffect == null) {
			return null;
		}
		
		for(InnerEffect inner : this.lvlEffect) {
			if(lvl == inner.getLvlbuff()) {
				return inner;
			}
		}
		
		return null;
	}
	
	public static InnerEffect[] cumulConstraint(List<InnerEffect> innerEffect) {
		List<InnerEffect> result = new ArrayList<>();
		
		for(InnerEffect current : innerEffect) {
			InnerEffect toAdd = current;
			InnerEffect toRemove = null;
			
			for(InnerEffect calculated : result) {
				
				if(calculated.getName(Language.FR).equals(current.getName(Language.FR))) {
					if(calculated.getLvlbuff() < current.getLvlbuff()) {
						toRemove = calculated;
					} else {
						toAdd = null;
					}
				}
			}
			
			if(toRemove != null) {
				result.remove(toRemove);
			}
			
			if(toAdd != null) {
				result.add(toAdd);
			}
		}
		
		return result.toArray(new InnerEffect[result.size()]);
	}
	
	public static RedEnchantment[] getPossibleRedEnchant(Equipment equip, RedEnchantment ignore1, RedEnchantment ignore2) {
		List<RedEnchantment> result = new ArrayList<>();
		
		result.add(new RedEnchantment());
		
		if(equip.getQuality() == Quality.RED) {
			for(Enchantment preCast : Enchantment.data.get(equip.getQuality())) {
				RedEnchantment enchant = (RedEnchantment) preCast;
				
				if(equip.getLvl() >= enchant.getLvlMin()
						&& equip.getLvl() <= enchant.getLvlMax()
						&& enchant.containType(equip.getType())) {
					
					result.add(enchant);
				}
			}
		}
		
		if(ignore1 != null && !ignore1.equals(new RedEnchantment())) {
			result.remove(ignore1);
		}
		
		if(ignore2 != null && !ignore2.equals(new RedEnchantment())) {
			result.remove(ignore2);
		}
		
		return result.toArray(new RedEnchantment[result.size()]);
	}
	

	public static RedEnchantment[] getPossibleRefining(Equipment equip) {
		List<RedEnchantment> result = new ArrayList<>();
		
		result.add(new RedEnchantment());
		
		if(equip.getQuality() == Quality.RED) {
			for(Enchantment preCast : Enchantment.data.get(equip.getQuality())) {
				RedEnchantment enchant = (RedEnchantment) preCast;
				
				if(equip.getLvl() >= enchant.getLvlMin()
						&& equip.getLvl() <= enchant.getLvlMax()
						&& enchant.containType(equip.getType())
						&& enchant.isRefining()) {
					
					result.add(enchant);
				}
			}
		}
		
		return result.toArray(new RedEnchantment[result.size()]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (this.isRefining ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(this.lvlEffect);
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
		RedEnchantment other = (RedEnchantment) obj;
		if (this.isRefining != other.isRefining) {
			return false;
		}
		return Arrays.equals(this.lvlEffect, other.lvlEffect);
	}
}
