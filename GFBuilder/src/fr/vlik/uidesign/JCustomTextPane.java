package fr.vlik.uidesign;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;

public class JCustomTextPane extends JTextPane {
	
	private static final long serialVersionUID = 1L;
	private JLangLabel label;
	
	public JCustomTextPane() {
		super();
		setBlackUI();
	}

	public JCustomTextPane(JLangLabel label) {
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
	
	public void updateText(Language lang) {
		this.label.updateText(lang);
		this.setText(this.label.getText());
	}
}
