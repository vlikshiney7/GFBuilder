package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characUpgrade.Speciality;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;

public class PageSpeciality extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "SPECIALITY";
	private static PageSpeciality INSTANCE = new PageSpeciality();
	
	private Grade currentGrade;
	
	private Speciality[] tabSpeciality;
	private JLabel nbSpePoint = new JLabel("1775");
	private ArrayList<JLabel> iconSpe = new ArrayList<JLabel>(20);
	private ArrayList<JCustomComboBox<Integer>> spePoint = new ArrayList<JCustomComboBox<Integer>>(20);
	
	private JCustomButton reinitSpe;
	private JCustomButton maxSpe;
	
	public static PageSpeciality getInstance() {
		return INSTANCE;
	}
	
	private PageSpeciality() {
		super(BoxLayout.Y_AXIS, NUM_PAGE);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[1]);
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		
		this.tabSpeciality = Speciality.getData(this.currentGrade.getGrade());
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				this.spePoint.add(new JCustomComboBox<Integer>(new Integer[] { 0 }));
				this.spePoint.get(numSpe).addActionListener(e -> {
					updateSpeElement();
					updateSpePoint();
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.spePoint.get(numSpe).setVisible(false);
				
				this.iconSpe.add(new JLabel(this.tabSpeciality[numSpe].getIcon()));
				this.iconSpe.get(numSpe).setToolTipText(this.tabSpeciality[numSpe].getTooltip());
				this.iconSpe.get(numSpe).setVisible(false);
				
				numSpe++;
			}
		}
		
		this.reinitSpe = new JCustomButton(this.labelGFB[6].getLang(), Design.RED_COLOR);
		this.reinitSpe.addActionListener(e -> {
			setMinSpe();
		});
		
		this.maxSpe = new JCustomButton(this.labelGFB[7].getLang(), Design.GREEN_COLOR);
		this.maxSpe.addActionListener(e -> {
			setMaxSpe();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			for(Calculable c : this.tabSpeciality[i].getEffects()) {
				list.add(Speciality.multiplyEffect(c, this.spePoint.get(i).getSelectedIndex()));
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JCustomPanel remain = new JCustomPanel();
		remain.addAll(this.labelGFB[1], this.nbSpePoint);
		this.labelGFB[1].setFont(Design.SUBTITLE);
		this.nbSpePoint.setFont(new Font("Open Sans", Font.BOLD, 14));
		this.nbSpePoint.setForeground(Design.FontColor[0]);
		
		this.addAll(this.labelGFB[0], Box.createVerticalStrut(10), remain, Box.createVerticalStrut(5));
		this.labelGFB[0].setFont(Design.TITLE);
		
		
		JCustomPanel catSpe = new JCustomPanel(new GridLayout(4, 1));
		JCustomPanel gridSpe = new JCustomPanel(new GridLayout(4, 6, 5, 5));
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			catSpe.add(this.labelGFB[i+2]);
			this.labelGFB[i+2].setFont(Design.SUBTITLE);
			this.labelGFB[i+2].setPreferredSize(new Dimension(76, 70));
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				JCustomPanel panelSpe = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(5, 5, 5, 5));
				panelSpe.setBackground(Design.UIColor[0]);
				panelSpe.setPreferredSize(new Dimension(50, 65));
				this.iconSpe.get(numSpe).setAlignmentX(CENTER_ALIGNMENT);
				panelSpe.addAll(this.iconSpe.get(numSpe), Box.createVerticalStrut(5), this.spePoint.get(numSpe));
				
				gridSpe.add(panelSpe);
				
				numSpe++;
			}
			for(int j = k; j < 6; j++) {
				gridSpe.add(new JCustomPanel());
			}
		}
		
		this.addAll(new JCustomPanel(catSpe, Box.createHorizontalStrut(10), gridSpe), Box.createVerticalStrut(5));
		
		
		this.reinitSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.reinitSpe.setMinimumSize(new Dimension(0, 30));
		
		this.maxSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.maxSpe.setMinimumSize(new Dimension(0, 30));
		
		JCustomPanel elem2 = new JCustomPanel(new GridLayout(1, 2, 10, 5));
		elem2.addAll(this.reinitSpe, this.maxSpe);
		
		this.add(elem2);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
		
		this.reinitSpe.updateText(lang);
		this.maxSpe.updateText(lang);
	}
	
	public void updateListSpe() {
		Grade grade = PageGeneral.getInstance().getGrade();
		
		if(this.currentGrade.getGrade() == grade.getGrade()) {
			return;
		} else {
			this.currentGrade = grade;
		}
		
		this.tabSpeciality = Speciality.getData(grade.getGrade());
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			this.iconSpe.get(i).setIcon(this.tabSpeciality[i].getIcon());
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
					updateSpeElement();
				}
			}
		}
	}
	
	private void updateSpePoint() {
		int remain = 1775;
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
			} else if(this.tabSpeciality[i].getLvl() == 100) {
				if(current > 15) {
					remain -= (current - 15) * 17;
					current -= current - 15;
				}
				if(current > 10) {
					remain -= (current - 10) * 13;
					current -= current - 10;
				}
				remain -= current * 10;
			}
		}
		
		this.nbSpePoint.setText("" + remain);
		for(int i = 0; i < 20; i++) {
			if(this.spePoint.get(i).getItemCount()-1 != this.spePoint.get(i).getSelectedIndex()) {
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
			if(j < 10) {
				countFull += speCost;
			} else if(j < 15) {
				countFull += speCost + 3;
			} else if(j < 20) {
				countFull += speCost + 7;
			}
		}
		
		while(countFull > remain) {
			int itemCount = this.spePoint.get(idSpe).getItemCount();
			
			if(itemCount == 1) {
				break;
			} else if(itemCount <= 11) {
				countFull -= speCost;
			} else if(itemCount <= 16) {
				countFull -= speCost + 3;
			} else if(itemCount <= 21) {
				countFull -= speCost + 7;
			}
			
			this.spePoint.get(idSpe).removeItemAt(itemCount-1);
		}
	}
	
	private void updateSpeElement() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int nb10sup = 0;
		int nb15sup = 0;
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			if(this.spePoint.get(i).getSelectedIndex() > 10) {
				nb10sup++;
			}
			if(this.spePoint.get(i).getSelectedIndex() > 15) {
				nb15sup++;
			}
		}
		
		if(reinca.getLvl() == 0) {
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
				else if(itemCount > 11) {
					while(itemCount != 11) {
						itemCount--;
						this.spePoint.get(i).removeItemAt(itemCount);
					}
				}
			}
		}
	}
	
	private void setMinSpe() {
		for(JCustomComboBox<Integer> speciality : this.spePoint) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(0);
			} else break;
		}
	}
	
	private void setMaxSpe() {
		setMinSpe();
		
		for(JCustomComboBox<Integer> speciality : this.spePoint) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(10);
			} else break;
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			config.put("LvlSpeciality" + i, "" + this.spePoint.get(i).getSelectedIndex());
		}
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		setMinSpe();
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			this.spePoint.get(i).setSelectedIndex(Integer.valueOf(config.get("LvlSpeciality" + i)));
		}
	}
}
