package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Effect;

public class Skill implements Iconable, Writable {
	
	public static String PATH = Tools.RESOURCE + Skill.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static Skill[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int[] lvl;
	private boolean natif;
	private Icon icon;
	private Effect[][] effects;
	
	public Skill(String name, int[] lvl, boolean natif, String path, Effect[][] effects) {
		this.name = name;
		this.lvl = lvl;
		this.natif = natif;
		this.icon = setIcon(path);
		this.effects = effects;
	}
	
	public Skill(String name) {
		this.name = name;
		this.lvl = new int[] { 0 };
		this.natif = false;
		this.icon = setIcon("32-7");
	}
	
	public Skill(Skill skill, int index) {
		this.name = skill.getName() + " " + (index+1);
		this.lvl = new int[] { skill.getLvl()[index] };
		this.natif = skill.getNatif();
		this.icon = skill.getIcon();
		this.effects = new Effect[1][];
		this.effects[0] = skill.getEffects(index);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public boolean getNatif() {
		return this.natif;
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	public Effect[] getEffects(int i) {
		if(this.effects == null || this.effects[i] == null) {
			return null;
		}
		
		Effect[] tab = new Effect[this.effects[i].length];
		for(int j = 0; j < tab.length; j++) {
			tab[j] = new Effect(this.effects[i][j]);
		}
		
		return tab;
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Skill.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl[0] + " - " + this.name;
	}
	
	@Override
	public String getTooltip() {
		return getTooltip(0);
	}
	
	public String getTooltip(int i) {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		if(this.effects != null && this.effects[i] != null) {
			for(Effect e : this.effects[i]) {
				tooltip.append("<br>");
				tooltip.append(e.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<Skill>> list = new ArrayList<ArrayList<Skill>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Skill.class.getResourceAsStream(PATH + "skill.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			
			for(int i = 0; i < 13; i++) {
				list.add(new ArrayList<Skill>());
			}
			for(ArrayList<Skill> skill : list) {
				int lineSplitInfo = Integer.parseInt(line);
				line = reader.readLine();
				for(int i = 0; i < lineSplitInfo; i++) {
					String[] lineSplit = line.split("/");
					String path =  lineSplit[lineSplit.length-1];
					String[] lvlSkill = lineSplit[2].split(",");
					int[] lvl = new int[lvlSkill.length];
					
					Effect[][] effects = new Effect[lvlSkill.length][];
					for(int j = 0; j < lvlSkill.length; j++) {
						int nbEffect = Integer.parseInt(lineSplit[3]);
						effects[j] = new Effect[nbEffect];
						lvl[j] = Integer.parseInt(lvlSkill[j]);
						for(int k = 0; k < nbEffect; k++) {
							effects[j][k] = new Effect(lineSplit[j*nbEffect+k+4]);
						}
					}
					
					skill.add(new Skill(lineSplit[0], lvl, Boolean.parseBoolean(lineSplit[1]), path, effects));
					
					line = reader.readLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error with " + Skill.class.getClass().getSimpleName() + " class");
		}
		
		Skill.data = new Skill[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Skill[] skill = new Skill[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				skill[j] = list.get(i).get(j);				
			}
			Skill.data[i] = skill;
		}
	}
	
	public static Skill[][] getData() {
		return Skill.data;
	}
}
