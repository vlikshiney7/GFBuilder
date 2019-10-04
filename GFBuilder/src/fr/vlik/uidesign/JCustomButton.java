package fr.vlik.uidesign;

import java.awt.Font;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class JCustomButton extends JButton{
	
	private static final long serialVersionUID = 1L;
	private JLabel label;

	public JCustomButton() {
		super();
		setBlackUI();
	}
	
	public JCustomButton(JLabel label) {
		super();
		this.label = label;
		this.setSize(100, 40);
		updateText();
		
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
		this.setBackground(Design.UIColor[0]);
		this.setBorder(new EmptyBorder(5, 10, 5, 10));
		this.setBorderPainted(false);
		this.setFont(new Font("Open Sans", Font.PLAIN, 16));
		this.setForeground(Design.FontColor[0]);
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void updateText() {
		setText(this.label.getText());
	}
}
