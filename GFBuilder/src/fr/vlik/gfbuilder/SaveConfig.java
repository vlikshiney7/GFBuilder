package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.page.PagePanel;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.JCustomButton;

public class SaveConfig extends JCustomButton {
	
	private static final long serialVersionUID = 1L;
	//private static final String SAVE_FILE_NAME = "save1.1.gfb";
	private static final String SAVE_FOLDER_NAME = "GFBuilderSave";
	private static final String EXTENSION = ".gfb";
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
					page.setConfig(this.getValuesFromPage(page.getSaveName()), this.lang);
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
			BufferedWriter writer = new BufferedWriter(new FileWriter(SAVE_FOLDER_NAME + File.separator + this.name + EXTENSION, false));
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
			try (
				BufferedReader reader = new BufferedReader(new FileReader(file));
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
		
		if(SaveConfig.data.isEmpty()) {
			Overlay.getInstance().setCurrentName("New build");
			Overlay.getInstance().setSave(false);
		}
		
		/*
		try (
			BufferedReader reader = new BufferedReader(new FileReader(SAVE_FILE_NAME));
		) {
			Overlay.getInstance().setCurrentName(reader.readLine());;
			String line = reader.readLine();
			
			while (line != null) {
				String save = line;
				int[][] config = new int[12][];
				
				for(int i = 0; i < 12; i++) {
					line = reader.readLine();
					String[] lineSplit = line.split("/");
					
					int[] page = new int[lineSplit.length];
					for(int j = 0; j < page.length; j++) {
						page[j] = Integer.parseInt(lineSplit[j]);
					}
					
					config[i] = page;
				}
				line = reader.readLine();
				
				data.add(new SaveConfig(save, config));
			}
		} catch (IOException e) {
			data.add(writeDefaultData());
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}*/
	}
	/*
	public static SaveConfig writeDefaultData() {
		int[][] config = new int[12][];
		int[] nbCase = new int[] { 58, 81, 18, 11, 26, 32, 20, 3, 3, 12, 3 };
		
		config[0] = new int[] { 0, 1, 0, 0, 0, 0 };
		
		for(int i = 1; i < config.length; i++) {
			config[i] = new int[nbCase[i-1]];
		}
		
		Overlay.getInstance().setCurrentName("Novice");
		return new SaveConfig("Novice", config);
	}*/
	
	public static void writeData(String name, Language lang) {
		Map<String, Map<String, String>> build = new HashMap<String, Map<String, String>>();
		
		//int[][] config = new int[12][];
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		/*for(int i = 0; i < config.length; i++) {
			if(pages.get(i) instanceof PagePanel) {
				config[i] = ((PagePanel) pages.get(i)).getConfig();
			}
		}*/
		
		for(JPanel panel : pages) {
			if(panel instanceof PagePanel) {
				PagePanel page = (PagePanel) panel;
				build.put(page.getSaveName(), page.getConfig(lang));
			}
		}
		
		SaveConfig save = new SaveConfig(name, lang, build);
		SaveConfig.data.add(save);
		
		try (
			BufferedWriter writer = new BufferedWriter(new FileWriter(SAVE_FOLDER_NAME + File.separator + name + EXTENSION, false));
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
	/*
	public static void writeAllData() {
		try (
			BufferedWriter writer = new BufferedWriter(new FileWriter(SAVE_FILE_NAME, false));
		) {
			writer.append(Overlay.getInstance().getCurrentName() + "\n");
			
			
			for(SaveConfig save : SaveConfig.data) {
				
				writer.append(save.getName() + "\n");
				
				int[][] index = save.getIndexSelector();
				
				for(int i = 0; i < index.length; i++) {
					for(int j = 0; j < index[i].length; j++) {
						writer.append(index[i][j] + "/");
					}
					
					writer.append("\n");
				}
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
		
	}*/
	/*
	public static void setDefault() {
		PageOption.getInstance().setSave("Novice");
	}*/
	
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
}
