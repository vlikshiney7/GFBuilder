/* DEBUT DE PROJET : 13 / 01 / 19 */

package fr.vlik.gfbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.gfbuilder.page.*;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.uidesign.*;

public class MainFrame extends JFrame {
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	private JFrame main;
	private ArrayList<ArrayList<ArrayList<String>>> fr_en = new ArrayList<ArrayList<ArrayList<String>>>(2);
	private ArrayList<ArrayList<JLabel>> allLabel = new ArrayList<ArrayList<JLabel>>();
	
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	private ArrayList<JPanel> mainPage = new ArrayList<JPanel>();
	
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private JTextPane parameter = new JTextPane();
	
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

		this.mainPage.add(PageSkill.getInstance());
		System.out.println("Fin Skill : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageSprite.getInstance());
		System.out.println("Fin Sprite : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageBuff.getInstance());
		System.out.println("Fin Buff : " + (Calendar.getInstance().getTimeInMillis() - this.start));

		this.mainPage.add(PageOther.getInstance());
		System.out.println("Fin Other : " + (Calendar.getInstance().getTimeInMillis() - this.start));
		
		
		/****************************************/
		/*				 PAGE 13				*/
		/****************************************/
		int page = 12;
		
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
		
		updateTabPane(0);
		updateStat();
		
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

	public void updateStat() {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		double coefReinca = PageGeneral.getCoefReinca(lvl, reinca);
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		Build build = new Build(coefReinca, weaponType);
		
		for(JPanel page : this.mainPage) {
			if(page instanceof PagePanel) {
				build.addEffect(((PagePanel) page).getEffects());
			}
			
			if(page instanceof AdditionalEffect) {
				build.addAdditionalEffect(((AdditionalEffect) page).getAdditionalEffects());
			}
			
			if(page instanceof ConvertEffect) {
				build.addConvertEffect(((ConvertEffect) page).getConvertEffects());
			}
		}
		
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
