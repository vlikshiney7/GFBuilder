package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.frame.FrameCreateCustom;
import fr.vlik.gfbuilder.frame.FrameSaveAs;
import fr.vlik.gfbuilder.frame.FrameSaveLoader;
import fr.vlik.gfbuilder.frame.FrameSaveOnNew;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageOption extends JCustomPanel {
	
	private static final long serialVersionUID = 1L;
	private static final PageOption INSTANCE = new PageOption();
	
	private JCustomComboBox<SaveConfig> save;
	private JCustomButton newSave;
	private JCustomButton currentSave;
	private JCustomButton saveAs;
	private JCustomButton createCustom;
	private JTextPane parameter = new JTextPane();
	
	private JLangLabel[] label;
	
	public static PageOption getInstance() {
		return INSTANCE;
	}
	
	private PageOption() {
		super(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[2]);
		this.label = Lang.getDataLabel(0);
		
		this.save = new JCustomComboBox<SaveConfig>(SaveConfig.getData());
		this.save.addActionListener(e -> {
			if(!FrameSaveLoader.isBlocked()) {
				FrameSaveLoader.getInstance().popup();
			}
		});
		
		this.newSave = new JCustomButton(this.label[1].getLang(), Design.YELLOW_COLOR);
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
		
		this.currentSave = new JCustomButton(this.label[2].getLang(), Design.GREEN_COLOR);
		this.currentSave.setToolTipText("Ctrl + S");
		this.currentSave.addActionListener(e -> {
			if(!SaveConfig.fileExist()) {
				FrameSaveAs.getInstance().popup();
				return;
			}
			
			overrideSave();
			
			Overlay.getInstance().setSave(true);
		});
		
		this.saveAs = new JCustomButton(this.label[3].getLang(), Design.GREEN_COLOR);
		this.saveAs.setToolTipText("Ctrl + Shift + S");
		this.saveAs.addActionListener(e -> {
			FrameSaveAs.getInstance().popup();
		});
		
		this.createCustom = new JCustomButton(this.label[4].getLang(), Design.GREEN_COLOR);
		this.createCustom.addActionListener(e -> {
			FrameCreateCustom.getInstance().popup(0, PageGeneral.getInstance().getLvl());
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
		JCustomPanel inline1 = new JCustomPanel(BoxLayout.X_AXIS);
		inline1.addAll(this.label[0], Box.createVerticalStrut(10), this.save);
		this.label[0].setFont(Design.TITLE);
		
		JCustomPanel inline2 = new JCustomPanel(new GridLayout(1, 3, 10, 0));
		inline2.addAll(this.newSave, this.currentSave, this.saveAs);
		
		JCustomPanel savePanel = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		savePanel.addAll(inline1, inline2);
		
		JCustomPanel equipPanel = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		equipPanel.add(this.createCustom);
		
		JCustomPanel creditPanel = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		creditPanel.addAll(this.label[5], Box.createVerticalStrut(10), this.label[6], Box.createVerticalStrut(5), this.parameter);
		this.label[5].setFont(Design.TITLE);
		this.label[6].setFont(Design.SUBTITLE);
		
		this.addAll(savePanel, Box.createVerticalStrut(10), equipPanel, Box.createVerticalStrut(10), creditPanel);
	}
	
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		this.newSave.updateText(lang);
		this.currentSave.updateText(lang);
		this.saveAs.updateText(lang);
		this.createCustom.updateText(lang);
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
		this.save.setItems(SaveConfig.getData());
	}
	
	public void refreshSave(String nameSave) {
		refreshSave();
		this.save.setSelectedItem(SaveConfig.getSave(nameSave));
	}
}
