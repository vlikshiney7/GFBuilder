package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import fr.vlik.gfbuilder.Anima;
import fr.vlik.gfbuilder.Archive;
import fr.vlik.gfbuilder.Bague;
import fr.vlik.gfbuilder.Blason;
import fr.vlik.gfbuilder.Buff;
import fr.vlik.gfbuilder.Bullet;
import fr.vlik.gfbuilder.Consts;
import fr.vlik.gfbuilder.Costume;
import fr.vlik.gfbuilder.Enchantment;
import fr.vlik.gfbuilder.Equipment;
import fr.vlik.gfbuilder.Genki;
import fr.vlik.gfbuilder.GuildBuff;
import fr.vlik.gfbuilder.Mount;
import fr.vlik.gfbuilder.Nucleus;
import fr.vlik.gfbuilder.Pearl;
import fr.vlik.gfbuilder.ProSkill;
import fr.vlik.gfbuilder.Skill;
import fr.vlik.gfbuilder.Talent;
import fr.vlik.gfbuilder.Title;
import fr.vlik.gfbuilder.Yggdrasil;

public class CustomListCellRenderer implements ListCellRenderer<Object> {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	protected boolean forTalent;
	
	public CustomListCellRenderer() {};
	
	public CustomListCellRenderer(int i) {
		this.forTalent = i == 1 ? false : true;
	}


	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		if(value instanceof String) {
			String object = (String) value;
			renderer.setText(object);
			
			if(object.equals("Niveau 1")) {
				renderer.setForeground(Consts.reincaColor[1]);
			} else if(object.equals("Aucune")) {
				renderer.setForeground(Consts.reincaColor[0]);
			} else if(object.matches("^\\+.*")) {
				if(index <= 7)			renderer.setForeground(Consts.itemColor[1]);
				else if(index <= 10)	renderer.setForeground(Consts.itemColor[2]);
				else if(index <= 13)	renderer.setForeground(Consts.itemColor[3]);
				else if(index <= 15)	renderer.setForeground(Consts.itemColor[2]);
				else if(index <= 18)	renderer.setForeground(Consts.titleColor[7]);
				else					renderer.setForeground(Consts.itemColor[3]);
			} else {
				index++;
				renderer.setForeground(new Color(255, 255-index*2, 255-index*2));
			}
		} else if(value instanceof Integer) {
			renderer.setText(value.toString());
			if(index > 15)
				renderer.setForeground(Consts.speColor[2]);
			else if(index > 10)
				renderer.setForeground(Consts.speColor[1]);
			else
				renderer.setForeground(Consts.speColor[0]);
		} else if(value instanceof Title) {
			Title title = (Title) value;
			renderer.setText(title.getName());
			renderer.setForeground(title.getColor());
			renderer.setToolTipText(title.getTooltip());
		} else if(value instanceof Yggdrasil) {
			Yggdrasil yggdrasil = (Yggdrasil) value;
			renderer.setText(yggdrasil.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(yggdrasil.getTooltip());
		} else if(value instanceof Genki) {
			Genki genki = (Genki) value;
			renderer.setText(genki.getName());
			renderer.setForeground(genki.getColor());
			renderer.setToolTipText(genki.getTooltip());
		} else if(value instanceof Nucleus) {
			Nucleus nucleus = (Nucleus) value;
			renderer.setIcon(new ImageIcon(nucleus.getIcon()));
			renderer.setText(nucleus.getName());
			renderer.setForeground(nucleus.getColor());
			renderer.setToolTipText(nucleus.getTooltip());
		} else if(value instanceof Equipment) {
			Equipment equipment = (Equipment) value;
			renderer.setIcon(new ImageIcon(equipment.getIcon()));
			renderer.setText("Lvl " + equipment.getLvl() + " - " + equipment.getName());
			renderer.setForeground(equipment.getColor());
			renderer.setToolTipText(equipment.getTooltip());
		} else if(value instanceof Pearl) {
			Pearl pearl = (Pearl) value;
			renderer.setIcon(new ImageIcon(pearl.getIcon()));
			renderer.setText(pearl.getName());
			renderer.setForeground(pearl.getColor());
			renderer.setToolTipText(pearl.getTooltip());
		} else if(value instanceof Talent) {
			Talent talent = (Talent) value;
			renderer.setText("Lvl " + talent.getLvl()[0]);
			renderer.setToolTipText(talent.getTooltip(0));
			if(forTalent)
				if(index == 0)		renderer.setForeground(Consts.itemColor[0]);
				else if(index == 1)	renderer.setForeground(Consts.itemColor[1]);
				else if(index == 2)	renderer.setForeground(Consts.itemColor[2]);
				else				renderer.setForeground(Consts.itemColor[3]);
			else 
				if(index == 0)		renderer.setForeground(Consts.itemColor[0]);
				else				renderer.setForeground(Consts.itemColor[3]);
		} else if(value instanceof Archive) {
			Archive archive = (Archive) value;
			renderer.setText(archive.getName());
			renderer.setForeground(archive.getColor());
			renderer.setToolTipText(archive.getTooltip());
		} else if(value instanceof Costume) {
			Costume costume = (Costume) value;
			renderer.setText(costume.getName());
			renderer.setForeground(costume.getColor());
			renderer.setToolTipText(costume.getTooltip());
		} else if(value instanceof Skill) {
			Skill skill = (Skill) value;
			renderer.setIcon(new ImageIcon(skill.getIcon()));
			renderer.setText("Lvl " + skill.getLvl()[0] + " - " + skill.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(skill.getTooltip(0));
		} else if(value instanceof ProSkill) {
			ProSkill proSkill = (ProSkill) value;
			renderer.setIcon(new ImageIcon(proSkill.getIcon()));
			renderer.setText("Lvl " + proSkill.getLvl() + " - " + proSkill.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(proSkill.getTooltip(0));
		} else if(value instanceof Blason) {
			Blason blason = (Blason) value;
			renderer.setIcon(new ImageIcon(blason.getIcon()));
			renderer.setText("Lvl " + blason.getLvl() + " - " + blason.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(blason.getTooltip());
		} else if(value instanceof GuildBuff) {
			GuildBuff guildBuff = (GuildBuff) value;
			renderer.setIcon(new ImageIcon(guildBuff.getIcon()));
			renderer.setText(guildBuff.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(guildBuff.getTooltip());
		} else if(value instanceof Buff) {
			Buff buff = (Buff) value;
			renderer.setText(buff.getName());
			renderer.setForeground(Consts.FontColor[0]);
			renderer.setToolTipText(buff.getTooltip());
		} else if(value instanceof Bague) {
			Bague bague = (Bague) value;
			renderer.setIcon(new ImageIcon(bague.getIcon()));
			renderer.setText(bague.getName());
			renderer.setForeground(bague.getColor());
			renderer.setToolTipText(bague.getTooltip());
		} else if(value instanceof Anima) {
			Anima anima = (Anima) value;
			renderer.setIcon(new ImageIcon(anima.getIcon()));
			renderer.setText(anima.getName());
			renderer.setForeground(anima.getColor());
			renderer.setToolTipText(anima.getTooltip());
		} else if(value instanceof Mount) {
			Mount mount = (Mount) value;
			renderer.setIcon(new ImageIcon(mount.getIcon()));
			renderer.setText("Lvl " + mount.getLvl() + " - " + mount.getName());
			renderer.setForeground(Consts.itemColor[4]);
			renderer.setToolTipText(mount.getTooltip());
		} else if(value instanceof Bullet) {
			Bullet bullet = (Bullet) value;
			renderer.setIcon(new ImageIcon(bullet.getIcon()));
			renderer.setText("Lvl " + bullet.getLvl() + " - " + bullet.getName());
			renderer.setForeground(bullet.getColor());
			renderer.setToolTipText(bullet.getTooltip());
		} else if(value instanceof Enchantment) {
			Enchantment enchant = (Enchantment) value;
			renderer.setText(enchant.getName());
			renderer.setForeground(Consts.FontColor[0]);
		}
		
		if (cellHasFocus || isSelected) renderer.setBackground(Consts.UIColor[1]);
		else renderer.setBackground(Consts.UIColor[0]);
		
		return renderer;
	}
}
