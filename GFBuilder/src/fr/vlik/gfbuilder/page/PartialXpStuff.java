package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equipupgrade.XpStuff;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.JCustomComboBoxList;

public abstract class PartialXpStuff extends PartialPage {
	
	private static final long serialVersionUID = 1L;
	
	protected transient JCustomComboBoxList<XpStuff> xpStuff;
	protected transient JCustomComboBoxList<InnerEffect> lvlXpStuff;

	protected ArrayList<JPanel> showAndHideXpStuff;

	protected PartialXpStuff(int nbXpStuff) {
		super();
		initXpStuff(nbXpStuff);
	}
	
	protected PartialXpStuff(int layout, int nbXpStuff) {
		super(layout);
		initXpStuff(nbXpStuff);
	}
	
	protected PartialXpStuff(LayoutManager layout, int nbXpStuff) {
		super(layout);
		initXpStuff(nbXpStuff);
	}
	
	public XpStuff getXpStuff(int id) {
		return this.xpStuff.get(id).getSelectedItem();
	}

	public InnerEffect getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}
	
	private void initXpStuff(int nbXpStuff) {
		this.xpStuff = new JCustomComboBoxList<>(XpStuff.class, nbXpStuff*2);
		this.xpStuff.setVisible(false);
		
		this.lvlXpStuff = new JCustomComboBoxList<>(InnerEffect.class, nbXpStuff*2);
		this.lvlXpStuff.setVisible(false);
		
		for(int i = 0; i < nbXpStuff*2; i++) {
			int duo = i;
			
			this.xpStuff.get(duo).addActionListener(e -> {
				updateLvlXpStuff(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			this.lvlXpStuff.get(duo).addActionListener(e -> {
				updateMaxLvlValue(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.showAndHideXpStuff = new ArrayList<>(nbXpStuff);
	}
	
	protected void initPanel() {
		this.showAndHideXpStuff.forEach(e -> e.setVisible(false));
	}
	
	protected void updateXpStuff(Equipment equip, int id) {
		if(equip.getQuality() != Quality.GREY) {
			XpStuff[] xpStuffTab = XpStuff.getPossibleTypeEffect(equip);
			
			this.xpStuff.setRangeItems(id*2, 2, xpStuffTab);
			this.xpStuff.setRangeVisible(id*2, 2, true);
			
			this.showAndHideXpStuff.get(id).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.xpStuff.setRangeVisible(id*2, 2, false);
			
			if(this.getXpStuff(id*2) != null && this.getXpStuff(id*2+1) != null) {
				this.xpStuff.setRangeSelectedIndex(id*2, 2, 0);
			}
		}
	}
	
	private void updateLvlXpStuff(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id - 1;
		
		if(!XpStuff.availableEffects(this.getXpStuff(id), this.getXpStuff(indexPair))) {
			this.lvlXpStuff.get(id).setVisible(false);
			this.lvlXpStuff.get(indexPair).setVisible(false);
		} else {
			XpStuff idXpStuff = this.getXpStuff(id);
			XpStuff idXpStuffDuo = this.getXpStuff(indexPair);
			
			this.lvlXpStuff.get(id).setItems(idXpStuff.getInnerEffect());
			this.lvlXpStuff.get(indexPair).setItems(idXpStuffDuo.getInnerEffect());
			
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
}
