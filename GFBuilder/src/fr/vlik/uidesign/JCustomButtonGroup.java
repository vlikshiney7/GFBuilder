package fr.vlik.uidesign;

import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import fr.vlik.grandfantasia.enums.Language;

@SuppressWarnings("unchecked")
public class JCustomButtonGroup<T> extends ButtonGroup implements JUpdateLang {

	private static final long serialVersionUID = 1L;
	
	public T getElement(int i) {
		int count = 0;
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			if(i == count) {
				return element.getItem();
			}
			
			count++;
		} while(it.hasMoreElements());
		
		return null;
	}
	
	public JCustomRadioButton<T> getButton(int i) {
		int count = 0;
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			if(i == count) {
				return element;
			}
			
			count++;
		} while(it.hasMoreElements());
		
		return null;
	}
	
	public void setVisible(boolean visible) {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			element.setVisible(visible);
		} while(it.hasMoreElements());
	}
	
	public int getSelectedIndex() {
		int count = 0;
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			if(element.isSelected()) {
				return count;
			}
			
			count++;
		} while(it.hasMoreElements());
		
		return 0;
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
	
	public void setSelectedIndex(int index) {
		int count = 0;
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			element.setSelected(count == index);
			
			count++;
		} while(it.hasMoreElements());
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
	
	public void updateLanguage(Language lang) {
		Enumeration<AbstractButton> it = this.getElements();
		do {
			JCustomRadioButton<T> element = (JCustomRadioButton<T>) it.nextElement();
			element.updateLanguage(lang);
		} while(it.hasMoreElements());
	}

	public void addAll(List<T> items) {
		for(T item : items) {
			if(item instanceof AbstractButton) {
				this.add((AbstractButton) item);
			}
		}
	}
}
