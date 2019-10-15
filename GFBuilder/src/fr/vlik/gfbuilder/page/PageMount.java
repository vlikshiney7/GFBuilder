package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Util;
import fr.vlik.grandfantasia.Consts;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Genki;
import fr.vlik.grandfantasia.Mount;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipment.Weapon.WeaponType;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JStarCheckBox;

public class PageMount extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageMount INSTANCE = new PageMount();
	
	private JCustomComboBox<Mount> mount;
	private ArrayList<ArrayList<JCustomRadioButton>> qualityGenki = new ArrayList<ArrayList<JCustomRadioButton>>(2);
	private ArrayList<ArrayList<JStarCheckBox>> starGenki = new ArrayList<ArrayList<JStarCheckBox>>(2);
	private ArrayList<JCustomComboBox<Genki>> genki = new ArrayList<JCustomComboBox<Genki>>(2);
	
	private ArrayList<JCustomComboBox<String>> effectXpStuff = new ArrayList<JCustomComboBox<String>>(2);
	private ArrayList<JCustomComboBox<String>> lvlXpStuff = new ArrayList<JCustomComboBox<String>>(2);

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
		
		String[] tmp = new String[XpStuff.getDataMount().length +1];
		tmp[0] = "Rien";
		for(int i = 0; i < tmp.length-1; i++) {
			tmp[i+1] = XpStuff.getDataMount()[i].getType().name();
		}
		for(int i = 0; i < 2; i++) {
			this.effectXpStuff.add(new JCustomComboBox<String>(tmp));
			this.effectXpStuff.get(i).addActionListener(e -> {
				updateLvlXpStuff();

				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.effectXpStuff.get(i).setVisible(false);
			
			int duo = i;
			this.lvlXpStuff.add(new JCustomComboBox<String>());
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
				this.label[i*7+j+3].setFont(new Font("Open Sans", Font.PLAIN, 12));
				this.qualityGenki.get(i).add(new JCustomRadioButton(this.label[i*7+j+3], "radio0" + j, "radioOff"));
				this.qualityGenki.get(i).get(j).setBackground(Design.UIColor[1]);
				this.qualityGenki.get(i).get(j).setForeground(Consts.itemColor[j]);
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
		
		createPanel();
		setEffects();
	}
	
	public Mount getMount() {
		return this.mount.getSelectedItem();
	}
	
	public Genki getGenki(int id) {
		return this.genki.get(id).getSelectedItem();
	}
	
	public String getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public String getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		Mount mount = this.getMount();
		list.add(mount.getDepla());
		
		for(int i = 0; i < 2; i++) {
			if(!this.lvlXpStuff.get(i).isVisible() || this.effectXpStuff.get(i).getSelectedIndex() == 0) {
				continue;
			}
			
			TypeEffect type = TypeEffect.valueOf(this.getEffectXpStuff(i).toString());
			double valueXpStuff = XpStuff.getDataMount()[this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
			
			if(mount.getName().equals("Loup Spectral de Combat")) {
				list.add(new Effect(type, false, valueXpStuff/2, true, WeaponType.NONE, null));
			} else {
				list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
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
		String[] getter = Lang.getDataLabel(lang, 4);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 4);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		for(int i = 0; i < this.qualityGenki.size(); i++) {
			for(JCustomRadioButton button : this.qualityGenki.get(i)) {
				button.updateText();
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
		if(this.getEffectXpStuff(0).toString().equals("Rien") || this.getEffectXpStuff(1).toString().equals("Rien")
				|| this.getEffectXpStuff(0).toString().equals(this.getEffectXpStuff(1).toString())) {
			this.lvlXpStuff.get(0).setVisible(false);
			this.lvlXpStuff.get(1).setVisible(false);
			Util.setMemoryInList(this.lvlXpStuff.get(0), null);
			Util.setMemoryInList(this.lvlXpStuff.get(1), null);
		} else {
			String[] tmp = new String[XpStuff.getDataMount()[this.effectXpStuff.get(0).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(0).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, 0, tmp);
			
			tmp = new String[XpStuff.getDataMount()[this.effectXpStuff.get(1).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(1).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, 1, tmp);
			
			this.lvlXpStuff.get(0).setVisible(true);
			this.lvlXpStuff.get(1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int index) {
		int indexPair = (index % 2 == 0) ? index + 1 : index -1;
		
		if(this.effectXpStuff.get(index).getSelectedIndex() == 0
				|| this.effectXpStuff.get(indexPair).getSelectedIndex() == 0
				|| this.effectXpStuff.get(index).getSelectedIndex() == this.effectXpStuff.get(indexPair).getSelectedIndex())
			return;
		
		int currentLvl = this.lvlXpStuff.get(index).getSelectedIndex()+1;
		int sizePair = XpStuff.getDataMount()[this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		
		String[] tmp = new String[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = "" + (i+1);
		}
		
		this.lvlXpStuff.get(indexPair).add(new JComboBox<String>(tmp));
		Util.setMemoryInList(this.lvlXpStuff, indexPair, tmp);
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
	public int[] getConfig() {
		int[] config = new int[11];
		
		int index = 0;
		
		config[index++] = this.mount.getSelectedIndex();
		
		for(ArrayList<JCustomRadioButton> buttons : this.qualityGenki) {
			int select = 5;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config[index++] = select;
		}
		
		for(ArrayList<JStarCheckBox> buttons : this.starGenki) {
			int select = 4;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config[index++] = select;
		}
		
		for(int i = 0; i < 2; i++) {
			config[index++] = this.genki.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 2; i++) {
			config[index++] = this.effectXpStuff.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 2; i++) {
			config[index++] = this.lvlXpStuff.get(i).getSelectedIndex();
		}
		
		return config;
	}

	@Override
	public void setConfig(int[] config) {
		int index = 0;
		
		this.mount.setSelectedIndex(config[index++]);
		
		for(int i = 0; i < 2; i++) {
			ArrayList<JCustomRadioButton> buttons = this.qualityGenki.get(i);
			for(int j = 0; j < buttons.size(); j++) {
				if(j == config[index]) {
					buttons.get(j).setSelected(true);
					updateQualityGenki(i);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
			
			index++;
		}
		
		for(int i = 0; i < 2; i++) {
			ArrayList<JStarCheckBox> buttons = this.starGenki.get(i);
			for(int j = 0; j < buttons.size(); j++) {
				if(j == config[index]) {
					buttons.get(j).setSelected(true);
					updateStarGenki(i, j);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
			
			index++;
		}
		
		for(int i = 0; i < 2; i++) {
			this.genki.get(i).setSelectedIndex(config[index++]);
		}
		
		for(int i = 0; i < 2; i++) {
			this.effectXpStuff.get(i).setSelectedIndex(config[index++]);
		}
		
		for(int i = 0; i < 2; i++) {
			this.lvlXpStuff.get(i).setSelectedIndex(config[index++]);
		}
	}
}
