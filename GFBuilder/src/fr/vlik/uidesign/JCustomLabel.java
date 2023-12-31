package fr.vlik.uidesign;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomLabel<T> extends JLabel implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	private transient T object;
	private Language lang;
	
	public JCustomLabel(T obj) {
		this.object = obj;
		this.setFont(Design.SUBTITLE);
		
		setIcon();
		setColor();
		
		updateLanguage(Language.FR);
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setItem(T obj) {
		this.object = obj;
		setIcon();
		setColor();
		updateLanguage(this.lang);
	}
	
	public void updateLanguage(Language lang) {
		this.lang = lang;
		
		if(this.object instanceof Writable w) {
			this.setText(w.getSelectorInfo(lang));
			this.setToolTipText(w.getFullInfo(lang));
		}
	}
	
	private void setIcon() {
		if(this.object instanceof Iconable icon) {
			this.setIcon(icon.getIcon());
		}
	}
	
	private void setColor() {
		if(this.object instanceof Colorable color) {
			this.setForeground(color.getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
	}
	
	public void toStatLabel(int size, int left, int right) {
		this.setFont(Design.TITLE);
		this.setBackground(Design.UIColor[0]);
		this.setBorder(new EmptyBorder(0, left, 0, right));
		this.setMaximumSize(new Dimension(size, 25));
		this.setOpaque(true);
	}
}
