package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public abstract class PartialPage extends JCustomPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected transient ArrayList<Calculable> effects;
	protected transient Map<String, JLangLabel> labels = new HashMap<>();
	
	protected PartialPage() {
		super();
		this.setBackground(Design.UIColor[2]);
		setLabel();
	}
	
	protected PartialPage(int layout) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
		setLabel();
	}
	
	protected PartialPage(LayoutManager layout) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
		setLabel();
	}
	
	public List<Calculable> getEffects() {
		return this.effects;
	}
	
	protected abstract void setLabel();
	
	protected abstract void setEffects();
	
	protected abstract void createPanel();
	
	public abstract void updateLanguage(Language lang);
	
	public abstract String getSaveName();
	
	public abstract Map<String, String> getConfig(Language lang);
	
	public abstract void setConfig(Map<String, String> config, Language lang) throws IllegalArgumentException;
}
