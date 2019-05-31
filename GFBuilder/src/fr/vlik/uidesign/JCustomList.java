package fr.vlik.uidesign;

import javax.swing.JList;
import javax.swing.ListModel;

import fr.vlik.gfbuilder.Consts;

public class JCustomList<E> extends JList<E>{
	
	private static final long serialVersionUID = 1L;

	public JCustomList() {
		super();
		setBlackUI();
	}
	
	public JCustomList(ListModel<E> object) {
		super(object);
		setBlackUI();
	}
	
	public JCustomList(E[] object) {
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
