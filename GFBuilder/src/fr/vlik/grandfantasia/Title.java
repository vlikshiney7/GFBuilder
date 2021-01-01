package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Filtrable;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Condition;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.SkillEffect;
import fr.vlik.grandfantasia.stats.StaticEffect;
import fr.vlik.grandfantasia.stats.TransformEffect;

public class Title implements Colorable, Writable {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new HashMap<Language, String>() {{
		put(Language.FR, "Titre");
		put(Language.EN, "Title");
	}};
	
	private static Title[] data = Loader.getTitle();
	private static Tag[] tags = new Tag[] { Tag.BOSS, Tag.CHRONO, Tag.DONJON, Tag.EVENT, Tag.GVG, Tag.PVP, Tag.QUETE, Tag.RANK, Tag.REINCA, Tag.REPUTATION, Tag.TDB, Tag.TITLEP8, Tag.OTHER, };
	private static Quality[] qualities = new Quality[] { Quality.WHITE, Quality.GREEN, Quality.BLUE, Quality.ORANGE, Quality.GOLD, Quality.PURPLE, Quality.RED, Quality.P8TITLE };
	
	private String name;
	private Quality quality;
	private int lvl;
	private boolean reinca;
	private GradeName grade;
	private Calculable[] effects;
	
	private Tag tag;
	
	public Title() {
		this.name = "Aucun";
		this.quality = Quality.GREY;
		this.lvl = 0;
		this.grade = GradeName.NONE;
		this.reinca = false;
	}
	
	public Title(String name, Quality quality, int lvl, boolean reinca, GradeName grade, Tag tag, Calculable[] effects) {
		this.name = name;
		this.quality = quality;
		this.lvl = lvl;
		this.reinca = reinca;
		this.grade = grade;
		this.tag = tag;
		this.effects = effects;
	}
	
	public Title(String name, Quality quality, int lvl, boolean reinca, GradeName grade, Calculable[] effects) {
		this.name = name;
		this.quality = quality;
		this.lvl = lvl;
		this.reinca = reinca;
		this.grade = grade;
		this.effects = effects;
	}

	public String getName() {
		return this.name;
	}
	
	public Quality getQuality() {
		return this.quality;
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
	
	public Calculable[] getEffects() {
		if(this.effects == null) {
			return null;
		}
		
		Calculable[] tab = new Calculable[this.effects.length];
		
		for(int i = 0; i < tab.length; i++) {
			Calculable c = this.effects[i];
			
			if(c instanceof Effect) {
				tab[i] = new Effect((Effect) c);
			} else if(c instanceof StaticEffect) {
				tab[i] = new StaticEffect((StaticEffect) c);
			} else if(c instanceof SkillEffect) {
				tab[i] = new SkillEffect((SkillEffect) c);
			} else if(c instanceof RegenEffect) {
				tab[i] = new RegenEffect((RegenEffect) c);
			} else if(c instanceof TransformEffect) {
				tab[i] = new TransformEffect((TransformEffect) c);
			} else if(c instanceof Proc) {
				tab[i] = new Proc((Proc) c);
			} else if(c instanceof Condition) {
				tab[i] = new Condition((Condition) c);
			}
		}
		
		return tab;
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
	
	@Override
	public Color getColor() {
		return Tools.titleColor[this.quality.index];
	}
	
	@Override
	public String getInfo(Language lang) {
		return this.name;
	}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		if(this.effects != null) {
			for(Calculable c : this.effects) {
				tooltip.append(c.getTooltip());
			}
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static Title get(String name) {
		for(Title title : Title.data) {
			if(title.getName().equals(name)) {
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
		
		Title[] cast = new Title[result.size()];
		cast = result.toArray(cast);
		
		return cast;
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
					
					if(Tools.searchOnName(key, title.getName()) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
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
						if(Tools.searchOnName(key, title.getName()) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					} else if(title.getLvl() > 100 && title.getLvl()-100 <= lvl) {
						
						if(Tools.searchOnName(key, title.getName()) || Tools.contains(filter, title.getQuality()) || Tools.contains(filter, title.getTag())) {
							if(!choice.equals(title)) {
								result.add(title);
							}
						}
					}
				}
			}
		}
		
		Title[] cast = new Title[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
	
	public static Tag[] getTags() {
		return Title.tags;
	}
	
	public static Quality[] getQualities() {
		return Title.qualities;
	}
}
