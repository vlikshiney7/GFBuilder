package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Speciality;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageSpeciality extends PagePanel implements ConvertEffect {

	private static final long serialVersionUID = 1L;
	private static PageSpeciality INSTANCE = new PageSpeciality();
	
	private Speciality[] tabSpeciality;
	private JLabel nbSpePoint = new JLabel("1145");
	private ArrayList<JLabel> iconSpe = new ArrayList<JLabel>(20);
	private ArrayList<JCustomComboBox<Integer>> spePoint = new ArrayList<JCustomComboBox<Integer>>(20);
	private JCustomButton maxSpe;
	
	private ArrayList<Effect> convertEffects;
	
	public static PageSpeciality getInstance() {
		return INSTANCE;
	}
	
	private PageSpeciality() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		this.tabSpeciality = Speciality.getData(PageGeneral.getInstance().getGrade().getGrade());
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				int id = numSpe;
				this.spePoint.add(new JCustomComboBox<Integer>(new Integer[] { 0 }));
				this.spePoint.get(numSpe).setRenderer(new CustomListCellRenderer());
				this.spePoint.get(numSpe).addActionListener(e -> {
					updateSpeElement(id);
					updateSpePoint();
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.spePoint.get(numSpe).setVisible(false);
				
				this.iconSpe.add(new JLabel(new ImageIcon(this.tabSpeciality[numSpe].getIcon())));
				this.iconSpe.get(numSpe).setToolTipText(this.tabSpeciality[numSpe].getTooltip());
				this.iconSpe.get(numSpe).setVisible(false);
				
				numSpe++;
			}
		}
		
		this.maxSpe = new JCustomButton("Mettre toutes les spécialités au niveau maximum");
		this.maxSpe.addActionListener(e -> {
			setMaxCBoxSpe();
		});
		
		createPanel();
		setEffects();
	}
	
	@Override
	public ArrayList<Effect> getConvertEffects() {
		return this.convertEffects;
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		ArrayList<Effect> convert = new ArrayList<Effect>();
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			for(int j = 0; j < this.tabSpeciality[i].getEffects().size(); j++) {
				if(this.tabSpeciality[i].getEffects().get(j).getTransfert() == null) {
					list.add(Speciality.multiplyEffect(this.tabSpeciality[i].getEffects().get(j), this.spePoint.get(i).getSelectedIndex()));
				} else {
					convert.add(Speciality.multiplyEffect(this.tabSpeciality[i].getEffects().get(j), this.spePoint.get(i).getSelectedIndex()));
				}
			}
		}
		
		this.effects = list;
		this.convertEffects = convert;
	}
	
	@Override
	protected void createPanel() {
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Consts.UIColor[1]);
		this.add(this.label[0]);
		this.add(Box.createVerticalStrut(10));
		
		JPanel remain = new JPanel();
		remain.setBackground(Consts.UIColor[1]);
		this.label[1].setFont(new Font("Open Sans", Font.PLAIN, 14));
		remain.add(this.label[1]);
		this.nbSpePoint.setFont(new Font("Open Sans", Font.BOLD, 14));
		this.nbSpePoint.setForeground(Consts.FontColor[0]);
		remain.add(this.nbSpePoint);
		
		this.add(remain);
		this.add(Box.createVerticalStrut(5));
		
		
		JPanel catSpe = new JPanel(new GridLayout(4, 1));
		catSpe.setBackground(Consts.UIColor[1]);
		JPanel gridSpe = new JPanel(new GridLayout(4, 6, 5, 5));
		gridSpe.setBackground(Consts.UIColor[1]);
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			this.label[i+2].setFont(new Font("Open Sans", Font.PLAIN, 14));
			this.label[i+2].setPreferredSize(new Dimension(76, 70));
			catSpe.add(this.label[i+2]);
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				JPanel panelSpe = new JPanel();
				panelSpe.setLayout(new BoxLayout(panelSpe, BoxLayout.Y_AXIS));
				panelSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
				panelSpe.setPreferredSize(new Dimension(46, 65));
				panelSpe.setBackground(Consts.UIColor[0]);
				this.iconSpe.get(numSpe).setAlignmentX(CENTER_ALIGNMENT);
				panelSpe.add(this.iconSpe.get(numSpe));
				panelSpe.add(Box.createVerticalStrut(5));
				panelSpe.add(this.spePoint.get(numSpe));
				
				gridSpe.add(panelSpe);
				
				numSpe++;
			}
			for(int j = k; j < 6; j++) {
				JPanel voidPanel = new JPanel();
				voidPanel.setBackground(Consts.UIColor[1]);
				gridSpe.add(voidPanel);
			}
		}
		
		JPanel elem1 = new JPanel();
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(catSpe);
		elem1.add(Box.createHorizontalStrut(10));
		elem1.add(gridSpe);
		
		this.add(elem1);
		
		this.maxSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.maxSpe.setMinimumSize(new Dimension(0, 30));
		this.maxSpe.setAlignmentX(CENTER_ALIGNMENT);
		
		this.add(maxSpe);
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 7);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateListSpe() {
		Grade grade = PageGeneral.getInstance().getGrade();
		this.tabSpeciality = Speciality.getData(grade.getGrade());
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			this.iconSpe.get(i).setIcon(new ImageIcon(this.tabSpeciality[i].getIcon()));
			this.iconSpe.get(i).setToolTipText(this.tabSpeciality[i].getTooltip());
			this.spePoint.get(i).setSelectedIndex(0);
		}
	}
	
	public void updateSpe() {
		int lvl = PageGeneral.getInstance().getLvl();
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			if(lvl < this.tabSpeciality[i].getLvl()) {
				this.iconSpe.get(i).setVisible(false);
				this.spePoint.get(i).setVisible(false);
				this.spePoint.get(i).setSelectedIndex(0);
			} else {
				this.iconSpe.get(i).setVisible(true);
				this.spePoint.get(i).setVisible(true);
				if(this.spePoint.get(i).getSelectedIndex() > 10) {
					this.spePoint.get(i).setSelectedIndex(10);
				} else {
					updateSpeElement(i);
				}
			}
		}
	}
	
	private void updateSpePoint() {
		int remain = 1145;
		for(int i = 0; i < this.spePoint.size(); i++) {
			int current = this.spePoint.get(i).getSelectedIndex();
			if(this.tabSpeciality[i].getLvl() == 45) {
				if(current > 15) {
					remain -= (current - 15) * 9;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 5;
					current -= current - 10;
				}
				remain -= current * 2;
			} else if(this.tabSpeciality[i].getLvl() == 60) {
				if(current > 15) {
					remain -= (current - 15) * 11;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 7;
					current -= current - 10;
				}
				remain -= current * 4;
			} else if(this.tabSpeciality[i].getLvl() == 75) {
				if(current > 15) {
					remain -= (current - 15) * 13;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 9;
					current -= current - 10;
				}
				remain -= current * 6;
			} else if(this.tabSpeciality[i].getLvl() == 91) {
				if(current > 15) {
					remain -= (current - 15) * 15;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 11;
					current -= current - 10;
				}
				remain -= current * 8;
			}
		}
		this.nbSpePoint.setText("" + remain);
		for(int i = 0; i < 20; i++) {
			if(this.spePoint.get(i).getItemCount() != this.spePoint.get(i).getSelectedIndex()) {
				if(this.tabSpeciality[i].getLvl() == 45) {
					adjustSpeCombobox(i, remain, 2);
				} else if(this.tabSpeciality[i].getLvl() == 60) {
					adjustSpeCombobox(i, remain, 4);
				} else if(this.tabSpeciality[i].getLvl() == 75) {
					adjustSpeCombobox(i, remain, 6);
				} else if(this.tabSpeciality[i].getLvl() == 91) {
					adjustSpeCombobox(i, remain, 8);
				}
			}
		}
	}
	
	private void adjustSpeCombobox(int idSpe, int remain, int speCost) {
		int countFull = 0;
		for(int j = this.spePoint.get(idSpe).getSelectedIndex(); j < this.spePoint.get(idSpe).getItemCount()-1; j++) {
			if(j < 11) countFull += speCost;
			else if(j < 16) countFull += speCost + 3;
			else if(j < 21) countFull += speCost + 7;
		}
		
		while(countFull > remain) {
			int itemCount = this.spePoint.get(idSpe).getItemCount();
			if(itemCount == 0) break;
			else if(itemCount <= 11) countFull -= speCost;
			else if(itemCount <= 16) countFull -= speCost + 3;
			else if(itemCount <= 21) countFull -= speCost + 7;
			this.spePoint.get(idSpe).removeItemAt(itemCount-1);
		}
	}
	
	private void updateSpeElement(int idList) {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		int nb10sup = 0;
		int nb15sup = 0;
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			if(this.spePoint.get(i).getSelectedIndex() > 10) nb10sup++;
			if(this.spePoint.get(i).getSelectedIndex() > 15) nb15sup++;
		}
		
		if(!reinca) {
			if(lvl < 91) {
				if(nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else {
				if(nb15sup == 0 && nb10sup < 2) {
					rescaleSpeComboBox(21);
				} else if(nb15sup == 0 && nb10sup == 2) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 1 && nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			}
		} else {
			if(lvl < 86) {
				if(nb10sup < 2) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else if(lvl < 91) {
				if(nb10sup < 3) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else if(lvl < 100) {
				if(nb15sup == 0 && nb10sup < 3) {
					rescaleSpeComboBox(21);
				} else if(nb15sup == 0 && nb10sup == 3) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 1 && nb10sup < 3) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			} else {
				if(nb15sup < 2 && nb10sup < 4) {
					rescaleSpeComboBox(21);
				} else if(nb15sup < 2 && nb10sup == 4) {
					rescaleSpeComboBox10SupOnly(21);
				} else if(nb15sup == 2 && nb10sup < 4) {
					rescaleSpeComboBox(16);
				} else {
					rescaleSpeComboBox(11);
				}
			}
		}
	}
	
	private void rescaleSpeComboBox(int rescale) {
		for(int i = 0; i < 20; i++) {
			int itemCount = this.spePoint.get(i).getItemCount();
			if(itemCount < rescale) {
				while(itemCount != rescale) {
					this.spePoint.get(i).addItem(new Integer(itemCount));
					itemCount++;
				}
			} else if(itemCount > rescale && this.spePoint.get(i).getSelectedIndex() < rescale) {
				while(itemCount != rescale) {
					itemCount--;
					this.spePoint.get(i).removeItemAt(itemCount);
				}
			}
		}
	}
	
	private void rescaleSpeComboBox10SupOnly(int rescale) {
		for(int i = 0; i < 20; i++) {
			int itemCount = this.spePoint.get(i).getItemCount();
			if(this.spePoint.get(i).getSelectedIndex() > 11) {
				while(itemCount != rescale) {
					this.spePoint.get(i).addItem(new Integer(itemCount));
					itemCount++;
				}
			} else {
				if(itemCount < 11) {
					while(itemCount != 11) {
						this.spePoint.get(i).addItem(new Integer(itemCount));
						itemCount++;
					}
				}
				else if(itemCount > 11)
					while(itemCount != 11) {
						itemCount--;
						this.spePoint.get(i).removeItemAt(itemCount);
					}
			}
		}
	}
	
	private void setMaxCBoxSpe() {
		for(JComboBox<Integer> speciality : this.spePoint) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(10);
			} else break;
		}
	}
}