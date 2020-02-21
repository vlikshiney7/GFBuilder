package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JPanel;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;

public abstract class PagePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Calculable> effects;
	protected JCustomLabel[] label;
	
	public PagePanel() {
		super();
		this.setBackground(Design.UIColor[2]);
	}
	
	public PagePanel(LayoutManager layout) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
	}

	public ArrayList<Calculable> getEffects() {
		return this.effects;
	}
	
	abstract protected void setEffects();
	
	abstract protected void createPanel();
	
	abstract protected void setLabel(Language lang);
	
	abstract public void updateLanguage(Language lang);
	
	abstract public String getSaveName();
	
	abstract public Map<String, String> getConfig(Language lang);
	
	abstract public void setConfig(Map<String, String> config, Language lang) throws IllegalArgumentException;
}
