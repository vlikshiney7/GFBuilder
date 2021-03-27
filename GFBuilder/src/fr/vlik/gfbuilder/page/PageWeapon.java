package fr.vlik.gfbuilder.page;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
import fr.vlik.grandfantasia.equipUpgrade.RedEnchantment;
import fr.vlik.grandfantasia.equipUpgrade.RedFortification;
import fr.vlik.grandfantasia.equipUpgrade.XpStuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.InnerEffect;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomSlider;
import fr.vlik.uidesign.JLangLabel;

public class PageWeapon extends PagePanel implements ConvertEffect {

	private static final long serialVersionUID = 1L;
	private static final int NUM_PAGE = MainFrame.getNumPage();
	private static final String SAVE_NAME = "WEAPON";
	private static PageWeapon INSTANCE = new PageWeapon();
	
	private ArrayList<JCustomComboBox<Weapon>> weapon = new ArrayList<JCustomComboBox<Weapon>>(3);
	private JCustomComboBox<Bullet> bullet;
	
	private ArrayList<JCustomComboBox<Enchantment>> enchant = new ArrayList<JCustomComboBox<Enchantment>>(3);
	private ArrayList<JCustomComboBox<Fortification>> fortif = new ArrayList<JCustomComboBox<Fortification>>(3);
	private ArrayList<JCustomComboBox<Pearl>> pearl = new ArrayList<JCustomComboBox<Pearl>>(12);
	private ArrayList<JCustomComboBox<XpStuff>> xpStuff = new ArrayList<JCustomComboBox<XpStuff>>(6);
	private ArrayList<JCustomComboBox<InnerEffect>> lvlXpStuff = new ArrayList<JCustomComboBox<InnerEffect>>(6);
	
	private ArrayList<JCustomComboBox<RedFortification>> redFortif = new ArrayList<JCustomComboBox<RedFortification>>(3);
	private ArrayList<JCustomComboBox<RedEnchantment>> redEnchant = new ArrayList<JCustomComboBox<RedEnchantment>>(9);
	private ArrayList<JCustomComboBox<InnerEffect>> redLvlEnchant = new ArrayList<JCustomComboBox<InnerEffect>>(9);
	private ArrayList<JCustomSlider> valueFortif = new ArrayList<JCustomSlider>(3);
	private ArrayList<JLangLabel> labelValue = new ArrayList<JLangLabel>(3);
	
	private WeaponType[] weaponType = new WeaponType[3];
	private boolean doubleWeapon = false;
	
	private JPanel showAndHide;
	private ArrayList<JPanel> showAndHideXpStuff = new ArrayList<JPanel>(3);
	
	private ArrayList<Calculable> convertEffects;
	
	public static PageWeapon getInstance() {
		return INSTANCE;
	}

