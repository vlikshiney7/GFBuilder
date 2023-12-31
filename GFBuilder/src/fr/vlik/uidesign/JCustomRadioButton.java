package fr.vlik.uidesign;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomRadioButton<T> extends JRadioButton implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	private transient T object;
	private Language lang;
	
	public JCustomRadioButton(T obj) {
		this.object = obj;
		
		String radioIcon = "radioOn";
		if(this.object instanceof Colorable color) {
			
			this.setForeground(color.getColor());
			radioIcon += Design.iconLink.get(color.getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		if(this.object instanceof Iconable icon) {
			setIconUI(icon.getIcon());
		} else {
			setIconUI(radioIcon, "radioOff");
		}
		
		setVoidUI();
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setItem(T obj) {
		this.object = obj;
		
		if(this.object instanceof Colorable color) {
			this.setForeground(color.getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		if(this.object instanceof Iconable icon) {
			setIconUI(icon.getIcon());
		}
		
		updateLanguage(this.lang);
	}
	
	public void updateLanguage(Language lang) {
		this.lang = lang;
		
		if(this.object instanceof Writable w) {
			this.setText(w.getSelectorInfo(lang));
			this.setToolTipText(w.getFullInfo(lang));
		}
	}
	
	public void setTooltip(String tooltip) {
		this.setToolTipText("<html>" + tooltip.replace("<html>", "").replace("</html>", "") + "</html>");
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void setIconUI(Icon back) {
		this.setSelectedIcon(back);
		this.setIcon(Design.disableIcon((ImageIcon) back));
	}
	
	public void setIconUI(String iconOn, String iconOff) {
		this.setSelectedIcon(new ImageIcon(JCustomRadioButton.class.getResource(Design.RESOURCE + "radio/" + iconOn + Design.PNG)));
		this.setIcon(new ImageIcon(JCustomRadioButton.class.getResource(Design.RESOURCE + "radio/" + iconOff + Design.PNG)));
	}
}
