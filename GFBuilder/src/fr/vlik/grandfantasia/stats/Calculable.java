package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Check;
import fr.vlik.grandfantasia.enums.Target;
import fr.vlik.grandfantasia.interfaces.Writable;

public abstract class Calculable implements Writable {
	
	protected Target target = Target.SELF;
	protected Check verified = Check.UNCHECK;
	
	public Target getTarget() {
		return this.target;
	}
	
	public Check getCheck() {
		return this.verified;
	}
	
	public abstract Calculable copy();
	
	public abstract void multiplyValue(int factor);
}
