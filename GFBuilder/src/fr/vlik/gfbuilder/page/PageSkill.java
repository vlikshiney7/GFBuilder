package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characupgrade.ProSkill;
import fr.vlik.grandfantasia.characupgrade.Skill;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerIconEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageSkill extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "SKILL";
	private static final PageSkill INSTANCE = new PageSkill();
	
	private transient Grade currentGrade;
	private int currentLvl;
	
	private ArrayList<JCustomLabel<InnerIconEffect>> passiveSkill = new ArrayList<>(4);
	private transient JCustomComboBoxList<InnerIconEffect> upgradeSkill;
	private JCustomComboBox<ProSkill> proSkill;
	
	private ArrayList<JPanel> showAndHide = new ArrayList<>();
	
	public static PageSkill getInstance() {
		return INSTANCE;
	}
	
	private PageSkill() {
		super(BoxLayout.Y_AXIS);
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		this.currentLvl = PageGeneral.getInstance().getLvl();
		
		for(int i = 0; i < 4; i++) {
			this.passiveSkill.add(new JCustomLabel<>(null));
			this.passiveSkill.get(i).setBackground(Design.UIColor[0]);
			this.passiveSkill.get(i).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.passiveSkill.get(i).setPreferredSize(new Dimension(380, 32));
			this.passiveSkill.get(i).setOpaque(true);
		}
		
		this.upgradeSkill = new JCustomComboBoxList<>(InnerIconEffect.class, 2);
		this.upgradeSkill.setVisible(false);
		this.upgradeSkill.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(this.currentGrade.getGrade(), this.currentLvl);
		this.proSkill = new JCustomComboBox<>(ProSkill.class, tabProSkill);
		this.proSkill.addActionListener(e -> {
			setEffects();
			PageWeapon.getInstance().setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
	}
	
	public InnerIconEffect getPassiveSkill(int i) {
		return this.passiveSkill.get(i).getItem();
	}
	
	public InnerIconEffect getUpgradeSkill(int id) {
		return this.upgradeSkill.get(id).getSelectedItem();
	}
	
	public ProSkill getProSkill() {
		return this.proSkill.getSelectedItem();
	}
	
	@Override
	protected void setLabel() {
		this.labels.put("Skill", new JLangLabel(Skill.CLASS_NAME_PASSIVE, Design.TITLE));
		this.labels.put("ProSkill", new JLangLabel(ProSkill.CLASS_NAME, Design.TITLE));
	}

	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		
		for(JCustomLabel<InnerIconEffect> passive : this.passiveSkill) {
			if(passive.isVisible()) {
				list.addAll(passive.getItem());
			}
		}
		
		for(int i = 0; i < this.upgradeSkill.size(); i++) {
			if(this.upgradeSkill.get(i).isVisible()) {
				list.addAll(this.getUpgradeSkill(i));
			}
		}
		
		if(this.showAndHide.get(1).isVisible()) {
			list.addAll(this.getProSkill());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Skill"), Box.createVerticalStrut(10));
		
		for(int i = 0; i < 4; i++) {
			elem1.add(new JCustomPanel(this.passiveSkill.get(i)));
		}
		
		for(int i = 0; i < 2; i++) {
			elem1.addAll(Box.createVerticalStrut(5), this.upgradeSkill.get(i));
		}
		
		JCustomPanel elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem2.addAll(this.labels.get("ProSkill"), Box.createVerticalStrut(10), this.proSkill);
		
		this.showAndHide.add(elem1);
		this.showAndHide.add(elem2);
		
		this.addAll(elem1, Box.createVerticalStrut(10), elem2);
		
		for(JCustomLabel<InnerIconEffect> label : this.passiveSkill) {
			label.setVisible(false);
		}
		
		for(JPanel panel : this.showAndHide) {
			panel.setVisible(false);
		}
	}
	
	public void updateSkill() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		this.showAndHide.get(0).setVisible(lvl > 5);
		
		Skill[] passive = Skill.getPassiveSkill(grade);
		
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
				MainFrame.getInstance().setRedPane(8);
			}
		}
		
		for(int i = passive.length; i < 4; i++) {
			this.passiveSkill.get(i).setItem(null);
			this.passiveSkill.get(i).setVisible(false);
		}
		
		
		Skill skill = Skill.getUpgradeSkill(grade);
		if(skill != null) {
			InnerIconEffect[] innerSkill = skill.getInnerSkill(lvl);
			
			this.upgradeSkill.get(0).setVisible(innerSkill.length > 1);
		
			if(!this.upgradeSkill.get(0).setItems(innerSkill)) {
				MainFrame.getInstance().setRedPane(8);
			}
		} else {
			this.upgradeSkill.get(0).setVisible(false);
		}
		
		updateSkillReinca();
	}
	
	public void updateSkillReinca() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		if(reinca.getLvl() > 0) {
			InnerIconEffect[] innerSkill = Skill.getReinca().getInnerSkill(lvl);
			
			this.upgradeSkill.get(1).setVisible(innerSkill.length > 1);
			
			if(!this.upgradeSkill.get(1).setItems(innerSkill)) {
				MainFrame.getInstance().setRedPane(8);
			}
		} else {
			this.upgradeSkill.get(1).setVisible(false);
		}
		
		setEffects();
	}
	
	public void updateProSkill() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		this.showAndHide.get(1).setVisible(lvl > 65);
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(grade.getGrade(), lvl);
		
		if(!this.proSkill.setItems(tabProSkill)) {
			MainFrame.getInstance().setRedPane(8);
		}
	}
	
	public double getShieldBonus(TypeEffect type) {
		double result = 0;
		
		if(this.showAndHide.get(1).isVisible()) {
			for(Calculable c : this.getProSkill().getEffects()) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					
					if(e.getType() == type) {
						result += e.getValue();
					}
				}
			}
		}
		
		return result;
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.upgradeSkill.size(); i++) {
			config.put("LvlSkill" + i, "" + this.upgradeSkill.get(i).getSelectedIndex());
		}
		
		String value = this.getProSkill() != null ? this.getProSkill().getName(Language.FR) : "";
		config.put("ProSkill", "" + value);
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		for(int i = 0; i < this.upgradeSkill.size(); i++) {
			this.upgradeSkill.get(i).setSelectedIndex(Integer.valueOf(config.get("LvlSkill" + i)));
		}
		
		this.proSkill.setSelectedItem(ProSkill.get(config.get("ProSkill")));
		
		allowSetEffect(true);
	}
}
