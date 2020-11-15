var name = document.getElementsByClassName('descbox iconh')[0].getElementsByTagName('h2')[0].innerText;

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
		} else if(getCells[i].cells[0].innerText.match(/vie/)) {
			effectName[count] = [ "PV", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Mana/)) {
			effectName[count] = [ "PM", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Sacré/)) {
			effectName[count] = [ "Sacre", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Ombre/)) {
			effectName[count] = [ "Ombre", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Foudre/)) {
			effectName[count] = [ "Foudre", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Feu/)) {
			effectName[count] = [ "Feu", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Glace/)) {
			effectName[count] = [ "Glace", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
			count++;
		} else if(getCells[i].cells[0].innerText.match(/Nature/)) {
			effectName[count] = [ "Nature", getCells[i].cells[0].innerText.match(/[0-9]+(\.[0-9])?/)[0] ];
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
	} else if (key == "PV") {
		effects += "\t\tnew Effect(TypeEffect.PV, false, " + effectName[i][1] + "),\n";
	} else if (key == "PM") {
		effects += "\t\tnew Effect(TypeEffect.PM, false, " + effectName[i][1] + "),\n";
	} else if (key == "Sacre") {
		effects += "\t\tnew Effect(TypeEffect.Sacre, false, " + effectName[i][1] + "),\n";
	} else if (key == "Ombre") {
		effects += "\t\tnew Effect(TypeEffect.Ombre, false, " + effectName[i][1] + "),\n";
	} else if (key == "Foudre") {
		effects += "\t\tnew Effect(TypeEffect.Foudre, false, " + effectName[i][1] + "),\n";
	} else if (key == "Feu") {
		effects += "\t\tnew Effect(TypeEffect.Feu, false, " + effectName[i][1] + "),\n";
	} else if (key == "Glace") {
		effects += "\t\tnew Effect(TypeEffect.Glace, false, " + effectName[i][1] + "),\n";
	} else if (key == "Nature") {
		effects += "\t\tnew Effect(TypeEffect.Nature, false, " + effectName[i][1] + "),\n";
	}
}

var result = "new CustomRing(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";

result += "\t" + lvl + ", \"ITEMICON\", new Calculable[] {\n";

result += effects;
result += "\t}),\n";

console.log(result);