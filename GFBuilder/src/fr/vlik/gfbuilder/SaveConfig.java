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
import java.util.Map;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.page.PagePanel;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.customEquip.CustomCape;
import fr.vlik.grandfantasia.customEquip.CustomRing;
import fr.vlik.grandfantasia.customEquip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;

public class SaveConfig {
	
	private static final String SAVE_FOLDER_NAME = "GFBuilderSave";
	private static final String EXTENSION = ".gfb";
	private static final String CUSTOM_FILENAME = "CustomEquipmentCreation.gfbc";
	public static final String DEFAULT_NAME = "New build *";
	private static ArrayList<SaveConfig> data;
	static {
		loadData();
	}
	
	private String name;
	private Language lang;
	private Map<String, Map<String, String>> values = new HashMap<String, Map<String, String>>();
	private int[][] indexSelector;
	
	public SaveConfig(String name, int[][] tabConfig) {
		this.name = name;
		this.indexSelector = tabConfig;
	}
	
	public SaveConfig(String name, Language lang, Map<String, Map<String, String>> values) {
		this.name = name;
		this.lang = lang;
		this.values = values;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Map<String, String> getValuesFromPage(String page) {
		return this.values.get(page);
	}
	
	public int[][] getIndexSelector() {
		return this.indexSelector;
	}
	
	public void applyConfig() {
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		int[] orderLoading = { 0, 6, 7, 8, 1, 2, 3, 4, 5, 9, 10, 11 };
		
		for(int i = 0; i < orderLoading.length; i++) {
			if(pages.get(orderLoading[i]) instanceof PagePanel) {
				try {
					PagePanel page = (PagePanel) pages.get(orderLoading[i]);
					Map<String, String> values = this.getValuesFromPage(page.getSaveName());
					if(values != null) {
						page.setConfig(values, this.lang);
					}
				} catch (IllegalArgumentException e) {
					System.out.println("Out of range");
				}
			}
		}
		
		Overlay.getInstance().setNameSave(this.name);
		Overlay.getInstance().setSave(true);
	}
	
	public void overrideConfig() {
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		this.values.clear();
		
		for(JPanel panel : pages) {
			if(panel instanceof PagePanel) {
				PagePanel page = (PagePanel) panel;
				this.values.put(page.getSaveName(), page.getConfig(lang));
			}
		}
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(SAVE_FOLDER_NAME + File.separator + this.name + EXTENSION, false), "UTF-8"));
		) {
			writer.append(this.name + "/" + this.lang.name() + "\n");
			
			for(String pageName : this.values.keySet()) {
				writer.append(pageName + "\n");
				
				for(String selectorName : this.values.get(pageName).keySet()) {
					writer.append("\t" + selectorName + "=" + this.values.get(pageName).get(selectorName) + "\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
	
	private static void loadData() {
		SaveConfig.data = new ArrayList<SaveConfig>();
		
		File folder = new File(SAVE_FOLDER_NAME);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		for(File file : folder.listFiles()) {
			if(file.getName().endsWith(EXTENSION)) {
				try (
					BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				) {
					Map<String, Map<String, String>> build = new HashMap<String, Map<String, String>>();
					
					String[] header = reader.readLine().split("/");
					String line = reader.readLine();
					
					String page = line;
					
					while(line != null) {
						if(line.startsWith("\t")) {
							String[] element = line.trim().split("=");
							build.get(page).put(element[0], element.length != 1 ? element[1] : "");
						} else {
							page = line;
							build.put(page, new HashMap<String, String>());
						}
						
						line = reader.readLine();
					}
					
					SaveConfig.data.add(new SaveConfig(header[0], Language.valueOf(header[1]), build));
				} catch (IOException e) {
					System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
				}
			}
		}
		
		if(SaveConfig.data.isEmpty()) {
			Overlay.getInstance().setNameSave(DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
		}
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(SAVE_FOLDER_NAME + File.separator + CUSTOM_FILENAME), "UTF-8"));
		) {
			String line = reader.readLine();
			
			while(line != null) {
				
				String[] lineSplit = line.split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(lineSplit[2]);
				} catch (Exception e) {
					System.out.println("Ligne corrompu : " + line);
				}
				
				if(lineSplit.length == 4 && quality != null) {
					
					switch (lineSplit[0]) {
						case "Weapon":
							if(!CustomWeapon.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								System.out.println("Ligne corrompu : " + line);
							}
							break;
						case "Armor":
							if(!CustomArmor.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								System.out.println("Ligne corrompu : " + line);
							}
							break;
						case "Cape":
							if(!CustomCape.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								System.out.println("Ligne corrompu : " + line);
							}
							break;
						case "Ring":
							if(!CustomRing.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								System.out.println("Ligne corrompu : " + line);
							}
							break;
							
						default:
							System.out.println("Ligne corrompu : " + line);
					}
				}
				
				line = reader.readLine();
			}
			
			SaveConfig.overrideCustom();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
	
	public static void writeData(String name, Language lang) {
		Map<String, Map<String, String>> build = new HashMap<String, Map<String, String>>();
		
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		for(JPanel panel : pages) {
			if(panel instanceof PagePanel) {
				PagePanel page = (PagePanel) panel;
				build.put(page.getSaveName(), page.getConfig(lang));
			}
		}
		
		SaveConfig save = new SaveConfig(name, lang, build);
		SaveConfig.data.add(save);
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(SAVE_FOLDER_NAME + File.separator + name + EXTENSION, false), "UTF-8"));
		) {
			writer.append(name + "/" + lang.name() + "\n");
			
			for(String pageName : build.keySet()) {
				writer.append(pageName + "\n");
				
				for(String selectorName : build.get(pageName).keySet()) {
					writer.append("\t" + selectorName + "=" + build.get(pageName).get(selectorName) + "\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
	
	public static SaveConfig getSave(String name) {
		for(SaveConfig save : SaveConfig.data) {
			if(name.equals(save.getName())) {
				return save;
			}
		}
		
		return null;
	}
	
	public static SaveConfig[] getData() {
		SaveConfig[] result = new SaveConfig[SaveConfig.data.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = SaveConfig.data.get(i);
		}
		
		return result;
	}
	
	public static void deleteData(SaveConfig delete) {
		SaveConfig.data.remove(delete);
		
		File remove = new File(SAVE_FOLDER_NAME + File.separator + delete.getName() + EXTENSION);
		
		if(remove.exists()) {
			remove.delete();
		}
	}
	
	public static boolean fileExist() {
		File file = new File(SAVE_FOLDER_NAME + File.separator + Overlay.getInstance().getCurrentName() + EXTENSION);
		return file.exists();
	}
	
	public static void overrideCustom() {
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(SAVE_FOLDER_NAME + File.separator + CUSTOM_FILENAME, false), "UTF-8"));
		) {
			for(Weapon weapon : Weapon.getCustomData()) {
				writer.append("Weapon::" + weapon.getName(Language.FR) + "::" + weapon.getQuality() + "::" + weapon.getSignature() + "\n");
			}
			
			for(Armor armor : Armor.getCustomData()) {
				writer.append("Armor::" + armor.getName(Language.FR) + "::" + armor.getQuality() + "::" + armor.getSignature() + "\n");
			}
			
			for(Cape cape : Cape.getCustomData()) {
				writer.append("Cape::" + cape.getName(Language.FR) + "::" + cape.getQuality() + "::" + cape.getSignature() + "\n");
			}
			
			for(Ring ring : Ring.getCustomData()) {
				writer.append("Ring::" + ring.getName(Language.FR) + "::" + ring.getQuality() + "::" + ring.getSignature() + "\n");
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
}
