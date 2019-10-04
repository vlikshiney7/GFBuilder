package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;

public abstract class PagePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Effect> effects;
	protected JLabel[] label;
	
	public PagePanel() {
		super();
		this.setBackground(Design.UIColor[2]);
	}
	
	public PagePanel(LayoutManager layout) {
		super(layout);
		this.setBackground(Design.UIColor[2]);
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	abstract protected void setEffects();
	
	abstract protected void createPanel();
	
	abstract protected void setLabel(Language lang);
	
	abstract public void updateLanguage(Language lang);
	
	abstract public int[] getConfig();
	
	abstract public void setConfig(int[] config) throws IllegalArgumentException;
}
