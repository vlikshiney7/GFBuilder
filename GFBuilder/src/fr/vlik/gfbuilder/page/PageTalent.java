package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;

public class PageTalent extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "TALENT";
	private static PageTalent INSTANCE = new PageTalent();
	
	private Grade currentGrade;
	
	private JLabel[] tabChosenTalent = new JLabel[9];
	private ArrayList<ArrayList<JCustomRadioButton>> radioTalent = new ArrayList<ArrayList<JCustomRadioButton>>(8);
	private ArrayList<JCustomComboBox<Talent>> talent = new ArrayList<JCustomComboBox<Talent>>(24);
	private JCustomLabel combiTalent = new JCustomLabel(new CombiTalent(), Language.FR);
	
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
		
		ArrayList<ArrayList<Talent>> tabTalent = Talent.getPossibleTalent(this.currentGrade.getGrade(), PageGeneral.getInstance().getLvl());
		
		for(int i = 0; i < 2; i++) {
			boolean ancestral = i == 1;
			
			for(int j = 0; j < 4; j++) {
				
				int id = i*4+j;
				try {
					this.radioTalent.add(new ArrayList<JCustomRadioButton>());
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossTalent.png")))));
					this.radioTalent.get(i*4+j).get(0).setBackground(Design.UIColor[0]);
					this.radioTalent.get(i*4+j).get(0).addActionListener(e -> {
						updateSelectedTalent(id);
						updateCombiTalent();
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				for(int k = 0; k < 3; k++) {
					int idIn = i*12+j*3+k;
					
					Talent[] currentTalent = new Talent[tabTalent.get(i*12+j*3+k).size() + 1];
					currentTalent[0] = new Talent();
					for(int l = 0; l < currentTalent.length-1; l++) {
						currentTalent[l+1] = tabTalent.get(i*12+j*3+k).get(l);
					}
					
					this.talent.add(new JCustomComboBox<Talent>(currentTalent));
					this.talent.get(i*12+j*3+k).setRenderer(new CustomListCellRenderer(ancestral));
					this.talent.get(i*12+j*3+k).addActionListener(e -> {
						updateRadioTalent(idIn);
						updateCombiTalent();
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(Talent.getData()[this.currentGrade.getGrade().index][i*12+j*3+k].getIcon()));
					this.radioTalent.get(i*4+j).get(k+1).setBackground(Design.UIColor[0]);
					this.radioTalent.get(i*4+j).get(k+1).addActionListener(e -> {
						updateSelectedTalent(id);
						updateCombiTalent();

						setEffects();
						MainFrame.getInstance().updateStat();
					});
				}
			}
		}

		this.reinitTalent = new JCustomButton(this.labelGFB[11], Design.RED_COLOR);
		this.reinitTalent.addActionListener(e -> {
			setMinCBoxTalent();
		});

		this.maxTalent = new JCustomButton(this.labelGFB[12], Design.GREEN_COLOR);
		this.maxTalent.addActionListener(e -> {
			setMaxCBoxTalent();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Talent getTalent(int id) {
		return this.talent.get(id).getSelectedItem();
	}
	
	public ArrayList<JCustomRadioButton> getRadioButton(int index) {
		return this.radioTalent.get(index);
	}
	
	@Override
	protected void setLabelAPI() {
		
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		for(int i = 0; i < this.radioTalent.size(); i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.talent.get(i*3+j-1).getSelectedIndex() != 0) {
					Talent talent = this.getTalent(i*3+j-1);
					
					if(talent.getEffects(0) != null) {
						for(Calculable c : talent.getEffects(0)) {
							list.add(c);
						}
					}
				}
			}
		}
		
		if(this.combiTalent.getEffects() != null) {
			for(Calculable c : this.combiTalent.getEffects()) {
				list.add(c);
			}
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
			this.tabChosenTalent[orderTalent[i]] = new JLabel();
			this.tabChosenTalent[orderTalent[i]].setBorder(new EmptyBorder(2, 2, 2, 2));
			chosenTalent.add(this.tabChosenTalent[orderTalent[i]]);
		}
		this.tabChosenTalent[8].setBorder(new EmptyBorder(2, 2, 2, 2));
		try {
			this.tabChosenTalent[8].setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/talent/combi.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(chosenTalent);
		elem1.add(Box.createVerticalStrut(5));
		this.combiTalent.setAlignmentX(CENTER_ALIGNMENT);
		elem1.add(this.combiTalent);
		
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
				lineTalent.add(this.radioTalent.get(i*4+j).get(0));
				
				for(int k = 0; k < 3; k++) {
					JPanel singleTalent = new JPanel();
					singleTalent.setLayout(new BoxLayout(singleTalent, BoxLayout.Y_AXIS));
					singleTalent.setBackground(Design.UIColor[0]);
					this.radioTalent.get(i*4+j).get(k+1).setAlignmentX(CENTER_ALIGNMENT);
					singleTalent.add(this.radioTalent.get(i*4+j).get(k+1));
					singleTalent.add(Box.createVerticalStrut(5));
					singleTalent.add(this.talent.get(i*12+j*3+k));
					
					lineTalent.add(singleTalent);
				}
				
				ButtonGroup talentGroup = new ButtonGroup();
				for(int k = 0; k < 4; k++) {
					talentGroup.add(this.radioTalent.get(i*4+j).get(k));
				}
				
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
		
		ArrayList<ArrayList<Talent>> listTalent = Talent.getPossibleTalent(grade.getGrade(), PageGeneral.getInstance().getLvl());
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) {
				tabTalent[j+1] = listTalent.get(i).get(j);
			}
			
			this.radioTalent.get(i/3).get((i%3)+1).setIcon(Talent.getData()[grade.getGrade().index][i].getIcon());
			this.talent.get(i).setModel(new DefaultComboBoxModel<Talent>(tabTalent));
		}
	}
	
	public void updateTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		ArrayList<ArrayList<Talent>> listTalent = Talent.getPossibleTalent(grade.getGrade(), lvl);
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) {
				tabTalent[j+1] = listTalent.get(i).get(j);
			}
			
			int memory = this.talent.get(i).getSelectedIndex() > tabTalent.length-1 ? tabTalent.length-1 : this.talent.get(i).getSelectedIndex();
			this.talent.get(i).setModel(new DefaultComboBoxModel<Talent>(tabTalent));
			this.talent.get(i).setSelectedIndex(memory);
		}
		
		int[] tierLvl = new int[] { 6, 16, 31, 46, 66, 70, 73, 77 };
		for(int i = 0; i < tierLvl.length; i++) {
			if(tierLvl[i] <= lvl) this.showAndHideTalent.get(i).setVisible(true);
			else this.showAndHideTalent.get(i).setVisible(false);
		}
	}
	
	private void updateSelectedTalent(int index) {
		Grade grade = PageGeneral.getInstance().getGrade();
		ArrayList<JCustomRadioButton> radio = this.radioTalent.get(index);
		for(int i = 0; i < radio.size(); i++) {
			if(radio.get(i).isSelected()) {
				if(i == 0 || this.talent.get(index*3+i-1).getSelectedIndex() == 0) {
					this.tabChosenTalent[index].setIcon(new ImageIcon());
				} else {
					this.tabChosenTalent[index].setIcon(Talent.getData()[grade.getGrade().index][index*3+i-1].getIcon());
				}
			}
		}
	}
	
	private void updateCombiTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int[] currentCode = new int[4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.talent.get(i*3+j-1).getSelectedIndex() != 0) {
					currentCode[i] = j;
					break;
				}
			}
		}
		this.combiTalent.setObject(CombiTalent.getCombiTalent(grade.getGrade(), currentCode));
		this.combiTalent.setVisible(true);
	}
	
	private void updateRadioTalent(int index) {
		Grade grade = PageGeneral.getInstance().getGrade();
		if(this.radioTalent.get(index/3).get(index % 3 + 1).isSelected()) {
			if(this.talent.get(index).getSelectedIndex() == 0) {
				this.radioTalent.get(index/3).get(index % 3 + 1).setSelected(false);
				this.radioTalent.get(index/3).get(0).setSelected(true);
				this.tabChosenTalent[index/3].setIcon(new ImageIcon());
			} else {
				this.tabChosenTalent[index/3].setIcon(Talent.getData()[grade.getGrade().index][index].getIcon());
			}
		}
	}
	
	private void setMinCBoxTalent() {
		for(JCustomComboBox<Talent> talent : this.talent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(0);
			} else break;
		}
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<Talent> talent : this.talent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(talent.getItemCount()-1);
			} else break;
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.radioTalent.size(); i++) {
			ArrayList<JCustomRadioButton> buttons = this.radioTalent.get(i);
			int select = 3;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("TalentSelect" + i, "" + select);
		}
		
		for(int i = 0; i < this.talent.size(); i++) {
			config.put("TalentLvl" + i, "" + this.talent.get(i).getSelectedIndex());
		}
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.radioTalent.size(); i++) {
			ArrayList<JCustomRadioButton> buttons = this.radioTalent.get(i);
			int select = Integer.valueOf(config.get("TalentSelect" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
				} else {
					buttons.get(j).setSelected(false);
				}
			}
		}
		
		for(int i = 0; i < this.talent.size(); i++) {
			this.talent.get(i).setSelectedIndex(Integer.valueOf(config.get("TalentLvl" + i)));
		}
	}
}
