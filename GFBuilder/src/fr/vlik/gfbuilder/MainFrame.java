/* DEBUT DE PROJET : 13 / 01 / 19 */

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
import java.util.Calendar;

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
import fr.vlik.gfbuilder.page.*;
import fr.vlik.grandfantasia.Anima;
import fr.vlik.grandfantasia.Bague;
import fr.vlik.grandfantasia.Blason;
import fr.vlik.grandfantasia.Buff;
import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Costume;
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.GuildBuff;
import fr.vlik.grandfantasia.Nucleus;
import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.ProSkill;
import fr.vlik.grandfantasia.Runway;
import fr.vlik.grandfantasia.Skill;
import fr.vlik.grandfantasia.Speciality;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.grandfantasia.Blason.BlasonType;
import fr.vlik.grandfantasia.Costume.CostType;
import fr.vlik.uidesign.*;

public class MainFrame extends JFrame {
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	private JFrame main;
	private ArrayList<ArrayList<ArrayList<String>>> fr_en = new ArrayList<ArrayList<ArrayList<String>>>(2);
	private ArrayList<ArrayList<JLabel>> allLabel = new ArrayList<ArrayList<JLabel>>();

	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	private ArrayList<JPanel> showAndHideTalent = new ArrayList<JPanel>();
	
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	private ArrayList<JPanel> mainPage = new ArrayList<JPanel>();
	
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
	
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private JTextPane parameter = new JTextPane();
	
	private int base[][][] = new int[5][12][100];
	
