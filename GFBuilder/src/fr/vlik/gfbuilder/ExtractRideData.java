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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.vlik.grandfantasia.equip.Ride;

public class ExtractRideData {
	
	private static HashMap<String, String[]> allRides = new HashMap<String, String[]>();
	private static String[] toIgnore = {
		"Monture 1 - Concours PvP 2015", "Monture 2 - Concours PvP 2015", "Monture 3 - Concours PvP 2015", "Monture 4 - Concours PvP 2015",
		"GFWT 2016 mount - DO NOT USE",
		"Monture - Tournoi PvP 2019",
		"Armure Méca Élite", "Loup Élite", "Chocobo de Combat Élite",
	};
	
	public static void launch() {
		System.out.println("--- Extract Ride ---");
		
		System.out.println("Read Item TW");
		readItemTW();
		
		System.out.println("Read ItemMall TW");
		readItemMallTW();
		
		System.out.println("Read Item EU");
		readItemEU();
		
		System.out.println("Read ItemMall EU");
		readItemMallEU();

		System.out.println("Read Enchant TW");
		readEnchantTW();
		
		
		HashMap<String, String[]> filterResult = new HashMap<String, String[]>();
		
		allRides.entrySet().forEach(entry -> {
			String id = entry.getKey();
			String[] values = entry.getValue();
			
			if(values[0] != null && !values[0].matches(".*(jours).*")) {
				filterResult.put(id, values);
			}
		});
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools" + File.separator + "ExtractRide.java", false), "UTF-8"));
		) {
			for(Entry<String, String[]> entry : filterResult.entrySet()) {
				String[] values = entry.getValue();
				
				if(Ride.get(values[0]) == null && notInBanList(values[0])) {
					System.out.println("new Ride(new HashMap<Language, String>() {{ put(Language.FR, \"" + values[0] + "\"); put(Language.EN, \"\"); }}, " + values[1] + ", " + values[2] + ", \"" + values[4] + "\", new Effect[] { new Effect(TypeEffect.Depla, false, " + values[3] + "), }),");
					writer.append("new Ride(new HashMap<Language, String>() {{ put(Language.FR, \"" + values[0] + "\"); put(Language.EN, \"\"); }}, " + values[1] + ", " + values[2] + ", \"" + values[4] + "\", new Effect[] { new Effect(TypeEffect.Depla, false, " + values[3] + "), }),\n");
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
					
					String[] values = new String[5];
					if(lineSplit.length > 89 && lineSplit[24].equals("4") && lineSplit[88].equals("38")) {
						values[1] = lineSplit[16];
						values[2] = lineSplit[18].equals("1") ? "true" : "false";
						values[3] = lineSplit[69];
						values[4] = lineSplit[1];
						
						allRides.put(id, values);
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
					
					String[] values = new String[5];
					if(lineSplit.length > 89 && lineSplit[24].equals("4") && lineSplit[88].equals("38")) {
						values[1] = lineSplit[16];
						values[2] = lineSplit[18].equals("1") ? "true" : "false";
						values[3] = lineSplit[69];
						values[4] = lineSplit[1];
						
						allRides.put(id, values);
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
						for(Entry<String, String[]> entry : allRides.entrySet()) {
							String id = entry.getKey();
							String[] values = entry.getValue();
							
							if(lineSplit[0].equals(id)) {
								values[0] = lineSplit[1];
								
								allRides.remove(id);
								allRides.put(id, values);
								
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
						for(Entry<String, String[]> entry : allRides.entrySet()) {
							String id = entry.getKey();
							String[] values = entry.getValue();
							
							if(lineSplit[0].equals(id)) {
								values[0] = lineSplit[1];
								
								allRides.remove(id);
								allRides.put(id, values);
								
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
	
	private static void readEnchantTW() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/TW/C_Enchant.ini"), "UTF-8"));
		) {
			String line = reader.readLine();
			HashMap<String, String[]> reconstructResult = new HashMap<String, String[]>();
			while (line != null) {
				if(line.matches("^[0-9]{5}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					if(lineSplit.length > 55) {
						for(Entry<String, String[]> entry : allRides.entrySet()) {
							String id = entry.getKey();
							String[] values = entry.getValue();
							
							if(lineSplit[0].equals(values[3])) {
								if(lineSplit[56].matches(".*(%).*")) {
									
									Pattern r = Pattern.compile("([0-9]+)%");
									Matcher m = r.matcher(lineSplit[56]);
									
									if(m.find()) {
										values[3] = m.group(0).replace("%", "");
										reconstructResult.put(id, values);
									}
								}
							}
						}
					}
				}
				
				line = reader.readLine();
			}
			
			allRides = reconstructResult;
		}  catch (IOException e) {
			System.out.println("Error C_Enchant.ini");
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
