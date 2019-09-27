package fr.vlik.grandfantasia.equipment;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.grandfantasia.Consts;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.RedArmor;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Quality;

public class Armor extends Equipment {
	
	public static String PATH = Consts.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	public static Armor[][] data;
	static {
		loadData();
	}
	
	private String setCode;
	private boolean reinca;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Armor(Armor armor) {
		super(armor.getName(), armor.getGrades(), armor.getLvl(), armor.getQuality(), armor.isEnchantable(), armor.getEffects(), armor.getBonusXP());
		
		this.setCode = armor.getSetCode();
		this.reinca = armor.isReinca();
		this.isMultiEffect = armor.isMultiEffect();
		this.multiEffects = armor.getMultiEffect();
		this.img = armor.getIcon();
	}
	
	public Armor(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, String setCode, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = false;
		this.img = setIcon(iconPath);
	}
	
	public Armor(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, String setCode, String iconPath, MultiEffect effects, ArrayList<Effect> bonusXP) {
		super(name, grades, lvl, quality, enchantable, new ArrayList<Effect>(), bonusXP);
		
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.img = setIcon(iconPath);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public boolean isMultiEffect() {
		return this.isMultiEffect;
	}
	
	public MultiEffect getMultiEffect() {
		if(this.multiEffects == null) return null;
		else return new MultiEffect(this.multiEffects.getCode(), this.multiEffects.getLvlMin(), this.multiEffects.getEffects());
	}
	
	public void setEffects(int lvl) {
		this.effects = this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	public ArrayList<Effect> getMultiEffects(int lvl) {
		return this.multiEffects.getEffectsFromLvl(lvl);
	}
	
	@Override
	public BufferedImage setIcon(String path) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(Armor.class.getResource(Consts.PATH32 + this.quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(Armor.class.getResource(PATH + path));
		} catch (IOException e) {
			System.out.println("Image non chargée : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
	public void addEnchant(Enchantment enchant, int idArmor) {
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
				int value = Enchantment.getValue(this, e.getType(), idArmor);
				boolean found = false;
				
				for(Effect get : this.effects) {
					if(e.getType().equals(get.getType()) && !get.isPercent() && get.getWithReinca()) {
						get.addEnchantValue(value);
						
						found = true;
						break;
					}
				}
				
				if(!found) {
					e.addEnchantValue(value);
					this.effects.add(e);
				}
			}
		}
	}

	public void addFortif(int value) {
		double coefFortif = Consts.coefFortif[value];
		
		for(Effect effect : this.effects) {
			if(effect.isPercent()) {
				continue;
			}
			
			if(!effect.getWithReinca()) {
				continue;
			}
			
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
				continue;
			}
			
			effect.addFortifValue(coefFortif);
		}
	}
	
	public static void loadData() {
		String[] armorFile = { "casques", "torses", "pantalons", "gants", "bottes" };
		
		ArrayList<ArrayList<Armor>> list = new ArrayList<ArrayList<Armor>>();
		
		for(int i = 0; i < armorFile.length; i++) {
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						Armor.class.getResourceAsStream(PATH + armorFile[i] + "/" + armorFile[i] + ".txt"), "UTF-8"));
			) {
				list.add(new ArrayList<Armor>());
				String line = reader.readLine();
				while (line != null) {
					String[] lineSplit = line.split("/");
					String path =  armorFile[i] + "/" + lineSplit[lineSplit.length-1] + ".png";
					
					String classes[] = lineSplit[1].split(",");
					GradeName[] grades = new GradeName[classes.length];
					for(int j = 0; j < classes.length; j++) {
						grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
					}
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[4])];
					
					String[] effectSplit = lineSplit[7].split(",");
					
					ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
					for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
						bonusXP.add(new Effect(lineSplit[j+8+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
					
					if(quality == Quality.RED) {
						ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
						for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
							effects.add(new Effect(lineSplit[j+8]));
						
						int indexToStar = 8 + Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])+Integer.parseInt(effectSplit[2]);
						String[] starEffectSplit = lineSplit[indexToStar].split(",");
						
						ArrayList<ArrayList<Effect>> starEffects = new ArrayList<ArrayList<Effect>>();
						int decal = 0;
						
						for(int j = 0; j < starEffectSplit.length; j++) {
							ArrayList<Effect> oneStarEffects = new ArrayList<Effect>();
							for(int k = 0; k < Integer.parseInt(starEffectSplit[j]); k++) {
								oneStarEffects.add(new Effect(lineSplit[indexToStar+2+decal]));
							}
							
							decal += Integer.parseInt(starEffectSplit[j]);
							starEffects.add(oneStarEffects);
						}
						
						RedArmor red = new RedArmor(
								lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
								lineSplit[3], path, effects, bonusXP,
								starEffects
								);
						
						list.get(i+1).add(red);
						
					} else {
						assert lineSplit.length == Math.abs(Integer.parseInt(effectSplit[0])) + Integer.parseInt(effectSplit[1]) + Integer.parseInt(effectSplit[2]) + 9
								: armorFile[i] + " line " + (list.get(i+1).size() + 1);
						
						if(Integer.parseInt(effectSplit[0]) > -1) {
							ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
							for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
								effects.add(new Effect(lineSplit[j+8]));
							
							Armor armor = new Armor(
									lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
									lineSplit[3], path, effects, bonusXP
									);
							list.get(i).add(armor);
						} else {
							MultiEffect effects = MultiEffect.getFromCode(lineSplit[8]);
							
							Armor armor = new Armor(
									lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
									lineSplit[3], path, effects, bonusXP
									);
							list.get(i).add(armor);
						}
					}
					
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error with " + Armor.class.getClass().getSimpleName() + " class");
			}
		}
		
		Armor.data = new Armor[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Armor[] armorPiece = new Armor[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				armorPiece[j] = list.get(i).get(j);				
			}
			Armor.data[i] = armorPiece;
		}
	}
	
	public static Armor[] getPossibleArmor(int idList, GradeName grade, int lvl, boolean reinca) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		
		for(Armor armor : Armor.data[idList]) {
			if(armor.getLvl() <= lvl && armor.containGrade(grade)) {
				if(!armor.isReinca()) {
					if(armor.isMultiEffect()) {
						armor.setEffects(lvl);
					}
					result.add(armor);
				} else {
					if(reinca) {
						if(armor.isMultiEffect()) {
							armor.setEffects(lvl);
						}
						result.add(armor);
					}
				}
			}
		}
		
		Armor[] cast = new Armor[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}