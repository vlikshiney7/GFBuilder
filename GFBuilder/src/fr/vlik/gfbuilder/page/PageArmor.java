package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customequip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equip.BonusEquipSet;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equip.RedArmor;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.equipupgrade.Fortification;
import fr.vlik.grandfantasia.equipupgrade.Pearl;
import fr.vlik.grandfantasia.equipupgrade.PearlEnchantment;
import fr.vlik.grandfantasia.equipupgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipupgrade.RedFortification;
import fr.vlik.grandfantasia.equipupgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCompleteBox;
import fr.vlik.uidesign.JCompleteBoxList;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTextPane;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageArmor extends PartialRedStuff {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "ARMOR";
	private static final PageArmor INSTANCE = new PageArmor();
	
	private JCustomComboBox<EquipSet> shortcutSet;
	private JCustomComboBox<Fortification> shortcutFortif;
	private JCustomComboBox<Enchantment> shortcutEnchant;
	
	private transient JCompleteBoxList<Armor> armor = new JCompleteBoxList<>();
	private transient EquipSet equipSet;
	private ArrayList<JCustomTextPane<BonusEquipSet>> equipSetBonus = new ArrayList<>(3);
	
	private transient JCustomComboBoxList<Enchantment> enchant;
	private transient JCustomComboBoxList<Fortification> fortif;
	private transient JCompleteBoxList<Pearl> pearl = new JCompleteBoxList<>();
	
	private JCustomPanel showAndHide;
	
	public static PageArmor getInstance() {
		return INSTANCE;
	}
	
	public PageArmor() {
		super(BoxLayout.Y_AXIS, 5);
		
		this.shortcutSet = new JCustomComboBox<>(EquipSet.class, new EquipSet[] {});
		this.shortcutSet.addActionListener(e -> applySet() );
		
		this.shortcutFortif = new JCustomComboBox<>(Fortification.class, Fortification.getData());
		this.shortcutFortif.addActionListener(e -> applyFortif() );
		
		this.shortcutEnchant = new JCustomComboBox<>(Enchantment.class);
		this.shortcutEnchant.addActionListener(e -> applyEnchant() );
		
		for(int i = 0; i < 5; i++) {
			int id = i;
			
			Armor[] tabArmor = Armor.getPossibleArmor(i, PageGeneral.getInstance().getGrade(), PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
			this.armor.add(new JCompleteBox<>(Armor.class, tabArmor, JCompleteBox.FILTER32, 5, /*Armor.getTags(), */Armor.getQualities()));
			this.armor.get(i).addActionListener(e -> {
				updateXpStuff(id);
				updateDetails(id);
				updatePearl(id);
				updateEnchant(id);
				updateEnchantPearl(id);
				
				updateEquipSet();
				updateShortcutSet();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* PERLE */
			Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(i));
			
			this.pearl.add(new JCompleteBox<>(Pearl.class, tabPearl, JCompleteBox.FILTER24, JCompleteBox.PROC24, 4, Pearl.getQualities()));
			
			if(i == 0) {
				this.pearl.get(i).addActionListener(e -> {
					this.pearl.get(id).activeProc();
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			} else if(i == 1) {
				this.pearl.add(new JCompleteBox<>(Pearl.class, tabPearl, JCompleteBox.FILTER24, JCompleteBox.PROC24, 4, Pearl.getQualities()));
				this.pearl.get(i).addActionListener(e -> {
					this.pearl.get(id).activeProc();
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).addActionListener(e -> {
					this.pearl.get(id+1).activeProc();
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			} else {
				this.pearl.get(i+1).addActionListener(e -> {
					this.pearl.get(id+1).activeProc();
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
		}
		
		this.pearl.setVisible(false);
		this.pearl.addProcActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* ENCHANTEMENT */
		this.enchant = new JCustomComboBoxList<>(Enchantment.class, 5);
		this.enchant.setVisible(false);
		this.enchant.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* FORTIF */
		this.fortif = new JCustomComboBoxList<>(Fortification.class, 5, Fortification.getData());
		this.fortif.setVisible(false);
		this.fortif.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < 3; i++) {
			this.equipSetBonus.add(new JCustomTextPane<>(new BonusEquipSet()));
		}
		
		this.components.addAll(this.armor.getList());
		this.components.addAll(this.pearl.getList());
		this.components.addAll(this.equipSetBonus);
		
		createPanel();
		setEffects();
	}
	
	public EquipSet getShortcutSet() {
		return this.shortcutSet.getSelectedItem();
	}
	
	public Fortification getShortcutFortif() {
		return this.shortcutFortif.getSelectedItem();
	}
	
	public Enchantment getShortcutEnchant() {
		return this.shortcutEnchant.getSelectedItem();
	}
	
	public Armor getArmor(int id) {
		return this.armor.get(id).getSelectedItem();
	}
	
	public EquipSet getEquipSet() {
		return this.equipSet;
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
	}
	
	public Fortification getFortif(int id) {
		return this.fortif.get(id).getSelectedItem();
	}
	
	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		for(int i = 0; i < 5; i++) {
			this.labels.put("PearlEnchant" + i, new JLangLabel(PearlEnchantment.CLASS_NAME, Design.SUBTITLE));
			this.labels.put("Refining" + i, new JLangLabel(RedEnchantment.SUB_CLASS_NAME, Design.SUBTITLE));
		}
		
		this.labels.put("ShortCut", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Raccourci de set"); put(Language.EN, "Set shortcut"); }}, Design.TITLE));
		this.labels.put("Armor0", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Casque"); put(Language.EN, "Helmet"); }}, Design.TITLE));
		this.labels.put("Armor1", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Plastron"); put(Language.EN, "Breastplate"); }}, Design.TITLE));
		this.labels.put("Armor2", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Jambière"); put(Language.EN, "Legging"); }}, Design.TITLE));
		this.labels.put("Armor3", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gantelet"); put(Language.EN, "Gauntlet"); }}, Design.TITLE));
		this.labels.put("Armor4", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Botte"); put(Language.EN, "Boot"); }}, Design.TITLE));
		for(int i = 0; i < 5; i++) {
			this.labels.put("ArmorXP" + i, new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "XP Armure"); put(Language.EN, "Armor Exp"); }}, Design.SUBTITLE));
		}
	}
	
	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		this.redEnchants.clear();
		this.pearlEnchants.clear();
		
		Armor[] armors = new Armor[5];
		
		for(int i = 0; i < armors.length; i++) {
			if(this.getArmor(i).getQuality() == Quality.RED) {
				armors[i] = new RedArmor((RedArmor) this.getArmor(i));
			} else {
				armors[i] = new Armor(this.getArmor(i));
			}
			
			if(armors[i] instanceof RedArmor redArmor) {
				RedFortification redFortif = this.getRedFortif(i);
				
				if(redFortif.getCoef() != 1) {
					redArmor.addFortif(this.valueFortif.get(i).getDoubleValue());
					list.addAll(redArmor.getStarEffects(redFortif.getStar()));
				}
				
				if(this.showAndHideRedEnchant.get(i).isVisible()) {
					for(int j = 0; j < 3; j++) {
						if(this.redEnchant.get(i*3+j).getSelectedIndex() != 0) {
							RedEnchantment red = this.getRedEnchantment(i*3+j);
							
							if(red != null) {
								this.redEnchants.add(this.getRedLvlEnchant(i*3+j));
							}
						}
					}
					
					for(int j = 0; j < 2; j++) {
						if(this.refining.get(i*2+j).getSelectedIndex() != 0) {
							RedEnchantment refining = this.getRefining(i*2+j);
							
							if(refining != null) {
								list.addAll(this.getRefiningLvl(i*2+j));
							}
						}
					}
				}
			} else {
				armors[i].addEnchant(this.getEnchantment(i));
				armors[i].addFortif(this.getFortif(i));
			}
			
			for(int j = 0; j < 5; j++) {
				if(this.pearlEnchant.get(i*5+j).isVisible()) {
					this.pearlEnchants.add(this.getLvlPearlEnchant(i*5+j));
				}
			}
			
			list.addAll(armors[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			if(XpStuff.availableEffects(this.getXpStuff(i*2), this.getXpStuff(i*2+1))) {
				for(int j = 0; j < 2; j++) {
					list.addAll(this.getLvlXpStuff(i*2+j));
				}
				
				int lvlXpStuff = this.getLvlXpStuff(i*2).getLvlbuff() + this.getLvlXpStuff(i*2+1).getLvlbuff();
				
				if(lvlXpStuff >= armors[i].getLvl()) {
					list.addAll(armors[i].getBonusXP());
				}
			}
		}
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearlEffect = this.getPearl(i);
			if(pearlEffect.isCumulable()) {
				list.addAll(pearlEffect);
				
				if(this.pearl.get(i).isProcActive()) {
					list.addAll(this.pearl.get(i).getProc().getItem().getEffects());
				}
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearlEffect)) {
				notCombinablePearl.add(pearlEffect);
				list.addAll(pearlEffect);
				
				if(this.pearl.get(i).isProcActive()) {
					list.addAll(this.pearl.get(i).getProc().getItem().getEffects());
				}
			}
		}
		
		for(JCustomTextPane<BonusEquipSet> textPane : this.equipSetBonus) {
			if(textPane.getItem().isActivate()) {
				list.addAll(textPane.getItem());
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		this.showAndHide = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		this.showAndHide.addAll(this.labels.get("ShortCut"), Box.createVerticalStrut(10),
				this.shortcutSet, Box.createVerticalStrut(5), this.shortcutFortif, Box.createVerticalStrut(5), this.shortcutEnchant);
		this.showAndHide.setVisible(false);
		
		this.add(this.showAndHide);
		
		for(int i = 0; i < 5; i++) {
			JCustomPanel descArmor = new JCustomPanel(BoxLayout.X_AXIS);
			descArmor.addAll(this.armor.get(i).getButton(), Box.createHorizontalStrut(5), this.armor.get(i), this.enchant.get(i), this.fortif.get(i), this.redFortif.get(i));
			
			JCustomPanel redEnchantArmor = new JCustomPanel(new GridLayout(3, 2, 2, 5));
			for(int j = 0; j < 3; j++) {
				redEnchantArmor.addAll(this.redEnchant.get(i*3+j), this.redLvlEnchant.get(i*3+j));
			}
			
			JCustomPanel refiningArmor = new JCustomPanel(new GridLayout(2, 2, 2, 5));
			for(int j = 0; j < 2; j++) {
				refiningArmor.addAll(this.refining.get(i*2+j), this.refiningLvl.get(i*2+j));
			}
			
			JCustomPanel enchantArmor = new JCustomPanel(BoxLayout.Y_AXIS);
			enchantArmor.addAll(redEnchantArmor, this.labels.get("Refining" + i), refiningArmor);
			
			JCustomPanel fortifArmor = new JCustomPanel(BoxLayout.X_AXIS);
			fortifArmor.addAll(this.valueFortif.get(i), Box.createHorizontalStrut(5), this.labelValue.get(i));
			
			JCustomPanel pearlsArmor = new JCustomPanel(BoxLayout.Y_AXIS);
			if(i == 0) {
				JCustomPanel pearlArmor = new JCustomPanel(BoxLayout.X_AXIS);
				pearlArmor.addAll(this.pearl.get(i).getButton(), this.pearl.get(i), Box.createHorizontalStrut(3), this.pearl.get(i).getProc());
				pearlsArmor.addAll(pearlArmor, Box.createVerticalStrut(3));
			} else if (i == 1) {
				JCustomPanel pearlArmor1 = new JCustomPanel(BoxLayout.X_AXIS);
				pearlArmor1.addAll(this.pearl.get(i).getButton(), this.pearl.get(i), Box.createHorizontalStrut(3), this.pearl.get(i).getProc());
				pearlsArmor.addAll(pearlArmor1, Box.createVerticalStrut(3));
				
				JCustomPanel pearlArmor2 = new JCustomPanel(BoxLayout.X_AXIS);
				pearlArmor2.addAll(this.pearl.get(i+1).getButton(), this.pearl.get(i+1), Box.createHorizontalStrut(3), this.pearl.get(i+1).getProc());
				pearlsArmor.addAll(pearlArmor2, Box.createVerticalStrut(3));
			} else {
				JCustomPanel pearlArmor = new JCustomPanel(BoxLayout.X_AXIS);
				pearlArmor.addAll(this.pearl.get(i+1).getButton(), this.pearl.get(i+1), Box.createHorizontalStrut(3), this.pearl.get(i+1).getProc());
				pearlsArmor.addAll(pearlArmor, Box.createVerticalStrut(3));
			}
			
			JCustomPanel starPanel = new JCustomPanel(this.labels.get("PearlEnchant" + i), Box.createHorizontalStrut(10));
			starPanel.addAll(this.starPearl.get(i));
			
			JCustomPanel listEnchant = new JCustomPanel(new GridLayout(5, 2, 2, 5));
			for(int j = 0; j < 5; j++) {
				listEnchant.addAll(this.pearlEnchant.get(i*5+j), this.pearlLvlEnchant.get(i*5+j));
			}
			
			JCustomPanel xpArmor = new JCustomPanel(new GridLayout(1, 3, 10, 3));
			xpArmor.add(this.labels.get("ArmorXP" + i));
			
			for(int j = 0; j < 2; j++) {
				JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
				xp.addAll(this.xpStuff.get(i*2+j), this.lvlXpStuff.get(i*2+j));
				xpArmor.add(xp);
			}
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labels.get("Armor" + i), Box.createVerticalStrut(10), descArmor, Box.createVerticalStrut(2),
					enchantArmor, Box.createVerticalStrut(2), fortifArmor, Box.createVerticalStrut(5),
					pearlsArmor, Box.createVerticalStrut(3), starPanel, listEnchant, Box.createVerticalStrut(2),
					xpArmor);
			
			this.showAndHideEnchant.add(listEnchant);
			this.showAndHideRedEnchant.add(enchantArmor);
			this.showAndHideXpStuff.add(xpArmor);	
			
			this.addAll(Box.createVerticalStrut(10), elemI);
		}
		
		for(JCustomTextPane<BonusEquipSet> textPane : this.equipSetBonus) {
			this.addAll(Box.createVerticalStrut(10), textPane);
		}
		
		initPanel();
		
		this.equipSetBonus.forEach(e -> e.setVisible(false));
		
		for(int i = 0; i < 5; i++) {
			this.labels.get("PearlEnchant" + i).setVisible(false);
		}
	}
	
	public void updateArmor() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < 5; i++) {
			Armor[] tabArmor = Armor.getPossibleArmor(i, grade, lvl, reinca);
			tabArmor = Armor.applyFilters(tabArmor, this.getArmor(i), this.armor.get(i).getSearch(), this.armor.get(i).getFilters(), this.armor.get(i).isAndValue());
			
			if(!this.armor.get(i).setItems(tabArmor)) {
				updateXpStuff(i);
				updateDetails(i);
				updateEnchant(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				if(i == 0) {
					this.pearl.get(i).setSelectedIndex(0);
				} else if (i == 1) {
					this.pearl.get(i).setSelectedIndex(0);
					this.pearl.get(i+1).setSelectedIndex(0);
				} else {
					this.pearl.get(i+1).setSelectedIndex(0);
				}
				
				MainFrame.getInstance().setRedPane(2);
			}
		}
	}
	
	private void updateEquipSet() {
		JScrollPane scroll = MainFrame.getInstance().getScrollContent();
		int valueScroll = scroll.getVerticalScrollBar().getValue();
		
		Armor[] armors = new Armor[5];
		
		for(int i = 0; i < 5; i++) {
			armors[i] = this.getArmor(i);
		}
		
		EquipSet armorSet = new EquipSet(armors);
		
		if(!armorSet.equals(this.equipSet)) {
			if(armorSet.getCode().equals("-1")) {
				for (JCustomTextPane<BonusEquipSet> bonus : this.equipSetBonus) {
					bonus.setItem(new BonusEquipSet());
					bonus.setVisible(false);
				}
			} else {
				this.equipSetBonus.get(0).setItem(armorSet.getBonus3());
				this.equipSetBonus.get(1).setItem(armorSet.getBonus4());
				this.equipSetBonus.get(2).setItem(armorSet.getBonus5());
				
				this.equipSetBonus.forEach(e -> e.setVisible(true));
			}
		}
		
		this.equipSet = armorSet;
		updateShorcut();
		
		SwingUtilities.invokeLater( () -> scroll.getVerticalScrollBar().setValue(valueScroll) );
	}
	
	private void updateDetails(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			if(this.getArmor(id).getQuality() == Quality.RED) {
				this.fortif.get(id).setVisible(false);
				this.redFortif.get(id).setVisible(true);
				
				this.showAndHideRedEnchant.get(id).setVisible(this.getArmor(id).isEnchantable());
				
				if(this.redFortif.get(id).getSelectedIndex() != 0) {
					this.valueFortif.get(id).setVisible(true);
					this.labelValue.get(id).setVisible(true);
				} else {
					this.valueFortif.get(id).setVisible(false);
					this.labelValue.get(id).setVisible(false);
				}
			} else {
				this.fortif.get(id).setVisible(true);
				this.redFortif.get(id).setVisible(false);
				this.valueFortif.get(id).setVisible(false);
				this.labelValue.get(id).setVisible(false);

				this.showAndHideRedEnchant.get(id).setVisible(false);
			}
			
			if (id == 0) {
				this.pearl.get(id).setVisible(true);
			} else if (id == 1) {
				this.pearl.setRangeVisible(id, 2, true);
			} else {
				this.pearl.get(id+1).setVisible(true);
			}
		} else {
			this.fortif.get(id).setVisible(false);
			this.redFortif.get(id).setVisible(false);
			this.valueFortif.get(id).setVisible(false);
			this.labelValue.get(id).setVisible(false);
			
			if (id == 0) {
				this.pearl.get(id).setVisible(false);
				this.pearl.get(id).setSelectedIndex(0);
			} else if (id == 1) {
				this.pearl.setRangeVisible(id, 2, false);
				this.pearl.setRangeSelectedIndex(id, 2, 0);
			} else {
				this.pearl.get(id+1).setVisible(false);
				this.pearl.get(id+1).setSelectedIndex(0);
			}
		}
	}
	
	private void updateXpStuff(int id) {
		updateXpStuff(this.getArmor(id), id);
	}
	
	private void updatePearl(int index5) {
		if(index5 == 0) {
			Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(index5));
			tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(index5), this.pearl.get(index5).getSearch(), this.pearl.get(index5).getFilters(), this.pearl.get(index5).isAndValue());
			
			this.pearl.get(index5).setItems(tabPearl);
		} else if (index5 == 1) {
			Pearl[] tabPearl1 = Pearl.getPossibleArmorPearl(this.getArmor(index5));
			tabPearl1 = Pearl.applyFilters(tabPearl1, this.getPearl(index5), this.pearl.get(index5).getSearch(), this.pearl.get(index5).getFilters(), this.pearl.get(index5).isAndValue());
			
			Pearl[] tabPearl2 = Pearl.getPossibleArmorPearl(this.getArmor(index5));
			tabPearl2 = Pearl.applyFilters(tabPearl2, this.getPearl(index5+1), this.pearl.get(index5+1).getSearch(), this.pearl.get(index5+1).getFilters(), this.pearl.get(index5+1).isAndValue());
			
			this.pearl.get(index5).setItems(tabPearl1);
			this.pearl.get(index5+1).setItems(tabPearl2);
		} else {
			Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(index5));
			tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(index5+1), this.pearl.get(index5+1).getSearch(), this.pearl.get(index5+1).getFilters(), this.pearl.get(index5+1).isAndValue());
			
			this.pearl.get(index5+1).setItems(tabPearl);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			Armor idArmor = this.getArmor(id);
			
			if(idArmor.isEnchantable()) {
				if(idArmor.getQuality() == Quality.RED) {
					RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(idArmor, null, null);
					this.redEnchant.setRangeItems(id*3, 3, tabRed);
					
					RedEnchantment[] tabRefining = RedEnchantment.getPossibleRefining(idArmor);
					this.refining.setRangeItems(id*2, 2, tabRefining);
					
					this.showAndHideRedEnchant.get(id).setVisible(true);
					this.enchant.get(id).setVisible(false);
				} else {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(idArmor);
					this.enchant.get(id).setItems(tabEnchant);
					
					this.enchant.get(id).setVisible(true);
					this.showAndHideRedEnchant.get(id).setVisible(false);
				}
			} else {
				this.enchant.get(id).setVisible(false);
				this.showAndHideRedEnchant.get(id).setVisible(false);
			}
		} else {
			this.enchant.get(id).setVisible(false);
			this.showAndHideRedEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateEnchantPearl(int id) {
		boolean showStar = false;
		
		if(id == 0) {
			if(this.pearl.get(id).isVisible() && this.pearl.get(id).getSelectedIndex() > 0) {
				showStar = true;
			}
		} else if(id == 1) {
			for(int i = 1; i < 3; i++) {
				if(this.pearl.get(i).isVisible() && this.pearl.get(i).getSelectedIndex() > 0) {
					showStar = true;
					break;
				}
			}
		} else {
			if(this.pearl.get(id+1).isVisible() && this.pearl.get(id+1).getSelectedIndex() > 0) {
				showStar = true;
			}
		}
		
		updateEnchantPearl(showStar, id);
	}
	
	protected void updateTooltipFortif(int id) {
		updateTooltipFortif(this.getArmor(id), id);
	}
	
	protected void updateRedEnchant(int idRed) {
		updateRedEnchant(this.getArmor(idRed/3), idRed);
	}
	
	private void updateShortcutSet() {
		Set<String> setCode = new LinkedHashSet<>();
		setCode.add("-1");
		
		for(int i = 0; i < 5; i++) {
			setCode.add(this.getArmor(i).getSetCode());
		}
		
		EquipSet[] tabEquip = new EquipSet[setCode.size()];
		
		int indexTab = 0;
		Iterator<String> it = setCode.iterator();
		
		while(it.hasNext()) {
			String currentCode = it.next();
			
			for(EquipSet eachEquipSet : EquipSet.getDataArmor()) {
				if(eachEquipSet.getCode().equals(currentCode)) {
					tabEquip[indexTab] = eachEquipSet;
				}
			}
			
			indexTab++;
		}
		
		if(tabEquip.length == 1) {
			this.showAndHide.setVisible(false);
		} else {
			this.shortcutSet.setItems(tabEquip, null);
			this.showAndHide.setVisible(true);
		}
	}
	
	private void applySet() {
		EquipSet shortcutEquipSet = this.getShortcutSet();
		
		if(shortcutEquipSet.getCode().equals("-1")) {
			return;
		}
		
		for(int i = 0; i < 5; i++) {
			JCustomComboBox<Armor> piece = this.armor.get(i);
			
			for(int j = 0; j < piece.getItemCount(); j++) {
				if(piece.getItemAt(j).getSetCode().equals(shortcutEquipSet.getCode())) {
					piece.setSelectedIndex(j);
				}
			}
		}
		
		this.shortcutSet.setSelectedItem(shortcutEquipSet);
	}
	
	private void applyFortif() {
		this.fortif.setSelectedItem(this.getShortcutFortif());
	}
	
	private void applyEnchant() {
		Enchantment choice = this.getShortcutEnchant();
		
		for(JCustomComboBox<Enchantment> listEnchant : this.enchant.getList()) {
			for (int i = 0; i < listEnchant.getItemCount(); i++) {
				Enchantment eachEnchant = listEnchant.getItemAt(i);
				
				if(eachEnchant.getName(Language.FR).equals(choice.getName(Language.FR))) {
					listEnchant.setSelectedItem(eachEnchant);
					break;
				}
			}
		}
	}
	
	private void updateShorcut() {
		if(!this.equipSet.getCode().equals("-1")) {
			Equipment equip = null;
			
			for(int i = 0; i < this.armor.size(); i++) {
				if(this.getArmor(i).getSetCode().equals(this.equipSet.getCode())) {
					equip = this.getArmor(i);
					break;
				}
			}
			
			Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(equip);
			this.shortcutEnchant.setItems(tabEnchant);
		}
	}
	
	public void popoff() {
		for(JCompleteBox<Armor> box : this.armor.getList()) {
			if(box.isDialogVisible()) {
				box.popoff();
				updateArmor();
			}
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			if(this.pearl.get(i).isDialogVisible()) {
				this.pearl.get(i).popoff();
				
				if(i < 2) {
					Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(i));
					tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(i), this.pearl.get(i).getSearch(), this.pearl.get(i).getFilters(), this.pearl.get(i).isAndValue());
					
					this.pearl.get(i).setItems(tabPearl);
				} else {
					Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(i-1));
					tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(i), this.pearl.get(i).getSearch(), this.pearl.get(i).getFilters(), this.pearl.get(i).isAndValue());
					
					this.pearl.get(i).setItems(tabPearl);
				}
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
		
		for(int i = 0; i < this.armor.size(); i++) {
			if(this.getArmor(i).isCustom()) {
				config.put("Armor" + i, "Custom::" + this.getArmor(i).getName(Language.FR) + "::" + this.getArmor(i).getQuality() + "::" + this.getArmor(i).getSignature());
			} else {
				config.put("Armor" + i, this.getArmor(i).getName(Language.FR));
			}
		}
		
		config.putAll(this.enchant.getSaveConfig());
		config.putAll(this.fortif.getSaveConfig());
		config.putAll(this.pearl.getSaveConfig());
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = 3;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("StarPearl" + i, "" + select);
		}
		
		config.putAll(this.pearlEnchant.getSaveConfig());
		
		for(int i = 0; i < this.pearlLvlEnchant.size(); i++) {
			Integer value = this.getLvlPearlEnchant(i) != null ? this.getLvlPearlEnchant(i).getLvlbuff() : 0;
			config.put("PearlLvlEnchant" + i, "" + value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getSelectorInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			config.put("RedFortif" + i, this.getRedFortif(i).getName(Language.FR));
		}
		
		config.putAll(this.redEnchant.getSaveConfig());
		
		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			Integer value = this.getRedLvlEnchant(i) != null ? this.getRedLvlEnchant(i).getLvlbuff() : 0;
			config.put("RedLvlEnchantment" + i, "" + value);
		}
		
		for(int i = 0; i < this.refining.size(); i++) {
			String value = this.getRefining(i) != null ? this.getRefining(i).getName(Language.FR) : "";
			config.put("Refining" + i, value);
		}
		
		for(int i = 0; i < this.refiningLvl.size(); i++) {
			Integer value = this.getRefiningLvl(i) != null ? this.getRefiningLvl(i).getLvlbuff() : 0;
			config.put("RefiningLvl" + i, "" + value);
		}
		
		for(int i = 0; i < this.valueFortif.size(); i++) {
			config.put("ValueFortif" + i, "" + this.valueFortif.get(i).getValue());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		for(int i = 0; i < this.armor.size(); i++) {
			if(config.get("Armor" + i) != null && config.get("Armor" + i).startsWith("Custom")) {
				String[] valueSplit = config.get("Armor" + i).split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(valueSplit[2]);
				} catch (Exception e) {
					this.armor.get(i).setSelectedIndex(0);
				}
				
				if(quality != null) {
					Armor custom = Armor.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(custom == null) {
						if(CustomArmor.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageArmor.getInstance().updateArmor();
							
							custom = Armor.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.armor.get(i).setSelectedItem(custom);
						}
					} else {
						this.armor.get(i).setSelectedItem(custom);
					}
				}
			} else {
				this.armor.get(i).setSelectedItem(Armor.get(config.get("Armor" + i), Language.FR, i));
			}
		}
		
		for(int i = 0; i < this.enchant.size(); i++) {
			this.enchant.get(i).setSelectedItem(Enchantment.get(this.getArmor(i), config.get("Enchantment" + i)));
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			this.fortif.get(i).setSelectedItem(Fortification.get(config.get("Fortif" + i)));
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			this.pearl.get(i).setSelectedItem(Pearl.getArmor(config.get("Pearl" + i)));
			this.pearl.get(i).getProc().setSelected(Boolean.valueOf(config.get("PearlProc" + i)));
		}
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = Integer.parseInt(config.get("StarPearl" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
					updateStarPearl(i, j);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
		}
		
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			this.pearlEnchant.get(i).setSelectedItem(PearlEnchantment.get(config.get("PearlEnchant" + i)));
			
			PearlEnchantment pearlEnchant = this.getPearlEnchantment(i);
			
			if(pearlEnchant != null) {
				InnerEffect inner = pearlEnchant.getInnerEffect(Integer.valueOf(config.get("PearlLvlEnchant" + i)));
				this.pearlLvlEnchant.get(i).setSelectedItem(inner);
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			if(this.lvlXpStuff.get(i).getItemCount() > 0) {
				this.lvlXpStuff.get(i).setSelectedIndex(0);
			}
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			if(this.getArmor(i/2).getType() != ArmorType.NONE) {
				XpStuff xpStuff = XpStuff.get(this.getArmor(i/2), config.get("EffectXpStuff" + i));
				this.xpStuff.get(i).setSelectedItem(xpStuff);
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			XpStuff xpStuff = this.getXpStuff(i);
			if(xpStuff != null) {
				InnerEffect inner = xpStuff.getInnerEffect(Integer.valueOf(config.get("LvlXpStuff" + i)));
				this.lvlXpStuff.get(i).setSelectedItem(inner);
			}
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			if(this.getArmor(i).getQuality() == Quality.RED) {
				this.redFortif.get(i).setSelectedItem(RedFortification.get(config.get("RedFortif" + i)));
			}
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			if(this.getArmor(i/3).getQuality() == Quality.RED) {
				this.redEnchant.get(i).setSelectedItem(Enchantment.get(this.getArmor(i/3), config.get("RedEnchantment" + i)));
				
				RedEnchantment redEnchant = this.getRedEnchantment(i);
				
				if(redEnchant != null) {
					InnerEffect inner = redEnchant.getInnerEffect(Integer.valueOf(config.get("RedLvlEnchantment" + i)));
					this.redLvlEnchant.get(i).setSelectedItem(inner);
				}
			}
		}
		
		for(int i = 0; i < this.refining.size(); i++) {
			if(this.getArmor(i/3).getQuality() == Quality.RED) {
				this.refining.get(i).setSelectedItem(Enchantment.get(this.getArmor(i/3), config.get("Refining" + i)));
				
				RedEnchantment refining = this.getRefining(i);
				
				if(refining != null) {
					InnerEffect inner = refining.getInnerEffect(Integer.valueOf(config.get("RefiningLvl" + i)));
					this.refiningLvl.get(i).setSelectedItem(inner);
				}
			}
		}
		
		for(int i = 0; i < this.valueFortif.size(); i++) {
			if(this.getArmor(i).getQuality() == Quality.RED) {
				this.valueFortif.get(i).setValue(Integer.valueOf(config.get("ValueFortif" + i)));
			}
		}
		
		for(int i = 0; i < this.armor.size(); i++) {
			updateEnchant(i);
		}
		
		allowSetEffect(true);
	}
}
