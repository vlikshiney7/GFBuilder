package fr.vlik.gfbuilder.page;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTextField;

public class PageOption extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static PageOption INSTANCE = new PageOption();
	
	private JCustomComboBox<SaveConfig> save;
	private JCustomButton currentSave;
	private JCustomButton newSave;
	private JTextPane parameter = new JTextPane();
	
	private JFrame windowSave;
	private JCustomTextField askName;
	private JCustomButton submit;
	
	private JLabel[] label;
	
	public static PageOption getInstance() {
		return INSTANCE;
	}
	
	private PageOption() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Design.UIColor[2]);
		setLabel(Language.FR);
		
		this.save = new JCustomComboBox<SaveConfig>(SaveConfig.getData());
		this.save.addActionListener(e -> {
			updateSave();
			
			Overlay.getInstance().setNameSave(this.getSave().getName());
			
			MainFrame.getInstance().updateStat();
		});
		
		this.currentSave = new JCustomButton(this.label[1]);
		this.currentSave.addActionListener(e -> {
			overrideSave();
		});
		
		this.newSave = new JCustomButton(this.label[2]);
		this.newSave.addActionListener(e -> {
			popup();
		});
		
		this.parameter.setEditable(false);
		this.parameter.setText(Lang.getDataCredit(Language.FR));
		this.parameter.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.parameter.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.parameter.setBackground(Design.UIColor[1]);
		this.parameter.setForeground(Design.FontColor[0]);
		
		
		this.windowSave = new JFrame();
		this.windowSave.setLayout(new BorderLayout());
		
		try {
			this.windowSave.setIconImage(ImageIO.read(PageOption.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.windowSave.setSize(400, 180);
		this.windowSave.setResizable(false);
		this.windowSave.setLocationRelativeTo(null);
		this.windowSave.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.windowSave.addWindowListener(new WindowAdapter() {
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
		
		this.submit = new JCustomButton(this.label[6]);
		this.submit.addActionListener(e -> {
			addSaveConfig();
		});
		this.submit.setAlignmentX(CENTER_ALIGNMENT);
		
		createPanel();
	}
	
	public SaveConfig getSave() {
		return this.save.getSelectedItem();
	}
	
	public void setSave(String name) {
		boolean set = false;
		
		for(SaveConfig save : SaveConfig.data) {
			if(name.equals(save.getName())) {
				this.save.setSelectedItem(save);
				set = true;
				System.out.println("Save " + save.getName() + " loaded");
				break;
			}
		}
		
		if(!set) {
			System.out.println("Error, save not found");
		}
	}
	
	protected void createPanel() {
		JPanel savePanel = new JPanel(new GridLayout(1, 4, 10, 10));
		savePanel.setBackground(Design.UIColor[1]);
		savePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		savePanel.add(this.label[0]);
		savePanel.add(this.save);
		savePanel.add(this.currentSave);
		savePanel.add(this.newSave);
		
		JPanel creditPanel = new JPanel();
		creditPanel.setLayout(new BoxLayout(creditPanel, BoxLayout.Y_AXIS));
		creditPanel.setBackground(Design.UIColor[1]);
		creditPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		creditPanel.add(this.label[3]);
		creditPanel.add(Box.createVerticalStrut(10));
		this.label[4].setFont(new Font("Open Sans", Font.BOLD, 14));
		creditPanel.add(this.label[4]);
		creditPanel.add(Box.createVerticalStrut(5));
		creditPanel.add(this.parameter);
		
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.add(savePanel);
		this.add(Box.createVerticalStrut(10));
		this.add(creditPanel);
		
		
		JPanel pageSave = new JPanel();
		pageSave.setLayout(new BoxLayout(pageSave, BoxLayout.Y_AXIS));
		pageSave.setBackground(Design.UIColor[2]);
		pageSave.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageSave.add(this.label[5]);
		pageSave.add(Box.createVerticalStrut(10));
		pageSave.add(this.askName);
		pageSave.add(Box.createVerticalStrut(10));
		pageSave.add(this.submit);
		pageSave.add(Box.createVerticalStrut(5));
		this.label[7].setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.label[7].setForeground(Design.FontColor[1]);
		pageSave.add(this.label[7]);
		
		this.windowSave.add(pageSave);
	}

	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 12);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 12);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		this.newSave.updateText();
		this.parameter.setText(Lang.getDataCredit(lang));
	}
	
	private void updateSave() {
		this.getSave().setConfig();
	}
	
	private void overrideSave() {
		this.getSave().overrideConfig();
	}
	
	private void popup() {
		MainFrame.getInstance().setEnabled(false);
		
		this.submit.setVisible(false);
		this.label[7].setVisible(true);
		
		this.askName.requestFocus();
		this.windowSave.setVisible(true);
	}
	
	private void checkValidity() {
		if(this.askName.getText().equals("")) {
			this.submit.setVisible(false);
			this.label[7].setVisible(true);
			return;
		}
		
		for(SaveConfig config : SaveConfig.data) {
			if(this.askName.getText().equals(config.getName())) {
				this.submit.setVisible(false);
				this.label[7].setVisible(true);
				return;
			}
		}
		
		this.submit.setVisible(true);
		this.label[7].setVisible(false);
	}
	
	private void addSaveConfig() {
		SaveConfig.writeData(this.askName.getText());
		
		
		this.save.setModel(new DefaultComboBoxModel<SaveConfig>(SaveConfig.getData()));
		this.save.setSelectedItem(SaveConfig.getSave(this.askName.getText()));
		
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.windowSave.setVisible(false);
	}
}
