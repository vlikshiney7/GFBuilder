package fr.vlik.uidesign;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomCheckBox extends JCheckBox {
	
	private static final long serialVersionUID = 1L;
	private Object object;
	
	public JCustomCheckBox(Object obj) {
		super();
		this.object = obj;
		
		if(this.object instanceof Colorable) {
			this.setForeground(((Colorable) this.object).getColor());
		} else {
			this.setForeground(Design.FontColor[0]);
		}
		
		try {
			this.setSelectedIcon(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/fr/vlik/uidesign/images/checkOn.png"))));
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
	}
	
	public Object getObject() {
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
		} else if(this.object instanceof JCustomLabel) {
			((JCustomLabel) this.object).updateText(lang);
			this.setText(((JCustomLabel) this.object).getText());
		}
	}
}
