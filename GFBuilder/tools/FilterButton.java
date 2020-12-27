import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FilterButton {
	
	private static CustomFrame tooltip = new CustomFrame();
	private static JButton etat;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button");
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 300);
		
		JButton filter = new JButton("Filtre");
		filter.setBorder(new EmptyBorder(20, 20, 20, 20));
		filter.setToolTipText("Filtre");
		
		filter.addActionListener(e -> {
			tooltip.popup(filter);
		});
		
		JPanel page = new JPanel();
		page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
		page.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		etat = new JButton("Checked ?");
		etat.addActionListener(e -> {
			check();
		});
		
		page.add(filter);
		page.add(etat);
		frame.add(page);
		
		frame.addWindowFocusListener(new WindowFocusListener() {
			
			@Override public void windowLostFocus(WindowEvent e) {}
			@Override public void windowGainedFocus(WindowEvent e) {
				tooltip.popoff();
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void check() {
		if(tooltip.getValue()) {
			etat.setText("Checked ? Yes");
		} else {
			etat.setText("Checked ? No");
		}
	}
}
