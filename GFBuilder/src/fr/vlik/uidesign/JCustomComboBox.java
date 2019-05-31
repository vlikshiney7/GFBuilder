package fr.vlik.uidesign;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import fr.vlik.gfbuilder.Consts;

public class JCustomComboBox<E> extends JComboBox<E> {
	
	private static final long serialVersionUID = 1L;

	public JCustomComboBox() {
		super();
		setBlackUI();
	}
	
	public JCustomComboBox(ComboBoxModel<E> object) {
		super(object);
		setBlackUI();
	}
	
	public JCustomComboBox(E[] object) {
		super(object);
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Consts.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Consts.FontColor[0]);
		this.setOpaque(false);
	}
}
