package fr.vlik.gfbuilder.page;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characUpgrade.Energy;
import fr.vlik.grandfantasia.characUpgrade.Nucleus;
import fr.vlik.grandfantasia.characUpgrade.Stone;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.gameBuff.GuildBuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;
import fr.vlik.uidesign.JCustomSpinner;

public class PageBuff extends PagePanel {
	
	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "BUFF";
	private static PageBuff INSTANCE = new PageBuff();
	
	private ArrayList<JCustomComboBox<Nucleus>> nucleus = new ArrayList<JCustomComboBox<Nucleus>>(6);
	private ArrayList<JCustomLabel<Energy>> labelEnergy = new ArrayList<JCustomLabel<Energy>>(6);
	private ArrayList<JCustomSpinner> energy = new ArrayList<JCustomSpinner>(6);
	private ArrayList<JCustomLabel<GuildBuff>> guildBuffUsed = new ArrayList<JCustomLabel<GuildBuff>>(4);
	private JCustomComboBox<GuildBuff> guildBuff;
	private ArrayList<JCustomLabel<Stone>> stoneUsed = new ArrayList<JCustomLabel<Stone>>(13);
	private JCustomComboBox<Stone> stone;
	
	private JPanel showAndHide;
	private ArrayList<JCustomButton> cross = new ArrayList<JCustomButton>(7);
	private ArrayList<JCustomButton> remove = new ArrayList<JCustomButton>(7);
	
	public static PageBuff getInstance() {
		return INSTANCE;
	}
	
