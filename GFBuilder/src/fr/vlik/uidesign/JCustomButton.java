package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import fr.vlik.grandfantasia.enums.Language;

public class JCustomButton extends JButton {
	
	private static final long serialVersionUID = 1L;
	private JCustomLabel label;
	
	private Color hoverBackgroundColor;
	private Color pressedBackgroundColor;

	public JCustomButton() {
		setBlackUI();
	}
	
	public JCustomButton(JCustomLabel label) {
		this.label = label;
		this.setSize(100, 40);
		
		this.setBackground(Design.GREY_COLOR[0]);
		this.setHoverBackgroundColor(Design.GREY_COLOR[1]);
		this.setPressedBackgroundColor(Design.GREY_COLOR[2]);
		
		setBlackUI();
	}
	
	public JCustomButton(JCustomLabel label, Color[] color) {
		this.label = label;
		this.setSize(100, 40);
		
		this.setBackground(color[0]);
		this.setHoverBackgroundColor(color[1]);
		this.setPressedBackgroundColor(color[2]);
		
		setBlackUI();
	}
	
	public JCustomButton(ImageIcon imageIcon) {
		super(imageIcon);
		
		try {
			this.setPressedIcon(new ImageIcon(ImageIO.read(JCustomButton.class.getResource("/fr/vlik/uidesign/images/crossPress.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : crossPress.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : crossPress.png");
		}
		
		try {
			this.setRolloverIcon(new ImageIcon(ImageIO.read(JCustomButton.class.getResource("/fr/vlik/uidesign/images/crossHover.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : crossPress.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : crossPress.png");
		}
		
		setVoidUI();
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
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
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
	
	public void updateText(Language lang) {
		this.label.updateText(lang);
		this.setText(this.label.getText());
		System.out.println(this.getText());
	}
}
