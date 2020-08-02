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

var color = document.getElementsByTagName('h4');
for(var i = 0; i < color.length; i++) {
	if(color[i].innerHTML == "Final Product") {
		var classNames = color[i].nextElementSibling.className;
		color = classNames.substring(classNames.length-1, classNames.length);
		break;
	}
}
if(!(color > 0 && color < 7)) color = "undefined";

var enchant = false;

var count = 0;
var effects = "";
var effectName = [];
var getCells = document.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
for(var i = 0; i < getCells.length; i++) {
	if(getCells[i].cells.length == 2) {
		effectName[count] = [ getCells[i].cells[0].innerText, getCells[i].cells[1].innerText ];
		count++;
	} else if(getCells[i].cells.length == 1) {
		if(getCells[i].cells[0].innerText.match(/vie/)) {
			effectName[count] = [ "PV", getCells[i].cells[0].innerText.match(/[0-9]+/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Mana/)) {
			effectName[count] = [ "PM", getCells[i].cells[0].innerText.match(/[0-9]+/)[0] ];
			count++;
		}
	}
}
for(var i = 0; i < effectName.length; i++) {
	var key = effectName[i][0];
	if(key == "DÉF") {
		effects += "\t\tnew Effect(TypeEffect.DefP, false, " + effectName[i][1] + ", true),\n";
	} else if (key == "DÉF M.") {
		effects += "\t\tnew Effect(TypeEffect.DefM, false, " + effectName[i][1] + ", true),\n";
	} else if (key == "FCE" || key == "VIT" || key == "INT" || key == "VOL" || key == "AGI") {
		effects += "\t\tnew Effect(TypeEffect." + key + ", false, " + effectName[i][1] + ", true),\n";
	} else if (key == "PV") {
		effects += "\t\tnew Effect(TypeEffect.PV, false, " + effectName[i][1] + "),\n";
	} else if (key == "PM") {
		effects += "\t\tnew Effect(TypeEffect.PM, false, " + effectName[i][1] + "),\n";
	}
}

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

var colorCorrespondance = new Array();
colorCorrespondance[0] = "GREY";
colorCorrespondance[1] = "WHITE";
colorCorrespondance[2] = "GREEN";
colorCorrespondance[3] = "BLUE";
colorCorrespondance[4] = "ORANGE";
colorCorrespondance[5] = "GOLD";
colorCorrespondance[6] = "PURPLE";
colorCorrespondance[7] = "RED";


if(colorCorrespondance[color] == "GOLD") {
	enchant = true;
}


var result = "new Cape(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
result += "\tnew GradeName[] { ";

idClasses = idClasses.split(",");

for(var i = 0; i < idClasses.length; i++) {
	result += "GradeName." + gradeNameCorrespondance[idClasses[i]] + ", ";
}

result += "},\n";
result += "\t" + lvl + ", Quality." + colorCorrespondance[color] + ", " + enchant + ", \"-1\", \"ICONPATH\", new Calculable[] {\n";
result += effects;
result += "\t}, null ),\n";

console.log(result);