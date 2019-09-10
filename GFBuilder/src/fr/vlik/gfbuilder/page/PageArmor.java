package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Util;
import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Armor;
import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.EquipSet;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTextPane;

public class PageArmor extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageArmor INSTANCE = new PageArmor();
	
	private ArrayList<JCustomComboBox<Armor>> armor = new ArrayList<JCustomComboBox<Armor>>(5);
	private JCustomTextPane armorSetInfo;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(5);
	private ArrayList<JCustomComboBox<String>> fortif = new ArrayList<JCustomComboBox<String>>(5);
	private ArrayList<JCustomComboBox<Pearl>> pearl = new ArrayList<JCustomComboBox<Pearl>>(6);
	private ArrayList<JCustomComboBox<String>> effectXpStuff = new ArrayList<JCustomComboBox<String>>(10);
	private ArrayList<JCustomComboBox<String>> lvlXpStuff = new ArrayList<JCustomComboBox<String>>(10);
	
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(10);
	
	public static PageArmor getInstance() {
		return INSTANCE;
	}

	public PageArmor() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 5; i++) {
			Armor[] tabArmor = Armor.getPossibleArmor(i, PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl(), false);
			this.armor.add(new JCustomComboBox<Armor>(new DefaultComboBoxModel<Armor>(tabArmor)));
			this.armor.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.armor.get(i).setRenderer(new CustomListCellRenderer());
			
			int id = i;
			this.armor.get(i).addActionListener(e -> {				
				updateXpStuff(id);
				updateDetails(id);
				updatePearl(id);
				updateEnchant(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* ENCHANTEMENT */
			this.enchant.add(new JCustomComboBox<Enchantment>());
			this.enchant.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.enchant.get(i).setRenderer(new CustomListCellRenderer());
			this.enchant.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.enchant.get(i).setVisible(false);
			
			/* FORTIF */
			String nameFortif[] = { "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "+10", "+11", "+12", "+13", "+14", "+15", "+16", "+17", "+18", "+19", "+20" };
			this.fortif.add(new JCustomComboBox<String>(nameFortif));
			this.fortif.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.fortif.get(i).setRenderer(new CustomListCellRenderer());
			this.fortif.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.fortif.get(i).setVisible(false);
			
			/* PERLE */
			Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getArmor(i).getQuality());
			
			this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
			
			if(i == 0) {
				this.pearl.get(i).setRenderer(new CustomListCellRenderer());
				this.pearl.get(i).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i).setVisible(false);
			} else if(i == 1) {
				this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
				this.pearl.get(i).setRenderer(new CustomListCellRenderer());
				this.pearl.get(i+1).setRenderer(new CustomListCellRenderer());
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
				this.pearl.get(i+1).setRenderer(new CustomListCellRenderer());
				this.pearl.get(i+1).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearl.get(i+1).setVisible(false);
			}
			
			/* XP STUFF */
			String[] tmp = new String[XpStuff.getDataArmor()[i].length +1];
			tmp[0] = "Rien";
			for(int j = 0; j < tmp.length-1; j++) {
				tmp[j+1] = XpStuff.getDataArmor()[i][j].getType().name();
			}
			
			for(int j = 0; j < 2; j++) {
				this.effectXpStuff.add(new JCustomComboBox<String>(tmp));
				this.effectXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.effectXpStuff.get(i*2+j).addActionListener(e -> {
					updateLvlXpStuff(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.effectXpStuff.get(i*2+j).setVisible(false);
				
				int duo = i*2+j;
				this.lvlXpStuff.add(new JCustomComboBox<String>());
				this.lvlXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.lvlXpStuff.get(i*2+j).addActionListener(e -> {
					updateMaxLvlValue(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.lvlXpStuff.get(i*2+j).setVisible(false);
			}
		}
		
		this.armorSetInfo = new JCustomTextPane();
		
		setLabel();
		createPanel();
		setEffects();
	}
	
	public Armor getArmor(int id) {
		return this.armor.get(id).getSelectedItem();
	}
	
	public JCustomTextPane getArmorSetInfo() {
		return this.armorSetInfo;
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
	}

	public String getFortif(int id) {
		return this.fortif.get(id).getSelectedItem();
	}

	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}

	public String getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public String getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		Armor[] armors = new Armor[5];
		for(int i = 0; i < armors.length; i++) {
			armors[i] = new Armor(this.getArmor(i));
			armors[i].addEnchant(this.getEnchantment(i), i);
			armors[i].addFortif(this.fortif.get(i).getSelectedIndex());
			list.addAll(armors[i].getEffects());
		}
		
		for(int i = 0; i < 10; i++) {
			if(!this.lvlXpStuff.get(i).isVisible() || this.effectXpStuff.get(i).getSelectedIndex() == 0) {
				continue;
			}
			
			TypeEffect type = TypeEffect.valueOf(this.getEffectXpStuff(i).toString());
			double valueXpStuff = XpStuff.getDataArmor()[i/2][this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
			
			list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
		}
		
		for(int i = 0; i < 5; i++) {
			if(!(this.effectXpStuff.get(i*2).getSelectedIndex() == 0) && !(this.effectXpStuff.get(i*2+1).getSelectedIndex() == 0)
					&& this.effectXpStuff.get(i*2).getSelectedIndex() != this.effectXpStuff.get(i*2+1).getSelectedIndex()) {
				int lvlXpStuff = this.lvlXpStuff.get(i*2).getSelectedIndex() + this.lvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(lvlXpStuff >= armors[i].getLvl()) {
					list.addAll(armors[i].getBonusXP());
				}
			}
		}
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = this.getPearl(i);
			if(pearl.isCumulable()) {
				list.addAll(pearl.getEffects());
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				list.addAll(pearl.getEffects());
			}
		}
		
		EquipSet armorSet = new EquipSet(armors);
		if(armorSet.getNbCurrentUsed() >= 3 && !armorSet.getName().equals("Rien")) {
			list.addAll(armorSet.getWith3());
			
			String setInfo = armorSet.getName() + "\n";
			
			setInfo += "3 pièces équipées " + (armorSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith3().size(); i++) {
				setInfo += "\t- " + armorSet.getWith3().get(i).toString() + "\n";
			}
			
			setInfo += "4 pièces équipées " + (armorSet.getNbCurrentUsed() >= 4 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith4().size(); i++) {
				setInfo += "\t- " + armorSet.getWith4().get(i).toString() + "\n";
			}
			
			setInfo += "5 pièces équipées " + (armorSet.getNbCurrentUsed() >= 5 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < armorSet.getWith5().size(); i++) {
				setInfo += "\t- " + armorSet.getWith5().get(i).toString() + "\n";
			}
			
			this.armorSetInfo.setText(setInfo);
			this.armorSetInfo.setVisible(true);
		} else {
			this.armorSetInfo.setVisible(false);
		}
		
		if(armorSet.getNbCurrentUsed() >= 4) {
			list.addAll(armorSet.getWith4());
		}
		
		if(armorSet.getNbCurrentUsed() == 5) {
			list.addAll(armorSet.getWith5());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		for(int i = 0; i < 5; i++) {
			JPanel descArmor = new JPanel();
			descArmor.setLayout(new BoxLayout(descArmor, BoxLayout.X_AXIS));
			descArmor.setBackground(Consts.UIColor[1]);
			descArmor.add(this.armor.get(i));
			descArmor.add(this.enchant.get(i));
			descArmor.add(this.fortif.get(i));
			
			JPanel pearlArmor = new JPanel();
			pearlArmor.setLayout(new BoxLayout(pearlArmor, BoxLayout.Y_AXIS));
			pearlArmor.setBackground(Consts.UIColor[1]);
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
			xpArmor.setBackground(Consts.UIColor[1]);
			this.label[i+5].setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpArmor.add(this.label[i+5]);
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Consts.UIColor[1]);
				xp.add(this.effectXpStuff.get(i*2+j));
				xp.add(this.lvlXpStuff.get(i*2+j));
				xpArmor.add(xp);
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Consts.UIColor[1]);
			elemI.add(this.label[i]);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descArmor);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(pearlArmor);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(xpArmor);
			
			this.showAndHideXpStuff.add(xpArmor);	
			
			this.add(elemI);
			this.add(Box.createVerticalStrut(10));
		}
		
		this.add(this.armorSetInfo);
		
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 2);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateArmor() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		for(int i = 0; i < 5; i++) {
			Armor[] tabArmor = Armor.getPossibleArmor(i, grade.getGrade(), lvl, reinca);
			Armor memory = this.getArmor(i);
			
			this.armor.get(i).setModel(new DefaultComboBoxModel<Armor>(tabArmor));
			this.armor.get(i).setSelectedItem(memory);
			
			if(!this.armor.get(i).getSelectedItem().equals(memory)) {
				updateDetails(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				if(i == 0) {
					this.pearl.get(i).setSelectedIndex(0);
				} else if (i == 1) {
					this.pearl.get(i).setSelectedIndex(0);
					this.pearl.get(i+1).setSelectedIndex(0);
				} else {
					this.pearl.get(i+1).setSelectedIndex(0);
				}
			}
		}
	}
	
	private void updateDetails(int id) {
		if(this.armor.get(id).getSelectedIndex() != 0) {
			this.fortif.get(id).setVisible(true);
			if (id == 0) {
				this.pearl.get(id).setVisible(true);
			} else if (id == 1) {
				this.pearl.get(id).setVisible(true);
				this.pearl.get(id+1).setVisible(true);
			} else {
				this.pearl.get(id+1).setVisible(true);
			}
		}
		else {
			this.fortif.get(id).setVisible(false);
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
		Pearl[] tabPearl = Pearl.getPossibleArmorPearl(this.getPearl(id).getQuality());
		
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
			
			if(armor.isEnchantable()) {
				Enchantment[] tabEnchant = Enchantment.getPossibleArmorEnchant(armor.getQuality());
				
				this.enchant.get(id).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
				this.enchant.get(id).setVisible(true);
			} else {
				this.enchant.get(id).setVisible(false);
			}
		} else {
			this.enchant.get(id).setVisible(false);
		}
	}
	
	private void updateLvlXpStuff(int id) {
		if(this.getEffectXpStuff(id*2).toString().equals("Rien") || this.getEffectXpStuff(id*2+1).toString().equals("Rien")
				|| this.getEffectXpStuff(id*2).toString().equals(this.getEffectXpStuff(id*2+1).toString())) {
			this.lvlXpStuff.get(id*2).setVisible(false);
			this.lvlXpStuff.get(id*2+1).setVisible(false);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2), null);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2+1), null);
		} else {
			String[] tmp = new String[XpStuff.getDataArmor()[id][this.effectXpStuff.get(id*2).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(id*2).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, id*2, tmp);
			
			tmp = new String[XpStuff.getDataArmor()[id][this.effectXpStuff.get(id*2+1).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(id*2+1).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, id*2+1, tmp);
			
			this.lvlXpStuff.get(id*2).setVisible(true);
			this.lvlXpStuff.get(id*2+1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.effectXpStuff.get(id).getSelectedIndex() == 0
				|| this.effectXpStuff.get(indexPair).getSelectedIndex() == 0
				|| this.effectXpStuff.get(id).getSelectedIndex() == this.effectXpStuff.get(indexPair).getSelectedIndex())
			return;
		
		int currentLvl = this.lvlXpStuff.get(id).getSelectedIndex()+1;
		
		int sizePair = XpStuff.getDataArmor()[id/2][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		
		
		String[] tmp = new String[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
		this.lvlXpStuff.get(indexPair).add(new JComboBox<String>(tmp));
		Util.setMemoryInList(this.lvlXpStuff, indexPair, tmp);
	}
}
