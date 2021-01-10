package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.Talent;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.FullRenderer;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class CustomListCellRenderer extends DefaultListCellRenderer {
	
	private static final long serialVersionUID = 1L;
	private static Language lang = Language.FR;
	
	protected boolean ancestral;
	
	public CustomListCellRenderer() {
		super();
	};
	
	public CustomListCellRenderer(boolean ancestral) {
		super();
		this.ancestral = ancestral;
	}
	
	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		if(value instanceof FullRenderer) {
			FullRenderer full = (FullRenderer) value;
			renderer.setForeground(full.getColor());
			renderer.setIcon(full.getIcon());
			renderer.setText(full.getInfo(CustomListCellRenderer.lang));
			renderer.setToolTipText(full.getTooltip());
		} else {
			if(value instanceof Colorable) {
				renderer.setForeground(((Colorable) value).getColor());
			} else {
				renderer.setForeground(Design.FontColor[0]);
			}
			
			if(value instanceof Iconable) {
				renderer.setIcon(((Iconable) value).getIcon());
			}
			
			if(value instanceof Writable) {
				renderer.setText(((Writable) value).getInfo(lang));
				renderer.setToolTipText(((Writable) value).getTooltip());
			}
		}
		
		if(value instanceof String) {
			String object = (String) value;
			renderer.setText(object);
			
			index++;
			renderer.setForeground(new Color(255, 255-index*2, 255-index*2));
		} else if(value instanceof Integer) {
			renderer.setText(value.toString());
			if(index > 15)
				renderer.setForeground(Tools.speColor[2]);
			else if(index > 10)
				renderer.setForeground(Tools.speColor[1]);
			else
				renderer.setForeground(Tools.speColor[0]);
		} else if(value instanceof Talent) {
			if(!this.ancestral) {
				if(index == 0) {
					renderer.setForeground(Tools.itemColor[0]);
				} else if(index == 1) {
					renderer.setForeground(Tools.itemColor[1]);
				} else if(index == 2) {
					renderer.setForeground(Tools.itemColor[2]);
				} else {
					renderer.setForeground(Tools.itemColor[3]);
				}
			} else {
				if(index == 0) {
					renderer.setForeground(Tools.itemColor[0]);
				} else {
					renderer.setForeground(Tools.itemColor[3]);
				}
			}
		} else if(value instanceof SaveConfig) {
			renderer.setText(((SaveConfig) value).getName());
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
