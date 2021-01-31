package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import fr.vlik.grandfantasia.characUpgrade.Title;

public class ExtractTitleData {
	
	private static HashMap<String, String> allTitles = new HashMap<String, String>();
	private static ArrayList<LinkedList<String>> sortTitles = new ArrayList<LinkedList<String>>();
	
	private static String[] toIgnore = {
			"*Festival d'Hiver*", "Été GF - Titre Souvenir", "Placeholder", 
			"Aeria Games", "AFK", "Ami des Sprites", "Ami du Père Noël", "Amoureux des Sprites", "Ancêtre Vénérable", "Apprenti Maître du Monde", "Archange de Saphaël", "Aventurier Téméraire",
			"Bronzage Intégral",
			"Capitaine des Sept Mers", "Caïd du Bac à Sable", "Cendrillon aux Pied Nus", "Citoyen de Poséidon", "Collectionneur de Pokémons", "Copain des Sprites", "Cœur Généreux",
			"Dieu Absolu du Web", "Enfant de l'Océan", "Enfant du Soleil", "Escapade de Clair de Lune", "Esprit Supérieur", "Expert en Réseaux", "Expert en Sprites",
			"Fakir Illuminé", "Fan des Sprites", "Fidèle aux Traditions", "FreeKill",
			"Gourou des Sprites", "Grand Fantastique", "Grand Manitou", "Grand Maître de Grand Fantasia", "Gélapin Mon Amour",
			"Héritier des Royaumes Sprites", "IMPACT Céleste", "Illusion Lunaire", "Japanese event", "Lignée Royale",
			"Marche-Lune", "Maître des Arènes", "Maître en Arts Martiaux", "Meilleur Messager de Saphaël", "Messager Ultime", "Messager au Cœur pur", "Messager de l'Amour", "Modèle de Santé", "Mystère",
			"Perturbateur Irritant", "Petite Poupée", "Prince Protecteur de Kaslow", "Protecteur des Débutants",
			"Rencontre Inévitable", "Romantique Désespéré", "Rêveur Impénitent", "Service client d'Aeria Games", "Sportif de l'Extrême", "Sprite dans l'Âme", "Spritophile Fanatique",
			"Titre 8648", "Troll Sauvage des Forums", "Tête Dure", "Vieux de la Vieille", "Yakuza Impitoyable",
			"Élite de Clair de Lune", "Étoile Élue", "Cœur de Démon", "Cœur de Pierre", "Collectionneur d'œufs de Pâques", "Cœur vagabond", "Maître de l'Œuf de Pâques Magique", "Voyageur au Cœur Brisé",
			"GF Grand Fantasia", "GFWT 2016 - DO NOT USE", "Titre du concours PvP 2015", "Titre du tournoi PvP 2018",
			"Héraut de Cœur de Lion Embrasé", "Nouveau titre de serveur étranger",
			"Faisons la fête avec l'idole (Répét.)", "Qu'est-ce que l'amour ?", "Membre honoraire éternel Gélapin",
			"Pro de la Production", "Pro de la Synthèse", "Pro de l'Amélioration", "Pro des Bijoux", "Pro des titres", "Artisan Professionnel",
		};

	public static void main(String[] args) {
		
		System.out.println("Read Title TW");
		readTitleTW();
		System.out.println("Read Mission EU");
		readMissionEU();
		System.out.println("Read Title EU");
		readTitleEU();
		System.out.println("Processing");
		
		allTitles.entrySet().forEach(entry -> {
			String[] split = entry.getValue().split(";");
			
			if(split.length > 2) {
				String color = split[0].trim();
				String name = split[split.length-2].trim();
				String effects = split[split.length-1].trim().replace("|", "");
				String lvl = split[split.length-3].trim();
				
				if(notInBanList(name)) {
				
					if(color.equals(lvl)) {
						lvl = "0";
					}
					
					if(color.equals("")) {
						System.out.println(name);
					}
					
					if(notInData(name, Integer.parseInt(lvl))) {
						process(name, color, lvl, effects);
					}
				}
			}
		});
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools" + File.separator + "ExtractTitle.java", false), "UTF-8"));
		) {
			for(LinkedList<String> list : sortTitles) {
				for(String s : list) {
					writer.append(s);
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error save file");
		}
		
		System.out.println("Done !");
	}
	
	private static void process(String name, String color, String lvl, String effects) {
		String quality = "GREY";
		
		int indexQuality = -1;
		
		switch(color) {
			case "1":	quality = "WHITE";		indexQuality = 7;		break;
			case "2":	quality = "GREEN";		indexQuality = 6;		break;
			case "3":	quality = "BLUE";		indexQuality = 5;		break;
			case "4":	quality = "ORANGE";		indexQuality = 4;		break;
			case "5":	quality = "GOLD";		indexQuality = 3;		break;
			case "6":	quality = "PURPLE";		indexQuality = 2;		break;
			case "7":	quality = "RED";		indexQuality = 1;		break;
			case "10":	quality = "P8TITLE";	indexQuality = 0;		break;
		}
		
		for(int i = 0; i < 8; i++) {
			sortTitles.add(new LinkedList<String>());
		}
		
		if(!quality.equals("GREY")) {
			
			String toCode = "new Title(\"" + name + "\", Quality." + quality + ", " + lvl + ", false, GradeName.NONE, new Calculable[] {\n";
			
			String[] split = effects.split("\n");
			for(String s : split) {
				toCode += "\tnew Effect(" + s + "),\n";
			}
			
			toCode = toCode.replace("\tnew Effect(Bonus / Malus :),\n", "");
			toCode = toCode.replace("\tnew Effect(Bonus / Malus : ),\n", "");
			toCode = toCode.replace("\tnew Effect(Bonus / Malus :),\n", "");
			toCode = toCode.replace("\tnew Effect(Bonus / Malus : ),\n", "");
			
			toCode += "}),\n";
			
			if(sortTitles.get(indexQuality).isEmpty()) {
				sortTitles.get(indexQuality).add(toCode);
			} else {
				boolean done = false;
				
				for(int i = 0; i < sortTitles.get(indexQuality).size(); i++) {
					if(toCode.compareTo(sortTitles.get(indexQuality).get(i)) < 0) {
						sortTitles.get(indexQuality).add(i, toCode);
						done = true;
						break;
					}
				}
				
				if(!done) {
					sortTitles.get(indexQuality).add(toCode);
				}
			}
		}
	}
	
	private static void readTitleTW() {
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/C_Title.ini"), "UTF-8"));
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
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/C_Mission.ini"), "UTF-8"));
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
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/T_Title.ini"), "Cp1252"));
		) {
			String line = reader.readLine();
			while (line != null) {
				if(line.matches("^[0-9]{4}\\|.*")) {
					String[] lineSplit = line.split("\\|");
					
					String name = lineSplit[1], titleCode = lineSplit[0];
					
					line = reader.readLine();
					
					String effects = lineSplit.length > 2 ? "\n" + lineSplit[2] : "";
					
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
	
	public static boolean notInBanList(String element) {
		for(String s : toIgnore) {
			if(element.startsWith(s)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean notInData(String name, int lvl) {
		return Title.get(name) == null || (Title.get(name).getLvl() == 0 && lvl != 0);
	}
}