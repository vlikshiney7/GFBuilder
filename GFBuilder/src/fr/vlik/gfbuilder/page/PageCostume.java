package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.subEquip.CombiRunway;
import fr.vlik.grandfantasia.subEquip.Costume;
import fr.vlik.grandfantasia.subEquip.Costume.CostumeType;
import fr.vlik.grandfantasia.subEquip.Runway;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomCheckBox;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JLangLabel;
import fr.vlik.uidesign.JLangRadioButton;

public class PageCostume extends PartialPage {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "COSTUME";
	private static PageCostume INSTANCE = new PageCostume();
	
	private ArrayList<JLangRadioButton> costWeapon = new ArrayList<JLangRadioButton>(2);
	private ArrayList<JCustomButtonGroup<Quality>> groupQuality = new ArrayList<JCustomButtonGroup<Quality>>(5);
	private ArrayList<JCustomButtonGroup<TypeSynthesis>> groupSynthesis = new ArrayList<JCustomButtonGroup<TypeSynthesis>>(5);
	private ArrayList<JCustomComboBox<Costume>> costume = new ArrayList<JCustomComboBox<Costume>>(5);
	private ArrayList<JCustomComboBox<Pearl>> costPearl = new ArrayList<JCustomComboBox<Pearl>>(7);
	private ArrayList<JCustomCheckBox<CombiRunway>> checkBoxRunway = new ArrayList<JCustomCheckBox<CombiRunway>>(8);
	
	private JPanel showAndHide;
	private ArrayList<JPanel> showAndHideRunway = new ArrayList<JPanel>(4);
	
	public static PageCostume getInstance() {
		return INSTANCE;
	}
	
