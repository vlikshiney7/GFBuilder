var line = document.getElementsByClassName('stats-list')[0].getElementsByTagName('tr');

var nameStat = [ "DEF", "M-DEF", "STR", "VIT", "INT", "WIL", "AGI", "HP", "MP" ];
var convert = [ "DefP", "DefM", "FCE", "VIT", "INT", "VOL", "AGI", "PV", "PM" ];
var toReinca = [ true, true, true, true, true, true, true, false, false ];

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


var obj = {
	"DEF" : [],	"M-DEF" : [],
	"STR" : [],	"VIT" : [],	"INT" : [],	"WIL" : [],	"AGI" : [],
	"HP" : [], "MP" : []
};

var result = "new MultiEffect(\"CODEMULTIEFFECT\", 999, new Effect[][] {\n";

for(var i = 0; i < line.length; i++) {
	if(line[i].getElementsByTagName('td').length == 2) {
		var content = line[i].getElementsByTagName('td')[1].innerHTML;
		
		if(content.endsWith(', ')) {
			content = content.substring(0, content.length-2);
		} else if(content.endsWith(',')) {
			content = content.substring(0, content.length-1);
		}
		
		var tabStat = content.split(',');
		
		result += "\tnew Effect[] {\n";
		
		for(var j = 0; j < tabStat.length; j++) {
			if(tabStat[j].startsWith(' ')) {
				tabStat[j] = tabStat[j].substring(1);
			}
			
			var oneStat = tabStat[j].split(' ');
			
			result += "\t\tnew Effect(TypeEffect." + statCorrespondance[oneStat[1]] + ", false, " + oneStat[0] + reincaCorrespondance[oneStat[1]] + "),\n";
			
			obj[oneStat[1]].push(oneStat[0]);
		}
		
		result += "\t},\n";
	} else {
		break;
	}
}

result += "}), null ),"
/*
var result = "";

for(var i = 0; i < nameStat.length; i++) {
	
	if(obj[nameStat[i]].length != 0) {
		var scotch = "";
		
		for(var j = 0; j < obj[nameStat[i]].length; j++) {
			scotch = scotch + obj[nameStat[i]][j] + ',';
		}
		
		scotch = scotch.substring(0, scotch.length-1);
		
		result += convert[i] + '/false/' + scotch + '/' + toReinca[i] + '/-1\n';
	}
	
}
*/

console.log(result);