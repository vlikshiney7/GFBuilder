package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTextPane;

public class FrameError extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JCustomLabel[] label;
	private JCustomTextPane zoneError;
	
	public FrameError(final Throwable error) {
		this.setLayout(new BorderLayout());
		this.label = Lang.getDataLabel(17);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveAs.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(500, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				System.exit(-1);
			}
		});
	    
		this.zoneError = new JCustomTextPane();
	    this.zoneError.setText(error.getMessage());
	    
		
		JPanel pageError = new JPanel();
		pageError.setLayout(new BoxLayout(pageError, BoxLayout.Y_AXIS));
		pageError.setBackground(Design.UIColor[2]);
		pageError.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageError.add(this.label[0]);
		this.label[0].setFont(Design.SUBTITLE);
		pageError.add(Box.createVerticalStrut(10));
		pageError.add(zoneError);
		
		this.add(pageError);
		
		this.setVisible(true);
	}
	
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
	}
}
