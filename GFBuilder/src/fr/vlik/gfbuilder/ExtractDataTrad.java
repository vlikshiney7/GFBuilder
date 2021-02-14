package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExtractDataTrad {
	
	public static void main(String[] args) {
		launchTrad("characUpgrade/", "LoaderTitle.java", "T_Title.ini");
		launchTrad("customEquip/", "LoaderCustomCape.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomRing.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomWeapon.java", "T_Item.ini");
		launchTrad("equip/", "LoaderWeapon.java", "T_Item.ini");
		launchTrad("equip/", "LoaderRing.java", "T_Item.ini");
		launchTrad("equip/", "LoaderCape.java", "T_Item.ini");
	}
	
	public static void launchTrad(String folder, String fileJava, String fileToTrad) {
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools/resultTrad/Result" + fileJava, false), "UTF-8"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/fr/vlik/grandfantasia/loader/" + folder + fileJava), "UTF-8"));
		) {
			String line = reader.readLine();
			int count = 0;
			while (line != null) {
				if(line.matches(".*Language.EN, \"\".*")) {
					String nameFR = line.split("\"")[1];
					String nameEN = "";
					String code = "";
					
					if(nameFR.equals("")) {
						continue;
					}
					
					try (
						BufferedReader readerFR = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/FR/" + fileToTrad), "Cp1252"));
					) {
						String subLine = readerFR.readLine();
						while (subLine != null) {
							
							if(subLine.matches(".*" + nameFR + ".*")) {
								code = subLine.split("\\|")[0];
								break;
							}
							
							subLine = readerFR.readLine();
						}
					} catch (IOException e) {
						System.out.println("Error read file : FR/" + fileToTrad);
					}
					
					if(!code.equals("")) {
						try (
							BufferedReader readerEN = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/EN/" + fileToTrad), "Cp1252"));
						) {
							String subLine = readerEN.readLine();
							while (subLine != null) {
								
								if(subLine.matches("^" + code + "\\|.*")) {
									nameEN = subLine.split("\\|")[1];
									break;
								}
								
								subLine = readerEN.readLine();
							}
						} catch (IOException e) {
							System.out.println("Error read file : EN/" + fileToTrad);
						}
						
						line = line.replace("Language.EN, \"\"", "Language.EN, \"" + nameEN + "\"");
					}
					
					if(line.matches(".*Language.EN, \"\".*")) {
						count++;
						System.out.println("Élement non traduit : " + nameFR);
					}
				}
				
				writer.append(line + "\n");
				line = reader.readLine();
			}
			
			if(count != 0) {
				System.out.println("File loader : " + fileJava);
				System.out.println("Nombre d'élement non traduit : " + count);
				System.out.println("______________________________");
			}
		} catch (IOException e) {
			System.out.println("Error save file");
		}
	}

}
