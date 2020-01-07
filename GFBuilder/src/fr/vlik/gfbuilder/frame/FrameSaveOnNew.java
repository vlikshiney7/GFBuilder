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
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomLabel;

public class FrameSaveOnNew extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final FrameSaveOnNew INSTANCE = new FrameSaveOnNew();
	
	private JCustomButton save;
	private JCustomButton notSave;
	private JCustomButton cancel;
	
	private JLabel[] label;
	
	public static FrameSaveOnNew getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveOnNew() {
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
		
		this.save = new JCustomButton(this.label[1], Design.GREEN_COLOR);
		this.save.addActionListener(e -> {
			PageOption.getInstance().overrideSave();
			
			Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
			
			close();
		});
		
		this.notSave = new JCustomButton(this.label[2], Design.RED_COLOR);
		this.notSave.addActionListener(e -> {
			Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
			
			close();
		});
		
		this.cancel = new JCustomButton(this.label[3], Design.YELLOW_COLOR);
		this.cancel.addActionListener(e -> {
			MainFrame.getInstance().toFront();
			MainFrame.getInstance().setEnabled(true);
			this.setVisible(false);
		});
		
		JPanel pageNew = new JPanel();
		pageNew.setLayout(new BoxLayout(pageNew, BoxLayout.Y_AXIS));
		pageNew.setBackground(Design.UIColor[2]);
		pageNew.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageNew.add(this.label[0]);
		
		JPanel buttons = new JPanel(new GridLayout(1, 3, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		buttons.add(this.save);
		buttons.add(this.notSave);
		buttons.add(this.cancel);
		
		pageNew.add(buttons);
		
		this.add(pageNew);
	}
	
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 16);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 16);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		this.save.updateText();
		this.notSave.updateText();
		this.cancel.updateText();
	}
	
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void close() {
		MainFrame.getInstance().setEnabled(true);
		MainFrame.getInstance().toFront();
		this.setVisible(false);
	}
}
