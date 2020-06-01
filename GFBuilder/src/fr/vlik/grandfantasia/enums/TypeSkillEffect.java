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
