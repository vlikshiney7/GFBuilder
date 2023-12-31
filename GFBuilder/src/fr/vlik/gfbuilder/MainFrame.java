/* DEBUT DE PROJET : 13 / 01 / 19 */

package fr.vlik.gfbuilder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.frame.FrameCreateCustom;
import fr.vlik.gfbuilder.frame.FrameError;
import fr.vlik.gfbuilder.frame.FrameSaveAs;
import fr.vlik.gfbuilder.frame.FrameSaveLoader;
import fr.vlik.gfbuilder.frame.FrameSaveOnNew;
import fr.vlik.gfbuilder.frame.FrameSaveOnQuit;
import fr.vlik.gfbuilder.frame.JCustomFrame;
import fr.vlik.gfbuilder.page.PageArmor;
import fr.vlik.gfbuilder.page.PageBuff;
import fr.vlik.gfbuilder.page.PageCapeRing;
import fr.vlik.gfbuilder.page.PageCostume;
import fr.vlik.gfbuilder.page.PageGeneral;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.gfbuilder.page.PageOther;
import fr.vlik.gfbuilder.page.PageRide;
import fr.vlik.gfbuilder.page.PageSkill;
import fr.vlik.gfbuilder.page.PageSpeciality;
import fr.vlik.gfbuilder.page.PageSprite;
import fr.vlik.gfbuilder.page.PageTalent;
import fr.vlik.gfbuilder.page.PageWeapon;
import fr.vlik.gfbuilder.page.PartialPage;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipupgrade.RedEnchantment;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTabPane;
import fr.vlik.uidesign.JLangLabel;
import fr.vlik.uidesign.JUpdateLang;

public class MainFrame extends JFrame {
	
	private static final MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	
	private List<JCustomTabPane> tabPaneMenu = new ArrayList<>();
	private JCustomTabPane language;
	
	private JCustomPanel overlay;
	private JScrollPane scrollContent;
	private List<JCustomPanel> pages = new ArrayList<>();
	private List<JCustomFrame> frames = new ArrayList<>();
	
	private List<JCustomLabel<TypeEffect>> labelStat = new ArrayList<>(TypeEffect.values().length);
	private List<JLabel> valueStat = new ArrayList<>(TypeEffect.values().length);
	
	private Instant start = Instant.now();
	private boolean unlock;
	private boolean allowUpdateStat;
	
	private transient Logger logger;
	
	public static MainFrame getInstance() {
		return MainFrame.INSTANCE;
	}
	
