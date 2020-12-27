import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CustomFrame extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JCheckBox check;

	public CustomFrame() {
		super();
		this.setUndecorated(true);
		this.setSize(100, 50);
		
		JPanel page = new JPanel();
		page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
		page.setBorder(new LineBorder(Color.BLACK, 3));
		
		JButton close = new JButton("X");
		close.addActionListener(e -> {
			popoff();
		});
		close.setSize(20, 20);
		close.setVisible(true);
		
		this.check = new JCheckBox();
		page.add(this.check);
		page.add(close);
		this.add(page);
		
		this.setVisible(false);
	}
	
	public void popup(Component parent) {
		this.setLocation(parent.getLocationOnScreen().x + parent.getWidth(), parent.getLocationOnScreen().y - parent.getHeight());
		
		if(this.getY() < 0) {
			this.setLocation(this.getX(), 0);
		}
		
		this.setVisible(true);
	}
	
	public void popoff() {
		this.setVisible(false);
	}
	
	public boolean getValue() {
		return this.check.isSelected();
	}
}
