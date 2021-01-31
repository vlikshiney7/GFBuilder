package fr.vlik.grandfantasia.loader.customEquip;

import fr.vlik.grandfantasia.custom.CustomArmor;
import fr.vlik.grandfantasia.custom.CustomCape;
import fr.vlik.grandfantasia.custom.CustomRing;
import fr.vlik.grandfantasia.custom.CustomWeapon;

public class LoaderCustom {
	
	public static CustomWeapon[][] getCustomWeapon() {
		return new CustomWeapon[][] {
			LoaderCustomWeapon.getEp1M(),
			LoaderCustomWeapon.getMa1M(),
			LoaderCustomWeapon.getHa1M(),
			LoaderCustomWeapon.getEp2M(),
			LoaderCustomWeapon.getMa2M(),
			LoaderCustomWeapon.getHa2M(),
			LoaderCustomWeapon.getMeca1M(),
			LoaderCustomWeapon.getMeca2M(),
			LoaderCustomWeapon.getArc(),
			LoaderCustomWeapon.getGun(),
			LoaderCustomWeapon.getCanon(),
			LoaderCustomWeapon.getRel(),
			LoaderCustomWeapon.getBaton(),
			LoaderCustomWeapon.getLame(),
			LoaderCustomWeapon.getCle(),
			LoaderCustomWeapon.getBouclier(),
		};
	}
	
	public static CustomArmor[][] getCustomArmor() {
		return new CustomArmor[][] {
			LoaderCustomHelmet.getHelmet(),
			LoaderCustomBreastplate.getBreastplate(),
			LoaderCustomLegging.getLegging(),
			LoaderCustomGauntlet.getGauntlet(),
			LoaderCustomBoot.getBoot()
		};
	}
	
	public static CustomCape[] getCustomCape() {
		return LoaderCustomCape.getCape();
	}
	
	public static CustomRing[] getCustomRing() {
		return LoaderCustomRing.getRing();
	}
}
