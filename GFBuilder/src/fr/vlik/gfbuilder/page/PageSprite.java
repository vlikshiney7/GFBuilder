package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Blason;
import fr.vlik.grandfantasia.charac.Blason.BlasonType;
import fr.vlik.grandfantasia.charac.SpriteCost;
import fr.vlik.grandfantasia.charac.SpriteCost.SpriteCostType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.gameBuff.IslandBuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageSprite extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "SPRITE";
	private static PageSprite INSTANCE = new PageSprite();
	
	private ArrayList<JCustomComboBox<Blason>> blason = new ArrayList<JCustomComboBox<Blason>>(2);
	private ArrayList<JCustomComboBox<SpriteCost>> spriteCost = new ArrayList<JCustomComboBox<SpriteCost>>(2);
	private JCustomComboBox<IslandBuff> islandBuff;
	
	public static PageSprite getInstance() {
		return INSTANCE;
	}

	private PageSprite() {
		super(BoxLayout.Y_AXIS, NUM_PAGE);
		setLabelAPI();
		
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			this.blason.add(new JCustomComboBox<Blason>(tabBlason));
			this.blason.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		for(int i = 0; i < 2; i++) {
			SpriteCost[] tabCost = SpriteCost.getPossibleSpriteCost(PageGeneral.getInstance().getLvl(), SpriteCostType.values()[i]);
			this.spriteCost.add(new JCustomComboBox<SpriteCost>(tabCost));
			this.spriteCost.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.islandBuff = new JCustomComboBox<IslandBuff>(IslandBuff.getData());
		this.islandBuff.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Blason getBlason(int id) {
		return this.blason.get(id).getSelectedItem();
	}
	
	public SpriteCost getSpriteCost(int id) {
		return this.spriteCost.get(id).getSelectedItem();
	}
	
	public IslandBuff getIsleBuff() {
		return this.islandBuff.getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		for(int i = 0; i < this.blason.size(); i++) {
			list.addAll(this.getBlason(i).getEffects());
		}
		
		for(int i = 0; i < this.spriteCost.size(); i++) {
			list.addAll(this.getSpriteCost(i).getEffects());
		}
		
		list.addAll(this.getIsleBuff());
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.add(this.labelGFB[0], Box.createVerticalStrut(10));
		this.labelGFB[0].setFont(Design.TITLE);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel panelBlason = new JCustomPanel(BoxLayout.Y_AXIS);
			panelBlason.addAll(this.labelGFB[i+1], Box.createVerticalStrut(3), this.blason.get(i), Box.createVerticalStrut(5));
			this.labelGFB[i+1].setFont(Design.SUBTITLE);
			
			elem1.add(panelBlason);
		}
		
		JCustomPanel elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem2.add(this.labelGFB[4], Box.createVerticalStrut(10));
		this.labelGFB[4].setFont(Design.TITLE);
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel panelCost = new JCustomPanel(BoxLayout.Y_AXIS);
			panelCost.addAll(this.labelGFB[i+5], Box.createVerticalStrut(3), this.spriteCost.get(i), Box.createVerticalStrut(5));
			this.labelGFB[i+5].setFont(Design.SUBTITLE);
			
			elem2.add(panelCost);
		}
		
		JCustomPanel elem3 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem3.addAll(this.labelGFB[3], Box.createVerticalStrut(10), this.islandBuff);
		this.labelGFB[3].setFont(Design.TITLE);
		
		this.addAll(elem1, Box.createVerticalStrut(10), elem2, Box.createVerticalStrut(10), elem3);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(Entry<String, JLangLabel> entry : this.labelAPI.entrySet()) {
			entry.getValue().updateText(lang);
		}
	}
	
	public void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			
			if(!this.blason.get(i).setItems(tabBlason)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
	}
	
	public void updateSpriteCost() {
		SpriteCost[] tabCost = SpriteCost.getPossibleSpriteCost(PageGeneral.getInstance().getLvl(), SpriteCostType.values()[1]);
		
		if(!this.spriteCost.get(1).setItems(tabCost)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.blason.size(); i++) {
			config.put("Blason" + i, this.getBlason(i).getName(Language.FR));
		}
		
		for(int i = 0; i < this.spriteCost.size(); i++) {
			config.put("SpriteCost" + i, this.getSpriteCost(i).getName(Language.FR));
		}
		
		config.put("Isle", this.getIsleBuff().getName(Language.FR));
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.blason.size(); i++) {
			this.blason.get(i).setSelectedItem(Blason.get(config.get("Blason" + i)));
		}
		
		for(int i = 0; i < this.spriteCost.size(); i++) {
			this.spriteCost.get(i).setSelectedItem(SpriteCost.get(config.get("SpriteCost" + i)));
		}
		
		this.islandBuff.setSelectedItem(IslandBuff.get(config.get("Isle")));
	}
}
