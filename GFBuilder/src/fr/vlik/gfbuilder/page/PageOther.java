package fr.vlik.gfbuilder.page;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Anima;
import fr.vlik.grandfantasia.Bague;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageOther extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageOther INSTANCE = new PageOther();
	
	private JCustomComboBox<Bague> bague = new JCustomComboBox<Bague>();
	private JCustomComboBox<Anima> anima = new JCustomComboBox<Anima>();
	
	private ArrayList<JPanel> showAndHide = new ArrayList<JPanel>();
	
	public static PageOther getInstance() {
		return INSTANCE;
	}

	private PageOther() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel(Language.FR);
		
		this.bague = new JCustomComboBox<Bague>(Bague.getData());
		this.bague.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Anima[] tabAnima = Anima.getData(PageGeneral.getInstance().getLvl());
		this.anima = new JCustomComboBox<Anima>(tabAnima);
		this.anima.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
	}
	
	public Bague getBague() {
		return this.bague.getSelectedItem();
	}

	public Anima getAnima() {
		return this.anima.getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		list.addAll(this.getBague().getEffects());
		list.addAll(this.getAnima().getEffects());
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JPanel page12Elem1 = new JPanel();
		page12Elem1.setLayout(new BoxLayout(page12Elem1, BoxLayout.Y_AXIS));
		page12Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem1.setBackground(Design.UIColor[1]);
		page12Elem1.add(this.label[0]);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.bague);
		
		this.showAndHide.add(page12Elem1);
		
		
		JPanel page12Elem2 = new JPanel();
		page12Elem2.setLayout(new BoxLayout(page12Elem2, BoxLayout.Y_AXIS));
		page12Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem2.setBackground(Design.UIColor[1]);
		page12Elem2.add(this.label[1]);
		page12Elem2.add(Box.createVerticalStrut(10));
		page12Elem2.add(this.anima);
		
		this.showAndHide.add(page12Elem2);
		
		
		this.add(page12Elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(page12Elem2);
	}

	@Override
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 11);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 11);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
	}
	
	public void updateBague() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(reinca.getLvl() > 0 || lvl >= 20) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
			this.bague.setSelectedIndex(0);
		}
	}
	
	public void updateAnima() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Anima[] tabAnima = Anima.getData(lvl);
		int memory = this.anima.getSelectedIndex();
		
		this.anima.setModel(new DefaultComboBoxModel<Anima>(tabAnima));
		this.anima.setSelectedIndex(memory);
		
		if(reinca.getLvl() > 0 && lvl >= 10) {
			this.showAndHide.get(1).setVisible(true);
		} else {
			this.showAndHide.get(1).setVisible(false);
			this.anima.setSelectedIndex(0);
		}
	}

	@Override
	public int[] getConfig() {
		int[] config = new int[2];
		
		int index = 0;
		
		config[index++] = this.bague.getSelectedIndex();
		
		config[index++] = this.anima.getSelectedIndex();
		
		return config;
	}

	@Override
	public void setConfig(int[] config) {
		int index = 0;
		
		this.bague.setSelectedIndex(config[index++]);
		
		this.anima.setSelectedIndex(config[index++]);
	}
}
