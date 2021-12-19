package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLabelTextPane;
import fr.vlik.uidesign.JLangLabel;

public class FrameError extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameError INSTANCE = new FrameError();
	
	private JLangLabel[] label;
	private JLabelTextPane zoneError;
	
	public static FrameError getInstance() {
		return INSTANCE;
	}
	
	private FrameError() {
		super(new BorderLayout());
		this.label = Lang.getDataLabel(5);
		
		try {
			this.setIconImage(ImageIO.read(FrameError.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(500, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				System.exit(-1);
			}
		});
	    
		this.zoneError = new JLabelTextPane(this.label[1]);
		
		updateLanguage(Language.FR);
		
		JCustomPanel pageError = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageError.setBackground(Design.UIColor[2]);
		
		pageError.addAll(this.label[0], Box.createVerticalStrut(10), this.zoneError);
		this.label[0].setFont(Design.SUBTITLE);
		
		this.add(pageError);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		this.label[0].updateText(lang);
		this.zoneError.updateText(lang);
	}
	
	@Override
	public void popup() {
		this.setVisible(true);
	}
}
