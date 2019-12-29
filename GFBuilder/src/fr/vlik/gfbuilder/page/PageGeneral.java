package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.grandfantasia.Archive;
import fr.vlik.grandfantasia.Base;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.Title;
import fr.vlik.grandfantasia.Yggdrasil;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.equipment.Weapon.WeaponType;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomSpinner;

public class PageGeneral extends PagePanel implements AdditionalEffect {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "GENERAL";
	private static PageGeneral INSTANCE = new PageGeneral();
	
	private JCustomComboBox<Grade> grade;
	private JCustomSpinner lvl;
	private JCustomComboBox<Reinca> reinca;
	private JCustomComboBox<Title> title;
	private JCustomComboBox<Yggdrasil> yggdra;
	private JCustomComboBox<Archive> archive;
	
	private ArrayList<Effect> additionalEffects = new ArrayList<Effect>();
	
	public static PageGeneral getInstance() {
		return INSTANCE;
	}
	
	private PageGeneral() {
		super(new GridLayout(3, 2, 10, 10));
		setLabel(Language.FR);
		
		this.grade = new JCustomComboBox<Grade>(Grade.getPossibleData(0));
		this.grade.addActionListener(e -> {
			PageSkill.getInstance().updateSkill();
			PageSkill.getInstance().updateProSkill();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			PageCapeRing.getInstance().updateCapeRing();
			updateTitle();
			PageTalent.getInstance().updateListTalent();
			PageSpeciality.getInstance().updateListSpe();
			
			Overlay.getInstance().setGrade(this.getGrade());
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.lvl = new JCustomSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		this.lvl.addChangeListener(e -> {
			updateGrade();
			PageSkill.getInstance().updateSkill();
			PageSkill.getInstance().updateProSkill();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			PageCapeRing.getInstance().updateCapeRing();
			updateReinca();
			updateTitle();
			PageMount.getInstance().updateMount();
			PageTalent.getInstance().updateTalent();
			PageSpeciality.getInstance().updateSpe();
			PageSprite.getInstance().updateBlason();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateMarried();
			PageOther.getInstance().updateAnima();
			
			Overlay.getInstance().setLvl(this.getLvl());
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.reinca = new JCustomComboBox<Reinca>(Reinca.getPossibleData(1));
		this.reinca.addActionListener(e -> {
			PageSkill.getInstance().updateSkillReinca();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			updateTitle();
			PageMount.getInstance().updateMount();
			PageSpeciality.getInstance().updateSpe();
			PageBuff.getInstance().updateNucleus();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateMarried();
			PageOther.getInstance().updateAnima();
			
			Overlay.getInstance().setReinca(this.getReinca());
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Title[] tabTitle = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), this.getReinca());
		this.title = new JCustomComboBox<Title>(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.yggdra = new JCustomComboBox<Yggdrasil>(Yggdrasil.getData());
		this.yggdra.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.archive = new JCustomComboBox<Archive>(new DefaultComboBoxModel<Archive>(Archive.getData()));
		this.archive.addActionListener(e -> {
			setAdditionalEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
		setAdditionalEffects();
	}
	
	public Grade getGrade() {
		return this.grade.getSelectedItem();
	}
	
	public int getLvl() {
		return this.lvl.getIntValue();
	}
	
	public Title getTitle() {
		return this.title.getSelectedItem();
	}
	
	public Reinca getReinca() {
		return this.reinca.getSelectedItem();
	}
	
	public Yggdrasil getYggdrasil() {
		return this.yggdra.getSelectedItem();
	}
	
	public Archive getArchive() {
		return this.archive.getSelectedItem();
	}
	
	@Override
	public void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < 5; i++) {
			int value = Base.getBase(i, this.getGrade().getGrade(), this.getLvl());
			value = (int) Math.floor(value * this.getReinca().getCoef());
			list.add(new Effect(Base.getEffect(i), false, value, false, WeaponType.NONE, null));
		}
		
		list.addAll(this.getTitle().getEffects());
		list.addAll(this.getYggdrasil().getEffects());
		
		this.effects = list;
	}
	
	@Override
	public ArrayList<Effect> getAdditionalEffects() {
		return this.additionalEffects;
	}
	
	@Override
	public void setAdditionalEffects() {
		this.additionalEffects = this.getArchive().getEffects();
	}

	@Override
	protected void createPanel() {
		
		JPanel elem1 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle1 = new JPanel();
		panelTitle1.setBackground(Design.UIColor[1]);
		panelTitle1.add(this.label[0]);
		
		elem1.add(panelTitle1);
		elem1.add(this.grade);
		
		
		JPanel elem2 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle2 = new JPanel();
		panelTitle2.setBackground(Design.UIColor[1]);
		panelTitle2.add(this.label[1]);
		
		elem2.add(panelTitle2);
		elem2.add(this.lvl);
		
		
		JPanel elem3 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem3.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle3 = new JPanel();
		panelTitle3.setBackground(Design.UIColor[1]);
		panelTitle3.add(this.label[2]);
		
		elem3.add(panelTitle3);
		elem3.add(this.reinca);
		
		
		JPanel elem4 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem4.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle4 = new JPanel();
		panelTitle4.setBackground(Design.UIColor[1]);
		panelTitle4.add(this.label[3]);
		
		elem4.add(panelTitle4);
		elem4.add(this.title);
		
		
		JPanel elem5 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem5.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem5.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle5 = new JPanel();
		panelTitle5.setBackground(Design.UIColor[1]);
		panelTitle5.add(this.label[4]);
		
		elem5.add(panelTitle5);
		elem5.add(this.yggdra);
		
		
		JPanel elem6 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem6.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem6.setBackground(Design.UIColor[1]);
		
		JPanel panelTitle6 = new JPanel();
		panelTitle6.setBackground(Design.UIColor[1]);
		panelTitle6.add(this.label[5]);
		
		elem6.add(panelTitle6);
		elem6.add(this.archive);
		
		this.add(elem1);
		this.add(elem2);
		this.add(elem3);
		this.add(elem4);
		this.add(elem5);
		this.add(elem6);
	}
	
	@Override
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, NUM_PAGE);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, NUM_PAGE);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
	}
	
	private void updateGrade() {
		Grade tabGrade[] = Grade.getPossibleData(this.getLvl());
		GradeName memoryGrade = this.getGrade().getGrade();
		Grade memory = null;
		
		for(int i = 0; i < 2; i++) {
			for(Grade grade : tabGrade) {
				if(grade.getGrade().index == memoryGrade.index - i) {
					memory = grade;
					break;
				}
			}
			
			if(memory != null) {
				break;
			}
		}
		
		if(memory == null) {
			memory = tabGrade[0];
		}
		
		this.grade.setModel(new DefaultComboBoxModel<Grade>(tabGrade));
		this.grade.setSelectedItem(memory);
	}
	
	private void updateReinca() {
		Reinca[] tabReinca = Reinca.getPossibleData(this.getLvl());
		int memory = this.reinca.getSelectedIndex();
		
		this.reinca.setModel(new DefaultComboBoxModel<Reinca>(tabReinca));
		this.reinca.setSelectedIndex(memory);
	}
	
	private void updateTitle() {
		Title[] tabTitle = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), this.getReinca());
		Title memory = this.getTitle();
		
		this.title.setModel(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.setSelectedItem(memory);
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		config.put("Grade", this.getGrade().getName(lang));
		config.put("Lvl", "" + this.getLvl());
		config.put("Rebirth", this.getReinca().getName(lang));
		config.put("Title", this.getTitle().getName());
		config.put("Yggdrasil", this.getYggdrasil().getName());
		config.put("Archive", this.getArchive().getName());
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		this.lvl.setValue(Integer.valueOf(config.get("Lvl")));
		this.grade.setSelectedItem(Grade.get(config.get("Grade"), lang));
		this.reinca.setSelectedItem(Reinca.get(config.get("Rebirth"), lang));
		this.title.setSelectedItem(Title.get(config.get("Title")));
		this.yggdra.setSelectedItem(Yggdrasil.get(config.get("Yggdrasil")));
		this.archive.setSelectedItem(Archive.get(config.get("Archive")));
	}
}
