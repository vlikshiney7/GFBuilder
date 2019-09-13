package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.ProSkill;
import fr.vlik.grandfantasia.Skill;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageSkill extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageSkill INSTANCE = new PageSkill();
	
	private ArrayList<JCustomLabel> skillNatif = new ArrayList<JCustomLabel>(5);
	private ArrayList<JCustomComboBox<Skill>> skillProgress = new ArrayList<JCustomComboBox<Skill>>(2);
	private JCustomComboBox<ProSkill> proSkill;
	
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	public static PageSkill getInstance() {
		return INSTANCE;
	}

	private PageSkill() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		for(int i = 0; i < 5; i++) {
			this.skillNatif.add(new JCustomLabel());
			this.skillNatif.get(i).setPreferredSize(new Dimension(250, 32));
		}
		
		for(int i = 0; i < 2; i++) {
			this.skillProgress.add(new JCustomComboBox<Skill>());
			this.skillProgress.get(i).setRenderer(new CustomListCellRenderer());
			this.skillProgress.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.skillProgress.get(i).setVisible(false);
		}
		
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		this.proSkill = new JCustomComboBox<ProSkill>(tabProSkill);
		this.proSkill.setRenderer(new CustomListCellRenderer());
		this.proSkill.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
	}
	
	public ProSkill getProSkill() {
		return this.proSkill.getSelectedItem();
	}

	public Skill getSkill(int id) {
		return this.skillProgress.get(id).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < this.skillNatif.size(); i++) {
			if(this.skillNatif.get(i).isVisible()) {
				list.addAll(this.skillNatif.get(i).getEffects());
			}
		}
		
		for(int i = 0; i < this.skillProgress.size(); i++) {
			if(this.skillProgress.get(i).isVisible()) {
				list.addAll(this.getSkill(i).getEffects(0));
			}
		}
		
		if(this.showAndHide.get(1).isVisible()) {
			list.addAll(this.getProSkill().getEffects());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 5; i++) {
			JPanel skill = new JPanel();
			skill.setBackground(Consts.UIColor[1]);
			skill.add(this.skillNatif.get(i));
			
			elem1.add(skill);
		}
		
		for(int i = 0; i < 2; i++) {
			elem1.add(Box.createVerticalStrut(5));
			elem1.add(this.skillProgress.get(i));
		}
		
		JPanel elem2 = new JPanel();
		elem2.setLayout(new BoxLayout(elem2, BoxLayout.Y_AXIS));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Consts.UIColor[1]);
		elem2.add(this.label[1]);
		elem2.add(Box.createVerticalStrut(10));
		
		elem2.add(this.proSkill);
		
		this.showAndHide.add(elem1);
		this.showAndHide.add(elem2);
		
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Consts.UIColor[2]);
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(elem2);
		
		for(JLabel label : this.skillNatif) {
			label.setVisible(false);
		}
		
		for(JCustomComboBox<Skill> skill : this.skillProgress) {
			skill.setVisible(false);
		}
		
		for(JPanel panel : this.showAndHide) {
			panel.setVisible(false);
		}
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 8);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateSkill() {
		GradeName grade = PageGeneral.getInstance().getGrade().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		int count = 0;
		boolean isProgressUpdate = false;
		
		if(lvl < 6) {
			this.showAndHide.get(0).setVisible(false);
		} else {
			this.showAndHide.get(0).setVisible(true);
		}
		
		for(Skill skill : Skill.getData()[grade.index]) {
			if(skill.getLvl()[0] > lvl) {
				continue;
			}
			
			if(skill.getNatif()) {
				int maxLvlIndex = 0;
				while(maxLvlIndex+1 < skill.getLvl().length && skill.getLvl()[maxLvlIndex+1] <= lvl) {
					maxLvlIndex++;
				}
				
				this.skillNatif.get(count).setObject(skill, maxLvlIndex);
				this.skillNatif.get(count).setVisible(true);
				count++;
			} else {
				isProgressUpdate = !isProgressUpdate;
				ArrayList<Skill> lvlSkill = new ArrayList<Skill>();
				lvlSkill.add(new Skill(skill.getName() + " non acquis"));
				
				for(int i = 0; i < skill.getLvl().length; i++) {
					if(skill.getLvl()[i] <= lvl) lvlSkill.add(new Skill(skill, i));
				}
				
				Skill[] tabSkill = new Skill[lvlSkill.size()];
				for(int i = 0; i < tabSkill.length; i++) tabSkill[i] = lvlSkill.get(i);
				
				Skill memory = (Skill) this.skillProgress.get(0).getSelectedItem();
				this.skillProgress.get(0).setModel(new DefaultComboBoxModel<Skill>(tabSkill));
				this.skillProgress.get(0).setSelectedItem(memory);
				this.skillProgress.get(0).setVisible(true);
				if(this.skillProgress.get(0).getSelectedIndex() == -1) this.skillProgress.get(0).setSelectedIndex(0);
			}
		}
		
		Skill skill = Skill.getData()[12][0];
		
		ArrayList<Skill> lvlSkill = new ArrayList<Skill>();
		lvlSkill.add(new Skill(skill.getName() + " non acquis"));
		
		for(int i = 0; i < skill.getLvl().length; i++) {
			if(skill.getLvl()[i] <= lvl) lvlSkill.add(new Skill(skill, i));
		}
		
		if(lvlSkill.size() > 1 && PageGeneral.getInstance().getReinca() == 1) {
			Skill[] tabSkill = new Skill[lvlSkill.size()];
			for(int i = 0; i < tabSkill.length; i++) tabSkill[i] = lvlSkill.get(i);
			
			Skill memory = (Skill) this.skillProgress.get(1).getSelectedItem();
			this.skillProgress.get(1).setModel(new DefaultComboBoxModel<Skill>(tabSkill));
			this.skillProgress.get(1).setSelectedItem(memory);
			this.skillProgress.get(1).setVisible(true);
			if(this.skillProgress.get(1).getSelectedIndex() == -1) this.skillProgress.get(1).setSelectedIndex(0);
		} else {
			this.skillProgress.get(1).setVisible(false);
		}
		
		while(count < this.skillNatif.size()) {
			this.skillNatif.get(count).setVisible(false);
			count++;
		}
		if(!isProgressUpdate) {
			this.skillProgress.get(0).setVisible(false);
		}
	}
	
	public void updateSkillReinca() {
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		if(this.skillProgress.get(1).getItemCount() == 0) {
			updateSkill();
		}
		
		if(reinca && this.skillProgress.get(1).getItemCount() > 1) {
			this.skillProgress.get(1).setVisible(true);
		} else {
			this.skillProgress.get(1).setVisible(false);
		}
	}
	
	public void updateProSkill() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(lvl < 66) {
			this.showAndHide.get(1).setVisible(false);
		} else {
			this.showAndHide.get(1).setVisible(true);
		}
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(grade.getGrade(), lvl);
		ProSkill memory = (ProSkill) this.proSkill.getSelectedItem();
		this.proSkill.setModel(new DefaultComboBoxModel<ProSkill>(tabProSkill));
		
		if(memory != null) {
			this.proSkill.setSelectedItem(memory);
		}
		
		if(this.proSkill.getSelectedIndex() == -1 && tabProSkill.length > 0) {
			this.proSkill.setSelectedIndex(0);
		}
	}
}
