package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.characupgrade.CombiTalent;
import fr.vlik.grandfantasia.characupgrade.SingleTalent;
import fr.vlik.grandfantasia.characupgrade.Talent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;
import fr.vlik.grandfantasia.template.InnerColorEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JLabelTextPane;
import fr.vlik.uidesign.JLangLabel;

public class PageTalent extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "TALENT";
	private static final PageTalent INSTANCE = new PageTalent();
	
	private transient Grade currentGrade;
	
	private ArrayList<JCustomLabel<IconBuff>> tabChosenTalent = new ArrayList<>(9);
	private ArrayList<JCustomButtonGroup<Talent>> groupTalent = new ArrayList<>(8);
	private transient JCustomComboBoxList<InnerColorEffect> itemTalent;
	private JLabelTextPane combiTalentInfo;
	
	private JCustomButton reinitTalent;
	private JCustomButton maxTalent;
	
	private ArrayList<JPanel> showAndHideTalent = new ArrayList<>();
	
	public static PageTalent getInstance() {
		return INSTANCE;
	}
	
	private PageTalent() {
		super(BoxLayout.Y_AXIS);
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		
		Talent[] tabVoidTalent = Talent.getVoidData();
		Talent[] tabTalent = Talent.getPossibleTalent(this.currentGrade);
		this.itemTalent = new JCustomComboBoxList<>();
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			this.groupTalent.add(new JCustomButtonGroup<>());
			
			for(int j = 0; j < 4; j++) {
				JCustomRadioButton<Talent> radioTalent;
				int global = i*4 + j;
				int id = count;
				
				if(j == 0) {
					radioTalent = new JCustomRadioButton<>(tabVoidTalent[i]);
					this.tabChosenTalent.add(new JCustomLabel<>(new SingleTalent(tabVoidTalent[i].getMap(), tabVoidTalent[i].getIcon(), null)));
				} else {
					InnerColorEffect[] innerLvl = tabTalent[count].getInnerTalent(PageGeneral.getInstance().getLvl());
					
					this.itemTalent.add(new JCustomComboBox<>(InnerColorEffect.class, innerLvl));
					this.itemTalent.get(count).addActionListener(e -> {
						updateGroupTalent(id);
						updateSelectedTalent(global);
						updateCombiTalent();
						updateTooltipRadio(global, id);
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					
					radioTalent = new JCustomRadioButton<>(tabTalent[count]);
					count++;
				}
				
				radioTalent.setAlignmentX(CENTER_ALIGNMENT);
				radioTalent.addActionListener(e -> {
					trySelectTalent(global);
					updateSelectedTalent(global);
					updateCombiTalent();
					
					setEffects();
					MainFrame.getInstance().updateStat();
					
				});
				this.groupTalent.get(i).add(radioTalent);
			}
		}
		
		this.tabChosenTalent.add(new JCustomLabel<>(new CombiTalent()));
		this.combiTalentInfo = new JLabelTextPane();
		
		this.reinitTalent = new JCustomButton(this.labels.get("Min").getLang(), Design.RED_COLOR);
		this.reinitTalent.addActionListener(e -> setMinCBoxTalent() );

		this.maxTalent = new JCustomButton(this.labels.get("Max").getLang(), Design.GREEN_COLOR);
		this.maxTalent.addActionListener(e -> setMaxCBoxTalent() );
		
		this.components.add(this.reinitTalent);
		this.components.add(this.maxTalent);
		
		createPanel();
		setEffects();
	}
	
	public int getSelectedIndex(int i) {
		return this.groupTalent.get(i).getSelectedIndex();
	}
	
	public Talent getTalent(int i) {
		return this.groupTalent.get(i).getSelectedItem();
	}
	
	public InnerColorEffect getLvlTalent(int id) {
		return this.itemTalent.get(id).getSelectedItem();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Combi", new JLangLabel(CombiTalent.CLASS_NAME, Design.TITLE));
		
		this.labels.put("Category0", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Classique"); put(Language.EN, "Classic"); }}, Design.TITLE));
		this.labels.put("Category1", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ancestraux"); put(Language.EN, "Ancestral"); }}, Design.TITLE));
		for(int i = 0; i < 2; i++) {
			this.labels.put("Type" + (i*4), new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Terrestres"); put(Language.EN, "Earth"); }}, Design.SUBTITLE));
			this.labels.put("Type" + (i*4+1), new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Stellaires"); put(Language.EN, "Stellar"); }}, Design.SUBTITLE));
			this.labels.put("Type" + (i*4+2), new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lunaires"); put(Language.EN, "Lunar"); }}, Design.SUBTITLE));
			this.labels.put("Type" + (i*4+3), new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Solaires"); put(Language.EN, "Solar"); }}, Design.SUBTITLE));
		}
		this.labels.put("Min", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tout mettre au minimum"); put(Language.EN, "Set all to minimum"); }}, Design.TEXT));
		this.labels.put("Max", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tout mettre au maximum"); put(Language.EN, "Set all to maximum"); }}, Design.TEXT));
	}
	
	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		
		for(JCustomLabel<IconBuff> label : this.tabChosenTalent) {
			list.addAll(label.getItem());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JCustomPanel chosenTalent = new JCustomPanel(new GridLayout(3, 3));
		chosenTalent.setBackground(Design.UIColor[0]);
		chosenTalent.setMaximumSize(new Dimension(108, 108));
		
		int[] orderTalent = { 5, 0, 4, 1, 8, 2, 7, 3, 6 };
		for(int i = 0; i < orderTalent.length; i++) {
			this.tabChosenTalent.get(orderTalent[i]).setBorder(new EmptyBorder(2, 2, 2, 2));
			chosenTalent.add(this.tabChosenTalent.get(orderTalent[i]));
		}
		
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Combi"), Box.createVerticalStrut(10), new JCustomPanel(chosenTalent, this.combiTalentInfo));
		
		this.addAll(elem1, Box.createVerticalStrut(10));
		
		
		JCustomPanel elem2 = new JCustomPanel(new GridLayout(1,2, 10, 10));
		elem2.setBackground(Design.UIColor[2]);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel colTalent = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			colTalent.add(this.labels.get("Category" + i), Box.createVerticalStrut(10));
			
			JCustomPanel blocTalent = new JCustomPanel(new GridLayout(4, 1, 10, 10));
			
			for(int j = 0; j < 4; j++) {
				JCustomPanel lineTalent = new JCustomPanel(new GridLayout(1, 4, 5, 5));
				lineTalent.setBackground(Design.UIColor[0]);
				
				Enumeration<AbstractButton> itTalent = this.groupTalent.get(i*4+j).getElements();
				do {
					for(int k = 0; k < 4; k++) {
						if(k == 0) {
							lineTalent.add(itTalent.nextElement());
						} else {
							JCustomPanel singleTalent = new JCustomPanel(BoxLayout.Y_AXIS);
							singleTalent.setBackground(Design.UIColor[0]);
							singleTalent.addAll(itTalent.nextElement(), Box.createVerticalStrut(5), this.itemTalent.get(i*12+j*3+k-1));
							
							lineTalent.add(singleTalent);
						}
					}
				} while(itTalent.hasMoreElements());
				
				JCustomPanel subtitle = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(5, 5, 5, 5));
				subtitle.setBackground(Design.UIColor[0]);
				subtitle.addAll(this.labels.get("Type" + (i*4+j)), lineTalent);
				
				this.showAndHideTalent.add(subtitle);
				
				blocTalent.add(subtitle);
			}
			
			colTalent.add(blocTalent);
			
			elem2.add(colTalent);
		}
		
		this.addAll(elem2, Box.createVerticalStrut(10));
		
		
		this.reinitTalent.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.reinitTalent.setMinimumSize(new Dimension(0, 30));
		
		this.maxTalent.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.maxTalent.setMinimumSize(new Dimension(0, 30));
		
		JCustomPanel elem3 = new JCustomPanel(new GridLayout(1, 2, 10, 5));
		elem3.setBackground(Design.UIColor[2]);
		elem3.addAll(this.reinitTalent, this.maxTalent);

		for(JPanel panel : this.showAndHideTalent) {
			panel.setVisible(false);
		}
		
		this.add(elem3);
	}
	
	public void updateListTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		
		if(this.currentGrade.getGrade() == grade.getGrade()) {
			return;
		} else {
			this.currentGrade = grade;
		}
		
		Talent[] tabTalent = Talent.getPossibleTalent(this.currentGrade);
		
		int count = 0;
		for(int i = 0; i < 32; i++) {
			if(i % 4 != 0) {
				this.groupTalent.get(i/4).getButton(i%4).setItem(tabTalent[count]);
				count++;
			}
		}
		
		for(int i = 0; i < this.groupTalent.size(); i++) {
			this.groupTalent.get(i).setSelectedIndex(0);
			updateSelectedTalent(i*4);
		}
		
		updateCombiTalent();
		setEffects();
	}
	
	public void updateTalent() {
		int lvl = PageGeneral.getInstance().getLvl();
		
		int count = 0;
		for(int i = 0; i < 32; i++) {
			if(i % 4 != 0) {
				Talent talent = this.groupTalent.get(i/4).getElement(i%4);
				InnerColorEffect[] innerLvl = talent.getInnerTalent(lvl);
				this.itemTalent.get(count).setItems(innerLvl);
				
				count++;
			}
		}
		
		int[] tierLvl = new int[] { 6, 16, 31, 46, 66, 70, 73, 77 };
		for(int i = 0; i < tierLvl.length; i++) {
			if(tierLvl[i] <= lvl) {
				this.showAndHideTalent.get(i).setVisible(true);
			} else {
				this.groupTalent.get(i).setSelectedIndex(0);
				this.showAndHideTalent.get(i).setVisible(false);
			}
		}
	}
	
	private void updateGroupTalent(int index24) {
		int combiId = (index24 % 3) + 1;
		if(this.itemTalent.get(index24).getSelectedIndex() == 0 && this.groupTalent.get(index24/3).getSelectedIndex() == combiId) {
			this.groupTalent.get(index24/3).setSelectedIndex(0);
		}
	}
	
	private void trySelectTalent(int index32) {
		int index24 = (index32/4)*3 + (index32%4) - 1;
		if(index32 % 4 != 0 && this.itemTalent.get(index24).getSelectedIndex() == 0) {
			this.groupTalent.get(index32/4).setSelectedIndex(0);
		}
	}
	
	private void updateSelectedTalent(int index32) {
		Talent talentSelected = this.groupTalent.get(index32/4).getSelectedItem();
		int index24 = (index32/4)*3 + (index32%4) - 1;
		
		if(talentSelected != null) {
			if(index32 % 4 != 0 && this.groupTalent.get(index32/4).getSelectedIndex() != 0) {
				if(this.groupTalent.get(index32/4).getSelectedIndex() == (index24%3) + 1) {
					SingleTalent talent = new SingleTalent(talentSelected.getMap(), talentSelected.getIcon(), this.getLvlTalent(index24));
					this.tabChosenTalent.get(index32/4).setItem(talent);
				}
			} else {
				SingleTalent talent = new SingleTalent(talentSelected.getMap(), talentSelected.getIcon(), null);
				this.tabChosenTalent.get(index32/4).setItem(talent);
			}
		}
	}
	
	private void updateCombiTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int[] currentCode = new int[4];
		
		for(int i = 0; i < 4; i++) {
			currentCode[i] = this.groupTalent.get(i).getSelectedIndex();
		}
		
		CombiTalent combi = CombiTalent.getCombiTalent(grade.getGrade(), currentCode);
		
		this.tabChosenTalent.get(8).setItem(combi);
		
		StringBuilder combiInfo = new StringBuilder(combi.getName(Language.FR) + "\n");
		
		if(combi.getEffects() != null) {
			for(int i = 0; i < combi.getEffects().length; i++) {
				combiInfo.append("\t- " + combi.getEffects()[i].getFullInfo(Language.FR) + "\n");
			}
		}
		
		this.combiTalentInfo.setText(combiInfo.toString());
	}
	
	private void updateTooltipRadio(int index32, int index24) {
		String tooltip = Writable.TAB + Writable.TAB
				+ "<b>" + this.groupTalent.get(index32/4).getButton(index32%4).getItem().getName(MainFrame.getInstance().getLanguage()) + "</b>"
				+ Writable.TAB + Writable.TAB + Writable.LINE
				+ this.itemTalent.get(index24).getSelectedItem().getFullInfo(MainFrame.getInstance().getLanguage());
		
		this.groupTalent.get(index32/4).getButton(index32%4).setTooltip(tooltip);
	}
	
	private void setMinCBoxTalent() {
		for(JCustomComboBox<InnerColorEffect> talent : this.itemTalent.getList()) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(0);
			} else {
				break;
			}
		}
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<InnerColorEffect> talent : this.itemTalent.getList()) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(talent.getItemCount()-1);
			} else {
				break;
			}
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.groupTalent.size(); i++) {
			String value = this.getTalent(i) != null ? this.getTalent(i).getName(Language.FR) : "";
			config.put("TalentSelect" + i, "" + value);
		}
		
		for(int i = 0; i < this.itemTalent.size(); i++) {
			config.put("TalentLvl" + i, "" + this.itemTalent.get(i).getSelectedIndex());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		for(int i = 0; i < this.itemTalent.size(); i++) {
			this.itemTalent.get(i).setSelectedIndex(Integer.valueOf(config.get("TalentLvl" + i)));
		}
		
		for(int i = 0; i < this.groupTalent.size(); i++) {
			Talent talent = Talent.get(config.get("TalentSelect" + i), PageGeneral.getInstance().getGrade(), Language.FR);
			this.groupTalent.get(i).setSelectedItem(talent);
			
			int trigger = this.groupTalent.get(i).getSelectedIndex();
			updateSelectedTalent(i*4 + trigger);
		}
		
		updateCombiTalent();
		allowSetEffect(true);
	}
}
