package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.customEquip.CustomCape;
import fr.vlik.grandfantasia.customEquip.CustomRing;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
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
	private ArrayList<JCustomComboBox<XpStuff>> xpStuff = new ArrayList<JCustomComboBox<XpStuff>>(6);
	private ArrayList<JCustomComboBox<InnerEffect>> lvlXpStuff = new ArrayList<JCustomComboBox<InnerEffect>>(6);
	
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(3);
	
	public static PageCapeRing getInstance() {
		return INSTANCE;
	}
	
	private PageCapeRing() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Cape[] tabCape = Cape.getPossibleCape(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		this.cape = new JCustomComboBox<Cape>(tabCape);
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
		for(int i = 0; i < 2; i++) {
			int duo = i;
			
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
		
		
		Ring[] tabRing = Ring.getPossibleRing(PageGeneral.getInstance().getLvl(), null);
		for(int i = 0; i < 2; i++) {
			int id = i;
			
			this.ring.add(new JCustomComboBox<Ring>(tabRing));
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
			for(int j = 0; j < 2; j++) {
				int duo = i*2+j+2;
				
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
		
		Cape cape = new Cape(this.getCape());
		cape.addEnchant(this.getEnchantment(0));
		
		list.addAll(cape);
		
		Ring[] rings = new Ring[2];
		for(int i = 0; i < rings.length; i++) {
			rings[i] = new Ring(this.getRing(i));
			rings[i].addEnchant(this.getEnchantment(i+1));
			
			list.addAll(rings[i]);
		}
		
		for(int i = 0; i < 3; i++) {
			if(XpStuff.availableEffects(this.getXpStuff(i*2), this.getXpStuff(i*2+1))) {
				for(int j = 0; j < 2; j++) {
					list.addAll(this.getLvlXpStuff(i*2+j));
				}
				
				int lvlXpStuff = this.getLvlXpStuff(i*2).getLvlbuff() + this.getLvlXpStuff(i*2+1).getLvlbuff();
				
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
			list.addAll(capeRingSet.getWith2());
			
			if(capeRingSet.getNbCurrentUsed() >= 3) {
				list.addAll(capeRingSet.getWith3());
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
			xp.add(this.xpStuff.get(i));
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
				xp.add(this.xpStuff.get(i*2+j+2));
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
		
		this.cape.setItems(tabCape);
		
		if(!this.getCape().equals(memoryCape)) {
			updateXpStuff(0);
			updateEnchant(0);
			
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
		
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = Ring.getPossibleRing(lvl, null);
			Ring memory = this.getRing(i);
			
			this.ring.get(i).setItems(tabRing);
			
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
					
					this.enchant.get(id).setItems(tabEnchant);
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
					
					this.enchant.get(id).setItems(tabEnchant);
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
				XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getCape());
				
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
		} else {
			if(this.ring.get(id-1).getSelectedIndex() != 0) {
				XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getRing(id-1));
				
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
	
	private void updateDoubleRing(int id) {
		Ring choice = this.getRing(id);
		int other = id == 0 ? 1 : 0;
		
		Ring[] tabRing = Ring.getPossibleRing(PageGeneral.getInstance().getLvl(), choice);
		this.ring.get(other).setItems(tabRing);
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
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName(Language.FR) : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		if(config.get("Cape") != null && config.get("Cape").startsWith("Custom")) {
			String[] valueSplit = config.get("Cape").split("::");
			
			Quality quality = null;
			try {
				quality = Quality.valueOf(valueSplit[2]);
			} catch (Exception e) {
				this.cape.setSelectedIndex(0);
			}
			
			if(quality != null) {
				Cape cape = Cape.getCustom(valueSplit[1], quality, valueSplit[3]);
				
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
			this.cape.setSelectedItem(Cape.get(config.get("Cape"), Language.FR));
		}
		
		for(int i = 0; i < this.ring.size(); i++) {
			if(config.get("Ring" + i) != null && config.get("Ring" + i).startsWith("Custom")) {
				String[] valueSplit = config.get("Ring" + i).split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(valueSplit[2]);
				} catch (Exception e) {
					this.ring.get(i).setSelectedIndex(0);
				}
				
				if(quality != null) {
					Ring ring = Ring.getCustom(valueSplit[1], quality, valueSplit[3]);
					
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
				this.ring.get(i).setSelectedItem(Ring.get(config.get("Ring" + i), Language.FR));
			}
		}
		
		this.enchant.get(0).setSelectedItem(Enchantment.get(this.getCape(), config.get("Enchantment" + 0)));
		
		for(int i = 1; i < this.enchant.size(); i++) {
			this.enchant.get(i).setSelectedItem(Enchantment.get(this.getRing(i-1), config.get("Enchantment" + i)));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			if(this.lvlXpStuff.get(i).getItemCount() > 0) {
				this.lvlXpStuff.get(i).setSelectedIndex(0);
			}
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			if(i/2 == 0) {
				if(this.getCape().getQuality() != Quality.GREY) {
					this.xpStuff.get(i).setSelectedItem(XpStuff.get(this.getCape(), config.get("EffectXpStuff" + i)));
				}
			} else {
				if(this.getRing((i/2)-1).getQuality() != Quality.GREY) {
					XpStuff xpStuff = XpStuff.get(this.getRing((i/2)-1), config.get("EffectXpStuff" + i));
					this.xpStuff.get(i).setSelectedItem(xpStuff);
				}
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			XpStuff xpStuff = this.getXpStuff(i);
			if(xpStuff != null) {
				InnerEffect inner = xpStuff.getInnerEffect(Integer.valueOf(config.get("LvlXpStuff" + i)));
				this.lvlXpStuff.get(i).setSelectedItem(inner);
			}
		}
	}
}
