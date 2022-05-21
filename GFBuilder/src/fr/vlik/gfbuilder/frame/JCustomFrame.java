package fr.vlik.gfbuilder.frame;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JLangLabel;
import fr.vlik.uidesign.JUpdateLang;

public abstract class JCustomFrame extends JFrame implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	
	protected JLangLabel[] labels;
	protected transient List<JUpdateLang> components = new ArrayList<>();
	
	protected JCustomFrame(LayoutManager layout) {
		this.setLayout(layout);
		this.setBackground(Design.UIColor[2]);
	}
	
	public void updateLanguage(Language lang) {
		for(JLangLabel entry : this.labels) {
			entry.updateLanguage(lang);
		}
		
		this.components.forEach(e -> e.updateLanguage(lang));
	}
	
	protected abstract void popup();
}