	private PageBuff() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 6; i++) {
			this.nucleus.add(new JCustomComboBox<Nucleus>(Nucleus.getData(i)));
			this.nucleus.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		
		for(int i = 0; i < 6; i++) {
			this.labelEnergy.add(new JCustomLabel<Energy>(Energy.getData()[i]));
			this.labelEnergy.get(i).setPreferredSize(new Dimension(120, 32));
			
			this.energy.add(new JCustomSpinner(new SpinnerNumberModel(0, 0, 2, 1)));
			this.energy.get(i).addChangeListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		
		for(int i = 0; i < 4; i++) {
			this.guildBuffUsed.add(new JCustomLabel<GuildBuff>(null));
			this.guildBuffUsed.get(i).setBackground(Design.UIColor[0]);
			this.guildBuffUsed.get(i).setBorder(new EmptyBorder(0, 0, 0, 10));
			this.guildBuffUsed.get(i).setMaximumSize(new Dimension(335, 32));
			this.guildBuffUsed.get(i).setOpaque(true);
			this.guildBuffUsed.get(i).setVisible(false);
			
			int id = i;
			
			this.remove.add(new JCustomButton("crossBase", "crossPress", "crossHover"));
			this.remove.get(i).addActionListener(e -> {
				removeGuildBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			this.cross.add(this.remove.get(i));
			this.cross.get(i).setBackground(Design.UIColor[0]);
			this.cross.get(i).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.cross.get(i).setMaximumSize(new Dimension(20, 32));
			this.cross.get(i).setOpaque(true);
			this.cross.get(i).setVisible(false);
		}
		
		this.guildBuff = new JCustomComboBox<GuildBuff>(GuildBuff.getData());
		this.guildBuff.setMaximumSize(new Dimension(320, 36));
		this.guildBuff.addActionListener(e -> {
			updateGuildBuff();
        	
        	setEffects();
        	MainFrame.getInstance().updateStat();
		});
		
		
		for(int i = 0; i < 13; i++) {
			this.stoneUsed.add(new JCustomLabel<Stone>(null));
			this.stoneUsed.get(i).setBackground(Design.UIColor[0]);
			this.stoneUsed.get(i).setBorder(new EmptyBorder(0, 0, 0, 10));
			this.stoneUsed.get(i).setMaximumSize(new Dimension(306, 32));
			this.stoneUsed.get(i).setOpaque(true);
			this.stoneUsed.get(i).setVisible(false);
			
			int id = i;
			this.remove.add(new JCustomButton("crossBase", "crossPress", "crossHover"));
			this.remove.get(i+4).addActionListener(e -> {
				removeStoneBuff(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.cross.add(this.remove.get(i+4));
			this.cross.get(i+4).setBackground(Design.UIColor[0]);
			this.cross.get(i+4).setBorder(new EmptyBorder(0, 0, 0, 5));
			this.cross.get(i+4).setMaximumSize(new Dimension(20, 32));
			this.cross.get(i+4).setOpaque(true);
			this.cross.get(i+4).setVisible(false);
		}
		
		this.stone = new JCustomComboBox<Stone>(Stone.getData());
		this.stone.setMaximumSize(new Dimension(280, 36));
		this.stone.addActionListener(e -> {
			updateStoneBuff();
        	
        	setEffects();
        	MainFrame.getInstance().updateStat();
		});
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	public Nucleus getNucleus(int id) {
		return this.nucleus.get(id).getSelectedItem();
	}
	
	public GuildBuff getGuildBuffUsed(int i) {
		return this.guildBuffUsed.get(i).getItem();
	}
	
	public GuildBuff getGuildBuff() {
		return this.guildBuff.getSelectedItem();
	}
	
	public Stone getStoneUsed(int i) {
		return this.stoneUsed.get(i).getItem();
	}
	
	public Stone getStone() {
		return this.stone.getSelectedItem();
	}
	
	@Override
	protected void setLabelAPI() {
		
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		
		for(int i = 0; i < this.nucleus.size(); i++) {
			list.addAll(this.getNucleus(i));
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			if(Energy.getData()[i].getEffects() != null) {
				for(Calculable effect : Energy.getData()[i].getEffects()) {
					list.add(Energy.multiplyEffect(effect, Math.min(this.energy.get(i).getIntValue(), PageGeneral.getInstance().getLvl() *2)));
				}
			}
		}
		
		for(JCustomLabel<GuildBuff> guild : this.guildBuffUsed) {
			if(guild.isVisible()) {
				list.addAll(guild.getItem());
			}
		}
		
		for(JCustomLabel<Stone> stone : this.stoneUsed) {
			if(stone.isVisible()) {
				list.addAll(stone.getItem());
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JPanel page11Elem1 = new JPanel();
		page11Elem1.setLayout(new BoxLayout(page11Elem1, BoxLayout.Y_AXIS));
		page11Elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem1.setBackground(Design.UIColor[1]);
		page11Elem1.add(this.labelGFB[0]);
		this.labelGFB[0].setFont(Design.TITLE);
		page11Elem1.add(Box.createVerticalStrut(10));
		
		
		for(int i = 0; i < 6; i++) {
			JPanel nucleus = new JPanel();
			nucleus.setBackground(Design.UIColor[1]);
			nucleus.add(this.labelGFB[i+1]);
			this.labelGFB[i+1].setFont(Design.SUBTITLE);
			this.labelGFB[i+1].setPreferredSize(new Dimension(60, 20));
			this.nucleus.get(i).setPreferredSize(new Dimension(200, 36));
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
			JPanel panelEnergy = new JPanel();
			panelEnergy.setBackground(Design.UIColor[1]);
			panelEnergy.add(this.labelEnergy.get(i));
			panelEnergy.add(this.energy.get(i));
			
			energies.add(panelEnergy);
		}
		
		JPanel page11Elem2 = new JPanel();
		page11Elem2.setLayout(new BoxLayout(page11Elem2, BoxLayout.Y_AXIS));
		page11Elem2.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem2.setBackground(Design.UIColor[1]);
		page11Elem2.add(this.labelGFB[7]);
		this.labelGFB[7].setFont(Design.TITLE);
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
		blocBuffGuild.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 4; i++) {
			JPanel lineBuff = new JPanel();
			lineBuff.setLayout(new BoxLayout(lineBuff, BoxLayout.X_AXIS));
			lineBuff.setBorder(new EmptyBorder(0, 0, 0, 0));
			lineBuff.setOpaque(false);
			
			lineBuff.setBackground(Design.UIColor[0]);
			
			lineBuff.add(this.guildBuffUsed.get(i));
			this.cross.get(i).setHorizontalAlignment(JLabel.RIGHT);
			lineBuff.add(this.cross.get(i));
			
			blocBuffGuild.add(lineBuff);
			blocBuffGuild.add(Box.createVerticalStrut(3));
		}
		
		
		JPanel page11Elem3 = new JPanel();
		page11Elem3.setLayout(new BoxLayout(page11Elem3, BoxLayout.Y_AXIS));
		page11Elem3.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem3.setBackground(Design.UIColor[1]);
		page11Elem3.add(this.labelGFB[8]);
		this.labelGFB[8].setFont(Design.TITLE);
		page11Elem3.add(Box.createVerticalStrut(10));
		page11Elem3.add(blocBuffGuild);
		page11Elem3.add(Box.createVerticalStrut(10));
		page11Elem3.add(this.labelGFB[9]);
		this.labelGFB[9].setFont(Design.SUBTITLE);
		page11Elem3.add(Box.createVerticalStrut(5));
		page11Elem3.add(this.guildBuff);
		
		
		JPanel blocStone = new JPanel();
		blocStone.setLayout(new BoxLayout(blocStone, BoxLayout.Y_AXIS));
		blocStone.setBackground(Design.UIColor[1]);
		blocStone.add(Box.createVerticalStrut(5));
		
		for(int i = 0; i < 13; i++) {
			JPanel lineStone = new JPanel();
			lineStone.setLayout(new BoxLayout(lineStone, BoxLayout.X_AXIS));
			lineStone.setBackground(Design.UIColor[0]);
			lineStone.setBorder(new EmptyBorder(0, 0, 0, 0));
			lineStone.setOpaque(false);
			
			lineStone.add(this.stoneUsed.get(i));
			this.cross.get(i+4).setHorizontalAlignment(JLabel.RIGHT);
			lineStone.add(this.cross.get(i+4));
			
			blocStone.add(lineStone);
			blocStone.add(Box.createVerticalStrut(3));
		}
		
		
		JPanel page11Elem4 = new JPanel();
		page11Elem4.setLayout(new BoxLayout(page11Elem4, BoxLayout.Y_AXIS));
		page11Elem4.setBorder(new EmptyBorder(10, 10, 10, 10));
		page11Elem4.setBackground(Design.UIColor[1]);
		page11Elem4.add(this.labelGFB[10]);
		this.labelGFB[10].setFont(Design.TITLE);
		page11Elem4.add(Box.createVerticalStrut(10));
		page11Elem4.add(blocStone);
		page11Elem4.add(Box.createVerticalStrut(10));
		page11Elem4.add(this.labelGFB[11]);
		this.labelGFB[11].setFont(Design.SUBTITLE);
		page11Elem4.add(Box.createVerticalStrut(5));
		page11Elem4.add(this.stone);
		
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
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.labelGFB.length; i++) {
			this.labelGFB[i].updateText(lang);
		}
		
		for(int i = 0; i < this.labelEnergy.size(); i++) {
			this.labelEnergy.get(i).updateText(lang);
		}
	}
	
	public void updateNucleus() {
		if(PageGeneral.getInstance().getReinca().getLvl() == 0) {
			this.showAndHide.setVisible(false);
			this.nucleus.get(1).setSelectedIndex(0);
		} else {
			this.showAndHide.setVisible(true);
		}
	}
	
	public void updateEnergy() {
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < this.energy.size(); i++) {
			int memory = this.energy.get(i).getIntValue();
			if(reinca.getLvl() == 0) {
				if(memory > lvl*2) {
					memory = lvl*2;
				}
				
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, lvl*2, 1));
			} else {
				this.energy.get(i).setModel(new SpinnerNumberModel(memory, 0, 200, 1));
			}
			
			if(this.energy.get(i).getIntValue() != memory) {
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
	}
	
	private void updateGuildBuff() {
		GuildBuff choice = this.getGuildBuff();
		
		int slot = 0;
		while(slot < 4 && this.guildBuffUsed.get(slot).isVisible()) {
			slot++;
		}
		
		if(slot == 4) {
			for(int i = 0; i < 3; i++) {
				this.guildBuffUsed.get(i).setItem(this.guildBuffUsed.get(i+1).getItem());
			}
			this.guildBuffUsed.get(3).setItem(choice);
		} else {
			this.guildBuffUsed.get(slot).setItem(choice);
			this.guildBuffUsed.get(slot).setVisible(true);
			this.cross.get(slot).setVisible(true);
		}
		
		refreshGuildBuffList();
	}

	private void removeGuildBuff(int id) {
		while(id < 3 && this.guildBuffUsed.get(id+1).isVisible()) {
			this.guildBuffUsed.get(id).setItem(this.guildBuffUsed.get(id+1).getItem());
			id++;
		}
		
		this.guildBuffUsed.get(id).setVisible(false);
		this.cross.get(id).setVisible(false);
		
		refreshGuildBuffList();
	}
	
	private void refreshGuildBuffList() {
		ArrayList<GuildBuff> guildBuff = new ArrayList<GuildBuff>();
		
		for(int i = 0; i < 4; i++) {
			if(this.guildBuffUsed.get(i).isVisible()) {
				guildBuff.add(this.guildBuffUsed.get(i).getItem());
			}
		}
		
		GuildBuff[] tabGuildBuff = GuildBuff.getListGuildBuff(guildBuff);
		this.guildBuff.placeItems(tabGuildBuff);
	}
	
	private void updateStoneBuff() {
		Stone choice = this.getStone();
		
		if(choice == null) {
			return;
		}
		
		int slot = 0;
		while(slot < 13 && this.stoneUsed.get(slot).isVisible()) {
			slot++;
		}
		
		this.stoneUsed.get(slot).setItem(choice);
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
		ArrayList<Stone> stone = new ArrayList<Stone>();
		
		for(int i = 0; i < 13; i++) {
			if(this.stoneUsed.get(i).isVisible()) {
				stone.add(this.stoneUsed.get(i).getItem());
			}
		}
		
		this.stone.placeItems(Stone.getListStone(stone));
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}

	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.nucleus.size(); i++) {
			config.put("Nucleus" + i, this.getNucleus(i).getName(Language.FR));
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			config.put("Energy" + i, "" + this.energy.get(i).getIntValue());
		}
		
		for(int i = 0; i < this.guildBuffUsed.size(); i++) {
			String value = this.getGuildBuffUsed(i) != null && this.guildBuffUsed.get(i).isVisible() ? this.getGuildBuffUsed(i).getName(Language.FR) : "";
			config.put("GuildBuff" + i, value);
		}
		
		for(int i = 0; i < this.stoneUsed.size(); i++) {
			String value = this.getStoneUsed(i) != null && this.stoneUsed.get(i).isVisible() ? this.getStoneUsed(i).getName(Language.FR) : "";
			config.put("Stone" + i, value);
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.nucleus.size(); i++) {
			this.nucleus.get(i).setSelectedItem(Nucleus.get(config.get("Nucleus" + i), i));
		}
		
		for(int i = 0; i < this.energy.size(); i++) {
			this.energy.get(i).setValue(Integer.valueOf(config.get("Energy" + i)));
		}
		
		for(int i = 0; i < this.guildBuffUsed.size(); i++) {
			GuildBuff guildBuff = GuildBuff.get(config.get("GuildBuff" + i));
			if(guildBuff != null) {
				this.guildBuffUsed.get(i).setItem(guildBuff);
				this.guildBuffUsed.get(i).setVisible(true);
			} else {
				this.guildBuffUsed.get(i).setVisible(false);
			}
		}
		
		for(int i = 0; i < this.stoneUsed.size(); i++) {
			Stone stone = Stone.get(config.get("Stone" + i));
			if(stone != null) {
				this.stoneUsed.get(i).setItem(stone);
				this.stoneUsed.get(i).setVisible(true);
			} else {
				this.stoneUsed.get(i).setVisible(false);
			}
		}
		
		refreshGuildBuffList();
		refreshStoneList();
		setEffects();
	}
}
