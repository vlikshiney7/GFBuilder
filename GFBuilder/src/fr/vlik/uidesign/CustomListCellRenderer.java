package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import fr.vlik.grandfantasia.Consts;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class CustomListCellRenderer implements ListCellRenderer<Object> {
	private static Language lang = Language.FR;
	
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	protected boolean ancestral;
	
	public CustomListCellRenderer() {};
	
	public CustomListCellRenderer(boolean ancestral) {
		this.ancestral = ancestral;
	}


	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		if(value instanceof FullRenderer) {
			FullRenderer full = (FullRenderer) value;
			renderer.setForeground(full.getColor());
			renderer.setIcon(new ImageIcon(full.getIcon()));
			renderer.setText(full.getInfo(lang));
			renderer.setToolTipText(full.getTooltip());
		} else {
			if(value instanceof Colorable) {
				renderer.setForeground(((Colorable) value).getColor());
			} else {
				renderer.setForeground(Design.FontColor[0]);
			}
			
			if(value instanceof Iconable) {
				renderer.setIcon(new ImageIcon(((Iconable) value).getIcon()));
			}
			
			if(value instanceof Writable) {
				renderer.setText(((Writable) value).getInfo(lang));
				renderer.setToolTipText(((Writable) value).getTooltip());
			}
		}
		
		if(value instanceof String) {
			String object = (String) value;
			renderer.setText(object);
			
			if(object.equals("Niveau 1")) {
				renderer.setForeground(Consts.reincaColor[1]);
			} else if(object.equals("Aucune")) {
				renderer.setForeground(Consts.reincaColor[0]);
			} else if(object.matches("^\\+.*")) {
				if(index <= 7) {
					renderer.setForeground(Consts.itemColor[1]);
				} else if(index <= 10) {
					renderer.setForeground(Consts.itemColor[2]);
				} else if(index <= 13) {
					renderer.setForeground(Consts.itemColor[3]);
				} else if(index <= 15) {
					renderer.setForeground(Consts.itemColor[2]);
				} else if(index <= 18) {
					renderer.setForeground(Consts.titleColor[7]);
				} else {
					renderer.setForeground(Consts.itemColor[3]);
				}
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
		} else if(value instanceof Talent) {
			if(!ancestral) {
				if(index == 0) {
					renderer.setForeground(Consts.itemColor[0]);
				} else if(index == 1) {
					renderer.setForeground(Consts.itemColor[1]);
				} else if(index == 2) {
					renderer.setForeground(Consts.itemColor[2]);
				} else {
					renderer.setForeground(Consts.itemColor[3]);
				}
			} else {
				if(index == 0) {
					renderer.setForeground(Consts.itemColor[0]);
				} else {
					renderer.setForeground(Consts.itemColor[3]);
				}
			}
		}
		
		if (cellHasFocus || isSelected) {
			renderer.setBackground(Design.UIColor[1]);
		} else {
			renderer.setBackground(Design.UIColor[0]);
		}
		
		return renderer;
	}
	
	public static void setLang(Language lang) {
		CustomListCellRenderer.lang = lang;
	}
}
