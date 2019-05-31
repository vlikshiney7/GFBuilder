package fr.vlik.uidesign;

import java.awt.Font;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.MainFrame;

public class JCustomButton extends JButton{
	
	private static final long serialVersionUID = 1L;

	public JCustomButton() {
		super();
		setBlackUI();
	}
	
	public JCustomButton(String text) {
		super(text);
		setBlackUI();
	}
	
	public JCustomButton(ImageIcon imageIcon) {
		super(imageIcon);
		
		try {
			this.setPressedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/crossPress.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : crossPress.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : /crossPress.png");
		}
		
		try {
			this.setRolloverIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/crossHover.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : crossPress.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : /crossPress.png");
		}
		
		setVoidUI();
	}
	
	public void setBlackUI() {
		this.setUI((ButtonUI) BasicButtonUI.createUI(this));
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setFont(new Font("Open Sans", Font.PLAIN, 16));
		this.setForeground(Consts.FontColor[0]);
	}
	
	public void setVoidUI() {
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
}
