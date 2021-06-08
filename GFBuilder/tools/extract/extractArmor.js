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
	
var colorCorrespondance = new Array();
	colorCorrespondance[0] = "GREY";
	colorCorrespondance[1] = "WHITE";
	colorCorrespondance[2] = "GREEN";
	colorCorrespondance[3] = "BLUE";
	colorCorrespondance[4] = "ORANGE";
	colorCorrespondance[5] = "GOLD";
	colorCorrespondance[6] = "PURPLE";
	colorCorrespondance[7] = "RED";

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
						"Mécanicien", "Machiniste", "Métalleux", "Prime", "Mégatron", "Oméga",
						"Machiniste", "Métalleux", "Prime", "Mégatron", "Oméga"],
					["Mecánico", "Ingeniero", "Artillero", "Optimus", "Galvatron", "Domador Celestial",
						"Mécanicien", "Machiniste", "Démolisseur", "Optimus", "Galvatron", "Suprême",
						"Machiniste", "Démolisseur", "Optimus", "Galvatron", "Suprême"],
					
					["Viajero", "Nómada", "Duelista", "Samurai", "Dimensionalista", "Espectro Mortal"],
					["Viajero", "Nómada", "Relojero", "Maestro del Tiempo", "Oráculo", "Alterador Cósmico"]];


function ExtractArmor() {
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
	var listEffect = "";
	
	for(var i = 0; i < line.length; i++) {
		if(line[i].getElementsByClassName('stat').length > 0) {
			var stat = line[i].getElementsByClassName('stat');
			
			for(var j = 0; j < stat.length; j++) {
				if(stat[j].innerHTML.trim().startsWith('DEF')) {
					listEffect += "\t\tnew Effect(TypeEffect.DefP, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('M-DEF')) {
					listEffect += "\t\tnew Effect(TypeEffect.DefM, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('STR')) {
					listEffect += "\t\tnew Effect(TypeEffect.FCE, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('VIT')) {
					listEffect += "\t\tnew Effect(TypeEffect.VIT, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('INT')) {
					listEffect += "\t\tnew Effect(TypeEffect.INT, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('WIL')) {
					listEffect += "\t\tnew Effect(TypeEffect.VOL, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('AGI')) {
					listEffect += "\t\tnew Effect(TypeEffect.AGI, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('HP')) {
					listEffect += "\t\tnew Effect(TypeEffect.PV, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				} else if(stat[j].innerHTML.trim().startsWith('EN')) {
					listEffect += "\t\tnew Effect(TypeEffect.PM, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				} else if(stat[j].innerHTML.match(/chance to hit/)) {
					listEffect += "\t\tnew Effect(TypeEffect.Toucher, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				}
			}
		} else {
			if(line[i].innerHTML.match(/Magic Critical Damage/)) {
				listEffect += "\t\tnew Effect(TypeEffect.DCCM, false, " + line[i].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/critical hit damage/)) {
				listEffect += "\t\tnew Effect(TypeEffect.DCCP, false, " + line[i].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/magic critical hit/)) {
				listEffect += "\t\tnew Effect(TypeEffect.TCCM, false, " + line[i].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/critical hit/)) {
				listEffect += "\t\tnew Effect(TypeEffect.TCCP, false, " + line[i].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(line[i].innerHTML.match(/\//) && !line[i].innerHTML.match(/([0-9])/)) {
				for(var j = 0; j < getNameClass.length; j++) {
					for(var k = 0; k < getNameClass[j].length; k++) {
						if(line[i].innerHTML.match(getNameClass[j][k])) {
							listClass += "GradeName." + gradeNameCorrespondance[j] + ", ";
							break;
						}
					}
				}
			}
		}
	}
	
	var enchant;
	var codearmor;
	var iconpath = "";
	
	if(quality == 7) {
		enchant = false;
		codearmor = "90red" + idClasses.split(",")[0];
		iconpath = "90red" + idClasses.split(",")[0];
	} else if(quality == 6) {
		var codeLvl = lvl;
		while(codeLvl % 10 != 0) {
			codeLvl++;
		}
		
		enchant = true;
		codearmor = codeLvl + "vio" + idClasses.split(",")[0];
		iconpath = codeLvl + "vio" + idClasses.split(",")[0];
	} else if(quality == 5) {
		var codeLvl = lvl;
		while(codeLvl % 10 != 0) {
			codeLvl++;
		}
		
		enchant = true;
		codearmor = codeLvl + "gold" + idClasses.split(",")[0];
		iconpath = codeLvl + "gold" + idClasses.split(",")[0];
	} else if(quality == 4 && !pvp) {
		enchant = true;
	} else if(quality == 3) {
		var codeLvl = lvl;
		while(codeLvl % 10 != 0) {
			codeLvl++;
		}
		
		codearmor = codeLvl + "gvg" + idClasses.split(",")[0];
	} else if(quality == 2) {
		codearmor = "-1";
	} else if(quality == 1) {
		codearmor = "-1";
	}
	
	var result = "new Armor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "},\n\t" + lvl + ", Quality." + colorCorrespondance[quality] + ", " + enchant + ", " + reinca + ",\n";
	result += "\tArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + codearmor + "\", \"" + pieceCorrespondance[idPiece][1] + "/" + iconpath + "\", new Calculable[] {\n";
	result += listEffect;
	result += "\t}, null ),\n";
	
	console.log(result);
}

