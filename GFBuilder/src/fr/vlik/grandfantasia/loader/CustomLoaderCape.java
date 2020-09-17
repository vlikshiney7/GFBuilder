package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.custom.CustomCape;

@SuppressWarnings("serial")
public class CustomLoaderCape {

	static CustomCape[] getCape() {
		CustomCape[] class1 = getGuerrier();
		CustomCape[] class2 = getArcher();
		CustomCape[] class3 = getPretre();
		CustomCape[] class4 = getMage();
		CustomCape[] class5 = getMeca();
		CustomCape[] class6 = getVoyageur();
		
		CustomCape[] result = new CustomCape[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length];
		
		int i = 0;
		for(; i < class1.length; i++) {
			result[i] = class1[i];
		}
		
		for(int j = 0; j < class2.length; i++, j++) {
			result[i] = class2[j];
		}
		
		for(int j = 0; j < class3.length; i++, j++) {
			result[i] = class3[j];
		}
		
		for(int j = 0; j < class4.length; i++, j++) {
			result[i] = class4[j];
		}

		for(int j = 0; j < class5.length; i++, j++) {
			result[i] = class5[j];
		}
		
		for(int j = 0; j < class6.length; i++, j++) {
			result[i] = class6[j];
		}
		
		return result;
	}
	
	private static CustomCape[] getGuerrier() {
		return new CustomCape[] {
			
		};
	}
	
	private static CustomCape[] getArcher() {
		return new CustomCape[] {
			
		};
	}
	
	private static CustomCape[] getPretre() {
		return new CustomCape[] {
			
		};
	}
	
	private static CustomCape[] getMage() {
		return new CustomCape[] {
			
		};
	}
	
	private static CustomCape[] getMeca() {
		return new CustomCape[] {
			
		};
	}
	
	private static CustomCape[] getVoyageur() {
		return new CustomCape[] {
			
		};
	}
}
