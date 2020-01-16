/* DEBUT DE PROJET : 13 / 01 / 19 */

package fr.vlik.gfbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.frame.FrameSaveAs;
import fr.vlik.gfbuilder.frame.FrameSaveLoader;
import fr.vlik.gfbuilder.frame.FrameSaveOnNew;
import fr.vlik.gfbuilder.frame.FrameSaveOnQuit;
import fr.vlik.gfbuilder.page.AdditionalEffect;
import fr.vlik.gfbuilder.page.ConvertEffect;
import fr.vlik.gfbuilder.page.PageArmor;
import fr.vlik.gfbuilder.page.PageBuff;
import fr.vlik.gfbuilder.page.PageCapeRing;
import fr.vlik.gfbuilder.page.PageCostume;
import fr.vlik.gfbuilder.page.PageGeneral;
import fr.vlik.gfbuilder.page.PageMount;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.gfbuilder.page.PageOther;
import fr.vlik.gfbuilder.page.PagePanel;
import fr.vlik.gfbuilder.page.PageSkill;
import fr.vlik.gfbuilder.page.PageSpeciality;
import fr.vlik.gfbuilder.page.PageSprite;
import fr.vlik.gfbuilder.page.PageTalent;
import fr.vlik.gfbuilder.page.PageWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTabPane;

public class MainFrame extends JFrame {
	
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	
	private String[] tabPanelText;
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	
	private JPanel overlay;
	private static int nbPages = 0;
	private JScrollPane scrollContent;
	private ArrayList<JPanel> pages = new ArrayList<JPanel>();
	
	private ArrayList<JLabel> labelStat = new ArrayList<JLabel>(TypeEffect.values().length);
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private Instant start = Instant.now();
	private boolean unlock = false;
	
	
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
		
