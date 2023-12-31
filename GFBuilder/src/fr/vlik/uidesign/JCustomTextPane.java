package fr.vlik.uidesign;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomTextPane<T> extends JTextPane implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	private Language lang;
	private transient T object;
	
	public JCustomTextPane(T obj) {
		super();
		this.object = obj;
		setBlackUI();
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setItem(T object) {
		this.object = object;
		
		if(this.object instanceof Colorable color) {
			this.setForeground(color.getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		updateLanguage(this.lang);
	}
	
	public void updateLanguage(Language lang) {
		this.lang = lang;
		
		if(this.object instanceof Writable w) {
			this.setText(Writable.noHTML(w.getFullInfo(lang)));
		}
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[1]);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setEditable(false);
		this.setFont(Design.SUBTITLE);
		this.setForeground(Design.FontColor[0]);
	}
}
