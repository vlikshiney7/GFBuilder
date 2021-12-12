package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import fr.vlik.grandfantasia.charac.SpriteCost;

public class ExtractSpriteData {
	
	private static HashMap<String, String[]> allSprites = new HashMap<String, String[]>();
	private static String[] toIgnore = {
		"Casque de Canonnier pour Sprite", "Vêtement de Canonnier pour Sprite",
		"Vêtement de Sprite de la Déesse de l'Aube",
		"Chapeau des Sprites du Royaume Ciselé", "Vêtement des Sprites du Royaume Ciselé",
		"Chapeau de mandarin rouge (inutile)",
		"Coiffe de Sprite de Voyageur dans le Temps",
		"Armure d'Acier de Destruction  de Sprite",
	};
	
	public static void main(String[] args) {
		System.out.println("Read Item TW");
		readItemTW();
		
		System.out.println("Read ItemMall TW");
		readItemMallTW();
		
		System.out.println("Read Item EU");
		readItemEU();
		
		System.out.println("Read ItemMall EU");
		readItemMallEU();
		
		HashMap<String, String[]> filterResult = new HashMap<String, String[]>();
		
		allSprites.entrySet().forEach(entry -> {
			String id = entry.getKey();
			String[] values = entry.getValue();
			
			if(values[0] != null && !values[0].matches(".*(jour).*")) {
				filterResult.put(id, values);
			}
		});
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools" + File.separator + "ExtractSprite.java", false), "UTF-8"));
		) {
			for(Entry<String, String[]> entry : filterResult.entrySet()) {
				String[] values = entry.getValue();
				
				if(SpriteCost.get(values[0]) == null && notInBanList(values[0])) {
					String quality = "Quality.";
					String type = "SpriteCostType.";
					
					if(values[1].equals("2")) {
						quality += "GREEN";
					} else {
						quality += "WHITE";
					}
					
					if(values[2].charAt(1) == '1') {
						type += "HEAD";
					} else {
						type += "BODY";
					}
					
					System.out.println("new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, \"" + values[0] + "\"); put(Language.EN, \"\"); }},\n"
							+ "\t" + quality + ", " + type + ", \"" + values[2] + "\", new Calculable[] {\n"
							+ "\t\tnew Proc(Activation.Sprite, 12, new Calculable[] {\n\t\t\t\n"
							+ "\t\t}),\n"
							+ "\t}),");
					writer.append("new SpriteCost(new HashMap<Language, String>() {{ put(Language.FR, \"" + values[0] + "\"); put(Language.EN, \"\"); }},\n"
							+ "\t" + quality + ", " + type + ", \"" + values[2] + "\", new Calculable[] {\n"
							+ "\t\tnew Proc(Activation.Sprite, 12, new Calculable[] {\n\t\t\t\n"
							+ "\t\t}),\n"
							+ "\t}),\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error save file");
		}
		
		System.out.println("Done !");
	}
	
	private static void readItemTW() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/TW/C_Item.ini"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{4}\\|.*") || line.matches("^[0-9]{5}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					String id = lineSplit[0];
					
					String[] values = new String[4];
					if(lineSplit.length > 89 && lineSplit[88].equals("34")) {
						values[1] = lineSplit[24];
						values[2] = lineSplit[1];
						
						allSprites.put(id, values);
					}
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error C_Item.ini");
		}
	}
	
	private static void readItemMallTW() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/TW/C_ItemMall.ini"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{4}\\|.*") || line.matches("^[0-9]{5}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					String id = lineSplit[0];
					
					String[] values = new String[4];
					if(lineSplit.length > 89 && lineSplit[88].equals("34")) {
						values[1] = lineSplit[24];
						values[2] = lineSplit[1];
						
						allSprites.put(id, values);
					}
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error C_ItemMall.ini");
		}
	}
	
	private static void readItemEU() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/FR/T_Item.ini"), "Cp1252"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{5}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					if(lineSplit.length > 1) {
						for(Entry<String, String[]> entry : allSprites.entrySet()) {
							String id = entry.getKey();
							String[] values = entry.getValue();
							
							if(lineSplit[0].equals(id)) {
								values[0] = lineSplit[1];
								
								allSprites.remove(id);
								allSprites.put(id, values);
								
								break;
							}
						}
					}
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error T_Item.ini");
		}
	}
	
	private static void readItemMallEU() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/FR/T_ItemMall.ini"), "Cp1252"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{5}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					if(lineSplit.length > 1) {
						for(Entry<String, String[]> entry : allSprites.entrySet()) {
							String id = entry.getKey();
							String[] values = entry.getValue();
							
							if(lineSplit[0].equals(id)) {
								values[0] = lineSplit[1];
								
								allSprites.remove(id);
								allSprites.put(id, values);
								
								break;
							}
						}
					}
				}
				
				line = reader.readLine();
			}
		}  catch (IOException e) {
			System.out.println("Error T_ItemMall.ini");
		}
	}
	
	public static boolean notInBanList(String element) {
		for(String s : toIgnore) {
			if(element.startsWith(s)) {
				return false;
			}
		}
		
		return true;
	}
}
