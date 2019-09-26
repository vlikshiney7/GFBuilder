package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.equipment.Weapon.WeaponType;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JStarCheckBox;

public class Genki {
	
	private static Genki[][] data;
	static {
		loadData();
	}
	
	private String name;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	private Quality quality;
	private int star;
	
	public Genki() {
		this.name = "Rien";
		this.quality = Quality.GREY;
		this.star = 0;
	}
	
	public Genki(String name, Quality quality, int star, String[] effects) {
		this.name = name;
		this.star = star;
		this.quality = quality;
		
		for(int i = 0; i < effects.length; i++) {
			this.effects.add(new Effect(effects[i]));
		}
	}
	
	public Genki(Genki genki) {
		this.name = genki.getName();
		this.quality = genki.getQuality();
		this.star = genki.getStar();
		
		for(int i = 0; i < genki.getEffects().size(); i++) {
			this.effects.add(new Effect(genki.getEffects().get(i)));
		}
	}
	
	public String getName() {
		return this.name;
	}

	public Quality getQuality() {
		return this.quality;
	}

	public int getStar() {
		return this.star;
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public Color getColor() {
		return Consts.itemColor[this.quality.index];
	}

	public void addStarBonus(ArrayList<JStarCheckBox> star, int idList) {
		int nbStar = 0;
		while(nbStar < 5) {
			if(!star.get(nbStar).isSelected()) break;
			nbStar++;
		}
		
		if(nbStar == 3 || nbStar == 4) {
			this.effects.add(new Effect(TypeEffect.Depla, false, 10 / (idList+1), false, WeaponType.NONE, null));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 4 / (idList+1), false, WeaponType.NONE, null));
			}
		} else if(nbStar == 5) {
			this.effects.add(new Effect(TypeEffect.Depla, false, 20 / (idList+1), false, WeaponType.NONE, null));
			for(int i = 0; i < 5; i++) {
				this.effects.add(new Effect(TypeEffect.values()[i], true, 8 / (idList+1), false, WeaponType.NONE, null));
			}
		}
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
		ArrayList<ArrayList<Genki>> list = new ArrayList<ArrayList<Genki>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Genki.class.getResourceAsStream(Consts.RESOURCE + "genki.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			for(int i = 0; i < 5; i++) list.add(new ArrayList<Genki>());
			while (line != null) {
				String[] lineInfoSplit = line.split("/");
				for(int i = 0; i < Integer.parseInt(lineInfoSplit[2]); i++) {
					line = reader.readLine();
					String[] lineSplit = line.split("/");
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[0])];
					
					String[] effects = new String[Integer.parseInt(lineSplit[1])];
					for(int j = 0; j < effects.length; j++) effects[j] = lineSplit[j+2];
					
					Genki genki = new Genki(lineInfoSplit[0], quality, Integer.parseInt(lineInfoSplit[1]), effects);
					list.get(Integer.parseInt(lineSplit[0])-1).add(genki);
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Genki.class.getClass().getSimpleName() + " class");
		}
		
		Genki.data = new Genki[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Genki[] qualityGenki = new Genki[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				qualityGenki[j] = list.get(i).get(j);				
			}
			Genki.data[i] = qualityGenki;
		}
	}
	
	public static Genki[] getPossibleGenki(ArrayList<JCustomRadioButton> quality, int star) {
		ArrayList<Genki> result = new ArrayList<Genki>();
		
		for(int i = 0; i < quality.size(); i++) {
			if(quality.get(i).isSelected()) {
				if(i == 0) {
					return null;
				}
				
				for(int j = 0; j < Genki.data[i-1].length; j++) {
					if(Genki.data[i-1][j].getStar() == star) {
						result.add(Genki.data[i-1][j]);
					}
				}
				
				break;
			}
		}
		
		Genki[] cast = new Genki[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
