package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Blason;
import fr.vlik.grandfantasia.Blason.BlasonType;
import fr.vlik.grandfantasia.Buff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;

public class PageSprite extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "SPRITE";
	private static PageSprite INSTANCE = new PageSprite();
	
	private ArrayList<JCustomComboBox<Blason>> blason = new ArrayList<JCustomComboBox<Blason>>(2);
	private JCustomComboBox<Buff> isleBuff;
	
	public static PageSprite getInstance() {
		return INSTANCE;
	}

	private PageSprite() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			this.blason.add(new JCustomComboBox<Blason>(tabBlason));
			this.blason.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.isleBuff = new JCustomComboBox<Buff>(Buff.getData());
		this.isleBuff.addActionListener(e -> {
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
	
	public Buff getIsleBuff() {
		return this.isleBuff.getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		for(int i = 0; i < this.blason.size(); i++) {
			list.addAll(this.getBlason(i).getEffects());
		}
		
		if(this.getIsleBuff().getEffects() != null) {
			for(Effect e : this.getIsleBuff().getEffects()) {
				list.add(e);
			}
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 2; i++) {
			JPanel panelBlason = new JPanel();
			panelBlason.setLayout(new BoxLayout(panelBlason, BoxLayout.Y_AXIS));
			panelBlason.setBackground(Design.UIColor[1]);
			panelBlason.add(this.label[i+1]);
			this.label[i+1].setFont(Design.SUBTITLE);
			panelBlason.add(Box.createVerticalStrut(3));
			panelBlason.add(this.blason.get(i));
			panelBlason.add(Box.createVerticalStrut(5));
			
			elem1.add(panelBlason);
		}
		
		JPanel elem2 = new JPanel();
		elem2.setLayout(new BoxLayout(elem2, BoxLayout.Y_AXIS));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Design.UIColor[1]);
		elem2.add(this.label[3]);
		this.label[3].setFont(Design.TITLE);
		elem2.add(Box.createVerticalStrut(10));
		elem2.add(this.isleBuff);
		
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(elem2);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
	}
	
	public void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			Blason memory = this.getBlason(i);
			
			this.blason.get(i).setModel(new DefaultComboBoxModel<Blason>(tabBlason));
			this.blason.get(i).setSelectedItem(memory);
			
			if(!this.getBlason(i).equals(memory)) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
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
		
		for(int i = 0; i < this.blason.size(); i++) {
			config.put("Blason" + i, this.getBlason(i).getName());
		}
		
		config.put("Isle", this.getIsleBuff().getName());
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.blason.size(); i++) {
			Blason blason = Blason.get(config.get("Blason" + i));
			if(blason == null) {
				this.blason.get(i).setSelectedIndex(0);
			} else {
				this.blason.get(i).setSelectedItem(Blason.get(config.get("Blason" + i)));
			}
		}
		
		Buff isle = Buff.get(config.get("Isle"));
		if(isle == null) {
			this.isleBuff.setSelectedIndex(0);
		} else {
			this.isleBuff.setSelectedItem(isle);
		}
	}
}
