package fr.vlik.grandfantasia.characUpgrade;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;
import fr.vlik.grandfantasia.template.InnerIconEffect;

public class PassiveSkill extends IconBuff {
	
	public static String PATH = Tools.RESOURCE + "skill/";
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
	private static PassiveSkill[][] data = LoaderCharacUpgrade.getPassiveSkill();
	
	private int[] lvl;
	private InnerIconEffect[] lvlEffect;
	
	@SuppressWarnings("serial")
	public PassiveSkill(Map<Language, String> name, int lvl, String path, Calculable[] effects) {
		super(name, effects);
		this.lvl = new int[] { lvl };
		this.icon = setIcon(path);
		String lvlSkill = "Lvl " + lvl + " - ";
		this.lvlEffect = new InnerIconEffect[] { new InnerIconEffect(new HashMap<Language, String>() {{ put(Language.FR, lvlSkill + name.get(Language.FR)); put(Language.EN, lvlSkill + name.get(Language.EN)); }}, "skill/" + path, 0, effects) };
	}
	
	@SuppressWarnings("serial")
	public PassiveSkill(Map<Language, String> name, int[] lvl, String path, Calculable[][] lvlEffects) {
		super(name, null);
		this.lvl = lvl;
		this.icon = setIcon(path);
		
		this.lvlEffect = new InnerIconEffect[lvlEffects.length];
		for(int i = 0; i < lvlEffects.length; i++) {
			int lvlEffect = i+1;
			String lvlSkill = "Lvl " + this.lvl[i] + " - ";
			Calculable[] effect = lvlEffects[i];
			this.lvlEffect[i] = new InnerIconEffect(new HashMap<Language, String>() {{ put(Language.FR, lvlSkill + name.get(Language.FR)); put(Language.EN, lvlSkill + name.get(Language.EN)); }}, "skill/" + path, lvlEffect, effect);
		}
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	public InnerIconEffect getCurrentEffect(int lvl) {
		for(int i = this.lvl.length-1; i >= 0; i--) {
			if(lvl >= this.lvl[i]) {
				return this.lvlEffect[i];
			}
		}
		
		return null;
	}
	
	@Override
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(PassiveSkill.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
	}
	
	public static PassiveSkill[] getSkill(Grade grade) {
		return PassiveSkill.data[grade.getGrade().index];
	}
}
