package fr.vlik.grandfantasia.enums;

import java.util.EnumMap;
import java.util.Map;

public enum TypeSkillEffect {
	
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
	Class2S2("Chasse Mortelle", "Fatal Pursuit"),
	Class2S3("Réflexes Vifs", "Quick Reflexes"),
	Class2S4("Attaque du Faucon", "Twin Fang Shot"),
	Class2S5("Pluie de météorites", "Meteor Shower"),
	Class2S6("Réflexe Foudroyant", "Lightning Reflex"),
	Class2S7("Attaque Démoniaque", "Superdemon Shot"),
	Class2S8("Mitraillette", "Desperado"),
	Class2S9("Lame des Tempêtes", "Blade of the Gales"),
	Class2S10("Coup Perçant", "Piercing blow"),
	Class2S11("Ouragan Dévastateur", "Blade of the Hurricane"),
	Class2S12("Attaque du Faucon", "Swallow's Glide Shot"),
	Class2S13("Grand Coup Abrutissant", "Knockout Strike"),
	Class2S14("Coup Suffocateur", "Smother Strike"),
	
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
	Class3S12("Tir de la Gorgone", "Gorgon Shot"),
	Class3S13("Tir de Super Sniper", "Sniper's Power Shot"),
	Class3S14("Mouvement furtif", "Stealth"),
	
	Class4S0("Grenade de Gloire", "Blessed Bomb"),
	Class4S1("Bouclier Sacré", "Sacred Shield"),
	Class4S2("Guérison Divine", "Divine Heal"),
	Class4S3("Doigt Brillant", "Shining Finger"),
	Class4S4("Punition du maillet divin", "Holy Hammer Crush"),
	Class4S5("Sceau Divin", "Sacred Seal"),
	Class4S6("Grenade de Gloire Sacrée", "Blessed Bomb"),
	Class4S7("Bombe de lumière sacrée", "Holy Light Grenade"),
	Class4S8("Marteau Sacré Surpuissant", "High Holy Hammer Crush Magic"),
	Class4S9("Sceau du Sacré", "Light Seal Magic"),
	Class4S10("Imposition des Mains ", "Lay on Hands"),
	Class4S11("Imposition des Mains Améliorée", "Improved Lay on Hands"),
	Class4S12("Marteau du Jugement", "Hammer of Judgment"),
	Class4S13("Censure Divine", "God's Censure"),
	Class4S14("Esprits Enragés", "Rage of Spirits"),
	Class4S15("Service de Soin", "Healing Barrier"),
	Class4S16("Grand Service de Soin", "Great Healing Barrier"),
	Class4S17("Toucher Régénérant", "Mending Touch"),
	Class4S18("Prière Régénérante", "Mending Touch"),
	
	Class5S0("Bouclier d'Éternité", "Shield of Eternity"),
	Class5S1("Vol du Gardien", "Guardian Flight"),
	Class5S2("Morsure de Loup", "Wolf Bite"),
	Class5S3("Rage du Gorille", "Ape Rage"),
	Class5S4("Choc Mental", "Mental Shock"),
	Class5S5("Vol rapide", "Leaf on the Wind"),
	Class5S6("Guérison des blessures", "Spirit Mend"),
	Class5S7("Parole protectrice divine", "True Word of Shielding"),
	Class5S8("Flèche aux Ailes d'Acier", "Multi-wing Sharp Arrow"),
	Class5S9("Flèche de plume", "Feather Dart"),
	Class5S10("Sérénade de la Prompte Lame", "Swift Blade"),
	Class5S11("Embuscade Éclair", "Flash Ambush"),
	Class5S12("Tempête de Sable", "Desert Storm"),
	Class5S13("Sablevent", "Sand Tornado"),
	Class5S14("Flèche Paralysante", "Shackling Feather Dart"),
	Class5S15("Flèche Entravante", "Confined Arrow"),
	Class5S16("Angoisse Folle", "Jaws of Madness"),
	Class5S17("Larme Sauvage", "Wild Tear"),
	Class5S18("Réflexe de l'Ombre", "Shadow Power Wave"),
	
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
	Class6S11("Feu Ardent", "Scorching Strike"),
	Class6S12("Rets de glace", "Icy Grip"),
	Class6S13("Réseau électrique tonnant", "Thunderous Electrical Net"),
	Class6S14("Aiguille Foudroyante", "Lightning Needle"),
	Class6S15("Conversion d'Énergie", "Energy Conversion"),
	Class6S16("Tempête de Magma", "Magma Storm"),
	Class6S17("Fers Magiques", "Magical Shackles"),
	Class6S18("Brûlure Glaciale", "Freezing Arrow"),
	
