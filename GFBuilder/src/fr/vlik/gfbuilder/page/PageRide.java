package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

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
import fr.vlik.grandfantasia.equipupgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.subequip.Synthesis;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageRide extends PartialXpStuff {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "RIDE";
	private static final PageRide INSTANCE = new PageRide();
	
	private JCustomComboBox<Ride> ride;
	private ArrayList<JCustomButtonGroup<TypeSynthesis>> groupSynthesis = new ArrayList<>(2);
	private ArrayList<JCustomButtonGroup<Quality>> groupQuality = new ArrayList<>(2);
	private ArrayList<ArrayList<JIconCheckBox>> starSynthesis = new ArrayList<>(2);
	private transient JCustomComboBoxList<Synthesis> synthesis;
	
	private ArrayList<JPanel> showAndHide = new ArrayList<>(2);
	
	public static PageRide getInstance() {
		return INSTANCE;
	}
	
	private PageRide() {
		super(BoxLayout.Y_AXIS, 1);
		
		Ride[] tabRide = Ride.getPossibleRide(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.ride = new JCustomComboBox<>(tabRide);
		this.ride.addActionListener(e -> {
			updateXpStuff();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < 2; i++) {
			int id = i;
			
			this.groupQuality.add(new JCustomButtonGroup<>());
			
			for(int j = 0; j < 6; j++) {
				JCustomRadioButton<Quality> radio = new JCustomRadioButton<>(Quality.values()[j]);
				radio.addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupQuality.get(i).add(radio);
			}
			
			this.groupSynthesis.add(new JCustomButtonGroup<>());
			for(int j = 0; j < 2; j++) {
				JCustomRadioButton<TypeSynthesis> typeSynthesis = new JCustomRadioButton<>(TypeSynthesis.values()[j]);
				typeSynthesis.addActionListener(e -> {
					updateQualityGenki(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.groupSynthesis.get(i).add(typeSynthesis);
				this.groupSynthesis.get(i).setVisible(false);
			}
			
			this.starSynthesis.add(new ArrayList<>(5));
			
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
		}
		
		this.synthesis = new JCustomComboBoxList<>(2);
		this.synthesis.setVisible(false);
		this.synthesis.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
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
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Ride", new JLangLabel(Ride.CLASS_NAME, Design.TITLE));
		this.labels.put("Enchant0", new JLangLabel(Synthesis.CLASS_NAME_RIDE, Design.TITLE));
		this.labels.put("Enchant1", new JLangLabel(Synthesis.CLASS_NAME_THRONE, Design.TITLE));		
		this.labels.put("Synthesis0", new JLangLabel(TypeSynthesis.CLASS_NAME, Design.SUBTITLE));
		this.labels.put("Synthesis1", new JLangLabel(TypeSynthesis.CLASS_NAME, Design.SUBTITLE));
		
		this.labels.put("RideXP", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "XP Monture"); put(Language.EN, "Ride Exp"); }}, Design.SUBTITLE));
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<>();
		
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
		JCustomPanel xpRide = new JCustomPanel(new GridLayout(1, 3, 10, 3));
		xpRide.add(this.labels.get("RideXP"));
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
			xp.addAll(this.xpStuff.get(i), this.lvlXpStuff.get(i));
			xpRide.add(xp);
		}
		
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Ride"), Box.createVerticalStrut(10), this.ride, Box.createVerticalStrut(5), xpRide);
		
		this.showAndHideXpStuff.add(xpRide);
		this.showAndHide.add(elem1);
		
		this.add(elem1);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel qualityPanel = new JCustomPanel();
			qualityPanel.addAll(this.groupQuality.get(i));
			
			JCustomPanel synthesisPanel = new JCustomPanel(this.labels.get("Synthesis" + i));
			synthesisPanel.addAll(this.groupSynthesis.get(i));
			
			
			JCustomPanel starPanel = new JCustomPanel();
			starPanel.addAll(this.starSynthesis.get(i));
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labels.get("Enchant" + i), Box.createVerticalStrut(10),
					qualityPanel, Box.createVerticalStrut(3), synthesisPanel, Box.createVerticalStrut(3),
					starPanel, Box.createVerticalStrut(3), this.synthesis.get(i));
			
			this.addAll(Box.createVerticalStrut(10), elemI);
			
			if(i == 1) {
				this.showAndHide.add(elemI);
			}
		}
		
		initPanel();
		
		for(JPanel panel : this.showAndHide) {
			panel.setVisible(false);
		}
		
		for(int i = 0; i < 2; i++) {
			this.labels.get("Synthesis" + i).setVisible(false);
		}
		
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
		for(Entry<String, JLangLabel> entry : this.labels.entrySet()) {
			entry.getValue().updateText(lang);
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
		
		Ride[] tabRide = Ride.getPossibleRide(lvl, reinca);
		
		if(!this.ride.setItems(tabRide)) {
			this.showAndHideXpStuff.get(0).setVisible(false);
			this.xpStuff.get(0).setVisible(false);
			this.xpStuff.get(1).setVisible(false);
			
			if(this.getXpStuff(0) != null && this.getXpStuff(1) != null) {
				this.xpStuff.get(0).setSelectedIndex(0);
				this.xpStuff.get(1).setSelectedIndex(0);
			}
			
			MainFrame.getInstance().setRedPane(4);
		} else {
			this.xpStuff.get(0).setVisible(true);
			this.xpStuff.get(1).setVisible(true);
			this.showAndHideXpStuff.get(0).setVisible(true);
		}
		
		this.showAndHide.get(0).setVisible(tabRide.length > 1);
	}
	
	private void updateXpStuff() {
		if(this.ride.getSelectedIndex() != 0) {
			XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getRide());
			
			this.xpStuff.get(0).setItems(xpStuff);
			this.xpStuff.get(1).setItems(xpStuff);
			
			this.showAndHideXpStuff.get(0).setVisible(true);	
			this.xpStuff.get(0).setVisible(true);
			this.xpStuff.get(1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(0).setVisible(false);
			this.xpStuff.get(0).setVisible(false);
			this.xpStuff.get(1).setVisible(false);
			
			if(this.getXpStuff(0) != null && this.getXpStuff(1) != null) {
				this.xpStuff.get(0).setSelectedIndex(0);
				this.xpStuff.get(1).setSelectedIndex(0);
			}
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
		
		if(nbStar < 1) {
			updateStarGenki(id, nbStar);
			nbStar = 1;
		}
		
		Synthesis[] tabSynthesis = (id == 0 ? Synthesis.getPossibleRide(this.getGroupSynthesis(id), this.getGroupQuality(id), nbStar) : Synthesis.getPossibleThrone(this.getGroupSynthesis(id), this.getGroupQuality(id), nbStar));
		
		if(tabSynthesis.length == 0) {
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				this.starSynthesis.get(id).get(i).setVisible(false);
			}
			
			this.labels.get("Synthesis" + id).setVisible(false);
			this.groupSynthesis.get(id).setVisible(false);
			this.synthesis.get(id).setVisible(false);
		} else {
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				this.starSynthesis.get(id).get(i).setVisible(true);
			}
			
			this.labels.get("Synthesis" + id).setVisible(true);
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
		
		if(tabSynthesis.length != 0) {
			
			for(int i = 0; i < this.starSynthesis.get(id).size(); i++) {
				this.starSynthesis.get(id).get(i).setSelected(i <= idCheck);
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
		Map<String, String> config = new LinkedHashMap<>();
		
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
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getSelectorInfo(lang) : "";
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
			int select = Integer.parseInt(config.get("StarSynthesis" + i));
			
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
