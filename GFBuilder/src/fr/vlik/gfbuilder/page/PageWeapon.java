package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customEquip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Bullet;
import fr.vlik.grandfantasia.equip.RedWeapon;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.grandfantasia.equipUpgrade.Fortification;
import fr.vlik.grandfantasia.equipUpgrade.Pearl;
import fr.vlik.grandfantasia.equipUpgrade.PearlEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.grandfantasia.template.ProcEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomCheckBox;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageWeapon extends PartialRedStuff {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "WEAPON";
	private static PageWeapon INSTANCE = new PageWeapon();
	
	private ArrayList<JCustomComboBox<Weapon>> weapon = new ArrayList<JCustomComboBox<Weapon>>(3);
	private JCustomComboBox<Bullet> bullet;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	private ArrayList<JCustomComboBox<Fortification>> fortif = new ArrayList<JCustomComboBox<Fortification>>(3);
	private ArrayList<JCustomComboBox<Pearl>> pearl = new ArrayList<JCustomComboBox<Pearl>>(12);
	
	private ArrayList<JCustomCheckBox<ProcEffect>> proc = new ArrayList<JCustomCheckBox<ProcEffect>>(15);
	
	private WeaponType[] weaponType = new WeaponType[3];
	private boolean doubleWeapon = false;
	
	private JPanel showAndHide;
	
	public static PageWeapon getInstance() {
		return INSTANCE;
	}

	public PageWeapon() {
		super(BoxLayout.Y_AXIS, 3);
		
		for(int i = 0; i < 3; i++) {
			int id = i;
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, PageGeneral.getInstance().getGrade(), PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca(), null, false);
			this.weapon.add(new JCustomComboBox<Weapon>(tabWeapon));
			this.weapon.get(i).addActionListener(e -> {
				activeProc(id);
				
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
			this.enchant.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.enchant.get(i).setVisible(false);
			
			/* FORTIF */
			this.fortif.add(new JCustomComboBox<Fortification>(Fortification.getData()));
			this.fortif.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.fortif.get(i).setVisible(false);
			
			/* PROC */
			this.proc.add(new JCustomCheckBox<ProcEffect>(new ProcEffect(this.getWeapon(i))));
			this.proc.get(i).setIconUI("procOn32", "procOff32");
			this.proc.get(i).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* PEARL */
			Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(i));
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					int idPearl = j+3;
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(j).addActionListener(e -> {
						activeProc(idPearl);
						updateEnchantPearl(id);
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(j).setVisible(false);
				}
			} else {
				for(int j = 0; j < 3; j++) {
					int idPearl = 3*(i+1)+j+3;
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(3*(i+1)+j).addActionListener(e -> {
						activeProc(idPearl);
						updateEnchantPearl(id);
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(3*(i+1)+j).setVisible(false);
				}
			}
		}
		
		for(int i = 0; i < 12; i++) {
			/* PROC */
			this.proc.add(new JCustomCheckBox<ProcEffect>(new ProcEffect(this.getPearl(i))));
			this.proc.get(i+3).setIconUI("procOn24", "procOff24");
			this.proc.get(i+3).addActionListener(e -> {
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.bullet = new JCustomComboBox<Bullet>(tabBullet);
		this.bullet.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < this.weapon.size(); i++) {
			this.weaponType[i] = this.getWeapon(i).getType();
		}
		
		updateLanguage(Language.FR);
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
	
	public Fortification getFortif(int id) {
		return this.fortif.get(id).getSelectedItem();
	}
	
	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}
	
	public WeaponType[] getWeaponType() {
		return this.weaponType;
	}
	
	public boolean isDoubleWeapon() {
		return this.doubleWeapon;
	}
	
	public void applyDoubleWeapon(boolean doubleWeapon) {
		this.doubleWeapon = doubleWeapon;
		updateWeapon();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Bullet", new JLangLabel(Bullet.CLASS_NAME, Design.TITLE));
		for(int i = 0; i < 3; i++) {
			this.labels.put("PearlEnchant" + i, new JLangLabel(PearlEnchantment.CLASS_NAME, Design.SUBTITLE));
			this.labels.put("Refining" + i, new JLangLabel(RedEnchantment.SUB_CLASS_NAME, Design.SUBTITLE));
		}
		
		this.labels.put("Weapon0", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme principale"); put(Language.EN, "Primary weapon"); }}, Design.TITLE));
		this.labels.put("Weapon1", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme secondaire"); put(Language.EN, "Secondary weapon"); }}, Design.TITLE));
		this.labels.put("Weapon2", new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "Arme tertiaire"); put(Language.EN, "Tertiary weapon"); }}, Design.TITLE));
		for(int i = 0; i < 3; i++) {
			this.labels.put("WeaponXP" + i, new JLangLabel(new HashMap<Language, String>() {{ put(Language.FR, "XP Arme"); put(Language.EN, "Weapon Exp"); }}, Design.SUBTITLE));
		}
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		this.redEnchants.clear();
		this.pearlEnchants.clear();
		
		Weapon[] weapons = new Weapon[3];
		
		for(int i = 0; i < weapons.length; i++) {
			if(this.getWeapon(i).getQuality() == Quality.RED) {
				weapons[i] = new RedWeapon((RedWeapon) this.getWeapon(i));
			} else {
				weapons[i] = new Weapon(this.getWeapon(i));
			}
			
			if(weapons[i] instanceof RedWeapon) {
				RedFortification fortif = this.getRedFortif(i);
				
				if(fortif.getCoef() != 1) {
					((RedWeapon) weapons[i]).addFortif(this.valueFortif.get(i).getDoubleValue());
					list.addAll(((RedWeapon) weapons[i]).getStarEffects(fortif.getStar()));
				}
				
				if(this.showAndHideRedEnchant.get(i).isVisible()) {
					for(int j = 0; j < 3; j++) {
						if(this.redEnchant.get(i*3+j).getSelectedIndex() != 0) {
							RedEnchantment red = this.getRedEnchantment(i*3+j);
							
							if(red != null) {
								this.redEnchants.add(this.getRedLvlEnchant(i*3+j));
							}
						}
					}
					
					for(int j = 0; j < 2; j++) {
						if(this.refining.get(i*2+j).getSelectedIndex() != 0) {
							RedEnchantment refining = this.getRefining(i*2+j);
							
							if(refining != null) {
								list.addAll(this.getRefiningLvl(i*2+j));
							}
						}
					}
				}
			} else {
				weapons[i].addEnchant(this.getEnchantment(i));
				weapons[i].addFortif(this.getFortif(i));
				
				if(weapons[i].getType() == WeaponType.BOUCLIER) {
					double shieldDefP = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefP) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefP);
					double shieldDefM = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefM) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefM);
					
					weapons[i].addShieldBonus(shieldDefP, shieldDefM);
				}
			}
			
			for(int j = 0; j < 5; j++) {
				if(this.pearlEnchant.get(i*5+j).isVisible()) {
					this.pearlEnchants.add(this.getLvlPearlEnchant(i*5+j));
				}
			}
		}
		
		boolean duoWeapon = false;
		
		if(this.weaponType[0].isMainOneHand && this.weaponType[1].isMainOneHand) {
			duoWeapon = true;
			
			weapons[0].doubleWeapon();
			weapons[1].doubleWeapon();
		}
		
		for(int i = 0; i < weapons.length; i++) {
			list.addAll(weapons[i]);
		}
		
		for(int i = 0; i < 3; i++) {
			if(XpStuff.availableEffects(this.getXpStuff(i*2), this.getXpStuff(i*2+1))) {
				for(int j = 0; j < 2; j++) {
					for(Calculable effect : this.getLvlXpStuff(i*2+j).getEffects()) {
						if(effect instanceof Effect) {
							Effect e = (Effect) effect;
							
							if(duoWeapon && (e.getType() == TypeEffect.Atk || e.getType() == TypeEffect.AtkD || e.getType() == TypeEffect.AtkM)) {
								e.changeValue(0.75);
							}
							
							list.add(e);
						} else {
							list.add(effect);
						}
					}
				}
				
				int lvlXpStuff = this.getLvlXpStuff(i*2).getLvlbuff() + this.getLvlXpStuff(i*2+1).getLvlbuff();
				
				if(lvlXpStuff >= weapons[i].getLvl()) {
					list.addAll(weapons[i].getBonusXP());
				}
			}
		}
		
		list.addAll(this.getBullet());
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<Pearl>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl pearl = this.getPearl(i);
			
			if(pearl.isCumulable()) {
				list.addAll(pearl);
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, pearl)) {
				notCombinablePearl.add(pearl);
				list.addAll(pearl);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			if(this.proc.get(i).isVisible() && this.proc.get(i).isSelected()) {
				list.addAll(this.proc.get(i).getItem().getEffects());
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		for(int i = 0; i < 3; i++) {
			JCustomPanel descWeapon = new JCustomPanel(BoxLayout.X_AXIS);
			descWeapon.addAll(this.weapon.get(i), this.enchant.get(i), this.fortif.get(i), this.redFortif.get(i), Box.createHorizontalStrut(5), this.proc.get(i));
			
			JCustomPanel redEnchantWeapon = new JCustomPanel(new GridLayout(3, 2, 2, 5));
			for(int j = 0; j < 3; j++) {
				redEnchantWeapon.addAll(this.redEnchant.get(i*3+j), this.redLvlEnchant.get(i*3+j));
			}
			
			JCustomPanel refiningWeapon = new JCustomPanel(new GridLayout(2, 2, 2, 5));
			for(int j = 0; j < 2; j++) {
				refiningWeapon.addAll(this.refining.get(i*2+j), this.refiningLvl.get(i*2+j));
			}
			
			JCustomPanel enchantWeapon = new JCustomPanel(BoxLayout.Y_AXIS);
			enchantWeapon.addAll(redEnchantWeapon, this.labels.get("Refining" + i), refiningWeapon);
			
			JCustomPanel fortifWeapon = new JCustomPanel(BoxLayout.X_AXIS);
			fortifWeapon.addAll(this.valueFortif.get(i), Box.createHorizontalStrut(5), this.labelValue.get(i));
			
			JCustomPanel pearlsWeapon = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(0, 0, 0, 0));
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					JCustomPanel pearlWeapon = new JCustomPanel(BoxLayout.X_AXIS);
					pearlWeapon.addAll(this.pearl.get(j), Box.createHorizontalStrut(3), this.proc.get(j+3));
					pearlsWeapon.addAll(pearlWeapon, Box.createVerticalStrut(3));
				}
			} else {
				for(int j = 0; j < 3; j++) {
					JCustomPanel pearlWeapon = new JCustomPanel(BoxLayout.X_AXIS);
					pearlWeapon.addAll(this.pearl.get(3*(i+1)+j), Box.createHorizontalStrut(3), this.proc.get(3*(i+1)+j+3));
					pearlsWeapon.addAll(pearlWeapon, Box.createVerticalStrut(3));
				}
			}
			
			JCustomPanel starPanel = new JCustomPanel(this.labels.get("PearlEnchant" + i), Box.createHorizontalStrut(10));
			starPanel.addAll(this.starPearl.get(i));
			
			JCustomPanel listEnchant = new JCustomPanel(new GridLayout(5, 2, 2, 5));
			for(int j = 0; j < 5; j++) {
				listEnchant.addAll(this.pearlEnchant.get(i*5+j), this.pearlLvlEnchant.get(i*5+j));
			}
			
			JCustomPanel xpWeapon = new JCustomPanel(new GridLayout(1, 3, 10, 3));
			xpWeapon.add(this.labels.get("WeaponXP" + i));
			
			for(int j = 0; j < 2; j++) {
				JCustomPanel xp = new JCustomPanel(new GridLayout(1, 2, 5, 3));
				xp.addAll(this.xpStuff.get(i*2+j), this.lvlXpStuff.get(i*2+j));
				xpWeapon.add(xp);
			}
			
			JCustomPanel elemI = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
			elemI.addAll(this.labels.get("Weapon" + i), Box.createVerticalStrut(10), descWeapon, Box.createVerticalStrut(2),
					enchantWeapon, Box.createVerticalStrut(2), fortifWeapon, Box.createVerticalStrut(5),
					pearlsWeapon, Box.createVerticalStrut(3), starPanel, listEnchant, Box.createVerticalStrut(2),
					xpWeapon);
			
			if(i == 1) {
				this.showAndHide = elemI;
			}
			this.showAndHideEnchant.add(listEnchant);
			this.showAndHideRedEnchant.add(enchantWeapon);
			this.showAndHideXpStuff.add(xpWeapon);	
			
			this.addAll(elemI, Box.createVerticalStrut(10));
		}
		
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.addAll(this.labels.get("Bullet"), Box.createVerticalStrut(10), this.bullet);
		
		this.add(elem1);
		
		initPanel();
		
		for(int i = 0; i < 15; i++) {
			this.proc.get(i).setVisible(false);
		}
		
		for(int i = 0; i < 3; i++) {
			this.labels.get("PearlEnchant" + i).setVisible(false);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(Entry<String, JLangLabel> entry : this.labels.entrySet()) {
			entry.getValue().updateText(lang);
		}
	}
	
	public void updateWeapon() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, grade, lvl, reinca, null, this.doubleWeapon);
			
			if(!this.weapon.get(i).setItems(tabWeapon)) {
				updateXpStuff(i);
				updateDetails(i);
				updateEnchant(i);
				weaponType(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				this.redFortif.get(i).setSelectedIndex(0);
				this.pearl.get(i*3).setSelectedIndex(0);
				this.pearl.get(i*3+1).setSelectedIndex(0);
				this.pearl.get(i*3+2).setSelectedIndex(0);
				
				MainFrame.getInstance().setRedPane(1);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(lvl, reinca);
		
		if(!this.bullet.setItems(tabBullet)) {
			MainFrame.getInstance().setRedPane(1);
		}
	}
	
	private void updateDetails(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			if(this.getWeapon(id).getQuality() == Quality.RED) {
				this.fortif.get(id).setVisible(false);
				this.redFortif.get(id).setVisible(true);
				
				if(this.getWeapon(id).isEnchantable()) {
					this.showAndHideRedEnchant.get(id).setVisible(true);
				} else {
					this.showAndHideRedEnchant.get(id).setVisible(false);
				}
				
				if(this.redFortif.get(id).getSelectedIndex() != 0) {
					this.valueFortif.get(id).setVisible(true);
					this.labelValue.get(id).setVisible(true);
				} else {
					this.valueFortif.get(id).setVisible(false);
					this.labelValue.get(id).setVisible(false);
				}
			} else {
				this.fortif.get(id).setVisible(true);
				this.redFortif.get(id).setVisible(false);
				this.valueFortif.get(id).setVisible(false);
				this.labelValue.get(id).setVisible(false);
				
				this.showAndHideRedEnchant.get(id).setVisible(false);
			}
			
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
			this.redFortif.get(id).setVisible(false);
			this.valueFortif.get(id).setVisible(false);
			this.labelValue.get(id).setVisible(false);
			
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
			if(this.weaponType[id] != this.getWeapon(id).getType()) {
				XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getWeapon(id));
				this.xpStuff.get(id*2).setItems(xpStuff);
				this.xpStuff.get(id*2+1).setItems(xpStuff);
			}
			this.showAndHideXpStuff.get(id).setVisible(true);	
			this.xpStuff.get(id*2).setVisible(true);
			this.xpStuff.get(id*2+1).setVisible(true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.xpStuff.get(id*2).setVisible(false);
			this.xpStuff.get(id*2+1).setVisible(false);
			
			if(this.getXpStuff(id*2) != null && this.getXpStuff(id*2+1) != null) {
				this.xpStuff.get(id*2).setSelectedIndex(0);
				this.xpStuff.get(id*2+1).setSelectedIndex(0);
			}
		}
		
		this.weaponType[id] = this.getWeapon(id).getType();
	}
	
	private void updatePearl(int id) {
		Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(id));
		
		if(id == 0) {
			for(int i = 0; i < 6; i++) {
				this.pearl.get(id*3+i).setItems(tabPearl);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			this.pearl.get(3*(id+1)+i).setItems(tabPearl);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			Weapon weapon = this.getWeapon(id);
			
			if(weapon.isEnchantable()) {
				if(weapon.getQuality() == Quality.RED) {
					RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(weapon, null, null);
					for(int i = 0; i < 3; i++) {
						this.redEnchant.get(id*3+i).setItems(tabRed);
					}
					
					RedEnchantment[] tabRefining = RedEnchantment.getPossibleRefining(weapon);
					for(int i = 0; i < 2; i++) {
						this.refining.get(id*2+i).setItems(tabRefining);
					}
					
					this.showAndHideRedEnchant.get(id).setVisible(true);
					this.enchant.get(id).setVisible(false);
				} else {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(weapon);
					this.enchant.get(id).setItems(tabEnchant);
					
					this.enchant.get(id).setVisible(true);
					this.showAndHideRedEnchant.get(id).setVisible(false);
				}
			} else {
				this.enchant.get(id).setVisible(false);
				this.showAndHideRedEnchant.get(id).setVisible(false);
			}
		} else {
			this.enchant.get(id).setVisible(false);
			this.showAndHideRedEnchant.get(id).setVisible(false);
		}
	}
	
	private void updateEnchantPearl(int id) {
		boolean showStar = false;
		
		switch (id) {
			case 0:
				for(int i = 0; i < 6; i++) {
					if(this.pearl.get(i).isVisible() && this.pearl.get(i).getSelectedIndex() > 0) {
						showStar = true;
						break;
					}
				}
				break;
			case 1:
				for(int i = 6; i < 9; i++) {
					if(this.pearl.get(i).isVisible() && this.pearl.get(i).getSelectedIndex() > 0) {
						showStar = true;
						break;
					}
				}
				break;
			case 2:
				for(int i = 9; i < 12; i++) {
					if(this.pearl.get(i).isVisible() && this.pearl.get(i).getSelectedIndex() > 0) {
						showStar = true;
						break;
					}
				}
				break;
		}
		
		updateEnchantPearl(showStar, id);
	}
	
	private void weaponType(int id) {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		Weapon choice = this.getWeapon(id);
		if(id == 0) {
			Enchantment keepEnchant = this.getEnchantment(1);
			
			if(choice.getType().isMainOneHand || choice.getType() == WeaponType.NONE) {
				Weapon[] tabWeapon = Weapon.getPossibleWeapon(1, grade, lvl, reinca, choice, this.doubleWeapon);
				this.weapon.get(1).setItems(tabWeapon);
				
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
			} else {
				Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, null, this.doubleWeapon);
				this.weapon.get(0).setItems(tabWeapon);
				this.weapon.get(1).setItems(new Weapon[] { new Weapon() });
				
				for(int i = 0; i < 3; i++) {
					this.pearl.get(3+i).setVisible(true);
					this.pearl.get(6+i).setVisible(false);
					this.pearl.get(6+i).setSelectedIndex(0);
				}
				
				this.showAndHide.setVisible(false);
			}
			
			this.enchant.get(1).setSelectedItem(keepEnchant);
		} else if(id == 1) {
			Enchantment keepEnchant = this.getEnchantment(0);
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, choice, this.doubleWeapon);
			this.weapon.get(0).setItems(tabWeapon);
			
			this.enchant.get(0).setSelectedItem(keepEnchant);
		} else if(choice.getType() == WeaponType.RELIQUE) {
			this.fortif.get(id).setVisible(false);
			this.redFortif.get(id).setVisible(false);
			this.fortif.get(id).setSelectedIndex(0);
			this.redFortif.get(id).setSelectedIndex(0);
		}
	}
	
	private void activeProc(int index15) {
		ProcEffect proc = new ProcEffect(index15 < 3 ? this.getWeapon(index15) : this.getPearl(index15-3));
		
		if(proc.getEffects().length > 0) {
			this.proc.get(index15).setItem(proc);
			this.proc.get(index15).setVisible(true);
		} else {
			this.proc.get(index15).setVisible(false);
		}
		
		this.proc.get(index15).setSelected(false);
	}
	
	protected void updateTooltipFortif(int id) {
		updateTooltipFortif(this.getWeapon(id), id);
	}
	
	protected void updateRedEnchant(int idRed) {
		updateRedEnchant(this.getWeapon(idRed/3), idRed);
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new HashMap<String, String>();
		
		for(int i = 0; i < this.weapon.size(); i++) {
			if(this.getWeapon(i).isCustom()) {
				config.put("Weapon" + i, "Custom::" + this.getWeapon(i).getName(Language.FR) + "::" + this.getWeapon(i).getQuality() + "::" + this.getWeapon(i).getSignature());
			} else {
				config.put("Weapon" + i, this.getWeapon(i).getName(lang));
			}
		}
		
		config.put("Bullet", this.getBullet().getName(Language.FR));
		
		for(int i = 0; i < this.enchant.size(); i++) {
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName(Language.FR) : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			config.put("Fortif" + i, this.getFortif(i).getName());
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			config.put("Pearl" + i, this.getPearl(i).getName(Language.FR));
		}
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = 3;
			
			while(select > 0) {
				if(buttons.get(select).isSelected()) {
					break;
				}
				
				select--;
			}
			
			config.put("StarPearl" + i, "" + select);
		}
		
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			String value = this.getPearlEnchantment(i) != null ? this.getPearlEnchantment(i).getInfo(lang) : "";
			config.put("PearlEnchant" + i, value);
		}
		
		for(int i = 0; i < this.pearlLvlEnchant.size(); i++) {
			Integer value = this.getLvlPearlEnchant(i) != null ? this.getLvlPearlEnchant(i).getLvlbuff() : 0;
			config.put("PearlLvlEnchant" + i, "" + value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			config.put("RedFortif" + i, this.getRedFortif(i).getName());
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			String value = this.getRedEnchantment(i) != null ? this.getRedEnchantment(i).getName(Language.FR) : "";
			config.put("RedEnchantment" + i, value);
		}
		
		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			Integer value = this.getRedLvlEnchant(i) != null ? this.getRedLvlEnchant(i).getLvlbuff() : 0;
			config.put("RedLvlEnchantment" + i, "" + value);
		}
		
		for(int i = 0; i < this.refining.size(); i++) {
			String value = this.getRefining(i) != null ? this.getRefining(i).getName(Language.FR) : "";
			config.put("Refining" + i, value);
		}
		
		for(int i = 0; i < this.refiningLvl.size(); i++) {
			Integer value = this.getRefiningLvl(i) != null ? this.getRefiningLvl(i).getLvlbuff() : 0;
			config.put("RefiningLvl" + i, "" + value);
		}
		
		for(int i = 0; i < this.valueFortif.size(); i++) {
			config.put("ValueFortif" + i, "" + this.valueFortif.get(i).getValue());
		}
		
		for(int i = 0; i < this.proc.size(); i++) {
			config.put("Proc" + i, "" + this.proc.get(i).isSelected());
		}
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		for(int i = 0; i < this.weapon.size(); i++) {
			if(config.get("Weapon" + i) != null && config.get("Weapon" + i).startsWith("Custom")) {
				String[] valueSplit = config.get("Weapon" + i).split("::");
				
				Quality quality = null;
				try {
					quality = Quality.valueOf(valueSplit[2]);
				} catch (Exception e) {
					this.weapon.get(i).setSelectedIndex(0);
				}
				
				if(quality != null) {
					Weapon weapon = Weapon.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(weapon == null) {
						if(CustomWeapon.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageWeapon.getInstance().updateWeapon();
							
							weapon = Weapon.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.weapon.get(i).setSelectedItem(weapon);
						}
					} else {
						this.weapon.get(i).setSelectedItem(weapon);
					}
				}
			} else {
				this.weapon.get(i).setSelectedItem(Weapon.get(config.get("Weapon" + i), Language.FR));
			}
		}
		
		this.bullet.setSelectedItem(Bullet.get(config.get("Bullet")));
		
		for(int i = 0; i < this.enchant.size(); i++) {
			this.enchant.get(i).setSelectedItem(Enchantment.get(this.getWeapon(i), config.get("Enchantment" + i)));
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			this.fortif.get(i).setSelectedItem(Fortification.get(config.get("Fortif" + i)));
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			this.pearl.get(i).setSelectedItem(Pearl.getWeapon(config.get("Pearl" + i)));
		}
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = Integer.valueOf(config.get("StarPearl" + i));
			
			for(int j = 0; j < buttons.size(); j++) {
				if(j == select) {
					buttons.get(j).setSelected(true);
					updateStarPearl(i, j);
					setEffects();
				} else {
					buttons.get(j).setSelected(false);
				}
			}
		}
		for(int i = 0; i < this.pearlEnchant.size(); i++) {
			this.pearlEnchant.get(i).setSelectedItem(PearlEnchantment.get(config.get("PearlEnchant" + i)));
			
			PearlEnchantment pearlEnchant = this.getPearlEnchantment(i);
			
			if(pearlEnchant != null) {
				InnerEffect inner = pearlEnchant.getInnerEffect(Integer.valueOf(config.get("PearlLvlEnchant" + i)));
				this.pearlLvlEnchant.get(i).setSelectedItem(inner);
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			if(this.lvlXpStuff.get(i).getItemCount() > 0) {
				this.lvlXpStuff.get(i).setSelectedIndex(0);
			}
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			if(this.getWeapon(i/2).getType() != WeaponType.NONE) {
				XpStuff xpStuff = XpStuff.get(this.getWeapon(i/2), config.get("EffectXpStuff" + i));
				
				this.xpStuff.get(i).setSelectedItem(xpStuff);
			}
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			XpStuff xpStuff = this.getXpStuff(i);
			
			if(xpStuff != null) {
				InnerEffect inner = xpStuff.getInnerEffect(Integer.valueOf(config.get("LvlXpStuff" + i)));
				this.lvlXpStuff.get(i).setSelectedItem(inner);
			}
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			if(this.getWeapon(i).getQuality() == Quality.RED) {
				this.redFortif.get(i).setSelectedItem(RedFortification.get(config.get("RedFortif" + i)));
			}
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			if(this.getWeapon(i/3).getQuality() == Quality.RED) {
				this.redEnchant.get(i).setSelectedItem(Enchantment.get(this.getWeapon(i/3), config.get("RedEnchantment" + i)));
				
				RedEnchantment redEnchant = this.getRedEnchantment(i);
				
				if(redEnchant != null) {
					InnerEffect inner = redEnchant.getInnerEffect(Integer.valueOf(config.get("RedLvlEnchantment" + i)));
					this.redLvlEnchant.get(i).setSelectedItem(inner);
				}
			}
		}
		
		for(int i = 0; i < this.refining.size(); i++) {
			if(this.getWeapon(i/3).getQuality() == Quality.RED) {
				this.refining.get(i).setSelectedItem(Enchantment.get(this.getWeapon(i/3), config.get("Refining" + i)));
				
				RedEnchantment refining = this.getRefining(i);
				
				if(refining != null) {
					InnerEffect inner = refining.getInnerEffect(Integer.valueOf(config.get("RefiningLvl" + i)));
					this.refiningLvl.get(i).setSelectedItem(inner);
				}
			}
		}
		
		for(int i = 0; i < this.valueFortif.size(); i++) {
			if(this.getWeapon(i).getQuality() == Quality.RED) {
				this.valueFortif.get(i).setValue(Integer.valueOf(config.get("ValueFortif" + i)));
			}
		}
		
		for(int i = 0; i < this.proc.size(); i++) {
			this.proc.get(i).setSelected(Boolean.valueOf(config.get("Proc" + i)));
		}
		
		for(int i = 0; i < this.weapon.size(); i++) {
			updateEnchant(i);
		}
	}
}
