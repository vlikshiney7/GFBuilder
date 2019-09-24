package fr.vlik.uidesign;

import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

public class JCustomComboBox<T> extends JComboBox<T> {
	
	private static final long serialVersionUID = 1L;

	public JCustomComboBox() {
		super();
		this.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(ComboBoxModel<T> object) {
		super(object);
		this.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomComboBox(T[] object) {
		super(object);
		this.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
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
