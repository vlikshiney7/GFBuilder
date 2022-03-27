package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characupgrade.Energy;
import fr.vlik.grandfantasia.characupgrade.Nucleus;
import fr.vlik.grandfantasia.characupgrade.NucleusEnchantment;
import fr.vlik.grandfantasia.characupgrade.Stone;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.gamebuff.GuildBuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JCustomSpinner;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageBuff extends PartialPage {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "BUFF";
	private static final PageBuff INSTANCE = new PageBuff();
	
	private transient JCustomComboBoxList<Nucleus> nucleus;
	private ArrayList<JCustomLabel<Energy>> labelEnergy = new ArrayList<>(21);
	private ArrayList<JCustomRadioButton<Energy>> labelVoidEnergy = new ArrayList<>(3);
	private ArrayList<JCustomSpinner> energy = new ArrayList<>(21);
	
	private ArrayList<JCustomLabel<GuildBuff>> guildBuffUsed = new ArrayList<>(4);
	private JCustomComboBox<GuildBuff> guildBuff;
	private ArrayList<JCustomLabel<Stone>> stoneUsed = new ArrayList<>(14);
	private JCustomComboBox<Stone> stone;
	
	private ArrayList<JIconCheckBox> starNucleus = new ArrayList<>(4);
	private transient JCustomComboBoxList<NucleusEnchantment> nucleusEnchant;
	private transient JCustomComboBoxList<InnerEffect> nucleusLvlEnchant;
	
	private JCustomPanel showAndHide;
	private JCustomPanel showAndHideEnchant;
	private ArrayList<JCustomPanel> showAndHideEnergy = new ArrayList<>(3);
	
	private ArrayList<JCustomButton> cross = new ArrayList<>(7);
	private ArrayList<JCustomButton> remove = new ArrayList<>(7);
	
	private ArrayList<JCustomButton> reinitEnergy = new ArrayList<>(4);
	private ArrayList<JCustomButton> maxEnergy = new ArrayList<>(4);
	
	private JCustomPanel colBuffLeft;
	private JCustomPanel colBuffRight;
	private JCustomPanel voidPanelLeft;
	private JCustomPanel voidPanelRight;
	
	public static PageBuff getInstance() {
		return INSTANCE;
	}
	
	private PageBuff() {
		super();
		
		this.nucleus = new JCustomComboBoxList<>();
		for(int i = 0; i < 7; i++) {
			this.nucleus.add(new JCustomComboBox<>(Nucleus.getData(i)));
		}
		this.nucleus.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* ENCHANT NUCLEUS */
		for(int i = 0; i < 4; i++) {
			int idCheck = i;
			
			if(i == 0) {
				this.starNucleus.add(new JIconCheckBox("starZero", "starOff"));
				this.starNucleus.get(0).setSelected(true);
			} else {
				this.starNucleus.add(new JIconCheckBox("starOn", "starOff"));
			}
			
			this.starNucleus.get(i).addActionListener(e -> {
				updateStarNucleus(idCheck);
				keepNucleusEnchant(idCheck);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.nucleusEnchant = new JCustomComboBoxList<>(3, NucleusEnchantment.getData());
		this.nucleusEnchant.setVisible(false);
		this.nucleusLvlEnchant = new JCustomComboBoxList<>(3);
		this.nucleusLvlEnchant.setVisible(false);
		
		for(int j = 0; j < 3; j++) {
			int idNucleus = j;
			
			this.nucleusEnchant.get(idNucleus).addActionListener(e -> {
				updateNucleusLvlEnchant(idNucleus);
				updateNucleusEnchant(idNucleus);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			this.nucleusLvlEnchant.get(idNucleus).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 21; i++) {
			this.labelEnergy.add(new JCustomLabel<>(Energy.getData()[i]));
			this.labelEnergy.get(i).setPreferredSize(new Dimension(240, 32));
			
			this.energy.add(new JCustomSpinner(new SpinnerNumberModel(0, 0, 2, 1)));
			this.energy.get(i).addChangeListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 3; i++) {
			int id = i;
			
			this.labelVoidEnergy.add(new JCustomRadioButton<>(Energy.getVoidData()[i]));
			this.labelVoidEnergy.get(i).setPreferredSize(new Dimension(270, 32));
			this.labelVoidEnergy.get(i).addChangeListener(e -> showAndHideEnergies(id) );
		}
		
		
		for(int i = 0; i < 4; i++) {
			this.guildBuffUsed.add(new JCustomLabel<>(null));
			this.guildBuffUsed.get(i).setBackground(Design.UIColor[0]);
			this.guildBuffUsed.get(i).setBorder(new EmptyBorder(0, 0, 0, 10));
			this.guildBuffUsed.get(i).setMaximumSize(new Dimension(335, 32));
			this.guildBuffUsed.get(i).setOpaque(true);
			this.guildBuffUsed.get(i).setVisible(false);
			
			int id = i;
			
			this.remove.add(new JCustomButton("crossBase", "crossPress", "crossHover"));
			this.remove.get(i).addActionListener(e -> {
				removeGuildBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			this.cross.add(this.remove.get(i));
			this.cross.get(i).setBackground(Design.UIColor[0]);
			this.cross.get(i).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.cross.get(i).setMaximumSize(new Dimension(20, 32));
			this.cross.get(i).setOpaque(true);
			this.cross.get(i).setVisible(false);
		}
		
		this.guildBuff = new JCustomComboBox<>(GuildBuff.getData());
		this.guildBuff.setMaximumSize(new Dimension(320, 36));
		this.guildBuff.addActionListener(e -> {
			updateGuildBuff();
        	
        	setEffects();
        	MainFrame.getInstance().updateStat();
		});
		
		
		for(int i = 0; i < 14; i++) {
			this.stoneUsed.add(new JCustomLabel<>(null));
			this.stoneUsed.get(i).setBackground(Design.UIColor[0]);
			this.stoneUsed.get(i).setBorder(new EmptyBorder(0, 0, 0, 10));
			this.stoneUsed.get(i).setMaximumSize(new Dimension(306, 32));
			this.stoneUsed.get(i).setOpaque(true);
			this.stoneUsed.get(i).setVisible(false);
			
			int id = i;
			this.remove.add(new JCustomButton("crossBase", "crossPress", "crossHover"));
			this.remove.get(i+4).addActionListener(e -> {
				removeStoneBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.cross.add(this.remove.get(i+4));
			this.cross.get(i+4).setBackground(Design.UIColor[0]);
			this.cross.get(i+4).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.cross.get(i+4).setMaximumSize(new Dimension(20, 32));
			this.cross.get(i+4).setOpaque(true);
			this.cross.get(i+4).setVisible(false);
		}
		
		this.stone = new JCustomComboBox<>(Stone.getData());
		this.stone.setMaximumSize(new Dimension(280, 36));
		this.stone.addActionListener(e -> {
			updateStoneBuff();
        	
        	setEffects();
        	MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < 4; i++) {
			int id = i;
			
			this.reinitEnergy.add(new JCustomButton(this.labels.get("Min" + i).getLang(), Design.RED_COLOR));
			this.reinitEnergy.get(i).addActionListener(e -> setMinSpinnerEnergy(id) );
			
			this.maxEnergy.add(new JCustomButton(this.labels.get("Max" + i).getLang(), Design.GREEN_COLOR));
			this.maxEnergy.get(i).addActionListener(e -> setMaxSpinnerEnergy(id) );
		}
		
		this.components.addAll(this.labelEnergy);
		this.components.addAll(this.labelVoidEnergy);
		this.components.addAll(this.reinitEnergy);
		this.components.addAll(this.maxEnergy);
		
		createPanel();
		setEffects();
	}
	
	public Nucleus getNucleus(int id) {
		return this.nucleus.get(id).getSelectedItem();
	}
	
	public NucleusEnchantment getNucleusEnchantment(int id) {
		return this.nucleusEnchant.get(id).getSelectedItem();
	}
	
	public InnerEffect getLvlNucleusEnchant(int id) {
		return this.nucleusLvlEnchant.get(id).getSelectedItem();
	}
	
	public GuildBuff getGuildBuffUsed(int i) {
		return this.guildBuffUsed.get(i).getItem();
	}
	
	public GuildBuff getGuildBuff() {
		return this.guildBuff.getSelectedItem();
	}
	
	public Stone getStoneUsed(int i) {
		return this.stoneUsed.get(i).getItem();
	}
	
	public Stone getStone() {
		return this.stone.getSelectedItem();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Nucleus", new JLangLabel(Nucleus.CLASS_NAME, Design.TITLE));
		this.labels.put("Energy", new JLangLabel(Energy.CLASS_NAME, Design.TITLE));
		this.labels.put("Guild", new JLangLabel(GuildBuff.CLASS_NAME, Design.TITLE));
		this.labels.put("Stone", new JLangLabel(Stone.CLASS_NAME, Design.TITLE));
		this.labels.put("NucleusEnchant", new JLangLabel(NucleusEnchantment.CLASS_NAME, Design.SUBTITLE));
		
		this.labels.put("Nucleus0", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vert"); put(Language.EN, "Green"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus1", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Trésor"); put(Language.EN, "Treasure"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus2", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bleu"); put(Language.EN, "Blue"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus3", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Orange"); put(Language.EN, "Orange"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus4", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Jaune"); put(Language.EN, "Gold"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus5", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Violet"); put(Language.EN, "Purple"); }}, Design.SUBTITLE));
		this.labels.put("Nucleus6", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Compétence"); put(Language.EN, "Skill"); }}, Design.SUBTITLE));
		this.labels.put("4from", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "4 parmi :"); put(Language.EN, "4 from:"); }}, Design.SUBTITLE));
		this.labels.put("Select", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sélection :"); put(Language.EN, "Selection:"); }}, Design.SUBTITLE));
		
		for(int i = 0; i < 4; i++) {
			this.labels.put("Min" + i, new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tout à 0"); put(Language.EN, "All to 0"); }}, Design.TEXT));
			this.labels.put("Max" + i, new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tout à 200"); put(Language.EN, "All to 200"); }}, Design.TEXT));
		}
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<>();
		
		for(int i = 0; i < this.nucleus.size(); i++) {
			list.addAll(this.getNucleus(i));
		}
		
		for(int i = 0; i < this.nucleusEnchant.size(); i++) {
			if(this.nucleusEnchant.get(i).isVisible()) {
				list.addAll(this.getLvlNucleusEnchant(i));
			}
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			if(Energy.getData()[i].getEffects() != null) {
				for(Calculable effect : Energy.getData()[i].getEffects()) {
					list.add(Energy.multiplyEffect(effect, Math.min(this.energy.get(i).getIntValue(), PageGeneral.getInstance().getLvl() *2)));
				}
			}
		}
		
		for(JCustomLabel<GuildBuff> guild : this.guildBuffUsed) {
			if(guild.isVisible()) {
				list.addAll(guild.getItem());
			}
		}
		
		for(JCustomLabel<Stone> stoneEffect : this.stoneUsed) {
			if(stoneEffect.isVisible()) {
				list.addAll(stoneEffect.getItem());
			}
		}
		
		this.effects = list;
		
		updateSize();
	}
	
	@Override
	protected void createPanel() {
		JCustomPanel page11Elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page11Elem1.add(this.labels.get("Nucleus"), Box.createVerticalStrut(10));
		
		for(int i = 0; i < 7; i++) {
			JCustomPanel nucleusPanel = new JCustomPanel(this.labels.get("Nucleus" + i), this.nucleus.get(i), Box.createVerticalStrut(5));
			this.labels.get("Nucleus" + i).setPreferredSize(new Dimension(90, 20));
			this.nucleus.get(i).setPreferredSize(new Dimension(200, 36));
			
			if(i == 1) {
				this.showAndHide = nucleusPanel;
			}
			
			page11Elem1.add(nucleusPanel);
		}
		
		JCustomPanel starPanel = new JCustomPanel(this.labels.get("NucleusEnchant"), Box.createHorizontalStrut(10));
		starPanel.addAll(this.starNucleus);
		
		JCustomPanel listEnchant = new JCustomPanel(new GridLayout(3, 2, 2, 5));
		for(int i = 0; i < 3; i++) {
			listEnchant.addAll(this.nucleusEnchant.get(i), this.nucleusLvlEnchant.get(i));
		}
		
		page11Elem1.addAll(Box.createVerticalStrut(5), starPanel, listEnchant);
		
		this.showAndHideEnchant = listEnchant;
		
		
		JCustomPanel energies = new JCustomPanel(BoxLayout.Y_AXIS);
		
		JCustomPanel classicEnergies = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(0, 0, 0, 0));
		for(int i = 0; i < 6; i++) {
			classicEnergies.add(new JCustomPanel(this.labelEnergy.get(i), this.energy.get(i)));
		}
		
		JCustomPanel shortCut = new JCustomPanel(new GridLayout(1, 2, 10, 5));
		shortCut.addAll(this.reinitEnergy.get(0), this.maxEnergy.get(0));
		classicEnergies.addAll(shortCut);
		
		energies.add(classicEnergies);
		
		for(int i = 0; i < 3; i++) {
			JCustomPanel button = new JCustomPanel(this.labelVoidEnergy.get(i));
			button.setBackground(Design.UIColor[0]);
			energies.addAll(Box.createVerticalStrut(10), button);
			
			this.showAndHideEnergy.add(new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(0, 0, 0, 0)));
			
			for(int j = 0; j < 5; j++) {
				this.showAndHideEnergy.get(i).add(new JCustomPanel(this.labelEnergy.get(i*5+j+6), this.energy.get(i*5+j+6)));
			}
			
			JCustomPanel shortCutSection = new JCustomPanel(new GridLayout(1, 2, 10, 5));
			shortCutSection.addAll(this.reinitEnergy.get(i+1), this.maxEnergy.get(i+1));
			this.showAndHideEnergy.get(i).add(shortCutSection);
			
			energies.add(this.showAndHideEnergy.get(i));
		}
		
		JCustomPanel page11Elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page11Elem2.addAll(this.labels.get("Energy"), Box.createVerticalStrut(10), energies);
		
		
		JCustomPanel blocBuffGuild = new JCustomPanel(BoxLayout.Y_AXIS);
		blocBuffGuild.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 4; i++) {
			JCustomPanel lineBuff = new JCustomPanel(BoxLayout.X_AXIS, new EmptyBorder(0, 0, 0, 0));
			lineBuff.setBackground(Design.UIColor[0]);
			lineBuff.setOpaque(false);
			lineBuff.addAll(this.guildBuffUsed.get(i), this.cross.get(i));
			this.cross.get(i).setHorizontalAlignment(SwingConstants.RIGHT);
			
			blocBuffGuild.addAll(lineBuff, Box.createVerticalStrut(3));
		}
		
		
		JCustomPanel page11Elem3 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page11Elem3.addAll(this.labels.get("Guild"), Box.createVerticalStrut(10), blocBuffGuild, Box.createVerticalStrut(10),
				this.labels.get("4from"), Box.createVerticalStrut(5), this.guildBuff);
		
		
		JCustomPanel blocStone = new JCustomPanel(BoxLayout.Y_AXIS);
		blocStone.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 14; i++) {
			JCustomPanel lineStone = new JCustomPanel(BoxLayout.X_AXIS, new EmptyBorder(0, 0, 0, 0));
			lineStone.setBackground(Design.UIColor[0]);
			lineStone.setOpaque(false);
			lineStone.addAll(this.stoneUsed.get(i), this.cross.get(i+4));
			this.cross.get(i+4).setHorizontalAlignment(SwingConstants.RIGHT);
			
			blocStone.addAll(lineStone, Box.createVerticalStrut(3));
		}
		
		JCustomPanel page11Elem4 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page11Elem4.addAll(this.labels.get("Stone"), Box.createVerticalStrut(10), blocStone, Box.createVerticalStrut(10),
				this.labels.get("Select"), Box.createVerticalStrut(5), this.stone);
		
		
		this.voidPanelLeft = new JCustomPanel();
		this.voidPanelLeft.setBackground(Design.UIColor[2]);
		
		this.colBuffLeft = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 5));
		this.colBuffLeft.setBackground(Design.UIColor[2]);
		this.colBuffLeft.addAll(page11Elem1, Box.createVerticalStrut(10), page11Elem3, Box.createVerticalStrut(10), page11Elem4);
		
		JCustomPanel resizedLeft = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(0, 0, 0, 0));
		resizedLeft.addAll(this.colBuffLeft, this.voidPanelLeft);
		
		this.voidPanelRight = new JCustomPanel();
		this.voidPanelRight.setBackground(Design.UIColor[2]);
		
		this.colBuffRight = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 0, 10, 10));
		this.colBuffRight.setBackground(Design.UIColor[2]);
		this.colBuffRight.addAll(page11Elem2);

		JCustomPanel resizedRight = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(0, 0, 0, 0));
		resizedRight.addAll(this.colBuffRight, this.voidPanelRight);
		
		
		this.addAll(resizedLeft, resizedRight);
		
		this.showAndHide.setVisible(false);
		this.showAndHideEnchant.setVisible(false);
		
		for(int i = 0; i < 3; i++) {
			this.labelVoidEnergy.get(i).setSelected(false);
			showAndHideEnergies(i);
		}
	}
	
	private void updateSize() {
		this.colBuffLeft.revalidate();
		this.colBuffRight.revalidate();
		
		int newSize = this.colBuffRight.getMinimumSize().height - this.colBuffLeft.getMinimumSize().height - 10;
		if(newSize > 0) {
			this.voidPanelLeft.setBorder(new EmptyBorder(newSize, 0, 0, 0));
			this.voidPanelRight.setBorder(new EmptyBorder(0, 0, 0, 0));
		} else {
			this.voidPanelLeft.setBorder(new EmptyBorder(0, 0, 0, 0));
			this.voidPanelRight.setBorder(new EmptyBorder(-newSize, 0, 0, 0));
		}
	}
	
	public void updateNucleus() {
		if(PageGeneral.getInstance().getReinca().getLvl() == 0) {
			this.showAndHide.setVisible(false);
			this.nucleus.get(1).setSelectedIndex(0);
		} else {
			this.showAndHide.setVisible(true);
		}
	}
	
	public void initNucleusEnchant() {
		for(int i = 0; i < this.nucleusEnchant.size(); i++) {
			this.nucleusEnchant.get(i).setSelectedIndex(i);
		}
	}
	
	private void updateStarNucleus(int idCheck) {
		for(int i = 0; i < this.starNucleus.size(); i++) {
			this.starNucleus.get(i).setSelected(i <= idCheck);
		}
		
		switch (idCheck) {
			case 0:
				this.showAndHideEnchant.setVisible(false);
				this.nucleusEnchant.setVisible(false);
				this.nucleusLvlEnchant.setVisible(false);
				break;
			case 1:
				this.showAndHideEnchant.setVisible(true);
				
				this.nucleusEnchant.get(0).setVisible(true);
				this.nucleusLvlEnchant.get(0).setVisible(true);
				updateNucleusLvlEnchant(0);
				
				this.nucleusEnchant.setRangeVisible(1, 2, false);
				this.nucleusLvlEnchant.setRangeVisible(1, 2, false);
				
				break;
			case 2:
				this.showAndHideEnchant.setVisible(true);
				
				this.nucleusEnchant.setRangeVisible(0, 2, true);
				this.nucleusLvlEnchant.setRangeVisible(0, 2, true);
				updateNucleusLvlEnchant(0);
				updateNucleusLvlEnchant(1);
				
				this.nucleusEnchant.get(2).setVisible(false);
				this.nucleusLvlEnchant.get(2).setVisible(false);
				
				break;
			case 3:
				this.showAndHideEnchant.setVisible(true);
				this.nucleusEnchant.setVisible(true);
				this.nucleusLvlEnchant.setVisible(true);
				
				for(int i = 0; i < 3; i++) {
					updateNucleusLvlEnchant(i);
				}
				
				break;
			default:
				break;
		}
	}
	
	private void updateNucleusEnchant(int idNucleus) {
		int nbStar = -1;
		for(JIconCheckBox star : this.starNucleus) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		if(nbStar == 2) {
			int ignore1;
			
			if(idNucleus == 0) {
				ignore1 = idNucleus + 1;
			} else {
				ignore1 = idNucleus - 1;
			}
			
			NucleusEnchantment choice = this.getNucleusEnchantment(idNucleus);
			NucleusEnchantment memory1 = this.getNucleusEnchantment(ignore1);
			
			NucleusEnchantment[] tabNucleus1 = NucleusEnchantment.getPossibleNucleusEnchant(choice);
			
			this.nucleusEnchant.get(ignore1).setItems(tabNucleus1, memory1);
		} else if(nbStar == 3) {
			int ignore1;
			int ignore2;
			
			if(idNucleus == 0) {
				ignore1 = idNucleus + 1;
				ignore2 = idNucleus + 2;
			} else if(idNucleus == 1) {
				ignore1 = idNucleus - 1;
				ignore2 = idNucleus + 1;
			} else {
				ignore1 = idNucleus - 2;
				ignore2 = idNucleus - 1;
			}
			
			NucleusEnchantment choice = this.getNucleusEnchantment(idNucleus);
			NucleusEnchantment memory1 = this.getNucleusEnchantment(ignore1);
			NucleusEnchantment memory2 = this.getNucleusEnchantment(ignore2);
			
			NucleusEnchantment[] tabNucleus1 = NucleusEnchantment.getPossibleNucleusEnchant(choice, memory2);
			NucleusEnchantment[] tabNucleus2 = NucleusEnchantment.getPossibleNucleusEnchant(choice, memory1);
			
			this.nucleusEnchant.get(ignore1).setItems(tabNucleus1, memory1);
			this.nucleusEnchant.get(ignore2).setItems(tabNucleus2, memory2);
		}
	}
	
	private void keepNucleusEnchant(int idCheck) {
		if(idCheck == 1) {
			NucleusEnchantment memory1 = this.getNucleusEnchantment(0);
			NucleusEnchantment[] tabPearl1 = NucleusEnchantment.getPossibleNucleusEnchant();
			this.nucleusEnchant.get(0).setItems(tabPearl1, memory1);
		} else if(idCheck == 2) {
			NucleusEnchantment memory1 = this.getNucleusEnchantment(0);
			NucleusEnchantment memory2 = this.getNucleusEnchantment(1);
			
			NucleusEnchantment[] tabPearl1 = NucleusEnchantment.getPossibleNucleusEnchant(memory2);
			NucleusEnchantment[] tabPearl2 = NucleusEnchantment.getPossibleNucleusEnchant(memory1);
			
			this.nucleusEnchant.get(0).setItems(tabPearl1, memory1);
			this.nucleusEnchant.get(1).setItems(tabPearl2, memory2);
		} else {
			NucleusEnchantment memory1 = this.getNucleusEnchantment(0);
			NucleusEnchantment memory2 = this.getNucleusEnchantment(1);
			NucleusEnchantment memory3 = this.getNucleusEnchantment(2);
			
			NucleusEnchantment[] tabPearl1 = NucleusEnchantment.getPossibleNucleusEnchant(memory2, memory3);
			NucleusEnchantment[] tabPearl2 = NucleusEnchantment.getPossibleNucleusEnchant(memory1, memory3);
			NucleusEnchantment[] tabPearl3 = NucleusEnchantment.getPossibleNucleusEnchant(memory1, memory2);
			
			this.nucleusEnchant.get(0).setItems(tabPearl1, memory1);
			this.nucleusEnchant.get(1).setItems(tabPearl2, memory2);
			this.nucleusEnchant.get(2).setItems(tabPearl3, memory3);
		}
	}
	
	private void updateNucleusLvlEnchant(int id) {
		int nbStar = -1;
		for(JIconCheckBox star : this.starNucleus) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		NucleusEnchantment idNucleusEnchant = this.getNucleusEnchantment(id);
		
		if(idNucleusEnchant != null) {
			this.nucleusLvlEnchant.get(id).setItems(idNucleusEnchant.getInnerLvlEffect(nbStar));
			this.nucleusLvlEnchant.get(id).setVisible(this.nucleusEnchant.get(id).isVisible());
		} else {
			this.nucleusLvlEnchant.get(id).setVisible(false);
		}
	}
	
	public void updateEnergy() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < this.energy.size(); i++) {
			int memory = this.energy.get(i).getIntValue();
			
			if(reinca.getLvl() == 0) {
				if(memory > lvl*2) {
					memory = lvl*2;
				}
				
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, lvl*2, 1));
			} else {
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, 200, 1));
			}
			
			if(this.energy.get(i).getIntValue() != memory) {
				MainFrame.getInstance().setRedPane(10);
			}
		}
		
		setEffects();
	}
	
	private void showAndHideEnergies(int index3) {
		this.showAndHideEnergy.get(index3).setVisible(this.labelVoidEnergy.get(index3).isSelected());
		
		updateSize();
	}
	
	private void updateGuildBuff() {
		GuildBuff choice = this.getGuildBuff();
		
		int slot = 0;
		while(slot < 4 && this.guildBuffUsed.get(slot).isVisible()) {
			slot++;
		}
		
		if(slot == 4) {
			for(int i = 0; i < 3; i++) {
				this.guildBuffUsed.get(i).setItem(this.guildBuffUsed.get(i+1).getItem());
			}
			this.guildBuffUsed.get(3).setItem(choice);
		} else {
			this.guildBuffUsed.get(slot).setItem(choice);
			this.guildBuffUsed.get(slot).setVisible(true);
			this.cross.get(slot).setVisible(true);
		}
		
		refreshGuildBuffList();
	}

	private void removeGuildBuff(int id) {
		while(id < 3 && this.guildBuffUsed.get(id+1).isVisible()) {
			this.guildBuffUsed.get(id).setItem(this.guildBuffUsed.get(id+1).getItem());
			id++;
		}
		
		this.guildBuffUsed.get(id).setVisible(false);
		this.cross.get(id).setVisible(false);
		
		refreshGuildBuffList();
	}
	
	private void refreshGuildBuffList() {
		ArrayList<GuildBuff> guildBuffList = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			if(this.guildBuffUsed.get(i).isVisible()) {
				guildBuffList.add(this.guildBuffUsed.get(i).getItem());
			}
		}
		
		GuildBuff[] tabGuildBuff = GuildBuff.getListGuildBuff(guildBuffList);
		this.guildBuff.placeItems(tabGuildBuff);
	}
	
	private void updateStoneBuff() {
		Stone choice = this.getStone();
		
		if(choice == null) {
			return;
		}
		
		int slot = 0;
		while(slot < 14 && this.stoneUsed.get(slot).isVisible()) {
			slot++;
		}
		
		this.stoneUsed.get(slot).setItem(choice);
		this.stoneUsed.get(slot).setVisible(true);
		this.cross.get(slot+4).setVisible(true);
		
		refreshStoneList();
	}
	
	private void removeStoneBuff(int id) {
		this.stoneUsed.get(id).setVisible(false);
		this.cross.get(id+4).setVisible(false);
		
		refreshStoneList();
	}
	
	private void refreshStoneList() {
		ArrayList<Stone> stoneList = new ArrayList<>();
		
		for(int i = 0; i < 14; i++) {
			if(this.stoneUsed.get(i).isVisible()) {
				stoneList.add(this.stoneUsed.get(i).getItem());
			}
		}
		
		this.stone.placeItems(Stone.getListStone(stoneList));
	}
	
	private void setMinSpinnerEnergy(int index4) {
		if(index4 == 0) {
			for(int i = 0; i < 6; i++) {
				this.energy.get(i).setValue(0);
			}
		} else {
			for(int i = 0; i < 5; i++) {
				this.energy.get(index4*5+i+1).setValue(0);
			}
		}
	}
	
	private void setMaxSpinnerEnergy(int index4) {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca().getLvl() > 0;
		
		if(index4 == 0) {
			for(int i = 0; i < 6; i++) {
				this.energy.get(i).setValue(reinca ? 200 : lvl*2);
			}
		} else {
			for(int i = 0; i < 5; i++) {
				this.energy.get(index4*5+i+1).setValue(reinca ? 200 : lvl*2);
			}
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.nucleus.size(); i++) {
			config.put("Nucleus" + i, this.getNucleus(i).getName(Language.FR));
		}
		
		int select = 3;
		while(select > 0) {
			if(this.starNucleus.get(select).isSelected()) {
				break;
			}
			
			select--;
		}
		config.put("StarNucleus", "" + select);
		
		for(int i = 0; i < this.nucleusEnchant.size(); i++) {
			String value = this.getNucleusEnchantment(i) != null ? this.getNucleusEnchantment(i).getSelectorInfo(lang) : "";
			config.put("NucleusEnchant" + i, value);
		}
		
		for(int i = 0; i < this.nucleusLvlEnchant.size(); i++) {
			Integer value = this.getLvlNucleusEnchant(i) != null ? this.getLvlNucleusEnchant(i).getLvlbuff() : 0;
			config.put("NucleusLvlEnchant" + i, "" + value);
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			config.put("Energy" + i, "" + this.energy.get(i).getIntValue());
		}
		
		for(int i = 0; i < this.guildBuffUsed.size(); i++) {
			String value = this.getGuildBuffUsed(i) != null && this.guildBuffUsed.get(i).isVisible() ? this.getGuildBuffUsed(i).getName(Language.FR) : "";
			config.put("GuildBuff" + i, value);
		}
		
		for(int i = 0; i < this.stoneUsed.size(); i++) {
			String value = this.getStoneUsed(i) != null && this.stoneUsed.get(i).isVisible() ? this.getStoneUsed(i).getName(Language.FR) : "";
			config.put("Stone" + i, value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.nucleus.size(); i++) {
			this.nucleus.get(i).setSelectedItem(Nucleus.get(config.get("Nucleus" + i), i));
		}
		
		int select = Integer.parseInt(config.get("StarNucleus"));
		for(int i = 0; i < this.starNucleus.size(); i++) {
			if(i == select) {
				this.starNucleus.get(i).setSelected(true);
				updateStarNucleus(i);
				setEffects();
			} else {
				this.starNucleus.get(i).setSelected(false);
			}
		}
			
		for(int i = 0; i < this.nucleusEnchant.size(); i++) {
			this.nucleusEnchant.get(i).setSelectedItem(NucleusEnchantment.get(config.get("NucleusEnchant" + i)));
			
			NucleusEnchantment idNucleusEnchant = this.getNucleusEnchantment(i);
			
			if(idNucleusEnchant != null) {
				InnerEffect inner = idNucleusEnchant.getInnerEffect(Integer.valueOf(config.get("NucleusLvlEnchant" + i)));
				this.nucleusLvlEnchant.get(i).setSelectedItem(inner);
			}
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			this.energy.get(i).setValue(Integer.valueOf(config.get("Energy" + i)));
		}
		
		for(int i = 0; i < this.guildBuffUsed.size(); i++) {
			GuildBuff setGuildBuff = GuildBuff.get(config.get("GuildBuff" + i));
			if(setGuildBuff != null) {
				this.guildBuffUsed.get(i).setItem(setGuildBuff);
				this.guildBuffUsed.get(i).setVisible(true);
				this.cross.get(i).setVisible(true);
			} else {
				this.guildBuffUsed.get(i).setVisible(false);
				this.cross.get(i).setVisible(false);
			}
		}
		
		for(int i = 0; i < this.stoneUsed.size(); i++) {
			Stone setStone = Stone.get(config.get("Stone" + i));
			if(setStone != null) {
				this.stoneUsed.get(i).setItem(setStone);
				this.stoneUsed.get(i).setVisible(true);
				this.cross.get(i+4).setVisible(true);
			} else {
				this.stoneUsed.get(i).setVisible(false);
				this.cross.get(i+4).setVisible(false);
			}
		}
		
		refreshGuildBuffList();
		refreshStoneList();
		setEffects();
		
		updateSize();
	}
}
