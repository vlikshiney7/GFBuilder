package fr.vlik.uidesign;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomCheckBox<T> extends JCheckBox implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	private transient T object;
	private Language lang;
	
	public JCustomCheckBox(T obj) {
		this.object = obj;
		
		String checkIcon = "checkOn";
		if(this.object instanceof Colorable) {
			Color color = ((Colorable) this.object).getColor();
			
			this.setForeground(color);
			checkIcon += Design.iconLink.get(color);
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		setIconUI(checkIcon, "checkOff");
		
		setVoidUI();
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setItem(T obj) {
		this.object = obj;
		updateLanguage(this.lang);
	}
	
	public void updateLanguage(Language lang) {
		this.lang = lang;
		
		if(this.object instanceof Writable) {
			this.setText(((Writable) this.object).getSelectorInfo(lang));
			this.setToolTipText(((Writable) this.object).getFullInfo(lang));
		}
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
