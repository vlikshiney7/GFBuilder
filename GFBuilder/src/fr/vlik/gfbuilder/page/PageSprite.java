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
import fr.vlik.grandfantasia.Blason;
import fr.vlik.grandfantasia.Buff;
import fr.vlik.grandfantasia.Blason.BlasonType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageSprite extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageSprite INSTANCE = new PageSprite();
	
	private ArrayList<JCustomComboBox<Blason>> blason = new ArrayList<JCustomComboBox<Blason>>(2);
	private JCustomComboBox<Buff> isleBuff;
	
	public static PageSprite getInstance() {
		return INSTANCE;
	}

	private PageSprite() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			this.blason.add(new JCustomComboBox<Blason>(tabBlason));
			this.blason.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.blason.get(i).setRenderer(new CustomListCellRenderer());
			this.blason.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		this.isleBuff = new JCustomComboBox<Buff>(Buff.getData());
		this.isleBuff.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.isleBuff.setRenderer(new CustomListCellRenderer());
		this.isleBuff.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
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
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < this.blason.size(); i++) {
			list.addAll(this.getBlason(i).getEffects());
		}
		
		list.addAll(this.getIsleBuff().getEffects());
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(this.label[0]);
		elem1.add(Box.createVerticalStrut(10));
		
		for(int i = 0; i < 2; i++) {
			JPanel panelBlason = new JPanel();
			panelBlason.setLayout(new BoxLayout(panelBlason, BoxLayout.Y_AXIS));
			panelBlason.setBackground(Consts.UIColor[1]);
			this.label[i+1].setFont(new Font("Open Sans", Font.PLAIN, 14));
			panelBlason.add(this.label[i+1]);
			panelBlason.add(Box.createVerticalStrut(3));
			panelBlason.add(this.blason.get(i));
			panelBlason.add(Box.createVerticalStrut(5));
			
			elem1.add(panelBlason);
		}
		
		JPanel elem2 = new JPanel();
		elem2.setLayout(new BoxLayout(elem2, BoxLayout.Y_AXIS));
		elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem2.setBackground(Consts.UIColor[1]);
		elem2.add(this.label[3]);
		elem2.add(Box.createVerticalStrut(10));
		elem2.add(this.isleBuff);
		
		this.add(elem1);
		this.add(Box.createVerticalStrut(10));
		this.add(elem2);
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 9);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			Blason memory = this.getBlason(i);
			
			this.blason.get(i).setModel(new DefaultComboBoxModel<Blason>(tabBlason));
			this.blason.get(i).setSelectedItem(memory);
		}
	}
}