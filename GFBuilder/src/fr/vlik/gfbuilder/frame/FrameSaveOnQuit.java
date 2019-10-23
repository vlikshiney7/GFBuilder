package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomLabel;

public class FrameSaveOnQuit extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final FrameSaveOnQuit INSTANCE = new FrameSaveOnQuit();
	
	private JCustomButton save;
	private JCustomButton leave;
	private JCustomButton cancel;
	
	private JLabel[] label;
	
	public static FrameSaveOnQuit getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveOnQuit() {
		this.setLayout(new BorderLayout());
		setLabel(Language.FR);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveOnQuit.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(450, 120);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				MainFrame.getInstance().setEnabled(true);
				MainFrame.getInstance().toFront();
			}
		});
		
		this.save = new JCustomButton(this.label[1]);
		this.save.addActionListener(e -> {
			PageOption.getInstance().overrideSave();
			end();
		});
		
		this.leave = new JCustomButton(this.label[2]);
		this.leave.addActionListener(e -> {
			end();
		});
		
		this.cancel = new JCustomButton(this.label[3]);
		this.cancel.addActionListener(e -> {
			MainFrame.getInstance().toFront();
			MainFrame.getInstance().setEnabled(true);
			this.setVisible(false);
		});
		
		JPanel pageQuit = new JPanel();
		pageQuit.setLayout(new BoxLayout(pageQuit, BoxLayout.Y_AXIS));
		pageQuit.setBackground(Design.UIColor[2]);
		pageQuit.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageQuit.add(this.label[0]);
		
		JPanel buttons = new JPanel(new GridLayout(1, 3, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		buttons.add(this.save);
		buttons.add(this.leave);
		buttons.add(this.cancel);
		
		pageQuit.add(buttons);
		
		this.add(pageQuit);
	}
	
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 14);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 14);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		this.save.updateText();
		this.leave.updateText();
		this.cancel.updateText();
	}
	
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void end() {
		SaveConfig.writeAllData();
		this.setVisible(false);
		System.exit(0);
	}
}
