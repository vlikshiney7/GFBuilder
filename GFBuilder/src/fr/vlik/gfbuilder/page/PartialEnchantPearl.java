package fr.vlik.gfbuilder.page;

import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JPanel;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.equipUpgrade.PearlEnchantment;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JIconCheckBox;

public abstract class PartialEnchantPearl extends PartialXpStuff {
	
	private static final long serialVersionUID = 1L;
	
	protected ArrayList<ArrayList<JIconCheckBox>> starPearl = new ArrayList<ArrayList<JIconCheckBox>>();
	protected ArrayList<JCustomComboBox<PearlEnchantment>> pearlEnchant = new ArrayList<JCustomComboBox<PearlEnchantment>>();
	protected ArrayList<JCustomComboBox<InnerEffect>> pearlLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>();
	
	protected ArrayList<JPanel> showAndHideEnchant;
	
	protected CustomList<InnerEffect> pearlEnchants = new CustomList<InnerEffect>();

	protected PartialEnchantPearl(int caseTabLabel, int nbEnchantPearl) {
		super(caseTabLabel, nbEnchantPearl);
		initEnchantPearl(nbEnchantPearl);
	}
	
	protected PartialEnchantPearl(int layout, int caseTabLabel, int nbEnchantPearl) {
		super(layout, caseTabLabel, nbEnchantPearl);
		initEnchantPearl(nbEnchantPearl);
	}
	
	protected PartialEnchantPearl(LayoutManager layout, int caseTabLabel, int nbEnchantPearl) {
		super(layout, caseTabLabel, nbEnchantPearl);
		initEnchantPearl(nbEnchantPearl);
	}
	
	public PearlEnchantment getPearlEnchantment(int id) {
		return this.pearlEnchant.get(id).getSelectedItem();
	}
	
	public InnerEffect getLvlPearlEnchant(int id) {
		return this.pearlLvlEnchant.get(id).getSelectedItem();
	}
	
	public ArrayList<InnerEffect> getPearlEnchant() {
		return this.pearlEnchants;
	}
	
