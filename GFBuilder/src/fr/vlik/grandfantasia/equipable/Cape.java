package fr.vlik.grandfantasia.equipable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class Cape extends Equipment {
	
	public static String PATH = Tools.RESOURCE + "capering/" + Cape.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Cape[] data;
	static {
		loadData();
	}

	private String setCode;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Cape(Cape cape) {
		super(cape.getMap(), cape.getGrades(), cape.getLvl(), cape.getQuality(), cape.isEnchantable(), cape.getEffects(), cape.getBonusXP());
		
		this.setCode = cape.getSetCode();
		this.icon = cape.getIcon();
	}
	
	public Cape(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean canEnchant, String setCode, String path, ArrayList<Calculable> effects, ArrayList<Calculable> bonusXP) {
		super(name, grades, lvl, quality, canEnchant, effects, bonusXP);
		
		this.setCode = setCode;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Cape(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean canEnchant, String setCode, String path, MultiEffect effects, ArrayList<Calculable> bonusXP) {
		super(name, grades, lvl, quality, canEnchant, new ArrayList<Calculable>(), bonusXP);
		
		this.setCode = setCode;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public MultiEffect getMultiEffect() {
		return this.isMultiEffect ? new MultiEffect(this.multiEffects.getCode(), this.multiEffects.getLvlMin(), this.multiEffects.getEffects()) : null;
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public ArrayList<Calculable> getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Cape.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Cape.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public void addEnchant(Enchantment enchant) {
		if(enchant == null) {
			return;
		}
		
		if(!this.enchantable) {
			return;
		}
		
		if(enchant.isFixValue()) {
			for(Effect e : enchant.getEffects()) {
				this.effects.add(e);
			}
		} else {
			for(Effect e : enchant.getEffects()) {
				int value = Enchantment.getValue(this, e.getType());
				boolean found = false;
				
				for(Calculable calculable : this.effects) {
					if(calculable instanceof Effect) {
						Effect get = (Effect) calculable;
						
						if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
							get.addEnchantValue(value);
							
							found = true;
							break;
						}
					}
				}
				
				if(!found) {
					e.addEnchantValue(value);
					this.effects.add(e);
				}
			}
		}
	}
	
	public static void loadData() {
		ArrayList<Cape> list = new ArrayList<Cape>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					Cape.class.getResourceAsStream(PATH + "cape.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1];
				
				String classes[] = lineSplit[1].split(",");
				GradeName[] grades = new GradeName[classes.length];
				for(int j = 0; j < classes.length; j++) {
					grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
				}
				
				Map<Language, String> names = new HashMap<Language, String>();
				names.put(Language.FR, lineSplit[0]);
				
				Quality quality = Quality.values()[Integer.parseInt(lineSplit[4])];
				
				String[] effectSplit = lineSplit[6].split(",");
				
				ArrayList<Calculable> bonusXP = new ArrayList<Calculable>(Integer.parseInt(effectSplit[2]));
				for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
					bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
				
				if(Integer.parseInt(effectSplit[0]) > -1) {
					ArrayList<Calculable> effects = new ArrayList<Calculable>(Integer.parseInt(effectSplit[0]));
					for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
						effects.add(new Effect(lineSplit[j+7]));
					
					Cape cape = new Cape(
							names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]),
							lineSplit[3], path, effects, bonusXP
							);
					
					list.add(cape);
				} else {
					MultiEffect effects = MultiEffect.getFromCode(lineSplit[7]);
					
					Cape cape = new Cape(
							names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]),
							lineSplit[3], path, effects, bonusXP
							);
					
					list.add(cape);
				}
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Cape.class.getClass().getSimpleName() + " class");
		}
		
		Cape.data = new Cape[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Cape get(String name, Language lang) {
		for(Cape cape : Cape.data) {
			if(cape.getName(lang).equals(name)) {
				return cape;
			}
		}
		
		return null;
	}
	
	public static Cape[] getPossibleCape(GradeName grade, int lvl) {
		ArrayList<Cape> result = new ArrayList<Cape>();
		
		for(Cape cape : Cape.data) {
			if(cape.getLvl() <= lvl && cape.containGrade(grade)) {
				if(cape.isMultiEffect()) {
					cape.setEffects(lvl);
				}
				result.add(cape);
			}
		}
		
		Cape[] cast = new Cape[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
