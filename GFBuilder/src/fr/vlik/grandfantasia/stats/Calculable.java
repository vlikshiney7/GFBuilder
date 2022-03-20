package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.interfaces.Writable;

public interface Calculable extends Writable {
	
	public Calculable copy();
	
	public void multiplyValue(int factor);
}
