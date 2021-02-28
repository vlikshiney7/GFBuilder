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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.InnerEffect;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equip.RedArmor;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomSlider;
import fr.vlik.uidesign.JCustomTextPane;
import fr.vlik.uidesign.JLangLabel;

public class PageArmor extends PagePanel implements ConvertEffect {

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
	private ArrayList<JCustomComboBox<TypeEffect>> effectXpStuff = new ArrayList<JCustomComboBox<TypeEffect>>(10);
	private ArrayList<JCustomComboBox<Integer>> lvlXpStuff = new ArrayList<JCustomComboBox<Integer>>(10);
	
	private ArrayList<JCustomComboBox<RedFortification>> redFortif = new ArrayList<JCustomComboBox<RedFortification>>(5);
	private ArrayList<JCustomComboBox<RedEnchantment>> redEnchant = new ArrayList<JCustomComboBox<RedEnchantment>>(15);
	private ArrayList<JCustomComboBox<InnerEffect>> redLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>(15);
	private ArrayList<JCustomSlider> valueFortif = new ArrayList<JCustomSlider>(5);
	private ArrayList<JLangLabel> labelValue = new ArrayList<JLangLabel>(5);
	
	private JPanel showAndHide = new JPanel();
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(5);
	
	private ArrayList<Calculable> convertEffects;
	
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
			this.armor.add(new JCustomComboBox<Armor>(new DefaultComboBoxModel<Armor>(tabArmor)));
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
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i).setVisible(false);
			} else if(i == 1) {
				this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
				this.pearl.get(i).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i).setVisible(false);
				this.pearl.get(i+1).setVisible(false);
			} else {
				this.pearl.get(i+1).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).setVisible(false);
			}
			
			/* XP STUFF */
			TypeEffect[] tabEffect = new TypeEffect[XpStuff.getDataArmor()[i].length +1];
			tabEffect[0] = TypeEffect.NONE;
			for(int j = 0; j < tabEffect.length-1; j++) {
				tabEffect[j+1] = XpStuff.getDataArmor()[i][j].getType();
			}
			
			for(int j = 0; j < 2; j++) {
				int duo = i*2+j;
				
				this.effectXpStuff.add(new JCustomComboBox<TypeEffect>(tabEffect));
				this.effectXpStuff.get(duo).addActionListener(e -> {
					updateLvlXpStuff(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.effectXpStuff.get(duo).setVisible(false);
				
				this.lvlXpStuff.add(new JCustomComboBox<Integer>());
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
	
	@Override
	public ArrayList<Calculable> getConvertEffects() {
		return this.convertEffects;
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

	public TypeEffect getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public Integer getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		ArrayList<Calculable> convert = new ArrayList<Calculable>();
		
		Armor[] armors = new Armor[5];
		ArrayList<InnerEffect> innerEffect = new ArrayList<InnerEffect>();
		
		for(int i = 0; i < armors.length; i++) {
			if(this.getArmor(i).getQuality() == Quality.RED) {
				armors[i] = new RedArmor((RedArmor) this.getArmor(i));
			} else {
				armors[i] = new Armor(this.getArmor(i));
			}
			
			armors[i].addEnchant(this.getEnchantment(i));
			
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
							innerEffect.add(this.getRedLvlEnchant(i*3+j));
						}
					}
				}
			} else {
				armors[i].addFortif(this.getFortif(i));
			}
			
			if(armors[i].getEffects() != null) {
				for(Calculable c : armors[i].getEffects()) {
					list.add(c);
				}
			}
		}
		
		for(InnerEffect effects : RedEnchantment.cumulConstraint(innerEffect)) {
			for(Calculable c : effects.getEffects()) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					
					if(e.getTransfert() == null) {
						list.add(c);
					} else {
						//convert.add(c);
					}
				} else {
					list.add(c);
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			if(this.getEffectXpStuff(i*2) == TypeEffect.NONE || this.getEffectXpStuff(i*2+1) == TypeEffect.NONE
				|| this.getEffectXpStuff(i*2) == this.getEffectXpStuff(i*2+1)) {
				continue;
			}
			
			for(int j = 0; j < 2; j++) {
				TypeEffect type = this.getEffectXpStuff(i*2+j);
				double valueXpStuff = XpStuff.getDataArmor()[i][this.effectXpStuff.get(i*2+j).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i*2+j).getSelectedIndex());
				
				list.add(new Effect(type, false, valueXpStuff, true));
			}
		}
		
		for(int i = 0; i < 5; i++) {
			if(this.getEffectXpStuff(i*2) != TypeEffect.NONE && this.getEffectXpStuff(i*2+1) != TypeEffect.NONE
					&& this.getEffectXpStuff(i*2) != this.getEffectXpStuff(i*2+1)) {
				int lvlXpStuff = this.lvlXpStuff.get(i*2).getSelectedIndex() + this.lvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(lvlXpStuff >= armors[i].getLvl() && armors[i].getBonusXP() != null) {
					for(Calculable c : armors[i].getBonusXP()) {
						list.add(c);
					}
				}
			}
		}
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = this.getPearl(i);
			if(pearl.isCumulable()) {
				if(pearl.getEffects() != null) {
					for(Calculable c : pearl.getEffects()) {
						list.add(c);
					}
				}
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				
				if(pearl.getEffects() != null) {
					for(Calculable c : pearl.getEffects()) {
						list.add(c);
					}
				}
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
			if(armorSet.getWith3() != null) {
				for(Calculable c : armorSet.getWith3()) {
					list.add(c);
				}
			}
			
			if(armorSet.getNbCurrentUsed() >= 4) {
				if(armorSet.getWith4() != null) {
					for(Calculable c : armorSet.getWith4()) {
						list.add(c);
					}
				}
				
				if(armorSet.getNbCurrentUsed() == 5) {
					if(armorSet.getWith5() != null) {
						for(Calculable c : armorSet.getWith5()) {
							list.add(c);
						}
					}
				}
			}
		}
		
		this.effects = list;
		this.convertEffects = convert;
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
			
			JPanel xpArmor = new JPanel(new GridLayout(1, 3, 10, 3));
			xpArmor.setBackground(Design.UIColor[1]);
			xpArmor.add(this.labelGFB[i+6]);
			this.labelGFB[i+6].setFont(Design.SUBTITLE);
			
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Design.UIColor[1]);
				xp.add(this.effectXpStuff.get(i*2+j));
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
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(xpArmor);
			
			this.showAndHideXpStuff.add(xpArmor);	
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		this.add(Box.createVerticalStrut(10));
		this.add(this.armorSetInfo);
		
		for(JPanel panel : this.showAndHideXpStuff) {
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
			Armor memory = this.getArmor(i);
			
			this.armor.get(i).setModel(new DefaultComboBoxModel<Armor>(tabArmor));
			this.armor.get(i).setSelectedItem(memory);
			
			if(!this.getArmor(i).equals(memory)) {
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
			this.showAndHideXpStuff.get(id).setVisible(true);	
			this.effectXpStuff.get(id*2).setVisible(true);
			this.effectXpStuff.get(id*2+1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.effectXpStuff.get(id*2).setVisible(false);
			this.effectXpStuff.get(id*2+1).setVisible(false);
			this.effectXpStuff.get(id*2).setSelectedIndex(0);
			this.effectXpStuff.get(id*2+1).setSelectedIndex(0);
		}
	}
	
	private void updatePearl(int id) {
		Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(id));
		
		if(id == 0) {
			Pearl memory = this.getPearl(id);
			
			this.pearl.get(id).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
			this.pearl.get(id).setSelectedItem(memory);
		} else if (id == 1) {
			Pearl memory = this.getPearl(id);
			
			this.pearl.get(id).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
			this.pearl.get(id).setSelectedItem(memory);
			
			memory = this.getPearl(id+1);
			
			this.pearl.get(id+1).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
			this.pearl.get(id+1).setSelectedItem(memory);
		} else {
			Pearl memory = this.getPearl(id+1);
			
			this.pearl.get(id+1).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
			this.pearl.get(id+1).setSelectedItem(memory);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			Armor armor = this.getArmor(id);
			
			if(armor.getQuality() == Quality.RED) {
				RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(armor, null, null);
				
				for(int i = 0; i < 3; i++) {
					RedEnchantment memory = this.getRedEnchantment(id*3+i);
					
					this.redEnchant.get(id*3+i).setModel(new DefaultComboBoxModel<RedEnchantment>(tabRed));
					this.redEnchant.get(id*3+i).setSelectedItem(memory);
					this.redEnchant.get(id*3+i).setVisible(true);
				}
				
				this.enchant.get(id).setVisible(false);
			} else {
				if(armor.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(armor);
					Enchantment memory = this.getEnchantment(id);
					
					this.enchant.get(id).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.enchant.get(id).setSelectedItem(memory);
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
	
	private void updateLvlXpStuff(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.getEffectXpStuff(id) == TypeEffect.NONE || this.getEffectXpStuff(indexPair) == TypeEffect.NONE
				|| this.getEffectXpStuff(id) == this.getEffectXpStuff(indexPair)) {
			
			this.lvlXpStuff.get(id).setVisible(false);
			this.lvlXpStuff.get(indexPair).setVisible(false);
			
			this.lvlXpStuff.get(id).setModel(new DefaultComboBoxModel<Integer>());
			this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>());
		} else {
			Integer[] tmp = new Integer[XpStuff.getDataArmor()[id/2][this.effectXpStuff.get(id).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = i+1;
			}
			
			Integer memory = this.getLvlXpStuff(id);
			this.lvlXpStuff.get(id).setModel(new DefaultComboBoxModel<Integer>(tmp));
			if(memory != null) {
				this.lvlXpStuff.get(id).setSelectedItem(memory);
			}
			
			tmp = new Integer[XpStuff.getDataArmor()[id/2][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = i+1;
			}
			
			memory = this.getLvlXpStuff(indexPair);
			this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
			if(memory != null) {
				this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
			}
			
			this.lvlXpStuff.get(id).setVisible(true);
			this.lvlXpStuff.get(indexPair).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.getEffectXpStuff(id) == TypeEffect.NONE || this.getEffectXpStuff(indexPair) == TypeEffect.NONE
				|| this.getEffectXpStuff(id) == this.getEffectXpStuff(indexPair)) {
			return;
		}
		
		int currentLvl = this.lvlXpStuff.get(id).getSelectedIndex()+1;
		
		int sizePair = XpStuff.getDataArmor()[id/2][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		
		
		Integer[] tmp = new Integer[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = i+1;
		}
		
		Integer memory = this.getLvlXpStuff(indexPair);
		this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
		this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
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
		
		this.redEnchant.get(ignore1).setModel(new DefaultComboBoxModel<RedEnchantment>(tabRed1));
		this.redEnchant.get(ignore1).setSelectedItem(memory1);
		
		this.redEnchant.get(ignore2).setModel(new DefaultComboBoxModel<RedEnchantment>(tabRed2));
		this.redEnchant.get(ignore2).setSelectedItem(memory2);
	}
	
	private void updateRedLvlEnchant(int id) {
		RedEnchantment redEnchant = this.getRedEnchantment(id);
		
		if(redEnchant != null && redEnchant.getInnerEffect() != null) {
			InnerEffect memory = this.getRedLvlEnchant(id);
			
			this.redLvlEnchant.get(id).setModel(new DefaultComboBoxModel<InnerEffect>(redEnchant.getInnerEffect()));
			
			if(memory != null) {
				this.redLvlEnchant.get(id).setSelectedItem(memory);
			} else {
				this.redLvlEnchant.get(id).setSelectedIndex(0);
			}
			
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
			this.shortcutSet.setModel(new DefaultComboBoxModel<EquipSet>(tabEquip));
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
			this.shortcutEnchant.setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
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
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			config.put("EffectXpStuff" + i, this.getEffectXpStuff(i).getInfo(lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			String value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).toString() : "0";
			config.put("LvlXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			config.put("RedFortif" + i, this.getRedFortif(i).getName());
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			String value = this.getRedEnchantment(i) != null ? this.getRedEnchantment(i).getName(Language.FR) : "";
			config.put("RedEnchantment" + i, value);
		}

		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			config.put("RedLvlEnchantment" + i, "" + this.getRedLvlEnchant(i));
		}

		for(int i = 0; i < this.valueFortif.size(); i++) {
			config.put("ValueFortif" + i, "" + this.valueFortif.get(i).getValue());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.armor.size(); i++) {
			Armor armor = null;
			if(config.get("Armor" + i) != null && config.get("Armor" + i).startsWith("Custom")) {
				String[] valueSplit = config.get("Armor" + i).split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(valueSplit[2]);
				} catch (Exception e) {
					this.armor.get(i).setSelectedIndex(0);
				}
				
				if(quality != null) {
					armor = Armor.getCustom(valueSplit[1], quality, valueSplit[3]);
					
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
				armor = Armor.get(config.get("Armor" + i), Language.FR, i);
				
				if(armor == null) {
					this.armor.get(i).setSelectedIndex(0);
				} else {
					this.armor.get(i).setSelectedItem(armor);
				}
			}
		}
		
		for(int i = 0; i < this.enchant.size(); i++) {
			this.enchant.get(i).setSelectedItem(Enchantment.get(this.getArmor(i), config.get("Enchantment" + i)));
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			Fortification fortif = Fortification.get(config.get("Fortif" + i));
			if(fortif == null) {
				this.fortif.get(i).setSelectedIndex(0);
			} else {
				this.fortif.get(i).setSelectedItem(fortif);
			}
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = Pearl.getArmor(config.get("Pearl" + i));
			if(pearl == null) {
				this.pearl.get(i).setSelectedIndex(0);
			} else {
				this.pearl.get(i).setSelectedItem(pearl);
			}
		}
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			this.effectXpStuff.get(i).setSelectedItem(TypeEffect.get(config.get("EffectXpStuff" + i), lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			this.lvlXpStuff.get(i).setSelectedItem(1);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			this.lvlXpStuff.get(i).setSelectedItem(Integer.valueOf(config.get("LvlXpStuff" + i)));
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			RedFortification redFortif = RedFortification.get(config.get("RedFortif" + i));
			if(redFortif == null) {
				this.redFortif.get(i).setSelectedIndex(0);
			} else {
				this.redFortif.get(i).setSelectedItem(redFortif);
			}
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			this.redEnchant.get(i).setSelectedItem(Enchantment.get(this.getArmor(i/3), config.get("RedEnchantment" + i)));
		}

		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			this.redLvlEnchant.get(i).setSelectedItem(config.get("RedLvlEnchantment" + i));
		}

		for(int i = 0; i < this.valueFortif.size(); i++) {
			this.valueFortif.get(i).setValue(Integer.valueOf(config.get("ValueFortif" + i)));
		}
		
		for(int i = 0; i < this.armor.size(); i++) {
			updateEnchant(i);
		}
	}
}
