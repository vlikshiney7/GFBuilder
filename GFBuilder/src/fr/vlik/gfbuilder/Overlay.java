package fr.vlik.gfbuilder;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;

public class Overlay extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static Overlay INSTANCE = new Overlay();
	
	private String currentName;
	private boolean save = true;
	
	private JLabel iconGrade = new JLabel();
	private JLabel lvl = new JLabel();
	private JLabel iconReinca = new JLabel();
	private JLabel nameSave;
	
	public static Overlay getInstance() {
		return INSTANCE;
	}
	
	private Overlay() {
		super();
		this.setMaximumSize(new Dimension(300, 30));
		this.setBackground(Design.UIColor[0]);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setAlignmentX(LEFT_ALIGNMENT);
		
		this.currentName = "New build";
		
		this.setGrade(Grade.data[0]);
		this.lvl = JCustomLabel.getSimpleLabel("1");
		this.setReinca(Reinca.getData()[0]);
		this.nameSave = JCustomLabel.getSimpleLabel("New build");
		
		createPanel();
	}
	
	public String getSaveDefaultName() {
		return this.iconGrade.getName() + " " + this.lvl.getText();
	}
	
	public boolean isSave() {
		return this.save;
	}
	
	public String getCurrentName() {
		return this.currentName;
	}
	
	public void setCurrentName(String nameSave) {
		this.currentName = nameSave;
	}
	
	public void setSave(boolean save) {
		this.save = save;
		
		this.nameSave.setText(this.currentName + (this.save ? "" : " *"));
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
		setCurrentName(nameSave);
		
		this.nameSave.setText(this.currentName + (this.save ? "" : " *"));
	}
	
	private void createPanel() {
		this.add(this.iconGrade);
		this.add(Box.createHorizontalStrut(5));
		this.add(this.lvl);
		this.add(Box.createHorizontalStrut(5));
		this.add(this.iconReinca);
		this.add(Box.createHorizontalStrut(5));
		this.add(JCustomLabel.getSimpleLabel("-"));
		this.add(Box.createHorizontalStrut(5));
		this.add(this.nameSave);
	}
}
