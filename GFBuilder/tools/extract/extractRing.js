var name = document.getElementsByClassName('descbox iconh')[0].getElementsByTagName('h2')[0].innerText;

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
if(!(color > 0 && color < 7)) color = "   ";

var enchant = false;

var count = 0;
var count2 = 0;
var effects = "";
var effectName = [];
var getCells = document.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
for(var i = 0; i < getCells.length; i++) {
	if(getCells[i].cells.length == 2) {
		effectName[count2] = [ getCells[i].cells[0].innerText, getCells[i].cells[1].innerText ];
		count2++;
	}
}
for(var i = 0; i < effectName.length; i++) {
	var key = effectName[i][0];
	if(key == "ATQ") {
		effects += "Atk,false," + effectName[i][1] + ",true/";
		count++;
	} else if (key == "ATQ D.") {
		effects += "AtkD,false," + effectName[i][1] + ",true/";
		count++;
	} else if (key == "ATQ M.") {
		effects += "AtkM,false," + effectName[i][1] + ",true/";
		count++;
	} else if (key == "DÉF") {
		effects += "DefP,false," + effectName[i][1] + ",true/";
		count++;
	} else if (key == "DÉF M.") {
		effects += "DefM,false," + effectName[i][1] + ",true/";
		count++;
	} else if (key == "FCE" || key == "VIT" || key == "INT" || key == "VOL" || key == "AGI") {
		effects += key + ",false," + effectName[i][1] + ",true/";
		count++;
	}
}

console.log(name + "/" + lvl + "/-1/" + color + "/" + enchant + "/false/" + count + ",0,0/" + effects);