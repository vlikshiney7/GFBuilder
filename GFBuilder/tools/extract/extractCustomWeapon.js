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

function ExtractCustomWeaponOld() {

	var name = document.getElementsByClassName('descbox iconh')[0].getElementsByTagName('h2')[0].innerText;
	
	var idClasses = "";
	var getterId = [[1, 2, 3, 17, 32, 40], [1, 2, 4, 18, 33, 41],
					[5, 6, 7, 19, 34, 42], [5, 6, 8, 20, 35, 43],
					[9, 10, 11, 21, 36, 44], [9, 10, 12, 22, 37, 45],
					[13, 14, 15, 23, 38, 46], [13, 14, 16, 24, 39, 47],
					[25, 26, 27, 29, 48, 50], [25, 26, 28, 30, 49, 51],
					[52, 53, 54, 56, 58, 60], [52, 53, 55, 57, 59, 61]];
	
	var classes = document.getElementsByClassName('descbox')[1];
	for(var i = 0; i < 12; i++) {
		for(var j = 0; j < getterId[i].length; j++) {
			if(classes.getElementsByClassName('class_' + getterId[i][j]).length > 0) {
				idClasses += i + ",";
				break;
			}
		}
	}
	idClasses = idClasses.substring(0, idClasses.length-1);

	var lvl = document.getElementsByClassName('type');
	lvl = lvl[lvl.length-1].parentElement.nextElementSibling.cells[1].innerText;

	var count = 0;
	var effects = "";
	var effectName = [];
	var getCells = document.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
	for(var i = 0; i < getCells.length; i++) {
		if(getCells[i].cells.length == 2) {
			effectName[count] = [ getCells[i].cells[0].innerText, getCells[i].cells[1].innerText ];
			count++;
		} else if(getCells[i].cells.length == 1) {
			if(getCells[i].cells[0].innerText.match(/Toucher/)) {
				effectName[count] = [ "Toucher", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
				count++;
			} else if(getCells[i].cells[0].innerText.match(/Taux CRIT PHY/)) {
				effectName[count] = [ "TCCP", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
				count++;
			} else if(getCells[i].cells[0].innerText.match(/DÉG CRIT PHY/)) {
				effectName[count] = [ "DCCP", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
				count++;
			} else if(getCells[i].cells[0].innerText.match(/Taux CRIT MAG/)) {
				effectName[count] = [ "TCCM", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
				count++;
			} else if(getCells[i].cells[0].innerText.match(/DÉG CRIT MAG/)) {
				effectName[count] = [ "DCCM", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
				count++;
			}
		}
	}
	for(var i = 0; i < effectName.length; i++) {
		var key = effectName[i][0];
		if(key == "ATQ") {
			effects += "\t\tnew Effect(TypeEffect.Atk, false, " + effectName[i][1] + ", true),\n";
		} else if (key == "ATQ D.") {
			effects += "\t\tnew Effect(TypeEffect.AtkD, false, " + effectName[i][1] + ", true),\n";
		} else if (key == "ATQ M.") {
			effects += "\t\tnew Effect(TypeEffect.AtkM, false, " + effectName[i][1] + ", true),\n";
		} else if (key == "DÉF") {
			effects += "\t\tnew Effect(TypeEffect.DefP, false, " + effectName[i][1] + ", true),\n";
		} else if (key == "DÉF M.") {
			effects += "\t\tnew Effect(TypeEffect.DefM, false, " + effectName[i][1] + ", true),\n";
		} else if (key == "FCE" || key == "VIT" || key == "INT" || key == "VOL" || key == "AGI") {
			effects += "\t\tnew Effect(TypeEffect." + key + ", false, " + effectName[i][1] + ", true),\n";
		} else if (key == "Toucher") {
			effects += "\t\tnew Effect(TypeEffect.Toucher, false, " + effectName[i][1] + "),\n";
		} else if (key == "TCCP") {
			effects += "\t\tnew Effect(TypeEffect.TCCP, false, " + effectName[i][1] + "),\n";
		} else if (key == "DCCP") {
			effects += "\t\tnew Effect(TypeEffect.DCCP, false, " + effectName[i][1] + "),\n";
		} else if (key == "TCCM") {
			effects += "\t\tnew Effect(TypeEffect.TCCM, false, " + effectName[i][1] + "),\n";
		} else if (key == "DCCM") {
			effects += "\t\tnew Effect(TypeEffect.DCCM, false, " + effectName[i][1] + "),\n";
		}
	}

	var result = "new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";

	idClasses = idClasses.split(",");

	for(var i = 0; i < idClasses.length; i++) {
		result += "GradeName." + gradeNameCorrespondance[idClasses[i]] + ", ";
	}

	result += "},\n\t" + lvl + ", WeaponType.MARTEAU2M, \"marteau2M/ITEMICON\", new Calculable[] {\n";

	result += effects;
	result += "\t}),\n";

	console.log(result);
}

function ExtractCustomWeaponNew() {
	var name = document.getElementsByClassName('item-name')[0].getElementsByTagName('h6')[0].innerHTML;
	var lvl = document.getElementsByClassName('item-information-table')[0].getElementsByTagName('td');
	if(lvl[0] != undefined) {
		lvl = lvl[0].innerHTML;
	} else {
		lvl = "undefined";
	}
	
	var line = document.getElementsByClassName('item-general');
	
	var getNameClass = [["Luchador", "Guerrero", "Berserker", "Dios de Guerra", "Caballero de la Muerte", "Destructor"],
					["Luchador", "Guerrero", "Paladin", "Templario", "Caballero Sagrado", "Cruzado"],
					
					["Cazador", "Arquero", "Ranger", "Francotirador", "Ballestero Mortal", "Depredador"],
					["Cazador", "Arquero", "Asesino", "Acechador Oscuro", "Ninja Fantasmal", "Shinobi"],
					
					["Acolito", "Sacerdote", "Clerigo", "Profeta", "Santo", "Arcángel"],
					["Acolito", "Sacerdote", "Sabio", "Mistico", "Chamán", "Druida"],
					
					["Hechicero", "Mago", "Mago Brujo", "Archimago", "Avatar", "Brujo"],
					["Hechicero", "Mago", "Nigromante", "Demonólogo", "Amo de Almas", "Shinigami"],
					
					["Mecánico", "Ingeniero", "Artificiero", "Prime", "Megatron", "Omega"],
					["Mecánico", "Ingeniero", "Artillero", "Optimus", "Galvatron", "Domador Celestial"],
					
					["Viajero", "Nómada", "Duelista", "Samurai", "Dimensionalista", "Espectro Mortal"],
					["Viajero", "Nómada", "Relojero", "Maestro del Tiempo", "Oráculo", "Alterador Cósmico"]];
	
	var listClass = "";
	var listEffect = "";
	
	for(var i = 0; i < line.length; i++) {
		if(line[i].getElementsByClassName('stat').length > 0) {
			var stat = line[i].getElementsByClassName('stat');
			
			for(var j = 0; j < stat.length; j++) {
				if(stat[j].innerHTML.trim().startsWith('ATK')) {
					listEffect += "\t\tnew Effect(TypeEffect.Atk, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('R-ATK')) {
					listEffect += "\t\tnew Effect(TypeEffect.AtkD, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
				} else if(stat[j].innerHTML.trim().startsWith('M-ATK')) {
					listEffect += "\t\tnew Effect(TypeEffect.AtkM, false, " + stat[j].innerHTML.match(/[0-9]+(\.[0-9])?/)[0] + ", true),\n";
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
				} else if(stat[j].innerHTML.match(/golpear/)) {
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
	
	var result = "new CustomWeapon(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tnew GradeName[] { ";
	result += listClass;
	result += "},\n\t" + lvl + ", WeaponType.MARTEAU2M, \"marteau2M/ITEMICON\", new Calculable[] {\n";
	result += listEffect;
	result += "\t}),\n";
	
	console.log(result);
}

function updateClock() {}

if(document.URL.match(/grandfantasia-db/)) {
	ExtractCustomWeaponNew();
} else if(document.URL.match(/grandfantasia\.info/)) {
	ExtractCustomWeaponOld();
} else {
	console.log("Site non compatible")
}