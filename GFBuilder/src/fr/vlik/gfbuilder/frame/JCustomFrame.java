package fr.vlik.gfbuilder.frame;

import java.awt.LayoutManager;

import javax.swing.JFrame;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;

public abstract class JCustomFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	protected JCustomFrame(LayoutManager layout) {
		this.setLayout(layout);
		this.setBackground(Design.UIColor[2]);
	}
	
	protected abstract void popup();
	
	public abstract void updateLanguage(Language lang);
}
