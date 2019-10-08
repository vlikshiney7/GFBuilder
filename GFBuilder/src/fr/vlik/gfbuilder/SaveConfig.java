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

public class SaveConfig {
	
	public static SaveConfig[] data;
	public static String CURRENT_SAVE;
	static {
		loadData();
	}
	
	private String name;
	private int[][] indexSelector;
	
	public SaveConfig(String name, int[][] tabConfig) {
		this.name = name;
		this.indexSelector = tabConfig;
	}
	
	public String getName() {
		return this.name;
	}

	public void setConfig() {
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
	}
	
	private static void loadData() {
		ArrayList<SaveConfig> list = new ArrayList<SaveConfig>();
		
		try (
			BufferedReader reader = new BufferedReader(new FileReader("save.gfb"));
		) {
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
				
				list.add(new SaveConfig(save, config));
			}
		} catch (IOException e) {
			writeDefaultData();
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
		
		SaveConfig.data = new SaveConfig[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static void writeDefaultData() {
		int[][] config = new int[11][];
		int[] nbCase = new int[] { 58, 81, 18, 11, 26, 32, 20, 3, 3, 12, 2 };
		
		try (
			BufferedWriter writer = new BufferedWriter(new FileWriter("save.gfb", true));
		) {
			writer.append("Novice\n");
			writer.append("0/1/0/0/0/0/\n");
			
			for(int i = 0; i < config.length; i++) {
				for(int j = 0; j < nbCase[i]; j++) {
					writer.append("0/");
				}
				
				writer.append("\n");
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
	
	public static void writeData(String name) {
		int[][] config = new int[12][];
		ArrayList<JPanel> pages = MainFrame.getInstance().getPages();
		
		for(int i = 0; i < config.length; i++) {
			if(pages.get(i) instanceof PagePanel) {
				config[i] = ((PagePanel) pages.get(i)).getConfig();
			}
		}
		
		try (
			BufferedWriter writer = new BufferedWriter(new FileWriter("save.gfb", true));
		) {
			writer.append(name + "\n");
			
			for(int i = 0; i < config.length; i++) {
				for(int j = 0; j < config[i].length; j++) {
					writer.append(config[i][j] + "/");
				}
				
				writer.append("\n");
			}
			
			writer.flush();
		} catch (IOException e) {
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
		
		loadData();
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
}
