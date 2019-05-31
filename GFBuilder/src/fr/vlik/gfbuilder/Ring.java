package fr.vlik.gfbuilder;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public final class Ring extends Equipment {

	private String setCode;
	private boolean isUnique;
	
	public Ring(Ring ring) {
		super(ring.getName(), ring.getIdClasses(), ring.getLvl(), ring.getQuality(), ring.getCanEnchant(), ring.getEffects());
		
		this.setCode = ring.getSetCode();
		this.isUnique = ring.getIsUnique();
		this.img = ring.getIcon();
	}
	
	public Ring(String name, int lvl, int quality, boolean canEnchant, String setCode, boolean isUnique, String iconPath, ArrayList<Effect> effects) {
		super(name, new int[] { -1 } , lvl, quality, canEnchant, effects);
		
		this.setCode = setCode;
		this.isUnique = isUnique;
		this.img = setIcon(iconPath, quality);
	}
	
	public String getSetCode() {
		return this.setCode;
	}
	
	public boolean getIsUnique() {
		return this.isUnique;
	}
	
	protected BufferedImage setIcon(String path, int quality) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/images/32-" + quality + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/capering/ring/" + path));
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
}