function ExtractEvo() {
	var nameHTML = document.getElementsByClassName('item-name')[0].getElementsByTagName('h6')[0]
	var name = nameHTML.innerHTML;
	var quality = 3;
	var lvl = document.getElementsByClassName('item-information-table')[0].getElementsByTagName('td');
	if(lvl[0] != undefined) {
		lvl = lvl[0].innerHTML;
	} else {
		lvl = "undefined";
	}
	
	var line = document.getElementsByClassName('item-general');
	
	var listClass = "";
	var listEffect = "";
	var codeFirstClass = "";
	
	var grow = lvl;
	while(document.getElementsByClassName("growEquipLvl-" + grow).length > 0) {
		var currentLvl = document.getElementsByClassName("growEquipLvl-" + grow);
		
		listEffect += "\t\tnew Effect[] {\n";
		
		for(var i = 0; i < currentLvl.length; i++) {
			if(currentLvl[i].innerHTML.trim().match('DEF')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.DefP, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('M-DEF')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.DefM, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('STR')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.FCE, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('VIT')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.VIT, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('INT')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.INT, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('WIL')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.VOL, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('AGI')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.AGI, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
			} else if(currentLvl[i].innerHTML.trim().match('HP')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.PV, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			} else if(currentLvl[i].innerHTML.trim().match('EN')) {
				listEffect += "\t\t\tnew Effect(TypeEffect.PM, false, " + currentLvl[i].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
			}
		}
		
		listEffect += "\t\t},\n";
		grow++;
	}
	
	for(var i = 0; i < line.length; i++) {
		if(!line[i].getElementsByClassName('stat').length > 0) {
			if(!line[i].innerHTML.match(/([0-9])/) && !line[i].innerHTML.match(/color/)) {
				for(var j = 0; j < getNameClass.length; j++) {
					for(var k = 0; k < getNameClass[j].length; k++) {
						if(line[i].innerHTML.match(getNameClass[j][k])) {
							listClass += "GradeName." + gradeNameCorrespondance[j] + ", ";
							
							if(codeFirstClass == "") {
								codeFirstClass = j;
							}
							
							break;
						}
					}
				}
			}
		}
	}
	
	var codeLvl = Number(lvl) + document.getElementById("itemGrowEquip").length - 1;
	var codearmor = codeLvl + "evo" + codeFirstClass;
	
	var reinca = false;
	if(name.match(/eforgé/) || name.match(/éincarn/)) {
		reinca = true;
		codearmor += "R";
	}
	
	// A REDEFINIR
	var idPiece = document.getElementsByClassName("item-icon")[0].innerHTML.split("itemicon/A")[1].charAt(0);
	
	var result = "new Armor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "}, " + lvl + ", Quality." + colorCorrespondance[quality] + ", false, " + reinca + ",\n";
	result += "\tArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + codearmor + "\", \"" + pieceCorrespondance[idPiece][1] + "/ICONPATH\", new MultiEffect(" + lvl + ", new Effect[][] {\n";
	result += listEffect;
	result += "\t}), null ),\n";
	
	console.log(result);
}

function updateClock() {}

if(document.URL.match(/grandfantasia-db/)) {
	if(document.getElementById("itemGrowEquip").length > 0) {
		ExtractEvo();
	} else {
		ExtractArmor();
	}
} else {
	console.log("Site non compatible")
}