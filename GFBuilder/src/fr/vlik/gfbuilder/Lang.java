package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.JCustomLabel;

public class Lang {
	
	private static JCustomLabel[] dataPane;
	private static JCustomLabel[][] dataLabel;
	
	//private static String[][][] dataLabel;
	//private static String[][] dataPane;
	private static String[][] dataCredit;
	static {
		loadData();
	}
	
	public static void loadData() {
		ArrayList<ArrayList<ArrayList<String>>> list = new ArrayList<ArrayList<ArrayList<String>>>();
		
		ArrayList<ArrayList<JCustomLabel>> list2 = new ArrayList<ArrayList<JCustomLabel>>();
		
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
				list2.add(new ArrayList<JCustomLabel>());
				
				String[] lineSplit = line.split("/");
				
				for(int i = 0; i < lineSplit.length; i++) {
					Map<Language, String> lang = new HashMap<Language, String>();
					String[] trad = lineSplit[i].split(",");

					lang.put(Language.FR, trad[0]);
					lang.put(Language.EN, trad[1]);
					
					list.get(0).get(lineCount).add(trad[0]);
					list.get(1).get(lineCount).add(trad[1]);
					
					list2.get(lineCount).add(new JCustomLabel(lang));
				}
				lineCount++;
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Lang.class.getClass().getSimpleName() + " class, File trad.txt");
		}
		
		ArrayList<ArrayList<String>> credit = new ArrayList<ArrayList<String>>();
		
		try(
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/credit.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			for(int i = 0; i < 2; i++) {
				credit.add(new ArrayList<String>());
				while(!line.equals("/")) {
					credit.get(i).add(line);
					line = reader.readLine();
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Lang.class.getClass().getSimpleName() + " class, File credit.txt");
		}
		
		Lang.dataLabel = new JCustomLabel[list2.size()-1][];
		Lang.dataPane = new JCustomLabel[list2.get(0).size()];
		Lang.dataCredit = new String[credit.size()][credit.get(0).size()];
		
		for(int i = 0; i < list2.size(); i++) {
			if(i == 0) {
				for(int j = 0; j < list2.get(i).size(); j++) {
					Lang.dataPane[j] = list2.get(i).get(j);
				}
			} else {
				JCustomLabel[] pageOrFrame = new JCustomLabel[list2.get(i).size()];
				for(int j = 0; j < list2.get(i).size(); j++) {
					pageOrFrame[j] = list2.get(i).get(j);
				}
				
				Lang.dataLabel[i-1] = pageOrFrame;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < credit.get(i).size(); j++) {
				Lang.dataCredit[i][j] = credit.get(i).get(j);
			}
		}
	}
	
	public static JCustomLabel[] getDataLabel(int page) {
		return Lang.dataLabel[page];
	}
	
	public static JCustomLabel[] getDataPane() {
		return Lang.dataPane;
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
