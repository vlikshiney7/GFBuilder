package fr.vlik.gfbuilder.page;

import java.awt.Font;
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

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Mount;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Genki;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JStarCheckBox;

public class PageMount extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "MOUNT";
	private static PageMount INSTANCE = new PageMount();
	
	private JCustomComboBox<Mount> mount;
	private ArrayList<ArrayList<JCustomRadioButton>> qualityGenki = new ArrayList<ArrayList<JCustomRadioButton>>(2);
	private ArrayList<ArrayList<JStarCheckBox>> starGenki = new ArrayList<ArrayList<JStarCheckBox>>(2);
	private ArrayList<JCustomComboBox<Genki>> genki = new ArrayList<JCustomComboBox<Genki>>(2);
	
	private ArrayList<JCustomComboBox<TypeEffect>> effectXpStuff = new ArrayList<JCustomComboBox<TypeEffect>>(2);
	private ArrayList<JCustomComboBox<Integer>> lvlXpStuff = new ArrayList<JCustomComboBox<Integer>>(2);

	private JPanel showAndHideXpStuff;
	private JPanel showAndHide;
	
	public static PageMount getInstance() {
		return INSTANCE;
	}
	
	private PageMount() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel(Language.FR);
		
		Mount[] tabMount = Mount.getPossibleMount(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.mount = new JCustomComboBox<Mount>(tabMount);
		this.mount.addActionListener(e -> {
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
			
			this.qualityGenki.add(new ArrayList<JCustomRadioButton>(6));
			
			for(int j = 0; j < 6; j++) {
				//this.label[i*7+j+3].setFont(new Font("Open Sans", Font.PLAIN, 12));
				JCustomLabel quality = new JCustomLabel(Quality.values()[j], Language.FR);
				quality.setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.qualityGenki.get(i).add(new JCustomRadioButton(quality, "radio0" + j, "radioOff"));
				this.qualityGenki.get(i).get(j).setBackground(Design.UIColor[1]);
				//this.qualityGenki.get(i).get(j).setForeground(Tools.itemColor[j]);
				this.qualityGenki.get(i).get(j).addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
			}
			
			this.starGenki.add(new ArrayList<JStarCheckBox>(5));
			
			for(int j = 0; j < 5; j++) {
				int idCheck = j;
				
				this.starGenki.get(i).add(new JStarCheckBox());
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
	
	public Mount getMount() {
		return this.mount.getSelectedItem();
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
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		Mount mount = this.getMount();
		list.add(mount.getDepla());
		
		if(this.getEffectXpStuff(0) != TypeEffect.NONE && this.getEffectXpStuff(1) != TypeEffect.NONE
				&& this.getEffectXpStuff(0) != this.getEffectXpStuff(1)) {
			for(int i = 0; i < 2; i++) {
				TypeEffect type = this.getEffectXpStuff(i);
				double valueXpStuff = XpStuff.getDataMount()[this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
				
				if(mount.getName().equals("Loup Spectral de Combat")) {
					list.add(new Effect(type, false, valueXpStuff/2, true, WeaponType.NONE, null));
				} else {
					list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
				}
			}
		}
		
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			if(!this.qualityGenki.get(i).get(0).isSelected()) {
				Genki genki = new Genki(this.getGenki(i));
				
				int nbStar = 0;
				
				for(JStarCheckBox star : this.starGenki.get(i)) {
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
		this.label[1].setFont(new Font("Open Sans", Font.PLAIN, 14));
		xpRide.add(this.label[1]);
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
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(this.mount);
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
			elemI.add(this.label[i*7+2]);
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
		
		for(ArrayList<JCustomRadioButton> quality : this.qualityGenki) {
			quality.get(0).setSelected(true);
		}
		for(ArrayList<JStarCheckBox> star : this.starGenki) {
			star.get(0).setSelected(true);
		}
		
	}

	@Override
	protected void setLabel(Language lang) {
		this.label = Lang.getDataLabel(NUM_PAGE);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			for(JCustomRadioButton button : this.qualityGenki.get(i)) {
				button.updateText(lang);
			}
		}
	}
	
	public void updateMount() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		Mount tabMount[] = Mount.getPossibleMount(lvl, reinca);
		Mount memory = this.getMount();
		
		this.mount.setModel(new DefaultComboBoxModel<Mount>(tabMount));
		this.mount.setSelectedItem(memory);
		
		if(this.mount.getSelectedIndex() == 0) {
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
		if(this.mount.getSelectedIndex() != 0) {
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
		for(JStarCheckBox star : this.starGenki.get(id)) {
			if(!star.isSelected()) {
				break;
			}
			
			nbStar++;
		}
		
		int quality = 0;
		for(JCustomRadioButton radio : this.qualityGenki.get(id)) {
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
		for(JCustomRadioButton radio : this.qualityGenki.get(id)) {
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
			ArrayList<JCustomRadioButton> buttons = this.qualityGenki.get(i);
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
			ArrayList<JStarCheckBox> buttons = this.starGenki.get(i);
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
		Mount mount = Mount.get(config.get("Mount"));
		if(mount == null) {
			this.mount.setSelectedIndex(0);
		} else {
			this.mount.setSelectedItem(mount);
		}
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			ArrayList<JCustomRadioButton> buttons = this.qualityGenki.get(i);
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
			ArrayList<JStarCheckBox> buttons = this.starGenki.get(i);
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
