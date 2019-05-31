package fr.vlik.uidesign;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import fr.vlik.gfbuilder.CombiTalent;
import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.GuildBuff;
import fr.vlik.gfbuilder.Nucleus;

public class JCustomLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public JCustomLabel() {
		super();
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
	
	public ArrayList<Effect> getEffects() {
		ArrayList<Effect> list = new ArrayList<Effect>(this.effects.size());
		for(Effect effect : this.effects) {
			list.add(new Effect(effect));
		}
		return list;
	}
	
	public void setBlackUI() {
		this.setForeground(Consts.FontColor[0]);
		this.setFont(new Font("Open Sans", Font.PLAIN, 14));
	}
}
