package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.MainFrame;

public class JCustomTabPane extends JToggleButton {
	
	private static final long serialVersionUID = 1L;
	
	private Color hoverBackgroundColor;
	private Color pressedBackgroundColor;

	public JCustomTabPane(String text) {
		super(text);
		super.setContentAreaFilled(false);
	}
	
	public JCustomTabPane(String icon1, String icon2) {
		super();
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/" + icon1 + ".png"));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + icon1);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + icon1);
		}
		
		super.setIcon(new ImageIcon(object));
		super.setSelectedIcon(new ImageIcon(object));
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/" + icon2 + ".png"));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + icon2);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + icon2);
		}
		
		super.setDisabledIcon(new ImageIcon(object));
		
		super.setBackground(Consts.UIColor[0]);
		this.setHoverBackgroundColor(Consts.UIColor[0]);
		this.setPressedBackgroundColor(Consts.UIColor[0]);
		super.setBorder(null);
		super.setContentAreaFilled(false);
		super.setFocusPainted(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (getModel().isPressed()) {
			g.setColor(pressedBackgroundColor);
		} else if (getModel().isRollover()) {
			g.setColor(hoverBackgroundColor);
		} else if (getModel().isSelected()) {
			g.setColor(pressedBackgroundColor);
		} else {
			g.setColor(getBackground());
		}
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}

	@Override
	public void setContentAreaFilled(boolean b) {
	}

	public Color getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(Color hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public Color getPressedBackgroundColor() {
		return pressedBackgroundColor;
	}

	public void setPressedBackgroundColor(Color pressedBackgroundColor) {
		this.pressedBackgroundColor = pressedBackgroundColor;
	}
}