		this.setSize(1325, 750);
		this.setMinimumSize(new Dimension(780, 470));
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				if(unlock) {
					if(!Overlay.getInstance().isSave()) {
						FrameSaveOnQuit.getInstance().popup();
						return;
					}
				}
				System.exit(0);
			}
		});
		this.setLocationRelativeTo(null);
		
		JPanel progressPanel = new JPanel();
		progressPanel.setLayout(new GridBagLayout());
		progressPanel.setBackground(Design.UIColor[1]);
		progressPanel.setSize(1325, 750);
		
		JProgressBar progress = new JProgressBar(0, 16);
		progress.setFont(new Font("Open Sans", Font.BOLD, 16));
		progress.setPreferredSize(new Dimension(600, 50));
		progress.setStringPainted(true);
		progress.setValue(0);
		progress.setString("Loading texts & pane menu");
		
		progressPanel.add(progress);
		this.add(progressPanel);
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
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Genenal Page");
		this.pages.add(PageGeneral.getInstance());
		System.out.println("Fin General : " + Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Weapon Page");
		this.pages.add(PageWeapon.getInstance());
		System.out.println("Fin Weapon : " + Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Armor Page");
		this.pages.add(PageArmor.getInstance());
		System.out.println("Fin Armor : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Cape&Ring Page");
		this.pages.add(PageCapeRing.getInstance());
		System.out.println("Fin CapeRing : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Mount Page");
		this.pages.add(PageMount.getInstance());
		System.out.println("Fin Mount : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Costume Page");
		this.pages.add(PageCostume.getInstance());
		System.out.println("Fin Costume : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Talent Page");
		this.pages.add(PageTalent.getInstance());
		System.out.println("Fin Talent : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Speciality Page");
		this.pages.add(PageSpeciality.getInstance());
		System.out.println("Fin Speciality : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Skill Page");
		this.pages.add(PageSkill.getInstance());
		System.out.println("Fin Skill : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Sprite Page");
		this.pages.add(PageSprite.getInstance());
		System.out.println("Fin Sprite : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Buff Page");
		this.pages.add(PageBuff.getInstance());
		System.out.println("Fin Buff : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Other Page");
		this.pages.add(PageOther.getInstance());
		System.out.println("Fin Other : " + Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Option Page");
		this.pages.add(PageOption.getInstance());
		System.out.println("Fin Option : " + Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Pages Display");
		
		JPanel allPages = new JPanel();
		allPages.setBorder(new EmptyBorder(20, 20, 20, 20));
		allPages.setBackground(Design.UIColor[2]);
		
		this.scrollContent = new JScrollPane(allPages, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.scrollContent.setBorder(null);
		this.scrollContent.getVerticalScrollBar().setUnitIncrement(10);
		this.scrollContent.getHorizontalScrollBar().setUnitIncrement(10);
		
		for(int i = 0; i < this.pages.size(); i++) {
			allPages.add(this.pages.get(i));
		}
		
		
		this.overlay = Overlay.getInstance();
		
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		content.setBackground(Design.UIColor[2]);
		content.add(this.overlay);
		content.add(this.scrollContent);
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Stats Display");
		
		/****************************************/
		/*		****	   STATS	  	****	*/
		/****************************************/
		
		JPanel stats = new JPanel();
		stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));
		stats.setBackground(Design.UIColor[1]);
		
		int sizeStat = 210;
		int[] section = new int[] { 5, 3, 5, 6, 3 };
		int[] widthName = new int[] { 90, 90, 90, 130, 130, 130 };
		int ordinal = 0;
		
		for(int i = 0; i < section.length; i++) {
			JPanel blocStat = new JPanel();
			blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
			blocStat.setBorder(new EmptyBorder(10, 10, 0, 27));
			blocStat.setBackground(Design.UIColor[1]);
			blocStat.setSize(new Dimension(sizeStat, 25));
			
			blocStat.add(JCustomLabel.getEmptyLabel(7, sizeStat));
			
			for(int j = 0; j < section[i]; j++) {
				JPanel inline = new JPanel();
				inline.setLayout(new BoxLayout(inline, BoxLayout.X_AXIS));
				inline.setSize(new Dimension(sizeStat, 25));
				inline.setBorder(new EmptyBorder(0, 0, 0, 0));
				inline.setOpaque(false);
				inline.setAlignmentX(LEFT_ALIGNMENT);
				
				JLabel name = JCustomLabel.getStatLabel(widthName[i], 10, 0);
				name.setText(TypeEffect.values()[ordinal].abbrevFR);
				name.setForeground(TypeEffect.values()[ordinal].color);
				this.labelStat.add(name);
				
				JLabel stat = JCustomLabel.getStatLabel(sizeStat - widthName[i], 0, 10);
				stat.setText("0");
				stat.setForeground(TypeEffect.values()[ordinal].color);
				stat.setHorizontalAlignment(JLabel.RIGHT);
				this.valueStat.add(stat);
				
				inline.add(name);
				inline.add(stat);
				
				blocStat.add(inline);
				
				ordinal++;
			}
			
			blocStat.add(JCustomLabel.getEmptyLabel(7, sizeStat));
			
			stats.add(blocStat);
		}
		
		JPanel blocStat = new JPanel();
		blocStat.setLayout(new BoxLayout(blocStat, BoxLayout.Y_AXIS));
		blocStat.setBorder(new EmptyBorder(10, 10, 10, 10));
		blocStat.setBackground(Design.UIColor[1]);
		blocStat.setSize(new Dimension(sizeStat, 25));
		
		blocStat.add(JCustomLabel.getEmptyLabel(7, sizeStat));
		
		while(ordinal < TypeEffect.values().length) {
			JPanel inline = new JPanel();
			inline.setLayout(new BoxLayout(inline, BoxLayout.X_AXIS));
			inline.setSize(new Dimension(sizeStat, 25));
			inline.setBorder(new EmptyBorder(0, 0, 0, 0));
			inline.setOpaque(false);
			inline.setAlignmentX(LEFT_ALIGNMENT);
			
			JLabel name = JCustomLabel.getStatLabel(widthName[5], 10, 0);
			name.setText(TypeEffect.values()[ordinal].abbrevFR);
			name.setForeground(TypeEffect.values()[ordinal].color);
			this.labelStat.add(name);
			
			JLabel stat = JCustomLabel.getStatLabel(sizeStat - widthName[5], 0, 10);
			stat.setText("0");
			stat.setForeground(TypeEffect.values()[ordinal].color);
			stat.setHorizontalAlignment(JLabel.RIGHT);
			this.valueStat.add(stat);
			
			inline.add(name);
			inline.add(stat);
			
			blocStat.add(inline);
			
			ordinal++;
		}
		
		blocStat.add(JCustomLabel.getEmptyLabel(7, sizeStat));
		
		stats.add(blocStat);
		
		JScrollPane scrollStats = new JScrollPane(stats, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollStats.setBorder(null);
		scrollStats.getVerticalScrollBar().setUnitIncrement(10);
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading finished");
		
		this.getContentPane().removeAll();
		this.setLayout(new BorderLayout());
		this.add(menu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.add(scrollStats, BorderLayout.EAST);
		
		updateTabPane(0);
		updateLanguage();
		updateStat();
		
		
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK), "newFile");
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK), "save");
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.SHIFT_MASK | KeyEvent.CTRL_MASK), "saveAs");
		
		this.getRootPane().getActionMap().put("newFile", new AbstractAction() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!SaveConfig.fileExist()) {
					return;
				}
				
				if(!Overlay.getInstance().isSave()) {
					FrameSaveOnNew.getInstance().popup();
				} else {
					Overlay.getInstance().setNameSave(SaveConfig.DEFAULT_NAME);
					Overlay.getInstance().setSave(false);
				}
			}
		});
		
		this.getRootPane().getActionMap().put("save", new AbstractAction() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!SaveConfig.fileExist()) {
					FrameSaveAs.getInstance().popup();
					return;
				}
				
				PageOption.getInstance().overrideSave();
				
				Overlay.getInstance().setSave(true);
			}
		});
		
		this.getRootPane().getActionMap().put("saveAs", new AbstractAction() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				FrameSaveAs.getInstance().popup();
			}
		});
		
		this.unlock = true;
		
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
		
		UIManager.put("ProgressBar.foreground", Design.GREEN_COLOR[1]);
		UIManager.put("ProgressBar.selectionBackground", Design.GREEN_COLOR[1]);
		UIManager.put("ProgressBar.selectionForeground", Design.FontColor[0]);
		
		ToolTipManager.sharedInstance().setInitialDelay(500);
	    ToolTipManager.sharedInstance().setDismissDelay(30000);
	}
	
	public void updateStat() {
		double coefReinca = PageGeneral.getInstance().getReinca().getCoef();
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		if(PageWeapon.getInstance().isDoubleWeapon() != Util.allowedDoubleWeapon()) {
			PageWeapon.getInstance().applyDoubleWeapon(!PageWeapon.getInstance().isDoubleWeapon());
		}
		
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
		for(int i = 0; i < this.valueStat.size(); i++) {
			if(TypeEffect.values()[i].max != -1 && allStats[i] > TypeEffect.values()[i].max) {
				if(TypeEffect.values()[i].entier) {
					this.valueStat.get(i).setText((int) allStats[i] + " (" + TypeEffect.values()[i].max + ")");
				} else {
					this.valueStat.get(i).setText(allStats[i] + " (" + TypeEffect.values()[i].max + ")");
				}
			} else {
				if(TypeEffect.values()[i].entier) {
					this.valueStat.get(i).setText("" + (int) allStats[i]);
				} else {
					this.valueStat.get(i).setText("" + allStats[i]);
				}
			}
			
			if(allStats[i] == 0 && i > 21) {
				this.labelStat.get(i).setVisible(false);
				this.valueStat.get(i).setVisible(false);
			} else {
				this.labelStat.get(i).setVisible(true);
				this.valueStat.get(i).setVisible(true);
			}
		}
		
		Overlay.getInstance().setSave(false);
	}
	
	public static int getNumPage() {
		return nbPages++;
	}
	
	public void setRedPane(int page) {
		this.tabPaneMenu.get(page).setBackground(Design.UIColor[4]);
	}
	
	public static void main(String[] args) {
		PageOption.getInstance().setSave(Overlay.getInstance().getCurrentName());
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
				this.tabPaneMenu.get(i).setBackground(Design.UIColor[0]);
				this.tabPaneMenu.get(i).setSelected(true);
			}
		}
	}
	
	public Language getLanguage() {
		return this.language.isSelected() ? Language.FR : Language.EN;
	}
	
	public void updateLanguage() {
		Language lang = getLanguage();
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
		
		FrameSaveLoader.getInstance().updateLanguage(lang);
		FrameSaveAs.getInstance().updateLanguage(lang);
		FrameSaveOnNew.getInstance().updateLanguage(lang);
		FrameSaveOnQuit.getInstance().updateLanguage(lang);
		
		if(lang == Language.FR) {
			for(int i = 0; i < this.valueStat.size(); i++) {
				this.labelStat.get(i).setText(TypeEffect.values()[i].abbrevFR);
				this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
				this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
			}
		} else {
			for(int i = 0; i < this.valueStat.size(); i++) {
				this.labelStat.get(i).setText(TypeEffect.values()[i].abbrevEN);
				this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].en);
				this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].en);
			}
		}
	}
}
