package fr.vlik.uidesign;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;

public class JCustomTextPane extends JTextPane {
	
	private static final long serialVersionUID = 1L;
	
	public JCustomTextPane() {
		super();
		setBlackUI();
	}

	public JCustomTextPane(String text) {
		super();
		
		setText(text);
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Consts.UIColor[1]);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setEditable(false);
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.setForeground(Consts.FontColor[0]);
	}
}
