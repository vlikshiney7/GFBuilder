package fr.vlik.uidesign;

import java.util.HashMap;
import java.util.Map;

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
		this.setSelectedIcon(new ImageIcon(JLangRadioButton.class.getResource(Design.RESOURCE + "radio/" + iconOn + Design.PNG)));
		this.setIcon(new ImageIcon(JLangRadioButton.class.getResource(Design.RESOURCE + "radio/" + iconOff + Design.PNG)));
	}
}