	private long start = Calendar.getInstance().getTimeInMillis();
	
	
	private MainFrame() {
		setCustomUI();
		
		this.main = new JFrame("Grand Fantasia Builder");
		try {
			this.main.setIconImage(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.main.setSize(1240, 800);
		this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.main.getContentPane().setLayout(new BorderLayout());
		this.main.setVisible(true);
		
		System.out.println("Début swing : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		try {
			setBaseValueByLvl();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/trad.txt"), "UTF-8"));
			String line = reader.readLine();
			this.fr_en.add(new ArrayList<ArrayList<String>>());
			this.fr_en.add(new ArrayList<ArrayList<String>>());
			int lineCount = 0;
			while(line != null) {
				this.fr_en.get(0).add(new ArrayList<String>());
				this.fr_en.get(1).add(new ArrayList<String>());
				String[] lineSplit = line.split("/");
				for(int i = 0; i < lineSplit.length; i++) {
					String[] language = lineSplit[i].split(",");
					this.fr_en.get(0).get(lineCount).add(language[0]);
					this.fr_en.get(1).get(lineCount).add(language[1]);
				}
				lineCount++;
				line = reader.readLine();
			}
			reader.close();
			
			reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/credit.txt"), "UTF-8"));
			line = reader.readLine();
			
			for(int i = 0; i < 2; i++) {
				this.fr_en.get(i).add(new ArrayList<String>());
				while(!line.equals("/")) {
					this.fr_en.get(i).get(this.fr_en.get(i).size()-1).add(line);
					line = reader.readLine();
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/****************************************/
		/*		****	   MENU		  	****	*/
		/****************************************/
		
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(200, 0));
		menu.setBackground(Consts.UIColor[0]);
		menu.setLayout(new GridLayout(14, 1, 0, 0));
		
		for(int i = 0; i < this.fr_en.get(0).size()-1; i++) {
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
		
		System.out.println("Début General : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		this.mainPage.add(PageGeneral.getInstance());
		System.out.println("Fin General : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		System.out.println("Début Weapon : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		this.mainPage.add(PageWeapon.getInstance());
		System.out.println("Fin Weapon : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		System.out.println("Début Armor : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		this.mainPage.add(PageArmor.getInstance());
		System.out.println("Fin Armor : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		
		System.out.println("Début CapeRing : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		this.mainPage.add(PageCapeRing.getInstance());
		System.out.println("Fin CapeRing : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		System.out.println("Début Mount : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		this.mainPage.add(PageMount.getInstance());
		System.out.println("Fin Mount : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		
		/****************************************/
		/*				 PAGE 6					*/
		/****************************************/
		int page = 5;
		
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
				this.checkBoxRunway.get(i).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[0]));
			} else {
				this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(18).getText()));
				this.checkBoxRunway.get(i).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[4]));
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
			
			if(i == 0) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
				this.CBoxCostPearl.get(i).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i).setVisible(false);
			}
			
			this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getWeaponCostPearl()));
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
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[i+1]));
				} else {
					this.checkBoxRunway.add(new JCustomCheckBox(this.allLabel.get(page).get(18).getText()));
					this.checkBoxRunway.get(i*2+j+2).setToolTipText(Runway.getTooltipRunway(Runway.currentRunway[4]));
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
			
			if(i == 0) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.CBoxCostPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+3).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+3).setVisible(false);
			} else if(i == 1) {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.CBoxCostPearl.get(i+3).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+3).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+3).setVisible(false);
				
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
				this.CBoxCostPearl.get(i+4).setRenderer(new CustomListCellRenderer());
				this.CBoxCostPearl.get(i+4).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MainFrame.this.updateStat();
					}
				});
				this.CBoxCostPearl.get(i+4).setVisible(false);
			} else {
				this.CBoxCostPearl.add(new JCustomComboBox<Pearl>(Pearl.getArmorCostPearl()));
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
		try {
			this.tabChosenTalent[8].setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/talent/combi.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
		
		ArrayList<ArrayList<Talent>> tabTalent = Talent.getPossibleTalent(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		
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
				try {
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossTalent.png")))));
				} catch (IOException e) {
					e.printStackTrace();
				}
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
					
					this.radioTalent.get(i*4+j).add(new JCustomRadioButton(new ImageIcon(Talent.getData()[PageGeneral.getInstance().getGrade().getGrade().index][i*12+j*3+k].getIcon())));
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
		
		this.tabSpeciality = Speciality.getData(PageGeneral.getInstance().getGrade().getGrade());
		
		
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
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
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
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
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
		
		this.CBoxIsleBuff = new JCustomComboBox<Buff>(Buff.getData());
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
			this.CBoxNucleus.add(new JCustomComboBox<Nucleus>(Nucleus.getData(i)));
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
			
			JCustomLabel labelEnergy = new JCustomLabel(Energy.getData()[i]);
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
			
			JCustomButton remove = null;
			try {
				remove = new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
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
		
		this.listGuildBuff = new JCustomList<GuildBuff>(GuildBuff.getData());
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
			
			JCustomButton remove = null;
			try {
				remove = new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
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
		
		this.listStone = new JCustomList<Nucleus>(Nucleus.getData(6));
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
		
		this.CBoxBague = new JCustomComboBox<Bague>(Bague.getData());
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
		
		
		Anima[] tabAnima = Anima.getData(PageGeneral.getInstance().getLvl());
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
		/*				 PAGE 13				*/
		/****************************************/
		page++;
		
		String buildCredit = "";
		for(int i = 0; i < this.fr_en.get(0).get(this.fr_en.get(0).size()-1).size(); i++) {
			buildCredit += this.fr_en.get(0).get(this.fr_en.get(0).size()-1).get(i) + "\n";
		}
		
		this.parameter.setEditable(false);
		this.parameter.setText(buildCredit);
		this.parameter.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.parameter.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.parameter.setBackground(Consts.UIColor[1]);
		this.parameter.setForeground(Consts.FontColor[0]);
		
		JPanel page13 = new JPanel();
		page13.setLayout(new BoxLayout(page13, BoxLayout.Y_AXIS));
		page13.setBorder(new EmptyBorder(10, 10, 10, 10));
		page13.setBackground(Consts.UIColor[1]);
		page13.add(this.allLabel.get(page).get(0));
		page13.add(Box.createVerticalStrut(10));
		this.allLabel.get(page).get(1).setFont(new Font("Open Sans", Font.BOLD, 14));
		page13.add(this.allLabel.get(page).get(1));
		page13.add(Box.createVerticalStrut(5));
		page13.add(this.parameter);
		
		this.mainPage.add(page13);
		
		
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
		
		System.out.println("Fin swing : " + (Calendar.getInstance().getTimeInMillis() - this.start));
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
		
		this.costWeapon.get(0).setSelected(false);
		this.costWeapon.get(1).setSelected(true);
		for(ArrayList<JCustomRadioButton> quality : this.costQuality) quality.get(0).setSelected(true);
		
		for(JLabel label : this.skillNatif) label.setVisible(false);
		for(JCustomComboBox<Skill> skill : this.skillProgress) skill.setVisible(false);
		
		for(JPanel panel : this.showAndHide) panel.setVisible(false);
		for(JPanel panel : this.showAndHideTalent) panel.setVisible(false);
		
		updateStat();
	}
	
	private void setBaseValueByLvl() throws IOException {
		String nameStat[] = { "FCE", "VIT", "INT", "VOL", "AGI" };
		for(int file = 0; file < nameStat.length; file++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/" + nameStat[file] + ".txt")));
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

	public void updateStat() {
		GradeName grade = PageGeneral.getInstance().getGrade().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		double coefReinca = 1;
		
		if(reinca) {
			if(lvl < 66) coefReinca = Consts.coefReinca[1];
			else if(lvl < 86) coefReinca = Consts.coefReinca[2];
			else if(lvl < 91) coefReinca = Consts.coefReinca[3];
			else if(lvl < 100) coefReinca = Consts.coefReinca[4];
			else coefReinca = Consts.coefReinca[5];
		}
		
		
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		Build build = new Build(coefReinca, weaponType);
		
		Effect[] baseFromClass = new Effect[5];
		for(int i = 0; i < baseFromClass.length; i++) {
			int value = this.base[i][grade.index][lvl-1];
			baseFromClass[i] = new Effect(TypeEffect.values()[i], false, Math.floor(value*coefReinca), false, WeaponType.NONE, null);
		}
		
		build.addEffect(baseFromClass);
		
		build.addEffect(PageGeneral.getInstance().getEffects());
		build.addAdditionalEffect(PageGeneral.getInstance().getAdditionnalEffects());
		
		build.addEffect(PageWeapon.getInstance().getEffects());
		
		build.addEffect(PageArmor.getInstance().getEffects());
		
		build.addEffect(PageCapeRing.getInstance().getEffects());
		
		build.addEffect(PageMount.getInstance().getEffects());
		
		
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
					build.addEffect(new Effect(e.getType(), e.isPercent(), e.getValue()*2, e.getWithReinca(), e.getWithWeapon(), null));
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
					build.addEffect(Runway.getData()[j].getEffects());
				}
			} else {
				for(int j : Runway.currentRunway[4]) {
					build.addEffect(Runway.getData()[j].getEffects());
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
				if(this.tabSpeciality[i].getEffects().get(j).getTransfert() == null) {
					build.addEffect(Speciality.multiplyEffect(this.tabSpeciality[i].getEffects().get(j), this.CBoxSpePoint.get(i).getSelectedIndex()));
				} else {
					build.addConvertEffect(Speciality.multiplyEffect(this.tabSpeciality[i].getEffects().get(j), this.CBoxSpePoint.get(i).getSelectedIndex()));
				}
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
		
		if(this.showAndHide.get(2).isVisible()) {
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
			for(Effect effect : Energy.getData()[i].getEffects()) {
				build.addAdditionalEffect(Energy.multiplyEffect(effect, Math.min(this.spinnerEnergy.get(i).getIntValue(), PageGeneral.getInstance().getLvl() *2)));
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
		
		
		updateLabel(build.calculStatFromEffect());
	}
	
	private void updateLabel(int[] allStats) {
		for(int i = 0; i < this.valueStat.size(); i++) {
			this.valueStat.get(i).setText(TypeEffect.values()[i].name() + " : " + allStats[i]);
			
			if(allStats[i] == 0 && i > 21) {
				this.valueStat.get(i).setVisible(false);
			} else {
				this.valueStat.get(i).setVisible(true);
			}
		}
	}
	
	public void updateNucleus() {
		if(PageGeneral.getInstance().getReinca() == 0) {
			this.showAndHide.get(3).setVisible(false);
			this.CBoxNucleus.get(1).setSelectedIndex(0);
		} else this.showAndHide.get(4).setVisible(true);
	}
	
	private void updateCostume(int idList) {
		Quality quality = Quality.GREY;
		CostType type = idList < 2 || idList == 4 ? CostType.OFFENSIVE : CostType.DEFENSIVE;
		
		for(int i = 0; i < 5; i++) {
			if(this.costQuality.get(idList).get(i).isSelected()) {
				switch (i) {
					case 0:	quality = Quality.GREY;		break;
					case 1:	quality = Quality.WHITE;	break;
					case 2:	quality = Quality.GREEN;	break;
					case 3:	quality = Quality.BLUE;		break;
					case 4:	quality = Quality.GOLD;		break;
				}
			}
		}
		
		Costume[] cost = Costume.getPossibleCostume(quality, type);
		
		if(cost == null) {
			this.CBoxCostume.get(idList).setVisible(false);
		} else {
			this.CBoxCostume.get(idList).setVisible(true);
			
			int memory = this.CBoxCostume.get(idList).getSelectedIndex() != -1 ? this.CBoxCostume.get(idList).getSelectedIndex() : 0;
			if(memory+1 > cost.length) memory = 0;
			this.CBoxCostume.get(idList).setModel(new DefaultComboBoxModel<Costume>(cost));
			this.CBoxCostume.get(idList).setSelectedIndex(memory);
		}
		
		if(quality == Quality.GREY) {
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
			this.showAndHide.get(0).setVisible(true);
			this.CBoxCostPearl.get(1).setVisible(false);
			this.CBoxCostPearl.get(1).setSelectedIndex(0);
		} else {
			this.showAndHide.get(0).setVisible(false);
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
	
	public void updateListTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		ArrayList<ArrayList<Talent>> listTalent = Talent.getPossibleTalent(grade.getGrade(), PageGeneral.getInstance().getLvl());
		
		for(int i = 0; i < listTalent.size(); i++) {
			Talent[] tabTalent = new Talent[listTalent.get(i).size()+1];
			tabTalent[0] = new Talent();
			for(int j = 0; j < tabTalent.length-1; j++) tabTalent[j+1] = listTalent.get(i).get(j);
			
			this.radioTalent.get(i/3).get((i%3)+1).setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][i].getIcon()));
			this.CBoxTalent.get(i).setModel(new DefaultComboBoxModel<Talent>(tabTalent));
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
		Grade grade = PageGeneral.getInstance().getGrade();
		ArrayList<JCustomRadioButton> radio = this.radioTalent.get(index);
		for(int i = 0; i < radio.size(); i++) {
			if(radio.get(i).isSelected()) {
				if(i == 0 || this.CBoxTalent.get(index*3+i-1).getSelectedIndex() == 0) {
					this.tabChosenTalent[index].setIcon(new ImageIcon());
				} else {
					this.tabChosenTalent[index].setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][index*3+i-1].getIcon()));
				}
			}
		}
	}
	
	public void updateRadioTalent(int index) {
		Grade grade = PageGeneral.getInstance().getGrade();
		if(this.radioTalent.get(index/3).get(index % 3 + 1).isSelected()) {
			if(this.CBoxTalent.get(index).getSelectedIndex() == 0) {
				this.radioTalent.get(index/3).get(index % 3 + 1).setSelected(false);
				this.radioTalent.get(index/3).get(0).setSelected(true);
				this.tabChosenTalent[index/3].setIcon(new ImageIcon());
			} else {
				this.tabChosenTalent[index/3].setIcon(new ImageIcon(Talent.getData()[grade.getGrade().index][index].getIcon()));
			}
			
		}
	}
	
	private void updateCombiTalent() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int[] currentCode = new int[4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < this.radioTalent.get(i).size(); j++) {
				if(this.radioTalent.get(i).get(j).isSelected() && j != 0 && this.CBoxTalent.get(i*3+j-1).getSelectedIndex() != 0) {
					currentCode[i] = j;
					break;
				}
			}
		}
		this.combiTalent.setObject(CombiTalent.getCombiTalent(grade.getGrade(), currentCode));
		this.combiTalent.setVisible(true);
	}
	
	private void setMaxCBoxTalent() {
		for(JCustomComboBox<Talent> talent : this.CBoxTalent) {
			if(talent.isVisible()) {
				talent.setSelectedIndex(talent.getItemCount()-1);
			} else break;
		}
	}
	
	public void updateListSpe() {
		Grade grade = PageGeneral.getInstance().getGrade();
		this.tabSpeciality = Speciality.getData(grade.getGrade());
		
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
		if(remain < 0) {
			System.out.println(remain);
		}
		while(countFull > remain) {
			int itemCount = this.CBoxSpePoint.get(idSpe).getItemCount();
			if(itemCount == 0) break;
			else if(itemCount <= 11) countFull -= speCost;
			else if(itemCount <= 16) countFull -= speCost + 3;
			else if(itemCount <= 21) countFull -= speCost + 7;
			this.CBoxSpePoint.get(idSpe).removeItemAt(itemCount-1);
		}
	}
	
	private void updateSpeElement(int idList) {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
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
	
	public void updateSkill() {
		GradeName grade = PageGeneral.getInstance().getGrade().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		int count = 0;
		boolean isProgressUpdate = false;
		
		if(lvl < 6) this.showAndHide.get(1).setVisible(false);
		else this.showAndHide.get(1).setVisible(true);
		
		for(Skill skill : Skill.getData()[grade.index]) {
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
		
		if(this.skillProgress.get(1).getItemCount() == 0) updateSkill();
		
		if(reinca && this.skillProgress.get(1).getItemCount() > 1) this.skillProgress.get(1).setVisible(true);
		else this.skillProgress.get(1).setVisible(false);
	}
	
	public void updateProSkill() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(lvl < 66) this.showAndHide.get(2).setVisible(false);
		else this.showAndHide.get(2).setVisible(true);
		
		ProSkill[] tabProSkill = ProSkill.getPossibleProSkill(grade.getGrade(), lvl);
		ProSkill memory = (ProSkill) this.CBoxProSkill.getSelectedItem();
		this.CBoxProSkill.setModel(new DefaultComboBoxModel<ProSkill>(tabProSkill));
		if(memory != null) this.CBoxProSkill.setSelectedItem(memory);
		if(this.CBoxProSkill.getSelectedIndex() == -1 && tabProSkill.length > 0) this.CBoxProSkill.setSelectedIndex(0);
	}
	
	public void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
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
		
		GuildBuff[] tabGuildBuff = GuildBuff.getListGuildBuff(guildBuffName);
		this.listGuildBuff.setModel(new DefaultComboBoxModel<GuildBuff>(tabGuildBuff));
	}
	
	private void updateStoneBuff(int idList) {
		Nucleus choice = (Nucleus) this.listStone.getSelectedValue();
		
		int slot = 0;
		while(slot < 3 && this.stoneUsed.get(slot).isVisible()) {
			slot++;
		}
		
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
		
		this.listStone.setModel(new DefaultComboBoxModel<Nucleus>(Nucleus.getData(stoneName)));
	}
	
	public void updateBague() {
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(reinca || lvl >= 20) {
			this.showAndHide.get(4).setVisible(true);
		} else {
			this.showAndHide.get(4).setVisible(false);
			this.CBoxBague.setSelectedIndex(0);
		}
	}
	
	public void updateAnima() {
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		int lvl = PageGeneral.getInstance().getLvl();
		
		Anima[] tabAnima = Anima.getData(lvl);
		int memory = this.CBoxAnima.getSelectedIndex();
		
		this.CBoxAnima.setModel(new DefaultComboBoxModel<Anima>(tabAnima));
		this.CBoxAnima.setSelectedIndex(memory);
		
		if(reinca && lvl >= 10) {
			this.showAndHide.get(5).setVisible(true);
		} else {
			this.showAndHide.get(5).setVisible(false);
			this.CBoxAnima.setSelectedIndex(0);
		}
	}
	
	public void updateEnergy() {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		for(int i = 0; i < this.spinnerEnergy.size(); i++) {
			int memory = (int) this.spinnerEnergy.get(i).getIntValue();
			if(!reinca) {
				if(memory > lvl*2) memory = lvl*2;
				this.spinnerEnergy.get(i).setModel(new SpinnerNumberModel(memory, 0, lvl*2, 1));
			} else {
				this.spinnerEnergy.get(i).setModel(new SpinnerNumberModel(memory, 0, 200, 1));
			}
		}
	}
	
	public void showSpe() {
		int lvl = PageGeneral.getInstance().getLvl();
		
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
	
	public static MainFrame getInstance() {
		return MainFrame.INSTANCE;
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				MainFrame.getInstance();
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
			for(int i = 0; i < this.fr_en.get(0).size()-1; i++) {
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
			
			String buildCredit = "";
			for(int i = 0; i < this.fr_en.get(0).get(this.fr_en.get(0).size()-1).size(); i++) {
				buildCredit += this.fr_en.get(0).get(this.fr_en.get(0).size()-1).get(i) + "\n";
			}
			this.parameter.setText(buildCredit);
		} else {
			this.language.setIcon(this.language.getDisabledIcon());
			for(int i = 0; i < this.fr_en.get(1).size()-1; i++) {
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
			
			String buildCredit = "";
			for(int i = 0; i < this.fr_en.get(1).get(this.fr_en.get(1).size()-1).size(); i++) {
				buildCredit += this.fr_en.get(1).get(this.fr_en.get(1).size()-1).get(i) + "\n";
			}
			this.parameter.setText(buildCredit);
		}
	}
}
