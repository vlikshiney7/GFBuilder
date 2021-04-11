package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageArmor;
import fr.vlik.gfbuilder.page.PageCapeRing;
import fr.vlik.gfbuilder.page.PageWeapon;
import fr.vlik.grandfantasia.charac.Grade;
import fr.vlik.grandfantasia.customEquip.CustomArmor;
import fr.vlik.grandfantasia.customEquip.CustomCape;
import fr.vlik.grandfantasia.customEquip.CustomEquipment;
import fr.vlik.grandfantasia.customEquip.CustomRing;
import fr.vlik.grandfantasia.customEquip.CustomWeapon;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Armor;
import fr.vlik.grandfantasia.equip.Armor.ArmorType;
import fr.vlik.grandfantasia.equip.Cape;
import fr.vlik.grandfantasia.equip.Ring;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipUpgrade.Enchantment;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomRadioButton;
import fr.vlik.uidesign.JCustomSpinner;
import fr.vlik.uidesign.JLangLabel;
import fr.vlik.uidesign.JLangRadioButton;

public class FrameCreateCustom extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameCreateCustom INSTANCE = new FrameCreateCustom();
	
	private ArrayList<JLangRadioButton> typeEquipment = new ArrayList<JLangRadioButton>(4);
	
	private JCustomSpinner lvl;
	private JCustomComboBox<WeaponType> typeWeapon;
	private JCustomComboBox<ArmorType> typeArmor;
	private JCustomComboBox<Grade> grade;
	private ArrayList<JCustomRadioButton<Quality>> quality = new ArrayList<JCustomRadioButton<Quality>>(3);
	
	private JCustomComboBox<CustomEquipment> customEquipment;
	private ArrayList<JCustomComboBox<Enchantment>> enchantement = new ArrayList<JCustomComboBox<Enchantment>>(6);
	
	private JCustomButton create;
	
	private JLangLabel[] label;
	
	public static FrameCreateCustom getInstance() {
		return INSTANCE;
	}
	
	public FrameCreateCustom() {
		this.setLayout(new BorderLayout());
		this.setBackground(Design.UIColor[2]);
		this.label = Lang.getDataLabel(18);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveAs.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(540, 350);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				MainFrame.getInstance().setEnabled(true);
				MainFrame.getInstance().toFront();
			}
		});
		
		for(int i = 0; i < 4; i++) {
			int id = i;
			this.label[i+1].setFont(Design.TEXT);
			this.typeEquipment.add(new JLangRadioButton(this.label[i+1].getLang()));
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
		
		WeaponType[] weaponTypeChoice = new WeaponType[WeaponType.values().length-2];
		for(int i = 0; i < weaponTypeChoice.length; i++) {
			weaponTypeChoice[i] = WeaponType.values()[i];
		}
		this.typeWeapon = new JCustomComboBox<WeaponType>(new DefaultComboBoxModel<WeaponType>(weaponTypeChoice));
		this.typeWeapon.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		ArmorType[] armorTypeChoice = new ArmorType[ArmorType.values().length-1];
		for(int i = 0; i < armorTypeChoice.length; i++) {
			armorTypeChoice[i] = ArmorType.values()[i];
		}
		this.typeArmor = new JCustomComboBox<ArmorType>(new DefaultComboBoxModel<ArmorType>(armorTypeChoice));
		this.typeArmor.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		this.grade = new JCustomComboBox<Grade>(new DefaultComboBoxModel<Grade>(Grade.getPossibleGrade(31)));
		this.grade.addActionListener(e -> {
			updateList();
			updateEnchant();
			
			checkValidity();
		});
		
		for(int i = 0; i < 3; i++) {
			this.quality.add(new JCustomRadioButton<Quality>(Quality.values()[i+1]));
			this.quality.get(i).addActionListener(e -> {
				updateNbEnchant();
				updateEnchant();
				
				checkValidity();
			});
		}
		
		this.customEquipment = new JCustomComboBox<CustomEquipment>(new DefaultComboBoxModel<CustomEquipment>());
		this.customEquipment.addActionListener(e -> {
			updateNbEnchant();
			updateEnchant();
			
			checkValidity();
		});
		
		for(int i = 0; i < 6; i++) {
			this.enchantement.add(new JCustomComboBox<Enchantment>(new DefaultComboBoxModel<Enchantment>()));
			this.enchantement.get(i).addActionListener(e -> {
				checkValidity();
			});
			this.enchantement.get(i).setVisible(false);
		}
		
		this.create = new JCustomButton(this.label[8].getLang(), Design.GREEN_COLOR);
		this.create.setAlignmentX(CENTER_ALIGNMENT);
		this.create.addActionListener(e -> {
			createEquipment();
		});
	    
		updateLanguage(Language.FR);
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
		for(int i = 0; i < this.quality.size(); i++) {
			if(this.quality.get(i).isSelected()) {
				switch (i) {
					case 0:	return Quality.WHITE;
					case 1:	return Quality.GREEN;
					case 2:	return Quality.BLUE;
				}
			}
		}
		
		return Quality.WHITE;
	}
	
	private CustomEquipment getCustomEquipment() {
		return this.customEquipment.getSelectedItem();
	}
	
	private Enchantment getEnchantment(int i) {
		return this.enchantement.get(i).getSelectedItem();
	}
	
	private void createPanel() {
		JPanel pageCustom = new JPanel();
		pageCustom.setLayout(new BoxLayout(pageCustom, BoxLayout.Y_AXIS));
		pageCustom.setBackground(Design.UIColor[2]);
		pageCustom.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		pageCustom.add(this.label[0]);
		this.label[0].setFont(Design.TITLE);
		pageCustom.add(Box.createVerticalStrut(10));
		
		ButtonGroup currentType = new ButtonGroup();
		JPanel type = new JPanel(new GridLayout(1, 4, 10, 0));
		type.setBackground(Design.UIColor[2]);
		for(int i = 0; i < 4; i++) {
			currentType.add(this.typeEquipment.get(i));
			type.add(this.typeEquipment.get(i));
		}
		
		JPanel inline1 = new JPanel();
		inline1.setBackground(Design.UIColor[2]);
		inline1.setBorder(new EmptyBorder(10, 10, 10, 10));
		inline1.add(this.label[5]);
		this.label[5].setFont(Design.SUBTITLE);
		inline1.add(this.lvl);
		inline1.add(this.typeWeapon);
		inline1.add(this.typeArmor);
		inline1.add(this.grade);
		inline1.add(Box.createHorizontalStrut(20));
		
		ButtonGroup currentQuality = new ButtonGroup();
		JPanel inline2 = new JPanel(new GridLayout(1, 3, 10, 0));
		inline2.setBackground(Design.UIColor[2]);
		for(int i = 0; i < 3; i++) {
			currentQuality.add(this.quality.get(i));
			inline2.add(this.quality.get(i));
		}
		
		JPanel listEnchant = new JPanel(new GridLayout(2, 3, 10, 10));
		listEnchant.setBackground(Design.UIColor[2]);
		for(int i = 0; i < 6; i++) {
			listEnchant.add(this.enchantement.get(i));
		}
		
		pageCustom.add(type);
		pageCustom.add(Box.createVerticalStrut(10));
		pageCustom.add(inline1);
		pageCustom.add(Box.createVerticalStrut(10));
		pageCustom.add(inline2);
		pageCustom.add(Box.createVerticalStrut(10));
		pageCustom.add(this.customEquipment);
		pageCustom.add(Box.createVerticalStrut(10));
		pageCustom.add(listEnchant);
		pageCustom.add(Box.createVerticalStrut(10));
		pageCustom.add(this.create);
		
		this.add(pageCustom);
	}
	
	@Override
	public void updateLanguage(Language lang) {
		for(int i = 0; i < this.label.length; i++) {
			this.label[i].updateText(lang);
		}
		
		this.create.updateText(lang);
		
		for(JLangRadioButton button : this.typeEquipment) {
			button.updateText(lang);
		}
		
		for(JCustomRadioButton<Quality> button : this.quality) {
			button.updateText(lang);
		}
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
		}
	}
	
	private void updateList() {
		int optionType = this.getTypeEquipment();
		CustomEquipment memory = this.getCustomEquipment();
		
		switch (optionType) {
			case 0:
				CustomWeapon[] tabWeapon = CustomWeapon.getPossibleWeapon(this.getWeaponType(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<CustomEquipment>(tabWeapon));
				break;
			case 1:
				CustomArmor[] tabArmor = CustomArmor.getPossibleArmor(this.getArmorType(), this.getGrade(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<CustomEquipment>(tabArmor));
				break;
			case 2:
				CustomCape[] tabCape= CustomCape.getPossibleCape(this.getGrade(), this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<CustomEquipment>(tabCape));
				break;
			case 3:
				CustomRing[] tabRing = CustomRing.getPossibleRing(this.getLvl());
				this.customEquipment.setModel(new DefaultComboBoxModel<CustomEquipment>(tabRing));
				break;
		}
		
		this.customEquipment.setSelectedItem(memory);
	}
	
	private void updateEnchant() {
		CustomEquipment equipment = this.getCustomEquipment();
		Enchantment[] tabEnchant = Enchantment.getPossibleEnchant(equipment, this.getQuality());
		
		if(equipment == null) {
			for(int i = 0; i < 6; i++) {
				this.enchantement.get(i).setVisible(false);
			}
		} else {
			for(int i = 0; i < 6; i++) {
				this.enchantement.get(i).setModel(new DefaultComboBoxModel<Enchantment>(tabEnchant));
			}
		}
		
	}
	
	private void updateNbEnchant() {
		if(this.getCustomEquipment() != null) {
			if(this.getQuality() == Quality.WHITE) {
				for(int i = 0; i < 6; i++) {
					this.enchantement.get(i).setVisible(false);
				}
			} else if(this.getQuality() == Quality.GREEN) {
				for(int i = 0; i < 3; i++) {
					this.enchantement.get(i).setVisible(true);
				}
				for(int i = 3; i < 6; i++) {
					this.enchantement.get(i).setVisible(false);
				}
			} else if(this.getQuality() == Quality.BLUE) {
				for(int i = 0; i < 6; i++) {
					this.enchantement.get(i).setVisible(true);
				}
			}
		} else {
			for(int i = 0; i < 6; i++) {
				this.enchantement.get(i).setVisible(false);
			}
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
		this.quality.get(0).setSelected(true);
		
		this.setVisible(true);
	}
	
	public void popup(int option, int lvl) {
		MainFrame.getInstance().setEnabled(false);
		
		this.typeEquipment.get(option).setSelected(true);
		updateForm(option);
		
		this.lvl.setValue(lvl);
		this.quality.get(0).setSelected(true);
		
		this.setVisible(true);
	}
	
	private void checkValidity() {
		if(this.getQuality() == Quality.WHITE) {
			if(this.getCustomEquipment() != null) {
				this.create.setVisible(true);
			} else {
				this.create.setVisible(false);
			}
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
