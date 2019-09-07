package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;

public class Energy {
	
	private static Energy[] data;
	static {
		loadData();
	}
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>(2);
	private BufferedImage icon;
	
	public Energy (String name, String iconPath, ArrayList<Effect> effects) {
		this.name = name;
		this.effects = effects;
		this.icon = setIcon(iconPath);
	}
	
	public String getName() {
		return this.name;
	}
	
	public BufferedImage getIcon() {
		return this.icon;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/energy/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
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
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/energy/energy.txt")));
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
			reader.close();
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
