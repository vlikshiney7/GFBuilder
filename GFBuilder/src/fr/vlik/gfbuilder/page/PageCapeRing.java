package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.custom.CustomCape;
import fr.vlik.grandfantasia.custom.CustomRing;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomTextPane;

public class PageCapeRing extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "CAPERING";
	private static PageCapeRing INSTANCE = new PageCapeRing();
	
	private JCustomComboBox<Cape> cape;
	private ArrayList<JCustomComboBox<Ring>> ring = new ArrayList<JCustomComboBox<Ring>>(2);
	private JCustomTextPane capeRingSetInfo;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	private ArrayList<JCustomComboBox<TypeEffect>> effectXpStuff = new ArrayList<JCustomComboBox<TypeEffect>>(6);
	private ArrayList<JCustomComboBox<Integer>> lvlXpStuff = new ArrayList<JCustomComboBox<Integer>>(6);
	
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(3);
	
	public static PageCapeRing getInstance() {
		return INSTANCE;
	}
	
	private PageCapeRing() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
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
		TypeEffect[] tmp = new TypeEffect[XpStuff.getDataCapeRing()[0].length +1];
		tmp[0] = TypeEffect.NONE;
		for(int i = 0; i < tmp.length-1; i++) {
			tmp[i+1] = XpStuff.getDataCapeRing()[0][i].getType();
		}
		for(int i = 0; i < 2; i++) {
			int duo = i;
			this.effectXpStuff.add(new JCustomComboBox<TypeEffect>(tmp));
			this.effectXpStuff.get(i).addActionListener(e -> {
				updateLvlXpStuff(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.effectXpStuff.get(i).setVisible(false);
			
			this.lvlXpStuff.add(new JCustomComboBox<Integer>());
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
			tmp = new TypeEffect[XpStuff.getDataCapeRing()[1].length +1];
			tmp[0] = TypeEffect.NONE;
			for(int j = 0; j < tmp.length-1; j++) {
				tmp[j+1] = XpStuff.getDataCapeRing()[1][j].getType();
			}
			for(int j = 0; j < 2; j++) {
				int duo = i*2+j+2;
				
				this.effectXpStuff.add(new JCustomComboBox<TypeEffect>(tmp));
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
		
		this.capeRingSetInfo = new JCustomTextPane();
		
		updateLanguage(Language.FR);
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
		
		Cape cape = new Cape(this.getCape());
		cape.addEnchant(this.getEnchantment(0));
		
		if(cape.getEffects() != null) {
			for(Calculable c : cape.getEffects()) {
				list.add(c);
			}
		}
		
		if(this.getEffectXpStuff(0) != TypeEffect.NONE && this.getEffectXpStuff(1) != TypeEffect.NONE
				&& this.getEffectXpStuff(0) != this.getEffectXpStuff(1)) {
			for(int i = 0; i < 2; i++) {
				TypeEffect type = this.getEffectXpStuff(i);
				double valueXpStuff = XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
				
				list.add(new Effect(type, false, valueXpStuff, true));
			}
		}
		
		
		Ring[] rings = new Ring[2];
		for(int i = 0; i < rings.length; i++) {
			rings[i] = new Ring(this.getRing(i));
			rings[i].addEnchant(this.getEnchantment(i+1));
			
			if(rings[i].getEffects() != null) {
				for(Calculable c : rings[i].getEffects()) {
					list.add(c);
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			if(this.getEffectXpStuff(i*2+2) == TypeEffect.NONE || this.getEffectXpStuff(i*2+3) == TypeEffect.NONE
				|| this.getEffectXpStuff(i*2+2) == this.getEffectXpStuff(i*2+3)) {
				continue;
			}
			
			for(int j = 0; j < 2; j++) {
				TypeEffect type = this.getEffectXpStuff(i*2+j+2);
				double valueXpStuff = XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(i*2+j+2).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i*2+j+2).getSelectedIndex());
				
				list.add(new Effect(type, false, valueXpStuff, true));
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			if(this.getEffectXpStuff(i*2) != TypeEffect.NONE && this.getEffectXpStuff(i*2+1) != TypeEffect.NONE
					&& this.getEffectXpStuff(i*2) != this.getEffectXpStuff(i*2+1)) {
				int lvlXpStuff = this.lvlXpStuff.get(i*2).getSelectedIndex() + this.lvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(i == 0) {
					if(lvlXpStuff >= cape.getLvl() && cape.getBonusXP() != null) {
						for(Calculable c : cape.getBonusXP()) {
							list.add(c);
						}
					}
				} else {
					if(lvlXpStuff >= rings[i-1].getLvl() && rings[i-1].getBonusXP() != null) {
						for(Calculable c : rings[i-1].getBonusXP()) {
							list.add(c);
						}
					}
				}
			}
		}
		
		
		EquipSet capeRingSet = new EquipSet(rings, cape);
		if(capeRingSet.getNbCurrentUsed() >= 2 && !capeRingSet.getName().equals("Rien")) {
			if(capeRingSet.getWith2() != null) {
				for(Calculable c : capeRingSet.getWith2()) {
					list.add(c);
				}
			}
			
			String setInfo = capeRingSet.getName() + "\n";
			
			setInfo += "2 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 2 ? "(Actif) " : "") + ":\n";
			if(capeRingSet.getWith2() != null) {
				for(int i = 0; i < capeRingSet.getWith2().length; i++) {
					Calculable c = (Calculable) capeRingSet.getWith2()[i];
					setInfo += "\t- " + c.toString(Language.FR) + "\n";
				}
			}
			
			setInfo += "3 pièces équipées " + (capeRingSet.getNbCurrentUsed() >= 3 ? "(Actif) " : "") + ":\n";
			if(capeRingSet.getWith3() != null) {
				for(int i = 0; i < capeRingSet.getWith3().length; i++) {
					Calculable c = (Calculable) capeRingSet.getWith3()[i];
					setInfo += "\t- " + c.toString(Language.FR) + "\n";
				}
			}
			
			
			this.capeRingSetInfo.setText(setInfo);
			this.capeRingSetInfo.setVisible(true);
		} else {
			this.capeRingSetInfo.setVisible(false);
		}
		
		if(capeRingSet.getNbCurrentUsed() >= 2) {
			if(capeRingSet.getWith2() != null) {
				for(Calculable c : capeRingSet.getWith2()) {
					list.add(c);
				}
			}
			
			if(capeRingSet.getNbCurrentUsed() >= 3) {
				if(capeRingSet.getWith3() != null) {
					for(Calculable c : capeRingSet.getWith3()) {
						list.add(c);
					}
				}
			}
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
		xpCape.add(this.labelGFB[1]);
		this.labelGFB[1].setFont(Design.SUBTITLE);
		
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
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
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
			xpRing.add(this.labelGFB[i+4]);
			this.labelGFB[i+4].setFont(Design.SUBTITLE);
			
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
			elemI.add(this.labelGFB[i+2]);
			this.labelGFB[i+2].setFont(Design.TITLE);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descRing);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(xpRing);
			
			this.showAndHideXpStuff.add(xpRing);
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		this.add(Box.createVerticalStrut(10));
		this.add(this.capeRingSetInfo);
		
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
	
	public void updateCapeRing() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Cape[] tabCape = Cape.getPossibleCape(grade.getGrade(), lvl);
		Cape memoryCape = this.getCape();
		
		this.cape.setModel(new DefaultComboBoxModel<Cape>(tabCape));
		this.cape.setSelectedItem(memoryCape);
		
		if(!this.getCape().equals(memoryCape)) {
			updateXpStuff(0);
			updateEnchant(0);
			
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
		
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = Ring.getPossibleRing(lvl, null);
			Ring memory = this.getRing(i);
			
			this.ring.get(i).setModel(new DefaultComboBoxModel<Ring>(tabRing));
			this.ring.get(i).setSelectedItem(memory);
			
			if(!this.getRing(i).equals(memory)) {
				updateXpStuff(i+1);
				updateEnchant(i+1);
				
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
	}
	
	public void updateEnchant(int id) {
		if(id == 0) {
			if(this.cape.getSelectedIndex() != 0) {
				Cape cape = this.getCape();
				
				if(cape.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(cape);
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
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(ring);
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
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.getEffectXpStuff(id) == TypeEffect.NONE || this.getEffectXpStuff(indexPair) == TypeEffect.NONE
				|| this.getEffectXpStuff(id) == this.getEffectXpStuff(indexPair)) {
			
			this.lvlXpStuff.get(id).setVisible(false);
			this.lvlXpStuff.get(indexPair).setVisible(false);
			
			this.lvlXpStuff.get(id).setModel(new DefaultComboBoxModel<Integer>());
			this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>());
		} else {
			if(id == 0) {
				Integer[] tmp = new Integer[XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(id).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = i+1;
				}
				
				Integer memory = this.getLvlXpStuff(id);
				this.lvlXpStuff.get(id).setModel(new DefaultComboBoxModel<Integer>(tmp));
				if(memory != null) {
					this.lvlXpStuff.get(id).setSelectedItem(memory);
				}
				
				tmp = new Integer[XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = i+1;
				}
				
				memory = this.getLvlXpStuff(indexPair);
				this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
				if(memory != null) {
					this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
				}
			} else {
				Integer[] tmp = new Integer[XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(id).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = i+1;
				}
				
				Integer memory = this.getLvlXpStuff(id);
				this.lvlXpStuff.get(id).setModel(new DefaultComboBoxModel<Integer>(tmp));
				if(memory != null) {
					this.lvlXpStuff.get(id).setSelectedItem(memory);
				}
				
				tmp = new Integer[XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size()];
				for(int i = 0; i < tmp.length; i++) {
					tmp[i] = i+1;
				}
				
				memory = this.getLvlXpStuff(indexPair);
				this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
				if(memory != null) {
					this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
				}
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
		int sizePair = -1;
		
		if(id < 2) {
			sizePair = XpStuff.getDataCapeRing()[0][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		} else {
			sizePair = XpStuff.getDataCapeRing()[1][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		}
		
		Integer[] tmp = new Integer[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = i+1;
		}
		
		Integer memory = this.getLvlXpStuff(indexPair);
		this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
		this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
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
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		if(this.getCape().isCustom()) {
			config.put("Cape", "Custom::" + this.getCape().getName(Language.FR) + "::" + this.getCape().getQuality() + "::" + this.getCape().getSignature());
		} else {
			config.put("Cape", this.getCape().getName(Language.FR));
		}
		
		for(int i = 0; i < this.ring.size(); i++) {
			if(this.getRing(i).isCustom()) {
				config.put("Ring" + i, "Custom::" + this.getRing(i).getName(Language.FR) + "::" + this.getRing(i).getQuality() + "::" + this.getRing(i).getSignature());
			} else {
				config.put("Ring" + i, this.getRing(i).getName(Language.FR));
			}
		}
		
		for(int i = 0; i < this.enchant.size(); i++) {
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName() : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			config.put("EffectXpStuff" + i, this.getEffectXpStuff(i).getInfo(lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			String value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).toString() : "0";
			config.put("LvlXpStuff" + i, value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		Cape cape = null;
		if(config.get("Cape") != null && config.get("Cape").startsWith("Custom")) {
			String[] valueSplit = config.get("Cape").split("::");
			
			Quality quality = null;
			try {
				quality = Quality.valueOf(valueSplit[2]);
			} catch (Exception e) {
				this.cape.setSelectedIndex(0);
			}
			
			if(quality != null) {
				cape = Cape.getCustom(valueSplit[1], quality, valueSplit[3]);
				
				if(cape == null) {
					if(CustomCape.constructCustom(valueSplit[1], quality, valueSplit[3])) {
						SaveConfig.overrideCustom();
						PageCapeRing.getInstance().updateCapeRing();
						
						cape = Cape.getCustom(valueSplit[1], quality, valueSplit[3]);
						this.cape.setSelectedItem(cape);
					}
				} else {
					this.cape.setSelectedItem(cape);
				}
			}
		} else {
			cape = Cape.get(config.get("Cape"), Language.FR);
			
			if(cape == null) {
				this.cape.setSelectedIndex(0);
			} else {
				this.cape.setSelectedItem(cape);
			}
		}
		
		for(int i = 0; i < this.ring.size(); i++) {
			Ring ring = null;
			if(config.get("Ring" + i) != null && config.get("Ring" + i).startsWith("Custom")) {
				String[] valueSplit = config.get("Ring" + i).split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(valueSplit[2]);
				} catch (Exception e) {
					this.ring.get(i).setSelectedIndex(0);
				}
				
				if(quality != null) {
					ring = Ring.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(ring == null) {
						if(CustomRing.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageCapeRing.getInstance().updateCapeRing();
							
							ring = Ring.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.ring.get(i).setSelectedItem(ring);
						}
					} else {
						this.ring.get(i).setSelectedItem(ring);
					}
				}
			} else {
				ring = Ring.get(config.get("Ring" + i), Language.FR);
				
				if(ring == null) {
					this.ring.get(i).setSelectedIndex(0);
				} else {
					this.ring.get(i).setSelectedItem(ring);
				}
			}
		}
		
		this.enchant.get(0).setSelectedItem(Enchantment.get(this.getCape(), config.get("Enchantment" + 0)));
		
		for(int i = 1; i < this.enchant.size(); i++) {
			this.enchant.get(i).setSelectedItem(Enchantment.get(this.getRing(i-1), config.get("Enchantment" + i)));
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
	}
}
