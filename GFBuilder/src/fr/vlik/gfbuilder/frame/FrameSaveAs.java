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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTextField;

public class FrameSaveAs extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameSaveAs INSTANCE = new FrameSaveAs();
	
	private JCustomTextField askName;
	private JCustomButton submit;
		
	public static FrameSaveAs getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveAs() {
		super(new BorderLayout());
		this.labels = Lang.getDataLabel(1);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveAs.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(400, 180);
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
		
		this.submit = new JCustomButton(this.labels[1].getLang(), Design.GREEN_COLOR);
		this.submit.addActionListener(e -> createSaveConfig() );
		this.submit.setAlignmentX(CENTER_ALIGNMENT);
		
		this.components.add(this.submit);
		
		JCustomPanel pageSave = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageSave.setBackground(Design.UIColor[2]);
		
		pageSave.addAll(this.labels[0], Box.createVerticalStrut(10), this.askName, Box.createVerticalStrut(10), this.submit, Box.createVerticalStrut(5), this.labels[2]);
		this.labels[0].setFont(Design.TITLE);
		this.labels[2].setFont(Design.SUBTITLE);
		this.labels[2].setForeground(Design.FontColor[1]);
		
		this.add(pageSave);
	}
	
	@Override
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		
		this.submit.setVisible(false);
		this.labels[2].setVisible(true);
		
		this.askName.setText(Overlay.getInstance().getSaveDefaultName());
		this.askName.requestFocus();
		this.setVisible(true);
	}
	
	private void checkValidity() {
		String formatFileName = this.askName.getText().replace(" ", "_");
		if(formatFileName.equals("") || formatFileName.matches(".*[\\/\\\\\\*\\?\"<>\\|:].*")) {
			this.submit.setVisible(false);
			this.labels[2].setVisible(true);
			return;
		}
		
		for(SaveConfig config : SaveConfig.getData()) {
			if(formatFileName.equals(config.getFileName())) {
				this.submit.setVisible(false);
				this.labels[2].setVisible(true);
				return;
			}
		}
		
		this.submit.setVisible(true);
		this.labels[2].setVisible(false);
	}
	
	private void createSaveConfig() {
		String formatFileName = this.askName.getText().replace(" ", "_");
		SaveConfig.writeData(formatFileName, MainFrame.getInstance().getLanguage());
		
		FrameSaveLoader.setBlocker(true);
		PageOption.getInstance().refreshSave(formatFileName);
		FrameSaveLoader.setBlocker(false);
		
		PageOption.getInstance().updateSave();
		MainFrame.getInstance().updateStat();
		Overlay.getInstance().setSave(true);
		
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.setVisible(false);
	}
}
