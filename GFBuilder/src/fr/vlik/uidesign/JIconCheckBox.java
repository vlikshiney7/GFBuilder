package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class JIconCheckBox extends JCheckBox {
	
	private static final long serialVersionUID = 1L;
	
	public JIconCheckBox(String iconOn, String iconOff) {
		setIconUI(iconOn, iconOff);
		setVoidUI();
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void setIconUI(String iconOn, String iconOff) {
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(JIconCheckBox.class.getResource("/fr/vlik/uidesign/images/check/" + iconOn + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOn + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOn + ".png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(JIconCheckBox.class.getResource("/fr/vlik/uidesign/images/check/" + iconOff + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOff + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOff + ".png");
		}
	}
}
