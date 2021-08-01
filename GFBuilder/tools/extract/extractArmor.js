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
	colorCorrespondance[0] = "WHITE";
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
						"Mécanicien", "Machiniste", "Métalleux", "Prime", "Mégatron", "Mechmaster",
						"Machiniste", "Métalleux", "Prime", "Mégatron", "Oméga"],
					["Mecánico", "Ingeniero", "Artillero", "Optimus", "Galvatron", "Domador Celestial",
						"Mécanicien", "Machiniste", "Démolisseur", "Optimus", "Galvatron", "Artillerist",
						"Machiniste", "Démolisseur", "Optimus", "Galvatron", "Suprême"],
					
					["Viajero", "Nómada", "Duelista", "Samurai", "Dimensionalista", "Espectro Mortal",
						"Ronin", "Occultiste", "Dimensionaliste", "Phantom"],
					["Viajero", "Nómada", "Relojero", "Maestro del Tiempo", "Oráculo", "Alterador Cósmico",
						"Horloger", "Augure", "Chronomancien", "Chronoshifter"]];


function ExtractArmor() {
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
	
	var pvp = false;
	
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
				} else if(stat[j].innerHTML.trim().startsWith('HP')) {
					listEffect += "\t\tnew Effect(TypeEffect.PV, false, " + stat[j].innerText.match(/[0-9]+(\.[0-9])?/)[0] + "),\n";
				} else if(stat[j].innerHTML.trim().startsWith('EN')) {
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
	
	var enchant = false;
	var codearmor = "";
	var iconpath = "ICONPATH";
	
	if(quality == 7) {
		if(name.match(/10e/)) {
			name = name.replace("&nbsp;- 10e anniversaire", "");
			enchant = false;
			codearmor = "10ans90red" + idClass;
			iconpath = "10ansRed";
		} else {
			enchant = true;
			codearmor = "90red" + idClass;
			iconpath = "90red" + idClass;
		}
	} else if(quality == 6) {
		var codeLvl = lvl;
		while(codeLvl % 10 != 0) {
			codeLvl++;
		}
		
		enchant = true;
		codearmor = codeLvl + "vio" + idClass;
		iconpath = codeLvl + "vio" + idClass;
	} else if(quality == 5) {
		var codeLvl = lvl;
		while(codeLvl % 10 != 0) {
			codeLvl++;
		}
		
		enchant = true;
		
		if(name.match(/10e/)) {
			name = name.replace("&nbsp;- 10e anniversaire", "");
			codearmor = "10ans90gold" + idClass;
			iconpath = "10ansGold";
		} else {
			codearmor = codeLvl + "gold" + idClass;
			iconpath = codeLvl + "gold" + idClass;
		}
	} else if(quality == 4 && !pvp) {
		var codeLvl = lvl - 1;
		while(codeLvl % 5 != 0) {
			codeLvl++;
		}
		
		enchant = true;
		
		if(document.getElementsByClassName('item-information-table')[2].innerHTML.match(/Nucléus/)) {
			codearmor = codeLvl + "nucleus" + idClass;
			iconpath = codeLvl + "nucleus" + idClass;
		} else if(document.getElementsByClassName('item-information-table')[2].innerHTML.match(/Lingot/)) {
			codearmor = codeLvl + "lingot" + idClass;
			iconpath = codeLvl + "lingot" + idClass;
		} else {
			codearmor = codeLvl + "pve" + idClass;
			iconpath = codeLvl + "pve" + idClass;
		}
	} else if(quality == 3) {
		var codeLvl = lvl;
		if(lvl == 70 || lvl == 80 || lvl == 90) {
			codearmor = codeLvl + "gvg" + idClass;
			iconpath = codeLvl + "gvg" + idClass;
		} else {
			codearmor = "-1";
		}
		
		listEffect += "\t\tnew Effect(TypeEffect.PV, false, 999),\n";
		listEffect += "\t\tnew Effect(TypeEffect.PM, false, 999),\n";
	} else if(quality == 2) {
		codearmor = "-1";
	} else if(quality == 1 || quality == 0) {
		found = false;
		
		var section = document.getElementsByClassName('card-header');
		
		for(var i = 0; i < section.length; i++) {
			if(section[i].innerHTML.match(/Merchants/)) {
				found = true;
				break;
			}
		}
		
		if(document.getElementsByClassName('item-information-table')[2].innerHTML.match(/Materials/)) {
			found = true;
		}
		
		codearmor = "-1";
	}
	
	if(pvp) {
		var codeLvl = lvl - 1;
		while(codeLvl % 5 != 0) {
			codeLvl++;
		}
		
		codearmor = codeLvl + "pvp" + idClass;
		iconpath = codeLvl + "pvp" + idClass;
	}
	
	var reinca = false;
	if(name.match(/eforgé/) || name.match(/éincarn/)) {
		reinca = true;
		codearmor += "R";
	}
	
	var idPiece = document.getElementsByClassName("item-icon")[0].innerHTML.split("itemicon/A")[1].charAt(0);
	
	var result = "new " + (quality == 7 ? "Red" : "") + "Armor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "}, " + lvl + ", Quality." + colorCorrespondance[quality] + ", " + enchant + ", " + reinca + ",\n";
	result += "\tArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + codearmor + "\", \"" + pieceCorrespondance[idPiece][1] + "/" + iconpath + "\", new Calculable[] {\n";
	result += listEffect;
	result += "\t}, null" + (quality == 7 ? "" : ")") + ",\n";
	
	if(quality == 7) {
		result += "\tnew Calculable[][] {\n";
		
		for(var i = 0; i < 5; i++) {
			result += "\t\tnew Calculable[] {\n";
			result += "\t\t\t\n";
			result += "\t\t},\n";
		}
		
		result += "\t}),\n";
	}
	
	if(found == true) {
		console.log(result);
	}
}

function ExtractEvo() {
	var nameHTML = document.getElementsByClassName('item-name')[0].getElementsByTagName('h6')[0]
	var name = nameHTML.innerHTML;
	var quality = 3;
	var lvl = document.getElementsByClassName('item-information-table')[0].getElementsByTagName('td');
	if(lvl[0] != undefined) {
		lvl = lvl[0].innerHTML;
	} else {
		lvl = 31;
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
	
	var idPiece = document.getElementsByClassName("item-icon")[0].innerHTML.split("itemicon/A")[1].charAt(0);
	
	var result = "new Armor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "}, " + lvl + ", Quality." + colorCorrespondance[quality] + ", false, " + reinca + ",\n";
	result += "\tArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + codearmor + "\", \"" + pieceCorrespondance[idPiece][1] + "/ICONPATH\", new MultiEffect(" + lvl + ", new Effect[][] {\n";
	result += listEffect;
	result += "\t}), null),\n";
	
	console.log(result);
}

function updateClock() {}

if(document.URL.match(/grandfantasia-db/)) {
	if(document.getElementById("itemGrowEquip") != null) {
		ExtractEvo();
	} else {
		ExtractArmor();
	}
} else {
	console.log("Site non compatible")
}