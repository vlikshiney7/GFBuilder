package fr.vlik.uidesign;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomRadioButton<T> extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	private T object;
	
	public JCustomRadioButton(T obj) {
		this.object = obj;
		
		String radioIcon = "radioOn";
		if(this.object instanceof Colorable) {
			Color color = ((Colorable) this.object).getColor();
			
			this.setForeground(color);
			radioIcon += Design.iconLink.get(color);
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		setIconUI(radioIcon, "radioOff");
		
		setVoidUI();
		updateText(Language.FR);
	}
	
	public T getItem() {
		return this.object;
	}
	
	public void updateText(Language lang) {
		if(this.object instanceof Writable) {
			this.setText(((Writable) this.object).getInfo(lang));
			this.setToolTipText(((Writable) this.object).getTooltip());
		}
	}
	
	public void setVoidUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	}
	
	public void setIconUI(String iconOn, String iconOff) {
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(JCustomRadioButton.class.getResource("/fr/vlik/uidesign/images/radio/" + iconOn + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOn + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOn + ".png");
		}
		
		try {
			this.setIcon(new ImageIcon(ImageIO.read(JCustomRadioButton.class.getResource("/fr/vlik/uidesign/images/radio/" + iconOff + ".png"))));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + iconOff + ".png");
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + iconOff + ".png");
		}
	}
}
