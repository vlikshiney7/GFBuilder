package fr.vlik.grandfantasia.equipable;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Effect;

public class Costume implements Colorable, Writable {
	
	public static final String PATH = Tools.RESOURCE + Costume.class.getSimpleName().toLowerCase() + "/";
	public static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.GOLD };
	private static Costume[][] data;
	static {
		loadData();
	}
	
	private String name;
	private Quality quality;
	private CostType type;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Costume() {
		this.name = "Rien";
		this.quality = Quality.GREY;
	}
	
	public Costume(String name, Quality quality, CostType type, ArrayList<Effect> effects) {
		this.name = name;
		this.quality = quality;
		this.type = type;
		this.effects = effects;
	}
	
	public Costume(Costume cost) {
		this.name = cost.getName();
		this.quality = cost.getQuality();
		
		for(int i = 0; i < cost.getEffects().size(); i++) {
			this.effects.add(new Effect(cost.getEffects().get(i)));
		}
	}
	
	public static enum CostType {
		ALL(0), OFFENSIVE(1), DEFENSIVE(2);
		
		public final int type;
		 
	    private CostType(int type) {
	        this.type = type;
	    }
	}
	
	public String getName() {
		return this.name;
	}

	public Quality getQuality() {
		return this.quality;
	}
	
	public CostType getType() {
		return this.type;
	}
	
	@Override
	public Color getColor() {
		return Tools.itemColor[this.quality.index];
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		for(Effect e : this.effects) {
			tooltip.append("<br>");
			tooltip.append(e.getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<ArrayList<Costume>> list = new ArrayList<ArrayList<Costume>>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Costume.class.getResourceAsStream(PATH + "costume.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			for(int i = 0; i < 4; i++) list.add(new ArrayList<Costume>());
			while (line != null) {
				String[] lineInfoSplit = line.split("/");
				for(int i = 0; i < Integer.parseInt(lineInfoSplit[2]); i++) {
					line = reader.readLine();
					String[] lineSplit = line.split("/");
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[0])];
					CostType type = CostType.values()[Integer.parseInt(lineInfoSplit[1])];
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
					for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
						effects.add(new Effect(lineSplit[j+2]));
					
					Costume cost = new Costume(lineInfoSplit[0], quality, type, effects);
					list.get(4 - (Integer.parseInt(lineInfoSplit[2])-i)).add(cost);
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Costume.class.getClass().getSimpleName() + " class");
		}
		
		Costume.data = new Costume[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Costume[] costume = new Costume[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				costume[j] = list.get(i).get(j);				
			}
			Costume.data[i] = costume;
		}
	}
	
	public static Costume get(String name, int quality) {
		if(quality == 0) {
			return null;
		}
		
		for(Costume costume : Costume.data[quality-1]) {
			if(costume.getName().equals(name)) {
				return costume;
			}
		}
		
		return null;
	}
	
	public static Costume[] getPossibleCostume(Quality quality, CostType type) {
		if(quality == Quality.GREY) return null;
		
		ArrayList<Costume> result = new ArrayList<Costume>();
		if(quality == Quality.WHITE) result.add(new Costume());
		
		int index = -1;
		switch (quality.index) {
			case 1:	index = 0;	break;
			case 2:	index = 1;	break;
			case 3:	index = 2;	break;
			case 5:	index = 3;	break;
		}
		
		for(Costume cost : Costume.data[index]) {
			if(cost.getType() == CostType.ALL || cost.getType() == type) {
				result.add(cost);
			}
		}
		
		Costume[] cast = new Costume[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
