package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
import fr.vlik.grandfantasia.subEquip.Souvenir;
import fr.vlik.grandfantasia.subEquip.SouvenirEnchantment;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageOther extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "OTHER";
	private static PageOther INSTANCE = new PageOther();
	
	private JCustomComboBox<Bague> bague = new JCustomComboBox<Bague>();
	private JCustomComboBox<LoveBuff> loveCo = new JCustomComboBox<LoveBuff>();
	private JCustomComboBox<Anima> anima = new JCustomComboBox<Anima>();
	private JCustomComboBox<Souvenir> souvenir = new JCustomComboBox<Souvenir>();
	
	private ArrayList<JCustomComboBox<SouvenirEnchantment>> souvenirEnchant = new ArrayList<JCustomComboBox<SouvenirEnchantment>>(3);
	
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	public static PageOther getInstance() {
		return INSTANCE;
	}

	private PageOther() {
		super(BoxLayout.Y_AXIS, NUM_PAGE);
		setLabelAPI();
		
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
		
		
		this.souvenir = new JCustomComboBox<Souvenir>(Souvenir.getPossibleSouvenir(PageGeneral.getInstance().getLvl()));
		this.souvenir.addActionListener(e -> {
			updateEnchantSouvenir();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		/* ENCHANT SOUVENIR */
		for(int j = 0; j < 3; j++) {
			int idSouvenir = j;
			
			this.souvenirEnchant.add(new JCustomComboBox<SouvenirEnchantment>());
			this.souvenirEnchant.get(idSouvenir).addActionListener(e -> {
				updateSouvenirEnchant(idSouvenir);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.souvenirEnchant.get(idSouvenir).setVisible(false);
		}
		
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
	
	public Souvenir getSouvenir() {
		return this.souvenir.getSelectedItem();
	}
	
	public SouvenirEnchantment getSouvenirEnchantment(int id) {
		return this.souvenirEnchant.get(id).getSelectedItem();
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
		list.addAll(this.getSouvenir());
		
		for(int i = 0; i < 3; i++) {
			if(this.souvenirEnchant.get(i).isVisible()) {
				list.addAll(this.getSouvenirEnchantment(i));
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JCustomPanel page12Elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem1.addAll(this.labelGFB[0], Box.createVerticalStrut(10), this.bague, Box.createVerticalStrut(15), this.labelGFB[1], Box.createVerticalStrut(10), this.loveCo);
		this.labelGFB[0].setFont(Design.TITLE);
		this.labelGFB[1].setFont(Design.TITLE);
		
		this.showAndHide.add(page12Elem1);
		
		
		JCustomPanel page12Elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem2.addAll(this.labelGFB[2], Box.createVerticalStrut(10), this.anima);
		this.labelGFB[2].setFont(Design.TITLE);
		
		this.showAndHide.add(page12Elem2);
		
		
		JCustomPanel page12Elem3 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem3.addAll(this.labelGFB[3], Box.createVerticalStrut(10), this.souvenir, Box.createVerticalStrut(5), this.labelGFB[4]);
		this.labelGFB[3].setFont(Design.TITLE);
		this.labelGFB[4].setFont(Design.SUBTITLE);
		
		JCustomPanel enchant = new JCustomPanel(BoxLayout.X_AXIS);
		for(int i = 0; i < 3; i++) {
			enchant.addAll(Box.createHorizontalStrut(10), this.souvenirEnchant.get(i));
		}
		
		page12Elem3.add(enchant);
		
		this.addAll(page12Elem1, Box.createVerticalStrut(10), page12Elem2, Box.createVerticalStrut(10), page12Elem3);
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
		
		Anima memory = this.getAnima();
		this.anima.setItems(Anima.getData(lvl));
		
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
	
	public void updateSouvenir() {
		int lvl = PageGeneral.getInstance().getLvl();
		
		Souvenir[] tabSouvenir = Souvenir.getPossibleSouvenir(lvl);
		
		if(!this.souvenir.setItems(tabSouvenir)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	private void updateEnchantSouvenir() {
		if(this.souvenir.getSelectedIndex() > 0) {
			this.labelGFB[4].setVisible(true);
			for(int i = 0; i < 3; i++) {
				this.souvenirEnchant.get(i).setVisible(true);
				updateSouvenirEnchant(i);
			}
		} else {
			this.labelGFB[4].setVisible(false);
			for(int i = 0; i < 3; i++) {
				this.souvenirEnchant.get(i).setVisible(false);
			}
		}
	}
	
	private void updateSouvenirEnchant(int idSouvenir) {
		int ignore1;
		int ignore2;
		
		if(idSouvenir == 0) {
			ignore1 = idSouvenir + 1;
			ignore2 = idSouvenir + 2;
		} else if(idSouvenir == 1) {
			ignore1 = idSouvenir - 1;
			ignore2 = idSouvenir + 1;
		} else {
			ignore1 = idSouvenir - 2;
			ignore2 = idSouvenir - 1;
		}
		
		SouvenirEnchantment choice = this.getSouvenirEnchantment(idSouvenir);
		SouvenirEnchantment memory1 = this.getSouvenirEnchantment(ignore1);
		SouvenirEnchantment memory2 = this.getSouvenirEnchantment(ignore2);
		
		SouvenirEnchantment[] tabSouvenir1 = SouvenirEnchantment.getPossibleSouvenirEnchant(this.getSouvenir(), choice, memory2);
		SouvenirEnchantment[] tabSouvenir2 = SouvenirEnchantment.getPossibleSouvenirEnchant(this.getSouvenir(), choice, memory1);
		
		this.souvenirEnchant.get(ignore1).setItems(tabSouvenir1, memory1);
		this.souvenirEnchant.get(ignore2).setItems(tabSouvenir2, memory2);
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
		config.put("Souvenir", this.getSouvenir().getName(Language.FR));
		
		for(int i = 0; i < this.souvenirEnchant.size(); i++) {
			String value = this.getSouvenirEnchantment(i) != null ? this.getSouvenirEnchantment(i).getName(Language.FR) : "";
			config.put("SouvenirEnchantment" + i, value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		this.bague.setSelectedItem(Bague.get(config.get("Bague"), lang));
		this.loveCo.setSelectedItem(LoveBuff.get(config.get("LoveBuff")));
		this.anima.setSelectedItem(Anima.get(config.get("Anima")));
		this.souvenir.setSelectedItem(Souvenir.get(config.get("Souvenir")));
		
		for(int i = 0; i < this.souvenirEnchant.size(); i++) {
			this.souvenirEnchant.get(i).setSelectedItem(SouvenirEnchantment.get(this.getSouvenir(), config.get("SouvenirEnchantment" + i)));
		}
	}
}
