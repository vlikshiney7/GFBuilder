package fr.vlik.uidesign;

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
		this.setSelectedIcon(new ImageIcon(JCustomCheckBox.class.getResource(Design.RESOURCE + "check/" + iconOn + Design.PNG)));
		this.setIcon(new ImageIcon(JCustomCheckBox.class.getResource(Design.RESOURCE + "check/" + iconOff + Design.PNG)));
	}
}
