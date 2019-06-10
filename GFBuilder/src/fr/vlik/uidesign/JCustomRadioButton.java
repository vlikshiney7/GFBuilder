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
		
		setIconUI();
		setVoidUI();
	}
	
	public JCustomRadioButton(String text) {
		super(text);
		
		setIconUI();
		setVoidUI();
	}
	
	public JCustomRadioButton(ImageIcon icon) {
		super(icon);
	}

	public void setIconUI() {
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/radioOn.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : radioOn.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : radioOn.png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/radioOff.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : radioOff.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : radioOff.png");
		}
	}
	
	public void setVoidUI() {
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
}
