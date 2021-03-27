package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characUpgrade.PassiveSkill;
import fr.vlik.grandfantasia.characUpgrade.ProSkill;
import fr.vlik.grandfantasia.characUpgrade.Skill;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerIconEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageSkill extends PagePanel implements ConvertEffect {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "SKILL";
	private static PageSkill INSTANCE = new PageSkill();
	
	private Grade currentGrade;
	private int currentLvl;
	
	private ArrayList<JCustomLabel<InnerIconEffect>> passiveSkill = new ArrayList<JCustomLabel<InnerIconEffect>>(4);
	private ArrayList<JCustomComboBox<Skill>> skillProgress = new ArrayList<JCustomComboBox<Skill>>(2);
	private JCustomComboBox<ProSkill> proSkill;
	
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	private ArrayList<Calculable> convertEffects;
	
	public static PageSkill getInstance() {
		return INSTANCE;
	}
	
	private PageSkill() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		this.currentLvl = PageGeneral.getInstance().getLvl();
		
		for(int i = 0; i < 4; i++) {
			this.passiveSkill.add(new JCustomLabel<InnerIconEffect>(null));
			this.passiveSkill.get(i).setBackground(Design.UIColor[0]);
			this.passiveSkill.get(i).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.passiveSkill.get(i).setPreferredSize(new Dimension(380, 32));
			this.passiveSkill.get(i).setOpaque(true);
		}
		
		for(int i = 0; i < 2; i++) {
			this.skillProgress.add(new JCustomComboBox<Skill>());
			this.skillProgress.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.skillProgress.get(i).setVisible(false);
		}
		
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(this.currentGrade.getGrade(), this.currentLvl);
		this.proSkill = new JCustomComboBox<ProSkill>(tabProSkill);
		this.proSkill.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public InnerIconEffect getPassiveSkill(int i) {
		return this.passiveSkill.get(i).getItem();
	}
	
	public ProSkill getProSkill() {
		return this.proSkill.getSelectedItem();
	}

	public Skill getSkill(int id) {
		return this.skillProgress.get(id).getSelectedItem();
	}
	
	@Override
	public ArrayList<Calculable> getConvertEffects() {
		return this.convertEffects;
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		CustomList<Calculable> convert = new CustomList<Calculable>();
		
		for(JCustomLabel<InnerIconEffect> passive : this.passiveSkill) {
			if(passive.isVisible()) {
				InnerIconEffect iconEffect = passive.getItem();
				
				if(iconEffect.getEffects() != null) {
					for(Calculable c : iconEffect.getEffects()) {
						if(c instanceof Effect) {
							Effect e = (Effect) c;
							if(e.getTransfert() == null) {
								list.add(e);
							} else {
								convert.add(e);
							}
						} else {
							list.add(c);
						}
					}
				}
			}
		}
		
		for(int i = 0; i < this.skillProgress.size(); i++) {
			if(this.skillProgress.get(i).isVisible() && this.getSkill(i) != null) {
				if(this.getSkill(i).getEffects(0) != null) {
					for(Effect e : this.getSkill(i).getEffects(0)) {
						list.add(e);
					}
				}
			}
		}
		
		if(this.showAndHide.get(1).isVisible()) {
			list.addAll(this.getProSkill());
		}
		
		this.effects = list;
		this.convertEffects = convert;
	}

	@Override
	protected void createPanel() {
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 4; i++) {
			JPanel skill = new JPanel();
			skill.setBackground(Design.UIColor[1]);
			skill.add(this.passiveSkill.get(i));
			
			elem1.add(skill);
		}
		
		for(int i = 0; i < 2; i++) {
			elem1.add(Box.createVerticalStrut(5));
			elem1.add(this.skillProgress.get(i));
		}
		
		JPanel elem2 = new JPanel();
		elem2.setLayout(new BoxLayout(elem2, BoxLayout.Y_AXIS));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Design.UIColor[1]);
		elem2.add(this.labelGFB[1]);
		this.labelGFB[1].setFont(Design.TITLE);
		elem2.add(Box.createVerticalStrut(10));
		
		elem2.add(this.proSkill);
		
		this.showAndHide.add(elem1);
		this.showAndHide.add(elem2);
		
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[2]);
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(elem2);
		
		for(JCustomLabel<InnerIconEffect> label : this.passiveSkill) {
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
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
	}
	
	public void updateSkill() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		boolean isProgressUpdate = false;
		
		if(lvl < 6) {
			this.showAndHide.get(0).setVisible(false);
		} else {
			this.showAndHide.get(0).setVisible(true);
		}
		
		PassiveSkill[] passive = PassiveSkill.getSkill(grade);
		
		for(int i = 0; i < passive.length; i++) {
			InnerIconEffect innerEffect = passive[i].getCurrentEffect(lvl);
			
			InnerIconEffect memory = this.getPassiveSkill(i);
			
			if(innerEffect != null) {
				this.passiveSkill.get(i).setItem(innerEffect);
				this.passiveSkill.get(i).setVisible(true);
			} else {
				this.passiveSkill.get(i).setItem(null);
				this.passiveSkill.get(i).setVisible(false);
			}
			
			if(this.getPassiveSkill(i) != null && !this.getPassiveSkill(i).equals(memory)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
		
		for(int i = passive.length; i < 4; i++) {
			this.passiveSkill.get(i).setItem(null);
			this.passiveSkill.get(i).setVisible(false);
		}
		
		for(Skill skill : Skill.getData()[grade.getGrade().index]) {
			if(skill.getLvl()[0] > lvl) {
				continue;
			}
			
			isProgressUpdate = !isProgressUpdate;
			ArrayList<Skill> lvlSkill = new ArrayList<Skill>();
			lvlSkill.add(new Skill(skill.getName() + " non acquis"));
			
			for(int i = 0; i < skill.getLvl().length; i++) {
				if(skill.getLvl()[i] <= lvl) {
					lvlSkill.add(new Skill(skill, i));
				}
			}
			
			Skill[] tabSkill = new Skill[lvlSkill.size()];
			for(int i = 0; i < tabSkill.length; i++) {
				tabSkill[i] = lvlSkill.get(i);
			}
			
			Skill memory = this.getSkill(0);
			this.skillProgress.get(0).setItems(tabSkill);
			this.skillProgress.get(0).setVisible(true);
			if(this.skillProgress.get(0).getSelectedIndex() == -1) {
				this.skillProgress.get(0).setSelectedIndex(0);
			}
			
			if(!this.getSkill(0).equals(memory)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
		
		Skill skill = Skill.getData()[12][0];
		
		ArrayList<Skill> lvlSkill = new ArrayList<Skill>();
		lvlSkill.add(new Skill(skill.getName() + " non acquis"));
		
		for(int i = 0; i < skill.getLvl().length; i++) {
			if(skill.getLvl()[i] <= lvl) lvlSkill.add(new Skill(skill, i));
		}
		
		if(lvlSkill.size() > 1 && reinca.getLvl() > 0) {
			Skill[] tabSkill = new Skill[lvlSkill.size()];
			for(int i = 0; i < tabSkill.length; i++) tabSkill[i] = lvlSkill.get(i);
			
			Skill memory = this.getSkill(1);
			this.skillProgress.get(1).setItems(tabSkill);
			this.skillProgress.get(1).setVisible(true);
			
			if(!this.getSkill(1).equals(memory)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		} else {
			this.skillProgress.get(1).setVisible(false);
		}
		
		if(!isProgressUpdate) {
			this.skillProgress.get(0).setVisible(false);
		}

		setEffects();
	}
	
	public void updateSkillReinca() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		if(this.skillProgress.get(1).getItemCount() == 0) {
			updateSkill();
		}
		
		if(reinca.getLvl() > 0 && this.skillProgress.get(1).getItemCount() > 1) {
			this.skillProgress.get(1).setVisible(true);
		} else {
			this.skillProgress.get(1).setVisible(false);
		}
		
		setEffects();
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
		this.proSkill.setItems(tabProSkill);
		
		if(memory != null) {
			this.proSkill.setSelectedItem(memory);
			
			if(this.getProSkill() != null && this.getProSkill().equals(memory)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
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
		
		for(int i = 0; i < this.skillProgress.size(); i++) {
			config.put("LvlSkill" + i, "" + this.skillProgress.get(i).getSelectedIndex());
		}
		
		String value = this.getProSkill() != null ? this.getProSkill().getName(Language.FR) : "";
		config.put("ProSkill", "" + value);
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.skillProgress.size(); i++) {
			this.skillProgress.get(i).setSelectedIndex(Integer.valueOf(config.get("LvlSkill" + i)));
		}
		
		this.proSkill.setSelectedItem(ProSkill.get(config.get("ProSkill")));
	}
}
