package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;

public class JCustomTabPane extends JToggleButton {
	
	private static final long serialVersionUID = 1L;
	
	private JCustomLabel label;
	private Color selectedBackgroundColor;
	private Color hoverBackgroundColor;
	private Color pressedBackgroundColor;

	public JCustomTabPane(JCustomLabel label) {
		this.label = label;
		
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		super.setContentAreaFilled(false);
		this.setSelectedBackgroundColor(Design.UIColor[1]);
		this.setFocusPainted(false);
		this.setFont(new Font("Open Sans", Font.PLAIN, 24));
		this.setForeground(Design.FontColor[0]);
		this.setHoverBackgroundColor(Design.UIColor[2]);
		this.setPreferredSize(new Dimension(160, 0));
		this.setPressedBackgroundColor(Design.UIColor[1]);
	}
	
	public JCustomTabPane(String icon1, String icon2) {
		super();
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + icon1 + ".png"));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + icon1);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + icon1);
		}
		
		super.setIcon(new ImageIcon(object));
		super.setSelectedIcon(new ImageIcon(object));
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + icon2 + ".png"));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + icon2);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + icon2);
		}
		
		super.setDisabledIcon(new ImageIcon(object));
		
		super.setBackground(Design.UIColor[0]);
		this.setSelectedBackgroundColor(Design.UIColor[0]);
		this.setHoverBackgroundColor(Design.UIColor[2]);
		this.setPressedBackgroundColor(Design.UIColor[1]);
		super.setBorder(null);
		super.setContentAreaFilled(false);
		super.setFocusPainted(false);
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