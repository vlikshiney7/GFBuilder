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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.GuildBuff;
import fr.vlik.grandfantasia.Nucleus;
import fr.vlik.grandfantasia.ProSkill;
import fr.vlik.grandfantasia.Skill;
import fr.vlik.grandfantasia.Grade.GradeName;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.grandfantasia.Blason.BlasonType;
import fr.vlik.uidesign.*;

public class MainFrame extends JFrame {
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	private JFrame main;
	private ArrayList<ArrayList<ArrayList<String>>> fr_en = new ArrayList<ArrayList<ArrayList<String>>>(2);
	private ArrayList<ArrayList<JLabel>> allLabel = new ArrayList<ArrayList<JLabel>>();

	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	private ArrayList<JPanel> mainPage = new ArrayList<JPanel>();
	
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
		
		System.out.println("Chargement Page : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		this.mainPage.add(PageGeneral.getInstance());
		System.out.println("Fin General : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		this.mainPage.add(PageWeapon.getInstance());
		System.out.println("Fin Weapon : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		this.mainPage.add(PageArmor.getInstance());
		System.out.println("Fin Armor : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageCapeRing.getInstance());
		System.out.println("Fin CapeRing : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageMount.getInstance());
		System.out.println("Fin Mount : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageCostume.getInstance());
		System.out.println("Fin Costume : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageTalent.getInstance());
		System.out.println("Fin Talent : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageSpeciality.getInstance());
		System.out.println("Fin Speciality : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		/****************************************/
		/*				 PAGE 9					*/
		/****************************************/
		int page = 8;
		
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
		
		for(JLabel label : this.skillNatif) label.setVisible(false);
		for(JCustomComboBox<Skill> skill : this.skillProgress) skill.setVisible(false);
		
		for(JPanel panel : this.showAndHide) panel.setVisible(false);
		
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
		
		build.addEffect(PageCostume.getInstance().getEffects());
		
		build.addEffect(PageTalent.getInstance().getEffects());
		
		build.addEffect(PageSpeciality.getInstance().getEffects());
		build.addConvertEffect(PageSpeciality.getInstance().getConvertEffects());
		
		/*
		for(JPanel page : this.mainPage) {
			if(page instanceof PagePanel) {
				build.addEffect(((PagePanel) page).getEffects());
			}
		}
		*/
		
		
		
		
		
		
		
		for(int i = 0; i < this.skillNatif.size(); i++) {
			if(this.skillNatif.get(i).isVisible()) {
				build.addEffect(this.skillNatif.get(i).getEffects());
			}
		}
		
		for(JCustomComboBox<Skill> skill : this.skillProgress) {
			if(skill.isVisible()) build.addEffect(((Skill) skill.getSelectedItem()).getEffects(0));
		}
		
		if(this.showAndHide.get(1).isVisible()) {
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
			this.showAndHide.get(2).setVisible(false);
			this.CBoxNucleus.get(1).setSelectedIndex(0);
		} else this.showAndHide.get(2).setVisible(true);
	}
	
	public void updateSkill() {
		GradeName grade = PageGeneral.getInstance().getGrade().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		int count = 0;
		boolean isProgressUpdate = false;
		
		if(lvl < 6) this.showAndHide.get(0).setVisible(false);
		else this.showAndHide.get(0).setVisible(true);
		
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
		
		if(lvl < 66) this.showAndHide.get(1).setVisible(false);
		else this.showAndHide.get(1).setVisible(true);
		
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
			this.showAndHide.get(3).setVisible(true);
		} else {
			this.showAndHide.get(3).setVisible(false);
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
			this.showAndHide.get(4).setVisible(true);
		} else {
			this.showAndHide.get(4).setVisible(false);
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
