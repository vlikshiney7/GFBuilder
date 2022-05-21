package fr.vlik.uidesign;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.template.ProcEffect;

public class JCompleteBoxList<T> {
	
	private int size;
	private ArrayList<JCompleteBox<T>> completeBoxList = new ArrayList<>();
	
	public JCompleteBoxList() {
		this.completeBoxList = new ArrayList<>();
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public List<JCompleteBox<T>> getList() {
		return this.completeBoxList;
	}
	
	public void add(JCompleteBox<T> jCustomComboBox) {
		this.completeBoxList.add(jCustomComboBox);
		this.size++;
	}
	
	public void addActionListener(ActionListener listener) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.addActionListener(listener);
		}
	}
	
	public void addProcActionListener(ActionListener listener) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.addProcActionListener(listener);
		}
	}
	
	public JCompleteBox<T> get(int i) {
		return this.completeBoxList.get(i);
	}

	public void setSelectedIndex(int index) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.setSelectedIndex(index);
		}
	}
	
	public void setRangeSelectedIndex(int begin, int nbElement, int index) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.completeBoxList.get(i).setSelectedIndex(index);
		}
	}
	
	public void setSelectedItem(T item) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.setSelectedItem(item);
		}
	}
	
	public void setVisible(boolean visible) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.setVisible(visible);
		}
	}
	
	public void setRangeVisible(int begin, int nbElement, boolean visible) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.completeBoxList.get(i).setVisible(visible);
		}
	}

	public boolean setItems(T[] tabItem) {
		boolean result = true;
		
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			if(!comboBox.setItems(tabItem)) {
				result = false;
			}
		}
		
		return result;
	}
	
	public void setRangeItems(int begin, int nbElement, T[] tabItem) {
		int end = Math.min(begin + nbElement, this.size);
		for(int i = begin; i < end; i++) {
			this.completeBoxList.get(i).setItems(tabItem);
		}
	}
	
	public void setModel(T[] tabItem) {
		for(JCompleteBox<T> comboBox : this.completeBoxList) {
			comboBox.setModel(new DefaultComboBoxModel<>(tabItem));
		}
	}
	
	public Map<String, String> getSaveConfig() {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.size; i++) {
			T item = this.completeBoxList.get(i).getSelectedItem();
			
			String value = item instanceof Writable ? ((Writable) item).getName(Language.FR) : "";
			config.put(this.completeBoxList.get(i).getSaveKey() + i, value);
			
			JCustomCheckBox<ProcEffect> proc = this.completeBoxList.get(i).getProc();
			if(proc != null) {
				config.put(this.completeBoxList.get(i).getSaveKey() + "Proc" + i, "" + proc.isSelected());
			}
		}
		
		return config;
	}
}
