package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.grandfantasia.charac.Archive;
import fr.vlik.grandfantasia.charac.Base;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characUpgrade.Title;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.gameBuff.Yggdrasil;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomDialog;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomSpinner;
import fr.vlik.uidesign.JLangLabel;

public class PageGeneral extends PartialPage {
	
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
	
	private JCustomButton filter;
	private JCustomDialog filterDialog;
	
	public static PageGeneral getInstance() {
		return INSTANCE;
	}
	
	private PageGeneral() {
		super(new GridLayout(3, 2, 10, 10), NUM_PAGE);
		setLabelAPI();
		
		this.grade = new JCustomComboBox<Grade>(Grade.getPossibleGrade(0));
		this.grade.addActionListener(e -> {
			PageSkill.getInstance().updateSkill();
			PageSkill.getInstance().updateProSkill();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			PageCapeRing.getInstance().updateCapeRing();
			updateTitle();
			PageTalent.getInstance().updateListTalent();
			PageTalent.getInstance().updateTalent();
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
			PageRide.getInstance().updateRide();
			PageRide.getInstance().updateQualityGenki(1);
			PageTalent.getInstance().updateTalent();
			PageSpeciality.getInstance().updateSpe();
			PageSprite.getInstance().updateBlason();
			PageSprite.getInstance().updateSpriteCost();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateMarried();
			PageOther.getInstance().updateAnima();
			PageOther.getInstance().updateSouvenir();
			
			Overlay.getInstance().setLvl(this.getLvl());
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.reinca = new JCustomComboBox<Reinca>(Reinca.getPossibleReinca(1));
		this.reinca.addActionListener(e -> {
			PageSkill.getInstance().updateSkillReinca();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			updateTitle();
			PageRide.getInstance().updateRide();
			PageSpeciality.getInstance().updateSpe();
			PageSprite.getInstance().updateSpriteCost();
			PageBuff.getInstance().updateNucleus();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateMarried();
			PageOther.getInstance().updateAnima();
			
			Overlay.getInstance().setReinca(this.getReinca());
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.title = new JCustomComboBox<Title>(Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), this.getReinca()));
		this.title.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.yggdra = new JCustomComboBox<Yggdrasil>(Yggdrasil.getData());
		this.yggdra.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.archive = new JCustomComboBox<Archive>(Archive.getData());
		this.archive.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.filterDialog = new JCustomDialog(Title.getTags(), Title.getQualities(), true, 5);
		
		this.filter = new JCustomButton("filter16", "filter16", "filter16", Design.GREY_COLOR);
		this.filter.setBorder(Design.UIColor[3]);
		this.filter.setToolTipText("Filtre");
		
		this.filter.addActionListener(e -> {
			this.filterDialog.popup(this.filter);
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
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
	protected void setLabelAPI() {
		this.labelAPI.put("Grade", new JLangLabel(Grade.CLASS_NAME, Design.TITLE));
		this.labelAPI.put("Reinca", new JLangLabel(Reinca.CLASS_NAME, Design.TITLE));
		this.labelAPI.put("Title", new JLangLabel(Title.CLASS_NAME, Design.TITLE));
		this.labelAPI.put("Yggdrasil", new JLangLabel(Yggdrasil.CLASS_NAME, Design.TITLE));
		this.labelAPI.put("Archive", new JLangLabel(Archive.CLASS_NAME, Design.TITLE));
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		list.addAll(Base.getBase(this.getGrade(), this.getLvl()));
		list.addAll(this.getTitle());
		list.addAll(this.getYggdrasil());
		list.addAll(this.getArchive());
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JCustomPanel elem1 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(new JCustomPanel(this.labelAPI.get("Grade")), this.grade);
		
		JCustomPanel elem2 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem2.addAll(new JCustomPanel(this.labelGFB[0]), this.lvl);
		this.labelGFB[0].setFont(Design.TITLE);
		
		JCustomPanel elem3 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem3.addAll(new JCustomPanel(this.labelAPI.get("Reinca")), this.reinca);
		
		JCustomPanel elem4 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem4.addAll(new JCustomPanel(this.labelAPI.get("Title")), new JCustomPanel(this.filter, this.title));
		
		JCustomPanel elem5 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem5.addAll(new JCustomPanel(this.labelAPI.get("Yggdrasil")), this.yggdra);
		
		JCustomPanel elem6 = new JCustomPanel(new GridLayout(2, 1, 10, 10), new EmptyBorder(10, 10, 10, 10));
		elem6.addAll(new JCustomPanel(this.labelAPI.get("Archive")), this.archive);
		
		
		this.addAll(elem1, elem2, elem3, elem4, elem5, elem6);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(Entry<String, JLangLabel> entry : this.labelAPI.entrySet()) {
			entry.getValue().updateText(lang);
		}
		
		this.filterDialog.updateLanguage(lang);
	}
	
	private void updateGrade() {
		Grade tabGrade[] = Grade.getPossibleGrade(this.getLvl());
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
		
		this.grade.setItems(tabGrade, memory);
	}
	
	private void updateReinca() {
		Reinca[] tabReinca = Reinca.getPossibleReinca(this.getLvl());
		int memory = this.reinca.getSelectedIndex();
		
		this.reinca.setItems(tabReinca);
		this.reinca.setSelectedIndex(memory);
	}
	
	private void updateTitle() {
		Title[] tabTitle = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), this.getReinca(), this.filterDialog.getSearch(), this.filterDialog.getFilters(), this.getTitle());
		
		this.title.setItems(tabTitle);
	}
	
	public void popoff() {
		this.filterDialog.popoff();
		updateTitle();
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
		config.put("Title", this.getTitle().getName(Language.FR));
		config.put("Yggdrasil", this.getYggdrasil().getName(lang));
		config.put("Archive", this.getArchive().getName(Language.FR));
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		this.lvl.setValue(Integer.valueOf(config.get("Lvl")));
		this.grade.setSelectedItem(Grade.get(config.get("Grade"), lang));
		this.reinca.setSelectedItem(Reinca.get(config.get("Rebirth"), lang));
		this.title.setSelectedItem(Title.get(config.get("Title")));
		this.yggdra.setSelectedItem(Yggdrasil.get(config.get("Yggdrasil"), lang));
		this.archive.setSelectedItem(Archive.get(config.get("Archive")));
	}
}
