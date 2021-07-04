package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public abstract class PartialPage extends JCustomPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Calculable> effects;
	protected JLangLabel[] labelGFB;
	protected Map<String, JLangLabel> labelAPI = new HashMap<String, JLangLabel>();
	
	protected PartialPage(int caseTabLabel) {
		super();
		this.setBackground(Design.UIColor[2]);
		this.labelGFB = Lang.getDataLabel(caseTabLabel);
	}
	
	protected PartialPage(int layout, int caseTabLabel) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
		this.labelGFB = Lang.getDataLabel(caseTabLabel);
	}
	
	protected PartialPage(LayoutManager layout, int caseTabLabel) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
		this.labelGFB = Lang.getDataLabel(caseTabLabel);
	}
	
	public ArrayList<Calculable> getEffects() {
		return this.effects;
	}
	
	abstract protected void setLabelAPI();
	
	abstract protected void setEffects();
	
	abstract protected void createPanel();
	
	abstract public void updateLanguage(Language lang);
	
	abstract public String getSaveName();
	
	abstract public Map<String, String> getConfig(Language lang);
	
	abstract public void setConfig(Map<String, String> config, Language lang) throws IllegalArgumentException;
}
