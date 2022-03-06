package fr.vlik.uidesign;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomTextPane<T> extends JTextPane {
	
	private static final long serialVersionUID = 1L;
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
		
		updateText(Language.FR);
		
		if(this.object instanceof Colorable) {
			this.setForeground(((Colorable) this.object).getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
	}
	
	public void updateText(Language lang) {
		if(this.object instanceof Writable) {
			this.setText(((Writable) this.object).getInfo(lang));
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
