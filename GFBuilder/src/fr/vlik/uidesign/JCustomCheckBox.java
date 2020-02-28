package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;

public class JCustomCheckBox extends JCheckBox {
	
	private static final long serialVersionUID = 1L;
	private JCustomLabel label;
	
	public JCustomCheckBox(JCustomLabel label) {
		super();
		this.label = label;
		
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/checkOn.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : checkOn.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : checkOn.png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/checkOff.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : checkOff.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : checkOff.png");
		}
		
		setVoidUI();
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void updateText(Language lang) {
		this.label.updateText(lang);
		this.setText(this.label.getText());
	}
}
