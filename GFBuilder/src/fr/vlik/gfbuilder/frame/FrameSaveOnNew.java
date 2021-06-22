package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class FrameSaveOnNew extends JCustomFrame {

	private static final long serialVersionUID = 1L;
	private static final FrameSaveOnNew INSTANCE = new FrameSaveOnNew();
	
	private JCustomButton save;
	private JCustomButton notSave;
	private JCustomButton cancel;
	
	private JLangLabel[] label;
	
	public static FrameSaveOnNew getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveOnNew() {
		super(new BorderLayout());
		this.label = Lang.getDataLabel(16);
		
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
			
			Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
			
			close();
		});
		
		this.notSave = new JCustomButton(this.label[2].getLang(), Design.RED_COLOR);
		this.notSave.addActionListener(e -> {
			Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
			Overlay.getInstance().setSave(false);
			
			close();
		});
		
		this.cancel = new JCustomButton(this.label[3].getLang(), Design.YELLOW_COLOR);
		this.cancel.addActionListener(e -> {
			MainFrame.getInstance().toFront();
			MainFrame.getInstance().setEnabled(true);
			this.setVisible(false);
		});
		
		updateLanguage(Language.FR);
		
		JCustomPanel pageNew = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageNew.setBackground(Design.UIColor[2]);
		pageNew.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		
		JCustomPanel buttons = new JCustomPanel(new GridLayout(1, 3, 10, 10), new EmptyBorder(10, 10, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.addAll(this.save, this.notSave, this.cancel);
		
		pageNew.add(buttons);
		
		this.add(pageNew);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		this.save.updateText(lang);
		this.notSave.updateText(lang);
		this.cancel.updateText(lang);
	}
	
	@Override
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
