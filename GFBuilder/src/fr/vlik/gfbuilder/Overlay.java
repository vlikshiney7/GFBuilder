package fr.vlik.gfbuilder;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JLangLabel;

public class Overlay extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static Overlay INSTANCE = new Overlay();
	
	private boolean save = true;
	
	private JLabel iconGrade = new JLabel();
	private JLabel lvl = new JLabel();
	private JLabel iconReinca = new JLabel();
	private JLabel nameSave;
	private JLabel iconSave = new JLabel();
	
	public static Overlay getInstance() {
		return INSTANCE;
	}
	
	private Overlay() {
		super();
		this.setMaximumSize(new Dimension(400, 30));
		this.setBackground(Design.UIColor[0]);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setAlignmentX(LEFT_ALIGNMENT);
		
		this.setGrade(Grade.data[0]);
		this.lvl = JLangLabel.getSimpleLabel("1");
		this.setReinca(Reinca.getData()[0]);
		this.nameSave = JLangLabel.getSimpleLabel(SaveConfig.DEFAULT_NAME);
		
		createPanel();
	}
	
	public String getSaveDefaultName() {
		return this.iconGrade.getName() + " " + this.lvl.getText();
	}
	
	public boolean isSave() {
		return this.save;
	}
	
	public String getCurrentName() {
		return this.nameSave.getText();
	}
	
	public void setSave(boolean save) {
		this.save = save;
		
		if(save) {
			this.iconSave.setIcon(new ImageIcon(Overlay.class.getResource("/fr/vlik/uidesign/images/save.png")));
		} else {
			this.iconSave.setIcon(new ImageIcon(Overlay.class.getResource("/fr/vlik/uidesign/images/notSave.png")));
		}
	}

	public void setGrade(Grade grade) {
		Language lang = MainFrame.getInstance() == null ? Language.FR : MainFrame.getInstance().getLanguage();
		this.iconGrade.setName(grade.getName(lang));
		this.iconGrade.setIcon(grade.getIcon());
	}

	public void setLvl(int lvl) {
		this.lvl.setText("" + lvl);
	}

	public void setReinca(Reinca reinca) {
		Language lang = MainFrame.getInstance() == null ? Language.FR : MainFrame.getInstance().getLanguage();
		this.iconReinca.setName(reinca.getName(lang));
		this.iconReinca.setIcon(reinca.getIcon());
	}
	
	public void setNameSave(String nameSave) {
		this.nameSave.setText(nameSave);
	}
	
	private void createPanel() {
		this.add(this.iconGrade);
		this.add(Box.createHorizontalStrut(5));
		this.add(this.lvl);
		this.add(Box.createHorizontalStrut(5));
		this.add(this.iconReinca);
		this.add(Box.createHorizontalStrut(5));
		this.add(JLangLabel.getSimpleLabel("-"));
		this.add(Box.createHorizontalStrut(5));
		this.add(this.nameSave);
		this.add(Box.createHorizontalStrut(5));
		this.add(this.iconSave);
	}
}
