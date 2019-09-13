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

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Util;
import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Genki;
import fr.vlik.grandfantasia.Mount;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.uidesign.CustomListCellRenderer;
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
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		Mount[] tabMount = Mount.getPossibleMount(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca() == 1);
		this.mount = new JCustomComboBox<Mount>(tabMount);
		this.mount.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.mount.setRenderer(new CustomListCellRenderer());
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
			this.effectXpStuff.get(i).setRenderer(new CustomListCellRenderer());
			this.effectXpStuff.get(i).addActionListener(e -> {
				updateLvlXpStuff();

				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.effectXpStuff.get(i).setVisible(false);
			
			int duo = i;
			this.lvlXpStuff.add(new JCustomComboBox<String>());
			this.lvlXpStuff.get(i).setRenderer(new CustomListCellRenderer());
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
				this.qualityGenki.get(i).add(new JCustomRadioButton(this.label[i*7+j+3].getText(), "radio0" + j, "radioOff"));
				this.qualityGenki.get(i).get(j).setBackground(Consts.UIColor[1]);
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
			
			this.genki.get(i).setRenderer(new CustomListCellRenderer());
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
				genki.addStarBonus(this.starGenki.get(i), i);
				list.addAll(genki.getEffects());
			}
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel xpRide = new JPanel(new GridLayout(1, 3, 10, 3));
		xpRide.setBackground(Consts.UIColor[1]);
		this.label[1].setFont(new Font("Open Sans", Font.PLAIN, 14));
		xpRide.add(this.label[1]);
		for(int i = 0; i < 2; i++) {
			JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
			xp.setBackground(Consts.UIColor[1]);
			xp.add(this.effectXpStuff.get(i));
			xp.add(this.lvlXpStuff.get(i));
			xpRide.add(xp);
		}
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Consts.UIColor[1]);
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
			
			qualityPanel.setBackground(Consts.UIColor[1]);
			qualityPanel.setForeground(Consts.FontColor[0]);
			qualityPanel.setBorder(null);
			
			starPanel.setBackground(Consts.UIColor[1]);
			starPanel.setForeground(Consts.FontColor[0]);
			starPanel.setBorder(null);
			
			for(int j = 0; j < 6; j++) {
				quality.add(this.qualityGenki.get(i).get(j));
				qualityPanel.add(this.qualityGenki.get(i).get(j));
			}
			
			for(int j = 0; j < 5; j++) {
				starPanel.add(this.starGenki.get(i).get(j));
			}
			
			JPanel page5ElemI = new JPanel();
			page5ElemI.setLayout(new BoxLayout(page5ElemI, BoxLayout.Y_AXIS));
			page5ElemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			page5ElemI.setBackground(Consts.UIColor[1]);
			page5ElemI.add(this.label[i*7+2]);
			page5ElemI.add(Box.createVerticalStrut(10));
			page5ElemI.add(qualityPanel);
			page5ElemI.add(Box.createVerticalStrut(5));
			page5ElemI.add(starPanel);
			page5ElemI.add(Box.createVerticalStrut(5));
			page5ElemI.add(this.genki.get(i));
			
			this.add(Box.createVerticalStrut(10));
			this.add(page5ElemI);
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
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 4);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateMount() {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
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
		int star = 0;
		while(star < 5) {
			if(!this.starGenki.get(id).get(star).isSelected()) break;
			star++;
		}
		
		Genki[] tabGenki = Genki.getPossibleGenki(this.qualityGenki.get(id), star);
		
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
		Genki[] tabGenki = Genki.getPossibleGenki(this.qualityGenki.get(id), idCheck+1);
		
		for(int i = 0; i < this.starGenki.get(id).size(); i++) {
			if(i <= idCheck) this.starGenki.get(id).get(i).setSelected(true);
			else this.starGenki.get(id).get(i).setSelected(false);
		}
		
		int memory = this.genki.get(id).getSelectedIndex();
		
		this.genki.get(id).setModel(new DefaultComboBoxModel<Genki>(tabGenki));
		this.genki.get(id).setSelectedIndex(memory);
	}
}