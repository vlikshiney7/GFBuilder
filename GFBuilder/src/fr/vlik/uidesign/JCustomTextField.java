package fr.vlik.uidesign;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JCustomTextField extends JTextField {

	private static final long serialVersionUID = 1L;
	
	public JCustomTextField() {
		super();
		this.setFont(Design.EDIT);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setCaretColor(Design.FontColor[0]);
		this.putClientProperty("caretWidth", 2);
		
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[1]);
		this.setBorder(null);
		this.setForeground(Design.FontColor[0]);
		this.setOpaque(true);
	}
}
