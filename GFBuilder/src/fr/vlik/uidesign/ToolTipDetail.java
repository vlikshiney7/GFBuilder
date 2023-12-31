package fr.vlik.uidesign;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.LineBorder;

import fr.vlik.grandfantasia.enums.Language;

public class ToolTipDetail<T> extends JDialog implements JUpdateLang {

	private static final long serialVersionUID = 1L;
	
	private transient T object;
	private Language lang;
	
	private JCustomLabel<T> itemTitle;
	
	private JLangLabel[] effects;
	
	public ToolTipDetail() {
		this.setLayout(new BorderLayout());
		this.setBlackUI();
		this.setUndecorated(true);
		this.setSize(300, 200);
		
		this.itemTitle = new JCustomLabel<>(null);
		setItems(null);
		
		JCustomPanel page = new JCustomPanel(new GridLayout(2, 1));
		page.setBackground(Design.UIColor[2]);
		page.setBorder(new LineBorder(Design.UIColor[0], 2));
		
		page.add(this.itemTitle);
		page.add(new JButton());
		
		this.add(page);
		
		this.setVisible(false);
	}
	
	private void setBlackUI() {
		this.setFont(Design.SUBTITLE);
		this.setForeground(Design.FontColor[0]);
	}
	
	public void setItems(T object) {
		this.object = object;
		this.itemTitle.setItem(this.object);
		
		updateLanguage(this.lang);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		this.lang = lang;
		
		this.itemTitle.updateLanguage(lang);
	}

	public void popup(Component parent) {
		this.setLocation(parent.getLocationOnScreen().x - this.getWidth() - 5, parent.getLocationOnScreen().y);
		
		if(this.getX() < 0) {
			this.setLocation(0, this.getY());
		}
		
		this.setVisible(false);
	}

	public void popoff() {
		this.setVisible(false);
	}
}
