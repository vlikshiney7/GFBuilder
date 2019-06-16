package fr.vlik.gfbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.uidesign.*;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JFrame main;
	private ArrayList<ArrayList<ArrayList<String>>> fr_en = new ArrayList<ArrayList<ArrayList<String>>>(2);
	private ArrayList<ArrayList<JLabel>> allLabel = new ArrayList<ArrayList<JLabel>>();
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	private ArrayList<JPanel> showAndHideTalent = new ArrayList<JPanel>();
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>();
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	private ArrayList<JPanel> mainPage = new ArrayList<JPanel>();
	DefaultComboBoxModel<String> model;
	
	private JCustomComboBox<String> listClasses;
	private JCustomSpinner spinnerLvl;
	private JCustomComboBox<Title> CBoxTitle;
	private JCustomComboBox<String> lvlReinca;
	private JCustomComboBox<Yggdrasil> yggdrasil;
	private JCustomComboBox<Archive> CBoxArchive = new JCustomComboBox<Archive>();
	
	private ArrayList<JCustomComboBox<Weapon>> CBoxWeapon = new ArrayList<JCustomComboBox<Weapon>>(3);
	private JCustomComboBox<Bullet> CBoxBullet;
	private ArrayList<JCustomComboBox<Armor>> CBoxArmor = new ArrayList<JCustomComboBox<Armor>>(5);
	private JCustomComboBox<Cape> CBoxCape;
	private ArrayList<JCustomComboBox<Ring>> CBoxRing = new ArrayList<JCustomComboBox<Ring>>(2);
	private JTextPane armorSetInfo = new JTextPane();
	private JTextPane capeRingSetInfo = new JTextPane();
	
	private ArrayList<JCustomComboBox<Enchantment>> CBoxEnchant = new ArrayList<JCustomComboBox<Enchantment>>(11);
	private ArrayList<JCustomComboBox<String>> valueFortif = new ArrayList<JCustomComboBox<String>>(8);
	private ArrayList<JCustomComboBox<Pearl>> CBoxPearl = new ArrayList<JCustomComboBox<Pearl>>(18);
	private ArrayList<JCustomComboBox<String>> listEffectXpStuff = new ArrayList<JCustomComboBox<String>>(24);
	private ArrayList<JCustomComboBox<String>> listLvlXpStuff = new ArrayList<JCustomComboBox<String>>(24);
	
	private JCustomComboBox<Mount> CBoxMount;
	private ArrayList<ArrayList<JCustomRadioButton>> colorGenki = new ArrayList<ArrayList<JCustomRadioButton>>(2);
	private ArrayList<ArrayList<JStarCheckBox>> starGenki = new ArrayList<ArrayList<JStarCheckBox>>(2);
	private ArrayList<JCustomComboBox<Genki>> CBoxGenki = new ArrayList<JCustomComboBox<Genki>>(2);
	
	private ArrayList<JCustomRadioButton> costWeapon = new ArrayList<JCustomRadioButton>(2);
	private ArrayList<JCustomCheckBox> checkBoxRunway = new ArrayList<JCustomCheckBox>(8);
	private ArrayList<ArrayList<JCustomRadioButton>> costQuality = new ArrayList<ArrayList<JCustomRadioButton>>(5);
	private ArrayList<JCustomComboBox<Costume>> CBoxCostume = new ArrayList<JCustomComboBox<Costume>>(5);
	private ArrayList<JCustomComboBox<Pearl>> CBoxCostPearl = new ArrayList<JCustomComboBox<Pearl>>(7);
	
	private JLabel[] tabChosenTalent = new JLabel[9];
	private ArrayList<ArrayList<JCustomRadioButton>> radioTalent = new ArrayList<ArrayList<JCustomRadioButton>>(32);
	private ArrayList<JCustomComboBox<Talent>> CBoxTalent = new ArrayList<JCustomComboBox<Talent>>(24);
	private JCustomLabel combiTalent = new JCustomLabel(new CombiTalent());
	
	private Speciality[] tabSpeciality;
	private JLabel nbSpePoint = new JLabel("1145");
	private ArrayList<JLabel> iconSpe = new ArrayList<JLabel>(20);
	private ArrayList<JCustomComboBox<Integer>> CBoxSpePoint = new ArrayList<JCustomComboBox<Integer>>(20);
	
	private ArrayList<JCustomLabel> skillNatif = new ArrayList<JCustomLabel>(5);
	private ArrayList<JCustomComboBox<Skill>> skillProgress = new ArrayList<JCustomComboBox<Skill>>(2);
	private JCustomComboBox<ProSkill> CBoxProSkill;
	
	private ArrayList<JCustomComboBox<Blason>> CBoxBlason = new ArrayList<JCustomComboBox<Blason>>(2);
	private JCustomComboBox<Buff> CBoxIsleBuff;
	
	private ArrayList<JCustomComboBox<Nucleus>> CBoxNucleus = new ArrayList<JCustomComboBox<Nucleus>>(6);
	private ArrayList<JCustomSpinner> spinnerEnergy = new ArrayList<JCustomSpinner>(6);
	private ArrayList<JCustomButton> cross = new ArrayList<JCustomButton>(7);
	private ArrayList<JCustomLabel> guildBuffUsed = new ArrayList<JCustomLabel>(4);
	private JCustomList<GuildBuff> listGuildBuff;
	private ArrayList<JCustomLabel> stoneUsed = new ArrayList<JCustomLabel>(3);
	private JCustomList<Nucleus> listStone;
	
	private JCustomComboBox<Bague> CBoxBague = new JCustomComboBox<Bague>();
	private JCustomComboBox<Anima> CBoxAnima = new JCustomComboBox<Anima>();
	
	private int base[][][] = new int[5][12][100];
	
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private GameStuff allGameStuff;
	

	public void generate() throws IOException {
		setCustomUI();
		
		this.main = new JFrame("Grand Fantasia Builder");
		this.main.setIconImage(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/itemIcon.png")));
		this.main.setSize(1200, 800);
		this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.main.getContentPane().setLayout(new BorderLayout());
		
		setBaseValueByLvl();
		this.allGameStuff = new GameStuff();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/uidesign/trad.txt")));
		String line = reader.readLine();
		fr_en.add(new ArrayList<ArrayList<String>>());
		fr_en.add(new ArrayList<ArrayList<String>>());
		int lineCount = 0;
		while(line != null) {
			fr_en.get(0).add(new ArrayList<String>());
			fr_en.get(1).add(new ArrayList<String>());
			String[] lineSplit = line.split("/");
			for(int i = 0; i < lineSplit.length; i++) {
				String[] language = lineSplit[i].split(",");
				fr_en.get(0).get(lineCount).add(language[0]);
				fr_en.get(1).get(lineCount).add(language[1]);
			}
			lineCount++;
			line = reader.readLine();
		}
		
		/****************************************/
		/*		****	   MENU		  	****	*/
		/****************************************/
		
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(160, 0));
		menu.setBackground(Consts.UIColor[0]);
		menu.setLayout(new GridLayout(14, 1, 0, 0));
		
		for(int i = 0; i < this.fr_en.get(0).size(); i++) {
			if(i == 0) {
				for(int j = 0; j < this.fr_en.get(0).get(i).size(); j++) {
					JCustomTabPane tabPane = new JCustomTabPane(this.fr_en.get(0).get(i).get(j));
					tabPane.setBackground(Consts.UIColor[0]);
					tabPane.setBorder(null);
					tabPane.setFocusPainted(false);
					tabPane.setFont(new Font("Open Sans", Font.PLAIN, 24));
					tabPane.setForeground(Consts.FontColor[0]);
					tabPane.setPressedBackgroundColor(Consts.UIColor[1]);
					tabPane.setHoverBackgroundColor(Consts.UIColor[2]);
					tabPane.setPreferredSize(new Dimension(160, 0));
					int id = j;
					tabPane.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							MainFrame.this.updateTabPane(id);
						}
					});
					
					this.tabPaneMenu.add(tabPane);
					menu.add(tabPane);
				}
				
			} else {
				this.allLabel.add(new ArrayList<JLabel>());
				for(int j = 0; j < this.fr_en.get(0).get(i).size(); j++) {
					JLabel label = new JLabel(this.fr_en.get(0).get(i).get(j));
					label.setFont(new Font("Open Sans", Font.BOLD, 16));
					label.setForeground(Consts.FontColor[0]);
					label.setAlignmentX(CENTER_ALIGNMENT);
					
					this.allLabel.get(i-1).add(label);
				}
			}
		}
		
		this.tabPaneMenu.get(0).setFont(new Font("Open Sans", Font.BOLD, 24));
		this.tabPaneMenu.get(0).setSelected(true);
		
		this.language = new JCustomTabPane("fr", "en");
		this.language.setSelected(true);
		this.language.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateLanguage();
			}
		});
		
		menu.add(this.language);
		
		/****************************************/
		/*		****	   CONTENT  	****	*/
		/****************************************/
		
		int page = 0;
		
		/****************************************/
		/*				 PAGE 1					*/
		/****************************************/
		
		/* CLASSE */
		String nameCl[] = { "Destructeur", "Croisé", "Prédateur", "Kage", "Archange", "Druide", "Arcaniste", "Faucheur", "Oméga", "Suprême", "Dimensionnaliste", "Chronomancien" };
		this.listClasses = new JCustomComboBox<String>(nameCl);
		this.listClasses.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.listClasses.setRenderer(new CustomListCellRenderer());
		this.listClasses.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateSkill();
				MainFrame.this.updateProSkill();
				MainFrame.this.updateListStuff();
				MainFrame.this.updateListTalent();
				MainFrame.this.updateListSpe();
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem1 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem1.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle1 = new JPanel();
		panelTitle1.setBackground(Consts.UIColor[1]);
		panelTitle1.add(this.allLabel.get(page).get(0));
		
		page1Elem1.add(panelTitle1);
		page1Elem1.add(this.listClasses);
		
		/* LEVEL */
		this.spinnerLvl = new JCustomSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		this.spinnerLvl.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				MainFrame.this.updateSkill();
				MainFrame.this.updateProSkill();
				MainFrame.this.updateListStuff();
				MainFrame.this.updateTitle();
				MainFrame.this.updateMount();
				MainFrame.this.updateTalent();
				MainFrame.this.showSpe();
				MainFrame.this.updateBlason();
				MainFrame.this.updateEnergy();
				MainFrame.this.updateBague();
				MainFrame.this.updateAnima();
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem2 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem2.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle2 = new JPanel();
		panelTitle2.setBackground(Consts.UIColor[1]);
		panelTitle2.add(this.allLabel.get(page).get(1));
		
		page1Elem2.add(panelTitle2);
		page1Elem2.add(this.spinnerLvl);
		
		/* REINCARNATION */
		String nameReinca[] = { "Aucune", "Niveau 1" };
		this.lvlReinca = new JCustomComboBox<String>(nameReinca);
		this.lvlReinca.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.lvlReinca.setRenderer(new CustomListCellRenderer());
		this.lvlReinca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateSkillReinca();
				MainFrame.this.updateTitle();
				MainFrame.this.updateMount();
				MainFrame.this.showSpe();
				MainFrame.this.updateNucleus();
				MainFrame.this.updateEnergy();
				MainFrame.this.updateBague();
				MainFrame.this.updateAnima();
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem3 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem3.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle3 = new JPanel();
		panelTitle3.setBackground(Consts.UIColor[1]);
		panelTitle3.add(this.allLabel.get(page).get(2));
		
		page1Elem3.add(panelTitle3);
		page1Elem3.add(this.lvlReinca);
		
		/* TITRE */
		Title[] tabTitle = this.allGameStuff.getPossibleTitle(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), false);
		this.CBoxTitle = new JCustomComboBox<Title>(new DefaultComboBoxModel<Title>(tabTitle));
		this.CBoxTitle.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxTitle.setRenderer(new CustomListCellRenderer());
		this.CBoxTitle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem4 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem4.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle4 = new JPanel();
		panelTitle4.setBackground(Consts.UIColor[1]);
		panelTitle4.add(this.allLabel.get(page).get(3));
		
		page1Elem4.add(panelTitle4);
		page1Elem4.add(this.CBoxTitle);
		
		/* YGGDRASIL */
		Yggdrasil[] tabYggdra = new Yggdrasil[this.allGameStuff.getListYggdrasil().size()];
		for(int i = 0; i < tabYggdra.length; i++) tabYggdra[i] = this.allGameStuff.getListYggdrasil().get(i);
		this.yggdrasil = new JCustomComboBox<Yggdrasil>(tabYggdra);
		this.yggdrasil.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.yggdrasil.setRenderer(new CustomListCellRenderer());
		this.yggdrasil.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem5 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem5.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem5.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle5 = new JPanel();
		panelTitle5.setBackground(Consts.UIColor[1]);
		panelTitle5.add(this.allLabel.get(page).get(4));
		
		page1Elem5.add(panelTitle5);
		page1Elem5.add(this.yggdrasil);
		
		/* BONUS ARCHIVE */
		Archive[] tabArchive = new Archive[this.allGameStuff.getListArchive().size()];
		for(int i = 0; i < tabArchive.length; i++) tabArchive[i] = this.allGameStuff.getListArchive().get(i);
		
		this.CBoxArchive = new JCustomComboBox<Archive>(new DefaultComboBoxModel<Archive>(tabArchive));
		this.CBoxArchive.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxArchive.setRenderer(new CustomListCellRenderer());
		this.CBoxArchive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page1Elem6 = new JPanel(new GridLayout(2, 1, 10, 10));
		page1Elem6.setBorder(new EmptyBorder(10, 10, 10, 10));
		page1Elem6.setBackground(Consts.UIColor[1]);
		
		JPanel panelTitle6 = new JPanel();
		panelTitle6.setBackground(Consts.UIColor[1]);
		panelTitle6.add(this.allLabel.get(page).get(5));
		
		page1Elem6.add(panelTitle6);
		page1Elem6.add(this.CBoxArchive);
		
		JPanel page1 = new JPanel(new GridLayout(3, 2, 10, 10));
		page1.setBackground(Consts.UIColor[2]);
		page1.add(page1Elem1);
		page1.add(page1Elem2);
		page1.add(page1Elem3);
		page1.add(page1Elem4);
		page1.add(page1Elem5);
		page1.add(page1Elem6);
		
		
		this.mainPage.add(page1);
		
		/****************************************/
		/*				 PAGE 2					*/
		/****************************************/
		page++;
		
		/* ARME */
		JPanel page2 = new JPanel();
		page2.setLayout(new BoxLayout(page2, BoxLayout.Y_AXIS));
		page2.setBackground(Consts.UIColor[2]);

		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = this.allGameStuff.getPossibleWeapon(i, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), null);
			this.CBoxWeapon.add(new JCustomComboBox<Weapon>(tabWeapon));
			this.CBoxWeapon.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxWeapon.get(i).setRenderer(new CustomListCellRenderer());
			
			int id = i;
			this.CBoxWeapon.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.showXpStuff(id, MainFrame.this.CBoxWeapon.get(id).getSelectedIndex());
					MainFrame.this.showStuffDetails(id, MainFrame.this.CBoxWeapon.get(id).getSelectedIndex());
					MainFrame.this.updatePearl(id);
					MainFrame.this.updateEnchant(id);
					MainFrame.this.weaponType(id, MainFrame.this.CBoxWeapon.get(id).getSelectedIndex());
					MainFrame.this.updateStat();
				}
			});
			
			/* ENCHANTEMENT */
			this.CBoxEnchant.add(new JCustomComboBox<Enchantment>());
			this.CBoxEnchant.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxEnchant.get(i).setRenderer(new CustomListCellRenderer());
			this.CBoxEnchant.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxEnchant.get(i).setVisible(false);
			
			/* FORTIF */
			String nameFortif[] = { "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "+10", "+11", "+12", "+13", "+14", "+15", "+16", "+17", "+18", "+19", "+20" };
			this.valueFortif.add(new JCustomComboBox<String>(nameFortif));
			this.valueFortif.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.valueFortif.get(i).setRenderer(new CustomListCellRenderer());
			this.valueFortif.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.valueFortif.get(i).setVisible(false);
			
			/* PEARL */
			Pearl[] tabPearl = this.allGameStuff.getPossibleWeaponPearl(((Weapon) this.CBoxWeapon.get(i).getSelectedItem()).getQuality());
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					this.CBoxPearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.CBoxPearl.get(j).setRenderer(new CustomListCellRenderer());
					this.CBoxPearl.get(j).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							MainFrame.this.updateStat();
						}
					});
					this.CBoxPearl.get(j).setVisible(false);
				}
			} else {
				for(int j = 0; j < 3; j++) {
					this.CBoxPearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.CBoxPearl.get(3*(i+1)+j).setRenderer(new CustomListCellRenderer());
					this.CBoxPearl.get(3*(i+1)+j).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							MainFrame.this.updateStat();
						}
					});
					this.CBoxPearl.get(3*(i+1)+j).setVisible(false);
				}
			}
			
			/* XP STUFF */
			for(int j = 0; j < 2; j++) {
				this.listEffectXpStuff.add(new JCustomComboBox<String>(new String[] {"Rien"}));
				this.listEffectXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.listEffectXpStuff.get(i*2+j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateLvlXpStuff(id);
						MainFrame.this.updateStat();
					}
				});
				this.listEffectXpStuff.get(i*2+j).setVisible(false);
				
				int duo = i*2+j;
				this.listLvlXpStuff.add(new JCustomComboBox<String>());
				this.listLvlXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.listLvlXpStuff.get(i*2+j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateMaxLvlValue(duo);
						MainFrame.this.updateStat();
					}
				});
				this.listLvlXpStuff.get(i*2+j).setVisible(false);
			}
			
			JPanel descWeapon = new JPanel();
			descWeapon.setLayout(new BoxLayout(descWeapon, BoxLayout.X_AXIS));
			descWeapon.setBackground(Consts.UIColor[1]);
			descWeapon.add(this.CBoxWeapon.get(i));
			descWeapon.add(this.CBoxEnchant.get(i));
			descWeapon.add(this.valueFortif.get(i));
			
			JPanel pearlWeapon = new JPanel();
			pearlWeapon.setLayout(new BoxLayout(pearlWeapon, BoxLayout.Y_AXIS));
			pearlWeapon.setBackground(Consts.UIColor[1]);
			if(i == 0)	for(int j = 0; j < 6; j++) {
				pearlWeapon.add(this.CBoxPearl.get(j));
				pearlWeapon.add(Box.createVerticalStrut(3));
			}
			else		for(int j = 0; j < 3; j++) {
				pearlWeapon.add(this.CBoxPearl.get(3*(i+1)+j));
				pearlWeapon.add(Box.createVerticalStrut(3));
			}
			
			JPanel xpWeapon = new JPanel(new GridLayout(1, 3, 10, 3));
			xpWeapon.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+3).setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpWeapon.add(this.allLabel.get(page).get(i+3));
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Consts.UIColor[1]);
				xp.add(this.listEffectXpStuff.get(i*2+j));
				xp.add(this.listLvlXpStuff.get(i*2+j));
				xpWeapon.add(xp);
			}
			
			JPanel page2ElemI = new JPanel();
			page2ElemI.setLayout(new BoxLayout(page2ElemI, BoxLayout.Y_AXIS));
			page2ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page2ElemI.setBackground(Consts.UIColor[1]);
			page2ElemI.add(this.allLabel.get(page).get(i));
			page2ElemI.add(Box.createVerticalStrut(10));
			page2ElemI.add(descWeapon);
			page2ElemI.add(Box.createVerticalStrut(5));
			page2ElemI.add(pearlWeapon);
			page2ElemI.add(Box.createVerticalStrut(2));
			page2ElemI.add(xpWeapon);
			
			if(i == 1) this.showAndHide.add(page2ElemI);
			this.showAndHideXpStuff.add(xpWeapon);	
			
			page2.add(page2ElemI);
			page2.add(Box.createVerticalStrut(10));
		}
		
		Bullet[] tabBullet = this.allGameStuff.getPossibleBullet(this.spinnerLvl.getIntValue());
		this.CBoxBullet = new JCustomComboBox<Bullet>(tabBullet);
		this.CBoxBullet.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxBullet.setRenderer(new CustomListCellRenderer());
		this.CBoxBullet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page2Elem1 = new JPanel();
		page2Elem1.setLayout(new BoxLayout(page2Elem1, BoxLayout.Y_AXIS));
		page2Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page2Elem1.setBackground(Consts.UIColor[1]);
		page2Elem1.add(this.allLabel.get(page).get(6));
		page2Elem1.add(Box.createVerticalStrut(10));
		page2Elem1.add(this.CBoxBullet);
		
		page2.add(page2Elem1);
		
		this.mainPage.add(page2);
		
		/****************************************/
		/*				 PAGE 3					*/
		/****************************************/
		page++;
		
		/* ARMURE */
		JPanel page3 = new JPanel();
		page3.setLayout(new BoxLayout(page3, BoxLayout.Y_AXIS));
		page3.setBackground(Consts.UIColor[2]);
		
		for(int i = 0; i < 5; i++) {
			/* NOM */
			Armor[] tabArmor = this.allGameStuff.getPossibleArmor(i, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
			this.CBoxArmor.add(new JCustomComboBox<Armor>(new DefaultComboBoxModel<Armor>(tabArmor)));
			this.CBoxArmor.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxArmor.get(i).setRenderer(new CustomListCellRenderer());
			
			int id = i;
			this.CBoxArmor.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updatePearl(id+3);
					MainFrame.this.showStuffDetails(id+3, MainFrame.this.CBoxArmor.get(id).getSelectedIndex());
					MainFrame.this.updateEnchant(id+3);
					MainFrame.this.showXpStuff(id+3, MainFrame.this.CBoxArmor.get(id).getSelectedIndex());
					MainFrame.this.updateStat();
				}
			});
			
			/* ENCHANTEMENT */
			this.CBoxEnchant.add(new JCustomComboBox<Enchantment>());
			this.CBoxEnchant.get(i+3).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxEnchant.get(i+3).setRenderer(new CustomListCellRenderer());
			this.CBoxEnchant.get(i+3).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxEnchant.get(i+3).setVisible(false);
			
			/* FORTIF */
			String nameFortif[] = { "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "+10", "+11", "+12", "+13", "+14", "+15", "+16", "+17", "+18", "+19", "+20" };
			this.valueFortif.add(new JCustomComboBox<String>(nameFortif));
			this.valueFortif.get(i+3).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.valueFortif.get(i+3).setRenderer(new CustomListCellRenderer());
			this.valueFortif.get(i+3).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.valueFortif.get(i+3).setVisible(false);
			
			/* PERLE */
			Pearl[] tabPearl = this.allGameStuff.getPossibleArmorPearl(((Armor) this.CBoxArmor.get(i).getSelectedItem()).getQuality());
			
			this.CBoxPearl.add(new JCustomComboBox<Pearl>(tabPearl));
			
			if(i == 0) {
				this.CBoxPearl.get(i+12).setRenderer(new CustomListCellRenderer());
				this.CBoxPearl.get(i+12).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxPearl.get(i+12).setVisible(false);
			} else if(i == 1) {
				this.CBoxPearl.add(new JCustomComboBox<Pearl>(tabPearl));
				this.CBoxPearl.get(i+12).setRenderer(new CustomListCellRenderer());
				this.CBoxPearl.get(i+13).setRenderer(new CustomListCellRenderer());
				this.CBoxPearl.get(i+12).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxPearl.get(i+13).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxPearl.get(i+12).setVisible(false);
				this.CBoxPearl.get(i+13).setVisible(false);
			} else {
				this.CBoxPearl.get(i+13).setRenderer(new CustomListCellRenderer());
				this.CBoxPearl.get(i+13).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxPearl.get(i+13).setVisible(false);
			}
			
			/* XP STUFF */
			String[] tmp = new String[this.allGameStuff.getListXpStuff().get(i+16).size()+1];
			tmp[0] = "Rien";
			for(int j = 0; j < tmp.length-1; j++) tmp[j+1] = this.allGameStuff.getListXpStuff().get(i+16).get(j).getType().name();
			for(int j = 0; j < 2; j++) {
				this.listEffectXpStuff.add(new JCustomComboBox<String>(tmp));
				this.listEffectXpStuff.get(i*2+j+6).setRenderer(new CustomListCellRenderer());
				this.listEffectXpStuff.get(i*2+j+6).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateLvlXpStuff(id+3);
						MainFrame.this.updateStat();
					}
				});
				this.listEffectXpStuff.get(i*2+j+6).setVisible(false);
				
				int duo = i*2+j+6;
				this.listLvlXpStuff.add(new JCustomComboBox<String>());
				this.listLvlXpStuff.get(i*2+j+6).setRenderer(new CustomListCellRenderer());
				this.listLvlXpStuff.get(i*2+j+6).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateMaxLvlValue(duo);
						MainFrame.this.updateStat();
					}
				});
				this.listLvlXpStuff.get(i*2+j+6).setVisible(false);
			}
			
			JPanel descArmor = new JPanel();
			descArmor.setLayout(new BoxLayout(descArmor, BoxLayout.X_AXIS));
			descArmor.setBackground(Consts.UIColor[1]);
			descArmor.add(this.CBoxArmor.get(i));
			descArmor.add(this.CBoxEnchant.get(i+3));
			descArmor.add(this.valueFortif.get(i+3));
			
			JPanel pearlArmor = new JPanel();
			pearlArmor.setLayout(new BoxLayout(pearlArmor, BoxLayout.Y_AXIS));
			pearlArmor.setBackground(Consts.UIColor[1]);
			if(i == 0) {
				pearlArmor.add(this.CBoxPearl.get(i+12));
				pearlArmor.add(Box.createVerticalStrut(3));
			} else if (i == 1) {
				pearlArmor.add(this.CBoxPearl.get(i+12));
				pearlArmor.add(Box.createVerticalStrut(3));
				pearlArmor.add(this.CBoxPearl.get(i+13));
				pearlArmor.add(Box.createVerticalStrut(3));
			} else {
				pearlArmor.add(this.CBoxPearl.get(i+13));
				pearlArmor.add(Box.createVerticalStrut(3));
			}
			
			JPanel xpArmor = new JPanel(new GridLayout(1, 3, 10, 3));
			xpArmor.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+5).setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpArmor.add(this.allLabel.get(page).get(i+5));
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Consts.UIColor[1]);
				xp.add(this.listEffectXpStuff.get(i*2+j+6));
				xp.add(this.listLvlXpStuff.get(i*2+j+6));
				xpArmor.add(xp);
			}
			
			JPanel page3ElemI = new JPanel();
			page3ElemI.setLayout(new BoxLayout(page3ElemI, BoxLayout.Y_AXIS));
			page3ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page3ElemI.setBackground(Consts.UIColor[1]);
			page3ElemI.add(this.allLabel.get(page).get(i));
			page3ElemI.add(Box.createVerticalStrut(10));
			page3ElemI.add(descArmor);
			page3ElemI.add(Box.createVerticalStrut(5));
			page3ElemI.add(pearlArmor);
			page3ElemI.add(Box.createVerticalStrut(2));
			page3ElemI.add(xpArmor);
			
			this.showAndHideXpStuff.add(xpArmor);	
			
			page3.add(page3ElemI);
			page3.add(Box.createVerticalStrut(10));
		}
		
		/* BONUS SET */
		this.armorSetInfo.setEditable(false);
		this.armorSetInfo.setText(this.allLabel.get(page).get(10).getText());
		this.armorSetInfo.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.armorSetInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.armorSetInfo.setBackground(Consts.UIColor[1]);
		this.armorSetInfo.setForeground(Consts.FontColor[0]);
		page3.add(this.armorSetInfo);
		
		this.mainPage.add(page3);
		
		/****************************************/
		/*				 PAGE 4					*/
		/****************************************/
		page++;
		
		/* CAPE */
		Cape[] tabCape = this.allGameStuff.getPossibleCape(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		this.CBoxCape = new JCustomComboBox<Cape>(new DefaultComboBoxModel<Cape>(tabCape));
		this.CBoxCape.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxCape.setRenderer(new CustomListCellRenderer());
		
		this.CBoxCape.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.showXpStuff(8, MainFrame.this.CBoxCape.getSelectedIndex());
				MainFrame.this.updateEnchant(8);
				MainFrame.this.updateStat();
			}
		});
		
		/* ENCHANTEMENT */
		this.CBoxEnchant.add(new JCustomComboBox<Enchantment>());
		this.CBoxEnchant.get(8).setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxEnchant.get(8).setRenderer(new CustomListCellRenderer());
		this.CBoxEnchant.get(8).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		this.CBoxEnchant.get(8).setVisible(false);
		
		/* XP STUFF */
		String[] tmp = new String[this.allGameStuff.getListXpStuff().get(21).size()+1];
		tmp[0] = "Rien";
		for(int i = 0; i < tmp.length-1; i++) tmp[i+1] = this.allGameStuff.getListXpStuff().get(21).get(i).getType().name();
		for(int i = 0; i < 2; i++) {
			this.listEffectXpStuff.add(new JCustomComboBox<String>(tmp));
			this.listEffectXpStuff.get(i+16).setRenderer(new CustomListCellRenderer());
			this.listEffectXpStuff.get(i+16).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateLvlXpStuff(8);
					MainFrame.this.updateStat();
				}
			});
			this.listEffectXpStuff.get(i+16).setVisible(false);
			
			int duo = i+16;
			this.listLvlXpStuff.add(new JCustomComboBox<String>());
			this.listLvlXpStuff.get(i+16).setRenderer(new CustomListCellRenderer());
			this.listLvlXpStuff.get(i+16).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateMaxLvlValue(duo);
					MainFrame.this.updateStat();
				}
			});
			this.listLvlXpStuff.get(i+16).setVisible(false);
		}
		
		JPanel descCape = new JPanel();
		descCape.setLayout(new BoxLayout(descCape, BoxLayout.X_AXIS));
		descCape.setBackground(Consts.UIColor[1]);
		descCape.add(this.CBoxCape);
		descCape.add(this.CBoxEnchant.get(8));
		
		JPanel xpCape = new JPanel(new GridLayout(1, 3, 10, 3));
		xpCape.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(1).setFont(new Font("Open Sans", Font.PLAIN, 14));
		xpCape.add(this.allLabel.get(page).get(1));
		for(int i = 0; i < 2; i++) {
			JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
			xp.setBackground(Consts.UIColor[1]);
			xp.add(this.listEffectXpStuff.get(i+16));
			xp.add(this.listLvlXpStuff.get(i+16));
			xpCape.add(xp);
		}
		
		JPanel page4Elem1 = new JPanel();
		page4Elem1.setLayout(new BoxLayout(page4Elem1, BoxLayout.Y_AXIS));
		page4Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page4Elem1.setBackground(Consts.UIColor[1]);
		page4Elem1.add(this.allLabel.get(page).get(0));
		page4Elem1.add(Box.createVerticalStrut(10));
		page4Elem1.add(descCape);
		page4Elem1.add(Box.createVerticalStrut(5));
		page4Elem1.add(xpCape);
		
		this.showAndHideXpStuff.add(xpCape);
		
		JPanel page4 = new JPanel();
		page4.setLayout(new BoxLayout(page4, BoxLayout.Y_AXIS));
		page4.setBackground(Consts.UIColor[2]);
		page4.add(page4Elem1);
		
		/* RING */
		Ring[] tabRing = this.allGameStuff.getPossibleRing(this.spinnerLvl.getIntValue(), null);
		for(int i = 0; i < 2; i++) {
			this.CBoxRing.add(new JCustomComboBox<Ring>(new DefaultComboBoxModel<Ring>(tabRing)));
			this.CBoxRing.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxRing.get(i).setRenderer(new CustomListCellRenderer());
			
			int id = i;
			this.CBoxRing.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.showXpStuff(id+9, MainFrame.this.CBoxRing.get(id).getSelectedIndex());
					MainFrame.this.updateEnchant(id+9);
					MainFrame.this.updateDoubleRing(id);
					MainFrame.this.updateStat();
				}
			});
			
			/* ENCHANTEMENT */
			this.CBoxEnchant.add(new JCustomComboBox<Enchantment>());
			this.CBoxEnchant.get(i+9).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxEnchant.get(i+9).setRenderer(new CustomListCellRenderer());
			this.CBoxEnchant.get(i+9).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxEnchant.get(i+9).setVisible(false);
			
			/* XP STUFF */
			tmp = new String[this.allGameStuff.getListXpStuff().get(22).size()+1];
			tmp[0] = "Rien";
			for(int j = 0; j < tmp.length-1; j++) tmp[j+1] = this.allGameStuff.getListXpStuff().get(22).get(j).getType().name();
			for(int j = 0; j < 2; j++) {
				this.listEffectXpStuff.add(new JCustomComboBox<String>(tmp));
				this.listEffectXpStuff.get(i*2+j+18).setRenderer(new CustomListCellRenderer());
				this.listEffectXpStuff.get(i*2+j+18).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateLvlXpStuff(id+9);
						MainFrame.this.updateStat();
					}
				});
				this.listEffectXpStuff.get(i*2+j+18).setVisible(false);
				
				int duo = i*2+j+18;
				this.listLvlXpStuff.add(new JCustomComboBox<String>());
				this.listLvlXpStuff.get(i*2+j+18).setRenderer(new CustomListCellRenderer());
				this.listLvlXpStuff.get(i*2+j+18).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateMaxLvlValue(duo);
						MainFrame.this.updateStat();
					}
				});
				this.listLvlXpStuff.get(i*2+j+18).setVisible(false);
			}
			
			JPanel descRing = new JPanel();
			descRing.setLayout(new BoxLayout(descRing, BoxLayout.X_AXIS));
			descRing.setBackground(Consts.UIColor[1]);
			descRing.add(this.CBoxRing.get(i));
			descRing.add(this.CBoxEnchant.get(i+9));
			
			JPanel xpRing = new JPanel(new GridLayout(1, 3, 10, 3));
			xpRing.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+4).setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpRing.add(this.allLabel.get(page).get(i+4));
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Consts.UIColor[1]);
				xp.add(this.listEffectXpStuff.get(i*2+j+18));
				xp.add(this.listLvlXpStuff.get(i*2+j+18));
				xpRing.add(xp);
			}
			
			JPanel page4ElemI = new JPanel();
			page4ElemI.setLayout(new BoxLayout(page4ElemI, BoxLayout.Y_AXIS));
			page4ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page4ElemI.setBackground(Consts.UIColor[1]);
			page4ElemI.add(this.allLabel.get(page).get(i+2));
			page4ElemI.add(Box.createVerticalStrut(10));
			page4ElemI.add(descRing);
			page4ElemI.add(Box.createVerticalStrut(5));
			page4ElemI.add(xpRing);
			
			this.showAndHideXpStuff.add(xpRing);
			
			page4.add(Box.createVerticalStrut(10));
			page4.add(page4ElemI);
		}
		
		/* BONUS SET */
		this.capeRingSetInfo.setEditable(false);
		this.capeRingSetInfo.setText(this.allLabel.get(page).get(6).getText());
		this.capeRingSetInfo.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.capeRingSetInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.capeRingSetInfo.setBackground(Consts.UIColor[1]);
		this.capeRingSetInfo.setForeground(Consts.FontColor[0]);
		
		page4.add(Box.createVerticalStrut(10));
		page4.add(this.capeRingSetInfo);
		
		this.mainPage.add(page4);
		
		/****************************************/
		/*				 PAGE 5					*/
		/****************************************/
		page++;
		
		Mount[] tabMount = this.allGameStuff.getPossibleMount(this.spinnerLvl.getIntValue(), this.lvlReinca.getSelectedIndex() == 1);
		this.CBoxMount = new JCustomComboBox<Mount>(tabMount);
		this.CBoxMount.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxMount.setRenderer(new CustomListCellRenderer());
		this.CBoxMount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.showXpStuff(11, MainFrame.this.CBoxMount.getSelectedIndex());
				MainFrame.this.updateStat();
			}
		});
		
		tmp = new String[this.allGameStuff.getListXpStuff().get(24).size()+1];
		tmp[0] = "Rien";
		for(int i = 0; i < tmp.length-1; i++) tmp[i+1] = this.allGameStuff.getListXpStuff().get(24).get(i).getType().name();
		for(int i = 0; i < 2; i++) {
			this.listEffectXpStuff.add(new JCustomComboBox<String>(tmp));
			this.listEffectXpStuff.get(i+22).setRenderer(new CustomListCellRenderer());
			this.listEffectXpStuff.get(i+22).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateLvlXpStuff(11);
					MainFrame.this.updateStat();
				}
			});
			this.listEffectXpStuff.get(i+22).setVisible(false);
			
			int duo = i+22;
			this.listLvlXpStuff.add(new JCustomComboBox<String>());
			this.listLvlXpStuff.get(i+22).setRenderer(new CustomListCellRenderer());
			this.listLvlXpStuff.get(i+22).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateMaxLvlValue(duo);
					MainFrame.this.updateStat();
				}
			});
			this.listLvlXpStuff.get(i+22).setVisible(false);
		}
		
		
		JPanel xpRide = new JPanel(new GridLayout(1, 3, 10, 3));
		xpRide.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(1).setFont(new Font("Open Sans", Font.PLAIN, 14));
		xpRide.add(this.allLabel.get(page).get(1));
		for(int i = 0; i < 2; i++) {
			JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
			xp.setBackground(Consts.UIColor[1]);
			xp.add(this.listEffectXpStuff.get(i+22));
			xp.add(this.listLvlXpStuff.get(i+22));
			xpRide.add(xp);
		}
		
		JPanel page5Elem1 = new JPanel();
		page5Elem1.setLayout(new BoxLayout(page5Elem1, BoxLayout.Y_AXIS));
		page5Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page5Elem1.setBackground(Consts.UIColor[1]);
		page5Elem1.add(this.allLabel.get(page).get(0));
		page5Elem1.add(Box.createVerticalStrut(10));
		page5Elem1.add(this.CBoxMount);
		page5Elem1.add(Box.createVerticalStrut(5));
		page5Elem1.add(xpRide);
		
		this.showAndHideXpStuff.add(xpRide);
		this.showAndHide.add(page5Elem1);
		
		
		JPanel page5 = new JPanel();
		page5.setLayout(new BoxLayout(page5, BoxLayout.Y_AXIS));
		page5.setBackground(Consts.UIColor[2]);
		page5.add(page5Elem1);
		
		/* GENKI */
		
		for(int i = 0; i < 2; i++) {
			JPanel qualityPanel = new JPanel();
			JPanel starPanel = new JPanel();
			ButtonGroup quality = new ButtonGroup();
			
			int id = i;
			
			qualityPanel.setBackground(Consts.UIColor[1]);
			qualityPanel.setForeground(Consts.FontColor[0]);
			qualityPanel.setBorder(null);
			
			starPanel.setBackground(Consts.UIColor[1]);
			starPanel.setForeground(Consts.FontColor[0]);
			starPanel.setBorder(null);
			
			this.colorGenki.add(new ArrayList<JCustomRadioButton>(6));
			
			for(int j = 0; j < 6; j++) {
				this.allLabel.get(page).get(i*7+j+3).setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.colorGenki.get(i).add(new JCustomRadioButton(this.allLabel.get(page).get(i*7+j+3).getText(), "radio0" + j, "radioOff"));
				this.colorGenki.get(i).get(j).setBackground(Consts.UIColor[1]);
				this.colorGenki.get(i).get(j).setForeground(Consts.itemColor[j]);
				this.colorGenki.get(i).get(j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateGenkiQuality(id);
						MainFrame.this.updateStat();
					}
				});
				quality.add(this.colorGenki.get(i).get(j));
				qualityPanel.add(this.colorGenki.get(i).get(j));
			}
			
			this.starGenki.add(new ArrayList<JStarCheckBox>(5));
			
			for(int j = 0; j < 5; j++) {
				int idCheck = j;
				
				this.starGenki.get(i).add(new JStarCheckBox());
				this.starGenki.get(i).get(j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateGenkiStar(id, idCheck);
						MainFrame.this.updateStat();
					}
				});
				this.starGenki.get(i).get(j).setVisible(false);
				
				starPanel.add(this.starGenki.get(i).get(j));
			}
			
			this.CBoxGenki.add(new JCustomComboBox<Genki>());
			
			this.CBoxGenki.get(i).setRenderer(new CustomListCellRenderer());
			this.CBoxGenki.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxGenki.get(i).setVisible(false);
	
			JPanel page5ElemI = new JPanel();
			page5ElemI.setLayout(new BoxLayout(page5ElemI, BoxLayout.Y_AXIS));
			page5ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page5ElemI.setBackground(Consts.UIColor[1]);
			page5ElemI.add(this.allLabel.get(page).get(i*7+2));
			page5ElemI.add(Box.createVerticalStrut(10));
			page5ElemI.add(qualityPanel);
			page5ElemI.add(Box.createVerticalStrut(5));
			page5ElemI.add(starPanel);
			page5ElemI.add(Box.createVerticalStrut(5));
			page5ElemI.add(this.CBoxGenki.get(i));
			
			page5.add(Box.createVerticalStrut(10));
			page5.add(page5ElemI);
		}
		
		this.mainPage.add(page5);
		
		/****************************************/
		/*				 PAGE 6					*/
		/****************************************/
		page++;
		
		JPanel costGroupPanel = new JPanel();
		ButtonGroup costGroup = new ButtonGroup();
		
		costGroupPanel.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(4).setFont(new Font("Open Sans", Font.PLAIN, 14));
		costGroupPanel.add(this.allLabel.get(page).get(4));
		
		for(int i = 0; i < 2; i++) {
			this.costWeapon.add(new JCustomRadioButton(this.allLabel.get(page).get(i+5).getText(), "radio11", "radioOff"));
			this.costWeapon.get(i).setBackground(Consts.UIColor[1]);
			this.costWeapon.get(i).setForeground(Consts.FontColor[0]);
			this.costWeapon.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.showWeaponCost();
					MainFrame.this.updateStat();
				}
			});
			
			costGroup.add(this.costWeapon.get(i));
			costGroupPanel.add(this.costWeapon.get(i));
		}
		
		JPanel runway = new JPanel();
		runway.setBackground(Consts.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(14).getText()));
				this.checkBoxRunway.get(i).setToolTipText(this.allGameStuff.getTooltipRunway(Runway.currentRunway[0]));
			} else {
				this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(18).getText()));
				this.checkBoxRunway.get(i).setToolTipText(this.allGameStuff.getTooltipRunway(Runway.currentRunway[4]));
			}
			
			this.checkBoxRunway.get(i).setBackground(Consts.UIColor[1]);
			this.checkBoxRunway.get(i).setForeground(Consts.FontColor[0]);
			
			int id = i;
			this.checkBoxRunway.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateCheckBoxRunway(id);
					MainFrame.this.updateStat();
				}
			});
			runway.add(this.checkBoxRunway.get(i));
		}
		
		JPanel sectionCost = new JPanel();
		sectionCost.setLayout(new BoxLayout(sectionCost, BoxLayout.Y_AXIS));
		sectionCost.setBackground(Consts.UIColor[1]);
		
		for(int i = 0; i < 2; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+7).setFont(new Font("Open Sans", Font.PLAIN, 14));
			currentQualityPanel.add(this.allLabel.get(page).get(i+7));
			ButtonGroup currentQuality = new ButtonGroup();
			int id = i;
			this.costQuality.add(new ArrayList<JCustomRadioButton>(5));
			for(int j = 0; j < 5; j++) {
				this.allLabel.get(page).get(j+9).setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.costQuality.get(i).add(new JCustomRadioButton(this.allLabel.get(page).get(j+9).getText(), "radio1" + j, "radioOff"));
				this.costQuality.get(i).get(j).setBackground(Consts.UIColor[1]);
				this.costQuality.get(i).get(j).setForeground(Consts.costColor[j]);
				this.costQuality.get(i).get(j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateCostume(id);
						MainFrame.this.updateStat();
					}
				});
				
				currentQuality.add(this.costQuality.get(i).get(j));
				currentQualityPanel.add(this.costQuality.get(i).get(j));
			}
			
			this.CBoxCostume.add(new JCustomComboBox<Costume>());
			this.CBoxCostume.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxCostume.get(i).setRenderer(new CustomListCellRenderer());
			this.CBoxCostume.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxCostume.get(i).setVisible(false);
			
			ArrayList<Pearl> listCostPearl = this.allGameStuff.getListWeaponCostPearl();
			Pearl[] tmpPearl = new Pearl[listCostPearl.size()];
			for(int j = 0; j < tmpPearl.length; j++) tmpPearl[j] = listCostPearl.get(j);
			
			if(i == 0) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
				this.CBoxCostPearl.get(i).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i).setVisible(false);
			}
			
			this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
			this.CBoxCostPearl.get(i+1).setRenderer(new CustomListCellRenderer());
			this.CBoxCostPearl.get(i+1).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxCostPearl.get(i+1).setVisible(false);
			
			
			JPanel itemCost = new JPanel();
			itemCost.setLayout(new BoxLayout(itemCost, BoxLayout.Y_AXIS));
			itemCost.setBackground(Consts.UIColor[1]);
			itemCost.add(Box.createVerticalStrut(10));
			itemCost.add(currentQualityPanel);
			itemCost.add(Box.createVerticalStrut(3));
			itemCost.add(this.CBoxCostume.get(i));
			if(i == 0) {
				itemCost.add(Box.createVerticalStrut(3));
				itemCost.add(this.CBoxCostPearl.get(i));
			}
			itemCost.add(Box.createVerticalStrut(3));
			itemCost.add(this.CBoxCostPearl.get(i+1));
			
			sectionCost.add(itemCost);
			
			if(i == 1) this.showAndHide.add(itemCost);
		}
		
		JPanel page6Elem1 = new JPanel();
		page6Elem1.setLayout(new BoxLayout(page6Elem1, BoxLayout.Y_AXIS));
		page6Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page6Elem1.setBackground(Consts.UIColor[1]);
		page6Elem1.add(this.allLabel.get(page).get(0));
		page6Elem1.add(Box.createVerticalStrut(10));
		page6Elem1.add(costGroupPanel);
		page6Elem1.add(Box.createVerticalStrut(3));
		page6Elem1.add(runway);
		page6Elem1.add(sectionCost);
		
		JPanel page6 = new JPanel();
		page6.setLayout(new BoxLayout(page6, BoxLayout.Y_AXIS));
		page6.setBackground(Consts.UIColor[2]);
		page6.add(page6Elem1);
		
		for(int i = 0; i < 3; i++) {
			JPanel runwayPanel = new JPanel();
			runwayPanel.setBackground(Consts.UIColor[1]);
			
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(i+15).getText()));
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(this.allGameStuff.getTooltipRunway(Runway.currentRunway[i+1]));
				} else {
					this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(18).getText()));
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(this.allGameStuff.getTooltipRunway(Runway.currentRunway[4]));
				}
				
				this.checkBoxRunway.get(i*2+j+2).setBackground(Consts.UIColor[1]);
				this.checkBoxRunway.get(i*2+j+2).setForeground(Consts.FontColor[0]);
				
				int id = i*2+j+2;
				this.checkBoxRunway.get(i*2+j+2).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateCheckBoxRunway(id);
						MainFrame.this.updateStat();
					}
				});
				runwayPanel.add(this.checkBoxRunway.get(i*2+j+2));
			}
			
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Consts.UIColor[1]);
			ButtonGroup currentQuality = new ButtonGroup();
			int id = i+2;
			this.costQuality.add(new ArrayList<JCustomRadioButton>(5));
			for(int j = 0; j < 5; j++) {
				this.allLabel.get(page).get(j+9).setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.costQuality.get(i+2).add(new JCustomRadioButton(this.allLabel.get(page).get(j+9).getText(), "radio1" + j, "radioOff"));
				this.costQuality.get(i+2).get(j).setBackground(Consts.UIColor[1]);
				this.costQuality.get(i+2).get(j).setForeground(Consts.costColor[j]);
				this.costQuality.get(i+2).get(j).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateCostume(id);
						MainFrame.this.updateStat();
					}
				});
				
				currentQuality.add(this.costQuality.get(i+2).get(j));
				currentQualityPanel.add(this.costQuality.get(i+2).get(j));
			}
			
			this.CBoxCostume.add(new JCustomComboBox<Costume>());
			this.CBoxCostume.get(i+2).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxCostume.get(i+2).setRenderer(new CustomListCellRenderer());
			this.CBoxCostume.get(i+2).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.CBoxCostume.get(i+2).setVisible(false);
			
			ArrayList<Pearl> listCostPearl = this.allGameStuff.getListArmorCostPearl();
			Pearl[] tmpPearl = new Pearl[listCostPearl.size()];
			for(int j = 0; j < tmpPearl.length; j++) tmpPearl[j] = listCostPearl.get(j);
			
			if(i == 0) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
				this.CBoxCostPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+3).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+3).setVisible(false);
			} else if(i == 1) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
				this.CBoxCostPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+3).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+3).setVisible(false);
				
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
				this.CBoxCostPearl.get(i+4).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+4).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+4).setVisible(false);
			} else {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(tmpPearl));
				this.CBoxCostPearl.get(i+4).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+4).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+4).setVisible(false);
			}
			
			
			JPanel page6ElemI = new JPanel();
			page6ElemI.setLayout(new BoxLayout(page6ElemI, BoxLayout.Y_AXIS));
			page6ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page6ElemI.setBackground(Consts.UIColor[1]);
			page6ElemI.add(this.allLabel.get(page).get(i+1));
			page6ElemI.add(Box.createVerticalStrut(10));
			page6ElemI.add(runwayPanel);
			page6ElemI.add(Box.createVerticalStrut(3));
			page6ElemI.add(currentQualityPanel);
			page6ElemI.add(Box.createVerticalStrut(3));
			page6ElemI.add(this.CBoxCostume.get(i+2));
			if(i == 0) {
				page6ElemI.add(Box.createVerticalStrut(3));
				page6ElemI.add(this.CBoxCostPearl.get(i+3));
			} else if(i == 1) {
				page6ElemI.add(Box.createVerticalStrut(3));
				page6ElemI.add(this.CBoxCostPearl.get(i+3));
				page6ElemI.add(Box.createVerticalStrut(3));
				page6ElemI.add(this.CBoxCostPearl.get(i+4));
			} else {
				page6ElemI.add(Box.createVerticalStrut(3));
				page6ElemI.add(this.CBoxCostPearl.get(i+4));
			}
			
			page6.add(Box.createVerticalStrut(10));
			page6.add(page6ElemI);
		}
		
		this.mainPage.add(page6);
		
		/****************************************/
		/*				 PAGE 7					*/
		/****************************************/
		page++;
		
		/* TALENT */
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
		this.tabChosenTalent[8].setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/talent/combi.png"))));
		
		JPanel page7Elem1 = new JPanel();
		page7Elem1.setLayout(new BoxLayout(page7Elem1, BoxLayout.Y_AXIS));
		page7Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page7Elem1.setBackground(Consts.UIColor[1]);
		page7Elem1.add(this.allLabel.get(page).get(0));
		page7Elem1.add(Box.createVerticalStrut(10));
		page7Elem1.add(chosenTalent);
		page7Elem1.add(Box.createVerticalStrut(5));
		this.combiTalent.setAlignmentX(CENTER_ALIGNMENT);
		page7Elem1.add(this.combiTalent);
		
		JPanel page7 = new JPanel();
		page7.setLayout(new BoxLayout(page7, BoxLayout.Y_AXIS));
		page7.setBackground(Consts.UIColor[2]);
		page7.add(page7Elem1);
		page7.add(Box.createVerticalStrut(10));
		
		ArrayList<ArrayList<Talent>> tabTalent = this.allGameStuff.getPossibleTalent(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		
		JPanel page7Elem2 = new JPanel(new GridLayout(1,2, 10, 10));
		page7Elem2.setBackground(Consts.UIColor[2]);
		
		for(int i = 0; i < 2; i++) {
			JPanel colTalent = new JPanel();
			colTalent.setLayout(new BoxLayout(colTalent, BoxLayout.Y_AXIS));
			colTalent.setBorder(new EmptyBorder(10, 10, 10, 10));
			colTalent.setBackground(Consts.UIColor[1]);
			colTalent.add(this.allLabel.get(page).get(i+1));
			colTalent.add(Box.createVerticalStrut(10));
			
			JPanel blocTalent = new JPanel(new GridLayout(4, 1, 10, 10));
			blocTalent.setBackground(Consts.UIColor[1]);
			
			for(int j = 0; j < 4; j++) {
				JPanel lineTalent = new JPanel(new GridLayout(1, 4, 5, 5));
				lineTalent.setBackground(Consts.UIColor[0]);
				
				int id1 = i*4+j;
				this.radioTalent.add(new ArrayList<JCustomRadioButton>());
				this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossTalent.png")))));
				this.radioTalent.get(i*4+j).get(0).setBackground(Consts.UIColor[0]);
				this.radioTalent.get(i*4+j).get(0).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateSelectedTalent(id1);
						MainFrame.this.updateCombiTalent();
						MainFrame.this.updateStat();
					}
				});
				
				lineTalent.add(this.radioTalent.get(i*4+j).get(0));
				
				for(int k = 0; k < 3; k++) {
					Talent[] currentTalent = new Talent[tabTalent.get(i*12+j*3+k).size() + 1];
					currentTalent[0] = new Talent();
					for(int l = 0; l < currentTalent.length-1; l++) currentTalent[l+1] = tabTalent.get(i*12+j*3+k).get(l);
					
					this.CBoxTalent.add(new JCustomComboBox<Talent>(currentTalent));
					this.CBoxTalent.get(i*12+j*3+k).setRenderer(new CustomListCellRenderer(i));
					int id2 = i*12+j*3+k;
					this.CBoxTalent.get(i*12+j*3+k).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							MainFrame.this.updateRadioTalent(id2);
							MainFrame.this.updateCombiTalent();
							MainFrame.this.updateStat();
						}
					});
					
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(this.allGameStuff.getListTalent().get(this.listClasses.getSelectedIndex()).get(i*12+j*3+k).getIcon())));
					this.radioTalent.get(i*4+j).get(k+1).setBackground(Consts.UIColor[0]);
					this.radioTalent.get(i*4+j).get(k+1).addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							MainFrame.this.updateSelectedTalent(id1);
							MainFrame.this.updateCombiTalent();
							MainFrame.this.updateStat();
						}
					});
					
					JPanel singleTalent = new JPanel();
					singleTalent.setLayout(new BoxLayout(singleTalent, BoxLayout.Y_AXIS));
					singleTalent.setBackground(Consts.UIColor[0]);
					this.radioTalent.get(i*4+j).get(k+1).setAlignmentX(CENTER_ALIGNMENT);
					singleTalent.add(this.radioTalent.get(i*4+j).get(k+1));
					singleTalent.add(Box.createVerticalStrut(5));
					singleTalent.add(this.CBoxTalent.get(i*12+j*3+k));
					
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
				this.allLabel.get(page).get(i*4+j+3).setFont(new Font("Open Sans", Font.PLAIN, 14));
				subtitle.add(this.allLabel.get(page).get(i*4+j+3));
				subtitle.add(lineTalent);
				
				this.showAndHideTalent.add(subtitle);
				
				blocTalent.add(subtitle);
			}
			
			colTalent.add(blocTalent);
			
			page7Elem2.add(colTalent);
		}
		
		page7.add(page7Elem2);
		page7.add(Box.createVerticalStrut(10));
		
		JCustomButton maxTalent = new JCustomButton("Mettre tous les talents au niveau maximum");
		maxTalent.setMinimumSize(new Dimension(0, 30));
		maxTalent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.setMaxCBoxTalent();
			}
		});
		
		JPanel page7Elem3 = new JPanel(new GridLayout(1, 1));
		page7Elem3.setBackground(Consts.UIColor[1]);
		page7Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page7Elem3.add(maxTalent);
		
		page7.add(page7Elem3);
		
		this.mainPage.add(page7);
		
		/****************************************/
		/*				 PAGE 8					*/
		/****************************************/
		page++;
		
		/* SPECIALITE */
		
		JPanel page8 = new JPanel();
		page8.setLayout(new BoxLayout(page8, BoxLayout.Y_AXIS));
		page8.setBorder(new EmptyBorder(10, 10, 10, 10));
		page8.setBackground(Consts.UIColor[1]);
		page8.add(this.allLabel.get(page).get(0));
		page8.add(Box.createVerticalStrut(10));
		
		JPanel remain = new JPanel();
		remain.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(1).setFont(new Font("Open Sans", Font.PLAIN, 14));
		remain.add(this.allLabel.get(page).get(1));
		this.nbSpePoint.setFont(new Font("Open Sans", Font.BOLD, 14));
		this.nbSpePoint.setForeground(Consts.FontColor[0]);
		remain.add(this.nbSpePoint);
		
		page8.add(remain);
		page8.add(Box.createVerticalStrut(5));
		
		this.tabSpeciality = this.allGameStuff.getSpeFromClass(this.listClasses.getSelectedIndex());
		
		
		JPanel catSpe = new JPanel(new GridLayout(4, 1));
		catSpe.setBackground(Consts.UIColor[1]);
		JPanel gridSpe = new JPanel(new GridLayout(4, 6, 5, 5));
		gridSpe.setBackground(Consts.UIColor[1]);
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			this.allLabel.get(page).get(i+2).setFont(new Font("Open Sans", Font.PLAIN, 14));
			this.allLabel.get(page).get(i+2).setPreferredSize(new Dimension(76, 70));
			catSpe.add(this.allLabel.get(page).get(i+2));
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				int id = numSpe;
				this.CBoxSpePoint.add(new JCustomComboBox<Integer>(new Integer[] { 0 }));
				this.CBoxSpePoint.get(numSpe).setRenderer(new CustomListCellRenderer());
				this.CBoxSpePoint.get(numSpe).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateSpeElement(id);
						MainFrame.this.updateSpePoint();
						MainFrame.this.updateStat();
					}
				});
				this.CBoxSpePoint.get(numSpe).setVisible(false);
				
				this.iconSpe.add(new JLabel(new ImageIcon(this.tabSpeciality[numSpe].getIcon())));
				this.iconSpe.get(numSpe).setToolTipText(this.tabSpeciality[numSpe].getTooltip());
				this.iconSpe.get(numSpe).setVisible(false);
				
				JPanel panelSpe = new JPanel();
				panelSpe.setLayout(new BoxLayout(panelSpe, BoxLayout.Y_AXIS));
				panelSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
				panelSpe.setPreferredSize(new Dimension(46, 65));
				panelSpe.setBackground(Consts.UIColor[0]);
				this.iconSpe.get(numSpe).setAlignmentX(CENTER_ALIGNMENT);
				panelSpe.add(this.iconSpe.get(numSpe));
				panelSpe.add(Box.createVerticalStrut(5));
				panelSpe.add(this.CBoxSpePoint.get(numSpe));
				
				gridSpe.add(panelSpe);
				
				numSpe++;
			}
			for(int j = k; j < 6; j++) {
				JPanel voidPanel = new JPanel();
				voidPanel.setBackground(Consts.UIColor[1]);
				gridSpe.add(voidPanel);
			}
		}
		
		JPanel page8Elem1 = new JPanel();
		page8Elem1.setBackground(Consts.UIColor[1]);
		page8Elem1.add(catSpe);
		page8Elem1.add(Box.createHorizontalStrut(10));
		page8Elem1.add(gridSpe);
		
		page8.add(page8Elem1);
		
		
		JCustomButton maxSpe = new JCustomButton("Mettre toutes les spécialités au niveau maximum");
		maxSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		maxSpe.setMinimumSize(new Dimension(0, 30));
		maxSpe.setAlignmentX(CENTER_ALIGNMENT);
		maxSpe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.setMaxCBoxSpe();
			}
		});
		
		page8.add(maxSpe);
		
		this.mainPage.add(page8);
		
		/****************************************/
		/*				 PAGE 9					*/
		/****************************************/
		page++;
		
		JPanel page9Elem1 = new JPanel();
		page9Elem1.setLayout(new BoxLayout(page9Elem1, BoxLayout.Y_AXIS));
		page9Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page9Elem1.setBackground(Consts.UIColor[1]);
		page9Elem1.add(this.allLabel.get(page).get(0));
		page9Elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 5; i++) {
			this.skillNatif.add(new JCustomLabel());
			this.skillNatif.get(i).setPreferredSize(new Dimension(250, 32));
			
			JPanel skill = new JPanel();
			skill.setBackground(Consts.UIColor[1]);
			skill.add(this.skillNatif.get(i));
			
			page9Elem1.add(skill);
		}
		
		for(int i = 0; i < 2; i++) {
			this.skillProgress.add(new JCustomComboBox<Skill>());
			this.skillProgress.get(i).setRenderer(new CustomListCellRenderer());
			this.skillProgress.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			this.skillProgress.get(i).setVisible(false);
			
			page9Elem1.add(Box.createVerticalStrut(5));
			page9Elem1.add(this.skillProgress.get(i));
		}
		
		JPanel page9Elem2 = new JPanel();
		page9Elem2.setLayout(new BoxLayout(page9Elem2, BoxLayout.Y_AXIS));
		page9Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page9Elem2.setBackground(Consts.UIColor[1]);
		page9Elem2.add(this.allLabel.get(page).get(1));
		page9Elem2.add(Box.createVerticalStrut(10));
		
		ProSkill[] tabProSkill = this.allGameStuff.getListProSkill(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		this.CBoxProSkill = new JCustomComboBox<ProSkill>(tabProSkill);
		this.CBoxProSkill.setRenderer(new CustomListCellRenderer());
		this.CBoxProSkill.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		page9Elem2.add(this.CBoxProSkill);
		
		this.showAndHide.add(page9Elem1);
		this.showAndHide.add(page9Elem2);
		
		JPanel page9 = new JPanel();
		page9.setLayout(new BoxLayout(page9, BoxLayout.Y_AXIS));
		page9.setBorder(new EmptyBorder(10, 10, 10, 10));
		page9.setBackground(Consts.UIColor[2]);
		page9.add(page9Elem1);
		page9.add(Box.createVerticalStrut(10));
		page9.add(page9Elem2);
		
		this.mainPage.add(page9);
		
		/****************************************/
		/*				 PAGE 10				*/
		/****************************************/
		page++;
		
		JPanel page10Elem1 = new JPanel();
		page10Elem1.setLayout(new BoxLayout(page10Elem1, BoxLayout.Y_AXIS));
		page10Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page10Elem1.setBackground(Consts.UIColor[1]);
		page10Elem1.add(this.allLabel.get(page).get(0));
		page10Elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = this.allGameStuff.getPossibleBlason(this.spinnerLvl.getIntValue(), i == 0);
			this.CBoxBlason.add(new JCustomComboBox<Blason>(tabBlason));
			this.CBoxBlason.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.CBoxBlason.get(i).setRenderer(new CustomListCellRenderer());
			this.CBoxBlason.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			
			JPanel panelBlason = new JPanel();
			panelBlason.setLayout(new BoxLayout(panelBlason, BoxLayout.Y_AXIS));
			panelBlason.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+1).setFont(new Font("Open Sans", Font.PLAIN, 14));
			panelBlason.add(this.allLabel.get(page).get(i+1));
			panelBlason.add(Box.createVerticalStrut(3));
			panelBlason.add(this.CBoxBlason.get(i));
			panelBlason.add(Box.createVerticalStrut(5));
			
			page10Elem1.add(panelBlason);
		}
		
		Buff[] tabBuff = this.allGameStuff.getListBuff();
		this.CBoxIsleBuff = new JCustomComboBox<Buff>(tabBuff);
		this.CBoxIsleBuff.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxIsleBuff.setRenderer(new CustomListCellRenderer());
		this.CBoxIsleBuff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page10Elem2 = new JPanel();
		page10Elem2.setLayout(new BoxLayout(page10Elem2, BoxLayout.Y_AXIS));
		page10Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page10Elem2.setBackground(Consts.UIColor[1]);
		page10Elem2.add(this.allLabel.get(page).get(3));
		page10Elem2.add(Box.createVerticalStrut(10));
		page10Elem2.add(this.CBoxIsleBuff);
		
		JPanel page10 = new JPanel();
		page10.setLayout(new BoxLayout(page10, BoxLayout.Y_AXIS));
		page10.setBackground(Consts.UIColor[2]);
		page10.add(page10Elem1);
		page10.add(Box.createVerticalStrut(10));
		page10.add(page10Elem2);
		
		this.mainPage.add(page10);
		
		
		/****************************************/
		/*				 PAGE 11				*/
		/****************************************/
		page++;
		
		/* NUCLEUS */
		
		JPanel page11Elem1 = new JPanel();
		page11Elem1.setLayout(new BoxLayout(page11Elem1, BoxLayout.Y_AXIS));
		page11Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem1.setBackground(Consts.UIColor[1]);
		page11Elem1.add(this.allLabel.get(page).get(0));
		page11Elem1.add(Box.createVerticalStrut(10));
		
		
		for(int i = 0; i < 6; i++) {
			Nucleus[] tabNucleus = this.allGameStuff.getListNucleus(i);
			
			this.CBoxNucleus.add(new JCustomComboBox<Nucleus>(tabNucleus));
			this.CBoxNucleus.get(i).setRenderer(new CustomListCellRenderer());
			this.CBoxNucleus.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.updateStat();
				}
			});
			
			JPanel nucleus = new JPanel();
			nucleus.setBackground(Consts.UIColor[1]);
			this.allLabel.get(page).get(i+1).setFont(new Font("Open Sans", Font.PLAIN, 14));
			this.allLabel.get(page).get(i+1).setPreferredSize(new Dimension(55, 20));
			nucleus.add(this.allLabel.get(page).get(i+1));
			this.CBoxNucleus.get(i).setPreferredSize(new Dimension(185, 36));
			nucleus.add(this.CBoxNucleus.get(i));
			nucleus.add(Box.createVerticalStrut(5));
			
			if(i == 1) {
				this.showAndHide.add(nucleus);
			}
			
			page11Elem1.add(nucleus);
		}
		
		
		/* ENERGIE */
		
		JPanel energies = new JPanel(new GridLayout(6, 1, 5, 5));
		energies.setBackground(Consts.UIColor[1]);
		
		for(int i = 0; i < 6; i++) {
			
			Energy energy = this.allGameStuff.getListEnergy().get(i);
			JCustomLabel labelEnergy = new JCustomLabel(energy);
			labelEnergy.setPreferredSize(new Dimension(120, 32));
			
			this.spinnerEnergy.add(new JCustomSpinner(new SpinnerNumberModel(0, 0, 2, 1)));
			this.spinnerEnergy.get(i).addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					MainFrame.this.updateStat();
				}
			});
			
			JPanel panelEnergy = new JPanel();
			panelEnergy.setBackground(Consts.UIColor[1]);
			panelEnergy.add(labelEnergy);
			panelEnergy.add(this.spinnerEnergy.get(i));
			
			energies.add(panelEnergy);
		}
		
		JPanel page11Elem2 = new JPanel();
		page11Elem2.setLayout(new BoxLayout(page11Elem2, BoxLayout.Y_AXIS));
		page11Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem2.setBackground(Consts.UIColor[1]);
		page11Elem2.add(this.allLabel.get(page).get(7));
		page11Elem2.add(Box.createVerticalStrut(10));
		page11Elem2.add(energies);
		
		
		JPanel page11Inter1 = new JPanel(new GridLayout(1, 2, 10, 10));
		page11Inter1.setBackground(Consts.UIColor[2]);
		page11Inter1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Inter1.add(page11Elem1);
		page11Inter1.add(page11Elem2);
		
		
		/* BUFF GUILDE */
		
		JPanel blocBuffGuild = new JPanel();
		blocBuffGuild.setLayout(new BoxLayout(blocBuffGuild, BoxLayout.Y_AXIS));
		blocBuffGuild.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(9).setFont(new Font("Open Sans", Font.PLAIN, 14));
		blocBuffGuild.add(this.allLabel.get(page).get(9));
		blocBuffGuild.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 4; i++) {
			JPanel lineBuff = new JPanel();
			lineBuff.setBackground(Consts.UIColor[1]);
			
			this.guildBuffUsed.add(new JCustomLabel());
			this.guildBuffUsed.get(i).setAlignmentX(LEFT_ALIGNMENT);
			this.guildBuffUsed.get(i).setVisible(false);
			
			int id = i;
			
			JCustomButton remove = new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png"))));
			remove.setAlignmentX(RIGHT_ALIGNMENT);
			remove.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.removeGuildBuff(id);
					MainFrame.this.updateStat();
				}
			});
			this.cross.add(remove);
			this.cross.get(i).setVisible(false);
			
			lineBuff.add(this.guildBuffUsed.get(i));
			lineBuff.add(this.cross.get(i));
			lineBuff.setAlignmentX(LEFT_ALIGNMENT);
			
			blocBuffGuild.add(lineBuff);
			blocBuffGuild.add(Box.createVerticalStrut(3));
		}
		
		GuildBuff[] tabGuildBuff = this.allGameStuff.getListGuildBuff();
		this.listGuildBuff = new JCustomList<GuildBuff>(tabGuildBuff);
		this.listGuildBuff.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.listGuildBuff.setCellRenderer(new CustomListCellRenderer());
		this.listGuildBuff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				JCustomList<?> list = (JCustomList<?>)evt.getSource();
				
		        if (evt.getClickCount() == 2) {
		        	MainFrame.this.updateGuildBuff(list.getSelectedIndex());
		        	MainFrame.this.updateStat();
		        }
		    }
		});
		this.listGuildBuff.setAlignmentX(LEFT_ALIGNMENT);
		
		this.listGuildBuff.setMaximumSize(new Dimension(500, 100));
		JScrollPane scrollList = new JScrollPane(this.listGuildBuff, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel page11Elem3 = new JPanel();
		page11Elem3.setLayout(new BoxLayout(page11Elem3, BoxLayout.Y_AXIS));
		page11Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem3.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(8).setAlignmentX(LEFT_ALIGNMENT);
		page11Elem3.add(this.allLabel.get(page).get(8));
		page11Elem3.add(Box.createVerticalStrut(10));
		page11Elem3.add(blocBuffGuild);
		page11Elem3.add(Box.createVerticalStrut(10));
		this.allLabel.get(page).get(10).setFont(new Font("Open Sans", Font.PLAIN, 14));
		page11Elem3.add(this.allLabel.get(page).get(10));
		page11Elem3.add(Box.createVerticalStrut(5));
		page11Elem3.add(scrollList);
		
		/* PIERRE PERMANENTE */
		
		JPanel blocStone = new JPanel();
		blocStone.setLayout(new BoxLayout(blocStone, BoxLayout.Y_AXIS));
		blocStone.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(12).setFont(new Font("Open Sans", Font.PLAIN, 14));
		blocStone.add(this.allLabel.get(page).get(12));
		blocStone.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 3; i++) {
			JPanel lineStone = new JPanel();
			lineStone.setBackground(Consts.UIColor[1]);
			
			this.stoneUsed.add(new JCustomLabel());
			this.stoneUsed.get(i).setAlignmentX(LEFT_ALIGNMENT);
			this.stoneUsed.get(i).setVisible(false);
			
			int id = i;
			
			JCustomButton remove = new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png"))));
			remove.setAlignmentX(RIGHT_ALIGNMENT);
			remove.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MainFrame.this.removeStoneBuff(id);
					MainFrame.this.updateStat();
				}
			});
			this.cross.add(remove);
			this.cross.get(i+4).setVisible(false);
			
			lineStone.add(this.stoneUsed.get(i));
			lineStone.add(this.cross.get(i+4));
			lineStone.setAlignmentX(LEFT_ALIGNMENT);
			
			blocStone.add(lineStone);
			blocStone.add(Box.createVerticalStrut(3));
		}
		
		Nucleus[] tabStone = this.allGameStuff.getListNucleus(6);
		this.listStone = new JCustomList<Nucleus>(tabStone);
		this.listStone.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.listStone.setCellRenderer(new CustomListCellRenderer());
		this.listStone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				JCustomList<?> list = (JCustomList<?>)evt.getSource();
				
		        if (evt.getClickCount() == 2) {
		        	MainFrame.this.updateStoneBuff(list.getSelectedIndex());
		        	MainFrame.this.updateStat();
		        }
		    }
		});
		this.listStone.setAlignmentX(LEFT_ALIGNMENT);
		
		JPanel page11Elem4 = new JPanel();
		page11Elem4.setLayout(new BoxLayout(page11Elem4, BoxLayout.Y_AXIS));
		page11Elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem4.setBackground(Consts.UIColor[1]);
		this.allLabel.get(page).get(11).setAlignmentX(LEFT_ALIGNMENT);
		page11Elem4.add(this.allLabel.get(page).get(11));
		page11Elem4.add(Box.createVerticalStrut(10));
		page11Elem4.add(blocStone);
		page11Elem4.add(Box.createVerticalStrut(10));
		this.allLabel.get(page).get(13).setFont(new Font("Open Sans", Font.PLAIN, 14));
		page11Elem4.add(this.allLabel.get(page).get(13));
		page11Elem4.add(Box.createVerticalStrut(5));
		page11Elem4.add(this.listStone);
		
		JPanel page11Inter2 = new JPanel(new GridLayout(1, 2, 10, 10));
		page11Inter2.setBackground(Consts.UIColor[2]);
		page11Inter2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Inter2.add(page11Elem3);
		page11Inter2.add(page11Elem4);
		
		
		JPanel page11 = new JPanel();
		page11.setLayout(new BoxLayout(page11, BoxLayout.Y_AXIS));
		page11.setBackground(Consts.UIColor[1]);
		page11.add(page11Inter1);
		page11.add(page11Inter2);
		
		this.mainPage.add(page11);
		
		/****************************************/
		/*				 PAGE 12				*/
		/****************************************/
		page++;
		
		Bague[] tabBague = this.allGameStuff.getListBague();
		this.CBoxBague = new JCustomComboBox<Bague>(tabBague);
		this.CBoxBague.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxBague.setRenderer(new CustomListCellRenderer());
		this.CBoxBague.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page12Elem1 = new JPanel();
		page12Elem1.setLayout(new BoxLayout(page12Elem1, BoxLayout.Y_AXIS));
		page12Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem1.setBackground(Consts.UIColor[1]);
		page12Elem1.add(this.allLabel.get(page).get(0));
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.CBoxBague);
		
		this.showAndHide.add(page12Elem1);
		
		
		Anima[] tabAnima = this.allGameStuff.getListAnima(this.spinnerLvl.getIntValue());
		this.CBoxAnima = new JCustomComboBox<Anima>(tabAnima);
		this.CBoxAnima.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.CBoxAnima.setRenderer(new CustomListCellRenderer());
		this.CBoxAnima.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.updateStat();
			}
		});
		
		JPanel page12Elem2 = new JPanel();
		page12Elem2.setLayout(new BoxLayout(page12Elem2, BoxLayout.Y_AXIS));
		page12Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem2.setBackground(Consts.UIColor[1]);
		page12Elem2.add(this.allLabel.get(page).get(1));
		page12Elem2.add(Box.createVerticalStrut(10));
		page12Elem2.add(this.CBoxAnima);
		
		this.showAndHide.add(page12Elem2);
		
		
		JPanel page12 = new JPanel();
		page12.setLayout(new BoxLayout(page12, BoxLayout.Y_AXIS));
		page12.setBackground(Consts.UIColor[2]);
		page12.add(page12Elem1);
		page12.add(Box.createVerticalStrut(10));
		page12.add(page12Elem2);
		
		
		this.mainPage.add(page12);
		
		/****************************************/
		/*				 PAGE 12				*/
		/****************************************/
		page++;
		
		
		
		
		
		this.mainPage.add(new JPanel());
		
		
		JPanel content = new JPanel();
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
		content.setBackground(Consts.UIColor[2]);
		
		JScrollPane scrollContent = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollContent.setBorder(null);
		scrollContent.getVerticalScrollBar().setUnitIncrement(10);
		scrollContent.getHorizontalScrollBar().setUnitIncrement(10);
		
		for(int i = 0; i < this.mainPage.size(); i++) {
			content.add(this.mainPage.get(i));
		}
		
		/****************************************/
		/*		****	   STATS	  	****	*/
		/****************************************/
		
		JPanel stats = new JPanel();
		stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));
		stats.setBackground(Consts.UIColor[1]);
		
		int[] section = new int[] { 5, 3, 5, 6, 3 };
		int ordinal = 0;
		
		for(int i = 0; i < section.length; i++) {
			JPanel blocStat = new JPanel();
			blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
			blocStat.setBorder(new EmptyBorder(5, 5, 5, 5));
			blocStat.setBackground(Consts.UIColor[0]);
			
			for(int j = 0; j < section[i]; j++) {
				this.valueStat.add(new JLabel(TypeEffect.values()[ordinal].name() + " : 0"));
				this.valueStat.get(ordinal).setForeground(Consts.FontColor[0]);
				this.valueStat.get(ordinal).setFont(new Font("Open Sans", Font.PLAIN, 16));
				this.valueStat.get(ordinal).setPreferredSize(new Dimension(140, 20));
				
				blocStat.add(this.valueStat.get(ordinal));
				
				ordinal++;
			}
			
			stats.add(blocStat);
		}
		
		JPanel blocStat = new JPanel();
		blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
		blocStat.setBorder(new EmptyBorder(5, 5, 5, 5));
		blocStat.setBackground(Consts.UIColor[0]);
		
		while(ordinal < TypeEffect.values().length) {
			this.valueStat.add(new JLabel(TypeEffect.values()[ordinal].name() + " : 0"));
			this.valueStat.get(ordinal).setFont(new Font("Open Sans", Font.PLAIN, 16));
			this.valueStat.get(ordinal).setForeground(Consts.FontColor[0]);
			
			blocStat.add(this.valueStat.get(ordinal));
			
			ordinal++;
		}
		
		stats.add(blocStat);
		
		JScrollPane scrollStats = new JScrollPane(stats, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollStats.setBorder(null);
		scrollStats.getVerticalScrollBar().setUnitIncrement(10);
		
		this.main.add(menu, BorderLayout.WEST);
		this.main.add(scrollContent, BorderLayout.CENTER);
		this.main.add(scrollStats, BorderLayout.EAST);
		
		initUI();
		
		this.main.setVisible(true);
	}
	
	private void setCustomUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println("WARNING: Look and feel code failed");
		}
		
		UIManager.put("ToolTip.border", new LineBorder(Consts.UIColor[1], 2));
		UIManager.put("ToolTip.background", Consts.UIColor[0]);
		UIManager.put("ToolTip.foreground", Consts.UIColor[3]);
		
		ToolTipManager.sharedInstance().setInitialDelay(500);
	    ToolTipManager.sharedInstance().setDismissDelay(30000);
	}
	
	private void initUI() {
		updateTabPane(0);
		
		for(ArrayList<JCustomRadioButton> color : this.colorGenki) color.get(0).setSelected(true);
		for(ArrayList<JStarCheckBox> star : this.starGenki) star.get(0).setSelected(true);
		
		this.costWeapon.get(0).setSelected(false);
		this.costWeapon.get(1).setSelected(true);
		for(ArrayList<JCustomRadioButton> quality : this.costQuality) quality.get(0).setSelected(true);
		
		for(JLabel label : this.skillNatif) label.setVisible(false);
		for(JCustomComboBox<Skill> skill : this.skillProgress) skill.setVisible(false);
		
		for(JPanel panel : this.showAndHide) panel.setVisible(false);
		for(JPanel panel : this.showAndHideXpStuff) panel.setVisible(false);
		for(JPanel panel : this.showAndHideTalent) panel.setVisible(false);
		
		updateStat();
	}
	
	private void setBaseValueByLvl() throws IOException {
		String nameStat[] = { "FCE", "VIT", "INT", "VOL", "AGI" };
		for(int file = 0; file < nameStat.length; file++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/" + nameStat[file] + ".txt")));
			String line = reader.readLine();
			int count = 0;
			while (line != null) {
				String[] lineSplit = line.split("/");
				for(int i = 0; i < lineSplit.length; i++) {
					if(!lineSplit[i].equals("-")) {
						this.base[file][count][i] = Integer.parseInt(lineSplit[i]);
					}
				}
				line = reader.readLine();
				count++;
			}
			reader.close();
		}
	}

	protected void updateStat() {
		Build build;
		
		int idClass = this.listClasses.getSelectedIndex();
		int lvl = this.spinnerLvl.getIntValue();
		double coefReinca = 1;
		
		if(this.lvlReinca.getSelectedIndex() == 1) {
			if(lvl < 66) coefReinca = Consts.coefReinca[1];
			else if(lvl < 86) coefReinca = Consts.coefReinca[2];
			else if(lvl < 91) coefReinca = Consts.coefReinca[3];
			else if(lvl < 100) coefReinca = Consts.coefReinca[4];
			else coefReinca = Consts.coefReinca[5];
		}
		
		int[] weaponsType = new int[3];
		for(int i = 0; i < weaponsType.length; i++) {
			weaponsType[i] = ((Weapon) this.CBoxWeapon.get(i).getSelectedItem()).getType();
		}
		
		build = new Build(coefReinca, weaponsType);
		
		Effect[] baseFromClass = new Effect[5];
		for(int i = 0; i < baseFromClass.length; i++) {
			int value = this.base[i][idClass][lvl-1];
			baseFromClass[i] = new Effect(TypeEffect.values()[i], false, Math.floor(value*coefReinca), false, -1);
		}
		
		build.addEffect(baseFromClass);
		
		Title title = (Title) this.CBoxTitle.getSelectedItem();
		build.addEffect(title.getEffects());
		
		Yggdrasil yggdra = this.allGameStuff.getListYggdrasil().get(this.yggdrasil.getSelectedIndex());
		build.addEffect(yggdra.getEffects());
		
		Archive archive = (Archive) this.CBoxArchive.getSelectedItem();
		build.addAdditionalEffect(archive.getEffects());
		
		
		Weapon[] weapons = new Weapon[3];
		for(int i = 0; i < weapons.length; i++) {
			weapons[i] = new Weapon((Weapon) this.CBoxWeapon.get(i).getSelectedItem());
			weapons[i].addEnchant((Enchantment) this.CBoxEnchant.get(i).getSelectedItem());
			weapons[i].addFortif(this.valueFortif.get(i).getSelectedIndex());
		}
		
		if(!weapons[0].getName().equals("Rien") && !weapons[1].getName().equals("Rien")) {
			weapons[0].doubleWeapon();
			weapons[1].doubleWeapon();
		}
		
		for(int i = 0; i < weapons.length; i++) build.addEffect(weapons[i].getEffects());
		
		Bullet bullet = (Bullet) this.CBoxBullet.getSelectedItem();
		build.addEffect(bullet.getEffects());
		
		
		Armor[] armors = new Armor[5];
		for(int i = 0; i < armors.length; i++) {
			armors[i] = new Armor((Armor) this.CBoxArmor.get(i).getSelectedItem());
			armors[i].addEnchant((Enchantment) this.CBoxEnchant.get(i+3).getSelectedItem(), i);
			armors[i].addFortif(this.valueFortif.get(i+3).getSelectedIndex());
			build.addEffect(armors[i].getEffects());
		}
		
		EquipSet armorSet = new EquipSet(this.allGameStuff.getListEquipSet(), armors);
		if(armorSet.getNbCurrentUsed() >= 3) build.addEffect(armorSet.getWith3());
		if(armorSet.getNbCurrentUsed() >= 4) build.addEffect(armorSet.getWith4());
		if(armorSet.getNbCurrentUsed() == 5) build.addEffect(armorSet.getWith5());
		
		
		Cape cape = new Cape((Cape) this.CBoxCape.getSelectedItem());
		build.addEffect(cape.getEffects());
		
		Ring[] rings = new Ring[2];
		for(int i = 0; i < rings.length; i++) {
			rings[i] = (Ring) this.CBoxRing.get(i).getSelectedItem();
			build.addEffect(rings[i].getEffects());
		}
		
		EquipSet capeRingSet = new EquipSet(this.allGameStuff.getListEquipSet(), rings, cape);
		if(capeRingSet.getNbCurrentUsed() >= 2) build.addEffect(capeRingSet.getWith2());
		if(capeRingSet.getNbCurrentUsed() >= 3) build.addEffect(capeRingSet.getWith3());
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(JCustomComboBox<Pearl> pearls : this.CBoxPearl) {
			Pearl pearl = (Pearl) pearls.getSelectedItem();
			if(pearl.isCumulable()) {
				build.addEffect(pearl.getEffects());
			} else if(!isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				build.addEffect(pearl.getEffects());
			}
		}
		
		Mount mount = (Mount) this.CBoxMount.getSelectedItem();
		build.addEffect(mount.getDepla());
		
		for(int i = 0; i < this.listEffectXpStuff.size(); i++) {
			if(!this.listLvlXpStuff.get(i).isVisible() || this.listEffectXpStuff.get(i).getSelectedIndex() == 0) continue;
			TypeEffect type = TypeEffect.valueOf(this.listEffectXpStuff.get(i).getSelectedItem().toString());
			int idListXp = (i < 6) ? ((Weapon)this.CBoxWeapon.get((i/2)).getSelectedItem()).getType() : 13 + (i/2);
			double valueXpStuff = this.allGameStuff.getListXpStuff()
					.get(idListXp).get(this.listEffectXpStuff.get(i).getSelectedIndex()-1)
					.getValueFromLvl(this.listLvlXpStuff.get(i).getSelectedIndex());
			if(i > 21 && mount.getName().equals("Loup Spectral de Combat"))
				build.addEffect(new Effect(type, false, valueXpStuff/2, true, -1));
			else build.addEffect(new Effect(type, false, valueXpStuff, true, -1));
		}
		
		for(int i = 0; i < 11; i++) {
			if(!(this.listEffectXpStuff.get(i*2).getSelectedIndex() == 0) && !(this.listEffectXpStuff.get(i*2+1).getSelectedIndex() == 0)
					&& this.listEffectXpStuff.get(i*2).getSelectedIndex() != this.listEffectXpStuff.get(i*2+1).getSelectedIndex()) {
				int lvlXpStuff = this.listLvlXpStuff.get(i*2).getSelectedIndex() + this.listLvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(i < 3) {
					if(lvlXpStuff >= weapons[i].getLvl()) {
						build.addEffect(weapons[i].getBonusXP());
					}
				} else if(i < 8) {
					if(lvlXpStuff >= armors[i-3].getLvl()) {
						build.addEffect(armors[i-3].getBonusXP());
					}
				} else if(i < 9) {
					if(lvlXpStuff >= cape.getLvl()) {
						build.addEffect(cape.getBonusXP());
					}
				} else if(i < 11) {
					if(lvlXpStuff >= rings[i-9].getLvl()) {
						build.addEffect(rings[i-9].getBonusXP());
					}
				}
			}
		}
		
		
		for(int i = 0; i < this.colorGenki.size(); i++) {
			if(!this.colorGenki.get(i).get(0).isSelected()) {
				Genki genki = new Genki((Genki) this.CBoxGenki.get(i).getSelectedItem());
				genki.addStarBonus(this.starGenki.get(i), i);
				build.addEffect(genki.getEffects());
			}
		}
		
		
		if(this.costWeapon.get(0).isSelected()) {
			for(int i = 0; i < 2; i++) {
				if(!this.costQuality.get(i).get(0).isSelected()) {
					Costume cost = new Costume((Costume) this.CBoxCostume.get(i).getSelectedItem());
					build.addEffect(cost.getEffects());
				}
			}
		} else {
			if(!this.costQuality.get(0).get(0).isSelected()) {
				Costume cost = new Costume((Costume) this.CBoxCostume.get(0).getSelectedItem());
				for(Effect e : cost.getEffects()) {
					build.addEffect(new Effect(e.getType(), e.isPercent(), e.getValue()*2, e.getWithReinca(), e.getWithWeapon()));
				}
			}
		}
		
		for(int i = 2; i < this.CBoxCostume.size(); i++) {
			if(!this.costQuality.get(i).get(0).isSelected()) {
				Costume cost = new Costume((Costume) this.CBoxCostume.get(i).getSelectedItem());
				build.addEffect(cost.getEffects());
			}
		}
		
		for(int i = 0; i < this.checkBoxRunway.size(); i++) {
			if(!this.checkBoxRunway.get(i).isSelected()) continue;
			if(i % 2 == 0) {
				for(int j : Runway.currentRunway[i/2]) {
					build.addEffect(this.allGameStuff.getListRunway().get(j).getEffects());
				}
			} else {
				for(int j : Runway.currentRunway[4]) {
					build.addEffect(this.allGameStuff.getListRunway().get(j).getEffects());
				}
			}
		}
		
		for(JCustomComboBox<Pearl> pearls : this.CBoxCostPearl) {
			Pearl pearl = (Pearl) pearls.getSelectedItem();
			build.addEffect(pearl.getEffects());
		}
		
		
		for(int i = 0; i < this.radioTalent.size(); i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.CBoxTalent.get(i*3+j-1).getSelectedIndex() != 0) {
					Talent talent = (Talent) this.CBoxTalent.get(i*3+j-1).getSelectedItem();
					build.addEffect(talent.getEffects(0));
				}
			}
		}
		build.addEffect(this.combiTalent.getEffects());
		
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			for(int j = 0; j < this.tabSpeciality[i].getEffects().size(); j++) {
				build.addEffect(Speciality.multiplyEffect(this.tabSpeciality[i].getEffects().get(j), this.CBoxSpePoint.get(i).getSelectedIndex()));
			}
		}
		
		
		for(int i = 0; i < this.skillNatif.size(); i++) {
			if(this.skillNatif.get(i).isVisible()) {
				build.addEffect(this.skillNatif.get(i).getEffects());
			}
		}
		
		for(JCustomComboBox<Skill> skill : this.skillProgress) {
			if(skill.isVisible()) build.addEffect(((Skill) skill.getSelectedItem()).getEffects(0));
		}
		
		if(this.showAndHide.get(4).isVisible()) {
			ProSkill proSkill = (ProSkill) this.CBoxProSkill.getSelectedItem();
			build.addEffect(proSkill.getEffects());
		}
		
		
		for(JCustomComboBox<Blason> blasons : this.CBoxBlason) {
			Blason blason = (Blason) blasons.getSelectedItem();
			build.addEffect(blason.getEffects());
		}
		
		
		for(JCustomComboBox<Nucleus> nuclei : this.CBoxNucleus) {
			Nucleus nucleus = (Nucleus) nuclei.getSelectedItem();
			build.addEffect(nucleus.getEffects());
		}
		
		for(int i = 0; i < this.spinnerEnergy.size(); i++) {
			for(Effect effect : this.allGameStuff.getListEnergy().get(i).getEffects()) {
				build.addAdditionalEffect(Energy.multiplyEffect(effect, Math.min(this.spinnerEnergy.get(i).getIntValue(), this.spinnerLvl.getIntValue() *2)));
			}
		}
		
		Buff buff = (Buff) this.CBoxIsleBuff.getSelectedItem();
		build.addEffect(buff.getEffects());
		
		
		for(JCustomLabel guild : this.guildBuffUsed) {
			if(guild.isVisible()) build.addEffect(guild.getEffects());
		}
		
		for(JCustomLabel stone : this.stoneUsed) {
			if(stone.isVisible()) build.addEffect(stone.getEffects());
		}
		
		
		Bague bague = (Bague) this.CBoxBague.getSelectedItem();
		build.addEffect(bague.getEffects());
		
		Anima anima = (Anima) this.CBoxAnima.getSelectedItem();
		build.addEffect(anima.getEffects());
		
		
		updateLabel(build.calculStatFromEffect(), armorSet, capeRingSet);
	}
	
	private void updateLabel(int[] allStats, EquipSet armorSet, EquipSet capeRingSet) {
		for(int i = 0; i < this.valueStat.size(); i++) {
			this.valueStat.get(i).setText(TypeEffect.values()[i].name() + " : " + allStats[i]);
			
			if(allStats[i] == 0 && i > 21) {
				this.valueStat.get(i).setVisible(false);
			} else {
				this.valueStat.get(i).setVisible(true);
			}
		}
		
		if(armorSet == null || armorSet.getName().equals("Rien") || armorSet.getNbCurrentUsed() < 3) this.armorSetInfo.setText(this.fr_en.get(this.language.isSelected() ? 0 : 1).get(3).get(10));
		else {
			String setInfo = armorSet.getName() + "\n";
			setInfo += "3 pièces équipées " + (armorSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith3().size(); i++) {
				setInfo += "\t- " + armorSet.getWith3().get(i).toString() + "\n";
			}
			setInfo += "4 pièces équipées " + (armorSet.getNbCurrentUsed() >= 4 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith4().size(); i++) {
				setInfo += "\t- " + armorSet.getWith4().get(i).toString() + "\n";
			}
			setInfo += "5 pièces équipées " + (armorSet.getNbCurrentUsed() >= 5 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith5().size(); i++) {
				setInfo += "\t- " + armorSet.getWith5().get(i).toString() + "\n";
			}
			this.armorSetInfo.setText(setInfo);
		}
		
		if(capeRingSet == null || capeRingSet.getName().equals("Rien") || capeRingSet.getNbCurrentUsed() < 2) this.capeRingSetInfo.setText(this.fr_en.get(this.language.isSelected() ? 0 : 1).get(4).get(6));
		else {
			String setInfo = capeRingSet.getName() + "\n";
			setInfo += "2 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 2 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < capeRingSet.getWith2().size(); i++) {
				setInfo += "\t- " + capeRingSet.getWith2().get(i).toString() + "\n";
			}
			setInfo += "3 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < capeRingSet.getWith3().size(); i++) {
				setInfo += "\t- " + capeRingSet.getWith3().get(i).toString() + "\n";
			}
			this.capeRingSetInfo.setText(setInfo);
		}
	}
	
	private void updateTitle() {
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 0 ? false : true;
		
		Title tabTitle[] = this.allGameStuff.getPossibleTitle(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), isReinca);
		Title memory = (Title) this.CBoxTitle.getSelectedItem();
		
		this.CBoxTitle.setModel(new DefaultComboBoxModel<Title>(tabTitle));
		this.CBoxTitle.setSelectedItem(memory);
	}
	
	private void updateNucleus() {
		if(this.lvlReinca.getSelectedIndex() == 0) {
			this.showAndHide.get(5).setVisible(false);
			this.CBoxNucleus.get(1).setSelectedIndex(0);
		} else this.showAndHide.get(5).setVisible(true);
	}
	
	private void updateMount() {
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 0 ? false : true;
		
		Mount tabMount[] = this.allGameStuff.getPossibleMount(this.spinnerLvl.getIntValue(), isReinca);
		Mount memory = (Mount) this.CBoxMount.getSelectedItem();
		
		this.CBoxMount.setModel(new DefaultComboBoxModel<Mount>(tabMount));
		this.CBoxMount.setSelectedItem(memory);
		
		if(this.CBoxMount.getSelectedIndex() == 0) {
			this.listEffectXpStuff.get(22).setVisible(false);
			this.listEffectXpStuff.get(23).setVisible(false);
			this.listEffectXpStuff.get(22).setSelectedIndex(0);
			this.listEffectXpStuff.get(23).setSelectedIndex(0);
			this.showAndHideXpStuff.get(11).setVisible(false);
		} else {
			this.listEffectXpStuff.get(22).setVisible(true);
			this.listEffectXpStuff.get(23).setVisible(true);
			this.showAndHideXpStuff.get(11).setVisible(true);
		}
		
		if(tabMount.length > 1) this.showAndHide.get(1).setVisible(true);
		else this.showAndHide.get(1).setVisible(false);
	}
	
	private void updateGenkiQuality(int idList) {
		int star = 0;
		while(star < 5) {
			if(!this.starGenki.get(idList).get(star).isSelected()) break;
			star++;
		}
		
		Genki[] tabGenki = this.allGameStuff.getPossibleGenki(this.colorGenki.get(idList), star);
		
		if(tabGenki == null) {
			for(int i = 0; i < this.starGenki.get(idList).size(); i++) {
				this.starGenki.get(idList).get(i).setVisible(false);
			}
			this.CBoxGenki.get(idList).setVisible(false);
		} else {
			for(int i = 0; i < this.starGenki.get(idList).size(); i++) {
				this.starGenki.get(idList).get(i).setVisible(true);
			}
			this.CBoxGenki.get(idList).setVisible(true);
			
			Genki memory = this.CBoxGenki.get(idList).getSelectedItem() != null ? (Genki) this.CBoxGenki.get(idList).getSelectedItem() : tabGenki[0];
			
			this.CBoxGenki.get(idList).setModel(new DefaultComboBoxModel<Genki>(tabGenki));
			this.CBoxGenki.get(idList).setSelectedItem(memory);
		}
	}
	
	private void updateGenkiStar(int idList, int idCheck) {
		Genki[] tabGenki = this.allGameStuff.getPossibleGenki(this.colorGenki.get(idList), idCheck+1);
		
		for(int i = 0; i < this.starGenki.get(idList).size(); i++) {
			if(i <= idCheck) this.starGenki.get(idList).get(i).setSelected(true);
			else this.starGenki.get(idList).get(i).setSelected(false);
		}
		
		int memory = this.CBoxGenki.get(idList).getSelectedIndex();
		
		this.CBoxGenki.get(idList).setModel(new DefaultComboBoxModel<Genki>(tabGenki));
		this.CBoxGenki.get(idList).setSelectedIndex(memory);
	}
	
	private void updateListStuff() {
		/* ARME */
		for(int i = 0; i < this.CBoxWeapon.size(); i++) {
			Weapon[] tabWeapon = this.allGameStuff.getPossibleWeapon(i, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), null);
			Weapon memory = (Weapon) this.CBoxWeapon.get(i).getSelectedItem();
			
			this.CBoxWeapon.get(i).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
			this.CBoxWeapon.get(i).setSelectedItem(memory);
			
			if(!this.CBoxWeapon.get(i).getSelectedItem().equals(memory)) {
				weaponType(i, 0);
				showStuffDetails(i, 0);
				showXpStuff(i, 0);
				updateEnchant(i);
				
				this.valueFortif.get(i).setSelectedIndex(0);
				this.CBoxPearl.get(i).setSelectedIndex(0);
				this.CBoxPearl.get(i+1).setSelectedIndex(0);
				this.CBoxPearl.get(i+2).setSelectedIndex(0);
			}
		}
		
		/* ARMURE */
		for(int i = 0; i < this.CBoxArmor.size(); i++) {
			Armor[] tabArmor = this.allGameStuff.getPossibleArmor(i, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
			Armor memory = (Armor) this.CBoxArmor.get(i).getSelectedItem();
			
			this.CBoxArmor.get(i).setModel(new DefaultComboBoxModel<Armor>(tabArmor));
			this.CBoxArmor.get(i).setSelectedItem(memory);
			
			if(!this.CBoxArmor.get(i).getSelectedItem().equals(memory)) {
				this.valueFortif.get(i+3).setSelectedIndex(0);
				if(i == 0) {
					this.CBoxPearl.get(i+12).setSelectedIndex(0);
				} else if (i == 1) {
					this.CBoxPearl.get(i+12).setSelectedIndex(0);
					this.CBoxPearl.get(i+13).setSelectedIndex(0);
				} else {
					this.CBoxPearl.get(i+13).setSelectedIndex(0);
				}
				
				showStuffDetails(i+3, 0);
			}
		}
		
		/* PROJECTILE */
		Bullet[] tabBullet = this.allGameStuff.getPossibleBullet(this.spinnerLvl.getIntValue());
		Bullet memoryBullet = (Bullet) this.CBoxBullet.getSelectedItem();
		
		this.CBoxBullet.setModel(new DefaultComboBoxModel<Bullet>(tabBullet));
		this.CBoxBullet.setSelectedItem(memoryBullet);
		
		/* CAPE */
		Cape[] tabCape = this.allGameStuff.getPossibleCape(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		Cape memoryCape = (Cape) this.CBoxCape.getSelectedItem();
		
		this.CBoxCape.setModel(new DefaultComboBoxModel<Cape>(tabCape));
		this.CBoxCape.setSelectedItem(memoryCape);
		
		/* RING */
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = this.allGameStuff.getPossibleRing(this.spinnerLvl.getIntValue(), null);
			Ring memory = (Ring) this.CBoxRing.get(i).getSelectedItem();
			
			this.CBoxRing.get(i).setModel(new DefaultComboBoxModel<Ring>(tabRing));
			this.CBoxRing.get(i).setSelectedItem(memory);
		}
	}
	
	private void updateEnchant(int idList) {
		if(idList < 3) {
			if(this.CBoxWeapon.get(idList).getSelectedIndex() != 0) {
				Weapon weapon = (Weapon) this.CBoxWeapon.get(idList).getSelectedItem();
				
				if(weapon.getCanEnchant()) {
					Enchantment[] tabEnchant = this.allGameStuff.getPossibleWeaponEnchant(weapon.getQuality(), weapon.getType());
					
					this.CBoxEnchant.get(idList).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.CBoxEnchant.get(idList).setVisible(true);
				} else {
					this.CBoxEnchant.get(idList).setVisible(false);
				}
			} else {
				this.CBoxEnchant.get(idList).setVisible(false);
			}
		} else if(idList < 8) {
			if(this.CBoxArmor.get(idList-3).getSelectedIndex() != 0) {
				Armor armor = (Armor) this.CBoxArmor.get(idList-3).getSelectedItem();
				
				if(armor.getCanEnchant()) {
					Enchantment[] tabEnchant = this.allGameStuff.getPossibleArmorEnchant(armor.getQuality());
					
					this.CBoxEnchant.get(idList).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.CBoxEnchant.get(idList).setVisible(true);
				} else {
					this.CBoxEnchant.get(idList).setVisible(false);
				}
			} else {
				this.CBoxEnchant.get(idList).setVisible(false);
			}
		} else if(idList == 8) {
			if(this.CBoxCape.getSelectedIndex() != 0) {
				Cape cape = (Cape) this.CBoxCape.getSelectedItem();
				
				if(cape.getCanEnchant()) {
					Enchantment[] tabEnchant = this.allGameStuff.getPossibleCapeRingEnchant();
					
					this.CBoxEnchant.get(idList).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.CBoxEnchant.get(idList).setVisible(true);
				} else {
					this.CBoxEnchant.get(idList).setVisible(false);
				}
			} else {
				this.CBoxEnchant.get(idList).setVisible(false);
			}
		} else {
			if(this.CBoxRing.get(idList-9).getSelectedIndex() != 0) {
				Ring ring = (Ring) this.CBoxRing.get(idList-9).getSelectedItem();
				
				if(ring.getCanEnchant()) {
					Enchantment[] tabEnchant = this.allGameStuff.getPossibleCapeRingEnchant();
					
					this.CBoxEnchant.get(idList).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.CBoxEnchant.get(idList).setVisible(true);
				} else {
					this.CBoxEnchant.get(idList).setVisible(false);
				}
			} else {
				this.CBoxEnchant.get(idList).setVisible(false);
			}
		}
	}
	
	private void updatePearl(int id) {
		if(id < 3) {
			Pearl[] tabPearl = this.allGameStuff.getPossibleWeaponPearl(((Weapon) this.CBoxWeapon.get(id).getSelectedItem()).getQuality());
			
			if(id == 0)
				for(int i = 0; i < 3; i++) {
					Pearl memory = (Pearl) this.CBoxPearl.get(id*3+i).getSelectedItem();
					
					this.CBoxPearl.get(id*3+i).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
					this.CBoxPearl.get(id*3+i).setSelectedItem(memory);
				}
			for(int i = 0; i < 3; i++) {
				Pearl memory = (Pearl) this.CBoxPearl.get(3*(id+1)+i).getSelectedItem();
				
				this.CBoxPearl.get(3*(id+1)+i).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.CBoxPearl.get(3*(id+1)+i).setSelectedItem(memory);
			}
		} else {
			Pearl[] tabPearl = this.allGameStuff.getPossibleArmorPearl(((Armor) this.CBoxArmor.get(id-3).getSelectedItem()).getQuality());
			
			if(id == 3) {
				Pearl memory = (Pearl) this.CBoxPearl.get(id+9).getSelectedItem();
				
				this.CBoxPearl.get(id+9).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.CBoxPearl.get(id+9).setSelectedItem(memory);
			} else if (id == 4) {
				Pearl memory = (Pearl) this.CBoxPearl.get(id+9).getSelectedItem();
				
				this.CBoxPearl.get(id+9).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.CBoxPearl.get(id+9).setSelectedItem(memory);
				
				memory = (Pearl) this.CBoxPearl.get(id+10).getSelectedItem();
				
				this.CBoxPearl.get(id+10).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.CBoxPearl.get(id+10).setSelectedItem(memory);
			} else {
				Pearl memory = (Pearl) this.CBoxPearl.get(id+10).getSelectedItem();
				
				this.CBoxPearl.get(id+10).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.CBoxPearl.get(id+10).setSelectedItem(memory);
			}
		}
	}
	
	private void updateLvlXpStuff(int index) {
		if(this.listEffectXpStuff.get(index*2).getSelectedItem().toString().equals("Rien")
				|| this.listEffectXpStuff.get(index*2+1).getSelectedItem().toString().equals("Rien")
				|| this.listEffectXpStuff.get(index*2).getSelectedItem().toString().equals(this.listEffectXpStuff.get(index*2+1).getSelectedItem().toString())) {
			this.listLvlXpStuff.get(index*2).setVisible(false);
			this.listLvlXpStuff.get(index*2+1).setVisible(false);
			setMemoryInList(this.listLvlXpStuff.get(index*2), null);
			setMemoryInList(this.listLvlXpStuff.get(index*2+1), null);
		} else {
			int weaponType = (index < 3) ? ((Weapon)this.CBoxWeapon.get(index).getSelectedItem()).getType() : 0;
			int ifNotWeapon = index >= 3 ? 13+index : 0;
			String[] tmp = new String[this.allGameStuff.getListXpStuff().get(weaponType + ifNotWeapon).get(this.listEffectXpStuff.get(index*2).getSelectedIndex()-1).getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
			this.listLvlXpStuff.get(index*2).add(new JCustomComboBox<String>(tmp));
			setMemoryInList(this.listLvlXpStuff, index*2, tmp);
			
			tmp = new String[this.allGameStuff.getListXpStuff().get(weaponType + ifNotWeapon).get(this.listEffectXpStuff.get(index*2+1).getSelectedIndex()-1).getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
			this.listLvlXpStuff.get(index*2+1).add(new JCustomComboBox<String>(tmp));
			setMemoryInList(this.listLvlXpStuff, index*2+1, tmp);
			
			this.listLvlXpStuff.get(index*2).setVisible(true);
			this.listLvlXpStuff.get(index*2+1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int index) {
		int indexPair = (index % 2 == 0) ? index + 1 : index -1;
		if(this.listEffectXpStuff.get(index).getSelectedIndex() == 0
				|| this.listEffectXpStuff.get(indexPair).getSelectedIndex() == 0
				|| this.listEffectXpStuff.get(index).getSelectedIndex() == this.listEffectXpStuff.get(indexPair).getSelectedIndex())
			return;
		int currentLvl = this.listLvlXpStuff.get(index).getSelectedIndex()+1;
		int weaponType = (index < 6) ? ((Weapon)this.CBoxWeapon.get(index/2).getSelectedItem()).getType() : 0;
		int ifNotWeapon = index >= 6 ? 13+(index/2) : 0;
		int sizePair = this.allGameStuff.getListXpStuff().get(weaponType + ifNotWeapon).get(this.listEffectXpStuff.get(indexPair).getSelectedIndex()-1).getLvlValue().size();
		
		String[] tmp = new String[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
		this.listLvlXpStuff.get(indexPair).add(new JComboBox<String>(tmp));
		setMemoryInList(this.listLvlXpStuff, indexPair, tmp);
	}
	
	private void updateCostume(int idList) {
		int quality = 0;
		int type = idList < 2 ? 0 : 1;
		
		for(int i = 0; i < 5; i++) {
			if(this.costQuality.get(idList).get(i).isSelected()) {
				quality = i;
				break;
			}
		}
		
		Costume[] cost = this.allGameStuff.getPossibleCostume(quality, type);
		
		if(cost == null) {
			this.CBoxCostume.get(idList).setVisible(false);
		} else {
			this.CBoxCostume.get(idList).setVisible(true);
			
			int memory = this.CBoxCostume.get(idList).getSelectedIndex() != -1 ? this.CBoxCostume.get(idList).getSelectedIndex() : 0;
			if(memory+1 > cost.length) memory = 0;
			this.CBoxCostume.get(idList).setModel(new DefaultComboBoxModel<Costume>(cost));
			this.CBoxCostume.get(idList).setSelectedIndex(memory);
		}
		
		if(quality == 0) {
			if(idList == 0) {
				this.CBoxCostPearl.get(idList).setVisible(false);
				this.CBoxCostPearl.get(idList).setSelectedIndex(0);
				this.CBoxCostPearl.get(idList+1).setVisible(false);
				this.CBoxCostPearl.get(idList+1).setSelectedIndex(0);
			} else if(idList < 3) {
				this.CBoxCostPearl.get(idList+1).setVisible(false);
				this.CBoxCostPearl.get(idList+1).setSelectedIndex(0);
			}  else if(idList == 3) {
				this.CBoxCostPearl.get(idList+1).setVisible(false);
				this.CBoxCostPearl.get(idList+1).setSelectedIndex(0);
				this.CBoxCostPearl.get(idList+2).setVisible(false);
				this.CBoxCostPearl.get(idList+2).setSelectedIndex(0);
			} else {
				this.CBoxCostPearl.get(idList+2).setVisible(false);
				this.CBoxCostPearl.get(idList+2).setSelectedIndex(0);
			}
			
			if(idList == 0) {
				updateCheckBoxRunway(0);
				updateCheckBoxRunway(1);
			} else {
				updateCheckBoxRunway(idList*2-2);
				updateCheckBoxRunway(idList*2-1);
			}
		} else {
			if(idList == 0) {
				this.CBoxCostPearl.get(idList).setVisible(true);
				this.CBoxCostPearl.get(idList+1).setVisible(true);
			} else if(idList < 3) {
				this.CBoxCostPearl.get(idList+1).setVisible(true);
			}  else if(idList == 3) {
				this.CBoxCostPearl.get(idList+1).setVisible(true);
				this.CBoxCostPearl.get(idList+2).setVisible(true);
			} else {
				this.CBoxCostPearl.get(idList+2).setVisible(true);
			}
		}
		
		if(this.costWeapon.get(0).isSelected() || this.costQuality.get(0).get(0).isSelected()) {
			this.CBoxCostPearl.get(1).setVisible(false);
			this.CBoxCostPearl.get(1).setSelectedIndex(0);
		}
	}
	
	private void showWeaponCost() {
		if(this.costWeapon.get(0).isSelected()) {
			this.showAndHide.get(2).setVisible(true);
			this.CBoxCostPearl.get(1).setVisible(false);
			this.CBoxCostPearl.get(1).setSelectedIndex(0);
		} else {
			this.showAndHide.get(2).setVisible(false);
			if(!this.costQuality.get(0).get(0).isSelected())
				this.CBoxCostPearl.get(1).setVisible(true);
		}
	}
	
	private void updateCheckBoxRunway(int index) {
		int indexPair = (index % 2 == 0) ? index + 1 : index -1;
		int indexQuality = index/2 +1;
		
		if(indexQuality == 1) {
			if(this.costQuality.get(0).get(0).isSelected() && this.costQuality.get(1).get(0).isSelected()) {
				this.checkBoxRunway.get(index).setSelected(false);
			}
		} else if(this.costQuality.get(indexQuality).get(0).isSelected()) {
			this.checkBoxRunway.get(index).setSelected(false);
		}
		
		if(this.checkBoxRunway.get(index).isSelected()) {
			this.checkBoxRunway.get(indexPair).setSelected(false);
		}
	}
	
	private void updateListTalent() {
		ArrayList<ArrayList<Talent>> listTalent = this.allGameStuff.getPossibleTalent(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) tabTalent[j+1] = listTalent.get(i).get(j);
			
			this.radioTalent.get(i/3).get((i%3)+1).setIcon(new ImageIcon(this.allGameStuff.getListTalent().get(this.listClasses.getSelectedIndex()).get(i).getIcon()));
			this.CBoxTalent.get(i).setModel(new DefaultComboBoxModel<Talent>(tabTalent));
		}
	}
	
	private void updateTalent() {
		int lvl = this.spinnerLvl.getIntValue();
		ArrayList<ArrayList<Talent>> listTalent = this.allGameStuff.getPossibleTalent(this.listClasses.getSelectedIndex(), lvl);
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) tabTalent[j+1] = listTalent.get(i).get(j);
			
			int memory = this.CBoxTalent.get(i).getSelectedIndex() > tabTalent.length-1 ? tabTalent.length-1 : this.CBoxTalent.get(i).getSelectedIndex();
			this.CBoxTalent.get(i).setModel(new DefaultComboBoxModel<Talent>(tabTalent));
			this.CBoxTalent.get(i).setSelectedIndex(memory);
		}
		
		int[] tierLvl = new int[] { 6, 16, 31, 46, 66, 70, 73, 77 };
		for(int i = 0; i < tierLvl.length; i++) {
			if(tierLvl[i] <= lvl) this.showAndHideTalent.get(i).setVisible(true);
			else this.showAndHideTalent.get(i).setVisible(false);
		}
	}
	
	public void updateSelectedTalent(int index) {
		ArrayList<JCustomRadioButton> radio = this.radioTalent.get(index);
		for(int i = 0; i < radio.size(); i++) {
			if(radio.get(i).isSelected()) {
				if(i == 0 || this.CBoxTalent.get(index*3+i-1).getSelectedIndex() == 0) {
					this.tabChosenTalent[index].setIcon(new ImageIcon());
				} else {
					this.tabChosenTalent[index].setIcon(new ImageIcon(this.allGameStuff.getListTalent().get(this.listClasses.getSelectedIndex()).get(index*3+i-1).getIcon()));
				}
			}
		}
	}
	
	public void updateRadioTalent(int index) {
		if(this.radioTalent.get(index/3).get(index % 3 + 1).isSelected()) {
			if(this.CBoxTalent.get(index).getSelectedIndex() == 0) {
				this.radioTalent.get(index/3).get(index % 3 + 1).setSelected(false);
				this.radioTalent.get(index/3).get(0).setSelected(true);
				this.tabChosenTalent[index/3].setIcon(new ImageIcon());
			} else {
				this.tabChosenTalent[index/3].setIcon(new ImageIcon(this.allGameStuff.getListTalent().get(this.listClasses.getSelectedIndex()).get(index).getIcon()));
			}
			
		}
	}
	
	private void updateCombiTalent() {
		int[] currentCode = new int[4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.CBoxTalent.get(i*3+j-1).getSelectedIndex() != 0) {
					currentCode[i] = j;
					break;
				}
			}
		}
		this.combiTalent.setObject(this.allGameStuff.getCombiTalent(this.listClasses.getSelectedIndex(), currentCode));
		this.combiTalent.setVisible(true);
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<Talent> talent : this.CBoxTalent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(talent.getItemCount()-1);
			} else break;
		}
	}
	
	private void updateListSpe() {
		this.tabSpeciality = this.allGameStuff.getSpeFromClass(this.listClasses.getSelectedIndex());
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			this.iconSpe.get(i).setIcon(new ImageIcon(this.tabSpeciality[i].getIcon()));
			this.iconSpe.get(i).setToolTipText(this.tabSpeciality[i].getTooltip());
			this.CBoxSpePoint.get(i).setSelectedIndex(0);
		}
	}
	
	private void updateSpePoint() {
		int remain = 1145;
		for(int i = 0; i < this.CBoxSpePoint.size(); i++) {
			int current = this.CBoxSpePoint.get(i).getSelectedIndex();
			if(this.tabSpeciality[i].getLvl() == 45) {
				if(current > 15) {
					remain -= (current - 15) * 9;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 5;
					current -= current - 10;
				}
				remain -= current * 2;
			} else if(this.tabSpeciality[i].getLvl() == 60) {
				if(current > 15) {
					remain -= (current - 15) * 11;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 7;
					current -= current - 10;
				}
				remain -= current * 4;
			} else if(this.tabSpeciality[i].getLvl() == 75) {
				if(current > 15) {
					remain -= (current - 15) * 13;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 9;
					current -= current - 10;
				}
				remain -= current * 6;
			} else if(this.tabSpeciality[i].getLvl() == 91) {
				if(current > 15) {
					remain -= (current - 15) * 15;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 11;
					current -= current - 10;
				}
				remain -= current * 8;
			}
		}
		this.nbSpePoint.setText("" + remain);
		for(int i = 0; i < 20; i++) {
			if(this.CBoxSpePoint.get(i).getItemCount() != this.CBoxSpePoint.get(i).getSelectedIndex()) {
				if(this.tabSpeciality[i].getLvl() == 45) {
					adjustSpeCombobox(i, remain, 2);
				} else if(this.tabSpeciality[i].getLvl() == 60) {
					adjustSpeCombobox(i, remain, 4);
				} else if(this.tabSpeciality[i].getLvl() == 75) {
					adjustSpeCombobox(i, remain, 6);
				} else if(this.tabSpeciality[i].getLvl() == 91) {
					adjustSpeCombobox(i, remain, 8);
				}
			}
		}
	}
	
	private void adjustSpeCombobox(int idSpe, int remain, int speCost) {
		int countFull = 0;
		for(int j = this.CBoxSpePoint.get(idSpe).getSelectedIndex(); j < this.CBoxSpePoint.get(idSpe).getItemCount()-1; j++) {
			if(j < 11) countFull += speCost;
			else if(j < 16) countFull += speCost + 3;
			else if(j < 21) countFull += speCost + 7;
		}
		while(countFull > remain) {
			int itemCount = this.CBoxSpePoint.get(idSpe).getItemCount();
			if(itemCount <= 11) countFull -= speCost;
			else if(itemCount <= 16) countFull -= speCost + 3;
			else if(itemCount <= 21) countFull -= speCost + 7;
			this.CBoxSpePoint.get(idSpe).removeItemAt(itemCount-1);
		}
	}
	
	private void updateSpeElement(int idList) {
		int lvl = this.spinnerLvl.getIntValue();
		boolean reinca = this.lvlReinca.getSelectedIndex() != 0;
		int nb10sup = 0;
		int nb15sup = 0;
		
		for(int i = 0; i < this.CBoxSpePoint.size(); i++) {
			if(this.CBoxSpePoint.get(i).getSelectedIndex() > 10) nb10sup++;
			if(this.CBoxSpePoint.get(i).getSelectedIndex() > 15) nb15sup++;
		}
		
		if(!reinca) {
			if(lvl < 91) {
				if(nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else {
				if(nb15sup == 0 && nb10sup < 2) {
					rescaleSpeComboBox(21);
				} else if(nb15sup == 0 && nb10sup == 2) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 1 && nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			}
		} else {
			if(lvl < 86) {
				if(nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else if(lvl < 91) {
				if(nb10sup < 3) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else if(lvl < 100) {
				if(nb15sup == 0 && nb10sup < 3) {
					rescaleSpeComboBox(21);
				} else if(nb15sup == 0 && nb10sup == 3) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 1 && nb10sup < 3) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else {
				if(nb15sup < 2 && nb10sup < 4) {
					rescaleSpeComboBox(21);
				} else if(nb15sup < 2 && nb10sup == 4) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 2 && nb10sup < 4) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			}
		}
	}
	
	private void rescaleSpeComboBox(int rescale) {
		for(int i = 0; i < 20; i++) {
			int itemCount = this.CBoxSpePoint.get(i).getItemCount();
			if(itemCount < rescale) {
				while(itemCount != rescale) {
					this.CBoxSpePoint.get(i).addItem(new Integer(itemCount));
					itemCount++;
				}
			} else if(itemCount > rescale && this.CBoxSpePoint.get(i).getSelectedIndex() < rescale) {
				while(itemCount != rescale) {
					itemCount--;
					this.CBoxSpePoint.get(i).removeItemAt(itemCount);
				}
			}
		}
	}
	
	private void rescaleSpeComboBox10SupOnly(int rescale) {
		for(int i = 0; i < 20; i++) {
			int itemCount = this.CBoxSpePoint.get(i).getItemCount();
			if(this.CBoxSpePoint.get(i).getSelectedIndex() > 11) {
				while(itemCount != rescale) {
					this.CBoxSpePoint.get(i).addItem(new Integer(itemCount));
					itemCount++;
				}
			} else {
				if(itemCount < 11) {
					while(itemCount != 11) {
						this.CBoxSpePoint.get(i).addItem(new Integer(itemCount));
						itemCount++;
					}
				}
				else if(itemCount > 11)
					while(itemCount != 11) {
						itemCount--;
						this.CBoxSpePoint.get(i).removeItemAt(itemCount);
					}
			}
		}
	}
	
	private void setMaxCBoxSpe() {
		for(JComboBox<Integer> speciality : this.CBoxSpePoint) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(10);
			} else break;
		}
	}
	
	private void updateSkill() {
		int idClass = this.listClasses.getSelectedIndex();
		int lvl = this.spinnerLvl.getIntValue();
		int count = 0;
		boolean isProgressUpdate = false;
		
		if(lvl < 6) this.showAndHide.get(3).setVisible(false);
		else this.showAndHide.get(3).setVisible(true);
		
		for(Skill skill : this.allGameStuff.getListSkill().get(idClass)) {
			if(skill.getLvl()[0] > lvl) continue;
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
		
		Skill skill = this.allGameStuff.getListSkill().get(12).get(0);
		
		ArrayList<Skill> lvlSkill = new ArrayList<Skill>();
		lvlSkill.add(new Skill(skill.getName() + " non acquis"));
		
		for(int i = 0; i < skill.getLvl().length; i++) {
			if(skill.getLvl()[i] <= lvl) lvlSkill.add(new Skill(skill, i));
		}
		
		if(lvlSkill.size() > 1 && this.lvlReinca.getSelectedIndex() == 1) {
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
	
	private void updateSkillReinca() {
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 1;
		
		if(this.skillProgress.get(1).getItemCount() == 0) updateSkill();
		
		if(isReinca && this.skillProgress.get(1).getItemCount() > 1) this.skillProgress.get(1).setVisible(true);
		else this.skillProgress.get(1).setVisible(false);
	}
	
	private void updateProSkill() {
		int lvl = this.spinnerLvl.getIntValue();
		
		if(lvl < 66) this.showAndHide.get(4).setVisible(false);
		else this.showAndHide.get(4).setVisible(true);
		
		ProSkill[] tabProSkill = this.allGameStuff.getListProSkill(this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue());
		ProSkill memory = (ProSkill) this.CBoxProSkill.getSelectedItem();
		this.CBoxProSkill.setModel(new DefaultComboBoxModel<ProSkill>(tabProSkill));
		if(memory != null) this.CBoxProSkill.setSelectedItem(memory);
		if(this.CBoxProSkill.getSelectedIndex() == -1 && tabProSkill.length > 0) this.CBoxProSkill.setSelectedIndex(0);
	}
	
	private void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = this.allGameStuff.getPossibleBlason(this.spinnerLvl.getIntValue(), i == 0);
			Blason memory = (Blason) this.CBoxBlason.get(i).getSelectedItem();
			
			this.CBoxBlason.get(i).setModel(new DefaultComboBoxModel<Blason>(tabBlason));
			this.CBoxBlason.get(i).setSelectedItem(memory);
		}
	}
	
	private void updateGuildBuff(int idList) {
		GuildBuff choice = (GuildBuff) this.listGuildBuff.getSelectedValue();
		
		int slot = 0;
		while(slot < 4 && this.guildBuffUsed.get(slot).isVisible()) slot++;
		
		if(slot == 4) {
			for(int i = 0; i < 3; i++) {
				this.guildBuffUsed.get(i).setObject(this.guildBuffUsed.get(i+1));
			}
			this.guildBuffUsed.get(3).setObject(choice);
		} else {
			this.guildBuffUsed.get(slot).setObject(choice);
			this.guildBuffUsed.get(slot).setVisible(true);
			this.cross.get(slot).setVisible(true);
		}
		
		refreshGuildBuffList();
	}
	
	private void removeGuildBuff(int idList) {
		while(idList < 3 && this.guildBuffUsed.get(idList+1).isVisible()) {
			this.guildBuffUsed.get(idList).setObject(this.guildBuffUsed.get(idList+1));
			idList++;
		}
		
		this.guildBuffUsed.get(idList).setVisible(false);
		this.cross.get(idList).setVisible(false);
		
		refreshGuildBuffList();
	}
	
	private void refreshGuildBuffList() {
		ArrayList<String> guildBuffName = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++) {
			if(this.guildBuffUsed.get(i).isVisible()) {
				guildBuffName.add(this.guildBuffUsed.get(i).getText());
			}
		}
		
		GuildBuff[] tabGuildBuff = this.allGameStuff.getListGuildBuff(guildBuffName);
		this.listGuildBuff.setModel(new DefaultComboBoxModel<GuildBuff>(tabGuildBuff));
	}
	
	private void updateStoneBuff(int idList) {
		Nucleus choice = (Nucleus) this.listStone.getSelectedValue();
		
		int slot = 0;
		while(slot < 3 && this.stoneUsed.get(slot).isVisible()) slot++;
		
		this.stoneUsed.get(slot).setObject(choice);
		this.stoneUsed.get(slot).setVisible(true);
		this.cross.get(slot+4).setVisible(true);
		
		refreshStoneList();
	}
	
	private void removeStoneBuff(int idList) {
		this.stoneUsed.get(idList).setVisible(false);
		this.cross.get(idList+4).setVisible(false);
		
		refreshStoneList();
	}
	
	private void refreshStoneList() {
		ArrayList<String> stoneName = new ArrayList<String>();
		
		for(int i = 0; i < 3; i++) {
			if(this.stoneUsed.get(i).isVisible()) {
				stoneName.add(this.stoneUsed.get(i).getText());
			}
		}
		
		Nucleus[] tabNucleus = this.allGameStuff.getListNucleus(stoneName);
		this.listStone.setModel(new DefaultComboBoxModel<Nucleus>(tabNucleus));
	}
	
	private void updateBague() {
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 1;
		int lvl = this.spinnerLvl.getIntValue();
		
		if(isReinca || lvl >= 20) {
			this.showAndHide.get(6).setVisible(true);
		} else {
			this.showAndHide.get(6).setVisible(false);
			this.CBoxBague.setSelectedIndex(0);
		}
	}
	
	private void updateAnima() {
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 1;
		int lvl = this.spinnerLvl.getIntValue();
		
		Anima[] tabAnima = this.allGameStuff.getListAnima(lvl);
		int memory = this.CBoxAnima.getSelectedIndex();
		
		this.CBoxAnima.setModel(new DefaultComboBoxModel<Anima>(tabAnima));
		this.CBoxAnima.setSelectedIndex(memory);
		
		if(isReinca && lvl >= 10) {
			this.showAndHide.get(7).setVisible(true);
		} else {
			this.showAndHide.get(7).setVisible(false);
			this.CBoxAnima.setSelectedIndex(0);
		}
	}
	
	private void updateEnergy() {
		int lvl = this.spinnerLvl.getIntValue();
		boolean isReinca = this.lvlReinca.getSelectedIndex() == 1;
		
		for(int i = 0; i < this.spinnerEnergy.size(); i++) {
			int memory = (int) this.spinnerEnergy.get(i).getIntValue();
			if(!isReinca) {
				if(memory > lvl*2) memory = lvl*2;
				this.spinnerEnergy.get(i).setModel(new SpinnerNumberModel(memory, 0, lvl*2, 1));
			} else {
				this.spinnerEnergy.get(i).setModel(new SpinnerNumberModel(memory, 0, 200, 1));
			}
		}
	}
	
	private void showStuffDetails(int idList, int indexCB) {
		if(indexCB != 0) {
			this.valueFortif.get(idList).setVisible(true);
			if(idList < 3) {
				if(idList == 0) {
					this.CBoxPearl.get(0).setVisible(true);
					this.CBoxPearl.get(1).setVisible(true);
					this.CBoxPearl.get(2).setVisible(true);
				}
				this.CBoxPearl.get(3*(idList+1)).setVisible(true);
				this.CBoxPearl.get(3*(idList+1)+1).setVisible(true);
				this.CBoxPearl.get(3*(idList+1)+2).setVisible(true);
			} else if (idList == 3) {
				this.CBoxPearl.get(idList+9).setVisible(true);
			} else if (idList == 4) {
				this.CBoxPearl.get(idList+9).setVisible(true);
				this.CBoxPearl.get(idList+10).setVisible(true);
			} else {
				this.CBoxPearl.get(idList+10).setVisible(true);
			}
		}
		else {
			this.valueFortif.get(idList).setVisible(false);
			if(idList < 3) {
				if(idList == 0) {
					for(int i = 0; i < 3; i++) {
						this.CBoxPearl.get(i).setVisible(false);
						this.CBoxPearl.get(i).setSelectedIndex(0);
					}
				}
				for(int i = 0; i < 3; i++) {
					this.CBoxPearl.get(3*(idList+1)+i).setVisible(false);
					this.CBoxPearl.get(3*(idList+1)+i).setSelectedIndex(0);
				}
			} else if (idList == 3) {
				this.CBoxPearl.get(idList+9).setVisible(false);
				this.CBoxPearl.get(idList+9).setSelectedIndex(0);
			} else if (idList == 4) {
				this.CBoxPearl.get(idList+9).setVisible(false);
				this.CBoxPearl.get(idList+10).setVisible(false);
				this.CBoxPearl.get(idList+9).setSelectedIndex(0);
				this.CBoxPearl.get(idList+10).setSelectedIndex(0);
			} else {
				this.CBoxPearl.get(idList+10).setVisible(false);
				this.CBoxPearl.get(idList+10).setSelectedIndex(0);
			}
		}
	}
	
	private void showXpStuff(int idList, int indexCB) {
		if(indexCB != 0) {
			if(idList < 3) {
				int weaponType = ((Weapon) this.CBoxWeapon.get(idList).getSelectedItem()).getType();
				String[] tmp = new String[this.allGameStuff.getListXpStuff().get(weaponType).size()+1];
				tmp[0] = "Rien";
				for(int i = 0; i < tmp.length-1; i++) tmp[i+1] = this.allGameStuff.getListXpStuff().get(weaponType).get(i).getType().name();
				this.listEffectXpStuff.get(idList*2).setModel(new DefaultComboBoxModel<String>(tmp));
				this.listEffectXpStuff.get(idList*2+1).setModel(new DefaultComboBoxModel<String>(tmp));
			}
			
			this.showAndHideXpStuff.get(idList).setVisible(true);	
			this.listEffectXpStuff.get(idList*2).setVisible(true);
			this.listEffectXpStuff.get(idList*2+1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(idList).setVisible(false);
			this.listEffectXpStuff.get(idList*2).setVisible(false);
			this.listEffectXpStuff.get(idList*2+1).setVisible(false);
			this.listEffectXpStuff.get(idList*2).setSelectedIndex(0);
			this.listEffectXpStuff.get(idList*2+1).setSelectedIndex(0);
		}
	}
	
	private void showSpe() {
		int lvl = this.spinnerLvl.getIntValue();
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			if(lvl < this.tabSpeciality[i].getLvl()) {
				this.iconSpe.get(i).setVisible(false);
				this.CBoxSpePoint.get(i).setVisible(false);
				this.CBoxSpePoint.get(i).setSelectedIndex(0);
			} else {
				this.iconSpe.get(i).setVisible(true);
				this.CBoxSpePoint.get(i).setVisible(true);
				if(this.CBoxSpePoint.get(i).getSelectedIndex() > 10) {
					this.CBoxSpePoint.get(i).setSelectedIndex(10);
				} else {
					updateSpeElement(i);
				}
			}
		}
	}
	
	private void weaponType(int idList, int indexCB) {
		Weapon choice = new Weapon((Weapon) this.CBoxWeapon.get(idList).getSelectedItem());
		if(idList == 0) {
			int keepEnchant = this.CBoxEnchant.get(1).getSelectedIndex();
			
			if(choice.getType() == 3 || choice.getType() == 4 || choice.getType() == 5 || choice.getType() == 7 || choice.getType() == 12 || choice.getType() == 13) {
				Weapon[] tabWeapon = this.allGameStuff.getPossibleWeapon(0, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), null);
				Weapon memory = (Weapon) this.CBoxWeapon.get(0).getSelectedItem();
				
				this.CBoxWeapon.get(0).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
				this.CBoxWeapon.get(0).setSelectedItem(memory);
				this.CBoxWeapon.get(1).setModel(new DefaultComboBoxModel<Weapon>(new Weapon[] { this.allGameStuff.getListWeapon().get(0).get(0) } ));
				
				for(int i = 0; i < 3; i++) {
					this.CBoxPearl.get(3+i).setVisible(true);
					this.CBoxPearl.get(6+i).setVisible(false);
					this.CBoxPearl.get(6+i).setSelectedIndex(0);
				}
				
				this.showAndHide.get(0).setVisible(false);
			} else if(choice.getType() == 0 || choice.getType() == 1 || choice.getType() == 2 || choice.getType() == 6) {
				Weapon[] tabWeapon = this.allGameStuff.getPossibleWeapon(1, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), choice);
				Weapon memory = (Weapon) this.CBoxWeapon.get(1).getSelectedItem();
				
				this.CBoxWeapon.get(1).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
				this.CBoxWeapon.get(1).setSelectedItem(memory);
				
				for(int i = 0; i < 3; i++) {
					this.CBoxPearl.get(3+i).setVisible(false);
					this.CBoxPearl.get(3+i).setSelectedIndex(0);
				}
				if(this.CBoxWeapon.get(1).getSelectedIndex() == 0) {
					for(int i = 0; i < 3; i++) {
						this.CBoxPearl.get(6+i).setVisible(false);
						this.CBoxPearl.get(6+i).setSelectedIndex(0);
					}
				}
				
				this.showAndHide.get(0).setVisible(true);
			} else this.showAndHide.get(0).setVisible(true);
			
			this.CBoxEnchant.get(1).setSelectedIndex(keepEnchant);
		} else if(idList == 1) {
			int keepEnchant = this.CBoxEnchant.get(0).getSelectedIndex();
			
			Weapon[] tabWeapon = this.allGameStuff.getPossibleWeapon(0, this.listClasses.getSelectedIndex(), this.spinnerLvl.getIntValue(), choice);
			Weapon memory = (Weapon) this.CBoxWeapon.get(0).getSelectedItem();
			
			this.CBoxWeapon.get(0).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
			this.CBoxWeapon.get(0).setSelectedItem(memory);
			
			this.CBoxEnchant.get(0).setSelectedIndex(keepEnchant);
		} else if(choice.getType() == 11) {
			this.valueFortif.get(idList).setVisible(false);
			this.valueFortif.get(idList).setSelectedIndex(0);
		}
	}
	
	private void updateDoubleRing(int idList) {
		Ring choice = (Ring) this.CBoxRing.get(idList).getSelectedItem();
		int other = idList == 0 ? 1 : 0;
		
		Ring[] tabRing = this.allGameStuff.getPossibleRing(this.spinnerLvl.getIntValue(), choice);
		Ring memory = (Ring) this.CBoxRing.get(other).getSelectedItem();
		
		this.CBoxRing.get(other).setModel(new DefaultComboBoxModel<Ring>(tabRing));
		this.CBoxRing.get(other).setSelectedItem(memory);
	}
	
	private String setMemoryInList(ArrayList<JCustomComboBox<String>> list, int indexList, String[] itemList) {
		return setMemoryInList(list.get(indexList), itemList);
	}
	
	private String setMemoryInList(JCustomComboBox<String> list, String[] itemList) {
		String memory = list.getSelectedItem() != null ? list.getSelectedItem().toString() : "";
		if(itemList != null) {
			this.model = new DefaultComboBoxModel<String>(itemList);
			list.setModel(model);
		}
		list.setSelectedItem(memory);
		return memory;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					new MainFrame().generate();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void updateTabPane(int index) {
		for(int i = 0; i < this.tabPaneMenu.size(); i++) {
			if(i != index) {
				this.mainPage.get(i).setVisible(false);
				this.tabPaneMenu.get(i).setFont(new Font("Open Sans", Font.PLAIN, 24));
				this.tabPaneMenu.get(i).setSelected(false);
			} else {
				this.mainPage.get(i).setVisible(true);
				this.tabPaneMenu.get(i).setFont(new Font("Open Sans", Font.BOLD, 24));
				this.tabPaneMenu.get(i).setSelected(true);
			}
		}
	}
	
	public void updateLanguage() {
		if(this.language.isSelected()) {
			this.language.setIcon(this.language.getSelectedIcon());
			for(int i = 0; i < this.fr_en.get(0).size(); i++) {
				if(i == 0) {
					for(int j = 0; j < this.fr_en.get(0).get(i).size(); j++) {
						this.tabPaneMenu.get(j).setText(this.fr_en.get(0).get(i).get(j));
					}
				} else {
					for(int j = 0; j < this.fr_en.get(0).get(i).size(); j++) {
						this.allLabel.get(i-1).get(j).setText(this.fr_en.get(0).get(i).get(j));
					}
				}
			}
			
			if(this.armorSetInfo.getText().equals("No active set"))
				this.armorSetInfo.setText(this.fr_en.get(0).get(3).get(10));

			if(this.capeRingSetInfo.getText().equals("No active set"))
				this.capeRingSetInfo.setText(this.fr_en.get(0).get(4).get(6));
			
			for(ArrayList<JCustomRadioButton> array : this.colorGenki) {
				for(int i = 0; i < array.size(); i++) {
					array.get(i).setText(this.fr_en.get(0).get(5).get(i+3));
				}
			}
		} else {
			this.language.setIcon(this.language.getDisabledIcon());
			for(int i = 0; i < this.fr_en.get(1).size(); i++) {
				if(i == 0) {
					for(int j = 0; j < this.fr_en.get(1).get(i).size(); j++) {
						this.tabPaneMenu.get(j).setText(this.fr_en.get(1).get(i).get(j));
					}
				} else {
					for(int j = 0; j < this.fr_en.get(1).get(i).size(); j++) {
						this.allLabel.get(i-1).get(j).setText(this.fr_en.get(1).get(i).get(j));
					}
				}
			}
			
			if(this.armorSetInfo.getText().equals("Aucun set actif"))
				this.armorSetInfo.setText(this.fr_en.get(1).get(3).get(10));
			
			if(this.capeRingSetInfo.getText().equals("Aucun set actif"))
				this.capeRingSetInfo.setText(this.fr_en.get(1).get(4).get(6));
			
			for(ArrayList<JCustomRadioButton> array : this.colorGenki) {
				for(int i = 0; i < array.size(); i++) {
					array.get(i).setText(this.fr_en.get(1).get(5).get(i+3));
				}
			}
		}
	}
	
	private boolean isAlreadyCount(ArrayList<Pearl> notCombinablePearl, Pearl pearl) {
		boolean result = false;
		
		for(Pearl compare : notCombinablePearl) {
			if(compare.equals(pearl)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
