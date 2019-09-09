package fr.vlik.uidesign;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import fr.vlik.gfbuilder.Consts;

public class JCustomComboBox<T> extends JComboBox<T> {
	
	private static final long serialVersionUID = 1L;

	public JCustomComboBox() {
		super();
		setBlackUI();
	}
	
	public JCustomComboBox(Integer i) {
		
		setBlackUI();
	}
	
	public JCustomComboBox(ComboBoxModel<T> object) {
		super(object);
		setBlackUI();
	}
	
	public JCustomComboBox(T[] object) {
		super(object);
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Consts.FontColor[0]);
		this.setOpaque(false);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getSelectedItem() {
		return (T) super.getSelectedItem();
	}
}
