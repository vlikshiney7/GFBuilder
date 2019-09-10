package fr.vlik.gfbuilder.page;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Util;
import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.gfbuilder.Lang.Language;
import fr.vlik.grandfantasia.Bullet;
import fr.vlik.grandfantasia.Enchantment;
import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Pearl;
import fr.vlik.grandfantasia.Weapon;
import fr.vlik.grandfantasia.XpStuff;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.uidesign.CustomListCellRenderer;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomLabel;

public class PageWeapon extends PagePanel {

	private static final long serialVersionUID = 1L;
	private static PageWeapon INSTANCE = new PageWeapon();
	
	private ArrayList<JCustomComboBox<Weapon>> weapon = new ArrayList<JCustomComboBox<Weapon>>(3);
	private JCustomComboBox<Bullet> bullet;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	private ArrayList<JCustomComboBox<String>> fortif = new ArrayList<JCustomComboBox<String>>(3);
	private ArrayList<JCustomComboBox<Pearl>> pearl = new ArrayList<JCustomComboBox<Pearl>>(12);
	private ArrayList<JCustomComboBox<String>> effectXpStuff = new ArrayList<JCustomComboBox<String>>(6);
	private ArrayList<JCustomComboBox<String>> lvlXpStuff = new ArrayList<JCustomComboBox<String>>(6);
	
	private JPanel showAndHide;
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(3);
	
	public static PageWeapon getInstance() {
		return INSTANCE;
	}

	public PageWeapon() {
		super(null, Consts.UIColor[2]);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel();
		
		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, PageGeneral.getInstance().getGrade().getGrade(), PageGeneral.getInstance().getLvl(), false, null);
			this.weapon.add(new JCustomComboBox<Weapon>(tabWeapon));
			this.weapon.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.weapon.get(i).setRenderer(new CustomListCellRenderer());
			
