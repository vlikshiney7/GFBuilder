package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JLangLabel;

public class Lang {
	
	private static JLangLabel[] dataPane;
	private static JLangLabel[][] dataLabel;
	private static String[][] dataCredit;
	static {
		loadData();
	}
	
	private Lang() {}
	
	public static void loadData() {
		ArrayList<ArrayList<JLangLabel>> list = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/trad.txt"), StandardCharsets.UTF_8));
			String line = reader.readLine();
			
			int lineCount = 0;
			while(line != null) {
				list.add(new ArrayList<>());
				
				String[] lineSplit = line.split("/");
				
				for(int i = 0; i < lineSplit.length; i++) {
					Map<Language, String> lang = new EnumMap<>(Language.class);
					String[] trad = lineSplit[i].split(",");
					
					if(trad.length == 2) {
						lang.put(Language.FR, trad[0]);
						lang.put(Language.EN, trad[1]);
					}
					
					list.get(lineCount).add(new JLangLabel(lang, Design.TEXT));
				}
				lineCount++;
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Lang.class.getClass().getSimpleName() + " class, File trad.txt");
		}
		
		ArrayList<ArrayList<String>> credit = new ArrayList<>();
		
		try(
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/credit.txt"), StandardCharsets.UTF_8));
		) {
			String line = reader.readLine();
			
			for(int i = 0; i < 2; i++) {
				credit.add(new ArrayList<>());
				while(!line.equals("/")) {
					credit.get(i).add(line);
					line = reader.readLine();
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Lang.class.getClass().getSimpleName() + " class, File credit.txt");
		}
		
		Lang.dataLabel = new JLangLabel[list.size()-1][];
		Lang.dataPane = new JLangLabel[list.get(0).size()];
		Lang.dataCredit = new String[credit.size()][credit.get(0).size()];
		
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				for(int j = 0; j < list.get(i).size(); j++) {
					Lang.dataPane[j] = list.get(i).get(j);
				}
			} else {
				JLangLabel[] pageOrFrame = new JLangLabel[list.get(i).size()];
				for(int j = 0; j < list.get(i).size(); j++) {
					pageOrFrame[j] = list.get(i).get(j);
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
	
	public static JLangLabel[] getDataLabel(int page) {
		return Lang.dataLabel[page];
	}
	
	public static JLangLabel[] getDataPane() {
		return Lang.dataPane;
	}
	
	public static String getDataCredit(Language lang) {
		StringBuilder str = new StringBuilder();
		for(String s : Lang.dataCredit[lang.ordinal()]) {
			str.append(s);
			str.append("\n");
		}
		
		return str.toString();
	}
}
