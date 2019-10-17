package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.enums.TypeEffect;

public class XpStuff {
	
	private static XpStuff[][] dataWeapon;
	private static XpStuff[][] dataArmor;
	private static XpStuff[][] dataCapeRing;
	private static XpStuff[] dataMount;
	static {
		loadData();
	}
	
	private TypeEffect type;
	private ArrayList<Double> lvlValues = new ArrayList<Double>();
	
	public XpStuff(String type, double[] values) {
		this.type = TypeEffect.valueOf(type);
		
		for(int i = 0; i < values.length; i++) {
			this.lvlValues.add(values[i]);
		}
	}
	
	public TypeEffect getType() {
		return this.type;
	}
	
	public ArrayList<Double> getLvlValue() {
		return this.lvlValues;
	}
	
	public double getValueFromLvl(int index) {
		return this.lvlValues.get(index);
	}
	
	public static void loadData() {
		ArrayList<ArrayList<ArrayList<XpStuff>>> list = new ArrayList<ArrayList<ArrayList<XpStuff>>>();
		int[] size = new int[] { 16, 5, 2, 1 };
		int[] nbEffect = new int[] { 5, 5, 5, 14 };
		String[] filesName = new String[] { "weapon/xp", "armor/xp", "capering/xp", "xpride" };
		
		for(int i = 0; i < size.length; i++) {
			list.add(new ArrayList<ArrayList<XpStuff>>());
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						XpStuff.class.getResourceAsStream(Tools.RESOURCE + filesName[i] + ".txt"), "UTF-8"));
			) {
				String line = reader.readLine();
				for(int j = 0; j < size[i]; j++) {
					list.get(i).add(new ArrayList<XpStuff>());
					for(int k = 0; k < nbEffect[i]; k++) {
						String[] lineSplit = line.split("/");
						double[] values = new double[Integer.parseInt(lineSplit[1])];
						for(int l = 0; l < values.length; l++) values[l] = Double.parseDouble(lineSplit[l+2]);
						
						list.get(i).get(j).add(new XpStuff(lineSplit[0], values));
						
						line = reader.readLine();
					}
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error with " + XpStuff.class.getClass().getSimpleName() + " class");
			}
		}
		
		XpStuff.dataWeapon = new XpStuff[list.get(0).size()][];
		for(int i = 0; i < dataWeapon.length; i++) {
			XpStuff[] xpStuff = new XpStuff[list.get(0).get(i).size()];
			for(int j = 0; j < list.get(0).get(i).size(); j++) {
				xpStuff[j] = list.get(0).get(i).get(j);				
			}
			XpStuff.dataWeapon[i] = xpStuff;
		}
		
		XpStuff.dataArmor = new XpStuff[list.get(1).size()][];
		for(int i = 0; i < dataArmor.length; i++) {
			XpStuff[] xpStuff = new XpStuff[list.get(1).get(i).size()];
			for(int j = 0; j < list.get(1).get(i).size(); j++) {
				xpStuff[j] = list.get(1).get(i).get(j);				
			}
			XpStuff.dataArmor[i] = xpStuff;
		}
		
		XpStuff.dataCapeRing = new XpStuff[list.get(2).size()][];
		for(int i = 0; i < dataCapeRing.length; i++) {
			XpStuff[] xpStuff = new XpStuff[list.get(2).get(i).size()];
			for(int j = 0; j < list.get(2).get(i).size(); j++) {
				xpStuff[j] = list.get(2).get(i).get(j);				
			}
			XpStuff.dataCapeRing[i] = xpStuff;
		}
		
		XpStuff.dataMount = new XpStuff[list.get(3).get(0).size()];
		for(int i = 0; i < dataMount.length; i++) {
			dataMount[i] = list.get(3).get(0).get(i);
		}
	}
	
	public static XpStuff[][] getDataWeapon() {
		return XpStuff.dataWeapon;
	}
	
	public static XpStuff[][] getDataArmor() {
		return XpStuff.dataArmor;
	}
	
	public static XpStuff[][] getDataCapeRing() {
		return XpStuff.dataCapeRing;
	}
	
	public static XpStuff[] getDataMount() {
		return XpStuff.dataMount;
	}
}
