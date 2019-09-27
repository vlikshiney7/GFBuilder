package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class Skill implements Iconable, Writable {
	
	public static String PATH = Consts.RESOURCE + Skill.class.getSimpleName().toLowerCase() + "/";
	private static Skill[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int[] lvl;
	private boolean natif;
	private BufferedImage img;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public Skill(String name, int[] lvl, boolean natif, String iconPath, ArrayList<ArrayList<Effect>> effects) {
		this.name = name;
		this.lvl = lvl;
		this.natif = natif;
		this.img = setIcon(iconPath);
		this.effects = effects;
	}
	
	public Skill(String name) {
		this.name = name;
		this.lvl = new int[] { 0 };
		this.natif = false;
		this.img = setIcon("32-7.png");
		this.effects.add(new ArrayList<Effect>(1));
	}
	
	public Skill(Skill skill, int index) {
		this.name = skill.getName() + " " + (index+1);
		this.lvl = new int[] { skill.getLvl()[index] };
		this.natif = skill.getNatif();
		this.img = skill.getIcon();
		this.effects.add(skill.getEffects(index));
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
	public BufferedImage getIcon() {
		return this.img;
	}
	
	public ArrayList<Effect> getEffects(int i) {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.get(i).size());
		for(Effect effect : this.effects.get(i)) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	@Override
	public BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(Skill.class.getResource(PATH + path));
		} catch (IOException e) {
			System.out.println("Image non chargée : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
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
		for(Effect e : this.effects.get(i)) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
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
					String path =  lineSplit[lineSplit.length-1] + ".png";
					String[] lvlSkill = lineSplit[2].split(",");
					int[] lvl = new int[lvlSkill.length];
					
					ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(lvlSkill.length);
					for(int j = 0; j < lvlSkill.length; j++) {
						int nbEffect = Integer.parseInt(lineSplit[3]);
						effects.add(new ArrayList<Effect>(nbEffect));
						lvl[j] = Integer.parseInt(lvlSkill[j]);
						for(int k = 0; k < nbEffect; k++) {
							effects.get(j).add(new Effect(lineSplit[j*nbEffect+k+4]));
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
