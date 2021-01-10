package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JLangLabel;

public class FrameSaveOnQuit extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final FrameSaveOnQuit INSTANCE = new FrameSaveOnQuit();
	
	private JCustomButton save;
	private JCustomButton leave;
	private JCustomButton cancel;
	
	private JLangLabel[] label;
	
	public static FrameSaveOnQuit getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveOnQuit() {
		this.setLayout(new BorderLayout());
		this.label = Lang.getDataLabel(14);
		
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
		
		this.save = new JCustomButton(this.label[1].getLang(), Design.GREEN_COLOR);
		this.save.addActionListener(e -> {
			PageOption.getInstance().overrideSave();
			end();
		});
		
		this.leave = new JCustomButton(this.label[2].getLang(), Design.RED_COLOR);
		this.leave.addActionListener(e -> {
			end();
		});
		
		this.cancel = new JCustomButton(this.label[3].getLang(), Design.YELLOW_COLOR);
		this.cancel.addActionListener(e -> {
			MainFrame.getInstance().toFront();
			MainFrame.getInstance().setEnabled(true);
			this.setVisible(false);
		});
		
		updateLanguage(Language.FR);
		
		JPanel pageQuit = new JPanel();
		pageQuit.setLayout(new BoxLayout(pageQuit, BoxLayout.Y_AXIS));
		pageQuit.setBackground(Design.UIColor[2]);
		pageQuit.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageQuit.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		
		JPanel buttons = new JPanel(new GridLayout(1, 3, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		buttons.add(this.save);
		buttons.add(this.leave);
		buttons.add(this.cancel);
		
		pageQuit.add(buttons);
		
		this.add(pageQuit);
	}
	
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		this.save.updateText(lang);
		this.leave.updateText(lang);
		this.cancel.updateText(lang);
	}
	
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void end() {
		this.setVisible(false);
		System.exit(0);
	}
}
