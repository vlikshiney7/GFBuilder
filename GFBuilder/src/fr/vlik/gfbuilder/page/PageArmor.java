package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equip.RedArmor;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.equipUpgrade.PearlEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomSlider;
import fr.vlik.uidesign.JCustomTextPane;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageArmor extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "ARMOR";
	private static PageArmor INSTANCE = new PageArmor();
	
	private JCustomComboBox<EquipSet> shortcutSet;
	private JCustomComboBox<Fortification> shortcutFortif;
	private JCustomComboBox<Enchantment> shortcutEnchant;
	
	private ArrayList<JCustomComboBox<Armor>> armor = new ArrayList<JCustomComboBox<Armor>>(5);
	private EquipSet equipSet;
	private JCustomTextPane armorSetInfo;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(5);
	private ArrayList<JCustomComboBox<Fortification>> fortif = new ArrayList<JCustomComboBox<Fortification>>(5);
	private ArrayList<JCustomComboBox<Pearl>> pearl = new ArrayList<JCustomComboBox<Pearl>>(6);
	
	private ArrayList<ArrayList<JIconCheckBox>> starPearl = new ArrayList<ArrayList<JIconCheckBox>>(5);
	private ArrayList<JCustomComboBox<PearlEnchantment>> pearlEnchant = new ArrayList<JCustomComboBox<PearlEnchantment>>(25);
	private ArrayList<JCustomComboBox<InnerEffect>> pearlLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>(25);
	
	private ArrayList<JCustomComboBox<XpStuff>> xpStuff = new ArrayList<JCustomComboBox<XpStuff>>(10);
	private ArrayList<JCustomComboBox<InnerEffect>> lvlXpStuff = new ArrayList<JCustomComboBox<InnerEffect>>(10);
	
	private ArrayList<JCustomComboBox<RedFortification>> redFortif = new ArrayList<JCustomComboBox<RedFortification>>(5);
	private ArrayList<JCustomComboBox<RedEnchantment>> redEnchant = new ArrayList<JCustomComboBox<RedEnchantment>>(15);
	private ArrayList<JCustomComboBox<InnerEffect>> redLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>(15);
	private ArrayList<JCustomSlider> valueFortif = new ArrayList<JCustomSlider>(5);
	private ArrayList<JLangLabel> labelValue = new ArrayList<JLangLabel>(5);
	
	private JPanel showAndHide = new JPanel();
	private ArrayList<JPanel> showAndHideEnchant = new ArrayList<JPanel>(5);
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(5);
	
	private CustomList<InnerEffect> redEnchants = new CustomList<InnerEffect>();
	private CustomList<InnerEffect> pearlEnchants = new CustomList<InnerEffect>();
	
	public static PageArmor getInstance() {
		return INSTANCE;
	}

	public PageArmor() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.shortcutSet = new JCustomComboBox<EquipSet>(new EquipSet[] {});
		this.shortcutSet.addActionListener(e -> {
			applySet();
		});
		
		this.shortcutFortif = new JCustomComboBox<Fortification>(Fortification.getData());
		this.shortcutFortif.addActionListener(e -> {
			applyFortif();
		});
		
		this.shortcutEnchant = new JCustomComboBox<Enchantment>();
		this.shortcutEnchant.addActionListener(e -> {
			applyEnchant();
		});
		
		for(int i = 0; i < 5; i++) {
			int id = i;
			
			Armor[] tabArmor = Armor.getPossibleArmor(i, PageGeneral.getInstance().getGrade(), PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
			this.armor.add(new JCustomComboBox<Armor>(tabArmor));
			this.armor.get(i).addActionListener(e -> {				
				updateXpStuff(id);
				updateDetails(id);
				updatePearl(id);
				updateEnchant(id);
				
				updateShortcutSet();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* ENCHANTEMENT */
			this.enchant.add(new JCustomComboBox<Enchantment>());
			this.enchant.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.enchant.get(i).setVisible(false);
			
			/* FORTIF */
			this.fortif.add(new JCustomComboBox<Fortification>(Fortification.getData()));
			this.fortif.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.fortif.get(i).setVisible(false);
			
			/* RED FORTIF */
			this.redFortif.add(new JCustomComboBox<RedFortification>(RedFortification.getData()));
			this.redFortif.get(i).addActionListener(e -> {
				updateValueFortif(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.redFortif.get(i).setVisible(false);
			
			/* RED ENCHANT */
			for(int j = 0; j < 3; j++) {
				int idRed = i*3+j;
				this.redEnchant.add(new JCustomComboBox<RedEnchantment>());
				this.redEnchant.get(i*3+j).addActionListener(e -> {
					updateRedLvlEnchant(idRed);
					updateRedEnchant(idRed);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.redEnchant.get(i*3+j).setVisible(false);
				
				this.redLvlEnchant.add(new JCustomComboBox<InnerEffect>());
				this.redLvlEnchant.get(i*3+j).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.redLvlEnchant.get(i*3+j).setVisible(false);
			}
			
			/* VALUE FORTIF */
			this.valueFortif.add(new JCustomSlider(0.0, 1.0, 0.1));
			this.valueFortif.get(i).addChangeListener(e -> {
				updateTooltipFortif(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.valueFortif.get(i).setVisible(false);
			
			this.labelValue.add(new JLangLabel());
			this.labelValue.get(i).setVisible(false);
			
			
			/* PERLE */
			Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(i));
			
			this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
			
			if(i == 0) {
				this.pearl.get(i).addActionListener(e -> {
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i).setVisible(false);
			} else if(i == 1) {
				this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
				this.pearl.get(i).addActionListener(e -> {
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).addActionListener(e -> {
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i).setVisible(false);
				this.pearl.get(i+1).setVisible(false);
			} else {
				this.pearl.get(i+1).addActionListener(e -> {
					updateEnchantPearl(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).setVisible(false);
			}
			
			/* ENCHANT PEARL */
			this.starPearl.add(new ArrayList<JIconCheckBox>(4));
			
			for(int j = 0; j < 4; j++) {
				int idCheck = j;
				
				if(j == 0) {
					this.starPearl.get(i).add(new JIconCheckBox("starZero", "starOff"));
					this.starPearl.get(i).get(0).setSelected(true);
				} else {
					this.starPearl.get(i).add(new JIconCheckBox("starOn", "starOff"));
				}
				
				this.starPearl.get(i).get(j).addActionListener(e -> {
					updateStarPearl(id, idCheck);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.starPearl.get(i).get(j).setVisible(false);
				this.labelGFB[i+11].setVisible(false);
			}
			
			for(int j = 0; j < 5; j++) {
				int idPearl = i*5+j;
				
				this.pearlEnchant.add(new JCustomComboBox<PearlEnchantment>(PearlEnchantment.getData()));
				this.pearlEnchant.get(idPearl).addActionListener(e -> {
					updatePearlLvlEnchant(idPearl);
					updatePearlEnchant(idPearl);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearlEnchant.get(idPearl).setVisible(false);
				
				this.pearlLvlEnchant.add(new JCustomComboBox<InnerEffect>());
				this.pearlLvlEnchant.get(idPearl).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearlLvlEnchant.get(idPearl).setVisible(false);
			}
			
			/* XP STUFF */
			for(int j = 0; j < 2; j++) {
				int duo = i*2+j;
				
				this.xpStuff.add(new JCustomComboBox<XpStuff>());
				this.xpStuff.get(duo).addActionListener(e -> {
					updateLvlXpStuff(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.xpStuff.get(duo).setVisible(false);
				
				this.lvlXpStuff.add(new JCustomComboBox<InnerEffect>());
				this.lvlXpStuff.get(duo).addActionListener(e -> {
					updateMaxLvlValue(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.lvlXpStuff.get(duo).setVisible(false);
			}
		}
		
		this.armorSetInfo = new JCustomTextPane();
		
		updateLanguage(Language.FR);
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
	
	public JCustomTextPane getArmorSetInfo() {
		return this.armorSetInfo;
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
	}

	public Fortification getFortif(int id) {
		return this.fortif.get(id).getSelectedItem();
	}
	
	public RedEnchantment getRedEnchantment(int id) {
		return this.redEnchant.get(id).getSelectedItem();
	}

	public RedFortification getRedFortif(int id) {
		return this.redFortif.get(id).getSelectedItem();
	}
	
	public InnerEffect getRedLvlEnchant(int id) {
		return this.redLvlEnchant.get(id).getSelectedItem();
	}

	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}
	
	public PearlEnchantment getPearlEnchantment(int id) {
		return this.pearlEnchant.get(id).getSelectedItem();
	}
	
	public InnerEffect getLvlPearlEnchant(int id) {
		return this.pearlLvlEnchant.get(id).getSelectedItem();
	}

	public XpStuff getXpStuff(int id) {
		return this.xpStuff.get(id).getSelectedItem();
	}

	public InnerEffect getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		this.redEnchants.clear();
		this.pearlEnchants.clear();
		
		Armor[] armors = new Armor[5];
		
		for(int i = 0; i < armors.length; i++) {
			if(this.getArmor(i).getQuality() == Quality.RED) {
				armors[i] = new RedArmor((RedArmor) this.getArmor(i));
			} else {
				armors[i] = new Armor(this.getArmor(i));
			}
			
			if(armors[i] instanceof RedArmor) {
				RedFortification fortif = this.getRedFortif(i);
				
				if(fortif.getCoef() != 1) {
					((RedArmor) armors[i]).addFortif(this.valueFortif.get(i).getDoubleValue());
					list.addAll(((RedArmor) armors[i]).getStarEffects(fortif.getStar()));
				}
				
				for(int j = 0; j < 3; j++) {
					if(this.redEnchant.get(i*3+j).getSelectedIndex() != 0) {
						RedEnchantment red = this.getRedEnchantment(i*3+j);
						
						if(red != null) {
							this.redEnchants.add(this.getRedLvlEnchant(i*3+j));
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
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = this.getPearl(i);
			if(pearl.isCumulable()) {
				list.addAll(pearl);
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				list.addAll(pearl);
			}
		}
		
		EquipSet armorSet = new EquipSet(armors);
		
		if(!armorSet.equals(this.equipSet)) {
			if(armorSet.getNbCurrentUsed() >= 3 && !armorSet.getName().equals("Rien")) {
				String setInfo = armorSet.getName() + "\n";
				
				setInfo += "3 pièces équipées " + (armorSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
				if(armorSet.getWith3() != null) {
					for(int i = 0; i < armorSet.getWith3().length; i++) {
						setInfo += "\t- " + armorSet.getWith3()[i].toString(Language.FR) + "\n";
					}
				}
				
				setInfo += "4 pièces équipées " + (armorSet.getNbCurrentUsed() >= 4 ? "(Actif) " : "") + ":\n";
				if(armorSet.getWith4() != null) {
					for(int i = 0; i < armorSet.getWith4().length; i++) {
						setInfo += "\t- " + armorSet.getWith4()[i].toString(Language.FR) + "\n";
					}
				}
				
				setInfo += "5 pièces équipées " + (armorSet.getNbCurrentUsed() >= 5 ? "(Actif) " : "") + ":\n";
				if(armorSet.getWith5() != null) {
					for(int i = 0; i < armorSet.getWith5().length; i++) {
						setInfo += "\t- " + armorSet.getWith5()[i].toString(Language.FR) + "\n";
					}
				}
				
				this.armorSetInfo.setText(setInfo);
				this.armorSetInfo.setVisible(true);
				
				this.equipSet = armorSet;
				updateShorcut();
			} else {
				this.armorSetInfo.setVisible(false);
			}
		}
		
		if(armorSet.getNbCurrentUsed() >= 3) {
			list.addAll(armorSet.getWith3());
			
			if(armorSet.getNbCurrentUsed() >= 4) {
				list.addAll(armorSet.getWith4());
				
				if(armorSet.getNbCurrentUsed() == 5) {
					list.addAll(armorSet.getWith5());
				}
			}
		}
		
		this.effects = list;
	}
	
	public ArrayList<InnerEffect> getRedEnchant() {
		return this.redEnchants;
	}
	
	public ArrayList<InnerEffect> getPearlEnchant() {
		return this.pearlEnchants;
	}
	
	@Override
	protected void createPanel() {
		
		this.showAndHide.setLayout(new BoxLayout(this.showAndHide, BoxLayout.Y_AXIS));
		this.showAndHide.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.showAndHide.setBackground(Design.UIColor[1]);
		this.showAndHide.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		this.showAndHide.add(Box.createVerticalStrut(10));
		this.showAndHide.add(this.shortcutSet);
		this.showAndHide.add(Box.createVerticalStrut(5));
		this.showAndHide.add(this.shortcutFortif);
		this.showAndHide.add(Box.createVerticalStrut(5));
		this.showAndHide.add(this.shortcutEnchant);
		this.showAndHide.setVisible(false);
		
		this.add(showAndHide);
		
		for(int i = 0; i < 5; i++) {
			JPanel descArmor = new JPanel();
			descArmor.setLayout(new BoxLayout(descArmor, BoxLayout.X_AXIS));
			descArmor.setBackground(Design.UIColor[1]);
			descArmor.add(this.armor.get(i));
			descArmor.add(this.enchant.get(i));
			descArmor.add(this.fortif.get(i));
			descArmor.add(this.redFortif.get(i));
			
			JPanel enchantArmor = new JPanel();
			enchantArmor.setLayout(new BoxLayout(enchantArmor, BoxLayout.X_AXIS));
			enchantArmor.setBackground(Design.UIColor[1]);
			for(int j = 0; j < 3; j++) {
				enchantArmor.add(Box.createHorizontalStrut(10));
				enchantArmor.add(this.redEnchant.get(i*3+j));
				enchantArmor.add(this.redLvlEnchant.get(i*3+j));
			}
			
			JPanel fortifArmor = new JPanel();
			fortifArmor.setLayout(new BoxLayout(fortifArmor, BoxLayout.X_AXIS));
			fortifArmor.setBackground(Design.UIColor[1]);
			fortifArmor.add(this.valueFortif.get(i));
			fortifArmor.add(Box.createHorizontalStrut(5));
			fortifArmor.add(this.labelValue.get(i));
			
			JPanel pearlArmor = new JPanel();
			pearlArmor.setLayout(new BoxLayout(pearlArmor, BoxLayout.Y_AXIS));
			pearlArmor.setBackground(Design.UIColor[1]);
			
			if(i == 0) {
				pearlArmor.add(this.pearl.get(i));
				pearlArmor.add(Box.createVerticalStrut(3));
			} else if (i == 1) {
				pearlArmor.add(this.pearl.get(i));
				pearlArmor.add(Box.createVerticalStrut(3));
				pearlArmor.add(this.pearl.get(i+1));
				pearlArmor.add(Box.createVerticalStrut(3));
			} else {
				pearlArmor.add(this.pearl.get(i+1));
				pearlArmor.add(Box.createVerticalStrut(3));
			}
			
			JPanel starPanel = new JPanel();
			starPanel.setBackground(Design.UIColor[1]);
			starPanel.add(this.labelGFB[i+11]);
			this.labelGFB[i+11].setFont(Design.SUBTITLE);
			starPanel.add(Box.createHorizontalStrut(10));
			
			for(int j = 0; j < 4; j++) {
				starPanel.add(this.starPearl.get(i).get(j));
			}
			
			JPanel listEnchant = new JPanel(new GridLayout(5, 2, 2, 5));
			listEnchant.setBackground(Design.UIColor[1]);
			for(int j = 0; j < 5; j++) {
				listEnchant.add(this.pearlEnchant.get(i*5+j));
				listEnchant.add(this.pearlLvlEnchant.get(i*5+j));
			}
			
			JPanel xpArmor = new JPanel(new GridLayout(1, 3, 10, 3));
			xpArmor.setBackground(Design.UIColor[1]);
			xpArmor.add(this.labelGFB[i+6]);
			this.labelGFB[i+6].setFont(Design.SUBTITLE);
			
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Design.UIColor[1]);
				xp.add(this.xpStuff.get(i*2+j));
				xp.add(this.lvlXpStuff.get(i*2+j));
				xpArmor.add(xp);
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.labelGFB[i+1]);
			this.labelGFB[i+1].setFont(Design.TITLE);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descArmor);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(enchantArmor);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(fortifArmor);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(pearlArmor);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(starPanel);
			elemI.add(listEnchant);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(xpArmor);
			
			this.showAndHideEnchant.add(listEnchant);
			this.showAndHideXpStuff.add(xpArmor);	
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		this.add(Box.createVerticalStrut(10));
		this.add(this.armorSetInfo);
		
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
		
		for(JPanel panel : this.showAndHideEnchant) {
			panel.setVisible(false);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
	}
	
	public void updateArmor() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < 5; i++) {
			Armor[] tabArmor = Armor.getPossibleArmor(i, grade, lvl, reinca);
			
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
				
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
	}
	
	private void updateDetails(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			if(this.getArmor(id).getQuality() == Quality.RED) {
				this.fortif.get(id).setVisible(false);
				this.redFortif.get(id).setVisible(true);
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(true);
				}
				
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

				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(false);
				}
			}
			
			if (id == 0) {
				this.pearl.get(id).setVisible(true);
			} else if (id == 1) {
				this.pearl.get(id).setVisible(true);
				this.pearl.get(id+1).setVisible(true);
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
				this.pearl.get(id).setVisible(false);
				this.pearl.get(id+1).setVisible(false);
				this.pearl.get(id).setSelectedIndex(0);
				this.pearl.get(id+1).setSelectedIndex(0);
			} else {
				this.pearl.get(id+1).setVisible(false);
				this.pearl.get(id+1).setSelectedIndex(0);
			}
		}
	}
	
	private void updateXpStuff(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getArmor(id));
			
			this.xpStuff.get(id*2).setItems(xpStuff);
			this.xpStuff.get(id*2+1).setItems(xpStuff);
			
			this.showAndHideXpStuff.get(id).setVisible(true);	
			this.xpStuff.get(id*2).setVisible(true);
			this.xpStuff.get(id*2+1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.xpStuff.get(id*2).setVisible(false);
			this.xpStuff.get(id*2+1).setVisible(false);
			
			if(this.getXpStuff(id*2) != null && this.getXpStuff(id*2+1) != null) {
				this.xpStuff.get(id*2).setSelectedIndex(0);
				this.xpStuff.get(id*2+1).setSelectedIndex(0);
			}
		}
	}
	
	private void updatePearl(int id) {
		Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(id));
		
		if(id == 0) {
			this.pearl.get(id).setItems(tabPearl);
		} else if (id == 1) {
			this.pearl.get(id).setItems(tabPearl);
			this.pearl.get(id+1).setItems(tabPearl);
		} else {
			this.pearl.get(id+1).setItems(tabPearl);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			Armor armor = this.getArmor(id);
			
			if(armor.getQuality() == Quality.RED) {
				RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(armor, null, null);
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setItems(tabRed);
					this.redEnchant.get(id*3+i).setVisible(true);
				}
				
				this.enchant.get(id).setVisible(false);
			} else {
				if(armor.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(armor);
					this.enchant.get(id).setItems(tabEnchant);
					this.enchant.get(id).setVisible(true);
				} else {
					this.enchant.get(id).setVisible(false);
				}
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(false);
					this.redLvlEnchant.get(id*3+i).setVisible(false);
				}
			}
		} else {
			this.enchant.get(id).setVisible(false);

			for(int i = 0; i < 3; i++) {
				this.redEnchant.get(id*3+i).setVisible(false);
				this.redLvlEnchant.get(id*3+i).setVisible(false);
			}
		}
	}
	
	public void initPearlEnchant() {
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			this.pearlEnchant.get(i).setSelectedIndex(i%5);
		}
		
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			this.pearlEnchant.get(i).setSelectedIndex(0);
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
		
		this.showAndHideEnchant.get(id).setVisible(showStar);
		
		int idCheck = -1;
		for(int i = 0; i < 4; i++) {
			this.starPearl.get(id).get(i).setVisible(showStar);
			this.labelGFB[id+11].setVisible(showStar);
			
			if(this.starPearl.get(id).get(i).isSelected()) {
				idCheck++;
			}
		}
		
		if(!showStar) {
			for(int j = 0; j < 5; j++) {
				this.pearlEnchant.get(id*5+j).setVisible(false);
				this.pearlLvlEnchant.get(id*5+j).setVisible(false);
			}
		} else {
			updateStarPearl(id, idCheck);
		}
	}
	
	private void updateStarPearl(int id, int idCheck) {
		for(int i = 0; i < this.starPearl.get(id).size(); i++) {
			if(i <= idCheck) {
				this.starPearl.get(id).get(i).setSelected(true);
			} else {
				this.starPearl.get(id).get(i).setSelected(false);
			}
		}
		
		switch (idCheck) {
			case 0:
				this.showAndHideEnchant.get(id).setVisible(false);
				for(int i = 0; i < 5; i++) {
					this.pearlEnchant.get(id*5+i).setVisible(false);
					this.pearlLvlEnchant.get(id*5+i).setVisible(false);
				}
				break;
			case 1:
				for(int i = 0; i < 5; i++) {
					this.showAndHideEnchant.get(id).setVisible(true);
					if(i < 1) {
						this.pearlEnchant.get(id*5+i).setVisible(true);
						this.pearlLvlEnchant.get(id*5+i).setVisible(true);
						updatePearlLvlEnchant(id*5+i);
					} else {
						this.pearlEnchant.get(id*5+i).setVisible(false);
						this.pearlLvlEnchant.get(id*5+i).setVisible(false);
					}
				}
				break;
			case 2:
				for(int i = 0; i < 5; i++) {
					this.showAndHideEnchant.get(id).setVisible(true);
					if(i < 3) {
						this.pearlEnchant.get(id*5+i).setVisible(true);
						this.pearlLvlEnchant.get(id*5+i).setVisible(true);
						updatePearlLvlEnchant(id*5+i);
					} else {
						this.pearlEnchant.get(id*5+i).setVisible(false);
						this.pearlLvlEnchant.get(id*5+i).setVisible(false);
					}
				}
				break;
			case 3:
				this.showAndHideEnchant.get(id).setVisible(true);
				for(int i = 0; i < 5; i++) {
					this.pearlEnchant.get(id*5+i).setVisible(true);
					this.pearlLvlEnchant.get(id*5+i).setVisible(true);
					updatePearlLvlEnchant(id*5+i);
				}
				break;
		}
	}
	
	private void updatePearlEnchant(int idPearl) {
		int ignore1;
		int ignore2;
		int ignore3;
		int ignore4;
		
		if(idPearl % 5 == 0) {
			ignore1 = idPearl + 1;
			ignore2 = idPearl + 2;
			ignore3 = idPearl + 3;
			ignore4 = idPearl + 4;
		} else if(idPearl % 5 == 1) {
			ignore1 = idPearl - 1;
			ignore2 = idPearl + 1;
			ignore3 = idPearl + 2;
			ignore4 = idPearl + 3;
		} else if(idPearl % 5 == 2) {
			ignore1 = idPearl - 2;
			ignore2 = idPearl - 1;
			ignore3 = idPearl + 1;
			ignore4 = idPearl + 2;
		} else if(idPearl % 5 == 3) {
			ignore1 = idPearl - 3;
			ignore2 = idPearl - 2;
			ignore3 = idPearl - 1;
			ignore4 = idPearl + 1;
		} else {
			ignore1 = idPearl - 4;
			ignore2 = idPearl - 3;
			ignore3 = idPearl - 2;
			ignore4 = idPearl - 1;
		}
		
		PearlEnchantment choice = this.getPearlEnchantment(idPearl);
		PearlEnchantment memory1 = this.getPearlEnchantment(ignore1);
		PearlEnchantment memory2 = this.getPearlEnchantment(ignore2);
		PearlEnchantment memory3 = this.getPearlEnchantment(ignore3);
		PearlEnchantment memory4 = this.getPearlEnchantment(ignore4);
		
		PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant(choice, memory2, memory3, memory4);
		PearlEnchantment[] tabPearl2 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory3, memory4);
		PearlEnchantment[] tabPearl3 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory2, memory4);
		PearlEnchantment[] tabPearl4 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory2, memory3);
		
		this.pearlEnchant.get(ignore1).setItems(tabPearl1, memory1);
		this.pearlEnchant.get(ignore2).setItems(tabPearl2, memory2);
		this.pearlEnchant.get(ignore3).setItems(tabPearl3, memory3);
		this.pearlEnchant.get(ignore4).setItems(tabPearl4, memory4);
	}
	
	private void updatePearlLvlEnchant(int id) {
		int nbStar = -1;
		for(JIconCheckBox star : this.starPearl.get(id/5)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		PearlEnchantment pearlEnchant = this.getPearlEnchantment(id);
		
		if(pearlEnchant != null) {
			this.pearlLvlEnchant.get(id).setItems(pearlEnchant.getInnerLvlEffect(nbStar));
			this.pearlLvlEnchant.get(id).setVisible(this.pearlEnchant.get(id).isVisible());
		} else {
			this.pearlLvlEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateLvlXpStuff(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(!XpStuff.availableEffects(this.getXpStuff(id), this.getXpStuff(indexPair))) {
			
			this.lvlXpStuff.get(id).setVisible(false);
			this.lvlXpStuff.get(indexPair).setVisible(false);
		} else {
			XpStuff xpStuff = this.getXpStuff(id);
			XpStuff xpStuffDuo = this.getXpStuff(indexPair);
			
			this.lvlXpStuff.get(id).setItems(xpStuff.getInnerEffect());
			this.lvlXpStuff.get(indexPair).setItems(xpStuffDuo.getInnerEffect());
			
			this.lvlXpStuff.get(id).setVisible(true);
			this.lvlXpStuff.get(indexPair).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(XpStuff.availableEffects(this.getXpStuff(id), this.getXpStuff(indexPair))) {
			InnerEffect[] inner = this.getXpStuff(indexPair).getPossibleLvl(this.getLvlXpStuff(id));
			this.lvlXpStuff.get(indexPair).setItems(inner);
		}
	}
	
	private void updateValueFortif(int id) {
		RedFortification fortif = this.getRedFortif(id);
		
		this.valueFortif.get(id).setDoubleMinimum(fortif.getCoefMin()*100);
		this.valueFortif.get(id).setDoubleMaximum(fortif.getCoefMax()*100);
		this.valueFortif.get(id).setDoubleValue(fortif.getCoef()*100);
		
		if(fortif.getCoef() == 1) {
			this.valueFortif.get(id).setVisible(false);
			this.labelValue.get(id).setVisible(false);
		} else {
			this.valueFortif.get(id).setVisible(true);
			this.labelValue.get(id).setVisible(true);
		}
	}
	
	private void updateTooltipFortif(int id) {
		Armor armor = this.getArmor(id);
		double current = this.valueFortif.get(id).getDoubleValue() - 100;
		current = current / 100 +1;
		
		String tooltip = "";
		
		if(armor.getEffects() != null) {
			for(Calculable calculable : armor.getEffects()) {
				if(calculable instanceof Effect) {
					Effect effect = (Effect) calculable;
					
					if(effect.isPercent()) {
						continue;
					}
					
					if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
						continue;
					}
					
					tooltip += effect.toString() + " +" + ((int) (effect.getValue() * current - effect.getValue())) + "<br>";
				}
			}
		}
		
		this.labelValue.get(id).setText("<html>" + tooltip + "</html>");
	}
	
	private void updateRedEnchant(int idRed) {
		int ignore1;
		int ignore2;
		
		if(idRed % 3 == 0) {
			ignore1 = idRed + 1;
			ignore2 = idRed + 2;
		} else if(idRed % 3 == 1) {
			ignore1 = idRed - 1;
			ignore2 = idRed + 1;
		} else {
			ignore1 = idRed - 2;
			ignore2 = idRed - 1;
		}
		
		RedEnchantment choice = this.getRedEnchantment(idRed);
		RedEnchantment memory1 = this.getRedEnchantment(ignore1);
		RedEnchantment memory2 = this.getRedEnchantment(ignore2);
		
		RedEnchantment[] tabRed1 = RedEnchantment.getPossibleRedEnchant(this.getArmor(idRed/3), choice, memory2);
		RedEnchantment[] tabRed2 = RedEnchantment.getPossibleRedEnchant(this.getArmor(idRed/3), choice, memory1);
		
		this.redEnchant.get(ignore1).setItems(tabRed1, memory1);
		this.redEnchant.get(ignore2).setItems(tabRed2, memory2);
	}
	
	private void updateRedLvlEnchant(int id) {
		RedEnchantment redEnchant = this.getRedEnchantment(id);
		
		if(redEnchant != null && redEnchant.getInnerEffect() != null) {
			this.redLvlEnchant.get(id).setItems(redEnchant.getInnerEffect());
			this.redLvlEnchant.get(id).setVisible(true);
		} else {
			this.redLvlEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateShortcutSet() {
		Set<String> setCode = new LinkedHashSet<String>();
		setCode.add("-1");
		
		for(int i = 0; i < 5; i++) {
			Armor armor = this.getArmor(i);
			setCode.add(armor.getSetCode());
		}
		
		EquipSet[] tabEquip = new EquipSet[setCode.size()];
		
		int indexTab = 0;
		Iterator<String> it = setCode.iterator();
		
		while(it.hasNext()) {
			String currentCode = it.next();
			
			for(EquipSet equipSet : EquipSet.getDataArmor()) {
				if(equipSet.getCode().equals(currentCode)) {
					tabEquip[indexTab] = equipSet;
				}
			}
			
			indexTab++;
		}
		
		if(tabEquip.length == 1) {
			this.showAndHide.setVisible(false);
		} else {
			this.shortcutSet.setItems(tabEquip);
			this.showAndHide.setVisible(true);
		}
	}
	
	private void applySet() {
		EquipSet equipSet = this.getShortcutSet();
		
		if(equipSet.getCode().equals("-1")) {
			return;
		}
		
		for(int i = 0; i < 5; i++) {
			JCustomComboBox<Armor> piece = this.armor.get(i);
			
			for(int j = 0; j < piece.getItemCount(); j++) {
				if(piece.getItemAt(j).getSetCode().equals(equipSet.getCode())) {
					piece.setSelectedIndex(j);
				}
			}
		}
		
		this.shortcutSet.setSelectedItem(equipSet);
	}
	
	private void applyFortif() {
		for(JCustomComboBox<Fortification> fortif : this.fortif) {
			fortif.setSelectedItem(this.getShortcutFortif());
		}
	}
	
	private void applyEnchant() {
		Enchantment choice = this.getShortcutEnchant();
		for(JCustomComboBox<Enchantment> listEnchant : this.enchant) {
			for (int i = 0; i < listEnchant.getItemCount(); i++) {
				Enchantment enchant = listEnchant.getItemAt(i);
				
				if(enchant.getName(Language.FR).equals(choice.getName(Language.FR))) {
					listEnchant.setSelectedItem(enchant);
					break;
				}
			}
		}
	}
	
	private void updateShorcut() {
		if(!this.equipSet.getName().equals("-1")) {
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
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.armor.size(); i++) {
			if(this.getArmor(i).isCustom()) {
				config.put("Armor" + i, "Custom::" + this.getArmor(i).getName(Language.FR) + "::" + this.getArmor(i).getQuality() + "::" + this.getArmor(i).getSignature());
			} else {
				config.put("Armor" + i, this.getArmor(i).getName(Language.FR));
			}
		}
		
		for(int i = 0; i < this.enchant.size(); i++) {
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName(Language.FR) : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			config.put("Fortif" + i, this.getFortif(i).getName());
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			config.put("Pearl" + i, this.getPearl(i).getName(Language.FR));
		}
		
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
		
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			String value = this.getPearlEnchantment(i) != null ? this.getPearlEnchantment(i).getInfo(lang) : "";
			config.put("PearlEnchant" + i, value);
		}
		
		for(int i = 0; i < this.pearlLvlEnchant.size(); i++) {
			Integer value = this.getLvlPearlEnchant(i) != null ? this.getLvlPearlEnchant(i).getLvlbuff() : 0;
			config.put("PearlLvlEnchant" + i, "" + value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			config.put("RedFortif" + i, this.getRedFortif(i).getName());
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			String value = this.getRedEnchantment(i) != null ? this.getRedEnchantment(i).getName(Language.FR) : "";
			config.put("RedEnchantment" + i, value);
		}

		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			Integer value = this.getRedLvlEnchant(i) != null ? this.getRedLvlEnchant(i).getLvlbuff() : 0;
			config.put("RedLvlEnchantment" + i, "" + value);
		}

		for(int i = 0; i < this.valueFortif.size(); i++) {
			config.put("ValueFortif" + i, "" + this.valueFortif.get(i).getValue());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
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
					Armor armor = Armor.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(armor == null) {
						if(CustomArmor.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageArmor.getInstance().updateArmor();
							
							armor = Armor.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.armor.get(i).setSelectedItem(armor);
						}
					} else {
						this.armor.get(i).setSelectedItem(armor);
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
		}
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = Integer.valueOf(config.get("StarPearl" + i));
			
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
			this.redFortif.get(i).setSelectedItem(RedFortification.get(config.get("RedFortif" + i)));
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			this.redEnchant.get(i).setSelectedItem(Enchantment.get(this.getArmor(i/3), config.get("RedEnchantment" + i)));
			
			RedEnchantment redEnchant = this.getRedEnchantment(i);
			
			if(redEnchant != null) {
				InnerEffect inner = redEnchant.getInnerEffect(Integer.valueOf(config.get("RedLvlEnchantment" + i)));
				this.redLvlEnchant.get(i).setSelectedItem(inner);
			}
		}

		for(int i = 0; i < this.valueFortif.size(); i++) {
			this.valueFortif.get(i).setValue(Integer.valueOf(config.get("ValueFortif" + i)));
		}
		
		for(int i = 0; i < this.armor.size(); i++) {
			updateEnchant(i);
		}
	}
}
