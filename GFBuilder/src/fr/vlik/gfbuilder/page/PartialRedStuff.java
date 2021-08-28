package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomSlider;
import fr.vlik.uidesign.JLangLabel;

public abstract class PartialRedStuff extends PartialEnchantPearl {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<JCustomComboBox<RedFortification>> redFortif = new ArrayList<JCustomComboBox<RedFortification>>();
	protected ArrayList<JCustomComboBox<RedEnchantment>> redEnchant = new ArrayList<JCustomComboBox<RedEnchantment>>();
	protected ArrayList<JCustomComboBox<InnerEffect>> redLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>();
	protected ArrayList<JCustomComboBox<RedEnchantment>> refining = new ArrayList<JCustomComboBox<RedEnchantment>>();
	protected ArrayList<JCustomComboBox<InnerEffect>> refiningLvl = new ArrayList<JCustomComboBox<InnerEffect>>();
	protected ArrayList<JCustomSlider> valueFortif = new ArrayList<JCustomSlider>();
	protected ArrayList<JLangLabel> labelValue = new ArrayList<JLangLabel>();
	
	protected ArrayList<JPanel> showAndHideRedEnchant;
	
	protected CustomList<InnerEffect> redEnchants = new CustomList<InnerEffect>();

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
	
	public ArrayList<InnerEffect> getRedEnchant() {
		return this.redEnchants;
	}
	
	private void initRedStuff(int nbStuffRed) {
		for(int i = 0; i < nbStuffRed; i++) {
			int id = i;
			
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
				
				this.redLvlEnchant.add(new JCustomComboBox<InnerEffect>());
				this.redLvlEnchant.get(i*3+j).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			/* REFINING */
			for(int j = 0; j < 2; j++) {
				int idRed = i*2+j;
				this.refining.add(new JCustomComboBox<RedEnchantment>());
				this.refining.get(i*2+j).addActionListener(e -> {
					updateRefiningLvl(idRed);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				
				this.refiningLvl.add(new JCustomComboBox<InnerEffect>());
				this.refiningLvl.get(i*2+j).addActionListener(e -> {
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
		
		this.showAndHideRedEnchant = new ArrayList<JPanel>(nbStuffRed);
	}
	
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
		
		String tooltip = "";
		
		if(equip.getEffects() != null) {
			for(Calculable calculable : equip.getEffects()) {
				if(calculable instanceof Effect) {
					Effect effect = (Effect) calculable;
					
					if(effect.getType().isUpgradable && ! effect.isPercent()) {
						tooltip += effect.toString() + " +" + ((int) (effect.getValue() * current - effect.getValue())) + "<br>";
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
		RedEnchantment redEnchant = this.getRedEnchantment(id);
		
		if(redEnchant != null && redEnchant.getInnerEffect() != null) {
			this.redLvlEnchant.get(id).setItems(redEnchant.getInnerEffect());
			this.redLvlEnchant.get(id).setVisible(true);
		} else {
			this.redLvlEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateRefiningLvl(int id) {
		RedEnchantment refining = this.getRefining(id);
		
		if(refining != null && refining.getInnerEffect() != null) {
			this.refiningLvl.get(id).setItems(refining.getInnerEffect());
			this.refiningLvl.get(id).setVisible(true);
		} else {
			this.refiningLvl.get(id).setVisible(false);
		}
	}
	
	abstract protected void updateTooltipFortif(int id);
	
	abstract protected void updateRedEnchant(int id);
}
