package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.characUpgrade.Speciality;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;

public class PageSpeciality extends PagePanel implements ConvertEffect {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "SPECIALITY";
	private static PageSpeciality INSTANCE = new PageSpeciality();
	
	private Grade currentGrade;
	
	private Speciality[] tabSpeciality;
	private JLabel nbSpePoint = new JLabel("1145");
	private ArrayList<JLabel> iconSpe = new ArrayList<JLabel>(20);
	private ArrayList<JCustomComboBox<Integer>> spePoint = new ArrayList<JCustomComboBox<Integer>>(20);
	
	private JCustomButton reinitSpe;
	private JCustomButton maxSpe;
	
	private ArrayList<Calculable> convertEffects;
	
	public static PageSpeciality getInstance() {
		return INSTANCE;
	}
	
	private PageSpeciality() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
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
	public ArrayList<Calculable> getConvertEffects() {
		return this.convertEffects;
	}
	
	@Override
	protected void setLabelAPI() {
		
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		ArrayList<Calculable> convert = new ArrayList<Calculable>();
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			for(Calculable c : this.tabSpeciality[i].getEffects()) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					if(e.getTransfert() == null) {
						list.add(Speciality.multiplyEffect(e, this.spePoint.get(i).getSelectedIndex()));
					} else {
						convert.add(Speciality.multiplyEffect(e, this.spePoint.get(i).getSelectedIndex()));
					}
				}
			}
		}
		
		this.effects = list;
		this.convertEffects = convert;
	}
	
	@Override
	protected void createPanel() {
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[1]);
		this.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		this.add(Box.createVerticalStrut(10));
		
		JPanel remain = new JPanel();
		remain.setBackground(Design.UIColor[1]);
		remain.add(this.labelGFB[1]);
		this.labelGFB[1].setFont(Design.SUBTITLE);
		this.nbSpePoint.setFont(new Font("Open Sans", Font.BOLD, 14));
		this.nbSpePoint.setForeground(Design.FontColor[0]);
		remain.add(this.nbSpePoint);
		
		this.add(remain);
		this.add(Box.createVerticalStrut(5));
		
		
		JPanel catSpe = new JPanel(new GridLayout(4, 1));
		catSpe.setBackground(Design.UIColor[1]);
		JPanel gridSpe = new JPanel(new GridLayout(4, 6, 5, 5));
		gridSpe.setBackground(Design.UIColor[1]);
		
		int numSpe = 0;
		
		for(int i = 0; i < 4; i++) {
			catSpe.add(this.labelGFB[i+2]);
			this.labelGFB[i+2].setFont(Design.SUBTITLE);
			this.labelGFB[i+2].setPreferredSize(new Dimension(76, 70));
			
			int k = i % 2 == 0 ? 6 : 4;
			for(int j = 0; j < k; j++) {
				JPanel panelSpe = new JPanel();
				panelSpe.setLayout(new BoxLayout(panelSpe, BoxLayout.Y_AXIS));
				panelSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
				panelSpe.setPreferredSize(new Dimension(50, 65));
				panelSpe.setBackground(Design.UIColor[0]);
				this.iconSpe.get(numSpe).setAlignmentX(CENTER_ALIGNMENT);
				panelSpe.add(this.iconSpe.get(numSpe));
				panelSpe.add(Box.createVerticalStrut(5));
				panelSpe.add(this.spePoint.get(numSpe));
				
				gridSpe.add(panelSpe);
				
				numSpe++;
			}
			for(int j = k; j < 6; j++) {
				JPanel voidPanel = new JPanel();
				voidPanel.setBackground(Design.UIColor[1]);
				gridSpe.add(voidPanel);
			}
		}
		
		JPanel elem1 = new JPanel();
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(catSpe);
		elem1.add(Box.createHorizontalStrut(10));
		elem1.add(gridSpe);
		
		this.add(elem1);
		this.add(Box.createVerticalStrut(5));
		
		
		this.reinitSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.reinitSpe.setMinimumSize(new Dimension(0, 30));
		
		this.maxSpe.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.maxSpe.setMinimumSize(new Dimension(0, 30));
		
		JPanel elem2 = new JPanel(new GridLayout(1, 2, 10, 5));
		elem2.setBackground(Design.UIColor[1]);
		elem2.add(this.reinitSpe);
		elem2.add(this.maxSpe);
		
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
		for(JComboBox<Integer> speciality : this.spePoint) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(0);
			} else break;
		}
	}
	
	private void setMaxSpe() {
		setMinSpe();
		
		for(JComboBox<Integer> speciality : this.spePoint) {
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
