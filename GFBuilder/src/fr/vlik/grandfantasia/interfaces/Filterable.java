package fr.vlik.grandfantasia.interfaces;

public interface Filterable {
	
	public static boolean andValue(boolean[] filters) {
		for(boolean filter : filters) {
			if(!filter) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean orValue(boolean[] filters) {
		for(boolean filter : filters) {
			if(filter) {
				return true;
			}
		}
		
		return false;
	}
}
