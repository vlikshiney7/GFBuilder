package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.interfaces.Iconable;

public class Energy implements Iconable {
	
	public static String PATH = Tools.RESOURCE + Energy.class.getSimpleName().toLowerCase() + "/";
	private static Energy[] data;
	static {
		loadData();
	}
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>(2);
	private Icon icon;
	
	public Energy (String name, String iconPath, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
		setIcon(iconPath);
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public void setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Energy.class.getResource(PATH + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Effect multiplyEffect(Effect effect, int point) {
		return new Effect(effect.getType(), effect.isPercent(), effect.getValue() * point, effect.getWithReinca(), effect.getWithWeapon(), null);
	}
	
	public static void loadData() {
		ArrayList<Energy> list = new ArrayList<Energy>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Energy.class.getResourceAsStream(PATH + "energy.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				list.add(new Energy(lineSplit[0], path, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Energy.class.getClass().getSimpleName() + " class");
		}
		
		Energy.data = new Energy[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Energy[] getData() {
		return Energy.data;
	}
}
