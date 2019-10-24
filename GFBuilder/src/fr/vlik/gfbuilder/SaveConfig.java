package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.gfbuilder.page.PagePanel;
import fr.vlik.uidesign.JCustomButton;

public class SaveConfig extends JCustomButton {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_FILE_NAME = "save1.0.gfb";
	private static ArrayList<SaveConfig> data;
	static {
		loadData();
	}
	
	private String name;
	private int[][] indexSelector;
	
	public SaveConfig(String name, int[][] tabConfig) {
		this.name = name;
		this.indexSelector = tabConfig;
		
		this.addActionListener(e -> {
			
		});
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[][] getIndexSelector() {
		return this.indexSelector;
	}

	public void applyConfig() {
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		for(int i = 0; i < this.indexSelector.length; i++) {
			if(pages.get(i) instanceof PagePanel) {
				try {
					((PagePanel) pages.get(i)).setConfig(this.indexSelector[i]);
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
		
		for(int i = 0; i < this.indexSelector.length; i++) {
			if(pages.get(i) instanceof PagePanel) {
				this.indexSelector[i] = ((PagePanel) pages.get(i)).getConfig();
			}
		}
		
		writeAllData();
	}
	
	private static void loadData() {
		SaveConfig.data = new ArrayList<SaveConfig>();
		
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
		}
	}
	
	public static SaveConfig writeDefaultData() {
		int[][] config = new int[12][];
		int[] nbCase = new int[] { 58, 81, 18, 11, 26, 32, 20, 3, 3, 12, 2 };
		
		config[0] = new int[] { 0, 1, 0, 0, 0, 0 };
		
		for(int i = 1; i < config.length; i++) {
			config[i] = new int[nbCase[i-1]];
		}
		
		Overlay.getInstance().setCurrentName("Novice");
		return new SaveConfig("Novice", config);
	}
	
	public static void writeData(String name) {
		int[][] config = new int[12][];
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		for(int i = 0; i < config.length; i++) {
			if(pages.get(i) instanceof PagePanel) {
				config[i] = ((PagePanel) pages.get(i)).getConfig();
			}
		}
		
		SaveConfig.data.add(new SaveConfig(name, config));
	}
	
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
		
	}
	
	public static void setDefault() {
		PageOption.getInstance().setSave("Novice");
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
	}
}
