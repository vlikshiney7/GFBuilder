package fr.vlik.uidesign;

import java.awt.Component;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JCustomPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public JCustomPanel() {
		super(true);
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(LayoutManager layout) {
		super(layout, true);
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(Border border) {
		super(true);
		this.setBorder(border);
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(LayoutManager layout, Border border) {
		super(layout, true);
		this.setBorder(border);
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(int layout) {
		super(true);
		this.setLayout(new BoxLayout(this, layout));
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(int layout, Border border) {
		super(true);
		this.setLayout(new BoxLayout(this, layout));
		this.setBorder(border);
		this.setBackground(Design.UIColor[1]);
	}
	
	public JCustomPanel(Component title) {
		super(true);
		this.setBackground(Design.UIColor[1]);
		this.add(title);
	}
	
	public JCustomPanel(Component... items) {
		super(true);
		this.setBackground(Design.UIColor[1]);
		this.addAll(items);
	}
	
	public void addAll(Component... items) {
		for(Component item : items) {
			if(item != null) {
				this.add(item);
			}
		}
	}

	public void addAll(ArrayList<?> items) {
		for(Object item : items) {
			if(item instanceof Component) {
				this.add((Component) item);
			}
		}
	}

	public void addAll(JCustomButtonGroup<?> items) {
		Enumeration<AbstractButton> it = items.getElements();
		do {
			this.add(it.nextElement());
		} while(it.hasMoreElements());
	}
}
