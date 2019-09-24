package fr.vlik.grandfantasia;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;

public class Nucleus {
	
	private static Nucleus[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int quality;
	private BufferedImage icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Nucleus(String name, int quality, String iconPath, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.icon = setIcon(iconPath, this.quality);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getQuality() {
		return this.quality;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality];
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
	
	private BufferedImage setIcon(String path, int quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/32-" + quality + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/nucleus/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
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
		ArrayList<ArrayList<Nucleus>> list = new ArrayList<ArrayList<Nucleus>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/nucleus/nucleus.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while(line != null) {
				int numLine = Integer.parseInt(line);
				ArrayList<Nucleus> array = new ArrayList<Nucleus>(numLine);
				for(int j = 0; j < numLine; j++) {
					line = reader.readLine();
					
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1] + ".png";
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
					for(int k = 0; k < Integer.parseInt(lineSplit[2]); k++)
						effects.add(new Effect(lineSplit[k+3]));
					
					array.add(new Nucleus(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
				}
				list.add(array);
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Nucleus.class.getClass().getSimpleName() + " class");
		}
		
		Nucleus.data = new Nucleus[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Nucleus[] nucleus = new Nucleus[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				nucleus[j] = list.get(i).get(j);				
			}
			Nucleus.data[i] = nucleus;
		}
	}
	
	public static Nucleus[] getData(ArrayList<String> stoneName) {
		ArrayList<Nucleus> result = new ArrayList<Nucleus>();
		
		Nucleus[] getter = Nucleus.data[6];
		
		for(int i = 0; i < getter.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < stoneName.size(); j++) {
				if(stoneName.get(j).equals(getter[i].getName())) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(getter[i]);
			}
		}
		
		Nucleus[] cast = new Nucleus[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static Nucleus[] getData(int idList) {
		return Nucleus.data[idList];
	}
}
