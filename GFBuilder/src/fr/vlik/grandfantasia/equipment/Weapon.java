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
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Quality;

public class Weapon extends Equipment {
	
	public static String PATH = Consts.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + "/";
	public static Weapon[][] data;
	static {
		loadData();
	}
	
	protected WeaponType type;
	protected boolean uniqueEquip;
	protected boolean reinca;
	
	public Weapon() {
		super("Rien", new GradeName[] { GradeName.NONE }, 0, Quality.GREY, false, new ArrayList<Effect>(), new ArrayList<Effect>());
		
		this.type = WeaponType.NONE;
		this.uniqueEquip = false;
		this.reinca = false;
		this.img = setIcon("null.png");
	}
	
	public Weapon(Weapon weapon) {
		super(weapon.getName(), weapon.getGrades(), weapon.getLvl(), weapon.getQuality(), weapon.isEnchantable(), weapon.getEffects(), weapon.getBonusXP());
		
		this.type = weapon.getType();
		this.uniqueEquip = weapon.isUniqueEquip();
		this.reinca = weapon.isReinca();
		this.img = weapon.getIcon();
		this.effects = weapon.getEffects();
	}
	
	public Weapon(String name, GradeName[] grades, int lvl, Quality quality, boolean enchantable, WeaponType type, boolean uniqueEquip, boolean reinca, String iconPath, ArrayList<Effect> effects, ArrayList<Effect> bonusXP) {
		super(name, grades, lvl, quality, enchantable, effects, bonusXP);
		
		this.type = type;
		this.uniqueEquip = uniqueEquip;
		this.reinca = reinca;
		this.img = setIcon(iconPath);
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
		NONE(-1, "un vide", "void");
		
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
	public BufferedImage setIcon(String path) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		if(path == null) {
			path = "null.png";
		}
		
		try {
			back = ImageIO.read(Weapon.class.getResource(Consts.PATH32 + this.quality.index + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(Weapon.class.getResource(PATH + path));
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
			
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
				continue;
			}
			
			effect.addFortifValue(coefFortif);
		}
	}
	
	public void doubleWeapon() {
		for(Effect effect : this.effects) {
			if(effect.isPercent()) {
				continue;
			}
			
			if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
				continue;
			}
			
			effect.reduceAtkValue();
		}
	}

	public static void loadData() {
		String[] weaponFile = { "epee1M", "marteau1M", "hache1M", "epee2M", "marteau2M", "hache2M", "meca1M", "meca2M", "arc", "gun", "canon", "relique", "baton", "lame", "cle", "bouclier", "default" };
		
		ArrayList<ArrayList<Weapon>> list = new ArrayList<ArrayList<Weapon>>();
		
		list.add(new ArrayList<Weapon>());
		list.get(0).add(new Weapon());
		
		for(int i = 0; i < weaponFile.length; i++) {
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						Weapon.class.getResourceAsStream(PATH + weaponFile[i] + "/" + weaponFile[i] + ".txt"), "UTF-8"));
			) {
				list.add(new ArrayList<Weapon>());
				String line = reader.readLine();
				while (line != null) {
					String[] lineSplit = line.split("/");
					String path =  weaponFile[i] + "/" + lineSplit[lineSplit.length-1] + ".png";
					
					String classes[] = lineSplit[1].split(",");
					GradeName[] grades = new GradeName[classes.length];
					for(int j = 0; j < classes.length; j++) {
						grades[j] = GradeName.values()[Integer.parseInt(classes[j])];
					}
					
					Quality quality = Quality.values()[Integer.parseInt(lineSplit[3])];
					
					String[] effectSplit = lineSplit[7].split(",");
					
					ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
					for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
						effects.add(new Effect(lineSplit[j+8]));
					
					ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
					for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++) {
						bonusXP.add(new Effect(lineSplit[j+8+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
					}
					
					if(quality == Quality.RED) {
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
						
						RedWeapon red = new RedWeapon(
								lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[4]),
								WeaponType.values()[i], Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]), path, effects, bonusXP,
								starEffects
								);
						
						list.get(i+1).add(red);
						
					} else {
						assert (lineSplit.length == Integer.parseInt(effectSplit[0]) + Integer.parseInt(effectSplit[1]) + Integer.parseInt(effectSplit[2]) + 9)
								: weaponFile[i] + " line " + (list.get(i+1).size() + 1);
						
						Weapon weapon = new Weapon(
								lineSplit[0], grades, Integer.parseInt(lineSplit[2]), quality, Boolean.parseBoolean(lineSplit[4]),
								WeaponType.values()[i], Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]), path, effects, bonusXP
								);
						
						list.get(i+1).add(weapon);
					}
					
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error with " + Weapon.class.getClass().getSimpleName() + " class");
			}
		}
		
		Weapon.data = new Weapon[list.size()][];
		for(int i = 0; i < data.length; i++) {
			Weapon[] weaponType = new Weapon[list.get(i).size()];
			for(int j = 0; j < list.get(i).size(); j++) {
				weaponType[j] = list.get(i).get(j);				
			}
			Weapon.data[i] = weaponType;
		}
	}
	
	public static Weapon[] getPossibleWeapon(int idList, GradeName grade, int lvl, boolean reinca, Weapon toIgnore) {
		ArrayList<Weapon> result = new ArrayList<Weapon>();
		int[] weaponType = null;
		switch (idList) {
			case 0 : weaponType = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 12, 13, 16 };	break;
			case 1 : weaponType = new int[] { 0, 1, 2, 6, 15, 16 };					break;
			case 2 : weaponType = new int[] { 8, 9, 10, 11, 14 };					break;
		}
		
		result.add(Weapon.data[0][0]);
		for(int i = 0; i < weaponType.length; i++) {
			Weapon[] oneWeaponType = Weapon.data[weaponType[i]+1];
			for(int j = 0; j < oneWeaponType.length; j++) {
				if(!oneWeaponType[j].containGrade(grade)) {
					continue;
				}
				
				if(oneWeaponType[j].getLvl() <= lvl) {
					if(!oneWeaponType[j].isReinca()) {
						result.add(oneWeaponType[j]);
					} else {
						if(reinca) {
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
