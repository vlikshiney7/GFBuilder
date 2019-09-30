package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Effect;
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.GuildBuff;
import fr.vlik.grandfantasia.Nucleus;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomList;
import fr.vlik.uidesign.JCustomSpinner;

public class PageBuff extends PagePanel implements AdditionalEffect {

	private static final long serialVersionUID = 1L;
	private static PageBuff INSTANCE = new PageBuff();
	
	private ArrayList<JCustomComboBox<Nucleus>> nucleus = new ArrayList<JCustomComboBox<Nucleus>>(6);
	private ArrayList<JCustomSpinner> energy = new ArrayList<JCustomSpinner>(6);
	private ArrayList<JCustomLabel> guildBuffUsed = new ArrayList<JCustomLabel>(4);
	private JCustomList<GuildBuff> listGuildBuff;
	private ArrayList<JCustomLabel> stoneUsed = new ArrayList<JCustomLabel>(3);
	private JCustomList<Nucleus> listStone;
	
	private ArrayList<Effect> additionalEffects;
	
	private JPanel showAndHide;
	private ArrayList<JCustomButton> cross = new ArrayList<JCustomButton>(7);
	private ArrayList<JCustomButton> remove = new ArrayList<JCustomButton>(7);
	
	public static PageBuff getInstance() {
		return INSTANCE;
	}

	private PageBuff() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel(Language.FR);
		
