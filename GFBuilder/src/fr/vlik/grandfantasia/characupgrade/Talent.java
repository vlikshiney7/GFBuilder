package fr.vlik.grandfantasia.characupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;
import fr.vlik.grandfantasia.template.InnerColorEffect;

public class Talent extends IconBuff {
	
	private static final String PATH = Tools.RESOURCE + Talent.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.BLUE, Quality.BLUE, Quality.BLUE, };
	private static final Map<String, Icon> ICONS = new HashMap<>();
	private static Talent[][] data = LoaderCharacUpgrade.getTalent();
	private static Talent[] voidData = LoaderCharacUpgrade.getVoidTalent();
	
	private int[] lvl;
	private InnerColorEffect[] lvlEffect;
	
	public Talent() {
		super();
		this.lvl =  new int[] { 0 };
		this.icon = setIcon("null");
	}
	
	public Talent(String path) {
		super();
		this.lvl =  new int[] { 0 };
		this.icon = setIcon(path);
	}
	
	@SuppressWarnings("serial")
	public Talent(Map<Language, String> name, int[] lvl, String path, Calculable[][] lvlEffect) {
		super(name, null);
		this.lvl = lvl;
		this.icon = setIcon(path);
		
		this.lvlEffect = new InnerColorEffect[lvlEffect.length+1];
		this.lvlEffect[0] = new InnerColorEffect(new HashMap<Language, String>() {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, ORDER_QUALITY[0], 0, null);
		
		for(int i = 1; i < this.lvlEffect.length; i++) {
			Quality quality = (lvlEffect.length == 6) ? ORDER_QUALITY[i] : Quality.BLUE;
			
			String item = "Lvl " + this.lvl[i-1] + " -";
			this.lvlEffect[i] = new InnerColorEffect(new HashMap<Language, String>() {{ put(Language.FR, item); put(Language.EN, item); }}, quality, i, lvlEffect[i-1]);
		}
	}
	
	public int[] getLvl() {
		return this.lvl;
	}
	
	@Override
	public String getInfo(Language lang) {
		if("".equals(this.name.get(lang))) {
			return this.name.get(Language.FR);
		}
		return "";
	}
	
	@Override
	public String getTooltip() {
		return "<html><b>" + this.name.get(Language.FR) + "</b></html>";
	}
	
	public InnerColorEffect[] getInnerTalent(int lvl) {
		ArrayList<InnerColorEffect> result = new ArrayList<>();
		result.add(this.lvlEffect[0]);
		
		for(int i = 0; i < this.lvl.length; i++) {
			if(this.lvl[i] <= lvl) {
				result.add(this.lvlEffect[i+1]);
			}
		}
		
		return result.toArray(new InnerColorEffect[result.size()]);
	}
	
	@Override
	public Icon setIcon(String path) {
		Icon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(Talent.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
	
	public static Talent get(String name, Grade grade, Language lang) {
		for(Talent talent : Talent.data[grade.getGrade().index]) {
			if(talent.getName(lang).equals(name)) {
				return talent;
			}
		}
		
		return null;
	}
	
	public static Talent[] getPossibleTalent(Grade grade) {
		return Talent.data[grade.getGrade().index];
	}
	
	public static Talent[][] getData() {
		return Talent.data;
	}
	
	public static Talent[] getVoidData() {
		return Talent.voidData;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lvl);
		result = prime * result + Arrays.hashCode(lvlEffect);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Talent other = (Talent) obj;
		if (!Arrays.equals(lvl, other.lvl)) {
			return false;
		}
		return Arrays.equals(lvlEffect, other.lvlEffect);
	}
}
