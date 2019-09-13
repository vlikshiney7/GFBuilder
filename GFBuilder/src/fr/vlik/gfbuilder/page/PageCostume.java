package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Quality;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Costume;
import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.Runway;
import fr.vlik.grandfantasia.Costume.CostType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomCheckBox;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;

public class PageCostume extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static PageCostume INSTANCE = new PageCostume();
	
	private ArrayList<JCustomRadioButton> costWeapon = new ArrayList<JCustomRadioButton>(2);
	private ArrayList<JCustomCheckBox> checkBoxRunway = new ArrayList<JCustomCheckBox>(8);
	private ArrayList<ArrayList<JCustomRadioButton>> costQuality = new ArrayList<ArrayList<JCustomRadioButton>>(5);
	private ArrayList<JCustomComboBox<Costume>> costume = new ArrayList<JCustomComboBox<Costume>>(5);
	private ArrayList<JCustomComboBox<Pearl>> costPearl = new ArrayList<JCustomComboBox<Pearl>>(7);
	
	private JPanel showAndHide;
	private ArrayList<JPanel> showAndHideRunway = new ArrayList<JPanel>(4);
	
	public static PageCostume getInstance() {
		return INSTANCE;
	}
	
	private PageCostume() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		for(int i = 0; i < 2; i++) {
			this.costWeapon.add(new JCustomRadioButton(this.label[i+5].getText(), "radio11", "radioOff"));
			this.costWeapon.get(i).setBackground(Consts.UIColor[1]);
			this.costWeapon.get(i).setForeground(Consts.FontColor[0]);
			this.costWeapon.get(i).addActionListener(e -> {
				updateWeaponCost();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 2; i++) {
			int id = i;
			this.costQuality.add(new ArrayList<JCustomRadioButton>(5));
			for(int j = 0; j < 5; j++) {
				this.label[j+9].setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.costQuality.get(i).add(new JCustomRadioButton(this.label[j+9].getText(), "radio1" + j, "radioOff"));
				this.costQuality.get(i).get(j).setBackground(Consts.UIColor[1]);
				this.costQuality.get(i).get(j).setForeground(Consts.costColor[j]);
				this.costQuality.get(i).get(j).addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			this.costume.add(new JCustomComboBox<Costume>());
			this.costume.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.costume.get(i).setRenderer(new CustomListCellRenderer());
			this.costume.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costume.get(i).setVisible(false);
			
			if(i == 0) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
				this.costPearl.get(i).setRenderer(new CustomListCellRenderer());
				this.costPearl.get(i).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i).setVisible(false);
			}
			
			this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
			this.costPearl.get(i+1).setRenderer(new CustomListCellRenderer());
			this.costPearl.get(i+1).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costPearl.get(i+1).setVisible(false);
		}
		
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				this.checkBoxRunway.add(new JCustomCheckBox(this.label[14].getText()));
				this.checkBoxRunway.get(i).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[0]));
			} else {
				this.checkBoxRunway.add(new JCustomCheckBox(this.label[18].getText()));
				this.checkBoxRunway.get(i).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[4]));
			}
			
			this.checkBoxRunway.get(i).setBackground(Consts.UIColor[1]);
			this.checkBoxRunway.get(i).setForeground(Consts.FontColor[0]);
			
			int id = i;
			this.checkBoxRunway.get(i).addActionListener(e -> {
				updateCheckBoxRunway(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 3; i++) {
			this.costQuality.add(new ArrayList<JCustomRadioButton>(5));
			for(int j = 0; j < 5; j++) {
				int id = i+2;
				this.label[j+9].setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.costQuality.get(i+2).add(new JCustomRadioButton(this.label[j+9].getText(), "radio1" + j, "radioOff"));
				this.costQuality.get(i+2).get(j).setBackground(Consts.UIColor[1]);
				this.costQuality.get(i+2).get(j).setForeground(Consts.costColor[j]);
				this.costQuality.get(i+2).get(j).addActionListener(e -> {
					updateCostume(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			this.costume.add(new JCustomComboBox<Costume>());
			this.costume.get(i+2).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.costume.get(i+2).setRenderer(new CustomListCellRenderer());
			this.costume.get(i+2).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.costume.get(i+2).setVisible(false);
			
			if(i == 0) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.costPearl.get(i+3).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+3).setVisible(false);
			} else if(i == 1) {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.costPearl.get(i+3).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+3).setVisible(false);
				
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+4).setRenderer(new CustomListCellRenderer());
				this.costPearl.get(i+4).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+4).setVisible(false);
			} else {
				this.costPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.costPearl.get(i+4).setRenderer(new CustomListCellRenderer());
				this.costPearl.get(i+4).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.costPearl.get(i+4).setVisible(false);
			}
			
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					this.checkBoxRunway.add(new JCustomCheckBox(this.label[i+15].getText()));
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[i+1]));
				} else {
					this.checkBoxRunway.add(new JCustomCheckBox(this.label[18].getText()));
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[4]));
				}
				
				this.checkBoxRunway.get(i*2+j+2).setBackground(Consts.UIColor[1]);
				this.checkBoxRunway.get(i*2+j+2).setForeground(Consts.FontColor[0]);
				
				int id = i*2+j+2;
				this.checkBoxRunway.get(i*2+j+2).addActionListener(e -> {
					updateCheckBoxRunway(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
		}
		
		this.costWeapon.get(0).setSelected(false);
		this.costWeapon.get(1).setSelected(true);
		
		createPanel();
		updateWeaponCost();
		setEffects();
	}
	
	public Costume getCostume(int i) {
		return this.costume.get(i).getSelectedItem();
	}
	
	public Pearl getCostPearl(int i) {
		return this.costPearl.get(i).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		if(this.costWeapon.get(0).isSelected()) {
			for(int i = 0; i < 2; i++) {
				if(!this.costQuality.get(i).get(0).isSelected()) {
					Costume cost = this.getCostume(i);
					list.addAll(cost.getEffects());
				}
			}
		} else {
			if(!this.costQuality.get(0).get(0).isSelected()) {
				Costume cost = this.getCostume(0);
				for(Effect e : cost.getEffects()) {
					list.add(new Effect(e.getType(), e.isPercent(), e.getValue()*2, e.getWithReinca(), e.getWithWeapon(), null));
				}
			}
		}
		
		for(int i = 2; i < this.costume.size(); i++) {
			if(!this.costQuality.get(i).get(0).isSelected()) {
				Costume cost = this.getCostume(i);
				list.addAll(cost.getEffects());
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			if(!this.checkBoxRunway.get(i).isSelected()) {
				continue;
			}
			if(i % 2 == 0) {
				for(int j : Runway.currentRunway[i/2]) {
					list.addAll(Runway.getData()[j].getEffects());
				}
			} else {
				for(int j : Runway.currentRunway[4]) {
					list.addAll(Runway.getData()[j].getEffects());
				}
			}
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			Pearl pearl = this.getCostPearl(i);
			list.addAll(pearl.getEffects());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel costGroupPanel = new JPanel();
		ButtonGroup costGroup = new ButtonGroup();
		
		costGroupPanel.setBackground(Consts.UIColor[1]);
		this.label[4].setFont(new Font("Open Sans", Font.PLAIN, 14));
		costGroupPanel.add(this.label[4]);
		
		for(int i = 0; i < 2; i++) {
			
			costGroup.add(this.costWeapon.get(i));
			costGroupPanel.add(this.costWeapon.get(i));
		}
		
		JPanel sectionCost = new JPanel();
		sectionCost.setLayout(new BoxLayout(sectionCost, BoxLayout.Y_AXIS));
		sectionCost.setBackground(Consts.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Consts.UIColor[1]);
			this.label[i+7].setFont(new Font("Open Sans", Font.PLAIN, 14));
			currentQualityPanel.add(this.label[i+7]);
			
			ButtonGroup currentQuality = new ButtonGroup();
			for(int j = 0; j < 5; j++) {
				currentQuality.add(this.costQuality.get(i).get(j));
				currentQualityPanel.add(this.costQuality.get(i).get(j));
			}
			
			JPanel itemCost = new JPanel();
			itemCost.setLayout(new BoxLayout(itemCost, BoxLayout.Y_AXIS));
			itemCost.setBackground(Consts.UIColor[1]);
			itemCost.add(Box.createVerticalStrut(10));
			itemCost.add(currentQualityPanel);
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
		runway.setBackground(Consts.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			runway.add(this.checkBoxRunway.get(i));
		}
		this.showAndHideRunway.add(runway);
		
			
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(costGroupPanel);
		elem1.add(Box.createVerticalStrut(3));
		elem1.add(sectionCost);
		elem1.add(runway);
		
		this.add(elem1);
		
		
		for(int i = 0; i < 3; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Consts.UIColor[1]);
			ButtonGroup currentQuality = new ButtonGroup();
			
			for(int j = 0; j < 5; j++) {
				currentQuality.add(this.costQuality.get(i+2).get(j));
				currentQualityPanel.add(this.costQuality.get(i+2).get(j));
			}
			
			JPanel runwayPanel = new JPanel();
			runwayPanel.setBackground(Consts.UIColor[1]);
			
			for(int j = 0; j < 2; j++) {
				runwayPanel.add(this.checkBoxRunway.get(i*2+j+2));
			}
			this.showAndHideRunway.add(runwayPanel);
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Consts.UIColor[1]);
			elemI.add(this.label[i+1]);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(currentQualityPanel);
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
		
		for(ArrayList<JCustomRadioButton> quality : this.costQuality) {
			quality.get(0).setSelected(true);
		}
		
		for(JPanel panel : this.showAndHideRunway) {
			panel.setVisible(false);
		}
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 5);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	private void updateCostume(int id) {
		Quality quality = Quality.GREY;
		CostType type = id < 2 || id == 4 ? CostType.OFFENSIVE : CostType.DEFENSIVE;
		
		for(int i = 0; i < 5; i++) {
			if(this.costQuality.get(id).get(i).isSelected()) {
				switch (i) {
					case 0:	quality = Quality.GREY;		break;
					case 1:	quality = Quality.WHITE;	break;
					case 2:	quality = Quality.GREEN;	break;
					case 3:	quality = Quality.BLUE;		break;
					case 4:	quality = Quality.GOLD;		break;
				}
			}
		}
		
		Costume[] cost = Costume.getPossibleCostume(quality, type);
		
		if(cost == null) {
			this.costume.get(id).setVisible(false);
		} else {
			this.costume.get(id).setVisible(true);
			
			int memory = this.costume.get(id).getSelectedIndex() != -1 ? this.costume.get(id).getSelectedIndex() : 0;
			if(memory+1 > cost.length) memory = 0;
			this.costume.get(id).setModel(new DefaultComboBoxModel<Costume>(cost));
			this.costume.get(id).setSelectedIndex(memory);
		}
		
		if(quality == Quality.GREY) {
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
				
				if(this.costQuality.get(0).get(0).isSelected() && this.costQuality.get(1).get(0).isSelected())	{
					this.showAndHideRunway.get(id).setVisible(false);
				}
			} else if(id == 1) {
				updateCheckBoxRunway(id*2-2);
				updateCheckBoxRunway(id*2-1);
				
				if(this.costQuality.get(0).get(0).isSelected() && this.costQuality.get(1).get(0).isSelected())	{
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
		
		if(this.costWeapon.get(0).isSelected() || this.costQuality.get(0).get(0).isSelected()) {
			this.costPearl.get(1).setVisible(false);
			this.costPearl.get(1).setSelectedIndex(0);
		}
	}
	
	private void updateWeaponCost() {
		if(this.costWeapon.get(0).isSelected()) {
			this.showAndHide.setVisible(true);
			this.costPearl.get(1).setVisible(false);
			this.costPearl.get(1).setSelectedIndex(0);
			
			if(!this.costQuality.get(1).get(0).isSelected()) {
				this.showAndHideRunway.get(0).setVisible(true);
			}
		} else {
			this.showAndHide.setVisible(false);
			
			this.costQuality.get(1).get(0).setSelected(true);
			
			if(!this.costQuality.get(0).get(0).isSelected()) {
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
			if(this.costQuality.get(0).get(0).isSelected() && this.costQuality.get(1).get(0).isSelected()) {
				this.checkBoxRunway.get(index).setSelected(false);
			}
		} else if(this.costQuality.get(indexQuality).get(0).isSelected()) {
			this.checkBoxRunway.get(index).setSelected(false);
		}
		
		if(this.checkBoxRunway.get(index).isSelected()) {
			this.checkBoxRunway.get(indexPair).setSelected(false);
		}
	}
}