			int id = i;
			this.weapon.get(i).addActionListener(e -> {
				updateXpStuff(id);
				updateDetails(id);
				updatePearl(id);
				updateEnchant(id);
				weaponType(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();				
			});
			
			/* ENCHANTEMENT */
			this.enchant.add(new JCustomComboBox<Enchantment>());
			this.enchant.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.enchant.get(i).setRenderer(new CustomListCellRenderer());
			this.enchant.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.enchant.get(i).setVisible(false);
			
			/* FORTIF */
			String nameFortif[] = { "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "+10", "+11", "+12", "+13", "+14", "+15", "+16", "+17", "+18", "+19", "+20" };
			this.fortif.add(new JCustomComboBox<String>(nameFortif));
			this.fortif.get(i).setFont(new Font("Open Sans", Font.PLAIN, 12));
			this.fortif.get(i).setRenderer(new CustomListCellRenderer());
			this.fortif.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.fortif.get(i).setVisible(false);
			
			/* PEARL */
			Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(i).getQuality());
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(j).setRenderer(new CustomListCellRenderer());
					this.pearl.get(j).addActionListener(e -> {
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(j).setVisible(false);
				}
			} else {
				for(int j = 0; j < 3; j++) {
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(3*(i+1)+j).setRenderer(new CustomListCellRenderer());
					this.pearl.get(3*(i+1)+j).addActionListener(e -> {
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(3*(i+1)+j).setVisible(false);
				}
			}
			
			/* XP STUFF */
			for(int j = 0; j < 2; j++) {
				this.effectXpStuff.add(new JCustomComboBox<String>(new String[] {"Rien"}));
				this.effectXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.effectXpStuff.get(i*2+j).addActionListener(e -> {
					updateLvlXpStuff(id);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.effectXpStuff.get(i*2+j).setVisible(false);
				
				int duo = i*2+j;
				this.lvlXpStuff.add(new JCustomComboBox<String>());
				this.lvlXpStuff.get(i*2+j).setRenderer(new CustomListCellRenderer());
				this.lvlXpStuff.get(i*2+j).addActionListener(e -> {
					updateMaxLvlValue(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.lvlXpStuff.get(i*2+j).setVisible(false);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(PageGeneral.getInstance().getLvl());
		this.bullet = new JCustomComboBox<Bullet>(tabBullet);
		this.bullet.setFont(new Font("Open Sans", Font.PLAIN, 12));
		this.bullet.setRenderer(new CustomListCellRenderer());
		this.bullet.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
	}
	
	public Weapon getWeapon(int id) {
		return this.weapon.get(id).getSelectedItem();
	}
	
	public Bullet getBullet() {
		return this.bullet.getSelectedItem();
	}
	
	public Enchantment getEnchantment(int id) {
		return this.enchant.get(id).getSelectedItem();
	}

	public String getFortif(int id) {
		return this.fortif.get(id).getSelectedItem();
	}

	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}

	public String getEffectXpStuff(int id) {
		return this.effectXpStuff.get(id).getSelectedItem();
	}

	public String getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
	}

	@Override
	protected void setEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>();
		
		Weapon[] weapons = new Weapon[3];
		for(int i = 0; i < weapons.length; i++) {
			weapons[i] = new Weapon(this.getWeapon(i));
			weapons[i].addEnchant(this.getEnchantment(i));
			weapons[i].addFortif(this.fortif.get(i).getSelectedIndex());
		}
		
		if(!weapons[0].getName().equals("Rien") && !weapons[1].getName().equals("Rien")) {
			weapons[0].doubleWeapon();
			weapons[1].doubleWeapon();
		}
		
		for(int i = 0; i < weapons.length; i++) {
			list.addAll(weapons[i].getEffects());
		}
		
		for(int i = 0; i < 6; i++) {
			if(!this.lvlXpStuff.get(i).isVisible() || this.effectXpStuff.get(i).getSelectedIndex() == 0) {
				continue;
			}
			
			TypeEffect type = TypeEffect.valueOf(this.getEffectXpStuff(i).toString());
			int idListXp = weapons[i/2].getType().index;
			double valueXpStuff = XpStuff.getDataWeapon()[idListXp][this.effectXpStuff.get(i).getSelectedIndex()-1].getValueFromLvl(this.lvlXpStuff.get(i).getSelectedIndex());
			
			list.add(new Effect(type, false, valueXpStuff, true, WeaponType.NONE, null));
		}
		
		for(int i = 0; i < 3; i++) {
			if(!(this.effectXpStuff.get(i*2).getSelectedIndex() == 0) && !(this.effectXpStuff.get(i*2+1).getSelectedIndex() == 0)
					&& this.effectXpStuff.get(i*2).getSelectedIndex() != this.effectXpStuff.get(i*2+1).getSelectedIndex()) {
				int lvlXpStuff = this.lvlXpStuff.get(i*2).getSelectedIndex() + this.lvlXpStuff.get(i*2+1).getSelectedIndex() +1;
				if(lvlXpStuff >= weapons[i].getLvl()) {
					list.addAll(weapons[i].getBonusXP());
				}
			}
		}
		
		list.addAll(this.getBullet().getEffects());
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = this.getPearl(i);
			if(pearl.isCumulable()) {
				list.addAll(pearl.getEffects());
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				list.addAll(pearl.getEffects());
			}
		}
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		for(int i = 0; i < 3; i++) {
			JPanel descWeapon = new JPanel();
			descWeapon.setLayout(new BoxLayout(descWeapon, BoxLayout.X_AXIS));
			descWeapon.setBackground(Consts.UIColor[1]);
			descWeapon.add(this.weapon.get(i));
			descWeapon.add(this.enchant.get(i));
			descWeapon.add(this.fortif.get(i));
			
			JPanel pearlWeapon = new JPanel();
			pearlWeapon.setLayout(new BoxLayout(pearlWeapon, BoxLayout.Y_AXIS));
			pearlWeapon.setBackground(Consts.UIColor[1]);
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					pearlWeapon.add(this.pearl.get(j));
					pearlWeapon.add(Box.createVerticalStrut(3));
				}
			} else {
				for(int j = 0; j < 3; j++) {
					pearlWeapon.add(this.pearl.get(3*(i+1)+j));
					pearlWeapon.add(Box.createVerticalStrut(3));
				}
			}
			
			JPanel xpWeapon = new JPanel(new GridLayout(1, 3, 10, 3));
			xpWeapon.setBackground(Consts.UIColor[1]);
			this.label[i+3].setFont(new Font("Open Sans", Font.PLAIN, 14));
			xpWeapon.add(this.label[i+3]);
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Consts.UIColor[1]);
				xp.add(this.effectXpStuff.get(i*2+j));
				xp.add(this.lvlXpStuff.get(i*2+j));
				xpWeapon.add(xp);
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Consts.UIColor[1]);
			elemI.add(this.label[i]);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descWeapon);
			elemI.add(Box.createVerticalStrut(5));
			elemI.add(pearlWeapon);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(xpWeapon);
			
			if(i == 1) {
				this.showAndHide = elemI;
			}
			this.showAndHideXpStuff.add(xpWeapon);	
			
			this.add(elemI);
			this.add(Box.createVerticalStrut(10));
		}
		
		JPanel elem1 = new JPanel();
		elem1.setLayout(new BoxLayout(elem1, BoxLayout.Y_AXIS));
		elem1.setBorder(new EmptyBorder(10, 10, 10, 10));
		elem1.setBackground(Consts.UIColor[1]);
		elem1.add(this.label[6]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(this.bullet);
		
		this.add(elem1);
		
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
	}

