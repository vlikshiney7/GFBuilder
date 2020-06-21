package fr.vlik.grandfantasia.enums;

import fr.vlik.grandfantasia.interfaces.Writable;

public enum TypeSkillEffect implements Writable {
	
	Class0S0("Fureur du Gladiateur", "Warlord Fury"),
	Class0S1("Choc Sismique", "Ground Pulse Wave"),
	Class0S2("Souffle Destructeur", "Crushing Blow"),
	Class0S3("Danse du chaos", "Dance of Chaos"),
	Class0S4("Frappe de Déferlement d'Air", "Skybreaker Strike"),
	Class0S5("Méga Tornade", "Super Twister's Chop"),
	Class0S6("Entaille de la Violente Tornade", "Wild Whirlwind Slash"),
	Class0S7("Magma Terrestre", "Earth's Core Impact"),
	Class0S8("Souffle Ravageur", "Shattering Blow"),
	Class0S9("Choc Terrestre", "Earth Shock"),
	Class0S10("Vague de Pouvoir", "Power Wave"),
	Class0S11("Danse Démente", "Lunatic Dance"),
	Class0S12("Danse du Berserker", "Berserk Dance"),
	Class0S13("Choc Sismique Guerrier", "Demon Warrior Shockwave"),
	Class0S14("Choc Démoniaque", "Demonic Shockwave"),
	Class0S15("Frappe Intersidérale", "Air Razor"),
	Class0S16("Super Frappe Intersidérale", "Super Air Razor"),
	
	Class1S0("Lame Ensanglantée", "Carnage Blade Strike"),
	Class1S1("Lame de Vertu", "Saintly Blade"),
	Class1S2("Coup de Justice", "Strike of Justice"),
	Class1S3("Bouclier vengeur", "Shield of Thorns"),
	Class1S4("Lame sacrée", "Edge of Righteousness"),
	Class1S5("Coup Sacré", "Holy Strike"),
	Class1S6("Embrasement Sacré", "Super Holy Blaze"),
	Class1S7("Radiance Éternelle", "Eternal Radiance"),
	Class1S8("Coup de Bouclier Puissant", "Mighty Shield Bash"),
	Class1S9("Brise-Armure", "Armor-Cracking Assault"),
	Class1S10("Coup de Bouclier Lourd", "Shield Smite"),
	Class1S11("Grenade du Sacré", "Holy Light Grenade"),
	Class1S12("Défense Totale", "Perfect Defense"),
	Class1S13("Défense Remarquable", "Absolute Defense"),
	Class1S14("Défense Absolue", "True Absolute Defense"),
	Class1S15("Attaque de Vérité", "Strike of Truth"),
	Class1S16("Assaut Révélateur", "Truth Assault"),
	Class1S17("Pouvoir de la vérité", "Might of Truth"),
	Class1S18("Aura de Guérison", "Healing Aura"),
	Class1S19("Sainte Aura de Guérison", "Holy Healing Aura"),
	Class1S20("Grenade de Gloire Sacrée", "Sacred Light Grenade"),
	Class1S21("Fusillade Sainte", "Holy Tracer Bullet"),
	
	Class2S0("Tir puissant", "Power Shot"),
	Class2S1("Réflexes de Mangouste", "Mongoose Reflexes"),
	
	Class3S0("Lame des Ténèbres", "Dark Stab"),
	Class3S1("Épine de l'Ombre Trouble", "Blurred Shadow Thorn"),
	Class3S2("Furtive du Démon", "Shadow Demon Strike"),
	Class3S3("Coup Mortel", "Lethal Strike"),
	Class3S4("Coup de Grâce", "Coup de Grace"),
	Class3S5("Épine de l'Ombre", "Shadow Stab"),
	Class3S6("Contre-la-Montre Dégénéré", "Enhanced Clock Cleaner"),
	Class3S7("Baiser de la Faucheuse", "Reaper's Kiss"),
	Class3S8("Réaction du Démon", "Swift Reaction"),
	Class3S9("Sommeil du Juste", "Sweet Dreamer"),
	Class3S10("Tir Assommant", "Knockout Power Shot"),
	Class3S11("Poignard des Ténèbres", "Shadow Spike"),
	
	Class6S0("Flèche Enflammée", "Fire Arrow"),
	Class6S1("Tempête de Flammes", "Explosive Bomb"),
	Class6S2("Tornade de Flammes", "Explosive Fire Bomb"),
	Class6S3("Flèche Foudroyante", "Lightning Arrow"),
	Class6S4("Tonnerre Céleste Destructeur", "Chain Lightning Arrow"),
	Class6S5("Tonnerre Céleste Annihilateur", "Chain Thunder Lightning Arrow"),
	Class6S6("Flèche Glacée", "Ice Arrow"),
	Class6S7("Flèche Polaire", "Freezing Arrow"),
	Class6S8("Flèche Super Polaire", "Quick Freeze Arrow"),
	Class6S9("Prison des Lames Virevoltantes", "Prison of Dancing Blades"),
	Class6S10("Prison des Lames Volantes", "Ultimate Prison of Dancing Blades"),
	
	Class8S0("Impact nucléaire", "Nuclear Impact"),
	Class8S1("Éclairentaille", "Lightning Slash"),
	Class8S2("Entaille corrosive", "Corrosive Slash"),
	Class8S3("Frappe foudroyante", "Lightning Stab"),
	Class8S4("Bombe nucléaire", "Nuclear Bomb"),
	Class8S5("Coeur de recharge", "Rechargeable Core"),
	
	;
	
	public final String fr;
	public final String en;
	
    private TypeSkillEffect(String fr, String en) {
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
