package fr.vlik.uidesign;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class JCustomTextPane extends JTextPane {
	
	private static final long serialVersionUID = 1L;
	
	public JCustomTextPane() {
		super();
		setBlackUI();
	}

	public JCustomTextPane(String text) {
		super();
		
		this.setText(text);
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[1]);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setEditable(false);
		this.setFont(Design.SUBTITLE);
		this.setForeground(Design.FontColor[0]);
	}
}
