package fr.vlik.grandfantasia.characUpgrade;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Filtrable;
import fr.vlik.grandfantasia.loader.characUpgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Title extends ColorBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Titre");
		put(Language.EN, "Title");
	}};
	
	private static Title[] data = LoaderCharacUpgrade.getTitle();
	private static Tag[] tags = new Tag[] { Tag.BOSS, Tag.CHRONO, Tag.DONJON, Tag.EVENT, Tag.GVG, Tag.PVP, Tag.QUETE, Tag.RANK, Tag.REINCA, Tag.REPUTATION, Tag.TDB, Tag.TITLEP8, Tag.OTHER, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD, Quality.PURPLE, Quality.RED, Quality.P8TITLE };
	
	private int lvl;
	private boolean reinca;
	private GradeName grade;
	
	private Tag tag;
	
	public Title() {
		super();
		this.lvl = 0;
		this.grade = GradeName.NONE;
		this.reinca = false;
	}
	
	public Title(Map<Language, String> name, Quality quality, int lvl, boolean reinca, GradeName grade, Tag tag, Calculable[] effects) {
		super(name, quality, effects);
		this.lvl = lvl;
		this.reinca = reinca;
		this.grade = grade;
		this.tag = tag;
	}
	
	public Title(Map<Language, String> name, Quality quality, int lvl, boolean reinca, GradeName grade, Calculable[] effects) {
		super(name, quality, effects);
		this.lvl = lvl;
		this.reinca = reinca;
		this.grade = grade;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public GradeName getGrade() {
		return this.grade;
	}
	
	public Tag getTag() {
		return this.tag;
	}
	
	@Override
	public Color getColor() {
		return Tools.titleColor[this.quality.index];
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if (!(obj instanceof Title)) {
			return false;
		}
		
		Title title = (Title) obj;
		boolean b = this.name.equals(title.name);
		
		return b;
	}
	
	public static Title get(String name) {
		for(Title title : Title.data) {
			if(title.getName(Language.FR).equals(name)) {
				return title;
			}
		}
		
		return null;
	}
	
	public static Title[] getPossibleData(GradeName grade, int lvl, Reinca reinca) {
		ArrayList<Title> result = new ArrayList<Title>();
		
		result.add(new Title());
		
		if(reinca.getLvl() > 0) {
			lvl += 100;
			
			for(Title title : Title.data) {
				if(title.getLvl() <= lvl
						&& (title.getGrade() == GradeName.NONE || title.getGrade() == grade)) {
					
					result.add(title);
				}
			}
		} else {
			for(Title title : Title.data) {
				if(title.isReinca()) {
					continue;
				}
				
				if(title.getGrade() == GradeName.NONE
						|| title.getGrade() == grade) {
					
					if(title.getLvl() <= lvl) {
						result.add(title);
					} else if(title.getLvl() > 100
							&& title.getLvl()-100 <= lvl)
						
						result.add(title);
				}
			}
		}
		
		return result.toArray(new Title[result.size()]);
	}
	
	public static Title[] getPossibleData(GradeName grade, int lvl, Reinca reinca, String key, Filtrable[] filter, Title choice) {
		ArrayList<Title> result = new ArrayList<Title>();
		
		result.add(new Title());
		if(!choice.equals(new Title())) {
			result.add(choice);
		}
		
		if(reinca.getLvl() > 0) {
			lvl += 100;
			
			for(Title title : Title.data) {
				if(title.getLvl() <= lvl && (title.getGrade() == GradeName.NONE || title.getGrade() == grade)) {
					
					if(Tools.searchOnName(key, title.getName(Language.FR)) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
						if(!choice.equals(title)) {
							result.add(title);
						}
					}
				}
			}
		} else {
			for(Title title : Title.data) {
				if(title.isReinca()) {
					continue;
				}
				
				if(title.getGrade() == GradeName.NONE || title.getGrade() == grade) {
					
					if(title.getLvl() <= lvl) {
						if(Tools.searchOnName(key, title.getName(Language.FR)) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					} else if(title.getLvl() > 100 && title.getLvl()-100 <= lvl) {
						
						if(Tools.searchOnName(key, title.getName(Language.FR)) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					}
				}
			}
		}
		
		return result.toArray(new Title[result.size()]);
	}
	
	public static Tag[] getTags() {
		return Title.tags;
	}
	
	public static Quality[] getQualities() {
		return Title.qualities;
	}
}
