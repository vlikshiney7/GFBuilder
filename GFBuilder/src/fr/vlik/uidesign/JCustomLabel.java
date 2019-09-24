package fr.vlik.uidesign;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.grandfantasia.CombiTalent;
import fr.vlik.grandfantasia.Energy;
import fr.vlik.grandfantasia.GuildBuff;
import fr.vlik.grandfantasia.Nucleus;
import fr.vlik.grandfantasia.Skill;

public class JCustomLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public JCustomLabel() {
		super();
		this.setFont(new Font("Open Sans", Font.PLAIN, 12));
		setBlackUI();
	}
	
	public JCustomLabel(Object object) {
		super();
		setBlackUI();
		if(object instanceof Nucleus) {
			Nucleus nucleus = (Nucleus) object;
			
			this.setText(nucleus.getName());
			this.setIcon(new ImageIcon(nucleus.getIcon()));
			this.setToolTipText(nucleus.getTooltip());
			this.effects = nucleus.getEffects();
		} else if(object instanceof Energy) {
			Energy energy = (Energy) object;
			
			this.setText(energy.getName());
			this.setIcon(new ImageIcon(energy.getIcon()));
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
			this.setIcon(new ImageIcon(nucleus.getIcon()));
			this.setToolTipText(nucleus.getTooltip());
			this.effects = nucleus.getEffects();
		} else if(object instanceof CombiTalent) {
			CombiTalent combiTalent = (CombiTalent) object;
			
			this.setText(combiTalent.getName());
			this.setToolTipText(combiTalent.getTooltip());
			this.effects = combiTalent.getEffects();
		} else if(object instanceof GuildBuff) {
			GuildBuff guildBuff = (GuildBuff) object;
			
			this.setText(guildBuff.getName());
			this.setIcon(new ImageIcon(guildBuff.getIcon()));
			this.setToolTipText(guildBuff.getTooltip());
			this.effects = guildBuff.getEffects();
		}
	}
	
	public void setObject(Skill skill, int maxLvlIndex) {
		this.setText("Lvl " + skill.getLvl()[maxLvlIndex] + " - " + skill.getName() + (skill.getLvl().length == 1 ? "" : " " + (maxLvlIndex+1)));
		this.setIcon(new ImageIcon(skill.getIcon()));
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
}
