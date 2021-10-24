var gradeNameCorrespondance = new Array();
	gradeNameCorrespondance[0] = "BERSERKER";
	gradeNameCorrespondance[1] = "PALADIN";
	gradeNameCorrespondance[2] = "RANGER";
	gradeNameCorrespondance[3] = "ASSASSIN";
	gradeNameCorrespondance[4] = "CLERC";
	gradeNameCorrespondance[5] = "SAGE";
	gradeNameCorrespondance[6] = "SORCIER";
	gradeNameCorrespondance[7] = "NECROMANCIEN";
	gradeNameCorrespondance[8] = "METALLEUX";
	gradeNameCorrespondance[9] = "DEMOLISSEUR";
	gradeNameCorrespondance[10] = "SPATIODERIVEUR";
	gradeNameCorrespondance[11] = "CHRONODERIVEUR";

var pieceCorrespondance = new Array();
	pieceCorrespondance[1] = [ "CASQUE", "casques" ];
	pieceCorrespondance[2] = [ "PLASTRON", "torses" ];
	pieceCorrespondance[3] = [ "JAMBIERE", "pantalons" ];
	pieceCorrespondance[4] = [ "GANT", "gants" ];
	pieceCorrespondance[5] = [ "BOTTE", "bottes" ];

var getNameClass = [["Luchador", "Guerrero", "Berserker", "Dios de Guerra", "Caballero de la Muerte", "Destructor",
						"Combattant", "Guerrier", "Berserker", "Gladiateur", "Ravageur", "Destructeur",
						"Warrior", "Berserker", "Warlord", "Deathknight", "Destroyer"],
					["Luchador", "Guerrero", "Paladin", "Templario", "Caballero Sagrado", "Cruzado",
						"Combattant", "Guerrier", "Paladin", "Vindicateur", "Templier", "Croisé",
						"Warrior", "Paladin", "Templar", "Crusader", "Holy Knight"],
					
					["Cazador", "Arquero", "Ranger", "Francotirador", "Ballestero Mortal", "Depredador",
						"Chasseur", "Archer", "Ranger", "Traqueur", "Sniper", "Prédateur",
						"Archer", "Ranger", "Sharpshooter", "Hawkeye", "Predator"],
					["Cazador", "Arquero", "Asesino", "Acechador Oscuro", "Ninja Fantasmal", "Shinobi",
						"Chasseur", "Archer", "Assassin", "Ninja", "Shinobi", "Kage",
						"Archer", "Assassin", "Darkstalker", "Windshadow", "Shinobi"],
					
					["Acolito", "Sacerdote", "Clerigo", "Profeta", "Santo", "Arcángel",
						"Acolyte", "Prêtre", "Clerc", "Rédempteur", "Exorciste", "Archange",
						"Priest", "Cleric", "Prophet", "Saint", "Archangel"],
					["Acolito", "Sacerdote", "Sabio", "Mistico", "Chamán", "Druida",
						"Acolyte", "Prêtre", "Sage", "Oracle", "Shaman", "Druide",
						"Priest", "Sage", "Mystic", "Shaman", "Druid"],
					
					["Hechicero", "Mago", "Mago Brujo", "Archimago", "Avatar", "Brujo",
						"Ensolceleur", "Mage", "Sorcier", "Archimage", "Avatar", "Arcaniste",
						"Mage", "Wizard", "Archmage", "Avatar", "Warlock"],
					["Hechicero", "Mago", "Nigromante", "Demonólogo", "Amo de Almas", "Shinigami",
						"Ensolceleur", "Mage", "Nécromancien", "Démoniste", "Shinigami", "Faucheur",
						"Mage", "Necromancer", "Demonologist", "Shadowlord", "Shinigami"],
					
					["Mecánico", "Ingeniero", "Artificiero", "Prime", "Megatron", "Omega",
						"Mécanicien", "Machiniste", "Métalleux", "Prime", "Mégatron", "Mechmaster",
						"Machiniste", "Métalleux", "Prime", "Mégatron", "Oméga"],
					["Mecánico", "Ingeniero", "Artillero", "Optimus", "Galvatron", "Domador Celestial",
						"Mécanicien", "Machiniste", "Démolisseur", "Optimus", "Galvatron", "Artillerist",
						"Machiniste", "Démolisseur", "Optimus", "Galvatron", "Suprême"],
					
					["Viajero", "Nómada", "Duelista", "Samurai", "Dimensionalista", "Espectro Mortal",
						"Ronin", "Occultiste", "Dimensionaliste", "Phantom"],
					["Viajero", "Nómada", "Relojero", "Maestro del Tiempo", "Oráculo", "Alterador Cósmico",
						"Horloger", "Augure", "Chronomancien", "Chronoshifter"]];


