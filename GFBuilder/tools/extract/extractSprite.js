var colorCorrespondance = new Array();
	colorCorrespondance[0] = "WHITE";
	colorCorrespondance[1] = "WHITE";
	colorCorrespondance[2] = "GREEN";
	colorCorrespondance[3] = "BLUE";
	colorCorrespondance[4] = "ORANGE";
	colorCorrespondance[5] = "GOLD";
	colorCorrespondance[6] = "PURPLE";
	colorCorrespondance[7] = "RED";


function ExtractSprite() {
	var nameHTML = document.getElementsByClassName('item-name')[0].getElementsByTagName('h6')[0]
	var name = nameHTML.innerHTML;
	var quality = nameHTML.outerHTML.charAt(19);
	
	var iconpath = document.getElementsByClassName("item-icon")[0].innerHTML.split("itemicon/")[1].substr(0, 6);
	
	var type;
	
	if(iconpath.charAt(1).match(/1/)) {
		type = "HEAD";
	} else if(iconpath.charAt(1).match(/2/)) {
		type = "BODY";
	}
	
	var result = "new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, \"" + name + "\"); put(Language.EN, \"\"); }},\n";
	result += "\tQuality." + colorCorrespondance[quality] + ", SpriteCostType." + type + ", \"" + iconpath + "\", new Calculable[] {\n";
	result += "\t}),\n";
	
	console.log(result);
}

function updateClock() {}

if(document.URL.match(/grandfantasia-db/)) {
	ExtractSprite();
} else {
	console.log("Site non compatible")
}