		for(int i = 0; i < 6; i++) {
			this.nucleus.add(new JCustomComboBox<Nucleus>(Nucleus.getData(i)));
			this.nucleus.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		
		for(int i = 0; i < 6; i++) {
			this.energy.add(new JCustomSpinner(new SpinnerNumberModel(0, 0, 2, 1)));
			this.energy.get(i).addChangeListener(e -> {
				setAdditionalEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		
		for(int i = 0; i < 4; i++) {
			this.guildBuffUsed.add(new JCustomLabel());
			this.guildBuffUsed.get(i).setAlignmentX(LEFT_ALIGNMENT);
			this.guildBuffUsed.get(i).setVisible(false);
			
			int id = i;
			
			try {
				this.remove.add(new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png")))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.remove.get(i).setAlignmentX(RIGHT_ALIGNMENT);
			this.remove.get(i).addActionListener(e -> {
				removeGuildBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			this.cross.add(this.remove.get(i));
			this.cross.get(i).setVisible(false);
		}
		
		this.listGuildBuff = new JCustomList<GuildBuff>(GuildBuff.getData());
		this.listGuildBuff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				JCustomList<?> list = (JCustomList<?>)evt.getSource();
				
		        if (evt.getClickCount() == 2) {
		        	updateGuildBuff(list.getSelectedIndex());
		        	
		        	setEffects();
		        	MainFrame.getInstance().updateStat();
		        }
		    }
		});
		this.listGuildBuff.setAlignmentX(LEFT_ALIGNMENT);
		this.listGuildBuff.setMaximumSize(new Dimension(500, 100));
		
		
		for(int i = 0; i < 3; i++) {
			this.stoneUsed.add(new JCustomLabel());
			this.stoneUsed.get(i).setAlignmentX(LEFT_ALIGNMENT);
			this.stoneUsed.get(i).setVisible(false);
			
			int id = i;
			try {
				this.remove.add(new JCustomButton(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/crossBase.png")))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.remove.get(i+4).setAlignmentX(RIGHT_ALIGNMENT);
			this.remove.get(i+4).addActionListener(e -> {
				removeStoneBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.cross.add(this.remove.get(i+4));
			this.cross.get(i+4).setVisible(false);
		}
		
		this.listStone = new JCustomList<Nucleus>(Nucleus.getData(6));
		this.listStone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (evt.getClickCount() == 2) {
		        	updateStoneBuff();
		        	
		        	setEffects();
		        	MainFrame.getInstance().updateStat();
		        }
		    }
		});
		this.listStone.setAlignmentX(LEFT_ALIGNMENT);
		
		createPanel();
		setEffects();
		setAdditionalEffects();
	}
	
	public Nucleus getNucleus(int id) {
		return this.nucleus.get(id).getSelectedItem();
	}
	
	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		for(int i = 0; i < this.nucleus.size(); i++) {
			list.addAll(this.getNucleus(i).getEffects());
		}
		
		for(JCustomLabel guild : this.guildBuffUsed) {
			if(guild.isVisible()) {
				list.addAll(guild.getEffects());
			}
		}
		
		for(JCustomLabel stone : this.stoneUsed) {
			if(stone.isVisible()) {
				list.addAll(stone.getEffects());
			}
		}
		
		this.effects = list;
	}
	
	@Override
	public ArrayList<Effect> getAdditionalEffects() {
		return this.additionalEffects;
	}

	@Override
	public void setAdditionalEffects() {
		ArrayList<Effect> additional = new ArrayList<Effect>();
		
		for(int i = 0; i < this.energy.size(); i++) {
			for(Effect effect : Energy.getData()[i].getEffects()) {
				additional.add(Energy.multiplyEffect(effect, Math.min(this.energy.get(i).getIntValue(), PageGeneral.getInstance().getLvl() *2)));
			}
		}
		
		this.additionalEffects = additional;
	}

	@Override
	protected void createPanel() {
		JPanel page11Elem1 = new JPanel();
		page11Elem1.setLayout(new BoxLayout(page11Elem1, BoxLayout.Y_AXIS));
		page11Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem1.setBackground(Design.UIColor[1]);
		page11Elem1.add(this.label[0]);
		page11Elem1.add(Box.createVerticalStrut(10));
		
		
		for(int i = 0; i < 6; i++) {
			JPanel nucleus = new JPanel();
			nucleus.setBackground(Design.UIColor[1]);
			this.label[i+1].setFont(new Font("Open Sans", Font.PLAIN, 14));
			this.label[i+1].setPreferredSize(new Dimension(60, 20));
			nucleus.add(this.label[i+1]);
			this.nucleus.get(i).setPreferredSize(new Dimension(185, 36));
			nucleus.add(this.nucleus.get(i));
			nucleus.add(Box.createVerticalStrut(5));
			
			if(i == 1) {
				this.showAndHide = nucleus;
			}
			
			page11Elem1.add(nucleus);
		}
		
		
		JPanel energies = new JPanel(new GridLayout(6, 1, 5, 5));
		energies.setBackground(Design.UIColor[1]);
		
		for(int i = 0; i < 6; i++) {
			
			JCustomLabel labelEnergy = new JCustomLabel(Energy.getData()[i]);
			labelEnergy.setPreferredSize(new Dimension(120, 32));
			
			JPanel panelEnergy = new JPanel();
			panelEnergy.setBackground(Design.UIColor[1]);
			panelEnergy.add(labelEnergy);
			panelEnergy.add(this.energy.get(i));
			
			energies.add(panelEnergy);
		}
		
		JPanel page11Elem2 = new JPanel();
		page11Elem2.setLayout(new BoxLayout(page11Elem2, BoxLayout.Y_AXIS));
		page11Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem2.setBackground(Design.UIColor[1]);
		page11Elem2.add(this.label[7]);
		page11Elem2.add(Box.createVerticalStrut(10));
		page11Elem2.add(energies);
		
		
		JPanel page11Inter1 = new JPanel(new GridLayout(1, 2, 10, 10));
		page11Inter1.setBackground(Design.UIColor[2]);
		page11Inter1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Inter1.add(page11Elem1);
		page11Inter1.add(page11Elem2);
		
		
		JPanel blocBuffGuild = new JPanel();
		blocBuffGuild.setLayout(new BoxLayout(blocBuffGuild, BoxLayout.Y_AXIS));
		blocBuffGuild.setBackground(Design.UIColor[1]);
		this.label[9].setFont(new Font("Open Sans", Font.PLAIN, 14));
		blocBuffGuild.add(this.label[9]);
		blocBuffGuild.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 4; i++) {
			JPanel lineBuff = new JPanel();
			lineBuff.setBackground(Design.UIColor[1]);
			
			lineBuff.add(this.guildBuffUsed.get(i));
			lineBuff.add(this.cross.get(i));
			lineBuff.setAlignmentX(LEFT_ALIGNMENT);
			
			blocBuffGuild.add(lineBuff);
			blocBuffGuild.add(Box.createVerticalStrut(3));
		}
		
		
		JScrollPane scrollList = new JScrollPane(this.listGuildBuff, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel page11Elem3 = new JPanel();
		page11Elem3.setLayout(new BoxLayout(page11Elem3, BoxLayout.Y_AXIS));
		page11Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem3.setBackground(Design.UIColor[1]);
		this.label[8].setAlignmentX(LEFT_ALIGNMENT);
		page11Elem3.add(this.label[8]);
		page11Elem3.add(Box.createVerticalStrut(10));
		page11Elem3.add(blocBuffGuild);
		page11Elem3.add(Box.createVerticalStrut(10));
		this.label[10].setFont(new Font("Open Sans", Font.PLAIN, 14));
		page11Elem3.add(this.label[10]);
		page11Elem3.add(Box.createVerticalStrut(5));
		page11Elem3.add(scrollList);
		
		
		JPanel blocStone = new JPanel();
		blocStone.setLayout(new BoxLayout(blocStone, BoxLayout.Y_AXIS));
		blocStone.setBackground(Design.UIColor[1]);
		this.label[12].setFont(new Font("Open Sans", Font.PLAIN, 14));
		blocStone.add(this.label[12]);
		blocStone.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 3; i++) {
			JPanel lineStone = new JPanel();
			lineStone.setBackground(Design.UIColor[1]);
			
			lineStone.add(this.stoneUsed.get(i));
			lineStone.add(this.cross.get(i+4));
			lineStone.setAlignmentX(LEFT_ALIGNMENT);
			
			blocStone.add(lineStone);
			blocStone.add(Box.createVerticalStrut(3));
		}
		
		
		JPanel page11Elem4 = new JPanel();
		page11Elem4.setLayout(new BoxLayout(page11Elem4, BoxLayout.Y_AXIS));
		page11Elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem4.setBackground(Design.UIColor[1]);
		this.label[11].setAlignmentX(LEFT_ALIGNMENT);
		page11Elem4.add(this.label[11]);
		page11Elem4.add(Box.createVerticalStrut(10));
		page11Elem4.add(blocStone);
		page11Elem4.add(Box.createVerticalStrut(10));
		this.label[13].setFont(new Font("Open Sans", Font.PLAIN, 14));
		page11Elem4.add(this.label[13]);
		page11Elem4.add(Box.createVerticalStrut(5));
		page11Elem4.add(this.listStone);
		
		JPanel page11Inter2 = new JPanel(new GridLayout(1, 2, 10, 10));
		page11Inter2.setBackground(Design.UIColor[2]);
		page11Inter2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Inter2.add(page11Elem3);
		page11Inter2.add(page11Elem4);
		
		
		this.setBackground(Design.UIColor[1]);
		this.add(page11Inter1);
		this.add(page11Inter2);
	}

	@Override
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 10);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 10);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
	}
	
	public void updateNucleus() {
		if(PageGeneral.getInstance().getReinca() == 0) {
			this.showAndHide.setVisible(false);
			this.nucleus.get(1).setSelectedIndex(0);
		} else {
			this.showAndHide.setVisible(true);
		}
	}
	
	public void updateEnergy() {
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		for(int i = 0; i < this.energy.size(); i++) {
			int memory = (int) this.energy.get(i).getIntValue();
			if(!reinca) {
				if(memory > lvl*2) memory = lvl*2;
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, lvl*2, 1));
			} else {
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, 200, 1));
			}
		}
	}
	
	private void updateGuildBuff(int idList) {
		GuildBuff choice = (GuildBuff) this.listGuildBuff.getSelectedValue();
		
		int slot = 0;
		while(slot < 4 && this.guildBuffUsed.get(slot).isVisible()) slot++;
		
		if(slot == 4) {
			for(int i = 0; i < 3; i++) {
				this.guildBuffUsed.get(i).setObject(this.guildBuffUsed.get(i+1));
			}
			this.guildBuffUsed.get(3).setObject(choice);
		} else {
			this.guildBuffUsed.get(slot).setObject(choice);
			this.guildBuffUsed.get(slot).setVisible(true);
			this.cross.get(slot).setVisible(true);
		}
		
		refreshGuildBuffList();
	}

	private void removeGuildBuff(int id) {
		while(id < 3 && this.guildBuffUsed.get(id+1).isVisible()) {
			this.guildBuffUsed.get(id).setObject(this.guildBuffUsed.get(id+1));
			id++;
		}
		
		this.guildBuffUsed.get(id).setVisible(false);
		this.cross.get(id).setVisible(false);
		
		refreshGuildBuffList();
	}
	
	private void refreshGuildBuffList() {
		ArrayList<String> guildBuffName = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++) {
			if(this.guildBuffUsed.get(i).isVisible()) {
				guildBuffName.add(this.guildBuffUsed.get(i).getText());
			}
		}
		
		GuildBuff[] tabGuildBuff = GuildBuff.getListGuildBuff(guildBuffName);
		this.listGuildBuff.setModel(new DefaultComboBoxModel<GuildBuff>(tabGuildBuff));
	}
	
	private void updateStoneBuff() {
		Nucleus choice = (Nucleus) this.listStone.getSelectedValue();
		
		int slot = 0;
		while(slot < 3 && this.stoneUsed.get(slot).isVisible()) {
			slot++;
		}
		
		this.stoneUsed.get(slot).setObject(choice);
		this.stoneUsed.get(slot).setVisible(true);
		this.cross.get(slot+4).setVisible(true);
		
		refreshStoneList();
	}
	
	private void removeStoneBuff(int id) {
		this.stoneUsed.get(id).setVisible(false);
		this.cross.get(id+4).setVisible(false);
		
		refreshStoneList();
	}
	
	private void refreshStoneList() {
		ArrayList<String> stoneName = new ArrayList<String>();
		
		for(int i = 0; i < 3; i++) {
			if(this.stoneUsed.get(i).isVisible()) {
				stoneName.add(this.stoneUsed.get(i).getText());
			}
		}
		
		this.listStone.setModel(new DefaultComboBoxModel<Nucleus>(Nucleus.getData(stoneName)));
	}

	@Override
	public int[] getConfig() {
		int[] config = new int[12];
		
		int index = 0;
		
		for(int i = 0; i < 6; i++) {
			config[index++] = this.nucleus.get(i).getSelectedIndex();
		}
		
		for(int i = 0; i < 6; i++) {
			config[index++] = this.energy.get(i).getIntValue();
		}
		
		return config;
	}

	@Override
	public void setConfig(int[] config) {
		int index = 0;

		for(int i = 0; i < 6; i++) {
			this.nucleus.get(i).setSelectedIndex(config[index++]);
		}

		for(int i = 0; i < 6; i++) {
			this.energy.get(i).setValue(config[index++]);
		}
		
	}
}
