package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import fr.vlik.grandfantasia.enums.Language;

public class JCustomButton extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	private Map<Language, String> lang;
	
	private Color hoverBackgroundColor;
	private Color pressedBackgroundColor;
	
	public JCustomButton(Map<Language, String> lang, Color[] color) {
		this.lang = lang;
		
		setColorUI(color);
		setBlackUI();
		updateText(Language.FR);
	}
	
	public JCustomButton(String iconBase, String iconPress, String iconHover) {
		setVoidUI();
		
		setIcon(iconBase);
		setPressedIcon(iconPress);
		setRolloverIcon(iconHover);
	}
	
	public JCustomButton(String iconBase, String iconPress, String iconHover, Color[] color) {
		setVoidUI();
		
		setIcon(iconBase);
		setPressedIcon(iconPress);
		setRolloverIcon(iconHover);
		
		setColorUI(color);
	}
	
	public void setIcon(String icon) {
		this.setIcon(new ImageIcon(JCustomButton.class.getResource(Design.RESOURCE + "button/" + icon + Design.PNG)));
	}
	
	public void setPressedIcon(String iconPress) {
		this.setPressedIcon(new ImageIcon(JCustomButton.class.getResource(Design.RESOURCE + "button/" + iconPress + Design.PNG)));
	}
	
	public void setRolloverIcon(String iconHover) {
		this.setRolloverIcon(new ImageIcon(JCustomButton.class.getResource(Design.RESOURCE + "button/" + iconHover + Design.PNG)));
	}
	
	public void setBorder(Color color) {
		this.setBorderPainted(true);
		this.setBorder(new LineBorder(color, 2));
	}
	
	public void updateText(Language lang) {
		this.setText(this.lang.get(lang));
	}
	
	public void setBlackUI() {
		this.setUI((ButtonUI) BasicButtonUI.createUI(this));
		this.setBorder(new EmptyBorder(5, 10, 5, 10));
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFont(Design.BUTTON);
		this.setForeground(Design.FontColor[0]);
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		super.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void setColorUI(Color[] color) {
		this.setBackground(color[0]);
		this.setHoverBackgroundColor(color[1]);
		this.setPressedBackgroundColor(color[2]);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if(getModel().isPressed()) {
			g.setColor(this.pressedBackgroundColor);
		} else if (getModel().isRollover()) {
			g.setColor(this.hoverBackgroundColor);
		} else {
			g.setColor(getBackground());
		}
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
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
}
