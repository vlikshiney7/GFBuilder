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
		this(name, quality, lvl, reinca, grade, effects);
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
	
	public static Title get(String name, Language lang) {
		for(Title title : Title.data) {
			if(title.getName(lang).equals(name)) {
				return title;
			}
		}
		
		return null;
	}
	
	public static Title[] getPossibleData() {
		ArrayList<Title> result = new ArrayList<Title>();
		
		result.add(new Title());
		
		for(Title title : Title.data) {
			if(title.isReinca()) {
				continue;
			}
			
			if(title.getGrade() == GradeName.NONE) {
				if(title.getLvl() <= 1) {
					result.add(title);
				} else if(title.getLvl() > 100
						&& title.getLvl()-100 <= 1)
					
					result.add(title);
			}
		}
		
		return result.toArray(new Title[result.size()]);
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
	
	public static Title[] getPossibleData(GradeName grade, int lvl, Reinca reinca, String key, Filtrable[] filter, Title choice, boolean andValue) {
		ArrayList<Title> result = new ArrayList<Title>();
		
		result.add(new Title());
		
		if(reinca.getLvl() > 0) {
			lvl += 100;
			
			if(!choice.equals(new Title())) {
				if(choice.getLvl() <= lvl && (choice.getGrade() == GradeName.NONE || choice.getGrade() == grade)) {
					result.add(choice);
				}
			}
			
			for(Title title : Title.data) {
				if(title.getLvl() <= lvl && (title.getGrade() == GradeName.NONE || title.getGrade() == grade)) {
					if(andValue) {
						if(Tools.searchOnName(key, title.getMap(), andValue)
							&& Tools.contains(filter, title.getQuality()) && Tools.contains(filter, title.getTag())) {
							
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					} else {
						if(Tools.searchOnName(key, title.getMap(), andValue)
							|| Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
							
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					}
				}
			}
		} else {
			if(!choice.equals(new Title())) {
				if(!choice.isReinca()) {
					if(choice.getLvl() <= lvl && (choice.getGrade() == GradeName.NONE || choice.getGrade() == grade)) {
						result.add(choice);
					}
				} else {
					if(choice.getGrade() == GradeName.NONE || choice.getGrade() == grade) {
						if(choice.getLvl() <= lvl) {
							result.add(choice);
						} else if(choice.getLvl() > 100 && choice.getLvl()-100 <= lvl) {
							result.add(choice);
						}
					}
				}
			}
			
			for(Title title : Title.data) {
				if(title.isReinca()) {
					continue;
				}
				
				if(title.getGrade() == GradeName.NONE || title.getGrade() == grade) {
					if(title.getLvl() <= lvl) {
						if(andValue) {
							if(Tools.searchOnName(key, title.getMap(), andValue)
								&& Tools.contains(filter, title.getQuality()) && Tools.contains(filter, title.getTag())) {
								
								if(!choice.equals(title)) {
									result.add(title);
								}
							}
						} else {
							if(Tools.searchOnName(key, title.getMap(), andValue)
								|| Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
								
								if(!choice.equals(title)) {
									result.add(title);
								}
							}
						}
					} else if(title.getLvl() > 100 && title.getLvl()-100 <= lvl) {
						if(andValue) {
							if(Tools.searchOnName(key, title.getMap(), andValue)
								&& Tools.contains(filter, title.getQuality()) && Tools.contains(filter, title.getTag())) {
								
								if(!choice.equals(title)) {
									result.add(title);
								}
							}
						} else {
							if(Tools.searchOnName(key, title.getMap(), andValue)
								|| Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
								
								if(!choice.equals(title)) {
									result.add(title);
								}
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