	private MainFrame() {
		super("Grand Fantasia Builder - Version 1.5.0");
		setCustomUI();
		
		try {
			this.setIconImage(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			this.logger.log(Level.WARNING, "Image introuvable : itemIcon.png");
		}
		
		this.setSize(1325, 750);
		this.setMinimumSize(new Dimension(780, 470));
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				if(unlock && !Overlay.getInstance().isSave()) {
					FrameSaveOnQuit.getInstance().popup();
					return;
				}
				System.exit(0);
			}
		});
		this.setLocationRelativeTo(null);
		
		JCustomPanel progressPanel = new JCustomPanel(new GridBagLayout());
		progressPanel.setSize(1325, 750);
		
		JProgressBar progress = new JProgressBar(0, 17);
		progress.setFont(Design.TITLE);
		progress.setPreferredSize(new Dimension(600, 50));
		progress.setStringPainted(true);
		progress.setValue(0);
		progress.setString("Loading texts & pane menu");
		
		progressPanel.add(progress);
		this.add(progressPanel);
		this.setVisible(true);
		
		this.logger.log(Level.INFO, "Début swing\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		/****************************************/
		/*		****	   MENU		  	****	*/
		/****************************************/
		
		JCustomPanel menu = new JCustomPanel(new GridLayout(14, 1, 0, 0));
		menu.setBackground(Design.UIColor[0]);
		menu.setPreferredSize(new Dimension(200, 0));
		
		for(int i = 0; i < Lang.getDataPane().length; i++) {
			int id = i;
			this.tabPaneMenu.add(new JCustomTabPane(Lang.getDataPane()[i]));
			this.tabPaneMenu.get(i).addActionListener(e -> updateTabPane(id) );
			
			menu.add(this.tabPaneMenu.get(i));
		}
		
		this.language = new JCustomTabPane("fr", "en");
		this.language.setSelected(true);
		this.language.addActionListener(e -> updateLanguage() );
		
		menu.add(this.language);
		
		
		/****************************************/
		/*		****	   FRAME	  	****	*/
		/****************************************/
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Frames");
		
		this.frames.add(FrameCreateCustom.getInstance());
		this.frames.add(FrameError.getInstance());
		this.frames.add(FrameSaveAs.getInstance());
		this.frames.add(FrameSaveLoader.getInstance());
		this.frames.add(FrameSaveOnNew.getInstance());
		this.frames.add(FrameSaveOnQuit.getInstance());
		
		this.logger.log(Level.INFO, "Fin Frames\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		/****************************************/
		/*		****	   CONTENT  	****	*/
		/****************************************/
		
		this.logger.log(Level.INFO, "Loading Page\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Genenal Page");
		this.pages.add(PageGeneral.getInstance());
		this.logger.log(Level.INFO, "Fin General\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Weapon Page");
		this.pages.add(PageWeapon.getInstance());
		this.logger.log(Level.INFO, "Fin Weapon\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Armor Page");
		this.pages.add(PageArmor.getInstance());
		this.logger.log(Level.INFO, "Fin Armor\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Cape&Ring Page");
		this.pages.add(PageCapeRing.getInstance());
		this.logger.log(Level.INFO, "Fin CapeRing\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Ride Page");
		this.pages.add(PageRide.getInstance());
		this.logger.log(Level.INFO, "Fin Mount\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Costume Page");
		this.pages.add(PageCostume.getInstance());
		this.logger.log(Level.INFO, "Fin Costume\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Talent Page");
		this.pages.add(PageTalent.getInstance());
		this.logger.log(Level.INFO, "Fin Talent\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Speciality Page");
		this.pages.add(PageSpeciality.getInstance());
		this.logger.log(Level.INFO, "Fin Speciality\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Skill Page");
		this.pages.add(PageSkill.getInstance());
		this.logger.log(Level.INFO, "Fin Skill\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Sprite Page");
		this.pages.add(PageSprite.getInstance());
		this.logger.log(Level.INFO, "Fin Sprite\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Buff Page");
		this.pages.add(PageBuff.getInstance());
		this.logger.log(Level.INFO, "Fin Buff\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Other Page");
		this.pages.add(PageOther.getInstance());
		this.logger.log(Level.INFO, "Fin Other\t: {0}", Duration.between(this.start, Instant.now()).toMillis());

		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Option Page");
		this.pages.add(PageOption.getInstance());
		this.logger.log(Level.INFO, "Fin Option\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Pages Display");
		
		JCustomPanel allPages = new JCustomPanel(new EmptyBorder(20, 20, 20, 20));
		allPages.setBackground(Design.UIColor[2]);
		
		this.scrollContent = new JScrollPane(allPages, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.scrollContent.setBorder(null);
		this.scrollContent.getVerticalScrollBar().setUnitIncrement(15);
		this.scrollContent.getHorizontalScrollBar().setUnitIncrement(15);
		
		allPages.addAll(this.pages);
		
		
		this.overlay = Overlay.getInstance();
		
		JCustomPanel content = new JCustomPanel(BoxLayout.Y_AXIS);
		content.setBackground(Design.UIColor[2]);
		content.add(this.overlay);
		content.add(this.scrollContent);
		
		
		/****************************************/
		/*		****	   STATS	  	****	*/
		/****************************************/
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading Stats Display");
		
		JCustomPanel stats = new JCustomPanel(BoxLayout.Y_AXIS);
		
		int sizeStat = 240;
		int[] section = new int[] { 5, 3, 5, 6, 3 };
		int[] widthName = new int[] { 80, 80, 80, 130, 130, 140 };
		int ordinal = 0;
		
		for(int i = 0; i < section.length; i++) {
			JCustomPanel blocStat = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 0, 27));
			blocStat.setSize(new Dimension(sizeStat, 25));
			blocStat.add(JLangLabel.getEmptyLabel(7, sizeStat));
			
			for(int j = 0; j < section[i]; j++) {
				JCustomPanel inline = new JCustomPanel(BoxLayout.X_AXIS, new EmptyBorder(0, 0, 0, 0));
				inline.setSize(new Dimension(sizeStat, 25));
				inline.setOpaque(false);
				inline.setAlignmentX(LEFT_ALIGNMENT);
				
				JCustomLabel<TypeEffect> name = new JCustomLabel<>(TypeEffect.values()[ordinal]);
				name.toStatLabel(widthName[i], 10, 0);
				
				this.labelStat.add(name);
				
				JLabel stat = JLangLabel.getStatLabel(sizeStat - widthName[i], 0, 10);
				stat.setText("0");
				stat.setForeground(TypeEffect.values()[ordinal].color);
				stat.setHorizontalAlignment(SwingConstants.RIGHT);
				this.valueStat.add(stat);
				
				inline.addAll(name, stat);
				
				blocStat.add(inline);
				
				ordinal++;
			}
			
			blocStat.add(JLangLabel.getEmptyLabel(7, sizeStat));
			
			stats.add(blocStat);
		}
		
		JCustomPanel blocStat = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		blocStat.setSize(new Dimension(sizeStat, 25));
		blocStat.add(JLangLabel.getEmptyLabel(7, sizeStat));
		
		while(ordinal < TypeEffect.values().length) {
			JCustomPanel inline = new JCustomPanel(BoxLayout.X_AXIS, new EmptyBorder(0, 0, 0, 0));
			inline.setSize(new Dimension(sizeStat, 25));
			inline.setOpaque(false);
			inline.setAlignmentX(LEFT_ALIGNMENT);
			
			JCustomLabel<TypeEffect> name = new JCustomLabel<>(TypeEffect.values()[ordinal]);
			name.toStatLabel(widthName[5], 10, 0);
			
			this.labelStat.add(name);
			
			JLabel stat = JLangLabel.getStatLabel(sizeStat - widthName[5], 0, 10);
			stat.setText("0");
			stat.setForeground(TypeEffect.values()[ordinal].color);
			stat.setHorizontalAlignment(SwingConstants.RIGHT);
			this.valueStat.add(stat);
			
			inline.addAll(name, stat);
			
			blocStat.add(inline);
			
			ordinal++;
		}
		
		blocStat.add(JLangLabel.getEmptyLabel(7, sizeStat));
		
		stats.add(blocStat);
		
		JScrollPane scrollStats = new JScrollPane(stats, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollStats.setBorder(null);
		scrollStats.getVerticalScrollBar().setUnitIncrement(15);
		
		progress.setValue(progress.getValue()+1);
		progress.setString("Loading finished");
		
		this.getContentPane().removeAll();
		this.setLayout(new BorderLayout());
		this.add(menu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.add(scrollStats, BorderLayout.EAST);
		
		updateTabPane(0);
		updateLanguage();
		allowUpdateStat(true);
		
		this.addWindowFocusListener(new WindowFocusListener() {
			@Override public void windowLostFocus(WindowEvent arg0) {}
			@Override public void windowGainedFocus(WindowEvent e) {
				PageGeneral.getInstance().popoff();
				PageWeapon.getInstance().popoff();
				PageArmor.getInstance().popoff();
			}
		});
		
		
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "newFile");
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "save");
		this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_DOWN_MASK | InputEvent.CTRL_DOWN_MASK), "saveAs");
		
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
		
		this.logger.log(Level.INFO, "Fin swing\t: {0}", Duration.between(this.start, Instant.now()).toMillis());
	}
	
	public List<JCustomPanel> getPages() {
		return this.pages;
	}
	
	public JScrollPane getScrollContent() {
		return this.scrollContent;
	}
	
	private void setCustomUI() {
		System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%3$s]\t[%4$-7s]\t%5$s %n");
		this.logger = Logger.getLogger(MainFrame.class.getSimpleName());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			this.logger.log(Level.WARNING, "Look and feel code failed");
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
	
	public void init() {
		PageWeapon.getInstance().initPearlEnchant();
		PageArmor.getInstance().initPearlEnchant();
		PageBuff.getInstance().initNucleusEnchant();
	}
	
	public void allowUpdateStat(boolean locker) {
		this.allowUpdateStat = locker;
		
		if(this.allowUpdateStat) {
			updateStat();
		}
	}
	
	public void updateStat() {
		if(!this.allowUpdateStat) {
			return;
		}
		
		double coefReinca = PageGeneral.getInstance().getReinca().getCoef();
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		Build build = new Build(coefReinca, weaponType);
		
		for(JCustomPanel page : this.pages) {
			if(page instanceof PartialPage p) {
				build.addEffect(p.getEffects());
			}
		}
		
		List<InnerEffect> redEnchant = new ArrayList<>();
		redEnchant.addAll(PageWeapon.getInstance().getRedEnchant());
		redEnchant.addAll(PageArmor.getInstance().getRedEnchant());
		for(InnerEffect effects : RedEnchantment.cumulConstraint(redEnchant)) {
			build.addEffect(effects.getEffects());
		}
		
		List<InnerEffect> pearlEnchant = new ArrayList<>();
		pearlEnchant.addAll(PageWeapon.getInstance().getPearlEnchant());
		pearlEnchant.addAll(PageArmor.getInstance().getPearlEnchant());
		for(InnerEffect effects : RedEnchantment.cumulConstraint(pearlEnchant)) {
			build.addEffect(effects.getEffects());
		}
		
		if(PageWeapon.getInstance().isDoubleWeapon() != build.isDoubleWeapon()) {
			PageWeapon.getInstance().applyDoubleWeapon(!PageWeapon.getInstance().isDoubleWeapon());
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
					NumberFormat format = NumberFormat.getInstance();
					format.setMaximumFractionDigits(2);
					
					this.valueStat.get(i).setText(format.format(allStats[i]).replace(",", "."));
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
	
	public void resetStatusPane() {
		this.tabPaneMenu.forEach(e -> e.setBackground(Design.UIColor[0]));
	}
	
	public void setRedPane(int page) {
		this.tabPaneMenu.get(page).setBackground(Design.UIColor[4]);
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
		
		this.tabPaneMenu.forEach(e -> e.updateLanguage(lang));
		
		this.pages.forEach(e -> ((JUpdateLang) e).updateLanguage(lang));
		this.frames.forEach(e -> e.updateLanguage(lang));
		
		for(int i = 0; i < this.valueStat.size(); i++) {
			this.labelStat.get(i).updateLanguage(lang);
			this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].getFullInfo(lang));
			this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].getFullInfo(lang));
		}
	}
	
	public static void main(String[] args) {
		MainFrame.getInstance().init();
	}
}
