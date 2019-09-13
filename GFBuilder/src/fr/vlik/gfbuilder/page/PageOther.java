package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Anima;
import fr.vlik.grandfantasia.Bague;
import fr.vlik.uidesign.CustomListCellRenderer;
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
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		this.bague = new JCustomComboBox<Bague>(Bague.getData());
		this.bague.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.bague.setRenderer(new CustomListCellRenderer());
		this.bague.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Anima[] tabAnima = Anima.getData(PageGeneral.getInstance().getLvl());
		this.anima = new JCustomComboBox<Anima>(tabAnima);
		this.anima.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.anima.setRenderer(new CustomListCellRenderer());
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
		page12Elem1.setBackground(Consts.UIColor[1]);
		page12Elem1.add(this.label[0]);
		page12Elem1.add(Box.createVerticalStrut(10));
		page12Elem1.add(this.bague);
		
		this.showAndHide.add(page12Elem1);
		
		
		JPanel page12Elem2 = new JPanel();
		page12Elem2.setLayout(new BoxLayout(page12Elem2, BoxLayout.Y_AXIS));
		page12Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page12Elem2.setBackground(Consts.UIColor[1]);
		page12Elem2.add(this.label[1]);
		page12Elem2.add(Box.createVerticalStrut(10));
		page12Elem2.add(this.anima);
		
		this.showAndHide.add(page12Elem2);
		
		
		this.add(page12Elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(page12Elem2);
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 11);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateBague() {
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		int lvl = PageGeneral.getInstance().getLvl();
		
		if(reinca || lvl >= 20) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
			this.bague.setSelectedIndex(0);
		}
	}
	
	public void updateAnima() {
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		int lvl = PageGeneral.getInstance().getLvl();
		
		Anima[] tabAnima = Anima.getData(lvl);
		int memory = this.anima.getSelectedIndex();
		
		this.anima.setModel(new DefaultComboBoxModel<Anima>(tabAnima));
		this.anima.setSelectedIndex(memory);
		
		if(reinca && lvl >= 10) {
			this.showAndHide.get(1).setVisible(true);
		} else {
			this.showAndHide.get(1).setVisible(false);
			this.anima.setSelectedIndex(0);
		}
	}
}
