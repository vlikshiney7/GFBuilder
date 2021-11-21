package fr.vlik.grandfantasia.enums;

import fr.vlik.grandfantasia.interfaces.Writable;

public enum NameTransform implements Writable {
	
	Transform0("Démon Géant", "Giant Evil"),
	Transform1("Lion", "Lion"),
	Transform2("Pirate", "Pirate"),
	Transform3("Sprite Géant", "Giant Sprite"),
	Transform4("Disciple", "Disciple"),
	Transform5("Créature effrayante", "Scary creature"),
	Transform6("Gélapin Pirate", "Pirate Jelly Rabbit"),
	Transform7("Soldat Insecte Géant", "Giant Soldier Insect"),
	Transform8("Plante Géante", "Giant Plant"),
	Transform9("Grand Manchot de Noël", "Great Christmas Penguin"),
	Transform10("Roi des dindes de Thanksgiving", "Thanksgiving turkey king"),
	Transform11("Jajar Gélapin angélique", "Jajar Angelic Jelly Rabbit"),
	Transform12("Lulhu Gélapin démoniaque", "Lulhu Demonic Jelly Rabbit"),
	Transform13("Gughu Gélapin glouton", "Gughu Gluttonous Jelly Rabbit"),
	Transform14("Ballon festif", "Festive balloon"),
	Transform15("Maître farceur", "Master joker"),
	Transform16("Cavalier Géant", "Giant Horseman"),
	Transform17("Gélapin des Sources", "Sources Jelly Rabit"),
	Transform18("Agarma, le Vil'marée", "Treacherous Torrent, Enigmus"),
	Transform19("Miaoubline", "Felissan"),
	Transform20("Monstre de l'Arène de Feu", "Fire Arena Monster"),
	Transform21("Gardien Grayd", "Guardian Grayd"),
	Transform22("Bête du Feu Éternel", "Eternal Fire Beast"),
	Transform23("Chevreuil Sauvage", "Wild Deer"),
	Transform24("Capitaine blindé du Kansas", "Kansas Armored Captain"),
	Transform25("Insecte géant", "Giant insect"),
	Transform26("Gadouillos, Boue Mangetout", "Muddy Maw, Gaius"),
	Transform27("Kutila, Vétéran", "Field Marshal, Kutila"),
	Transform28("Bulles bleues", "Blue bubbles"),
	Transform29("Citrouille", "Pumpkin"),
	Transform30("Sprite miraculeux", "Miraculous Sprite"),
	Transform31("Non humain", "No human"),
	Transform32("Arbre", "Tree"),
	Transform33("Super-héros", "Superheroe"),
	Transform34("Sprite d'anniversaire", "Birthday Sprite"),
	
	Invoc0("Dinde rôtie", "Roast Turkey"),
	Invoc1("Enfant du Miracle", "Miracle Child"),
	Invoc2("Ardenis", "Ardenis"),
	Invoc3("Baha", "Baha"),
	
	;
	
	public final String fr;
	public final String en;
	
    private NameTransform(String fr, String en) {
    	this.fr = fr;
    	this.en = en;
    }
    
	@Override
	public String getInfo(Language lang) {
		return lang == Language.FR ? this.fr : this.en;
	}

	@Override
	public String getTooltip() {
		return this.fr;
	}
}
