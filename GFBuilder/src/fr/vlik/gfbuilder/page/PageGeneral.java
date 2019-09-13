package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Archive;
import fr.vlik.grandfantasia.Base;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Title;
import fr.vlik.grandfantasia.Yggdrasil;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomSpinner;

public class PageGeneral extends PagePanel implements AdditionalEffect {
	
	private static final long serialVersionUID = 1L;
	private static PageGeneral INSTANCE = new PageGeneral();
	
	private JCustomComboBox<Grade> grade;
	private JCustomSpinner lvl;
	private JCustomComboBox<String> reinca;
	private JCustomComboBox<Title> title;
	private JCustomComboBox<Yggdrasil> yggdra;
	private JCustomComboBox<Archive> archive;
	
	private ArrayList<Effect> additionalEffects = new ArrayList<Effect>();
	
	public static PageGeneral getInstance() {
		return INSTANCE;
	}
	
	private PageGeneral() {
		super(new GridLayout(3, 2, 10, 10), Consts.UIColor[2]);
		setLabel();
		
		this.grade = new JCustomComboBox<Grade>(Grade.getPossibleData(0));
		this.grade.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.grade.setRenderer(new CustomListCellRenderer());
		this.grade.addActionListener(e -> {
			PageSkill.getInstance().updateSkill();
			PageSkill.getInstance().updateProSkill();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			PageCapeRing.getInstance().updateCapeRing();
			updateTitle();
			PageTalent.getInstance().updateListTalent();
			PageSpeciality.getInstance().updateListSpe();
			
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
			updateTitle();
			PageMount.getInstance().updateMount();
			PageTalent.getInstance().updateTalent();
			PageSpeciality.getInstance().updateSpe();
			PageSprite.getInstance().updateBlason();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateBague();
			PageOther.getInstance().updateAnima();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.reinca = new JCustomComboBox<String>(new String[] { "Aucune", "Niveau 1" });
		this.reinca.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.reinca.setRenderer(new CustomListCellRenderer());
		this.reinca.addActionListener(e -> {
			PageSkill.getInstance().updateSkillReinca();
			PageWeapon.getInstance().updateWeapon();
			PageArmor.getInstance().updateArmor();
			updateTitle();
			PageMount.getInstance().updateMount();
			PageSpeciality.getInstance().updateSpe();
			PageBuff.getInstance().updateNucleus();
			PageBuff.getInstance().updateEnergy();
			PageOther.getInstance().updateBague();
			PageOther.getInstance().updateAnima();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Title[] tabTitle = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), false);
		this.title = new JCustomComboBox<Title>(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.title.setRenderer(new CustomListCellRenderer());
		this.title.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.yggdra = new JCustomComboBox<Yggdrasil>(Yggdrasil.getData());
		this.yggdra.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.yggdra.setRenderer(new CustomListCellRenderer());
		this.yggdra.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.archive = new JCustomComboBox<Archive>(new DefaultComboBoxModel<Archive>(Archive.getData()));
		this.archive.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.archive.setRenderer(new CustomListCellRenderer());
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
	
	public int getReinca() {
		return this.reinca.getSelectedIndex();
	}
	
	public Yggdrasil getYggdrasil() {
		return this.yggdra.getSelectedItem();
	}
	
	public Archive getArchive() {
		return this.archive.getSelectedItem();
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < 5; i++) {
			int value = Base.getBase(i, this.getGrade().getGrade(), this.getLvl());
			value = (int) Math.floor(value * PageGeneral.getCoefReinca(this.getLvl(), this.getReinca() == 1));
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
		elem1.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle1 = new JPanel();
		panelTitle1.setBackground(Consts.UIColor[1]);
		panelTitle1.add(this.label[0]);
		
		elem1.add(panelTitle1);
		elem1.add(this.grade);
		
		
		JPanel elem2 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle2 = new JPanel();
		panelTitle2.setBackground(Consts.UIColor[1]);
		panelTitle2.add(this.label[1]);
		
		elem2.add(panelTitle2);
		elem2.add(this.lvl);
		
		
		JPanel elem3 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem3.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle3 = new JPanel();
		panelTitle3.setBackground(Consts.UIColor[1]);
		panelTitle3.add(this.label[2]);
		
		elem3.add(panelTitle3);
		elem3.add(this.reinca);
		
		
		JPanel elem4 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem4.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle4 = new JPanel();
		panelTitle4.setBackground(Consts.UIColor[1]);
		panelTitle4.add(this.label[3]);
		
		elem4.add(panelTitle4);
		elem4.add(this.title);
		
		
		JPanel elem5 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem5.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem5.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle5 = new JPanel();
		panelTitle5.setBackground(Consts.UIColor[1]);
		panelTitle5.add(this.label[4]);
		
		elem5.add(panelTitle5);
		elem5.add(this.yggdra);
		
		
		JPanel elem6 = new JPanel(new GridLayout(2, 1, 10, 10));
		elem6.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem6.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle6 = new JPanel();
		panelTitle6.setBackground(Consts.UIColor[1]);
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
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 0);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
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
	
	private void updateTitle() {
		boolean reinca = this.getReinca() == 1;
		
		Title tabTitle[] = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), reinca);
		Title memory = this.getTitle();
		
		this.title.setModel(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.setSelectedItem(memory);
	}
	
	public static double getCoefReinca(int lvl, boolean reinca) {
		if(reinca) {
			if(lvl < 66) {
				return Consts.coefReinca[1];
			} else if(lvl < 86) {
				return Consts.coefReinca[2];
			} else if(lvl < 91) {
				return Consts.coefReinca[3];
			} else if(lvl < 100) {
				return Consts.coefReinca[4];
			} else {
				return Consts.coefReinca[5];
			}
		} else {
			return 1;
		}
	}
}
