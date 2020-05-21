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
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.StaticEffect;

public class Weapon extends Equipment {
	
	public static String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	public static Weapon[][] data;
	static {
		Weapon.data = Loader.getWeapon();
		loadData();
	}
	
	protected WeaponType type;
	protected boolean uniqueEquip;
	protected boolean reinca;
	
	public Weapon() {
		super();
		
		this.type = WeaponType.NONE;
		this.uniqueEquip = false;
		this.reinca = false;
		this.icon = setIcon("null");
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getMap(), weapon.getGrades(), weapon.getLvl(), weapon.getQuality(), weapon.isEnchantable(), weapon.getEffects(), weapon.getBonusXP());
		
		this.type = weapon.getType();
		this.uniqueEquip = weapon.isUniqueEquip();
		this.reinca = weapon.isReinca();
		this.icon = weapon.getIcon();
		this.effects = weapon.getEffects();
	}
	
	public Weapon(Map<Language, String> name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String path, Calculable[] effects, Calculable[] bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.uniqueEquip = uniqueEquip;
		this.reinca = reinca;
		this.icon = setIcon(path);
	}
	
	public static enum WeaponType {
		EPEE1M(0, "une épée une main", ""), MARTEAU1M(1, "un marteau une main", ""), HACHE1M(2, "une hache une main", ""),
		EPEE2M(3, "une épée à deux mains", ""), MARTEAU2M(4, "un marteau à deux mains", ""), HACHE2M(5, "une hache à deux mains", ""),
		MECA1M(6, "une arme mécanique une main", ""), MECA2M(7, "une arme mécanique à deux mains", ""),
		ARC(8, "un arc", ""), GUN(9, "un pistolet", ""), CANON(10, "un canon", ""),
		RELIQUE(11, "une relique", ""), BATON(12, "un bâton", ""),
		LAME(13, "une lame", ""), CLE(14, "une clé", ""),
		BOUCLIER(15, "un bouclier", ""),
		DEFAULT(16, "un défaut", "default"),
		NONE(-1, "vide", "void");
		
		public final int index;
		public final String fr;
		public final String en;
		 
	    private WeaponType(int index, String fr, String en) {
	        this.index = index;
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public WeaponType getType() {
		return this.type;
	}
	
	public boolean isUniqueEquip() {
		return this.uniqueEquip;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Weapon.class.getResource(Tools.PATH32 + this.quality.index + Tools.PNG));
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
			Calculable[] newTab = new Calculable[this.effects.length + enchant.getEffects().size()];
			
			for(int i = 0; i < this.effects.length; i++) {
				newTab[i] = this.effects[i];
			}
			
			for(int i = 0; i < enchant.getEffects().size(); i++) {
				newTab[this.effects.length + i] = enchant.getEffects().get(i);
			}
			
			this.effects = newTab;
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
					
					Calculable[] newTab = new Calculable[this.effects.length + 1];
					
					for(int i = 0; i < this.effects.length; i++) {
						newTab[i] = this.effects[i];
					}
					
					newTab[this.effects.length] = e;
					
					this.effects = newTab;
				}
			}
		}
	}
	
	public void addFortif(Fortification fortif) {
		if(this.effects == null) {
			return;
		}
		
		for(Calculable calculable : this.effects) {
			if(calculable instanceof Effect) {
				Effect effect = (Effect) calculable;
				
				if(effect.isPercent()) {
					continue;
				}
				
				if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
					continue;
				}
				
				effect.addFortifValue(fortif.getCoef());
			}
		}
	}
	
	private void reduceEffect(TypeEffect type, double coef) {
		for(Calculable calculable : this.effects) {
			if(calculable instanceof Effect) {
				Effect effect = (Effect) calculable;
				if(!effect.isPercent() && effect.getType() == type) {
					effect.reduceCoef(coef);
				}
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
		code += this.uniqueEquip + ", ";
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
		
		code += "}}, new ArrayList<Calculable>() ),";
		
		code = code.replace(".0)", ")");
		code = code.replace(".0,", ",");
		
		return code;
	}
	
	public static void doubleWeapon(Weapon weap1, Weapon weap2) {
		TypeEffect[] atks = new TypeEffect[] { TypeEffect.Atk, TypeEffect.AtkD, TypeEffect.AtkM };
		
		for(TypeEffect type : atks) {
			weap1.reduceEffect(type, 0.75);
			weap2.reduceEffect(type, 0.75);
		}
	}

	public static void loadData() {
		String[] weaponFile = { "epee1M", "marteau1M", "hache1M", "epee2M", "marteau2M", "hache2M", "meca1M", "meca2M", "arc", "gun", "canon", "relique", "baton", "lame", "cle", "bouclier", "default" };
		
		int toCode = 0;
		
		ArrayList<ArrayList<Weapon>> list = new ArrayList<ArrayList<Weapon>>();
		
		for(int i = 0; i < weaponFile.length; i++) {
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						Weapon.class.getResourceAsStream(PATH + weaponFile[i] + "/" + weaponFile[i] + ".txt"), "UTF-8"));
			) {
				list.add(new ArrayList<Weapon>());
				String line = reader.readLine();
				while (line != null) {String[] lineSplit = line.split("/");
					String path =  weaponFile[i] + "/" + lineSplit[lineSplit.length-1];
					
					Map<Language, String> names = new HashMap<Language, String>();
					names.put(Language.FR, lineSplit[0]);
					
					String classes[] = lineSplit[1].split(",");
					GradeName[] grades = new GradeName[classes.length];
					for(int j = 0; j < classes.length; j++) {
						grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
					}
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[3])];
					
					String[] effectSplit = lineSplit[7].split(",");
					
					Calculable[] effects = new Calculable[Integer.parseInt(effectSplit[0])];
					for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++) {
						effects[j] = new Effect(lineSplit[j+8]);
					}
					
					Calculable[] bonusXP = new Calculable[Integer.parseInt(effectSplit[2])];
					for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++) {
						bonusXP[j] = new Effect(lineSplit[j+8+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]);
					}
					
					if(quality == Quality.RED) {
						int indexToStar = 8 + Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])+Integer.parseInt(effectSplit[2]);
						String[] starEffectSplit = lineSplit[indexToStar].split(",");
						
						ArrayList<ArrayList<Calculable>> starEffects = new ArrayList<ArrayList<Calculable>>();
						int decal = 0;
						
						for(int j = 0; j < starEffectSplit.length; j++) {
							ArrayList<Calculable> oneStarEffects = new ArrayList<Calculable>();
							for(int k = 0; k < Integer.parseInt(starEffectSplit[j]); k++) {
								oneStarEffects.add(new Effect(lineSplit[indexToStar+2+decal]));
								decal++;
							}
							
							starEffects.add(oneStarEffects);
						}
						
						RedWeapon red = new RedWeapon(
								names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[4]),
								WeaponType.values()[i], Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]), path, effects, bonusXP,
								starEffects
								);
						
						list.get(i).add(red);
						
					} else {
						assert (lineSplit.length == Integer.parseInt(effectSplit[0]) + Integer.parseInt(effectSplit[1]) + Integer.parseInt(effectSplit[2]) + 9)
								: weaponFile[i] + " line " + (list.get(i).size() + 1);
						
						Weapon weapon = new Weapon(
								names, grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[4]),
								WeaponType.values()[i], Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]), path, effects, bonusXP
							);
						
						list.get(i).add(weapon);
						
						if(toCode < 10) {
							//System.out.println(weapon.toCode(path));
							toCode++;
						}
					}
					
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error with " + Weapon.class.getClass().getSimpleName() + " class");
			}
		}
		
		Weapon[][] cast = new Weapon[list.size()][];
		for(int i = 0; i < cast.length; i++) {
			Weapon[] weaponType = new Weapon[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				weaponType[j] = list.get(i).get(j);				
			}
			cast[i] = weaponType;
		}
		
		Weapon[][] fusion = new Weapon[data.length][];
		for(int i = 0; i < fusion.length; i++) {
			Weapon[] w = new Weapon[data[i].length + cast[i].length];
			
			int j = 0;
			for(; j < data[i].length; j++) {
				w[j] = data[i][j];
			}
			
			for(; j < data[i].length + cast[i].length; j++) {
				w[j] = cast[i][j-data[i].length];
			}
			
			fusion[i] = w;
		}
		
		Weapon.data = fusion;
	}
	
	public static Weapon get(String name, Language lang) {
		for(Weapon[] type : Weapon.data) {
			for(Weapon weapon : type) {
				if(weapon.getName(lang).equals(name)) {
					return weapon;
				}
			}
		}
		
		return null;
	}
	
	public static Weapon[] getPossibleWeapon(int idList, Grade grade, int lvl, Reinca reinca, Weapon toIgnore, boolean doubleWeapon) {
		ArrayList<Weapon> result = new ArrayList<Weapon>();
		int[] weaponType = null;
		switch (idList) {
			case 0 :
				weaponType = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 12, 13, 16 };
				break;
			case 1 : 
				weaponType = doubleWeapon ? new int[] { 0, 1, 2, 6, 15, 16 } : new int[] { 15 };
				break;
			case 2 :
				weaponType = new int[] { 8, 9, 10, 11, 14 };
				break;
		}
		
		result.add(new Weapon());
		for(int i = 0; i < weaponType.length; i++) {
			Weapon[] oneWeaponType = Weapon.data[weaponType[i]];
			for(int j = 0; j < oneWeaponType.length; j++) {
				if(!oneWeaponType[j].containGrade(grade.getGrade())) {
					continue;
				}
				
				if(oneWeaponType[j].getLvl() <= lvl) {
					if(!oneWeaponType[j].isReinca()) {
						result.add(oneWeaponType[j]);
					} else {
						if(reinca.getLvl() > 0) {
							result.add(oneWeaponType[j]);
						}
					}
				}
			}
		}
		
		if(toIgnore != null && toIgnore.isUniqueEquip()) {
			result.remove(toIgnore);
		}
		
		Weapon[] cast = new Weapon[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
}
