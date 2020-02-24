package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;

public class JCustomRadioButton extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	private JCustomLabel label;
	
	public JCustomRadioButton() {
		super();
		
		setIconUI("radio1", "radioOff");
		setVoidUI();
	}
	
	public JCustomRadioButton(JCustomLabel label, String iconOn, String iconOff) {
		super();
		this.label = label;
		this.setFont(this.label.getFont());
		this.setForeground(this.label.getForeground());
		updateText(Language.FR);
		
		setIconUI(iconOn, iconOff);
		setVoidUI();
	}
	
	public JCustomRadioButton(Icon icon) {
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
