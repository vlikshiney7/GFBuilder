package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.customequip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Bullet;
import fr.vlik.grandfantasia.equip.RedWeapon;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.equipupgrade.Fortification;
import fr.vlik.grandfantasia.equipupgrade.Pearl;
import fr.vlik.grandfantasia.equipupgrade.PearlEnchantment;
import fr.vlik.grandfantasia.equipupgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipupgrade.RedFortification;
import fr.vlik.grandfantasia.equipupgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.grandfantasia.template.ProcEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCompleteBox;
import fr.vlik.uidesign.JCompleteBoxList;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JIconCheckBox;
import fr.vlik.uidesign.JLangLabel;

public class PageWeapon extends PartialRedStuff {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "WEAPON";
	private static final PageWeapon INSTANCE = new PageWeapon();
	
	private transient JCompleteBoxList<Weapon> weapon = new JCompleteBoxList<>();
	private JCompleteBox<Bullet> bullet;
	
	private transient JCustomComboBoxList<Enchantment> enchant;
	private transient JCustomComboBoxList<Fortification> fortif;
	private transient JCompleteBoxList<Pearl> pearl = new JCompleteBoxList<>();
	
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
			this.weapon.add(new JCompleteBox<>(tabWeapon, JCompleteBox.FILTER32, JCompleteBox.PROC32, 5, Weapon.getWeaponType(i, true), /*Weapon.getTags(),*/ Weapon.getQualities()));
			this.weapon.get(i).addActionListener(e -> {
				this.weapon.get(id).activeProc();
				
				updateXpStuff(id);
				updateDetails(id);
				updatePearl(id);
				updateEnchantPearl(id);
				updateEnchant(id);
				weaponType(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			
			/* PEARL */
			Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(i));
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					int idPearl = j;
					this.pearl.add(new JCompleteBox<>(tabPearl, JCompleteBox.FILTER24, JCompleteBox.PROC24, 3, /*Pearl.getTags(),*/ Pearl.getQualities()));
					this.pearl.get(j).addActionListener(e -> {
						this.pearl.get(idPearl).activeProc();
						updateEnchantPearl(id);
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
				}
			} else {
				for(int j = 0; j < 3; j++) {
					int idPearl = 3*(i+1)+j;
					this.pearl.add(new JCompleteBox<>(tabPearl, JCompleteBox.FILTER24, JCompleteBox.PROC24, 3, /*Pearl.getTags(),*/ Pearl.getQualities()));
					this.pearl.get(3*(i+1)+j).addActionListener(e -> {
						this.pearl.get(idPearl).activeProc();
						updateEnchantPearl(id);
						
						setEffects();
						MainFrame.getInstance().updateStat();
					});
				}
			}
		}
		
		this.weapon.addProcActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.pearl.setVisible(false);
		this.pearl.addProcActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.enchant = new JCustomComboBoxList<>(3);
		this.enchant.setVisible(false);
		this.enchant.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.fortif = new JCustomComboBoxList<>(3, Fortification.getData());
		this.fortif.setVisible(false);
		this.fortif.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.bullet = new JCompleteBox<>(tabBullet, JCompleteBox.FILTER32, 3, Bullet.getTags(), Bullet.getQualities());
		this.bullet.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < this.weapon.size(); i++) {
			this.weaponType[i] = this.getWeapon(i).getType();
		}
		
		this.components.addAll(this.weapon.getList());
		this.components.add(this.bullet);
		this.components.addAll(this.pearl.getList());
		
