package fr.vlik.uidesign;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.BuffIcon;
import fr.vlik.grandfantasia.Nucleus;
import fr.vlik.grandfantasia.Skill;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Effect;

public class JCustomLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public JCustomLabel() {
		super();
		this.setFont(new Font("Open Sans", Font.PLAIN, 12));
		setBlackUI();
	}
	
	public JCustomLabel(Object object, Language lang) {
		super();
		setBlackUI();
		
		if(object instanceof Nucleus) {
			Nucleus nucleus = (Nucleus) object;
			
			this.setText(nucleus.getName());
			this.setIcon(nucleus.getIcon());
			this.setToolTipText(nucleus.getTooltip());
			this.effects = nucleus.getEffects();
		} else if(object instanceof Energy) {
			Energy energy = (Energy) object;
			
			this.setText(energy.getName(lang));
			this.setIcon(energy.getIcon());
			this.setToolTipText(energy.getTooltip());
			this.effects = energy.getEffects();
		} else if(object instanceof CombiTalent) {
			CombiTalent combiTalent = (CombiTalent) object;
			
			this.setText(combiTalent.getName());
			this.setToolTipText(combiTalent.getTooltip());
			this.effects = combiTalent.getEffects();
		}
	}
	
	public void setObject(Object object) {
		
		if(object instanceof JCustomLabel) {
			JCustomLabel label = (JCustomLabel) object;
			
			this.setText(label.getText());
			this.setIcon(label.getIcon());
			this.setToolTipText(label.getToolTipText());
			this.effects = label.getEffects();
		} else if(object instanceof Nucleus) {
			Nucleus nucleus = (Nucleus) object;
			
			this.setText(nucleus.getName());
			this.setIcon(nucleus.getIcon());
			this.setToolTipText(nucleus.getTooltip());
			this.effects = nucleus.getEffects();
		} else if(object instanceof CombiTalent) {
			CombiTalent combiTalent = (CombiTalent) object;
			
			this.setText(combiTalent.getName());
			this.setToolTipText(combiTalent.getTooltip());
			this.effects = combiTalent.getEffects();
		} else if(object instanceof BuffIcon) {
			BuffIcon buffIcon = (BuffIcon) object;
			
			this.setText(buffIcon.getName());
			this.setIcon(buffIcon.getIcon());
			this.setToolTipText(buffIcon.getTooltip());
			this.effects = buffIcon.getEffects();
		}
	}
	
	public void setObject(Skill skill, int maxLvlIndex) {
		this.setText("Lvl " + skill.getLvl()[maxLvlIndex] + " - " + skill.getName() + (skill.getLvl().length == 1 ? "" : " " + (maxLvlIndex+1)));
		this.setIcon(skill.getIcon());
		this.setToolTipText(skill.getTooltip(maxLvlIndex));
		this.effects = skill.getEffects(maxLvlIndex);
	}
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public void setBlackUI() {
		this.setForeground(Design.FontColor[0]);
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
	}
	
	public static JLabel getSimpleLabel(String text) {
		JLabel label = new JLabel(text);
		label.setFont(new Font("Open Sans", Font.BOLD, 16));
		label.setForeground(Design.FontColor[0]);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		return label;
	}
	
	public static JLabel getStatLabel(int size, int left, int right) {
		JLabel label = new JLabel();
		label.setFont(new Font("Open Sans", Font.BOLD, 16));
		label.setBackground(Design.UIColor[0]);
		label.setForeground(Design.FontColor[0]);
		label.setBorder(new EmptyBorder(0, left, 0, right));
		label.setMaximumSize(new Dimension(size, 25));
		label.setOpaque(true);
		
		return label;
	}
	
	public static JLabel getEmptyLabel(int width, int height) {
		JLabel label = new JLabel();
		label.setBackground(Design.UIColor[0]);
		label.setBorder(new EmptyBorder(width, height, 0, 0));
		label.setOpaque(true);
		
		return label;
	}
}
