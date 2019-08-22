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
if(!(color > 0 && color < 7)) color = "   ";

var enchant = false;

var reinca = document.getElementsByClassName('color-red')[0];
if(reinca == undefined) reinca = false;
else reinca = reinca.innerHTML.match("Réincarnation") ? true : false;

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

// Tiare enchantée d'Elminster/6/100/100gold6/5/true/5,0,0/VIT,false,25,true/INT,false,31,true/VOL,false,16,true/DefP,false,614,true/DefM,false,778,true/100gold6
console.log(name + "/" + idClasses + "/" + lvl + "/XXX/" + color + "/" + enchant + "/" + reinca + "/" + count + ",0,0/" + effects);