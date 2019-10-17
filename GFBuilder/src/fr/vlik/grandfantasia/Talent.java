package fr.vlik.grandfantasia;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;

public final class Talent implements Writable {
	
	public static String PATH = Tools.RESOURCE + Talent.class.getSimpleName().toLowerCase() + "/";
	private static Talent[][] data;
	static {
		loadData();
	}
	
	private String name;
	private int[] lvl;
	private BufferedImage img;
	private ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>();
	
	public Talent() {
		this.name = "";
		this.lvl =  new int[] { 0 };
		this.img = setIcon("null.png");
		this.effects.add(new ArrayList<Effect>());
	}
	
	public Talent(String name, int[] lvl, String iconPath, ArrayList<ArrayList<Effect>> effects) {
		this.name = name;
		this.lvl = lvl;
		this.img = setIcon(iconPath);
		this.effects = effects;
	}
	
	public Talent(Talent talent, int index) {
		this.name = talent.getName();
		this.lvl = new int[] { talent.getLvl()[index] };
		this.effects.add(talent.getEffects(index));
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
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
	
	public BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(Talent.class.getResource(PATH + path));
		} catch (IOException e) {
			System.out.println("Image non chargée : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl[0];
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
		ArrayList<ArrayList<Talent>> list = new ArrayList<ArrayList<Talent>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Talent.class.getResourceAsStream(PATH + "talent.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			for(int i = 0; i < 12; i++) {
				list.add(new ArrayList<Talent>());
				for(int j = 0; j < 24; j++) {
					String[] lineSplit = line.split("/");
					String[] strTalent = lineSplit[1].split(",");
					String path =  lineSplit[lineSplit.length-1] + ".png";
					
					int[] lvlTalent = new int[strTalent.length];
					for(int k = 0; k < lvlTalent.length; k++) {
						lvlTalent[k] = Integer.parseInt(strTalent[k]);
					}
					
					ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(lvlTalent.length);
					for(int k = 0; k < lvlTalent.length; k++) {
						ArrayList<Effect> simpleTalent = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
						for(int l = 0; l < Integer.parseInt(lineSplit[2]); l++) {
							simpleTalent.add(new Effect(lineSplit[l+k*Integer.parseInt(lineSplit[2])+3]));
						}
						effects.add(simpleTalent);
					}
					
					list.get(i).add(new Talent(lineSplit[0], lvlTalent, path, effects));
					
					line = reader.readLine();
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Talent.class.getClass().getSimpleName() + " class");
		}
		
		Talent.data = new Talent[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Talent[] talent = new Talent[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				talent[j] = list.get(i).get(j);				
			}
			Talent.data[i] = talent;
		}
	}
	
	public static ArrayList<ArrayList<Talent>> getPossibleTalent(GradeName grade, int lvl) {
		ArrayList<ArrayList<Talent>> result = new ArrayList<ArrayList<Talent>>();
		for(int i = 0; i < 24; i++) {
			result.add(new ArrayList<Talent>());
			Talent currentTalent = Talent.data[grade.index][i];
			for(int j = 0; j < currentTalent.getLvl().length; j++) {
				if(currentTalent.getLvl()[j] <= lvl) {
					result.get(i).add(new Talent(currentTalent, j));
				} else {
					break;
				}
			}
		}
		
		return result;
	}
	
	public static Talent[][] getData() {
		return Talent.data;
	}
}
