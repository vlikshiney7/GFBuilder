package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedList;

public class ExtractTitleData {
	
	private static HashMap<String, String> allTitles = new HashMap<String, String>();
	private static LinkedList<String> sortTitles = new LinkedList<String>();
	
	private static String[] toIgnore = {
			"Placeholder", "Titre familial",
			"Pro de la Production", "Pro de la Synthèse", "Pro de l'Amélioration", "Pro des Bijoux", "Pro des titres", "Artisan Professionnel",
			"Messager appliqué",
		};

	public static void main(String[] args) {
		
		readTitleTW();
		readMissionEU();
		readTitleEU();
		
		allTitles.entrySet().forEach(entry -> {
			String[] split = entry.getValue().split(";");
			
			if(split.length > 2) {
				String color = split[0].trim();
				String name = split[split.length-2].trim();
				String effects = split[split.length-1].trim().replace("|", "");
				String lvl = split[split.length-3].trim();
				
				if(notIn(name)) {
				
					if(color.equals(lvl)) {
						lvl = "0";
					}
					
					if(color.equals("")) {
						System.out.println(name);
					}
					
					process(name, color, lvl, effects);
				}
			}
		});
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools" + File.separator + "ExtractTitle-" + Instant.now().toString().substring(0, 10) + ".txt", false), "UTF-8"));
		) {
			for(String s : sortTitles) {
				writer.append(s);
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error save file");
		}
		
		System.out.println("Done !");
	}
	
	private static void process(String name, String color, String lvl, String effects) {
		String quality = "GREY";
		
		switch(color) {
			case "1":	quality = "WHITE";		break;
			case "2":	quality = "GREEN";		break;
			case "3":	quality = "BLUE";		break;
			case "4":	quality = "ORANGE";		break;
			case "5":	quality = "GOLD";		break;
			case "6":	quality = "PURPLE";		break;
			case "7":	quality = "RED";		break;
			case "10":	quality = "P8TITLE";	break;
		}
		
		if(quality != "GREY") {
			
			String toCode = "new Title(\"" + name + "\", Quality." + quality + ", " + lvl + ", GradeName.NONE, new Calculable[] {\n";
			
			String[] split = effects.split("\n");
			for(String s : split) {
				toCode += "\tnew Effect(" + s + "),\n";
			}
			
			toCode += "}\n";
			
			
			if(sortTitles.isEmpty()) {
				sortTitles.add(toCode);
			} else {
				boolean colorOK = false;
				boolean done = false;
				
				for(int i = 0; i < sortTitles.size(); i++) {
					if(!colorOK && sortTitles.get(i).split("Quality.")[1].substring(0, 2).equals(quality.substring(0, 2))) {
						colorOK = true;
					}
					
					if(colorOK) {
						if(toCode.compareTo(sortTitles.get(i)) > 0) {
							sortTitles.add(i+1, toCode);
							done = true;
							break;
						}
					}
				}
				
				if(!done) {
					sortTitles.add(toCode);
				}
			}
		}
	}
	
	private static void readTitleTW() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/C_Title.ini"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{4}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					allTitles.put(lineSplit[0], lineSplit[3]);
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error C_Title.ini");
		}
	}
	
	private static void readMissionEU() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/C_Mission.ini"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches(".*add_appellation.*")) {
					String[] lineSplit = line.split("\\|");
					
					String lvl = "0", titleCode = "";
					
					for(String split : lineSplit) {
						if(split.matches(".*add_appellation.*")) {
							String[] resplit = split.split("add_appellation ");
							
							titleCode = resplit[1].split(":")[0];
						}
						
						if(split.matches(".*If_CharLevel >=.*")) {
							String[] resplit = split.split("If_CharLevel >= ");
							
							lvl = resplit[1].split(":")[0];
						}
					}
					
					if(allTitles.containsKey(titleCode)) {
						String value = allTitles.get(titleCode);
						allTitles.put(titleCode, value + " ; " + lvl);
					} else {
						allTitles.put(titleCode, " ; " + lvl);
					}
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error C_Mission.ini");
		}
	}
	
	private static void readTitleEU() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/T_Title.ini"), "Cp1252"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{4}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					String name = lineSplit[1], titleCode = lineSplit[0];
					
					line = reader.readLine();
					
					String effects = "";
					while(line != null && !line.matches("^[0-9]{4}\\|.*")) {
						effects += "\n" + line;
						line = reader.readLine();
					}
					
					if(allTitles.containsKey(titleCode)) {
						String value = allTitles.get(titleCode);
						allTitles.put(titleCode, value + " ; " + name + " ; " + effects);
					} else {
						allTitles.put(titleCode, " ; " + name + " ; " + effects);
					}
				}
			}
		}  catch (IOException e) {
			System.out.println("Error T_Title.ini");
		}
	}
	
	public static boolean notIn(String element) {
		for(String s : toIgnore) {
			if(s.equals(element)) {
				return false;
			}
		}
		
		return true;
	}
}