function ExtractCustomArmor() {
	var found = true;
	var nameHTML = document.getElementsByClassName('item-name')[0].getElementsByTagName('h6')[0]
	var name = nameHTML.innerHTML;
	var quality = nameHTML.outerHTML.charAt(19);
	var lvl = document.getElementsByClassName('item-information-table')[0].getElementsByTagName('td');
	if(lvl[0] != undefined) {
		lvl = lvl[0].innerHTML;
	} else {
		lvl = "undefined";
	}
	
	var line = document.getElementsByClassName('item-general');
	
	var listClass = "";
	var idClass;
	var listEffect = "";
	
	for(var i = 0; i < line.length; i++) {
		if(line[i].getElementsByClassName('stat').length > 0) {
			var stat = line[i].getElementsByClassName('stat');
			
			for(var j = 0; j < stat.length; j++) {
				if(stat[j].innerHTML.trim().startsWith('DEF')) {
					listEffect += "\t\tnew Effect(TypeEffect.DefP, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('M-DEF')) {
					listEffect += "\t\tnew Effect(TypeEffect.DefM, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('STR')) {
					listEffect += "\t\tnew Effect(TypeEffect.FCE, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('VIT')) {
					listEffect += "\t\tnew Effect(TypeEffect.VIT, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('INT')) {
					listEffect += "\t\tnew Effect(TypeEffect.INT, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('WIL')) {
					listEffect += "\t\tnew Effect(TypeEffect.VOL, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('AGI')) {
					listEffect += "\t\tnew Effect(TypeEffect.AGI, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().match('HP')) {
					listEffect += "\t\tnew Effect(TypeEffect.PV, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				} else if(stat[j].innerHTML.trim().match('MP')) {
					listEffect += "\t\tnew Effect(TypeEffect.PM, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				} else if(stat[j].innerHTML.match(/chance to hit/)) {
					listEffect += "\t\tnew Effect(TypeEffect.Toucher, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				}
			}
		} else {
			if(line[i].innerHTML.match(/Magic Critical Damage/)) {
				listEffect += "\t\tnew Effect(TypeEffect.DCCM, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/critical hit damage/)) {
				listEffect += "\t\tnew Effect(TypeEffect.DCCP, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/magic critical hit/)) {
				listEffect += "\t\tnew Effect(TypeEffect.TCCM, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/critical hit/)) {
				listEffect += "\t\tnew Effect(TypeEffect.TCCP, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/evade/)) {
				listEffect += "\t\tnew Effect(TypeEffect.ESQ, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				if(quality == 4) {
					pvp = true;
				}
			} else if(line[i].innerHTML.match(/Physical PEN Reduction/)) {
				listEffect += "\t\tnew Effect(TypeEffect.ReducPeneP, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				if(quality == 4) {
					pvp = true;
				}
			} else if(line[i].innerHTML.match(/Magic PEN Reduction/)) {
				listEffect += "\t\tnew Effect(TypeEffect.ReducPeneM, false, " + line[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				if(quality == 4) {
					pvp = true;
				}
			} else if(!line[i].innerHTML.match(/([0-9])/) && !line[i].innerHTML.match(/color/)) {
				for(var j = 0; j < getNameClass.length; j++) {
					for(var k = 0; k < getNameClass[j].length; k++) {
						if(line[i].innerHTML.match(getNameClass[j][k])) {
							listClass += "GradeName." + gradeNameCorrespondance[j] + ", ";
							
							if(idClass == undefined) {
								idClass = j;
							}
							
							break;
						}
					}
				}
			}
		}
	}
	
	var idPiece = document.getElementsByClassName("item-icon")[0].innerHTML.split("itemicon/A")[1].charAt(0);
	
	var result = "new CustomArmor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "},\n\t" + lvl + ", ArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + pieceCorrespondance[idPiece][1] + "/ICONPATH\", new Calculable[] {\n";
	result += listEffect;
	result += "\t}),\n";
	
	found = false;
		
	var section = document.getElementsByClassName('card-header');
	
	for(var i = 0; i < section.length; i++) {
		if(section[i].innerHTML.match(/Content In/) || section[i].innerHTML.match(/Drops/)) {
			found = true;
			break;
		}
	}
	
	if(found == true) {
		console.log(result);
	}
}

if(document.URL.match(/grandfantasia-db/)) {
	ExtractCustomArmor();
} else {
	console.log("Site non compatible")
}