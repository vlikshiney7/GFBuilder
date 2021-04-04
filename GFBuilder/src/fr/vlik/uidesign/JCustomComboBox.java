package fr.vlik.uidesign;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class JCustomComboBox<T> extends JComboBox<T> {
	
	private static final long serialVersionUID = 1L;

	public JCustomComboBox() {
		super();
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(ComboBoxModel<T> object) {
		super(object);
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(T[] object) {
		super(object);
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public boolean setItems(T[] tabItems) {
		T memory = this.getSelectedItem();
		
		this.setModel(new DefaultComboBoxModel<T>(tabItems));
		
		if(memory != null) {
			this.setSelectedItem(memory);
		} else {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		}
		
		boolean result = false;
		if(memory == this.getSelectedItem() || (memory != null && memory.equals(this.getSelectedItem()))) {
			result = true;
		}
		
		return result;
	}
	
	public void setItems(T[] tabItems, T item) {
		this.setModel(new DefaultComboBoxModel<T>(tabItems));
		
		if(item != null) {
			this.setSelectedItem(item);
		} else {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		}
	}
	
	public void setSelectedItem(Object item) {
		if(item == null) {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		} else {
			super.setSelectedItem(item);
		}
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Design.FontColor[0]);
		this.setOpaque(false);	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getSelectedItem() {
		return (T) super.getSelectedItem();
	}
}
