package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public abstract class PartialPage extends JCustomPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Calculable> effects;
	protected Map<String, JLangLabel> labels = new HashMap<String, JLangLabel>();
	
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
	
	public ArrayList<Calculable> getEffects() {
		return this.effects;
	}
	
	abstract protected void setLabel();
	
	abstract protected void setEffects();
	
	abstract protected void createPanel();
	
	abstract public void updateLanguage(Language lang);
	
	abstract public String getSaveName();
	
	abstract public Map<String, String> getConfig(Language lang);
	
	abstract public void setConfig(Map<String, String> config, Language lang) throws IllegalArgumentException;
}
