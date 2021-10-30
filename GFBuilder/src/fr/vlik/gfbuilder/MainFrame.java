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
import java.awt.event.WindowFocusListener;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
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
import fr.vlik.gfbuilder.page.PartialPage;
import fr.vlik.gfbuilder.page.PageRide;
import fr.vlik.gfbuilder.page.PageSkill;
import fr.vlik.gfbuilder.page.PageSpeciality;
import fr.vlik.gfbuilder.page.PageSprite;
import fr.vlik.gfbuilder.page.PageTalent;
import fr.vlik.gfbuilder.page.PageWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTabPane;
import fr.vlik.uidesign.JLangLabel;

public class MainFrame extends JFrame {
	
	private static MainFrame INSTANCE = new MainFrame();
	private static final long serialVersionUID = 1L;
	
	private ArrayList<JCustomTabPane> tabPaneMenu = new ArrayList<JCustomTabPane>();
	private JCustomTabPane language;
	
	private JCustomPanel overlay;
	private JScrollPane scrollContent;
	private ArrayList<JCustomPanel> pages = new ArrayList<JCustomPanel>();
	private ArrayList<JCustomFrame> frames = new ArrayList<JCustomFrame>();
	
	private ArrayList<JCustomLabel<TypeEffect>> labelStat = new ArrayList<JCustomLabel<TypeEffect>>(TypeEffect.values().length);
	private ArrayList<JLabel> valueStat = new ArrayList<JLabel>(TypeEffect.values().length);
	
	private Instant start = Instant.now();
	private boolean unlock = false;
	
	
	public static MainFrame getInstance() {
		return MainFrame.INSTANCE;
	}
	
	private MainFrame() {
		super("Grand Fantasia Builder - Version 0.21.5");
		setCustomUI();
		
		try {
			this.setIconImage(ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			System.out.println("Image introuvable : itemIcon.png");
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
		
		JCustomPanel progressPanel = new JCustomPanel(new GridBagLayout());
		progressPanel.setSize(1325, 750);
		
		JProgressBar progress = new JProgressBar(0, 17);
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
		
		JCustomPanel menu = new JCustomPanel(new GridLayout(14, 1, 0, 0));
		menu.setBackground(Design.UIColor[0]);
		menu.setPreferredSize(new Dimension(200, 0));
		
		for(int i = 0; i < Lang.getDataPane().length; i++) {
			this.tabPaneMenu.add(new JCustomTabPane(Lang.getDataPane()[i]));
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
		
		System.out.println("Fin Frames : " + Duration.between(this.start, Instant.now()).toMillis());
		
		
		/****************************************/
		/*		****	   CONTENT  	****	*/
		/****************************************/
		
		System.out.println("Loading Page : " + Duration.between(this.start, Instant.now()).toMillis());
		
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
		progress.setString("Loading Ride Page");
		this.pages.add(PageRide.getInstance());
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
		
		JCustomPanel allPages = new JCustomPanel(new EmptyBorder(20, 20, 20, 20));
		allPages.setBackground(Design.UIColor[2]);
		
		this.scrollContent = new JScrollPane(allPages, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.scrollContent.setBorder(null);
		this.scrollContent.getVerticalScrollBar().setUnitIncrement(10);
		this.scrollContent.getHorizontalScrollBar().setUnitIncrement(10);
		
		for(int i = 0; i < this.pages.size(); i++) {
			allPages.add(this.pages.get(i));
		}
		
		
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
		
		int sizeStat = 210;
		int[] section = new int[] { 5, 3, 5, 6, 3 };
		int[] widthName = new int[] { 80, 80, 80, 130, 130, 130 };
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
				
				JCustomLabel<TypeEffect> name = new JCustomLabel<TypeEffect>(TypeEffect.values()[ordinal]);
				name.toStatLabel(widthName[i], 10, 0);
				
				this.labelStat.add(name);
				
				JLabel stat = JLangLabel.getStatLabel(sizeStat - widthName[i], 0, 10);
				stat.setText("0");
				stat.setForeground(TypeEffect.values()[ordinal].color);
				stat.setHorizontalAlignment(JLabel.RIGHT);
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
			
			JCustomLabel<TypeEffect> name = new JCustomLabel<TypeEffect>(TypeEffect.values()[ordinal]);
			name.toStatLabel(widthName[5], 10, 0);
			
			this.labelStat.add(name);
			
			JLabel stat = JLangLabel.getStatLabel(sizeStat - widthName[5], 0, 10);
			stat.setText("0");
			stat.setForeground(TypeEffect.values()[ordinal].color);
			stat.setHorizontalAlignment(JLabel.RIGHT);
			this.valueStat.add(stat);
			
			inline.addAll(name, stat);
			
			blocStat.add(inline);
			
			ordinal++;
		}
		
		blocStat.add(JLangLabel.getEmptyLabel(7, sizeStat));
		
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
		
		this.addWindowFocusListener(new WindowFocusListener() {
			
			@Override public void windowLostFocus(WindowEvent e) {}
			@Override public void windowGainedFocus(WindowEvent e) {
				PageGeneral.getInstance().popoff();
			}
		});
		
		
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
	
	public ArrayList<JCustomPanel> getPages() {
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
	
	public void init() {
		PageWeapon.getInstance().initPearlEnchant();
		PageArmor.getInstance().initPearlEnchant();
		PageBuff.getInstance().initNucleusEnchant();
	}
	
	public void updateStat() {
		double coefReinca = PageGeneral.getInstance().getReinca().getCoef();
		WeaponType[] weaponType = PageWeapon.getInstance().getWeaponType();
		
		Build build = new Build(coefReinca, weaponType);
		
		for(JCustomPanel page : this.pages) {
			if(page instanceof PartialPage) {
				build.addEffect(((PartialPage) page).getEffects());
			}
		}
		
		ArrayList<InnerEffect> redEnchant = new ArrayList<InnerEffect>();
		redEnchant.addAll(PageWeapon.getInstance().getRedEnchant());
		redEnchant.addAll(PageArmor.getInstance().getRedEnchant());
		for(InnerEffect effects : RedEnchantment.cumulConstraint(redEnchant)) {
			build.addEffect(effects.getEffects());
		}
		
		ArrayList<InnerEffect> pearlEnchant = new ArrayList<InnerEffect>();
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
		
		for(int i = 0; i < this.tabPaneMenu.size(); i++) {
			this.tabPaneMenu.get(i).updateText(lang);
		}
		
		for(JCustomPanel page : this.pages) {
			if(page instanceof PartialPage) {
				((PartialPage) page).updateLanguage(lang);
			} else if(page instanceof PageOption) {
				((PageOption) page).updateLanguage(lang);
			}
		}
		
		for(JCustomFrame frame : this.frames) {
			frame.updateLanguage(lang);
		}
		
		if(lang == Language.FR) {
			for(int i = 0; i < this.valueStat.size(); i++) {
				this.labelStat.get(i).updateText(lang);
				this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
				this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
			}
		} else {
			for(int i = 0; i < this.valueStat.size(); i++) {
				this.labelStat.get(i).updateText(lang);
				
				if(TypeEffect.values()[i].en.equals("")) {
					this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
					this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].fr);
				} else {
					this.labelStat.get(i).setToolTipText(TypeEffect.values()[i].en);
					this.valueStat.get(i).setToolTipText(TypeEffect.values()[i].en);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MainFrame.getInstance().init();
	}
}
