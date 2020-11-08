package fr.vlik.grandfantasia.loader;

import fr.vlik.grandfantasia.custom.CustomArmor;
import fr.vlik.grandfantasia.custom.CustomCape;
import fr.vlik.grandfantasia.custom.CustomRing;
import fr.vlik.grandfantasia.custom.CustomWeapon;

public class CustomLoader {
	
	public static CustomWeapon[][] getCustomWeapon() {
		return new CustomWeapon[][] {
			CustomLoaderWeapon.getEp1M(),
			CustomLoaderWeapon.getMa1M(),
			CustomLoaderWeapon.getHa1M(),
			CustomLoaderWeapon.getEp2M(),
			CustomLoaderWeapon.getMa2M(),
			CustomLoaderWeapon.getHa2M(),
			CustomLoaderWeapon.getMeca1M(),
			CustomLoaderWeapon.getMeca2M(),
			CustomLoaderWeapon.getArc(),
			CustomLoaderWeapon.getGun(),
			CustomLoaderWeapon.getCanon(),
			CustomLoaderWeapon.getRel(),
			CustomLoaderWeapon.getBaton(),
			CustomLoaderWeapon.getLame(),
			CustomLoaderWeapon.getCle(),
			CustomLoaderWeapon.getBouclier(),
		};
	}
	
	public static CustomArmor[][] getCustomArmor() {
		return new CustomArmor[][] {
			CustomLoaderHelmet.getHelmet(),
			CustomLoaderBreastplate.getBreastplate(),
			CustomLoaderLegging.getLegging(),
			CustomLoaderGauntlet.getGauntlet(),
			CustomLoaderBoot.getBoot()
		};
	}
	
	public static CustomCape[] getCustomCape() {
		return CustomLoaderCape.getCape();
	}
	
	public static CustomRing[] getCustomRing() {
		return CustomLoaderRing.getRing();
	}
}
