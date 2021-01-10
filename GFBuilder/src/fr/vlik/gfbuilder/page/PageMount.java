package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Ride;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Genki;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JIconCheckBox;

public class PageMount extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "MOUNT";
	private static PageMount INSTANCE = new PageMount();
	
	private JCustomComboBox<Ride> ride;
	private ArrayList<ArrayList<JCustomRadioButton<Quality>>> qualityGenki = new ArrayList<ArrayList<JCustomRadioButton<Quality>>>(2);
	private ArrayList<ArrayList<JIconCheckBox>> starGenki = new ArrayList<ArrayList<JIconCheckBox>>(2);
	private ArrayList<JCustomComboBox<Genki>> genki = new ArrayList<JCustomComboBox<Genki>>(2);
	
	private ArrayList<JCustomComboBox<TypeEffect>> effectXpStuff = new ArrayList<JCustomComboBox<TypeEffect>>(2);
	private ArrayList<JCustomComboBox<Integer>> lvlXpStuff = new ArrayList<JCustomComboBox<Integer>>(2);

	private JPanel showAndHideXpStuff;
	private JPanel showAndHide;
	
	public static PageMount getInstance() {
		return INSTANCE;
	}
	
	private PageMount() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
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
			
			this.qualityGenki.add(new ArrayList<JCustomRadioButton<Quality>>(6));
			
			for(int j = 0; j < 6; j++) {
				this.qualityGenki.get(i).add(new JCustomRadioButton<Quality>(Quality.values()[j]));
				this.qualityGenki.get(i).get(j).setBackground(Design.UIColor[1]);
				this.qualityGenki.get(i).get(j).addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			this.starGenki.add(new ArrayList<JIconCheckBox>(5));
			
			for(int j = 0; j < 5; j++) {
				int idCheck = j;
				
				this.starGenki.get(i).add(new JIconCheckBox("starOn", "starOff"));
				this.starGenki.get(i).get(j).addActionListener(e -> {
					updateStarGenki(id, idCheck);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.starGenki.get(i).get(j).setVisible(false);
			}
			
			this.genki.add(new JCustomComboBox<Genki>());
			this.genki.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.genki.get(i).setVisible(false);
		}
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Ride getMount() {
		return this.ride.getSelectedItem();
	}
	
	public Genki getGenki(int id) {
		return this.genki.get(id).getSelectedItem();
	}
	
	public TypeEffect getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public Integer getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		Ride ride = this.getMount();
		list.add(ride.getEffect());
		
		if(this.getEffectXpStuff(0) != TypeEffect.NONE && this.getEffectXpStuff(1) != TypeEffect.NONE
				&& this.getEffectXpStuff(0) != this.getEffectXpStuff(1)) {
			for(int i = 0; i < 2; i++) {
				TypeEffect type = this.getEffectXpStuff(i);
				double valueXpStuff = XpStuff.getDataMount()[this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
				
				if(ride.getName().equals("Loup Spectral de Combat")) {
					list.add(new Effect(type, false, valueXpStuff/2, true));
				} else {
					list.add(new Effect(type, false, valueXpStuff, true));
				}
			}
		}
		
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			if(!this.qualityGenki.get(i).get(0).isSelected()) {
				Genki genki = new Genki(this.getGenki(i));
				
				int nbStar = 0;
				
				for(JIconCheckBox star : this.starGenki.get(i)) {
					if(!star.isSelected()) {
						break;
					}
					
					nbStar++;
				}
				
				genki.addStarBonus(nbStar, i);
				list.addAll(genki.getEffects());
			}
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel xpRide = new JPanel(new GridLayout(1, 3, 10, 3));
		xpRide.setBackground(Design.UIColor[1]);
		xpRide.add(this.labelGFB[1]);
		this.labelGFB[1].setFont(Design.SUBTITLE);
		
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
		elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(this.ride);
		elem1.add(Box.createVerticalStrut(5));
		elem1.add(xpRide);
		
		this.showAndHideXpStuff = xpRide;
		this.showAndHide = elem1;
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JPanel qualityPanel = new JPanel();
			JPanel starPanel = new JPanel();
			ButtonGroup quality = new ButtonGroup();
			
			qualityPanel.setBackground(Design.UIColor[1]);
			qualityPanel.setForeground(Design.FontColor[0]);
			qualityPanel.setBorder(null);
			
			starPanel.setBackground(Design.UIColor[1]);
			starPanel.setForeground(Design.FontColor[0]);
			starPanel.setBorder(null);
			
			for(int j = 0; j < 6; j++) {
				quality.add(this.qualityGenki.get(i).get(j));
				qualityPanel.add(this.qualityGenki.get(i).get(j));
			}
			
			for(int j = 0; j < 5; j++) {
				starPanel.add(this.starGenki.get(i).get(j));
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.labelGFB[i+2]);
			this.labelGFB[i+2].setFont(Design.TITLE);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(qualityPanel);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(starPanel);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(this.genki.get(i));
			
			this.add(Box.createVerticalStrut(10));
			this.add(elemI);
		}
		
		this.showAndHideXpStuff.setVisible(false);
		
		for(ArrayList<JCustomRadioButton<Quality>> quality : this.qualityGenki) {
			quality.get(0).setSelected(true);
		}
		for(ArrayList<JIconCheckBox> star : this.starGenki) {
			star.get(0).setSelected(true);
		}
		
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			for(JCustomRadioButton<Quality> button : this.qualityGenki.get(i)) {
				button.updateText(lang);
			}
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
			this.showAndHide.setVisible(true);
		} else {
			this.showAndHide.setVisible(false);
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
	
	private void updateQualityGenki(int id) {
		int nbStar = 0;
		for(JIconCheckBox star : this.starGenki.get(id)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		int quality = 0;
		for(JCustomRadioButton<Quality> radio : this.qualityGenki.get(id)) {
			if(radio.isSelected()) {
				break;
			}
			
			quality++;
		}
		
		
		Genki[] tabGenki = Genki.getPossibleGenki(quality, nbStar);
		
		if(tabGenki == null) {
			for(int i = 0; i < this.starGenki.get(id).size(); i++) {
				this.starGenki.get(id).get(i).setVisible(false);
			}
			this.genki.get(id).setVisible(false);
		} else {
			for(int i = 0; i < this.starGenki.get(id).size(); i++) {
				this.starGenki.get(id).get(i).setVisible(true);
			}
			this.genki.get(id).setVisible(true);
			
			Genki memory = this.getGenki(id) != null ? this.getGenki(id) : tabGenki[0];
			
			this.genki.get(id).setModel(new DefaultComboBoxModel<Genki>(tabGenki));
			this.genki.get(id).setSelectedItem(memory);
		}
	}
	
	private void updateStarGenki(int id, int idCheck) {
		int quality = 0;
		for(JCustomRadioButton<Quality> radio : this.qualityGenki.get(id)) {
			if(radio.isSelected()) {
				break;
			}
			
			quality++;
		}
		
		Genki[] tabGenki = Genki.getPossibleGenki(quality, idCheck+1);
		
		if(tabGenki != null) {
			
			for(int i = 0; i < this.starGenki.get(id).size(); i++) {
				if(i <= idCheck) {
					this.starGenki.get(id).get(i).setSelected(true);
				} else {
					this.starGenki.get(id).get(i).setSelected(false);
				}
			}
			
			int memory = this.genki.get(id).getSelectedIndex();
			
			this.genki.get(id).setModel(new DefaultComboBoxModel<Genki>(tabGenki));
			this.genki.get(id).setSelectedIndex(memory);
		} else {
			this.genki.get(id).setModel(new DefaultComboBoxModel<Genki>());
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		config.put("Mount", this.getMount().getName());
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			ArrayList<JCustomRadioButton<Quality>> buttons = this.qualityGenki.get(i);
			int select = 5;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("QualityGenki" + i, "" + select);
		}
		
		
		for(int i = 0; i < this.starGenki.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starGenki.get(i);
			int select = 4;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("StarGenki" + i, "" + select);
		}
		
		for(int i = 0; i < this.genki.size(); i++) {
			String value = this.getGenki(i) != null ? this.getGenki(i).getName() : "";
			config.put("Genki" + i, value);
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
		Ride ride = Ride.get(config.get("Mount"));
		if(ride == null) {
			this.ride.setSelectedIndex(0);
		} else {
			this.ride.setSelectedItem(ride);
		}
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			ArrayList<JCustomRadioButton<Quality>> buttons = this.qualityGenki.get(i);
			int select = Integer.valueOf(config.get("QualityGenki" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
					updateQualityGenki(i);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
		}
		
		for(int i = 0; i < this.starGenki.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starGenki.get(i);
			int select = Integer.valueOf(config.get("StarGenki" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
					updateStarGenki(i, j);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
		}
		
		for(int i = 0; i < this.genki.size(); i++) {
			this.genki.get(i).setSelectedItem(Genki.get(config.get("Genki" + i), Integer.valueOf(config.get("QualityGenki" + i))));
		}
		
		for(int i = 0; i < this.effectXpStuff.size(); i++) {
			this.effectXpStuff.get(i).setSelectedItem(TypeEffect.get(config.get("EffectXpStuff" + i), lang));
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			this.lvlXpStuff.get(i).setSelectedItem(Integer.valueOf(config.get("LvlXpStuff" + i)));
		}
	}
}
