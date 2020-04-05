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

var reinca = document.getElementsByClassName('color-red')[0];
if(reinca == undefined) reinca = false;
else reinca = reinca.innerHTML.match("Réincarnation") ? true : false;


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


var result = "new Armor(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
result += "\tnew GradeName[] { ";

idClasses = idClasses.split(",");

for(var i = 0; i < idClasses.length; i++) {
	result += "GradeName." + gradeNameCorrespondance[idClasses[i]] + ", ";
}


var line = document.getElementsByClassName('stats-list')[0].getElementsByTagName('tr');

var statCorrespondance = new Array();
statCorrespondance['DEF'] = "DefP";
statCorrespondance['M-DEF'] = "DefM";
statCorrespondance['STR'] = "FCE";
statCorrespondance['VIT'] = "VIT";
statCorrespondance['INT'] = "INT";
statCorrespondance['WIL'] = "VOL";
statCorrespondance['AGI'] = "AGI";
statCorrespondance['HP'] = "PV";
statCorrespondance['MP'] = "PM";

var reincaCorrespondance = new Array();
reincaCorrespondance['DEF'] = ", true";
reincaCorrespondance['M-DEF'] = ", true";
reincaCorrespondance['STR'] = ", true";
reincaCorrespondance['VIT'] = ", true";
reincaCorrespondance['INT'] = ", true";
reincaCorrespondance['WIL'] = ", true";
reincaCorrespondance['AGI'] = ", true";
reincaCorrespondance['HP'] = "";
reincaCorrespondance['MP'] = "";

var pieceCorrespondance = new Array();
pieceCorrespondance[1] = [ "CASQUE", "casques" ];
pieceCorrespondance[2] = [ "PLASTRON", "torses" ];
pieceCorrespondance[3] = [ "JAMBIERE", "pantalons" ];
pieceCorrespondance[4] = [ "GANT", "gants" ];
pieceCorrespondance[5] = [ "BOTTE", "bottes" ];


var obj = {
	"DEF" : [],	"M-DEF" : [],
	"STR" : [],	"VIT" : [],	"INT" : [],	"WIL" : [],	"AGI" : [],
	"HP" : [], "MP" : []
};

var idPiece = document.getElementsByTagName('tbody')[0].getElementsByTagName('a')[0].outerHTML.match(/[0-9]+/)[0];


var lvl = line[0].getElementsByTagName('td')[0].innerText.match(/[0-9]+/)[0];
var lvlMax = lvl-1;

for(var i = 0; i < line.length; i++) {
	if(line[i].getElementsByTagName('td').length == 2) {
		lvlMax++;
	} else {
		break;
	}
}

result += "}, " + lvl + ", Quality.BLUE, false, " + reinca + ",\n";
result += "\tArmorType." + pieceCorrespondance[idPiece][0] + ", \"" + lvlMax + "evo" + idClasses[0] + (reinca ? "R" : "") + "\", \"" + pieceCorrespondance[idPiece][1] + "/ICONPATH\", new MultiEffect(\"" + lvlMax + "evo" + idClasses[0] + (reinca ? "R" : "") + "-" + (idPiece-1) + "\", " + lvl + ", new Effect[][] {\n";

for(var i = 0; i < line.length; i++) {
	if(line[i].getElementsByTagName('td').length == 2) {
		var content = line[i].getElementsByTagName('td')[1].innerHTML;
		
		if(content.endsWith(', ')) {
			content = content.substring(0, content.length-2);
		} else if(content.endsWith(',')) {
			content = content.substring(0, content.length-1);
		}
		
		var tabStat = content.split(',');
		
		result += "\t\tnew Effect[] {\n";
		
		for(var j = 0; j < tabStat.length; j++) {
			if(tabStat[j].startsWith(' ')) {
				tabStat[j] = tabStat[j].substring(1);
			}
			
			var oneStat = tabStat[j].split(' ');
			
			result += "\t\t\tnew Effect(TypeEffect." + statCorrespondance[oneStat[1]] + ", false, " + oneStat[0] + reincaCorrespondance[oneStat[1]] + "),\n";
			
			obj[oneStat[1]].push(oneStat[0]);
		}
		
		result += "\t\t},\n";
	} else {
		break;
	}
}

result += "\t}), null ),"

console.log(result);