package fr.vlik.uidesign;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.template.Buff;

public class JCustomComboBoxList<T> {
	
	private int size;
	private List<JCustomComboBox<T>> comboBoxList = new ArrayList<>();
	
	public JCustomComboBoxList() {
		this.comboBoxList = new ArrayList<>();
		this.size = 0;
	}
	
	public JCustomComboBoxList(Class<T> clazz, int capacity) {
		this.comboBoxList = new ArrayList<>(capacity);
		this.size = capacity;
		
		for(int i = 0; i < capacity; i++) {
			this.comboBoxList.add(new JCustomComboBox<>(clazz, new DefaultComboBoxModel<>()));
		}
	}
	
	public JCustomComboBoxList(Class<T> clazz, int capacity, T[] data) {
		this.comboBoxList = new ArrayList<>(capacity);
		this.size = capacity;
		
		for(int i = 0; i < capacity; i++) {
			this.comboBoxList.add(new JCustomComboBox<>(clazz, data));
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public List<JCustomComboBox<T>> getList() {
		return this.comboBoxList;
	}
	
	public void add(JCustomComboBox<T> jCustomComboBox) {
		this.comboBoxList.add(jCustomComboBox);
		this.size++;
	}
	
	public void addActionListener(ActionListener listener) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.addActionListener(listener);
		}
	}
	
	public JCustomComboBox<T> get(int i) {
		return this.comboBoxList.get(i);
	}

	public void setSelectedIndex(int index) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.setSelectedIndex(index);
		}
	}
	
	public void setRangeSelectedIndex(int begin, int nbElement, int index) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.comboBoxList.get(i).setSelectedIndex(index);
		}
	}
	
	public void setSelectedItem(T item) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.setSelectedItem(item);
		}
	}
	
	public void setVisible(boolean visible) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.setVisible(visible);
		}
	}
	
	public void setRangeVisible(int begin, int nbElement, boolean visible) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.comboBoxList.get(i).setVisible(visible);
		}
	}

	public boolean setItems(T[] tabItem) {
		boolean result = true;
		
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			if(!comboBox.setItems(tabItem)) {
				result = false;
			}
		}
		
		return result;
	}
	
	public void setRangeItems(int begin, int nbElement, T[] tabItem) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.comboBoxList.get(i).setItems(tabItem);
		}
	}
	
	public void setModel(T[] tabItem) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.setModel(new DefaultComboBoxModel<>(tabItem));
		}
	}
	
	public Map<String, String> getSaveConfig() {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.size; i++) {
			T item = this.comboBoxList.get(i).getSelectedItem();
			
			String value = item instanceof Buff buff ? buff.getName(Language.FR) : "";
			config.put(this.comboBoxList.get(i).getSaveKey() + i, value);
		}
		
		return config;
	}
}
