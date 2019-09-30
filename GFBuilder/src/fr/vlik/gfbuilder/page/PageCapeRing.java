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

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Util;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.EquipSet;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipment.Cape;
import fr.vlik.grandfantasia.equipment.Ring;
import fr.vlik.grandfantasia.equipment.Weapon.WeaponType;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomTextPane;

public class PageCapeRing extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static PageCapeRing INSTANCE = new PageCapeRing();
	
	private JCustomComboBox<Cape> cape;
	private ArrayList<JCustomComboBox<Ring>> ring = new ArrayList<JCustomComboBox<Ring>>(2);
	private JCustomTextPane capeRingSetInfo;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	private ArrayList<JCustomComboBox<String>> effectXpStuff = new ArrayList<JCustomComboBox<String>>(6);
	private ArrayList<JCustomComboBox<String>> lvlXpStuff = new ArrayList<JCustomComboBox<String>>(6);
	
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(3);
	
	public static PageCapeRing getInstance() {
		return INSTANCE;
	}
	
	private PageCapeRing() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel(Language.FR);
		
		Cape[] tabCape = Cape.getPossibleCape(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		this.cape = new JCustomComboBox<Cape>(new DefaultComboBoxModel<Cape>(tabCape));
		this.cape.addActionListener(e -> {
			updateXpStuff(0);
			updateEnchant(0);
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* ENCHANTEMENT */
		this.enchant.add(new JCustomComboBox<Enchantment>());
		this.enchant.get(0).addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		this.enchant.get(0).setVisible(false);
		
		/* XP STUFF */
		String[] tmp = new String[XpStuff.getDataCapeRing()[0].length +1];
		tmp[0] = "Rien";
		for(int i = 0; i < tmp.length-1; i++) {
			tmp[i+1] = XpStuff.getDataCapeRing()[0][i].getType().name();
		}
		for(int i = 0; i < 2; i++) {
			this.effectXpStuff.add(new JCustomComboBox<String>(tmp));
			this.effectXpStuff.get(i).addActionListener(e -> {
				updateLvlXpStuff(0);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.effectXpStuff.get(i).setVisible(false);
			
			int duo = i;
			this.lvlXpStuff.add(new JCustomComboBox<String>());
			this.lvlXpStuff.get(i).addActionListener(e -> {
				updateMaxLvlValue(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.lvlXpStuff.get(i).setVisible(false);
		}
		
		
		Ring[] tabRing = Ring.getPossibleRing(PageGeneral.getInstance().getLvl(), null);
		for(int i = 0; i < 2; i++) {
			int id = i;
			
			this.ring.add(new JCustomComboBox<Ring>(new DefaultComboBoxModel<Ring>(tabRing)));
			this.ring.get(i).addActionListener(e -> {
				updateXpStuff(id+1);
				updateEnchant(id+1);
				updateDoubleRing(id);

				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* ENCHANTEMENT */
			this.enchant.add(new JCustomComboBox<Enchantment>());
			this.enchant.get(i+1).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.enchant.get(i+1).setVisible(false);
			
			/* XP STUFF */
			tmp = new String[XpStuff.getDataCapeRing()[1].length +1];
			tmp[0] = "Rien";
			for(int j = 0; j < tmp.length-1; j++) {
				tmp[j+1] = XpStuff.getDataCapeRing()[1][j].getType().name();
			}
			for(int j = 0; j < 2; j++) {
				this.effectXpStuff.add(new JCustomComboBox<String>(tmp));
				this.effectXpStuff.get(i*2+j+2).addActionListener(e -> {
					updateLvlXpStuff(id+1);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.effectXpStuff.get(i*2+j+2).setVisible(false);
				
				int duo = i*2+j+2;
				this.lvlXpStuff.add(new JCustomComboBox<String>());
				this.lvlXpStuff.get(i*2+j+2).addActionListener(e -> {
					updateMaxLvlValue(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.lvlXpStuff.get(i*2+j+2).setVisible(false);
			}
		}
		
		this.capeRingSetInfo = new JCustomTextPane();
		
		createPanel();
		setEffects();
	}
	
	public Cape getCape() {
		return this.cape.getSelectedItem();
	}
	
	public Ring getRing(int id) {
		return this.ring.get(id).getSelectedItem();
	}
	
	public JCustomTextPane getArmorSetInfo() {
		return this.capeRingSetInfo;
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
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
		
		Cape cape = new Cape(this.getCape());
		cape.addEnchant(this.getEnchantment(0));
		list.addAll(cape.getEffects());
		
		for(int i = 0; i < 2; i++) {
			if(!this.lvlXpStuff.get(i).isVisible() || this.effectXpStuff.get(i).getSelectedIndex() == 0) {
				continue;
			}
			
			TypeEffect type = TypeEffect.valueOf(this.getEffectXpStuff(i).toString());
			double valueXpStuff = XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
			
			list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
		}
		
		Ring[] rings = new Ring[2];
		for(int i = 0; i < rings.length; i++) {
			rings[i] = new Ring(this.getRing(i));
			rings[i].addEnchant(this.getEnchantment(i+1));
			list.addAll(rings[i].getEffects());
		}
		
		for(int i = 0; i < 4; i++) {
			if(!this.lvlXpStuff.get(i+2).isVisible() || this.effectXpStuff.get(i+2).getSelectedIndex() == 0) {
				continue;
			}
			
			TypeEffect type = TypeEffect.valueOf(this.getEffectXpStuff(i+2).toString());
			double valueXpStuff = XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(i+2).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i+2).getSelectedIndex());
			
			list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
		}
		
		for(int i = 0; i < 3; i++) {
			if(!(this.effectXpStuff.get(i*2).getSelectedIndex() == 0) && !(this.effectXpStuff.get(i*2+1).getSelectedIndex() == 0)
					&& this.effectXpStuff.get(i*2).getSelectedIndex() != this.effectXpStuff.get(i*2+1).getSelectedIndex()) {
				int lvlXpStuff = this.lvlXpStuff.get(i*2).getSelectedIndex() + this.lvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(i == 0) {
					if(lvlXpStuff >= cape.getLvl()) {
						list.addAll(cape.getBonusXP());
					}
				} else {
					if(lvlXpStuff >= rings[i-1].getLvl()) {
						list.addAll(rings[i-1].getBonusXP());
					}
				}
			}
		}
		
		
		EquipSet capeRingSet = new EquipSet(rings, cape);
		if(capeRingSet.getNbCurrentUsed() >= 2 && !capeRingSet.getName().equals("Rien")) {
			list.addAll(capeRingSet.getWith2());
			
			String setInfo = capeRingSet.getName() + "\n";
			
			setInfo += "2 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 2 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < capeRingSet.getWith2().size(); i++) {
				setInfo += "\t- " + capeRingSet.getWith2().get(i).toString() + "\n";
			}
			
			setInfo += "3 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
			for(int i = 0; i < capeRingSet.getWith3().size(); i++) {
				setInfo += "\t- " + capeRingSet.getWith3().get(i).toString() + "\n";
			}
			
			this.capeRingSetInfo.setText(setInfo);
			this.capeRingSetInfo.setVisible(true);
		} else {
			this.capeRingSetInfo.setVisible(false);
		}
		
		if(capeRingSet.getNbCurrentUsed() >= 3) {
			list.addAll(capeRingSet.getWith3());
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel descCape = new JPanel();
		descCape.setLayout(new BoxLayout(descCape, BoxLayout.X_AXIS));
		descCape.setBackground(Design.UIColor[1]);
		descCape.add(this.cape);
		descCape.add(this.enchant.get(0));
		
		JPanel xpCape = new JPanel(new GridLayout(1, 3, 10, 3));
		xpCape.setBackground(Design.UIColor[1]);
		this.label[1].setFont(new Font("Open Sans", Font.PLAIN, 14));
		xpCape.add(this.label[1]);
		for(int i = 0; i < 2; i++) {
			JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
			xp.setBackground(Design.UIColor[1]);
			xp.add(this.effectXpStuff.get(i));
			xp.add(this.lvlXpStuff.get(i));
			xpCape.add(xp);
		}
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(descCape);
		elem1.add(Box.createVerticalStrut(5));
		elem1.add(xpCape);
		
		this.showAndHideXpStuff.add(xpCape);
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JPanel descRing = new JPanel();
			descRing.setLayout(new BoxLayout(descRing, BoxLayout.X_AXIS));
			descRing.setBackground(Design.UIColor[1]);
			descRing.add(this.ring.get(i));
			descRing.add(this.enchant.get(i+1));
			
			JPanel xpRing = new JPanel(new GridLayout(1, 3, 10, 3));
			xpRing.setBackground(Design.UIColor[1]);
			this.label[i+4].setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpRing.add(this.label[i+4]);
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Design.UIColor[1]);
				xp.add(this.effectXpStuff.get(i*2+j+2));
				xp.add(this.lvlXpStuff.get(i*2+j+2));
				xpRing.add(xp);
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.label[i+2]);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descRing);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(xpRing);
			
			this.showAndHideXpStuff.add(xpRing);
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		this.add(this.capeRingSetInfo);
		
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
	}

	@Override
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 3);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 3);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
	}
	
	public void updateCapeRing() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Cape[] tabCape = Cape.getPossibleCape(grade.getGrade(), lvl);
		Cape memoryCape = this.getCape();
		
		this.cape.setModel(new DefaultComboBoxModel<Cape>(tabCape));
		this.cape.setSelectedItem(memoryCape);
		
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = Ring.getPossibleRing(lvl, null);
			Ring memory = this.getRing(i);
			
			this.ring.get(i).setModel(new DefaultComboBoxModel<Ring>(tabRing));
			this.ring.get(i).setSelectedItem(memory);
		}
	}
	
	public void updateEnchant(int id) {
		if(id == 0) {
			if(this.cape.getSelectedIndex() != 0) {
				Cape cape = this.getCape();
				
				if(cape.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleCapeRingEnchant();
					Enchantment memory = this.getEnchantment(id);
					
					this.enchant.get(id).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.enchant.get(id).setSelectedItem(memory);
					this.enchant.get(id).setVisible(true);
				} else {
					this.enchant.get(id).setVisible(false);
				}
			} else {
				this.enchant.get(id).setVisible(false);
			}
		} else {
			if(this.ring.get(id-1).getSelectedIndex() != 0) {
				Ring ring = (Ring) this.ring.get(id-1).getSelectedItem();
				
				if(ring.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleCapeRingEnchant();
					Enchantment memory = this.getEnchantment(id);
					
					this.enchant.get(id).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
					this.enchant.get(id).setSelectedItem(memory);
					this.enchant.get(id).setVisible(true);
				} else {
					this.enchant.get(id).setVisible(false);
				}
			} else {
				this.enchant.get(id).setVisible(false);
			}
		}
	}
	
	private void updateXpStuff(int id) {
		if(id == 0) {
			if(this.cape.getSelectedIndex() != 0) {
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
		} else {
			if(this.ring.get(id-1).getSelectedIndex() != 0) {
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
	}
	
	private void updateLvlXpStuff(int id) {
		if(this.getEffectXpStuff(id*2).toString().equals("Rien") || this.getEffectXpStuff(id*2+1).toString().equals("Rien")
				|| this.getEffectXpStuff(id*2).toString().equals(this.getEffectXpStuff(id*2+1).toString())) {
			this.lvlXpStuff.get(id*2).setVisible(false);
			this.lvlXpStuff.get(id*2+1).setVisible(false);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2), null);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2+1), null);
		} else {
			if(id == 0) {
				String[] tmp = new String[XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(id*2).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = "" + (i+1);
				}
				this.lvlXpStuff.get(id*2).add(new JCustomComboBox<String>(tmp));
				Util.setMemoryInList(this.lvlXpStuff, id*2, tmp);
				
				tmp = new String[XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(id*2+1).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = "" + (i+1);
				}
				this.lvlXpStuff.get(id*2+1).add(new JCustomComboBox<String>(tmp));
				Util.setMemoryInList(this.lvlXpStuff, id*2+1, tmp);
			} else {
				String[] tmp = new String[XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(id*2).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = "" + (i+1);
				}
				this.lvlXpStuff.get(id*2).add(new JCustomComboBox<String>(tmp));
				Util.setMemoryInList(this.lvlXpStuff, id*2, tmp);
				
				tmp = new String[XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(id*2+1).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = "" + (i+1);
				}
				this.lvlXpStuff.get(id*2+1).add(new JCustomComboBox<String>(tmp));
				Util.setMemoryInList(this.lvlXpStuff, id*2+1, tmp);
			}
			
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
		int sizePair = -1;
		
		if(id < 2) {
			sizePair = XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		} else {
			sizePair = XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		}
		
		String[] tmp = new String[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
		this.lvlXpStuff.get(indexPair).add(new JComboBox<String>(tmp));
		Util.setMemoryInList(this.lvlXpStuff, indexPair, tmp);
	}
	
	private void updateDoubleRing(int id) {
		Ring choice = this.getRing(id);
		int other = id == 0 ? 1 : 0;
		
		Ring[] tabRing = Ring.getPossibleRing(PageGeneral.getInstance().getLvl(), choice);
		Ring memory = this.getRing(other);
		
		this.ring.get(other).setModel(new DefaultComboBoxModel<Ring>(tabRing));
		this.ring.get(other).setSelectedItem(memory);
	}

	@Override
	public int[] getConfig() {
		int[] config = new int[18];
		
		int index = 0;
		
		config[index++] = this.cape.getSelectedIndex();
		
		for(int i = 0; i < 2; i++) {
			config[index++] = this.ring.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 3; i++) {
			config[index++] = this.enchant.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 6; i++) {
			config[index++] = this.effectXpStuff.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 6; i++) {
			config[index++] = this.lvlXpStuff.get(i).getSelectedIndex();
		}
		
		return config;
	}

	@Override
	public void setConfig(int[] config) {
		int index = 0;
		
		this.cape.setSelectedIndex(config[index++]);
		
		for(int i = 0; i < 2; i++) {
			this.ring.get(i).setSelectedIndex(config[index++]);
		}
		
		for(int i = 0; i < 3; i++) {
			this.enchant.get(i).setSelectedIndex(config[index++]);
		}
		
		for(int i = 0; i < 6; i++) {
			this.effectXpStuff.get(i).setSelectedIndex(config[index++]);
		}
		
		for(int i = 0; i < 6; i++) {
			this.lvlXpStuff.get(i).setSelectedIndex(config[index++]);
		}
	}
}
