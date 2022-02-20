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


function ExtractSkill() {
	var result = "";
	
	var table = document.getElementsByTagName('tr');
	
	for(var i = 1; i < table.length; i++) {
		var title = table[i].querySelectorAll("[data-toggle=modal]")[0];
		
		if(title != undefined) {
			var skillResult = "";
			
			var reinca = false;
			
			var skill = table[i].getElementsByClassName('m-2');
			
			for(var j = 0; j < skill.length; j++) {
				var skillLvl = skill[j].getElementsByTagName('a')[0];
				
				var completeName = skillLvl.innerHTML;
				var simpleName;
				var numSkill;
				
				if(completeName.match(/[0-9]+/)) {
					simpleName = completeName.substring(0, completeName.length-2);
					numSkill = completeName.substring(completeName.length-1);
				} else {
					simpleName = completeName;
					numSkill = 0;
				}
				
				skillResult += "\tnew InnerSkill(new HashMap<Language, String>() {{ put(Language.FR, \"" + simpleName + "\"); put(Language.EN, \"\"); }}, " + numSkill + ",\n";
				
				var tooltip = skillLvl.getAttribute('data-original-title').split("<br>");
				var costPM = -1;
				var cooldown = -1;
				var timeCast = -1;
				var lvl = -1;
				
				for(var k = 0; k < tooltip.length; k++) {
					if(tooltip[k].match('Coût')) {
						costPM = tooltip[k].match(/[0-9]+/)[0];
					} else if(tooltip[k].match('nstantané')) {
						timeCast = 0;
					} else if(tooltip[k].match('ncantation')) {
						timeCast = tooltip[k].match(/[0-9]+/)[0];
					} else if(tooltip[k].match('Recharge')) {
						cooldown = tooltip[k].match(/[0-9]+/)[0] / 10;
					} else if(tooltip[k].match('écessaire')) {
						lvl = tooltip[k].match(/[0-9]+/)[0];
					} else if(tooltip[k].match('#88#')) {
						reinca = true;
					} else if(tooltip[k].match('PM')) {
						if(k < tooltip.length-1) {
							costPM = tooltip[k].match(/[0-9]+/)[0];
						}
					} else if(tooltip[k].match('VIT COMP')) {
						if(k < tooltip.length-1) {
							timeCast = tooltip[k].match(/[0-9]+/)[0];
						}
					}
				}
				
				skillResult += "\t\t\"ICONCODESKILL\", " + costPM + ", " + cooldown + ", " + timeCast + ", " + lvl + ", new Calculable[] {\n";
				skillResult += "\t\t\t\n";
				skillResult += "\t\t}),\n";
			}
			
			result += "new SkillNew(new GradeName[] { GradeName.BERSERKER, }, SkillType.TYPE, " + reinca + ", \"CODESKILL\", new InnerSkill[] {\n";
			result += skillResult;
			result += "}),\n";
		}
	}
	
	console.log(result);
}

if(document.URL.match(/grandfantasia-db/)) {
	ExtractSkill();
} else {
	console.log("Site non compatible")
}