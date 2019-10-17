package fr.vlik.gfbuilder;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.Grade;
import fr.vlik.grandfantasia.Reinca;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;

public class Overlay extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static Overlay INSTANCE = new Overlay();
	
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
		
		this.iconGrade.setIcon(Grade.data[0].getIcon());
		this.lvl = JCustomLabel.getSimpleLabel("1");
		this.iconReinca.setIcon(Reinca.getData()[0].getIcon());
		this.nameSave = JCustomLabel.getSimpleLabel("Novice");
		
		createPanel();
	}

	public void setGrade(Grade grade) {
		this.iconGrade.setIcon(grade.getIcon());
	}

	public void setLvl(int lvl) {
		this.lvl.setText("" + lvl);
	}

	public void setReinca(Reinca reinca) {
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
		this.add(JCustomLabel.getSimpleLabel("-"));
		this.add(Box.createHorizontalStrut(5));
		this.add(this.nameSave);
	}
}
