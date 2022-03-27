package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLabelTextPane;

public class FrameError extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameError INSTANCE = new FrameError();
	
	private JLabelTextPane zoneError;
	
	public static FrameError getInstance() {
		return INSTANCE;
	}
	
	private FrameError() {
		super(new BorderLayout());
		this.labels = Lang.getDataLabel(5);
		
		try {
			this.setIconImage(ImageIO.read(FrameError.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(500, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				System.exit(-1);
			}
		});
	    
		this.zoneError = new JLabelTextPane(this.labels[1]);
		
		this.components.add(this.zoneError);
		
		JCustomPanel pageError = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageError.setBackground(Design.UIColor[2]);
		
		pageError.addAll(this.labels[0], Box.createVerticalStrut(10), this.zoneError);
		this.labels[0].setFont(Design.SUBTITLE);
		
		this.add(pageError);
	}
	
	@Override
	public void popup() {
		this.setVisible(true);
	}
}