	Class7S0("Flèche spectrale", "Shadow Arrow"),
	Class7S1("Flèche de Choc Spectral", "Shadowshock Bolt"),
	Class7S2("Chien de l'Enfer", "Hellhound"),
	Class7S3("Cerbère supérieur", "Anubis Jackal"),
	Class7S4("Démon de l'Enfer", "Call from the Abyss"),
	Class7S5("Grand Démon de l'Enfer", "High Hell Demon"),
	Class7S6("Sorcier Squelette", "Lich Mage"),
	Class7S7("Mage de l'Enfer", "Frost Lich"),
	Class7S8("Zombie Pétrifié", "Corpse Golem"),
	Class7S9("Bourreau de l'Enfer", "Hell Butcher"),
	Class7S10("Forme Fantôme", "Mirage Form"),
	Class7S11("Forme Spectrale", "Wraith Form"),
	Class7S12("Sang d'Outre-Tombe", "Devil's Black Blood"),
	Class7S13("Sang de l'Au-Delà", "Thick Blood of Hell"),
	Class7S14("Lien Diabolique", "Devil Binding"),
	Class7S15("Cercle Psychique", "Psychic Circle"),
	Class7S16("Magie Noire", "Black Magic"),
	Class7S17("Aspect Fantômatique", "Phantom Form"),
	Class7S18("Terrible Flèche Spectrale", "Shadow Chaos Arrow"),
	Class7S19("Affaiblissement", "Enfeeblement"),
	Class7S20("Bombe de Sang Sacrificiel", "Sacrificial Blood Bomb"),
	Class7S21("Grenade de Chair et de Sang", "Corpse Grenade"),
	Class7S22("Méga Grenade de Chair et de Sang", "Giant Flesh Grenade"),
	Class7S23("Fracas Crânien", "Enhanced Enfeeblement Magic"),
	Class7S24("Malédiction Porte-Poisse", "Misery Coil"),
	Class7S25("Sort de Malchance", "Enhanced Jinx Curse"),
	Class7S26("Algue Mentale", "Mind Wrack"),
	
	Class8S0("Impact nucléaire", "Nuclear Impact"),
	Class8S1("Éclairentaille", "Lightning Slash"),
	Class8S2("Entaille corrosive", "Corrosive Slash"),
	Class8S3("Frappe foudroyante", "Lightning Stab"),
	Class8S4("Bombe nucléaire", "Nuclear Bomb"),
	Class8S5("Cœur de recharge", "Rechargeable Core"),
	Class8S6("Surcadençage - Noyau de foudre", "Overclocking - Lightning Core"),
	Class8S7("Coma de l'Assaut sans fin", "Stun of Endless Assault"),
	Class8S8("Cœur de transformation - Vie", "Transforming Core - Life additionally"),
	
	Class9S0("Surcadençage - Noyau glacé", "Overclocking - Frost Core"),
	Class9S1("Coup de poignard de givre ultime", "Ultimate Frostcore Stab abilities"),
	Class9S2("Téléportation de phase", "Phase Teleport"),
	Class9S3("Téléportation de phase ß", "Phase Teleport £"),
	Class9S4("Furtif Kilgo", "Stealth Kilgo"),
	Class9S5("Kilgo lourdement blindé", "Heavy Armored Kilgo"),
	Class9S6("Balles Perdues", "Stray Bullets"),
	Class9S7("Bombe Nucléaire Corrosive", "Corrosive Nuclear Bomb"),
	Class9S8("Surcadençage", "Overclocking"),
	Class9S9("Bombe fissile", "Fission Bomb"),
	
	Class10S0("Marcheur du Royaume du Vide", "Empty Realm Walker"),
	Class10S1("Libération Cristalline", "Crystal Burst"),
	Class10S2("Gardien du Néant", "Void Guardian"),
	Class10S3("Bouclier de Pouvoir", "Power Shield"),
	
	Class11S0("Saint de la Maîtrise du Temps", "Temporal Saint"),
	Class11S1("Libération Cristalline", "Crystal Burst"),
	Class11S2("Temps Abandonné", "Forsaken Time"),
	Class11S3("Puissance du Bouclier", "Sturdy Shield"),
	
	;
	
	public final Map<Language, String> skill;
	
    @SuppressWarnings("serial")
	private TypeSkillEffect(String fr, String en) {
    	this.skill = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, fr); put(Language.EN, en); }};
    }
    
	public String getName(Language lang) {
		if(this.skill == null) {
			return "";
		} else if(this.skill.get(lang) == null || this.skill.get(lang).equals("")) {
			return this.skill.get(Language.FR);
		}
		
		return this.skill.get(lang);
	}
}
