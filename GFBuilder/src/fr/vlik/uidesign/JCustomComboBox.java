package fr.vlik.uidesign;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomComboBox<T> extends JComboBox<T> {
	
	private static final long serialVersionUID = 1L;
	
	protected final String saveKey;
	
	public JCustomComboBox(Class<T> clazz) {
		super();
		this.saveKey = clazz.getSimpleName();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(Class<T> clazz, ComboBoxModel<T> object) {
		super(object);
		this.saveKey = clazz.getSimpleName();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(Class<T> clazz, T[] object) {
		super(object);
		this.saveKey = clazz.getSimpleName();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public String getSaveKey() {
		return this.saveKey;
	}
	
	public void placeItems(T[] tabItems) {
		this.setModel(new DefaultComboBoxModel<>(tabItems));
	}
	
	public boolean setItems(T[] tabItems) {
		T memory = this.getSelectedItem();
		
		this.setModel(new DefaultComboBoxModel<>(tabItems));
		
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
		this.setModel(new DefaultComboBoxModel<>(tabItems));
		
		if(item != null) {
			this.setSelectedItem(item);
		} else {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		}
	}
	
	@Override
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
	
	public Map<String, String> getSaveConfig() {
		Map<String, String> config = new LinkedHashMap<>();
		
		T item = this.getSelectedItem();
		
		String value = item instanceof Writable ? ((Writable) item).getName(Language.FR) : "";
		config.put(this.saveKey, value);
		
		return config;
	}
}
