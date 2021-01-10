package fr.vlik.uidesign;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomLabel<T> extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private T object;
	private Language lang;
	
	public JCustomLabel(T obj) {
		this.object = obj;
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
		
		setIcon();
		setColor();
		
		updateText(Language.FR);
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setItem(T obj) {
		this.object = obj;
		setIcon();
		setColor();
		updateText(this.lang);
	}
	
	public void updateText(Language lang) {
		this.lang = lang;
		if(this.object instanceof Writable) {
			this.setText(((Writable) this.object).getInfo(lang));
			this.setToolTipText(((Writable) this.object).getTooltip());
		}
	}
	
	private void setIcon() {
		if(this.object instanceof Iconable) {
			Iconable icon = (Iconable) this.object;
			this.setIcon(icon.getIcon());
		}
	}
	
	private void setColor() {
		if(this.object instanceof Colorable) {
			Colorable color = (Colorable) this.object;
			this.setForeground(color.getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
	}
	
	public void toStatLabel(int size, int left, int right) {
		this.setFont(new Font("Open Sans", Font.BOLD, 16));
		this.setBackground(Design.UIColor[0]);
		this.setBorder(new EmptyBorder(0, left, 0, right));
		this.setMaximumSize(new Dimension(size, 25));
		this.setOpaque(true);
	}
}
