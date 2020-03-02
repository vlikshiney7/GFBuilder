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
import fr.vlik.grandfantasia.Fortification;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Loader;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.MultiEffect;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Armor extends Equipment {
	
	public static String PATH = Tools.RESOURCE + Armor.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static Armor[][] data;
	static {
		Armor.data = Loader.getArmor();
		loadData();
	}
	
	private ArmorType type;
	private String setCode;
	private boolean reinca;
	private boolean isMultiEffect;
	private MultiEffect multiEffects;
	
	public Armor(Armor armor) {
		super(armor.getMap(), armor.getGrades(), armor.getLvl(), armor.getQuality(), armor.isEnchantable(), armor.getEffects(), armor.getBonusXP());
		
		this.type = armor.getType();
		this.setCode = armor.getSetCode();
		this.reinca = armor.isReinca();
		this.isMultiEffect = armor.isMultiEffect();
		this.multiEffects = armor.getMultiEffect();
		this.icon = armor.getIcon();
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, ArrayList<Calculable> effects, ArrayList<Calculable> bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = false;
		this.icon = setIcon(path);
	}
	
	public Armor(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, boolean reinca, ArmorType type, String setCode, String path, MultiEffect effects, ArrayList<Calculable> bonusXP) {
		super(name, grades, lvl, quality, enchantable, new ArrayList<Calculable>(), bonusXP);
		
		this.type = type;
		this.setCode = setCode;
		this.reinca = reinca;
		this.isMultiEffect = true;
		this.multiEffects = effects;
		this.icon = setIcon(path);
	}
	
	public static enum ArmorType {
		CASQUE(0, "casque", "helmet"),
		PLASTRON(1, "plastron", "breastplate"),
		JAMBIERE(2, "jambière", "legging"),
		GANT(3, "gantelet", "gauntlet"),
		BOTTE(4, "botte", "boot");
		
		public final int index;
		public final String fr;
		public final String en;
		 
	    private ArmorType(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public ArmorType getType() {
		return this.type;
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
		ImageIcon back = new ImageIcon(Weapon.class.getResource(Tools.PATH32 + this.quality.index + ".png"));
		ImageIcon object = ICONS.get(path);
		
		if(path == null) {
			path = "null";
		}
		
		if(object == null) {
			try {
				object = new ImageIcon(Weapon.class.getResource(PATH + path + Tools.PNG));
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

	public void addFortif(Fortification fortif) {
		for(Calculable calculable : this.effects) {
			if(calculable instanceof Effect) {
				Effect effect = (Effect) calculable;
				
				if(effect.isPercent()) {
					continue;
				}
				
				if(!effect.getWithReinca()) {
					continue;
				}
				
				if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
					continue;
				}
				
				effect.addFortifValue(fortif.getCoef());
			}
		}
	}
	
	public String toCode(String path) {
		String code = "new Weapon(new HashMap<Language, String>() {{ ";
		code += "put(Language.FR, \"" + this.name.get(Language.FR) + "\"); }},\n";
		
		code += "new GradeName[] { ";
		for(GradeName grade : this.grades) {
			code += "GradeName." + grade + ", ";
		}
		code += "},\n";
		
		code += this.lvl +", ";
		code += "Quality." + this.quality + ", ";
		code += this.enchantable + ", ";
		code += "WeaponType." + this.type + ", ";
		//code += this.uniqueEquip + ", ";
		code += this.reinca + ", ";
		code += "\"" + path + "\", ";
		code += "new ArrayList<Calculable>() {{\n";
		
		for(Calculable c : this.effects) {
			if(c instanceof Effect) {
				Effect e = (Effect) c;
				code += "\tadd(new Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
				
				if(e.getTransfert() != null) {
					code += ", " + e.getWithReinca();
					code += ", WeaponType." + e.getWithWeapon();
					code += ", TypeEffect." + e.getTransfert();
					continue;
				}
				
				if(e.getWithWeapon() != WeaponType.NONE) {
					code += ", " + e.getWithReinca();
					code += ", WeaponType." + e.getWithWeapon();
					continue;
				}
				
				if(e.getWithReinca()) {
					code += ", " + e.getWithReinca();
				}
				
				code += "));\n";
			} else if(c instanceof StaticEffect) {
				StaticEffect s = (StaticEffect) c;
				
				code += "\tadd(new StaticEffect(TypeStaticEffect." + s.getType() + ", " + s.getTaux() + "));\n";
			} else if(c instanceof Proc) {
				Proc p = (Proc) c;
				
				code += "add(new Proc(" + p.getTaux() + ", Activation." + p.getActivation() + ", " + p.getTime();
				if(p.getCumul() <= 1) {
					code += ", " + p.getCumul();
				}
				code += ", new ArrayList<Calculable>() {{";
				
				for(Calculable in : p.getEffects()) {
					if(in instanceof Effect) {
						Effect e = (Effect) in;
						code += "\tadd(new Effect(TypeEffect." + e.getType() + ", " + e.isPercent() + ", " + e.getValue();
						
						if(e.getTransfert() != null) {
							code += ", " + e.getWithReinca();
							code += ", WeaponType." + e.getWithWeapon();
							code += ", TypeEffect." + e.getTransfert();
							continue;
						}
						
						if(e.getWithWeapon() != WeaponType.NONE) {
							code += ", " + e.getWithReinca();
							code += ", WeaponType." + e.getWithWeapon();
							continue;
						}
						
						if(!e.getWithReinca()) {
							code += ", " + e.getWithReinca();
						}
						
						code += "));\n";
					} else if(in instanceof StaticEffect) {
						StaticEffect s = (StaticEffect) in;
						
						code += "\tadd(new StaticEffect(TypeStaticEffect." + s.getType() + ", " + s.getTaux() + "));\n";
					}
				}
				
				code += "}}));";
			}
		}
		
		code += "}}, new ArrayList<Effect>() ),";
		
		code = code.replace(".0)", ")");
		
		return code;
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
					String path =  armorFile[i] + "/" + lineSplit[lineSplit.length-1];
					
					String classes[] = lineSplit[1].split(",");
					GradeName[] grades = new GradeName[classes.length];
					for(int j = 0; j < classes.length; j++) {
						grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
					}
					
					Map<Language, String> names = new HashMap<Language, String>();
					names.put(Language.FR, lineSplit[0]);
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[4])];
					
					String[] effectSplit = lineSplit[7].split(",");
					
					ArrayList<Calculable> bonusXP = new ArrayList<Calculable>(Integer.parseInt(effectSplit[2]));
					for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
						bonusXP.add(new Effect(lineSplit[j+8+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
					
					if(quality == Quality.RED) {
						ArrayList<Calculable> effects = new ArrayList<Calculable>(Integer.parseInt(effectSplit[0]));
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
								decal++;
							}
							
							starEffects.add(oneStarEffects);
						}
						
						RedArmor red = new RedArmor(
								names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
								ArmorType.values()[i], lineSplit[3], path, effects, bonusXP,
								starEffects
								);
						
						list.get(i).add(red);
						
					} else {
						assert lineSplit.length == Math.abs(Integer.parseInt(effectSplit[0])) + Integer.parseInt(effectSplit[1]) + Integer.parseInt(effectSplit[2]) + 9
								: armorFile[i] + " line " + (list.get(i).size() + 1);
						
						if(Integer.parseInt(effectSplit[0]) > -1) {
							ArrayList<Calculable> effects = new ArrayList<Calculable>(Integer.parseInt(effectSplit[0]));
							for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
								effects.add(new Effect(lineSplit[j+8]));
							
							Armor armor = new Armor(
									names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
									ArmorType.values()[i], lineSplit[3], path, effects, bonusXP
									);
							list.get(i).add(armor);
						} else {
							MultiEffect effects = MultiEffect.getFromCode(lineSplit[8]);
							
							Armor armor = new Armor(
									names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]),
									ArmorType.values()[i], lineSplit[3], path, effects, bonusXP
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
		
		Armor[][] cast = new Armor[list.size()][];
		for(int i = 0; i < cast.length; i++) {
			Armor[] armorPiece = new Armor[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				armorPiece[j] = list.get(i).get(j);				
			}
			cast[i] = armorPiece;
		}
		
		Armor[][] fusion = new Armor[data.length][];
		for(int i = 0; i < fusion.length; i++) {
			Armor[] w = new Armor[data[i].length + cast[i].length];
			
			int j = 0;
			for(; j < data[i].length; j++) {
				w[j] = data[i][j];
			}
			
			for(; j < data[i].length + cast[i].length; j++) {
				w[j] = cast[i][j-data[i].length];
			}
			
			fusion[i] = w;
		}
		
		Armor.data = fusion;
	}
	
	public static Armor get(String name, Language lang, int list) {
		for(Armor armor : Armor.data[list]) {
			if(armor.getName(lang).equals(name)) {
				return armor;
			}
		}
		
		return null;
	}
	
	public static Armor[] getPossibleArmor(int idList, Grade grade, int lvl, Reinca reinca) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		
		for(Armor armor : Armor.data[idList]) {
			if(armor.getLvl() <= lvl && armor.containGrade(grade.getGrade())) {
				if(!armor.isReinca()) {
					if(armor.isMultiEffect()) {
						armor.setEffects(lvl);
					}
					result.add(armor);
				} else {
					if(reinca.getLvl() > 0) {
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
