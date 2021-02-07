package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.equip.Ride;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.subEquip.Synthesis;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageRide extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "RIDE";
	private static PageRide INSTANCE = new PageRide();
	
	private JCustomComboBox<Ride> ride;
	private ArrayList<JCustomButtonGroup<TypeSynthesis>> groupSynthesis = new ArrayList<JCustomButtonGroup<TypeSynthesis>>(2);
	private ArrayList<JCustomButtonGroup<Quality>> groupQuality = new ArrayList<JCustomButtonGroup<Quality>>(2);
	private ArrayList<ArrayList<JIconCheckBox>> starSynthesis = new ArrayList<ArrayList<JIconCheckBox>>(2);
	private ArrayList<JCustomComboBox<Synthesis>> synthesis = new ArrayList<JCustomComboBox<Synthesis>>(2);
	
	private ArrayList<JCustomComboBox<TypeEffect>> effectXpStuff = new ArrayList<JCustomComboBox<TypeEffect>>(2);
	private ArrayList<JCustomComboBox<Integer>> lvlXpStuff = new ArrayList<JCustomComboBox<Integer>>(2);

	private JPanel showAndHideXpStuff;
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>(2);
	
	public static PageRide getInstance() {
		return INSTANCE;
	}
	
	private PageRide() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabelAPI();
		
		Ride[] tabMount = Ride.getPossibleMount(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.ride = new JCustomComboBox<Ride>(tabMount);
		this.ride.addActionListener(e -> {
			updateXpStuff();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		TypeEffect[] tmp = new TypeEffect[XpStuff.getDataMount().length +1];
		tmp[0] = TypeEffect.NONE;
		for(int i = 0; i < tmp.length-1; i++) {
			tmp[i+1] = XpStuff.getDataMount()[i].getType();
		}
		for(int i = 0; i < 2; i++) {
			this.effectXpStuff.add(new JCustomComboBox<TypeEffect>(tmp));
			this.effectXpStuff.get(i).addActionListener(e -> {
				updateLvlXpStuff();

				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.effectXpStuff.get(i).setVisible(false);
			
			int duo = i;
			this.lvlXpStuff.add(new JCustomComboBox<Integer>());
			this.lvlXpStuff.get(i).addActionListener(e -> {
				updateMaxLvlValue(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.lvlXpStuff.get(i).setVisible(false);
		}
		
		for(int i = 0; i < 2; i++) {
			int id = i;
			
			this.groupQuality.add(new JCustomButtonGroup<Quality>());
			
			for(int j = 0; j < 6; j++) {
				JCustomRadioButton<Quality> radio = new JCustomRadioButton<Quality>(Quality.values()[j]);
				radio.addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupQuality.get(i).add(radio);
			}
			
			this.groupSynthesis.add(new JCustomButtonGroup<TypeSynthesis>());
			for(int j = 0; j < 2; j++) {
				JCustomRadioButton<TypeSynthesis> typeSynthesis = new JCustomRadioButton<TypeSynthesis>(TypeSynthesis.values()[j]);
				typeSynthesis.addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i).add(typeSynthesis);
				this.groupSynthesis.get(i).setVisible(false);
			}
			
			this.starSynthesis.add(new ArrayList<JIconCheckBox>(5));
			
			for(int j = 0; j < 5; j++) {
				int idCheck = j;
				
				this.starSynthesis.get(i).add(new JIconCheckBox("starOn", "starOff"));
				this.starSynthesis.get(i).get(j).addActionListener(e -> {
					updateStarGenki(id, idCheck);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.starSynthesis.get(i).get(j).setVisible(false);
			}
			
			this.synthesis.add(new JCustomComboBox<Synthesis>());
			this.synthesis.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.synthesis.get(i).setVisible(false);
		}
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Ride getMount() {
		return this.ride.getSelectedItem();
	}
	
	public Quality getGroupQuality(int i) {
		return this.groupQuality.get(i).getSelectedItem();
	}
	
	public TypeSynthesis getGroupSynthesis(int i) {
		return this.groupSynthesis.get(i).getSelectedItem();
	}
	
	public Synthesis getSynthesis(int id) {
		return this.synthesis.get(id).getSelectedItem();
	}
	
	public TypeEffect getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public Integer getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		this.labelAPI = new JLangLabel[5];
		this.labelAPI[0] = new JLangLabel(Ride.CLASS_NAME, Design.TITLE);
		this.labelAPI[1] = new JLangLabel(TypeSynthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[2] = new JLangLabel(Synthesis.CLASS_NAME_RIDE, Design.TITLE);
		this.labelAPI[3] = new JLangLabel(TypeSynthesis.CLASS_NAME, Design.SUBTITLE);
		this.labelAPI[4] = new JLangLabel(Synthesis.CLASS_NAME_THRONE, Design.TITLE);
		
		this.labelAPI[1].setVisible(false);
		this.labelAPI[3].setVisible(false);
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		Ride ride = this.getMount();
		
		if(ride.getEffects() != null) {
			for(Calculable c : ride.getEffects()) {
				list.add(c);
			}
		}
		
		if(this.getEffectXpStuff(0) != TypeEffect.NONE && this.getEffectXpStuff(1) != TypeEffect.NONE
				&& this.getEffectXpStuff(0) != this.getEffectXpStuff(1)) {
			for(int i = 0; i < 2; i++) {
				TypeEffect type = this.getEffectXpStuff(i);
				double valueXpStuff = XpStuff.getDataMount()[this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
				
				if(ride.isNerfXpStuff()) {
					list.add(new Effect(type, false, valueXpStuff/2, true));
				} else {
					list.add(new Effect(type, false, valueXpStuff, true));
				}
			}
		}
		
		for(int i = 0; i < this.synthesis.size(); i++) {
			if(this.getGroupQuality(i) != Quality.GREY) {
				if(this.getSynthesis(i) != null && this.getSynthesis(i).getEffects() != null) {
					for(int j = 0; j < this.getSynthesis(i).getEffects().length; j++) {
						list.add(this.getSynthesis(i).getEffects()[j]);
					}
				}
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		int iLabelAPI = 0;
		
		JPanel xpRide = new JPanel(new GridLayout(1, 3, 10, 3));
		xpRide.setBackground(Design.UIColor[1]);
		xpRide.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.SUBTITLE);
		
		for(int i = 0; i < 2; i++) {
			JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
			xp.setBackground(Design.UIColor[1]);
			xp.add(this.effectXpStuff.get(i));
			xp.add(this.lvlXpStuff.get(i));
			xpRide.add(xp);
		}
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelAPI[iLabelAPI++]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(this.ride);
		elem1.add(Box.createVerticalStrut(5));
		elem1.add(xpRide);
		
		this.showAndHideXpStuff = xpRide;
		this.showAndHide.add(elem1);
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JPanel currentQualityPanel = new JPanel();
			currentQualityPanel.setBackground(Design.UIColor[1]);
			
			Enumeration<AbstractButton> itQuality = this.groupQuality.get(i).getElements();
			do {
				currentQualityPanel.add(itQuality.nextElement());
			} while(itQuality.hasMoreElements());
			
			JPanel currentSynthesisPanel = new JPanel();
			currentSynthesisPanel.setBackground(Design.UIColor[1]);
			currentSynthesisPanel.add(this.labelAPI[iLabelAPI++]);
			
			Enumeration<AbstractButton> itSynthesis = this.groupSynthesis.get(i).getElements();
			do {
				currentSynthesisPanel.add(itSynthesis.nextElement());
			} while(itSynthesis.hasMoreElements());
			
			
			JPanel starPanel = new JPanel();
			starPanel.setBackground(Design.UIColor[1]);
			
			for(int j = 0; j < 5; j++) {
				starPanel.add(this.starSynthesis.get(i).get(j));
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.labelAPI[iLabelAPI++]);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(currentQualityPanel);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(currentSynthesisPanel);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(starPanel);
			elemI.add(Box.createVerticalStrut(3));
			elemI.add(this.synthesis.get(i));
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
			
			if(i == 1) {
				this.showAndHide.add(elemI);
			}
		}
		
		for(JPanel panel : this.showAndHide) {
			panel.setVisible(false);
		}
		this.showAndHideXpStuff.setVisible(false);
		
		for(JCustomButtonGroup<Quality> quality : this.groupQuality) {
			quality.setSelectedItem(Quality.GREY);
		}
		
		for(JCustomButtonGroup<TypeSynthesis> typeSynthesis : this.groupSynthesis) {
			typeSynthesis.setSelectedItem(TypeSynthesis.GENKI);
		}
		
		for(ArrayList<JIconCheckBox> star : this.starSynthesis) {
			star.get(0).setSelected(true);
		}
		
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(JLangLabel label : this.labelAPI) {
			label.updateText(lang);
		}
		
		for(int i = 0; i < this.groupQuality.size(); i++) {
			this.groupQuality.get(i).updateText(lang);
		}
		
		for(int i = 0; i < this.groupSynthesis.size(); i++) {
			this.groupSynthesis.get(i).updateText(lang);
		}
	}
	
	public void updateMount() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		Ride tabMount[] = Ride.getPossibleMount(lvl, reinca);
		Ride memory = this.getMount();
		
		this.ride.setModel(new DefaultComboBoxModel<Ride>(tabMount));
		this.ride.setSelectedItem(memory);
		
		if(this.ride.getSelectedIndex() == 0) {
			this.effectXpStuff.get(0).setVisible(false);
			this.effectXpStuff.get(1).setVisible(false);
			this.effectXpStuff.get(0).setSelectedIndex(0);
			this.effectXpStuff.get(1).setSelectedIndex(0);
			this.showAndHideXpStuff.setVisible(false);
		} else {
			this.effectXpStuff.get(0).setVisible(true);
			this.effectXpStuff.get(1).setVisible(true);
			this.showAndHideXpStuff.setVisible(true);
		}
		
		if(tabMount.length > 1) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
		}
		
		if(!this.getMount().equals(memory)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	private void updateXpStuff() {
		if(this.ride.getSelectedIndex() != 0) {
			this.showAndHideXpStuff.setVisible(true);	
			this.effectXpStuff.get(0).setVisible(true);
			this.effectXpStuff.get(1).setVisible(true);
		} else {
			this.showAndHideXpStuff.setVisible(false);
			this.effectXpStuff.get(0).setVisible(false);
			this.effectXpStuff.get(1).setVisible(false);
			this.effectXpStuff.get(0).setSelectedIndex(0);
			this.effectXpStuff.get(1).setSelectedIndex(0);
		}
	}
	
	private void updateLvlXpStuff() {
		if(this.getEffectXpStuff(0) == TypeEffect.NONE || this.getEffectXpStuff(1) == TypeEffect.NONE
				|| this.getEffectXpStuff(0) == this.getEffectXpStuff(1)) {
			
			this.lvlXpStuff.get(0).setVisible(false);
			this.lvlXpStuff.get(1).setVisible(false);
			
			this.lvlXpStuff.get(0).setModel(new DefaultComboBoxModel<Integer>());
			this.lvlXpStuff.get(1).setModel(new DefaultComboBoxModel<Integer>());
		} else {
			Integer[] tmp = new Integer[XpStuff.getDataMount()[this.effectXpStuff.get(0).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = i+1;
			}
			
			Integer memory = this.lvlXpStuff.get(0).getSelectedItem();
			this.lvlXpStuff.get(0).setModel(new DefaultComboBoxModel<Integer>(tmp));
			if(memory != null) {
				this.lvlXpStuff.get(0).setSelectedItem(memory);
			}
			
			tmp = new Integer[XpStuff.getDataMount()[this.effectXpStuff.get(1).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = i+1;
			}
			
			memory = this.lvlXpStuff.get(1).getSelectedItem();
			this.lvlXpStuff.get(1).setModel(new DefaultComboBoxModel<Integer>(tmp));
			if(memory != null) {
				this.lvlXpStuff.get(1).setSelectedItem(memory);
			}
			
			this.lvlXpStuff.get(0).setVisible(true);
			this.lvlXpStuff.get(1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.getEffectXpStuff(id) == TypeEffect.NONE || this.getEffectXpStuff(indexPair) == TypeEffect.NONE
				|| this.getEffectXpStuff(id) == this.getEffectXpStuff(indexPair)) {
			return;
		}
		
		int currentLvl = this.lvlXpStuff.get(id).getSelectedIndex()+1;
		int sizePair = XpStuff.getDataMount()[this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		
		Integer[] tmp = new Integer[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = i+1;
		}
		
		Integer memory = this.getLvlXpStuff(indexPair);
		this.lvlXpStuff.get(indexPair).setModel(new DefaultComboBoxModel<Integer>(tmp));
		this.lvlXpStuff.get(indexPair).setSelectedItem(memory);
	}
	
	public void updateQualityGenki(int id) {
		int nbStar = 0;
		for(JIconCheckBox star : this.starSynthesis.get(id)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		Synthesis[] tabSynthesis = (id == 0 ? Synthesis.getPossibleRide(this.getGroupSynthesis(id), this.getGroupQuality(id), nbStar) : Synthesis.getPossibleThrone(this.getGroupSynthesis(id), this.getGroupQuality(id), nbStar));
		
		if(tabSynthesis == null) {
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				this.starSynthesis.get(id).get(i).setVisible(false);
			}
			this.labelAPI[id*2+1].setVisible(false);
			this.groupSynthesis.get(id).setVisible(false);
			this.synthesis.get(id).setVisible(false);
		} else {
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				this.starSynthesis.get(id).get(i).setVisible(true);
			}
			this.labelAPI[id*2+1].setVisible(true);
			this.groupSynthesis.get(id).setVisible(true);
			this.synthesis.get(id).setVisible(true);
			
			Synthesis memory = this.getSynthesis(id);
			this.synthesis.get(id).setModel(new DefaultComboBoxModel<Synthesis>(tabSynthesis));
			
			if(memory != null) {
				Synthesis retrieve = Synthesis.getFromList(memory.getSerie(), tabSynthesis);
				this.synthesis.get(id).setSelectedItem(retrieve);
			} else {
				this.synthesis.get(id).setSelectedIndex(0);
			}
		}
		
		if(id == 1) {
			if(Synthesis.getAvailableThrone(PageGeneral.getInstance().getLvl(), this.getGroupSynthesis(id))) {
				this.showAndHide.get(1).setVisible(true);
			} else {
				if(Synthesis.getAvailableThrone(PageGeneral.getInstance().getLvl(), TypeSynthesis.CLASSIC)) {
					this.groupSynthesis.get(1).setSelectedItem(TypeSynthesis.CLASSIC);
					this.showAndHide.get(1).setVisible(true);
				} else {
					this.showAndHide.get(1).setVisible(false);
					this.groupQuality.get(1).setSelectedItem(Quality.GREY);
				}
			}
		}
	}
	
	private void updateStarGenki(int id, int idCheck) {
		Synthesis[] tabSynthesis = (id == 0 ? Synthesis.getPossibleRide(this.getGroupSynthesis(id), this.getGroupQuality(id), idCheck+1) : Synthesis.getPossibleThrone(this.getGroupSynthesis(id), this.getGroupQuality(id), idCheck+1));
		
		if(tabSynthesis != null) {
			
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				if(i <= idCheck) {
					this.starSynthesis.get(id).get(i).setSelected(true);
				} else {
					this.starSynthesis.get(id).get(i).setSelected(false);
				}
			}
			
			Synthesis memory = this.getSynthesis(id);
			this.synthesis.get(id).setModel(new DefaultComboBoxModel<Synthesis>(tabSynthesis));
			
			if(memory != null) {
				Synthesis retrieve = Synthesis.getFromList(memory.getSerie(), tabSynthesis);
				this.synthesis.get(id).setSelectedItem(retrieve);
			} else {
				this.synthesis.get(id).setSelectedIndex(0);
			}
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		config.put("Ride", this.getMount().getName(Language.FR));
		
		for(int i = 0; i < this.groupQuality.size(); i++) {
			Quality quality = this.groupQuality.get(i).getSelectedItem();
			config.put("Quality" + i, "" + quality);
		}
		
		for(int i = 0; i < this.groupSynthesis.size(); i++) {
			TypeSynthesis typeSynthesis = this.groupSynthesis.get(i).getSelectedItem();
			config.put("TypeSynthesis" + i, "" + typeSynthesis);
		}
		
		
		for(int i = 0; i < this.starSynthesis.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starSynthesis.get(i);
			int select = 4;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("StarSynthesis" + i, "" + select);
		}
		
		for(int i = 0; i < this.synthesis.size(); i++) {
			String value = this.getSynthesis(i) != null ? this.getSynthesis(i).getName() : "";
			config.put("Synthesis" + i, value);
		}
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			config.put("EffectXpStuff" + i, this.getEffectXpStuff(i).getInfo(lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			String value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).toString() : "0";
			config.put("LvlXpStuff" + i, value);
		}
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		Ride ride = Ride.get(config.get("Ride"));
		if(ride == null) {
			this.ride.setSelectedIndex(0);
		} else {
			this.ride.setSelectedItem(ride);
		}
		
		for(int i = 0; i < this.synthesis.size(); i++) {
			Quality quality = Quality.valueOf(config.get("Quality" + i) != null ? config.get("Quality" + i) : Quality.GREY.toString());
			this.groupQuality.get(i).setSelectedItem(quality);
			
			TypeSynthesis typeSynthesis = TypeSynthesis.valueOf(config.get("TypeSynthesis" + i) != null ? config.get("TypeSynthesis" + i) : TypeSynthesis.GENKI.toString());
			this.groupSynthesis.get(i).setSelectedItem(typeSynthesis);
			
			updateQualityGenki(i);
			
			ArrayList<JIconCheckBox> buttons = this.starSynthesis.get(i);
			int select = Integer.valueOf(config.get("StarSynthesis" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
					updateStarGenki(i, j);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
			
			Synthesis synthesis = Synthesis.getRide(config.get("Synthesis" + i), typeSynthesis, quality, select);
			
			if(synthesis != null) {
				this.synthesis.get(i).setSelectedItem(synthesis);
			}
		}
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			this.effectXpStuff.get(i).setSelectedItem(TypeEffect.get(config.get("EffectXpStuff" + i), lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			this.lvlXpStuff.get(i).setSelectedItem(1);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			this.lvlXpStuff.get(i).setSelectedItem(Integer.valueOf(config.get("LvlXpStuff" + i)));
		}
	}
}