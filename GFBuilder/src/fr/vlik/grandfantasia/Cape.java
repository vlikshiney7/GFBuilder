package fr.vlik.grandfantasia;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Quality;
import fr.vlik.grandfantasia.Grade.GradeName;

public final class Cape extends Equipment {
	
	private static Cape[] data;

	private String setCode;
	
	public Cape(Cape cape) {
		super(cape.getName(), cape.getGrades(), cape.getLvl(), cape.getQuality(), cape.isEnchantable(), cape.getEffects(), cape.getBonusXP());
		
		this.setCode = cape.getSetCode();
		this.img = cape.getIcon();
	}
	
	public Cape(String name, GradeName[] grades, int lvl, Quality quality, boolean canEnchant, String setCode, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, grades, lvl, quality, canEnchant, effects, bonusXP);
		
		this.setCode = setCode;
		this.img = setIcon(iconPath, quality);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	protected BufferedImage setIcon(String path, Quality quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/32-" + quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/capering/cape/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) return;
		for(Effect e : enchant.getEffects()) {
			int ordinal = e.getType().ordinal();
			if(ordinal < 5) {
				if(this.quality == Quality.GOLD) {
					boolean found = false;
					for(Effect get : this.effects) {
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(((this.lvl-1)/10 +1) * 2);
							found = true;
							break;
						}
					}
					if(!found) {
						e.addEnchantValue(((this.lvl-1)/10 +1) * 2);
						this.effects.add(e);
					}
				}
			} else {
				this.effects.add(e);
			}
		}
	}
	
	public static void loadData() {
		ArrayList<Cape> list = new ArrayList<Cape>();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/capering/cape/cape.txt")));
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				String classes[] = lineSplit[1].split(",");
				GradeName[] grades = new GradeName[classes.length];
				for(int j = 0; j < classes.length; j++) {
					grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
				}
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[4])];
				
				String[] effectSplit = lineSplit[6].split(",");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
				for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
					effects.add(new Effect(lineSplit[j+7]));
				
				ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
				for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
					bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
				
				
				Cape cape = new Cape(
						lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]),
						lineSplit[3], path, effects, bonusXP
						);
				list.add(cape);
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error with " + Class.class.getName() + " class");
		}
		
		Cape.data = new Cape[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Cape[] getPossibleCape(GradeName grade, int lvl) {
		ArrayList<Cape> result = new ArrayList<Cape>();
		
		for(Cape cape : Cape.data) {
			if(cape.getLvl() <= lvl && cape.containGrade(grade)) {
				result.add(cape);
			}
		}
		
		Cape[] cast = new Cape[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
