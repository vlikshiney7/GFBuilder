package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.CombiRunway;
import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.Runway;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Synthesis;
import fr.vlik.grandfantasia.equipable.Costume;
import fr.vlik.grandfantasia.equipable.Costume.CostumeType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomCheckBox;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JLangLabel;
import fr.vlik.uidesign.JLangRadioButton;

public class PageCostume extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "COSTUME";
	private static PageCostume INSTANCE = new PageCostume();
	
	private ArrayList<JLangRadioButton> costWeapon = new ArrayList<JLangRadioButton>(2);
	private ArrayList<JCustomButtonGroup<Quality>> groupQuality = new ArrayList<JCustomButtonGroup<Quality>>(5);
	private ArrayList<JCustomButtonGroup<Synthesis>> groupSynthesis = new ArrayList<JCustomButtonGroup<Synthesis>>(5);
	private ArrayList<JCustomComboBox<Costume>> costume = new ArrayList<JCustomComboBox<Costume>>(5);
	private ArrayList<JCustomComboBox<Pearl>> costPearl = new ArrayList<JCustomComboBox<Pearl>>(7);
	private ArrayList<JCustomCheckBox<CombiRunway>> checkBoxRunway = new ArrayList<JCustomCheckBox<CombiRunway>>(8);
	
	private JPanel showAndHide;
	private ArrayList<JPanel> showAndHideRunway = new ArrayList<JPanel>(4);
	
	public static PageCostume getInstance() {
		return INSTANCE;
	}
	
	private PageCostume() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabelAPI();
		
		for(int i = 0; i < 2; i++) {
			this.costWeapon.add(new JLangRadioButton(this.labelGFB[i+5].getLang()));
			this.costWeapon.get(i).setBackground(Design.UIColor[1]);
			this.costWeapon.get(i).setForeground(Design.FontColor[0]);
			this.costWeapon.get(i).addActionListener(e -> {
				updateWeaponCost();
				updateCostume(0);
				updateCostume(1);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 2; i++) {
			int id = i;
			this.groupQuality.add(new JCustomButtonGroup<Quality>());
			for(int j = 0; j < 5; j++) {
				JCustomRadioButton<Quality> radio = new JCustomRadioButton<Quality>(Costume.ORDER_QUALITY[j]);
				radio.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupQuality.get(i).add(radio);
			}
			
			this.groupSynthesis.add(new JCustomButtonGroup<Synthesis>());
			for(int j = 0; j < 2; j++) {
				JCustomRadioButton<Synthesis> synthesis = new JCustomRadioButton<Synthesis>(Synthesis.values()[j]);
				synthesis.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i).add(synthesis);
			}
			
			this.costume.add(new JCustomComboBox<Costume>());
			this.costume.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costume.get(i).setVisible(false);
			
			if(i == 0) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
				this.costPearl.get(i).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i).setVisible(false);
			}
			
			this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
			this.costPearl.get(i+1).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costPearl.get(i+1).setVisible(false);
		}
		
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				this.checkBoxRunway.add(new JCustomCheckBox<CombiRunway>(CombiRunway.get(0)));
			} else {
				this.checkBoxRunway.add(new JCustomCheckBox<CombiRunway>(CombiRunway.get(4)));
			}
			
			this.checkBoxRunway.get(i).setBackground(Design.UIColor[1]);
			
			int id = i;
			this.checkBoxRunway.get(i).addActionListener(e -> {
				updateCheckBoxRunway(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 3; i++) {
			this.groupQuality.add(new JCustomButtonGroup<Quality>());
			for(int j = 0; j < 5; j++) {
				int id = i+2;
				JCustomRadioButton<Quality> radio = new JCustomRadioButton<Quality>(Costume.ORDER_QUALITY[j]);
				radio.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupQuality.get(i+2).add(radio);
			}
			
			this.groupSynthesis.add(new JCustomButtonGroup<Synthesis>());
			for(int j = 0; j < 2; j++) {
				int id = i+2;
				JCustomRadioButton<Synthesis> synthesis = new JCustomRadioButton<Synthesis>(Synthesis.values()[j]);
				synthesis.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i+2).add(synthesis);
			}
			
			this.costume.add(new JCustomComboBox<Costume>());
			this.costume.get(i+2).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costume.get(i+2).setVisible(false);
			
			if(i == 0) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+3).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+3).setVisible(false);
			} else if(i == 1) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+3).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+3).setVisible(false);
				
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+4).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+4).setVisible(false);
			} else {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+4).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+4).setVisible(false);
			}
			
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					this.checkBoxRunway.add(new JCustomCheckBox<CombiRunway>(CombiRunway.get(i+1)));
				} else {
					this.checkBoxRunway.add(new JCustomCheckBox<CombiRunway>(CombiRunway.get(4)));
				}
				
				this.checkBoxRunway.get(i*2+j+2).setBackground(Design.UIColor[1]);
				
				int id = i*2+j+2;
				this.checkBoxRunway.get(i*2+j+2).addActionListener(e -> {
					updateCheckBoxRunway(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
		}
		
		updateLanguage(Language.FR);
		createPanel();
		updateWeaponCost();
		setEffects();
	}
	
	public Quality getGroupQuality(int i) {
		return this.groupQuality.get(i).getSelectedItem();
	}
	
	public Synthesis getGroupSynthesis(int i) {
		return this.groupSynthesis.get(i).getSelectedItem();
	}
	
	public Costume getCostume(int i) {
		return this.costume.get(i).getSelectedItem();
	}
	
	public Pearl getCostPearl(int i) {
		return this.costPearl.get(i).getSelectedItem();
	}
	
	public CombiRunway getRunway(int i) {
		return this.checkBoxRunway.get(i).getItem();
	}
	
	@Override
	protected void setLabelAPI() {
		this.labelAPI = new JLangLabel[5];
		this.labelAPI[0] = new JLangLabel(Synthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[1] = new JLangLabel(Synthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[2] = new JLangLabel(Synthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[3] = new JLangLabel(Synthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[4] = new JLangLabel(Synthesis.CLASS_NAME, Design.SUBTITLE);
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		if(this.costWeapon.get(0).isSelected()) {
			for(int i = 0; i < 2; i++) {
				if(this.getGroupQuality(i) != Quality.GREY) {
					if(this.getCostume(i) != null && this.getCostume(i).getEffects() != null) {
						for(int j = 0; j < this.getCostume(i).getEffects().length; j++) {
							list.add(this.getCostume(i).getEffects()[j]);
						}
					}
				}
			}
		} else {
			if(this.getGroupQuality(0) != Quality.GREY) {
				if(this.getCostume(0) != null && this.getCostume(0).getEffects() != null) {
					for(int j = 0; j < this.getCostume(0).getEffects().length; j++) {
						list.add(this.getCostume(0).getEffects()[j]);
					}
				}
			}
		}
		
		for(int i = 2; i < this.costume.size(); i++) {
			if(this.getGroupQuality(i) != Quality.GREY) {
				if(this.getCostume(i) != null && this.getCostume(i).getEffects() != null) {
					for(int j = 0; j < this.getCostume(i).getEffects().length; j++) {
						list.add(this.getCostume(i).getEffects()[j]);
					}
				}
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			if(!this.checkBoxRunway.get(i).isSelected()) {
				continue;
			}
			
			CombiRunway combi = this.getRunway(i);
			for(Runway runway : combi.getRunways()) {
				for(Calculable c : runway.getEffects()) {
					list.add(c);
				}
			}
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			Pearl pearl = this.getCostPearl(i);
			
			if(pearl.getEffects() != null) {
				for(Calculable c : pearl.getEffects()) {
					list.add(c);
				}
			}
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel costGroupPanel = new JPanel();
		ButtonGroup costGroup = new ButtonGroup();
		
		costGroupPanel.setBackground(Design.UIColor[1]);
		costGroupPanel.add(this.labelGFB[4]);
		this.labelGFB[4].setFont(Design.SUBTITLE);
		
		for(int i = 0; i < 2; i++) {
			costGroup.add(this.costWeapon.get(i));
			costGroupPanel.add(this.costWeapon.get(i));
		}
		
		JPanel sectionCost = new JPanel();
		sectionCost.setLayout(new BoxLayout(sectionCost, BoxLayout.Y_AXIS));
		sectionCost.setBackground(Design.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Design.UIColor[1]);
			currentQualityPanel.add(this.labelGFB[i+7]);
			this.labelGFB[i+7].setFont(Design.SUBTITLE);
			
			Enumeration<AbstractButton> itQuality = this.groupQuality.get(i).getElements();
			do {
				currentQualityPanel.add(itQuality.nextElement());
			} while(itQuality.hasMoreElements());
			
			JPanel currentSynthesisPanel = new JPanel();
			currentSynthesisPanel.setBackground(Design.UIColor[1]);
			currentSynthesisPanel.add(this.labelAPI[i]);
			
			Enumeration<AbstractButton> itSynthesis = this.groupSynthesis.get(i).getElements();
			do {
				currentSynthesisPanel.add(itSynthesis.nextElement());
			} while(itSynthesis.hasMoreElements());
			
			JPanel itemCost = new JPanel();
			itemCost.setLayout(new BoxLayout(itemCost, BoxLayout.Y_AXIS));
			itemCost.setBackground(Design.UIColor[1]);
			itemCost.add(Box.createVerticalStrut(10));
			itemCost.add(currentQualityPanel);
			itemCost.add(Box.createVerticalStrut(3));
			itemCost.add(currentSynthesisPanel);
			itemCost.add(Box.createVerticalStrut(3));
			itemCost.add(this.costume.get(i));
			if(i == 0) {
				itemCost.add(Box.createVerticalStrut(3));
				itemCost.add(this.costPearl.get(i));
			}
			itemCost.add(Box.createVerticalStrut(3));
			itemCost.add(this.costPearl.get(i+1));
			
			sectionCost.add(itemCost);
			
			if(i == 1) {
				this.showAndHide = itemCost;
			}
		}
		
		JPanel runway = new JPanel();
		runway.setBackground(Design.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			runway.add(this.checkBoxRunway.get(i));
		}
		this.showAndHideRunway.add(runway);
		
			
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(costGroupPanel);
		elem1.add(Box.createVerticalStrut(3));
		elem1.add(sectionCost);
		elem1.add(runway);
		
		this.add(elem1);
		
		
		for(int i = 0; i < 3; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Design.UIColor[1]);
			
			Enumeration<AbstractButton> it = this.groupQuality.get(i+2).getElements();
			do {
				currentQualityPanel.add(it.nextElement());
			} while(it.hasMoreElements());
			
			JPanel currentSynthesisPanel = new JPanel();
			currentSynthesisPanel.setBackground(Design.UIColor[1]);
			currentSynthesisPanel.add(this.labelAPI[i+2]);
			
			Enumeration<AbstractButton> itSynthesis = this.groupSynthesis.get(i+2).getElements();
			do {
				currentSynthesisPanel.add(itSynthesis.nextElement());
			} while(itSynthesis.hasMoreElements());
			
			
			JPanel runwayPanel = new JPanel();
			runwayPanel.setBackground(Design.UIColor[1]);
			
			for(int j = 0; j < 2; j++) {
				runwayPanel.add(this.checkBoxRunway.get(i*2+j+2));
			}
			this.showAndHideRunway.add(runwayPanel);
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.labelGFB[i+1]);
			this.labelGFB[i+1].setFont(Design.TITLE);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(currentQualityPanel);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(currentSynthesisPanel);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(this.costume.get(i+2));
			
			if(i == 0) {
				elemI.add(Box.createVerticalStrut(3));
				elemI.add(this.costPearl.get(i+3));
			} else if(i == 1) {
				elemI.add(Box.createVerticalStrut(3));
				elemI.add(this.costPearl.get(i+3));
				elemI.add(Box.createVerticalStrut(3));
				elemI.add(this.costPearl.get(i+4));
			} else {
				elemI.add(Box.createVerticalStrut(3));
				elemI.add(this.costPearl.get(i+4));
			}
			
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(runwayPanel);
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		
		this.costWeapon.get(0).setSelected(false);
		this.costWeapon.get(1).setSelected(true);
		
		for(JCustomButtonGroup<Quality> quality : this.groupQuality) {
			quality.setSelectedItem(Quality.GREY);
		}
		
		for(JCustomButtonGroup<Synthesis> synthesis : this.groupSynthesis) {
			synthesis.setSelectedItem(Synthesis.GENKI);
			synthesis.setVisible(false);
		}
		
		for(JLangLabel label : this.labelAPI) {
			label.setVisible(false);
		}
		
		for(JPanel panel : this.showAndHideRunway) {
			panel.setVisible(false);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(JLangLabel label : this.labelAPI) {
			label.updateText(lang);
		}
		
		for(JLangRadioButton button : this.costWeapon) {
			button.updateText(lang);
		}
		
		for(int i = 0; i < this.groupQuality.size(); i++) {
			this.groupQuality.get(i).updateText(lang);
		}
		
		for(int i = 0; i < this.groupSynthesis.size(); i++) {
			this.groupSynthesis.get(i).updateText(lang);
		}
		
		for(JCustomCheckBox<CombiRunway> checkBox : this.checkBoxRunway) {
			checkBox.updateText(lang);
		}
	}
	
	private void updateCostume(int id) {
		CostumeType type = null;
		switch (id) {
			case 0:	type = this.costWeapon.get(0).isSelected() ? CostumeType.DosArme1M : CostumeType.Arme2M;	break;
			case 1:	type = CostumeType.DosArme1M;	break;
			case 2:	type = CostumeType.TeteCorps;	break;
			case 3:	type = CostumeType.TeteCorps;	break;
			case 4:	type = CostumeType.DosArme1M;	break;
		}
		
		Costume[] cost = Costume.getPossibleCostume(this.getGroupSynthesis(id), type, this.getGroupQuality(id));
		
		if(cost == null) {
			this.labelAPI[id].setVisible(false);
			this.groupSynthesis.get(id).setVisible(false);
			this.costume.get(id).setVisible(false);
		} else {
			this.labelAPI[id].setVisible(true);
			this.groupSynthesis.get(id).setVisible(true);
			this.costume.get(id).setVisible(true);
			
			Costume memory = this.getCostume(id);
			this.costume.get(id).setModel(new DefaultComboBoxModel<Costume>(cost));
			
			if(memory != null) {
				Costume retrieve = Costume.getFromList(memory.getName(), cost);
				this.costume.get(id).setSelectedItem(retrieve);
			} else {
				this.costume.get(id).setSelectedIndex(0);
			}
		}
		
		if(this.getGroupQuality(id) == Quality.GREY) {
			if(id == 0) {
				this.costPearl.get(id).setVisible(false);
				this.costPearl.get(id).setSelectedIndex(0);
				this.costPearl.get(id+1).setVisible(false);
				this.costPearl.get(id+1).setSelectedIndex(0);
			} else if(id < 3) {
				this.costPearl.get(id+1).setVisible(false);
				this.costPearl.get(id+1).setSelectedIndex(0);
			}  else if(id == 3) {
				this.costPearl.get(id+1).setVisible(false);
				this.costPearl.get(id+1).setSelectedIndex(0);
				this.costPearl.get(id+2).setVisible(false);
				this.costPearl.get(id+2).setSelectedIndex(0);
			} else {
				this.costPearl.get(id+2).setVisible(false);
				this.costPearl.get(id+2).setSelectedIndex(0);
			}
			
			if(id == 0) {
				updateCheckBoxRunway(0);
				updateCheckBoxRunway(1);
				
				if(this.groupQuality.get(0).getSelectedItem() == Quality.GREY && this.groupQuality.get(1).getSelectedItem() == Quality.GREY) {
					this.showAndHideRunway.get(id).setVisible(false);
				}
			} else if(id == 1) {
				updateCheckBoxRunway(id*2-2);
				updateCheckBoxRunway(id*2-1);
				
				if(this.groupQuality.get(0).getSelectedItem() == Quality.GREY && this.groupQuality.get(1).getSelectedItem() == Quality.GREY) {
					this.showAndHideRunway.get(id-1).setVisible(false);
				}
			} else {
				updateCheckBoxRunway(id*2-2);
				updateCheckBoxRunway(id*2-1);
				this.showAndHideRunway.get(id-1).setVisible(false);
			}
		} else {
			if(id == 0) {
				this.costPearl.get(id).setVisible(true);
				this.costPearl.get(id+1).setVisible(true);
			} else if(id < 3) {
				this.costPearl.get(id+1).setVisible(true);
			}  else if(id == 3) {
				this.costPearl.get(id+1).setVisible(true);
				this.costPearl.get(id+2).setVisible(true);
			} else {
				this.costPearl.get(id+2).setVisible(true);
			}
			
			if(id == 0) {
				this.showAndHideRunway.get(id).setVisible(true);
			} else {
				this.showAndHideRunway.get(id-1).setVisible(true);
			}
		}
		
		if(this.costWeapon.get(0).isSelected() || this.groupQuality.get(0).getSelectedItem() == Quality.GREY) {
			this.costPearl.get(1).setVisible(false);
			this.costPearl.get(1).setSelectedIndex(0);
		}
	}
	
	private void updateWeaponCost() {
		if(this.costWeapon.get(0).isSelected()) {
			this.showAndHide.setVisible(true);
			this.costPearl.get(1).setVisible(false);
			this.costPearl.get(1).setSelectedIndex(0);
			
			if(this.groupQuality.get(1).getSelectedItem() != Quality.GREY) {
				this.showAndHideRunway.get(0).setVisible(true);
			}
		} else {
			this.showAndHide.setVisible(false);
			
			this.groupQuality.get(1).setSelectedItem(Quality.GREY);
			
			if(this.groupQuality.get(0).getSelectedItem() != Quality.GREY) {
				this.costPearl.get(1).setVisible(true);
			} else {
				this.showAndHideRunway.get(0).setVisible(false);
			}
		}
		
		updateCheckBoxRunway(0);
		updateCheckBoxRunway(1);
	}
	
	private void updateCheckBoxRunway(int index) {
		int indexPair = (index % 2 == 0) ? index + 1 : index -1;
		int indexQuality = index/2 +1;
		
		if(indexQuality == 1) {
			if(this.groupQuality.get(0).getSelectedItem() == Quality.GREY && this.groupQuality.get(1).getSelectedItem() == Quality.GREY) {
				this.checkBoxRunway.get(index).setSelected(false);
			}
		} else if(this.groupQuality.get(indexQuality).getSelectedItem() == Quality.GREY) {
			this.checkBoxRunway.get(index).setSelected(false);
		}
		
		if(this.checkBoxRunway.get(index).isSelected()) {
			this.checkBoxRunway.get(indexPair).setSelected(false);
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		int select = 1;
		while(select > 0) {
			if(this.costWeapon.get(select).isSelected()) {
				break;
			}
			
			select--;
		}
		
		config.put("1or2Hand", "" + select);
		
		for(int i = 0; i < this.groupQuality.size(); i++) {
			Quality quality = this.groupQuality.get(i).getSelectedItem();
			config.put("CostQuality" + i, "" + quality);
		}
		
		for(int i = 0; i < this.groupSynthesis.size(); i++) {
			Synthesis synthesis = this.groupSynthesis.get(i).getSelectedItem();
			config.put("CostSynthesis" + i, "" + synthesis);
		}
		
		for(int i = 0; i < this.costume.size(); i++) {
			String value = this.getCostume(i) != null ? this.getCostume(i).getName() : "";
			config.put("Costume" + i, value);
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			config.put("Pearl" + i, this.getCostPearl(i).getName());
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			config.put("CheckboxRunway" + i, "" + (this.checkBoxRunway.get(i).isSelected() ? true : false));
		}
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		int hand = Integer.valueOf(config.get("1or2Hand"));
		for(int i = 0; i < this.costWeapon.size(); i++) {
			if(i == hand) {
				this.costWeapon.get(i).setSelected(true);
				updateWeaponCost();
			} else {
				this.costWeapon.get(i).setSelected(false);
			}
		}
		
		for(int i = 0; i < this.costume.size(); i++) {
			Quality quality = Quality.valueOf(config.get("CostQuality" + i) != null ? config.get("CostQuality" + i) : Quality.GREY.toString());
			this.groupQuality.get(i).setSelectedItem(quality);
			
			Synthesis synthesis = Synthesis.valueOf(config.get("CostSynthesis" + i) != null ? config.get("CostSynthesis" + i) : Synthesis.GENKI.toString());
			this.groupSynthesis.get(i).setSelectedItem(synthesis);
			
			updateCostume(i);
			
			CostumeType type = null;
			switch (i) {
				case 0:	type = this.costWeapon.get(0).isSelected() ? CostumeType.DosArme1M : CostumeType.Arme2M;	break;
				case 1:	type = CostumeType.DosArme1M;	break;
				case 2:	type = CostumeType.TeteCorps;	break;
				case 3:	type = CostumeType.TeteCorps;	break;
				case 4:	type = CostumeType.DosArme1M;	break;
			}
			
			Costume costume = Costume.get(config.get("Costume" + i), synthesis, type, quality);
			
			if(costume != null) {
				this.costume.get(i).setSelectedItem(costume);
			}
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			if(i < 2) {
				Pearl pearl = Pearl.getWeaponCost(config.get("Pearl" + i));
				
				if(pearl == null) {
					this.costPearl.get(i).setSelectedIndex(0);
				} else {
					this.costPearl.get(i).setSelectedItem(pearl);
				}
			} else {
				Pearl pearl = Pearl.getArmorCost(config.get("Pearl" + i));
				
				if(pearl == null) {
					this.costPearl.get(i).setSelectedIndex(0);
				} else {
					this.costPearl.get(i).setSelectedItem(pearl);
				}
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			this.checkBoxRunway.get(i).setSelected(Boolean.valueOf(config.get("CheckboxRunway" + i)));
		}
		
		setEffects();
	}
}
