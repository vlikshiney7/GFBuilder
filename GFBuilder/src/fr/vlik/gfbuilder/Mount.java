package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect.TypeEffect;

public class Mount {
	
	private String name;
	private int lvl;
	private Effect depla;
	private boolean isReinca;
	private BufferedImage img;
	
	public Mount(String name, int lvl, int depla, boolean isReinca, String path) {
		this.name = name;
		this.lvl = lvl;
		this.depla = new Effect(TypeEffect.Depla, false, depla, false, -1);
		this.isReinca = isReinca;
		this.img = setIcon(path);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public Effect getDepla() {
		return new Effect(this.depla);
	}
	
	public boolean isReinca() {
		return this.isReinca;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/32-3.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/montures/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		tooltip.append("<br>");
		tooltip.append(this.depla.getTooltip());
		
		return "<html>" + tooltip + "</html>";
	}
}
