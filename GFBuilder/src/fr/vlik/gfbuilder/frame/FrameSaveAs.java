package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTextField;

public class FrameSaveAs extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameSaveAs INSTANCE = new FrameSaveAs();
	
	private JCustomTextField askName;
	private JCustomButton submit;
	
	private JLabel[] label;
	
	public static FrameSaveAs getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveAs() {
		this.setLayout(new BorderLayout());
		setLabel(Language.FR);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveAs.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(400, 180);
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
		
		this.askName = new JCustomTextField();
		this.askName.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				checkValidity();
			}
			public void removeUpdate(DocumentEvent e) {
				checkValidity();
			}
			public void insertUpdate(DocumentEvent e) {
				checkValidity();
			}
		});
		
		this.submit = new JCustomButton(this.label[1]);
		this.submit.addActionListener(e -> {
			createSaveConfig();
		});
		this.submit.setAlignmentX(CENTER_ALIGNMENT);
		
		
		JPanel pageSave = new JPanel();
		pageSave.setLayout(new BoxLayout(pageSave, BoxLayout.Y_AXIS));
		pageSave.setBackground(Design.UIColor[2]);
		pageSave.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageSave.add(this.label[0]);
		pageSave.add(Box.createVerticalStrut(10));
		pageSave.add(this.askName);
		pageSave.add(Box.createVerticalStrut(10));
		pageSave.add(this.submit);
		pageSave.add(Box.createVerticalStrut(5));
		this.label[2].setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.label[2].setForeground(Design.FontColor[1]);
		pageSave.add(this.label[2]);
		
		this.add(pageSave);
	}
	
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 13);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 13);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
	}
	
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		
		this.submit.setVisible(false);
		this.label[2].setVisible(true);
		
		this.askName.setText(Overlay.getInstance().getSaveDefaultName());
		this.askName.requestFocus();
		this.setVisible(true);
	}
	
	private void checkValidity() {
		if(this.askName.getText().equals("") || this.askName.getText().matches(".*[\\/\\\\\\*\\?\"<>\\|:].*")) {
			this.submit.setVisible(false);
			this.label[2].setVisible(true);
			return;
		}
		
		for(SaveConfig config : SaveConfig.getData()) {
			if(this.askName.getText().equals(config.getName())) {
				this.submit.setVisible(false);
				this.label[2].setVisible(true);
				return;
			}
		}
		
		this.submit.setVisible(true);
		this.label[2].setVisible(false);
	}
	
	private void createSaveConfig() {
		SaveConfig.writeData(this.askName.getText(), MainFrame.getInstance().getLanguage());
		
		FrameSaveLoader.setBlocker(true);
		PageOption.getInstance().refreshSave(this.askName.getText());
		FrameSaveLoader.setBlocker(false);
		
		PageOption.getInstance().updateSave();
		MainFrame.getInstance().updateStat();
		Overlay.getInstance().setSave(true);
		
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.setVisible(false);
	}
}