	private void initEnchantPearl(int nbEnchantPearl) {
		for(int i = 0; i < nbEnchantPearl; i++) {
			int id = i;
			this.starPearl.add(new ArrayList<JIconCheckBox>(4));
			
			for(int j = 0; j < 4; j++) {
				int idCheck = j;
				
				if(j == 0) {
					this.starPearl.get(i).add(new JIconCheckBox("starZero", "starOff"));
					this.starPearl.get(i).get(0).setSelected(true);
				} else {
					this.starPearl.get(i).add(new JIconCheckBox("starOn", "starOff"));
				}
				
				this.starPearl.get(i).get(j).addActionListener(e -> {
					updateStarPearl(id, idCheck);
					keepPearlEnchant(id, idCheck);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.starPearl.get(i).get(j).setVisible(false);
			}
			
			for(int j = 0; j < 5; j++) {
				int idPearl = i*5+j;
				
				this.pearlEnchant.add(new JCustomComboBox<PearlEnchantment>(PearlEnchantment.getData()));
				this.pearlEnchant.get(idPearl).addActionListener(e -> {
					updatePearlLvlEnchant(idPearl);
					updatePearlEnchant(idPearl);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearlEnchant.get(idPearl).setVisible(false);
				
				this.pearlLvlEnchant.add(new JCustomComboBox<InnerEffect>());
				this.pearlLvlEnchant.get(idPearl).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.pearlLvlEnchant.get(idPearl).setVisible(false);
			}
		}
		
		this.showAndHideEnchant = new ArrayList<JPanel>(nbEnchantPearl);
	}
	
	protected void initPanel() {
		for(JPanel panel : this.showAndHideEnchant) {
			panel.setVisible(false);
		}
		
		super.initPanel();
	}
	
	public void initPearlEnchant() {
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			this.pearlEnchant.get(i).setSelectedIndex(i%5);
		}
	}
	
	protected void updateEnchantPearl(boolean showStar, int id) {
		this.showAndHideEnchant.get(id).setVisible(showStar);
		
		int idCheck = -1;
		for(int i = 0; i < 4; i++) {
			this.starPearl.get(id).get(i).setVisible(showStar);
			this.labelAPI.get("PearlEnchant" + id).setVisible(showStar);
			
			if(this.starPearl.get(id).get(i).isSelected()) {
				idCheck++;
			}
		}
		
		if(!showStar) {
			for(int j = 0; j < 5; j++) {
				this.pearlEnchant.get(id*5+j).setVisible(false);
				this.pearlLvlEnchant.get(id*5+j).setVisible(false);
			}
		} else {
			updateStarPearl(id, idCheck);
		}
	}
	
	protected void updateStarPearl(int id, int idCheck) {
		for(int i = 0; i < this.starPearl.get(id).size(); i++) {
			if(i <= idCheck) {
				this.starPearl.get(id).get(i).setSelected(true);
			} else {
				this.starPearl.get(id).get(i).setSelected(false);
			}
		}
		
		switch (idCheck) {
			case 0:
				this.showAndHideEnchant.get(id).setVisible(false);
				for(int i = 0; i < 5; i++) {
					this.pearlEnchant.get(id*5+i).setVisible(false);
					this.pearlLvlEnchant.get(id*5+i).setVisible(false);
				}
				break;
			case 1:
				for(int i = 0; i < 5; i++) {
					this.showAndHideEnchant.get(id).setVisible(true);
					if(i < 1) {
						this.pearlEnchant.get(id*5+i).setVisible(true);
						this.pearlLvlEnchant.get(id*5+i).setVisible(true);
						updatePearlLvlEnchant(id*5+i);
					} else {
						this.pearlEnchant.get(id*5+i).setVisible(false);
						this.pearlLvlEnchant.get(id*5+i).setVisible(false);
					}
				}
				break;
			case 2:
				for(int i = 0; i < 5; i++) {
					this.showAndHideEnchant.get(id).setVisible(true);
					if(i < 3) {
						this.pearlEnchant.get(id*5+i).setVisible(true);
						this.pearlLvlEnchant.get(id*5+i).setVisible(true);
						updatePearlLvlEnchant(id*5+i);
					} else {
						this.pearlEnchant.get(id*5+i).setVisible(false);
						this.pearlLvlEnchant.get(id*5+i).setVisible(false);
					}
				}
				break;
			case 3:
				this.showAndHideEnchant.get(id).setVisible(true);
				for(int i = 0; i < 5; i++) {
					this.pearlEnchant.get(id*5+i).setVisible(true);
					this.pearlLvlEnchant.get(id*5+i).setVisible(true);
					updatePearlLvlEnchant(id*5+i);
				}
				break;
		}
	}
	
	private void updatePearlEnchant(int idPearl) {
		int nbStar = -1;
		for(JIconCheckBox star : this.starPearl.get(idPearl/5)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		if(nbStar <= 1) {
			return;
		} else if(nbStar == 2) {
			int ignore1;
			int ignore2;
			
			if(idPearl % 5 == 0) {
				ignore1 = idPearl + 1;
				ignore2 = idPearl + 2;
			} else if(idPearl % 5 == 1) {
				ignore1 = idPearl - 1;
				ignore2 = idPearl + 1;
			} else {
				ignore1 = idPearl - 2;
				ignore2 = idPearl - 1;
			}
			
			PearlEnchantment choice = this.getPearlEnchantment(idPearl);
			PearlEnchantment memory1 = this.getPearlEnchantment(ignore1);
			PearlEnchantment memory2 = this.getPearlEnchantment(ignore2);
			
			PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant(choice, memory2);
			PearlEnchantment[] tabPearl2 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1);
			
			this.pearlEnchant.get(ignore1).setItems(tabPearl1, memory1);
			this.pearlEnchant.get(ignore2).setItems(tabPearl2, memory2);
		} else if(nbStar == 3) {
			int ignore1;
			int ignore2;
			int ignore3;
			int ignore4;
			
			if(idPearl % 5 == 0) {
				ignore1 = idPearl + 1;
				ignore2 = idPearl + 2;
				ignore3 = idPearl + 3;
				ignore4 = idPearl + 4;
			} else if(idPearl % 5 == 1) {
				ignore1 = idPearl - 1;
				ignore2 = idPearl + 1;
				ignore3 = idPearl + 2;
				ignore4 = idPearl + 3;
			} else if(idPearl % 5 == 2) {
				ignore1 = idPearl - 2;
				ignore2 = idPearl - 1;
				ignore3 = idPearl + 1;
				ignore4 = idPearl + 2;
			} else if(idPearl % 5 == 3) {
				ignore1 = idPearl - 3;
				ignore2 = idPearl - 2;
				ignore3 = idPearl - 1;
				ignore4 = idPearl + 1;
			} else {
				ignore1 = idPearl - 4;
				ignore2 = idPearl - 3;
				ignore3 = idPearl - 2;
				ignore4 = idPearl - 1;
			}
			
			PearlEnchantment choice = this.getPearlEnchantment(idPearl);
			PearlEnchantment memory1 = this.getPearlEnchantment(ignore1);
			PearlEnchantment memory2 = this.getPearlEnchantment(ignore2);
			PearlEnchantment memory3 = this.getPearlEnchantment(ignore3);
			PearlEnchantment memory4 = this.getPearlEnchantment(ignore4);
			
			PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant(choice, memory2, memory3, memory4);
			PearlEnchantment[] tabPearl2 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory3, memory4);
			PearlEnchantment[] tabPearl3 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory2, memory4);
			PearlEnchantment[] tabPearl4 = PearlEnchantment.getPossiblePearlEnchant(choice, memory1, memory2, memory3);
			
			this.pearlEnchant.get(ignore1).setItems(tabPearl1, memory1);
			this.pearlEnchant.get(ignore2).setItems(tabPearl2, memory2);
			this.pearlEnchant.get(ignore3).setItems(tabPearl3, memory3);
			this.pearlEnchant.get(ignore4).setItems(tabPearl4, memory4);
		}
	}
	
	private void keepPearlEnchant(int id, int idCheck) {
		if(idCheck == 0) {
			return;
		} else if(idCheck == 1) {
			PearlEnchantment memory1 = this.getPearlEnchantment(id*5);
			PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant();
			this.pearlEnchant.get(id*5).setItems(tabPearl1, memory1);
		} else if(idCheck == 2) {
			PearlEnchantment memory1 = this.getPearlEnchantment(id*5);
			PearlEnchantment memory2 = this.getPearlEnchantment(id*5+1);
			PearlEnchantment memory3 = this.getPearlEnchantment(id*5+2);
			
			PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant(memory2, memory3);
			PearlEnchantment[] tabPearl2 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory3);
			PearlEnchantment[] tabPearl3 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory2);
			
			this.pearlEnchant.get(id*5).setItems(tabPearl1, memory1);
			this.pearlEnchant.get(id*5+1).setItems(tabPearl2, memory2);
			this.pearlEnchant.get(id*5+2).setItems(tabPearl3, memory3);
		} else {
			PearlEnchantment memory1 = this.getPearlEnchantment(id*5);
			PearlEnchantment memory2 = this.getPearlEnchantment(id*5+1);
			PearlEnchantment memory3 = this.getPearlEnchantment(id*5+2);
			PearlEnchantment memory4 = this.getPearlEnchantment(id*5+3);
			PearlEnchantment memory5 = this.getPearlEnchantment(id*5+4);
			
			PearlEnchantment[] tabPearl1 = PearlEnchantment.getPossiblePearlEnchant(memory2, memory3, memory4, memory5);
			PearlEnchantment[] tabPearl2 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory3, memory4, memory5);
			PearlEnchantment[] tabPearl3 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory2, memory4, memory5);
			PearlEnchantment[] tabPearl4 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory2, memory3, memory5);
			PearlEnchantment[] tabPearl5 = PearlEnchantment.getPossiblePearlEnchant(memory1, memory2, memory3, memory4);
			
			this.pearlEnchant.get(id*5).setItems(tabPearl1, memory1);
			this.pearlEnchant.get(id*5+1).setItems(tabPearl2, memory2);
			this.pearlEnchant.get(id*5+2).setItems(tabPearl3, memory3);
			this.pearlEnchant.get(id*5+3).setItems(tabPearl4, memory4);
			this.pearlEnchant.get(id*5+4).setItems(tabPearl5, memory5);
		}
	}
	
	protected void updatePearlLvlEnchant(int id) {
		int nbStar = -1;
		for(JIconCheckBox star : this.starPearl.get(id/5)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		PearlEnchantment pearlEnchant = this.getPearlEnchantment(id);
		
		if(pearlEnchant != null) {
			this.pearlLvlEnchant.get(id).setItems(pearlEnchant.getInnerLvlEffect(nbStar));
			this.pearlLvlEnchant.get(id).setVisible(this.pearlEnchant.get(id).isVisible());
		} else {
			this.pearlLvlEnchant.get(id).setVisible(false);
		}
	}
}
