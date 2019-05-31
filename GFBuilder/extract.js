var name = document.getElementsByClassName('descbox iconh')[0].getElementsByTagName('h2')[0].innerHTML;

var idClasses = "";
var getterId = [ [3], [4], [7], [8], [11, 21, 36, 44], [12, 22, 37, 45], [13, 14, 15, 23, 38, 46], [13, 14, 16, 24, 39, 47], [27], [28], [54], [55] ];

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


console.log(name + "/" + idClasses);