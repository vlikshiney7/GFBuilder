package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomPanel;

public class FrameSaveOnQuit extends JCustomFrame {

	private static final long serialVersionUID = 1L;
	private static final FrameSaveOnQuit INSTANCE = new FrameSaveOnQuit();
	
	private JCustomButton save;
	private JCustomButton leave;
	private JCustomButton cancel;
	
	public static FrameSaveOnQuit getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveOnQuit() {
		super(new BorderLayout());
		this.labels = Lang.getDataLabel(2);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveOnQuit.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(450, 120);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				MainFrame.getInstance().setEnabled(true);
				MainFrame.getInstance().toFront();
			}
		});
		
		this.save = new JCustomButton(this.labels[1].getLang(), Design.GREEN_COLOR);
		this.save.addActionListener(e -> {
			PageOption.getInstance().overrideSave();
			end();
		});
		
		this.leave = new JCustomButton(this.labels[2].getLang(), Design.RED_COLOR);
		this.leave.addActionListener(e -> end() );
		
		this.cancel = new JCustomButton(this.labels[3].getLang(), Design.YELLOW_COLOR);
		this.cancel.addActionListener(e -> {
			MainFrame.getInstance().toFront();
			MainFrame.getInstance().setEnabled(true);
			this.setVisible(false);
		});
		
		this.components.add(this.save);
		this.components.add(this.leave);
		this.components.add(this.cancel);
		
		JCustomPanel pageQuit = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageQuit.setBackground(Design.UIColor[2]);
		pageQuit.add(this.labels[0]);
		this.labels[0].setFont(Design.TITLE);
		
		JCustomPanel buttons = new JCustomPanel(new GridLayout(1, 3, 10, 10), new EmptyBorder(10, 10, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.addAll(this.save, this.leave, this.cancel);
		
		pageQuit.add(buttons);
		
		this.add(pageQuit);
	}
	
	@Override
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void end() {
		this.setVisible(false);
		System.exit(0);
	}
}
