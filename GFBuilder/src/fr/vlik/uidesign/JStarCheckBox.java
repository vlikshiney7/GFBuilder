package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import fr.vlik.gfbuilder.MainFrame;

public class JStarCheckBox extends JCheckBox {
	
	private static final long serialVersionUID = 1L;
	
	public JStarCheckBox() {
		super();
		
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/starOn.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargée : starOn.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : starOn.png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/starOff.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargée : starOff.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : starOff.png");
		}
		
		setVoidUI();
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
}
