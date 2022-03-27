package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageArmor;
import fr.vlik.gfbuilder.page.PageCapeRing;
import fr.vlik.gfbuilder.page.PageWeapon;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.customequip.CustomArmor;
import fr.vlik.grandfantasia.customequip.CustomCape;
import fr.vlik.grandfantasia.customequip.CustomEquipment;
import fr.vlik.grandfantasia.customequip.CustomRing;
import fr.vlik.grandfantasia.customequip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomButtonGroup;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JCustomSpinner;
import fr.vlik.uidesign.JLangRadioButton;

public class FrameCreateCustom extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameCreateCustom INSTANCE = new FrameCreateCustom();
	
	private ArrayList<JLangRadioButton> typeEquipment = new ArrayList<>(4);
	
	private JCustomSpinner lvl;
	private JCustomComboBox<WeaponType> typeWeapon;
	private JCustomComboBox<ArmorType> typeArmor;
	private JCustomComboBox<Grade> grade;
	private JCustomButtonGroup<Quality> quality;
	
	private JCustomComboBox<CustomEquipment> customEquipment;
	private transient JCustomComboBoxList<Enchantment> enchantement;
	
	private JCustomButton create;
	
	public static FrameCreateCustom getInstance() {
		return INSTANCE;
	}
	
	public FrameCreateCustom() {
		super(new BorderLayout());
		
		this.labels = Lang.getDataLabel(6);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveAs.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(540, 350);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				MainFrame.getInstance().setEnabled(true);
				MainFrame.getInstance().toFront();
			}
		});
		
		for(int i = 0; i < 4; i++) {
			int id = i;
			this.labels[i+1].setFont(Design.TEXT);
			this.typeEquipment.add(new JLangRadioButton(this.labels[i+1].getLang()));
			this.typeEquipment.get(i).setBackground(Design.UIColor[1]);
			this.typeEquipment.get(i).setForeground(Design.FontColor[0]);
			this.typeEquipment.get(i).addActionListener(e -> {
				updateForm(id);
				updateList();
				updateEnchant();
				
				checkValidity();
			});
		}
		
		this.lvl = new JCustomSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		this.lvl.addChangeListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		WeaponType[] weaponTypeChoice = Arrays.copyOf(WeaponType.values(), WeaponType.values().length-2);
		this.typeWeapon = new JCustomComboBox<>(new DefaultComboBoxModel<>(weaponTypeChoice));
		this.typeWeapon.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		ArmorType[] armorTypeChoice = Arrays.copyOf(ArmorType.values(), ArmorType.values().length-1);
		this.typeArmor = new JCustomComboBox<>(new DefaultComboBoxModel<>(armorTypeChoice));
		this.typeArmor.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		this.grade = new JCustomComboBox<>(new DefaultComboBoxModel<>(Grade.getPossibleGrade(31)));
		this.grade.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		this.quality = new JCustomButtonGroup<>();
		
		for(int i = 1; i < 4; i++) {
			JCustomRadioButton<Quality> radio = new JCustomRadioButton<>(Quality.values()[i]);
			radio.addActionListener(e -> {
				updateNbEnchant();
				updateEnchant();
				
				checkValidity();
			});
			this.quality.add(radio);
		}
		
		this.customEquipment = new JCustomComboBox<>(new DefaultComboBoxModel<>());
		this.customEquipment.addActionListener(e -> {
			updateNbEnchant();
			updateEnchant();
			
			checkValidity();
		});
		
		this.enchantement = new JCustomComboBoxList<>(6);
		this.enchantement.addActionListener(e -> checkValidity() );
		this.enchantement.setVisible(false);
		
		this.create = new JCustomButton(this.labels[8].getLang(), Design.GREEN_COLOR);
		this.create.setAlignmentX(CENTER_ALIGNMENT);
		this.create.addActionListener(e -> createEquipment() );
	    
		this.components.add(this.create);
		this.components.addAll(this.typeEquipment);
		this.components.add(this.quality);
		
		createPanel();
		checkValidity();
	}
	
	private int getTypeEquipment() {
		for(int i = 0; i < this.typeEquipment.size(); i++) {
			if(this.typeEquipment.get(i).isSelected()) {
				return i;
			}
		}
		
		return 0;
	}
	
	public int getLvl() {
		return this.lvl.getIntValue();
	}
	
	private WeaponType getWeaponType() {
		return this.typeWeapon.getSelectedItem();
	}
	
	private ArmorType getArmorType() {
		return this.typeArmor.getSelectedItem();
	}
	
	private Grade getGrade() {
		return this.grade.getSelectedItem();
	}
	
	private Quality getQuality() {
		return this.quality.getSelectedItem();
	}
	
	private CustomEquipment getCustomEquipment() {
		return this.customEquipment.getSelectedItem();
	}
	
	private Enchantment getEnchantment(int i) {
		return this.enchantement.get(i).getSelectedItem();
	}
	
	private void createPanel() {
		JCustomPanel pageCustom = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageCustom.setBackground(Design.UIColor[2]);
		
		pageCustom.add(this.labels[0], Box.createVerticalStrut(10));
		this.labels[0].setFont(Design.TITLE);
		
		ButtonGroup currentType = new ButtonGroup();
		JCustomPanel type = new JCustomPanel(new GridLayout(1, 4, 10, 0));
		type.setBackground(Design.UIColor[2]);
		for(int i = 0; i < 4; i++) {
			currentType.add(this.typeEquipment.get(i));
			type.add(this.typeEquipment.get(i));
		}
		
		JCustomPanel inline1 = new JCustomPanel(new EmptyBorder(10, 10, 10, 10));
		inline1.setBackground(Design.UIColor[2]);
		inline1.addAll(this.labels[5], this.lvl, this.typeWeapon, this.typeArmor, this.grade, Box.createHorizontalStrut(20));
		this.labels[5].setFont(Design.SUBTITLE);
		
		JCustomPanel inline2 = new JCustomPanel(new GridLayout(1, 3, 10, 0));
		inline2.setBackground(Design.UIColor[2]);
		inline2.addAll(this.quality);
		
		JCustomPanel listEnchant = new JCustomPanel(new GridLayout(2, 3, 10, 10));
		listEnchant.setBackground(Design.UIColor[2]);
		listEnchant.addAll(this.enchantement.getList());
		
		pageCustom.addAll(type, Box.createVerticalStrut(10), inline1, Box.createVerticalStrut(10), inline2, Box.createVerticalStrut(10),
				this.customEquipment, Box.createVerticalStrut(10), listEnchant, Box.createVerticalStrut(10), this.create);
		
		this.add(pageCustom);
	}
	
	private void updateForm(int idList) {
		switch (idList) {
			case 0:
				this.typeWeapon.setVisible(true);
				this.typeArmor.setVisible(false);
				this.grade.setVisible(false);
				break;
			case 1:
				this.typeWeapon.setVisible(false);
				this.typeArmor.setVisible(true);
				this.grade.setVisible(true);
				break;
			case 2:
				this.typeWeapon.setVisible(false);
				this.typeArmor.setVisible(false);
				this.grade.setVisible(true);
				break;
			case 3:
				this.typeWeapon.setVisible(false);
				this.typeArmor.setVisible(false);
				this.grade.setVisible(false);
				break;
			default:
				break;
		}
	}
	
	private void updateList() {
		int optionType = this.getTypeEquipment();
		CustomEquipment memory = this.getCustomEquipment();
		
		switch (optionType) {
			case 0:
				CustomWeapon[] tabWeapon = CustomWeapon.getPossibleWeapon(this.getWeaponType(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<>(tabWeapon));
				break;
			case 1:
				CustomArmor[] tabArmor = CustomArmor.getPossibleArmor(this.getArmorType(), this.getGrade(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<>(tabArmor));
				break;
			case 2:
				CustomCape[] tabCape = CustomCape.getPossibleCape(this.getGrade(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<>(tabCape));
				break;
			case 3:
				CustomRing[] tabRing = CustomRing.getPossibleRing(this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<>(tabRing));
				break;
			default:
				break;
		}
		
		this.customEquipment.setSelectedItem(memory);
	}
	
	private void updateEnchant() {
		CustomEquipment equipment = this.getCustomEquipment();
		Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(equipment, this.getQuality());
		
		if(equipment == null) {
			this.enchantement.setVisible(false);
		} else {
			this.enchantement.setModel(tabEnchant);
		}
		
	}
	
	private void updateNbEnchant() {
		if(this.getCustomEquipment() != null) {
			if(this.getQuality() == Quality.WHITE) {
				this.enchantement.setVisible(false);
			} else if(this.getQuality() == Quality.GREEN) {
				this.enchantement.setRangeVisible(0, 3, true);
				this.enchantement.setRangeVisible(3, 6, false);
			} else if(this.getQuality() == Quality.BLUE) {
				this.enchantement.setVisible(true);
			}
		} else {
			this.enchantement.setVisible(false);
		}
	}
	
	private void createEquipment() {
		Enchantment[] tabEnchant = new Enchantment[6];
		for(int i = 0; i < 6; i++) {
			tabEnchant[i] = this.getEnchantment(i);
		}
		
		if(this.getCustomEquipment() instanceof CustomWeapon) {
			CustomWeapon custom = (CustomWeapon) this.getCustomEquipment();
			Weapon weapon = custom.transformToWeapon(this.getQuality(), tabEnchant);
			
			Weapon.addCustom(weapon);
			
			PageWeapon.getInstance().updateWeapon();
		} else if(this.getCustomEquipment() instanceof CustomArmor) {
			CustomArmor custom = (CustomArmor) this.getCustomEquipment();
			Armor armor = custom.transformToArmor(this.getQuality(), tabEnchant);
			
			Armor.addCustom(armor);
			
			PageArmor.getInstance().updateArmor();
		} else if(this.getCustomEquipment() instanceof CustomCape) {
			CustomCape custom = (CustomCape) this.getCustomEquipment();
			Cape cape = custom.transformToCape(this.getQuality(), tabEnchant);
			
			Cape.addCustom(cape);
			
			PageCapeRing.getInstance().updateCapeRing();
		} else if(this.getCustomEquipment() instanceof CustomRing) {
			CustomRing custom = (CustomRing) this.getCustomEquipment();
			Ring ring = custom.transformToRing(this.getQuality(), tabEnchant);
			
			Ring.addCustom(ring);
			
			PageCapeRing.getInstance().updateCapeRing();
		}
		
		SaveConfig.overrideCustom();
		
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.setVisible(false);
	}
	
	@Override
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		
		this.typeEquipment.get(0).setSelected(true);
		updateForm(0);
		
		this.lvl.setValue(1);
		this.quality.setSelectedIndex(0);
		
		this.setVisible(true);
	}
	
	public void popup(int option, int lvl) {
		MainFrame.getInstance().setEnabled(false);
		
		this.typeEquipment.get(option).setSelected(true);
		updateForm(option);
		
		this.lvl.setValue(lvl);
		this.quality.setSelectedIndex(0);
		
		this.setVisible(true);
	}
	
	private void checkValidity() {
		if(this.getQuality() == Quality.WHITE) {
			this.create.setVisible(this.getCustomEquipment() != null);
		} else if(this.getQuality() == Quality.GREEN) {
			if(this.getCustomEquipment() != null) {
				this.create.setVisible(true);
				
				for(int i = 0; i < 3; i++) {
					if(this.getEnchantment(i).getName(Language.FR).equals(" ")) {
						this.create.setVisible(false);
						break;
					}
				}
			} else {
				this.create.setVisible(false);
			}
		} else if(this.getQuality() == Quality.BLUE) {
			if(this.getCustomEquipment() != null) {
				this.create.setVisible(true);
				
				for(int i = 0; i < 6; i++) {
					if(this.getEnchantment(i).getName(Language.FR).equals(" ")) {
						this.create.setVisible(false);
						break;
					}
				}
			} else {
				this.create.setVisible(false);
			}
		}
	}
}
