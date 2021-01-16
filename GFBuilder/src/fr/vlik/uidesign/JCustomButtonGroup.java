package fr.vlik.uidesign;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import fr.vlik.grandfantasia.enums.Language;

@SuppressWarnings("unchecked")
public class JCustomButtonGroup<T> extends ButtonGroup {

	private static final long serialVersionUID = 1L;
	
	public void add(JCustomRadioButton<T> radio) {
		super.add(radio);
	}
	
	public void setVisible(boolean visible) {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			element.setVisible(visible);
		} while(it.hasMoreElements());
	}
	
	public T getSelectedItem() {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			if(element.isSelected()) {
				return element.getItem();
			}
		} while(it.hasMoreElements());
		
		return null;
	}
	
	public void setSelectedItem(T obj) {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			if(element.getItem().equals(obj)) {
				element.setSelected(true);
			}
		} while(it.hasMoreElements());
	}
	
	public void updateText(Language lang) {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			element.updateText(lang);
		} while(it.hasMoreElements());
	}
}