		createPanel();
		setEffects();
	}
	
	public Weapon getWeapon(int id) {
		return this.weapon.get(id).getSelectedItem();
	}
	
	public ProcEffect getProc(int id) {
		return this.weapon.get(id).getProc().getItem();
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
		CustomList<Calculable> list = new CustomList<>();
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
				RedFortification redFortif = this.getRedFortif(i);
				
				if(redFortif.getCoef() != 1) {
					((RedWeapon) weapons[i]).addFortif(this.valueFortif.get(i).getDoubleValue());
					list.addAll(((RedWeapon) weapons[i]).getStarEffects(redFortif.getStar()));
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
			}
			
			if(weapons[i].getType() == WeaponType.BOUCLIER) {
				double shieldDefP = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefP) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefP);
				double shieldDefM = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefM) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefM);
				
				weapons[i].addShieldBonus(shieldDefP, shieldDefM);
			}
			
			for(int j = 0; j < 5; j++) {
				if(this.pearlEnchant.get(i*5+j).isVisible()) {
					this.pearlEnchants.add(this.getLvlPearlEnchant(i*5+j));
				}
			}
			
			if(this.weapon.get(i).isProcActive()) {
				list.addAll(this.getProc(i).getEffects());
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
							} else if(weapons[i].getType() == WeaponType.BOUCLIER) {
								if(e.getType() == TypeEffect.DefP) {
									double shieldDefP = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefP) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefP);
									e.changeValue(shieldDefP / 100 + 1);
								} else if(e.getType() == TypeEffect.DefM) {
									double shieldDefM = PageSpeciality.getInstance().getShieldBonus(TypeEffect.ShieldDefM) + PageSkill.getInstance().getShieldBonus(TypeEffect.ShieldDefM);
									e.changeValue(shieldDefM / 100 + 1);
								}
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
		
		ArrayList<Pearl> notCombinablePearl = new ArrayList<>();
		for(int i = 0; i < this.pearl.size(); i++) {
			Pearl eachPearl = this.getPearl(i);
			
			if(eachPearl.isCumulable()) {
				list.addAll(eachPearl);
				
				if(this.pearl.get(i).isProcActive()) {
					list.addAll(this.pearl.get(i).getProc().getItem().getEffects());
				}
			} else if(!Pearl.isAlreadyCount(notCombinablePearl, eachPearl)) {
				notCombinablePearl.add(eachPearl);
				list.addAll(eachPearl);
				
				if(this.pearl.get(i).isProcActive()) {
					list.addAll(this.pearl.get(i).getProc().getItem().getEffects());
				}
			}
		}
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		for(int i = 0; i < 3; i++) {
			JCustomPanel descWeapon = new JCustomPanel(BoxLayout.X_AXIS);
			descWeapon.addAll(this.weapon.get(i).getButton(), Box.createHorizontalStrut(5), this.weapon.get(i), this.enchant.get(i), this.fortif.get(i), this.redFortif.get(i), Box.createHorizontalStrut(5), this.weapon.get(i).getProc());
			
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
					pearlWeapon.addAll(this.pearl.get(j).getButton(), this.pearl.get(j), Box.createHorizontalStrut(3), this.pearl.get(j).getProc());
					pearlsWeapon.addAll(pearlWeapon, Box.createVerticalStrut(3));
				}
			} else {
				for(int j = 0; j < 3; j++) {
					JCustomPanel pearlWeapon = new JCustomPanel(BoxLayout.X_AXIS);
					pearlWeapon.addAll(this.pearl.get(3*(i+1)+j).getButton(), this.pearl.get(3*(i+1)+j), Box.createHorizontalStrut(3), this.pearl.get(3*(i+1)+j).getProc());
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
		elem1.addAll(this.labels.get("Bullet"), Box.createVerticalStrut(10), new JCustomPanel(this.bullet.getButton(), this.bullet));
		
		this.add(elem1);
		
		initPanel();
		
		for(int i = 0; i < 3; i++) {
			this.labels.get("PearlEnchant" + i).setVisible(false);
		}
	}
	
	public void updateWeapon() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, grade, lvl, reinca, null, this.doubleWeapon);
			tabWeapon = Weapon.applyFilters(tabWeapon, this.getWeapon(i), this.weapon.get(i).getSearch(), this.weapon.get(i).getFilters(), this.weapon.get(i).isAndValue());
			
			if(!this.weapon.get(i).setItems(tabWeapon)) {
				updateXpStuff(i);
				updateDetails(i);
				updateEnchant(i);
				weaponType(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				this.redFortif.get(i).setSelectedIndex(0);
				
				this.pearl.setRangeSelectedIndex(i*3, 3, 0);
				
				MainFrame.getInstance().setRedPane(1);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(lvl, reinca);
		tabBullet = Bullet.applyFilters(tabBullet, this.getBullet(), this.bullet.getSearch(), this.bullet.getFilters(), this.bullet.isAndValue());
		
		if(!this.bullet.setItems(tabBullet)) {
			MainFrame.getInstance().setRedPane(1);
		}
	}
	
	private void updateDetails(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			if(this.getWeapon(id).getQuality() == Quality.RED) {
				this.fortif.get(id).setVisible(false);
				this.redFortif.get(id).setVisible(true);
				
				this.showAndHideRedEnchant.get(id).setVisible(this.getWeapon(id).isEnchantable());
				
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
				this.pearl.setRangeVisible(0, 3, true);
			}
			
			this.pearl.setRangeVisible(3*(id+1), 3, true);
		} else {
			this.fortif.get(id).setVisible(false);
			this.redFortif.get(id).setVisible(false);
			this.valueFortif.get(id).setVisible(false);
			this.labelValue.get(id).setVisible(false);
			
			if(id == 0) {
				this.pearl.setRangeVisible(0, 3, false);
				this.pearl.setRangeSelectedIndex(0, 3, 0);
			}
			
			this.pearl.setRangeVisible(3*(id+1), 3, false);
			this.pearl.setRangeSelectedIndex(3*(id+1), 3, 0);
		}
	}
	
	private void updateXpStuff(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			if(this.weaponType[id] != this.getWeapon(id).getType()) {
				XpStuff[] xpStuff = XpStuff.getPossibleTypeEffect(this.getWeapon(id));
				this.xpStuff.setRangeItems(id*2, 2, xpStuff);
			}
			this.showAndHideXpStuff.get(id).setVisible(true);	
			this.xpStuff.setRangeVisible(id*2, 2, true);
		} else {
			this.showAndHideXpStuff.get(id).setVisible(false);
			this.xpStuff.setRangeVisible(id*2, 2, false);
			
			if(this.getXpStuff(id*2) != null && this.getXpStuff(id*2+1) != null) {
				this.xpStuff.setRangeSelectedIndex(id*2, 2, 0);
			}
		}
		
		this.weaponType[id] = this.getWeapon(id).getType();
	}
	
	private void updatePearl(int index3) {
		if(index3 == 0) {
			for(int i = 0; i < 3; i++) {
				Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(index3));
				tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(index3*3+i), this.pearl.get(index3*3+i).getSearch(), this.pearl.get(index3*3+i).getFilters(), this.pearl.get(index3*3+i).isAndValue());
				
				this.pearl.get(index3*3+i).setItems(tabPearl);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(index3));
			tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(3*(index3+1)+i), this.pearl.get(3*(index3+1)+i).getSearch(), this.pearl.get(3*(index3+1)+i).getFilters(), this.pearl.get(3*(index3+1)+i).isAndValue());
			
			this.pearl.get(3*(index3+1)+i).setItems(tabPearl);
		}
	}
	
	private void updateEnchant(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			Weapon idWeapon = this.getWeapon(id);
			
			if(idWeapon.isEnchantable()) {
				if(idWeapon.getQuality() == Quality.RED) {
					RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(idWeapon, null, null);
					this.redEnchant.setRangeItems(id*3, 3, tabRed);
					
					RedEnchantment[] tabRefining = RedEnchantment.getPossibleRefining(idWeapon);
					this.refining.setRangeItems(id*2, 2, tabRefining);
					
					this.showAndHideRedEnchant.get(id).setVisible(true);
					this.enchant.get(id).setVisible(false);
				} else {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(idWeapon);
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
			default: break;
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
				tabWeapon = Weapon.applyFilters(tabWeapon, this.getWeapon(1), this.weapon.get(1).getSearch(), this.weapon.get(1).getFilters(), this.weapon.get(1).isAndValue());
				
				this.weapon.get(1).setItems(tabWeapon);
				
				this.pearl.setRangeVisible(3, 3, false);
				this.pearl.setRangeSelectedIndex(3, 3, 0);
				
				if(this.weapon.get(1).getSelectedIndex() == 0) {
					this.pearl.setRangeVisible(6, 3, false);
					this.pearl.setRangeSelectedIndex(6, 3, 0);
				}
				
				this.showAndHide.setVisible(true);
			} else {
				/*Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, null, this.doubleWeapon);
				tabWeapon = Weapon.applyFilters(tabWeapon, choice, this.weapon.get(0).getSearch(), this.weapon.get(0).getFilters(), this.weapon.get(0).isAndValue());
				
				this.weapon.get(0).setItems(tabWeapon);*/
				this.weapon.get(1).setItems(new Weapon[] { new Weapon() });
				
				this.pearl.setRangeVisible(3, 3, true);
				this.pearl.setRangeVisible(6, 3, false);
				this.pearl.setRangeSelectedIndex(6, 3, 0);
				
				this.showAndHide.setVisible(false);
			}
			
			this.enchant.get(1).setSelectedItem(keepEnchant);
		} else if(id == 1) {
			Enchantment keepEnchant = this.getEnchantment(0);
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, choice, this.doubleWeapon);
			tabWeapon = Weapon.applyFilters(tabWeapon, this.getWeapon(0), this.weapon.get(0).getSearch(), this.weapon.get(0).getFilters(), this.weapon.get(0).isAndValue());
			
			this.weapon.get(0).setItems(tabWeapon);
			
			this.enchant.get(0).setSelectedItem(keepEnchant);
		} else if(choice.getType() == WeaponType.RELIQUE) {
			this.fortif.get(id).setVisible(false);
			this.redFortif.get(id).setVisible(false);
			this.fortif.get(id).setSelectedIndex(0);
			this.redFortif.get(id).setSelectedIndex(0);
		}
	}
	
	protected void updateTooltipFortif(int id) {
		updateTooltipFortif(this.getWeapon(id), id);
	}
	
	protected void updateRedEnchant(int idRed) {
		updateRedEnchant(this.getWeapon(idRed/3), idRed);
	}
	
	public void popoff() {
		for(JCompleteBox<Weapon> box : this.weapon.getList()) {
			if(box.isDialogVisible()) {
				box.popoff();
				updateWeapon();
			}
		}
		
		if(this.bullet.isDialogVisible()) {
			this.bullet.popoff();
			updateWeapon();
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			if(this.pearl.get(i).isDialogVisible()) {
				this.pearl.get(i).popoff();
				
				if(i < 6) {
					Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(0));
					tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(i), this.pearl.get(i).getSearch(), this.pearl.get(i).getFilters(), this.pearl.get(i).isAndValue());
					
					this.pearl.get(i).setItems(tabPearl);
				} else {
					Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(i/3 - 1));
					tabPearl = Pearl.applyFilters(tabPearl, this.getPearl(i), this.pearl.get(i).getSearch(), this.pearl.get(i).getFilters(), this.pearl.get(i).isAndValue());
					
					this.pearl.get(i).setItems(tabPearl);
				}
			}
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		for(int i = 0; i < this.weapon.size(); i++) {
			if(this.getWeapon(i).isCustom()) {
				config.put("Weapon" + i, "Custom::" + this.getWeapon(i).getName(Language.FR) + "::" + this.getWeapon(i).getQuality() + "::" + this.getWeapon(i).getSignature());
			} else {
				config.put("Weapon" + i, this.getWeapon(i).getName(lang));
			}
			
			config.put("ProcWeapon" + i, "" + this.weapon.get(i).getProc().isSelected());
		}
		
		config.put("Bullet", this.getBullet().getName(Language.FR));
		
		for(int i = 0; i < this.enchant.size(); i++) {
			String value = this.getEnchantment(i) != null ? this.getEnchantment(i).getName(Language.FR) : "";
			config.put("Enchantment" + i, value);
		}
		
		for(int i = 0; i < this.fortif.size(); i++) {
			config.put("Fortif" + i, this.getFortif(i).getName(Language.FR));
		}
		
		for(int i = 0; i < this.pearl.size(); i++) {
			config.put("Pearl" + i, this.getPearl(i).getName(Language.FR));
			config.put("ProcPearl" + i, "" + this.pearl.get(i).getProc().isSelected());
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
			String value = this.getPearlEnchantment(i) != null ? this.getPearlEnchantment(i).getSelectorInfo(lang) : "";
			config.put("PearlEnchant" + i, value);
		}
		
		for(int i = 0; i < this.pearlLvlEnchant.size(); i++) {
			Integer value = this.getLvlPearlEnchant(i) != null ? this.getLvlPearlEnchant(i).getLvlbuff() : 0;
			config.put("PearlLvlEnchant" + i, "" + value);
		}
		
		for(int i = 0; i < this.xpStuff.size(); i++) {
			String value = this.getXpStuff(i) != null ? this.getXpStuff(i).getSelectorInfo(lang) : "";
			config.put("EffectXpStuff" + i, value);
		}
		
		for(int i = 0; i < this.lvlXpStuff.size(); i++) {
			Integer value = this.getLvlXpStuff(i) != null ? this.getLvlXpStuff(i).getLvlbuff() : 0;
			config.put("LvlXpStuff" + i, "" + value);
		}
		
		for(int i = 0; i < this.redFortif.size(); i++) {
			config.put("RedFortif" + i, this.getRedFortif(i).getName(Language.FR));
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
					Weapon weaponCustom = Weapon.getCustom(valueSplit[1], quality, valueSplit[3]);
					
					if(weaponCustom == null) {
						if(CustomWeapon.constructCustom(valueSplit[1], quality, valueSplit[3])) {
							SaveConfig.overrideCustom();
							PageWeapon.getInstance().updateWeapon();
							
							weaponCustom = Weapon.getCustom(valueSplit[1], quality, valueSplit[3]);
							this.weapon.get(i).setSelectedItem(weaponCustom);
						}
					} else {
						this.weapon.get(i).setSelectedItem(weaponCustom);
					}
				}
			} else {
				this.weapon.get(i).setSelectedItem(Weapon.get(config.get("Weapon" + i), Language.FR));
			}
			
			this.weapon.get(i).getProc().setSelected(Boolean.valueOf(config.get("ProcWeapon" + i)));
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
			this.pearl.get(i).getProc().setSelected(Boolean.valueOf(config.get("ProcPearl" + i)));
		}
		
		for(int i = 0; i < this.starPearl.size(); i++) {
			ArrayList<JIconCheckBox> buttons = this.starPearl.get(i);
			int select = Integer.parseInt(config.get("StarPearl" + i));
			
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
		
		for(int i = 0; i < this.weapon.size(); i++) {
			updateEnchant(i);
		}
	}
}
