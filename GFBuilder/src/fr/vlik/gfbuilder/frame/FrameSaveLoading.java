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

public class FrameSaveLoading extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameSaveLoading INSTANCE = new FrameSaveLoading();
	
	private JCustomButton load;
	private JCustomButton delete;
	private JCustomButton cancel;
	
	private JLabel[] label;
	
	public static FrameSaveLoading getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveLoading() {
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
		
		this.load = new JCustomButton(this.label[1]);
		this.load.addActionListener(e -> {
			PageOption.getInstance().updateSave();
			MainFrame.getInstance().updateStat();
			Overlay.getInstance().setSave(true);
			
			close();
		});
		
		this.delete = new JCustomButton(this.label[2]);
		this.delete.addActionListener(e -> {
			SaveConfig.deleteData(PageOption.getInstance().getSave());
			PageOption.getInstance().refreshSave();
			
			close();
		});
		
		this.cancel = new JCustomButton(this.label[3]);
		this.cancel.addActionListener(e -> {
			close();
		});
		
		JPanel pageLoad = new JPanel();
		pageLoad.setLayout(new BoxLayout(pageLoad, BoxLayout.Y_AXIS));
		pageLoad.setBackground(Design.UIColor[2]);
		pageLoad.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageLoad.add(this.label[0]);
		
		JPanel buttons = new JPanel(new GridLayout(1, 3, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		buttons.add(this.load);
		buttons.add(this.delete);
		buttons.add(this.cancel);
		
		pageLoad.add(buttons);
		
		this.add(pageLoad);
	}
	
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 15);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 15);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		this.load.updateText();
		this.delete.updateText();
		this.cancel.updateText();
	}
	
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void close() {
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.setVisible(false);
	}
}