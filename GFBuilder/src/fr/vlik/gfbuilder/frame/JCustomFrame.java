package fr.vlik.gfbuilder.frame;

import javax.swing.JFrame;

import fr.vlik.grandfantasia.enums.Language;

public abstract class JCustomFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	abstract public void popup();
	
	abstract public void updateLanguage(Language lang);
}
