package fr.vlik.gfbuilder;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Archive;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Title;
import fr.vlik.grandfantasia.Yggdrasil;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomSpinner;

public class PageGeneral extends PagePanel {
	
	private static PageGeneral INSTANCE = new PageGeneral();
	private static final long serialVersionUID = 1L;
	
	private JCustomComboBox<Grade> grade;
	private JCustomSpinner lvl;
	private JCustomComboBox<String> reinca;
	private JCustomComboBox<Title> title;
	private JCustomComboBox<Yggdrasil> yggdra;
	private JCustomComboBox<Archive> archive;
	
	private ArrayList<Effect> additionalEffect = new ArrayList<Effect>();
	
	public static PageGeneral getInstance() {
		
		return INSTANCE;
	}
	
	private PageGeneral() {
		super(new GridLayout(3, 2, 10, 10), Consts.UIColor[2]);
		
		this.grade = new JCustomComboBox<Grade>(Grade.getPossibleData(0));
		this.grade.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.grade.setRenderer(new CustomListCellRenderer());
		this.grade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.getInstance().updateSkill();
				MainFrame.getInstance().updateProSkill();
				MainFrame.getInstance().updateListStuff();
				
				updateTitle();
				
				MainFrame.getInstance().updateListTalent();
				MainFrame.getInstance().updateListSpe();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			}
		});
		
		
		this.lvl = new JCustomSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		this.lvl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				updateGrade();
				
				MainFrame.getInstance().updateSkill();
				MainFrame.getInstance().updateProSkill();
				MainFrame.getInstance().updateListStuff();
				
				updateTitle();
				
				MainFrame.getInstance().updateMount();
				MainFrame.getInstance().updateTalent();
				MainFrame.getInstance().showSpe();
				MainFrame.getInstance().updateBlason();
				MainFrame.getInstance().updateEnergy();
				MainFrame.getInstance().updateBague();
				MainFrame.getInstance().updateAnima();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			}
		});
		
		
		this.reinca = new JCustomComboBox<String>(new String[] { "Aucune", "Niveau 1" });
		this.reinca.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.reinca.setRenderer(new CustomListCellRenderer());
		this.reinca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.getInstance().updateSkillReinca();
				MainFrame.getInstance().updateListStuff();
				
				updateTitle();
				
				MainFrame.getInstance().updateMount();
				MainFrame.getInstance().showSpe();
				MainFrame.getInstance().updateNucleus();
				MainFrame.getInstance().updateEnergy();
				MainFrame.getInstance().updateBague();
				MainFrame.getInstance().updateAnima();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			}
		});
		
		
		Title[] tabTitle = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), false);
		this.title = new JCustomComboBox<Title>(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.title.setRenderer(new CustomListCellRenderer());
		this.title.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setEffects();
				MainFrame.getInstance().updateStat();
			}
		});
		
		
		this.yggdra = new JCustomComboBox<Yggdrasil>(Yggdrasil.getData());
		this.yggdra.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.yggdra.setRenderer(new CustomListCellRenderer());
		this.yggdra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setEffects();
				MainFrame.getInstance().updateStat();
			}
		});
		
		
		this.archive = new JCustomComboBox<Archive>(new DefaultComboBoxModel<Archive>(Archive.getData()));
		this.archive.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.archive.setRenderer(new CustomListCellRenderer());
		this.archive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setAdditionnalEffect();
				MainFrame.getInstance().updateStat();
			}
		});
		
		setLabel();
		createPanel();
		setEffects();
	}
	
	public Grade getGrade() {
		return (Grade) this.grade.getSelectedItem();
	}
	
	public int getLvl() {
		return this.lvl.getIntValue();
	}
	
	public Title getTitle() {
		return (Title) this.title.getSelectedItem();
	}
	
	public int getReinca() {
		return this.reinca.getSelectedIndex();
	}
	
	public Yggdrasil getYggdrasil() {
		return (Yggdrasil) this.yggdra.getSelectedItem();
	}
	
	public Archive getArchive() {
		return (Archive) this.archive.getSelectedItem();
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		list.addAll(this.getTitle().getEffects());
		list.addAll(this.getYggdrasil().getEffects());
		
		this.effects = list;
	}
	
	public ArrayList<Effect> getAdditionnalEffects() {
		return this.additionalEffect;
	}
	
	public void setAdditionnalEffect() {
		this.additionalEffect = this.getArchive().getEffects();
	}

	@Override
	protected void createPanel() {
		
		JPanel page1Elem1 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem1.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle1 = new JPanel();
		panelTitle1.setBackground(Consts.UIColor[1]);
		panelTitle1.add(this.label[0]);
		
		page1Elem1.add(panelTitle1);
		page1Elem1.add(this.grade);
		
		
		
		JPanel page1Elem2 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem2.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle2 = new JPanel();
		panelTitle2.setBackground(Consts.UIColor[1]);
		panelTitle2.add(this.label[1]);
		
		page1Elem2.add(panelTitle2);
		page1Elem2.add(this.lvl);
		
		
		JPanel page1Elem3 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem3.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle3 = new JPanel();
		panelTitle3.setBackground(Consts.UIColor[1]);
		panelTitle3.add(this.label[2]);
		
		page1Elem3.add(panelTitle3);
		page1Elem3.add(this.reinca);
		
		
		JPanel page1Elem4 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem4.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle4 = new JPanel();
		panelTitle4.setBackground(Consts.UIColor[1]);
		panelTitle4.add(this.label[3]);
		
		page1Elem4.add(panelTitle4);
		page1Elem4.add(this.title);
		
		
		JPanel page1Elem5 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem5.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem5.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle5 = new JPanel();
		panelTitle5.setBackground(Consts.UIColor[1]);
		panelTitle5.add(this.label[4]);
		
		page1Elem5.add(panelTitle5);
		page1Elem5.add(this.yggdra);
		
		
		JPanel page1Elem6 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem6.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem6.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle6 = new JPanel();
		panelTitle6.setBackground(Consts.UIColor[1]);
		panelTitle6.add(this.label[5]);
		
		page1Elem6.add(panelTitle6);
		page1Elem6.add(this.archive);
		
		this.add(page1Elem1);
		this.add(page1Elem2);
		this.add(page1Elem3);
		this.add(page1Elem4);
		this.add(page1Elem5);
		this.add(page1Elem6);
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
		boolean reinca = this.getReinca() == 0 ? false : true;
		
		Title tabTitle[] = Title.getPossibleData(this.getGrade().getGrade(), this.getLvl(), reinca);
		Title memory = this.getTitle();
		
		this.title.setModel(new DefaultComboBoxModel<Title>(tabTitle));
		this.title.setSelectedItem(memory);
	}
}
