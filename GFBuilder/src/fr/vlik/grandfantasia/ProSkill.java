package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Grade.GradeName;

public class ProSkill {
	
	private static ProSkill[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private BufferedImage img;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public ProSkill(String name, int lvl, String iconPath, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		this.img = setIcon(iconPath);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public BufferedImage getIcon() {
		return this.img;
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
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/pro/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public String getTooltip(int i) {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<ProSkill>> list = new ArrayList<ArrayList<ProSkill>>();
		 try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/pro/pro.txt"), "UTF-8"));
			String line = reader.readLine();
			
			for(int i = 0; i < 12; i++) {
				ArrayList<ProSkill> skills = new ArrayList<ProSkill>(9);
				for(int j = 0; j < 9; j++) {
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1] + ".png";
					
					String[] effectSplit = lineSplit[2].split(",");
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
					for(int k = 0; k < Integer.parseInt(effectSplit[0]); k++)
						effects.add(new Effect(lineSplit[k+3]));
					
					skills.add(new ProSkill(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
					
					line = reader.readLine();
				}
				
				list.add(skills);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + ProSkill.class.getClass().getSimpleName() + " class");
		}
		
		ProSkill.data = new ProSkill[list.size()][];
		for(int i = 0; i < data.length; i++) {
			ProSkill[] proSkill = new ProSkill[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				proSkill[j] = list.get(i).get(j);				
			}
			ProSkill.data[i] = proSkill;
		}
	}
	
	public static ProSkill[] getPossibleProSkill(GradeName grade, int lvl) {
		ArrayList<ProSkill> result = new ArrayList<ProSkill>();
		
		for(ProSkill proSkill : ProSkill.data[grade.index]) {
			if(proSkill.getLvl() <= lvl) {
				result.add(proSkill);
			}
		}
		
		ProSkill[] cast = new ProSkill[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
