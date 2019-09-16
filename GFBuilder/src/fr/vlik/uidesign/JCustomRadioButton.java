package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.MainFrame;

public class JCustomRadioButton extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	private JLabel label;
	
	public JCustomRadioButton() {
		super();
		
		setIconUI("radio1", "radioOff");
		setVoidUI();
	}
	
	public JCustomRadioButton(JLabel label, String iconOn, String iconOff) {
		super();
		this.label = label;
		updateText();
		
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
			System.out.println("Image non charg� : " + iconOn + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOn + ".png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + iconOff + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + iconOff + ".png");
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
	
	public void updateText() {
		setText(this.label.getText());
	}
}
