package fr.vlik.grandfantasia;

import java.awt.Color;
import java.util.ArrayList;

import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
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

	private static Title[] data = Loader.getTitle();
	
	private String name;
	private Quality quality;
	private int lvl;
	private boolean reinca;
	private GradeName grade;
	private Calculable[] effects;
	
	public Title() {
		this.name = "Aucun";
		this.quality = Quality.GREY;
		this.lvl = 0;
		this.grade = GradeName.NONE;
		this.reinca = false;
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
	
	public boolean getReinca() {
		return this.reinca;
	}
	
	public GradeName getGrade() {
		return this.grade;
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
				if(title.getReinca()) {
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
}
