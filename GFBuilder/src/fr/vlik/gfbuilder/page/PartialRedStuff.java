package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equipupgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipupgrade.RedFortification;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomSlider;
import fr.vlik.uidesign.JLangLabel;

public abstract class PartialRedStuff extends PartialEnchantPearl {
	
	private static final long serialVersionUID = 1L;
	
	protected transient JCustomComboBoxList<RedFortification> redFortif;
	protected transient JCustomComboBoxList<RedEnchantment> redEnchant;
	protected transient JCustomComboBoxList<InnerEffect> redLvlEnchant;
	protected transient JCustomComboBoxList<RedEnchantment> refining;
	protected transient JCustomComboBoxList<InnerEffect> refiningLvl;
	protected ArrayList<JCustomSlider> valueFortif = new ArrayList<>();
	protected ArrayList<JLangLabel> labelValue = new ArrayList<>();
	
	protected ArrayList<JPanel> showAndHideRedEnchant;
	
	protected transient CustomList<InnerEffect> redEnchants = new CustomList<>();

	protected PartialRedStuff(int nbStuffRed) {
		super(nbStuffRed);
		initRedStuff(nbStuffRed);
	}
	
	protected PartialRedStuff(int layout, int nbStuffRed) {
		super(layout, nbStuffRed);
		initRedStuff(nbStuffRed);
	}
	
	protected PartialRedStuff(LayoutManager layout, int nbStuffRed) {
		super(layout, nbStuffRed);
		initRedStuff(nbStuffRed);
	}
	
	public RedEnchantment getRedEnchantment(int id) {
		return this.redEnchant.get(id).getSelectedItem();
	}
	
	public RedEnchantment getRefining(int id) {
		return this.refining.get(id).getSelectedItem();
	}
	
	public RedFortification getRedFortif(int id) {
		return this.redFortif.get(id).getSelectedItem();
	}
	
	public InnerEffect getRedLvlEnchant(int id) {
		return this.redLvlEnchant.get(id).getSelectedItem();
	}
	
	public InnerEffect getRefiningLvl(int id) {
		return this.refiningLvl.get(id).getSelectedItem();
	}
	
	public List<InnerEffect> getRedEnchant() {
		return this.redEnchants;
	}
	
	private void initRedStuff(int nbStuffRed) {
		this.redFortif = new JCustomComboBoxList<>(nbStuffRed, RedFortification.getData());
		this.redFortif.setVisible(false);
		
		this.redEnchant = new JCustomComboBoxList<>(nbStuffRed*3);
		
		this.redLvlEnchant = new JCustomComboBoxList<>(nbStuffRed*3);
		this.redLvlEnchant.setVisible(false);
		this.redLvlEnchant.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.refining = new JCustomComboBoxList<>(nbStuffRed*2);
		
		this.refiningLvl = new JCustomComboBoxList<>(nbStuffRed*2);
		this.refiningLvl.setVisible(false);
		this.refiningLvl.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < nbStuffRed; i++) {
			int id = i;
			
			/* RED FORTIF */
			this.redFortif.get(i).addActionListener(e -> {
				updateValueFortif(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* RED ENCHANT */
			for(int j = 0; j < 3; j++) {
				int idRed = i*3+j;
				
				this.redEnchant.get(i*3+j).addActionListener(e -> {
					updateRedLvlEnchant(idRed);
					updateRedEnchant(idRed);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			/* REFINING */
			for(int j = 0; j < 2; j++) {
				int idRed = i*2+j;
				
				this.refining.get(i*2+j).addActionListener(e -> {
					updateRefiningLvl(idRed);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
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
		}
		
		this.showAndHideRedEnchant = new ArrayList<>(nbStuffRed);
	}
	
	@Override
	protected void initPanel() {
		for(JPanel panel : this.showAndHideRedEnchant) {
			panel.setVisible(false);
		}
		
		super.initPanel();
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
	
	protected void updateTooltipFortif(Equipment equip, int id) {
		double current = this.valueFortif.get(id).getDoubleValue() - 100;
		current = current / 100 +1;
		
		StringBuilder tooltip = new StringBuilder();
		
		if(equip.getEffects() != null) {
			for(Calculable calculable : equip.getEffects()) {
				if(calculable instanceof Effect) {
					Effect effect = (Effect) calculable;
					
					if(effect.getType().isUpgradable && ! effect.isPercent()) {
						tooltip.append(effect.getSelectorInfo(Language.FR) + " +" + ((int) (effect.getValue() * current - effect.getValue())) + "<br>");
					}
				}
			}
		}
		
		this.labelValue.get(id).setText("<html>" + tooltip + "</html>");
	}
	
	protected void updateRedEnchant(Equipment equip, int idRed) {
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
		
		RedEnchantment[] tabRed1 = RedEnchantment.getPossibleRedEnchant(equip, choice, memory2);
		RedEnchantment[] tabRed2 = RedEnchantment.getPossibleRedEnchant(equip, choice, memory1);
		
		this.redEnchant.get(ignore1).setItems(tabRed1, memory1);
		this.redEnchant.get(ignore2).setItems(tabRed2, memory2);
	}
	
	private void updateRedLvlEnchant(int id) {
		RedEnchantment idRedEnchant = this.getRedEnchantment(id);
		
		if(idRedEnchant != null && idRedEnchant.getInnerEffect() != null) {
			this.redLvlEnchant.get(id).setItems(idRedEnchant.getInnerEffect());
			this.redLvlEnchant.get(id).setVisible(true);
		} else {
			this.redLvlEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateRefiningLvl(int id) {
		RedEnchantment idRefining = this.getRefining(id);
		
		if(idRefining != null && idRefining.getInnerEffect() != null) {
			this.refiningLvl.get(id).setItems(idRefining.getInnerEffect());
			this.refiningLvl.get(id).setVisible(true);
		} else {
			this.refiningLvl.get(id).setVisible(false);
		}
	}
	
	protected abstract void updateTooltipFortif(int id);
	
	protected abstract void updateRedEnchant(int id);
}
