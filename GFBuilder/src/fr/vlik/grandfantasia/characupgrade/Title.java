package fr.vlik.grandfantasia.characupgrade;

import java.awt.Color;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.ColorBuff;

public class Title extends ColorBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
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
	
	public static Title get(String name, Language lang) {
		for(Title title : Title.data) {
			if(title.getName(lang).equals(name)) {
				return title;
			}
		}
		
		return null;
	}
	
	public static Title[] getPossibleData() {
		ArrayList<Title> result = new ArrayList<>();
		
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
		ArrayList<Title> result = new ArrayList<>();
		
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
				
				if(title.getGrade() == GradeName.NONE || title.getGrade() == grade) {
					
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
	
	public static Title[] applyFilters(Title[] possible, Title choice, String key, Filterable[] filter, boolean andValue) {
		ArrayList<Title> result = new ArrayList<>();
		
		result.add(new Title());
		if(!choice.equals(new Title())
				&& Tools.containObject(possible, choice)) {
			
			result.add(choice);
		}
		
		for(Title title : possible) {
			boolean[] filters = new boolean[] {
				Tools.searchOnName(key, title.getMap(), andValue),
				Tools.containObject(filter, title.getQuality()),
				Tools.containObject(filter, title.getTag()),
			};
			
			if( (andValue ? Filterable.andValue(filters) : Filterable.orValue(filters))
					&& !choice.equals(title)) {
				
				result.add(title);
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.grade == null) ? 0 : this.grade.hashCode());
		result = prime * result + this.lvl;
		result = prime * result + (this.reinca ? 1231 : 1237);
		result = prime * result + ((this.tag == null) ? 0 : this.tag.hashCode());
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
		Title other = (Title) obj;
		if (this.grade != other.grade) {
			return false;
		}
		if (this.lvl != other.lvl) {
			return false;
		}
		if (this.reinca != other.reinca) {
			return false;
		}
		return this.tag == other.tag;
	}
	
}
