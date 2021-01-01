package fr.vlik.uidesign;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomCheckBox<T> extends JCheckBox {
	
	private static final long serialVersionUID = 1L;
	private T object;
	
	public JCustomCheckBox(T obj) {
		super();
		this.object = obj;
		
		String checkIcon = "checkOn";
		if(this.object instanceof Colorable) {
			Color color = ((Colorable) this.object).getColor();
			this.setForeground(color);
			
			if(color.equals(Tools.itemColor[1])) {
				checkIcon = "checkOn1";
			} else if(color.equals(Tools.itemColor[2])) {
				checkIcon = "checkOn2";
			} else if(color.equals(Tools.itemColor[3])) {
				checkIcon = "checkOn3";
			} else if(color.equals(Tools.itemColor[4])) {
				checkIcon = "checkOn4";
			} else if(color.equals(Tools.itemColor[5])) {
				checkIcon = "checkOn5";
			} else if(color.equals(Tools.itemColor[6])) {
				checkIcon = "checkOn6";
			} else if(color.equals(Tools.itemColor[7])) {
				checkIcon = "checkOn7";
			} else if(color.equals(Tools.titleColor[8])) {
				checkIcon = "checkOn8";
			}
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/" + checkIcon + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : checkOn.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : checkOn.png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/checkOff.png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : checkOff.png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : checkOff.png");
		}
		
		setVoidUI();
		updateText(Language.FR);
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void updateText(Language lang) {
		if(this.object instanceof Writable) {
			this.setText(((Writable) this.object).getInfo(lang));
			this.setToolTipText(((Writable) this.object).getTooltip());
		}
	}
}
