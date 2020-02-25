package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

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
import fr.vlik.gfbuilder.frame.FrameSaveLoader;
import fr.vlik.gfbuilder.frame.FrameSaveOnNew;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageOption extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final PageOption INSTANCE = new PageOption();
	
	private JCustomComboBox<SaveConfig> save;
	private JCustomButton newSave;
	private JCustomButton currentSave;
	private JCustomButton saveAs;
	private JTextPane parameter = new JTextPane();
	
	private JCustomLabel[] label;
	
	public static PageOption getInstance() {
		return INSTANCE;
	}
	
	private PageOption() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Design.UIColor[2]);
		this.label = Lang.getDataLabel(NUM_PAGE);
		
		this.save = new JCustomComboBox<SaveConfig>(SaveConfig.getData());
		this.save.addActionListener(e -> {
			if(!FrameSaveLoader.isBlocked()) {
				FrameSaveLoader.getInstance().popup();
			}
		});
		
		this.newSave = new JCustomButton(this.label[1], Design.YELLOW_COLOR);
		this.newSave.setToolTipText("Ctrl + N");
		this.newSave.addActionListener(e -> {
			if(!SaveConfig.fileExist()) {
				return;
			}
			
			if(!Overlay.getInstance().isSave()) {
				FrameSaveOnNew.getInstance().popup();
			} else {
				Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
				Overlay.getInstance().setSave(false);
			}
		});
		
		this.currentSave = new JCustomButton(this.label[2], Design.GREEN_COLOR);
		this.currentSave.setToolTipText("Ctrl + S");
		this.currentSave.addActionListener(e -> {
			if(!SaveConfig.fileExist()) {
				FrameSaveAs.getInstance().popup();
				return;
			}
			
			overrideSave();
			
			Overlay.getInstance().setSave(true);
		});
		
		this.saveAs = new JCustomButton(this.label[3], Design.GREEN_COLOR);
		this.saveAs.setToolTipText("Ctrl + Shift + S");
		this.saveAs.addActionListener(e -> {
			FrameSaveAs.getInstance().popup();
		});
		
		this.parameter.setEditable(false);
		this.parameter.setText(Lang.getDataCredit(Language.FR));
		this.parameter.setFont(Design.SUBTITLE);
		this.parameter.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.parameter.setBackground(Design.UIColor[1]);
		this.parameter.setForeground(Design.FontColor[0]);
		
		updateLanguage(Language.FR);
		createPanel();
	}
	
	public SaveConfig getSave() {
		return this.save.getSelectedItem();
	}
	
	public void setSave(String name) {
		boolean set = false;
		
		for(SaveConfig save : SaveConfig.getData()) {
			if(name.equals(save.getName())) {
				ActionListener action = this.save.getActionListeners()[0];
				this.save.removeActionListener(action);
				this.save.setSelectedItem(save);
				this.save.addActionListener(action);
				
				save.applyConfig();
				
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
		JPanel savePanel = new JPanel(new GridLayout(2, 1, 10, 10));
		savePanel.setBackground(Design.UIColor[1]);
		savePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JPanel inline1 = new JPanel(new GridLayout(1, 3, 10, 0));
		inline1.setBackground(Design.UIColor[1]);
		inline1.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		inline1.add(this.save);
		inline1.add(new JLabel());
		
		JPanel inline2 = new JPanel(new GridLayout(1, 3, 10, 0));
		inline2.setBackground(Design.UIColor[1]);
		inline2.add(this.newSave);
		inline2.add(this.currentSave);
		inline2.add(this.saveAs);
		
		savePanel.add(inline1);
		savePanel.add(inline2);
		
		JPanel creditPanel = new JPanel();
		creditPanel.setLayout(new BoxLayout(creditPanel, BoxLayout.Y_AXIS));
		creditPanel.setBackground(Design.UIColor[1]);
		creditPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		creditPanel.add(this.label[4]);
		this.label[4].setFont(Design.TITLE);
		creditPanel.add(Box.createVerticalStrut(10));
		creditPanel.add(this.label[5]);
		this.label[5].setFont(Design.SUBTITLE);
		creditPanel.add(Box.createVerticalStrut(5));
		creditPanel.add(this.parameter);
		
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.add(savePanel);
		this.add(Box.createVerticalStrut(10));
		this.add(creditPanel);
	}
	
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		this.newSave.updateText(lang);
		this.currentSave.updateText(lang);
		this.saveAs.updateText(lang);
		this.parameter.setText(Lang.getDataCredit(lang));
	}
	
	public void updateSave() {
		this.getSave().applyConfig();
	}
	
	public void overrideSave() {
		if(!Overlay.getInstance().isSave())	{
			this.getSave().overrideConfig();
		}
	}
	
	public void refreshSave() {
		this.save.setModel(new DefaultComboBoxModel<SaveConfig>(SaveConfig.getData()));
	}
	
	public void refreshSave(String nameSave) {
		refreshSave();
		this.save.setSelectedItem(SaveConfig.getSave(nameSave));
	}
}
