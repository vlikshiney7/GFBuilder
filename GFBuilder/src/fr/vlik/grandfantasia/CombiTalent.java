package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Grade.GradeName;

public final class CombiTalent {
	
	private static CombiTalent[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int[] code;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public CombiTalent() {
		this.name = "";
	}
	
	public CombiTalent(String name, int[] code, ArrayList<Effect> effects) {
		this.name = name;
		this.code = code;
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getCode() {
		return this.code;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<CombiTalent>> list = new ArrayList<ArrayList<CombiTalent>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/combi.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				int num = Integer.parseInt(line);
				ArrayList<CombiTalent> currentList = new ArrayList<CombiTalent>(num);
				for(int i = 0; i < num; i++) {
					line = reader.readLine();
					String[] lineSplit = line.split("/");
					String code[] = lineSplit[1].split(",");
					int codeSplit[] = new int[code.length];
					for(int c = 0; c < code.length; c++) codeSplit[c] = Integer.parseInt(code[c]);
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
					for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
						effects.add(new Effect(lineSplit[j+3]));
					
					currentList.add(new CombiTalent(lineSplit[0], codeSplit, effects));
				}
				list.add(currentList);
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + CombiTalent.class.getClass().getSimpleName() + " class");
		}
		
		CombiTalent.data = new CombiTalent[list.size()][];
		for(int i = 0; i < data.length; i++) {
			CombiTalent[] weaponType = new CombiTalent[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				weaponType[j] = list.get(i).get(j);				
			}
			CombiTalent.data[i] = weaponType;
		}
	}
	
	public static CombiTalent getCombiTalent(GradeName grade, int[] code) {
		CombiTalent result = new CombiTalent();
		for(CombiTalent combi : CombiTalent.data[grade.index]) {
			boolean verif = true;
			for(int i = 0; i < combi.getCode().length; i++) {
				if(combi.getCode()[i] != code[i]) {
					verif = !verif;
					break;
				}
			}
			
			if(verif) {
				result = combi;
				break;
			}
		}
		
		return result;
	}
}
