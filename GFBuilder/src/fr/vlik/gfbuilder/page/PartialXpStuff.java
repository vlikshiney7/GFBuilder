package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Equipment;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.JCustomComboBox;

public abstract class PartialXpStuff extends PartialPage {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<JCustomComboBox<XpStuff>> xpStuff = new ArrayList<JCustomComboBox<XpStuff>>();
	protected ArrayList<JCustomComboBox<InnerEffect>> lvlXpStuff = new ArrayList<JCustomComboBox<InnerEffect>>();

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
		for(int i = 0; i < nbXpStuff*2; i++) {
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
		
		this.showAndHideXpStuff = new ArrayList<JPanel>(nbXpStuff);
	}
	
	protected void initPanel() {
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
	}
	
	protected void updateXpStuff(Equipment equip, int id) {
		if(equip.getQuality() != Quality.GREY) {
			XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(equip);
			
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
	
	private void updateLvlXpStuff(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id - 1;
		
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
}
