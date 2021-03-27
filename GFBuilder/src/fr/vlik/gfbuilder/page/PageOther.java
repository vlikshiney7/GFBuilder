package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characUpgrade.LoveBuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.subEquip.Anima;
import fr.vlik.grandfantasia.subEquip.Bague;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;

public class PageOther extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "OTHER";
	private static PageOther INSTANCE = new PageOther();
	
	private JCustomComboBox<Bague> bague = new JCustomComboBox<Bague>();
	private JCustomComboBox<LoveBuff> loveCo = new JCustomComboBox<LoveBuff>();
	private JCustomComboBox<Anima> anima = new JCustomComboBox<Anima>();
	
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	public static PageOther getInstance() {
		return INSTANCE;
	}

	private PageOther() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.bague = new JCustomComboBox<Bague>(Bague.getData());
		this.bague.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.loveCo = new JCustomComboBox<LoveBuff>(LoveBuff.getData());
		this.loveCo.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Anima[] tabAnima = Anima.getData(PageGeneral.getInstance().getLvl());
		this.anima = new JCustomComboBox<Anima>(tabAnima);
		this.anima.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Bague getBague() {
		return this.bague.getSelectedItem();
	}
	
	public LoveBuff getLoveCo() {
		return this.loveCo.getSelectedItem();
	}
	
	public Anima getAnima() {
		return this.anima.getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}

	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		list.addAll(this.getBague());
		list.addAll(this.getLoveCo());
		list.addAll(this.getAnima());
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JPanel page12Elem1 = new JPanel();
		page12Elem1.setLayout(new BoxLayout(page12Elem1, BoxLayout.Y_AXIS));
		page12Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem1.setBackground(Design.UIColor[1]);
		page12Elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.bague);
		page12Elem1.add(Box.createVerticalStrut(15));
		page12Elem1.add(this.labelGFB[1]);
		this.labelGFB[1].setFont(Design.TITLE);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.loveCo);
		
		this.showAndHide.add(page12Elem1);
		
		
		JPanel page12Elem2 = new JPanel();
		page12Elem2.setLayout(new BoxLayout(page12Elem2, BoxLayout.Y_AXIS));
		page12Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem2.setBackground(Design.UIColor[1]);
		page12Elem2.add(this.labelGFB[2]);
		this.labelGFB[2].setFont(Design.TITLE);
		page12Elem2.add(Box.createVerticalStrut(10));
		page12Elem2.add(this.anima);
		
		this.showAndHide.add(page12Elem2);
		
		
		this.add(page12Elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(page12Elem2);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
	}
	
	public void updateMarried() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Bague memoryBague = this.getBague();
		LoveBuff memoryLoveCo = this.getLoveCo();
		
		if(reinca.getLvl() > 0 || lvl >= 20) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
			this.bague.setSelectedIndex(0);
			this.loveCo.setSelectedIndex(0);
		}
		
		if(!this.getBague().equals(memoryBague)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}

		if(!this.getLoveCo().equals(memoryLoveCo)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	public void updateAnima() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Anima[] tabAnima = Anima.getData(lvl);
		Anima memory = this.getAnima();
		
		this.anima.setItems(tabAnima);
		
		if(reinca.getLvl() > 0 && lvl >= 10) {
			this.showAndHide.get(1).setVisible(true);
		} else {
			this.showAndHide.get(1).setVisible(false);
			this.anima.setSelectedIndex(0);
		}
		
		if(!this.getAnima().equals(memory)) {
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
		
		config.put("Bague", this.getBague().getName(lang));
		config.put("LoveBuff", this.getLoveCo().getName(Language.FR));
		config.put("Anima", this.getAnima().getName(Language.FR));
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		this.bague.setSelectedItem(Bague.get(config.get("Bague"), lang));
		this.loveCo.setSelectedItem(LoveBuff.get(config.get("LoveBuff")));
		this.anima.setSelectedItem(Anima.get(config.get("Anima")));
	}
}
