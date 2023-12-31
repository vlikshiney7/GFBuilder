package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characupgrade.Speciality;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageSpeciality extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "SPECIALITY";
	private static PageSpeciality INSTANCE = new PageSpeciality();
	
	private transient Grade currentGrade;
	
	private transient Speciality[] tabSpeciality;
	private JLabel nbSpePoint = new JLabel("1775");
	private ArrayList<JLabel> iconSpe = new ArrayList<>(20);
	private transient JCustomComboBoxList<Integer> spePoint;
	
	private JCustomButton reinitSpe;
	private JCustomButton maxSpe;
	
	public static PageSpeciality getInstance() {
		return INSTANCE;
	}
	
	private PageSpeciality() {
		super(BoxLayout.Y_AXIS);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[1]);
		
		this.currentGrade = PageGeneral.getInstance().getGrade();
		
		this.tabSpeciality = Speciality.getData(this.currentGrade.getGrade());
		
		this.spePoint = new JCustomComboBoxList<>(Integer.class, 26, new Integer[] { 0 });
		this.spePoint.setVisible(false);
		this.spePoint.addActionListener(e -> {
			updateSpeElement();
			updateSpePoint();
			
			setEffects();
			PageWeapon.getInstance().setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		int numSpe = 0;
		
		for(int i = 0; i < 5; i++) {
			int k = i % 2 == 0 ? 6 : 4;
			
			for(int j = 0; j < k; j++) {
				this.iconSpe.add(new JLabel(this.tabSpeciality[numSpe].getIcon()));
				this.iconSpe.get(numSpe).setToolTipText(this.tabSpeciality[numSpe].getFullInfo(Language.FR));
				this.iconSpe.get(numSpe).setVisible(false);
				
				numSpe++;
			}
		}
		
		this.reinitSpe = new JCustomButton(this.labels.get("Min").getLang(), Design.RED_COLOR);
		this.reinitSpe.addActionListener(e -> setMinSpe() );
		
		this.maxSpe = new JCustomButton(this.labels.get("Max").getLang(), Design.GREEN_COLOR);
		this.maxSpe.addActionListener(e -> setMaxSpe() );
		
		this.components.add(this.reinitSpe);
		this.components.add(this.maxSpe);
		
		createPanel();
		setEffects();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Speciality", new JLangLabel(Speciality.CLASS_NAME, Design.TITLE));
		
		this.labels.put("Remain", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Points restants : "); put(Language.EN, "Remaining points: "); }}, Design.SUBTITLE));
		this.labels.put("Type0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Maître"); put(Language.EN, "Master"); }}, Design.SUBTITLE));
		this.labels.put("Type1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Mythique"); put(Language.EN, "Mythical"); }}, Design.SUBTITLE));
		this.labels.put("Type2", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Légendaire"); put(Language.EN, "Legendary"); }}, Design.SUBTITLE));
		this.labels.put("Type3", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Ultime"); put(Language.EN, "Ultimate"); }}, Design.SUBTITLE));
		this.labels.put("Type4", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Infini"); put(Language.EN, "Infinity"); }}, Design.SUBTITLE));
		this.labels.put("Min", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Tout mettre à 0"); put(Language.EN, "Set all to 0"); }}, Design.TEXT));
		this.labels.put("Max", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Tout mettre à 10"); put(Language.EN, "Set all to 10"); }}, Design.TEXT));
	}
	
	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		
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
		remain.addAll(this.labels.get("Remain"), this.nbSpePoint);
		this.nbSpePoint.setFont(new Font("Open Sans", Font.BOLD, 14));
		this.nbSpePoint.setForeground(Design.FontColor[0]);
		
		this.addAll(this.labels.get("Speciality"), Box.createVerticalStrut(10), remain, Box.createVerticalStrut(5));
		
		
		JCustomPanel catSpe = new JCustomPanel(new GridLayout(5, 1));
		JCustomPanel gridSpe = new JCustomPanel(new GridLayout(5, 6, 5, 5));
		
		int numSpe = 0;
		
		for(int i = 0; i < 5; i++) {
			catSpe.add(this.labels.get("Type" + i));
			this.labels.get("Type" + i).setPreferredSize(new Dimension(76, 70));
			
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
			this.iconSpe.get(i).setToolTipText(this.tabSpeciality[i].getFullInfo(Language.FR));
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
		for(int i = 0; i < 26; i++) {
			if(this.spePoint.get(i).getItemCount()-1 != this.spePoint.get(i).getSelectedIndex()) {
				if(this.tabSpeciality[i].getLvl() == 45) {
					adjustSpeCombobox(i, remain, 2);
				} else if(this.tabSpeciality[i].getLvl() == 60) {
					adjustSpeCombobox(i, remain, 4);
				} else if(this.tabSpeciality[i].getLvl() == 75) {
					adjustSpeCombobox(i, remain, 6);
				} else if(this.tabSpeciality[i].getLvl() == 91) {
					adjustSpeCombobox(i, remain, 8);
				} else if(this.tabSpeciality[i].getLvl() == 100) {
					adjustSpeCombobox(i, remain, 10);
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
		for(int i = 0; i < 26; i++) {
			int itemCount = this.spePoint.get(i).getItemCount();
			if(itemCount < rescale) {
				while(itemCount != rescale) {
					this.spePoint.get(i).addItem(Integer.valueOf(itemCount));
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
		for(int i = 0; i < 26; i++) {
			int itemCount = this.spePoint.get(i).getItemCount();
			if(this.spePoint.get(i).getSelectedIndex() > 11) {
				while(itemCount != rescale) {
					this.spePoint.get(i).addItem(Integer.valueOf(itemCount));
					itemCount++;
				}
			} else {
				if(itemCount < 11) {
					while(itemCount != 11) {
						this.spePoint.get(i).addItem(Integer.valueOf(itemCount));
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
	
	public double getShieldBonus(TypeEffect type) {
		double result = 0;
		
		for(int i = 0; i < this.tabSpeciality.length; i++) {
			for(Calculable c : this.tabSpeciality[i].getEffects()) {
				if(c instanceof Effect e) {
					if(e.getType() == type) {
						result += e.getValue() * this.spePoint.get(i).getSelectedIndex();
					}
				}
			}
		}
		
		return result;
	}
	
	private void setMinSpe() {
		for(JCustomComboBox<Integer> speciality : this.spePoint.getList()) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(0);
			} else {
				break;
			}
		}
	}
	
	private void setMaxSpe() {
		setMinSpe();
		
		for(JCustomComboBox<Integer> speciality : this.spePoint.getList()) {
			if(speciality.isVisible()) {
				speciality.setSelectedIndex(10);
			} else {
				break;
			}
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			config.put("LvlSpeciality" + i, "" + this.spePoint.get(i).getSelectedIndex());
		}
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		setMinSpe();
		
		for(int i = 0; i < this.spePoint.size(); i++) {
			this.spePoint.get(i).setSelectedIndex(Integer.valueOf(config.get("LvlSpeciality" + i)));
		}
		
		allowSetEffect(true);
	}
}
