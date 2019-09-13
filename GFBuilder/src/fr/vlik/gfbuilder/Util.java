package fr.vlik.gfbuilder;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import fr.vlik.uidesign.JCustomComboBox;

public class Util {

	public static String setMemoryInList(ArrayList<JCustomComboBox<String>> list, int indexList, String[] itemList) {
		return setMemoryInList(list.get(indexList), itemList);
	}
	
	public static String setMemoryInList(JCustomComboBox<String> list, String[] itemList) {
		String memory = list.getSelectedItem() != null ? list.getSelectedItem().toString() : "";
		if(itemList != null) {
			list.setModel(new DefaultComboBoxModel<String>(itemList));
		}
		list.setSelectedItem(memory);
		return memory;
	}
}