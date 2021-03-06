package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTextPane;
import fr.vlik.uidesign.JLangLabel;

public class PageCapeRing extends PartialXpStuff {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "CAPERING";
	private static PageCapeRing INSTANCE = new PageCapeRing();
	
	private JCustomComboBox<Cape> cape;
	private ArrayList<JCustomComboBox<Ring>> ring = new ArrayList<JCustomComboBox<Ring>>(2);
	private JCustomTextPane capeRingSetInfo;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	
	public static PageCapeRing getInstance() {
		return INSTANCE;
	}
	
	private PageCapeRing() {
		super(BoxLayout.Y_AXIS, NUM_PAGE, 3);
		setLabelAPI();
		
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
	
	@Override
	protected void setLabelAPI() {
		this.labelAPI.put("Cape", new JLangLabel(Cape.CLASS_NAME, Design.TITLE));
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
		JCustomPanel descCape = new JCustomPanel(BoxLayout.X_AXIS);
		descCape.addAll(this.cape, this.enchant.get(0));
		
		JCustomPanel xpCape = new JCustomPanel(new GridLayout(1, 3, 10, 3));
		xpCape.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.SUBTITLE);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
			xp.addAll(this.xpStuff.get(i), this.lvlXpStuff.get(i));
			xpCape.add(xp);
		}
		
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labelAPI.get("Cape"), Box.createVerticalStrut(10), descCape, Box.createVerticalStrut(5), xpCape);
		
		this.showAndHideXpStuff.add(xpCape);
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel descRing = new JCustomPanel(BoxLayout.X_AXIS);
			descRing.addAll(this.ring.get(i), this.enchant.get(i+1));
			
			JCustomPanel xpRing = new JCustomPanel(new GridLayout(1, 3, 10, 3));
			xpRing.add(this.labelGFB[i+3]);
			this.labelGFB[i+3].setFont(Design.SUBTITLE);
			
			for(int j = 0; j < 2; j++) {
				JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
				xp.addAll(this.xpStuff.get(i*2+j+2), this.lvlXpStuff.get(i*2+j+2));
				xpRing.add(xp);
			}
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labelGFB[i+1], Box.createVerticalStrut(10), descRing, Box.createVerticalStrut(5), xpRing);
			this.labelGFB[i+1].setFont(Design.TITLE);
			
			this.showAndHideXpStuff.add(xpRing);
			
			this.addAll(Box.createVerticalStrut(10), elemI);
		}
		
		this.addAll(Box.createVerticalStrut(10), this.capeRingSetInfo);
		
		initPanel();
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(Entry<String, JLangLabel> entry : this.labelAPI.entrySet()) {
			entry.getValue().updateText(lang);
		}
	}
	
	public void updateCapeRing() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Cape[] tabCape = Cape.getPossibleCape(grade.getGrade(), lvl);
		
		if(!this.cape.setItems(tabCape)) {
			updateXpStuff(0);
			updateEnchant(0);
			
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
		
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = Ring.getPossibleRing(lvl, null);
			
			if(!this.ring.get(i).setItems(tabRing)) {
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
			updateXpStuff(this.getCape(), id);
		} else {
			updateXpStuff(this.getRing(id-1), id);
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
