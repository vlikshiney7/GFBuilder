package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class ProSkill implements Iconable, Writable {
	
	private static ProSkill[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private Icon icon;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public ProSkill(String name, int lvl, String iconPath, ArrayList<Effect> effects) {
		this.name = name;
		this.lvl = lvl;
		setIcon(iconPath);
		this.effects = effects;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
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
	
	@Override
	public void setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(ProSkill.class.getResource(Tools.RESOURCE + "pro/" + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		return getTooltip(0);
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
		 try (
			 BufferedReader reader = new BufferedReader(new InputStreamReader(
					 ProSkill.class.getResourceAsStream(Tools.RESOURCE + "pro/pro.txt"), "UTF-8"));
		 ) {
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
	
	public static ProSkill get(String name) {
		for(ProSkill[] grade : ProSkill.data) {
			for(ProSkill proSkill : grade) {
				if(proSkill.getName().equals(name)) {
					return proSkill;
				}
			}
		}
		
		return null;
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
