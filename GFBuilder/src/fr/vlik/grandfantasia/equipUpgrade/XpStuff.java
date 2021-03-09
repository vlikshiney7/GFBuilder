package fr.vlik.grandfantasia.equipUpgrade;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equip.Ride;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.EquipType;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.equipUpgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;

public class XpStuff implements Colorable, Writable {
	
	private static XpStuff[] data = LoaderEquipUpgrade.getXpStuff();
	
	private TypeEffect type;
	private EquipType[] tabType;
	private InnerEffect[] lvlEffect;
	
	public XpStuff() {
		this.type = TypeEffect.NONE;
	}
	
	@SuppressWarnings("serial")
	public XpStuff(TypeEffect type, EquipType[] tabType, Calculable[] effects) {
		this.type = type;
		this.tabType = tabType;
		
		this.lvlEffect = new InnerEffect[effects.length];
		for(int i = 0; i < effects.length; i++) {
			int lvl = i+1;
			String name = "Lvl";
			Calculable[] effect = new Calculable[] { effects[i] };
			this.lvlEffect[i] = new InnerEffect(new HashMap<Language, String>() {{ put(Language.FR, name); put(Language.EN, name); }}, lvl, effect);
		}
	}
	
	public TypeEffect getType() {
		return this.type;
	}
	
	public InnerEffect[] getInnerEffect() {
		return this.lvlEffect;
	}
	
	public InnerEffect getInnerEffect(int lvl) {
		if(lvl == 0) {
			return null;
		}
		
		for(InnerEffect inner : this.lvlEffect) {
			if(lvl == inner.getLvlbuff()) {
				return inner;
			}
		}
		
		return null;
	}
	
	@Override
	public String getInfo(Language lang) {
		if(lang == Language.EN && !this.type.abbrevEN.equals("")) {
			return this.type.abbrevEN;
		}
		return this.type.abbrevFR;
	}
	
	@Override
	public String getTooltip() {
		return this.type.fr;
	}
	
	@Override
	public Color getColor() {
		return this.type.getColor();
	}
	
	public InnerEffect[] getPossibleLvl(InnerEffect inner) {
		InnerEffect[] result = new InnerEffect[101 - inner.getLvlbuff()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = this.lvlEffect[i];
		}
		
		return result;
	}
	
	public boolean containType(EquipType type) {
		if(this.tabType == null) {
			return false;
		}
		
		for(EquipType element : this.tabType) {
			if(element == type) {
				return true;
			}
		}
		
		return false;
	}
	
	public static XpStuff get(Equipment equip, String name) {
		for(XpStuff xpStuff : XpStuff.data) {
			if(xpStuff.containType(equip.getType())) {
				if(xpStuff.getInfo(Language.FR).equals(name)) {
					return xpStuff;
				}
			}
		}
		
		return null;
	}
	
	public static XpStuff get(Ride ride, String name) {
		for(XpStuff xpStuff : XpStuff.data) {
			if(xpStuff.containType(ride.getType())) {
				if(xpStuff.getInfo(Language.FR).equals(name)) {
					return xpStuff;
				}
			}
		}
		
		return null;
	}
	
	public static XpStuff[] getPossibleTypeEffect(Equipment equip) {
		ArrayList<XpStuff> result = new ArrayList<XpStuff>();
		
		result.add(new XpStuff());
		
		for(XpStuff xpStuff : XpStuff.data) {
			if(xpStuff.containType(equip.getType())) {
				result.add(xpStuff);
			}
		}
		
		return result.toArray(new XpStuff[result.size()]);
	}
	
	public static XpStuff[] getPossibleTypeEffect(Ride ride) {
		ArrayList<XpStuff> result = new ArrayList<XpStuff>();
		
		result.add(new XpStuff());
		
		for(XpStuff xpStuff : XpStuff.data) {
			if(xpStuff.containType(ride.getType())) {
				result.add(xpStuff);
			}
		}
		
		return result.toArray(new XpStuff[result.size()]);
	}
}
