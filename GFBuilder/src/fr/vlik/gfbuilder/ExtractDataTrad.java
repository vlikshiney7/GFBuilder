package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExtractDataTrad {
	
	public static void main(String[] args) {
		//launchTrad("charac/", "LoaderBlason.java", "T_Item.ini");
		launchTrad("charac/", "LoaderCharac.java", "T_PointAbility.ini");
		
		launchTrad("characUpgrade/", "LoaderCharacUpgrade.java", "T_Item.ini");
		//launchTrad("characUpgrade/", "LoaderCharacUpgrade.java", "T_Spell.ini");
		launchTrad("characUpgrade/", "LoaderCombiTalent.java", "T_Item.ini");
		launchTrad("characUpgrade/", "LoaderNucleusEnchantment.java", "T_ItemCombo.ini");
		launchTrad("characUpgrade/", "LoaderProSkill.java", "T_Spell.ini");
		//launchTrad("characUpgrade/", "LoaderSpeciality.java", "T_Enchant.ini");
		launchTrad("characUpgrade/", "LoaderTalent.java", "T_Enchant.ini");
		launchTrad("characUpgrade/", "LoaderTitle.java", "T_Title.ini");
		
		launchTrad("customEquip/", "LoaderCustomBoot.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomBreastplate.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomCape.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomGauntlet.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomHelmet.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomLegging.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomRing.java", "T_Item.ini");
		launchTrad("customEquip/", "LoaderCustomWeapon.java", "T_Item.ini");
		
		launchTrad("equip/", "LoaderBoot.java", "T_Item.ini");
		launchTrad("equip/", "LoaderBreastplate.java", "T_Item.ini");
		launchTrad("equip/", "LoaderCape.java", "T_Item.ini");
		launchTrad("equip/", "LoaderEquip.java", "T_Item.ini");
		launchTrad("equip/", "LoaderEquipSet.java", "T_EquipSet.ini");
		launchTrad("equip/", "LoaderGauntlet.java", "T_Item.ini");
		launchTrad("equip/", "LoaderHelmet.java", "T_Item.ini");
		launchTrad("equip/", "LoaderLegging.java", "T_Item.ini");
		launchTrad("equip/", "LoaderRide.java", "T_ItemMall.ini");
		launchTrad("equip/", "LoaderRing.java", "T_Item.ini");
		launchTrad("equip/", "LoaderWeapon.java", "T_Item.ini");
		
		launchTrad("equipUpgrade/", "LoaderEnchant.java", "T_ItemCombo.ini");
		//launchTrad("equipUpgrade/", "LoaderPearl.java", "T_Item.ini");
		launchTrad("equipUpgrade/", "LoaderPearlEnchantment.java", "T_ItemCombo.ini");
		
		launchTrad("subEquip/", "LoaderAnima.java", "T_Item.ini");
		launchTrad("subEquip/", "LoaderCostume.java", "T_ItemCombo.ini");
		launchTrad("subEquip/", "LoaderSouvenirEnchantment.java", "T_ItemCombo.ini");
		launchTrad("subEquip/", "LoaderSubEquip.java", "T_Item.ini");
		launchTrad("subEquip/", "LoaderSynthesis.java", "T_RideCombo.ini");
		
		launchTrad("", "Loader.java", "T_Enchant.ini");
	}
	
	public static void launchTrad(String folder, String fileJava, String fileToTrad) {
		int noTrad = 0;
		int total = 0;
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tools/resultTrad/Result" + fileJava, false), "UTF-8"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/fr/vlik/grandfantasia/loader/" + folder + fileJava), "UTF-8"));
		) {
			System.out.println("Début File loader : " + fileJava);
			String line = reader.readLine();
			
			while (line != null) {
				if(line.matches(".*Language.EN, \"\".*")) {
					String nameFR = line.split("\"")[1];
					String nameEN = "";
					String code = "";
					total++;
					
					if(nameFR.equals("")) {
						continue;
					}
					
					try (
						BufferedReader readerFR = new BufferedReader(new InputStreamReader(new FileInputStream("tools/datafile/FR/" + fileToTrad), "Cp1252"));
					) {
						String subLine = readerFR.readLine();
						while (subLine != null) {
							String transformFR = toRegex(nameFR);
							
							if(subLine.matches(".*\\| ?" + transformFR + " ?\\|.*")) {
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
						
						line = line.replace("Language.EN, \"\"", "Language.EN, \"" + nameEN.trim() + "\"");
					}
					
					if(line.matches(".*Language.EN, \"\".*")) {
						noTrad++;
						System.out.println("Élement non traduit : " + nameFR);
					}
				}
				
				writer.append(line + "\n");
				line = reader.readLine();
			}
			
			System.out.println("Fin File loader : " + fileJava);
			System.out.println("Nombre d'élement non traduit : " + noTrad + "/" + total);
		} catch (IOException e) {
			System.out.println("Error save file");
		}
		
		if(noTrad == total) {
			File remove = new File("tools/resultTrad/Result" + fileJava);
			System.out.println("Suppression du fichier : " + remove.delete());
		}
		
		System.out.println("______________________________");
	}
	
	public static String toRegex(String entry) {
		String result = entry.replace("(", "\\(");
		result = result.replace(")", "\\)");
		result = result.replace("+", "\\+");
		result = result.replace("-", "\\-");
		return result;
	}
}
