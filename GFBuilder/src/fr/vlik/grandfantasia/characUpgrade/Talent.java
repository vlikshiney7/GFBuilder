package fr.vlik.grandfantasia.characUpgrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.IconBuff;
import fr.vlik.grandfantasia.InnerColorEffect;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;

public class Talent extends IconBuff {
	
	private static String PATH = Tools.RESOURCE + Talent.class.getSimpleName().toLowerCase() + "/";
	private static final Quality[] ORDER_QUALITY = new Quality[] { Quality.GREY, Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.BLUE, Quality.BLUE, Quality.BLUE, };
	private static Map<String, Icon> ICONS = new HashMap<String, Icon>();
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
		if(this.name.get(lang) == "") {
			return this.name.get(Language.FR);
		}
		return "";
	}
	
	@Override
	public String getTooltip() {
		return "<html>" + this.name.get(Language.FR) + "</html>";
	}
	
	public InnerColorEffect[] getInnerTalent(int lvl) {
		ArrayList<InnerColorEffect> result = new ArrayList<InnerColorEffect>();
		result.add(this.lvlEffect[0]);
		
		for(int i = 0; i < this.lvl.length; i++) {
			if(this.lvl[i] <= lvl) {
				result.add(this.lvlEffect[i+1]);
			}
		}
		
		return result.toArray(new InnerColorEffect[result.size()]);
	}
	
	public Icon setIcon(String path) {
		if(ICONS.get(path) == null) {
			try {
				ICONS.put(path, new ImageIcon(Talent.class.getResource(PATH + path + Tools.PNG)));
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return ICONS.get(path);
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
}
