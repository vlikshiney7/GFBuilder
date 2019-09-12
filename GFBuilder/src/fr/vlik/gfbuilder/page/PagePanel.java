package fr.vlik.gfbuilder.page;

import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.vlik.gfbuilder.Effect;

public abstract class PagePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<Effect> effects;
	protected JLabel[] label;
	
	
	public PagePanel(LayoutManager layout, Color color) {
		super(layout);
		this.setBackground(color);
	}

	public ArrayList<Effect> getEffects() {
		return this.effects;
	}
	
	abstract protected void setEffects();
	
	abstract protected void createPanel();
	
	abstract protected void setLabel();
}
