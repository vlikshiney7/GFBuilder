package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

import fr.vlik.grandfantasia.enums.Language;

public class JCustomTabPane extends JToggleButton {
	
	private static final long serialVersionUID = 1L;
	
	private JLangLabel label;
	private Color selectedBackgroundColor;
	private Color hoverBackgroundColor;
	private Color pressedBackgroundColor;

	public JCustomTabPane(JLangLabel label) {
		this.label = label;
		
		this.setBackground(Design.UIColor[0]);
		this.setSelectedBackgroundColor(Design.UIColor[1]);
		this.setHoverBackgroundColor(Design.UIColor[2]);
		this.setPressedBackgroundColor(Design.UIColor[1]);
		this.setBorder(null);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		
		this.setFont(Design.TABPANE);
		this.setForeground(Design.FontColor[0]);
		this.setPreferredSize(new Dimension(160, 0));
	}
	
	public JCustomTabPane(String icon1, String icon2) {
		ImageIcon object = new ImageIcon(JCustomTabPane.class.getResource(Design.RESOURCE + icon1 + Design.PNG));
		this.setIcon(object);
		this.setSelectedIcon(object);
		
		this.setDisabledIcon(new ImageIcon(JCustomTabPane.class.getResource(Design.RESOURCE + icon2 + Design.PNG)));
		
		this.setBackground(Design.UIColor[0]);
		this.setSelectedBackgroundColor(Design.UIColor[0]);
		this.setHoverBackgroundColor(Design.UIColor[2]);
		this.setPressedBackgroundColor(Design.UIColor[1]);
		this.setBorder(null);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (getModel().isPressed()) {
			g.setColor(this.pressedBackgroundColor);
		} else if (getModel().isRollover()) {
			g.setColor(this.hoverBackgroundColor);
		} else if (getModel().isSelected()) {
			g.setColor(this.selectedBackgroundColor);
		} else {
			g.setColor(getBackground());
		}
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}
	
	public Color getSelectedBackgroundColor() {
		return this.selectedBackgroundColor;
	}

	public void setSelectedBackgroundColor(Color selectedBackgroundColor) {
		this.selectedBackgroundColor = selectedBackgroundColor;
	}

	public Color getHoverBackgroundColor() {
		return this.hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(Color hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public Color getPressedBackgroundColor() {
		return this.pressedBackgroundColor;
	}

	public void setPressedBackgroundColor(Color pressedBackgroundColor) {
		this.pressedBackgroundColor = pressedBackgroundColor;
	}
	
	public void updateText(Language lang) {
		this.label.updateText(lang);
		this.setText(this.label.getText());
	}
}