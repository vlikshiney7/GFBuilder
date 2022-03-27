package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.customequip.CustomCape;
import fr.vlik.grandfantasia.customequip.CustomRing;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.BonusEquipSet;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.EquipSet;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.equipupgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.grandfantasia.template.ProcEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCompleteBox;
import fr.vlik.uidesign.JCompleteBoxList;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomTextPane;
import fr.vlik.uidesign.JLangLabel;

public class PageCapeRing extends PartialXpStuff {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "CAPERING";
	private static final PageCapeRing INSTANCE = new PageCapeRing();
	
	private JCustomComboBox<Cape> cape;
	private transient JCompleteBoxList<Ring> ring = new JCompleteBoxList<>();
	private transient EquipSet equipSet;
	private ArrayList<JCustomTextPane<BonusEquipSet>> equipSetBonus = new ArrayList<>(3);
	
	private transient JCustomComboBoxList<Enchantment> enchant;
	
	public static PageCapeRing getInstance() {
		return INSTANCE;
	}
	
	private PageCapeRing() {
		super(BoxLayout.Y_AXIS, 3);
		
		Cape[] tabCape = Cape.getPossibleCape(PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl());
		this.cape = new JCustomComboBox<>(tabCape);
		this.cape.addActionListener(e -> {
			updateXpStuff(0);
			updateEnchant(0);
			
			updateEquipSet();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Ring[] tabRing = Ring.getPossibleRing(PageGeneral.getInstance().getLvl(), null);
		
		for(int i = 0; i < 2; i++) {
			int id = i;
			
			this.ring.add(new JCompleteBox<>(tabRing, JCompleteBox.FILTER32, JCompleteBox.PROC32, 5, /*Armor.getTags(), */Ring.getQualities()));
			this.ring.get(i).addActionListener(e -> {
				this.ring.get(id).activeProc();
				
				updateXpStuff(id+1);
				updateEnchant(id+1);
				updateDoubleRing(id);
				
				updateEquipSet();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.ring.addProcActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.enchant = new JCustomComboBoxList<>(3);
		this.enchant.setVisible(false);
		this.enchant.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < 2; i++) {
			this.equipSetBonus.add(new JCustomTextPane<>(new BonusEquipSet()));
		}
		
		this.components.addAll(this.ring.getList());
		this.components.addAll(this.equipSetBonus);
		
		createPanel();
		setEffects();
	}
	
	public Cape getCape() {
		return this.cape.getSelectedItem();
	}
	
	public Ring getRing(int id) {
		return this.ring.get(id).getSelectedItem();
	}

	public ProcEffect getProc(int id) {
		return this.ring.get(id).getProc().getItem();
	}
	
	public JCustomTextPane<BonusEquipSet> getEquipSetBonus(int id) {
		return this.equipSetBonus.get(id);
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Cape", new JLangLabel(Cape.CLASS_NAME, Design.TITLE));
		
		this.labels.put("Ring0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Anneau 1"); put(Language.EN, "Ring 1"); }}, Design.TITLE));
		this.labels.put("Ring1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Anneau 2"); put(Language.EN, "Ring 2"); }}, Design.TITLE));
		this.labels.put("CapeXP", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "XP Cape"); put(Language.EN, "Cape Exp"); }}, Design.SUBTITLE));
		for(int i = 0; i < 2; i++) {
			this.labels.put("RingXP" + i, new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "XP Anneau"); put(Language.EN, "Ring Exp"); }}, Design.SUBTITLE));
		}
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<>();
		
		Cape capeEffect = new Cape(this.getCape());
		capeEffect.addEnchant(this.getEnchantment(0));
		
		list.addAll(capeEffect);
		
		Ring[] rings = new Ring[2];
		for(int i = 0; i < rings.length; i++) {
			rings[i] = new Ring(this.getRing(i));
			rings[i].addEnchant(this.getEnchantment(i+1));
			
			list.addAll(rings[i]);

			if(this.ring.get(i).isProcActive()) {
				list.addAll(this.getProc(i).getEffects());
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(XpStuff.availableEffects(this.getXpStuff(i*2), this.getXpStuff(i*2+1))) {
				for(int j = 0; j < 2; j++) {
					list.addAll(this.getLvlXpStuff(i*2+j));
				}
				
				int lvlXpStuff = this.getLvlXpStuff(i*2).getLvlbuff() + this.getLvlXpStuff(i*2+1).getLvlbuff();
				
				if(i == 0) {
					if(lvlXpStuff >= capeEffect.getLvl()) {
						list.addAll(capeEffect.getBonusXP());
					}
				} else {
					if(lvlXpStuff >= rings[i-1].getLvl()) {
						list.addAll(rings[i-1].getBonusXP());
					}
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
		JCustomPanel descCape = new JCustomPanel(BoxLayout.X_AXIS);
		descCape.addAll(this.cape, this.enchant.get(0));
		
		JCustomPanel xpCape = new JCustomPanel(new GridLayout(1, 3, 10, 3));
		xpCape.add(this.labels.get("CapeXP"));
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
			xp.addAll(this.xpStuff.get(i), this.lvlXpStuff.get(i));
			xpCape.add(xp);
		}
		
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Cape"), Box.createVerticalStrut(10), descCape, Box.createVerticalStrut(5), xpCape);
		
		this.showAndHideXpStuff.add(xpCape);
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel descRing = new JCustomPanel(BoxLayout.X_AXIS);
			descRing.addAll(this.ring.get(i).getButton(), Box.createHorizontalStrut(5), this.ring.get(i), this.enchant.get(i+1), Box.createHorizontalStrut(5), this.ring.get(i).getProc());
			
			JCustomPanel xpRing = new JCustomPanel(new GridLayout(1, 3, 10, 3));
			xpRing.add(this.labels.get("RingXP" + i));
			
			for(int j = 0; j < 2; j++) {
				JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
				xp.addAll(this.xpStuff.get(i*2+j+2), this.lvlXpStuff.get(i*2+j+2));
				xpRing.add(xp);
			}
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labels.get("Ring" + i), Box.createVerticalStrut(10), descRing, Box.createVerticalStrut(5), xpRing);
			
			this.showAndHideXpStuff.add(xpRing);
			
			this.addAll(Box.createVerticalStrut(10), elemI);
		}
		
		for(JCustomTextPane<BonusEquipSet> textPane : this.equipSetBonus) {
			this.addAll(Box.createVerticalStrut(10), textPane);
		}
		
		initPanel();
		
		for(JCustomTextPane<BonusEquipSet> equipSetPane : this.equipSetBonus) {
			equipSetPane.setVisible(false);
		}
	}
	
	public void updateCapeRing() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Cape[] tabCape = Cape.getPossibleCape(grade.getGrade(), lvl);
		
		if(!this.cape.setItems(tabCape)) {
			updateXpStuff(0);
			updateEnchant(0);
			
			MainFrame.getInstance().setRedPane(3);
		}
		
		for(int i = 0; i < 2; i++) {
			Ring[] tabRing = Ring.getPossibleRing(lvl, null);
			
			if(!this.ring.setItems(tabRing)) {
				updateXpStuff(i+1);
				updateEnchant(i+1);
				
				MainFrame.getInstance().setRedPane(3);
			}
		}
	}
	
	private void updateEquipSet() {
		JScrollPane scroll = MainFrame.getInstance().getScrollContent();
		int valueScroll = scroll.getVerticalScrollBar().getValue();
		
		Cape capeSet = this.getCape();
		Ring[] rings = new Ring[2];
		
		for(int i = 0; i < 2; i++) {
			rings[i] = this.getRing(i);
		}
		
		EquipSet armorSet = new EquipSet(rings, capeSet);
		
		if(!armorSet.equals(this.equipSet)) {
			if(armorSet.getCode().equals("-1")) {
				for(int i = 0; i < 2; i++) {
					this.equipSetBonus.get(i).setItem(new BonusEquipSet());
					this.equipSetBonus.get(i).setVisible(false);
				}
			} else {
				this.equipSetBonus.get(0).setItem(armorSet.getBonus2());
				this.equipSetBonus.get(1).setItem(armorSet.getBonus3());
				
				this.equipSetBonus.get(0).setVisible(true);
				this.equipSetBonus.get(1).setVisible(true);
			}
		}
		
		this.equipSet = armorSet;
		
		SwingUtilities.invokeLater( () -> scroll.getVerticalScrollBar().setValue(valueScroll) );
	}
	
	public void updateEnchant(int id) {
		if(id == 0) {
			if(this.cape.getSelectedIndex() != 0) {
				Cape capeEnchant = this.getCape();
				
				if(capeEnchant.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(capeEnchant);
					
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
				Ring ringEnchant = this.ring.get(id-1).getSelectedItem();
				
				if(ringEnchant.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(ringEnchant);
					
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
		Map<String, String> config = new LinkedHashMap<>();
		
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
			
			config.put("ProcRing" + i, "" + this.ring.get(i).getProc().isSelected());
		}
		
		for(int i = 0; i < this.enchant.size(); i++) {
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName(Language.FR) : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getSelectorInfo(lang) : "";
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
				Cape capeCustom = Cape.getCustom(valueSplit[1], quality, valueSplit[3]);
				
				if(capeCustom == null) {
					if(CustomCape.constructCustom(valueSplit[1], quality, valueSplit[3])) {
						SaveConfig.overrideCustom();
						PageCapeRing.getInstance().updateCapeRing();
						
						capeCustom = Cape.getCustom(valueSplit[1], quality, valueSplit[3]);
						this.cape.setSelectedItem(capeCustom);
					}
				} else {
					this.cape.setSelectedItem(capeCustom);
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
					Ring ringCustom = Ring.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(ringCustom == null) {
						if(CustomRing.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageCapeRing.getInstance().updateCapeRing();
							
							ringCustom = Ring.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.ring.get(i).setSelectedItem(ringCustom);
						}
					} else {
						this.ring.get(i).setSelectedItem(ringCustom);
					}
				}
			} else {
				this.ring.get(i).setSelectedItem(Ring.get(config.get("Ring" + i), Language.FR));
			}
			
			this.ring.get(i).getProc().setSelected(Boolean.valueOf(config.get("ProcRing" + i)));
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