	@Override
	protected void setLabel() {
		String[] getter = Lang.getDataLabel(Language.FR, 1);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public WeaponType[] getWeaponType() {
		WeaponType[] result = new WeaponType[3];
		for(int i = 0; i < result.length; i++) {
			result[i] = this.getWeapon(i).getType();
		}
		return result;
	}
	
	public void updateWeapon() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, grade.getGrade(), lvl, reinca, null);
			Weapon memory = this.getWeapon(i);
			
			this.weapon.get(i).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
			this.weapon.get(i).setSelectedItem(memory);
			
			if(!this.getWeapon(i).equals(memory)) {
				weaponType(i);
				updateDetails(i);
				updateXpStuff(i);
				updateEnchant(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				this.pearl.get(i).setSelectedIndex(0);
				this.pearl.get(i+1).setSelectedIndex(0);
				this.pearl.get(i+2).setSelectedIndex(0);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(lvl);
		Bullet memory = this.getBullet();
		
		this.bullet.setModel(new DefaultComboBoxModel<Bullet>(tabBullet));
		this.bullet.setSelectedItem(memory);
		
	}
	
	private void updateDetails(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			this.fortif.get(id).setVisible(true);
			
			if(id == 0) {
				this.pearl.get(0).setVisible(true);
				this.pearl.get(1).setVisible(true);
				this.pearl.get(2).setVisible(true);
			}
			
			this.pearl.get(3*(id+1)).setVisible(true);
			this.pearl.get(3*(id+1)+1).setVisible(true);
			this.pearl.get(3*(id+1)+2).setVisible(true);
		} else {
			this.fortif.get(id).setVisible(false);
			
			if(id == 0) {
				for(int i = 0; i < 3; i++) {
					this.pearl.get(i).setVisible(false);
					this.pearl.get(i).setSelectedIndex(0);
				}
			}
			
			for(int i = 0; i < 3; i++) {
				this.pearl.get(3*(id+1)+i).setVisible(false);
				this.pearl.get(3*(id+1)+i).setSelectedIndex(0);
			}
			
		}
	}
	
	private void updateXpStuff(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			
			int weaponType = this.getWeapon(id).getType().index;
			String[] tmp = new String[XpStuff.getDataWeapon()[weaponType].length +1];
			tmp[0] = "Rien";
			for(int i = 0; i < tmp.length-1; i++) {
				tmp[i+1] = XpStuff.getDataWeapon()[weaponType][i].getType().name();
			}
			
			this.effectXpStuff.get(id*2).setModel(new DefaultComboBoxModel<String>(tmp));
			this.effectXpStuff.get(id*2+1).setModel(new DefaultComboBoxModel<String>(tmp));
			
			this.showAndHideXpStuff.get(id).setVisible(true);	
			this.effectXpStuff.get(id*2).setVisible(true);
			this.effectXpStuff.get(id*2+1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.effectXpStuff.get(id*2).setVisible(false);
			this.effectXpStuff.get(id*2+1).setVisible(false);
			this.effectXpStuff.get(id*2).setSelectedIndex(0);
			this.effectXpStuff.get(id*2+1).setSelectedIndex(0);
		}
	}
	
	private void updatePearl(int id) {
		Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(id).getQuality());
		
		if(id == 0) {
			for(int i = 0; i < 3; i++) {
				Pearl memory = this.getPearl(id*3+i);
				
				this.pearl.get(id*3+i).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
				this.pearl.get(id*3+i).setSelectedItem(memory);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			Pearl memory = this.getPearl(3*(id+1)+i);
			
			this.pearl.get(3*(id+1)+i).setModel(new DefaultComboBoxModel<Pearl>(tabPearl));
			this.pearl.get(3*(id+1)+i).setSelectedItem(memory);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			Weapon weapon = this.getWeapon(id);
			
			if(weapon.isEnchantable()) {
				Enchantment[] tabEnchant = Enchantment.getPossibleWeaponEnchant(weapon.getQuality(), weapon.getType());
				
				this.enchant.get(id).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
				this.enchant.get(id).setVisible(true);
			} else {
				this.enchant.get(id).setVisible(false);
			}
		} else {
			this.enchant.get(id).setVisible(false);
		}
	}
	