	public PageWeapon() {
		super(NUM_PAGE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabelAPI();
		
		for(int i = 0; i < 3; i++) {
			int id = i;
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, PageGeneral.getInstance().getGrade(), PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca(), null, false);
			this.weapon.add(new JCustomComboBox<Weapon>(tabWeapon));
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
			
			/* RED FORTIF */
			this.redFortif.add(new JCustomComboBox<RedFortification>(RedFortification.getData()));
			this.redFortif.get(i).addActionListener(e -> {
				updateValueFortif(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.redFortif.get(i).setVisible(false);
			
			/* RED ENCHANT */
			for(int j = 0; j < 3; j++) {
				int idRed = i*3+j;
				this.redEnchant.add(new JCustomComboBox<RedEnchantment>());
				this.redEnchant.get(i*3+j).addActionListener(e -> {
					updateRedLvlEnchant(idRed);
					updateRedEnchant(idRed);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.redEnchant.get(i*3+j).setVisible(false);
				
				this.redLvlEnchant.add(new JCustomComboBox<InnerEffect>());
				this.redLvlEnchant.get(i*3+j).addActionListener(e -> {
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.redLvlEnchant.get(i*3+j).setVisible(false);
			}
			
			/* VALUE FORTIF */
			this.valueFortif.add(new JCustomSlider(0.0, 1.0, 0.1));
			this.valueFortif.get(i).addChangeListener(e -> {
				updateTooltipFortif(id);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
			this.valueFortif.get(i).setVisible(false);
			
			this.labelValue.add(new JLangLabel());
			this.labelValue.get(i).setVisible(false);
			
			/* PEARL */
			Pearl[] tabPearl = Pearl.getPossibleWeaponPearl(this.getWeapon(i));
			
			if(i == 0) {
				for(int j = 0; j < 6; j++) {
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(j).addActionListener(e -> {
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(j).setVisible(false);
				}
			} else {
				for(int j = 0; j < 3; j++) {
					this.pearl.add(new JCustomComboBox<Pearl>(tabPearl));
					this.pearl.get(3*(i+1)+j).addActionListener(e -> {
						setEffects();
						MainFrame.getInstance().updateStat();
					});
					this.pearl.get(3*(i+1)+j).setVisible(false);
				}
			}
			
			/* XP STUFF */
			for(int j = 0; j < 2; j++) {
				int duo = i*2+j;
				
				this.xpStuff.add(new JCustomComboBox<XpStuff>());
				this.xpStuff.get(duo).addActionListener(e -> {
					updateLvlXpStuff(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.xpStuff.get(duo).setVisible(false);
				
				this.lvlXpStuff.add(new JCustomComboBox<InnerEffect>());
				this.lvlXpStuff.get(duo).addActionListener(e -> {
					updateMaxLvlValue(duo);
					
					setEffects();
					MainFrame.getInstance().updateStat();
				});
				this.lvlXpStuff.get(duo).setVisible(false);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca());
		this.bullet = new JCustomComboBox<Bullet>(tabBullet);
		this.bullet.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		for(int i = 0; i < this.weapon.size(); i++) {
			weaponType[i] = this.getWeapon(i).getType();
		}
		
		updateLanguage(Language.FR);
		createPanel();
		setEffects();
	}
	
	@Override
	public ArrayList<Calculable> getConvertEffects() {
		return this.convertEffects;
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
	
	public RedEnchantment getRedEnchantment(int id) {
		return this.redEnchant.get(id).getSelectedItem();
	}
	
	public RedFortification getRedFortif(int id) {
		return this.redFortif.get(id).getSelectedItem();
	}
	
	public InnerEffect getRedLvlEnchant(int id) {
		return this.redLvlEnchant.get(id).getSelectedItem();
	}

	public Pearl getPearl(int id) {
		return this.pearl.get(id).getSelectedItem();
	}

	public XpStuff getXpStuff(int id) {
		return this.xpStuff.get(id).getSelectedItem();
	}

	public InnerEffect getLvlXpStuff(int id) {
		return this.lvlXpStuff.get(id).getSelectedItem();
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
	
	@Override
	protected void setLabelAPI() {
		this.labelAPI = new JLangLabel[1];
		this.labelAPI[0] = new JLangLabel(Bullet.CLASS_NAME, Design.TITLE);
	}
	
	@Override
	protected void setEffects() {
		CustomList<Calculable> list = new CustomList<Calculable>();
		CustomList<Calculable> convert = new CustomList<Calculable>();
		
		Weapon[] weapons = new Weapon[3];
		ArrayList<InnerEffect> innerEffect = new ArrayList<InnerEffect>();
		
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
				
				for(int j = 0; j < 3; j++) {
					if(this.redEnchant.get(i*3+j).getSelectedIndex() != 0) {
						RedEnchantment red = this.getRedEnchantment(i*3+j);
						
						if(red != null) {
							innerEffect.add(this.getRedLvlEnchant(i*3+j));
						}
					}
				}
			} else {
				weapons[i].addEnchant(this.getEnchantment(i));
				weapons[i].addFortif(this.getFortif(i));
			}
		}
		
		for(InnerEffect effects : RedEnchantment.cumulConstraint(innerEffect)) {
			for(Calculable c : effects.getEffects()) {
				if(c instanceof Effect) {
					Effect e = (Effect) c;
					
					if(e.getTransfert() == null) {
						list.add(c);
					} else {
						//convert.add(c);
					}
				} else {
					list.add(c);
				}
			}
		}
		
		boolean duoWeapon = false;
		
		if( (weaponType[0] == WeaponType.EPEE1M || weaponType[0] == WeaponType.MARTEAU1M || weaponType[0] == WeaponType.HACHE1M || weaponType[0] == WeaponType.MECA1M)
				&& (weaponType[1] == WeaponType.EPEE1M || weaponType[1] == WeaponType.MARTEAU1M || weaponType[1] == WeaponType.HACHE1M || weaponType[1] == WeaponType.MECA1M) ) {
			duoWeapon = true;
			
			Weapon.doubleWeapon(weapons[0], weapons[1]);
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
								e.reduceCoef(0.75);
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
		
		this.effects = list;
		this.convertEffects = convert;
	}

	@Override
	protected void createPanel() {
		for(int i = 0; i < 3; i++) {
			JPanel descWeapon = new JPanel();
			descWeapon.setLayout(new BoxLayout(descWeapon, BoxLayout.X_AXIS));
			descWeapon.setBackground(Design.UIColor[1]);
			descWeapon.add(this.weapon.get(i));
			descWeapon.add(this.enchant.get(i));
			descWeapon.add(this.fortif.get(i));
			descWeapon.add(this.redFortif.get(i));
			
			JPanel enchantWeapon = new JPanel();
			enchantWeapon.setLayout(new BoxLayout(enchantWeapon, BoxLayout.X_AXIS));
			enchantWeapon.setBackground(Design.UIColor[1]);
			for(int j = 0; j < 3; j++) {
				enchantWeapon.add(Box.createHorizontalStrut(10));
				enchantWeapon.add(this.redEnchant.get(i*3+j));
				enchantWeapon.add(this.redLvlEnchant.get(i*3+j));
			}
			
			JPanel fortifWeapon = new JPanel();
			fortifWeapon.setLayout(new BoxLayout(fortifWeapon, BoxLayout.X_AXIS));
			fortifWeapon.setBackground(Design.UIColor[1]);
			fortifWeapon.add(this.valueFortif.get(i));
			fortifWeapon.add(Box.createHorizontalStrut(5));
			fortifWeapon.add(this.labelValue.get(i));
			
			JPanel pearlWeapon = new JPanel();
			pearlWeapon.setLayout(new BoxLayout(pearlWeapon, BoxLayout.Y_AXIS));
			pearlWeapon.setBackground(Design.UIColor[1]);
			
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
			xpWeapon.setBackground(Design.UIColor[1]);
			xpWeapon.add(this.labelGFB[i+3]);
			this.labelGFB[i+3].setFont(Design.SUBTITLE);
			
			for(int j = 0; j < 2; j++) {
				JPanel xp = new JPanel(new GridLayout(1, 2, 5, 3));
				xp.setBackground(Design.UIColor[1]);
				xp.add(this.xpStuff.get(i*2+j));
				xp.add(this.lvlXpStuff.get(i*2+j));
				xpWeapon.add(xp);
			}
			
			JPanel elemI = new JPanel();
			elemI.setLayout(new BoxLayout(elemI, BoxLayout.Y_AXIS));
			elemI.setBorder(new EmptyBorder(10, 10, 10, 10));
			elemI.setBackground(Design.UIColor[1]);
			elemI.add(this.labelGFB[i]);
			this.labelGFB[i].setFont(Design.TITLE);
			elemI.add(Box.createVerticalStrut(10));
			elemI.add(descWeapon);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(enchantWeapon);
			elemI.add(Box.createVerticalStrut(2));
			elemI.add(fortifWeapon);
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
		elem1.setBackground(Design.UIColor[1]);
		elem1.add(this.labelAPI[0]);
		elem1.add(Box.createVerticalStrut(10));
		elem1.add(this.bullet);
		
		this.add(elem1);
		
		for(JPanel panel : this.showAndHideXpStuff) {
			panel.setVisible(false);
		}
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(JLangLabel label : this.labelGFB) {
			label.updateText(lang);
		}
		
		for(JLangLabel label : this.labelAPI) {
			label.updateText(lang);
		}
	}
	
	public void updateWeapon() {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		for(int i = 0; i < 3; i++) {
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(i, grade, lvl, reinca, null, this.doubleWeapon);
			Weapon memory = this.getWeapon(i);
			this.weapon.get(i).setItems(tabWeapon);
			
			if(!this.getWeapon(i).equals(memory)) {
				updateXpStuff(i);
				updateDetails(i);
				updateEnchant(i);
				weaponType(i);
				
				this.fortif.get(i).setSelectedIndex(0);
				this.redFortif.get(i).setSelectedIndex(0);
				this.pearl.get(i*3).setSelectedIndex(0);
				this.pearl.get(i*3+1).setSelectedIndex(0);
				this.pearl.get(i*3+2).setSelectedIndex(0);
				
				MainFrame.getInstance().setRedPane(NUM_PAGE);
			}
		}
		
		Bullet[] tabBullet = Bullet.getPossibleBullet(lvl, reinca);
		Bullet memory = this.getBullet();
		this.bullet.setItems(tabBullet);
		
		if(!this.getBullet().equals(memory)) {
			MainFrame.getInstance().setRedPane(NUM_PAGE);
		}
	}
	
	private void updateDetails(int id) {
		if(this.weapon.get(id).getSelectedIndex() != 0) {
			if(this.getWeapon(id).getQuality() == Quality.RED) {
				this.fortif.get(id).setVisible(false);
				this.redFortif.get(id).setVisible(true);
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(true);
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
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(false);
				}
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
			
			if(weapon.getQuality() == Quality.RED) {
				RedEnchantment[] tabRed = RedEnchantment.getPossibleRedEnchant(weapon, null, null);
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setItems(tabRed);
					this.redEnchant.get(id*3+i).setVisible(true);
				}
				
				this.enchant.get(id).setVisible(false);
			} else {
				if(weapon.isEnchantable()) {
					Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(weapon);
					this.enchant.get(id).setItems(tabEnchant);
					this.enchant.get(id).setVisible(true);
				} else {
					this.enchant.get(id).setVisible(false);
				}
				
				for(int i = 0; i < 3; i++) {
					this.redEnchant.get(id*3+i).setVisible(false);
					this.redLvlEnchant.get(id*3+i).setVisible(false);
				}
			}
		} else {
			this.enchant.get(id).setVisible(false);
			
			for(int i = 0; i < 3; i++) {
				this.redEnchant.get(id*3+i).setVisible(false);
				this.redLvlEnchant.get(id*3+i).setVisible(false);
			}
		}
	}
	
	private void weaponType(int id) {
		Grade grade = PageGeneral.getInstance().getGrade();
		int lvl = PageGeneral.getInstance().getLvl();
		Reinca reinca = PageGeneral.getInstance().getReinca();
		
		Weapon choice = this.getWeapon(id);
		if(id == 0) {
			int keepEnchant = this.enchant.get(1).getSelectedIndex();
			
			if(choice.getType() == WeaponType.EPEE2M || choice.getType() == WeaponType.MARTEAU2M || choice.getType() == WeaponType.HACHE2M
					|| choice.getType() == WeaponType.MECA2M || choice.getType() == WeaponType.BATON || choice.getType() == WeaponType.LAME) {
				
				Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, null, this.doubleWeapon);
				this.weapon.get(0).setItems(tabWeapon);
				this.weapon.get(1).setItems(new Weapon[] { new Weapon() });
				
				for(int i = 0; i < 3; i++) {
					this.pearl.get(3+i).setVisible(true);
					this.pearl.get(6+i).setVisible(false);
					this.pearl.get(6+i).setSelectedIndex(0);
				}
				
				this.showAndHide.setVisible(false);
			} else if(choice.getType() == WeaponType.EPEE1M || choice.getType() == WeaponType.MARTEAU1M || choice.getType() == WeaponType.HACHE1M
					|| choice.getType() == WeaponType.MECA1M || choice.getType() == WeaponType.DEFAULT) {
				
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
			} else this.showAndHide.setVisible(true);
			
			this.enchant.get(1).setSelectedIndex(keepEnchant);
		} else if(id == 1) {
			int keepEnchant = this.enchant.get(0).getSelectedIndex();
			
			Weapon[] tabWeapon = Weapon.getPossibleWeapon(0, grade, lvl, reinca, choice, this.doubleWeapon);
			this.weapon.get(0).setItems(tabWeapon);
			
			this.enchant.get(0).setSelectedIndex(keepEnchant);
		} else if(choice.getType() == WeaponType.RELIQUE) {
			this.fortif.get(id).setVisible(false);
			this.redFortif.get(id).setVisible(false);
			this.fortif.get(id).setSelectedIndex(0);
			this.redFortif.get(id).setSelectedIndex(0);
		}
	}
	
	private void updateLvlXpStuff(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(!XpStuff.availableEffects(this.getXpStuff(id), this.getXpStuff(indexPair))) {
			
			this.lvlXpStuff.get(id).setVisible(false);
			this.lvlXpStuff.get(indexPair).setVisible(false);
		} else {
			XpStuff xpStuff = this.getXpStuff(id);
			XpStuff xpStuffDuo = this.getXpStuff(indexPair);
			
			InnerEffect[] inner = xpStuff.getInnerEffect();
			InnerEffect[] innerDuo = xpStuffDuo.getInnerEffect();
			
			this.lvlXpStuff.get(id).setItems(inner);
			this.lvlXpStuff.get(indexPair).setItems(innerDuo);
			
			this.lvlXpStuff.get(id).setVisible(true);
			this.lvlXpStuff.get(indexPair).setVisible(true);
		}
	}
	
	private void updateMaxLvlValue(int id) {
		int indexPair = (id % 2 == 0) ? id + 1 : id -1;
		
		if(XpStuff.availableEffects(this.getXpStuff(id), this.getXpStuff(indexPair))) {
			InnerEffect[] inner = this.getXpStuff(indexPair).getPossibleLvl(this.getLvlXpStuff(id));
			this.lvlXpStuff.get(indexPair).setItems(inner);
		}
	}
	
	private void updateValueFortif(int id) {
		RedFortification fortif = this.getRedFortif(id);
		
		this.valueFortif.get(id).setDoubleMinimum(fortif.getCoefMin()*100);
		this.valueFortif.get(id).setDoubleMaximum(fortif.getCoefMax()*100);
		this.valueFortif.get(id).setDoubleValue(fortif.getCoef()*100);
		
		if(fortif.getCoef() == 1) {
			this.valueFortif.get(id).setVisible(false);
			this.labelValue.get(id).setVisible(false);
		} else {
			this.valueFortif.get(id).setVisible(true);
			this.labelValue.get(id).setVisible(true);
		}
	}
	
	private void updateTooltipFortif(int id) {
		Weapon weapon = this.getWeapon(id);
		double current = this.valueFortif.get(id).getDoubleValue() - 100;
		current = current / 100 +1;
		
		String tooltip = "";
		
		if(weapon.getEffects() != null) {
			for(Calculable calculable : weapon.getEffects()) {
				if(calculable instanceof Effect) {
					Effect effect = (Effect) calculable;
					
					if(effect.isPercent()) {
						continue;
					}
					
					if(effect.getType().ordinal() < 5 || effect.getType().ordinal() > 9) {
						continue;
					}
					
					tooltip += effect.toString() + " +" + ((int) (effect.getValue() * current - effect.getValue())) + "<br>";
				}
			}
		}
		
		this.labelValue.get(id).setText("<html>" + tooltip + "</html>");
	}
	
	private void updateRedEnchant(int idRed) {
		int ignore1;
		int ignore2;
		
		if(idRed % 3 == 0) {
			ignore1 = idRed + 1;
			ignore2 = idRed + 2;
		} else if(idRed % 3 == 1) {
			ignore1 = idRed - 1;
			ignore2 = idRed + 1;
		} else {
			ignore1 = idRed - 2;
			ignore2 = idRed - 1;
		}
		
		RedEnchantment choice = this.getRedEnchantment(idRed);
		RedEnchantment memory1 = this.getRedEnchantment(ignore1);
		RedEnchantment memory2 = this.getRedEnchantment(ignore2);
		
		RedEnchantment[] tabRed1 = RedEnchantment.getPossibleRedEnchant(this.getWeapon(idRed/3), choice, memory2);
		RedEnchantment[] tabRed2 = RedEnchantment.getPossibleRedEnchant(this.getWeapon(idRed/3), choice, memory1);
		
		this.redEnchant.get(ignore1).setItems(tabRed1, memory1);
		this.redEnchant.get(ignore2).setItems(tabRed2, memory2);
	}
	
	private void updateRedLvlEnchant(int id) {
		RedEnchantment redEnchant = this.getRedEnchantment(id);
		
		if(redEnchant != null && redEnchant.getInnerEffect() != null) {
			this.redLvlEnchant.get(id).setItems(redEnchant.getInnerEffect());
			this.redLvlEnchant.get(id).setVisible(true);
		} else {
			this.redLvlEnchant.get(id).setVisible(false);
		}
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
			config.put("RedLvlEnchantment" + i, "" + this.getRedLvlEnchant(i));
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
			this.redFortif.get(i).setSelectedItem(RedFortification.get(config.get("RedFortif" + i)));
		}
		
		for(int i = 0; i < this.redEnchant.size(); i++) {
			this.redEnchant.get(i).setSelectedItem(Enchantment.get(this.getWeapon(i/3), config.get("RedEnchantment" + i)));
		}

		for(int i = 0; i < this.redLvlEnchant.size(); i++) {
			this.redLvlEnchant.get(i).setSelectedItem(config.get("RedLvlEnchantment" + i));
		}

		for(int i = 0; i < this.valueFortif.size(); i++) {
			this.valueFortif.get(i).setValue(Integer.valueOf(config.get("ValueFortif" + i)));
		}
		
		for(int i = 0; i < this.weapon.size(); i++) {
			updateEnchant(i);
		}
	}
}
