package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.characUpgrade.CombiTalent;
import fr.vlik.grandfantasia.characUpgrade.SingleTalent;
import fr.vlik.grandfantasia.characUpgrade.Talent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;
import fr.vlik.grandfantasia.template.InnerColorEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JCustomTextPane;

public class PageTalent extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "TALENT";
	private static PageTalent INSTANCE = new PageTalent();
	
	private Grade currentGrade;
	
	private ArrayList<JCustomLabel<IconBuff>> tabChosenTalent = new ArrayList<JCustomLabel<IconBuff>>(9);
	private ArrayList<JCustomButtonGroup<Talent>> groupTalent = new ArrayList<JCustomButtonGroup<Talent>>(8);
	private ArrayList<JCustomComboBox<InnerColorEffect>> itemTalent = new ArrayList<JCustomComboBox<InnerColorEffect>>(24);
	private JCustomTextPane combiTalentInfo;
	
	private JCustomButton reinitTalent;
	private JCustomButton maxTalent;
	
	private ArrayList<JPanel> showAndHideTalent = new ArrayList<JPanel>();
	
	public static PageTalent getInstance() {
		return INSTANCE;
	}
	
	private PageTalent() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		
		Talent[] tabVoidTalent = Talent.getVoidData();
		Talent[] tabTalent = Talent.getPossibleTalent(this.currentGrade);
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			this.groupTalent.add(new JCustomButtonGroup<Talent>());
			
			for(int j = 0; j < 4; j++) {
				JCustomRadioButton<Talent> radioTalent;
				int global = i*4 + j;
				int id = count;
				
				if(j == 0) {
					radioTalent = new JCustomRadioButton<Talent>(tabVoidTalent[i]);
					this.tabChosenTalent.add(new JCustomLabel<IconBuff>(new SingleTalent(tabVoidTalent[i].getMap(), tabVoidTalent[i].getIcon(), null)));
				} else {
					InnerColorEffect[] innerLvl = tabTalent[count].getInnerTalent(PageGeneral.getInstance().getLvl());
					
					this.itemTalent.add(new JCustomComboBox<InnerColorEffect>(innerLvl));
					this.itemTalent.get(count).addActionListener(e -> {
						updateGroupTalent(id);
						updateSelectedTalent(global);
						updateCombiTalent();
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					
					radioTalent = new JCustomRadioButton<Talent>(tabTalent[count]);
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
		
		this.tabChosenTalent.add(new JCustomLabel<IconBuff>(new CombiTalent()));
		this.combiTalentInfo = new JCustomTextPane();
		
		this.reinitTalent = new JCustomButton(this.labelGFB[11].getLang(), Design.RED_COLOR);
		this.reinitTalent.addActionListener(e -> {
			setMinCBoxTalent();
		});

		this.maxTalent = new JCustomButton(this.labelGFB[12].getLang(), Design.GREEN_COLOR);
		this.maxTalent.addActionListener(e -> {
			setMaxCBoxTalent();
		});
		
		updateLanguage(Language.FR);
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
	
	@Override
	protected void setLabelAPI() {
		
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		for(JCustomLabel<IconBuff> label : this.tabChosenTalent) {
			list.addAll(label.getItem());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel chosenTalent = new JPanel();
		chosenTalent.setLayout(new GridLayout(3, 3));
		chosenTalent.setMaximumSize(new Dimension(108, 108));
		chosenTalent.setBackground(Design.UIColor[0]);
		
		int[] orderTalent = { 5, 0, 4, 1, 8, 2, 7, 3, 6 };
		for(int i = 0; i < orderTalent.length; i++) {
			this.tabChosenTalent.get(orderTalent[i]).setBorder(new EmptyBorder(2, 2, 2, 2));
			chosenTalent.add(this.tabChosenTalent.get(orderTalent[i]));
		}
		
		JPanel subElem1 = new JPanel();
		subElem1.setBackground(Design.UIColor[1]);
		subElem1.add(chosenTalent);
		subElem1.add(this.combiTalentInfo);
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(subElem1);
		
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		
		
		JPanel elem2 = new JPanel(new GridLayout(1,2, 10, 10));
		elem2.setBackground(Design.UIColor[2]);
		
		for(int i = 0; i < 2; i++) {
			JPanel colTalent = new JPanel();
			colTalent.setLayout(new BoxLayout(colTalent, BoxLayout.Y_AXIS));
			colTalent.setBorder(new EmptyBorder(10, 10, 10, 10));
			colTalent.setBackground(Design.UIColor[1]);
			colTalent.add(this.labelGFB[i+1]);
			this.labelGFB[i+1].setFont(Design.TITLE);
			colTalent.add(Box.createVerticalStrut(10));
			
			JPanel blocTalent = new JPanel(new GridLayout(4, 1, 10, 10));
			blocTalent.setBackground(Design.UIColor[1]);
			
			for(int j = 0; j < 4; j++) {
				JPanel lineTalent = new JPanel(new GridLayout(1, 4, 5, 5));
				lineTalent.setBackground(Design.UIColor[0]);
				
				Enumeration<AbstractButton> itTalent = this.groupTalent.get(i*4+j).getElements();
				do {
					for(int k = 0; k < 4; k++) {
						if(k == 0) {
							lineTalent.add(itTalent.nextElement());
						} else {
							JPanel singleTalent = new JPanel();
							singleTalent.setLayout(new BoxLayout(singleTalent, BoxLayout.Y_AXIS));
							singleTalent.setBackground(Design.UIColor[0]);
							singleTalent.add(itTalent.nextElement());
							singleTalent.add(Box.createVerticalStrut(5));
							singleTalent.add(this.itemTalent.get(i*12+j*3+k-1));
							
							lineTalent.add(singleTalent);
						}
					}
				} while(itTalent.hasMoreElements());
				
				JPanel subtitle = new JPanel();
				subtitle.setLayout(new BoxLayout(subtitle, BoxLayout.Y_AXIS));
				subtitle.setBorder(new EmptyBorder(5, 5, 5, 5));
				subtitle.setBackground(Design.UIColor[0]);
				subtitle.add(this.labelGFB[i*4+j+3]);
				this.labelGFB[i*4+j+3].setFont(Design.SUBTITLE);
				subtitle.add(lineTalent);
				
				this.showAndHideTalent.add(subtitle);
				
				blocTalent.add(subtitle);
			}
			
			colTalent.add(blocTalent);
			
			elem2.add(colTalent);
		}
		
		this.add(elem2);
		this.add(Box.createVerticalStrut(10));
		
		
		this.reinitTalent.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.reinitTalent.setMinimumSize(new Dimension(0, 30));
		
		this.maxTalent.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.maxTalent.setMinimumSize(new Dimension(0, 30));
		
		JPanel elem3 = new JPanel(new GridLayout(1, 2, 10, 5));
		elem3.setBackground(Design.UIColor[2]);
		elem3.add(this.reinitTalent);
		elem3.add(this.maxTalent);

		for(JPanel panel : this.showAndHideTalent) {
			panel.setVisible(false);
		}
		
		this.add(elem3);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
		
		this.reinitTalent.updateText(lang);
		this.maxTalent.updateText(lang);
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
		if(index32 % 4 != 0) {
			if(this.itemTalent.get(index24).getSelectedIndex() == 0) {
				this.groupTalent.get(index32/4).setSelectedIndex(0);
			}
		}
	}
	
	private void updateSelectedTalent(int index32) {
		Talent groupTalent = this.groupTalent.get(index32/4).getSelectedItem();
		int index24 = (index32/4)*3 + (index32%4) - 1;
		
		if(groupTalent != null) {
			if(index32 % 4 != 0 && this.groupTalent.get(index32/4).getSelectedIndex() != 0) {
				if(this.groupTalent.get(index32/4).getSelectedIndex() == (index24%3) + 1) {
					SingleTalent talent = new SingleTalent(groupTalent.getMap(), groupTalent.getIcon(), this.getLvlTalent(index24));
					this.tabChosenTalent.get(index32/4).setItem(talent);
				}
			} else {
				SingleTalent talent = new SingleTalent(groupTalent.getMap(), groupTalent.getIcon(), null);
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
		
		String combiInfo = combi.getName(Language.FR) + "\n";
		
		if(combi.getEffects() != null) {
			for(int i = 0; i < combi.getEffects().length; i++) {
				combiInfo += "\t- " + combi.getEffects()[i].toString(Language.FR) + "\n";
			}
		}
		
		this.combiTalentInfo.setText(combiInfo);
	}
	
	private void setMinCBoxTalent() {
		for(JCustomComboBox<InnerColorEffect> talent : this.itemTalent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(0);
			} else {
				break;
			}
		}
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<InnerColorEffect> talent : this.itemTalent) {
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
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.groupTalent.size(); i++) {
			Talent talent = this.getTalent(i);
			config.put("TalentSelect" + i, "" + talent.getName(Language.FR));
		}
		
		for(int i = 0; i < this.itemTalent.size(); i++) {
			config.put("TalentLvl" + i, "" + this.itemTalent.get(i).getSelectedIndex());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
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
		setEffects();
	}
}
