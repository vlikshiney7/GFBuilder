package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.TypeEffect;

public class Base {
	
	private static TypeEffect[] effect = { TypeEffect.FCE, TypeEffect.VIT, TypeEffect.INT, TypeEffect.VOL, TypeEffect.AGI };
	private static int[][][] data = new int[5][12][100];
	static {
		loadData();
	}
	
	public static void loadData() {
		try(
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Base.class.getResourceAsStream(Tools.RESOURCE + "base.txt"), "UTF-8"));
		) {
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 12; j++) {
					String line = reader.readLine();
					
					String[] lineSplit = line.split("/");
					for(int k = 0; k < lineSplit.length; k++) {
						Base.data[i][j][k] = Integer.parseInt(lineSplit[k]);
					}
				}
				
				reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Base.class.getClass().getSimpleName() + " class");
		}
	}

	public static int getBase(int id, GradeName grade, int lvl) {
		return Base.data[id][grade.index][lvl-1];
	}
	
	public static TypeEffect getEffect(int id) {
		return Base.effect[id];
	}
}
