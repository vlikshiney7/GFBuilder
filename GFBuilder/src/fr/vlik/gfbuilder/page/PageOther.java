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
import fr.vlik.grandfantasia.BuffIcon;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.equipable.Anima;
import fr.vlik.grandfantasia.equipable.Bague;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;

public class PageOther extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "OTHER";
	private static PageOther INSTANCE = new PageOther();
	
	private JCustomComboBox<Bague> bague = new JCustomComboBox<Bague>();
	private JCustomComboBox<BuffIcon> loveCo = new JCustomComboBox<BuffIcon>();
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
		
		this.loveCo = new JCustomComboBox<BuffIcon>(BuffIcon.getDataLove());
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
	
	public BuffIcon getLoveCo() {
		return this.loveCo.getSelectedItem();
	}
	
	public Anima getAnima() {
		return this.anima.getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Calculable> list = new ArrayList<Calculable>();
		
		if(this.getBague().getEffects() != null) {
			for(Effect e : this.getBague().getEffects()) {
				list.add(e);
			}
		}
		
		list.addAll(this.getLoveCo().getEffects());
		
		for(Calculable c : this.getAnima().getEffects()) {
			list.add(c);
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JPanel page12Elem1 = new JPanel();
		page12Elem1.setLayout(new BoxLayout(page12Elem1, BoxLayout.Y_AXIS));
		page12Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem1.setBackground(Design.UIColor[1]);
		page12Elem1.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.bague);
		page12Elem1.add(Box.createVerticalStrut(15));
		page12Elem1.add(this.label[1]);
		this.label[1].setFont(Design.TITLE);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.loveCo);
		
		this.showAndHide.add(page12Elem1);
		
		
		JPanel page12Elem2 = new JPanel();
		page12Elem2.setLayout(new BoxLayout(page12Elem2, BoxLayout.Y_AXIS));
		page12Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem2.setBackground(Design.UIColor[1]);
		page12Elem2.add(this.label[2]);
		this.label[2].setFont(Design.TITLE);
		page12Elem2.add(Box.createVerticalStrut(10));
		page12Elem2.add(this.anima);
		
		this.showAndHide.add(page12Elem2);
		
		
		this.add(page12Elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(page12Elem2);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
	}
	
	public void updateMarried() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Bague memoryBague = this.getBague();
		BuffIcon memoryLoveCo = this.getLoveCo();
		
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
		
		this.anima.setModel(new DefaultComboBoxModel<Anima>(tabAnima));
		this.anima.setSelectedItem(memory);
		
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
		config.put("LoveBuff", this.getLoveCo().getName());
		config.put("Anima", this.getAnima().getName());
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		Bague bague = Bague.get(config.get("Bague"), lang);
		if(bague == null) {
			this.bague.setSelectedIndex(0);
		} else {
			this.bague.setSelectedItem(Bague.get(config.get("Bague"), lang));
		}
		
		BuffIcon loveCo = BuffIcon.getLove(config.get("LoveBuff"));
		if(loveCo == null) {
			this.loveCo.setSelectedIndex(0);
		} else {
			this.loveCo.setSelectedItem(BuffIcon.getLove(config.get("LoveBuff")));
		}
		
		Anima anima = Anima.get(config.get("Anima"));
		if(anima == null) {
			this.anima.setSelectedIndex(0);
		} else {
			this.anima.setSelectedItem(Anima.get(config.get("Anima")));
		}
	}
}
