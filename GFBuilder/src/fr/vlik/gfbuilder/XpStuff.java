package fr.vlik.gfbuilder;

import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect.TypeEffect;

public class XpStuff {
	
	private TypeEffect type;
	private ArrayList<Double> lvlValues = new ArrayList<Double>();
	
	public XpStuff(String type, double[] values) {
		this.type = TypeEffect.valueOf(type);
		
		for(int i = 0; i < values.length; i++) {
			this.lvlValues.add(values[i]);
		}
	}
	
	public TypeEffect getType() {
		return this.type;
	}
	
	public ArrayList<Double> getLvlValue() {
		return this.lvlValues;
	}
	
	public double getValueFromLvl(int index) {
		return this.lvlValues.get(index);
	}
}
