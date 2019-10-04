package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.page.PagePanel;

public class SaveConfig {
	
	private static final String PATH = "/fr/vlik/gfbuilder/";
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
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					SaveConfig.class.getResourceAsStream(PATH + "save.gfb"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			while (line != null) {
				String save = line;
				int[][] config = new int[12][];
				
				for(int i = 0; i < 12; i++) {
					System.out.println(line);
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
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
		
		SaveConfig.data = new SaveConfig[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
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
			BufferedWriter writer = new BufferedWriter(new FileWriter(SaveConfig.class.getClass().getResource(PATH + "save.gfb").getPath(), true));
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
			e.printStackTrace();
			System.out.println("Error with " + SaveConfig.class.getClass().getSimpleName() + " class");
		}
	}
	
	public static void setDefault() {
		setSave("Novice");
	}
	
	public static void setSave(String name) {
		boolean set = false;
		
		for(SaveConfig save : SaveConfig.data) {
			if(name.equals(save.getName())) {
				save.setConfig();
				set = true;
				System.out.println("Save " + save.getName() + " loaded");
				break;
			}
		}
		
		if(!set) {
			System.out.println("Erreur, save not found");
		}
	}
}
