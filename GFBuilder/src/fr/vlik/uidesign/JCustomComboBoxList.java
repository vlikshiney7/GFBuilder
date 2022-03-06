package fr.vlik.uidesign;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

public class JCustomComboBoxList<T> {
	
	private int size;
	private ArrayList<JCustomComboBox<T>> comboBoxList = new ArrayList<>();
	
	public JCustomComboBoxList() {
		this.comboBoxList = new ArrayList<>();
		this.size = 0;
	}
	
	public JCustomComboBoxList(int capacity) {
		this.comboBoxList = new ArrayList<>(capacity);
		this.size = capacity;
		
		for(int i = 0; i < capacity; i++) {
			this.comboBoxList.add(new JCustomComboBox<>(new DefaultComboBoxModel<>()));
		}
	}
	
	public JCustomComboBoxList(int capacity, T[] data) {
		this.comboBoxList = new ArrayList<>(capacity);
		this.size = capacity;
		
		for(int i = 0; i < capacity; i++) {
			this.comboBoxList.add(new JCustomComboBox<>(data));
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
	
	public void setRangeVisible(int begin, int end, boolean visible) {
		for(int i = begin; i < end; i++) {
			this.comboBoxList.get(i).setVisible(visible);
		}
	}
	
	public void setModel(T[] tabEnchant) {
		for(JCustomComboBox<T> comboBox : this.comboBoxList) {
			comboBox.setModel(new DefaultComboBoxModel<>(tabEnchant));
		}
	}
}
