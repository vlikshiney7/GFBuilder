package fr.vlik.uidesign;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.ListModel;

public class JCustomList<T> extends JList<T>{
	
	private static final long serialVersionUID = 1L;

	public JCustomList() {
		super();
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.setCellRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomList(ListModel<T> object) {
		super(object);
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.setCellRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public JCustomList(T[] object) {
		super(object);
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.setCellRenderer(new CustomListCellRenderer());
		setBlackUI();
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Design.FontColor[0]);
		this.setOpaque(false);
	}
}
