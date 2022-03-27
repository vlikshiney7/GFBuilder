package fr.vlik.uidesign;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;

public class JLabelTextPane extends JTextPane implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	private JLangLabel label;
	
	public JLabelTextPane() {
		super();
		setBlackUI();
	}
	
	public JLabelTextPane(JLangLabel label) {
		this.label = label;
		
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[1]);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setEditable(false);
		this.setFont(Design.SUBTITLE);
		this.setForeground(Design.FontColor[0]);
	}
	
	public void updateLanguage(Language lang) {
		this.label.updateLanguage(lang);
		this.setText(this.label.getText());
	}
}