	private PageCostume() {
		super(BoxLayout.Y_AXIS);
		
		for(int i = 0; i < 2; i++) {
			this.costWeapon.add(new JLangRadioButton(this.labels.get("WeaponHand" + i).getLang()));
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
			
			this.groupSynthesis.add(new JCustomButtonGroup<TypeSynthesis>());
			for(int j = 0; j < 2; j++) {
				JCustomRadioButton<TypeSynthesis> typeSynthesis = new JCustomRadioButton<TypeSynthesis>(TypeSynthesis.values()[j]);
				typeSynthesis.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i).add(typeSynthesis);
				this.groupSynthesis.get(i).setVisible(false);
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
			
			this.groupSynthesis.add(new JCustomButtonGroup<TypeSynthesis>());
			for(int j = 0; j < 2; j++) {
				int id = i+2;
				JCustomRadioButton<TypeSynthesis> typeSynthesis = new JCustomRadioButton<TypeSynthesis>(TypeSynthesis.values()[j]);
				typeSynthesis.addActionListener(e -> {
					updateCostume(id);

					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i+2).add(typeSynthesis);
				this.groupSynthesis.get(i+2).setVisible(false);
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
	
	public TypeSynthesis getGroupSynthesis(int i) {
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
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		for(int i = 0; i < 5; i++) {
			this.labels.put("Synthesis" + i, new JLangLabel(TypeSynthesis.CLASS_NAME, Design.SUBTITLE));
		}
		
		this.labels.put("Weapons", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Armes"); put(Language.EN, "Weapons"); }}, Design.TITLE));
		this.labels.put("Cost0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Tête"); put(Language.EN, "Head"); }}, Design.TITLE));
		this.labels.put("Cost1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Tenue"); put(Language.EN, "Body"); }}, Design.TITLE));
		this.labels.put("Cost2", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Dos"); put(Language.EN, "Back"); }}, Design.TITLE));
		this.labels.put("WeaponsType", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Type d'armes"); put(Language.EN, "Weapons type"); }}, Design.SUBTITLE));
		this.labels.put("WeaponHand0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Armes 1 main"); put(Language.EN, "1 hand weapons"); }}, Design.TEXT));
		this.labels.put("WeaponHand1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme 2 mains"); put(Language.EN, "2 hands weapon"); }}, Design.TEXT));
		this.labels.put("Weapon0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme 1"); put(Language.EN, "Weapon 1"); }}, Design.SUBTITLE));
		this.labels.put("Weapon1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme 2"); put(Language.EN, "Weapon 2"); }}, Design.SUBTITLE));
		
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		if(this.costWeapon.get(0).isSelected()) {
			for(int i = 0; i < 2; i++) {
				if(this.getGroupQuality(i) != Quality.GREY) {
					list.addAll(this.getCostume(i));
				}
			}
		} else {
			if(this.getGroupQuality(0) != Quality.GREY) {
				list.addAll(this.getCostume(0));
			}
		}
		
		for(int i = 2; i < this.costume.size(); i++) {
			if(this.getGroupQuality(i) != Quality.GREY) {
				list.addAll(this.getCostume(i));
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			if(!this.checkBoxRunway.get(i).isSelected()) {
				continue;
			}
			
			CombiRunway combi = this.getRunway(i);
			for(Runway runway : combi.getRunways()) {
				list.addAll(runway.getEffects());
			}
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			list.addAll(this.getCostPearl(i));
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JCustomPanel costGroupPanel = new JCustomPanel(this.labels.get("WeaponsType"));
		ButtonGroup costGroup = new ButtonGroup();
		
		for(int i = 0; i < 2; i++) {
			costGroup.add(this.costWeapon.get(i));
			costGroupPanel.add(this.costWeapon.get(i));
		}
		
		JCustomPanel sectionCost = new JCustomPanel(BoxLayout.Y_AXIS);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel qualityPanel = new JCustomPanel(this.labels.get("Weapon" + i));
			qualityPanel.addAll(this.groupQuality.get(i));
			
			JCustomPanel synthesisPanel = new JCustomPanel(this.labels.get("Synthesis" + i));
			synthesisPanel.addAll(this.groupSynthesis.get(i));
			
			JCustomPanel itemCost = new JCustomPanel(BoxLayout.Y_AXIS);
			itemCost.addAll(Box.createVerticalStrut(10), qualityPanel, Box.createVerticalStrut(3), synthesisPanel, Box.createVerticalStrut(3), this.costume.get(i));
			if(i == 0) {
				itemCost.addAll(Box.createVerticalStrut(3), this.costPearl.get(i));
			}
			itemCost.addAll(Box.createVerticalStrut(3), this.costPearl.get(i+1));
			
			sectionCost.add(itemCost);
			
			if(i == 1) {
				this.showAndHide = itemCost;
			}
		}
		
		JCustomPanel runway = new JCustomPanel();
		for(int j = 0; j < 2; j++) {
			runway.add(this.checkBoxRunway.get(j));
		}
		
		this.showAndHideRunway.add(runway);
		
			
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Weapons"), Box.createVerticalStrut(10), costGroupPanel, Box.createVerticalStrut(3), sectionCost, runway);
		
		this.add(elem1);
		
		
		for(int i = 0; i < 3; i++) {
			JCustomPanel qualityPanel = new JCustomPanel();
			qualityPanel.addAll(this.groupQuality.get(i+2));
			
			JCustomPanel synthesisPanel = new JCustomPanel(this.labels.get("Synthesis" + (i+2)));
			synthesisPanel.addAll(this.groupSynthesis.get(i+2));
			
			JCustomPanel runwayPanel = new JCustomPanel();
			for(int j = 0; j < 2; j++) {
				runwayPanel.add(this.checkBoxRunway.get(i*2+j+2));
			}
			this.showAndHideRunway.add(runwayPanel);
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labels.get("Cost" + i), Box.createVerticalStrut(10), qualityPanel, Box.createVerticalStrut(3), synthesisPanel, Box.createVerticalStrut(3), this.costume.get(i+2));
			
			if(i == 0) {
				elemI.addAll(Box.createVerticalStrut(3), this.costPearl.get(i+3));
			} else if(i == 1) {
				elemI.addAll(Box.createVerticalStrut(3), this.costPearl.get(i+3), Box.createVerticalStrut(3), this.costPearl.get(i+4));
			} else {
				elemI.addAll(Box.createVerticalStrut(3), this.costPearl.get(i+4));
			}
			
			elemI.addAll(Box.createVerticalStrut(3), runwayPanel);
			
			this.addAll(Box.createVerticalStrut(10), elemI);
		}
		
		
		this.costWeapon.get(0).setSelected(false);
		this.costWeapon.get(1).setSelected(true);
		
		for(int i = 0; i < 5; i++) {
			this.labels.get("Synthesis" + i).setVisible(false);
		}
		
		for(JCustomButtonGroup<Quality> quality : this.groupQuality) {
			quality.setSelectedItem(Quality.GREY);
		}
		
		for(JCustomButtonGroup<TypeSynthesis> typeSynthesis : this.groupSynthesis) {
			typeSynthesis.setSelectedItem(TypeSynthesis.GENKI);
		}
		
		for(JPanel panel : this.showAndHideRunway) {
			panel.setVisible(false);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(Entry<String, JLangLabel> entry : this.labels.entrySet()) {
			entry.getValue().updateText(lang);
		}
		
		for(JLangRadioButton button : this.costWeapon) {
			button.updateText(lang);
		}
		
		for(JCustomButtonGroup<Quality> quality : this.groupQuality) {
			quality.updateText(lang);
		}
		
		for(JCustomButtonGroup<TypeSynthesis> typeSynthesis : this.groupSynthesis) {
			typeSynthesis.updateText(lang);
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
			this.labels.get("Synthesis" + id).setVisible(false);
			this.groupSynthesis.get(id).setVisible(false);
			this.costume.get(id).setVisible(false);
		} else {
			this.labels.get("Synthesis" + id).setVisible(true);
			this.groupSynthesis.get(id).setVisible(true);
			this.costume.get(id).setVisible(true);
			
			Costume memory = this.getCostume(id);
			this.costume.get(id).setItems(cost);
			
			if(memory != null) {
				Costume retrieve = Costume.getFromList(memory.getName(Language.FR), cost);
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
			config.put("Quality" + i, "" + quality);
		}
		
		for(int i = 0; i < this.groupSynthesis.size(); i++) {
			TypeSynthesis typeSynthesis = this.groupSynthesis.get(i).getSelectedItem();
			config.put("TypeSynthesis" + i, "" + typeSynthesis);
		}
		
		for(int i = 0; i < this.costume.size(); i++) {
			String value = this.getCostume(i) != null ? this.getCostume(i).getName(Language.FR) : "";
			config.put("Costume" + i, value);
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			config.put("Pearl" + i, this.getCostPearl(i).getName(Language.FR));
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
			Quality quality = Quality.valueOf(config.get("Quality" + i) != null ? config.get("Quality" + i) : Quality.GREY.toString());
			this.groupQuality.get(i).setSelectedItem(quality);
			
			TypeSynthesis typeSynthesis = TypeSynthesis.valueOf(config.get("TypeSynthesis" + i) != null ? config.get("TypeSynthesis" + i) : TypeSynthesis.GENKI.toString());
			this.groupSynthesis.get(i).setSelectedItem(typeSynthesis);
			
			updateCostume(i);
			
			CostumeType type = null;
			switch (i) {
				case 0:	type = this.costWeapon.get(0).isSelected() ? CostumeType.DosArme1M : CostumeType.Arme2M;	break;
				case 1:	type = CostumeType.DosArme1M;	break;
				case 2:	type = CostumeType.TeteCorps;	break;
				case 3:	type = CostumeType.TeteCorps;	break;
				case 4:	type = CostumeType.DosArme1M;	break;
			}
			
			Costume costume = Costume.get(config.get("Costume" + i), typeSynthesis, type, quality);
			this.costume.get(i).setSelectedItem(costume);
		}
		
		for(int i = 0; i < this.costPearl.size(); i++) {
			if(i < 2) {
				this.costPearl.get(i).setSelectedItem(Pearl.getWeaponCost(config.get("Pearl" + i)));
			} else {
				this.costPearl.get(i).setSelectedItem(Pearl.getArmorCost(config.get("Pearl" + i)));
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			this.checkBoxRunway.get(i).setSelected(Boolean.valueOf(config.get("CheckboxRunway" + i)));
		}
		
		setEffects();
	}
}
