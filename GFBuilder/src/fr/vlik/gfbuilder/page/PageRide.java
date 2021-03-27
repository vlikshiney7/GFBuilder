package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeSynthesis;
import fr.vlik.grandfantasia.equip.Ride;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.subEquip.Synthesis;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
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
	
	private ArrayList<JCustomComboBox<XpStuff>> xpStuff = new ArrayList<JCustomComboBox<XpStuff>>(2);
	private ArrayList<JCustomComboBox<InnerEffect>> lvlXpStuff = new ArrayList<JCustomComboBox<InnerEffect>>(2);

	private JPanel showAndHideXpStuff;
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>(2);
	
	public static PageRide getInstance() {
		return INSTANCE;
	}
	
	private PageRide() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabelAPI();
		
		Ride[] tabRide = Ride.getPossibleRide(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.ride = new JCustomComboBox<Ride>(tabRide);
		this.ride.addActionListener(e -> {
			updateXpStuff();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* XP STUFF */
		for(int i = 0; i < 2; i++) {
			int duo = i;
			
			this.xpStuff.add(new JCustomComboBox<XpStuff>());
			this.xpStuff.get(duo).addActionListener(e -> {
				updateLvlXpStuff();
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.xpStuff.get(duo).setVisible(false);
			
			this.lvlXpStuff.add(new JCustomComboBox<InnerEffect>());
			this.lvlXpStuff.get(duo).addActionListener(e -> {
				updateMaxLvlValue(duo);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.lvlXpStuff.get(duo).setVisible(false);
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
	
	public Ride getRide() {
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
	
	public XpStuff getXpStuff(int id) {
		return this.xpStuff.get(id).getSelectedItem();
	}

	public InnerEffect getLvlXpStuff(int id) {
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
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		list.addAll(this.getRide());
		
		if(XpStuff.availableEffects(this.getXpStuff(0), this.getXpStuff(1))) {
			for(int i = 0; i < 2; i++) {
				list.addAll(this.getLvlXpStuff(i));
			}
		}
		
		for(int i = 0; i < this.synthesis.size(); i++) {
			if(this.getGroupQuality(i) != Quality.GREY) {
				list.addAll(this.getSynthesis(i));
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
			xp.add(this.xpStuff.get(i));
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
	
	public void updateRide() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		Ride tabRide[] = Ride.getPossibleRide(lvl, reinca);
		Ride memory = this.getRide();
		
		this.ride.setItems(tabRide);
		
		if(!this.getRide().equals(memory)) {
			this.showAndHideXpStuff.setVisible(false);
			this.xpStuff.get(0).setVisible(false);
			this.xpStuff.get(1).setVisible(false);
			
			if(this.getXpStuff(0) != null && this.getXpStuff(1) != null) {
				this.xpStuff.get(0).setSelectedIndex(0);
				this.xpStuff.get(1).setSelectedIndex(0);
			}
		} else {
			this.xpStuff.get(0).setVisible(true);
			this.xpStuff.get(1).setVisible(true);
			this.showAndHideXpStuff.setVisible(true);
		}
		
		if(tabRide.length > 1) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
		}
		
		if(!this.getRide().equals(memory)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	private void updateXpStuff() {
		if(this.ride.getSelectedIndex() != 0) {
			XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getRide());
			
			this.xpStuff.get(0).setItems(xpStuff);
			this.xpStuff.get(1).setItems(xpStuff);
			
			this.showAndHideXpStuff.setVisible(true);	
			this.xpStuff.get(0).setVisible(true);
			this.xpStuff.get(1).setVisible(true);
		} else {
			this.showAndHideXpStuff.setVisible(false);
			this.xpStuff.get(0).setVisible(false);
			this.xpStuff.get(1).setVisible(false);
			
			if(this.getXpStuff(0) != null && this.getXpStuff(1) != null) {
				this.xpStuff.get(0).setSelectedIndex(0);
				this.xpStuff.get(1).setSelectedIndex(0);
			}
		}
	}
	
	private void updateLvlXpStuff() {
		if(!XpStuff.availableEffects(this.getXpStuff(0), this.getXpStuff(1))) {
			
			this.lvlXpStuff.get(0).setVisible(false);
			this.lvlXpStuff.get(1).setVisible(false);
		} else {
			XpStuff xpStuff = this.getXpStuff(0);
			XpStuff xpStuffDuo = this.getXpStuff(1);
			
			this.lvlXpStuff.get(0).setItems(xpStuff.getInnerEffect());
			this.lvlXpStuff.get(1).setItems(xpStuffDuo.getInnerEffect());
			
			this.lvlXpStuff.get(0).setVisible(true);
			this.lvlXpStuff.get(1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(XpStuff.availableEffects(this.getXpStuff(0), this.getXpStuff(1))) {
			InnerEffect[] inner = this.getXpStuff(indexPair).getPossibleLvl(this.getLvlXpStuff(id));
			this.lvlXpStuff.get(indexPair).setItems(inner);
		}
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
			this.synthesis.get(id).setItems(tabSynthesis);
			
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
			this.synthesis.get(id).setItems(tabSynthesis);
			
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
		
		config.put("Ride", this.getRide().getName(Language.FR));
		
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
			String value = this.getSynthesis(i) != null ? this.getSynthesis(i).getName(Language.FR) : "";
			config.put("Synthesis" + i, value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		this.ride.setSelectedItem(Ride.get(config.get("Ride")));
		
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
			
			Synthesis synthesis = (i == 0) ? Synthesis.getRide(config.get("Synthesis" + i), typeSynthesis, quality, select+1) : Synthesis.getThrone(config.get("Synthesis" + i), typeSynthesis, quality, select+1);
			
			this.synthesis.get(i).setSelectedItem(synthesis);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			if(this.lvlXpStuff.get(i).getItemCount() > 0) {
				this.lvlXpStuff.get(i).setSelectedIndex(0);
			}
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			if(this.getRide().getQuality() != Quality.GREY) {
				this.xpStuff.get(i).setSelectedItem(XpStuff.get(this.getRide(), config.get("EffectXpStuff" + i)));
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			XpStuff xpStuff = this.getXpStuff(i);
			if(xpStuff != null) {
				InnerEffect inner = xpStuff.getInnerEffect(Integer.valueOf(config.get("LvlXpStuff" + i)));
				this.lvlXpStuff.get(i).setSelectedItem(inner);
			}
		}
	}
}
