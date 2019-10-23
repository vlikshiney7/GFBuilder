package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.frame.FrameSaveAs;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageOption extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final PageOption INSTANCE = new PageOption();
	
	private JCustomComboBox<SaveConfig> save;
	private JCustomButton currentSave;
	private JCustomButton newSave;
	private JTextPane parameter = new JTextPane();
	
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
			
			Overlay.getInstance().setSave(true);
		});
		
		this.currentSave = new JCustomButton(this.label[1]);
		this.currentSave.addActionListener(e -> {
			overrideSave();
			
			Overlay.getInstance().setSave(true);
		});
		
		this.newSave = new JCustomButton(this.label[2]);
		this.newSave.addActionListener(e -> {
			FrameSaveAs.getInstance().popup();
		});
		
		this.parameter.setEditable(false);
		this.parameter.setText(Lang.getDataCredit(Language.FR));
		this.parameter.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.parameter.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.parameter.setBackground(Design.UIColor[1]);
		this.parameter.setForeground(Design.FontColor[0]);
		
		
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
		
		this.currentSave.updateText();
		this.newSave.updateText();
		this.parameter.setText(Lang.getDataCredit(lang));
	}
	
	private void updateSave() {
		this.getSave().setConfig();
	}
	
	public void overrideSave() {
		this.getSave().overrideConfig();
	}
	
	public void refreshSave(String nameSave) {
		this.save.setModel(new DefaultComboBoxModel<SaveConfig>(SaveConfig.getData()));
		this.save.setSelectedItem(SaveConfig.getSave(nameSave));
	}
}
