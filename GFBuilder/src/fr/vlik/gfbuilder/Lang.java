package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lang {
	
	private static String[][][] dataLabel;
	private static String[][] dataPane;
	private static String[][] dataCredit;
	static {
		loadData();
	}
	
	public static enum Language {
		FR(0), EN(1);
		
		public final int index;
		 
	    private Language(int index) {
	        this.index = index;
	    }
	}
	
	public static void loadData() {
		ArrayList<ArrayList<ArrayList<String>>> list = new ArrayList<ArrayList<ArrayList<String>>>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/trad.txt"), "UTF-8"));
			String line = reader.readLine();
			list.add(new ArrayList<ArrayList<String>>());
			list.add(new ArrayList<ArrayList<String>>());
			int lineCount = 0;
			while(line != null) {
				list.get(0).add(new ArrayList<String>());
				list.get(1).add(new ArrayList<String>());
				String[] lineSplit = line.split("/");
				for(int i = 0; i < lineSplit.length; i++) {
					String[] language = lineSplit[i].split(",");
					list.get(0).get(lineCount).add(language[0]);
					list.get(1).get(lineCount).add(language[1]);
				}
				lineCount++;
				line = reader.readLine();
			}
			reader.close();
			
			reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/credit.txt"), "UTF-8"));
			line = reader.readLine();
			
			for(int i = 0; i < 2; i++) {
				list.get(i).add(new ArrayList<String>());
				while(!line.equals("/")) {
					list.get(i).get(list.get(i).size()-1).add(line);
					line = reader.readLine();
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Lang.class.getClass().getSimpleName() + " class");
		}
		
		Lang.dataLabel = new String[list.size()][][];
		Lang.dataPane = new String[list.size()][];
		Lang.dataCredit = new String[list.size()][];
		for(int i = 0; i < 	Lang.dataLabel.length; i++) {
			Lang.dataLabel[i] = new String[list.get(i).size()-2][];
			for(int j = 0; j < list.get(i).size(); j++) {
				String[] page = new String[list.get(i).get(j).size()];
				for(int k = 0; k < list.get(i).get(j).size(); k++) {
					page[k] = list.get(i).get(j).get(k);
				}
				if(j == 0) {
					Lang.dataPane[i] = page;
				} else if(j == list.get(i).size()-1) {
					Lang.dataCredit[i] = page;
				} else {					
					Lang.dataLabel[i][j-1] = page;
				}
			}
		}
	}
	
	public static String[] getDataLabel(Language lang, int page) {
		return Lang.dataLabel[lang.index][page];
	}
	
	public static String[] getDataPane(Language lang) {
		return Lang.dataPane[lang.index];
	}
	
	public static String getDataCredit(Language lang) {
		StringBuilder str = new StringBuilder();
		for(String s : Lang.dataCredit[lang.index]) {
			str.append(s);
			str.append("\n");
		}
		
		return str.toString();
	}
}
