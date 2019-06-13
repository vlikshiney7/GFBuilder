package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.MainFrame;

public class JCustomRadioButton extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	
	public JCustomRadioButton() {
		super();
		
		setIconUI("radio1", "radioOff");
		setVoidUI();
	}
	
	public JCustomRadioButton(String text, String iconOn, String iconOff) {
		super(text);
		
		setIconUI(iconOn, iconOff);
		setVoidUI();
	}
	
	public JCustomRadioButton(ImageIcon icon) {
		super(icon);
	}

	public void setIconUI(String iconOn, String iconOff) {
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + iconOn + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOn + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOn + ".png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + iconOff + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOff + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOff + ".png");
		}
	}
	
	public void setVoidUI() {
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
}
