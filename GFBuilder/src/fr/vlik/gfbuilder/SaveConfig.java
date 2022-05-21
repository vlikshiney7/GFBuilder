package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.vlik.gfbuilder.frame.FrameError;
import fr.vlik.gfbuilder.page.PartialPage;
import fr.vlik.grandfantasia.customequip.CustomArmor;
import fr.vlik.grandfantasia.customequip.CustomCape;
import fr.vlik.grandfantasia.customequip.CustomRing;
import fr.vlik.grandfantasia.customequip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.uidesign.JCustomPanel;

public class SaveConfig {
	
	private static final String SAVE_FOLDER_NAME = "GFBuilderSave";
	private static final String EXTENSION = ".gfb";
	private static final String CUSTOM_FILENAME = "CustomEquipmentCreation.gfbc";
	public static final String DEFAULT_NAME = "New build *";
	
	private static ArrayList<SaveConfig> data;
	static {
		logger = Logger.getLogger(SaveConfig.class.getSimpleName());
		loadData();
	}
	
	private String filename;
	private String buildname;
	private Language lang;
	private Map<String, Map<String, String>> values = new LinkedHashMap<>();
	private int[][] indexSelector;
	
	private static Logger logger;
	
	public SaveConfig(String name, int[][] tabConfig) {
		this.filename = name.replace(" ", "_");
		this.buildname = name.replace("_", " ");
		this.indexSelector = tabConfig;
	}
	
	public SaveConfig(String name, Language lang, Map<String, Map<String, String>> values) {
		this.filename = name.replace(" ", "_");
		this.buildname = name.replace("_", " ");
		this.lang = lang;
		this.values = values;
	}
	
	public String getFileName() {
		return this.filename;
	}
	
	public String getBuildName() {
		return this.buildname;
	}
	
	public Map<String, String> getValuesFromPage(String page) {
		return this.values.get(page);
	}
	
	public int[][] getIndexSelector() {
		return this.indexSelector;
	}
	
	public void applyConfig() {
		List<JCustomPanel> pages = MainFrame.getInstance().getPages();
		MainFrame.getInstance().allowUpdateStat(false);
		
		int[] orderLoading = { 0, 6, 7, 8, 1, 2, 3, 4, 5, 9, 10, 11 };
		
		for(int i = 0; i < orderLoading.length; i++) {
			if(pages.get(orderLoading[i]) instanceof PartialPage) {
				PartialPage page = (PartialPage) pages.get(orderLoading[i]);
				try {
					Map<String, String> pageValues = this.getValuesFromPage(page.getSaveName());
					if(pageValues != null) {
						page.setConfig(pageValues, this.lang);
					}
				} catch (IllegalArgumentException e) {
					logger.log(Level.SEVERE, "Out of range on page : {0}", page.getSaveName());
				}
			}
		}
		
		MainFrame.getInstance().allowUpdateStat(true);
		Overlay.getInstance().setNameSave(this.buildname);
		Overlay.getInstance().setSave(true);
	}
	
