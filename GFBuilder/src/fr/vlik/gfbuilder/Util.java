package fr.vlik.gfbuilder;

public class Util {
	
	public static String[] setFortifFormat(int nb) {
		String[] result = new String[nb+1];
		
		for(int i = 0; i <= nb; i++) {
			result[i] = "+" + i;
		}
		
		return result;
	}
}
