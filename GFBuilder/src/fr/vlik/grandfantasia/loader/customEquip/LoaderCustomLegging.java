package fr.vlik.grandfantasia.loader.customEquip;

import fr.vlik.grandfantasia.customEquip.CustomArmor;

@SuppressWarnings("serial")
class LoaderCustomLegging {
	
	static CustomArmor[] getLegging() {
		CustomArmor[] class1 = getGuerrier();
		CustomArmor[] class2 = getArcher();
		CustomArmor[] class3 = getPretre();
		CustomArmor[] class4 = getMage();
		CustomArmor[] class5 = getMeca();
		CustomArmor[] class6 = getVoyageur();
		
		CustomArmor[] result = new CustomArmor[class1.length + class2.length + class3.length + class4.length + class5.length + class6.length];
		
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
	
	private static CustomArmor[] getGuerrier() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getArcher() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getPretre() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getMage() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getMeca() {
		return new CustomArmor[] {
			
		};
	}
	
	private static CustomArmor[] getVoyageur() {
		return new CustomArmor[] {
			
		};
	}
}