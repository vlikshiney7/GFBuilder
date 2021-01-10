package fr.vlik.uidesign;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import fr.vlik.grandfantasia.enums.Language;

public class JLangRadioButton extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	
	private Map<Language, String> lang = new HashMap<Language, String>();
	
	public JLangRadioButton(Map<Language, String> lang) {
		this.lang = lang;
		setIconUI("radioOn", "radioOff");
		setVoidUI();
		updateText(Language.FR);
	}
	
	public JLangRadioButton(Icon icon) {
		super(icon);
	}
	
	public void updateText(Language lang) {
		this.setText(this.lang.get(lang));
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void setIconUI(String iconOn, String iconOff) {
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(JLangRadioButton.class.getResource("/fr/vlik/uidesign/images/radio/" + iconOn + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOn + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOn + ".png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(JLangRadioButton.class.getResource("/fr/vlik/uidesign/images/radio/" + iconOff + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOff + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOff + ".png");
		}
	}
}
