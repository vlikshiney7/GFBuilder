package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;

public class PageTalent extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageTalent INSTANCE = new PageTalent();
	
	private JLabel[] tabChosenTalent = new JLabel[9];
	private ArrayList<ArrayList<JCustomRadioButton>> radioTalent = new ArrayList<ArrayList<JCustomRadioButton>>(32);
	private ArrayList<JCustomComboBox<Talent>> talent = new ArrayList<JCustomComboBox<Talent>>(24);
	private JCustomLabel combiTalent = new JCustomLabel(new CombiTalent());
	private JCustomButton maxTalent;
	
	private ArrayList<JPanel> showAndHideTalent = new ArrayList<JPanel>();
	
	public static PageTalent getInstance() {
		return INSTANCE;
	}

	private PageTalent() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		ArrayList<ArrayList<Talent>> tabTalent = Talent.getPossibleTalent(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				
				int id = i*4+j;
				try {
					this.radioTalent.add(new ArrayList<JCustomRadioButton>());
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossTalent.png")))));
					this.radioTalent.get(i*4+j).get(0).setBackground(Consts.UIColor[0]);
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
					Talent[] currentTalent = new Talent[tabTalent.get(i*12+j*3+k).size() + 1];
					currentTalent[0] = new Talent();
					for(int l = 0; l < currentTalent.length-1; l++) {
						currentTalent[l+1] = tabTalent.get(i*12+j*3+k).get(l);
					}
					
					this.talent.add(new JCustomComboBox<Talent>(currentTalent));
					this.talent.get(i*12+j*3+k).setRenderer(new CustomListCellRenderer(i));
					int idIn = i*12+j*3+k;
					this.talent.get(i*12+j*3+k).addActionListener(e -> {
						updateRadioTalent(idIn);
						updateCombiTalent();
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(Talent.getData()[PageGeneral.getInstance().getGrade().getGrade().index][i*12+j*3+k].getIcon())));
					this.radioTalent.get(i*4+j).get(k+1).setBackground(Consts.UIColor[0]);
					this.radioTalent.get(i*4+j).get(k+1).addActionListener(e -> {
						updateSelectedTalent(id);
						updateCombiTalent();

						setEffects();
						MainFrame.getInstance().updateStat();
					});
				}
			}
		}
		
		this.maxTalent = new JCustomButton("Mettre tous les talents au niveau maximum");
		this.maxTalent.addActionListener(e -> {
			setMaxCBoxTalent();
		});
		
		createPanel();
		setEffects();
	}
	
	public Talent getTalent(int id) {
		return this.talent.get(id).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < this.radioTalent.size(); i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.talent.get(i*3+j-1).getSelectedIndex() != 0) {
					Talent talent = this.getTalent(i*3+j-1);
					list.addAll(talent.getEffects(0));
				}
			}
		}
		list.addAll(this.combiTalent.getEffects());
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel chosenTalent = new JPanel();
		chosenTalent.setLayout(new GridLayout(3, 3));
		chosenTalent.setMaximumSize(new Dimension(108, 108));
		chosenTalent.setBackground(Consts.UIColor[0]);
		
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
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(chosenTalent);
		elem1.add(Box.createVerticalStrut(5));
		this.combiTalent.setAlignmentX(CENTER_ALIGNMENT);
		elem1.add(this.combiTalent);
		
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		
		
		JPanel elem2 = new JPanel(new GridLayout(1,2, 10, 10));
		elem2.setBackground(Consts.UIColor[2]);
		
		for(int i = 0; i < 2; i++) {
			JPanel colTalent = new JPanel();
			colTalent.setLayout(new BoxLayout(colTalent, BoxLayout.Y_AXIS));
			colTalent.setBorder(new EmptyBorder(10, 10, 10, 10));
			colTalent.setBackground(Consts.UIColor[1]);
			colTalent.add(this.label[i+1]);
			colTalent.add(Box.createVerticalStrut(10));
			
			JPanel blocTalent = new JPanel(new GridLayout(4, 1, 10, 10));
			blocTalent.setBackground(Consts.UIColor[1]);
			
			for(int j = 0; j < 4; j++) {
				JPanel lineTalent = new JPanel(new GridLayout(1, 4, 5, 5));
				lineTalent.setBackground(Consts.UIColor[0]);
				lineTalent.add(this.radioTalent.get(i*4+j).get(0));
				
				for(int k = 0; k < 3; k++) {
					JPanel singleTalent = new JPanel();
					singleTalent.setLayout(new BoxLayout(singleTalent, BoxLayout.Y_AXIS));
					singleTalent.setBackground(Consts.UIColor[0]);
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
				subtitle.setBackground(Consts.UIColor[0]);
				this.label[i*4+j+3].setFont(new Font("Open Sans", Font.PLAIN, 14));
				subtitle.add(this.label[i*4+j+3]);
				subtitle.add(lineTalent);
				
				this.showAndHideTalent.add(subtitle);
				
				blocTalent.add(subtitle);
			}
			
			colTalent.add(blocTalent);
			
			elem2.add(colTalent);
		}
		
		this.add(elem2);
		this.add(Box.createVerticalStrut(10));
		
		JPanel elem3 = new JPanel(new GridLayout(1, 1));
		elem3.setBackground(Consts.UIColor[1]);
		elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.maxTalent.setMinimumSize(new Dimension(0, 30));
		elem3.add(maxTalent);
		
		this.add(elem3);
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 6);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateListTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		ArrayList<ArrayList<Talent>> listTalent = Talent.getPossibleTalent(grade.getGrade(), PageGeneral.getInstance().getLvl());
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) tabTalent[j+1] = listTalent.get(i).get(j);
			
			this.radioTalent.get(i/3).get((i%3)+1).setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][i].getIcon()));
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
			for(int j = 0; j < tabTalent.length-1; j++) tabTalent[j+1] = listTalent.get(i).get(j);
			
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
					this.tabChosenTalent[index].setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][index*3+i-1].getIcon()));
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
				this.tabChosenTalent[index/3].setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][index].getIcon()));
			}
		}
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<Talent> talent : this.talent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(talent.getItemCount()-1);
			} else break;
		}
	}
}