	public void overrideConfig() {
		List<JCustomPanel> pages = MainFrame.getInstance().getPages();
		
		this.values.clear();
		
		for(JCustomPanel panel : pages) {
			if(panel instanceof PartialPage) {
				PartialPage page = (PartialPage) panel;
				this.values.put(page.getSaveName(), page.getConfig(lang));
			}
		}
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(SAVE_FOLDER_NAME + File.separator + this.filename + EXTENSION, false), StandardCharsets.UTF_8));
		) {
			writer.append(this.buildname + "/" + this.lang.name() + "\n");
			
			for(Entry<String, Map<String, String>> entry : this.values.entrySet()) {
				String key = entry.getKey();
				Map<String, String> value = entry.getValue();
				
				writer.append(key + "\n");
				
				for(Entry<String, String> innerEntry : value.entrySet()) {
					writer.append("\t" + innerEntry.getKey() + "=" + innerEntry.getValue() + "\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error override config");
		}
	}
	
	private static void loadData() {
		SaveConfig.data = new ArrayList<>();
		
		File folder = new File(SAVE_FOLDER_NAME);
		
		if(!folder.exists()) {
			logger.log(Level.WARNING, "Le dossier de sauvegarde n''existe pas, création...");
			if(folder.mkdir()) {
				logger.log(Level.INFO, "Création terminée");
			} else {
				logger.log(Level.SEVERE, "Création impossible, droit d''administration nécessaire.");
				FrameError.getInstance().popup();
				return;
			}
		}
		
		for(File file : folder.listFiles()) {
			if(file.getName().matches(".* .*")) {
				File rename = new File(SAVE_FOLDER_NAME + File.separator + file.getName().replace(" ", "_"));
				
				if(!rename.exists()) {
					if(file.renameTo(rename)) {
						logger.log(Level.INFO, "Renommage du fichier {0} réussi.", file.getName());
						file = rename;
					} else {
						logger.log(Level.SEVERE, "Renommage impossible du fichier {0}, droit d''administration nécessaire.", file.getName());
					}
				} else {
					logger.log(Level.WARNING, "Renommage du fichier {0} impossible, renommage existant.", file.getName());
				}
			}
			
			if(file.getName().endsWith(EXTENSION)) {
				try (
					BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
				) {
					Map<String, Map<String, String>> build = new LinkedHashMap<>();
					
					String[] header = reader.readLine().split("/");
					String line = reader.readLine();
					
					String page = line;
					
					while(line != null) {
						if(line.startsWith("\t")) {
							String[] element = line.trim().split("=");
							build.get(page).put(element[0], element.length != 1 ? element[1] : "");
						} else {
							page = line;
							build.put(page, new LinkedHashMap<>());
						}
						
						line = reader.readLine();
					}
					
					SaveConfig.data.add(new SaveConfig(header[0], Language.valueOf(header[1]), build));
				} catch (IOException e) {
					logger.log(Level.SEVERE, "Error on loading save data");
				}
			}
		}
		
		if(SaveConfig.data.isEmpty()) {
			Overlay.getInstance().setNameSave(DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
		}
		
		String line = "";
		String corrompu = "Ligne corrompu : {0}";
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(SAVE_FOLDER_NAME + File.separator + CUSTOM_FILENAME), StandardCharsets.UTF_8));
		) {
			line = reader.readLine();
			
			while(line != null) {
				
				String[] lineSplit = line.split("::");
				
				Quality quality = Quality.valueOf(lineSplit[2]);
				
				if(lineSplit.length == 4 && quality != null) {
					switch (lineSplit[0]) {
						case "Weapon":
							if(!CustomWeapon.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								logger.log(Level.WARNING, corrompu, line);
							}
							break;
						case "Armor":
							if(!CustomArmor.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								logger.log(Level.WARNING, corrompu, line);
							}
							break;
						case "Cape":
							if(!CustomCape.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								logger.log(Level.WARNING, corrompu, line);
							}
							break;
						case "Ring":
							if(!CustomRing.constructCustom(lineSplit[1], quality, lineSplit[3])) {
								logger.log(Level.WARNING, corrompu, line);
							}
							break;
							
						default:
							logger.log(Level.WARNING, corrompu, line);
					}
				}
				
				line = reader.readLine();
			}
			
			SaveConfig.overrideCustom();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error loading custom equipment");
		} catch (Exception e) {
			logger.log(Level.WARNING, corrompu, line);
		}
	}
	
	public static void writeData(String name, Language lang) {
		Map<String, Map<String, String>> build = new LinkedHashMap<>();
		
		List<JCustomPanel> pages = MainFrame.getInstance().getPages();
		
		for(JCustomPanel panel : pages) {
			if(panel instanceof PartialPage) {
				PartialPage page = (PartialPage) panel;
				build.put(page.getSaveName(), page.getConfig(lang));
			}
		}
		
		SaveConfig save = new SaveConfig(name, lang, build);
		SaveConfig.data.add(save);
		
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(SAVE_FOLDER_NAME + File.separator + name + EXTENSION, false), StandardCharsets.UTF_8));
		) {
			writer.append(name.replace("_", " ") + "/" + lang.name() + "\n");
			
			for(Entry<String, Map<String, String>> entry : build.entrySet()) {
				String key = entry.getKey();
				Map<String, String> value = entry.getValue();
				
				writer.append(key + "\n");
				
				for(Entry<String, String> innerEntry : value.entrySet()) {
					writer.append("\t" + innerEntry.getKey() + "=" + innerEntry.getValue() + "\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error write data");
		}
	}
	
	public static SaveConfig getSave(String name) {
		for(SaveConfig save : SaveConfig.data) {
			if(name.equals(save.getFileName())) {
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
	
	public static boolean deleteData(SaveConfig delete) {
		SaveConfig.data.remove(delete);
		
		File remove = new File(SAVE_FOLDER_NAME + File.separator + delete.getFileName() + EXTENSION);
		
		if(remove.exists()) {
			return remove.delete();
		}
		
		return false;
	}
	
	public static boolean fileExist() {
		File file = new File(SAVE_FOLDER_NAME + File.separator + Overlay.getInstance().getCurrentName().replace(" ", "_") + EXTENSION);
		return file.exists();
	}
	
	public static void overrideCustom() {
		try (
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(SAVE_FOLDER_NAME + File.separator + CUSTOM_FILENAME, false), StandardCharsets.UTF_8));
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
			logger.log(Level.SEVERE, "Error override custom equipment");
		}
	}
}