	private void weaponType(int id) {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		boolean reinca = PageGeneral.getInstance().getReinca() == 1;
		
		Weapon choice = this.getWeapon(id);
		if(id == 0) {
			int keepEnchant = this.enchant.get(1).getSelectedIndex();
			
			if(choice.getType() == WeaponType.EPEE2M || choice.getType() == WeaponType.MARTEAU2M || choice.getType() == WeaponType.HACHE2M
					|| choice.getType() == WeaponType.MECA2M || choice.getType() == WeaponType.BATON || choice.getType() == WeaponType.LAME) {
				Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade.getGrade(), lvl, reinca, null);
				Weapon memory = this.getWeapon(0);
				
				this.weapon.get(0).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
				this.weapon.get(0).setSelectedItem(memory);
				this.weapon.get(1).setModel(new DefaultComboBoxModel<Weapon>(new Weapon[] { new Weapon() } ));
				
				for(int i = 0; i < 3; i++) {
					this.pearl.get(3+i).setVisible(true);
					this.pearl.get(6+i).setVisible(false);
					this.pearl.get(6+i).setSelectedIndex(0);
				}
				
				this.showAndHide.setVisible(false);
			} else if(choice.getType() == WeaponType.EPEE1M || choice.getType() == WeaponType.MARTEAU1M || choice.getType() == WeaponType.HACHE1M
					|| choice.getType() == WeaponType.MECA1M) {
				Weapon[] tabWeapon = Weapon.getPossibleWeapon(1, grade.getGrade(), lvl, reinca, choice);
				Weapon memory = this.getWeapon(1);
				
				this.weapon.get(1).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
				this.weapon.get(1).setSelectedItem(memory);
				
				for(int i = 0; i < 3; i++) {
					this.pearl.get(3+i).setVisible(false);
					this.pearl.get(3+i).setSelectedIndex(0);
				}
				if(this.weapon.get(1).getSelectedIndex() == 0) {
					for(int i = 0; i < 3; i++) {
						this.pearl.get(6+i).setVisible(false);
						this.pearl.get(6+i).setSelectedIndex(0);
					}
				}
				
				this.showAndHide.setVisible(true);
			} else this.showAndHide.setVisible(true);
			
			this.enchant.get(1).setSelectedIndex(keepEnchant);
		} else if(id == 1) {
			int keepEnchant = this.enchant.get(0).getSelectedIndex();
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade.getGrade(), lvl, reinca, choice);
			Weapon memory = (Weapon) this.weapon.get(0).getSelectedItem();
			
			this.weapon.get(0).setModel(new DefaultComboBoxModel<Weapon>(tabWeapon));
			this.weapon.get(0).setSelectedItem(memory);
			
			this.enchant.get(0).setSelectedIndex(keepEnchant);
		} else if(choice.getType() == WeaponType.RELIQUE) {
			this.fortif.get(id).setVisible(false);
			this.fortif.get(id).setSelectedIndex(0);
		}
	}
	
	private void updateLvlXpStuff(int id) {
		if(this.getEffectXpStuff(id*2).toString().equals("Rien") || this.getEffectXpStuff(id*2+1).toString().equals("Rien")
				|| this.getEffectXpStuff(id*2).toString().equals(this.getEffectXpStuff(id*2+1).toString())) {
			this.lvlXpStuff.get(id*2).setVisible(false);
			this.lvlXpStuff.get(id*2+1).setVisible(false);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2), null);
			Util.setMemoryInList(this.lvlXpStuff.get(id*2+1), null);
		} else {
			WeaponType type = this.getWeapon(id).getType();
			
			String[] tmp = new String[XpStuff.getDataWeapon()[type.index][this.effectXpStuff.get(id*2).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(id*2).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, id*2, tmp);
			
			tmp = new String[XpStuff.getDataWeapon()[type.index][this.effectXpStuff.get(id*2+1).getSelectedIndex()-1].getLvlValue().size()];
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = "" + (i+1);
			}
			this.lvlXpStuff.get(id*2+1).add(new JCustomComboBox<String>(tmp));
			Util.setMemoryInList(this.lvlXpStuff, id*2+1, tmp);
			
			this.lvlXpStuff.get(id*2).setVisible(true);
			this.lvlXpStuff.get(id*2+1).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(this.effectXpStuff.get(id).getSelectedIndex() == 0
				|| this.effectXpStuff.get(indexPair).getSelectedIndex() == 0
				|| this.effectXpStuff.get(id).getSelectedIndex() == this.effectXpStuff.get(indexPair).getSelectedIndex())
			return;
		
		int currentLvl = this.lvlXpStuff.get(id).getSelectedIndex()+1;
		
		WeaponType type = this.getWeapon(id/2).getType();
		int sizePair = XpStuff.getDataWeapon()[type.index][this.effectXpStuff.get(indexPair).getSelectedIndex()-1].getLvlValue().size();
		
		String[] tmp = new String[sizePair + currentLvl > 101 ? 101 - currentLvl : sizePair];
		for(int i = 0; i < tmp.length; i++) tmp[i] = "" + (i+1);
		this.lvlXpStuff.get(indexPair).add(new JComboBox<String>(tmp));
		Util.setMemoryInList(this.lvlXpStuff, indexPair, tmp);
	}
}
