/* DEBUT DE PROJET : 13 / 01 / 19 */

package fr.vlik.gfbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.page.*;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipment.Weapon.WeaponType;
import fr.vlik.uidesign.*;

public class MainFrame extends JFrame {
	
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	
	private String[] tabPanelText;
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	
	private ArrayList<JPanel> pages = new ArrayList<JPanel>();
	
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private Instant start = Instant.now();
	
	
	public static MainFrame getInstance() {
		return MainFrame.INSTANCE;
	}
	
	private MainFrame() {
		super("Grand Fantasia Builder");
		setCustomUI();
		
		try {
			this.setIconImage(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(1300, 750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		System.out.println("Début swing : " + Duration.between(this.start, Instant.now()).toMillis());
		
		
		/****************************************/
		/*		****	   MENU		  	****	*/
		/****************************************/
		
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(200, 0));
		menu.setBackground(Design.UIColor[0]);
		menu.setLayout(new GridLayout(14, 1, 0, 0));
		
		
		this.tabPanelText = Lang.getDataPane(Language.FR);
		
		for(int i = 0; i < this.tabPanelText.length; i++) {
			this.tabPaneMenu.add(new JCustomTabPane(this.tabPanelText[i]));
			int id = i;
			this.tabPaneMenu.get(i).addActionListener(e -> {
				updateTabPane(id);
			});
			
			menu.add(this.tabPaneMenu.get(i));
		}
		
		this.language = new JCustomTabPane("fr", "en");
		this.language.setSelected(true);
		this.language.addActionListener(e -> {
			updateLanguage();
		});
		
		menu.add(this.language);
		
		/****************************************/
		/*		****	   CONTENT  	****	*/
		/****************************************/
		
		System.out.println("Chargement Page : " + Duration.between(this.start, Instant.now()).toMillis());
		
		this.pages.add(PageGeneral.getInstance());
		System.out.println("Fin General : " + Duration.between(this.start, Instant.now()).toMillis());
		
		this.pages.add(PageWeapon.getInstance());
		System.out.println("Fin Weapon : " + Duration.between(this.start, Instant.now()).toMillis());
		
		this.pages.add(PageArmor.getInstance());
		System.out.println("Fin Armor : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageCapeRing.getInstance());
		System.out.println("Fin CapeRing : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageMount.getInstance());
		System.out.println("Fin Mount : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageCostume.getInstance());
		System.out.println("Fin Costume : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageTalent.getInstance());
		System.out.println("Fin Talent : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageSpeciality.getInstance());
		System.out.println("Fin Speciality : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageSkill.getInstance());
		System.out.println("Fin Skill : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageSprite.getInstance());
		System.out.println("Fin Sprite : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageBuff.getInstance());
		System.out.println("Fin Buff : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageOther.getInstance());
		System.out.println("Fin Other : " + Duration.between(this.start, Instant.now()).toMillis());

		this.pages.add(PageOption.getInstance());
		System.out.println("Fin Option : " + Duration.between(this.start, Instant.now()).toMillis());
		
		
		JPanel content = new JPanel();
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
		content.setBackground(Design.UIColor[2]);
		
		JScrollPane scrollContent = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollContent.setBorder(null);
		scrollContent.getVerticalScrollBar().setUnitIncrement(10);
		scrollContent.getHorizontalScrollBar().setUnitIncrement(10);
		
		for(int i = 0; i < this.pages.size(); i++) {
			content.add(this.pages.get(i));
		}
		
		/****************************************/
		/*		****	   STATS	  	****	*/
		/****************************************/
		
		JPanel stats = new JPanel();
		stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));
		stats.setBackground(Design.UIColor[1]);
		
		int[] section = new int[] { 5, 3, 5, 6, 3 };
		int ordinal = 0;
		
		for(int i = 0; i < section.length; i++) {
			JPanel blocStat = new JPanel();
			blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
			blocStat.setBorder(new EmptyBorder(5, 5, 5, 5));
			blocStat.setBackground(Design.UIColor[0]);
			
			for(int j = 0; j < section[i]; j++) {
				this.valueStat.add(new JLabel(TypeEffect.values()[ordinal].name() + " : 0"));
				this.valueStat.get(ordinal).setForeground(TypeEffect.values()[ordinal].color);
				this.valueStat.get(ordinal).setFont(new Font("Open Sans", Font.PLAIN, 16));
				this.valueStat.get(ordinal).setPreferredSize(new Dimension(180, 20));
				
				blocStat.add(this.valueStat.get(ordinal));
				
				ordinal++;
			}
			
			stats.add(blocStat);
		}
		
		JPanel blocStat = new JPanel();
		blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
		blocStat.setBorder(new EmptyBorder(5, 5, 5, 5));
		blocStat.setBackground(Design.UIColor[0]);
		
		while(ordinal < TypeEffect.values().length) {
			this.valueStat.add(new JLabel(TypeEffect.values()[ordinal].name() + " : 0"));
			this.valueStat.get(ordinal).setFont(new Font("Open Sans", Font.PLAIN, 16));
			this.valueStat.get(ordinal).setForeground(Design.FontColor[0]);
			
			blocStat.add(this.valueStat.get(ordinal));
			
			ordinal++;
		}
		
		stats.add(blocStat);
		
		JScrollPane scrollStats = new JScrollPane(stats, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollStats.setBorder(null);
		scrollStats.getVerticalScrollBar().setUnitIncrement(10);
		
		this.add(menu, BorderLayout.WEST);
		this.add(scrollContent, BorderLayout.CENTER);
		this.add(scrollStats, BorderLayout.EAST);
		
		
		updateTabPane(0);
		updateStat();
		
		System.out.println("Fin swing : " + Duration.between(this.start, Instant.now()).toMillis());
	}
	
	public ArrayList<JPanel> getPages() {
		return this.pages;
	}

	private void setCustomUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println("WARNING: Look and feel code failed");
		}
		
		UIManager.put("ToolTip.border", new LineBorder(Design.UIColor[1], 2));
		UIManager.put("ToolTip.background", Design.UIColor[0]);
		UIManager.put("ToolTip.foreground", Design.UIColor[3]);
		
		ToolTipManager.sharedInstance().setInitialDelay(500);
	    ToolTipManager.sharedInstance().setDismissDelay(30000);
	}

	public void updateStat() {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		double coefReinca = PageGeneral.getCoefReinca(lvl, reinca);
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		Build build = new Build(coefReinca, weaponType);
		
		for(JPanel page : this.pages) {
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
	
	private void updateLabel(double[] allStats) {
		Language lang = this.language.isSelected() ? Language.FR : Language.EN;
		
		for(int i = 0; i < this.valueStat.size(); i++) {
			String langLabel;
			if(lang == Language.FR) {
				langLabel = TypeEffect.values()[i].abbrevFR;
				this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
			} else {
				langLabel = TypeEffect.values()[i].abbrevEN;
				this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].en);
			}
			
			if(TypeEffect.values()[i].max != -1 && allStats[i] > TypeEffect.values()[i].max) {
				if(TypeEffect.values()[i].entier) {
					this.valueStat.get(i).setText(langLabel + " : " + (int) allStats[i] + " (" + TypeEffect.values()[i].max + ")");
				} else {
					this.valueStat.get(i).setText(langLabel + " : " + allStats[i] + " (" + TypeEffect.values()[i].max + ")");
				}
			} else {
				if(TypeEffect.values()[i].entier) {
					this.valueStat.get(i).setText(langLabel + " : " + (int) allStats[i]);
				} else {
					this.valueStat.get(i).setText(langLabel + " : " + allStats[i]);
				}
			}
			
			if(allStats[i] == 0 && i > 21) {
				this.valueStat.get(i).setVisible(false);
			} else {
				this.valueStat.get(i).setVisible(true);
			}
		}
	}
	
	public static void main(String[] args) {
		SaveConfig.setSave("qsdfghjkl");
	}
	
	public void updateTabPane(int index) {
		for(int i = 0; i < this.tabPaneMenu.size(); i++) {
			if(i != index) {
				this.pages.get(i).setVisible(false);
				this.tabPaneMenu.get(i).setFont(new Font("Open Sans", Font.PLAIN, 24));
				this.tabPaneMenu.get(i).setSelected(false);
			} else {
				this.pages.get(i).setVisible(true);
				this.tabPaneMenu.get(i).setFont(new Font("Open Sans", Font.BOLD, 24));
				this.tabPaneMenu.get(i).setSelected(true);
			}
		}
	}
	
	public void updateLanguage() {
		Language lang = this.language.isSelected() ? Language.FR : Language.EN;
		CustomListCellRenderer.setLang(lang);
		
		if(this.language.isSelected()) {
			this.language.setIcon(this.language.getSelectedIcon());
		} else {
			this.language.setIcon(this.language.getDisabledIcon());
		}
		
		this.tabPanelText = Lang.getDataPane(lang);
		for(int i = 0; i < this.tabPanelText.length; i++) {
			this.tabPaneMenu.get(i).setText(tabPanelText[i]);
		}
		
		for(JPanel page : this.pages) {
			if(page instanceof PagePanel) {
				((PagePanel) page).updateLanguage(lang);
			} else if(page instanceof PageOption) {
				((PageOption) page).updateLanguage(lang);
			}
		}
		
		updateStat();
	}
}
