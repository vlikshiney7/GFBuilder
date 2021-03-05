package fr.vlik.uidesign;

import javax.swing.JTextField;

public class JCustomTextField extends JTextField {

	private static final long serialVersionUID = 1L;
	
	public JCustomTextField() {
		super();
		this.setFont(Design.EDIT);
		this.setHorizontalAlignment(JTextField.CENTER);
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
